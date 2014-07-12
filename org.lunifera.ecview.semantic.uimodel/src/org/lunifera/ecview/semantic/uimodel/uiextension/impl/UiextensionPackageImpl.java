/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.xtext.xbase.XbasePackage;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiList;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessable;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorDef;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProperties;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesDef;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityRule;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiXbaseVisibilityRule;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionFactory;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiextensionPackageImpl extends EPackageImpl implements UiextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiGridLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiGridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTextFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiNumericFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiChangeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiXbaseVisibilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertiesAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertiesDefEClass = null;

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
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiextensionPackageImpl() {
		super(eNS_URI, UiextensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiextensionPackage init() {
		if (isInited) return (UiextensionPackage)EPackage.Registry.INSTANCE.getEPackage(UiextensionPackage.eNS_URI);

		// Obtain or create and register package
		UiextensionPackageImpl theUiextensionPackage = (UiextensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiextensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiextensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExtDatatypesPackage.eINSTANCE.eClass();
		ExtensionModelPackage.eINSTANCE.eClass();
		UiSemanticsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UimodelPackageImpl theUimodelPackage = (UimodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UimodelPackage.eNS_URI) instanceof UimodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UimodelPackage.eNS_URI) : UimodelPackage.eINSTANCE);

		// Create package meta-data objects
		theUiextensionPackage.createPackageContents();
		theUimodelPackage.createPackageContents();

		// Initialize created meta-data
		theUiextensionPackage.initializePackageContents();
		theUimodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiextensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiextensionPackage.eNS_URI, theUiextensionPackage);
		return theUiextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiGridLayoutAssigment() {
		return uiGridLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_Element() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiGridLayoutAssigment_Alignment() {
		return (EAttribute)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_From() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_To() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiGridLayout() {
		return uiGridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayout_Contents() {
		return (EReference)uiGridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTextField() {
		return uiTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiList() {
		return uiListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiNumericField() {
		return uiNumericFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCheckBox() {
		return uiCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessable() {
		return uiVisibilityProcessableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessable_ProcessorAssignment() {
		return (EReference)uiVisibilityProcessableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessor() {
		return uiVisibilityProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_BindingAlias() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_ChangeTrigger() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_Rule() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_PropertiesAssignment() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessorDef() {
		return uiVisibilityProcessorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorDef_Processor() {
		return (EReference)uiVisibilityProcessorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessorAssignment() {
		return uiVisibilityProcessorAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorAssignment_Processor() {
		return (EReference)uiVisibilityProcessorAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorAssignment_ProcessorAlias() {
		return (EReference)uiVisibilityProcessorAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiChangeTrigger() {
		return uiChangeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiChangeTrigger_Endpoint() {
		return (EReference)uiChangeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiChangeTrigger_EndpointAlias() {
		return (EReference)uiChangeTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityRule() {
		return uiVisibilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiXbaseVisibilityRule() {
		return uiXbaseVisibilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseVisibilityRule_Expression() {
		return (EReference)uiXbaseVisibilityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProperties() {
		return uiVisibilityPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityPropertiesAssignment() {
		return uiVisibilityPropertiesAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityPropertiesAssignment_Properties() {
		return (EReference)uiVisibilityPropertiesAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityPropertiesAssignment_PropertyAlias() {
		return (EReference)uiVisibilityPropertiesAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityPropertiesDef() {
		return uiVisibilityPropertiesDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityPropertiesDef_Properties() {
		return (EReference)uiVisibilityPropertiesDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiextensionFactory getUiextensionFactory() {
		return (UiextensionFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uiGridLayoutAssigmentEClass = createEClass(UI_GRID_LAYOUT_ASSIGMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ELEMENT);
		createEAttribute(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__FROM);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__TO);

		uiGridLayoutEClass = createEClass(UI_GRID_LAYOUT);
		createEReference(uiGridLayoutEClass, UI_GRID_LAYOUT__CONTENTS);

		uiTextFieldEClass = createEClass(UI_TEXT_FIELD);

		uiListEClass = createEClass(UI_LIST);

		uiNumericFieldEClass = createEClass(UI_NUMERIC_FIELD);

		uiCheckBoxEClass = createEClass(UI_CHECK_BOX);

		uiVisibilityProcessableEClass = createEClass(UI_VISIBILITY_PROCESSABLE);
		createEReference(uiVisibilityProcessableEClass, UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT);

		uiVisibilityProcessorEClass = createEClass(UI_VISIBILITY_PROCESSOR);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__BINDING_ALIAS);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__RULE);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT);

		uiVisibilityProcessorDefEClass = createEClass(UI_VISIBILITY_PROCESSOR_DEF);
		createEReference(uiVisibilityProcessorDefEClass, UI_VISIBILITY_PROCESSOR_DEF__PROCESSOR);

		uiVisibilityProcessorAssignmentEClass = createEClass(UI_VISIBILITY_PROCESSOR_ASSIGNMENT);
		createEReference(uiVisibilityProcessorAssignmentEClass, UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR);
		createEReference(uiVisibilityProcessorAssignmentEClass, UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS);

		uiChangeTriggerEClass = createEClass(UI_CHANGE_TRIGGER);
		createEReference(uiChangeTriggerEClass, UI_CHANGE_TRIGGER__ENDPOINT);
		createEReference(uiChangeTriggerEClass, UI_CHANGE_TRIGGER__ENDPOINT_ALIAS);

		uiVisibilityRuleEClass = createEClass(UI_VISIBILITY_RULE);

		uiXbaseVisibilityRuleEClass = createEClass(UI_XBASE_VISIBILITY_RULE);
		createEReference(uiXbaseVisibilityRuleEClass, UI_XBASE_VISIBILITY_RULE__EXPRESSION);

		uiVisibilityPropertiesEClass = createEClass(UI_VISIBILITY_PROPERTIES);

		uiVisibilityPropertiesDefEClass = createEClass(UI_VISIBILITY_PROPERTIES_DEF);
		createEReference(uiVisibilityPropertiesDefEClass, UI_VISIBILITY_PROPERTIES_DEF__PROPERTIES);

		uiVisibilityPropertiesAssignmentEClass = createEClass(UI_VISIBILITY_PROPERTIES_ASSIGNMENT);
		createEReference(uiVisibilityPropertiesAssignmentEClass, UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES);
		createEReference(uiVisibilityPropertiesAssignmentEClass, UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UimodelPackage theUimodelPackage = (UimodelPackage)EPackage.Registry.INSTANCE.getEPackage(UimodelPackage.eNS_URI);
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);
		ExtensionModelPackage theExtensionModelPackage = (ExtensionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionModelPackage.eNS_URI);
		VisibilityPackage theVisibilityPackage = (VisibilityPackage)EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiGridLayoutAssigmentEClass.getESuperTypes().add(theUimodelPackage.getUiModelElement());
		uiGridLayoutEClass.getESuperTypes().add(theExtensionModelPackage.getYGridLayout());
		uiGridLayoutEClass.getESuperTypes().add(theUimodelPackage.getUiLayout());
		uiTextFieldEClass.getESuperTypes().add(theExtensionModelPackage.getYTextField());
		uiTextFieldEClass.getESuperTypes().add(theUimodelPackage.getUiField());
		uiListEClass.getESuperTypes().add(theExtensionModelPackage.getYList());
		uiListEClass.getESuperTypes().add(theUimodelPackage.getUiField());
		uiNumericFieldEClass.getESuperTypes().add(theExtensionModelPackage.getYNumericField());
		uiNumericFieldEClass.getESuperTypes().add(theUimodelPackage.getUiField());
		uiCheckBoxEClass.getESuperTypes().add(theExtensionModelPackage.getYCheckBox());
		uiCheckBoxEClass.getESuperTypes().add(theUimodelPackage.getUiField());
		uiVisibilityProcessorEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		uiVisibilityProcessorEClass.getESuperTypes().add(theUimodelPackage.getUiModelElement());
		uiVisibilityProcessorDefEClass.getESuperTypes().add(theUimodelPackage.getUiRootElements());
		uiVisibilityProcessorAssignmentEClass.getESuperTypes().add(theUimodelPackage.getUiModelElement());
		uiChangeTriggerEClass.getESuperTypes().add(theUimodelPackage.getUiModelElement());
		uiVisibilityRuleEClass.getESuperTypes().add(theVisibilityPackage.getYVisibilityRule());
		uiVisibilityRuleEClass.getESuperTypes().add(theUimodelPackage.getUiModelElement());
		uiXbaseVisibilityRuleEClass.getESuperTypes().add(this.getUiVisibilityRule());
		uiVisibilityPropertiesEClass.getESuperTypes().add(theVisibilityPackage.getYVisibilityProperties());
		uiVisibilityPropertiesDefEClass.getESuperTypes().add(theUimodelPackage.getUiRootElements());
		uiVisibilityPropertiesAssignmentEClass.getESuperTypes().add(theUimodelPackage.getUiModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(uiGridLayoutAssigmentEClass, UiGridLayoutAssigment.class, "UiGridLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayoutAssigment_Element(), theCoreModelPackage.getYEmbeddable(), null, "element", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiGridLayoutAssigment_Alignment(), theExtensionModelPackage.getYAlignment(), "alignment", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_From(), theUimodelPackage.getUiPoint(), null, "from", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_To(), theUimodelPackage.getUiPoint(), null, "to", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiGridLayoutEClass, UiGridLayout.class, "UiGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayout_Contents(), this.getUiGridLayoutAssigment(), null, "contents", null, 0, -1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTextFieldEClass, UiTextField.class, "UiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiListEClass, UiList.class, "UiList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiNumericFieldEClass, UiNumericField.class, "UiNumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiCheckBoxEClass, UiCheckBox.class, "UiCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiVisibilityProcessableEClass, UiVisibilityProcessable.class, "UiVisibilityProcessable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessable_ProcessorAssignment(), this.getUiVisibilityProcessorAssignment(), null, "processorAssignment", null, 0, 1, UiVisibilityProcessable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorEClass, UiVisibilityProcessor.class, "UiVisibilityProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessor_BindingAlias(), theUimodelPackage.getUiBindingEndpointAlias(), null, "bindingAlias", null, 0, -1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_ChangeTrigger(), this.getUiChangeTrigger(), null, "changeTrigger", null, 0, -1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_Rule(), this.getUiVisibilityRule(), null, "rule", null, 0, 1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_PropertiesAssignment(), this.getUiVisibilityPropertiesAssignment(), null, "propertiesAssignment", null, 0, 1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorDefEClass, UiVisibilityProcessorDef.class, "UiVisibilityProcessorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessorDef_Processor(), this.getUiVisibilityProcessor(), null, "processor", null, 0, 1, UiVisibilityProcessorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorAssignmentEClass, UiVisibilityProcessorAssignment.class, "UiVisibilityProcessorAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessorAssignment_Processor(), this.getUiVisibilityProcessor(), null, "processor", null, 0, 1, UiVisibilityProcessorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessorAssignment_ProcessorAlias(), this.getUiVisibilityProcessor(), null, "processorAlias", null, 0, 1, UiVisibilityProcessorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiChangeTriggerEClass, UiChangeTrigger.class, "UiChangeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiChangeTrigger_Endpoint(), theUimodelPackage.getUiBindingEndpointDef(), null, "endpoint", null, 0, 1, UiChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiChangeTrigger_EndpointAlias(), theUimodelPackage.getUiBindingEndpointAlias(), null, "endpointAlias", null, 0, 1, UiChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityRuleEClass, UiVisibilityRule.class, "UiVisibilityRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiXbaseVisibilityRuleEClass, UiXbaseVisibilityRule.class, "UiXbaseVisibilityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiXbaseVisibilityRule_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, UiXbaseVisibilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityPropertiesEClass, UiVisibilityProperties.class, "UiVisibilityProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiVisibilityPropertiesDefEClass, UiVisibilityPropertiesDef.class, "UiVisibilityPropertiesDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityPropertiesDef_Properties(), this.getUiVisibilityProperties(), null, "properties", null, 0, 1, UiVisibilityPropertiesDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityPropertiesAssignmentEClass, UiVisibilityPropertiesAssignment.class, "UiVisibilityPropertiesAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityPropertiesAssignment_Properties(), this.getUiVisibilityProperties(), null, "properties", null, 0, 1, UiVisibilityPropertiesAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityPropertiesAssignment_PropertyAlias(), this.getUiVisibilityProperties(), null, "propertyAlias", null, 0, 1, UiVisibilityPropertiesAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UiextensionPackageImpl
