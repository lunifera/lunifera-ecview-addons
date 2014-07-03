/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;

import org.lunifera.ecview.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Source Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiSourceBindingEndpoint()
 * @model
 * @generated
 */
public interface UiSourceBindingEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Embeddable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embeddable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embeddable</em>' reference.
	 * @see #setEmbeddable(YBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiSourceBindingEndpoint_Embeddable()
	 * @model
	 * @generated
	 */
	YBindable getEmbeddable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEmbeddable <em>Embeddable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embeddable</em>' reference.
	 * @see #getEmbeddable()
	 * @generated
	 */
	void setEmbeddable(YBindable value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' reference.
	 * @see #setEndpoint(UxEndpointDef)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiSourceBindingEndpoint_Endpoint()
	 * @model
	 * @generated
	 */
	UxEndpointDef getEndpoint();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEndpoint <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(UxEndpointDef value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(UiPathSegment)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiSourceBindingEndpoint_Path()
	 * @model containment="true"
	 * @generated
	 */
	UiPathSegment getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(UiPathSegment value);

} // UiSourceBindingEndpoint
