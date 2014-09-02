/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Horizontal Layout Assigment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment#getElement <em>Element</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalLayoutAssigment()
 * @model
 * @generated
 */
public interface UiHorizontalLayoutAssigment extends UiLayoutAssignment {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(UiEmbeddable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalLayoutAssigment_Element()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiEmbeddable getElement();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(UiEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.semantic.uimodel.UiAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAlignment
	 * @see #setAlignment(UiAlignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalLayoutAssigment_Alignment()
	 * @model
	 * @generated
	 */
	UiAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(UiAlignment value);

} // UiHorizontalLayoutAssigment
