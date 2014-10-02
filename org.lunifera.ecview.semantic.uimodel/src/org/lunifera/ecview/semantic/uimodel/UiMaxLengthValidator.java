/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Max Length Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMaxLengthValidator()
 * @model
 * @generated
 */
public interface UiMaxLengthValidator extends UiValidator {

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMaxLengthValidator_MaxLength()
	 * @model
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' containment reference.
	 * @see #setErrorCode(UiErrorCode)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMaxLengthValidator_ErrorCode()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiErrorCode getErrorCode();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator#getErrorCode <em>Error Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' containment reference.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(UiErrorCode value);
} // UiMaxLengthValidator
