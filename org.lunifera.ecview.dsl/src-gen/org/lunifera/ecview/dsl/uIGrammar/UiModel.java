/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiModel#getViewSet <em>View Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiModel()
 * @model
 * @generated
 */
public interface UiModel extends EObject
{
  /**
   * Returns the value of the '<em><b>View Set</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.core.YViewSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Set</em>' containment reference list.
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiModel_ViewSet()
   * @model containment="true"
   * @generated
   */
  EList<YViewSet> getViewSet();

} // UiModel
