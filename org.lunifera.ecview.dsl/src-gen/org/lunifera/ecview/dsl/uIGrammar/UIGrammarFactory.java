/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage
 * @generated
 */
public interface UIGrammarFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UIGrammarFactory eINSTANCE = org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ui Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ui Model</em>'.
   * @generated
   */
  UiModel createUiModel();

  /**
   * Returns a new object of class '<em>GBean Slot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GBean Slot</em>'.
   * @generated
   */
  GBeanSlot createGBeanSlot();

  /**
   * Returns a new object of class '<em>IDE View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IDE View</em>'.
   * @generated
   */
  IDEView createIDEView();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UIGrammarPackage getUIGrammarPackage();

} //UIGrammarFactory
