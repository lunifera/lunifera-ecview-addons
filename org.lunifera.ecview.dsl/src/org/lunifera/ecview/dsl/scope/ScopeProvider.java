package org.lunifera.ecview.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;
import org.lunifera.ecview.dsl.uIGrammar.UiPathSegment;
import org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint;
import org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint;
import org.lunifera.ecview.dsl.uIGrammar.impl.UiPathSegmentImpl;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxEndpointDefCommon;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ScopeProvider extends XbaseBatchScopeProvider {

	@Inject
	private TypeReferences types;

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == UIGrammarPackage.Literals.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT) {
			return new SourceBindingEndpointMethodScope(super.getScope(context,
					reference), (UiSourceBindingEndpoint) context);
		} else if (reference == UIGrammarPackage.Literals.UI_TARGET_BINDING_ENDPOINT__ENDPOINT) {
			return new TargetBindingEndpointMethodScope(super.getScope(context,
					reference), (UiTargetBindingEndpoint) context);
		} else if (reference == UIGrammarPackage.Literals.UI_TARGET_BINDING_ENDPOINT__PATH) {
			return createTargetBindingEndpointPathScope(context);
		} else if (reference == UIGrammarPackage.Literals.UI_SOURCE_BINDING_ENDPOINT__PATH) {
			return createSourceBindingEndpointPathScope(context);
		} else if (reference == UIGrammarPackage.Literals.UI_PATH_SEGMENT__JVM_FIELD) {
			return createPathSegmentJvmFieldScope(context);
		}
		return super.getScope(context, reference);
	}

	/**
	 * Creates a scope that returns the jvm fields available for the current
	 * state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createPathSegmentJvmFieldScope(EObject context) {
		UiPathSegmentImpl segment = (UiPathSegmentImpl) context;
		if (segment.eContainer() instanceof UiSourceBindingEndpoint) {
			UiSourceBindingEndpoint parent = (UiSourceBindingEndpoint) segment
					.eContainer();
			UxEndpointDefCommon uxEndpointDef = (UxEndpointDefCommon) parent
					.getEndpoint();
			YBindable bindable = parent.getEmbeddable();

			JvmTypeReference expectedType = uxEndpointDef.getJvmType();
			if (expectedType.getQualifiedName().equals(Void.class.getName())) {
				if (bindable instanceof YBeanSlot) {
					YBeanSlot slot = (YBeanSlot) bindable;
					return new BindingPathScope(types.findDeclaredType(
							slot.getValueTypeQualifiedName(), context));
				}
				throw new IllegalStateException("Not a valid input! " + context);
			} else {
				return new BindingPathScope(expectedType.getType());
			}
		} else if (segment.eContainer() instanceof UiTargetBindingEndpoint) {
			UiTargetBindingEndpoint parent = (UiTargetBindingEndpoint) segment
					.eContainer();
			UxEndpointDefCommon uxEndpointDef = (UxEndpointDefCommon) parent
					.getEndpoint();
			YBindable bindable = parent.getEmbeddable();

			JvmTypeReference expectedType = uxEndpointDef.getJvmType();
			if (expectedType.getQualifiedName().equals(Void.class.getName())) {
				if (bindable instanceof YBeanSlot) {
					YBeanSlot slot = (YBeanSlot) bindable;
					return new BindingPathScope(types.findDeclaredType(
							slot.getValueTypeQualifiedName(), context));
				}
				throw new IllegalStateException("Not a valid input! " + context);
			} else {
				return new BindingPathScope(expectedType.getType());
			}
		} else {
			UiPathSegment parent = (UiPathSegment) segment.eContainer();
			return new BindingPathScope(parent.getJvmField().getType()
					.getType());
		}
	}

	/**
	 * Creates a scope returning the available jvm fields for the current state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createSourceBindingEndpointPathScope(EObject context) {
		UiSourceBindingEndpoint parent = (UiSourceBindingEndpoint) context;
		UxEndpointDefCommon uxEndpointDef = (UxEndpointDefCommon) parent
				.getEndpoint();
		YBindable bindable = parent.getEmbeddable();

		JvmTypeReference expectedType = uxEndpointDef.getJvmType();
		if (expectedType.getQualifiedName().equals(Void.class.getName())) {
			if (bindable instanceof YBeanSlot) {
				YBeanSlot slot = (YBeanSlot) bindable;
				return new BindingPathScope(types.findDeclaredType(
						slot.getValueType(), context));
			}
		} else {
			return new BindingPathScope(expectedType.getType());
		}

		return IScope.NULLSCOPE;
	}

	/**
	 * Creates a scope returning the available jvm fields for the current state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createTargetBindingEndpointPathScope(EObject context) {
		UiTargetBindingEndpoint parent = (UiTargetBindingEndpoint) context;
		UxEndpointDefCommon uxEndpointDef = (UxEndpointDefCommon) parent
				.getEndpoint();
		YBindable bindable = parent.getEmbeddable();

		JvmTypeReference expectedType = uxEndpointDef.getJvmType();
		if (expectedType.getQualifiedName().equals(Void.class.getName())) {
			if (bindable instanceof YBeanSlot) {
				YBeanSlot slot = (YBeanSlot) bindable;
				return new BindingPathScope(types.findDeclaredType(
						slot.getValueType(), context));
			}
		} else {
			return new BindingPathScope(expectedType.getType());
		}

		return IScope.NULLSCOPE;
	}
}
