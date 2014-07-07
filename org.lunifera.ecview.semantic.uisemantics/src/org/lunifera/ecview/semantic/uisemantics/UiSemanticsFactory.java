/**
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage
 * @generated
 */
public interface UiSemanticsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiSemanticsFactory eINSTANCE = org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ux Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Model</em>'.
	 * @generated
	 */
	UxModel createUxModel();

	/**
	 * Returns a new object of class '<em>XImport Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XImport Declaration</em>'.
	 * @generated
	 */
	XImportDeclaration createXImportDeclaration();

	/**
	 * Returns a new object of class '<em>Ux EPackage Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux EPackage Import</em>'.
	 * @generated
	 */
	UxEPackageImport createUxEPackageImport();

	/**
	 * Returns a new object of class '<em>Ux Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Element Definition</em>'.
	 * @generated
	 */
	UxElementDefinition createUxElementDefinition();

	/**
	 * Returns a new object of class '<em>Ux Element URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Element URI</em>'.
	 * @generated
	 */
	UxElementURI createUxElementURI();

	/**
	 * Returns a new object of class '<em>Ux Available Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Available Bindings</em>'.
	 * @generated
	 */
	UxAvailableBindings createUxAvailableBindings();

	/**
	 * Returns a new object of class '<em>Ux Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Endpoint Def</em>'.
	 * @generated
	 */
	UxEndpointDef createUxEndpointDef();

	/**
	 * Returns a new object of class '<em>Ux Value Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Value Binding Endpoint Def</em>'.
	 * @generated
	 */
	UxValueBindingEndpointDef createUxValueBindingEndpointDef();

	/**
	 * Returns a new object of class '<em>Ux List Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux List Binding Endpoint Def</em>'.
	 * @generated
	 */
	UxListBindingEndpointDef createUxListBindingEndpointDef();

	/**
	 * Returns a new object of class '<em>Ux Set Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Set Binding Endpoint Def</em>'.
	 * @generated
	 */
	UxSetBindingEndpointDef createUxSetBindingEndpointDef();

	/**
	 * Returns a new object of class '<em>Ux Available Visibility Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Available Visibility Options</em>'.
	 * @generated
	 */
	UxAvailableVisibilityOptions createUxAvailableVisibilityOptions();

	/**
	 * Returns a new object of class '<em>Ux Visibility Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ux Visibility Option</em>'.
	 * @generated
	 */
	UxVisibilityOption createUxVisibilityOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiSemanticsPackage getUiSemanticsPackage();

} //UiSemanticsFactory
