/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui View Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiViewSet#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiViewSet()
 * @model
 * @generated
 */
public interface UiViewSet extends YViewSet {
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
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiViewSet_BindingEndpointAlias()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBindingEndpointAlias> getBindingEndpointAlias();

} // UiViewSet
