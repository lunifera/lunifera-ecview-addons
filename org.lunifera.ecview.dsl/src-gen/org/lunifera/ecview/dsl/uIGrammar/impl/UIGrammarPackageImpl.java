/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;

import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;

import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;

import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.lunifera.ecview.dsl.uIGrammar.Action;
import org.lunifera.ecview.dsl.uIGrammar.GBeanSlot;
import org.lunifera.ecview.dsl.uIGrammar.IDEView;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarFactory;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;
import org.lunifera.ecview.dsl.uIGrammar.UiModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIGrammarPackageImpl extends EPackageImpl implements UIGrammarPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gBeanSlotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ideViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UIGrammarPackageImpl()
  {
    super(eNS_URI, UIGrammarFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link UIGrammarPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UIGrammarPackage init()
  {
    if (isInited) return (UIGrammarPackage)EPackage.Registry.INSTANCE.getEPackage(UIGrammarPackage.eNS_URI);

    // Obtain or create and register package
    UIGrammarPackageImpl theUIGrammarPackage = (UIGrammarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UIGrammarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UIGrammarPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CoreModelPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();
    ValidationPackage.eINSTANCE.eClass();
    BindingPackage.eINSTANCE.eClass();
    DatatypesPackage.eINSTANCE.eClass();
    VisibilityPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theUIGrammarPackage.createPackageContents();

    // Initialize created meta-data
    theUIGrammarPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUIGrammarPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UIGrammarPackage.eNS_URI, theUIGrammarPackage);
    return theUIGrammarPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUiModel()
  {
    return uiModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUiModel_ViewSet()
  {
    return (EReference)uiModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGBeanSlot()
  {
    return gBeanSlotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGBeanSlot_JvmType()
  {
    return (EReference)gBeanSlotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDEView()
  {
    return ideViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDEView_Actions()
  {
    return (EReference)ideViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDEView_Layouts()
  {
    return (EReference)ideViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Name()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Body()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIGrammarFactory getUIGrammarFactory()
  {
    return (UIGrammarFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    uiModelEClass = createEClass(UI_MODEL);
    createEReference(uiModelEClass, UI_MODEL__VIEW_SET);

    gBeanSlotEClass = createEClass(GBEAN_SLOT);
    createEReference(gBeanSlotEClass, GBEAN_SLOT__JVM_TYPE);

    ideViewEClass = createEClass(IDE_VIEW);
    createEReference(ideViewEClass, IDE_VIEW__ACTIONS);
    createEReference(ideViewEClass, IDE_VIEW__LAYOUTS);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__NAME);
    createEReference(actionEClass, ACTION__BODY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    gBeanSlotEClass.getESuperTypes().add(theCoreModelPackage.getYBeanSlot());
    ideViewEClass.getESuperTypes().add(theCoreModelPackage.getYView());

    // Initialize classes and features; add operations and parameters
    initEClass(uiModelEClass, UiModel.class, "UiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUiModel_ViewSet(), theCoreModelPackage.getYViewSet(), null, "viewSet", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gBeanSlotEClass, GBeanSlot.class, "GBeanSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGBeanSlot_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, GBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ideViewEClass, IDEView.class, "IDEView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIDEView_Actions(), this.getAction(), null, "actions", null, 0, -1, IDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDEView_Layouts(), theCoreModelPackage.getYLayout(), null, "layouts", null, 0, -1, IDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //UIGrammarPackageImpl
