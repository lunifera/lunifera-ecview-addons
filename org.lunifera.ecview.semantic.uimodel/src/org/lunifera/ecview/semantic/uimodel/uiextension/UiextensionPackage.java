/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

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
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionFactory
 * @model kind="package"
 * @generated
 */
public interface UiextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uiextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/ecview/dsl/uimodel/extension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uiextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiextensionPackage eINSTANCE = org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutAssigmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiGridLayoutAssigment()
	 * @generated
	 */
	int UI_GRID_LAYOUT_ASSIGMENT = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__ELEMENT = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__FROM = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT__TO = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ui Grid Layout Assigment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_ASSIGMENT_FEATURE_COUNT = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutImpl <em>Ui Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiGridLayout()
	 * @generated
	 */
	int UI_GRID_LAYOUT = 1;

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
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__ORPHAN_DATATYPES = ExtensionModelPackage.YGRID_LAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__ORPHAN_DATADESCRIPTIONS = ExtensionModelPackage.YGRID_LAYOUT__ORPHAN_DATADESCRIPTIONS;

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
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT = ExtensionModelPackage.YGRID_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT__CONTENTS = ExtensionModelPackage.YGRID_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_GRID_LAYOUT_FEATURE_COUNT = ExtensionModelPackage.YGRID_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiTextFieldImpl <em>Ui Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiTextFieldImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiTextField()
	 * @generated
	 */
	int UI_TEXT_FIELD = 2;

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
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__ORPHAN_DATATYPES = ExtensionModelPackage.YTEXT_FIELD__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__ORPHAN_DATADESCRIPTIONS = ExtensionModelPackage.YTEXT_FIELD__ORPHAN_DATADESCRIPTIONS;

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
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD__PROCESSOR_ASSIGNMENT = ExtensionModelPackage.YTEXT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TEXT_FIELD_FEATURE_COUNT = ExtensionModelPackage.YTEXT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiListImpl <em>Ui List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiListImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiList()
	 * @generated
	 */
	int UI_LIST = 3;

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
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__ORPHAN_DATATYPES = ExtensionModelPackage.YLIST__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__ORPHAN_DATADESCRIPTIONS = ExtensionModelPackage.YLIST__ORPHAN_DATADESCRIPTIONS;

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
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__EMF_NS_URI = ExtensionModelPackage.YLIST__EMF_NS_URI;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__TYPE_QUALIFIED_NAME = ExtensionModelPackage.YLIST__TYPE_QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST__PROCESSOR_ASSIGNMENT = ExtensionModelPackage.YLIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_FEATURE_COUNT = ExtensionModelPackage.YLIST_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiNumericFieldImpl <em>Ui Numeric Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiNumericFieldImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiNumericField()
	 * @generated
	 */
	int UI_NUMERIC_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__ID = ExtensionModelPackage.YNUMERIC_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__NAME = ExtensionModelPackage.YNUMERIC_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__CSS_CLASS = ExtensionModelPackage.YNUMERIC_FIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__CSS_ID = ExtensionModelPackage.YNUMERIC_FIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__INITIAL_VISIBLE = ExtensionModelPackage.YNUMERIC_FIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__VISIBLE = ExtensionModelPackage.YNUMERIC_FIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__VISIBILITY_PROCESSOR = ExtensionModelPackage.YNUMERIC_FIELD__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__ORPHAN_DATATYPES = ExtensionModelPackage.YNUMERIC_FIELD__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__ORPHAN_DATADESCRIPTIONS = ExtensionModelPackage.YNUMERIC_FIELD__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__INITIAL_EDITABLE = ExtensionModelPackage.YNUMERIC_FIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__EDITABLE = ExtensionModelPackage.YNUMERIC_FIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__INITIAL_ENABLED = ExtensionModelPackage.YNUMERIC_FIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__ENABLED = ExtensionModelPackage.YNUMERIC_FIELD__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__VALIDATORS = ExtensionModelPackage.YNUMERIC_FIELD__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__INTERNAL_VALIDATORS = ExtensionModelPackage.YNUMERIC_FIELD__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__VALUE_BINDING_ENDPOINT = ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__DATATYPE = ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__DATADESCRIPTION = ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__VALUE = ExtensionModelPackage.YNUMERIC_FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD__PROCESSOR_ASSIGNMENT = ExtensionModelPackage.YNUMERIC_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Numeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_NUMERIC_FIELD_FEATURE_COUNT = ExtensionModelPackage.YNUMERIC_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiCheckBoxImpl <em>Ui Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiCheckBoxImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiCheckBox()
	 * @generated
	 */
	int UI_CHECK_BOX = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__ID = ExtensionModelPackage.YCHECK_BOX__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__NAME = ExtensionModelPackage.YCHECK_BOX__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__CSS_CLASS = ExtensionModelPackage.YCHECK_BOX__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__CSS_ID = ExtensionModelPackage.YCHECK_BOX__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__INITIAL_VISIBLE = ExtensionModelPackage.YCHECK_BOX__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__VISIBLE = ExtensionModelPackage.YCHECK_BOX__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__VISIBILITY_PROCESSOR = ExtensionModelPackage.YCHECK_BOX__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__ORPHAN_DATATYPES = ExtensionModelPackage.YCHECK_BOX__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__ORPHAN_DATADESCRIPTIONS = ExtensionModelPackage.YCHECK_BOX__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__INITIAL_EDITABLE = ExtensionModelPackage.YCHECK_BOX__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__EDITABLE = ExtensionModelPackage.YCHECK_BOX__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__INITIAL_ENABLED = ExtensionModelPackage.YCHECK_BOX__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__ENABLED = ExtensionModelPackage.YCHECK_BOX__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__VALIDATORS = ExtensionModelPackage.YCHECK_BOX__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__INTERNAL_VALIDATORS = ExtensionModelPackage.YCHECK_BOX__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__VALUE_BINDING_ENDPOINT = ExtensionModelPackage.YCHECK_BOX__VALUE_BINDING_ENDPOINT;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__DATADESCRIPTION = ExtensionModelPackage.YCHECK_BOX__DATADESCRIPTION;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__DATATYPE = ExtensionModelPackage.YCHECK_BOX__DATATYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__VALUE = ExtensionModelPackage.YCHECK_BOX__VALUE;

	/**
	 * The feature id for the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX__PROCESSOR_ASSIGNMENT = ExtensionModelPackage.YCHECK_BOX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHECK_BOX_FEATURE_COUNT = ExtensionModelPackage.YCHECK_BOX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessableImpl <em>Ui Visibility Processable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessableImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessable()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSABLE = 6;

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
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl <em>Ui Visibility Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessor()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSOR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Binding Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__BINDING_ALIAS = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__RULE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ui Visibility Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorDefImpl <em>Ui Visibility Processor Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorDefImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessorDef()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSOR_DEF = 8;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_DEF__PROCESSOR = UimodelPackage.UI_ROOT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Visibility Processor Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_DEF_FEATURE_COUNT = UimodelPackage.UI_ROOT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorAssignmentImpl <em>Ui Visibility Processor Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorAssignmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessorAssignment()
	 * @generated
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT = 9;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processor Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Visibility Processor Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROCESSOR_ASSIGNMENT_FEATURE_COUNT = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiChangeTriggerImpl <em>Ui Change Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiChangeTriggerImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiChangeTrigger()
	 * @generated
	 */
	int UI_CHANGE_TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHANGE_TRIGGER__ENDPOINT = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHANGE_TRIGGER__ENDPOINT_ALIAS = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Change Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CHANGE_TRIGGER_FEATURE_COUNT = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityRuleImpl <em>Ui Visibility Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityRuleImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityRule()
	 * @generated
	 */
	int UI_VISIBILITY_RULE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE__ID = VisibilityPackage.YVISIBILITY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE__NAME = VisibilityPackage.YVISIBILITY_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Binding Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE__BINDING_ENDPOINTS = VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Match Means False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE__MATCH_MEANS_FALSE = VisibilityPackage.YVISIBILITY_RULE__MATCH_MEANS_FALSE;

	/**
	 * The number of structural features of the '<em>Ui Visibility Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_RULE_FEATURE_COUNT = VisibilityPackage.YVISIBILITY_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiXbaseVisibilityRuleImpl <em>Ui Xbase Visibility Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiXbaseVisibilityRuleImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiXbaseVisibilityRule()
	 * @generated
	 */
	int UI_XBASE_VISIBILITY_RULE = 12;

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
	 * The feature id for the '<em><b>Binding Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VISIBILITY_RULE__BINDING_ENDPOINTS = UI_VISIBILITY_RULE__BINDING_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Match Means False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_XBASE_VISIBILITY_RULE__MATCH_MEANS_FALSE = UI_VISIBILITY_RULE__MATCH_MEANS_FALSE;

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
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesImpl <em>Ui Visibility Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProperties()
	 * @generated
	 */
	int UI_VISIBILITY_PROPERTIES = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__ID = VisibilityPackage.YVISIBILITY_PROPERTIES__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__NAME = VisibilityPackage.YVISIBILITY_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__VISIBLE = VisibilityPackage.YVISIBILITY_PROPERTIES__VISIBLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__EDITABLE = VisibilityPackage.YVISIBILITY_PROPERTIES__EDITABLE;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__ENABLED = VisibilityPackage.YVISIBILITY_PROPERTIES__ENABLED;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__BORDER = VisibilityPackage.YVISIBILITY_PROPERTIES__BORDER;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__BOLD = VisibilityPackage.YVISIBILITY_PROPERTIES__BOLD;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__ITALIC = VisibilityPackage.YVISIBILITY_PROPERTIES__ITALIC;

	/**
	 * The feature id for the '<em><b>Strikethrough</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__STRIKETHROUGH = VisibilityPackage.YVISIBILITY_PROPERTIES__STRIKETHROUGH;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__UNDERLINE = VisibilityPackage.YVISIBILITY_PROPERTIES__UNDERLINE;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__BACKGROUND_COLOR = VisibilityPackage.YVISIBILITY_PROPERTIES__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES__FOREGROUND_COLOR = VisibilityPackage.YVISIBILITY_PROPERTIES__FOREGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Ui Visibility Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_FEATURE_COUNT = VisibilityPackage.YVISIBILITY_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesAssignmentImpl <em>Ui Visibility Properties Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesAssignmentImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityPropertiesAssignment()
	 * @generated
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT = 15;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesDefImpl <em>Ui Visibility Properties Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesDefImpl
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityPropertiesDef()
	 * @generated
	 */
	int UI_VISIBILITY_PROPERTIES_DEF = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_DEF__PROPERTIES = UimodelPackage.UI_ROOT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui Visibility Properties Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_DEF_FEATURE_COUNT = UimodelPackage.UI_ROOT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ui Visibility Properties Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VISIBILITY_PROPERTIES_ASSIGNMENT_FEATURE_COUNT = UimodelPackage.UI_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment <em>Ui Grid Layout Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Grid Layout Assigment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment
	 * @generated
	 */
	EClass getUiGridLayoutAssigment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getElement()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EReference getUiGridLayoutAssigment_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getAlignment()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EAttribute getUiGridLayoutAssigment_Alignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getFrom()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EReference getUiGridLayoutAssigment_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getTo()
	 * @see #getUiGridLayoutAssigment()
	 * @generated
	 */
	EReference getUiGridLayoutAssigment_To();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout <em>Ui Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Grid Layout</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout
	 * @generated
	 */
	EClass getUiGridLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout#getContents()
	 * @see #getUiGridLayout()
	 * @generated
	 */
	EReference getUiGridLayout_Contents();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField <em>Ui Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Text Field</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField
	 * @generated
	 */
	EClass getUiTextField();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiList <em>Ui List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui List</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiList
	 * @generated
	 */
	EClass getUiList();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiNumericField <em>Ui Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Numeric Field</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiNumericField
	 * @generated
	 */
	EClass getUiNumericField();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiCheckBox <em>Ui Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Check Box</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiCheckBox
	 * @generated
	 */
	EClass getUiCheckBox();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessable <em>Ui Visibility Processable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processable</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessable
	 * @generated
	 */
	EClass getUiVisibilityProcessable();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessable#getProcessorAssignment <em>Processor Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessable#getProcessorAssignment()
	 * @see #getUiVisibilityProcessable()
	 * @generated
	 */
	EReference getUiVisibilityProcessable_ProcessorAssignment();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor <em>Ui Visibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processor</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor
	 * @generated
	 */
	EClass getUiVisibilityProcessor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getBindingAlias <em>Binding Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getBindingAlias()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_BindingAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getChangeTrigger <em>Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Trigger</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getChangeTrigger()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_ChangeTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getRule()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getPropertiesAssignment <em>Properties Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor#getPropertiesAssignment()
	 * @see #getUiVisibilityProcessor()
	 * @generated
	 */
	EReference getUiVisibilityProcessor_PropertiesAssignment();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorDef <em>Ui Visibility Processor Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processor Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorDef
	 * @generated
	 */
	EClass getUiVisibilityProcessorDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorDef#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorDef#getProcessor()
	 * @see #getUiVisibilityProcessorDef()
	 * @generated
	 */
	EReference getUiVisibilityProcessorDef_Processor();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment <em>Ui Visibility Processor Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Processor Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment
	 * @generated
	 */
	EClass getUiVisibilityProcessorAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment#getProcessor()
	 * @see #getUiVisibilityProcessorAssignment()
	 * @generated
	 */
	EReference getUiVisibilityProcessorAssignment_Processor();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment#getProcessorAlias <em>Processor Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment#getProcessorAlias()
	 * @see #getUiVisibilityProcessorAssignment()
	 * @generated
	 */
	EReference getUiVisibilityProcessorAssignment_ProcessorAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger <em>Ui Change Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Change Trigger</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger
	 * @generated
	 */
	EClass getUiChangeTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endpoint</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpoint()
	 * @see #getUiChangeTrigger()
	 * @generated
	 */
	EReference getUiChangeTrigger_Endpoint();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpointAlias <em>Endpoint Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger#getEndpointAlias()
	 * @see #getUiChangeTrigger()
	 * @generated
	 */
	EReference getUiChangeTrigger_EndpointAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityRule <em>Ui Visibility Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Rule</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityRule
	 * @generated
	 */
	EClass getUiVisibilityRule();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiXbaseVisibilityRule <em>Ui Xbase Visibility Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Xbase Visibility Rule</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiXbaseVisibilityRule
	 * @generated
	 */
	EClass getUiXbaseVisibilityRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiXbaseVisibilityRule#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiXbaseVisibilityRule#getExpression()
	 * @see #getUiXbaseVisibilityRule()
	 * @generated
	 */
	EReference getUiXbaseVisibilityRule_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProperties <em>Ui Visibility Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProperties
	 * @generated
	 */
	EClass getUiVisibilityProperties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment <em>Ui Visibility Properties Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Properties Assignment</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment
	 * @generated
	 */
	EClass getUiVisibilityPropertiesAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment#getProperties()
	 * @see #getUiVisibilityPropertiesAssignment()
	 * @generated
	 */
	EReference getUiVisibilityPropertiesAssignment_Properties();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment#getPropertyAlias <em>Property Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Alias</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment#getPropertyAlias()
	 * @see #getUiVisibilityPropertiesAssignment()
	 * @generated
	 */
	EReference getUiVisibilityPropertiesAssignment_PropertyAlias();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesDef <em>Ui Visibility Properties Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Visibility Properties Def</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesDef
	 * @generated
	 */
	EClass getUiVisibilityPropertiesDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesDef#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesDef#getProperties()
	 * @see #getUiVisibilityPropertiesDef()
	 * @generated
	 */
	EReference getUiVisibilityPropertiesDef_Properties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiextensionFactory getUiextensionFactory();

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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutAssigmentImpl <em>Ui Grid Layout Assigment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutAssigmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiGridLayoutAssigment()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutImpl <em>Ui Grid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiGridLayout()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiTextFieldImpl <em>Ui Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiTextFieldImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiTextField()
		 * @generated
		 */
		EClass UI_TEXT_FIELD = eINSTANCE.getUiTextField();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiListImpl <em>Ui List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiListImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiList()
		 * @generated
		 */
		EClass UI_LIST = eINSTANCE.getUiList();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiNumericFieldImpl <em>Ui Numeric Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiNumericFieldImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiNumericField()
		 * @generated
		 */
		EClass UI_NUMERIC_FIELD = eINSTANCE.getUiNumericField();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiCheckBoxImpl <em>Ui Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiCheckBoxImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiCheckBox()
		 * @generated
		 */
		EClass UI_CHECK_BOX = eINSTANCE.getUiCheckBox();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessableImpl <em>Ui Visibility Processable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessableImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessable()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl <em>Ui Visibility Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessor()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorDefImpl <em>Ui Visibility Processor Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorDefImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessorDef()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorAssignmentImpl <em>Ui Visibility Processor Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorAssignmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProcessorAssignment()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiChangeTriggerImpl <em>Ui Change Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiChangeTriggerImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiChangeTrigger()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityRuleImpl <em>Ui Visibility Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityRuleImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityRule()
		 * @generated
		 */
		EClass UI_VISIBILITY_RULE = eINSTANCE.getUiVisibilityRule();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiXbaseVisibilityRuleImpl <em>Ui Xbase Visibility Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiXbaseVisibilityRuleImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiXbaseVisibilityRule()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesImpl <em>Ui Visibility Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityProperties()
		 * @generated
		 */
		EClass UI_VISIBILITY_PROPERTIES = eINSTANCE.getUiVisibilityProperties();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesAssignmentImpl <em>Ui Visibility Properties Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesAssignmentImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityPropertiesAssignment()
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
		 * The meta object literal for the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesDefImpl <em>Ui Visibility Properties Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesDefImpl
		 * @see org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiextensionPackageImpl#getUiVisibilityPropertiesDef()
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

	}

} //UiextensionPackage
