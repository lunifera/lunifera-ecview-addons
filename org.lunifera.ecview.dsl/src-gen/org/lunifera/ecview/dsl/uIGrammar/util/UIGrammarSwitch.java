/**
 */
package org.lunifera.ecview.dsl.uIGrammar.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;

import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YInput;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;

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
      case UIGrammarPackage.UI_IDE_VIEW:
      {
        UiIDEView uiIDEView = (UiIDEView)theEObject;
        T result = caseUiIDEView(uiIDEView);
        if (result == null) result = caseYView(uiIDEView);
        if (result == null) result = caseYElement(uiIDEView);
        if (result == null) result = caseYCssAble(uiIDEView);
        if (result == null) result = caseYMarginable(uiIDEView);
        if (result == null) result = caseYVisibilityProcessable(uiIDEView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.UI_GRID_LAYOUT_ASSIGMENT:
      {
        UiGridLayoutAssigment uiGridLayoutAssigment = (UiGridLayoutAssigment)theEObject;
        T result = caseUiGridLayoutAssigment(uiGridLayoutAssigment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.UI_POINT:
      {
        UiPoint uiPoint = (UiPoint)theEObject;
        T result = caseUiPoint(uiPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.UI_BINDING:
      {
        UiBinding uiBinding = (UiBinding)theEObject;
        T result = caseUiBinding(uiBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.UI_SOURCE_BINDING_ENDPOINT:
      {
        UiSourceBindingEndpoint uiSourceBindingEndpoint = (UiSourceBindingEndpoint)theEObject;
        T result = caseUiSourceBindingEndpoint(uiSourceBindingEndpoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.UI_TARGET_BINDING_ENDPOINT:
      {
        UiTargetBindingEndpoint uiTargetBindingEndpoint = (UiTargetBindingEndpoint)theEObject;
        T result = caseUiTargetBindingEndpoint(uiTargetBindingEndpoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.UI_PATH_SEGMENT:
      {
        UiPathSegment uiPathSegment = (UiPathSegment)theEObject;
        T result = caseUiPathSegment(uiPathSegment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GBEAN_SLOT:
      {
        GBeanSlot gBeanSlot = (GBeanSlot)theEObject;
        T result = caseGBeanSlot(gBeanSlot);
        if (result == null) result = caseYBeanSlot(gBeanSlot);
        if (result == null) result = caseYBindable(gBeanSlot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GGRID_LAYOUT:
      {
        GGridLayout gGridLayout = (GGridLayout)theEObject;
        T result = caseGGridLayout(gGridLayout);
        if (result == null) result = caseYGridLayout(gGridLayout);
        if (result == null) result = caseYLayout(gGridLayout);
        if (result == null) result = caseYSpacingable(gGridLayout);
        if (result == null) result = caseYMarginable(gGridLayout);
        if (result == null) result = caseYEmbeddable(gGridLayout);
        if (result == null) result = caseYElement(gGridLayout);
        if (result == null) result = caseYCssAble(gGridLayout);
        if (result == null) result = caseYVisibleable(gGridLayout);
        if (result == null) result = caseYVisibilityProcessable(gGridLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GTEXT_FIELD:
      {
        GTextField gTextField = (GTextField)theEObject;
        T result = caseGTextField(gTextField);
        if (result == null) result = caseYTextField(gTextField);
        if (result == null) result = caseYInput(gTextField);
        if (result == null) result = caseYValueBindable(gTextField);
        if (result == null) result = caseYField(gTextField);
        if (result == null) result = caseYBindable(gTextField);
        if (result == null) result = caseYEmbeddable(gTextField);
        if (result == null) result = caseYEditable(gTextField);
        if (result == null) result = caseYEnable(gTextField);
        if (result == null) result = caseYElement(gTextField);
        if (result == null) result = caseYCssAble(gTextField);
        if (result == null) result = caseYVisibleable(gTextField);
        if (result == null) result = caseYVisibilityProcessable(gTextField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GLIST:
      {
        GList gList = (GList)theEObject;
        T result = caseGList(gList);
        if (result == null) result = caseYList(gList);
        if (result == null) result = caseYInput(gList);
        if (result == null) result = caseYCollectionBindable(gList);
        if (result == null) result = caseYSelectionBindable(gList);
        if (result == null) result = caseYMultiSelectionBindable(gList);
        if (result == null) result = caseYField(gList);
        if (result == null) result = caseYBindable(gList);
        if (result == null) result = caseYEmbeddable(gList);
        if (result == null) result = caseYEditable(gList);
        if (result == null) result = caseYEnable(gList);
        if (result == null) result = caseYElement(gList);
        if (result == null) result = caseYCssAble(gList);
        if (result == null) result = caseYVisibleable(gList);
        if (result == null) result = caseYVisibilityProcessable(gList);
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
   * Returns the result of interpreting the object as an instance of '<em>Ui IDE View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui IDE View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiIDEView(UiIDEView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Grid Layout Assigment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Grid Layout Assigment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiGridLayoutAssigment(UiGridLayoutAssigment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiPoint(UiPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiBinding(UiBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Source Binding Endpoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Source Binding Endpoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiSourceBindingEndpoint(UiSourceBindingEndpoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Target Binding Endpoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Target Binding Endpoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiTargetBindingEndpoint(UiTargetBindingEndpoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Path Segment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Path Segment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiPathSegment(UiPathSegment object)
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
   * Returns the result of interpreting the object as an instance of '<em>GGrid Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GGrid Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGGridLayout(GGridLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GText Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GText Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGTextField(GTextField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GList</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GList</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGList(GList object)
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
   * Returns the result of interpreting the object as an instance of '<em>YBindable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YBindable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYBindable(YBindable object)
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
   * Returns the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYVisibleable(YVisibleable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYEmbeddable(YEmbeddable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YLayout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YLayout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYLayout(YLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYSpacingable(YSpacingable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YGrid Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YGrid Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYGridLayout(YGridLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YEditable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YEditable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYEditable(YEditable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YEnable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YEnable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYEnable(YEnable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YField</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YField</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYField(YField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YInput</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YInput</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYInput(YInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YValue Bindable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YValue Bindable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYValueBindable(YValueBindable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YText Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YText Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYTextField(YTextField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YCollection Bindable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YCollection Bindable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYCollectionBindable(YCollectionBindable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YSelection Bindable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YSelection Bindable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYSelectionBindable(YSelectionBindable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YMulti Selection Bindable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YMulti Selection Bindable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYMultiSelectionBindable(YMultiSelectionBindable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YList</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YList</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYList(YList object)
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
