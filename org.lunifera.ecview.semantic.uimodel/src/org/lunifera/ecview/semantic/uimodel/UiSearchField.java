/**
 */
package org.lunifera.ecview.semantic.uimodel;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Search Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSearchField#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSearchField()
 * @model
 * @generated
 */
public interface UiSearchField extends UiField, UiMobileField {

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(UiNestedProperty)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSearchField_Property()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiNestedProperty getProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSearchField#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(UiNestedProperty value);
} // UiSearchField
