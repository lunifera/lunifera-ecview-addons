/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBindable;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImports;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UimodelFactory;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;
import org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UimodelPackageImpl extends EPackageImpl implements UimodelPackage {
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
	private EClass uiImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiIDEViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEndpointAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEndpointDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPathSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBeanSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRootElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMaxLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMinLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRegexpValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorEClass = null;

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
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UimodelPackageImpl() {
		super(eNS_URI, UimodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UimodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UimodelPackage init() {
		if (isInited) return (UimodelPackage)EPackage.Registry.INSTANCE.getEPackage(UimodelPackage.eNS_URI);

		// Obtain or create and register package
		UimodelPackageImpl theUimodelPackage = (UimodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UimodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UimodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExtDatatypesPackage.eINSTANCE.eClass();
		ExtensionModelPackage.eINSTANCE.eClass();
		UiSemanticsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		UiextensionPackageImpl theUiextensionPackage = (UiextensionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiextensionPackage.eNS_URI) instanceof UiextensionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiextensionPackage.eNS_URI) : UiextensionPackage.eINSTANCE);

		// Create package meta-data objects
		theUimodelPackage.createPackageContents();
		theUiextensionPackage.createPackageContents();

		// Initialize created meta-data
		theUimodelPackage.initializePackageContents();
		theUiextensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUimodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UimodelPackage.eNS_URI, theUimodelPackage);
		return theUimodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiModel() {
		return uiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiModel_PackageName() {
		return (EAttribute)uiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiModel_Roots() {
		return (EReference)uiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiModel_Imports() {
		return (EReference)uiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiImports() {
		return uiImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiImports_ImportedNamespace() {
		return (EAttribute)uiImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiView() {
		return uiViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiIDEView() {
		return uiIDEViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiIDEView_Bindings() {
		return (EReference)uiIDEViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiIDEView_BindingEndpointAlias() {
		return (EReference)uiIDEViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiPoint() {
		return uiPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiPoint_X() {
		return (EAttribute)uiPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiPoint_Y() {
		return (EAttribute)uiPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingEndpointAlias() {
		return uiBindingEndpointAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBindingEndpointAlias_Alias() {
		return (EAttribute)uiBindingEndpointAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAlias_Endpoint() {
		return (EReference)uiBindingEndpointAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingEndpointDef() {
		return uiBindingEndpointDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointDef_Bindable() {
		return (EReference)uiBindingEndpointDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointDef_SemanticEndpoint() {
		return (EReference)uiBindingEndpointDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointDef_Path() {
		return (EReference)uiBindingEndpointDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBinding() {
		return uiBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_Source() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_SourceAlias() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_TargetToSource() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_SourceToTarget() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_Target() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_TargetAlias() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiPathSegment() {
		return uiPathSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiPathSegment_JvmField() {
		return (EReference)uiPathSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiPathSegment_Path() {
		return (EReference)uiPathSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBeanSlot() {
		return uiBeanSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanSlot_JvmType() {
		return (EReference)uiBeanSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiViewSet() {
		return uiViewSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiViewSet_BindingEndpointAlias() {
		return (EReference)uiViewSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRootElements() {
		return uiRootElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiModelElement() {
		return uiModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMaxLengthValidator() {
		return uiMaxLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMinLengthValidator() {
		return uiMinLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRegexpValidator() {
		return uiRegexpValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindable() {
		return uiBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiEmbeddable() {
		return uiEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiField() {
		return uiFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiLayout() {
		return uiLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidator() {
		return uiValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelFactory getUimodelFactory() {
		return (UimodelFactory)getEFactoryInstance();
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
		uiModelEClass = createEClass(UI_MODEL);
		createEAttribute(uiModelEClass, UI_MODEL__PACKAGE_NAME);
		createEReference(uiModelEClass, UI_MODEL__ROOTS);
		createEReference(uiModelEClass, UI_MODEL__IMPORTS);

		uiImportsEClass = createEClass(UI_IMPORTS);
		createEAttribute(uiImportsEClass, UI_IMPORTS__IMPORTED_NAMESPACE);

		uiModelElementEClass = createEClass(UI_MODEL_ELEMENT);

		uiViewEClass = createEClass(UI_VIEW);

		uiIDEViewEClass = createEClass(UI_IDE_VIEW);
		createEReference(uiIDEViewEClass, UI_IDE_VIEW__BINDINGS);
		createEReference(uiIDEViewEClass, UI_IDE_VIEW__BINDING_ENDPOINT_ALIAS);

		uiPointEClass = createEClass(UI_POINT);
		createEAttribute(uiPointEClass, UI_POINT__X);
		createEAttribute(uiPointEClass, UI_POINT__Y);

		uiBindingEndpointAliasEClass = createEClass(UI_BINDING_ENDPOINT_ALIAS);
		createEAttribute(uiBindingEndpointAliasEClass, UI_BINDING_ENDPOINT_ALIAS__ALIAS);
		createEReference(uiBindingEndpointAliasEClass, UI_BINDING_ENDPOINT_ALIAS__ENDPOINT);

		uiBindingEndpointDefEClass = createEClass(UI_BINDING_ENDPOINT_DEF);
		createEReference(uiBindingEndpointDefEClass, UI_BINDING_ENDPOINT_DEF__BINDABLE);
		createEReference(uiBindingEndpointDefEClass, UI_BINDING_ENDPOINT_DEF__SEMANTIC_ENDPOINT);
		createEReference(uiBindingEndpointDefEClass, UI_BINDING_ENDPOINT_DEF__PATH);

		uiBindingEClass = createEClass(UI_BINDING);
		createEReference(uiBindingEClass, UI_BINDING__SOURCE);
		createEReference(uiBindingEClass, UI_BINDING__SOURCE_ALIAS);
		createEAttribute(uiBindingEClass, UI_BINDING__TARGET_TO_SOURCE);
		createEAttribute(uiBindingEClass, UI_BINDING__SOURCE_TO_TARGET);
		createEReference(uiBindingEClass, UI_BINDING__TARGET);
		createEReference(uiBindingEClass, UI_BINDING__TARGET_ALIAS);

		uiPathSegmentEClass = createEClass(UI_PATH_SEGMENT);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__JVM_FIELD);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__PATH);

		uiBeanSlotEClass = createEClass(UI_BEAN_SLOT);
		createEReference(uiBeanSlotEClass, UI_BEAN_SLOT__JVM_TYPE);

		uiViewSetEClass = createEClass(UI_VIEW_SET);
		createEReference(uiViewSetEClass, UI_VIEW_SET__BINDING_ENDPOINT_ALIAS);

		uiRootElementsEClass = createEClass(UI_ROOT_ELEMENTS);

		uiMaxLengthValidatorEClass = createEClass(UI_MAX_LENGTH_VALIDATOR);

		uiMinLengthValidatorEClass = createEClass(UI_MIN_LENGTH_VALIDATOR);

		uiRegexpValidatorEClass = createEClass(UI_REGEXP_VALIDATOR);

		uiBindableEClass = createEClass(UI_BINDABLE);

		uiEmbeddableEClass = createEClass(UI_EMBEDDABLE);

		uiFieldEClass = createEClass(UI_FIELD);

		uiLayoutEClass = createEClass(UI_LAYOUT);

		uiValidatorEClass = createEClass(UI_VALIDATOR);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);
		UiSemanticsPackage theUiSemanticsPackage = (UiSemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(UiSemanticsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ValidationPackage theValidationPackage = (ValidationPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);
		UiextensionPackage theUiextensionPackage = (UiextensionPackage)EPackage.Registry.INSTANCE.getEPackage(UiextensionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiModelEClass.getESuperTypes().add(this.getUiModelElement());
		uiViewEClass.getESuperTypes().add(theCoreModelPackage.getYView());
		uiViewEClass.getESuperTypes().add(this.getUiRootElements());
		uiViewEClass.getESuperTypes().add(this.getUiModelElement());
		uiIDEViewEClass.getESuperTypes().add(this.getUiView());
		uiIDEViewEClass.getESuperTypes().add(this.getUiModelElement());
		uiPointEClass.getESuperTypes().add(this.getUiModelElement());
		uiBindingEndpointAliasEClass.getESuperTypes().add(this.getUiModelElement());
		uiBindingEndpointDefEClass.getESuperTypes().add(this.getUiModelElement());
		uiBindingEClass.getESuperTypes().add(this.getUiModelElement());
		uiPathSegmentEClass.getESuperTypes().add(this.getUiModelElement());
		uiBeanSlotEClass.getESuperTypes().add(theCoreModelPackage.getYBeanSlot());
		uiBeanSlotEClass.getESuperTypes().add(this.getUiBindable());
		uiViewSetEClass.getESuperTypes().add(theCoreModelPackage.getYViewSet());
		uiViewSetEClass.getESuperTypes().add(this.getUiRootElements());
		uiRootElementsEClass.getESuperTypes().add(this.getUiModelElement());
		uiMaxLengthValidatorEClass.getESuperTypes().add(theValidationPackage.getYMaxLengthValidator());
		uiMaxLengthValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiMinLengthValidatorEClass.getESuperTypes().add(theValidationPackage.getYMinLengthValidator());
		uiMinLengthValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiRegexpValidatorEClass.getESuperTypes().add(theValidationPackage.getYRegexpValidator());
		uiRegexpValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiBindableEClass.getESuperTypes().add(this.getUiModelElement());
		uiEmbeddableEClass.getESuperTypes().add(theCoreModelPackage.getYEmbeddable());
		uiEmbeddableEClass.getESuperTypes().add(theUiextensionPackage.getUiVisibilityProcessable());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiBindable());
		uiFieldEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiLayoutEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiValidatorEClass.getESuperTypes().add(theValidationPackage.getYValidator());
		uiValidatorEClass.getESuperTypes().add(this.getUiModelElement());
		uiValidatorEClass.getESuperTypes().add(this.getUiBindable());

		// Initialize classes and features; add operations and parameters
		initEClass(uiModelEClass, UiModel.class, "UiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiModel_PackageName(), theEcorePackage.getEString(), "packageName", null, 1, 1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiModel_Roots(), this.getUiRootElements(), null, "roots", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiModel_Imports(), this.getUiImports(), null, "imports", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiImportsEClass, UiImports.class, "UiImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiImports_ImportedNamespace(), theEcorePackage.getEString(), "importedNamespace", null, 1, 1, UiImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiModelElementEClass, UiModelElement.class, "UiModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiViewEClass, UiView.class, "UiView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiIDEViewEClass, UiIDEView.class, "UiIDEView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiIDEView_Bindings(), this.getUiBinding(), null, "bindings", null, 0, -1, UiIDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiIDEView_BindingEndpointAlias(), this.getUiBindingEndpointAlias(), null, "bindingEndpointAlias", null, 0, -1, UiIDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPointEClass, UiPoint.class, "UiPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiPoint_X(), theEcorePackage.getEInt(), "x", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiPoint_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEndpointAliasEClass, UiBindingEndpointAlias.class, "UiBindingEndpointAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiBindingEndpointAlias_Alias(), theEcorePackage.getEString(), "alias", null, 1, 1, UiBindingEndpointAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointAlias_Endpoint(), this.getUiBindingEndpointDef(), null, "endpoint", null, 1, 1, UiBindingEndpointAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEndpointDefEClass, UiBindingEndpointDef.class, "UiBindingEndpointDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBindingEndpointDef_Bindable(), this.getUiBindable(), null, "bindable", null, 0, 1, UiBindingEndpointDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointDef_SemanticEndpoint(), theUiSemanticsPackage.getUxEndpointDef(), null, "semanticEndpoint", null, 0, 1, UiBindingEndpointDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointDef_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiBindingEndpointDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEClass, UiBinding.class, "UiBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBinding_Source(), this.getUiBindingEndpointDef(), null, "source", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_SourceAlias(), this.getUiBindingEndpointAlias(), null, "sourceAlias", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_TargetToSource(), theEcorePackage.getEBoolean(), "targetToSource", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_SourceToTarget(), theEcorePackage.getEBoolean(), "sourceToTarget", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_Target(), this.getUiBindingEndpointDef(), null, "target", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_TargetAlias(), this.getUiBindingEndpointAlias(), null, "targetAlias", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPathSegmentEClass, UiPathSegment.class, "UiPathSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiPathSegment_JvmField(), theTypesPackage.getJvmField(), null, "jvmField", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiPathSegment_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBeanSlotEClass, UiBeanSlot.class, "UiBeanSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBeanSlot_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiViewSetEClass, UiViewSet.class, "UiViewSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiViewSet_BindingEndpointAlias(), this.getUiBindingEndpointAlias(), null, "bindingEndpointAlias", null, 0, -1, UiViewSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRootElementsEClass, UiRootElements.class, "UiRootElements", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMaxLengthValidatorEClass, UiMaxLengthValidator.class, "UiMaxLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMinLengthValidatorEClass, UiMinLengthValidator.class, "UiMinLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiRegexpValidatorEClass, UiRegexpValidator.class, "UiRegexpValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiBindableEClass, UiBindable.class, "UiBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiEmbeddableEClass, UiEmbeddable.class, "UiEmbeddable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiFieldEClass, UiField.class, "UiField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiLayoutEClass, UiLayout.class, "UiLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiValidatorEClass, UiValidator.class, "UiValidator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UimodelPackageImpl
