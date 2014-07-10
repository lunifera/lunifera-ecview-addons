/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Change Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpointAlias <em>Endpoint Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiChangeTrigger()
 * @model
 * @generated
 */
public interface UiChangeTrigger extends UiModelElement {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(UiBindingEndpointDef)
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiChangeTrigger_Endpoint()
	 * @model containment="true"
	 * @generated
	 */
	UiBindingEndpointDef getEndpoint();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(UiBindingEndpointDef value);

	/**
	 * Returns the value of the '<em><b>Endpoint Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Alias</em>' reference.
	 * @see #setEndpointAlias(UiBindingEndpointAlias)
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiChangeTrigger_EndpointAlias()
	 * @model
	 * @generated
	 */
	UiBindingEndpointAlias getEndpointAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpointAlias <em>Endpoint Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Alias</em>' reference.
	 * @see #getEndpointAlias()
	 * @generated
	 */
	void setEndpointAlias(UiBindingEndpointAlias value);

} // UiChangeTrigger
