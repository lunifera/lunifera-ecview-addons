package org.lunifera.ecview.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUnknownTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.dsl.extensions.BindableTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty;
import org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ScopeProvider extends XbaseBatchScopeProvider {

	@Inject
	private TypeReferences types;

	@Inject
	private BindableTypeProvider typeProvider;

	@Inject
	private ResourceDescriptionsProvider provider;

	@Inject
	private IQualifiedNameProvider nameProvider;

	@Inject
	private IQualifiedNameConverter nameConverter;

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == UiModelPackage.Literals.UI_TYPED_BINDABLE_DEF__METHOD) {
			if (context.eContainer() instanceof UiVisibilityProperty) {
				return new BindingEndpointDefVisibilityMethodScope(
						provider.getResourceDescriptions(context.eResource()),
						(UiTypedBindableDef) context);
			} else {
				return new BindingEndpointDefBindMethodScope(
						provider.getResourceDescriptions(context.eResource()),
						(UiTypedBindableDef) context);
			}
		} else if (reference == UiModelPackage.Literals.UI_EXPOSED_ACTION__ACTION_REFERENCE) {
			return new ViewActionReferenceScope(
					provider.getResourceDescriptions(context.eResource()),
					context, nameConverter);
		} else if (reference == UiModelPackage.Literals.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE) {
			return new BindingEndpointDefRawBindableScope(context, nameProvider);
		} else if (reference == UiModelPackage.Literals.UI_NESTED_PROPERTY__GETTER) {
			if (context instanceof UiNestedProperty) {
				return createJvmOperationScope((UiNestedProperty) context);
			} else {
				return createJvmOperationScope(context);
			}
		} else if (reference == UiModelPackage.Literals.UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE) {
			return new RawBindablePathRawBindableScope(context, nameProvider);
		} else if (reference == UiModelPackage.Literals.UI_TYPED_BINDABLE_RAW_TYPE__RAW_BINDABLE) {
			return new TypedBindableRawTypeScope(context);
		} else if (reference == UiModelPackage.Literals.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH) {
			return createBindingEndpointDefPathScope(context);
		} else if (reference == UiModelPackage.Literals.UI_PATH_SEGMENT__GETTER) {
			return createPathSegmentJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_COLUMN__PROPERTY) {
			if (context instanceof UiNestedProperty) {
				return createJvmOperationScope((UiNestedProperty) context);
			} else {
				return createJvmOperationScope(context);
			}
		} else if (reference == UiModelPackage.Literals.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY) {
			return createJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_COMBO_BOX__ITEM_IMAGE_PROPERTY) {
			return createJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_TABLE__ITEM_IMAGE_PROPERTY) {
			return createJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_LIST__ITEM_IMAGE_PROPERTY) {
			return createJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_SEARCH_FIELD__PROPERTY) {
			return createJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_OPTIONS_GROUP__ITEM_CAPTION_PROPERTY) {
			return createJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_OPTIONS_GROUP__ITEM_IMAGE_PROPERTY) {
			return createJvmOperationScope(context);
		} else if (reference == UiModelPackage.Literals.UI_BEAN_REFERENCE_FIELD__REFERENCE_SOURCE_FIELD) {
			UiBeanReferenceField field = (UiBeanReferenceField) context;
			return createJvmFieldScope(field.getReferenceSourceJvmType());
		}
		return super.getScope(getView(context), reference);
	}

	private UiView getView(EObject eObject) {
		if (eObject == null) {
			return null;
		}

		if (eObject instanceof UiView) {
			return (UiView) eObject;
		}

		return getView(eObject.eContainer());

	}

	/**
	 * Creates a scope that returns the jvm fields available for the current
	 * state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createPathSegmentJvmOperationScope(EObject context) {
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
			// }
		} else if (segment.eContainer() instanceof UiNestedProperty) {
			UiNestedProperty parent = (UiNestedProperty) segment.eContainer();
			JvmTypeReference expectedType = typeProvider
					.getTypeReference(parent);
			if (expectedType == null) {
				return IScope.NULLSCOPE;
			} else {
				return new BindingPathScope(expectedType.getType());
			}
			// }
		} else {
			UiPathSegment parent = (UiPathSegment) segment.eContainer();
			if (parent.getGetter().getReturnType() == null) {
				return IScope.NULLSCOPE;
			}
			return new BindingPathScope(parent.getGetter().getReturnType()
					.getType());
		}
	}

	/**
	 * Creates a scope that returns the jvm operation available for the current
	 * state.
	 * 
	 * @param context
	 * @return
	 */
	@SuppressWarnings("unused")
	private IScope createUiColumnJvmOperationScope(EObject context) {
		UiTable table = (UiTable) context.eContainer().eContainer();
		JvmTypeReference expectedType = typeProvider.getTypeReference(table,
				true);
		if (expectedType == null) {
			return IScope.NULLSCOPE;
		} else {
			return new BindingPathScope(expectedType.getType());
		}
	}

	/**
	 * Creates a scope that returns the jvm operation available for the current
	 * state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createJvmOperationScope(EObject context) {
		JvmTypeReference expectedType = findExpectedType(context);
		if (expectedType == null
				|| expectedType instanceof JvmUnknownTypeReference) {
			return IScope.NULLSCOPE;
		} else {
			return new BindingPathScope(expectedType.getType());
		}
	}
	
	/**
	 * Creates a scope that returns the jvm operation available for the current
	 * state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createJvmOperationScope(UiNestedProperty context) {
		JvmTypeReference expectedType = findExpectedType(context.eContainer());
		if (expectedType == null
				|| expectedType instanceof JvmUnknownTypeReference) {
			return IScope.NULLSCOPE;
		} else {
			return new BindingPathScope(expectedType.getType());
		}
	}
	
	/**
	 * Creates a scope that returns the jvm fields available for the current
	 * state.
	 * 
	 * @param context
	 * @return
	 */
	private IScope createJvmFieldScope(JvmTypeReference expectedType) {
		if (expectedType == null
				|| expectedType instanceof JvmUnknownTypeReference) {
			return IScope.NULLSCOPE;
		} else {
			return new JvmFieldScope(expectedType.getType());
		}
	}

	protected JvmTypeReference findExpectedType(EObject context) {
		JvmTypeReference expectedType = typeProvider.getTypeReference(context,
				true);
		return expectedType;
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
		UiRawBindable bindable = typedBindableDef.getRawBindablePath()
				.getRawBindableOfLastSegment();

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
