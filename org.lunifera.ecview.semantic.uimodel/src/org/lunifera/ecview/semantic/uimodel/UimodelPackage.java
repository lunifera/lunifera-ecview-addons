/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uimodel.UimodelFactory
 * @model kind="package"
 * @generated
 */
public interface UimodelPackage extends EPackage {
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
	String eNS_URI = "http://www.lunifera.org/ecview/dsl/UIModel";

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
	UimodelPackage eINSTANCE = org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl <em>Ui Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiModel()
	 * @generated
	 */
	int UI_MODEL = 0;

	/**
	 * The feature id for the '<em><b>View Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__VIEW_SET = 0;

	/**
	 * The number of structural features of the '<em>Ui Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ui Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl <em>Ui IDE View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiIDEView()
	 * @generated
	 */
	int UI_IDE_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__ID = CoreModelPackage.YVIEW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__NAME = CoreModelPackage.YVIEW__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__CSS_CLASS = CoreModelPackage.YVIEW__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__CSS_ID = CoreModelPackage.YVIEW__CSS_ID;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__MARGIN = CoreModelPackage.YVIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__VISIBILITY_PROCESSOR = CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__ROOT = CoreModelPackage.YVIEW__ROOT;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__VIEW_NAME = CoreModelPackage.YVIEW__VIEW_NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__CONTENT = CoreModelPackage.YVIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BINDING_SET = CoreModelPackage.YVIEW__BINDING_SET;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BEAN_SLOTS = CoreModelPackage.YVIEW__BEAN_SLOTS;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__LAYOUTS = CoreModelPackage.YVIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BINDINGS = CoreModelPackage.YVIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui IDE View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW_FEATURE_COUNT = CoreModelPackage.YVIEW_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Or Create Binding Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW___GET_OR_CREATE_BINDING_SET = CoreModelPackage.YVIEW___GET_OR_CREATE_BINDING_SET;

	/**
	 * The number of operations of the '<em>Ui IDE View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW_OPERATION_COUNT = CoreModelPackage.YVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiGridLayoutAssigment()
	 * @generated
	 */
	int UI_GRID_LAYOUT_ASSIGMENT = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__FROM = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__TO = 3;

	/**
	 * The number of structural features of the '<em>Ui Grid Layout Assigment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ui Grid Layout Assigment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl <em>Ui Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiPoint()
	 * @generated
	 */
	int UI_POINT = 3;

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
	 * The number of operations of the '<em>Ui Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl <em>Ui Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBinding()
	 * @generated
	 */
	int UI_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target To Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__TARGET_TO_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Source To Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__SOURCE_TO_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Ui Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ui Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiSourceBindingEndpointImpl <em>Ui Source Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiSourceBindingEndpointImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiSourceBindingEndpoint()
	 * @generated
	 */
	int UI_SOURCE_BINDING_ENDPOINT = 5;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE = 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SOURCE_BINDING_ENDPOINT__ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SOURCE_BINDING_ENDPOINT__PATH = 2;

	/**
	 * The number of structural features of the '<em>Ui Source Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SOURCE_BINDING_ENDPOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ui Source Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SOURCE_BINDING_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiTargetBindingEndpointImpl <em>Ui Target Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiTargetBindingEndpointImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiTargetBindingEndpoint()
	 * @generated
	 */
	int UI_TARGET_BINDING_ENDPOINT = 6;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TARGET_BINDING_ENDPOINT__EMBEDDABLE = 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TARGET_BINDING_ENDPOINT__ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TARGET_BINDING_ENDPOINT__PATH = 2;

