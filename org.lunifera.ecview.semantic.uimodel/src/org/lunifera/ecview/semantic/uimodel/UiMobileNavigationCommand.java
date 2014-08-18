/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Mobile Navigation Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand#getTargetPageAlias <em>Target Page Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationCommand()
 * @model
 * @generated
 */
public interface UiMobileNavigationCommand extends UiCommand {
	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' containment reference.
	 * @see #setTargetPage(UiMobileNavigationPage)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationCommand_TargetPage()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiMobileNavigationPage getTargetPage();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand#getTargetPage <em>Target Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page</em>' containment reference.
	 * @see #getTargetPage()
	 * @generated
	 */
	void setTargetPage(UiMobileNavigationPage value);

	/**
	 * Returns the value of the '<em><b>Target Page Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Page Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page Alias</em>' reference.
	 * @see #setTargetPageAlias(UiMobileNavigationPage)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationCommand_TargetPageAlias()
	 * @model
	 * @generated
	 */
	UiMobileNavigationPage getTargetPageAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand#getTargetPageAlias <em>Target Page Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page Alias</em>' reference.
	 * @see #getTargetPageAlias()
	 * @generated
	 */
	void setTargetPageAlias(UiMobileNavigationPage value);

} // UiMobileNavigationCommand
