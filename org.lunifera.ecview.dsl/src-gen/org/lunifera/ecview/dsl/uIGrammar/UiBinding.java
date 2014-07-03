/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#getSource <em>Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#isTargetToSource <em>Target To Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#isSourceToTarget <em>Source To Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiBinding()
 * @model
 * @generated
 */
public interface UiBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(UiSourceBindingEndpoint)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiBinding_Source()
   * @model containment="true"
   * @generated
   */
  UiSourceBindingEndpoint getSource();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(UiSourceBindingEndpoint value);

  /**
   * Returns the value of the '<em><b>Target To Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target To Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target To Source</em>' attribute.
   * @see #setTargetToSource(boolean)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiBinding_TargetToSource()
   * @model
   * @generated
   */
  boolean isTargetToSource();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#isTargetToSource <em>Target To Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target To Source</em>' attribute.
   * @see #isTargetToSource()
   * @generated
   */
  void setTargetToSource(boolean value);

  /**
   * Returns the value of the '<em><b>Source To Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source To Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source To Target</em>' attribute.
   * @see #setSourceToTarget(boolean)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiBinding_SourceToTarget()
   * @model
   * @generated
   */
  boolean isSourceToTarget();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#isSourceToTarget <em>Source To Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source To Target</em>' attribute.
   * @see #isSourceToTarget()
   * @generated
   */
  void setSourceToTarget(boolean value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(UiTargetBindingEndpoint)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiBinding_Target()
   * @model containment="true"
   * @generated
   */
  UiTargetBindingEndpoint getTarget();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(UiTargetBindingEndpoint value);

} // UiBinding
