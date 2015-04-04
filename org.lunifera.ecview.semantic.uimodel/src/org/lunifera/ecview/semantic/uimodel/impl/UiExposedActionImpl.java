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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.ecview.semantic.uimodel.UiExposedAction;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uisemantics.UxAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Exposed Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiExposedActionImpl#getActionReference <em>Action Reference</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiExposedActionImpl#getActionID <em>Action ID</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiExposedActionImpl#getIconName <em>Icon Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiExposedActionImpl extends UiActionImpl implements UiExposedAction {
	/**
	 * The cached value of the '{@link #getActionReference() <em>Action Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionReference()
	 * @generated
	 * @ordered
	 */
	protected UxAction actionReference;

	/**
	 * The default value of the '{@link #getActionID() <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionID() <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionID()
	 * @generated
	 * @ordered
	 */
	protected String actionID = ACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected String iconName = ICON_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiExposedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_EXPOSED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxAction getActionReference() {
		if (actionReference != null && actionReference.eIsProxy()) {
			InternalEObject oldActionReference = (InternalEObject)actionReference;
			actionReference = (UxAction)eResolveProxy(oldActionReference);
			if (actionReference != oldActionReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_EXPOSED_ACTION__ACTION_REFERENCE, oldActionReference, actionReference));
			}
		}
		return actionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxAction basicGetActionReference() {
		return actionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionReference(UxAction newActionReference) {
		UxAction oldActionReference = actionReference;
		actionReference = newActionReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_EXPOSED_ACTION__ACTION_REFERENCE, oldActionReference, actionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionID() {
		return actionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionID(String newActionID) {
		String oldActionID = actionID;
		actionID = newActionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_EXPOSED_ACTION__ACTION_ID, oldActionID, actionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconName() {
		return iconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconName(String newIconName) {
		String oldIconName = iconName;
		iconName = newIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_EXPOSED_ACTION__ICON_NAME, oldIconName, iconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_REFERENCE:
				if (resolve) return getActionReference();
				return basicGetActionReference();
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_ID:
				return getActionID();
			case UiModelPackage.UI_EXPOSED_ACTION__ICON_NAME:
				return getIconName();
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
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_REFERENCE:
				setActionReference((UxAction)newValue);
				return;
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_ID:
				setActionID((String)newValue);
				return;
			case UiModelPackage.UI_EXPOSED_ACTION__ICON_NAME:
				setIconName((String)newValue);
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
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_REFERENCE:
				setActionReference((UxAction)null);
				return;
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_ID:
				setActionID(ACTION_ID_EDEFAULT);
				return;
			case UiModelPackage.UI_EXPOSED_ACTION__ICON_NAME:
				setIconName(ICON_NAME_EDEFAULT);
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
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_REFERENCE:
				return actionReference != null;
			case UiModelPackage.UI_EXPOSED_ACTION__ACTION_ID:
				return ACTION_ID_EDEFAULT == null ? actionID != null : !ACTION_ID_EDEFAULT.equals(actionID);
			case UiModelPackage.UI_EXPOSED_ACTION__ICON_NAME:
				return ICON_NAME_EDEFAULT == null ? iconName != null : !ICON_NAME_EDEFAULT.equals(iconName);
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
		result.append(" (actionID: ");
		result.append(actionID);
		result.append(", iconName: ");
		result.append(iconName);
		result.append(')');
		return result.toString();
	}

} //UiExposedActionImpl
