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
      case UIGrammarPackage.UI_IDE_VIEW: return createUiIDEView();
      case UIGrammarPackage.UI_GRID_LAYOUT_ASSIGMENT: return createUiGridLayoutAssigment();
      case UIGrammarPackage.UI_POINT: return createUiPoint();
      case UIGrammarPackage.UI_BINDING: return createUiBinding();
      case UIGrammarPackage.UI_SOURCE_BINDING_ENDPOINT: return createUiSourceBindingEndpoint();
      case UIGrammarPackage.UI_TARGET_BINDING_ENDPOINT: return createUiTargetBindingEndpoint();
      case UIGrammarPackage.UI_PATH_SEGMENT: return createUiPathSegment();
      case UIGrammarPackage.GBEAN_SLOT: return createGBeanSlot();
      case UIGrammarPackage.GGRID_LAYOUT: return createGGridLayout();
      case UIGrammarPackage.GTEXT_FIELD: return createGTextField();
      case UIGrammarPackage.GLIST: return createGList();
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
  public UiIDEView createUiIDEView()
  {
    UiIDEViewImpl uiIDEView = new UiIDEViewImpl();
    return uiIDEView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiGridLayoutAssigment createUiGridLayoutAssigment()
  {
    UiGridLayoutAssigmentImpl uiGridLayoutAssigment = new UiGridLayoutAssigmentImpl();
    return uiGridLayoutAssigment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiPoint createUiPoint()
  {
    UiPointImpl uiPoint = new UiPointImpl();
    return uiPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiBinding createUiBinding()
  {
    UiBindingImpl uiBinding = new UiBindingImpl();
    return uiBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiSourceBindingEndpoint createUiSourceBindingEndpoint()
  {
    UiSourceBindingEndpointImpl uiSourceBindingEndpoint = new UiSourceBindingEndpointImpl();
    return uiSourceBindingEndpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiTargetBindingEndpoint createUiTargetBindingEndpoint()
  {
    UiTargetBindingEndpointImpl uiTargetBindingEndpoint = new UiTargetBindingEndpointImpl();
    return uiTargetBindingEndpoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiPathSegment createUiPathSegment()
  {
    UiPathSegmentImpl uiPathSegment = new UiPathSegmentImpl();
    return uiPathSegment;
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
  public GList createGList()
  {
    GListImpl gList = new GListImpl();
    return gList;
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
