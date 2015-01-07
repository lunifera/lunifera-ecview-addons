/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.lunifera.ecview.semantic.uisemantics.UxAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Exposed Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiExposedAction#getActionReference <em>Action Reference</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiExposedAction#getActionID <em>Action ID</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiExposedAction#getIconName <em>Icon Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiExposedAction()
 * @model
 * @generated
 */
public interface UiExposedAction extends UiNamedElement {
	/**
	 * Returns the value of the '<em><b>Action Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Reference</em>' reference.
	 * @see #setActionReference(UxAction)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiExposedAction_ActionReference()
	 * @model
	 * @generated
	 */
	UxAction getActionReference();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiExposedAction#getActionReference <em>Action Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Reference</em>' reference.
	 * @see #getActionReference()
	 * @generated
	 */
	void setActionReference(UxAction value);

	/**
	 * Returns the value of the '<em><b>Action ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action ID</em>' attribute.
	 * @see #setActionID(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiExposedAction_ActionID()
	 * @model
	 * @generated
	 */
	String getActionID();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiExposedAction#getActionID <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action ID</em>' attribute.
	 * @see #getActionID()
	 * @generated
	 */
	void setActionID(String value);

	/**
	 * Returns the value of the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Name</em>' attribute.
	 * @see #setIconName(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiExposedAction_IconName()
	 * @model
	 * @generated
	 */
	String getIconName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiExposedAction#getIconName <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Name</em>' attribute.
	 * @see #getIconName()
	 * @generated
	 */
	void setIconName(String value);

} // UiExposedAction