	/**
	 * The number of structural features of the '<em>Ui Target Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TARGET_BINDING_ENDPOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ui Target Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TARGET_BINDING_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl <em>Ui Path Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiPathSegment()
	 * @generated
	 */
	int UI_PATH_SEGMENT = 7;

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
	 * The number of operations of the '<em>Ui Path Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PATH_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanSlotImpl <em>Ui Bean Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBeanSlotImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBeanSlot()
	 * @generated
	 */
	int UI_BEAN_SLOT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT__NAME = CoreModelPackage.YBEAN_SLOT__NAME;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT__VALUE_TYPE = CoreModelPackage.YBEAN_SLOT__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Value Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME = CoreModelPackage.YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT__JVM_TYPE = CoreModelPackage.YBEAN_SLOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Bean Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT_FEATURE_COUNT = CoreModelPackage.YBEAN_SLOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ui Bean Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BEAN_SLOT_OPERATION_COUNT = CoreModelPackage.YBEAN_SLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl <em>Ui Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiGridLayout()
	 * @generated
	 */
	int UI_GRID_LAYOUT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__ID = ExtensionModelPackage.YGRID_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__NAME = ExtensionModelPackage.YGRID_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__CSS_CLASS = ExtensionModelPackage.YGRID_LAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__CSS_ID = ExtensionModelPackage.YGRID_LAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__INITIAL_VISIBLE = ExtensionModelPackage.YGRID_LAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__VISIBLE = ExtensionModelPackage.YGRID_LAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__VISIBILITY_PROCESSOR = ExtensionModelPackage.YGRID_LAYOUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__ELEMENTS = ExtensionModelPackage.YGRID_LAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__SPACING = ExtensionModelPackage.YGRID_LAYOUT__SPACING;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__MARGIN = ExtensionModelPackage.YGRID_LAYOUT__MARGIN;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__CELL_STYLES = ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__COLUMNS = ExtensionModelPackage.YGRID_LAYOUT__COLUMNS;

	/**
	 * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__FILL_HORIZONTAL = ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__FILL_VERTICAL = ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__CONTENTS = ExtensionModelPackage.YGRID_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_FEATURE_COUNT = ExtensionModelPackage.YGRID_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT___GET_PARENT = ExtensionModelPackage.YGRID_LAYOUT___GET_PARENT;

	/**
	 * The operation id for the '<em>Get View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT___GET_VIEW = ExtensionModelPackage.YGRID_LAYOUT___GET_VIEW;

	/**
	 * The operation id for the '<em>Add Grid Layout Cell Style</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT___ADD_GRID_LAYOUT_CELL_STYLE__YEMBEDDABLE = ExtensionModelPackage.YGRID_LAYOUT___ADD_GRID_LAYOUT_CELL_STYLE__YEMBEDDABLE;

	/**
	 * The number of operations of the '<em>Ui Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_OPERATION_COUNT = ExtensionModelPackage.YGRID_LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiTextFieldImpl <em>Ui Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiTextFieldImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiTextField()
	 * @generated
	 */
	int UI_TEXT_FIELD = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__ID = ExtensionModelPackage.YTEXT_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__NAME = ExtensionModelPackage.YTEXT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__CSS_CLASS = ExtensionModelPackage.YTEXT_FIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__CSS_ID = ExtensionModelPackage.YTEXT_FIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__INITIAL_VISIBLE = ExtensionModelPackage.YTEXT_FIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__VISIBLE = ExtensionModelPackage.YTEXT_FIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__VISIBILITY_PROCESSOR = ExtensionModelPackage.YTEXT_FIELD__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__INITIAL_EDITABLE = ExtensionModelPackage.YTEXT_FIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__EDITABLE = ExtensionModelPackage.YTEXT_FIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__INITIAL_ENABLED = ExtensionModelPackage.YTEXT_FIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__ENABLED = ExtensionModelPackage.YTEXT_FIELD__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__VALIDATORS = ExtensionModelPackage.YTEXT_FIELD__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__INTERNAL_VALIDATORS = ExtensionModelPackage.YTEXT_FIELD__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__VALUE_BINDING_ENDPOINT = ExtensionModelPackage.YTEXT_FIELD__VALUE_BINDING_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__DATATYPE = ExtensionModelPackage.YTEXT_FIELD__DATATYPE;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__DATADESCRIPTION = ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__VALUE = ExtensionModelPackage.YTEXT_FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Ui Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD_FEATURE_COUNT = ExtensionModelPackage.YTEXT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD___GET_PARENT = ExtensionModelPackage.YTEXT_FIELD___GET_PARENT;

