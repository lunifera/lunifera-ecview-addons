/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.ecview.semantic.uimodel.*;
import org.lunifera.ecview.semantic.uimodel.UiAction;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBrowser;
import org.lunifera.ecview.semantic.uimodel.UiButton;
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiContext;
import org.lunifera.ecview.semantic.uimodel.UiDateField;
import org.lunifera.ecview.semantic.uimodel.UiDecimalField;
import org.lunifera.ecview.semantic.uimodel.UiDialog;
import org.lunifera.ecview.semantic.uimodel.UiDialogAssignment;
import org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment;
import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment;
import org.lunifera.ecview.semantic.uimodel.UiFormLayout;
import org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImage;
import org.lunifera.ecview.semantic.uimodel.UiImports;
import org.lunifera.ecview.semantic.uimodel.UiLabel;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMobileAction;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiMobileView;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelFactory;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand;
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiProgressBar;
import org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiSearchDialog;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand;
import org.lunifera.ecview.semantic.uimodel.UiSelectionType;
import org.lunifera.ecview.semantic.uimodel.UiSwitch;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiTextArea;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;
import org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiModelFactoryImpl extends EFactoryImpl implements UiModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiModelFactory init() {
		try {
			UiModelFactory theUiModelFactory = (UiModelFactory)EPackage.Registry.INSTANCE.getEFactory(UiModelPackage.eNS_URI);
			if (theUiModelFactory != null) {
				return theUiModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UiModelPackage.UI_MODEL: return createUiModel();
			case UiModelPackage.UI_IMPORTS: return createUiImports();
			case UiModelPackage.UI_CONTEXT: return createUiContext();
			case UiModelPackage.UI_VIEW_SET: return createUiViewSet();
			case UiModelPackage.UI_VIEW: return createUiView();
			case UiModelPackage.UI_DIALOG: return createUiDialog();
			case UiModelPackage.UI_DIALOG_ASSIGNMENT: return createUiDialogAssignment();
			case UiModelPackage.UI_IDE_VIEW: return createUiIDEView();
			case UiModelPackage.UI_MOBILE_VIEW: return createUiMobileView();
			case UiModelPackage.UI_POINT: return createUiPoint();
			case UiModelPackage.UI_BEAN_SLOT: return createUiBeanSlot();
			case UiModelPackage.UI_BINDING_ENDPOINT_ALIAS: return createUiBindingEndpointAlias();
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT: return createUiBindingEndpointAssignment();
			case UiModelPackage.UI_BINDING: return createUiBinding();
			case UiModelPackage.UI_PATH_SEGMENT: return createUiPathSegment();
			case UiModelPackage.UI_NESTED_PROPERTY: return createUiNestedProperty();
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT: return createUiRawBindablePathSegment();
			case UiModelPackage.UI_TYPED_BINDABLE_DEF: return createUiTypedBindableDef();
			case UiModelPackage.UI_TYPED_BINDABLE_RAW_TYPE: return createUiTypedBindableRawType();
			case UiModelPackage.UI_TYPED_BINDABLE_RAW_TYPE_ALIAS: return createUiTypedBindableRawTypeAlias();
			case UiModelPackage.UI_COMMAND_BINDABLE_DEF: return createUiCommandBindableDef();
			case UiModelPackage.UI_ACTION: return createUiAction();
			case UiModelPackage.UI_MOBILE_ACTION: return createUiMobileAction();
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT: return createUiGridLayoutAssigment();
			case UiModelPackage.UI_GRID_LAYOUT: return createUiGridLayout();
			case UiModelPackage.UI_HORIZONTAL_LAYOUT_ASSIGMENT: return createUiHorizontalLayoutAssigment();
			case UiModelPackage.UI_HORIZONTAL_LAYOUT: return createUiHorizontalLayout();
			case UiModelPackage.UI_VERTICAL_LAYOUT_ASSIGMENT: return createUiVerticalLayoutAssigment();
			case UiModelPackage.UI_VERTICAL_LAYOUT: return createUiVerticalLayout();
			case UiModelPackage.UI_FORM_LAYOUT_ASSIGMENT: return createUiFormLayoutAssigment();
			case UiModelPackage.UI_FORM_LAYOUT: return createUiFormLayout();
			case UiModelPackage.UI_SEARCH_PANEL: return createUiSearchPanel();
			case UiModelPackage.UI_TEXT_FIELD: return createUiTextField();
			case UiModelPackage.UI_IMAGE: return createUiImage();
			case UiModelPackage.UI_LIST: return createUiList();
			case UiModelPackage.UI_TABLE: return createUiTable();
			case UiModelPackage.UI_COMBO_BOX: return createUiComboBox();
			case UiModelPackage.UI_COLUMN: return createUiColumn();
			case UiModelPackage.UI_COLUMNS_ASSIGNMENT: return createUiColumnsAssignment();
			case UiModelPackage.UI_NUMERIC_FIELD: return createUiNumericField();
			case UiModelPackage.UI_CHECK_BOX: return createUiCheckBox();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT: return createUiVisibilityProcessorAssignment();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR: return createUiVisibilityProcessor();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR_DEF: return createUiVisibilityProcessorDef();
			case UiModelPackage.UI_CHANGE_TRIGGER: return createUiChangeTrigger();
			case UiModelPackage.UI_XBASE_VISIBILITY_RULE: return createUiXbaseVisibilityRule();
			case UiModelPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT: return createUiVisibilityPropertiesAssignment();
			case UiModelPackage.UI_VISIBILITY_PROPERTY: return createUiVisibilityProperty();
			case UiModelPackage.UI_MAX_LENGTH_VALIDATOR: return createUiMaxLengthValidator();
			case UiModelPackage.UI_MIN_LENGTH_VALIDATOR: return createUiMinLengthValidator();
			case UiModelPackage.UI_REGEXP_VALIDATOR: return createUiRegexpValidator();
			case UiModelPackage.UI_XBASE_VALIDATOR: return createUiXbaseValidator();
			case UiModelPackage.UI_VALIDATOR_ALIAS: return createUiValidatorAlias();
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT: return createUiValidatorAssignment();
			case UiModelPackage.UI_VALIDATOR_DEF: return createUiValidatorDef();
			case UiModelPackage.UI_HORIZONTAL_BUTTON_GROUP_ASSIGMENT: return createUiHorizontalButtonGroupAssigment();
			case UiModelPackage.UI_HORIZONTAL_BUTTON_GROUP: return createUiHorizontalButtonGroup();
			case UiModelPackage.UI_BUTTON: return createUiButton();
			case UiModelPackage.UI_SWITCH: return createUiSwitch();
			case UiModelPackage.UI_VERTICAL_COMPONENT_GROUP_ASSIGMENT: return createUiVerticalComponentGroupAssigment();
			case UiModelPackage.UI_VERTICAL_COMPONENT_GROUP: return createUiVerticalComponentGroup();
			case UiModelPackage.UI_MOBILE_TAB_SHEET: return createUiMobileTabSheet();
			case UiModelPackage.UI_MOBILE_TAB_ASSIGNMENT: return createUiMobileTabAssignment();
			case UiModelPackage.UI_TAB_SHEET: return createUiTabSheet();
			case UiModelPackage.UI_TAB_ASSIGNMENT: return createUiTabAssignment();
			case UiModelPackage.UI_MOBILE_NAVIGATION_PAGE: return createUiMobileNavigationPage();
			case UiModelPackage.UI_MOBILE_NAVIGATION_PAGE_ASSIGNMENT: return createUiMobileNavigationPageAssignment();
			case UiModelPackage.UI_MOBILE_NAVIGATION_BUTTON: return createUiMobileNavigationButton();
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND: return createUiMobileNavigationCommand();
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND: return createUiOpenDialogCommand();
			case UiModelPackage.UI_SEARCH_FIELD: return createUiSearchField();
			case UiModelPackage.UI_SEARCH_DIALOG: return createUiSearchDialog();
			case UiModelPackage.UI_DIALOG_SEARCH_FIELD_ASSIGNMENT: return createUiDialogSearchFieldAssignment();
			case UiModelPackage.UI_SEARCH_WITH_DIALOG_COMMAND: return createUiSearchWithDialogCommand();
			case UiModelPackage.UI_LABEL: return createUiLabel();
			case UiModelPackage.UI_DECIMAL_FIELD: return createUiDecimalField();
			case UiModelPackage.UI_TEXT_AREA: return createUiTextArea();
			case UiModelPackage.UI_OPTIONS_GROUP: return createUiOptionsGroup();
			case UiModelPackage.UI_DATE_FIELD: return createUiDateField();
			case UiModelPackage.UI_BROWSER: return createUiBrowser();
			case UiModelPackage.UI_PROGRESS_BAR: return createUiProgressBar();
			case UiModelPackage.UI_I1_8N_INFO: return createUiI18nInfo();
			case UiModelPackage.UI_SPLITPANEL_ASSIGMENT: return createUiSplitpanelAssigment();
			case UiModelPackage.UI_SPLITPANEL: return createUiSplitpanel();
			case UiModelPackage.UI_PANEL: return createUiPanel();
			case UiModelPackage.UI_ERROR_CODE: return createUiErrorCode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UiModelPackage.UI_FLAT_ALIGNMENT:
				return createUiFlatAlignmentFromString(eDataType, initialValue);
			case UiModelPackage.UI_ALIGNMENT:
				return createUiAlignmentFromString(eDataType, initialValue);
			case UiModelPackage.UI_SELECTION_TYPE:
				return createUiSelectionTypeFromString(eDataType, initialValue);
			case UiModelPackage.UI_DATE_FORMAT:
				return createUiDateFormatFromString(eDataType, initialValue);
			case UiModelPackage.UI_DATE_TIME_RESOLUTION:
				return createUiDateTimeResolutionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UiModelPackage.UI_FLAT_ALIGNMENT:
				return convertUiFlatAlignmentToString(eDataType, instanceValue);
			case UiModelPackage.UI_ALIGNMENT:
				return convertUiAlignmentToString(eDataType, instanceValue);
			case UiModelPackage.UI_SELECTION_TYPE:
				return convertUiSelectionTypeToString(eDataType, instanceValue);
			case UiModelPackage.UI_DATE_FORMAT:
				return convertUiDateFormatToString(eDataType, instanceValue);
			case UiModelPackage.UI_DATE_TIME_RESOLUTION:
				return convertUiDateTimeResolutionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModel createUiModel() {
		UiModelImpl uiModel = new UiModelImpl();
		return uiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiImports createUiImports() {
		UiImportsImpl uiImports = new UiImportsImpl();
		return uiImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiContext createUiContext() {
		UiContextImpl uiContext = new UiContextImpl();
		return uiContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiViewSet createUiViewSet() {
		UiViewSetImpl uiViewSet = new UiViewSetImpl();
		return uiViewSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiView createUiView() {
		UiViewImpl uiView = new UiViewImpl();
		return uiView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDialog createUiDialog() {
		UiDialogImpl uiDialog = new UiDialogImpl();
		return uiDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDialogAssignment createUiDialogAssignment() {
		UiDialogAssignmentImpl uiDialogAssignment = new UiDialogAssignmentImpl();
		return uiDialogAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiIDEView createUiIDEView() {
		UiIDEViewImpl uiIDEView = new UiIDEViewImpl();
		return uiIDEView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileView createUiMobileView() {
		UiMobileViewImpl uiMobileView = new UiMobileViewImpl();
		return uiMobileView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPoint createUiPoint() {
		UiPointImpl uiPoint = new UiPointImpl();
		return uiPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBeanSlot createUiBeanSlot() {
		UiBeanSlotImpl uiBeanSlot = new UiBeanSlotImpl();
		return uiBeanSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias createUiBindingEndpointAlias() {
		UiBindingEndpointAliasImpl uiBindingEndpointAlias = new UiBindingEndpointAliasImpl();
		return uiBindingEndpointAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAssignment createUiBindingEndpointAssignment() {
		UiBindingEndpointAssignmentImpl uiBindingEndpointAssignment = new UiBindingEndpointAssignmentImpl();
		return uiBindingEndpointAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBinding createUiBinding() {
		UiBindingImpl uiBinding = new UiBindingImpl();
		return uiBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment createUiPathSegment() {
		UiPathSegmentImpl uiPathSegment = new UiPathSegmentImpl();
		return uiPathSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNestedProperty createUiNestedProperty() {
		UiNestedPropertyImpl uiNestedProperty = new UiNestedPropertyImpl();
		return uiNestedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindablePathSegment createUiRawBindablePathSegment() {
		UiRawBindablePathSegmentImpl uiRawBindablePathSegment = new UiRawBindablePathSegmentImpl();
		return uiRawBindablePathSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindableDef createUiTypedBindableDef() {
		UiTypedBindableDefImpl uiTypedBindableDef = new UiTypedBindableDefImpl();
		return uiTypedBindableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindableRawType createUiTypedBindableRawType() {
		UiTypedBindableRawTypeImpl uiTypedBindableRawType = new UiTypedBindableRawTypeImpl();
		return uiTypedBindableRawType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindableRawTypeAlias createUiTypedBindableRawTypeAlias() {
		UiTypedBindableRawTypeAliasImpl uiTypedBindableRawTypeAlias = new UiTypedBindableRawTypeAliasImpl();
		return uiTypedBindableRawTypeAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCommandBindableDef createUiCommandBindableDef() {
		UiCommandBindableDefImpl uiCommandBindableDef = new UiCommandBindableDefImpl();
		return uiCommandBindableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAction createUiAction() {
		UiActionImpl uiAction = new UiActionImpl();
		return uiAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileAction createUiMobileAction() {
		UiMobileActionImpl uiMobileAction = new UiMobileActionImpl();
		return uiMobileAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiGridLayoutAssigment createUiGridLayoutAssigment() {
		UiGridLayoutAssigmentImpl uiGridLayoutAssigment = new UiGridLayoutAssigmentImpl();
		return uiGridLayoutAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiGridLayout createUiGridLayout() {
		UiGridLayoutImpl uiGridLayout = new UiGridLayoutImpl();
		return uiGridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiHorizontalLayoutAssigment createUiHorizontalLayoutAssigment() {
		UiHorizontalLayoutAssigmentImpl uiHorizontalLayoutAssigment = new UiHorizontalLayoutAssigmentImpl();
		return uiHorizontalLayoutAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiHorizontalLayout createUiHorizontalLayout() {
		UiHorizontalLayoutImpl uiHorizontalLayout = new UiHorizontalLayoutImpl();
		return uiHorizontalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVerticalLayoutAssigment createUiVerticalLayoutAssigment() {
		UiVerticalLayoutAssigmentImpl uiVerticalLayoutAssigment = new UiVerticalLayoutAssigmentImpl();
		return uiVerticalLayoutAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVerticalLayout createUiVerticalLayout() {
		UiVerticalLayoutImpl uiVerticalLayout = new UiVerticalLayoutImpl();
		return uiVerticalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFormLayoutAssigment createUiFormLayoutAssigment() {
		UiFormLayoutAssigmentImpl uiFormLayoutAssigment = new UiFormLayoutAssigmentImpl();
		return uiFormLayoutAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFormLayout createUiFormLayout() {
		UiFormLayoutImpl uiFormLayout = new UiFormLayoutImpl();
		return uiFormLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSearchPanel createUiSearchPanel() {
		UiSearchPanelImpl uiSearchPanel = new UiSearchPanelImpl();
		return uiSearchPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTextField createUiTextField() {
		UiTextFieldImpl uiTextField = new UiTextFieldImpl();
		return uiTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiImage createUiImage() {
		UiImageImpl uiImage = new UiImageImpl();
		return uiImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiList createUiList() {
		UiListImpl uiList = new UiListImpl();
		return uiList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTable createUiTable() {
		UiTableImpl uiTable = new UiTableImpl();
		return uiTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiComboBox createUiComboBox() {
		UiComboBoxImpl uiComboBox = new UiComboBoxImpl();
		return uiComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiColumn createUiColumn() {
		UiColumnImpl uiColumn = new UiColumnImpl();
		return uiColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiColumnsAssignment createUiColumnsAssignment() {
		UiColumnsAssignmentImpl uiColumnsAssignment = new UiColumnsAssignmentImpl();
		return uiColumnsAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNumericField createUiNumericField() {
		UiNumericFieldImpl uiNumericField = new UiNumericFieldImpl();
		return uiNumericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCheckBox createUiCheckBox() {
		UiCheckBoxImpl uiCheckBox = new UiCheckBoxImpl();
		return uiCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessor createUiVisibilityProcessor() {
		UiVisibilityProcessorImpl uiVisibilityProcessor = new UiVisibilityProcessorImpl();
		return uiVisibilityProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessorDef createUiVisibilityProcessorDef() {
		UiVisibilityProcessorDefImpl uiVisibilityProcessorDef = new UiVisibilityProcessorDefImpl();
		return uiVisibilityProcessorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessorAssignment createUiVisibilityProcessorAssignment() {
		UiVisibilityProcessorAssignmentImpl uiVisibilityProcessorAssignment = new UiVisibilityProcessorAssignmentImpl();
		return uiVisibilityProcessorAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiChangeTrigger createUiChangeTrigger() {
		UiChangeTriggerImpl uiChangeTrigger = new UiChangeTriggerImpl();
		return uiChangeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiXbaseVisibilityRule createUiXbaseVisibilityRule() {
		UiXbaseVisibilityRuleImpl uiXbaseVisibilityRule = new UiXbaseVisibilityRuleImpl();
		return uiXbaseVisibilityRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityPropertiesAssignment createUiVisibilityPropertiesAssignment() {
		UiVisibilityPropertiesAssignmentImpl uiVisibilityPropertiesAssignment = new UiVisibilityPropertiesAssignmentImpl();
		return uiVisibilityPropertiesAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProperty createUiVisibilityProperty() {
		UiVisibilityPropertyImpl uiVisibilityProperty = new UiVisibilityPropertyImpl();
		return uiVisibilityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMaxLengthValidator createUiMaxLengthValidator() {
		UiMaxLengthValidatorImpl uiMaxLengthValidator = new UiMaxLengthValidatorImpl();
		return uiMaxLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMinLengthValidator createUiMinLengthValidator() {
		UiMinLengthValidatorImpl uiMinLengthValidator = new UiMinLengthValidatorImpl();
		return uiMinLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiRegexpValidator createUiRegexpValidator() {
		UiRegexpValidatorImpl uiRegexpValidator = new UiRegexpValidatorImpl();
		return uiRegexpValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiXbaseValidator createUiXbaseValidator() {
		UiXbaseValidatorImpl uiXbaseValidator = new UiXbaseValidatorImpl();
		return uiXbaseValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiValidatorAlias createUiValidatorAlias() {
		UiValidatorAliasImpl uiValidatorAlias = new UiValidatorAliasImpl();
		return uiValidatorAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiValidatorAssignment createUiValidatorAssignment() {
		UiValidatorAssignmentImpl uiValidatorAssignment = new UiValidatorAssignmentImpl();
		return uiValidatorAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiValidatorDef createUiValidatorDef() {
		UiValidatorDefImpl uiValidatorDef = new UiValidatorDefImpl();
		return uiValidatorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiHorizontalButtonGroupAssigment createUiHorizontalButtonGroupAssigment() {
		UiHorizontalButtonGroupAssigmentImpl uiHorizontalButtonGroupAssigment = new UiHorizontalButtonGroupAssigmentImpl();
		return uiHorizontalButtonGroupAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiHorizontalButtonGroup createUiHorizontalButtonGroup() {
		UiHorizontalButtonGroupImpl uiHorizontalButtonGroup = new UiHorizontalButtonGroupImpl();
		return uiHorizontalButtonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiButton createUiButton() {
		UiButtonImpl uiButton = new UiButtonImpl();
		return uiButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSwitch createUiSwitch() {
		UiSwitchImpl uiSwitch = new UiSwitchImpl();
		return uiSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVerticalComponentGroupAssigment createUiVerticalComponentGroupAssigment() {
		UiVerticalComponentGroupAssigmentImpl uiVerticalComponentGroupAssigment = new UiVerticalComponentGroupAssigmentImpl();
		return uiVerticalComponentGroupAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVerticalComponentGroup createUiVerticalComponentGroup() {
		UiVerticalComponentGroupImpl uiVerticalComponentGroup = new UiVerticalComponentGroupImpl();
		return uiVerticalComponentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileTabSheet createUiMobileTabSheet() {
		UiMobileTabSheetImpl uiMobileTabSheet = new UiMobileTabSheetImpl();
		return uiMobileTabSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileTabAssignment createUiMobileTabAssignment() {
		UiMobileTabAssignmentImpl uiMobileTabAssignment = new UiMobileTabAssignmentImpl();
		return uiMobileTabAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTabSheet createUiTabSheet() {
		UiTabSheetImpl uiTabSheet = new UiTabSheetImpl();
		return uiTabSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTabAssignment createUiTabAssignment() {
		UiTabAssignmentImpl uiTabAssignment = new UiTabAssignmentImpl();
		return uiTabAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationPage createUiMobileNavigationPage() {
		UiMobileNavigationPageImpl uiMobileNavigationPage = new UiMobileNavigationPageImpl();
		return uiMobileNavigationPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationPageAssignment createUiMobileNavigationPageAssignment() {
		UiMobileNavigationPageAssignmentImpl uiMobileNavigationPageAssignment = new UiMobileNavigationPageAssignmentImpl();
		return uiMobileNavigationPageAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationButton createUiMobileNavigationButton() {
		UiMobileNavigationButtonImpl uiMobileNavigationButton = new UiMobileNavigationButtonImpl();
		return uiMobileNavigationButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationCommand createUiMobileNavigationCommand() {
		UiMobileNavigationCommandImpl uiMobileNavigationCommand = new UiMobileNavigationCommandImpl();
		return uiMobileNavigationCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiOpenDialogCommand createUiOpenDialogCommand() {
		UiOpenDialogCommandImpl uiOpenDialogCommand = new UiOpenDialogCommandImpl();
		return uiOpenDialogCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSearchField createUiSearchField() {
		UiSearchFieldImpl uiSearchField = new UiSearchFieldImpl();
		return uiSearchField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSearchDialog createUiSearchDialog() {
		UiSearchDialogImpl uiSearchDialog = new UiSearchDialogImpl();
		return uiSearchDialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDialogSearchFieldAssignment createUiDialogSearchFieldAssignment() {
		UiDialogSearchFieldAssignmentImpl uiDialogSearchFieldAssignment = new UiDialogSearchFieldAssignmentImpl();
		return uiDialogSearchFieldAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSearchWithDialogCommand createUiSearchWithDialogCommand() {
		UiSearchWithDialogCommandImpl uiSearchWithDialogCommand = new UiSearchWithDialogCommandImpl();
		return uiSearchWithDialogCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiLabel createUiLabel() {
		UiLabelImpl uiLabel = new UiLabelImpl();
		return uiLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDecimalField createUiDecimalField() {
		UiDecimalFieldImpl uiDecimalField = new UiDecimalFieldImpl();
		return uiDecimalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTextArea createUiTextArea() {
		UiTextAreaImpl uiTextArea = new UiTextAreaImpl();
		return uiTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiOptionsGroup createUiOptionsGroup() {
		UiOptionsGroupImpl uiOptionsGroup = new UiOptionsGroupImpl();
		return uiOptionsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDateField createUiDateField() {
		UiDateFieldImpl uiDateField = new UiDateFieldImpl();
		return uiDateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBrowser createUiBrowser() {
		UiBrowserImpl uiBrowser = new UiBrowserImpl();
		return uiBrowser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiProgressBar createUiProgressBar() {
		UiProgressBarImpl uiProgressBar = new UiProgressBarImpl();
		return uiProgressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiI18nInfo createUiI18nInfo() {
		UiI18nInfoImpl uiI18nInfo = new UiI18nInfoImpl();
		return uiI18nInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSplitpanelAssigment createUiSplitpanelAssigment() {
		UiSplitpanelAssigmentImpl uiSplitpanelAssigment = new UiSplitpanelAssigmentImpl();
		return uiSplitpanelAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSplitpanel createUiSplitpanel() {
		UiSplitpanelImpl uiSplitpanel = new UiSplitpanelImpl();
		return uiSplitpanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPanel createUiPanel() {
		UiPanelImpl uiPanel = new UiPanelImpl();
		return uiPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiErrorCode createUiErrorCode() {
		UiErrorCodeImpl uiErrorCode = new UiErrorCodeImpl();
		return uiErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFlatAlignment createUiFlatAlignmentFromString(EDataType eDataType, String initialValue) {
		UiFlatAlignment result = UiFlatAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUiFlatAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAlignment createUiAlignmentFromString(EDataType eDataType, String initialValue) {
		UiAlignment result = UiAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUiAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSelectionType createUiSelectionTypeFromString(EDataType eDataType, String initialValue) {
		UiSelectionType result = UiSelectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUiSelectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDateFormat createUiDateFormatFromString(EDataType eDataType, String initialValue) {
		UiDateFormat result = UiDateFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUiDateFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiDateTimeResolution createUiDateTimeResolutionFromString(EDataType eDataType, String initialValue) {
		UiDateTimeResolution result = UiDateTimeResolution.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUiDateTimeResolutionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelPackage getUiModelPackage() {
		return (UiModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiModelPackage getPackage() {
		return UiModelPackage.eINSTANCE;
	}

} //UiModelFactoryImpl
