/**
 */
package org.lunifera.ecview.dsl.uIGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;

import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;

import org.lunifera.ecview.dsl.uIGrammar.GGridLayoutAssigment;
import org.lunifera.ecview.dsl.uIGrammar.Point;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GGrid Layout Assigment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.lunifera.ecview.dsl.uIGrammar.impl.GGridLayoutAssigmentImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GGridLayoutAssigmentImpl extends MinimalEObjectImpl.Container implements GGridLayoutAssigment
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected YEmbeddable element;

  /**
   * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected static final YAlignment ALIGNMENT_EDEFAULT = YAlignment.BOTTOM_LEFT;

  /**
   * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected YAlignment alignment = ALIGNMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected Point from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected Point to;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GGridLayoutAssigmentImpl()
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
    return UIGrammarPackage.Literals.GGRID_LAYOUT_ASSIGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YEmbeddable getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(YEmbeddable newElement, NotificationChain msgs)
  {
    YEmbeddable oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(YEmbeddable newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAlignment getAlignment()
  {
    return alignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignment(YAlignment newAlignment)
  {
    YAlignment oldAlignment = alignment;
    alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ALIGNMENT, oldAlignment, alignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(Point newFrom, NotificationChain msgs)
  {
    Point oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(Point newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo(Point newTo, NotificationChain msgs)
  {
    Point oldTo = to;
    to = newTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO, oldTo, newTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(Point newTo)
  {
    if (newTo != to)
    {
      NotificationChain msgs = null;
      if (to != null)
        msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO, null, msgs);
      if (newTo != null)
        msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO, null, msgs);
      msgs = basicSetTo(newTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO, newTo, newTo));
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
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT:
        return basicSetElement(null, msgs);
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM:
        return basicSetFrom(null, msgs);
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO:
        return basicSetTo(null, msgs);
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
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT:
        return getElement();
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ALIGNMENT:
        return getAlignment();
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM:
        return getFrom();
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO:
        return getTo();
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
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT:
        setElement((YEmbeddable)newValue);
        return;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ALIGNMENT:
        setAlignment((YAlignment)newValue);
        return;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM:
        setFrom((Point)newValue);
        return;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO:
        setTo((Point)newValue);
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
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT:
        setElement((YEmbeddable)null);
        return;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ALIGNMENT:
        setAlignment(ALIGNMENT_EDEFAULT);
        return;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM:
        setFrom((Point)null);
        return;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO:
        setTo((Point)null);
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
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ELEMENT:
        return element != null;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__ALIGNMENT:
        return alignment != ALIGNMENT_EDEFAULT;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__FROM:
        return from != null;
      case UIGrammarPackage.GGRID_LAYOUT_ASSIGMENT__TO:
        return to != null;
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
    result.append(" (alignment: ");
    result.append(alignment);
    result.append(')');
    return result.toString();
  }

} //GGridLayoutAssigmentImpl
