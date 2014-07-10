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
	 * Returns a new object of class '<em>Ui Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Binding Endpoint Def</em>'.
	 * @generated
	 */
	UiBindingEndpointDef createUiBindingEndpointDef();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UimodelPackage getUimodelPackage();

} //UimodelFactory
