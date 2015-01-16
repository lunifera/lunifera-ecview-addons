/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Remove From Table Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRemoveFromTableCommand#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRemoveFromTableCommand()
 * @model
 * @generated
 */
public interface UiRemoveFromTableCommand extends UiCommand {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(UiTable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRemoveFromTableCommand_Table()
	 * @model
	 * @generated
	 */
	UiTable getTable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRemoveFromTableCommand#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(UiTable value);

} // UiRemoveFromTableCommand
