/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage
 * @generated
 */
public interface UimodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimodelFactory eINSTANCE = org.lunifera.ecview.semantic.uimodel.impl.UimodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ui Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Model</em>'.
	 * @generated
	 */
	UiModel createUiModel();

	/**
	 * Returns a new object of class '<em>Ui IDE View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui IDE View</em>'.
	 * @generated
	 */
	UiIDEView createUiIDEView();

	/**
	 * Returns a new object of class '<em>Ui Grid Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Grid Layout Assigment</em>'.
	 * @generated
	 */
	UiGridLayoutAssigment createUiGridLayoutAssigment();

	/**
	 * Returns a new object of class '<em>Ui Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Point</em>'.
	 * @generated
	 */
	UiPoint createUiPoint();

	/**
	 * Returns a new object of class '<em>Ui Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Binding</em>'.
	 * @generated
	 */
	UiBinding createUiBinding();

	/**
	 * Returns a new object of class '<em>Ui Source Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Source Binding Endpoint</em>'.
	 * @generated
	 */
	UiSourceBindingEndpoint createUiSourceBindingEndpoint();

	/**
	 * Returns a new object of class '<em>Ui Target Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Target Binding Endpoint</em>'.
	 * @generated
	 */
	UiTargetBindingEndpoint createUiTargetBindingEndpoint();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UimodelPackage getUimodelPackage();

} //UimodelFactory
