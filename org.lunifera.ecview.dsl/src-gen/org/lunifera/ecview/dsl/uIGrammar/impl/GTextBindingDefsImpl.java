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

import org.lunifera.ecview.dsl.uIGrammar.GTextBindingDef;
import org.lunifera.ecview.dsl.uIGrammar.GTextBindingDefs;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GText Binding Defs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTextBindingDefsImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GTextBindingDefsImpl extends MinimalEObjectImpl.Container implements GTextBindingDefs
{
  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<GTextBindingDef> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GTextBindingDefsImpl()
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
    return UIGrammarPackage.Literals.GTEXT_BINDING_DEFS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GTextBindingDef> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<GTextBindingDef>(GTextBindingDef.class, this, UIGrammarPackage.GTEXT_BINDING_DEFS__METHODS);
    }
    return methods;
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
      case UIGrammarPackage.GTEXT_BINDING_DEFS__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case UIGrammarPackage.GTEXT_BINDING_DEFS__METHODS:
        return getMethods();
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
      case UIGrammarPackage.GTEXT_BINDING_DEFS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends GTextBindingDef>)newValue);
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
      case UIGrammarPackage.GTEXT_BINDING_DEFS__METHODS:
        getMethods().clear();
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
      case UIGrammarPackage.GTEXT_BINDING_DEFS__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GTextBindingDefsImpl
