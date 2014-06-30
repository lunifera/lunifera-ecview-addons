/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GText Binding Defs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.GTextBindingDefs#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGTextBindingDefs()
 * @model
 * @generated
 */
public interface GTextBindingDefs extends EObject
{
  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.ecview.dsl.uIGrammar.GTextBindingDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGTextBindingDefs_Methods()
   * @model containment="true"
   * @generated
   */
  EList<GTextBindingDef> getMethods();

} // GTextBindingDefs
