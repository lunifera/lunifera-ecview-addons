/**
 */
package org.lunifera.ecview.dsl.uIGrammar.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;

import org.lunifera.ecview.dsl.uIGrammar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage
 * @generated
 */
public class UIGrammarSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UIGrammarPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIGrammarSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UIGrammarPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UIGrammarPackage.UI_MODEL:
      {
        UiModel uiModel = (UiModel)theEObject;
        T result = caseUiModel(uiModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GBEAN_SLOT:
      {
        GBeanSlot gBeanSlot = (GBeanSlot)theEObject;
        T result = caseGBeanSlot(gBeanSlot);
        if (result == null) result = caseYBeanSlot(gBeanSlot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.IDE_VIEW:
      {
        IDEView ideView = (IDEView)theEObject;
        T result = caseIDEView(ideView);
        if (result == null) result = caseYView(ideView);
        if (result == null) result = caseYElement(ideView);
        if (result == null) result = caseYCssAble(ideView);
        if (result == null) result = caseYMarginable(ideView);
        if (result == null) result = caseYVisibilityProcessable(ideView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiModel(UiModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GBean Slot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GBean Slot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGBeanSlot(GBeanSlot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IDE View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IDE View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDEView(IDEView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YBean Slot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YBean Slot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYBeanSlot(YBeanSlot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YElement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YElement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYElement(YElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YCss Able</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YCss Able</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYCssAble(YCssAble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YMarginable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YMarginable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYMarginable(YMarginable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YVisibility Processable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YVisibility Processable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYVisibilityProcessable(YVisibilityProcessable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YView</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YView</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYView(YView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UIGrammarSwitch
