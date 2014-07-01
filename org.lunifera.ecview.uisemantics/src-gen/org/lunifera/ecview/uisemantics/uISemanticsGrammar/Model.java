/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Model#getElementDefinitions <em>Element Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Element Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Definitions</em>' containment reference list.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage#getModel_ElementDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<ElementDefinition> getElementDefinitions();

} // Model
