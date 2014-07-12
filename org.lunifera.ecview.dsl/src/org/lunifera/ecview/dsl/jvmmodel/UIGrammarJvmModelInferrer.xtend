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
		acceptor.accept(element.toClass(element.fullyQualifiedName.toString + "Validator")).
			initializeLater(
				[
					superTypes += element.newTypeRef(typeof(IValidator), null)
					members += element.toMethod("updateParameter", element.newTypeRef(Void.TYPE)) [
						parameters += element.toParameter("param", element.newTypeRef(typeof(Object)))
						body = '''// Nothing to do here'''
					]
					members += element.toMethod("getType", element.newTypeRef(typeof(Class))) [
						body = '''return Class.class;'''
					]
					val implMethod = element.toMethod("validateValue", element.newTypeRef(typeof(IStatus))) [
						parameters += element.toParameter("param", element.newTypeRef(typeof(Object)))
						body = element.expression
					]
					members += implMethod
					associator.associatePrimary(element, implMethod)
				])
	}

}
