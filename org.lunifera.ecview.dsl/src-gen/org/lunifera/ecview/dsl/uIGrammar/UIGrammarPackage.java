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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl <em>IDE View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getIDEView()
   * @generated
   */
  int IDE_VIEW = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__ID = CoreModelPackage.YVIEW__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__NAME = CoreModelPackage.YVIEW__NAME;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__CSS_CLASS = CoreModelPackage.YVIEW__CSS_CLASS;

  /**
   * The feature id for the '<em><b>Css ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__CSS_ID = CoreModelPackage.YVIEW__CSS_ID;

  /**
   * The feature id for the '<em><b>Margin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__MARGIN = CoreModelPackage.YVIEW__MARGIN;

  /**
   * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__VISIBILITY_PROCESSOR = CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__ROOT = CoreModelPackage.YVIEW__ROOT;

  /**
   * The feature id for the '<em><b>View Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__VIEW_NAME = CoreModelPackage.YVIEW__VIEW_NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__CONTENT = CoreModelPackage.YVIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__BINDING_SET = CoreModelPackage.YVIEW__BINDING_SET;

  /**
   * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__BEAN_SLOTS = CoreModelPackage.YVIEW__BEAN_SLOTS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__ACTIONS = CoreModelPackage.YVIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__LAYOUTS = CoreModelPackage.YVIEW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW__BINDINGS = CoreModelPackage.YVIEW_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>IDE View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW_FEATURE_COUNT = CoreModelPackage.YVIEW_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.ActionImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__BODY = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl <em>GGrid Layout Assigment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGGridLayoutAssigment()
   * @generated
   */
  int GGRID_LAYOUT_ASSIGMENT = 3;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT_ASSIGMENT__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Alignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT_ASSIGMENT__ALIGNMENT = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT_ASSIGMENT__FROM = 2;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT_ASSIGMENT__TO = 3;

  /**
   * The number of structural features of the '<em>GGrid Layout Assigment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GGRID_LAYOUT_ASSIGMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.PointImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getPoint()
   * @generated
   */
  int POINT = 4;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Y = 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.BindingImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 5;

  /**
   * The feature id for the '<em><b>Embeddable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__EMBEDDABLE = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__METHOD = 1;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl <em>GBean Slot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGBeanSlot()
   * @generated
   */
  int GBEAN_SLOT = 6;

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
  int GGRID_LAYOUT = 7;

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
  int GTEXT_FIELD = 8;

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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTextAreaImpl <em>GText Area</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTextAreaImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTextArea()
   * @generated
   */
  int GTEXT_AREA = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__ID = ExtensionModelPackage.YTEXT_AREA__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__NAME = ExtensionModelPackage.YTEXT_AREA__NAME;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__CSS_CLASS = ExtensionModelPackage.YTEXT_AREA__CSS_CLASS;

  /**
   * The feature id for the '<em><b>Css ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__CSS_ID = ExtensionModelPackage.YTEXT_AREA__CSS_ID;

  /**
   * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__INITIAL_VISIBLE = ExtensionModelPackage.YTEXT_AREA__INITIAL_VISIBLE;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__VISIBLE = ExtensionModelPackage.YTEXT_AREA__VISIBLE;

  /**
   * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__VISIBILITY_PROCESSOR = ExtensionModelPackage.YTEXT_AREA__VISIBILITY_PROCESSOR;

  /**
   * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__INITIAL_EDITABLE = ExtensionModelPackage.YTEXT_AREA__INITIAL_EDITABLE;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__EDITABLE = ExtensionModelPackage.YTEXT_AREA__EDITABLE;

  /**
   * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__INITIAL_ENABLED = ExtensionModelPackage.YTEXT_AREA__INITIAL_ENABLED;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__ENABLED = ExtensionModelPackage.YTEXT_AREA__ENABLED;

  /**
   * The feature id for the '<em><b>Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__VALIDATORS = ExtensionModelPackage.YTEXT_AREA__VALIDATORS;

  /**
   * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__INTERNAL_VALIDATORS = ExtensionModelPackage.YTEXT_AREA__INTERNAL_VALIDATORS;

  /**
   * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__VALUE_BINDING_ENDPOINT = ExtensionModelPackage.YTEXT_AREA__VALUE_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Datadescription</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__DATADESCRIPTION = ExtensionModelPackage.YTEXT_AREA__DATADESCRIPTION;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__DATATYPE = ExtensionModelPackage.YTEXT_AREA__DATATYPE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA__VALUE = ExtensionModelPackage.YTEXT_AREA__VALUE;

  /**
   * The number of structural features of the '<em>GText Area</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTEXT_AREA_FEATURE_COUNT = ExtensionModelPackage.YTEXT_AREA_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTableImpl <em>GTable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTableImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTable()
   * @generated
   */
  int GTABLE = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__ID = ExtensionModelPackage.YTABLE__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__NAME = ExtensionModelPackage.YTABLE__NAME;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__CSS_CLASS = ExtensionModelPackage.YTABLE__CSS_CLASS;

  /**
   * The feature id for the '<em><b>Css ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__CSS_ID = ExtensionModelPackage.YTABLE__CSS_ID;

  /**
   * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__INITIAL_VISIBLE = ExtensionModelPackage.YTABLE__INITIAL_VISIBLE;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__VISIBLE = ExtensionModelPackage.YTABLE__VISIBLE;

  /**
   * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__VISIBILITY_PROCESSOR = ExtensionModelPackage.YTABLE__VISIBILITY_PROCESSOR;

  /**
   * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__INITIAL_EDITABLE = ExtensionModelPackage.YTABLE__INITIAL_EDITABLE;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__EDITABLE = ExtensionModelPackage.YTABLE__EDITABLE;

  /**
   * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__INITIAL_ENABLED = ExtensionModelPackage.YTABLE__INITIAL_ENABLED;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__ENABLED = ExtensionModelPackage.YTABLE__ENABLED;

  /**
   * The feature id for the '<em><b>Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__VALIDATORS = ExtensionModelPackage.YTABLE__VALIDATORS;

  /**
   * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__INTERNAL_VALIDATORS = ExtensionModelPackage.YTABLE__INTERNAL_VALIDATORS;

  /**
   * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__COLLECTION_BINDING_ENDPOINT = ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__MULTI_SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__DATATYPE = ExtensionModelPackage.YTABLE__DATATYPE;

  /**
   * The feature id for the '<em><b>Datadescription</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__DATADESCRIPTION = ExtensionModelPackage.YTABLE__DATADESCRIPTION;

  /**
   * The feature id for the '<em><b>Selection Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__SELECTION_TYPE = ExtensionModelPackage.YTABLE__SELECTION_TYPE;

  /**
   * The feature id for the '<em><b>Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__SELECTION = ExtensionModelPackage.YTABLE__SELECTION;

  /**
   * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__MULTI_SELECTION = ExtensionModelPackage.YTABLE__MULTI_SELECTION;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__COLLECTION = ExtensionModelPackage.YTABLE__COLLECTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__TYPE = ExtensionModelPackage.YTABLE__TYPE;

  /**
   * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__TYPE_QUALIFIED_NAME = ExtensionModelPackage.YTABLE__TYPE_QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE__JVM_TYPE = ExtensionModelPackage.YTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GTable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTABLE_FEATURE_COUNT = ExtensionModelPackage.YTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTtreeImpl <em>GTtree</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTtreeImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTtree()
   * @generated
   */
  int GTTREE = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__ID = ExtensionModelPackage.YTREE__ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__NAME = ExtensionModelPackage.YTREE__NAME;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__CSS_CLASS = ExtensionModelPackage.YTREE__CSS_CLASS;

  /**
   * The feature id for the '<em><b>Css ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__CSS_ID = ExtensionModelPackage.YTREE__CSS_ID;

  /**
   * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__INITIAL_VISIBLE = ExtensionModelPackage.YTREE__INITIAL_VISIBLE;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__VISIBLE = ExtensionModelPackage.YTREE__VISIBLE;

  /**
   * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__VISIBILITY_PROCESSOR = ExtensionModelPackage.YTREE__VISIBILITY_PROCESSOR;

  /**
   * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__INITIAL_EDITABLE = ExtensionModelPackage.YTREE__INITIAL_EDITABLE;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__EDITABLE = ExtensionModelPackage.YTREE__EDITABLE;

  /**
   * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__INITIAL_ENABLED = ExtensionModelPackage.YTREE__INITIAL_ENABLED;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__ENABLED = ExtensionModelPackage.YTREE__ENABLED;

  /**
   * The feature id for the '<em><b>Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__VALIDATORS = ExtensionModelPackage.YTREE__VALIDATORS;

  /**
   * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__INTERNAL_VALIDATORS = ExtensionModelPackage.YTREE__INTERNAL_VALIDATORS;

  /**
   * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__COLLECTION_BINDING_ENDPOINT = ExtensionModelPackage.YTREE__COLLECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YTREE__SELECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__MULTI_SELECTION_BINDING_ENDPOINT = ExtensionModelPackage.YTREE__MULTI_SELECTION_BINDING_ENDPOINT;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__DATATYPE = ExtensionModelPackage.YTREE__DATATYPE;

  /**
   * The feature id for the '<em><b>Datadescription</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__DATADESCRIPTION = ExtensionModelPackage.YTREE__DATADESCRIPTION;

  /**
   * The feature id for the '<em><b>Selection Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__SELECTION_TYPE = ExtensionModelPackage.YTREE__SELECTION_TYPE;

  /**
   * The feature id for the '<em><b>Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__SELECTION = ExtensionModelPackage.YTREE__SELECTION;

  /**
   * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__MULTI_SELECTION = ExtensionModelPackage.YTREE__MULTI_SELECTION;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__COLLECTION = ExtensionModelPackage.YTREE__COLLECTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__TYPE = ExtensionModelPackage.YTREE__TYPE;

  /**
   * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__TYPE_QUALIFIED_NAME = ExtensionModelPackage.YTREE__TYPE_QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Jvm Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE__JVM_TYPE = ExtensionModelPackage.YTREE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GTtree</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTTREE_FEATURE_COUNT = ExtensionModelPackage.YTREE_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.IDEView <em>IDE View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IDE View</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.IDEView
   * @generated
   */
  EClass getIDEView();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.dsl.uIGrammar.IDEView#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.IDEView#getActions()
   * @see #getIDEView()
   * @generated
   */
  EReference getIDEView_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.dsl.uIGrammar.IDEView#getLayouts <em>Layouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layouts</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.IDEView#getLayouts()
   * @see #getIDEView()
   * @generated
   */
  EReference getIDEView_Layouts();

  /**
   * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.dsl.uIGrammar.IDEView#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.IDEView#getBindings()
   * @see #getIDEView()
   * @generated
   */
  EReference getIDEView_Bindings();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.Action#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Action#getBody()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Body();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment <em>GGrid Layout Assigment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GGrid Layout Assigment</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment
   * @generated
   */
  EClass getGGridLayoutAssigment();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getElement()
   * @see #getGGridLayoutAssigment()
   * @generated
   */
  EReference getGGridLayoutAssigment_Element();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getAlignment <em>Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alignment</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getAlignment()
   * @see #getGGridLayoutAssigment()
   * @generated
   */
  EAttribute getGGridLayoutAssigment_Alignment();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getFrom()
   * @see #getGGridLayoutAssigment()
   * @generated
   */
  EReference getGGridLayoutAssigment_From();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment#getTo()
   * @see #getGGridLayoutAssigment()
   * @generated
   */
  EReference getGGridLayoutAssigment_To();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link org.lunifera.ecview.dsl.uIGrammar.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.dsl.uIGrammar.Binding#getEmbeddable <em>Embeddable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Embeddable</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Binding#getEmbeddable()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Embeddable();

  /**
   * Returns the meta object for the reference '{@link org.lunifera.ecview.dsl.uIGrammar.Binding#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.Binding#getMethod()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Method();

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
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GTextArea <em>GText Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GText Area</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GTextArea
   * @generated
   */
  EClass getGTextArea();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GTable <em>GTable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GTable</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GTable
   * @generated
   */
  EClass getGTable();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.GTable#getJvmType <em>Jvm Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jvm Type</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GTable#getJvmType()
   * @see #getGTable()
   * @generated
   */
  EReference getGTable_JvmType();

  /**
   * Returns the meta object for class '{@link org.lunifera.ecview.dsl.uIGrammar.GTtree <em>GTtree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GTtree</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GTtree
   * @generated
   */
  EClass getGTtree();

  /**
   * Returns the meta object for the containment reference '{@link org.lunifera.ecview.dsl.uIGrammar.GTtree#getJvmType <em>Jvm Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Jvm Type</em>'.
   * @see org.lunifera.ecview.dsl.uIGrammar.GTtree#getJvmType()
   * @see #getGTtree()
   * @generated
   */
  EReference getGTtree_JvmType();

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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl <em>IDE View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getIDEView()
     * @generated
     */
    EClass IDE_VIEW = eINSTANCE.getIDEView();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDE_VIEW__ACTIONS = eINSTANCE.getIDEView_Actions();

    /**
     * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDE_VIEW__LAYOUTS = eINSTANCE.getIDEView_Layouts();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDE_VIEW__BINDINGS = eINSTANCE.getIDEView_Bindings();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.ActionImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__BODY = eINSTANCE.getAction_Body();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl <em>GGrid Layout Assigment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGGridLayoutAssigment()
     * @generated
     */
    EClass GGRID_LAYOUT_ASSIGMENT = eINSTANCE.getGGridLayoutAssigment();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GGRID_LAYOUT_ASSIGMENT__ELEMENT = eINSTANCE.getGGridLayoutAssigment_Element();

    /**
     * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GGRID_LAYOUT_ASSIGMENT__ALIGNMENT = eINSTANCE.getGGridLayoutAssigment_Alignment();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GGRID_LAYOUT_ASSIGMENT__FROM = eINSTANCE.getGGridLayoutAssigment_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GGRID_LAYOUT_ASSIGMENT__TO = eINSTANCE.getGGridLayoutAssigment_To();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.PointImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__X = eINSTANCE.getPoint_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.BindingImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Embeddable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__EMBEDDABLE = eINSTANCE.getBinding_Embeddable();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__METHOD = eINSTANCE.getBinding_Method();

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
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTextAreaImpl <em>GText Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTextAreaImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTextArea()
     * @generated
     */
    EClass GTEXT_AREA = eINSTANCE.getGTextArea();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTableImpl <em>GTable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTableImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTable()
     * @generated
     */
    EClass GTABLE = eINSTANCE.getGTable();

    /**
     * The meta object literal for the '<em><b>Jvm Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GTABLE__JVM_TYPE = eINSTANCE.getGTable_JvmType();

    /**
     * The meta object literal for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTtreeImpl <em>GTtree</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.GTtreeImpl
     * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGTtree()
     * @generated
     */
    EClass GTTREE = eINSTANCE.getGTtree();

    /**
     * The meta object literal for the '<em><b>Jvm Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GTTREE__JVM_TYPE = eINSTANCE.getGTtree_JvmType();

  }

} //UIGrammarPackage
