/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;

import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;

import org.eclipse.xtext.common.types.TypesPackage;

import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint;
import org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UimodelFactory;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

import org.lunifera.ecview.uisemantics.UiSemanticsPackage;

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
	private EClass uiIDEViewEClass = null;

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
	private EClass uiPointEClass = null;

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
	private EClass uiSourceBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTargetBindingEndpointEClass = null;

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

		// Create package meta-data objects
		theUimodelPackage.createPackageContents();

		// Initialize created meta-data
		theUimodelPackage.initializePackageContents();

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
	public EReference getUiModel_ViewSet() {
		return (EReference)uiModelEClass.getEStructuralFeatures().get(0);
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
	public EReference getUiIDEView_Layouts() {
		return (EReference)uiIDEViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiIDEView_Bindings() {
		return (EReference)uiIDEViewEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getUiBinding_TargetToSource() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_SourceToTarget() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_Target() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSourceBindingEndpoint() {
		return uiSourceBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSourceBindingEndpoint_Embeddable() {
		return (EReference)uiSourceBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSourceBindingEndpoint_Endpoint() {
		return (EReference)uiSourceBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiSourceBindingEndpoint_Path() {
		return (EReference)uiSourceBindingEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTargetBindingEndpoint() {
		return uiTargetBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTargetBindingEndpoint_Embeddable() {
		return (EReference)uiTargetBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTargetBindingEndpoint_Endpoint() {
		return (EReference)uiTargetBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTargetBindingEndpoint_Path() {
		return (EReference)uiTargetBindingEndpointEClass.getEStructuralFeatures().get(2);
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
		createEReference(uiModelEClass, UI_MODEL__VIEW_SET);

		uiIDEViewEClass = createEClass(UI_IDE_VIEW);
		createEReference(uiIDEViewEClass, UI_IDE_VIEW__LAYOUTS);
		createEReference(uiIDEViewEClass, UI_IDE_VIEW__BINDINGS);

		uiGridLayoutAssigmentEClass = createEClass(UI_GRID_LAYOUT_ASSIGMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ELEMENT);
		createEAttribute(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__FROM);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__TO);

		uiPointEClass = createEClass(UI_POINT);
		createEAttribute(uiPointEClass, UI_POINT__X);
		createEAttribute(uiPointEClass, UI_POINT__Y);

		uiBindingEClass = createEClass(UI_BINDING);
		createEReference(uiBindingEClass, UI_BINDING__SOURCE);
		createEAttribute(uiBindingEClass, UI_BINDING__TARGET_TO_SOURCE);
		createEAttribute(uiBindingEClass, UI_BINDING__SOURCE_TO_TARGET);
		createEReference(uiBindingEClass, UI_BINDING__TARGET);

		uiSourceBindingEndpointEClass = createEClass(UI_SOURCE_BINDING_ENDPOINT);
		createEReference(uiSourceBindingEndpointEClass, UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE);
		createEReference(uiSourceBindingEndpointEClass, UI_SOURCE_BINDING_ENDPOINT__ENDPOINT);
		createEReference(uiSourceBindingEndpointEClass, UI_SOURCE_BINDING_ENDPOINT__PATH);

		uiTargetBindingEndpointEClass = createEClass(UI_TARGET_BINDING_ENDPOINT);
		createEReference(uiTargetBindingEndpointEClass, UI_TARGET_BINDING_ENDPOINT__EMBEDDABLE);
		createEReference(uiTargetBindingEndpointEClass, UI_TARGET_BINDING_ENDPOINT__ENDPOINT);
		createEReference(uiTargetBindingEndpointEClass, UI_TARGET_BINDING_ENDPOINT__PATH);

		uiPathSegmentEClass = createEClass(UI_PATH_SEGMENT);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__JVM_FIELD);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__PATH);

		uiBeanSlotEClass = createEClass(UI_BEAN_SLOT);
		createEReference(uiBeanSlotEClass, UI_BEAN_SLOT__JVM_TYPE);

		uiGridLayoutEClass = createEClass(UI_GRID_LAYOUT);
		createEReference(uiGridLayoutEClass, UI_GRID_LAYOUT__CONTENTS);

		uiTextFieldEClass = createEClass(UI_TEXT_FIELD);

		uiListEClass = createEClass(UI_LIST);
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
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);
		ExtensionModelPackage theExtensionModelPackage = (ExtensionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionModelPackage.eNS_URI);
		UiSemanticsPackage theUiSemanticsPackage = (UiSemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(UiSemanticsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiIDEViewEClass.getESuperTypes().add(theCoreModelPackage.getYView());
		uiBeanSlotEClass.getESuperTypes().add(theCoreModelPackage.getYBeanSlot());
		uiGridLayoutEClass.getESuperTypes().add(theExtensionModelPackage.getYGridLayout());
		uiTextFieldEClass.getESuperTypes().add(theExtensionModelPackage.getYTextField());
		uiListEClass.getESuperTypes().add(theExtensionModelPackage.getYList());

		// Initialize classes, features, and operations; add parameters
		initEClass(uiModelEClass, UiModel.class, "UiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiModel_ViewSet(), theCoreModelPackage.getYViewSet(), null, "viewSet", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiIDEViewEClass, UiIDEView.class, "UiIDEView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiIDEView_Layouts(), theCoreModelPackage.getYLayout(), null, "layouts", null, 0, -1, UiIDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiIDEView_Bindings(), this.getUiBinding(), null, "bindings", null, 0, -1, UiIDEView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiGridLayoutAssigmentEClass, UiGridLayoutAssigment.class, "UiGridLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayoutAssigment_Element(), theCoreModelPackage.getYEmbeddable(), null, "element", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiGridLayoutAssigment_Alignment(), theExtensionModelPackage.getYAlignment(), "alignment", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_From(), this.getUiPoint(), null, "from", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_To(), this.getUiPoint(), null, "to", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPointEClass, UiPoint.class, "UiPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEClass, UiBinding.class, "UiBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBinding_Source(), this.getUiSourceBindingEndpoint(), null, "source", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_TargetToSource(), ecorePackage.getEBoolean(), "targetToSource", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_SourceToTarget(), ecorePackage.getEBoolean(), "sourceToTarget", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_Target(), this.getUiTargetBindingEndpoint(), null, "target", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSourceBindingEndpointEClass, UiSourceBindingEndpoint.class, "UiSourceBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiSourceBindingEndpoint_Embeddable(), theCoreModelPackage.getYBindable(), null, "embeddable", null, 0, 1, UiSourceBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiSourceBindingEndpoint_Endpoint(), theUiSemanticsPackage.getUxEndpointDef(), null, "endpoint", null, 0, 1, UiSourceBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiSourceBindingEndpoint_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiSourceBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTargetBindingEndpointEClass, UiTargetBindingEndpoint.class, "UiTargetBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTargetBindingEndpoint_Embeddable(), theCoreModelPackage.getYBindable(), null, "embeddable", null, 0, 1, UiTargetBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTargetBindingEndpoint_Endpoint(), theUiSemanticsPackage.getUxEndpointDef(), null, "endpoint", null, 0, 1, UiTargetBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTargetBindingEndpoint_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiTargetBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPathSegmentEClass, UiPathSegment.class, "UiPathSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiPathSegment_JvmField(), theTypesPackage.getJvmField(), null, "jvmField", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiPathSegment_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBeanSlotEClass, UiBeanSlot.class, "UiBeanSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBeanSlot_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiGridLayoutEClass, UiGridLayout.class, "UiGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayout_Contents(), this.getUiGridLayoutAssigment(), null, "contents", null, 0, -1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTextFieldEClass, UiTextField.class, "UiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiListEClass, UiList.class, "UiList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UimodelPackageImpl
