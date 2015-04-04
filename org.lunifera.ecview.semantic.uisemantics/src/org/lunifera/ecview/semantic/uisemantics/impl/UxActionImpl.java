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
package org.lunifera.ecview.semantic.uisemantics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ux Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxActionImpl#getExternalCommandId <em>External Command Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxActionImpl#isInitialDisabled <em>Initial Disabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UxActionImpl extends MinimalEObjectImpl.Container implements UxAction {
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
	 * The default value of the '{@link #getExternalCommandId() <em>External Command Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalCommandId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_COMMAND_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalCommandId() <em>External Command Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalCommandId()
	 * @generated
	 * @ordered
	 */
	protected String externalCommandId = EXTERNAL_COMMAND_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitialDisabled() <em>Initial Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialDisabled() <em>Initial Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean initialDisabled = INITIAL_DISABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UxActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiSemanticsPackage.Literals.UX_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalCommandId() {
		return externalCommandId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalCommandId(String newExternalCommandId) {
		String oldExternalCommandId = externalCommandId;
		externalCommandId = newExternalCommandId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ACTION__EXTERNAL_COMMAND_ID, oldExternalCommandId, externalCommandId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialDisabled() {
		return initialDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDisabled(boolean newInitialDisabled) {
		boolean oldInitialDisabled = initialDisabled;
		initialDisabled = newInitialDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ACTION__INITIAL_DISABLED, oldInitialDisabled, initialDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiSemanticsPackage.UX_ACTION__NAME:
				return getName();
			case UiSemanticsPackage.UX_ACTION__EXTERNAL_COMMAND_ID:
				return getExternalCommandId();
			case UiSemanticsPackage.UX_ACTION__INITIAL_DISABLED:
				return isInitialDisabled();
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
			case UiSemanticsPackage.UX_ACTION__NAME:
				setName((String)newValue);
				return;
			case UiSemanticsPackage.UX_ACTION__EXTERNAL_COMMAND_ID:
				setExternalCommandId((String)newValue);
				return;
			case UiSemanticsPackage.UX_ACTION__INITIAL_DISABLED:
				setInitialDisabled((Boolean)newValue);
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
			case UiSemanticsPackage.UX_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiSemanticsPackage.UX_ACTION__EXTERNAL_COMMAND_ID:
				setExternalCommandId(EXTERNAL_COMMAND_ID_EDEFAULT);
				return;
			case UiSemanticsPackage.UX_ACTION__INITIAL_DISABLED:
				setInitialDisabled(INITIAL_DISABLED_EDEFAULT);
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
			case UiSemanticsPackage.UX_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiSemanticsPackage.UX_ACTION__EXTERNAL_COMMAND_ID:
				return EXTERNAL_COMMAND_ID_EDEFAULT == null ? externalCommandId != null : !EXTERNAL_COMMAND_ID_EDEFAULT.equals(externalCommandId);
			case UiSemanticsPackage.UX_ACTION__INITIAL_DISABLED:
				return initialDisabled != INITIAL_DISABLED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", externalCommandId: ");
		result.append(externalCommandId);
		result.append(", initialDisabled: ");
		result.append(initialDisabled);
		result.append(')');
		return result.toString();
	}

} //UxActionImpl
