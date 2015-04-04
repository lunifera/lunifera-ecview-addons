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
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ui Nested Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiNestedPropertyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiNestedPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiNestedPropertyImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiNestedPropertyImpl#getGetter <em>Getter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiNestedPropertyImpl extends MinimalEObjectImpl.Container
		implements UiNestedProperty {
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
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected UiPathSegment path;

	/**
	 * The cached value of the '{@link #getGetter() <em>Getter</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation getter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UiNestedPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_NESTED_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_NESTED_PROPERTY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_NESTED_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (UiPathSegment)eResolveProxy(oldPath);
			if (path != oldPath) {
				InternalEObject newPath = (InternalEObject)path;
				NotificationChain msgs = oldPath.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_NESTED_PROPERTY__PATH, null, null);
				if (newPath.eInternalContainer() == null) {
					msgs = newPath.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_NESTED_PROPERTY__PATH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_NESTED_PROPERTY__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(UiPathSegment newPath,
			NotificationChain msgs) {
		UiPathSegment oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_NESTED_PROPERTY__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(UiPathSegment newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_NESTED_PROPERTY__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_NESTED_PROPERTY__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_NESTED_PROPERTY__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getGetter() {
		if (getter != null && getter.eIsProxy()) {
			InternalEObject oldGetter = (InternalEObject)getter;
			getter = (JvmOperation)eResolveProxy(oldGetter);
			if (getter != oldGetter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_NESTED_PROPERTY__GETTER, oldGetter, getter));
			}
		}
		return getter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetGetter() {
		return getter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetter(JvmOperation newGetter) {
		JvmOperation oldGetter = getter;
		getter = newGetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_NESTED_PROPERTY__GETTER, oldGetter, getter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_NESTED_PROPERTY__PATH:
				return basicSetPath(null, msgs);
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
			case UiModelPackage.UI_NESTED_PROPERTY__ID:
				return getId();
			case UiModelPackage.UI_NESTED_PROPERTY__NAME:
				return getName();
			case UiModelPackage.UI_NESTED_PROPERTY__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case UiModelPackage.UI_NESTED_PROPERTY__GETTER:
				if (resolve) return getGetter();
				return basicGetGetter();
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
			case UiModelPackage.UI_NESTED_PROPERTY__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_NESTED_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_NESTED_PROPERTY__PATH:
				setPath((UiPathSegment)newValue);
				return;
			case UiModelPackage.UI_NESTED_PROPERTY__GETTER:
				setGetter((JvmOperation)newValue);
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
			case UiModelPackage.UI_NESTED_PROPERTY__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_NESTED_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_NESTED_PROPERTY__PATH:
				setPath((UiPathSegment)null);
				return;
			case UiModelPackage.UI_NESTED_PROPERTY__GETTER:
				setGetter((JvmOperation)null);
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
			case UiModelPackage.UI_NESTED_PROPERTY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_NESTED_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_NESTED_PROPERTY__PATH:
				return path != null;
			case UiModelPackage.UI_NESTED_PROPERTY__GETTER:
				return getter != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toPathString() {
		String result = "";
		UiPathSegment child = getPath();
		if (child != null) {
			result = child.toPathString();
			if (result != null) {
				result = getSimpleGetterName() + "." + result;
			} else {
				result = getSimpleGetterName();
			}
		} else {
			return getSimpleGetterName();
		}

		return result;
	}

	public String getSimpleGetterName() {
		if (getGetter() == null) {
			return null;
		}
		String simpleName = getGetter().getSimpleName();
		if (simpleName == null) {
			return null;
		}
		if (simpleName.startsWith("get")) {
			return StringExtensions.toFirstLower(simpleName.replaceFirst("get",
					""));
		} else {
			return StringExtensions.toFirstLower(simpleName.replaceFirst("is",
					""));
		}

	}

	@Override
	public JvmType getTypeofLastSegment() {
		UiPathSegment child = getPath();
		if (child != null) {
			return child.getTypeofLastSegment();
		} else {
			return getGetter() != null && getGetter().getReturnType() != null ? getGetter()
					.getReturnType().getType() : null;
		}
	}

	@Override
	public JvmType getTypeofGetter() {
		return getGetter() != null && getGetter().getReturnType() != null ? getGetter()
				.getReturnType().getType() : null;
	}
	 
	@Override
	public JvmTypeReference getTypeReferenceofGetter() {
		return getGetter() != null ? getGetter()
				.getReturnType() : null;
	}

	@Override
	public JvmTypeReference getTypeReferenceOfLastSegment() {
		UiPathSegment child = getPath();
		if (child != null) {
			return child.getTypeReferenceOfLastSegment();
		} else {
			return getGetter() != null ? getGetter().getReturnType() : null;
		}
	}

	@Override
	public JvmType getTypeofSecondLastSegment() {
		UiPathSegment child = getPath();
		if (child != null) {
			JvmType type = child.getTypeofSecondLastSegment();
			if (type == null) {
				JvmOperation operation = getGetter();
				return (operation != null && operation.getReturnType() != null) ? operation
						.getReturnType().getType() : null;
			} else {
				return type;
			}
		} else {
			// return null to tell the caller, that the current segment is the
			// last.
			return null;
		}
	}

	@Override
	public JvmOperation getOperationofLastSegment() {
		UiPathSegment child = getPath();
		if (child != null) {
			return child.getOperationofLastSegment();
		} else {
			return getGetter();
		}
	}

	public String toString() {
		return toPathString();
	}

} // UiNestedPropertyImpl
