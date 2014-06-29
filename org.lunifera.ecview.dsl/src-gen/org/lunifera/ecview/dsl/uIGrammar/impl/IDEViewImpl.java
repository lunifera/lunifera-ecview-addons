/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;

import org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl;

import org.lunifera.ecview.dsl.uIGrammar.Action;
import org.lunifera.ecview.dsl.uIGrammar.IDEView;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDE View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl#getLayouts <em>Layouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IDEViewImpl extends YViewImpl implements IDEView
{
  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayouts()
   * @generated
   * @ordered
   */
  protected EList<YLayout> layouts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IDEViewImpl()
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
    return UIGrammarPackage.Literals.IDE_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, UIGrammarPackage.IDE_VIEW__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<YLayout> getLayouts()
  {
    if (layouts == null)
    {
      layouts = new EObjectContainmentEList<YLayout>(YLayout.class, this, UIGrammarPackage.IDE_VIEW__LAYOUTS);
    }
    return layouts;
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
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        return ((InternalEList<?>)getLayouts()).basicRemove(otherEnd, msgs);
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
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        return getActions();
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        return getLayouts();
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
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        getLayouts().clear();
        getLayouts().addAll((Collection<? extends YLayout>)newValue);
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
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        getActions().clear();
        return;
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        getLayouts().clear();
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
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        return actions != null && !actions.isEmpty();
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        return layouts != null && !layouts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IDEViewImpl
