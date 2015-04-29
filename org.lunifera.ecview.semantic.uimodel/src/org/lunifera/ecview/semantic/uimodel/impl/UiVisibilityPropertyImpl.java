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
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Visibility Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertyImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertyImpl#getBindableDef <em>Bindable Def</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityPropertyImpl#getAssignmentExpression <em>Assignment Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiVisibilityPropertyImpl extends MinimalEObjectImpl.Container implements UiVisibilityProperty {
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
	 * The cached value of the '{@link #getBindableDef() <em>Bindable Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindableDef()
	 * @generated
	 * @ordered
	 */
	protected UiBindingExpression bindableDef;

	/**
	 * The cached value of the '{@link #getAssignmentExpression() <em>Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression assignmentExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiVisibilityPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_VISIBILITY_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROPERTY__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression getBindableDef() {
		if (bindableDef != null && bindableDef.eIsProxy()) {
			InternalEObject oldBindableDef = (InternalEObject)bindableDef;
			bindableDef = (UiBindingExpression)eResolveProxy(oldBindableDef);
			if (bindableDef != oldBindableDef) {
				InternalEObject newBindableDef = (InternalEObject)bindableDef;
				NotificationChain msgs = oldBindableDef.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF, null, null);
				if (newBindableDef.eInternalContainer() == null) {
					msgs = newBindableDef.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF, oldBindableDef, bindableDef));
			}
		}
		return bindableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression basicGetBindableDef() {
		return bindableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindableDef(UiBindingExpression newBindableDef, NotificationChain msgs) {
		UiBindingExpression oldBindableDef = bindableDef;
		bindableDef = newBindableDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF, oldBindableDef, newBindableDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindableDef(UiBindingExpression newBindableDef) {
		if (newBindableDef != bindableDef) {
			NotificationChain msgs = null;
			if (bindableDef != null)
				msgs = ((InternalEObject)bindableDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF, null, msgs);
			if (newBindableDef != null)
				msgs = ((InternalEObject)newBindableDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF, null, msgs);
			msgs = basicSetBindableDef(newBindableDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF, newBindableDef, newBindableDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getAssignmentExpression() {
		if (assignmentExpression != null && assignmentExpression.eIsProxy()) {
			InternalEObject oldAssignmentExpression = (InternalEObject)assignmentExpression;
			assignmentExpression = (XExpression)eResolveProxy(oldAssignmentExpression);
			if (assignmentExpression != oldAssignmentExpression) {
				InternalEObject newAssignmentExpression = (InternalEObject)assignmentExpression;
				NotificationChain msgs = oldAssignmentExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION, null, null);
				if (newAssignmentExpression.eInternalContainer() == null) {
					msgs = newAssignmentExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION, oldAssignmentExpression, assignmentExpression));
			}
		}
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression basicGetAssignmentExpression() {
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignmentExpression(XExpression newAssignmentExpression, NotificationChain msgs) {
		XExpression oldAssignmentExpression = assignmentExpression;
		assignmentExpression = newAssignmentExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION, oldAssignmentExpression, newAssignmentExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentExpression(XExpression newAssignmentExpression) {
		if (newAssignmentExpression != assignmentExpression) {
			NotificationChain msgs = null;
			if (assignmentExpression != null)
				msgs = ((InternalEObject)assignmentExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION, null, msgs);
			if (newAssignmentExpression != null)
				msgs = ((InternalEObject)newAssignmentExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION, null, msgs);
			msgs = basicSetAssignmentExpression(newAssignmentExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION, newAssignmentExpression, newAssignmentExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF:
				return basicSetBindableDef(null, msgs);
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION:
				return basicSetAssignmentExpression(null, msgs);
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
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ID:
				return getId();
			case UiModelPackage.UI_VISIBILITY_PROPERTY__NAME:
				return getName();
			case UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF:
				if (resolve) return getBindableDef();
				return basicGetBindableDef();
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION:
				if (resolve) return getAssignmentExpression();
				return basicGetAssignmentExpression();
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
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF:
				setBindableDef((UiBindingExpression)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION:
				setAssignmentExpression((XExpression)newValue);
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
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_VISIBILITY_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF:
				setBindableDef((UiBindingExpression)null);
				return;
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION:
				setAssignmentExpression((XExpression)null);
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
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_VISIBILITY_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_VISIBILITY_PROPERTY__BINDABLE_DEF:
				return bindableDef != null;
			case UiModelPackage.UI_VISIBILITY_PROPERTY__ASSIGNMENT_EXPRESSION:
				return assignmentExpression != null;
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

} //UiVisibilityPropertyImpl
