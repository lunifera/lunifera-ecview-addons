/**
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Available Visibility Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAvailableVisibilityOptions()
 * @model
 * @generated
 */
public interface UxAvailableVisibilityOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uisemantics.UxVisibilityOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAvailableVisibilityOptions_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<UxVisibilityOption> getOptions();

} // UxAvailableVisibilityOptions
