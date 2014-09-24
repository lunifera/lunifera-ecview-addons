/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTextField#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTextField#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTextField#getRegex <em>Regex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTextField()
 * @model
 * @generated
 */
public interface UiTextField extends UiField, UiMobileField {

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTextField_MaxLength()
	 * @model default="-1"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTextField#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTextField_MinLength()
	 * @model default="-1"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTextField#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTextField_Regex()
	 * @model
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTextField#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);
} // UiTextField
