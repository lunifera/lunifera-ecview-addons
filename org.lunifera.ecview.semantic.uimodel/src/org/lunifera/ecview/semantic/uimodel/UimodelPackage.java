/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

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
	String eNS_URI = "http://www.lunifera.org/ecview/dsl/UIModel/core";

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
	 * The feature id for the '<em><b>View Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__VIEW_SETS = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL__VIEWS = 1;

	/**
	 * The number of structural features of the '<em>Ui Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl <em>Ui View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiView()
	 * @generated
	 */
	int UI_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__ID = CoreModelPackage.YVIEW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__NAME = CoreModelPackage.YVIEW__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__CSS_CLASS = CoreModelPackage.YVIEW__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__CSS_ID = CoreModelPackage.YVIEW__CSS_ID;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__MARGIN = CoreModelPackage.YVIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__VISIBILITY_PROCESSOR = CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__ROOT = CoreModelPackage.YVIEW__ROOT;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__VIEW_NAME = CoreModelPackage.YVIEW__VIEW_NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__CONTENT = CoreModelPackage.YVIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__BINDING_SET = CoreModelPackage.YVIEW__BINDING_SET;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW__BEAN_SLOTS = CoreModelPackage.YVIEW__BEAN_SLOTS;

	/**
	 * The number of structural features of the '<em>Ui View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_FEATURE_COUNT = CoreModelPackage.YVIEW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl <em>Ui IDE View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiIDEView()
	 * @generated
	 */
	int UI_IDE_VIEW = 2;

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
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__CSS_CLASS = UI_VIEW__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__CSS_ID = UI_VIEW__CSS_ID;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__MARGIN = UI_VIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__VISIBILITY_PROCESSOR = UI_VIEW__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__ROOT = UI_VIEW__ROOT;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__VIEW_NAME = UI_VIEW__VIEW_NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__CONTENT = UI_VIEW__CONTENT;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BINDING_SET = UI_VIEW__BINDING_SET;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BEAN_SLOTS = UI_VIEW__BEAN_SLOTS;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BINDINGS = UI_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW__BINDING_ENDPOINT_ALIAS = UI_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui IDE View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IDE_VIEW_FEATURE_COUNT = UI_VIEW_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl <em>Ui Binding Endpoint Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBindingEndpointAlias()
	 * @generated
	 */
	int UI_BINDING_ENDPOINT_ALIAS = 4;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS__ENDPOINT = 1;

	/**
	 * The number of structural features of the '<em>Ui Binding Endpoint Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_ALIAS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointDefImpl <em>Ui Binding Endpoint Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointDefImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBindingEndpointDef()
	 * @generated
	 */
	int UI_BINDING_ENDPOINT_DEF = 5;

	/**
	 * The feature id for the '<em><b>Bindable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_DEF__BINDABLE = 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_DEF__ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_DEF__PATH = 2;

	/**
	 * The number of structural features of the '<em>Ui Binding Endpoint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_BINDING_ENDPOINT_DEF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl <em>Ui Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBinding()
	 * @generated
	 */
	int UI_BINDING = 6;

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
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl <em>Ui View Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl
	 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiViewSet()
	 * @generated
	 */
	int UI_VIEW_SET = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__ID = CoreModelPackage.YVIEW_SET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__NAME = CoreModelPackage.YVIEW_SET__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__VIEWS = CoreModelPackage.YVIEW_SET__VIEWS;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__BEAN_SLOTS = CoreModelPackage.YVIEW_SET__BEAN_SLOTS;

	/**
	 * The feature id for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET__BINDING_ENDPOINT_ALIAS = CoreModelPackage.YVIEW_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui View Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VIEW_SET_FEATURE_COUNT = CoreModelPackage.YVIEW_SET_FEATURE_COUNT + 1;

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
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiModel#getViewSets <em>View Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Sets</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel#getViewSets()
	 * @see #getUiModel()
	 * @generated
	 */
	EReference getUiModel_ViewSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiModel#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModel#getViews()
	 * @see #getUiModel()
	 * @generated
	 */
	EReference getUiModel_Views();

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
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiIDEView <em>Ui IDE View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui IDE View</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiIDEView
	 * @generated
	 */
	EClass getUiIDEView();

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
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiIDEView#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Endpoint Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiIDEView#getBindingEndpointAlias()
	 * @see #getUiIDEView()
	 * @generated
	 */
	EReference getUiIDEView_BindingEndpointAlias();

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
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef <em>Ui Binding Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Binding Endpoint Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef
	 * @generated
	 */
	EClass getUiBindingEndpointDef();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getBindable <em>Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getBindable()
	 * @see #getUiBindingEndpointDef()
	 * @generated
	 */
	EReference getUiBindingEndpointDef_Bindable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getEndpoint()
	 * @see #getUiBindingEndpointDef()
	 * @generated
	 */
	EReference getUiBindingEndpointDef_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef#getPath()
	 * @see #getUiBindingEndpointDef()
	 * @generated
	 */
	EReference getUiBindingEndpointDef_Path();

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
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.UiViewSet#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Endpoint Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.UiViewSet#getBindingEndpointAlias()
	 * @see #getUiViewSet()
	 * @generated
	 */
	EReference getUiViewSet_BindingEndpointAlias();

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
		 * The meta object literal for the '<em><b>View Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MODEL__VIEW_SETS = eINSTANCE.getUiModel_ViewSets();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_MODEL__VIEWS = eINSTANCE.getUiModel_Views();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl <em>Ui View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiView()
		 * @generated
		 */
		EClass UI_VIEW = eINSTANCE.getUiView();

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
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_IDE_VIEW__BINDINGS = eINSTANCE.getUiIDEView_Bindings();

		/**
		 * The meta object literal for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_IDE_VIEW__BINDING_ENDPOINT_ALIAS = eINSTANCE.getUiIDEView_BindingEndpointAlias();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl <em>Ui Binding Endpoint Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAliasImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBindingEndpointAlias()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointDefImpl <em>Ui Binding Endpoint Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointDefImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiBindingEndpointDef()
		 * @generated
		 */
		EClass UI_BINDING_ENDPOINT_DEF = eINSTANCE.getUiBindingEndpointDef();

		/**
		 * The meta object literal for the '<em><b>Bindable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING_ENDPOINT_DEF__BINDABLE = eINSTANCE.getUiBindingEndpointDef_Bindable();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING_ENDPOINT_DEF__ENDPOINT = eINSTANCE.getUiBindingEndpointDef_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_BINDING_ENDPOINT_DEF__PATH = eINSTANCE.getUiBindingEndpointDef_Path();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl <em>Ui View Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl
		 * @see org.lunifera.ecview.semantic.uimodel.impl.UimodelPackageImpl#getUiViewSet()
		 * @generated
		 */
		EClass UI_VIEW_SET = eINSTANCE.getUiViewSet();

		/**
		 * The meta object literal for the '<em><b>Binding Endpoint Alias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_VIEW_SET__BINDING_ENDPOINT_ALIAS = eINSTANCE.getUiViewSet_BindingEndpointAlias();

	}

} //UimodelPackage
