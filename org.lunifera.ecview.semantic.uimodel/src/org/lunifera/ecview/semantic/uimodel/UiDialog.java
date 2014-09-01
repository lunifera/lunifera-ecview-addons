/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDialog#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDialog()
 * @model
 * @generated
 */
public interface UiDialog extends UiEmbeddable, UiTypeProvider, UiI18nInfoable {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(UiDialogAssignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDialog_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiDialogAssignment getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDialog#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(UiDialogAssignment value);

} // UiDialog
