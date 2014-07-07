package org.lunifera.ecview.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

import com.google.inject.Inject;

public class BatchScopeProvider extends XbaseBatchScopeProvider {

	@Inject
	private TypeReferences types;

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == UimodelPackage.Literals.UI_BINDING_ENDPOINT_DEF__ENDPOINT) {
			return new BindingEndpointDefMethodScope(super.getScope(context,
					reference), (UiBindingEndpointDef) context);
		} else if (reference == UimodelPackage.Literals.UI_BINDING_ENDPOINT_DEF__PATH) {
			return createBindingEndpointDefPathScope(context);
		} else if (reference == UimodelPackage.Literals.UI_PATH_SEGMENT__JVM_FIELD) {
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
		if (segment.eContainer() instanceof UiBindingEndpointDef) {
			UiBindingEndpointDef parent = (UiBindingEndpointDef) segment
					.eContainer();
			UxEndpointDef uxEndpointDef = (UxEndpointDef) parent.getEndpoint();
			YBindable bindable = parent.getBindable();

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
	private IScope createBindingEndpointDefPathScope(EObject context) {
		UiBindingEndpointDef parent = (UiBindingEndpointDef) context;
		UxEndpointDef uxEndpointDef = (UxEndpointDef) parent.getEndpoint();
		YBindable bindable = parent.getBindable();

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
