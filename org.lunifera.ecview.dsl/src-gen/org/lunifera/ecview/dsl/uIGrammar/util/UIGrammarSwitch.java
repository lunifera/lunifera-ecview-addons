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
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTree;

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
      case UIGrammarPackage.GTEXT_BINDING_DEFS:
      {
        GTextBindingDefs gTextBindingDefs = (GTextBindingDefs)theEObject;
        T result = caseGTextBindingDefs(gTextBindingDefs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GTEXT_BINDING_DEF:
      {
        GTextBindingDef gTextBindingDef = (GTextBindingDef)theEObject;
        T result = caseGTextBindingDef(gTextBindingDef);
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
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT:
      {
        GGridLayoutAssigment gGridLayoutAssigment = (GGridLayoutAssigment)theEObject;
        T result = caseGGridLayoutAssigment(gGridLayoutAssigment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
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
      case UIGrammarPackage.GTEXT_AREA:
      {
        GTextArea gTextArea = (GTextArea)theEObject;
        T result = caseGTextArea(gTextArea);
        if (result == null) result = caseYTextArea(gTextArea);
        if (result == null) result = caseYInput(gTextArea);
        if (result == null) result = caseYValueBindable(gTextArea);
        if (result == null) result = caseYField(gTextArea);
        if (result == null) result = caseYBindable(gTextArea);
        if (result == null) result = caseYEmbeddable(gTextArea);
        if (result == null) result = caseYEditable(gTextArea);
        if (result == null) result = caseYEnable(gTextArea);
        if (result == null) result = caseYElement(gTextArea);
        if (result == null) result = caseYCssAble(gTextArea);
        if (result == null) result = caseYVisibleable(gTextArea);
        if (result == null) result = caseYVisibilityProcessable(gTextArea);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GTABLE:
      {
        GTable gTable = (GTable)theEObject;
        T result = caseGTable(gTable);
        if (result == null) result = caseYTable(gTable);
        if (result == null) result = caseYInput(gTable);
        if (result == null) result = caseYCollectionBindable(gTable);
        if (result == null) result = caseYSelectionBindable(gTable);
        if (result == null) result = caseYMultiSelectionBindable(gTable);
        if (result == null) result = caseYField(gTable);
        if (result == null) result = caseYBindable(gTable);
        if (result == null) result = caseYEmbeddable(gTable);
        if (result == null) result = caseYEditable(gTable);
        if (result == null) result = caseYEnable(gTable);
        if (result == null) result = caseYElement(gTable);
        if (result == null) result = caseYCssAble(gTable);
        if (result == null) result = caseYVisibleable(gTable);
        if (result == null) result = caseYVisibilityProcessable(gTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UIGrammarPackage.GTTREE:
      {
        GTtree gTtree = (GTtree)theEObject;
        T result = caseGTtree(gTtree);
        if (result == null) result = caseYTree(gTtree);
        if (result == null) result = caseYInput(gTtree);
        if (result == null) result = caseYCollectionBindable(gTtree);
        if (result == null) result = caseYSelectionBindable(gTtree);
        if (result == null) result = caseYMultiSelectionBindable(gTtree);
        if (result == null) result = caseYField(gTtree);
        if (result == null) result = caseYBindable(gTtree);
        if (result == null) result = caseYEmbeddable(gTtree);
        if (result == null) result = caseYEditable(gTtree);
        if (result == null) result = caseYEnable(gTtree);
        if (result == null) result = caseYElement(gTtree);
        if (result == null) result = caseYCssAble(gTtree);
        if (result == null) result = caseYVisibleable(gTtree);
        if (result == null) result = caseYVisibilityProcessable(gTtree);
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
   * Returns the result of interpreting the object as an instance of '<em>GText Binding Defs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GText Binding Defs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGTextBindingDefs(GTextBindingDefs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GText Binding Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GText Binding Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGTextBindingDef(GTextBindingDef object)
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
   * Returns the result of interpreting the object as an instance of '<em>GGrid Layout Assigment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GGrid Layout Assigment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGGridLayoutAssigment(GGridLayoutAssigment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding(Binding object)
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
   * Returns the result of interpreting the object as an instance of '<em>GText Area</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GText Area</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGTextArea(GTextArea object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GTable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GTable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGTable(GTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GTtree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GTtree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGTtree(GTtree object)
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
   * Returns the result of interpreting the object as an instance of '<em>YText Area</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YText Area</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYTextArea(YTextArea object)
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
   * Returns the result of interpreting the object as an instance of '<em>YTable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YTable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYTable(YTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>YTree</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>YTree</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYTree(YTree object)
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
