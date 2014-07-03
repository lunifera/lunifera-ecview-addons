/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;

import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxEndpointDefCommon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Source Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiSourceBindingEndpoint()
 * @model
 * @generated
 */
public interface UiSourceBindingEndpoint extends EObject
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
   * @see #setEmbeddable(YBindable)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiSourceBindingEndpoint_Embeddable()
   * @model
   * @generated
   */
  YBindable getEmbeddable();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEmbeddable <em>Embeddable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Embeddable</em>' reference.
   * @see #getEmbeddable()
   * @generated
   */
  void setEmbeddable(YBindable value);

  /**
   * Returns the value of the '<em><b>Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endpoint</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endpoint</em>' reference.
   * @see #setEndpoint(UxEndpointDefCommon)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiSourceBindingEndpoint_Endpoint()
   * @model
   * @generated
   */
  UxEndpointDefCommon getEndpoint();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEndpoint <em>Endpoint</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endpoint</em>' reference.
   * @see #getEndpoint()
   * @generated
   */
  void setEndpoint(UxEndpointDefCommon value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(UiPathSegment)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getUiSourceBindingEndpoint_Path()
   * @model containment="true"
   * @generated
   */
  UiPathSegment getPath();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(UiPathSegment value);

} // UiSourceBindingEndpoint