	/**
	 * The operation id for the '<em>Get View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD___GET_VIEW = ExtensionModelPackage.YTEXT_FIELD___GET_VIEW;

	/**
	 * The operation id for the '<em>Add Value Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD___ADD_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER = ExtensionModelPackage.YTEXT_FIELD___ADD_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Value Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD___REMOVE_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER = ExtensionModelPackage.YTEXT_FIELD___REMOVE_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove All Value Chang Listeners</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD___REMOVE_ALL_VALUE_CHANG_LISTENERS = ExtensionModelPackage.YTEXT_FIELD___REMOVE_ALL_VALUE_CHANG_LISTENERS;

	/**
	 * The operation id for the '<em>Create Value Endpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD___CREATE_VALUE_ENDPOINT = ExtensionModelPackage.YTEXT_FIELD___CREATE_VALUE_ENDPOINT;

	/**
	 * The number of operations of the '<em>Ui Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD_OPERATION_COUNT = ExtensionModelPackage.YTEXT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl <em>Ui List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiListImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiList()
	 * @generated
	 */
	int UI_LIST = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__ID = ExtensionModelPackage.YLIST__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__NAME = ExtensionModelPackage.YLIST__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__CSS_CLASS = ExtensionModelPackage.YLIST__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__CSS_ID = ExtensionModelPackage.YLIST__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__INITIAL_VISIBLE = ExtensionModelPackage.YLIST__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__VISIBLE = ExtensionModelPackage.YLIST__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__VISIBILITY_PROCESSOR = ExtensionModelPackage.YLIST__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__INITIAL_EDITABLE = ExtensionModelPackage.YLIST__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__EDITABLE = ExtensionModelPackage.YLIST__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__INITIAL_ENABLED = ExtensionModelPackage.YLIST__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__ENABLED = ExtensionModelPackage.YLIST__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__VALIDATORS = ExtensionModelPackage.YLIST__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__INTERNAL_VALIDATORS = ExtensionModelPackage.YLIST__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__COLLECTION_BINDING_ENDPOINT = ExtensionModelPackage.YLIST__COLLECTION_BINDING_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YLIST__SELECTION_BINDING_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__MULTI_SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YLIST__MULTI_SELECTION_BINDING_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__DATADESCRIPTION = ExtensionModelPackage.YLIST__DATADESCRIPTION;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__DATATYPE = ExtensionModelPackage.YLIST__DATATYPE;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__SELECTION_TYPE = ExtensionModelPackage.YLIST__SELECTION_TYPE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__SELECTION = ExtensionModelPackage.YLIST__SELECTION;

	/**
	 * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__MULTI_SELECTION = ExtensionModelPackage.YLIST__MULTI_SELECTION;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__COLLECTION = ExtensionModelPackage.YLIST__COLLECTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__TYPE = ExtensionModelPackage.YLIST__TYPE;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__TYPE_QUALIFIED_NAME = ExtensionModelPackage.YLIST__TYPE_QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Ui List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_FEATURE_COUNT = ExtensionModelPackage.YLIST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___GET_PARENT = ExtensionModelPackage.YLIST___GET_PARENT;

	/**
	 * The operation id for the '<em>Get View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___GET_VIEW = ExtensionModelPackage.YLIST___GET_VIEW;

	/**
	 * The operation id for the '<em>Add Value Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___ADD_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER = ExtensionModelPackage.YLIST___ADD_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove Value Change Listener</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___REMOVE_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER = ExtensionModelPackage.YLIST___REMOVE_VALUE_CHANGE_LISTENER__YVALUECHANGELISTENER;

	/**
	 * The operation id for the '<em>Remove All Value Chang Listeners</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___REMOVE_ALL_VALUE_CHANG_LISTENERS = ExtensionModelPackage.YLIST___REMOVE_ALL_VALUE_CHANG_LISTENERS;

	/**
	 * The operation id for the '<em>Create Collection Endpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___CREATE_COLLECTION_ENDPOINT = ExtensionModelPackage.YLIST___CREATE_COLLECTION_ENDPOINT;

	/**
	 * The operation id for the '<em>Create Selection Endpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___CREATE_SELECTION_ENDPOINT = ExtensionModelPackage.YLIST___CREATE_SELECTION_ENDPOINT;

	/**
	 * The operation id for the '<em>Create Multi Selection Endpoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST___CREATE_MULTI_SELECTION_ENDPOINT = ExtensionModelPackage.YLIST___CREATE_MULTI_SELECTION_ENDPOINT;

	/**
	 * The number of operations of the '<em>Ui List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_OPERATION_COUNT = ExtensionModelPackage.YLIST_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiModel#getViewSet <em>View Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Set</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel#getViewSet()
	 * @see #getUiModel()
	 * @generated
	 */
	EReference getUiModel_ViewSet();

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
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiIDEView#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiIDEView#getLayouts()
	 * @see #getUiIDEView()
	 * @generated
	 */
	EReference getUiIDEView_Layouts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiIDEView#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiIDEView#getBindings()
	 * @see #getUiIDEView()
	 * @generated
	 */
	EReference getUiIDEView_Bindings();

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
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment#getAlignment()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EAttribute getUiGridLayoutAssigment_Alignment();

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
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint <em>Ui Source Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Source Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint
	 * @generated
	 */
	EClass getUiSourceBindingEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Embeddable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEmbeddable()
	 * @see #getUiSourceBindingEndpoint()
	 * @generated
	 */
	EReference getUiSourceBindingEndpoint_Embeddable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getEndpoint()
	 * @see #getUiSourceBindingEndpoint()
	 * @generated
	 */
	EReference getUiSourceBindingEndpoint_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint#getPath()
	 * @see #getUiSourceBindingEndpoint()
	 * @generated
	 */
	EReference getUiSourceBindingEndpoint_Path();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint <em>Ui Target Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Target Binding Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint
	 * @generated
	 */
	EClass getUiTargetBindingEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Embeddable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint#getEmbeddable()
	 * @see #getUiTargetBindingEndpoint()
	 * @generated
	 */
	EReference getUiTargetBindingEndpoint_Embeddable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint#getEndpoint()
	 * @see #getUiTargetBindingEndpoint()
	 * @generated
	 */
	EReference getUiTargetBindingEndpoint_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiTargetBindingEndpoint#getPath()
	 * @see #getUiTargetBindingEndpoint()
	 * @generated
	 */
	EReference getUiTargetBindingEndpoint_Path();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UimodelFactory getUimodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl <em>Ui Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiModelImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiModel()
		 * @generated
		 */
		EClass UI_MODEL = eINSTANCE.getUiModel();

