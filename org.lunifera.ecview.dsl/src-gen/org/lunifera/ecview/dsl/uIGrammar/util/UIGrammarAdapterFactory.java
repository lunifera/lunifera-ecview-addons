/**
 */
package org.lunifera.ecview.dsl.uIGrammar.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;

import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YInput;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;

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
      public Adapter caseUiIDEView(UiIDEView object)
      {
        return createUiIDEViewAdapter();
      }
      @Override
      public Adapter caseUiGridLayoutAssigment(UiGridLayoutAssigment object)
      {
        return createUiGridLayoutAssigmentAdapter();
      }
      @Override
      public Adapter caseUiPoint(UiPoint object)
      {
        return createUiPointAdapter();
      }
      @Override
      public Adapter caseUiBinding(UiBinding object)
      {
        return createUiBindingAdapter();
      }
      @Override
      public Adapter caseUiSourceBindingEndpoint(UiSourceBindingEndpoint object)
      {
        return createUiSourceBindingEndpointAdapter();
      }
      @Override
      public Adapter caseUiTargetBindingEndpoint(UiTargetBindingEndpoint object)
      {
        return createUiTargetBindingEndpointAdapter();
      }
      @Override
      public Adapter caseUiPathSegment(UiPathSegment object)
      {
        return createUiPathSegmentAdapter();
      }
      @Override
      public Adapter caseGBeanSlot(GBeanSlot object)
      {
        return createGBeanSlotAdapter();
      }
      @Override
      public Adapter caseGGridLayout(GGridLayout object)
      {
        return createGGridLayoutAdapter();
      }
      @Override
      public Adapter caseGTextField(GTextField object)
      {
        return createGTextFieldAdapter();
      }
      @Override
      public Adapter caseGList(GList object)
      {
        return createGListAdapter();
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
      public Adapter caseYBindable(YBindable object)
      {
        return createYBindableAdapter();
      }
      @Override
      public Adapter caseYBeanSlot(YBeanSlot object)
      {
        return createYBeanSlotAdapter();
      }
      @Override
      public Adapter caseYVisibleable(YVisibleable object)
      {
        return createYVisibleableAdapter();
      }
      @Override
      public Adapter caseYEmbeddable(YEmbeddable object)
      {
        return createYEmbeddableAdapter();
      }
      @Override
      public Adapter caseYLayout(YLayout object)
      {
        return createYLayoutAdapter();
      }
      @Override
      public Adapter caseYSpacingable(YSpacingable object)
      {
        return createYSpacingableAdapter();
      }
      @Override
      public Adapter caseYGridLayout(YGridLayout object)
      {
        return createYGridLayoutAdapter();
      }
      @Override
      public Adapter caseYEditable(YEditable object)
      {
        return createYEditableAdapter();
      }
      @Override
      public Adapter caseYEnable(YEnable object)
      {
        return createYEnableAdapter();
      }
      @Override
      public Adapter caseYField(YField object)
      {
        return createYFieldAdapter();
      }
      @Override
      public Adapter caseYInput(YInput object)
      {
        return createYInputAdapter();
      }
      @Override
      public Adapter caseYValueBindable(YValueBindable object)
      {
        return createYValueBindableAdapter();
      }
      @Override
      public Adapter caseYTextField(YTextField object)
      {
        return createYTextFieldAdapter();
      }
      @Override
      public Adapter caseYCollectionBindable(YCollectionBindable object)
      {
        return createYCollectionBindableAdapter();
      }
      @Override
      public Adapter caseYSelectionBindable(YSelectionBindable object)
      {
        return createYSelectionBindableAdapter();
      }
      @Override
      public Adapter caseYMultiSelectionBindable(YMultiSelectionBindable object)
      {
        return createYMultiSelectionBindableAdapter();
      }
      @Override
      public Adapter caseYList(YList object)
      {
        return createYListAdapter();
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
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiIDEView <em>Ui IDE View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiIDEView
   * @generated
   */
  public Adapter createUiIDEViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment <em>Ui Grid Layout Assigment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiGridLayoutAssigment
   * @generated
   */
  public Adapter createUiGridLayoutAssigmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiPoint <em>Ui Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPoint
   * @generated
   */
  public Adapter createUiPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiBinding <em>Ui Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiBinding
   * @generated
   */
  public Adapter createUiBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint <em>Ui Source Binding Endpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint
   * @generated
   */
  public Adapter createUiSourceBindingEndpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint <em>Ui Target Binding Endpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint
   * @generated
   */
  public Adapter createUiTargetBindingEndpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.UiPathSegment <em>Ui Path Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.UiPathSegment
   * @generated
   */
  public Adapter createUiPathSegmentAdapter()
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
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.GGridLayout <em>GGrid Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.GGridLayout
   * @generated
   */
  public Adapter createGGridLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.GTextField <em>GText Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.GTextField
   * @generated
   */
  public Adapter createGTextFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lunifera.ecview.dsl.uIGrammar.GList <em>GList</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lunifera.ecview.dsl.uIGrammar.GList
   * @generated
   */
  public Adapter createGListAdapter()
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
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBindable <em>YBindable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YBindable
   * @generated
   */
  public Adapter createYBindableAdapter()
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
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable <em>YVisibleable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable
   * @generated
   */
  public Adapter createYVisibleableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable <em>YEmbeddable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable
   * @generated
   */
  public Adapter createYEmbeddableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YLayout <em>YLayout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YLayout
   * @generated
   */
  public Adapter createYLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable <em>YSpacingable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable
   * @generated
   */
  public Adapter createYSpacingableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout <em>YGrid Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout
   * @generated
   */
  public Adapter createYGridLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEditable <em>YEditable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YEditable
   * @generated
   */
  public Adapter createYEditableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEnable <em>YEnable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YEnable
   * @generated
   */
  public Adapter createYEnableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YField <em>YField</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YField
   * @generated
   */
  public Adapter createYFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YInput <em>YInput</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YInput
   * @generated
   */
  public Adapter createYInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable <em>YValue Bindable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable
   * @generated
   */
  public Adapter createYValueBindableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField <em>YText Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField
   * @generated
   */
  public Adapter createYTextFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable
   * @generated
   */
  public Adapter createYCollectionBindableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable
   * @generated
   */
  public Adapter createYSelectionBindableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable
   * @generated
   */
  public Adapter createYMultiSelectionBindableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YList <em>YList</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YList
   * @generated
   */
  public Adapter createYListAdapter()
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
