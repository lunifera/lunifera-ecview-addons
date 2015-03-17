/**
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getElementDefinitions <em>Element Definitions</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getViewActions <em>View Actions</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxModel()
 * @model
 * @generated
 */
public interface UxModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Section</em>' containment reference.
	 * @see #setImportSection(XImportSection)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxModel_ImportSection()
	 * @model containment="true"
	 * @generated
	 */
	XImportSection getImportSection();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getImportSection <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Section</em>' containment reference.
	 * @see #getImportSection()
	 * @generated
	 */
	void setImportSection(XImportSection value);

	/**
	 * Returns the value of the '<em><b>Element Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Definitions</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxModel_ElementDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UxElementDefinition> getElementDefinitions();

	/**
	 * Returns the value of the '<em><b>View Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uisemantics.UxAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Actions</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxModel_ViewActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UxAction> getViewActions();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uisemantics.UxViewCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxModel_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<UxViewCategory> getCategories();

} // UxModel
