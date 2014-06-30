/**
 */
package org.lunifera.ecview.model.uiConfigs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lunifera.ecview.model.uiConfigs.BindingMethod;
import org.lunifera.ecview.model.uiConfigs.TextFieldConfig;
import org.lunifera.ecview.model.uiConfigs.UiConfigsFactory;
import org.lunifera.ecview.model.uiConfigs.UiConfigsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiConfigsPackageImpl extends EPackageImpl implements UiConfigsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingMethodEClass = null;

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
	 * @see org.lunifera.ecview.model.uiConfigs.UiConfigsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiConfigsPackageImpl() {
		super(eNS_URI, UiConfigsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiConfigsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiConfigsPackage init() {
		if (isInited) return (UiConfigsPackage)EPackage.Registry.INSTANCE.getEPackage(UiConfigsPackage.eNS_URI);

		// Obtain or create and register package
		UiConfigsPackageImpl theUiConfigsPackage = (UiConfigsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiConfigsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiConfigsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUiConfigsPackage.createPackageContents();

		// Initialize created meta-data
		theUiConfigsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiConfigsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiConfigsPackage.eNS_URI, theUiConfigsPackage);
		return theUiConfigsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextFieldConfig() {
		return textFieldConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextFieldConfig_BindingMethods() {
		return (EReference)textFieldConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingMethod() {
		return bindingMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingMethod_Name() {
		return (EAttribute)bindingMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiConfigsFactory getUiConfigsFactory() {
		return (UiConfigsFactory)getEFactoryInstance();
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
		textFieldConfigEClass = createEClass(TEXT_FIELD_CONFIG);
		createEReference(textFieldConfigEClass, TEXT_FIELD_CONFIG__BINDING_METHODS);

		bindingMethodEClass = createEClass(BINDING_METHOD);
		createEAttribute(bindingMethodEClass, BINDING_METHOD__NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(textFieldConfigEClass, TextFieldConfig.class, "TextFieldConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextFieldConfig_BindingMethods(), this.getBindingMethod(), null, "bindingMethods", null, 0, -1, TextFieldConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingMethodEClass, BindingMethod.class, "BindingMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, BindingMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UiConfigsPackageImpl
