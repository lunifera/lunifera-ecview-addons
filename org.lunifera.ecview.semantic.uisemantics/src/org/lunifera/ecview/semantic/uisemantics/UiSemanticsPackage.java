/**
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xtype.XtypePackage;

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
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsFactory
 * @model kind="package"
 * @generated
 */
public interface UiSemanticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uisemantics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/ecview/dsl/uimodel/semantics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uisemantics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiSemanticsPackage eINSTANCE = org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxModelImpl <em>Ux Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxModelImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxModel()
	 * @generated
	 */
	int UX_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_MODEL__IMPORT_SECTION = 0;

	/**
	 * The feature id for the '<em><b>Element Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_MODEL__ELEMENT_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>View Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_MODEL__VIEW_ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_MODEL__CATEGORIES = 3;

	/**
	 * The number of structural features of the '<em>Ux Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEPackageImportImpl <em>Ux EPackage Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxEPackageImportImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxEPackageImport()
	 * @generated
	 */
	int UX_EPACKAGE_IMPORT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl <em>Ux Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxElementDefinition()
	 * @generated
	 */
	int UX_ELEMENT_DEFINITION = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementURIImpl <em>Ux Element URI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxElementURIImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxElementURI()
	 * @generated
	 */
	int UX_ELEMENT_URI = 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableBindingsImpl <em>Ux Available Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableBindingsImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAvailableBindings()
	 * @generated
	 */
	int UX_AVAILABLE_BINDINGS = 5;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl <em>Ux Endpoint Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxEndpointDef()
	 * @generated
	 */
	int UX_ENDPOINT_DEF = 10;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxValueBindingEndpointDefImpl <em>Ux Value Binding Endpoint Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxValueBindingEndpointDefImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxValueBindingEndpointDef()
	 * @generated
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF = 7;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxImportSectionDeclarationImpl <em>Ux Import Section Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxImportSectionDeclarationImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxImportSectionDeclaration()
	 * @generated
	 */
	int UX_IMPORT_SECTION_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION__WILDCARD = XtypePackage.XIMPORT_DECLARATION__WILDCARD;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION__EXTENSION = XtypePackage.XIMPORT_DECLARATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION__STATIC = XtypePackage.XIMPORT_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imported Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION__IMPORTED_TYPE = XtypePackage.XIMPORT_DECLARATION__IMPORTED_TYPE;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION__MEMBER_NAME = XtypePackage.XIMPORT_DECLARATION__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION__IMPORTED_NAMESPACE = XtypePackage.XIMPORT_DECLARATION__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Imported EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE = XtypePackage.XIMPORT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ux Import Section Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_IMPORT_SECTION_DECLARATION_FEATURE_COUNT = XtypePackage.XIMPORT_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_EPACKAGE_IMPORT__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_EPACKAGE_IMPORT__EPACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Ux EPackage Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_EPACKAGE_IMPORT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_DEFINITION__URI = 1;

	/**
	 * The feature id for the '<em><b>Binding Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_DEFINITION__BINDING_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Visibility Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Validator Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER = 4;

	/**
	 * The number of structural features of the '<em>Ux Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_URI__EPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_URI__ECLASS = 1;

	/**
	 * The number of structural features of the '<em>Ux Element URI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_URI_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_AVAILABLE_BINDINGS__BINDINGS = 0;

	/**
	 * The number of structural features of the '<em>Ux Available Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_AVAILABLE_BINDINGS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableVisibilityOptionsImpl <em>Ux Available Visibility Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableVisibilityOptionsImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAvailableVisibilityOptions()
	 * @generated
	 */
	int UX_AVAILABLE_VISIBILITY_OPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_AVAILABLE_VISIBILITY_OPTIONS__BINDINGS = 0;

	/**
	 * The number of structural features of the '<em>Ux Available Visibility Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_AVAILABLE_VISIBILITY_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ENDPOINT_DEF__FINAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ENDPOINT_DEF__NAME = 1;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ENDPOINT_DEF__JVM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Listbinding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ENDPOINT_DEF__LISTBINDING = 3;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ENDPOINT_DEF__TARGET_NAME = 4;

	/**
	 * The number of structural features of the '<em>Ux Endpoint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ENDPOINT_DEF_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF__FINAL = UX_ENDPOINT_DEF__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF__NAME = UX_ENDPOINT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF__JVM_TYPE = UX_ENDPOINT_DEF__JVM_TYPE;

	/**
	 * The feature id for the '<em><b>Listbinding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF__LISTBINDING = UX_ENDPOINT_DEF__LISTBINDING;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF__TARGET_NAME = UX_ENDPOINT_DEF__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Ux Value Binding Endpoint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF_FEATURE_COUNT = UX_ENDPOINT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableValidatorPropertiesImpl <em>Ux Available Validator Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableValidatorPropertiesImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAvailableValidatorProperties()
	 * @generated
	 */
	int UX_AVAILABLE_VALIDATOR_PROPERTIES = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_AVAILABLE_VALIDATOR_PROPERTIES__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Ux Available Validator Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_AVAILABLE_VALIDATOR_PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxValidatorPropertyImpl <em>Ux Validator Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxValidatorPropertyImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxValidatorProperty()
	 * @generated
	 */
	int UX_VALIDATOR_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALIDATOR_PROPERTY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Ux Validator Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALIDATOR_PROPERTY_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxBindingableOptionImpl <em>Ux Bindingable Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxBindingableOptionImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxBindingableOption()
	 * @generated
	 */
	int UX_BINDINGABLE_OPTION = 11;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_BINDINGABLE_OPTION__FINAL = UX_ENDPOINT_DEF__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_BINDINGABLE_OPTION__NAME = UX_ENDPOINT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_BINDINGABLE_OPTION__JVM_TYPE = UX_ENDPOINT_DEF__JVM_TYPE;

	/**
	 * The feature id for the '<em><b>Listbinding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_BINDINGABLE_OPTION__LISTBINDING = UX_ENDPOINT_DEF__LISTBINDING;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_BINDINGABLE_OPTION__TARGET_NAME = UX_ENDPOINT_DEF__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Ux Bindingable Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_BINDINGABLE_OPTION_FEATURE_COUNT = UX_ENDPOINT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxVisibleableOptionImpl <em>Ux Visibleable Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxVisibleableOptionImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxVisibleableOption()
	 * @generated
	 */
	int UX_VISIBLEABLE_OPTION = 12;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VISIBLEABLE_OPTION__FINAL = UX_ENDPOINT_DEF__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VISIBLEABLE_OPTION__NAME = UX_ENDPOINT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VISIBLEABLE_OPTION__JVM_TYPE = UX_ENDPOINT_DEF__JVM_TYPE;

	/**
	 * The feature id for the '<em><b>Listbinding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VISIBLEABLE_OPTION__LISTBINDING = UX_ENDPOINT_DEF__LISTBINDING;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VISIBLEABLE_OPTION__TARGET_NAME = UX_ENDPOINT_DEF__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Ux Visibleable Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VISIBLEABLE_OPTION_FEATURE_COUNT = UX_ENDPOINT_DEF_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxActionImpl <em>Ux Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxActionImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAction()
	 * @generated
	 */
	int UX_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>External Command Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ACTION__EXTERNAL_COMMAND_ID = 1;

	/**
	 * The feature id for the '<em><b>Initial Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ACTION__INITIAL_DISABLED = 2;

	/**
	 * The number of structural features of the '<em>Ux Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ACTION_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxViewCategoryImpl <em>Ux View Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxViewCategoryImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxViewCategory()
	 * @generated
	 */
	int UX_VIEW_CATEGORY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VIEW_CATEGORY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Ux View Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VIEW_CATEGORY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxModel <em>Ux Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Model</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxModel
	 * @generated
	 */
	EClass getUxModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getImportSection <em>Import Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Section</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxModel#getImportSection()
	 * @see #getUxModel()
	 * @generated
	 */
	EReference getUxModel_ImportSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getElementDefinitions <em>Element Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Definitions</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxModel#getElementDefinitions()
	 * @see #getUxModel()
	 * @generated
	 */
	EReference getUxModel_ElementDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getViewActions <em>View Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Actions</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxModel#getViewActions()
	 * @see #getUxModel()
	 * @generated
	 */
	EReference getUxModel_ViewActions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uisemantics.UxModel#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxModel#getCategories()
	 * @see #getUxModel()
	 * @generated
	 */
	EReference getUxModel_Categories();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxEPackageImport <em>Ux EPackage Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux EPackage Import</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEPackageImport
	 * @generated
	 */
	EClass getUxEPackageImport();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxEPackageImport#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEPackageImport#getAlias()
	 * @see #getUxEPackageImport()
	 * @generated
	 */
	EAttribute getUxEPackageImport_Alias();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uisemantics.UxEPackageImport#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEPackageImport#getEPackage()
	 * @see #getUxEPackageImport()
	 * @generated
	 */
	EReference getUxEPackageImport_EPackage();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition <em>Ux Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Element Definition</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementDefinition
	 * @generated
	 */
	EClass getUxElementDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getName()
	 * @see #getUxElementDefinition()
	 * @generated
	 */
	EAttribute getUxElementDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uri</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getUri()
	 * @see #getUxElementDefinition()
	 * @generated
	 */
	EReference getUxElementDefinition_Uri();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getBindingContainer <em>Binding Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Container</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getBindingContainer()
	 * @see #getUxElementDefinition()
	 * @generated
	 */
	EReference getUxElementDefinition_BindingContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getVisibilityContainer <em>Visibility Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility Container</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getVisibilityContainer()
	 * @see #getUxElementDefinition()
	 * @generated
	 */
	EReference getUxElementDefinition_VisibilityContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getValidatorContainer <em>Validator Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator Container</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getValidatorContainer()
	 * @see #getUxElementDefinition()
	 * @generated
	 */
	EReference getUxElementDefinition_ValidatorContainer();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI <em>Ux Element URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Element URI</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementURI
	 * @generated
	 */
	EClass getUxElementURI();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEPackage()
	 * @see #getUxElementURI()
	 * @generated
	 */
	EReference getUxElementURI_EPackage();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementURI#getEClass()
	 * @see #getUxElementURI()
	 * @generated
	 */
	EReference getUxElementURI_EClass();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings <em>Ux Available Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Available Bindings</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings
	 * @generated
	 */
	EClass getUxAvailableBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings#getBindings()
	 * @see #getUxAvailableBindings()
	 * @generated
	 */
	EReference getUxAvailableBindings_Bindings();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions <em>Ux Available Visibility Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Available Visibility Options</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions
	 * @generated
	 */
	EClass getUxAvailableVisibilityOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions#getBindings()
	 * @see #getUxAvailableVisibilityOptions()
	 * @generated
	 */
	EReference getUxAvailableVisibilityOptions_Bindings();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef <em>Ux Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Endpoint Def</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEndpointDef
	 * @generated
	 */
	EClass getUxEndpointDef();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isFinal()
	 * @see #getUxEndpointDef()
	 * @generated
	 */
	EAttribute getUxEndpointDef_Final();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getName()
	 * @see #getUxEndpointDef()
	 * @generated
	 */
	EAttribute getUxEndpointDef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getJvmType <em>Jvm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jvm Type</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getJvmType()
	 * @see #getUxEndpointDef()
	 * @generated
	 */
	EReference getUxEndpointDef_JvmType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isListbinding <em>Listbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listbinding</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isListbinding()
	 * @see #getUxEndpointDef()
	 * @generated
	 */
	EAttribute getUxEndpointDef_Listbinding();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getTargetName()
	 * @see #getUxEndpointDef()
	 * @generated
	 */
	EAttribute getUxEndpointDef_TargetName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef <em>Ux Value Binding Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Value Binding Endpoint Def</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef
	 * @generated
	 */
	EClass getUxValueBindingEndpointDef();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties <em>Ux Available Validator Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Available Validator Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties
	 * @generated
	 */
	EClass getUxAvailableValidatorProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties#getProperties()
	 * @see #getUxAvailableValidatorProperties()
	 * @generated
	 */
	EReference getUxAvailableValidatorProperties_Properties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxValidatorProperty <em>Ux Validator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Validator Property</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxValidatorProperty
	 * @generated
	 */
	EClass getUxValidatorProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxValidatorProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxValidatorProperty#getName()
	 * @see #getUxValidatorProperty()
	 * @generated
	 */
	EAttribute getUxValidatorProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxBindingableOption <em>Ux Bindingable Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Bindingable Option</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxBindingableOption
	 * @generated
	 */
	EClass getUxBindingableOption();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxVisibleableOption <em>Ux Visibleable Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Visibleable Option</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxVisibleableOption
	 * @generated
	 */
	EClass getUxVisibleableOption();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxAction <em>Ux Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Action</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAction
	 * @generated
	 */
	EClass getUxAction();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAction#getName()
	 * @see #getUxAction()
	 * @generated
	 */
	EAttribute getUxAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxAction#getExternalCommandId <em>External Command Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Command Id</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAction#getExternalCommandId()
	 * @see #getUxAction()
	 * @generated
	 */
	EAttribute getUxAction_ExternalCommandId();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxAction#isInitialDisabled <em>Initial Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Disabled</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAction#isInitialDisabled()
	 * @see #getUxAction()
	 * @generated
	 */
	EAttribute getUxAction_InitialDisabled();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxViewCategory <em>Ux View Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux View Category</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxViewCategory
	 * @generated
	 */
	EClass getUxViewCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uisemantics.UxViewCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxViewCategory#getName()
	 * @see #getUxViewCategory()
	 * @generated
	 */
	EAttribute getUxViewCategory_Name();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration <em>Ux Import Section Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Import Section Declaration</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration
	 * @generated
	 */
	EClass getUxImportSectionDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration#getImportedEPackage <em>Imported EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported EPackage</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration#getImportedEPackage()
	 * @see #getUxImportSectionDeclaration()
	 * @generated
	 */
	EReference getUxImportSectionDeclaration_ImportedEPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiSemanticsFactory getUiSemanticsFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxModelImpl <em>Ux Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxModelImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxModel()
		 * @generated
		 */
		EClass UX_MODEL = eINSTANCE.getUxModel();

		/**
		 * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_MODEL__IMPORT_SECTION = eINSTANCE.getUxModel_ImportSection();

		/**
		 * The meta object literal for the '<em><b>Element Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_MODEL__ELEMENT_DEFINITIONS = eINSTANCE.getUxModel_ElementDefinitions();

		/**
		 * The meta object literal for the '<em><b>View Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_MODEL__VIEW_ACTIONS = eINSTANCE.getUxModel_ViewActions();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_MODEL__CATEGORIES = eINSTANCE.getUxModel_Categories();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEPackageImportImpl <em>Ux EPackage Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxEPackageImportImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxEPackageImport()
		 * @generated
		 */
		EClass UX_EPACKAGE_IMPORT = eINSTANCE.getUxEPackageImport();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_EPACKAGE_IMPORT__ALIAS = eINSTANCE.getUxEPackageImport_Alias();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_EPACKAGE_IMPORT__EPACKAGE = eINSTANCE.getUxEPackageImport_EPackage();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl <em>Ux Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxElementDefinition()
		 * @generated
		 */
		EClass UX_ELEMENT_DEFINITION = eINSTANCE.getUxElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ELEMENT_DEFINITION__NAME = eINSTANCE.getUxElementDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_ELEMENT_DEFINITION__URI = eINSTANCE.getUxElementDefinition_Uri();

		/**
		 * The meta object literal for the '<em><b>Binding Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_ELEMENT_DEFINITION__BINDING_CONTAINER = eINSTANCE.getUxElementDefinition_BindingContainer();

		/**
		 * The meta object literal for the '<em><b>Visibility Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_ELEMENT_DEFINITION__VISIBILITY_CONTAINER = eINSTANCE.getUxElementDefinition_VisibilityContainer();

		/**
		 * The meta object literal for the '<em><b>Validator Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_ELEMENT_DEFINITION__VALIDATOR_CONTAINER = eINSTANCE.getUxElementDefinition_ValidatorContainer();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementURIImpl <em>Ux Element URI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxElementURIImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxElementURI()
		 * @generated
		 */
		EClass UX_ELEMENT_URI = eINSTANCE.getUxElementURI();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_ELEMENT_URI__EPACKAGE = eINSTANCE.getUxElementURI_EPackage();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_ELEMENT_URI__ECLASS = eINSTANCE.getUxElementURI_EClass();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableBindingsImpl <em>Ux Available Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableBindingsImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAvailableBindings()
		 * @generated
		 */
		EClass UX_AVAILABLE_BINDINGS = eINSTANCE.getUxAvailableBindings();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_AVAILABLE_BINDINGS__BINDINGS = eINSTANCE.getUxAvailableBindings_Bindings();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableVisibilityOptionsImpl <em>Ux Available Visibility Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableVisibilityOptionsImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAvailableVisibilityOptions()
		 * @generated
		 */
		EClass UX_AVAILABLE_VISIBILITY_OPTIONS = eINSTANCE.getUxAvailableVisibilityOptions();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_AVAILABLE_VISIBILITY_OPTIONS__BINDINGS = eINSTANCE.getUxAvailableVisibilityOptions_Bindings();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl <em>Ux Endpoint Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxEndpointDef()
		 * @generated
		 */
		EClass UX_ENDPOINT_DEF = eINSTANCE.getUxEndpointDef();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ENDPOINT_DEF__FINAL = eINSTANCE.getUxEndpointDef_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ENDPOINT_DEF__NAME = eINSTANCE.getUxEndpointDef_Name();

		/**
		 * The meta object literal for the '<em><b>Jvm Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_ENDPOINT_DEF__JVM_TYPE = eINSTANCE.getUxEndpointDef_JvmType();

		/**
		 * The meta object literal for the '<em><b>Listbinding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ENDPOINT_DEF__LISTBINDING = eINSTANCE.getUxEndpointDef_Listbinding();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ENDPOINT_DEF__TARGET_NAME = eINSTANCE.getUxEndpointDef_TargetName();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxValueBindingEndpointDefImpl <em>Ux Value Binding Endpoint Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxValueBindingEndpointDefImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxValueBindingEndpointDef()
		 * @generated
		 */
		EClass UX_VALUE_BINDING_ENDPOINT_DEF = eINSTANCE.getUxValueBindingEndpointDef();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableValidatorPropertiesImpl <em>Ux Available Validator Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableValidatorPropertiesImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAvailableValidatorProperties()
		 * @generated
		 */
		EClass UX_AVAILABLE_VALIDATOR_PROPERTIES = eINSTANCE.getUxAvailableValidatorProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_AVAILABLE_VALIDATOR_PROPERTIES__PROPERTIES = eINSTANCE.getUxAvailableValidatorProperties_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxValidatorPropertyImpl <em>Ux Validator Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxValidatorPropertyImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxValidatorProperty()
		 * @generated
		 */
		EClass UX_VALIDATOR_PROPERTY = eINSTANCE.getUxValidatorProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_VALIDATOR_PROPERTY__NAME = eINSTANCE.getUxValidatorProperty_Name();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxBindingableOptionImpl <em>Ux Bindingable Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxBindingableOptionImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxBindingableOption()
		 * @generated
		 */
		EClass UX_BINDINGABLE_OPTION = eINSTANCE.getUxBindingableOption();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxVisibleableOptionImpl <em>Ux Visibleable Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxVisibleableOptionImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxVisibleableOption()
		 * @generated
		 */
		EClass UX_VISIBLEABLE_OPTION = eINSTANCE.getUxVisibleableOption();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxActionImpl <em>Ux Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxActionImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAction()
		 * @generated
		 */
		EClass UX_ACTION = eINSTANCE.getUxAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ACTION__NAME = eINSTANCE.getUxAction_Name();

		/**
		 * The meta object literal for the '<em><b>External Command Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ACTION__EXTERNAL_COMMAND_ID = eINSTANCE.getUxAction_ExternalCommandId();

		/**
		 * The meta object literal for the '<em><b>Initial Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_ACTION__INITIAL_DISABLED = eINSTANCE.getUxAction_InitialDisabled();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxViewCategoryImpl <em>Ux View Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxViewCategoryImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxViewCategory()
		 * @generated
		 */
		EClass UX_VIEW_CATEGORY = eINSTANCE.getUxViewCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UX_VIEW_CATEGORY__NAME = eINSTANCE.getUxViewCategory_Name();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxImportSectionDeclarationImpl <em>Ux Import Section Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxImportSectionDeclarationImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxImportSectionDeclaration()
		 * @generated
		 */
		EClass UX_IMPORT_SECTION_DECLARATION = eINSTANCE.getUxImportSectionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Imported EPackage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE = eINSTANCE.getUxImportSectionDeclaration_ImportedEPackage();

	}

} //UiSemanticsPackage
