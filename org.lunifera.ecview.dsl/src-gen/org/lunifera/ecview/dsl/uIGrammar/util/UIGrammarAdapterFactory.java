/**
 */
package org.lunifera.ecview.dsl.uIGrammar.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;

import org.lunifera.ecview.dsl.uIGrammar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage
 * @generated
 */
public class UIGrammarAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UIGrammarPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIGrammarAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UIGrammarPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UIGrammarSwitch<Adapter> modelSwitch =
    new UIGrammarSwitch<Adapter>()
    {
      @Override
      public Adapter caseUiModel(UiModel object)
      {
        return createUiModelAdapter();
      }
      @Override
      public Adapter caseGBeanSlot(GBeanSlot object)
      {
        return createGBeanSlotAdapter();
      }
      @Override
      public Adapter caseIDEView(IDEView object)
      {
        return createIDEViewAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseYBeanSlot(YBeanSlot object)
      {
        return createYBeanSlotAdapter();
      }
      @Override
      public Adapter caseYElement(YElement object)
      {
        return createYElementAdapter();
      }
      @Override
      public Adapter caseYCssAble(YCssAble object)
      {
        return createYCssAbleAdapter();
      }
      @Override
      public Adapter caseYMarginable(YMarginable object)
      {
        return createYMarginableAdapter();
      }
      @Override
      public Adapter caseYVisibilityProcessable(YVisibilityProcessable object)
      {
        return createYVisibilityProcessableAdapter();
      }
      @Override
      public Adapter caseYView(YView object)
      {
        return createYViewAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiModel <em>Ui Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiModel
   * @generated
   */
  public Adapter createUiModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.GBeanSlot <em>GBean Slot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.GBeanSlot
   * @generated
   */
  public Adapter createGBeanSlotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.IDEView <em>IDE View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.IDEView
   * @generated
   */
  public Adapter createIDEViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot <em>YBean Slot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot
   * @generated
   */
  public Adapter createYBeanSlotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YElement <em>YElement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YElement
   * @generated
   */
  public Adapter createYElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCssAble <em>YCss Able</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YCssAble
   * @generated
   */
  public Adapter createYCssAbleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMarginable <em>YMarginable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YMarginable
   * @generated
   */
  public Adapter createYMarginableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable <em>YVisibility Processable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable
   * @generated
   */
  public Adapter createYVisibilityProcessableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView <em>YView</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YView
   * @generated
   */
  public Adapter createYViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UIGrammarAdapterFactory
