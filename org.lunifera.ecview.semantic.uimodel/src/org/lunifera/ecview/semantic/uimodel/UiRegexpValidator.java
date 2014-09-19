/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Regexp Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRegexpValidator#getRegExpression <em>Reg Expression</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRegexpValidator#getErrorCode <em>Error Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRegexpValidator()
 * @model
 * @generated
 */
public interface UiRegexpValidator extends UiValidator {

	/**
	 * Returns the value of the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Expression</em>' attribute.
	 * @see #setRegExpression(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRegexpValidator_RegExpression()
	 * @model
	 * @generated
	 */
	String getRegExpression();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRegexpValidator#getRegExpression <em>Reg Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Expression</em>' attribute.
	 * @see #getRegExpression()
	 * @generated
	 */
	void setRegExpression(String value);

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRegexpValidator_ErrorCode()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiErrorCode getErrorCode();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRegexpValidator#getErrorCode <em>Error Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' containment reference.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(UiErrorCode value);
} // UiRegexpValidator
