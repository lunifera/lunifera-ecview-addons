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
	 * Returns a new object of class '<em>Ui IDE View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui IDE View</em>'.
	 * @generated
	 */
	UiIDEView createUiIDEView();

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
	 * Returns a new object of class '<em>Ui Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Text Field</em>'.
	 * @generated
	 */
	UiTextField createUiTextField();

	/**
	 * Returns a new object of class '<em>Ui List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui List</em>'.
	 * @generated
	 */
	UiList createUiList();

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
	 * Returns a new object of class '<em>Ui Visibility Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Properties</em>'.
	 * @generated
	 */
	UiVisibilityProperties createUiVisibilityProperties();

	/**
	 * Returns a new object of class '<em>Ui Visibility Properties Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Properties Def</em>'.
	 * @generated
	 */
	UiVisibilityPropertiesDef createUiVisibilityPropertiesDef();

	/**
	 * Returns a new object of class '<em>Ui Visibility Properties Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Visibility Properties Assignment</em>'.
	 * @generated
	 */
	UiVisibilityPropertiesAssignment createUiVisibilityPropertiesAssignment();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiModelPackage getUiModelPackage();

} //UiModelFactory
