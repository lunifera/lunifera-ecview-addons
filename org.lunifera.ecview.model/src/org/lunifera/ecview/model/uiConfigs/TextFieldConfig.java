/**
 */
package org.lunifera.ecview.model.uiConfigs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.model.uiConfigs.TextFieldConfig#getBindingMethods <em>Binding Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.model.uiConfigs.UiConfigsPackage#getTextFieldConfig()
 * @model
 * @generated
 */
public interface TextFieldConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.model.uiConfigs.BindingMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Methods</em>' containment reference list.
	 * @see org.lunifera.ecview.model.uiConfigs.UiConfigsPackage#getTextFieldConfig_BindingMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingMethod> getBindingMethods();

} // TextFieldConfig
