/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBeanSlots <em>Bean Slots</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext()
 * @model
 * @generated
 */
public interface UiContext extends UiRootElements {
	/**
	 * Returns the value of the '<em><b>Bean Slots</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Slots</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext_BeanSlots()
	 * @model containment="true"
	 * @generated
	 */
	EList<UiBeanSlot> getBeanSlots();

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext_BindingEndpointAlias()
	 * @model containment="true"
	 * @generated
	 */
	EList<UiBindingEndpointAlias> getBindingEndpointAlias();

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<UiBinding> getBindings();

} // UiContext
