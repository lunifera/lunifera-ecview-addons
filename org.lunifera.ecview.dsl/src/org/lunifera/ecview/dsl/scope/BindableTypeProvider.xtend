package org.lunifera.ecview.dsl.scope

import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef
import com.google.inject.Singleton
import org.eclipse.xtext.common.types.TypesPackage
import org.eclipse.xtext.common.types.TypesFactory

@Singleton
class BindableTypeProvider {

	def JvmTypeReference getTypeReference(UiBindingExpression expression) {
		return if(expression!=null) expression.doGetTypeReference
	}

	def JvmType getType(UiBindingExpression expression) {
		return if(expression!=null) expression.getTypeReference?.type
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

	def dispatch JvmTypeReference doGetTypeReference(UiTypedBindableDef tbDef) {
		if(tbDef == null || tbDef.method == null){
			return TypesFactory.eINSTANCE.createJvmUnknownTypeReference
		}
		return tbDef.method.jvmType
	}

	def dispatch JvmTypeReference doGetTypeReference(UiBindingExpression tbDef) {
		throw new UnsupportedOperationException
	}
}
