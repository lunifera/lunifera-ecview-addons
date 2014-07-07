/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
	String eNS_URI = "http://www.lunifera.org/ecview/dsl/UIModel/extension";

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
	 * The number of structural features of the '<em>Ui List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_LIST_FEATURE_COUNT = ExtensionModelPackage.YLIST_FEATURE_COUNT + 0;

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

	}

} //UiextensionPackage
