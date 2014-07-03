/**
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Element URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEClass <em>EClass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxElementURI()
 * @model
 * @generated
 */
public interface UxElementURI extends EObject {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(UxEPackageImport)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxElementURI_EPackage()
	 * @model
	 * @generated
	 */
	UxEPackageImport getEPackage();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(UxEPackageImport value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxElementURI_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

} // UxElementURI
