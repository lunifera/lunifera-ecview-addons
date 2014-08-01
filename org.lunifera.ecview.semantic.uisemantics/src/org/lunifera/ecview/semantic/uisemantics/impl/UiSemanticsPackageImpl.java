/**
 */
package org.lunifera.ecview.semantic.uisemantics.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xtype.XtypePackage;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsFactory;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions;
import org.lunifera.ecview.semantic.uisemantics.UxEPackageImport;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;
import org.lunifera.ecview.semantic.uisemantics.UxElementURI;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;
import org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration;
import org.lunifera.ecview.semantic.uisemantics.UxListBindingEndpointDef;
import org.lunifera.ecview.semantic.uisemantics.UxModel;
import org.lunifera.ecview.semantic.uisemantics.UxSetBindingEndpointDef;
import org.lunifera.ecview.semantic.uisemantics.UxValidatorProperty;
import org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef;
import org.lunifera.ecview.semantic.uisemantics.UxVisibilityOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiSemanticsPackageImpl extends EPackageImpl implements UiSemanticsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxEPackageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxElementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxElementURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxAvailableBindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxEndpointDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxValueBindingEndpointDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxListBindingEndpointDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxSetBindingEndpointDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxAvailableVisibilityOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxVisibilityOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxAvailableValidatorPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxValidatorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uxImportSectionDeclarationEClass = null;

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
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiSemanticsPackageImpl() {
		super(eNS_URI, UiSemanticsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiSemanticsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiSemanticsPackage init() {
		if (isInited) return (UiSemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(UiSemanticsPackage.eNS_URI);

		// Obtain or create and register package
		UiSemanticsPackageImpl theUiSemanticsPackage = (UiSemanticsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiSemanticsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiSemanticsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUiSemanticsPackage.createPackageContents();

		// Initialize created meta-data
		theUiSemanticsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiSemanticsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiSemanticsPackage.eNS_URI, theUiSemanticsPackage);
		return theUiSemanticsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxModel() {
		return uxModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxModel_ImportSection() {
		return (EReference)uxModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxModel_ElementDefinitions() {
		return (EReference)uxModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxEPackageImport() {
		return uxEPackageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUxEPackageImport_Alias() {
		return (EAttribute)uxEPackageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxEPackageImport_EPackage() {
		return (EReference)uxEPackageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxElementDefinition() {
		return uxElementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUxElementDefinition_Name() {
		return (EAttribute)uxElementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxElementDefinition_Uri() {
		return (EReference)uxElementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxElementDefinition_BindingContainer() {
		return (EReference)uxElementDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxElementDefinition_VisibilityContainer() {
		return (EReference)uxElementDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxElementDefinition_ValidatorContainer() {
		return (EReference)uxElementDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxElementURI() {
		return uxElementURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxElementURI_EPackage() {
		return (EReference)uxElementURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxElementURI_EClass() {
		return (EReference)uxElementURIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxAvailableBindings() {
		return uxAvailableBindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxAvailableBindings_Bindings() {
		return (EReference)uxAvailableBindingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxEndpointDef() {
		return uxEndpointDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUxEndpointDef_Final() {
		return (EAttribute)uxEndpointDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUxEndpointDef_Name() {
		return (EAttribute)uxEndpointDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxEndpointDef_JvmType() {
		return (EReference)uxEndpointDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUxEndpointDef_Listbinding() {
		return (EAttribute)uxEndpointDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxValueBindingEndpointDef() {
		return uxValueBindingEndpointDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxListBindingEndpointDef() {
		return uxListBindingEndpointDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxSetBindingEndpointDef() {
		return uxSetBindingEndpointDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxAvailableVisibilityOptions() {
		return uxAvailableVisibilityOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxAvailableVisibilityOptions_Options() {
		return (EReference)uxAvailableVisibilityOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxVisibilityOption() {
		return uxVisibilityOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUxVisibilityOption_Name() {
		return (EAttribute)uxVisibilityOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxVisibilityOption_JvmType() {
		return (EReference)uxVisibilityOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxAvailableValidatorProperties() {
		return uxAvailableValidatorPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxAvailableValidatorProperties_Properties() {
		return (EReference)uxAvailableValidatorPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxValidatorProperty() {
		return uxValidatorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUxValidatorProperty_Name() {
		return (EAttribute)uxValidatorPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUxImportSectionDeclaration() {
		return uxImportSectionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUxImportSectionDeclaration_ImportedEPackage() {
		return (EReference)uxImportSectionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSemanticsFactory getUiSemanticsFactory() {
		return (UiSemanticsFactory)getEFactoryInstance();
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
		uxModelEClass = createEClass(UX_MODEL);
		createEReference(uxModelEClass, UX_MODEL__IMPORT_SECTION);
		createEReference(uxModelEClass, UX_MODEL__ELEMENT_DEFINITIONS);

		uxImportSectionDeclarationEClass = createEClass(UX_IMPORT_SECTION_DECLARATION);
		createEReference(uxImportSectionDeclarationEClass, UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE);

		uxEPackageImportEClass = createEClass(UX_EPACKAGE_IMPORT);
		createEAttribute(uxEPackageImportEClass, UX_EPACKAGE_IMPORT__ALIAS);
		createEReference(uxEPackageImportEClass, UX_EPACKAGE_IMPORT__EPACKAGE);

		uxElementDefinitionEClass = createEClass(UX_ELEMENT_DEFINITION);
		createEAttribute(uxElementDefinitionEClass, UX_ELEMENT_DEFINITION__NAME);
		createEReference(uxElementDefinitionEClass, UX_ELEMENT_DEFINITION__URI);
		createEReference(uxElementDefinitionEClass, UX_ELEMENT_DEFINITION__BINDING_CONTAINER);
		createEReference(uxElementDefinitionEClass, UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER);
		createEReference(uxElementDefinitionEClass, UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER);

		uxElementURIEClass = createEClass(UX_ELEMENT_URI);
		createEReference(uxElementURIEClass, UX_ELEMENT_URI__EPACKAGE);
		createEReference(uxElementURIEClass, UX_ELEMENT_URI__ECLASS);

		uxAvailableBindingsEClass = createEClass(UX_AVAILABLE_BINDINGS);
		createEReference(uxAvailableBindingsEClass, UX_AVAILABLE_BINDINGS__BINDINGS);

		uxEndpointDefEClass = createEClass(UX_ENDPOINT_DEF);
		createEAttribute(uxEndpointDefEClass, UX_ENDPOINT_DEF__FINAL);
		createEAttribute(uxEndpointDefEClass, UX_ENDPOINT_DEF__NAME);
		createEReference(uxEndpointDefEClass, UX_ENDPOINT_DEF__JVM_TYPE);
		createEAttribute(uxEndpointDefEClass, UX_ENDPOINT_DEF__LISTBINDING);

		uxValueBindingEndpointDefEClass = createEClass(UX_VALUE_BINDING_ENDPOINT_DEF);

		uxListBindingEndpointDefEClass = createEClass(UX_LIST_BINDING_ENDPOINT_DEF);

		uxSetBindingEndpointDefEClass = createEClass(UX_SET_BINDING_ENDPOINT_DEF);

		uxAvailableVisibilityOptionsEClass = createEClass(UX_AVAILABLE_VISIBILITY_OPTIONS);
		createEReference(uxAvailableVisibilityOptionsEClass, UX_AVAILABLE_VISIBILITY_OPTIONS__OPTIONS);

		uxVisibilityOptionEClass = createEClass(UX_VISIBILITY_OPTION);
		createEAttribute(uxVisibilityOptionEClass, UX_VISIBILITY_OPTION__NAME);
		createEReference(uxVisibilityOptionEClass, UX_VISIBILITY_OPTION__JVM_TYPE);

		uxAvailableValidatorPropertiesEClass = createEClass(UX_AVAILABLE_VALIDATOR_PROPERTIES);
		createEReference(uxAvailableValidatorPropertiesEClass, UX_AVAILABLE_VALIDATOR_PROPERTIES__PROPERTIES);

		uxValidatorPropertyEClass = createEClass(UX_VALIDATOR_PROPERTY);
		createEAttribute(uxValidatorPropertyEClass, UX_VALIDATOR_PROPERTY__NAME);
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
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uxImportSectionDeclarationEClass.getESuperTypes().add(theXtypePackage.getXImportDeclaration());
		uxValueBindingEndpointDefEClass.getESuperTypes().add(this.getUxEndpointDef());
		uxListBindingEndpointDefEClass.getESuperTypes().add(this.getUxEndpointDef());
		uxSetBindingEndpointDefEClass.getESuperTypes().add(this.getUxEndpointDef());

		// Initialize classes and features; add operations and parameters
		initEClass(uxModelEClass, UxModel.class, "UxModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUxModel_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, UxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxModel_ElementDefinitions(), this.getUxElementDefinition(), null, "elementDefinitions", null, 0, -1, UxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxImportSectionDeclarationEClass, UxImportSectionDeclaration.class, "UxImportSectionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUxImportSectionDeclaration_ImportedEPackage(), this.getUxEPackageImport(), null, "importedEPackage", null, 0, 1, UxImportSectionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxEPackageImportEClass, UxEPackageImport.class, "UxEPackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUxEPackageImport_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, UxEPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxEPackageImport_EPackage(), ecorePackage.getEPackage(), null, "ePackage", null, 1, 1, UxEPackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxElementDefinitionEClass, UxElementDefinition.class, "UxElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUxElementDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, UxElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxElementDefinition_Uri(), this.getUxElementURI(), null, "uri", null, 0, 1, UxElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxElementDefinition_BindingContainer(), this.getUxAvailableBindings(), null, "bindingContainer", null, 0, 1, UxElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxElementDefinition_VisibilityContainer(), this.getUxAvailableVisibilityOptions(), null, "visibilityContainer", null, 0, 1, UxElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxElementDefinition_ValidatorContainer(), this.getUxAvailableValidatorProperties(), null, "validatorContainer", null, 0, 1, UxElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxElementURIEClass, UxElementURI.class, "UxElementURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUxElementURI_EPackage(), this.getUxEPackageImport(), null, "ePackage", null, 0, 1, UxElementURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxElementURI_EClass(), ecorePackage.getEClass(), null, "eClass", null, 0, 1, UxElementURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxAvailableBindingsEClass, UxAvailableBindings.class, "UxAvailableBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUxAvailableBindings_Bindings(), this.getUxEndpointDef(), null, "bindings", null, 0, -1, UxAvailableBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxEndpointDefEClass, UxEndpointDef.class, "UxEndpointDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUxEndpointDef_Final(), ecorePackage.getEBoolean(), "final", null, 0, 1, UxEndpointDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUxEndpointDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, UxEndpointDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxEndpointDef_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UxEndpointDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUxEndpointDef_Listbinding(), ecorePackage.getEBoolean(), "listbinding", null, 0, 1, UxEndpointDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxValueBindingEndpointDefEClass, UxValueBindingEndpointDef.class, "UxValueBindingEndpointDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uxListBindingEndpointDefEClass, UxListBindingEndpointDef.class, "UxListBindingEndpointDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uxSetBindingEndpointDefEClass, UxSetBindingEndpointDef.class, "UxSetBindingEndpointDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uxAvailableVisibilityOptionsEClass, UxAvailableVisibilityOptions.class, "UxAvailableVisibilityOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUxAvailableVisibilityOptions_Options(), this.getUxVisibilityOption(), null, "options", null, 0, -1, UxAvailableVisibilityOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxVisibilityOptionEClass, UxVisibilityOption.class, "UxVisibilityOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUxVisibilityOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, UxVisibilityOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUxVisibilityOption_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UxVisibilityOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxAvailableValidatorPropertiesEClass, UxAvailableValidatorProperties.class, "UxAvailableValidatorProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUxAvailableValidatorProperties_Properties(), this.getUxValidatorProperty(), null, "properties", null, 0, -1, UxAvailableValidatorProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uxValidatorPropertyEClass, UxValidatorProperty.class, "UxValidatorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUxValidatorProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, UxValidatorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UiSemanticsPackageImpl
