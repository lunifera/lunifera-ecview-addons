/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDE View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.IDEView#getActions <em>Actions</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.IDEView#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.IDEView#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getIDEView()
 * @model
 * @generated
 */
public interface IDEView extends YView
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.ecview.dsl.uIGrammar.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getIDEView_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Layouts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.core.YLayout}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layouts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layouts</em>' containment reference list.
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getIDEView_Layouts()
   * @model containment="true"
   * @generated
   */
  EList<YLayout> getLayouts();

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.ecview.dsl.uIGrammar.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getIDEView_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBindings();

} // IDEView
