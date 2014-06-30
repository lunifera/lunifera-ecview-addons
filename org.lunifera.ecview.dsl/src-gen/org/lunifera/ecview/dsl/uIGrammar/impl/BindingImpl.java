/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;

import org.lunifera.ecview.dsl.uIGrammar.Binding;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;

import org.lunifera.ecview.model.uiConfigs.BindingMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.BindingImpl#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.BindingImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbeddable()
   * @generated
   * @ordered
   */
  protected YEmbeddable embeddable;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected BindingMethod method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UIGrammarPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YEmbeddable getEmbeddable()
  {
    if (embeddable != null && embeddable.eIsProxy())
    {
      InternalEObject oldEmbeddable = (InternalEObject)embeddable;
      embeddable = (YEmbeddable)eResolveProxy(oldEmbeddable);
      if (embeddable != oldEmbeddable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIGrammarPackage.BINDING__EMBEDDABLE, oldEmbeddable, embeddable));
      }
    }
    return embeddable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YEmbeddable basicGetEmbeddable()
  {
    return embeddable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmbeddable(YEmbeddable newEmbeddable)
  {
    YEmbeddable oldEmbeddable = embeddable;
    embeddable = newEmbeddable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.BINDING__EMBEDDABLE, oldEmbeddable, embeddable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingMethod getMethod()
  {
    if (method != null && method.eIsProxy())
    {
      InternalEObject oldMethod = (InternalEObject)method;
      method = (BindingMethod)eResolveProxy(oldMethod);
      if (method != oldMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIGrammarPackage.BINDING__METHOD, oldMethod, method));
      }
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingMethod basicGetMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(BindingMethod newMethod)
  {
    BindingMethod oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.BINDING__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UIGrammarPackage.BINDING__EMBEDDABLE:
        if (resolve) return getEmbeddable();
        return basicGetEmbeddable();
      case UIGrammarPackage.BINDING__METHOD:
        if (resolve) return getMethod();
        return basicGetMethod();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UIGrammarPackage.BINDING__EMBEDDABLE:
        setEmbeddable((YEmbeddable)newValue);
        return;
      case UIGrammarPackage.BINDING__METHOD:
        setMethod((BindingMethod)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UIGrammarPackage.BINDING__EMBEDDABLE:
        setEmbeddable((YEmbeddable)null);
        return;
      case UIGrammarPackage.BINDING__METHOD:
        setMethod((BindingMethod)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UIGrammarPackage.BINDING__EMBEDDABLE:
        return embeddable != null;
      case UIGrammarPackage.BINDING__METHOD:
        return method != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl
