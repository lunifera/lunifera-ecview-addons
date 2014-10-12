package org.lunifera.ecview.dsl.jvmmodel

import com.google.inject.Inject
import java.util.Locale
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.ecview.core.common.context.II18nService
import org.lunifera.ecview.core.common.disposal.AbstractDisposable
import org.lunifera.ecview.core.common.validation.IStatus
import org.lunifera.ecview.core.common.validation.IValidator
import org.lunifera.ecview.core.common.visibility.IVisibilityHandler
import org.lunifera.ecview.core.common.visibility.IVisibilityManager
import org.lunifera.ecview.core.common.visibility.IVisibilityProcessor
import org.lunifera.ecview.dsl.extensions.BindableTypeResolver
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator
import org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class UIGrammarJvmModelInferrer extends AbstractModelInferrer {

	/**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject
	private IJvmModelAssociator associator
	@Inject
	private TypeReferences references
	@Inject
	private BindableTypeResolver typeResolver

	def dispatch void infer(UiXbaseValidator element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(element.toClass(getValidatorName(element))).initializeLater(
			[
				associator.associatePrimary(element, it)
				superTypes += element.newTypeRef(typeof(AbstractDisposable), null)
				superTypes += element.newTypeRef(typeof(IValidator), null)
				members += element.toField("i18nService", element.newTypeRef(typeof(II18nService)))
				members += element.toField("locale", element.newTypeRef(typeof(Locale)))
				members += element.toMethod("updateParameter", element.newTypeRef(Void.TYPE)) [
					parameters += element.toParameter("param", element.newTypeRef(typeof(Object)))
					body = '''// Nothing to do here'''
				]
				members += element.toMethod("getType", element.newTypeRef(typeof(Class))) [
					body = '''return «element.jvmType.simpleName».class;'''
				]
				members += element.toSetter("i18nService", element.newTypeRef(typeof(II18nService)))
				members += element.toSetter("locale", element.newTypeRef(typeof(Locale)))
				for (errorCode : element.errorCodes) {
					members += element.toMethod("get" + errorCode.name?.toFirstUpper, element.newTypeRef(typeof(String))) [
						visibility = JvmVisibility::PRIVATE
						body = '''
							String result = i18nService.getValue("«errorCode.fullyQualifiedName.toString»", locale);
							if(result == null || result.equals("")) {
								result = "«errorCode.defaultMessage»";
							}
							return result;
						'''
					]
				}
				members += element.toMethod("validateValue", element.newTypeRef(typeof(IStatus))) [
					parameters += element.toParameter("param", element.newTypeRef(typeof(Object)))
					body = '''
						IStatus status = doValidateValue((«element.jvmType.simpleName») param);
						if(status == null) {
							return IStatus.OK;
						}
						return status;
					'''
				]
				members += element.toMethod("doValidateValue", element.newTypeRef(typeof(IStatus))) [
					visibility = JvmVisibility::PRIVATE
					parameters += element.toParameter("input", element.jvmType.cloneWithProxies)
					body = element.expression
				]
				members += element.toMethod("error", element.newTypeRef(typeof(IStatus))) [
					documentation = '''
					Returns an IStatus with serverity ERROR.
					
					@param errorCode - The error code to identify the error
					@param message - The error message to display
					@return'''
					visibility = JvmVisibility::PRIVATE
					parameters += element.toParameter("errorCode", element.newTypeRef(typeof(String)))
					parameters += element.toParameter("message", element.newTypeRef(typeof(String)))
					body = '''
						return org.lunifera.ecview.core.common.validation.Status.createStatus(errorCode, getClass(), IStatus.Severity.ERROR, message);
					'''
				]
				members += element.toMethod("warning", element.newTypeRef(typeof(IStatus))) [
					documentation = '''
					Returns an IStatus with serverity WARNING.
					
					@param errorCode - The error code to identify the error
					@param message - The error message to display
					@return'''
					visibility = JvmVisibility::PRIVATE
					parameters += element.toParameter("errorCode", element.newTypeRef(typeof(String)))
					parameters += element.toParameter("message", element.newTypeRef(typeof(String)))
					body = '''
						return org.lunifera.ecview.core.common.validation.Status.createStatus(errorCode, getClass(), IStatus.Severity.WARNING, message);
					'''
				]
				members += element.toMethod("internalDispose", element.newTypeRef(Void.TYPE)) [
					visibility = JvmVisibility::PROTECTED
					body = ''''''
				]
			])
	}

	def dispatch void infer(UiVisibilityProcessor element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(element.toClass(getProcessorName(element))).initializeLater(
			[
				associator.associatePrimary(element, it)
				superTypes += element.newTypeRef(typeof(IVisibilityProcessor), null)
				for (uiInclude : element.importedElements) {
					val temp = uiInclude as UiTypedBindableRawTypeAlias
					members += uiInclude.toField(temp.alias, element.newTypeRef(typeof(IVisibilityHandler)))
				}
				for (dataUsed : element.dataUsed) {
					val temp = dataUsed as UiBindingEndpointAlias
					members += dataUsed.toField(temp.alias, typeResolver.resolveTypeReference(temp))
				}
				for (dataUsed : element.changeTriggers) {
					val temp = dataUsed as UiChangeTrigger
					members += dataUsed.toField(temp.alias, typeResolver.resolveTypeReference(temp.endpoint))
				}
				members += element.toMethod("init", element.newTypeRef(Void.TYPE)) [
					parameters += element.toParameter("manager", element.newTypeRef(typeof(IVisibilityManager)))
					body = '''
						«FOR uiInclude : element.importedElements»
							«val temp = uiInclude as UiTypedBindableRawTypeAlias»
							«temp.alias» = manager.getById("«temp.toPathString»");
						«ENDFOR»
					'''
				]
				members += element.toMethod("fire", element.newTypeRef(Void.TYPE)) [
					body = '''
						doFire();
						
						«FOR uiInclude : element.importedElements»
							«val temp = uiInclude as UiTypedBindableRawTypeAlias»
							«temp.alias».apply();
						«ENDFOR»
					'''
				]
				members += element.toMethod("doFire", element.newTypeRef(Void.TYPE)) [
					val UiXbaseVisibilityRule rule = element.rule as UiXbaseVisibilityRule
					body = rule.expression
				]
				for (dataUsed : element.dataUsed) {
					val temp = dataUsed as UiBindingEndpointAlias
					members += dataUsed.toGetter(temp.alias, typeResolver.resolveTypeReference(temp))
					members += dataUsed.toSetter(temp.alias, typeResolver.resolveTypeReference(temp))
				}
				for (changeTrigger : element.changeTriggers) {
					val temp = changeTrigger as UiChangeTrigger
					members += changeTrigger.toGetter(temp.alias, typeResolver.resolveTypeReference(temp.endpoint))
					members += changeTrigger.toMethod(temp.alias, element.newTypeRef(Void.TYPE)) [
						visibility = JvmVisibility::PUBLIC
						simpleName = "set" + temp.alias?.toFirstUpper
						parameters += element.toParameter(temp.alias, typeResolver.resolveTypeReference(temp.endpoint))
						body = '''
							this.«temp.alias»=«temp.alias»;
							
							fire();
						'''
					]
				}
			])
	}

	/**
	 * Returns the name of the validator
	 */
	def getValidatorName(UiXbaseValidator element) {
		val fqn = element.fullyQualifiedName
		if (fqn.empty) {
			return "UnderConstruction"
		}

		val newFqn = fqn.skipLast(1).append(fqn.lastSegment.toFirstUpper)
		return newFqn.toString
	}

	/**
	 * Returns the name of the validator
	 */
	def getProcessorName(UiVisibilityProcessor element) {
		val fqn = element.fullyQualifiedName
		if (fqn.empty) {
			return "UnderConstruction"
		}

		val newFqn = fqn.skipLast(1).append(fqn.lastSegment.toFirstUpper)
		return newFqn.toString
	}

	def String toPathString(UiTypedBindableRawTypeAlias alias) {
		val UiTypedBindableRawType type = alias.type as UiTypedBindableRawType
		return type?.toPathString
	}
}
