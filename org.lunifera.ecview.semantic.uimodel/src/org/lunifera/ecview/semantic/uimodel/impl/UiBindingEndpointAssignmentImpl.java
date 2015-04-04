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
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Binding Endpoint Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl#getTypedBindableDef <em>Typed Bindable Def</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointAssignmentImpl#getTypedBindableAlias <em>Typed Bindable Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiBindingEndpointAssignmentImpl extends MinimalEObjectImpl.Container implements UiBindingEndpointAssignment {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getTypedBindableDef() <em>Typed Bindable Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedBindableDef()
	 * @generated
	 * @ordered
	 */
	protected UiBindingExpression typedBindableDef;

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
	 * The cached value of the '{@link #getTypedBindableAlias() <em>Typed Bindable Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedBindableAlias()
	 * @generated
	 * @ordered
	 */
	protected UiTypedBindable typedBindableAlias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiBindingEndpointAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_BINDING_ENDPOINT_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression getTypedBindableDef() {
		if (typedBindableDef != null && typedBindableDef.eIsProxy()) {
			InternalEObject oldTypedBindableDef = (InternalEObject)typedBindableDef;
			typedBindableDef = (UiBindingExpression)eResolveProxy(oldTypedBindableDef);
			if (typedBindableDef != oldTypedBindableDef) {
				InternalEObject newTypedBindableDef = (InternalEObject)typedBindableDef;
				NotificationChain msgs = oldTypedBindableDef.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF, null, null);
				if (newTypedBindableDef.eInternalContainer() == null) {
					msgs = newTypedBindableDef.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF, oldTypedBindableDef, typedBindableDef));
			}
		}
		return typedBindableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression basicGetTypedBindableDef() {
		return typedBindableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypedBindableDef(UiBindingExpression newTypedBindableDef, NotificationChain msgs) {
		UiBindingExpression oldTypedBindableDef = typedBindableDef;
		typedBindableDef = newTypedBindableDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF, oldTypedBindableDef, newTypedBindableDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedBindableDef(UiBindingExpression newTypedBindableDef) {
		if (newTypedBindableDef != typedBindableDef) {
			NotificationChain msgs = null;
			if (typedBindableDef != null)
				msgs = ((InternalEObject)typedBindableDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF, null, msgs);
			if (newTypedBindableDef != null)
				msgs = ((InternalEObject)newTypedBindableDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF, null, msgs);
			msgs = basicSetTypedBindableDef(newTypedBindableDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF, newTypedBindableDef, newTypedBindableDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (UiPathSegment)eResolveProxy(oldPath);
			if (path != oldPath) {
				InternalEObject newPath = (InternalEObject)path;
				NotificationChain msgs = oldPath.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH, null, null);
				if (newPath.eInternalContainer() == null) {
					msgs = newPath.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(UiPathSegment newPath, NotificationChain msgs) {
		UiPathSegment oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(UiPathSegment newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindable getTypedBindableAlias() {
		if (typedBindableAlias != null && typedBindableAlias.eIsProxy()) {
			InternalEObject oldTypedBindableAlias = (InternalEObject)typedBindableAlias;
			typedBindableAlias = (UiTypedBindable)eResolveProxy(oldTypedBindableAlias);
			if (typedBindableAlias != oldTypedBindableAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS, oldTypedBindableAlias, typedBindableAlias));
			}
		}
		return typedBindableAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindable basicGetTypedBindableAlias() {
		return typedBindableAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedBindableAlias(UiTypedBindable newTypedBindableAlias) {
		UiTypedBindable oldTypedBindableAlias = typedBindableAlias;
		typedBindableAlias = newTypedBindableAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS, oldTypedBindableAlias, typedBindableAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF:
				return basicSetTypedBindableDef(null, msgs);
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__ID:
				return getId();
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__NAME:
				return getName();
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF:
				if (resolve) return getTypedBindableDef();
				return basicGetTypedBindableDef();
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS:
				if (resolve) return getTypedBindableAlias();
				return basicGetTypedBindableAlias();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF:
				setTypedBindableDef((UiBindingExpression)newValue);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH:
				setPath((UiPathSegment)newValue);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS:
				setTypedBindableAlias((UiTypedBindable)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF:
				setTypedBindableDef((UiBindingExpression)null);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH:
				setPath((UiPathSegment)null);
				return;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS:
				setTypedBindableAlias((UiTypedBindable)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF:
				return typedBindableDef != null;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__PATH:
				return path != null;
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS:
				return typedBindableAlias != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

} //UiBindingEndpointAssignmentImpl
