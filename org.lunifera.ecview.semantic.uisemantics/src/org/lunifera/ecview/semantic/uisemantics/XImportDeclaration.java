/**
 */
package org.lunifera.ecview.semantic.uisemantics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XImport Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.XImportDeclaration#getImportedEPackage <em>Imported EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getXImportDeclaration()
 * @model
 * @generated
 */
public interface XImportDeclaration extends org.eclipse.xtext.xtype.XImportDeclaration {
	/**
	 * Returns the value of the '<em><b>Imported EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported EPackage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported EPackage</em>' containment reference.
	 * @see #setImportedEPackage(UxEPackageImport)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getXImportDeclaration_ImportedEPackage()
	 * @model containment="true"
	 * @generated
	 */
	UxEPackageImport getImportedEPackage();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.XImportDeclaration#getImportedEPackage <em>Imported EPackage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported EPackage</em>' containment reference.
	 * @see #getImportedEPackage()
	 * @generated
	 */
	void setImportedEPackage(UxEPackageImport value);

} // XImportDeclaration
