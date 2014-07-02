/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.Binding#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.Binding#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject
{
  /**
   * Returns the value of the '<em><b>Embeddable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embeddable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embeddable</em>' reference.
   * @see #setEmbeddable(YEmbeddable)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getBinding_Embeddable()
   * @model
   * @generated
   */
  YEmbeddable getEmbeddable();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.Binding#getEmbeddable <em>Embeddable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Embeddable</em>' reference.
   * @see #getEmbeddable()
   * @generated
   */
  void setEmbeddable(YEmbeddable value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getBinding_Method()
   * @model
   * @generated
   */
  org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding getMethod();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.Binding#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding value);

} // Binding
