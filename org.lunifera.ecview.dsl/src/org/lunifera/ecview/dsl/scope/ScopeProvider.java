package org.lunifera.ecview.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ScopeProvider extends XbaseBatchScopeProvider {

	@Inject
	private TypeReferences types;

	@Inject
	private BindableTypeProvider typeProvider;

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == UiModelPackage.Literals.UI_TYPED_BINDABLE_DEF__METHOD) {
			return new BindingEndpointDefMethodScope(super.getScope(context,
					reference), (UiTypedBindableDef) context);
			// } else if (reference ==
			// UiModelPackage.Literals.UI_BINDING__SOURCE_ALIAS
			// || reference == UiModelPackage.Literals.UI_BINDING__TARGET_ALIAS)
			// {
			// return new BindingAliasScope(super.getScope(context, reference),
			// (UiBinding) context, reference);
		} else if (reference == UiModelPackage.Literals.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH) {
			return createBindingEndpointDefPathScope(context);
		} else if (reference == UiModelPackage.Literals.UI_PATH_SEGMENT__JVM_FIELD) {
			return createPathSegmentJvmFieldScope(context);
		} else if (reference == UiModelPackage.Literals.UI_COLUMN__JVM_FIELD) {
			return createUiColumnJvmFieldScope(context);
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
		if (segment.eContainer() instanceof UiBindingEndpointAssignment) {
			UiBindingEndpointAssignment parent = (UiBindingEndpointAssignment) segment
					.eContainer();
			JvmTypeReference expectedType = typeProvider
					.getTypeReference(parent);

			if (expectedType == null) {
				return IScope.NULLSCOPE;
			} else {
				return new BindingPathScope(expectedType.getType());
			}
		} else {
			UiPathSegment parent = (UiPathSegment) segment.eContainer();
			if (parent.getJvmField().getType() == null) {
				return IScope.NULLSCOPE;
			}
			return new BindingPathScope(parent.getJvmField().getType()
					.getType());
		}
	}

	/**
	 * Creates a scope that returns the jvm fields available for the current
	 * state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createUiColumnJvmFieldScope(EObject context) {
		UiTable table = (UiTable) context.eContainer().eContainer();
		JvmTypeReference expectedType = typeProvider.getTypeReference(table);
		if (expectedType == null) {
			return IScope.NULLSCOPE;
		} else {
			return new BindingPathScope(expectedType.getType());
		}
	}

	/**
	 * Creates a scope returning the available jvm fields for the current state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createBindingEndpointDefPathScope(EObject context) {
		UiBindingEndpointAssignment parent = (UiBindingEndpointAssignment) context;
		UiTypedBindableDef typedBindableDef = (UiTypedBindableDef) parent
				.getTypedBindableDef();
		UxEndpointDef uxEndpointDef = (UxEndpointDef) typedBindableDef
				.getMethod();
		UiRawBindable bindable = typedBindableDef.getRawBindable();

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
