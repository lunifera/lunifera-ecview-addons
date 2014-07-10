/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui IDE View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiIDEView#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiIDEView#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiIDEView()
 * @model
 * @generated
 */
public interface UiIDEView extends UiView, UiModelElement {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiIDEView_Bindings()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Endpoint Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Endpoint Alias</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiIDEView_BindingEndpointAlias()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBindingEndpointAlias> getBindingEndpointAlias();

} // UiIDEView
