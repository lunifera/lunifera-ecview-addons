/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.ecview.dsl.uIGrammar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIGrammarFactoryImpl extends EFactoryImpl implements UIGrammarFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UIGrammarFactory init()
  {
    try
    {
      UIGrammarFactory theUIGrammarFactory = (UIGrammarFactory)EPackage.Registry.INSTANCE.getEFactory(UIGrammarPackage.eNS_URI);
      if (theUIGrammarFactory != null)
      {
        return theUIGrammarFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UIGrammarFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIGrammarFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UIGrammarPackage.UI_MODEL: return createUiModel();
      case UIGrammarPackage.IDE_VIEW: return createIDEView();
      case UIGrammarPackage.GTEXT_BINDING_DEFS: return createGTextBindingDefs();
      case UIGrammarPackage.GTEXT_BINDING_DEF: return createGTextBindingDef();
      case UIGrammarPackage.ACTION: return createAction();
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT: return createGGridLayoutAssigment();
      case UIGrammarPackage.POINT: return createPoint();
      case UIGrammarPackage.BINDING: return createBinding();
      case UIGrammarPackage.GBEAN_SLOT: return createGBeanSlot();
      case UIGrammarPackage.GGRID_LAYOUT: return createGGridLayout();
      case UIGrammarPackage.GTEXT_FIELD: return createGTextField();
      case UIGrammarPackage.GTEXT_AREA: return createGTextArea();
      case UIGrammarPackage.GTABLE: return createGTable();
      case UIGrammarPackage.GTTREE: return createGTtree();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiModel createUiModel()
  {
    UiModelImpl uiModel = new UiModelImpl();
    return uiModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDEView createIDEView()
  {
    IDEViewImpl ideView = new IDEViewImpl();
    return ideView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GTextBindingDefs createGTextBindingDefs()
  {
    GTextBindingDefsImpl gTextBindingDefs = new GTextBindingDefsImpl();
    return gTextBindingDefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GTextBindingDef createGTextBindingDef()
  {
    GTextBindingDefImpl gTextBindingDef = new GTextBindingDefImpl();
    return gTextBindingDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GGridLayoutAssigment createGGridLayoutAssigment()
  {
    GGridLayoutAssigmentImpl gGridLayoutAssigment = new GGridLayoutAssigmentImpl();
    return gGridLayoutAssigment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GBeanSlot createGBeanSlot()
  {
    GBeanSlotImpl gBeanSlot = new GBeanSlotImpl();
    return gBeanSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GGridLayout createGGridLayout()
  {
    GGridLayoutImpl gGridLayout = new GGridLayoutImpl();
    return gGridLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GTextField createGTextField()
  {
    GTextFieldImpl gTextField = new GTextFieldImpl();
    return gTextField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GTextArea createGTextArea()
  {
    GTextAreaImpl gTextArea = new GTextAreaImpl();
    return gTextArea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GTable createGTable()
  {
    GTableImpl gTable = new GTableImpl();
    return gTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GTtree createGTtree()
  {
    GTtreeImpl gTtree = new GTtreeImpl();
    return gTtree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIGrammarPackage getUIGrammarPackage()
  {
    return (UIGrammarPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UIGrammarPackage getPackage()
  {
    return UIGrammarPackage.eINSTANCE;
  }

} //UIGrammarFactoryImpl
