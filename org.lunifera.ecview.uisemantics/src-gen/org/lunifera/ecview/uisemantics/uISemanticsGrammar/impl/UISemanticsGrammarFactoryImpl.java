/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.ecview.uisemantics.uISemanticsGrammar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UISemanticsGrammarFactoryImpl extends EFactoryImpl implements UISemanticsGrammarFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UISemanticsGrammarFactory init()
  {
    try
    {
      UISemanticsGrammarFactory theUISemanticsGrammarFactory = (UISemanticsGrammarFactory)EPackage.Registry.INSTANCE.getEFactory(UISemanticsGrammarPackage.eNS_URI);
      if (theUISemanticsGrammarFactory != null)
      {
        return theUISemanticsGrammarFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UISemanticsGrammarFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UISemanticsGrammarFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UISemanticsGrammarPackage.MODEL: return createModel();
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION: return createElementDefinition();
      case UISemanticsGrammarPackage.AVAILABLE_BINDINGS: return createAvailableBindings();
      case UISemanticsGrammarPackage.BINDING: return createBinding();
      case UISemanticsGrammarPackage.DATA_TYPE: return createDataType();
      case UISemanticsGrammarPackage.MULTIPLICITY: return createMultiplicity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDefinition createElementDefinition()
  {
    ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
    return elementDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvailableBindings createAvailableBindings()
  {
    AvailableBindingsImpl availableBindings = new AvailableBindingsImpl();
    return availableBindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UISemanticsGrammarPackage getUISemanticsGrammarPackage()
  {
    return (UISemanticsGrammarPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UISemanticsGrammarPackage getPackage()
  {
    return UISemanticsGrammarPackage.eINSTANCE;
  }

} //UISemanticsGrammarFactoryImpl