		/**
		 * The meta object literal for the '<em><b>View Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MODEL__VIEW_SET = eINSTANCE.getUiModel_ViewSet();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl <em>Ui IDE View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiIDEView()
		 * @generated
		 */
		EClass UI_IDE_VIEW = eINSTANCE.getUiIDEView();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_IDE_VIEW__LAYOUTS = eINSTANCE.getUiIDEView_Layouts();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_IDE_VIEW__BINDINGS = eINSTANCE.getUiIDEView_Bindings();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiGridLayoutAssigment()
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
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT = eINSTANCE.getUiGridLayoutAssigment_Alignment();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl <em>Ui Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPointImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiPoint()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl <em>Ui Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBinding()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiSourceBindingEndpointImpl <em>Ui Source Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiSourceBindingEndpointImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiSourceBindingEndpoint()
		 * @generated
		 */
		EClass UI_SOURCE_BINDING_ENDPOINT = eINSTANCE.getUiSourceBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Embeddable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE = eINSTANCE.getUiSourceBindingEndpoint_Embeddable();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SOURCE_BINDING_ENDPOINT__ENDPOINT = eINSTANCE.getUiSourceBindingEndpoint_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SOURCE_BINDING_ENDPOINT__PATH = eINSTANCE.getUiSourceBindingEndpoint_Path();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiTargetBindingEndpointImpl <em>Ui Target Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiTargetBindingEndpointImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiTargetBindingEndpoint()
		 * @generated
		 */
		EClass UI_TARGET_BINDING_ENDPOINT = eINSTANCE.getUiTargetBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Embeddable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TARGET_BINDING_ENDPOINT__EMBEDDABLE = eINSTANCE.getUiTargetBindingEndpoint_Embeddable();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TARGET_BINDING_ENDPOINT__ENDPOINT = eINSTANCE.getUiTargetBindingEndpoint_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TARGET_BINDING_ENDPOINT__PATH = eINSTANCE.getUiTargetBindingEndpoint_Path();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl <em>Ui Path Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiPathSegment()
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
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBeanSlot()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl <em>Ui Grid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiGridLayout()
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
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiTextField()
		 * @generated
		 */
		EClass UI_TEXT_FIELD = eINSTANCE.getUiTextField();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl <em>Ui List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiListImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiList()
		 * @generated
		 */
		EClass UI_LIST = eINSTANCE.getUiList();

	}

} //UimodelPackage
