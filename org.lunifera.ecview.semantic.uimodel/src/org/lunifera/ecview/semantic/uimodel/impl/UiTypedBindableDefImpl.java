/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ui Typed Bindable Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl#getRawBindable <em>Raw Bindable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl#getRawBindablePath <em>Raw Bindable Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTypedBindableDefImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiTypedBindableDefImpl extends MinimalEObjectImpl.Container
		implements UiTypedBindableDef {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRawBindable() <em>Raw Bindable</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRawBindable()
	 * @generated
	 * @ordered
	 */
	protected UiRawBindable rawBindable;

	/**
	 * The cached value of the '{@link #getRawBindablePath() <em>Raw Bindable Path</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getRawBindablePath()
	 * @generated
	 * @ordered
	 */
	protected UiRawBindablePathSegment rawBindablePath;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected UxEndpointDef method;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UiTypedBindableDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_TYPED_BINDABLE_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TYPED_BINDABLE_DEF__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TYPED_BINDABLE_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindable getRawBindable() {
		if (rawBindable != null && rawBindable.eIsProxy()) {
			InternalEObject oldRawBindable = (InternalEObject)rawBindable;
			rawBindable = (UiRawBindable)eResolveProxy(oldRawBindable);
			if (rawBindable != oldRawBindable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE, oldRawBindable, rawBindable));
			}
		}
		return rawBindable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindable basicGetRawBindable() {
		return rawBindable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawBindable(UiRawBindable newRawBindable) {
		UiRawBindable oldRawBindable = rawBindable;
		rawBindable = newRawBindable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE, oldRawBindable, rawBindable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindablePathSegment getRawBindablePath() {
		if (rawBindablePath != null && rawBindablePath.eIsProxy()) {
			InternalEObject oldRawBindablePath = (InternalEObject)rawBindablePath;
			rawBindablePath = (UiRawBindablePathSegment)eResolveProxy(oldRawBindablePath);
			if (rawBindablePath != oldRawBindablePath) {
				InternalEObject newRawBindablePath = (InternalEObject)rawBindablePath;
				NotificationChain msgs = oldRawBindablePath.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH, null, null);
				if (newRawBindablePath.eInternalContainer() == null) {
					msgs = newRawBindablePath.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH, oldRawBindablePath, rawBindablePath));
			}
		}
		return rawBindablePath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindablePathSegment basicGetRawBindablePath() {
		return rawBindablePath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRawBindablePath(
			UiRawBindablePathSegment newRawBindablePath, NotificationChain msgs) {
		UiRawBindablePathSegment oldRawBindablePath = rawBindablePath;
		rawBindablePath = newRawBindablePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH, oldRawBindablePath, newRawBindablePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawBindablePath(UiRawBindablePathSegment newRawBindablePath) {
		if (newRawBindablePath != rawBindablePath) {
			NotificationChain msgs = null;
			if (rawBindablePath != null)
				msgs = ((InternalEObject)rawBindablePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH, null, msgs);
			if (newRawBindablePath != null)
				msgs = ((InternalEObject)newRawBindablePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH, null, msgs);
			msgs = basicSetRawBindablePath(newRawBindablePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH, newRawBindablePath, newRawBindablePath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UxEndpointDef getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (UxEndpointDef)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_TYPED_BINDABLE_DEF__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UxEndpointDef basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(UxEndpointDef newMethod) {
		UxEndpointDef oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TYPED_BINDABLE_DEF__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH:
				return basicSetRawBindablePath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__ID:
				return getId();
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__NAME:
				return getName();
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE:
				if (resolve) return getRawBindable();
				return basicGetRawBindable();
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH:
				if (resolve) return getRawBindablePath();
				return basicGetRawBindablePath();
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE:
				setRawBindable((UiRawBindable)newValue);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH:
				setRawBindablePath((UiRawBindablePathSegment)newValue);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__METHOD:
				setMethod((UxEndpointDef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE:
				setRawBindable((UiRawBindable)null);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH:
				setRawBindablePath((UiRawBindablePathSegment)null);
				return;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__METHOD:
				setMethod((UxEndpointDef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE:
				return rawBindable != null;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__RAW_BINDABLE_PATH:
				return rawBindablePath != null;
			case UiModelPackage.UI_TYPED_BINDABLE_DEF__METHOD:
				return method != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public UiRawBindable getRawBindableOfLastSegment() {
		UiRawBindablePathSegment child = getRawBindablePath();
		if (child != null) {
			return child.getRawBindableOfLastSegment();
		} else {
			return getRawBindable();
		}
	}

} // UiTypedBindableDefImpl
