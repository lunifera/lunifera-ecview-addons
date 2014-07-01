/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getSINGLE <em>SINGLE</em>}</li>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getMULTI <em>MULTI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>SINGLE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SINGLE</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SINGLE</em>' attribute.
   * @see #setSINGLE(String)
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getMultiplicity_SINGLE()
   * @model
   * @generated
   */
  String getSINGLE();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getSINGLE <em>SINGLE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SINGLE</em>' attribute.
   * @see #getSINGLE()
   * @generated
   */
  void setSINGLE(String value);

  /**
   * Returns the value of the '<em><b>MULTI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MULTI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MULTI</em>' attribute.
   * @see #setMULTI(String)
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getMultiplicity_MULTI()
   * @model
   * @generated
   */
  String getMULTI();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getMULTI <em>MULTI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MULTI</em>' attribute.
   * @see #getMULTI()
   * @generated
   */
  void setMULTI(String value);

} // Multiplicity
