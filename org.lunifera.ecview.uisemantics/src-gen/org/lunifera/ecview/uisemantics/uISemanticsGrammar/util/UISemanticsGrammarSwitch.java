/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.ecview.uisemantics.uISemanticsGrammar.*;

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
 * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage
 * @generated
 */
public class UISemanticsGrammarSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UISemanticsGrammarPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UISemanticsGrammarSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UISemanticsGrammarPackage.eINSTANCE;
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
      case UISemanticsGrammarPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION:
      {
        ElementDefinition elementDefinition = (ElementDefinition)theEObject;
        T result = caseElementDefinition(elementDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UISemanticsGrammarPackage.AVAILABLE_BINDINGS:
      {
        AvailableBindings availableBindings = (AvailableBindings)theEObject;
        T result = caseAvailableBindings(availableBindings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UISemanticsGrammarPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UISemanticsGrammarPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UISemanticsGrammarPackage.MULTIPLICITY:
      {
        Multiplicity multiplicity = (Multiplicity)theEObject;
        T result = caseMultiplicity(multiplicity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementDefinition(ElementDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Available Bindings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Available Bindings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAvailableBindings(AvailableBindings object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicity(Multiplicity object)
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

} //UISemanticsGrammarSwitch
