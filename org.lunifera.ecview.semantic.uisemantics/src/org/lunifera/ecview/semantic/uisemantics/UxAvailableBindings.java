/**
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Available Bindings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAvailableBindings()
 * @model
 * @generated
 */
public interface UxAvailableBindings extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uisemantics.UxBindingableOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAvailableBindings_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<UxBindingableOption> getBindings();

} // UxAvailableBindings
