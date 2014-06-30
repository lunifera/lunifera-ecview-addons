/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GGrid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayout#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGGridLayout()
 * @model
 * @generated
 */
public interface GGridLayout extends YGridLayout
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGGridLayout_Contents()
   * @model containment="true"
   * @generated
   */
  EList<GGridLayoutAssigment> getContents();

} // GGridLayout
