/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Search With Dialog Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand#getDialog <em>Dialog</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSearchWithDialogCommand()
 * @model
 * @generated
 */
public interface UiSearchWithDialogCommand extends UiCommand {
	/**
	 * Returns the value of the '<em><b>Dialog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialog</em>' containment reference.
	 * @see #setDialog(UiSearchDialog)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSearchWithDialogCommand_Dialog()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiSearchDialog getDialog();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand#getDialog <em>Dialog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog</em>' containment reference.
	 * @see #getDialog()
	 * @generated
	 */
	void setDialog(UiSearchDialog value);

} // UiSearchWithDialogCommand
