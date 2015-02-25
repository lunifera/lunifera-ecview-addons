/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Mobile Navigation Root Assigment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRootAssigment#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationRootAssigment()
 * @model
 * @generated
 */
public interface UiMobileNavigationRootAssigment extends UiLayoutAssignment {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(UiMobileEmbeddable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationRootAssigment_Element()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiMobileEmbeddable getElement();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRootAssigment#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(UiMobileEmbeddable value);

} // UiMobileNavigationRootAssigment
