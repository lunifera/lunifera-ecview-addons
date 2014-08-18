/**
 */
package org.lunifera.ecview.semantic.uimodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.ecview.semantic.uimodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage
 * @generated
 */
public class UiModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiModelSwitch<Adapter> modelSwitch =
		new UiModelSwitch<Adapter>() {
			@Override
			public Adapter caseUiNamedElement(UiNamedElement object) {
				return createUiNamedElementAdapter();
			}
			@Override
			public Adapter caseUiModel(UiModel object) {
				return createUiModelAdapter();
			}
			@Override
			public Adapter caseUiImports(UiImports object) {
				return createUiImportsAdapter();
			}
			@Override
			public Adapter caseUiContext(UiContext object) {
				return createUiContextAdapter();
			}
			@Override
			public Adapter caseUiViewSet(UiViewSet object) {
				return createUiViewSetAdapter();
			}
			@Override
			public Adapter caseUiView(UiView object) {
				return createUiViewAdapter();
			}
			@Override
			public Adapter caseUiIDEView(UiIDEView object) {
				return createUiIDEViewAdapter();
			}
			@Override
			public Adapter caseUiMobileView(UiMobileView object) {
				return createUiMobileViewAdapter();
			}
			@Override
			public Adapter caseUiPoint(UiPoint object) {
				return createUiPointAdapter();
			}
			@Override
			public Adapter caseUiBeanSlot(UiBeanSlot object) {
				return createUiBeanSlotAdapter();
			}
			@Override
			public Adapter caseUiRootElements(UiRootElements object) {
				return createUiRootElementsAdapter();
			}
			@Override
			public Adapter caseUiBindingExpression(UiBindingExpression object) {
				return createUiBindingExpressionAdapter();
			}
			@Override
			public Adapter caseUiBindingEndpointAlias(UiBindingEndpointAlias object) {
				return createUiBindingEndpointAliasAdapter();
			}
			@Override
			public Adapter caseUiBindingEndpointAssignment(UiBindingEndpointAssignment object) {
				return createUiBindingEndpointAssignmentAdapter();
			}
			@Override
			public Adapter caseUiBinding(UiBinding object) {
				return createUiBindingAdapter();
			}
			@Override
			public Adapter caseUiPathSegment(UiPathSegment object) {
				return createUiPathSegmentAdapter();
			}
			@Override
			public Adapter caseUiRawBindable(UiRawBindable object) {
				return createUiRawBindableAdapter();
			}
			@Override
			public Adapter caseUiTypedBindable(UiTypedBindable object) {
				return createUiTypedBindableAdapter();
			}
			@Override
			public Adapter caseUiTypedBindableDef(UiTypedBindableDef object) {
				return createUiTypedBindableDefAdapter();
			}
			@Override
			public Adapter caseUiCommandBindableDef(UiCommandBindableDef object) {
				return createUiCommandBindableDefAdapter();
			}
			@Override
			public Adapter caseUiEmbeddable(UiEmbeddable object) {
				return createUiEmbeddableAdapter();
			}
			@Override
			public Adapter caseUiField(UiField object) {
				return createUiFieldAdapter();
			}
			@Override
			public Adapter caseUiLayout(UiLayout object) {
				return createUiLayoutAdapter();
			}
			@Override
			public Adapter caseUiLayoutAssignment(UiLayoutAssignment object) {
				return createUiLayoutAssignmentAdapter();
			}
			@Override
			public Adapter caseUiAction(UiAction object) {
				return createUiActionAdapter();
			}
			@Override
			public Adapter caseUiMobileEmbeddable(UiMobileEmbeddable object) {
				return createUiMobileEmbeddableAdapter();
			}
			@Override
			public Adapter caseUiMobileField(UiMobileField object) {
				return createUiMobileFieldAdapter();
			}
			@Override
			public Adapter caseUiMobileLayout(UiMobileLayout object) {
				return createUiMobileLayoutAdapter();
			}
			@Override
			public Adapter caseUiMobileAction(UiMobileAction object) {
				return createUiMobileActionAdapter();
			}
			@Override
			public Adapter caseUiGridLayoutAssigment(UiGridLayoutAssigment object) {
				return createUiGridLayoutAssigmentAdapter();
			}
			@Override
			public Adapter caseUiGridLayout(UiGridLayout object) {
				return createUiGridLayoutAdapter();
			}
			@Override
			public Adapter caseUiHorizontalLayoutAssigment(UiHorizontalLayoutAssigment object) {
				return createUiHorizontalLayoutAssigmentAdapter();
			}
			@Override
			public Adapter caseUiHorizontalLayout(UiHorizontalLayout object) {
				return createUiHorizontalLayoutAdapter();
			}
			@Override
			public Adapter caseUiVerticalLayoutAssigment(UiVerticalLayoutAssigment object) {
				return createUiVerticalLayoutAssigmentAdapter();
			}
			@Override
			public Adapter caseUiVerticalLayout(UiVerticalLayout object) {
				return createUiVerticalLayoutAdapter();
			}
			@Override
			public Adapter caseUiFormLayoutAssigment(UiFormLayoutAssigment object) {
				return createUiFormLayoutAssigmentAdapter();
			}
			@Override
			public Adapter caseUiFormLayout(UiFormLayout object) {
				return createUiFormLayoutAdapter();
			}
			@Override
			public Adapter caseUiTextField(UiTextField object) {
				return createUiTextFieldAdapter();
			}
			@Override
			public Adapter caseUiImage(UiImage object) {
				return createUiImageAdapter();
			}
			@Override
			public Adapter caseUiList(UiList object) {
				return createUiListAdapter();
			}
			@Override
			public Adapter caseUiTable(UiTable object) {
				return createUiTableAdapter();
			}
			@Override
			public Adapter caseUiComboBox(UiComboBox object) {
				return createUiComboBoxAdapter();
			}
			@Override
			public Adapter caseUiTypeProvider(UiTypeProvider object) {
				return createUiTypeProviderAdapter();
			}
			@Override
			public Adapter caseUiColumn(UiColumn object) {
				return createUiColumnAdapter();
			}
			@Override
			public Adapter caseUiColumnAssignments(UiColumnAssignments object) {
				return createUiColumnAssignmentsAdapter();
			}
			@Override
			public Adapter caseUiNumericField(UiNumericField object) {
				return createUiNumericFieldAdapter();
			}
			@Override
			public Adapter caseUiCheckBox(UiCheckBox object) {
				return createUiCheckBoxAdapter();
			}
			@Override
			public Adapter caseUiVisibilityProcessable(UiVisibilityProcessable object) {
				return createUiVisibilityProcessableAdapter();
			}
			@Override
			public Adapter caseUiVisibilityProcessor(UiVisibilityProcessor object) {
				return createUiVisibilityProcessorAdapter();
			}
			@Override
			public Adapter caseUiVisibilityProcessorDef(UiVisibilityProcessorDef object) {
				return createUiVisibilityProcessorDefAdapter();
			}
			@Override
			public Adapter caseUiVisibilityProcessorAssignment(UiVisibilityProcessorAssignment object) {
				return createUiVisibilityProcessorAssignmentAdapter();
			}
			@Override
			public Adapter caseUiChangeTrigger(UiChangeTrigger object) {
				return createUiChangeTriggerAdapter();
			}
			@Override
			public Adapter caseUiVisibilityRule(UiVisibilityRule object) {
				return createUiVisibilityRuleAdapter();
			}
			@Override
			public Adapter caseUiXbaseVisibilityRule(UiXbaseVisibilityRule object) {
				return createUiXbaseVisibilityRuleAdapter();
			}
			@Override
			public Adapter caseUiVisibilityProperties(UiVisibilityProperties object) {
				return createUiVisibilityPropertiesAdapter();
			}
			@Override
			public Adapter caseUiVisibilityPropertiesDef(UiVisibilityPropertiesDef object) {
				return createUiVisibilityPropertiesDefAdapter();
			}
			@Override
			public Adapter caseUiVisibilityPropertiesAssignment(UiVisibilityPropertiesAssignment object) {
				return createUiVisibilityPropertiesAssignmentAdapter();
			}
			@Override
			public Adapter caseUiValidator(UiValidator object) {
				return createUiValidatorAdapter();
			}
			@Override
			public Adapter caseUiMaxLengthValidator(UiMaxLengthValidator object) {
				return createUiMaxLengthValidatorAdapter();
			}
			@Override
			public Adapter caseUiMinLengthValidator(UiMinLengthValidator object) {
				return createUiMinLengthValidatorAdapter();
			}
			@Override
			public Adapter caseUiRegexpValidator(UiRegexpValidator object) {
				return createUiRegexpValidatorAdapter();
			}
			@Override
			public Adapter caseUiXbaseValidator(UiXbaseValidator object) {
				return createUiXbaseValidatorAdapter();
			}
			@Override
			public Adapter caseUiValidatorAlias(UiValidatorAlias object) {
				return createUiValidatorAliasAdapter();
			}
			@Override
			public Adapter caseUiValidatorAssignment(UiValidatorAssignment object) {
				return createUiValidatorAssignmentAdapter();
			}
			@Override
			public Adapter caseUiValidatorDef(UiValidatorDef object) {
				return createUiValidatorDefAdapter();
			}
			@Override
			public Adapter caseUiHorizontalButtonGroupAssigment(UiHorizontalButtonGroupAssigment object) {
				return createUiHorizontalButtonGroupAssigmentAdapter();
			}
			@Override
			public Adapter caseUiHorizontalButtonGroup(UiHorizontalButtonGroup object) {
				return createUiHorizontalButtonGroupAdapter();
			}
			@Override
			public Adapter caseUiButton(UiButton object) {
				return createUiButtonAdapter();
			}
			@Override
			public Adapter caseUiSwitch(UiSwitch object) {
				return createUiSwitchAdapter();
			}
			@Override
			public Adapter caseUiVerticalComponentGroupAssigment(UiVerticalComponentGroupAssigment object) {
				return createUiVerticalComponentGroupAssigmentAdapter();
			}
			@Override
			public Adapter caseUiVerticalComponentGroup(UiVerticalComponentGroup object) {
				return createUiVerticalComponentGroupAdapter();
			}
			@Override
			public Adapter caseUiMobileTabSheet(UiMobileTabSheet object) {
				return createUiMobileTabSheetAdapter();
			}
			@Override
			public Adapter caseUiMobileTabAssignment(UiMobileTabAssignment object) {
				return createUiMobileTabAssignmentAdapter();
			}
			@Override
			public Adapter caseUiTabSheet(UiTabSheet object) {
				return createUiTabSheetAdapter();
			}
			@Override
			public Adapter caseUiTabAssignment(UiTabAssignment object) {
				return createUiTabAssignmentAdapter();
			}
			@Override
			public Adapter caseUiMobileNavigationHandler(UiMobileNavigationHandler object) {
				return createUiMobileNavigationHandlerAdapter();
			}
			@Override
			public Adapter caseUiMobileNavigationPage(UiMobileNavigationPage object) {
				return createUiMobileNavigationPageAdapter();
			}
			@Override
			public Adapter caseUiMobileNavigationPageAssignment(UiMobileNavigationPageAssignment object) {
				return createUiMobileNavigationPageAssignmentAdapter();
			}
			@Override
			public Adapter caseUiMobileNavigationButton(UiMobileNavigationButton object) {
				return createUiMobileNavigationButtonAdapter();
			}
			@Override
			public Adapter caseUiCommand(UiCommand object) {
				return createUiCommandAdapter();
			}
			@Override
			public Adapter caseUiMobileNavigationCommand(UiMobileNavigationCommand object) {
				return createUiMobileNavigationCommandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiNamedElement <em>Ui Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNamedElement
	 * @generated
	 */
	public Adapter createUiNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiModel <em>Ui Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel
	 * @generated
	 */
	public Adapter createUiModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiImports <em>Ui Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiImports
	 * @generated
	 */
	public Adapter createUiImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiContext <em>Ui Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiContext
	 * @generated
	 */
	public Adapter createUiContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiView <em>Ui View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiView
	 * @generated
	 */
	public Adapter createUiViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiIDEView <em>Ui IDE View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiIDEView
	 * @generated
	 */
	public Adapter createUiIDEViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileView <em>Ui Mobile View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileView
	 * @generated
	 */
	public Adapter createUiMobileViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiPoint <em>Ui Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPoint
	 * @generated
	 */
	public Adapter createUiPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias <em>Ui Binding Endpoint Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
	 * @generated
	 */
	public Adapter createUiBindingEndpointAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment <em>Ui Binding Endpoint Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
	 * @generated
	 */
	public Adapter createUiBindingEndpointAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBinding <em>Ui Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding
	 * @generated
	 */
	public Adapter createUiBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment <em>Ui Path Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPathSegment
	 * @generated
	 */
	public Adapter createUiPathSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot <em>Ui Bean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBeanSlot
	 * @generated
	 */
	public Adapter createUiBeanSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiViewSet <em>Ui View Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiViewSet
	 * @generated
	 */
	public Adapter createUiViewSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiRootElements <em>Ui Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRootElements
	 * @generated
	 */
	public Adapter createUiRootElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator <em>Ui Max Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator
	 * @generated
	 */
	public Adapter createUiMaxLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator <em>Ui Min Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator
	 * @generated
	 */
	public Adapter createUiMinLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiRegexpValidator <em>Ui Regexp Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRegexpValidator
	 * @generated
	 */
	public Adapter createUiRegexpValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator <em>Ui Xbase Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiXbaseValidator
	 * @generated
	 */
	public Adapter createUiXbaseValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBindingExpression <em>Ui Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingExpression
	 * @generated
	 */
	public Adapter createUiBindingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindable <em>Ui Typed Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindable
	 * @generated
	 */
	public Adapter createUiTypedBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef <em>Ui Typed Bindable Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef
	 * @generated
	 */
	public Adapter createUiTypedBindableDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef <em>Ui Command Bindable Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef
	 * @generated
	 */
	public Adapter createUiCommandBindableDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindable <em>Ui Raw Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRawBindable
	 * @generated
	 */
	public Adapter createUiRawBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiEmbeddable <em>Ui Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiEmbeddable
	 * @generated
	 */
	public Adapter createUiEmbeddableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiField <em>Ui Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiField
	 * @generated
	 */
	public Adapter createUiFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiLayout <em>Ui Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiLayout
	 * @generated
	 */
	public Adapter createUiLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiLayoutAssignment <em>Ui Layout Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiLayoutAssignment
	 * @generated
	 */
	public Adapter createUiLayoutAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileEmbeddable <em>Ui Mobile Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileEmbeddable
	 * @generated
	 */
	public Adapter createUiMobileEmbeddableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileField <em>Ui Mobile Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileField
	 * @generated
	 */
	public Adapter createUiMobileFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileLayout <em>Ui Mobile Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileLayout
	 * @generated
	 */
	public Adapter createUiMobileLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileAction <em>Ui Mobile Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileAction
	 * @generated
	 */
	public Adapter createUiMobileActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiValidator <em>Ui Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidator
	 * @generated
	 */
	public Adapter createUiValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment <em>Ui Grid Layout Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment
	 * @generated
	 */
	public Adapter createUiGridLayoutAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout <em>Ui Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayout
	 * @generated
	 */
	public Adapter createUiGridLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment <em>Ui Horizontal Layout Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment
	 * @generated
	 */
	public Adapter createUiHorizontalLayoutAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout <em>Ui Horizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout
	 * @generated
	 */
	public Adapter createUiHorizontalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment <em>Ui Vertical Layout Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment
	 * @generated
	 */
	public Adapter createUiVerticalLayoutAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVerticalLayout <em>Ui Vertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVerticalLayout
	 * @generated
	 */
	public Adapter createUiVerticalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment <em>Ui Form Layout Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment
	 * @generated
	 */
	public Adapter createUiFormLayoutAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiFormLayout <em>Ui Form Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiFormLayout
	 * @generated
	 */
	public Adapter createUiFormLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTextField <em>Ui Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTextField
	 * @generated
	 */
	public Adapter createUiTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiImage <em>Ui Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiImage
	 * @generated
	 */
	public Adapter createUiImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiList <em>Ui List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiList
	 * @generated
	 */
	public Adapter createUiListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTable <em>Ui Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTable
	 * @generated
	 */
	public Adapter createUiTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiComboBox <em>Ui Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiComboBox
	 * @generated
	 */
	public Adapter createUiComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTypeProvider <em>Ui Type Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypeProvider
	 * @generated
	 */
	public Adapter createUiTypeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiColumn <em>Ui Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiColumn
	 * @generated
	 */
	public Adapter createUiColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiColumnAssignments <em>Ui Column Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiColumnAssignments
	 * @generated
	 */
	public Adapter createUiColumnAssignmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiNumericField <em>Ui Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNumericField
	 * @generated
	 */
	public Adapter createUiNumericFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiCheckBox <em>Ui Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiCheckBox
	 * @generated
	 */
	public Adapter createUiCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable <em>Ui Visibility Processable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable
	 * @generated
	 */
	public Adapter createUiVisibilityProcessableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor <em>Ui Visibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor
	 * @generated
	 */
	public Adapter createUiVisibilityProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef <em>Ui Visibility Processor Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef
	 * @generated
	 */
	public Adapter createUiVisibilityProcessorDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment <em>Ui Visibility Processor Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment
	 * @generated
	 */
	public Adapter createUiVisibilityProcessorAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger <em>Ui Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiChangeTrigger
	 * @generated
	 */
	public Adapter createUiChangeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityRule <em>Ui Visibility Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityRule
	 * @generated
	 */
	public Adapter createUiVisibilityRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule <em>Ui Xbase Visibility Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule
	 * @generated
	 */
	public Adapter createUiXbaseVisibilityRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperties <em>Ui Visibility Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProperties
	 * @generated
	 */
	public Adapter createUiVisibilityPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesDef <em>Ui Visibility Properties Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesDef
	 * @generated
	 */
	public Adapter createUiVisibilityPropertiesDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment <em>Ui Visibility Properties Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment
	 * @generated
	 */
	public Adapter createUiVisibilityPropertiesAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAlias <em>Ui Validator Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAlias
	 * @generated
	 */
	public Adapter createUiValidatorAliasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment <em>Ui Validator Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment
	 * @generated
	 */
	public Adapter createUiValidatorAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef <em>Ui Validator Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorDef
	 * @generated
	 */
	public Adapter createUiValidatorDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment <em>Ui Horizontal Button Group Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment
	 * @generated
	 */
	public Adapter createUiHorizontalButtonGroupAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup <em>Ui Horizontal Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup
	 * @generated
	 */
	public Adapter createUiHorizontalButtonGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiAction <em>Ui Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAction
	 * @generated
	 */
	public Adapter createUiActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiButton <em>Ui Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiButton
	 * @generated
	 */
	public Adapter createUiButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSwitch <em>Ui Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSwitch
	 * @generated
	 */
	public Adapter createUiSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment <em>Ui Vertical Component Group Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment
	 * @generated
	 */
	public Adapter createUiVerticalComponentGroupAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup <em>Ui Vertical Component Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup
	 * @generated
	 */
	public Adapter createUiVerticalComponentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet <em>Ui Mobile Tab Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet
	 * @generated
	 */
	public Adapter createUiMobileTabSheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment <em>Ui Mobile Tab Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment
	 * @generated
	 */
	public Adapter createUiMobileTabAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTabSheet <em>Ui Tab Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTabSheet
	 * @generated
	 */
	public Adapter createUiTabSheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTabAssignment <em>Ui Tab Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTabAssignment
	 * @generated
	 */
	public Adapter createUiTabAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationHandler <em>Ui Mobile Navigation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavigationHandler
	 * @generated
	 */
	public Adapter createUiMobileNavigationHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage <em>Ui Mobile Navigation Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage
	 * @generated
	 */
	public Adapter createUiMobileNavigationPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment <em>Ui Mobile Navigation Page Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment
	 * @generated
	 */
	public Adapter createUiMobileNavigationPageAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton <em>Ui Mobile Navigation Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton
	 * @generated
	 */
	public Adapter createUiMobileNavigationButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiCommand <em>Ui Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiCommand
	 * @generated
	 */
	public Adapter createUiCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand <em>Ui Mobile Navigation Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand
	 * @generated
	 */
	public Adapter createUiMobileNavigationCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UiModelAdapterFactory
