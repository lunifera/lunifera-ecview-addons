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
	String eNS_URI = "http://www.lunifera.org/ecview/uisemantics/UISemantics";

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
	 * The number of structural features of the '<em>Ux Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.XImportDeclarationImpl <em>XImport Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.XImportDeclarationImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getXImportDeclaration()
	 * @generated
	 */
	int XIMPORT_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION__WILDCARD = XtypePackage.XIMPORT_DECLARATION__WILDCARD;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION__EXTENSION = XtypePackage.XIMPORT_DECLARATION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION__STATIC = XtypePackage.XIMPORT_DECLARATION__STATIC;

	/**
	 * The feature id for the '<em><b>Imported Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION__IMPORTED_TYPE = XtypePackage.XIMPORT_DECLARATION__IMPORTED_TYPE;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION__MEMBER_NAME = XtypePackage.XIMPORT_DECLARATION__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION__IMPORTED_NAMESPACE = XtypePackage.XIMPORT_DECLARATION__IMPORTED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Imported EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION__IMPORTED_EPACKAGE = XtypePackage.XIMPORT_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XImport Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XIMPORT_DECLARATION_FEATURE_COUNT = XtypePackage.XIMPORT_DECLARATION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl <em>Ux Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxElementDefinitionImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxElementDefinition()
	 * @generated
	 */
	int UX_ELEMENT_DEFINITION = 3;

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
	 * The number of structural features of the '<em>Ux Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ELEMENT_DEFINITION_FEATURE_COUNT = 3;

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
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableBindingsImpl <em>Ux Available Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxAvailableBindingsImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxAvailableBindings()
	 * @generated
	 */
	int UX_AVAILABLE_BINDINGS = 5;

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
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl <em>Ux Endpoint Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxEndpointDef()
	 * @generated
	 */
	int UX_ENDPOINT_DEF = 6;

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
	 * The number of structural features of the '<em>Ux Endpoint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_ENDPOINT_DEF_FEATURE_COUNT = 3;

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
	 * The number of structural features of the '<em>Ux Value Binding Endpoint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_VALUE_BINDING_ENDPOINT_DEF_FEATURE_COUNT = UX_ENDPOINT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxListBindingEndpointDefImpl <em>Ux List Binding Endpoint Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxListBindingEndpointDefImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxListBindingEndpointDef()
	 * @generated
	 */
	int UX_LIST_BINDING_ENDPOINT_DEF = 8;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_LIST_BINDING_ENDPOINT_DEF__FINAL = UX_ENDPOINT_DEF__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_LIST_BINDING_ENDPOINT_DEF__NAME = UX_ENDPOINT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_LIST_BINDING_ENDPOINT_DEF__JVM_TYPE = UX_ENDPOINT_DEF__JVM_TYPE;

	/**
	 * The number of structural features of the '<em>Ux List Binding Endpoint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_LIST_BINDING_ENDPOINT_DEF_FEATURE_COUNT = UX_ENDPOINT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxSetBindingEndpointDefImpl <em>Ux Set Binding Endpoint Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxSetBindingEndpointDefImpl
	 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxSetBindingEndpointDef()
	 * @generated
	 */
	int UX_SET_BINDING_ENDPOINT_DEF = 9;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_SET_BINDING_ENDPOINT_DEF__FINAL = UX_ENDPOINT_DEF__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_SET_BINDING_ENDPOINT_DEF__NAME = UX_ENDPOINT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_SET_BINDING_ENDPOINT_DEF__JVM_TYPE = UX_ENDPOINT_DEF__JVM_TYPE;

	/**
	 * The number of structural features of the '<em>Ux Set Binding Endpoint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UX_SET_BINDING_ENDPOINT_DEF_FEATURE_COUNT = UX_ENDPOINT_DEF_FEATURE_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.XImportDeclaration <em>XImport Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XImport Declaration</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.XImportDeclaration
	 * @generated
	 */
	EClass getXImportDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uisemantics.XImportDeclaration#getImportedEPackage <em>Imported EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported EPackage</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.XImportDeclaration#getImportedEPackage()
	 * @see #getXImportDeclaration()
	 * @generated
	 */
	EReference getXImportDeclaration_ImportedEPackage();

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
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef <em>Ux Value Binding Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Value Binding Endpoint Def</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef
	 * @generated
	 */
	EClass getUxValueBindingEndpointDef();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxListBindingEndpointDef <em>Ux List Binding Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux List Binding Endpoint Def</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxListBindingEndpointDef
	 * @generated
	 */
	EClass getUxListBindingEndpointDef();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uisemantics.UxSetBindingEndpointDef <em>Ux Set Binding Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ux Set Binding Endpoint Def</em>'.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxSetBindingEndpointDef
	 * @generated
	 */
	EClass getUxSetBindingEndpointDef();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.XImportDeclarationImpl <em>XImport Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.XImportDeclarationImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getXImportDeclaration()
		 * @generated
		 */
		EClass XIMPORT_DECLARATION = eINSTANCE.getXImportDeclaration();

		/**
		 * The meta object literal for the '<em><b>Imported EPackage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XIMPORT_DECLARATION__IMPORTED_EPACKAGE = eINSTANCE.getXImportDeclaration_ImportedEPackage();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxValueBindingEndpointDefImpl <em>Ux Value Binding Endpoint Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxValueBindingEndpointDefImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxValueBindingEndpointDef()
		 * @generated
		 */
		EClass UX_VALUE_BINDING_ENDPOINT_DEF = eINSTANCE.getUxValueBindingEndpointDef();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxListBindingEndpointDefImpl <em>Ux List Binding Endpoint Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxListBindingEndpointDefImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxListBindingEndpointDef()
		 * @generated
		 */
		EClass UX_LIST_BINDING_ENDPOINT_DEF = eINSTANCE.getUxListBindingEndpointDef();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uisemantics.impl.UxSetBindingEndpointDefImpl <em>Ux Set Binding Endpoint Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UxSetBindingEndpointDefImpl
		 * @see org.lunifera.ecview.semantic.uisemantics.impl.UiSemanticsPackageImpl#getUxSetBindingEndpointDef()
		 * @generated
		 */
		EClass UX_SET_BINDING_ENDPOINT_DEF = eINSTANCE.getUxSetBindingEndpointDef();

	}

} //UiSemanticsPackage
