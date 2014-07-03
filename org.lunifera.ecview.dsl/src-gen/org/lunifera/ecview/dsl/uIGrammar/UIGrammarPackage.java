/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarFactory
 * @model kind="package"
 * @generated
 */
public interface UIGrammarPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uIGrammar";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lunifera.org/ecview/dsl/UIGrammar";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uIGrammar";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UIGrammarPackage eINSTANCE = org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiModelImpl <em>Ui Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiModelImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiModel()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiIDEViewImpl <em>Ui IDE View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiIDEViewImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiIDEView()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiGridLayoutAssigmentImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiGridLayoutAssigment()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiPointImpl <em>Ui Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiPointImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiPoint()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiBindingImpl <em>Ui Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiBindingImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiBinding()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiSourceBindingEndpointImpl <em>Ui Source Binding Endpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiSourceBindingEndpointImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiSourceBindingEndpoint()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiTargetBindingEndpointImpl <em>Ui Target Binding Endpoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiTargetBindingEndpointImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiTargetBindingEndpoint()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiPathSegmentImpl <em>Ui Path Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiPathSegmentImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiPathSegment()
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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl <em>GBean Slot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGBeanSlot()
   * @generated
   */
  int GBEAN_SLOT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GBEAN_SLOT__NAME = CoreModelPackage.YBEAN_SLOT__NAME;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GBEAN_SLOT__VALUE_TYPE = CoreModelPackage.YBEAN_SLOT__VALUE_TYPE;

  /**
   * The feature id for the '<em><b>Value Type Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME = CoreModelPackage.YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GBEAN_SLOT__JVM_TYPE = CoreModelPackage.YBEAN_SLOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GBean Slot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GBEAN_SLOT_FEATURE_COUNT = CoreModelPackage.YBEAN_SLOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutImpl <em>GGrid Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGGridLayout()
   * @generated
   */
  int GGRID_LAYOUT = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__ID = ExtensionModelPackage.YGRID_LAYOUT__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__NAME = ExtensionModelPackage.YGRID_LAYOUT__NAME;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__CSS_CLASS = ExtensionModelPackage.YGRID_LAYOUT__CSS_CLASS;

  /**
   * The feature id for the '<em><b>Css ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__CSS_ID = ExtensionModelPackage.YGRID_LAYOUT__CSS_ID;

  /**
   * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__INITIAL_VISIBLE = ExtensionModelPackage.YGRID_LAYOUT__INITIAL_VISIBLE;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__VISIBLE = ExtensionModelPackage.YGRID_LAYOUT__VISIBLE;

  /**
   * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__VISIBILITY_PROCESSOR = ExtensionModelPackage.YGRID_LAYOUT__VISIBILITY_PROCESSOR;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__ELEMENTS = ExtensionModelPackage.YGRID_LAYOUT__ELEMENTS;

  /**
   * The feature id for the '<em><b>Spacing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__SPACING = ExtensionModelPackage.YGRID_LAYOUT__SPACING;

  /**
   * The feature id for the '<em><b>Margin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__MARGIN = ExtensionModelPackage.YGRID_LAYOUT__MARGIN;

  /**
   * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__CELL_STYLES = ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__COLUMNS = ExtensionModelPackage.YGRID_LAYOUT__COLUMNS;

  /**
   * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__FILL_HORIZONTAL = ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL;

  /**
   * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__FILL_VERTICAL = ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT__CONTENTS = ExtensionModelPackage.YGRID_LAYOUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GGrid Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT_FEATURE_COUNT = ExtensionModelPackage.YGRID_LAYOUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTextFieldImpl <em>GText Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTextFieldImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTextField()
   * @generated
   */
  int GTEXT_FIELD = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__ID = ExtensionModelPackage.YTEXT_FIELD__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__NAME = ExtensionModelPackage.YTEXT_FIELD__NAME;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__CSS_CLASS = ExtensionModelPackage.YTEXT_FIELD__CSS_CLASS;

  /**
   * The feature id for the '<em><b>Css ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__CSS_ID = ExtensionModelPackage.YTEXT_FIELD__CSS_ID;

  /**
   * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__INITIAL_VISIBLE = ExtensionModelPackage.YTEXT_FIELD__INITIAL_VISIBLE;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__VISIBLE = ExtensionModelPackage.YTEXT_FIELD__VISIBLE;

  /**
   * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__VISIBILITY_PROCESSOR = ExtensionModelPackage.YTEXT_FIELD__VISIBILITY_PROCESSOR;

  /**
   * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__INITIAL_EDITABLE = ExtensionModelPackage.YTEXT_FIELD__INITIAL_EDITABLE;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__EDITABLE = ExtensionModelPackage.YTEXT_FIELD__EDITABLE;

  /**
   * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__INITIAL_ENABLED = ExtensionModelPackage.YTEXT_FIELD__INITIAL_ENABLED;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__ENABLED = ExtensionModelPackage.YTEXT_FIELD__ENABLED;

  /**
   * The feature id for the '<em><b>Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__VALIDATORS = ExtensionModelPackage.YTEXT_FIELD__VALIDATORS;

  /**
   * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__INTERNAL_VALIDATORS = ExtensionModelPackage.YTEXT_FIELD__INTERNAL_VALIDATORS;

  /**
   * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__VALUE_BINDING_ENDPOINT = ExtensionModelPackage.YTEXT_FIELD__VALUE_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__DATATYPE = ExtensionModelPackage.YTEXT_FIELD__DATATYPE;

  /**
   * The feature id for the '<em><b>Datadescription</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__DATADESCRIPTION = ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD__VALUE = ExtensionModelPackage.YTEXT_FIELD__VALUE;

  /**
   * The number of structural features of the '<em>GText Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_FIELD_FEATURE_COUNT = ExtensionModelPackage.YTEXT_FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GListImpl <em>GList</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GListImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGList()
   * @generated
   */
  int GLIST = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__ID = ExtensionModelPackage.YLIST__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__NAME = ExtensionModelPackage.YLIST__NAME;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__CSS_CLASS = ExtensionModelPackage.YLIST__CSS_CLASS;

  /**
   * The feature id for the '<em><b>Css ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__CSS_ID = ExtensionModelPackage.YLIST__CSS_ID;

  /**
   * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__INITIAL_VISIBLE = ExtensionModelPackage.YLIST__INITIAL_VISIBLE;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__VISIBLE = ExtensionModelPackage.YLIST__VISIBLE;

  /**
   * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__VISIBILITY_PROCESSOR = ExtensionModelPackage.YLIST__VISIBILITY_PROCESSOR;

  /**
   * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__INITIAL_EDITABLE = ExtensionModelPackage.YLIST__INITIAL_EDITABLE;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__EDITABLE = ExtensionModelPackage.YLIST__EDITABLE;

  /**
   * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__INITIAL_ENABLED = ExtensionModelPackage.YLIST__INITIAL_ENABLED;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__ENABLED = ExtensionModelPackage.YLIST__ENABLED;

  /**
   * The feature id for the '<em><b>Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__VALIDATORS = ExtensionModelPackage.YLIST__VALIDATORS;

  /**
   * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__INTERNAL_VALIDATORS = ExtensionModelPackage.YLIST__INTERNAL_VALIDATORS;

  /**
   * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__COLLECTION_BINDING_ENDPOINT = ExtensionModelPackage.YLIST__COLLECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YLIST__SELECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__MULTI_SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YLIST__MULTI_SELECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Datadescription</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__DATADESCRIPTION = ExtensionModelPackage.YLIST__DATADESCRIPTION;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__DATATYPE = ExtensionModelPackage.YLIST__DATATYPE;

  /**
   * The feature id for the '<em><b>Selection Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__SELECTION_TYPE = ExtensionModelPackage.YLIST__SELECTION_TYPE;

  /**
   * The feature id for the '<em><b>Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__SELECTION = ExtensionModelPackage.YLIST__SELECTION;

  /**
   * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__MULTI_SELECTION = ExtensionModelPackage.YLIST__MULTI_SELECTION;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__COLLECTION = ExtensionModelPackage.YLIST__COLLECTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__TYPE = ExtensionModelPackage.YLIST__TYPE;

  /**
   * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST__TYPE_QUALIFIED_NAME = ExtensionModelPackage.YLIST__TYPE_QUALIFIED_NAME;

  /**
   * The number of structural features of the '<em>GList</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLIST_FEATURE_COUNT = ExtensionModelPackage.YLIST_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiModel <em>Ui Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Model</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiModel
   * @generated
   */
  EClass getUiModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.dsl.uIGrammar.UiModel#getViewSet <em>View Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View Set</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiModel#getViewSet()
   * @see #getUiModel()
   * @generated
   */
  EReference getUiModel_ViewSet();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiIDEView <em>Ui IDE View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui IDE View</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiIDEView
   * @generated
   */
  EClass getUiIDEView();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.dsl.uIGrammar.UiIDEView#getLayouts <em>Layouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layouts</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiIDEView#getLayouts()
   * @see #getUiIDEView()
   * @generated
   */
  EReference getUiIDEView_Layouts();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.dsl.uIGrammar.UiIDEView#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiIDEView#getBindings()
   * @see #getUiIDEView()
   * @generated
   */
  EReference getUiIDEView_Bindings();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment <em>Ui Grid Layout Assigment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Grid Layout Assigment</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment
   * @generated
   */
  EClass getUiGridLayoutAssigment();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getElement()
   * @see #getUiGridLayoutAssigment()
   * @generated
   */
  EReference getUiGridLayoutAssigment_Element();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getAlignment <em>Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alignment</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getAlignment()
   * @see #getUiGridLayoutAssigment()
   * @generated
   */
  EAttribute getUiGridLayoutAssigment_Alignment();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getFrom()
   * @see #getUiGridLayoutAssigment()
   * @generated
   */
  EReference getUiGridLayoutAssigment_From();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment#getTo()
   * @see #getUiGridLayoutAssigment()
   * @generated
   */
  EReference getUiGridLayoutAssigment_To();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiPoint <em>Ui Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Point</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPoint
   * @generated
   */
  EClass getUiPoint();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.UiPoint#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPoint#getX()
   * @see #getUiPoint()
   * @generated
   */
  EAttribute getUiPoint_X();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.UiPoint#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPoint#getY()
   * @see #getUiPoint()
   * @generated
   */
  EAttribute getUiPoint_Y();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding <em>Ui Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Binding</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiBinding
   * @generated
   */
  EClass getUiBinding();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiBinding#getSource()
   * @see #getUiBinding()
   * @generated
   */
  EReference getUiBinding_Source();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#isTargetToSource <em>Target To Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target To Source</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiBinding#isTargetToSource()
   * @see #getUiBinding()
   * @generated
   */
  EAttribute getUiBinding_TargetToSource();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#isSourceToTarget <em>Source To Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source To Target</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiBinding#isSourceToTarget()
   * @see #getUiBinding()
   * @generated
   */
  EAttribute getUiBinding_SourceToTarget();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiBinding#getTarget()
   * @see #getUiBinding()
   * @generated
   */
  EReference getUiBinding_Target();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint <em>Ui Source Binding Endpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Source Binding Endpoint</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint
   * @generated
   */
  EClass getUiSourceBindingEndpoint();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEmbeddable <em>Embeddable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Embeddable</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEmbeddable()
   * @see #getUiSourceBindingEndpoint()
   * @generated
   */
  EReference getUiSourceBindingEndpoint_Embeddable();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEndpoint <em>Endpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Endpoint</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getEndpoint()
   * @see #getUiSourceBindingEndpoint()
   * @generated
   */
  EReference getUiSourceBindingEndpoint_Endpoint();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint#getPath()
   * @see #getUiSourceBindingEndpoint()
   * @generated
   */
  EReference getUiSourceBindingEndpoint_Path();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint <em>Ui Target Binding Endpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Target Binding Endpoint</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint
   * @generated
   */
  EClass getUiTargetBindingEndpoint();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint#getEmbeddable <em>Embeddable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Embeddable</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint#getEmbeddable()
   * @see #getUiTargetBindingEndpoint()
   * @generated
   */
  EReference getUiTargetBindingEndpoint_Embeddable();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint#getEndpoint <em>Endpoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Endpoint</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint#getEndpoint()
   * @see #getUiTargetBindingEndpoint()
   * @generated
   */
  EReference getUiTargetBindingEndpoint_Endpoint();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint#getPath()
   * @see #getUiTargetBindingEndpoint()
   * @generated
   */
  EReference getUiTargetBindingEndpoint_Path();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.UiPathSegment <em>Ui Path Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Path Segment</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPathSegment
   * @generated
   */
  EClass getUiPathSegment();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiPathSegment#getJvmField <em>Jvm Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Jvm Field</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPathSegment#getJvmField()
   * @see #getUiPathSegment()
   * @generated
   */
  EReference getUiPathSegment_JvmField();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.UiPathSegment#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPathSegment#getPath()
   * @see #getUiPathSegment()
   * @generated
   */
  EReference getUiPathSegment_Path();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GBeanSlot <em>GBean Slot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GBean Slot</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GBeanSlot
   * @generated
   */
  EClass getGBeanSlot();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.GBeanSlot#getJvmType <em>Jvm Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jvm Type</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GBeanSlot#getJvmType()
   * @see #getGBeanSlot()
   * @generated
   */
  EReference getGBeanSlot_JvmType();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayout <em>GGrid Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GGrid Layout</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayout
   * @generated
   */
  EClass getGGridLayout();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayout#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayout#getContents()
   * @see #getGGridLayout()
   * @generated
   */
  EReference getGGridLayout_Contents();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GTextField <em>GText Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GText Field</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GTextField
   * @generated
   */
  EClass getGTextField();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GList <em>GList</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GList</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GList
   * @generated
   */
  EClass getGList();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UIGrammarFactory getUIGrammarFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiModelImpl <em>Ui Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiModelImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiModel()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiIDEViewImpl <em>Ui IDE View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiIDEViewImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiIDEView()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiGridLayoutAssigmentImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiGridLayoutAssigment()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiPointImpl <em>Ui Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiPointImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiPoint()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiBindingImpl <em>Ui Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiBindingImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiBinding()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiSourceBindingEndpointImpl <em>Ui Source Binding Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiSourceBindingEndpointImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiSourceBindingEndpoint()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiTargetBindingEndpointImpl <em>Ui Target Binding Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiTargetBindingEndpointImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiTargetBindingEndpoint()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiPathSegmentImpl <em>Ui Path Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UiPathSegmentImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getUiPathSegment()
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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl <em>GBean Slot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGBeanSlot()
     * @generated
     */
    EClass GBEAN_SLOT = eINSTANCE.getGBeanSlot();

    /**
     * The meta object literal for the '<em><b>Jvm Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GBEAN_SLOT__JVM_TYPE = eINSTANCE.getGBeanSlot_JvmType();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutImpl <em>GGrid Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGGridLayout()
     * @generated
     */
    EClass GGRID_LAYOUT = eINSTANCE.getGGridLayout();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GGRID_LAYOUT__CONTENTS = eINSTANCE.getGGridLayout_Contents();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTextFieldImpl <em>GText Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTextFieldImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTextField()
     * @generated
     */
    EClass GTEXT_FIELD = eINSTANCE.getGTextField();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GListImpl <em>GList</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GListImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGList()
     * @generated
     */
    EClass GLIST = eINSTANCE.getGList();

  }

} //UIGrammarPackage
