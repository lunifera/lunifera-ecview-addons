/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarFactory
 * @model kind="package"
 * @generated
 */
public interface UISemanticsGrammarPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uISemanticsGrammar";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lunifera.org/ecview/uisemantics/UISemanticsGrammar";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uISemanticsGrammar";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UISemanticsGrammarPackage eINSTANCE = org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ModelImpl
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Element Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENT_DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ElementDefinitionImpl
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getElementDefinition()
   * @generated
   */
  int ELEMENT_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__NS_URI = 1;

  /**
   * The feature id for the '<em><b>Binding Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__BINDING_CONTAINER = 2;

  /**
   * The number of structural features of the '<em>Element Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.AvailableBindingsImpl <em>Available Bindings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.AvailableBindingsImpl
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getAvailableBindings()
   * @generated
   */
  int AVAILABLE_BINDINGS = 2;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVAILABLE_BINDINGS__BINDINGS = 0;

  /**
   * The number of structural features of the '<em>Available Bindings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVAILABLE_BINDINGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.BindingImpl
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__NAME = 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__MULTIPLICITY = 2;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.DataTypeImpl
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 4;

  /**
   * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__JVM_TYPE = 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.MultiplicityImpl
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 5;

  /**
   * The feature id for the '<em><b>SINGLE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__SINGLE = 0;

  /**
   * The feature id for the '<em><b>MULTI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__MULTI = 1;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Model#getElementDefinitions <em>Element Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element Definitions</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Model#getElementDefinitions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ElementDefinitions();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition <em>Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Definition</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition
   * @generated
   */
  EClass getElementDefinition();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getName()
   * @see #getElementDefinition()
   * @generated
   */
  EReference getElementDefinition_Name();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getNsURI <em>Ns URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ns URI</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getNsURI()
   * @see #getElementDefinition()
   * @generated
   */
  EReference getElementDefinition_NsURI();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getBindingContainer <em>Binding Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binding Container</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition#getBindingContainer()
   * @see #getElementDefinition()
   * @generated
   */
  EReference getElementDefinition_BindingContainer();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.AvailableBindings <em>Available Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Available Bindings</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.AvailableBindings
   * @generated
   */
  EClass getAvailableBindings();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.AvailableBindings#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.AvailableBindings#getBindings()
   * @see #getAvailableBindings()
   * @generated
   */
  EReference getAvailableBindings_Bindings();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding#getName()
   * @see #getBinding()
   * @generated
   */
  EAttribute getBinding_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding#getDataType()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_DataType();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding#getMultiplicity()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.DataType#getJvmType <em>Jvm Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jvm Type</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.DataType#getJvmType()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_JvmType();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getSINGLE <em>SINGLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>SINGLE</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getSINGLE()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_SINGLE();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getMULTI <em>MULTI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>MULTI</em>'.
   * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity#getMULTI()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_MULTI();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UISemanticsGrammarFactory getUISemanticsGrammarFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ModelImpl
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Element Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENT_DEFINITIONS = eINSTANCE.getModel_ElementDefinitions();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ElementDefinitionImpl
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getElementDefinition()
     * @generated
     */
    EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DEFINITION__NAME = eINSTANCE.getElementDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Ns URI</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DEFINITION__NS_URI = eINSTANCE.getElementDefinition_NsURI();

    /**
     * The meta object literal for the '<em><b>Binding Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DEFINITION__BINDING_CONTAINER = eINSTANCE.getElementDefinition_BindingContainer();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.AvailableBindingsImpl <em>Available Bindings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.AvailableBindingsImpl
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getAvailableBindings()
     * @generated
     */
    EClass AVAILABLE_BINDINGS = eINSTANCE.getAvailableBindings();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AVAILABLE_BINDINGS__BINDINGS = eINSTANCE.getAvailableBindings_Bindings();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.BindingImpl
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__DATA_TYPE = eINSTANCE.getBinding_DataType();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__MULTIPLICITY = eINSTANCE.getBinding_Multiplicity();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.DataTypeImpl
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Jvm Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__JVM_TYPE = eINSTANCE.getDataType_JvmType();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.MultiplicityImpl
     * @see org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.UISemanticsGrammarPackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>SINGLE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__SINGLE = eINSTANCE.getMultiplicity_SINGLE();

    /**
     * The meta object literal for the '<em><b>MULTI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__MULTI = eINSTANCE.getMultiplicity_MULTI();

  }

} //UISemanticsGrammarPackage
