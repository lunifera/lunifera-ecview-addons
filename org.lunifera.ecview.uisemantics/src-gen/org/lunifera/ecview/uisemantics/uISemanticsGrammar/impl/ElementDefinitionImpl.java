/**
 */
package org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.ecview.uisemantics.uISemanticsGrammar.AvailableBindings;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ElementDefinitionImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.lunifera.ecview.uisemantics.uISemanticsGrammar.impl.ElementDefinitionImpl#getBindingContainer <em>Binding Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDefinitionImpl extends MinimalEObjectImpl.Container implements ElementDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNsURI()
   * @generated
   * @ordered
   */
  protected EPackage nsURI;

  /**
   * The cached value of the '{@link #getBindingContainer() <em>Binding Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindingContainer()
   * @generated
   * @ordered
   */
  protected AvailableBindings bindingContainer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementDefinitionImpl()
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
    return UISemanticsGrammarPackage.Literals.ELEMENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UISemanticsGrammarPackage.ELEMENT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage getNsURI()
  {
    if (nsURI != null && nsURI.eIsProxy())
    {
      InternalEObject oldNsURI = (InternalEObject)nsURI;
      nsURI = (EPackage)eResolveProxy(oldNsURI);
      if (nsURI != oldNsURI)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UISemanticsGrammarPackage.ELEMENT_DEFINITION__NS_URI, oldNsURI, nsURI));
      }
    }
    return nsURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage basicGetNsURI()
  {
    return nsURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNsURI(EPackage newNsURI)
  {
    EPackage oldNsURI = nsURI;
    nsURI = newNsURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UISemanticsGrammarPackage.ELEMENT_DEFINITION__NS_URI, oldNsURI, nsURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvailableBindings getBindingContainer()
  {
    return bindingContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBindingContainer(AvailableBindings newBindingContainer, NotificationChain msgs)
  {
    AvailableBindings oldBindingContainer = bindingContainer;
    bindingContainer = newBindingContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER, oldBindingContainer, newBindingContainer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindingContainer(AvailableBindings newBindingContainer)
  {
    if (newBindingContainer != bindingContainer)
    {
      NotificationChain msgs = null;
      if (bindingContainer != null)
        msgs = ((InternalEObject)bindingContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER, null, msgs);
      if (newBindingContainer != null)
        msgs = ((InternalEObject)newBindingContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER, null, msgs);
      msgs = basicSetBindingContainer(newBindingContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER, newBindingContainer, newBindingContainer));
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
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER:
        return basicSetBindingContainer(null, msgs);
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
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NAME:
        return getName();
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NS_URI:
        if (resolve) return getNsURI();
        return basicGetNsURI();
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER:
        return getBindingContainer();
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
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NS_URI:
        setNsURI((EPackage)newValue);
        return;
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER:
        setBindingContainer((AvailableBindings)newValue);
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
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NS_URI:
        setNsURI((EPackage)null);
        return;
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER:
        setBindingContainer((AvailableBindings)null);
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
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__NS_URI:
        return nsURI != null;
      case UISemanticsGrammarPackage.ELEMENT_DEFINITION__BINDING_CONTAINER:
        return bindingContainer != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ElementDefinitionImpl
