/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EFactory;
 
/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage
 * @generated
 */
public interface UiModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiModelFactory eINSTANCE = org.lunifera.ecview.semantic.uimodel.impl.UiModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ui Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Model</em>'.
	 * @generated
	 */
	UiModel createUiModel();

	/**
	 * Returns a new object of class '<em>Ui Imports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Imports</em>'.
	 * @generated
	 */
	UiImports createUiImports();

	/**
	 * Returns a new object of class '<em>Ui Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Context</em>'.
	 * @generated
	 */
	UiContext createUiContext();

	/**
	 * Returns a new object of class '<em>Ui View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui View</em>'.
	 * @generated
	 */
	UiView createUiView();

	/**
	 * Returns a new object of class '<em>Ui Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Dialog</em>'.
	 * @generated
	 */
	UiDialog createUiDialog();

	/**
	 * Returns a new object of class '<em>Ui Dialog Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Dialog Assignment</em>'.
	 * @generated
	 */
	UiDialogAssignment createUiDialogAssignment();

	/**
	 * Returns a new object of class '<em>Ui IDE View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui IDE View</em>'.
	 * @generated
	 */
	UiIDEView createUiIDEView();

	/**
	 * Returns a new object of class '<em>Ui Mobile View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile View</em>'.
	 * @generated
	 */
	UiMobileView createUiMobileView();

	/**
	 * Returns a new object of class '<em>Ui Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Point</em>'.
	 * @generated
	 */
	UiPoint createUiPoint();

	/**
	 * Returns a new object of class '<em>Ui Binding Endpoint Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Binding Endpoint Alias</em>'.
	 * @generated
	 */
	UiBindingEndpointAlias createUiBindingEndpointAlias();

	/**
	 * Returns a new object of class '<em>Ui Binding Endpoint Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Binding Endpoint Assignment</em>'.
	 * @generated
	 */
	UiBindingEndpointAssignment createUiBindingEndpointAssignment();

	/**
	 * Returns a new object of class '<em>Ui Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Binding</em>'.
	 * @generated
	 */
	UiBinding createUiBinding();

	/**
	 * Returns a new object of class '<em>Ui Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Path Segment</em>'.
	 * @generated
	 */
	UiPathSegment createUiPathSegment();

	/**
	 * Returns a new object of class '<em>Ui Nested Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Nested Property</em>'.
	 * @generated
	 */
	UiNestedProperty createUiNestedProperty();

	/**
	 * Returns a new object of class '<em>Ui Raw Bindable Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Raw Bindable Path Segment</em>'.
	 * @generated
	 */
	UiRawBindablePathSegment createUiRawBindablePathSegment();

	/**
	 * Returns a new object of class '<em>Ui Bean Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Bean Slot</em>'.
	 * @generated
	 */
	UiBeanSlot createUiBeanSlot();

	/**
	 * Returns a new object of class '<em>Ui View Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui View Set</em>'.
	 * @generated
	 */
	UiViewSet createUiViewSet();

	/**
	 * Returns a new object of class '<em>Ui Max Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Max Length Validator</em>'.
	 * @generated
	 */
	UiMaxLengthValidator createUiMaxLengthValidator();

	/**
	 * Returns a new object of class '<em>Ui Min Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Min Length Validator</em>'.
	 * @generated
	 */
	UiMinLengthValidator createUiMinLengthValidator();

	/**
	 * Returns a new object of class '<em>Ui Regexp Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Regexp Validator</em>'.
	 * @generated
	 */
	UiRegexpValidator createUiRegexpValidator();

	/**
	 * Returns a new object of class '<em>Ui Xbase Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Xbase Validator</em>'.
	 * @generated
	 */
	UiXbaseValidator createUiXbaseValidator();

	/**
	 * Returns a new object of class '<em>Ui Typed Bindable Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Typed Bindable Def</em>'.
	 * @generated
	 */
	UiTypedBindableDef createUiTypedBindableDef();

	/**
	 * Returns a new object of class '<em>Ui Typed Bindable Raw Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Typed Bindable Raw Type</em>'.
	 * @generated
	 */
	UiTypedBindableRawType createUiTypedBindableRawType();

	/**
	 * Returns a new object of class '<em>Ui Typed Bindable Raw Type Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Typed Bindable Raw Type Alias</em>'.
	 * @generated
	 */
	UiTypedBindableRawTypeAlias createUiTypedBindableRawTypeAlias();

	/**
	 * Returns a new object of class '<em>Ui Command Bindable Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Command Bindable Def</em>'.
	 * @generated
	 */
	UiCommandBindableDef createUiCommandBindableDef();

	/**
	 * Returns a new object of class '<em>Ui Grid Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Grid Layout Assigment</em>'.
	 * @generated
	 */
	UiGridLayoutAssigment createUiGridLayoutAssigment();

	/**
	 * Returns a new object of class '<em>Ui Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Grid Layout</em>'.
	 * @generated
	 */
	UiGridLayout createUiGridLayout();

	/**
	 * Returns a new object of class '<em>Ui Horizontal Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Horizontal Layout Assigment</em>'.
	 * @generated
	 */
	UiHorizontalLayoutAssigment createUiHorizontalLayoutAssigment();

	/**
	 * Returns a new object of class '<em>Ui Horizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Horizontal Layout</em>'.
	 * @generated
	 */
	UiHorizontalLayout createUiHorizontalLayout();

	/**
	 * Returns a new object of class '<em>Ui Vertical Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Vertical Layout Assigment</em>'.
	 * @generated
	 */
	UiVerticalLayoutAssigment createUiVerticalLayoutAssigment();

	/**
	 * Returns a new object of class '<em>Ui Vertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Vertical Layout</em>'.
	 * @generated
	 */
	UiVerticalLayout createUiVerticalLayout();

	/**
	 * Returns a new object of class '<em>Ui Form Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Form Layout Assigment</em>'.
	 * @generated
	 */
	UiFormLayoutAssigment createUiFormLayoutAssigment();

	/**
	 * Returns a new object of class '<em>Ui Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Form Layout</em>'.
	 * @generated
	 */
	UiFormLayout createUiFormLayout();

	/**
	 * Returns a new object of class '<em>Ui Search Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Search Panel</em>'.
	 * @generated
	 */
	UiSearchPanel createUiSearchPanel();

	/**
	 * Returns a new object of class '<em>Ui Bean Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Bean Reference Field</em>'.
	 * @generated
	 */
	UiBeanReferenceField createUiBeanReferenceField();

	/**
	 * Returns a new object of class '<em>Ui Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Text Field</em>'.
	 * @generated
	 */
	UiTextField createUiTextField();

	/**
	 * Returns a new object of class '<em>Ui Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Image</em>'.
	 * @generated
	 */
	UiImage createUiImage();

	/**
	 * Returns a new object of class '<em>Ui List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui List</em>'.
	 * @generated
	 */
	UiList createUiList();

	/**
	 * Returns a new object of class '<em>Ui Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Table</em>'.
	 * @generated
	 */
	UiTable createUiTable();

	/**
	 * Returns a new object of class '<em>Ui Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Combo Box</em>'.
	 * @generated
	 */
	UiComboBox createUiComboBox();

	/**
	 * Returns a new object of class '<em>Ui Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Column</em>'.
	 * @generated
	 */
	UiColumn createUiColumn();

	/**
	 * Returns a new object of class '<em>Ui Columns Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Columns Assignment</em>'.
	 * @generated
	 */
	UiColumnsAssignment createUiColumnsAssignment();

	/**
	 * Returns a new object of class '<em>Ui Numeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Numeric Field</em>'.
	 * @generated
	 */
	UiNumericField createUiNumericField();

	/**
	 * Returns a new object of class '<em>Ui Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Check Box</em>'.
	 * @generated
	 */
	UiCheckBox createUiCheckBox();

	/**
	 * Returns a new object of class '<em>Ui Visibility Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Processor</em>'.
	 * @generated
	 */
	UiVisibilityProcessor createUiVisibilityProcessor();

	/**
	 * Returns a new object of class '<em>Ui Visibility Processor Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Processor Def</em>'.
	 * @generated
	 */
	UiVisibilityProcessorDef createUiVisibilityProcessorDef();

	/**
	 * Returns a new object of class '<em>Ui Visibility Processor Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Processor Assignment</em>'.
	 * @generated
	 */
	UiVisibilityProcessorAssignment createUiVisibilityProcessorAssignment();

	/**
	 * Returns a new object of class '<em>Ui Change Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Change Trigger</em>'.
	 * @generated
	 */
	UiChangeTrigger createUiChangeTrigger();

	/**
	 * Returns a new object of class '<em>Ui Xbase Visibility Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Xbase Visibility Rule</em>'.
	 * @generated
	 */
	UiXbaseVisibilityRule createUiXbaseVisibilityRule();

	/**
	 * Returns a new object of class '<em>Ui Visibility Properties Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Properties Assignment</em>'.
	 * @generated
	 */
	UiVisibilityPropertiesAssignment createUiVisibilityPropertiesAssignment();

	/**
	 * Returns a new object of class '<em>Ui Visibility Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Property</em>'.
	 * @generated
	 */
	UiVisibilityProperty createUiVisibilityProperty();

	/**
	 * Returns a new object of class '<em>Ui Validator Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Validator Alias</em>'.
	 * @generated
	 */
	UiValidatorAlias createUiValidatorAlias();

	/**
	 * Returns a new object of class '<em>Ui Validator Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Validator Assignment</em>'.
	 * @generated
	 */
	UiValidatorAssignment createUiValidatorAssignment();

	/**
	 * Returns a new object of class '<em>Ui Validator Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Validator Def</em>'.
	 * @generated
	 */
	UiValidatorDef createUiValidatorDef();

	/**
	 * Returns a new object of class '<em>Ui Horizontal Button Group Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Horizontal Button Group Assigment</em>'.
	 * @generated
	 */
	UiHorizontalButtonGroupAssigment createUiHorizontalButtonGroupAssigment();

	/**
	 * Returns a new object of class '<em>Ui Horizontal Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Horizontal Button Group</em>'.
	 * @generated
	 */
	UiHorizontalButtonGroup createUiHorizontalButtonGroup();

	/**
	 * Returns a new object of class '<em>Ui Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Action</em>'.
	 * @generated
	 */
	UiAction createUiAction();

	/**
	 * Returns a new object of class '<em>Ui Mobile Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile Action</em>'.
	 * @generated
	 */
	UiMobileAction createUiMobileAction();

	/**
	 * Returns a new object of class '<em>Ui Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Button</em>'.
	 * @generated
	 */
	UiButton createUiButton();

	/**
	 * Returns a new object of class '<em>Ui Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Switch</em>'.
	 * @generated
	 */
	UiSwitch createUiSwitch();

	/**
	 * Returns a new object of class '<em>Ui Vertical Component Group Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Vertical Component Group Assigment</em>'.
	 * @generated
	 */
	UiVerticalComponentGroupAssigment createUiVerticalComponentGroupAssigment();

	/**
	 * Returns a new object of class '<em>Ui Vertical Component Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Vertical Component Group</em>'.
	 * @generated
	 */
	UiVerticalComponentGroup createUiVerticalComponentGroup();

	/**
	 * Returns a new object of class '<em>Ui Mobile Tab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile Tab Sheet</em>'.
	 * @generated
	 */
	UiMobileTabSheet createUiMobileTabSheet();

	/**
	 * Returns a new object of class '<em>Ui Mobile Tab Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile Tab Assignment</em>'.
	 * @generated
	 */
	UiMobileTabAssignment createUiMobileTabAssignment();

	/**
	 * Returns a new object of class '<em>Ui Tab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Tab Sheet</em>'.
	 * @generated
	 */
	UiTabSheet createUiTabSheet();

	/**
	 * Returns a new object of class '<em>Ui Tab Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Tab Assignment</em>'.
	 * @generated
	 */
	UiTabAssignment createUiTabAssignment();

	/**
	 * Returns a new object of class '<em>Ui Mobile Navigation Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile Navigation Page</em>'.
	 * @generated
	 */
	UiMobileNavigationPage createUiMobileNavigationPage();

	/**
	 * Returns a new object of class '<em>Ui Mobile Navigation Page Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile Navigation Page Assignment</em>'.
	 * @generated
	 */
	UiMobileNavigationPageAssignment createUiMobileNavigationPageAssignment();

	/**
	 * Returns a new object of class '<em>Ui Mobile Navigation Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile Navigation Button</em>'.
	 * @generated
	 */
	UiMobileNavigationButton createUiMobileNavigationButton();

	/**
	 * Returns a new object of class '<em>Ui Mobile Navigation Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Mobile Navigation Command</em>'.
	 * @generated
	 */
	UiMobileNavigationCommand createUiMobileNavigationCommand();

	/**
	 * Returns a new object of class '<em>Ui Open Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Open Dialog Command</em>'.
	 * @generated
	 */
	UiOpenDialogCommand createUiOpenDialogCommand();

	/**
	 * Returns a new object of class '<em>Ui Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Search Field</em>'.
	 * @generated
	 */
	UiSearchField createUiSearchField();

	/**
	 * Returns a new object of class '<em>Ui Search Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Search Dialog</em>'.
	 * @generated
	 */
	UiSearchDialog createUiSearchDialog();

	/**
	 * Returns a new object of class '<em>Ui Dialog Search Field Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Dialog Search Field Assignment</em>'.
	 * @generated
	 */
	UiDialogSearchFieldAssignment createUiDialogSearchFieldAssignment();

	/**
	 * Returns a new object of class '<em>Ui Search With Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Search With Dialog Command</em>'.
	 * @generated
	 */
	UiSearchWithDialogCommand createUiSearchWithDialogCommand();

	/**
	 * Returns a new object of class '<em>Ui Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Label</em>'.
	 * @generated
	 */
	UiLabel createUiLabel();

	/**
	 * Returns a new object of class '<em>Ui Decimal Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Decimal Field</em>'.
	 * @generated
	 */
	UiDecimalField createUiDecimalField();

	/**
	 * Returns a new object of class '<em>Ui Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Text Area</em>'.
	 * @generated
	 */
	UiTextArea createUiTextArea();

	/**
	 * Returns a new object of class '<em>Ui Options Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Options Group</em>'.
	 * @generated
	 */
	UiOptionsGroup createUiOptionsGroup();

	/**
	 * Returns a new object of class '<em>Ui Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Date Field</em>'.
	 * @generated
	 */
	UiDateField createUiDateField();

	/**
	 * Returns a new object of class '<em>Ui Browser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Browser</em>'.
	 * @generated
	 */
	UiBrowser createUiBrowser();

	/**
	 * Returns a new object of class '<em>Ui Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Progress Bar</em>'.
	 * @generated
	 */
	UiProgressBar createUiProgressBar();

	/**
	 * Returns a new object of class '<em>Ui I1 8n Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui I1 8n Info</em>'.
	 * @generated
	 */
	UiI18nInfo createUiI18nInfo();

	/**
	 * Returns a new object of class '<em>Ui Splitpanel Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Splitpanel Assigment</em>'.
	 * @generated
	 */
	UiSplitpanelAssigment createUiSplitpanelAssigment();

	/**
	 * Returns a new object of class '<em>Ui Splitpanel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Splitpanel</em>'.
	 * @generated
	 */
	UiSplitpanel createUiSplitpanel();

	/**
	 * Returns a new object of class '<em>Ui Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Panel</em>'.
	 * @generated
	 */
	UiPanel createUiPanel();

	/**
	 * Returns a new object of class '<em>Ui Error Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Error Code</em>'.
	 * @generated
	 */
	UiErrorCode createUiErrorCode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiModelPackage getUiModelPackage();

} //UiModelFactory
