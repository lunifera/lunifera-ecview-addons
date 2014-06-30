/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;

import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.lunifera.ecview.dsl.uIGrammar.Action;
import org.lunifera.ecview.dsl.uIGrammar.Binding;
import org.lunifera.ecview.dsl.uIGrammar.GBeanSlot;
import org.lunifera.ecview.dsl.uIGrammar.GGridLayout;
import org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment;
import org.lunifera.ecview.dsl.uIGrammar.GTable;
import org.lunifera.ecview.dsl.uIGrammar.GTextArea;
import org.lunifera.ecview.dsl.uIGrammar.GTextBindingDef;
import org.lunifera.ecview.dsl.uIGrammar.GTextBindingDefs;
import org.lunifera.ecview.dsl.uIGrammar.GTextField;
import org.lunifera.ecview.dsl.uIGrammar.GTtree;
import org.lunifera.ecview.dsl.uIGrammar.IDEView;
import org.lunifera.ecview.dsl.uIGrammar.Point;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarFactory;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;
import org.lunifera.ecview.dsl.uIGrammar.UiModel;

import org.lunifera.ecview.model.uiConfigs.UiConfigsPackage;

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
  private EClass ideViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gTextBindingDefsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gTextBindingDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gGridLayoutAssigmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingEClass = null;

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
  private EClass gGridLayoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gTextFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gTextAreaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gTtreeEClass = null;

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
    ExtensionModelPackage.eINSTANCE.eClass();
    XbasePackage.eINSTANCE.eClass();
    UiConfigsPackage.eINSTANCE.eClass();
    ExtDatatypesPackage.eINSTANCE.eClass();

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
  public EClass getIDEView()
  {
    return ideViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDEView_For()
  {
    return (EReference)ideViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDEView_Defs()
  {
    return (EReference)ideViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDEView_Actions()
  {
    return (EReference)ideViewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDEView_Layouts()
  {
    return (EReference)ideViewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIDEView_Bindings()
  {
    return (EReference)ideViewEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGTextBindingDefs()
  {
    return gTextBindingDefsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGTextBindingDefs_Methods()
  {
    return (EReference)gTextBindingDefsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGTextBindingDef()
  {
    return gTextBindingDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGTextBindingDef_Name()
  {
    return (EAttribute)gTextBindingDefEClass.getEStructuralFeatures().get(0);
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
  public EClass getGGridLayoutAssigment()
  {
    return gGridLayoutAssigmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGGridLayoutAssigment_Element()
  {
    return (EReference)gGridLayoutAssigmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGGridLayoutAssigment_Alignment()
  {
    return (EAttribute)gGridLayoutAssigmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGGridLayoutAssigment_From()
  {
    return (EReference)gGridLayoutAssigmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGGridLayoutAssigment_To()
  {
    return (EReference)gGridLayoutAssigmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_X()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Y()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding()
  {
    return bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_Embeddable()
  {
    return (EReference)bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_Method()
  {
    return (EReference)bindingEClass.getEStructuralFeatures().get(1);
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
  public EClass getGGridLayout()
  {
    return gGridLayoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGGridLayout_Contents()
  {
    return (EReference)gGridLayoutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGTextField()
  {
    return gTextFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGTextArea()
  {
    return gTextAreaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGTable()
  {
    return gTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGTable_JvmType()
  {
    return (EReference)gTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGTtree()
  {
    return gTtreeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGTtree_JvmType()
  {
    return (EReference)gTtreeEClass.getEStructuralFeatures().get(0);
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

    ideViewEClass = createEClass(IDE_VIEW);
    createEReference(ideViewEClass, IDE_VIEW__FOR);
    createEReference(ideViewEClass, IDE_VIEW__DEFS);
    createEReference(ideViewEClass, IDE_VIEW__ACTIONS);
    createEReference(ideViewEClass, IDE_VIEW__LAYOUTS);
    createEReference(ideViewEClass, IDE_VIEW__BINDINGS);

    gTextBindingDefsEClass = createEClass(GTEXT_BINDING_DEFS);
    createEReference(gTextBindingDefsEClass, GTEXT_BINDING_DEFS__METHODS);

    gTextBindingDefEClass = createEClass(GTEXT_BINDING_DEF);
    createEAttribute(gTextBindingDefEClass, GTEXT_BINDING_DEF__NAME);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__NAME);
    createEReference(actionEClass, ACTION__BODY);

    gGridLayoutAssigmentEClass = createEClass(GGRID_LAYOUT_ASSIGMENT);
    createEReference(gGridLayoutAssigmentEClass, GGRID_LAYOUT_ASSIGMENT__ELEMENT);
    createEAttribute(gGridLayoutAssigmentEClass, GGRID_LAYOUT_ASSIGMENT__ALIGNMENT);
    createEReference(gGridLayoutAssigmentEClass, GGRID_LAYOUT_ASSIGMENT__FROM);
    createEReference(gGridLayoutAssigmentEClass, GGRID_LAYOUT_ASSIGMENT__TO);

    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__X);
    createEAttribute(pointEClass, POINT__Y);

    bindingEClass = createEClass(BINDING);
    createEReference(bindingEClass, BINDING__EMBEDDABLE);
    createEReference(bindingEClass, BINDING__METHOD);

    gBeanSlotEClass = createEClass(GBEAN_SLOT);
    createEReference(gBeanSlotEClass, GBEAN_SLOT__JVM_TYPE);

    gGridLayoutEClass = createEClass(GGRID_LAYOUT);
    createEReference(gGridLayoutEClass, GGRID_LAYOUT__CONTENTS);

    gTextFieldEClass = createEClass(GTEXT_FIELD);

    gTextAreaEClass = createEClass(GTEXT_AREA);

    gTableEClass = createEClass(GTABLE);
    createEReference(gTableEClass, GTABLE__JVM_TYPE);

    gTtreeEClass = createEClass(GTTREE);
    createEReference(gTtreeEClass, GTTREE__JVM_TYPE);
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
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
    ExtensionModelPackage theExtensionModelPackage = (ExtensionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionModelPackage.eNS_URI);
    UiConfigsPackage theUiConfigsPackage = (UiConfigsPackage)EPackage.Registry.INSTANCE.getEPackage(UiConfigsPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ideViewEClass.getESuperTypes().add(theCoreModelPackage.getYView());
    gBeanSlotEClass.getESuperTypes().add(theCoreModelPackage.getYBeanSlot());
    gGridLayoutEClass.getESuperTypes().add(theExtensionModelPackage.getYGridLayout());
    gTextFieldEClass.getESuperTypes().add(theExtensionModelPackage.getYTextField());
    gTextAreaEClass.getESuperTypes().add(theExtensionModelPackage.getYTextArea());
    gTableEClass.getESuperTypes().add(theExtensionModelPackage.getYTable());
    gTtreeEClass.getESuperTypes().add(theExtensionModelPackage.getYTree());

    // Initialize classes and features; add operations and parameters
    initEClass(uiModelEClass, UiModel.class, "UiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUiModel_ViewSet(), theCoreModelPackage.getYViewSet(), null, "viewSet", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ideViewEClass, IDEView.class, "IDEView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIDEView_For(), ecorePackage.getEClass(), null, "for", null, 0, 1, IDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDEView_Defs(), this.getGTextBindingDefs(), null, "defs", null, 0, -1, IDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDEView_Actions(), this.getAction(), null, "actions", null, 0, -1, IDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDEView_Layouts(), theCoreModelPackage.getYLayout(), null, "layouts", null, 0, -1, IDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIDEView_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, IDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gTextBindingDefsEClass, GTextBindingDefs.class, "GTextBindingDefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGTextBindingDefs_Methods(), this.getGTextBindingDef(), null, "methods", null, 0, -1, GTextBindingDefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gTextBindingDefEClass, GTextBindingDef.class, "GTextBindingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGTextBindingDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, GTextBindingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gGridLayoutAssigmentEClass, GGridLayoutAssigment.class, "GGridLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGGridLayoutAssigment_Element(), theCoreModelPackage.getYEmbeddable(), null, "element", null, 0, 1, GGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGGridLayoutAssigment_Alignment(), theExtensionModelPackage.getYAlignment(), "alignment", null, 0, 1, GGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGGridLayoutAssigment_From(), this.getPoint(), null, "from", null, 0, 1, GGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGGridLayoutAssigment_To(), this.getPoint(), null, "to", null, 0, 1, GGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinding_Embeddable(), theCoreModelPackage.getYEmbeddable(), null, "embeddable", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinding_Method(), theUiConfigsPackage.getBindingMethod(), null, "method", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gBeanSlotEClass, GBeanSlot.class, "GBeanSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGBeanSlot_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, GBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gGridLayoutEClass, GGridLayout.class, "GGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGGridLayout_Contents(), this.getGGridLayoutAssigment(), null, "contents", null, 0, -1, GGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gTextFieldEClass, GTextField.class, "GTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gTextAreaEClass, GTextArea.class, "GTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gTableEClass, GTable.class, "GTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGTable_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, GTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gTtreeEClass, GTtree.class, "GTtree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGTtree_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, GTtree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //UIGrammarPackageImpl
