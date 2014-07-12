/**
 */
package org.lunifera.ecview.semantic.uimodel;

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
 * @see org.lunifera.ecview.semantic.uimodel.UiModelFactory
 * @model kind="package"
 * @generated
 */
public interface UiModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uimodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/ecview/dsl/uimodel/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uimodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiModelPackage eINSTANCE = org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiNamedElement <em>Ui Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiNamedElement
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiNamedElement()
	 * @generated
	 */
	int UI_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NAMED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NAMED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Ui Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl <em>Ui Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiModel()
	 * @generated
	 */
	int UI_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__PACKAGE_NAME = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__ROOTS = UI_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__IMPORTS = UI_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ui Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiImportsImpl <em>Ui Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiImportsImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiImports()
	 * @generated
	 */
	int UI_IMPORTS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMPORTS__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMPORTS__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMPORTS__IMPORTED_NAMESPACE = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMPORTS_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiRootElements <em>Ui Root Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiRootElements
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiRootElements()
	 * @generated
	 */
	int UI_ROOT_ELEMENTS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ROOT_ELEMENTS__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ROOT_ELEMENTS__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Ui Root Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ROOT_ELEMENTS_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl <em>Ui Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiContext()
	 * @generated
	 */
	int UI_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTEXT__ID = UI_ROOT_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTEXT__NAME = UI_ROOT_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTEXT__BEAN_SLOTS = UI_ROOT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTEXT__BINDING_ENDPOINT_ALIAS = UI_ROOT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTEXT__BINDINGS = UI_ROOT_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ui Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTEXT_FEATURE_COUNT = UI_ROOT_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl <em>Ui View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiView()
	 * @generated
	 */
	int UI_VIEW = 5;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl <em>Ui IDE View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiIDEView()
	 * @generated
	 */
	int UI_IDE_VIEW = 6;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl <em>Ui Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiPoint()
	 * @generated
	 */
	int UI_POINT = 7;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl <em>Ui Binding Endpoint Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBindingEndpointAlias()
	 * @generated
	 */
	int UI_BINDING_ENDPOINT_ALIAS = 11;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl <em>Ui Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBinding()
	 * @generated
	 */
	int UI_BINDING = 13;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl <em>Ui Path Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiPathSegment()
	 * @generated
	 */
	int UI_PATH_SEGMENT = 14;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanSlotImpl <em>Ui Bean Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBeanSlotImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBeanSlot()
	 * @generated
	 */
	int UI_BEAN_SLOT = 8;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl <em>Ui View Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiViewSet()
	 * @generated
	 */
	int UI_VIEW_SET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__ID = UI_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__NAME = UI_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__BEAN_SLOTS = UI_CONTEXT__BEAN_SLOTS;

	/**
	 * The feature id for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__BINDING_ENDPOINT_ALIAS = UI_CONTEXT__BINDING_ENDPOINT_ALIAS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__BINDINGS = UI_CONTEXT__BINDINGS;

	/**
	 * The number of structural features of the '<em>Ui View Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET_FEATURE_COUNT = UI_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__ID = UI_CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__NAME = UI_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__BEAN_SLOTS = UI_CONTEXT__BEAN_SLOTS;

	/**
	 * The feature id for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__BINDING_ENDPOINT_ALIAS = UI_CONTEXT__BINDING_ENDPOINT_ALIAS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__BINDINGS = UI_CONTEXT__BINDINGS;

	/**
	 * The feature id for the '<em><b>View Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__VIEW_SET = UI_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__CONTENT = UI_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validator Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__VALIDATOR_ASSIGNMENTS = UI_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ui View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FEATURE_COUNT = UI_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__ID = UI_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__NAME = UI_VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BEAN_SLOTS = UI_VIEW__BEAN_SLOTS;

	/**
	 * The feature id for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BINDING_ENDPOINT_ALIAS = UI_VIEW__BINDING_ENDPOINT_ALIAS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BINDINGS = UI_VIEW__BINDINGS;

	/**
	 * The feature id for the '<em><b>View Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__VIEW_SET = UI_VIEW__VIEW_SET;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__CONTENT = UI_VIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Validator Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__VALIDATOR_ASSIGNMENTS = UI_VIEW__VALIDATOR_ASSIGNMENTS;

	/**
	 * The number of structural features of the '<em>Ui IDE View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW_FEATURE_COUNT = UI_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Ui Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindable <em>Ui Typed Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindable
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiTypedBindable()
	 * @generated
	 */
	int UI_TYPED_BINDABLE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Ui Typed Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT__ID = UI_TYPED_BINDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT__NAME = UI_TYPED_BINDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT__JVM_TYPE = UI_TYPED_BINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Bean Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT_FEATURE_COUNT = UI_TYPED_BINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindable <em>Ui Raw Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiRawBindable
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiRawBindable()
	 * @generated
	 */
	int UI_RAW_BINDABLE = 15;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiValidator <em>Ui Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidator
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidator()
	 * @generated
	 */
	int UI_VALIDATOR = 37;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiMaxLengthValidatorImpl <em>Ui Max Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiMaxLengthValidatorImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiMaxLengthValidator()
	 * @generated
	 */
	int UI_MAX_LENGTH_VALIDATOR = 38;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiMinLengthValidatorImpl <em>Ui Min Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiMinLengthValidatorImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiMinLengthValidator()
	 * @generated
	 */
	int UI_MIN_LENGTH_VALIDATOR = 39;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiRegexpValidatorImpl <em>Ui Regexp Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiRegexpValidatorImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiRegexpValidator()
	 * @generated
	 */
	int UI_REGEXP_VALIDATOR = 40;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiXbaseValidatorImpl <em>Ui Xbase Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiXbaseValidatorImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiXbaseValidator()
	 * @generated
	 */
	int UI_XBASE_VALIDATOR = 41;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingExpression <em>Ui Binding Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingExpression
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBindingExpression()
	 * @generated
	 */
	int UI_BINDING_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Ui Binding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS__ID = UI_TYPED_BINDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS__NAME = UI_TYPED_BINDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS__ALIAS = UI_TYPED_BINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS__ENDPOINT = UI_TYPED_BINDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Binding Endpoint Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS_FEATURE_COUNT = UI_TYPED_BINDABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl <em>Ui Binding Endpoint Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBindingEndpointAssignment()
	 * @generated
	 */
	int UI_BINDING_ENDPOINT_ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ASSIGNMENT__ID = UI_TYPED_BINDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ASSIGNMENT__NAME = UI_TYPED_BINDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Typed Bindable Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF = UI_TYPED_BINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ASSIGNMENT__PATH = UI_TYPED_BINDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Typed Bindable Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS = UI_TYPED_BINDABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ui Binding Endpoint Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ASSIGNMENT_FEATURE_COUNT = UI_TYPED_BINDABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Source Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__SOURCE_ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Target To Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__TARGET_TO_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Source To Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__SOURCE_TO_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Target Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__TARGET_ALIAS = 5;

	/**
	 * The number of structural features of the '<em>Ui Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Jvm Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PATH_SEGMENT__JVM_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PATH_SEGMENT__PATH = 1;

	/**
	 * The number of structural features of the '<em>Ui Path Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PATH_SEGMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RAW_BINDABLE__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RAW_BINDABLE__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Ui Raw Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_RAW_BINDABLE_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl <em>Ui Typed Bindable Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiTypedBindableDef()
	 * @generated
	 */
	int UI_TYPED_BINDABLE_DEF = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE_DEF__ID = UI_TYPED_BINDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE_DEF__NAME = UI_TYPED_BINDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Raw Bindable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE_DEF__RAW_BINDABLE = UI_TYPED_BINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE_DEF__METHOD = UI_TYPED_BINDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Typed Bindable Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TYPED_BINDABLE_DEF_FEATURE_COUNT = UI_TYPED_BINDABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessableImpl <em>Ui Visibility Processable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessableImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessable()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSABLE = 27;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT = 0;

	/**
	 * The number of structural features of the '<em>Ui Visibility Processable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiEmbeddable <em>Ui Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiEmbeddable
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiEmbeddable()
	 * @generated
	 */
	int UI_EMBEDDABLE = 18;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMBEDDABLE__PROCESSOR_ASSIGNMENT = UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMBEDDABLE__ID = UI_VISIBILITY_PROCESSABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMBEDDABLE__NAME = UI_VISIBILITY_PROCESSABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMBEDDABLE_FEATURE_COUNT = UI_VISIBILITY_PROCESSABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiField <em>Ui Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiField
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiField()
	 * @generated
	 */
	int UI_FIELD = 19;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__PROCESSOR_ASSIGNMENT = UI_EMBEDDABLE__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__ID = UI_EMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__NAME = UI_EMBEDDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD__VALIDATORS = UI_EMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FIELD_FEATURE_COUNT = UI_EMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.UiLayout <em>Ui Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.UiLayout
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiLayout()
	 * @generated
	 */
	int UI_LAYOUT = 20;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__PROCESSOR_ASSIGNMENT = UI_EMBEDDABLE__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__ID = UI_EMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__NAME = UI_EMBEDDABLE__NAME;

	/**
	 * The number of structural features of the '<em>Ui Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT_FEATURE_COUNT = UI_EMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiGridLayoutAssigment()
	 * @generated
	 */
	int UI_GRID_LAYOUT_ASSIGMENT = 21;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__TO = 2;

	/**
	 * The number of structural features of the '<em>Ui Grid Layout Assigment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl <em>Ui Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiGridLayout()
	 * @generated
	 */
	int UI_GRID_LAYOUT = 22;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT = UI_LAYOUT__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__ID = UI_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__NAME = UI_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__CONTENTS = UI_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_FEATURE_COUNT = UI_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiTextFieldImpl <em>Ui Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiTextFieldImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiTextField()
	 * @generated
	 */
	int UI_TEXT_FIELD = 23;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__PROCESSOR_ASSIGNMENT = UI_FIELD__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__ID = UI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__NAME = UI_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__VALIDATORS = UI_FIELD__VALIDATORS;

	/**
	 * The number of structural features of the '<em>Ui Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD_FEATURE_COUNT = UI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl <em>Ui List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiListImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiList()
	 * @generated
	 */
	int UI_LIST = 24;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__PROCESSOR_ASSIGNMENT = UI_FIELD__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__ID = UI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__NAME = UI_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__VALIDATORS = UI_FIELD__VALIDATORS;

	/**
	 * The number of structural features of the '<em>Ui List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_FEATURE_COUNT = UI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiNumericFieldImpl <em>Ui Numeric Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiNumericFieldImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiNumericField()
	 * @generated
	 */
	int UI_NUMERIC_FIELD = 25;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__PROCESSOR_ASSIGNMENT = UI_FIELD__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__ID = UI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__NAME = UI_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__VALIDATORS = UI_FIELD__VALIDATORS;

	/**
	 * The number of structural features of the '<em>Ui Numeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD_FEATURE_COUNT = UI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiCheckBoxImpl <em>Ui Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiCheckBoxImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiCheckBox()
	 * @generated
	 */
	int UI_CHECK_BOX = 26;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__PROCESSOR_ASSIGNMENT = UI_FIELD__PROCESSOR_ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__ID = UI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__NAME = UI_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__VALIDATORS = UI_FIELD__VALIDATORS;

	/**
	 * The number of structural features of the '<em>Ui Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX_FEATURE_COUNT = UI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl <em>Ui Visibility Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessor()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSOR = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__BINDING_ALIAS = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER = UI_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__RULE = UI_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT = UI_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ui Visibility Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorDefImpl <em>Ui Visibility Processor Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorDefImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessorDef()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSOR_DEF = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_DEF__ID = UI_ROOT_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_DEF__NAME = UI_ROOT_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_DEF__PROCESSOR = UI_ROOT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Visibility Processor Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_DEF_FEATURE_COUNT = UI_ROOT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorAssignmentImpl <em>Ui Visibility Processor Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorAssignmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessorAssignment()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT = 30;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Processor Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Ui Visibility Processor Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiChangeTriggerImpl <em>Ui Change Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiChangeTriggerImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiChangeTrigger()
	 * @generated
	 */
	int UI_CHANGE_TRIGGER = 31;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHANGE_TRIGGER__ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Endpoint Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHANGE_TRIGGER__ENDPOINT_ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Ui Change Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHANGE_TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityRuleImpl <em>Ui Visibility Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityRuleImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityRule()
	 * @generated
	 */
	int UI_VISIBILITY_RULE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Ui Visibility Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiXbaseVisibilityRuleImpl <em>Ui Xbase Visibility Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiXbaseVisibilityRuleImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiXbaseVisibilityRule()
	 * @generated
	 */
	int UI_XBASE_VISIBILITY_RULE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VISIBILITY_RULE__ID = UI_VISIBILITY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VISIBILITY_RULE__NAME = UI_VISIBILITY_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VISIBILITY_RULE__EXPRESSION = UI_VISIBILITY_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Xbase Visibility Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VISIBILITY_RULE_FEATURE_COUNT = UI_VISIBILITY_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesImpl <em>Ui Visibility Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProperties()
	 * @generated
	 */
	int UI_VISIBILITY_PROPERTIES = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Ui Visibility Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesDefImpl <em>Ui Visibility Properties Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesDefImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityPropertiesDef()
	 * @generated
	 */
	int UI_VISIBILITY_PROPERTIES_DEF = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_DEF__ID = UI_ROOT_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_DEF__NAME = UI_ROOT_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_DEF__PROPERTIES = UI_ROOT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Visibility Properties Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_DEF_FEATURE_COUNT = UI_ROOT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesAssignmentImpl <em>Ui Visibility Properties Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesAssignmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityPropertiesAssignment()
	 * @generated
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT = 36;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Property Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS = 1;

	/**
	 * The number of structural features of the '<em>Ui Visibility Properties Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR__ID = UI_RAW_BINDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR__NAME = UI_RAW_BINDABLE__NAME;

	/**
	 * The number of structural features of the '<em>Ui Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_FEATURE_COUNT = UI_RAW_BINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MAX_LENGTH_VALIDATOR__ID = UI_VALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MAX_LENGTH_VALIDATOR__NAME = UI_VALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MAX_LENGTH_VALIDATOR__MAX_LENGTH = UI_VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Max Length Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MAX_LENGTH_VALIDATOR_FEATURE_COUNT = UI_VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MIN_LENGTH_VALIDATOR__ID = UI_VALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MIN_LENGTH_VALIDATOR__NAME = UI_VALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MIN_LENGTH_VALIDATOR__MIN_LENGTH = UI_VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Min Length Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MIN_LENGTH_VALIDATOR_FEATURE_COUNT = UI_VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REGEXP_VALIDATOR__ID = UI_VALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REGEXP_VALIDATOR__NAME = UI_VALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REGEXP_VALIDATOR__REG_EXPRESSION = UI_VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Regexp Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REGEXP_VALIDATOR_FEATURE_COUNT = UI_VALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VALIDATOR__ID = UI_VALIDATOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VALIDATOR__NAME = UI_VALIDATOR__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VALIDATOR__EXPRESSION = UI_VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Xbase Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VALIDATOR_FEATURE_COUNT = UI_VALIDATOR_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAliasImpl <em>Ui Validator Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAliasImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidatorAlias()
	 * @generated
	 */
	int UI_VALIDATOR_ALIAS = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ALIAS__ID = UI_ROOT_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ALIAS__NAME = UI_ROOT_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ALIAS__ALIAS = UI_ROOT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ALIAS__VALIDATOR = UI_ROOT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Validator Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ALIAS_FEATURE_COUNT = UI_ROOT_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl <em>Ui Validator Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidatorAssignment()
	 * @generated
	 */
	int UI_VALIDATOR_ASSIGNMENT = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ASSIGNMENT__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ASSIGNMENT__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ASSIGNMENT__FIELD = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validator Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF = UI_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validator Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS = UI_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ui Validator Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_ASSIGNMENT_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorDefImpl <em>Ui Validator Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiValidatorDefImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidatorDef()
	 * @generated
	 */
	int UI_VALIDATOR_DEF = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_DEF__ID = UI_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_DEF__NAME = UI_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_DEF__VALIDATOR = UI_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_DEF__JVM_TYPE = UI_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Validator Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VALIDATOR_DEF_FEATURE_COUNT = UI_NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiNamedElement <em>Ui Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Named Element</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNamedElement
	 * @generated
	 */
	EClass getUiNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiNamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNamedElement#getId()
	 * @see #getUiNamedElement()
	 * @generated
	 */
	EAttribute getUiNamedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNamedElement#getName()
	 * @see #getUiNamedElement()
	 * @generated
	 */
	EAttribute getUiNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiModel <em>Ui Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Model</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel
	 * @generated
	 */
	EClass getUiModel();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiModel#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel#getPackageName()
	 * @see #getUiModel()
	 * @generated
	 */
	EAttribute getUiModel_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiModel#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roots</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel#getRoots()
	 * @see #getUiModel()
	 * @generated
	 */
	EReference getUiModel_Roots();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel#getImports()
	 * @see #getUiModel()
	 * @generated
	 */
	EReference getUiModel_Imports();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiImports <em>Ui Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Imports</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiImports
	 * @generated
	 */
	EClass getUiImports();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiImports#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiImports#getImportedNamespace()
	 * @see #getUiImports()
	 * @generated
	 */
	EAttribute getUiImports_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiContext <em>Ui Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Context</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiContext
	 * @generated
	 */
	EClass getUiContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBeanSlots <em>Bean Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Slots</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiContext#getBeanSlots()
	 * @see #getUiContext()
	 * @generated
	 */
	EReference getUiContext_BeanSlots();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Endpoint Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiContext#getBindingEndpointAlias()
	 * @see #getUiContext()
	 * @generated
	 */
	EReference getUiContext_BindingEndpointAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiContext#getBindings()
	 * @see #getUiContext()
	 * @generated
	 */
	EReference getUiContext_Bindings();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiView <em>Ui View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui View</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiView
	 * @generated
	 */
	EClass getUiView();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiView#getViewSet <em>View Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View Set</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiView#getViewSet()
	 * @see #getUiView()
	 * @generated
	 */
	EReference getUiView_ViewSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiView#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiView#getContent()
	 * @see #getUiView()
	 * @generated
	 */
	EReference getUiView_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiView#getValidatorAssignments <em>Validator Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validator Assignments</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiView#getValidatorAssignments()
	 * @see #getUiView()
	 * @generated
	 */
	EReference getUiView_ValidatorAssignments();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiIDEView <em>Ui IDE View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui IDE View</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiIDEView
	 * @generated
	 */
	EClass getUiIDEView();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiPoint <em>Ui Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Point</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPoint
	 * @generated
	 */
	EClass getUiPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPoint#getX()
	 * @see #getUiPoint()
	 * @generated
	 */
	EAttribute getUiPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPoint#getY()
	 * @see #getUiPoint()
	 * @generated
	 */
	EAttribute getUiPoint_Y();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias <em>Ui Binding Endpoint Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Binding Endpoint Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
	 * @generated
	 */
	EClass getUiBindingEndpointAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias#getAlias()
	 * @see #getUiBindingEndpointAlias()
	 * @generated
	 */
	EAttribute getUiBindingEndpointAlias_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias#getEndpoint()
	 * @see #getUiBindingEndpointAlias()
	 * @generated
	 */
	EReference getUiBindingEndpointAlias_Endpoint();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment <em>Ui Binding Endpoint Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Binding Endpoint Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
	 * @generated
	 */
	EClass getUiBindingEndpointAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableDef <em>Typed Bindable Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typed Bindable Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableDef()
	 * @see #getUiBindingEndpointAssignment()
	 * @generated
	 */
	EReference getUiBindingEndpointAssignment_TypedBindableDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getPath()
	 * @see #getUiBindingEndpointAssignment()
	 * @generated
	 */
	EReference getUiBindingEndpointAssignment_Path();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableAlias <em>Typed Bindable Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typed Bindable Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableAlias()
	 * @see #getUiBindingEndpointAssignment()
	 * @generated
	 */
	EReference getUiBindingEndpointAssignment_TypedBindableAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiBinding <em>Ui Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Binding</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding
	 * @generated
	 */
	EClass getUiBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding#getSource()
	 * @see #getUiBinding()
	 * @generated
	 */
	EReference getUiBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSourceAlias <em>Source Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding#getSourceAlias()
	 * @see #getUiBinding()
	 * @generated
	 */
	EReference getUiBinding_SourceAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isTargetToSource <em>Target To Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target To Source</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding#isTargetToSource()
	 * @see #getUiBinding()
	 * @generated
	 */
	EAttribute getUiBinding_TargetToSource();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isSourceToTarget <em>Source To Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source To Target</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding#isSourceToTarget()
	 * @see #getUiBinding()
	 * @generated
	 */
	EAttribute getUiBinding_SourceToTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding#getTarget()
	 * @see #getUiBinding()
	 * @generated
	 */
	EReference getUiBinding_Target();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTargetAlias <em>Target Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBinding#getTargetAlias()
	 * @see #getUiBinding()
	 * @generated
	 */
	EReference getUiBinding_TargetAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment <em>Ui Path Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Path Segment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPathSegment
	 * @generated
	 */
	EClass getUiPathSegment();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment#getJvmField <em>Jvm Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jvm Field</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPathSegment#getJvmField()
	 * @see #getUiPathSegment()
	 * @generated
	 */
	EReference getUiPathSegment_JvmField();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiPathSegment#getPath()
	 * @see #getUiPathSegment()
	 * @generated
	 */
	EReference getUiPathSegment_Path();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot <em>Ui Bean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Bean Slot</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBeanSlot
	 * @generated
	 */
	EClass getUiBeanSlot();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getJvmType <em>Jvm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jvm Type</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getJvmType()
	 * @see #getUiBeanSlot()
	 * @generated
	 */
	EReference getUiBeanSlot_JvmType();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiViewSet <em>Ui View Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui View Set</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiViewSet
	 * @generated
	 */
	EClass getUiViewSet();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiRootElements <em>Ui Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Root Elements</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRootElements
	 * @generated
	 */
	EClass getUiRootElements();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator <em>Ui Max Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Max Length Validator</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator
	 * @generated
	 */
	EClass getUiMaxLengthValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator#getMaxLength()
	 * @see #getUiMaxLengthValidator()
	 * @generated
	 */
	EAttribute getUiMaxLengthValidator_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator <em>Ui Min Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Min Length Validator</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator
	 * @generated
	 */
	EClass getUiMinLengthValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator#getMinLength()
	 * @see #getUiMinLengthValidator()
	 * @generated
	 */
	EAttribute getUiMinLengthValidator_MinLength();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiRegexpValidator <em>Ui Regexp Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Regexp Validator</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRegexpValidator
	 * @generated
	 */
	EClass getUiRegexpValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiRegexpValidator#getRegExpression <em>Reg Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Expression</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRegexpValidator#getRegExpression()
	 * @see #getUiRegexpValidator()
	 * @generated
	 */
	EAttribute getUiRegexpValidator_RegExpression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator <em>Ui Xbase Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Xbase Validator</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiXbaseValidator
	 * @generated
	 */
	EClass getUiXbaseValidator();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiXbaseValidator#getExpression()
	 * @see #getUiXbaseValidator()
	 * @generated
	 */
	EReference getUiXbaseValidator_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiBindingExpression <em>Ui Binding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Binding Expression</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingExpression
	 * @generated
	 */
	EClass getUiBindingExpression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindable <em>Ui Typed Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Typed Bindable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindable
	 * @generated
	 */
	EClass getUiTypedBindable();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef <em>Ui Typed Bindable Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Typed Bindable Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef
	 * @generated
	 */
	EClass getUiTypedBindableDef();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getRawBindable <em>Raw Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raw Bindable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getRawBindable()
	 * @see #getUiTypedBindableDef()
	 * @generated
	 */
	EReference getUiTypedBindableDef_RawBindable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getMethod()
	 * @see #getUiTypedBindableDef()
	 * @generated
	 */
	EReference getUiTypedBindableDef_Method();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindable <em>Ui Raw Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Raw Bindable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiRawBindable
	 * @generated
	 */
	EClass getUiRawBindable();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiEmbeddable <em>Ui Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Embeddable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiEmbeddable
	 * @generated
	 */
	EClass getUiEmbeddable();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiField <em>Ui Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Field</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiField
	 * @generated
	 */
	EClass getUiField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiField#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validators</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiField#getValidators()
	 * @see #getUiField()
	 * @generated
	 */
	EReference getUiField_Validators();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiLayout <em>Ui Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Layout</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiLayout
	 * @generated
	 */
	EClass getUiLayout();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiValidator <em>Ui Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Validator</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidator
	 * @generated
	 */
	EClass getUiValidator();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment <em>Ui Grid Layout Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Grid Layout Assigment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment
	 * @generated
	 */
	EClass getUiGridLayoutAssigment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getElement()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EReference getUiGridLayoutAssigment_Element();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getFrom()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EReference getUiGridLayoutAssigment_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getTo()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EReference getUiGridLayoutAssigment_To();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout <em>Ui Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Grid Layout</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayout
	 * @generated
	 */
	EClass getUiGridLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayout#getContents()
	 * @see #getUiGridLayout()
	 * @generated
	 */
	EReference getUiGridLayout_Contents();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiTextField <em>Ui Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Text Field</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTextField
	 * @generated
	 */
	EClass getUiTextField();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiList <em>Ui List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui List</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiList
	 * @generated
	 */
	EClass getUiList();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiNumericField <em>Ui Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Numeric Field</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiNumericField
	 * @generated
	 */
	EClass getUiNumericField();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiCheckBox <em>Ui Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Check Box</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiCheckBox
	 * @generated
	 */
	EClass getUiCheckBox();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable <em>Ui Visibility Processable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable
	 * @generated
	 */
	EClass getUiVisibilityProcessable();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable#getProcessorAssignment <em>Processor Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable#getProcessorAssignment()
	 * @see #getUiVisibilityProcessable()
	 * @generated
	 */
	EReference getUiVisibilityProcessable_ProcessorAssignment();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor <em>Ui Visibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processor</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor
	 * @generated
	 */
	EClass getUiVisibilityProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getBindingAlias <em>Binding Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getBindingAlias()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_BindingAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getChangeTrigger <em>Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Trigger</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getChangeTrigger()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_ChangeTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getRule()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getPropertiesAssignment <em>Properties Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getPropertiesAssignment()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_PropertiesAssignment();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef <em>Ui Visibility Processor Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processor Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef
	 * @generated
	 */
	EClass getUiVisibilityProcessorDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef#getProcessor()
	 * @see #getUiVisibilityProcessorDef()
	 * @generated
	 */
	EReference getUiVisibilityProcessorDef_Processor();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment <em>Ui Visibility Processor Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processor Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment
	 * @generated
	 */
	EClass getUiVisibilityProcessorAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessor()
	 * @see #getUiVisibilityProcessorAssignment()
	 * @generated
	 */
	EReference getUiVisibilityProcessorAssignment_Processor();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessorAlias <em>Processor Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessorAlias()
	 * @see #getUiVisibilityProcessorAssignment()
	 * @generated
	 */
	EReference getUiVisibilityProcessorAssignment_ProcessorAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger <em>Ui Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Change Trigger</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiChangeTrigger
	 * @generated
	 */
	EClass getUiChangeTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpoint()
	 * @see #getUiChangeTrigger()
	 * @generated
	 */
	EReference getUiChangeTrigger_Endpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpointAlias <em>Endpoint Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpointAlias()
	 * @see #getUiChangeTrigger()
	 * @generated
	 */
	EReference getUiChangeTrigger_EndpointAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityRule <em>Ui Visibility Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Rule</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityRule
	 * @generated
	 */
	EClass getUiVisibilityRule();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule <em>Ui Xbase Visibility Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Xbase Visibility Rule</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule
	 * @generated
	 */
	EClass getUiXbaseVisibilityRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule#getExpression()
	 * @see #getUiXbaseVisibilityRule()
	 * @generated
	 */
	EReference getUiXbaseVisibilityRule_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperties <em>Ui Visibility Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityProperties
	 * @generated
	 */
	EClass getUiVisibilityProperties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesDef <em>Ui Visibility Properties Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Properties Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesDef
	 * @generated
	 */
	EClass getUiVisibilityPropertiesDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesDef#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesDef#getProperties()
	 * @see #getUiVisibilityPropertiesDef()
	 * @generated
	 */
	EReference getUiVisibilityPropertiesDef_Properties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment <em>Ui Visibility Properties Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Properties Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment
	 * @generated
	 */
	EClass getUiVisibilityPropertiesAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getProperties()
	 * @see #getUiVisibilityPropertiesAssignment()
	 * @generated
	 */
	EReference getUiVisibilityPropertiesAssignment_Properties();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getPropertyAlias <em>Property Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getPropertyAlias()
	 * @see #getUiVisibilityPropertiesAssignment()
	 * @generated
	 */
	EReference getUiVisibilityPropertiesAssignment_PropertyAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAlias <em>Ui Validator Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Validator Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAlias
	 * @generated
	 */
	EClass getUiValidatorAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAlias#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAlias#getAlias()
	 * @see #getUiValidatorAlias()
	 * @generated
	 */
	EAttribute getUiValidatorAlias_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAlias#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAlias#getValidator()
	 * @see #getUiValidatorAlias()
	 * @generated
	 */
	EReference getUiValidatorAlias_Validator();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment <em>Ui Validator Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Validator Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment
	 * @generated
	 */
	EClass getUiValidatorAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getField()
	 * @see #getUiValidatorAssignment()
	 * @generated
	 */
	EReference getUiValidatorAssignment_Field();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorDef <em>Validator Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorDef()
	 * @see #getUiValidatorAssignment()
	 * @generated
	 */
	EReference getUiValidatorAssignment_ValidatorDef();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorAlias <em>Validator Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Validator Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment#getValidatorAlias()
	 * @see #getUiValidatorAssignment()
	 * @generated
	 */
	EReference getUiValidatorAssignment_ValidatorAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef <em>Ui Validator Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Validator Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorDef
	 * @generated
	 */
	EClass getUiValidatorDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getValidator()
	 * @see #getUiValidatorDef()
	 * @generated
	 */
	EReference getUiValidatorDef_Validator();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getJvmType <em>Jvm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jvm Type</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getJvmType()
	 * @see #getUiValidatorDef()
	 * @generated
	 */
	EReference getUiValidatorDef_JvmType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiModelFactory getUiModelFactory();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiNamedElement <em>Ui Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiNamedElement
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiNamedElement()
		 * @generated
		 */
		EClass UI_NAMED_ELEMENT = eINSTANCE.getUiNamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_NAMED_ELEMENT__ID = eINSTANCE.getUiNamedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_NAMED_ELEMENT__NAME = eINSTANCE.getUiNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl <em>Ui Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiModel()
		 * @generated
		 */
		EClass UI_MODEL = eINSTANCE.getUiModel();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_MODEL__PACKAGE_NAME = eINSTANCE.getUiModel_PackageName();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MODEL__ROOTS = eINSTANCE.getUiModel_Roots();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MODEL__IMPORTS = eINSTANCE.getUiModel_Imports();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiImportsImpl <em>Ui Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiImportsImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiImports()
		 * @generated
		 */
		EClass UI_IMPORTS = eINSTANCE.getUiImports();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_IMPORTS__IMPORTED_NAMESPACE = eINSTANCE.getUiImports_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl <em>Ui Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiContext()
		 * @generated
		 */
		EClass UI_CONTEXT = eINSTANCE.getUiContext();

		/**
		 * The meta object literal for the '<em><b>Bean Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTEXT__BEAN_SLOTS = eINSTANCE.getUiContext_BeanSlots();

		/**
		 * The meta object literal for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTEXT__BINDING_ENDPOINT_ALIAS = eINSTANCE.getUiContext_BindingEndpointAlias();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTEXT__BINDINGS = eINSTANCE.getUiContext_Bindings();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl <em>Ui View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiView()
		 * @generated
		 */
		EClass UI_VIEW = eINSTANCE.getUiView();

		/**
		 * The meta object literal for the '<em><b>View Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VIEW__VIEW_SET = eINSTANCE.getUiView_ViewSet();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VIEW__CONTENT = eINSTANCE.getUiView_Content();

		/**
		 * The meta object literal for the '<em><b>Validator Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VIEW__VALIDATOR_ASSIGNMENTS = eINSTANCE.getUiView_ValidatorAssignments();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl <em>Ui IDE View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiIDEView()
		 * @generated
		 */
		EClass UI_IDE_VIEW = eINSTANCE.getUiIDEView();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl <em>Ui Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiPoint()
		 * @generated
		 */
		EClass UI_POINT = eINSTANCE.getUiPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_POINT__X = eINSTANCE.getUiPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_POINT__Y = eINSTANCE.getUiPoint_Y();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl <em>Ui Binding Endpoint Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBindingEndpointAlias()
		 * @generated
		 */
		EClass UI_BINDING_ENDPOINT_ALIAS = eINSTANCE.getUiBindingEndpointAlias();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_BINDING_ENDPOINT_ALIAS__ALIAS = eINSTANCE.getUiBindingEndpointAlias_Alias();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING_ENDPOINT_ALIAS__ENDPOINT = eINSTANCE.getUiBindingEndpointAlias_Endpoint();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl <em>Ui Binding Endpoint Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBindingEndpointAssignment()
		 * @generated
		 */
		EClass UI_BINDING_ENDPOINT_ASSIGNMENT = eINSTANCE.getUiBindingEndpointAssignment();

		/**
		 * The meta object literal for the '<em><b>Typed Bindable Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF = eINSTANCE.getUiBindingEndpointAssignment_TypedBindableDef();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING_ENDPOINT_ASSIGNMENT__PATH = eINSTANCE.getUiBindingEndpointAssignment_Path();

		/**
		 * The meta object literal for the '<em><b>Typed Bindable Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS = eINSTANCE.getUiBindingEndpointAssignment_TypedBindableAlias();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl <em>Ui Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBinding()
		 * @generated
		 */
		EClass UI_BINDING = eINSTANCE.getUiBinding();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING__SOURCE = eINSTANCE.getUiBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Source Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING__SOURCE_ALIAS = eINSTANCE.getUiBinding_SourceAlias();

		/**
		 * The meta object literal for the '<em><b>Target To Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_BINDING__TARGET_TO_SOURCE = eINSTANCE.getUiBinding_TargetToSource();

		/**
		 * The meta object literal for the '<em><b>Source To Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_BINDING__SOURCE_TO_TARGET = eINSTANCE.getUiBinding_SourceToTarget();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING__TARGET = eINSTANCE.getUiBinding_Target();

		/**
		 * The meta object literal for the '<em><b>Target Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING__TARGET_ALIAS = eINSTANCE.getUiBinding_TargetAlias();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl <em>Ui Path Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiPathSegment()
		 * @generated
		 */
		EClass UI_PATH_SEGMENT = eINSTANCE.getUiPathSegment();

		/**
		 * The meta object literal for the '<em><b>Jvm Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PATH_SEGMENT__JVM_FIELD = eINSTANCE.getUiPathSegment_JvmField();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PATH_SEGMENT__PATH = eINSTANCE.getUiPathSegment_Path();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanSlotImpl <em>Ui Bean Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBeanSlotImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBeanSlot()
		 * @generated
		 */
		EClass UI_BEAN_SLOT = eINSTANCE.getUiBeanSlot();

		/**
		 * The meta object literal for the '<em><b>Jvm Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BEAN_SLOT__JVM_TYPE = eINSTANCE.getUiBeanSlot_JvmType();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl <em>Ui View Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiViewSet()
		 * @generated
		 */
		EClass UI_VIEW_SET = eINSTANCE.getUiViewSet();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiRootElements <em>Ui Root Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiRootElements
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiRootElements()
		 * @generated
		 */
		EClass UI_ROOT_ELEMENTS = eINSTANCE.getUiRootElements();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiMaxLengthValidatorImpl <em>Ui Max Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiMaxLengthValidatorImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiMaxLengthValidator()
		 * @generated
		 */
		EClass UI_MAX_LENGTH_VALIDATOR = eINSTANCE.getUiMaxLengthValidator();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_MAX_LENGTH_VALIDATOR__MAX_LENGTH = eINSTANCE.getUiMaxLengthValidator_MaxLength();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiMinLengthValidatorImpl <em>Ui Min Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiMinLengthValidatorImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiMinLengthValidator()
		 * @generated
		 */
		EClass UI_MIN_LENGTH_VALIDATOR = eINSTANCE.getUiMinLengthValidator();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_MIN_LENGTH_VALIDATOR__MIN_LENGTH = eINSTANCE.getUiMinLengthValidator_MinLength();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiRegexpValidatorImpl <em>Ui Regexp Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiRegexpValidatorImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiRegexpValidator()
		 * @generated
		 */
		EClass UI_REGEXP_VALIDATOR = eINSTANCE.getUiRegexpValidator();

		/**
		 * The meta object literal for the '<em><b>Reg Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_REGEXP_VALIDATOR__REG_EXPRESSION = eINSTANCE.getUiRegexpValidator_RegExpression();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiXbaseValidatorImpl <em>Ui Xbase Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiXbaseValidatorImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiXbaseValidator()
		 * @generated
		 */
		EClass UI_XBASE_VALIDATOR = eINSTANCE.getUiXbaseValidator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_XBASE_VALIDATOR__EXPRESSION = eINSTANCE.getUiXbaseValidator_Expression();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingExpression <em>Ui Binding Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiBindingExpression
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiBindingExpression()
		 * @generated
		 */
		EClass UI_BINDING_EXPRESSION = eINSTANCE.getUiBindingExpression();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindable <em>Ui Typed Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiTypedBindable
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiTypedBindable()
		 * @generated
		 */
		EClass UI_TYPED_BINDABLE = eINSTANCE.getUiTypedBindable();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl <em>Ui Typed Bindable Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiTypedBindableDef()
		 * @generated
		 */
		EClass UI_TYPED_BINDABLE_DEF = eINSTANCE.getUiTypedBindableDef();

		/**
		 * The meta object literal for the '<em><b>Raw Bindable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TYPED_BINDABLE_DEF__RAW_BINDABLE = eINSTANCE.getUiTypedBindableDef_RawBindable();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TYPED_BINDABLE_DEF__METHOD = eINSTANCE.getUiTypedBindableDef_Method();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindable <em>Ui Raw Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiRawBindable
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiRawBindable()
		 * @generated
		 */
		EClass UI_RAW_BINDABLE = eINSTANCE.getUiRawBindable();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiEmbeddable <em>Ui Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiEmbeddable
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiEmbeddable()
		 * @generated
		 */
		EClass UI_EMBEDDABLE = eINSTANCE.getUiEmbeddable();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiField <em>Ui Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiField
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiField()
		 * @generated
		 */
		EClass UI_FIELD = eINSTANCE.getUiField();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_FIELD__VALIDATORS = eINSTANCE.getUiField_Validators();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiLayout <em>Ui Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiLayout
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiLayout()
		 * @generated
		 */
		EClass UI_LAYOUT = eINSTANCE.getUiLayout();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.UiValidator <em>Ui Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.UiValidator
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidator()
		 * @generated
		 */
		EClass UI_VALIDATOR = eINSTANCE.getUiValidator();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiGridLayoutAssigment()
		 * @generated
		 */
		EClass UI_GRID_LAYOUT_ASSIGMENT = eINSTANCE.getUiGridLayoutAssigment();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_GRID_LAYOUT_ASSIGMENT__ELEMENT = eINSTANCE.getUiGridLayoutAssigment_Element();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_GRID_LAYOUT_ASSIGMENT__FROM = eINSTANCE.getUiGridLayoutAssigment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_GRID_LAYOUT_ASSIGMENT__TO = eINSTANCE.getUiGridLayoutAssigment_To();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl <em>Ui Grid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiGridLayout()
		 * @generated
		 */
		EClass UI_GRID_LAYOUT = eINSTANCE.getUiGridLayout();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_GRID_LAYOUT__CONTENTS = eINSTANCE.getUiGridLayout_Contents();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiTextFieldImpl <em>Ui Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiTextFieldImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiTextField()
		 * @generated
		 */
		EClass UI_TEXT_FIELD = eINSTANCE.getUiTextField();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl <em>Ui List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiListImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiList()
		 * @generated
		 */
		EClass UI_LIST = eINSTANCE.getUiList();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiNumericFieldImpl <em>Ui Numeric Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiNumericFieldImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiNumericField()
		 * @generated
		 */
		EClass UI_NUMERIC_FIELD = eINSTANCE.getUiNumericField();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiCheckBoxImpl <em>Ui Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiCheckBoxImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiCheckBox()
		 * @generated
		 */
		EClass UI_CHECK_BOX = eINSTANCE.getUiCheckBox();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessableImpl <em>Ui Visibility Processable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessableImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessable()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROCESSABLE = eINSTANCE.getUiVisibilityProcessable();

		/**
		 * The meta object literal for the '<em><b>Processor Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT = eINSTANCE.getUiVisibilityProcessable_ProcessorAssignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl <em>Ui Visibility Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessor()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROCESSOR = eINSTANCE.getUiVisibilityProcessor();

		/**
		 * The meta object literal for the '<em><b>Binding Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSOR__BINDING_ALIAS = eINSTANCE.getUiVisibilityProcessor_BindingAlias();

		/**
		 * The meta object literal for the '<em><b>Change Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER = eINSTANCE.getUiVisibilityProcessor_ChangeTrigger();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSOR__RULE = eINSTANCE.getUiVisibilityProcessor_Rule();

		/**
		 * The meta object literal for the '<em><b>Properties Assignment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT = eINSTANCE.getUiVisibilityProcessor_PropertiesAssignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorDefImpl <em>Ui Visibility Processor Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorDefImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessorDef()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROCESSOR_DEF = eINSTANCE.getUiVisibilityProcessorDef();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSOR_DEF__PROCESSOR = eINSTANCE.getUiVisibilityProcessorDef_Processor();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorAssignmentImpl <em>Ui Visibility Processor Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorAssignmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProcessorAssignment()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROCESSOR_ASSIGNMENT = eINSTANCE.getUiVisibilityProcessorAssignment();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR = eINSTANCE.getUiVisibilityProcessorAssignment_Processor();

		/**
		 * The meta object literal for the '<em><b>Processor Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS = eINSTANCE.getUiVisibilityProcessorAssignment_ProcessorAlias();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiChangeTriggerImpl <em>Ui Change Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiChangeTriggerImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiChangeTrigger()
		 * @generated
		 */
		EClass UI_CHANGE_TRIGGER = eINSTANCE.getUiChangeTrigger();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CHANGE_TRIGGER__ENDPOINT = eINSTANCE.getUiChangeTrigger_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Endpoint Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CHANGE_TRIGGER__ENDPOINT_ALIAS = eINSTANCE.getUiChangeTrigger_EndpointAlias();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityRuleImpl <em>Ui Visibility Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityRuleImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityRule()
		 * @generated
		 */
		EClass UI_VISIBILITY_RULE = eINSTANCE.getUiVisibilityRule();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiXbaseVisibilityRuleImpl <em>Ui Xbase Visibility Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiXbaseVisibilityRuleImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiXbaseVisibilityRule()
		 * @generated
		 */
		EClass UI_XBASE_VISIBILITY_RULE = eINSTANCE.getUiXbaseVisibilityRule();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_XBASE_VISIBILITY_RULE__EXPRESSION = eINSTANCE.getUiXbaseVisibilityRule_Expression();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesImpl <em>Ui Visibility Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityProperties()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROPERTIES = eINSTANCE.getUiVisibilityProperties();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesDefImpl <em>Ui Visibility Properties Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesDefImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityPropertiesDef()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROPERTIES_DEF = eINSTANCE.getUiVisibilityPropertiesDef();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROPERTIES_DEF__PROPERTIES = eINSTANCE.getUiVisibilityPropertiesDef_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesAssignmentImpl <em>Ui Visibility Properties Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertiesAssignmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiVisibilityPropertiesAssignment()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROPERTIES_ASSIGNMENT = eINSTANCE.getUiVisibilityPropertiesAssignment();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES = eINSTANCE.getUiVisibilityPropertiesAssignment_Properties();

		/**
		 * The meta object literal for the '<em><b>Property Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS = eINSTANCE.getUiVisibilityPropertiesAssignment_PropertyAlias();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAliasImpl <em>Ui Validator Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAliasImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidatorAlias()
		 * @generated
		 */
		EClass UI_VALIDATOR_ALIAS = eINSTANCE.getUiValidatorAlias();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_VALIDATOR_ALIAS__ALIAS = eINSTANCE.getUiValidatorAlias_Alias();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VALIDATOR_ALIAS__VALIDATOR = eINSTANCE.getUiValidatorAlias_Validator();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl <em>Ui Validator Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidatorAssignment()
		 * @generated
		 */
		EClass UI_VALIDATOR_ASSIGNMENT = eINSTANCE.getUiValidatorAssignment();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VALIDATOR_ASSIGNMENT__FIELD = eINSTANCE.getUiValidatorAssignment_Field();

		/**
		 * The meta object literal for the '<em><b>Validator Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF = eINSTANCE.getUiValidatorAssignment_ValidatorDef();

		/**
		 * The meta object literal for the '<em><b>Validator Alias</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS = eINSTANCE.getUiValidatorAssignment_ValidatorAlias();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorDefImpl <em>Ui Validator Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiValidatorDefImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelPackageImpl#getUiValidatorDef()
		 * @generated
		 */
		EClass UI_VALIDATOR_DEF = eINSTANCE.getUiValidatorDef();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VALIDATOR_DEF__VALIDATOR = eINSTANCE.getUiValidatorDef_Validator();

		/**
		 * The meta object literal for the '<em><b>Jvm Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VALIDATOR_DEF__JVM_TYPE = eINSTANCE.getUiValidatorDef_JvmType();

	}

} //UiModelPackage
