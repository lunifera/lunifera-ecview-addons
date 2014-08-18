/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Command Bindable Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiCommandBindableDef()
 * @model
 * @generated
 */
public interface UiCommandBindableDef extends UiTypedBindable, UiBindingExpression {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(UiCommand)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiCommandBindableDef_Command()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiCommand getCommand();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(UiCommand value);

} // UiCommandBindableDef
