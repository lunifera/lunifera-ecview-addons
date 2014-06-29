/**
 */
package org.lunifera.ecview.dsl.uIGrammar;

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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl <em>GBean Slot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.GBeanSlotImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getGBeanSlot()
   * @generated
   */
  int GBEAN_SLOT = 1;

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
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl <em>IDE View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getIDEView()
   * @generated
   */
  int IDE_VIEW = 2;

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
   * The number of structural features of the '<em>IDE View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDE_VIEW_FEATURE_COUNT = CoreModelPackage.YVIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.lunifera.ecview.dsl.uIGrammar.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.ActionImpl
   * @see org.lunifera.ecview.dsl.uIGrammar.impl.UIGrammarPackageImpl#getAction()
   * @generated
   */
  int ACTION = 3;

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

  }

} //UIGrammarPackage
