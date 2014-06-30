/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GBean Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.GBeanSlot#getJvmType <em>Jvm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGBeanSlot()
 * @model
 * @generated
 */
public interface GBeanSlot extends YBeanSlot
{
  /**
   * Returns the value of the '<em><b>Jvm Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jvm Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jvm Type</em>' containment reference.
   * @see #setJvmType(JvmTypeReference)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGBeanSlot_JvmType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getJvmType();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.GBeanSlot#getJvmType <em>Jvm Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jvm Type</em>' containment reference.
   * @see #getJvmType()
   * @generated
   */
  void setJvmType(JvmTypeReference value);

} // GBeanSlot