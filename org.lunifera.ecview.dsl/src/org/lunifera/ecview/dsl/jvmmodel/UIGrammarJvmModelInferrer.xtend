package org.lunifera.ecview.dsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecp.ecview.common.validation.IStatus
import org.eclipse.emf.ecp.ecview.common.validation.IValidator
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.emf.ecp.ecview.common.validation.Status
import org.eclipse.xtext.xbase.compiler.ImportManager

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

	def dispatch void infer(UiXbaseValidator element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
//		if(1 == 1){
//			return;
//		}
		
		acceptor.accept(element.toClass(getValidatorName(element))).
			initializeLater(
				[
					associator.associatePrimary(element, it)
					
					superTypes += element.newTypeRef(typeof(IValidator), null)
					members += element.toMethod("updateParameter", element.newTypeRef(Void.TYPE)) [
						parameters += element.toParameter("param", element.newTypeRef(typeof(Object)))
						body = '''// Nothing to do here'''
					]
					members += element.toMethod("getType", element.newTypeRef(typeof(Class))) [
						body = '''return «element.jvmType.simpleName».class;'''
					]
					members += element.toMethod("validateValue", element.newTypeRef(typeof(IStatus))) [
						parameters += element.toParameter("param", element.newTypeRef(typeof(Object)))
						body = '''
							IStatus status = doValidateValue((String) param);
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
							return org.eclipse.emf.ecp.ecview.common.validation.Status.createStatus(errorCode, getClass(), IStatus.Severity.ERROR, message);
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
							return org.eclipse.emf.ecp.ecview.common.validation.Status.createStatus(errorCode, getClass(), IStatus.Severity.WARNING, message);
						 '''
					]
				])
	}
	
	/**
	 * Returns the name of the validator
	 */
	def getValidatorName(UiXbaseValidator element) {
		val fqn = element.fullyQualifiedName
		if(fqn.empty){
			return "UnderConstruction"
		}
		
		val newFqn = fqn.skipLast(1).append(fqn.lastSegment.toFirstUpper)
		return newFqn.toString
	}

}
