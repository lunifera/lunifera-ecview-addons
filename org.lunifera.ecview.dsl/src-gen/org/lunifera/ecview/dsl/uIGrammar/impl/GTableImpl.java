/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.lunifera.ecview.dsl.uIGrammar.GTable;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GTable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.GTableImpl#getJvmType <em>Jvm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GTableImpl extends YTableImpl implements GTable
{
  /**
   * The cached value of the '{@link #getJvmType() <em>Jvm Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvmType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference jvmType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GTableImpl()
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
    return UIGrammarPackage.Literals.GTABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getJvmType()
  {
    return jvmType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJvmType(JvmTypeReference newJvmType, NotificationChain msgs)
  {
    JvmTypeReference oldJvmType = jvmType;
    jvmType = newJvmType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GTABLE__JVM_TYPE, oldJvmType, newJvmType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJvmType(JvmTypeReference newJvmType)
  {
    if (newJvmType != jvmType)
    {
      NotificationChain msgs = null;
      if (jvmType != null)
        msgs = ((InternalEObject)jvmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GTABLE__JVM_TYPE, null, msgs);
      if (newJvmType != null)
        msgs = ((InternalEObject)newJvmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GTABLE__JVM_TYPE, null, msgs);
      msgs = basicSetJvmType(newJvmType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GTABLE__JVM_TYPE, newJvmType, newJvmType));
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
      case UIGrammarPackage.GTABLE__JVM_TYPE:
        return basicSetJvmType(null, msgs);
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
      case UIGrammarPackage.GTABLE__JVM_TYPE:
        return getJvmType();
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
      case UIGrammarPackage.GTABLE__JVM_TYPE:
        setJvmType((JvmTypeReference)newValue);
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
      case UIGrammarPackage.GTABLE__JVM_TYPE:
        setJvmType((JvmTypeReference)null);
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
      case UIGrammarPackage.GTABLE__JVM_TYPE:
        return jvmType != null;
    }
    return super.eIsSet(featureID);
  }

} //GTableImpl
