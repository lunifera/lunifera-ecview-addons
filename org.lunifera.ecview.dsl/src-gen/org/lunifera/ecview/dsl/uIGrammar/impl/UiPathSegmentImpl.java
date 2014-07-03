/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmField;

import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;
import org.lunifera.ecview.dsl.uIGrammar.UiPathSegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Path Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiPathSegmentImpl#getJvmField <em>Jvm Field</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.UiPathSegmentImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiPathSegmentImpl extends MinimalEObjectImpl.Container implements UiPathSegment
{
  /**
   * The cached value of the '{@link #getJvmField() <em>Jvm Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvmField()
   * @generated
   * @ordered
   */
  protected JvmField jvmField;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected UiPathSegment path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UiPathSegmentImpl()
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
    return UIGrammarPackage.Literals.UI_PATH_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmField getJvmField()
  {
    if (jvmField != null && jvmField.eIsProxy())
    {
      InternalEObject oldJvmField = (InternalEObject)jvmField;
      jvmField = (JvmField)eResolveProxy(oldJvmField);
      if (jvmField != oldJvmField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UIGrammarPackage.UI_PATH_SEGMENT__JVM_FIELD, oldJvmField, jvmField));
      }
    }
    return jvmField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmField basicGetJvmField()
  {
    return jvmField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJvmField(JvmField newJvmField)
  {
    JvmField oldJvmField = jvmField;
    jvmField = newJvmField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.UI_PATH_SEGMENT__JVM_FIELD, oldJvmField, jvmField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiPathSegment getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(UiPathSegment newPath, NotificationChain msgs)
  {
    UiPathSegment oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIGrammarPackage.UI_PATH_SEGMENT__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(UiPathSegment newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.UI_PATH_SEGMENT__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.UI_PATH_SEGMENT__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.UI_PATH_SEGMENT__PATH, newPath, newPath));
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
      case UIGrammarPackage.UI_PATH_SEGMENT__PATH:
        return basicSetPath(null, msgs);
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
      case UIGrammarPackage.UI_PATH_SEGMENT__JVM_FIELD:
        if (resolve) return getJvmField();
        return basicGetJvmField();
      case UIGrammarPackage.UI_PATH_SEGMENT__PATH:
        return getPath();
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
      case UIGrammarPackage.UI_PATH_SEGMENT__JVM_FIELD:
        setJvmField((JvmField)newValue);
        return;
      case UIGrammarPackage.UI_PATH_SEGMENT__PATH:
        setPath((UiPathSegment)newValue);
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
      case UIGrammarPackage.UI_PATH_SEGMENT__JVM_FIELD:
        setJvmField((JvmField)null);
        return;
      case UIGrammarPackage.UI_PATH_SEGMENT__PATH:
        setPath((UiPathSegment)null);
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
      case UIGrammarPackage.UI_PATH_SEGMENT__JVM_FIELD:
        return jvmField != null;
      case UIGrammarPackage.UI_PATH_SEGMENT__PATH:
        return path != null;
    }
    return super.eIsSet(featureID);
  }

} //UiPathSegmentImpl
