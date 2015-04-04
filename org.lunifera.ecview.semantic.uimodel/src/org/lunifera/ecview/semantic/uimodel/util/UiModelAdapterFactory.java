/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
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
			public Adapter caseUiExposedAction(UiExposedAction object) {
				return createUiExposedActionAdapter();
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
			public Adapter caseUiDialog(UiDialog object) {
				return createUiDialogAdapter();
			}
			@Override
			public Adapter caseUiDialogAssignment(UiDialogAssignment object) {
				return createUiDialogAssignmentAdapter();
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
			public Adapter caseUiNestedField(UiNestedField object) {
				return createUiNestedFieldAdapter();
			}
			@Override
			public Adapter caseUiNestedProperty(UiNestedProperty object) {
				return createUiNestedPropertyAdapter();
			}
			@Override
			public Adapter caseUiRawBindable(UiRawBindable object) {
				return createUiRawBindableAdapter();
			}
			@Override
			public Adapter caseUiRawBindableProvider(UiRawBindableProvider object) {
				return createUiRawBindableProviderAdapter();
			}
			@Override
			public Adapter caseUiRawBindablePathSegment(UiRawBindablePathSegment object) {
				return createUiRawBindablePathSegmentAdapter();
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
			public Adapter caseUiTypedBindableRawType(UiTypedBindableRawType object) {
				return createUiTypedBindableRawTypeAdapter();
			}
			@Override
			public Adapter caseUiTypedBindableRawTypeAlias(UiTypedBindableRawTypeAlias object) {
				return createUiTypedBindableRawTypeAliasAdapter();
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
			public Adapter caseUiSearchPanel(UiSearchPanel object) {
				return createUiSearchPanelAdapter();
			}
			@Override
			public Adapter caseUiBeanReferenceField(UiBeanReferenceField object) {
				return createUiBeanReferenceFieldAdapter();
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
			public Adapter caseUiColumnsAssignment(UiColumnsAssignment object) {
				return createUiColumnsAssignmentAdapter();
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
			public Adapter caseUiVisibilityProcessorAssignment(UiVisibilityProcessorAssignment object) {
				return createUiVisibilityProcessorAssignmentAdapter();
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
			public Adapter caseUiVisibilityPropertiesAssignment(UiVisibilityPropertiesAssignment object) {
				return createUiVisibilityPropertiesAssignmentAdapter();
			}
			@Override
			public Adapter caseUiVisibilityProperty(UiVisibilityProperty object) {
				return createUiVisibilityPropertyAdapter();
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
			public Adapter caseUiOpenDialogCommand(UiOpenDialogCommand object) {
				return createUiOpenDialogCommandAdapter();
			}
			@Override
			public Adapter caseUiSearchField(UiSearchField object) {
				return createUiSearchFieldAdapter();
			}
			@Override
			public Adapter caseUiSearchDialog(UiSearchDialog object) {
				return createUiSearchDialogAdapter();
			}
			@Override
			public Adapter caseUiDialogSearchFieldAssignment(UiDialogSearchFieldAssignment object) {
				return createUiDialogSearchFieldAssignmentAdapter();
			}
			@Override
			public Adapter caseUiSearchWithDialogCommand(UiSearchWithDialogCommand object) {
				return createUiSearchWithDialogCommandAdapter();
			}
			@Override
			public Adapter caseUiLabel(UiLabel object) {
				return createUiLabelAdapter();
			}
			@Override
			public Adapter caseUiDecimalField(UiDecimalField object) {
				return createUiDecimalFieldAdapter();
			}
			@Override
			public Adapter caseUiTextArea(UiTextArea object) {
				return createUiTextAreaAdapter();
			}
			@Override
			public Adapter caseUiOptionsGroup(UiOptionsGroup object) {
				return createUiOptionsGroupAdapter();
			}
			@Override
			public Adapter caseUiDateField(UiDateField object) {
				return createUiDateFieldAdapter();
			}
			@Override
			public Adapter caseUiBrowser(UiBrowser object) {
				return createUiBrowserAdapter();
			}
			@Override
			public Adapter caseUiProgressBar(UiProgressBar object) {
				return createUiProgressBarAdapter();
			}
			@Override
			public Adapter caseUiI18nInfo(UiI18nInfo object) {
				return createUiI18nInfoAdapter();
			}
			@Override
			public Adapter caseUiI18nInfoable(UiI18nInfoable object) {
				return createUiI18nInfoableAdapter();
			}
			@Override
			public Adapter caseUiSplitpanelAssigment(UiSplitpanelAssigment object) {
				return createUiSplitpanelAssigmentAdapter();
			}
			@Override
			public Adapter caseUiSplitpanel(UiSplitpanel object) {
				return createUiSplitpanelAdapter();
			}
			@Override
			public Adapter caseUiPanel(UiPanel object) {
				return createUiPanelAdapter();
			}
			@Override
			public Adapter caseUiErrorCode(UiErrorCode object) {
				return createUiErrorCodeAdapter();
			}
			@Override
			public Adapter caseUiBeanServiceConsumer(UiBeanServiceConsumer object) {
				return createUiBeanServiceConsumerAdapter();
			}
			@Override
			public Adapter caseUiMobileSearchPanel(UiMobileSearchPanel object) {
				return createUiMobileSearchPanelAdapter();
			}
			@Override
			public Adapter caseUiMobileNavigationRoot(UiMobileNavigationRoot object) {
				return createUiMobileNavigationRootAdapter();
			}
			@Override
			public Adapter caseUiMobileNavigationRootAssigment(UiMobileNavigationRootAssigment object) {
				return createUiMobileNavigationRootAssigmentAdapter();
			}
			@Override
			public Adapter caseUiMobileNavBarAction(UiMobileNavBarAction object) {
				return createUiMobileNavBarActionAdapter();
			}
			@Override
			public Adapter caseUiAddToTableCommand(UiAddToTableCommand object) {
				return createUiAddToTableCommandAdapter();
			}
			@Override
			public Adapter caseUiRemoveFromTableCommand(UiRemoveFromTableCommand object) {
				return createUiRemoveFromTableCommandAdapter();
			}
			@Override
			public Adapter caseUiSendEventCommand(UiSendEventCommand object) {
				return createUiSendEventCommandAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiExposedAction <em>Ui Exposed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiExposedAction
	 * @generated
	 */
	public Adapter createUiExposedActionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiDialog <em>Ui Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDialog
	 * @generated
	 */
	public Adapter createUiDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiDialogAssignment <em>Ui Dialog Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDialogAssignment
	 * @generated
	 */
	public Adapter createUiDialogAssignmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiNestedField <em>Ui Nested Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNestedField
	 * @generated
	 */
	public Adapter createUiNestedFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiNestedProperty <em>Ui Nested Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNestedProperty
	 * @generated
	 */
	public Adapter createUiNestedPropertyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindableProvider <em>Ui Raw Bindable Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRawBindableProvider
	 * @generated
	 */
	public Adapter createUiRawBindableProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment <em>Ui Raw Bindable Path Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment
	 * @generated
	 */
	public Adapter createUiRawBindablePathSegmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType <em>Ui Typed Bindable Raw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType
	 * @generated
	 */
	public Adapter createUiTypedBindableRawTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias <em>Ui Typed Bindable Raw Type Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias
	 * @generated
	 */
	public Adapter createUiTypedBindableRawTypeAliasAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSearchPanel <em>Ui Search Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSearchPanel
	 * @generated
	 */
	public Adapter createUiSearchPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField <em>Ui Bean Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField
	 * @generated
	 */
	public Adapter createUiBeanReferenceFieldAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment <em>Ui Columns Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment
	 * @generated
	 */
	public Adapter createUiColumnsAssignmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty <em>Ui Visibility Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty
	 * @generated
	 */
	public Adapter createUiVisibilityPropertyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand <em>Ui Open Dialog Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand
	 * @generated
	 */
	public Adapter createUiOpenDialogCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSearchField <em>Ui Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSearchField
	 * @generated
	 */
	public Adapter createUiSearchFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSearchDialog <em>Ui Search Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSearchDialog
	 * @generated
	 */
	public Adapter createUiSearchDialogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment <em>Ui Dialog Search Field Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment
	 * @generated
	 */
	public Adapter createUiDialogSearchFieldAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand <em>Ui Search With Dialog Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand
	 * @generated
	 */
	public Adapter createUiSearchWithDialogCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiLabel <em>Ui Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiLabel
	 * @generated
	 */
	public Adapter createUiLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField <em>Ui Decimal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDecimalField
	 * @generated
	 */
	public Adapter createUiDecimalFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiTextArea <em>Ui Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTextArea
	 * @generated
	 */
	public Adapter createUiTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiOptionsGroup <em>Ui Options Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiOptionsGroup
	 * @generated
	 */
	public Adapter createUiOptionsGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiDateField <em>Ui Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDateField
	 * @generated
	 */
	public Adapter createUiDateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBrowser <em>Ui Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBrowser
	 * @generated
	 */
	public Adapter createUiBrowserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiProgressBar <em>Ui Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiProgressBar
	 * @generated
	 */
	public Adapter createUiProgressBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiI18nInfo <em>Ui I1 8n Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiI18nInfo
	 * @generated
	 */
	public Adapter createUiI18nInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiI18nInfoable <em>Ui I1 8n Infoable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiI18nInfoable
	 * @generated
	 */
	public Adapter createUiI18nInfoableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanelAssigment <em>Ui Splitpanel Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSplitpanelAssigment
	 * @generated
	 */
	public Adapter createUiSplitpanelAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel <em>Ui Splitpanel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSplitpanel
	 * @generated
	 */
	public Adapter createUiSplitpanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiPanel <em>Ui Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPanel
	 * @generated
	 */
	public Adapter createUiPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiErrorCode <em>Ui Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiErrorCode
	 * @generated
	 */
	public Adapter createUiErrorCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiBeanServiceConsumer <em>Ui Bean Service Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBeanServiceConsumer
	 * @generated
	 */
	public Adapter createUiBeanServiceConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileSearchPanel <em>Ui Mobile Search Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileSearchPanel
	 * @generated
	 */
	public Adapter createUiMobileSearchPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRoot <em>Ui Mobile Navigation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRoot
	 * @generated
	 */
	public Adapter createUiMobileNavigationRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRootAssigment <em>Ui Mobile Navigation Root Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRootAssigment
	 * @generated
	 */
	public Adapter createUiMobileNavigationRootAssigmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavBarAction <em>Ui Mobile Nav Bar Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMobileNavBarAction
	 * @generated
	 */
	public Adapter createUiMobileNavBarActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiAddToTableCommand <em>Ui Add To Table Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAddToTableCommand
	 * @generated
	 */
	public Adapter createUiAddToTableCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiRemoveFromTableCommand <em>Ui Remove From Table Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRemoveFromTableCommand
	 * @generated
	 */
	public Adapter createUiRemoveFromTableCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uimodel.UiSendEventCommand <em>Ui Send Event Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSendEventCommand
	 * @generated
	 */
	public Adapter createUiSendEventCommandAdapter() {
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
