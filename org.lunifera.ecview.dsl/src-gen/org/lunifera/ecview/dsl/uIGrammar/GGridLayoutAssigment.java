/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;

import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GGrid Layout Assigment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getElement <em>Element</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getFrom <em>From</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGGridLayoutAssigment()
 * @model
 * @generated
 */
public interface GGridLayoutAssigment extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(YEmbeddable)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGGridLayoutAssigment_Element()
   * @model containment="true"
   * @generated
   */
  YEmbeddable getElement();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(YEmbeddable value);

  /**
   * Returns the value of the '<em><b>Alignment</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alignment</em>' attribute.
   * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
   * @see #setAlignment(YAlignment)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGGridLayoutAssigment_Alignment()
   * @model
   * @generated
   */
  YAlignment getAlignment();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getAlignment <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alignment</em>' attribute.
   * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
   * @see #getAlignment()
   * @generated
   */
  void setAlignment(YAlignment value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Point)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGGridLayoutAssigment_From()
   * @model containment="true"
   * @generated
   */
  Point getFrom();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Point value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Point)
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#getGGridLayoutAssigment_To()
   * @model containment="true"
   * @generated
   */
  Point getTo();

  /**
   * Sets the value of the '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Point value);

} // GGridLayoutAssigment
