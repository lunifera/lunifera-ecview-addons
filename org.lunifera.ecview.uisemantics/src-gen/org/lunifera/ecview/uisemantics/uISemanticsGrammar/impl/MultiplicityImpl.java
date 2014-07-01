/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.ecview.uisemantics.uISemanticsGrammar.Multiplicity;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.MultiplicityImpl#getSINGLE <em>SINGLE</em>}</li>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.MultiplicityImpl#getMULTI <em>MULTI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityImpl extends MinimalEObjectImpl.Container implements Multiplicity
{
  /**
   * The default value of the '{@link #getSINGLE() <em>SINGLE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSINGLE()
   * @generated
   * @ordered
   */
  protected static final String SINGLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSINGLE() <em>SINGLE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSINGLE()
   * @generated
   * @ordered
   */
  protected String single = SINGLE_EDEFAULT;

  /**
   * The default value of the '{@link #getMULTI() <em>MULTI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMULTI()
   * @generated
   * @ordered
   */
  protected static final String MULTI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMULTI() <em>MULTI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMULTI()
   * @generated
   * @ordered
   */
  protected String multi = MULTI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicityImpl()
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
    return UISemanticsGrammarPackage.Literals.MULTIPLICITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSINGLE()
  {
    return single;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSINGLE(String newSINGLE)
  {
    String oldSINGLE = single;
    single = newSINGLE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UISemanticsGrammarPackage.MULTIPLICITY__SINGLE, oldSINGLE, single));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMULTI()
  {
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMULTI(String newMULTI)
  {
    String oldMULTI = multi;
    multi = newMULTI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UISemanticsGrammarPackage.MULTIPLICITY__MULTI, oldMULTI, multi));
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
      case UISemanticsGrammarPackage.MULTIPLICITY__SINGLE:
        return getSINGLE();
      case UISemanticsGrammarPackage.MULTIPLICITY__MULTI:
        return getMULTI();
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
      case UISemanticsGrammarPackage.MULTIPLICITY__SINGLE:
        setSINGLE((String)newValue);
        return;
      case UISemanticsGrammarPackage.MULTIPLICITY__MULTI:
        setMULTI((String)newValue);
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
      case UISemanticsGrammarPackage.MULTIPLICITY__SINGLE:
        setSINGLE(SINGLE_EDEFAULT);
        return;
      case UISemanticsGrammarPackage.MULTIPLICITY__MULTI:
        setMULTI(MULTI_EDEFAULT);
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
      case UISemanticsGrammarPackage.MULTIPLICITY__SINGLE:
        return SINGLE_EDEFAULT == null ? single != null : !SINGLE_EDEFAULT.equals(single);
      case UISemanticsGrammarPackage.MULTIPLICITY__MULTI:
        return MULTI_EDEFAULT == null ? multi != null : !MULTI_EDEFAULT.equals(multi);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (SINGLE: ");
    result.append(single);
    result.append(", MULTI: ");
    result.append(multi);
    result.append(')');
    return result.toString();
  }

} //MultiplicityImpl
