/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor;

import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getBindingAlias <em>Binding Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getChangeTrigger <em>Change Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiVisibilityProcessor()
 * @model
 * @generated
 */
public interface UiVisibilityProcessor extends YRuledVisibilityProcessor, UiRootElements, UiModelElement {
	/**
	 * Returns the value of the '<em><b>Binding Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Alias</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiVisibilityProcessor_BindingAlias()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBindingEndpointAlias> getBindingAlias();

	/**
	 * Returns the value of the '<em><b>Change Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Trigger</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiVisibilityProcessor_ChangeTrigger()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiChangeTrigger> getChangeTrigger();

} // UiVisibilityProcessor
