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
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Validator Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl#getValidatorDef <em>Validator Def</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiValidatorAssignmentImpl#getValidatorAlias <em>Validator Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiValidatorAssignmentImpl extends MinimalEObjectImpl.Container implements UiValidatorAssignment {
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
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected UiField field;

	/**
	 * The cached value of the '{@link #getValidatorDef() <em>Validator Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorDef()
	 * @generated
	 * @ordered
	 */
	protected UiValidatorDef validatorDef;

	/**
	 * The cached value of the '{@link #getValidatorAlias() <em>Validator Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorAlias()
	 * @generated
	 * @ordered
	 */
	protected UiValidatorAlias validatorAlias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiValidatorAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_VALIDATOR_ASSIGNMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiField getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (UiField)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiField basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(UiField newField) {
		UiField oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiValidatorDef getValidatorDef() {
		if (validatorDef != null && validatorDef.eIsProxy()) {
			InternalEObject oldValidatorDef = (InternalEObject)validatorDef;
			validatorDef = (UiValidatorDef)eResolveProxy(oldValidatorDef);
			if (validatorDef != oldValidatorDef) {
				InternalEObject newValidatorDef = (InternalEObject)validatorDef;
				NotificationChain msgs = oldValidatorDef.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF, null, null);
				if (newValidatorDef.eInternalContainer() == null) {
					msgs = newValidatorDef.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF, oldValidatorDef, validatorDef));
			}
		}
		return validatorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiValidatorDef basicGetValidatorDef() {
		return validatorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidatorDef(UiValidatorDef newValidatorDef, NotificationChain msgs) {
		UiValidatorDef oldValidatorDef = validatorDef;
		validatorDef = newValidatorDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF, oldValidatorDef, newValidatorDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorDef(UiValidatorDef newValidatorDef) {
		if (newValidatorDef != validatorDef) {
			NotificationChain msgs = null;
			if (validatorDef != null)
				msgs = ((InternalEObject)validatorDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF, null, msgs);
			if (newValidatorDef != null)
				msgs = ((InternalEObject)newValidatorDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF, null, msgs);
			msgs = basicSetValidatorDef(newValidatorDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF, newValidatorDef, newValidatorDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiValidatorAlias getValidatorAlias() {
		if (validatorAlias != null && validatorAlias.eIsProxy()) {
			InternalEObject oldValidatorAlias = (InternalEObject)validatorAlias;
			validatorAlias = (UiValidatorAlias)eResolveProxy(oldValidatorAlias);
			if (validatorAlias != oldValidatorAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS, oldValidatorAlias, validatorAlias));
			}
		}
		return validatorAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiValidatorAlias basicGetValidatorAlias() {
		return validatorAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidatorAlias(UiValidatorAlias newValidatorAlias) {
		UiValidatorAlias oldValidatorAlias = validatorAlias;
		validatorAlias = newValidatorAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS, oldValidatorAlias, validatorAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF:
				return basicSetValidatorDef(null, msgs);
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
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__ID:
				return getId();
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__NAME:
				return getName();
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF:
				if (resolve) return getValidatorDef();
				return basicGetValidatorDef();
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS:
				if (resolve) return getValidatorAlias();
				return basicGetValidatorAlias();
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
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__FIELD:
				setField((UiField)newValue);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF:
				setValidatorDef((UiValidatorDef)newValue);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS:
				setValidatorAlias((UiValidatorAlias)newValue);
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
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__FIELD:
				setField((UiField)null);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF:
				setValidatorDef((UiValidatorDef)null);
				return;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS:
				setValidatorAlias((UiValidatorAlias)null);
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
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__FIELD:
				return field != null;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF:
				return validatorDef != null;
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS:
				return validatorAlias != null;
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

} //UiValidatorAssignmentImpl
