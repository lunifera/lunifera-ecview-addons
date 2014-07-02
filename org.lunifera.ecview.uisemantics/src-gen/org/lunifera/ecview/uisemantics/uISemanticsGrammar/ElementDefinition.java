/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getBindingContainer <em>Binding Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getElementDefinition()
 * @model
 * @generated
 */
public interface ElementDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(EClass)
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getElementDefinition_Name()
   * @model
   * @generated
   */
  EClass getName();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(EClass value);

  /**
   * Returns the value of the '<em><b>Ns URI</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns URI</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns URI</em>' reference.
   * @see #setNsURI(EPackage)
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getElementDefinition_NsURI()
   * @model
   * @generated
   */
  EPackage getNsURI();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getNsURI <em>Ns URI</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns URI</em>' reference.
   * @see #getNsURI()
   * @generated
   */
  void setNsURI(EPackage value);

  /**
   * Returns the value of the '<em><b>Binding Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binding Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding Container</em>' containment reference.
   * @see #setBindingContainer(AvailableBindings)
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getElementDefinition_BindingContainer()
   * @model containment="true"
   * @generated
   */
  AvailableBindings getBindingContainer();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getBindingContainer <em>Binding Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding Container</em>' containment reference.
   * @see #getBindingContainer()
   * @generated
   */
  void setBindingContainer(AvailableBindings value);

} // ElementDefinition
