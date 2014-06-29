/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;

import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;
import org.lunifera.ecview.dsl.uIGrammar.UiModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiModelImpl#getViewSet <em>View Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiModelImpl extends MinimalEObjectImpl.Container implements UiModel
{
  /**
   * The cached value of the '{@link #getViewSet() <em>View Set</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewSet()
   * @generated
   * @ordered
   */
  protected EList<YViewSet> viewSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UiModelImpl()
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
    return UIGrammarPackage.Literals.UI_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<YViewSet> getViewSet()
  {
    if (viewSet == null)
    {
      viewSet = new EObjectContainmentEList<YViewSet>(YViewSet.class, this, UIGrammarPackage.UI_MODEL__VIEW_SET);
    }
    return viewSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UIGrammarPackage.UI_MODEL__VIEW_SET:
        return ((InternalEList<?>)getViewSet()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UIGrammarPackage.UI_MODEL__VIEW_SET:
        return getViewSet();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UIGrammarPackage.UI_MODEL__VIEW_SET:
        getViewSet().clear();
        getViewSet().addAll((Collection<? extends YViewSet>)newValue);
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
      case UIGrammarPackage.UI_MODEL__VIEW_SET:
        getViewSet().clear();
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
      case UIGrammarPackage.UI_MODEL__VIEW_SET:
        return viewSet != null && !viewSet.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UiModelImpl
