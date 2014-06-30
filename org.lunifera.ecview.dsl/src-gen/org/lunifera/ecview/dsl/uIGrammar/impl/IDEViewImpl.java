/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;

import org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl;

import org.lunifera.ecview.dsl.uIGrammar.Action;
import org.lunifera.ecview.dsl.uIGrammar.Binding;
import org.lunifera.ecview.dsl.uIGrammar.GTextBindingDefs;
import org.lunifera.ecview.dsl.uIGrammar.IDEView;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDE View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.IDEViewImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IDEViewImpl extends YViewImpl implements IDEView
{
  /**
   * The cached value of the '{@link #getFor() <em>For</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor()
   * @generated
   * @ordered
   */
  protected EClass for_;

  /**
   * The cached value of the '{@link #getDefs() <em>Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefs()
   * @generated
   * @ordered
   */
  protected EList<GTextBindingDefs> defs;

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
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<Binding> bindings;

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
  public EClass getFor()
  {
    if (for_ != null && for_.eIsProxy())
    {
      InternalEObject oldFor = (InternalEObject)for_;
      for_ = (EClass)eResolveProxy(oldFor);
      if (for_ != oldFor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIGrammarPackage.IDE_VIEW__FOR, oldFor, for_));
      }
    }
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetFor()
  {
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor(EClass newFor)
  {
    EClass oldFor = for_;
    for_ = newFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.IDE_VIEW__FOR, oldFor, for_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GTextBindingDefs> getDefs()
  {
    if (defs == null)
    {
      defs = new EObjectContainmentEList<GTextBindingDefs>(GTextBindingDefs.class, this, UIGrammarPackage.IDE_VIEW__DEFS);
    }
    return defs;
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
  public EList<Binding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<Binding>(Binding.class, this, UIGrammarPackage.IDE_VIEW__BINDINGS);
    }
    return bindings;
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
      case UIGrammarPackage.IDE_VIEW__DEFS:
        return ((InternalEList<?>)getDefs()).basicRemove(otherEnd, msgs);
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        return ((InternalEList<?>)getLayouts()).basicRemove(otherEnd, msgs);
      case UIGrammarPackage.IDE_VIEW__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case UIGrammarPackage.IDE_VIEW__FOR:
        if (resolve) return getFor();
        return basicGetFor();
      case UIGrammarPackage.IDE_VIEW__DEFS:
        return getDefs();
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        return getActions();
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        return getLayouts();
      case UIGrammarPackage.IDE_VIEW__BINDINGS:
        return getBindings();
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
      case UIGrammarPackage.IDE_VIEW__FOR:
        setFor((EClass)newValue);
        return;
      case UIGrammarPackage.IDE_VIEW__DEFS:
        getDefs().clear();
        getDefs().addAll((Collection<? extends GTextBindingDefs>)newValue);
        return;
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        getLayouts().clear();
        getLayouts().addAll((Collection<? extends YLayout>)newValue);
        return;
      case UIGrammarPackage.IDE_VIEW__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends Binding>)newValue);
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
      case UIGrammarPackage.IDE_VIEW__FOR:
        setFor((EClass)null);
        return;
      case UIGrammarPackage.IDE_VIEW__DEFS:
        getDefs().clear();
        return;
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        getActions().clear();
        return;
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        getLayouts().clear();
        return;
      case UIGrammarPackage.IDE_VIEW__BINDINGS:
        getBindings().clear();
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
      case UIGrammarPackage.IDE_VIEW__FOR:
        return for_ != null;
      case UIGrammarPackage.IDE_VIEW__DEFS:
        return defs != null && !defs.isEmpty();
      case UIGrammarPackage.IDE_VIEW__ACTIONS:
        return actions != null && !actions.isEmpty();
      case UIGrammarPackage.IDE_VIEW__LAYOUTS:
        return layouts != null && !layouts.isEmpty();
      case UIGrammarPackage.IDE_VIEW__BINDINGS:
        return bindings != null && !bindings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IDEViewImpl
