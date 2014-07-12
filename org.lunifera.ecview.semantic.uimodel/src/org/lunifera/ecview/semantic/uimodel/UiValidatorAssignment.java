/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Validator Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getField <em>Field</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorDef <em>Validator Def</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorAlias <em>Validator Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiValidatorAssignment()
 * @model
 * @generated
 */
public interface UiValidatorAssignment extends UiNamedElement {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(UiField)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiValidatorAssignment_Field()
	 * @model required="true"
	 * @generated
	 */
	UiField getField();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(UiField value);

	/**
	 * Returns the value of the '<em><b>Validator Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Def</em>' containment reference.
	 * @see #setValidatorDef(UiValidatorDef)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiValidatorAssignment_ValidatorDef()
	 * @model containment="true"
	 * @generated
	 */
	UiValidatorDef getValidatorDef();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorDef <em>Validator Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Def</em>' containment reference.
	 * @see #getValidatorDef()
	 * @generated
	 */
	void setValidatorDef(UiValidatorDef value);

	/**
	 * Returns the value of the '<em><b>Validator Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Alias</em>' reference.
	 * @see #setValidatorAlias(UiValidatorAlias)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiValidatorAssignment_ValidatorAlias()
	 * @model
	 * @generated
	 */
	UiValidatorAlias getValidatorAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorAlias <em>Validator Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Alias</em>' reference.
	 * @see #getValidatorAlias()
	 * @generated
	 */
	void setValidatorAlias(UiValidatorAlias value);

} // UiValidatorAssignment
