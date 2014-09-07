/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiPanel#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiPanel#getContentAlignment <em>Content Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiPanel()
 * @model
 * @generated
 */
public interface UiPanel extends UiLayout {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(UiEmbeddable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiPanel_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiEmbeddable getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiPanel#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(UiEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Content Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.semantic.uimodel.UiAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAlignment
	 * @see #setContentAlignment(UiAlignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiPanel_ContentAlignment()
	 * @model
	 * @generated
	 */
	UiAlignment getContentAlignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiPanel#getContentAlignment <em>Content Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAlignment
	 * @see #getContentAlignment()
	 * @generated
	 */
	void setContentAlignment(UiAlignment value);

} // UiPanel
