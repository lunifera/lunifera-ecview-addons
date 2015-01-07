package org.lunifera.ecview.dsl.extensions

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
import org.lunifera.ecview.semantic.uimodel.UiPathSegment
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef

/**
 * The type resolver will return the type at the end of the path. Should not be used for scoping!
 * There is also a type provider that returns the type for the requested bindable, but does NOT resolve the whole path!
 * The provider is used for scoping issues.
 */
@Singleton
class BindableTypeResolver {

	def JvmTypeReference resolveTypeReference(EObject expression) {
		expression.resolveTypeReference(false)
	}

	def JvmTypeReference resolveTypeReference(EObject expression, boolean includeParent) {
		if (expression == null) {
			TypesFactory.eINSTANCE.createJvmUnknownTypeReference
		}

		var result = expression.doResolveTypeReference
		if ((result == null || result instanceof JvmUnknownTypeReference) && includeParent) {
			var temp = expression
			while ((result == null || result instanceof JvmUnknownTypeReference) && temp.eContainer != null) {
				temp = temp.eContainer
				result = temp.doResolveTypeReference
			}
		}

		return result
	}

	def JvmType resolveType(EObject expression) {
		return if(expression != null) expression.resolveTypeReference?.type
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiBeanSlot beanSlot) {
		return beanSlot.jvmType
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiBindingEndpointAlias alias) {
		val UiBindingEndpointAssignment aliasEP = alias.getEndpoint() as UiBindingEndpointAssignment;
		if(aliasEP.getPath() != null){
			return aliasEP.getPath().typeReferenceOfLastSegment;
		} else{
			return aliasEP.doResolveTypeReference
		}
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiBindingEndpointAssignment epDef) {
		if(epDef.path != null){
			return epDef.path.doResolveTypeReference
		}
		if (epDef.typedBindableAlias != null) {
			return epDef.typedBindableAlias.doResolveTypeReference
		} else if (epDef.typedBindableDef != null) {
			return epDef.typedBindableDef.doResolveTypeReference
		}
	}

	def dispatch JvmTypeReference doResolveTypeReference(EObject object) {
		TypesFactory.eINSTANCE.createJvmUnknownTypeReference
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiCommandBindableDef epDef) {
		val UiBindingEndpointAssignment assignment = epDef.eContainer() as UiBindingEndpointAssignment
		val UiBinding binding = assignment.eContainer() as UiBinding

		// epDef is source bindable
		if (binding.source == assignment) {
			val UiBindingExpression targetDef = binding.target
			return targetDef.resolveTypeReference(true)
		} else {
			val UiBindingExpression sourceDef = binding.source
			return sourceDef.resolveTypeReference(true)
		}
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiTypedBindableDef tbDef) {
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
				type = rawBindable.doResolveTypeReference
			}
		}

		return type
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiBindingExpression tbDef) {
		throw new UnsupportedOperationException
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiTypeProvider provider) {
		return provider.jvmType
	}

	def dispatch JvmTypeReference doResolveTypeReference(UiPathSegment path) {
		return path.typeReferenceOfLastSegment
	}
}
