/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage
 * @generated
 */
public interface UiextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiextensionFactory eINSTANCE = org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionFactoryImpl.init();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiextensionPackage getUiextensionPackage();

} //UiextensionFactory
