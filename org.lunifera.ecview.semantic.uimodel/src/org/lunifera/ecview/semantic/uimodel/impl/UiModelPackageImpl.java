/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;
import org.lunifera.ecview.semantic.uimodel.UiAction;
import org.lunifera.ecview.semantic.uimodel.UiAddToTableCommand;
import org.lunifera.ecview.semantic.uimodel.UiAlignment;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiBeanServiceConsumer;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiBrowser;
import org.lunifera.ecview.semantic.uimodel.UiButton;
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiCommand;
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiContext;
import org.lunifera.ecview.semantic.uimodel.UiDateField;
import org.lunifera.ecview.semantic.uimodel.UiDateFormat;
import org.lunifera.ecview.semantic.uimodel.UiDateTimeResolution;
import org.lunifera.ecview.semantic.uimodel.UiDecimalField;
import org.lunifera.ecview.semantic.uimodel.UiDialog;
import org.lunifera.ecview.semantic.uimodel.UiDialogAssignment;
import org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiErrorCode;
import org.lunifera.ecview.semantic.uimodel.UiExposedAction;
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment;
import org.lunifera.ecview.semantic.uimodel.UiFormLayout;
import org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfoable;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImage;
import org.lunifera.ecview.semantic.uimodel.UiImports;
import org.lunifera.ecview.semantic.uimodel.UiLabel;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.ecview.semantic.uimodel.UiLayoutAssignment;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMobileAction;
import org.lunifera.ecview.semantic.uimodel.UiMobileEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiMobileField;
import org.lunifera.ecview.semantic.uimodel.UiMobileLayout;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavBarAction;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationHandler;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRoot;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRootAssigment;
import org.lunifera.ecview.semantic.uimodel.UiMobileSearchPanel;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiMobileView;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelFactory;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNestedField;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand;
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup;
import org.lunifera.ecview.semantic.uimodel.UiPanel;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiProgressBar;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment;
import org.lunifera.ecview.semantic.uimodel.UiRawBindableProvider;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRemoveFromTableCommand;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiSearchDialog;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiSearchPanel;
import org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand;
import org.lunifera.ecview.semantic.uimodel.UiSelectionType;
import org.lunifera.ecview.semantic.uimodel.UiSendEventCommand;
import org.lunifera.ecview.semantic.uimodel.UiSetNewInstanceCommand;
import org.lunifera.ecview.semantic.uimodel.UiSplitpanel;
import org.lunifera.ecview.semantic.uimodel.UiSplitpanelAssigment;
import org.lunifera.ecview.semantic.uimodel.UiSwitch;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiTextArea;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityRule;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;
import org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiModelPackageImpl extends EPackageImpl implements UiModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiExposedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDialogAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiIDEViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBeanSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRootElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEndpointAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEndpointAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPathSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiNestedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiNestedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRawBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRawBindableProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRawBindablePathSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypedBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypedBindableDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypedBindableRawTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypedBindableRawTypeAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiCommandBindableDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLayoutAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiGridLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiGridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFormLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFormLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSearchPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBeanReferenceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTextFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiColumnsAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiNumericFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiChangeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiXbaseVisibilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertiesAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMaxLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMinLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRegexpValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiXbaseValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalButtonGroupAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalButtonGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalComponentGroupAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalComponentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileTabSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileTabAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTabSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTabAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationPageAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiOpenDialogCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSearchFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSearchDialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDialogSearchFieldAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSearchWithDialogCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDecimalFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiOptionsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBrowserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiProgressBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiI18nInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiI18nInfoableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSplitpanelAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSplitpanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiErrorCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBeanServiceConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileSearchPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationRootAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavBarActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiAddToTableCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRemoveFromTableCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSendEventCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSetNewInstanceCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uiFlatAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uiAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uiSelectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uiDateFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uiDateTimeResolutionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiModelPackageImpl() {
		super(eNS_URI, UiModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UiModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiModelPackage init() {
		if (isInited) return (UiModelPackage)EPackage.Registry.INSTANCE.getEPackage(UiModelPackage.eNS_URI);

		// Obtain or create and register package
		UiModelPackageImpl theUiModelPackage = (UiModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UiSemanticsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUiModelPackage.createPackageContents();

		// Initialize created meta-data
		theUiModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiModelPackage.eNS_URI, theUiModelPackage);
		return theUiModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiNamedElement() {
		return uiNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNamedElement_Id() {
		return (EAttribute)uiNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNamedElement_Name() {
		return (EAttribute)uiNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiModel() {
		return uiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiModel_PackageName() {
		return (EAttribute)uiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiModel_Roots() {
		return (EReference)uiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiModel_Imports() {
		return (EReference)uiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiImports() {
		return uiImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiImports_ImportedNamespace() {
		return (EAttribute)uiImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiContext() {
		return uiContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiContext_BeanSlots() {
		return (EReference)uiContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiContext_BindingEndpointAlias() {
		return (EReference)uiContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiContext_Bindings() {
		return (EReference)uiContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiContext_SharedStateGroup() {
		return (EAttribute)uiContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiExposedAction() {
		return uiExposedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiExposedAction_ActionReference() {
		return (EReference)uiExposedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiExposedAction_ActionID() {
		return (EAttribute)uiExposedActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiExposedAction_IconName() {
		return (EAttribute)uiExposedActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiExposedAction_CheckDirty() {
		return (EAttribute)uiExposedActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiExposedAction_ExternalCommandId() {
		return (EAttribute)uiExposedActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiViewSet() {
		return uiViewSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiView() {
		return uiViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiView_ViewSet() {
		return (EReference)uiViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiView_Content() {
		return (EReference)uiViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiView_ContentAlignment() {
		return (EAttribute)uiViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiView_ValidatorAssignments() {
		return (EReference)uiViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDialog() {
		return uiDialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiDialog_Content() {
		return (EReference)uiDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDialogAssignment() {
		return uiDialogAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiDialogAssignment_Element() {
		return (EReference)uiDialogAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiIDEView() {
		return uiIDEViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiIDEView_ExposedActions() {
		return (EReference)uiIDEViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileView() {
		return uiMobileViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiPoint() {
		return uiPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiPoint_X() {
		return (EAttribute)uiPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiPoint_Y() {
		return (EAttribute)uiPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBeanSlot() {
		return uiBeanSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanSlot_JvmType() {
		return (EReference)uiBeanSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanSlot_EClass() {
		return (EReference)uiBeanSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBeanSlot_EventTopic() {
		return (EAttribute)uiBeanSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRootElements() {
		return uiRootElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingExpression() {
		return uiBindingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingEndpointAlias() {
		return uiBindingEndpointAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBindingEndpointAlias_Alias() {
		return (EAttribute)uiBindingEndpointAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAlias_Endpoint() {
		return (EReference)uiBindingEndpointAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingEndpointAssignment() {
		return uiBindingEndpointAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAssignment_TypedBindableDef() {
		return (EReference)uiBindingEndpointAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAssignment_Path() {
		return (EReference)uiBindingEndpointAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAssignment_TypedBindableAlias() {
		return (EReference)uiBindingEndpointAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBinding() {
		return uiBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_Source() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_SourceAlias() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_TargetToSource() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_SourceToTarget() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_Target() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_TargetAlias() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_ListBinding() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiPathSegment() {
		return uiPathSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiPathSegment_Path() {
		return (EReference)uiPathSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiPathSegment_Getter() {
		return (EReference)uiPathSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiNestedField() {
		return uiNestedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiNestedField_Path() {
		return (EReference)uiNestedFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiNestedField_Field() {
		return (EReference)uiNestedFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiNestedProperty() {
		return uiNestedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiNestedProperty_Path() {
		return (EReference)uiNestedPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiNestedProperty_Getter() {
		return (EReference)uiNestedPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRawBindable() {
		return uiRawBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRawBindableProvider() {
		return uiRawBindableProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRawBindablePathSegment() {
		return uiRawBindablePathSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiRawBindablePathSegment_RawBindable() {
		return (EReference)uiRawBindablePathSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiRawBindablePathSegment_Path() {
		return (EReference)uiRawBindablePathSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiRawBindablePathSegment_ToParent() {
		return (EAttribute)uiRawBindablePathSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypedBindable() {
		return uiTypedBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypedBindableDef() {
		return uiTypedBindableDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableDef_RawBindable() {
		return (EReference)uiTypedBindableDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableDef_RawBindablePath() {
		return (EReference)uiTypedBindableDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableDef_Method() {
		return (EReference)uiTypedBindableDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypedBindableRawType() {
		return uiTypedBindableRawTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableRawType_RawBindable() {
		return (EReference)uiTypedBindableRawTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableRawType_RawBindablePath() {
		return (EReference)uiTypedBindableRawTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypedBindableRawTypeAlias() {
		return uiTypedBindableRawTypeAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiTypedBindableRawTypeAlias_Alias() {
		return (EAttribute)uiTypedBindableRawTypeAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableRawTypeAlias_Type() {
		return (EReference)uiTypedBindableRawTypeAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCommandBindableDef() {
		return uiCommandBindableDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiCommandBindableDef_Command() {
		return (EReference)uiCommandBindableDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiEmbeddable() {
		return uiEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiEmbeddable_Bindings() {
		return (EReference)uiEmbeddableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiEmbeddable_Readonly() {
		return (EAttribute)uiEmbeddableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiEmbeddable_Invisible() {
		return (EAttribute)uiEmbeddableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiEmbeddable_Styles() {
		return (EAttribute)uiEmbeddableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiField() {
		return uiFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiField_Validators() {
		return (EReference)uiFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiLayout() {
		return uiLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiLayout_Autowire() {
		return (EAttribute)uiLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiLayout_AutoWireSource() {
		return (EReference)uiLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiLayoutAssignment() {
		return uiLayoutAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiAction() {
		return uiActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileEmbeddable() {
		return uiMobileEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileField() {
		return uiMobileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileLayout() {
		return uiMobileLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileAction() {
		return uiMobileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiGridLayoutAssigment() {
		return uiGridLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_Element() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_From() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_To() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiGridLayoutAssigment_Alignment() {
		return (EAttribute)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiGridLayout() {
		return uiGridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayout_Contents() {
		return (EReference)uiGridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiGridLayout_Columns() {
		return (EAttribute)uiGridLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalLayoutAssigment() {
		return uiHorizontalLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalLayoutAssigment_Element() {
		return (EReference)uiHorizontalLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiHorizontalLayoutAssigment_Alignment() {
		return (EAttribute)uiHorizontalLayoutAssigmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalLayout() {
		return uiHorizontalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalLayout_Contents() {
		return (EReference)uiHorizontalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalLayoutAssigment() {
		return uiVerticalLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalLayoutAssigment_Element() {
		return (EReference)uiVerticalLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiVerticalLayoutAssigment_Alignment() {
		return (EAttribute)uiVerticalLayoutAssigmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalLayout() {
		return uiVerticalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalLayout_Contents() {
		return (EReference)uiVerticalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiFormLayoutAssigment() {
		return uiFormLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiFormLayoutAssigment_Element() {
		return (EReference)uiFormLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiFormLayout() {
		return uiFormLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiFormLayout_Contents() {
		return (EReference)uiFormLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSearchPanel() {
		return uiSearchPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSearchPanel_Contents() {
		return (EReference)uiSearchPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBeanReferenceField() {
		return uiBeanReferenceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanReferenceField_CaptionProperty() {
		return (EReference)uiBeanReferenceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanReferenceField_ImageProperty() {
		return (EReference)uiBeanReferenceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanReferenceField_InMemoryBeanProvider() {
		return (EReference)uiBeanReferenceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanReferenceField_DescriptionProperty() {
		return (EReference)uiBeanReferenceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanReferenceField_ReferenceSourceJvmType() {
		return (EReference)uiBeanReferenceFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanReferenceField_ReferenceSourceField() {
		return (EReference)uiBeanReferenceFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTextField() {
		return uiTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiTextField_MaxLength() {
		return (EAttribute)uiTextFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiTextField_MinLength() {
		return (EAttribute)uiTextFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiTextField_Regex() {
		return (EAttribute)uiTextFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiImage() {
		return uiImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiImage_Value() {
		return (EAttribute)uiImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiList() {
		return uiListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiList_SelectionType() {
		return (EAttribute)uiListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiList_ItemImageProperty() {
		return (EReference)uiListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiList_ItemCaptionProperty() {
		return (EReference)uiListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiList_DescriptionProperty() {
		return (EReference)uiListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTable() {
		return uiTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTable_ColumnAssignment() {
		return (EReference)uiTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiTable_SelectionType() {
		return (EAttribute)uiTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTable_ItemImageProperty() {
		return (EReference)uiTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiComboBox() {
		return uiComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiComboBox_ItemCaptionProperty() {
		return (EReference)uiComboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiComboBox_ItemImageProperty() {
		return (EReference)uiComboBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiComboBox_DescriptionProperty() {
		return (EReference)uiComboBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypeProvider() {
		return uiTypeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypeProvider_JvmType() {
		return (EReference)uiTypeProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiColumn() {
		return uiColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_IconName() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Visible() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Orderable() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Collapsed() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Collapsible() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Alignment() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_ExpandRatio() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiColumn_Property() {
		return (EReference)uiColumnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiColumnsAssignment() {
		return uiColumnsAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiColumnsAssignment_Columns() {
		return (EReference)uiColumnsAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiNumericField() {
		return uiNumericFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNumericField_NoGrouping() {
		return (EAttribute)uiNumericFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNumericField_NoMarkNegative() {
		return (EAttribute)uiNumericFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCheckBox() {
		return uiCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessable() {
		return uiVisibilityProcessableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessable_ProcessorAssignments() {
		return (EReference)uiVisibilityProcessableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessor() {
		return uiVisibilityProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_DataUsed() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_ChangeTriggers() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_ImportedElements() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_Rule() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessorDef() {
		return uiVisibilityProcessorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorDef_Processor() {
		return (EReference)uiVisibilityProcessorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessorAssignment() {
		return uiVisibilityProcessorAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorAssignment_Processor() {
		return (EReference)uiVisibilityProcessorAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorAssignment_ProcessorAlias() {
		return (EReference)uiVisibilityProcessorAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiChangeTrigger() {
		return uiChangeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiChangeTrigger_Endpoint() {
		return (EReference)uiChangeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiChangeTrigger_EndpointAlias() {
		return (EReference)uiChangeTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiChangeTrigger_Alias() {
		return (EAttribute)uiChangeTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityRule() {
		return uiVisibilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiXbaseVisibilityRule() {
		return uiXbaseVisibilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseVisibilityRule_Expression() {
		return (EReference)uiXbaseVisibilityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityPropertiesAssignment() {
		return uiVisibilityPropertiesAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityPropertiesAssignment_Properties() {
		return (EReference)uiVisibilityPropertiesAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProperty() {
		return uiVisibilityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProperty_BindableDef() {
		return (EReference)uiVisibilityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProperty_AssignmentExpression() {
		return (EReference)uiVisibilityPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidator() {
		return uiValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMaxLengthValidator() {
		return uiMaxLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiMaxLengthValidator_MaxLength() {
		return (EAttribute)uiMaxLengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMaxLengthValidator_ErrorCode() {
		return (EReference)uiMaxLengthValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMinLengthValidator() {
		return uiMinLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiMinLengthValidator_MinLength() {
		return (EAttribute)uiMinLengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMinLengthValidator_ErrorCode() {
		return (EReference)uiMinLengthValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRegexpValidator() {
		return uiRegexpValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiRegexpValidator_RegExpression() {
		return (EAttribute)uiRegexpValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiRegexpValidator_ErrorCode() {
		return (EReference)uiRegexpValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiXbaseValidator() {
		return uiXbaseValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseValidator_Expression() {
		return (EReference)uiXbaseValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseValidator_JvmType() {
		return (EReference)uiXbaseValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseValidator_ErrorCodes() {
		return (EReference)uiXbaseValidatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidatorAlias() {
		return uiValidatorAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiValidatorAlias_Alias() {
		return (EAttribute)uiValidatorAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAlias_Validator() {
		return (EReference)uiValidatorAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidatorAssignment() {
		return uiValidatorAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAssignment_Field() {
		return (EReference)uiValidatorAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAssignment_ValidatorDef() {
		return (EReference)uiValidatorAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAssignment_ValidatorAlias() {
		return (EReference)uiValidatorAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidatorDef() {
		return uiValidatorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorDef_Validator() {
		return (EReference)uiValidatorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorDef_JvmType() {
		return (EReference)uiValidatorDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalButtonGroupAssigment() {
		return uiHorizontalButtonGroupAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalButtonGroupAssigment_Element() {
		return (EReference)uiHorizontalButtonGroupAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalButtonGroup() {
		return uiHorizontalButtonGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalButtonGroup_Contents() {
		return (EReference)uiHorizontalButtonGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiButton() {
		return uiButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSwitch() {
		return uiSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalComponentGroupAssigment() {
		return uiVerticalComponentGroupAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalComponentGroupAssigment_Element() {
		return (EReference)uiVerticalComponentGroupAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalComponentGroup() {
		return uiVerticalComponentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalComponentGroup_Contents() {
		return (EReference)uiVerticalComponentGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileTabSheet() {
		return uiMobileTabSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileTabSheet_Tabs() {
		return (EReference)uiMobileTabSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileTabAssignment() {
		return uiMobileTabAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileTabAssignment_Element() {
		return (EReference)uiMobileTabAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTabSheet() {
		return uiTabSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTabSheet_Tabs() {
		return (EReference)uiTabSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTabAssignment() {
		return uiTabAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTabAssignment_Element() {
		return (EReference)uiTabAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationHandler() {
		return uiMobileNavigationHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationPage() {
		return uiMobileNavigationPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationPage_Contents() {
		return (EReference)uiMobileNavigationPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationPage_BarActions() {
		return (EReference)uiMobileNavigationPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationPageAssignment() {
		return uiMobileNavigationPageAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationPageAssignment_Element() {
		return (EReference)uiMobileNavigationPageAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiMobileNavigationPageAssignment_Alignment() {
		return (EAttribute)uiMobileNavigationPageAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationButton() {
		return uiMobileNavigationButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationButton_TargetPage() {
		return (EReference)uiMobileNavigationButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationButton_TargetPageAlias() {
		return (EReference)uiMobileNavigationButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCommand() {
		return uiCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationCommand() {
		return uiMobileNavigationCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationCommand_TargetPage() {
		return (EReference)uiMobileNavigationCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationCommand_TargetPageAlias() {
		return (EReference)uiMobileNavigationCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiOpenDialogCommand() {
		return uiOpenDialogCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiOpenDialogCommand_Dialog() {
		return (EReference)uiOpenDialogCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSearchField() {
		return uiSearchFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSearchField_Property() {
		return (EReference)uiSearchFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSearchDialog() {
		return uiSearchDialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSearchDialog_SearchFields() {
		return (EReference)uiSearchDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSearchDialog_Content() {
		return (EReference)uiSearchDialogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDialogSearchFieldAssignment() {
		return uiDialogSearchFieldAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiDialogSearchFieldAssignment_Element() {
		return (EReference)uiDialogSearchFieldAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSearchWithDialogCommand() {
		return uiSearchWithDialogCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSearchWithDialogCommand_Dialog() {
		return (EReference)uiSearchWithDialogCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiLabel() {
		return uiLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDecimalField() {
		return uiDecimalFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDecimalField_Precision() {
		return (EAttribute)uiDecimalFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDecimalField_NoGrouping() {
		return (EAttribute)uiDecimalFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDecimalField_NoMarkNegative() {
		return (EAttribute)uiDecimalFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTextArea() {
		return uiTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiOptionsGroup() {
		return uiOptionsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiOptionsGroup_SelectionType() {
		return (EAttribute)uiOptionsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiOptionsGroup_ItemImageProperty() {
		return (EReference)uiOptionsGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiOptionsGroup_ItemCaptionProperty() {
		return (EReference)uiOptionsGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiOptionsGroup_DescriptionProperty() {
		return (EReference)uiOptionsGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDateField() {
		return uiDateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDateField_DateFormat() {
		return (EAttribute)uiDateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDateField_Resolution() {
		return (EAttribute)uiDateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBrowser() {
		return uiBrowserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiProgressBar() {
		return uiProgressBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiI18nInfo() {
		return uiI18nInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiI18nInfo_Key() {
		return (EAttribute)uiI18nInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiI18nInfoable() {
		return uiI18nInfoableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiI18nInfoable_I18nInfo() {
		return (EReference)uiI18nInfoableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSplitpanelAssigment() {
		return uiSplitpanelAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSplitpanelAssigment_Element() {
		return (EReference)uiSplitpanelAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiSplitpanelAssigment_Alignment() {
		return (EAttribute)uiSplitpanelAssigmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSplitpanel() {
		return uiSplitpanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSplitpanel_FirstContent() {
		return (EReference)uiSplitpanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSplitpanel_SecondContent() {
		return (EReference)uiSplitpanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiSplitpanel_SplitPosition() {
		return (EAttribute)uiSplitpanelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiSplitpanel_Horizontal() {
		return (EAttribute)uiSplitpanelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiPanel() {
		return uiPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiPanel_Content() {
		return (EReference)uiPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiPanel_ContentAlignment() {
		return (EAttribute)uiPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiErrorCode() {
		return uiErrorCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiErrorCode_DefaultMessage() {
		return (EAttribute)uiErrorCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBeanServiceConsumer() {
		return uiBeanServiceConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBeanServiceConsumer_ConsumeBeanService() {
		return (EAttribute)uiBeanServiceConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileSearchPanel() {
		return uiMobileSearchPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileSearchPanel_Contents() {
		return (EReference)uiMobileSearchPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationRoot() {
		return uiMobileNavigationRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationRoot_Contents() {
		return (EReference)uiMobileNavigationRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationRootAssigment() {
		return uiMobileNavigationRootAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationRootAssigment_Element() {
		return (EReference)uiMobileNavigationRootAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavBarAction() {
		return uiMobileNavBarActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavBarAction_ActionReference() {
		return (EReference)uiMobileNavBarActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiMobileNavBarAction_ActionID() {
		return (EAttribute)uiMobileNavBarActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiMobileNavBarAction_IconName() {
		return (EAttribute)uiMobileNavBarActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiAddToTableCommand() {
		return uiAddToTableCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiAddToTableCommand_Table() {
		return (EReference)uiAddToTableCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRemoveFromTableCommand() {
		return uiRemoveFromTableCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiRemoveFromTableCommand_Table() {
		return (EReference)uiRemoveFromTableCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSendEventCommand() {
		return uiSendEventCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiSendEventCommand_EventTopic() {
		return (EAttribute)uiSendEventCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiSendEventCommand_NoAutoTrigger() {
		return (EAttribute)uiSendEventCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSetNewInstanceCommand() {
		return uiSetNewInstanceCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSetNewInstanceCommand_Target() {
		return (EReference)uiSetNewInstanceCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSetNewInstanceCommand_JvmType() {
		return (EReference)uiSetNewInstanceCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUiFlatAlignment() {
		return uiFlatAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUiAlignment() {
		return uiAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUiSelectionType() {
		return uiSelectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUiDateFormat() {
		return uiDateFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUiDateTimeResolution() {
		return uiDateTimeResolutionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelFactory getUiModelFactory() {
		return (UiModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uiNamedElementEClass = createEClass(UI_NAMED_ELEMENT);
		createEAttribute(uiNamedElementEClass, UI_NAMED_ELEMENT__ID);
		createEAttribute(uiNamedElementEClass, UI_NAMED_ELEMENT__NAME);

		uiModelEClass = createEClass(UI_MODEL);
		createEAttribute(uiModelEClass, UI_MODEL__PACKAGE_NAME);
		createEReference(uiModelEClass, UI_MODEL__ROOTS);
		createEReference(uiModelEClass, UI_MODEL__IMPORTS);

		uiImportsEClass = createEClass(UI_IMPORTS);
		createEAttribute(uiImportsEClass, UI_IMPORTS__IMPORTED_NAMESPACE);

		uiContextEClass = createEClass(UI_CONTEXT);
		createEReference(uiContextEClass, UI_CONTEXT__BEAN_SLOTS);
		createEReference(uiContextEClass, UI_CONTEXT__BINDING_ENDPOINT_ALIAS);
		createEReference(uiContextEClass, UI_CONTEXT__BINDINGS);
		createEAttribute(uiContextEClass, UI_CONTEXT__SHARED_STATE_GROUP);

		uiExposedActionEClass = createEClass(UI_EXPOSED_ACTION);
		createEReference(uiExposedActionEClass, UI_EXPOSED_ACTION__ACTION_REFERENCE);
		createEAttribute(uiExposedActionEClass, UI_EXPOSED_ACTION__ACTION_ID);
		createEAttribute(uiExposedActionEClass, UI_EXPOSED_ACTION__ICON_NAME);
		createEAttribute(uiExposedActionEClass, UI_EXPOSED_ACTION__CHECK_DIRTY);
		createEAttribute(uiExposedActionEClass, UI_EXPOSED_ACTION__EXTERNAL_COMMAND_ID);

		uiViewSetEClass = createEClass(UI_VIEW_SET);

		uiViewEClass = createEClass(UI_VIEW);
		createEReference(uiViewEClass, UI_VIEW__VIEW_SET);
		createEReference(uiViewEClass, UI_VIEW__CONTENT);
		createEAttribute(uiViewEClass, UI_VIEW__CONTENT_ALIGNMENT);
		createEReference(uiViewEClass, UI_VIEW__VALIDATOR_ASSIGNMENTS);

		uiDialogEClass = createEClass(UI_DIALOG);
		createEReference(uiDialogEClass, UI_DIALOG__CONTENT);

		uiDialogAssignmentEClass = createEClass(UI_DIALOG_ASSIGNMENT);
		createEReference(uiDialogAssignmentEClass, UI_DIALOG_ASSIGNMENT__ELEMENT);

		uiIDEViewEClass = createEClass(UI_IDE_VIEW);
		createEReference(uiIDEViewEClass, UI_IDE_VIEW__EXPOSED_ACTIONS);

		uiMobileViewEClass = createEClass(UI_MOBILE_VIEW);

		uiPointEClass = createEClass(UI_POINT);
		createEAttribute(uiPointEClass, UI_POINT__X);
		createEAttribute(uiPointEClass, UI_POINT__Y);

		uiBeanSlotEClass = createEClass(UI_BEAN_SLOT);
		createEReference(uiBeanSlotEClass, UI_BEAN_SLOT__JVM_TYPE);
		createEReference(uiBeanSlotEClass, UI_BEAN_SLOT__ECLASS);
		createEAttribute(uiBeanSlotEClass, UI_BEAN_SLOT__EVENT_TOPIC);

		uiRootElementsEClass = createEClass(UI_ROOT_ELEMENTS);

		uiBindingExpressionEClass = createEClass(UI_BINDING_EXPRESSION);

		uiBindingEndpointAliasEClass = createEClass(UI_BINDING_ENDPOINT_ALIAS);
		createEAttribute(uiBindingEndpointAliasEClass, UI_BINDING_ENDPOINT_ALIAS__ALIAS);
		createEReference(uiBindingEndpointAliasEClass, UI_BINDING_ENDPOINT_ALIAS__ENDPOINT);

		uiBindingEndpointAssignmentEClass = createEClass(UI_BINDING_ENDPOINT_ASSIGNMENT);
		createEReference(uiBindingEndpointAssignmentEClass, UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF);
		createEReference(uiBindingEndpointAssignmentEClass, UI_BINDING_ENDPOINT_ASSIGNMENT__PATH);
		createEReference(uiBindingEndpointAssignmentEClass, UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS);

		uiBindingEClass = createEClass(UI_BINDING);
		createEReference(uiBindingEClass, UI_BINDING__SOURCE);
		createEReference(uiBindingEClass, UI_BINDING__SOURCE_ALIAS);
		createEAttribute(uiBindingEClass, UI_BINDING__TARGET_TO_SOURCE);
		createEAttribute(uiBindingEClass, UI_BINDING__SOURCE_TO_TARGET);
		createEReference(uiBindingEClass, UI_BINDING__TARGET);
		createEReference(uiBindingEClass, UI_BINDING__TARGET_ALIAS);
		createEAttribute(uiBindingEClass, UI_BINDING__LIST_BINDING);

		uiPathSegmentEClass = createEClass(UI_PATH_SEGMENT);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__PATH);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__GETTER);

		uiNestedFieldEClass = createEClass(UI_NESTED_FIELD);
		createEReference(uiNestedFieldEClass, UI_NESTED_FIELD__PATH);
		createEReference(uiNestedFieldEClass, UI_NESTED_FIELD__FIELD);

		uiNestedPropertyEClass = createEClass(UI_NESTED_PROPERTY);
		createEReference(uiNestedPropertyEClass, UI_NESTED_PROPERTY__PATH);
		createEReference(uiNestedPropertyEClass, UI_NESTED_PROPERTY__GETTER);

		uiRawBindableEClass = createEClass(UI_RAW_BINDABLE);

		uiRawBindableProviderEClass = createEClass(UI_RAW_BINDABLE_PROVIDER);

		uiRawBindablePathSegmentEClass = createEClass(UI_RAW_BINDABLE_PATH_SEGMENT);
		createEReference(uiRawBindablePathSegmentEClass, UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE);
		createEReference(uiRawBindablePathSegmentEClass, UI_RAW_BINDABLE_PATH_SEGMENT__PATH);
		createEAttribute(uiRawBindablePathSegmentEClass, UI_RAW_BINDABLE_PATH_SEGMENT__TO_PARENT);

		uiTypedBindableEClass = createEClass(UI_TYPED_BINDABLE);

		uiTypedBindableDefEClass = createEClass(UI_TYPED_BINDABLE_DEF);
		createEReference(uiTypedBindableDefEClass, UI_TYPED_BINDABLE_DEF__RAW_BINDABLE);
		createEReference(uiTypedBindableDefEClass, UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH);
		createEReference(uiTypedBindableDefEClass, UI_TYPED_BINDABLE_DEF__METHOD);

		uiTypedBindableRawTypeEClass = createEClass(UI_TYPED_BINDABLE_RAW_TYPE);
		createEReference(uiTypedBindableRawTypeEClass, UI_TYPED_BINDABLE_RAW_TYPE__RAW_BINDABLE);
		createEReference(uiTypedBindableRawTypeEClass, UI_TYPED_BINDABLE_RAW_TYPE__RAW_BINDABLE_PATH);

		uiTypedBindableRawTypeAliasEClass = createEClass(UI_TYPED_BINDABLE_RAW_TYPE_ALIAS);
		createEAttribute(uiTypedBindableRawTypeAliasEClass, UI_TYPED_BINDABLE_RAW_TYPE_ALIAS__ALIAS);
		createEReference(uiTypedBindableRawTypeAliasEClass, UI_TYPED_BINDABLE_RAW_TYPE_ALIAS__TYPE);

		uiCommandBindableDefEClass = createEClass(UI_COMMAND_BINDABLE_DEF);
		createEReference(uiCommandBindableDefEClass, UI_COMMAND_BINDABLE_DEF__COMMAND);

		uiEmbeddableEClass = createEClass(UI_EMBEDDABLE);
		createEReference(uiEmbeddableEClass, UI_EMBEDDABLE__BINDINGS);
		createEAttribute(uiEmbeddableEClass, UI_EMBEDDABLE__READONLY);
		createEAttribute(uiEmbeddableEClass, UI_EMBEDDABLE__INVISIBLE);
		createEAttribute(uiEmbeddableEClass, UI_EMBEDDABLE__STYLES);

		uiFieldEClass = createEClass(UI_FIELD);
		createEReference(uiFieldEClass, UI_FIELD__VALIDATORS);

		uiLayoutEClass = createEClass(UI_LAYOUT);
		createEAttribute(uiLayoutEClass, UI_LAYOUT__AUTOWIRE);
		createEReference(uiLayoutEClass, UI_LAYOUT__AUTO_WIRE_SOURCE);

		uiLayoutAssignmentEClass = createEClass(UI_LAYOUT_ASSIGNMENT);

		uiActionEClass = createEClass(UI_ACTION);

		uiMobileEmbeddableEClass = createEClass(UI_MOBILE_EMBEDDABLE);

		uiMobileFieldEClass = createEClass(UI_MOBILE_FIELD);

		uiMobileLayoutEClass = createEClass(UI_MOBILE_LAYOUT);

		uiMobileActionEClass = createEClass(UI_MOBILE_ACTION);

		uiGridLayoutAssigmentEClass = createEClass(UI_GRID_LAYOUT_ASSIGMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ELEMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__FROM);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__TO);
		createEAttribute(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT);

		uiGridLayoutEClass = createEClass(UI_GRID_LAYOUT);
		createEReference(uiGridLayoutEClass, UI_GRID_LAYOUT__CONTENTS);
		createEAttribute(uiGridLayoutEClass, UI_GRID_LAYOUT__COLUMNS);

		uiHorizontalLayoutAssigmentEClass = createEClass(UI_HORIZONTAL_LAYOUT_ASSIGMENT);
		createEReference(uiHorizontalLayoutAssigmentEClass, UI_HORIZONTAL_LAYOUT_ASSIGMENT__ELEMENT);
		createEAttribute(uiHorizontalLayoutAssigmentEClass, UI_HORIZONTAL_LAYOUT_ASSIGMENT__ALIGNMENT);

		uiHorizontalLayoutEClass = createEClass(UI_HORIZONTAL_LAYOUT);
		createEReference(uiHorizontalLayoutEClass, UI_HORIZONTAL_LAYOUT__CONTENTS);

		uiVerticalLayoutAssigmentEClass = createEClass(UI_VERTICAL_LAYOUT_ASSIGMENT);
		createEReference(uiVerticalLayoutAssigmentEClass, UI_VERTICAL_LAYOUT_ASSIGMENT__ELEMENT);
		createEAttribute(uiVerticalLayoutAssigmentEClass, UI_VERTICAL_LAYOUT_ASSIGMENT__ALIGNMENT);

		uiVerticalLayoutEClass = createEClass(UI_VERTICAL_LAYOUT);
		createEReference(uiVerticalLayoutEClass, UI_VERTICAL_LAYOUT__CONTENTS);

		uiFormLayoutAssigmentEClass = createEClass(UI_FORM_LAYOUT_ASSIGMENT);
		createEReference(uiFormLayoutAssigmentEClass, UI_FORM_LAYOUT_ASSIGMENT__ELEMENT);

		uiFormLayoutEClass = createEClass(UI_FORM_LAYOUT);
		createEReference(uiFormLayoutEClass, UI_FORM_LAYOUT__CONTENTS);

		uiSearchPanelEClass = createEClass(UI_SEARCH_PANEL);
		createEReference(uiSearchPanelEClass, UI_SEARCH_PANEL__CONTENTS);

		uiBeanReferenceFieldEClass = createEClass(UI_BEAN_REFERENCE_FIELD);
		createEReference(uiBeanReferenceFieldEClass, UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY);
		createEReference(uiBeanReferenceFieldEClass, UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY);
		createEReference(uiBeanReferenceFieldEClass, UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER);
		createEReference(uiBeanReferenceFieldEClass, UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY);
		createEReference(uiBeanReferenceFieldEClass, UI_BEAN_REFERENCE_FIELD__REFERENCE_SOURCE_JVM_TYPE);
		createEReference(uiBeanReferenceFieldEClass, UI_BEAN_REFERENCE_FIELD__REFERENCE_SOURCE_FIELD);

		uiTextFieldEClass = createEClass(UI_TEXT_FIELD);
		createEAttribute(uiTextFieldEClass, UI_TEXT_FIELD__MAX_LENGTH);
		createEAttribute(uiTextFieldEClass, UI_TEXT_FIELD__MIN_LENGTH);
		createEAttribute(uiTextFieldEClass, UI_TEXT_FIELD__REGEX);

		uiImageEClass = createEClass(UI_IMAGE);
		createEAttribute(uiImageEClass, UI_IMAGE__VALUE);

		uiListEClass = createEClass(UI_LIST);
		createEAttribute(uiListEClass, UI_LIST__SELECTION_TYPE);
		createEReference(uiListEClass, UI_LIST__ITEM_IMAGE_PROPERTY);
		createEReference(uiListEClass, UI_LIST__ITEM_CAPTION_PROPERTY);
		createEReference(uiListEClass, UI_LIST__DESCRIPTION_PROPERTY);

		uiTableEClass = createEClass(UI_TABLE);
		createEReference(uiTableEClass, UI_TABLE__COLUMN_ASSIGNMENT);
		createEAttribute(uiTableEClass, UI_TABLE__SELECTION_TYPE);
		createEReference(uiTableEClass, UI_TABLE__ITEM_IMAGE_PROPERTY);

		uiComboBoxEClass = createEClass(UI_COMBO_BOX);
		createEReference(uiComboBoxEClass, UI_COMBO_BOX__ITEM_CAPTION_PROPERTY);
		createEReference(uiComboBoxEClass, UI_COMBO_BOX__ITEM_IMAGE_PROPERTY);
		createEReference(uiComboBoxEClass, UI_COMBO_BOX__DESCRIPTION_PROPERTY);

		uiTypeProviderEClass = createEClass(UI_TYPE_PROVIDER);
		createEReference(uiTypeProviderEClass, UI_TYPE_PROVIDER__JVM_TYPE);

		uiColumnEClass = createEClass(UI_COLUMN);
		createEAttribute(uiColumnEClass, UI_COLUMN__ICON_NAME);
		createEAttribute(uiColumnEClass, UI_COLUMN__VISIBLE);
		createEAttribute(uiColumnEClass, UI_COLUMN__ORDERABLE);
		createEAttribute(uiColumnEClass, UI_COLUMN__COLLAPSED);
		createEAttribute(uiColumnEClass, UI_COLUMN__COLLAPSIBLE);
		createEAttribute(uiColumnEClass, UI_COLUMN__ALIGNMENT);
		createEAttribute(uiColumnEClass, UI_COLUMN__EXPAND_RATIO);
		createEReference(uiColumnEClass, UI_COLUMN__PROPERTY);

		uiColumnsAssignmentEClass = createEClass(UI_COLUMNS_ASSIGNMENT);
		createEReference(uiColumnsAssignmentEClass, UI_COLUMNS_ASSIGNMENT__COLUMNS);

		uiNumericFieldEClass = createEClass(UI_NUMERIC_FIELD);
		createEAttribute(uiNumericFieldEClass, UI_NUMERIC_FIELD__NO_GROUPING);
		createEAttribute(uiNumericFieldEClass, UI_NUMERIC_FIELD__NO_MARK_NEGATIVE);

		uiCheckBoxEClass = createEClass(UI_CHECK_BOX);

		uiVisibilityProcessableEClass = createEClass(UI_VISIBILITY_PROCESSABLE);
		createEReference(uiVisibilityProcessableEClass, UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS);

		uiVisibilityProcessorAssignmentEClass = createEClass(UI_VISIBILITY_PROCESSOR_ASSIGNMENT);
		createEReference(uiVisibilityProcessorAssignmentEClass, UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR);
		createEReference(uiVisibilityProcessorAssignmentEClass, UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS);

		uiVisibilityProcessorEClass = createEClass(UI_VISIBILITY_PROCESSOR);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__DATA_USED);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGERS);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__IMPORTED_ELEMENTS);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__RULE);

		uiVisibilityProcessorDefEClass = createEClass(UI_VISIBILITY_PROCESSOR_DEF);
		createEReference(uiVisibilityProcessorDefEClass, UI_VISIBILITY_PROCESSOR_DEF__PROCESSOR);

		uiChangeTriggerEClass = createEClass(UI_CHANGE_TRIGGER);
		createEReference(uiChangeTriggerEClass, UI_CHANGE_TRIGGER__ENDPOINT);
		createEReference(uiChangeTriggerEClass, UI_CHANGE_TRIGGER__ENDPOINT_ALIAS);
		createEAttribute(uiChangeTriggerEClass, UI_CHANGE_TRIGGER__ALIAS);

		uiVisibilityRuleEClass = createEClass(UI_VISIBILITY_RULE);

		uiXbaseVisibilityRuleEClass = createEClass(UI_XBASE_VISIBILITY_RULE);
		createEReference(uiXbaseVisibilityRuleEClass, UI_XBASE_VISIBILITY_RULE__EXPRESSION);

		uiVisibilityPropertiesAssignmentEClass = createEClass(UI_VISIBILITY_PROPERTIES_ASSIGNMENT);
		createEReference(uiVisibilityPropertiesAssignmentEClass, UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES);

		uiVisibilityPropertyEClass = createEClass(UI_VISIBILITY_PROPERTY);
		createEReference(uiVisibilityPropertyEClass, UI_VISIBILITY_PROPERTY__BINDABLE_DEF);
		createEReference(uiVisibilityPropertyEClass, UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION);

		uiValidatorEClass = createEClass(UI_VALIDATOR);

		uiMaxLengthValidatorEClass = createEClass(UI_MAX_LENGTH_VALIDATOR);
		createEAttribute(uiMaxLengthValidatorEClass, UI_MAX_LENGTH_VALIDATOR__MAX_LENGTH);
		createEReference(uiMaxLengthValidatorEClass, UI_MAX_LENGTH_VALIDATOR__ERROR_CODE);

		uiMinLengthValidatorEClass = createEClass(UI_MIN_LENGTH_VALIDATOR);
		createEAttribute(uiMinLengthValidatorEClass, UI_MIN_LENGTH_VALIDATOR__MIN_LENGTH);
		createEReference(uiMinLengthValidatorEClass, UI_MIN_LENGTH_VALIDATOR__ERROR_CODE);

		uiRegexpValidatorEClass = createEClass(UI_REGEXP_VALIDATOR);
		createEAttribute(uiRegexpValidatorEClass, UI_REGEXP_VALIDATOR__REG_EXPRESSION);
		createEReference(uiRegexpValidatorEClass, UI_REGEXP_VALIDATOR__ERROR_CODE);

		uiXbaseValidatorEClass = createEClass(UI_XBASE_VALIDATOR);
		createEReference(uiXbaseValidatorEClass, UI_XBASE_VALIDATOR__EXPRESSION);
		createEReference(uiXbaseValidatorEClass, UI_XBASE_VALIDATOR__JVM_TYPE);
		createEReference(uiXbaseValidatorEClass, UI_XBASE_VALIDATOR__ERROR_CODES);

		uiValidatorAliasEClass = createEClass(UI_VALIDATOR_ALIAS);
		createEAttribute(uiValidatorAliasEClass, UI_VALIDATOR_ALIAS__ALIAS);
		createEReference(uiValidatorAliasEClass, UI_VALIDATOR_ALIAS__VALIDATOR);

		uiValidatorAssignmentEClass = createEClass(UI_VALIDATOR_ASSIGNMENT);
		createEReference(uiValidatorAssignmentEClass, UI_VALIDATOR_ASSIGNMENT__FIELD);
		createEReference(uiValidatorAssignmentEClass, UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF);
		createEReference(uiValidatorAssignmentEClass, UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS);

		uiValidatorDefEClass = createEClass(UI_VALIDATOR_DEF);
		createEReference(uiValidatorDefEClass, UI_VALIDATOR_DEF__VALIDATOR);
		createEReference(uiValidatorDefEClass, UI_VALIDATOR_DEF__JVM_TYPE);

		uiHorizontalButtonGroupAssigmentEClass = createEClass(UI_HORIZONTAL_BUTTON_GROUP_ASSIGMENT);
		createEReference(uiHorizontalButtonGroupAssigmentEClass, UI_HORIZONTAL_BUTTON_GROUP_ASSIGMENT__ELEMENT);

		uiHorizontalButtonGroupEClass = createEClass(UI_HORIZONTAL_BUTTON_GROUP);
		createEReference(uiHorizontalButtonGroupEClass, UI_HORIZONTAL_BUTTON_GROUP__CONTENTS);

		uiButtonEClass = createEClass(UI_BUTTON);

		uiSwitchEClass = createEClass(UI_SWITCH);

		uiVerticalComponentGroupAssigmentEClass = createEClass(UI_VERTICAL_COMPONENT_GROUP_ASSIGMENT);
		createEReference(uiVerticalComponentGroupAssigmentEClass, UI_VERTICAL_COMPONENT_GROUP_ASSIGMENT__ELEMENT);

		uiVerticalComponentGroupEClass = createEClass(UI_VERTICAL_COMPONENT_GROUP);
		createEReference(uiVerticalComponentGroupEClass, UI_VERTICAL_COMPONENT_GROUP__CONTENTS);

		uiMobileTabSheetEClass = createEClass(UI_MOBILE_TAB_SHEET);
		createEReference(uiMobileTabSheetEClass, UI_MOBILE_TAB_SHEET__TABS);

		uiMobileTabAssignmentEClass = createEClass(UI_MOBILE_TAB_ASSIGNMENT);
		createEReference(uiMobileTabAssignmentEClass, UI_MOBILE_TAB_ASSIGNMENT__ELEMENT);

		uiTabSheetEClass = createEClass(UI_TAB_SHEET);
		createEReference(uiTabSheetEClass, UI_TAB_SHEET__TABS);

		uiTabAssignmentEClass = createEClass(UI_TAB_ASSIGNMENT);
		createEReference(uiTabAssignmentEClass, UI_TAB_ASSIGNMENT__ELEMENT);

		uiMobileNavigationHandlerEClass = createEClass(UI_MOBILE_NAVIGATION_HANDLER);

		uiMobileNavigationPageEClass = createEClass(UI_MOBILE_NAVIGATION_PAGE);
		createEReference(uiMobileNavigationPageEClass, UI_MOBILE_NAVIGATION_PAGE__CONTENTS);
		createEReference(uiMobileNavigationPageEClass, UI_MOBILE_NAVIGATION_PAGE__BAR_ACTIONS);

		uiMobileNavigationPageAssignmentEClass = createEClass(UI_MOBILE_NAVIGATION_PAGE_ASSIGNMENT);
		createEReference(uiMobileNavigationPageAssignmentEClass, UI_MOBILE_NAVIGATION_PAGE_ASSIGNMENT__ELEMENT);
		createEAttribute(uiMobileNavigationPageAssignmentEClass, UI_MOBILE_NAVIGATION_PAGE_ASSIGNMENT__ALIGNMENT);

		uiMobileNavigationButtonEClass = createEClass(UI_MOBILE_NAVIGATION_BUTTON);
		createEReference(uiMobileNavigationButtonEClass, UI_MOBILE_NAVIGATION_BUTTON__TARGET_PAGE);
		createEReference(uiMobileNavigationButtonEClass, UI_MOBILE_NAVIGATION_BUTTON__TARGET_PAGE_ALIAS);

		uiCommandEClass = createEClass(UI_COMMAND);

		uiMobileNavigationCommandEClass = createEClass(UI_MOBILE_NAVIGATION_COMMAND);
		createEReference(uiMobileNavigationCommandEClass, UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE);
		createEReference(uiMobileNavigationCommandEClass, UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS);

		uiOpenDialogCommandEClass = createEClass(UI_OPEN_DIALOG_COMMAND);
		createEReference(uiOpenDialogCommandEClass, UI_OPEN_DIALOG_COMMAND__DIALOG);

		uiSearchFieldEClass = createEClass(UI_SEARCH_FIELD);
		createEReference(uiSearchFieldEClass, UI_SEARCH_FIELD__PROPERTY);

		uiSearchDialogEClass = createEClass(UI_SEARCH_DIALOG);
		createEReference(uiSearchDialogEClass, UI_SEARCH_DIALOG__SEARCH_FIELDS);
		createEReference(uiSearchDialogEClass, UI_SEARCH_DIALOG__CONTENT);

		uiDialogSearchFieldAssignmentEClass = createEClass(UI_DIALOG_SEARCH_FIELD_ASSIGNMENT);
		createEReference(uiDialogSearchFieldAssignmentEClass, UI_DIALOG_SEARCH_FIELD_ASSIGNMENT__ELEMENT);

		uiSearchWithDialogCommandEClass = createEClass(UI_SEARCH_WITH_DIALOG_COMMAND);
		createEReference(uiSearchWithDialogCommandEClass, UI_SEARCH_WITH_DIALOG_COMMAND__DIALOG);

		uiLabelEClass = createEClass(UI_LABEL);

		uiDecimalFieldEClass = createEClass(UI_DECIMAL_FIELD);
		createEAttribute(uiDecimalFieldEClass, UI_DECIMAL_FIELD__PRECISION);
		createEAttribute(uiDecimalFieldEClass, UI_DECIMAL_FIELD__NO_GROUPING);
		createEAttribute(uiDecimalFieldEClass, UI_DECIMAL_FIELD__NO_MARK_NEGATIVE);

		uiTextAreaEClass = createEClass(UI_TEXT_AREA);

		uiOptionsGroupEClass = createEClass(UI_OPTIONS_GROUP);
		createEAttribute(uiOptionsGroupEClass, UI_OPTIONS_GROUP__SELECTION_TYPE);
		createEReference(uiOptionsGroupEClass, UI_OPTIONS_GROUP__ITEM_IMAGE_PROPERTY);
		createEReference(uiOptionsGroupEClass, UI_OPTIONS_GROUP__ITEM_CAPTION_PROPERTY);
		createEReference(uiOptionsGroupEClass, UI_OPTIONS_GROUP__DESCRIPTION_PROPERTY);

		uiDateFieldEClass = createEClass(UI_DATE_FIELD);
		createEAttribute(uiDateFieldEClass, UI_DATE_FIELD__DATE_FORMAT);
		createEAttribute(uiDateFieldEClass, UI_DATE_FIELD__RESOLUTION);

		uiBrowserEClass = createEClass(UI_BROWSER);

		uiProgressBarEClass = createEClass(UI_PROGRESS_BAR);

		uiI18nInfoEClass = createEClass(UI_I1_8N_INFO);
		createEAttribute(uiI18nInfoEClass, UI_I1_8N_INFO__KEY);

		uiI18nInfoableEClass = createEClass(UI_I1_8N_INFOABLE);
		createEReference(uiI18nInfoableEClass, UI_I1_8N_INFOABLE__I18N_INFO);

		uiSplitpanelAssigmentEClass = createEClass(UI_SPLITPANEL_ASSIGMENT);
		createEReference(uiSplitpanelAssigmentEClass, UI_SPLITPANEL_ASSIGMENT__ELEMENT);
		createEAttribute(uiSplitpanelAssigmentEClass, UI_SPLITPANEL_ASSIGMENT__ALIGNMENT);

		uiSplitpanelEClass = createEClass(UI_SPLITPANEL);
		createEReference(uiSplitpanelEClass, UI_SPLITPANEL__FIRST_CONTENT);
		createEReference(uiSplitpanelEClass, UI_SPLITPANEL__SECOND_CONTENT);
		createEAttribute(uiSplitpanelEClass, UI_SPLITPANEL__SPLIT_POSITION);
		createEAttribute(uiSplitpanelEClass, UI_SPLITPANEL__HORIZONTAL);

		uiPanelEClass = createEClass(UI_PANEL);
		createEReference(uiPanelEClass, UI_PANEL__CONTENT);
		createEAttribute(uiPanelEClass, UI_PANEL__CONTENT_ALIGNMENT);

		uiErrorCodeEClass = createEClass(UI_ERROR_CODE);
		createEAttribute(uiErrorCodeEClass, UI_ERROR_CODE__DEFAULT_MESSAGE);

		uiBeanServiceConsumerEClass = createEClass(UI_BEAN_SERVICE_CONSUMER);
		createEAttribute(uiBeanServiceConsumerEClass, UI_BEAN_SERVICE_CONSUMER__CONSUME_BEAN_SERVICE);

		uiMobileSearchPanelEClass = createEClass(UI_MOBILE_SEARCH_PANEL);
		createEReference(uiMobileSearchPanelEClass, UI_MOBILE_SEARCH_PANEL__CONTENTS);

		uiMobileNavigationRootEClass = createEClass(UI_MOBILE_NAVIGATION_ROOT);
		createEReference(uiMobileNavigationRootEClass, UI_MOBILE_NAVIGATION_ROOT__CONTENTS);

		uiMobileNavigationRootAssigmentEClass = createEClass(UI_MOBILE_NAVIGATION_ROOT_ASSIGMENT);
		createEReference(uiMobileNavigationRootAssigmentEClass, UI_MOBILE_NAVIGATION_ROOT_ASSIGMENT__ELEMENT);

		uiMobileNavBarActionEClass = createEClass(UI_MOBILE_NAV_BAR_ACTION);
		createEReference(uiMobileNavBarActionEClass, UI_MOBILE_NAV_BAR_ACTION__ACTION_REFERENCE);
		createEAttribute(uiMobileNavBarActionEClass, UI_MOBILE_NAV_BAR_ACTION__ACTION_ID);
		createEAttribute(uiMobileNavBarActionEClass, UI_MOBILE_NAV_BAR_ACTION__ICON_NAME);

		uiAddToTableCommandEClass = createEClass(UI_ADD_TO_TABLE_COMMAND);
		createEReference(uiAddToTableCommandEClass, UI_ADD_TO_TABLE_COMMAND__TABLE);

		uiRemoveFromTableCommandEClass = createEClass(UI_REMOVE_FROM_TABLE_COMMAND);
		createEReference(uiRemoveFromTableCommandEClass, UI_REMOVE_FROM_TABLE_COMMAND__TABLE);

		uiSendEventCommandEClass = createEClass(UI_SEND_EVENT_COMMAND);
		createEAttribute(uiSendEventCommandEClass, UI_SEND_EVENT_COMMAND__EVENT_TOPIC);
		createEAttribute(uiSendEventCommandEClass, UI_SEND_EVENT_COMMAND__NO_AUTO_TRIGGER);

		uiSetNewInstanceCommandEClass = createEClass(UI_SET_NEW_INSTANCE_COMMAND);
		createEReference(uiSetNewInstanceCommandEClass, UI_SET_NEW_INSTANCE_COMMAND__TARGET);
		createEReference(uiSetNewInstanceCommandEClass, UI_SET_NEW_INSTANCE_COMMAND__JVM_TYPE);

		// Create enums
		uiFlatAlignmentEEnum = createEEnum(UI_FLAT_ALIGNMENT);
		uiAlignmentEEnum = createEEnum(UI_ALIGNMENT);
		uiSelectionTypeEEnum = createEEnum(UI_SELECTION_TYPE);
		uiDateFormatEEnum = createEEnum(UI_DATE_FORMAT);
		uiDateTimeResolutionEEnum = createEEnum(UI_DATE_TIME_RESOLUTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UiSemanticsPackage theUiSemanticsPackage = (UiSemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(UiSemanticsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiModelEClass.getESuperTypes().add(this.getUiNamedElement());
		uiImportsEClass.getESuperTypes().add(this.getUiNamedElement());
		uiContextEClass.getESuperTypes().add(this.getUiRootElements());
		uiExposedActionEClass.getESuperTypes().add(this.getUiAction());
		uiViewSetEClass.getESuperTypes().add(this.getUiContext());
		uiViewEClass.getESuperTypes().add(this.getUiContext());
		uiViewEClass.getESuperTypes().add(this.getUiVisibilityProcessable());
		uiViewEClass.getESuperTypes().add(this.getUiRawBindable());
		uiViewEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiDialogEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiDialogEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiDialogEClass.getESuperTypes().add(this.getUiI18nInfoable());
		uiDialogAssignmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiIDEViewEClass.getESuperTypes().add(this.getUiView());
		uiMobileViewEClass.getESuperTypes().add(this.getUiView());
		uiBeanSlotEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiRootElementsEClass.getESuperTypes().add(this.getUiNamedElement());
		uiBindingEndpointAliasEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiBindingEndpointAssignmentEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiBindingEndpointAssignmentEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiNestedFieldEClass.getESuperTypes().add(this.getUiNamedElement());
		uiNestedPropertyEClass.getESuperTypes().add(this.getUiNamedElement());
		uiRawBindableEClass.getESuperTypes().add(this.getUiNamedElement());
		uiTypedBindableEClass.getESuperTypes().add(this.getUiNamedElement());
		uiTypedBindableDefEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiTypedBindableDefEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiTypedBindableRawTypeEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiTypedBindableRawTypeEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiTypedBindableRawTypeAliasEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiTypedBindableRawTypeAliasEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiCommandBindableDefEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiCommandBindableDefEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiVisibilityProcessable());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiRawBindable());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiI18nInfoable());
		uiFieldEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiLayoutEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiLayoutAssignmentEClass.getESuperTypes().add(this.getUiNamedElement());
		uiLayoutAssignmentEClass.getESuperTypes().add(this.getUiRawBindableProvider());
		uiActionEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiMobileEmbeddableEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiMobileFieldEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileFieldEClass.getESuperTypes().add(this.getUiField());
		uiMobileLayoutEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiMobileActionEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileActionEClass.getESuperTypes().add(this.getUiAction());
		uiGridLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiGridLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiHorizontalLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiHorizontalLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiHorizontalLayoutEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiVerticalLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiVerticalLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiVerticalLayoutEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiFormLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiFormLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiSearchPanelEClass.getESuperTypes().add(this.getUiLayout());
		uiSearchPanelEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiBeanReferenceFieldEClass.getESuperTypes().add(this.getUiField());
		uiBeanReferenceFieldEClass.getESuperTypes().add(this.getUiMobileField());
		uiBeanReferenceFieldEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiBeanReferenceFieldEClass.getESuperTypes().add(this.getUiBeanServiceConsumer());
		uiTextFieldEClass.getESuperTypes().add(this.getUiField());
		uiTextFieldEClass.getESuperTypes().add(this.getUiMobileField());
		uiImageEClass.getESuperTypes().add(this.getUiField());
		uiImageEClass.getESuperTypes().add(this.getUiMobileField());
		uiListEClass.getESuperTypes().add(this.getUiField());
		uiListEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiListEClass.getESuperTypes().add(this.getUiBeanServiceConsumer());
		uiTableEClass.getESuperTypes().add(this.getUiField());
		uiTableEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiTableEClass.getESuperTypes().add(this.getUiMobileField());
		uiTableEClass.getESuperTypes().add(this.getUiBeanServiceConsumer());
		uiComboBoxEClass.getESuperTypes().add(this.getUiField());
		uiComboBoxEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiComboBoxEClass.getESuperTypes().add(this.getUiMobileField());
		uiComboBoxEClass.getESuperTypes().add(this.getUiBeanServiceConsumer());
		uiColumnEClass.getESuperTypes().add(this.getUiField());
		uiColumnsAssignmentEClass.getESuperTypes().add(this.getUiField());
		uiNumericFieldEClass.getESuperTypes().add(this.getUiField());
		uiNumericFieldEClass.getESuperTypes().add(this.getUiMobileField());
		uiCheckBoxEClass.getESuperTypes().add(this.getUiField());
		uiVisibilityProcessorEClass.getESuperTypes().add(this.getUiNamedElement());
		uiVisibilityProcessorDefEClass.getESuperTypes().add(this.getUiRootElements());
		uiVisibilityRuleEClass.getESuperTypes().add(this.getUiNamedElement());
		uiXbaseVisibilityRuleEClass.getESuperTypes().add(this.getUiVisibilityRule());
		uiVisibilityPropertyEClass.getESuperTypes().add(this.getUiNamedElement());
		uiValidatorEClass.getESuperTypes().add(this.getUiRawBindable());
		uiValidatorEClass.getESuperTypes().add(this.getUiI18nInfoable());
		uiMaxLengthValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiMinLengthValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiRegexpValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiXbaseValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiValidatorAliasEClass.getESuperTypes().add(this.getUiRootElements());
		uiValidatorAssignmentEClass.getESuperTypes().add(this.getUiNamedElement());
		uiValidatorDefEClass.getESuperTypes().add(this.getUiNamedElement());
		uiHorizontalButtonGroupAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiHorizontalButtonGroupEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiButtonEClass.getESuperTypes().add(this.getUiAction());
		uiButtonEClass.getESuperTypes().add(this.getUiI18nInfoable());
		uiButtonEClass.getESuperTypes().add(this.getUiMobileAction());
		uiSwitchEClass.getESuperTypes().add(this.getUiMobileField());
		uiVerticalComponentGroupAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiVerticalComponentGroupEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiMobileTabSheetEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileTabAssignmentEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileTabAssignmentEClass.getESuperTypes().add(this.getUiI18nInfoable());
		uiTabSheetEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiTabAssignmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiTabAssignmentEClass.getESuperTypes().add(this.getUiI18nInfoable());
		uiMobileNavigationPageEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiMobileNavigationPageEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiMobileNavigationPageEClass.getESuperTypes().add(this.getUiMobileNavigationHandler());
		uiMobileNavigationPageAssignmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiMobileNavigationButtonEClass.getESuperTypes().add(this.getUiMobileAction());
		uiCommandEClass.getESuperTypes().add(this.getUiNamedElement());
		uiMobileNavigationCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiOpenDialogCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiSearchFieldEClass.getESuperTypes().add(this.getUiField());
		uiSearchFieldEClass.getESuperTypes().add(this.getUiMobileField());
		uiSearchDialogEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiSearchDialogEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiDialogSearchFieldAssignmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiSearchWithDialogCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiLabelEClass.getESuperTypes().add(this.getUiField());
		uiLabelEClass.getESuperTypes().add(this.getUiMobileField());
		uiDecimalFieldEClass.getESuperTypes().add(this.getUiField());
		uiDecimalFieldEClass.getESuperTypes().add(this.getUiMobileField());
		uiTextAreaEClass.getESuperTypes().add(this.getUiField());
		uiTextAreaEClass.getESuperTypes().add(this.getUiMobileField());
		uiOptionsGroupEClass.getESuperTypes().add(this.getUiField());
		uiOptionsGroupEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiOptionsGroupEClass.getESuperTypes().add(this.getUiMobileField());
		uiOptionsGroupEClass.getESuperTypes().add(this.getUiBeanServiceConsumer());
		uiDateFieldEClass.getESuperTypes().add(this.getUiField());
		uiDateFieldEClass.getESuperTypes().add(this.getUiMobileField());
		uiBrowserEClass.getESuperTypes().add(this.getUiField());
		uiBrowserEClass.getESuperTypes().add(this.getUiMobileField());
		uiProgressBarEClass.getESuperTypes().add(this.getUiField());
		uiProgressBarEClass.getESuperTypes().add(this.getUiMobileField());
		uiSplitpanelAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiSplitpanelEClass.getESuperTypes().add(this.getUiLayout());
		uiPanelEClass.getESuperTypes().add(this.getUiLayout());
		uiErrorCodeEClass.getESuperTypes().add(this.getUiNamedElement());
		uiMobileSearchPanelEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiMobileSearchPanelEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiMobileNavigationRootEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiMobileNavigationRootEClass.getESuperTypes().add(this.getUiMobileNavigationHandler());
		uiMobileNavigationRootAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiMobileNavBarActionEClass.getESuperTypes().add(this.getUiMobileAction());
		uiAddToTableCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiRemoveFromTableCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiSendEventCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiSetNewInstanceCommandEClass.getESuperTypes().add(this.getUiCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(uiNamedElementEClass, UiNamedElement.class, "UiNamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiNamedElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, UiNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UiNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiModelEClass, UiModel.class, "UiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiModel_PackageName(), ecorePackage.getEString(), "packageName", null, 1, 1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiModel_Roots(), this.getUiRootElements(), null, "roots", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiModel_Imports(), this.getUiImports(), null, "imports", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiImportsEClass, UiImports.class, "UiImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiImports_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 1, 1, UiImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiContextEClass, UiContext.class, "UiContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiContext_BeanSlots(), this.getUiBeanSlot(), null, "beanSlots", null, 0, -1, UiContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiContext_BindingEndpointAlias(), this.getUiBindingEndpointAlias(), null, "bindingEndpointAlias", null, 0, -1, UiContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiContext_Bindings(), this.getUiBinding(), null, "bindings", null, 0, -1, UiContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiContext_SharedStateGroup(), ecorePackage.getEString(), "sharedStateGroup", null, 0, 1, UiContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiExposedActionEClass, UiExposedAction.class, "UiExposedAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiExposedAction_ActionReference(), theUiSemanticsPackage.getUxAction(), null, "actionReference", null, 0, 1, UiExposedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiExposedAction_ActionID(), ecorePackage.getEString(), "actionID", null, 0, 1, UiExposedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiExposedAction_IconName(), ecorePackage.getEString(), "iconName", null, 0, 1, UiExposedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiExposedAction_CheckDirty(), ecorePackage.getEBoolean(), "checkDirty", null, 0, 1, UiExposedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiExposedAction_ExternalCommandId(), ecorePackage.getEString(), "externalCommandId", null, 0, 1, UiExposedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiViewSetEClass, UiViewSet.class, "UiViewSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiViewEClass, UiView.class, "UiView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiView_ViewSet(), this.getUiViewSet(), null, "viewSet", null, 0, 1, UiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiView_Content(), this.getUiEmbeddable(), null, "content", null, 0, 1, UiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiView_ContentAlignment(), this.getUiAlignment(), "contentAlignment", null, 0, 1, UiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiView_ValidatorAssignments(), this.getUiValidatorAssignment(), null, "validatorAssignments", null, 0, -1, UiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDialogEClass, UiDialog.class, "UiDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiDialog_Content(), this.getUiDialogAssignment(), null, "content", null, 0, 1, UiDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDialogAssignmentEClass, UiDialogAssignment.class, "UiDialogAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiDialogAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiDialogAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiIDEViewEClass, UiIDEView.class, "UiIDEView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiIDEView_ExposedActions(), this.getUiExposedAction(), null, "exposedActions", null, 0, -1, UiIDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileViewEClass, UiMobileView.class, "UiMobileView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiPointEClass, UiPoint.class, "UiPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBeanSlotEClass, UiBeanSlot.class, "UiBeanSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBeanSlot_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBeanSlot_EClass(), ecorePackage.getEClass(), null, "eClass", null, 0, 1, UiBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBeanSlot_EventTopic(), ecorePackage.getEString(), "eventTopic", null, 0, 1, UiBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRootElementsEClass, UiRootElements.class, "UiRootElements", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiBindingExpressionEClass, UiBindingExpression.class, "UiBindingExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiBindingEndpointAliasEClass, UiBindingEndpointAlias.class, "UiBindingEndpointAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiBindingEndpointAlias_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, UiBindingEndpointAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointAlias_Endpoint(), this.getUiBindingExpression(), null, "endpoint", null, 1, 1, UiBindingEndpointAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEndpointAssignmentEClass, UiBindingEndpointAssignment.class, "UiBindingEndpointAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBindingEndpointAssignment_TypedBindableDef(), this.getUiBindingExpression(), null, "typedBindableDef", null, 0, 1, UiBindingEndpointAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointAssignment_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiBindingEndpointAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointAssignment_TypedBindableAlias(), this.getUiTypedBindable(), null, "typedBindableAlias", null, 0, 1, UiBindingEndpointAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEClass, UiBinding.class, "UiBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBinding_Source(), this.getUiBindingExpression(), null, "source", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_SourceAlias(), this.getUiTypedBindable(), null, "sourceAlias", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_TargetToSource(), ecorePackage.getEBoolean(), "targetToSource", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_SourceToTarget(), ecorePackage.getEBoolean(), "sourceToTarget", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_Target(), this.getUiBindingExpression(), null, "target", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_TargetAlias(), this.getUiTypedBindable(), null, "targetAlias", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_ListBinding(), ecorePackage.getEBoolean(), "listBinding", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPathSegmentEClass, UiPathSegment.class, "UiPathSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiPathSegment_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiPathSegment_Getter(), theTypesPackage.getJvmOperation(), null, "getter", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiNestedFieldEClass, UiNestedField.class, "UiNestedField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiNestedField_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiNestedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiNestedField_Field(), theTypesPackage.getJvmField(), null, "field", null, 0, 1, UiNestedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiNestedPropertyEClass, UiNestedProperty.class, "UiNestedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiNestedProperty_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiNestedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiNestedProperty_Getter(), theTypesPackage.getJvmOperation(), null, "getter", null, 0, 1, UiNestedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRawBindableEClass, UiRawBindable.class, "UiRawBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiRawBindableProviderEClass, UiRawBindableProvider.class, "UiRawBindableProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiRawBindablePathSegmentEClass, UiRawBindablePathSegment.class, "UiRawBindablePathSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiRawBindablePathSegment_RawBindable(), this.getUiRawBindable(), null, "rawBindable", null, 0, 1, UiRawBindablePathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiRawBindablePathSegment_Path(), this.getUiRawBindablePathSegment(), null, "path", null, 0, 1, UiRawBindablePathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiRawBindablePathSegment_ToParent(), ecorePackage.getEBoolean(), "toParent", null, 0, 1, UiRawBindablePathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTypedBindableEClass, UiTypedBindable.class, "UiTypedBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiTypedBindableDefEClass, UiTypedBindableDef.class, "UiTypedBindableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTypedBindableDef_RawBindable(), this.getUiRawBindable(), null, "rawBindable", null, 0, 1, UiTypedBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTypedBindableDef_RawBindablePath(), this.getUiRawBindablePathSegment(), null, "rawBindablePath", null, 0, 1, UiTypedBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTypedBindableDef_Method(), theUiSemanticsPackage.getUxEndpointDef(), null, "method", null, 0, 1, UiTypedBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTypedBindableRawTypeEClass, UiTypedBindableRawType.class, "UiTypedBindableRawType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTypedBindableRawType_RawBindable(), this.getUiRawBindable(), null, "rawBindable", null, 0, 1, UiTypedBindableRawType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTypedBindableRawType_RawBindablePath(), this.getUiRawBindablePathSegment(), null, "rawBindablePath", null, 0, 1, UiTypedBindableRawType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTypedBindableRawTypeAliasEClass, UiTypedBindableRawTypeAlias.class, "UiTypedBindableRawTypeAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiTypedBindableRawTypeAlias_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, UiTypedBindableRawTypeAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTypedBindableRawTypeAlias_Type(), this.getUiBindingExpression(), null, "type", null, 1, 1, UiTypedBindableRawTypeAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiCommandBindableDefEClass, UiCommandBindableDef.class, "UiCommandBindableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiCommandBindableDef_Command(), this.getUiCommand(), null, "command", null, 0, 1, UiCommandBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiEmbeddableEClass, UiEmbeddable.class, "UiEmbeddable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiEmbeddable_Bindings(), this.getUiBinding(), null, "bindings", null, 0, -1, UiEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiEmbeddable_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, UiEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiEmbeddable_Invisible(), ecorePackage.getEBoolean(), "invisible", null, 0, 1, UiEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiEmbeddable_Styles(), ecorePackage.getEString(), "styles", null, 0, 1, UiEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFieldEClass, UiField.class, "UiField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiField_Validators(), this.getUiValidator(), null, "validators", null, 0, -1, UiField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLayoutEClass, UiLayout.class, "UiLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiLayout_Autowire(), ecorePackage.getEBoolean(), "autowire", null, 0, 1, UiLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiLayout_AutoWireSource(), this.getUiBindingExpression(), null, "autoWireSource", null, 0, 1, UiLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLayoutAssignmentEClass, UiLayoutAssignment.class, "UiLayoutAssignment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiActionEClass, UiAction.class, "UiAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileEmbeddableEClass, UiMobileEmbeddable.class, "UiMobileEmbeddable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileFieldEClass, UiMobileField.class, "UiMobileField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileLayoutEClass, UiMobileLayout.class, "UiMobileLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileActionEClass, UiMobileAction.class, "UiMobileAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiGridLayoutAssigmentEClass, UiGridLayoutAssigment.class, "UiGridLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_From(), this.getUiPoint(), null, "from", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_To(), this.getUiPoint(), null, "to", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiGridLayoutAssigment_Alignment(), this.getUiAlignment(), "alignment", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiGridLayoutEClass, UiGridLayout.class, "UiGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayout_Contents(), this.getUiGridLayoutAssigment(), null, "contents", null, 0, -1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiGridLayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalLayoutAssigmentEClass, UiHorizontalLayoutAssigment.class, "UiHorizontalLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiHorizontalLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiHorizontalLayoutAssigment_Alignment(), this.getUiAlignment(), "alignment", "UNDEFINED", 0, 1, UiHorizontalLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalLayoutEClass, UiHorizontalLayout.class, "UiHorizontalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalLayout_Contents(), this.getUiHorizontalLayoutAssigment(), null, "contents", null, 0, -1, UiHorizontalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVerticalLayoutAssigmentEClass, UiVerticalLayoutAssigment.class, "UiVerticalLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiVerticalLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiVerticalLayoutAssigment_Alignment(), this.getUiAlignment(), "alignment", null, 0, 1, UiVerticalLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVerticalLayoutEClass, UiVerticalLayout.class, "UiVerticalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalLayout_Contents(), this.getUiVerticalLayoutAssigment(), null, "contents", null, 0, -1, UiVerticalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFormLayoutAssigmentEClass, UiFormLayoutAssigment.class, "UiFormLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiFormLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiFormLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFormLayoutEClass, UiFormLayout.class, "UiFormLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiFormLayout_Contents(), this.getUiFormLayoutAssigment(), null, "contents", null, 0, -1, UiFormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSearchPanelEClass, UiSearchPanel.class, "UiSearchPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSearchPanel_Contents(), this.getUiSearchField(), null, "contents", null, 0, -1, UiSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBeanReferenceFieldEClass, UiBeanReferenceField.class, "UiBeanReferenceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBeanReferenceField_CaptionProperty(), this.getUiNestedProperty(), null, "captionProperty", null, 0, 1, UiBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBeanReferenceField_ImageProperty(), this.getUiNestedProperty(), null, "imageProperty", null, 0, 1, UiBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBeanReferenceField_InMemoryBeanProvider(), theTypesPackage.getJvmTypeReference(), null, "inMemoryBeanProvider", null, 0, 1, UiBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBeanReferenceField_DescriptionProperty(), this.getUiNestedProperty(), null, "descriptionProperty", null, 0, 1, UiBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBeanReferenceField_ReferenceSourceJvmType(), theTypesPackage.getJvmTypeReference(), null, "referenceSourceJvmType", null, 0, 1, UiBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBeanReferenceField_ReferenceSourceField(), theTypesPackage.getJvmField(), null, "referenceSourceField", null, 0, 1, UiBeanReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTextFieldEClass, UiTextField.class, "UiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiTextField_MaxLength(), ecorePackage.getEInt(), "maxLength", "-1", 0, 1, UiTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiTextField_MinLength(), ecorePackage.getEInt(), "minLength", "-1", 0, 1, UiTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiTextField_Regex(), ecorePackage.getEString(), "regex", null, 0, 1, UiTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiImageEClass, UiImage.class, "UiImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiImage_Value(), ecorePackage.getEString(), "value", null, 0, 1, UiImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiListEClass, UiList.class, "UiList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiList_SelectionType(), this.getUiSelectionType(), "selectionType", "SINGLE", 1, 1, UiList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiList_ItemImageProperty(), theTypesPackage.getJvmOperation(), null, "itemImageProperty", null, 0, 1, UiList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiList_ItemCaptionProperty(), theTypesPackage.getJvmOperation(), null, "itemCaptionProperty", null, 0, 1, UiList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiList_DescriptionProperty(), this.getUiNestedProperty(), null, "descriptionProperty", null, 0, 1, UiList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTableEClass, UiTable.class, "UiTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTable_ColumnAssignment(), this.getUiColumnsAssignment(), null, "columnAssignment", null, 0, 1, UiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiTable_SelectionType(), this.getUiSelectionType(), "selectionType", "SINGLE", 1, 1, UiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTable_ItemImageProperty(), theTypesPackage.getJvmOperation(), null, "itemImageProperty", null, 0, 1, UiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComboBoxEClass, UiComboBox.class, "UiComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiComboBox_ItemCaptionProperty(), theTypesPackage.getJvmOperation(), null, "itemCaptionProperty", null, 0, 1, UiComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiComboBox_ItemImageProperty(), theTypesPackage.getJvmOperation(), null, "itemImageProperty", null, 0, 1, UiComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiComboBox_DescriptionProperty(), this.getUiNestedProperty(), null, "descriptionProperty", null, 0, 1, UiComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTypeProviderEClass, UiTypeProvider.class, "UiTypeProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTypeProvider_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiTypeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiColumnEClass, UiColumn.class, "UiColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiColumn_IconName(), ecorePackage.getEString(), "iconName", null, 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Orderable(), ecorePackage.getEBoolean(), "orderable", "true", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Collapsed(), ecorePackage.getEBoolean(), "collapsed", "false", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Collapsible(), ecorePackage.getEBoolean(), "collapsible", "true", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Alignment(), this.getUiFlatAlignment(), "alignment", "LEFT", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_ExpandRatio(), ecorePackage.getEFloat(), "expandRatio", "-1.0f", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiColumn_Property(), this.getUiNestedProperty(), null, "property", null, 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiColumnsAssignmentEClass, UiColumnsAssignment.class, "UiColumnsAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiColumnsAssignment_Columns(), this.getUiColumn(), null, "columns", null, 0, -1, UiColumnsAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiNumericFieldEClass, UiNumericField.class, "UiNumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiNumericField_NoGrouping(), ecorePackage.getEBoolean(), "noGrouping", "false", 0, 1, UiNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiNumericField_NoMarkNegative(), ecorePackage.getEBoolean(), "noMarkNegative", "false", 0, 1, UiNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiCheckBoxEClass, UiCheckBox.class, "UiCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiVisibilityProcessableEClass, UiVisibilityProcessable.class, "UiVisibilityProcessable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessable_ProcessorAssignments(), this.getUiVisibilityProcessorAssignment(), null, "processorAssignments", null, 0, -1, UiVisibilityProcessable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorAssignmentEClass, UiVisibilityProcessorAssignment.class, "UiVisibilityProcessorAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessorAssignment_Processor(), this.getUiVisibilityProcessor(), null, "processor", null, 0, 1, UiVisibilityProcessorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessorAssignment_ProcessorAlias(), this.getUiVisibilityProcessor(), null, "processorAlias", null, 0, 1, UiVisibilityProcessorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorEClass, UiVisibilityProcessor.class, "UiVisibilityProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessor_DataUsed(), this.getUiBindingEndpointAlias(), null, "dataUsed", null, 0, -1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_ChangeTriggers(), this.getUiChangeTrigger(), null, "changeTriggers", null, 0, -1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_ImportedElements(), this.getUiBindingExpression(), null, "importedElements", null, 0, -1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_Rule(), this.getUiVisibilityRule(), null, "rule", null, 0, 1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorDefEClass, UiVisibilityProcessorDef.class, "UiVisibilityProcessorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessorDef_Processor(), this.getUiVisibilityProcessor(), null, "processor", null, 0, 1, UiVisibilityProcessorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiChangeTriggerEClass, UiChangeTrigger.class, "UiChangeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiChangeTrigger_Endpoint(), this.getUiBindingExpression(), null, "endpoint", null, 0, 1, UiChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiChangeTrigger_EndpointAlias(), this.getUiBindingEndpointAlias(), null, "endpointAlias", null, 0, 1, UiChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiChangeTrigger_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, UiChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityRuleEClass, UiVisibilityRule.class, "UiVisibilityRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiXbaseVisibilityRuleEClass, UiXbaseVisibilityRule.class, "UiXbaseVisibilityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiXbaseVisibilityRule_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, UiXbaseVisibilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityPropertiesAssignmentEClass, UiVisibilityPropertiesAssignment.class, "UiVisibilityPropertiesAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityPropertiesAssignment_Properties(), this.getUiVisibilityProperty(), null, "properties", null, 0, -1, UiVisibilityPropertiesAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityPropertyEClass, UiVisibilityProperty.class, "UiVisibilityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProperty_BindableDef(), this.getUiBindingExpression(), null, "bindableDef", null, 0, 1, UiVisibilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProperty_AssignmentExpression(), theXbasePackage.getXExpression(), null, "assignmentExpression", null, 0, 1, UiVisibilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorEClass, UiValidator.class, "UiValidator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMaxLengthValidatorEClass, UiMaxLengthValidator.class, "UiMaxLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiMaxLengthValidator_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, UiMaxLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiMaxLengthValidator_ErrorCode(), this.getUiErrorCode(), null, "errorCode", null, 0, 1, UiMaxLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMinLengthValidatorEClass, UiMinLengthValidator.class, "UiMinLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiMinLengthValidator_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, UiMinLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiMinLengthValidator_ErrorCode(), this.getUiErrorCode(), null, "errorCode", null, 0, 1, UiMinLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRegexpValidatorEClass, UiRegexpValidator.class, "UiRegexpValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiRegexpValidator_RegExpression(), ecorePackage.getEString(), "regExpression", null, 0, 1, UiRegexpValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiRegexpValidator_ErrorCode(), this.getUiErrorCode(), null, "errorCode", null, 0, 1, UiRegexpValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiXbaseValidatorEClass, UiXbaseValidator.class, "UiXbaseValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiXbaseValidator_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, UiXbaseValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiXbaseValidator_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiXbaseValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiXbaseValidator_ErrorCodes(), this.getUiErrorCode(), null, "errorCodes", null, 0, -1, UiXbaseValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorAliasEClass, UiValidatorAlias.class, "UiValidatorAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiValidatorAlias_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, UiValidatorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorAlias_Validator(), this.getUiValidator(), null, "validator", null, 1, 1, UiValidatorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorAssignmentEClass, UiValidatorAssignment.class, "UiValidatorAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiValidatorAssignment_Field(), this.getUiField(), null, "field", null, 1, 1, UiValidatorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorAssignment_ValidatorDef(), this.getUiValidatorDef(), null, "validatorDef", null, 0, 1, UiValidatorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorAssignment_ValidatorAlias(), this.getUiValidatorAlias(), null, "validatorAlias", null, 0, 1, UiValidatorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorDefEClass, UiValidatorDef.class, "UiValidatorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiValidatorDef_Validator(), this.getUiValidator(), null, "validator", null, 0, 1, UiValidatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorDef_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiValidatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalButtonGroupAssigmentEClass, UiHorizontalButtonGroupAssigment.class, "UiHorizontalButtonGroupAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalButtonGroupAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiHorizontalButtonGroupAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalButtonGroupEClass, UiHorizontalButtonGroup.class, "UiHorizontalButtonGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalButtonGroup_Contents(), this.getUiHorizontalButtonGroupAssigment(), null, "contents", null, 0, -1, UiHorizontalButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiButtonEClass, UiButton.class, "UiButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiSwitchEClass, UiSwitch.class, "UiSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiVerticalComponentGroupAssigmentEClass, UiVerticalComponentGroupAssigment.class, "UiVerticalComponentGroupAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalComponentGroupAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiVerticalComponentGroupAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVerticalComponentGroupEClass, UiVerticalComponentGroup.class, "UiVerticalComponentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalComponentGroup_Contents(), this.getUiVerticalComponentGroupAssigment(), null, "contents", null, 0, -1, UiVerticalComponentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileTabSheetEClass, UiMobileTabSheet.class, "UiMobileTabSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileTabSheet_Tabs(), this.getUiMobileTabAssignment(), null, "tabs", null, 0, -1, UiMobileTabSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileTabAssignmentEClass, UiMobileTabAssignment.class, "UiMobileTabAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileTabAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiMobileTabAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTabSheetEClass, UiTabSheet.class, "UiTabSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTabSheet_Tabs(), this.getUiTabAssignment(), null, "tabs", null, 0, -1, UiTabSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTabAssignmentEClass, UiTabAssignment.class, "UiTabAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTabAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiTabAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationHandlerEClass, UiMobileNavigationHandler.class, "UiMobileNavigationHandler", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileNavigationPageEClass, UiMobileNavigationPage.class, "UiMobileNavigationPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationPage_Contents(), this.getUiMobileNavigationPageAssignment(), null, "contents", null, 0, -1, UiMobileNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiMobileNavigationPage_BarActions(), this.getUiMobileNavBarAction(), null, "barActions", null, 0, -1, UiMobileNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationPageAssignmentEClass, UiMobileNavigationPageAssignment.class, "UiMobileNavigationPageAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationPageAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiMobileNavigationPageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiMobileNavigationPageAssignment_Alignment(), this.getUiAlignment(), "alignment", null, 0, 1, UiMobileNavigationPageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationButtonEClass, UiMobileNavigationButton.class, "UiMobileNavigationButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationButton_TargetPage(), this.getUiMobileNavigationPage(), null, "targetPage", null, 0, 1, UiMobileNavigationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiMobileNavigationButton_TargetPageAlias(), this.getUiMobileNavigationPage(), null, "targetPageAlias", null, 0, 1, UiMobileNavigationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiCommandEClass, UiCommand.class, "UiCommand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileNavigationCommandEClass, UiMobileNavigationCommand.class, "UiMobileNavigationCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationCommand_TargetPage(), this.getUiMobileNavigationPage(), null, "targetPage", null, 0, 1, UiMobileNavigationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiMobileNavigationCommand_TargetPageAlias(), this.getUiMobileNavigationPage(), null, "targetPageAlias", null, 0, 1, UiMobileNavigationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiOpenDialogCommandEClass, UiOpenDialogCommand.class, "UiOpenDialogCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiOpenDialogCommand_Dialog(), this.getUiDialog(), null, "dialog", null, 0, 1, UiOpenDialogCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSearchFieldEClass, UiSearchField.class, "UiSearchField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSearchField_Property(), this.getUiNestedProperty(), null, "property", null, 0, 1, UiSearchField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSearchDialogEClass, UiSearchDialog.class, "UiSearchDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSearchDialog_SearchFields(), this.getUiDialogSearchFieldAssignment(), null, "searchFields", null, 0, -1, UiSearchDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiSearchDialog_Content(), this.getUiDialogAssignment(), null, "content", null, 0, 1, UiSearchDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDialogSearchFieldAssignmentEClass, UiDialogSearchFieldAssignment.class, "UiDialogSearchFieldAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiDialogSearchFieldAssignment_Element(), this.getUiSearchField(), null, "element", null, 0, 1, UiDialogSearchFieldAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSearchWithDialogCommandEClass, UiSearchWithDialogCommand.class, "UiSearchWithDialogCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSearchWithDialogCommand_Dialog(), this.getUiSearchDialog(), null, "dialog", null, 0, 1, UiSearchWithDialogCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLabelEClass, UiLabel.class, "UiLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiDecimalFieldEClass, UiDecimalField.class, "UiDecimalField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiDecimalField_Precision(), ecorePackage.getEInt(), "precision", "2", 0, 1, UiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiDecimalField_NoGrouping(), ecorePackage.getEBoolean(), "noGrouping", "false", 0, 1, UiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiDecimalField_NoMarkNegative(), ecorePackage.getEBoolean(), "noMarkNegative", "false", 0, 1, UiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTextAreaEClass, UiTextArea.class, "UiTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiOptionsGroupEClass, UiOptionsGroup.class, "UiOptionsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiOptionsGroup_SelectionType(), this.getUiSelectionType(), "selectionType", "SINGLE", 0, 1, UiOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiOptionsGroup_ItemImageProperty(), theTypesPackage.getJvmOperation(), null, "itemImageProperty", null, 0, 1, UiOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiOptionsGroup_ItemCaptionProperty(), theTypesPackage.getJvmOperation(), null, "itemCaptionProperty", null, 0, 1, UiOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiOptionsGroup_DescriptionProperty(), this.getUiNestedProperty(), null, "descriptionProperty", null, 0, 1, UiOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDateFieldEClass, UiDateField.class, "UiDateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiDateField_DateFormat(), this.getUiDateFormat(), "dateFormat", "DATE", 0, 1, UiDateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiDateField_Resolution(), this.getUiDateTimeResolution(), "resolution", "UNDEFINED", 0, 1, UiDateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBrowserEClass, UiBrowser.class, "UiBrowser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiProgressBarEClass, UiProgressBar.class, "UiProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiI18nInfoEClass, UiI18nInfo.class, "UiI18nInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiI18nInfo_Key(), ecorePackage.getEString(), "key", null, 0, 1, UiI18nInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiI18nInfoableEClass, UiI18nInfoable.class, "UiI18nInfoable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiI18nInfoable_I18nInfo(), this.getUiI18nInfo(), null, "i18nInfo", null, 0, 1, UiI18nInfoable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSplitpanelAssigmentEClass, UiSplitpanelAssigment.class, "UiSplitpanelAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSplitpanelAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiSplitpanelAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiSplitpanelAssigment_Alignment(), this.getUiAlignment(), "alignment", null, 0, 1, UiSplitpanelAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSplitpanelEClass, UiSplitpanel.class, "UiSplitpanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSplitpanel_FirstContent(), this.getUiSplitpanelAssigment(), null, "firstContent", null, 0, 1, UiSplitpanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiSplitpanel_SecondContent(), this.getUiSplitpanelAssigment(), null, "secondContent", null, 0, 1, UiSplitpanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiSplitpanel_SplitPosition(), ecorePackage.getEInt(), "splitPosition", "50", 0, 1, UiSplitpanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiSplitpanel_Horizontal(), ecorePackage.getEBoolean(), "horizontal", null, 0, 1, UiSplitpanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPanelEClass, UiPanel.class, "UiPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiPanel_Content(), this.getUiEmbeddable(), null, "content", null, 0, 1, UiPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiPanel_ContentAlignment(), this.getUiAlignment(), "contentAlignment", null, 0, 1, UiPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiErrorCodeEClass, UiErrorCode.class, "UiErrorCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiErrorCode_DefaultMessage(), ecorePackage.getEString(), "defaultMessage", null, 0, 1, UiErrorCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBeanServiceConsumerEClass, UiBeanServiceConsumer.class, "UiBeanServiceConsumer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiBeanServiceConsumer_ConsumeBeanService(), ecorePackage.getEBoolean(), "consumeBeanService", null, 0, 1, UiBeanServiceConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileSearchPanelEClass, UiMobileSearchPanel.class, "UiMobileSearchPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileSearchPanel_Contents(), this.getUiSearchField(), null, "contents", null, 0, -1, UiMobileSearchPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationRootEClass, UiMobileNavigationRoot.class, "UiMobileNavigationRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationRoot_Contents(), this.getUiMobileNavigationRootAssigment(), null, "contents", null, 0, -1, UiMobileNavigationRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationRootAssigmentEClass, UiMobileNavigationRootAssigment.class, "UiMobileNavigationRootAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationRootAssigment_Element(), this.getUiMobileEmbeddable(), null, "element", null, 0, 1, UiMobileNavigationRootAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavBarActionEClass, UiMobileNavBarAction.class, "UiMobileNavBarAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavBarAction_ActionReference(), theUiSemanticsPackage.getUxAction(), null, "actionReference", null, 0, 1, UiMobileNavBarAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiMobileNavBarAction_ActionID(), ecorePackage.getEString(), "actionID", null, 0, 1, UiMobileNavBarAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiMobileNavBarAction_IconName(), ecorePackage.getEString(), "iconName", null, 0, 1, UiMobileNavBarAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiAddToTableCommandEClass, UiAddToTableCommand.class, "UiAddToTableCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiAddToTableCommand_Table(), this.getUiTable(), null, "table", null, 0, 1, UiAddToTableCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRemoveFromTableCommandEClass, UiRemoveFromTableCommand.class, "UiRemoveFromTableCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiRemoveFromTableCommand_Table(), this.getUiTable(), null, "table", null, 0, 1, UiRemoveFromTableCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSendEventCommandEClass, UiSendEventCommand.class, "UiSendEventCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiSendEventCommand_EventTopic(), ecorePackage.getEString(), "eventTopic", null, 0, 1, UiSendEventCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiSendEventCommand_NoAutoTrigger(), ecorePackage.getEBoolean(), "noAutoTrigger", "false", 0, 1, UiSendEventCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSetNewInstanceCommandEClass, UiSetNewInstanceCommand.class, "UiSetNewInstanceCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSetNewInstanceCommand_Target(), this.getUiBindingExpression(), null, "target", null, 0, 1, UiSetNewInstanceCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiSetNewInstanceCommand_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiSetNewInstanceCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(uiFlatAlignmentEEnum, UiFlatAlignment.class, "UiFlatAlignment");
		addEEnumLiteral(uiFlatAlignmentEEnum, UiFlatAlignment.LEFT);
		addEEnumLiteral(uiFlatAlignmentEEnum, UiFlatAlignment.CENTER);
		addEEnumLiteral(uiFlatAlignmentEEnum, UiFlatAlignment.RIGHT);

		initEEnum(uiAlignmentEEnum, UiAlignment.class, "UiAlignment");
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.UNDEFINED);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.BOTTOM_LEFT);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.BOTTOM_CENTER);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.BOTTOM_RIGHT);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.BOTTOM_FILL);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.MIDDLE_LEFT);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.MIDDLE_CENTER);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.MIDDLE_RIGHT);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.MIDDLE_FILL);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.TOP_LEFT);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.TOP_CENTER);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.TOP_RIGHT);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.TOP_FILL);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.FILL_FILL);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.FILL_LEFT);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.FILL_CENTER);
		addEEnumLiteral(uiAlignmentEEnum, UiAlignment.FILL_RIGHT);

		initEEnum(uiSelectionTypeEEnum, UiSelectionType.class, "UiSelectionType");
		addEEnumLiteral(uiSelectionTypeEEnum, UiSelectionType.NONE);
		addEEnumLiteral(uiSelectionTypeEEnum, UiSelectionType.SINGLE);
		addEEnumLiteral(uiSelectionTypeEEnum, UiSelectionType.MULTI);

		initEEnum(uiDateFormatEEnum, UiDateFormat.class, "UiDateFormat");
		addEEnumLiteral(uiDateFormatEEnum, UiDateFormat.DATE);
		addEEnumLiteral(uiDateFormatEEnum, UiDateFormat.TIME);
		addEEnumLiteral(uiDateFormatEEnum, UiDateFormat.DATE_TIME);

		initEEnum(uiDateTimeResolutionEEnum, UiDateTimeResolution.class, "UiDateTimeResolution");
		addEEnumLiteral(uiDateTimeResolutionEEnum, UiDateTimeResolution.SECOND);
		addEEnumLiteral(uiDateTimeResolutionEEnum, UiDateTimeResolution.MINUTE);
		addEEnumLiteral(uiDateTimeResolutionEEnum, UiDateTimeResolution.HOUR);
		addEEnumLiteral(uiDateTimeResolutionEEnum, UiDateTimeResolution.DAY);
		addEEnumLiteral(uiDateTimeResolutionEEnum, UiDateTimeResolution.MONTH);
		addEEnumLiteral(uiDateTimeResolutionEEnum, UiDateTimeResolution.YEAR);
		addEEnumLiteral(uiDateTimeResolutionEEnum, UiDateTimeResolution.UNDEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //UiModelPackageImpl
