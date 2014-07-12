/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Binding Endpoint Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getBindable <em>Bindable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getSemanticEndpoint <em>Semantic Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBindingEndpointDef()
 * @model
 * @generated
 */
public interface UiBindingEndpointDef extends UiModelElement {
	/**
	 * Returns the value of the '<em><b>Bindable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindable</em>' reference.
	 * @see #setBindable(UiBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBindingEndpointDef_Bindable()
	 * @model
	 * @generated
	 */
	UiBindable getBindable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getBindable <em>Bindable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindable</em>' reference.
	 * @see #getBindable()
	 * @generated
	 */
	void setBindable(UiBindable value);

	/**
	 * Returns the value of the '<em><b>Semantic Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Endpoint</em>' reference.
	 * @see #setSemanticEndpoint(UxEndpointDef)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBindingEndpointDef_SemanticEndpoint()
	 * @model
	 * @generated
	 */
	UxEndpointDef getSemanticEndpoint();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getSemanticEndpoint <em>Semantic Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Endpoint</em>' reference.
	 * @see #getSemanticEndpoint()
	 * @generated
	 */
	void setSemanticEndpoint(UxEndpointDef value);

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
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBindingEndpointDef_Path()
	 * @model containment="true"
	 * @generated
	 */
	UiPathSegment getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(UiPathSegment value);

} // UiBindingEndpointDef
