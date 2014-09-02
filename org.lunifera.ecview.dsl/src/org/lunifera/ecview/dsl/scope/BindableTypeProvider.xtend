package org.lunifera.ecview.dsl.scope

import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmUnknownTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiBinding
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef

@Singleton
class BindableTypeProvider {

	def JvmTypeReference getTypeReference(EObject expression) {
		expression.getTypeReference(false)
	}

	def JvmTypeReference getTypeReference(EObject expression, boolean includeParent) {
		if (expression == null) {
			TypesFactory.eINSTANCE.createJvmUnknownTypeReference
		}

		var result = expression.doGetTypeReference
		if ((result == null || result instanceof JvmUnknownTypeReference) && includeParent) {
			var temp = expression
			while ((result == null || result instanceof JvmUnknownTypeReference) && temp.eContainer != null) {
				temp = temp.eContainer
				result = temp.doGetTypeReference
			}
		}

		return result
	}

	def JvmType getType(EObject expression) {
		return if(expression != null) expression.getTypeReference?.type
	}

	def dispatch JvmTypeReference doGetTypeReference(UiBeanSlot beanSlot) {
		return beanSlot.jvmType
	}
	 
	def dispatch JvmTypeReference doGetTypeReference(UiBindingEndpointAlias alias) {
		return alias.endpoint.doGetTypeReference
	}

	def dispatch JvmTypeReference doGetTypeReference(UiBindingEndpointAssignment epDef) {
		if (epDef.typedBindableAlias != null) {
			return epDef.typedBindableAlias.doGetTypeReference
		} else if (epDef.typedBindableDef != null) {
			return epDef.typedBindableDef.doGetTypeReference
		}
	}

	def dispatch JvmTypeReference doGetTypeReference(EObject object) {
		TypesFactory.eINSTANCE.createJvmUnknownTypeReference
	}

	def dispatch JvmTypeReference doGetTypeReference(UiCommandBindableDef epDef) {
		val UiBindingEndpointAssignment assignment = epDef.eContainer() as UiBindingEndpointAssignment
		val UiBinding binding = assignment.eContainer() as UiBinding
		
		// epDef is source bindable
		if(binding.source == assignment){
			val UiBindingExpression targetDef =	binding.target 
			return targetDef.getTypeReference(true)			
		}else{
			val UiBindingExpression sourceDef =	binding.source 
			return sourceDef.getTypeReference(true)		
		}
	}

	def dispatch JvmTypeReference doGetTypeReference(UiTypedBindableDef tbDef) {
		if (tbDef == null || tbDef.method == null) {
			return TypesFactory.eINSTANCE.createJvmUnknownTypeReference
		}
		var type = tbDef.method.jvmType
		if (type == null) {
			return null
		}
		val fqn = type.qualifiedName
		if (fqn != null && fqn.equals(typeof(Object).name)) {
			val rawBindable = tbDef.rawBindableOfLastSegment
			if (rawBindable instanceof UiTypeProvider) {
				type = rawBindable.doGetTypeReference
			}
		}

		return type
	}

	def dispatch JvmTypeReference doGetTypeReference(UiBindingExpression tbDef) {
		throw new UnsupportedOperationException
	}

	def dispatch JvmTypeReference doGetTypeReference(UiTypeProvider provider) {
		return provider.jvmType
	}
}
