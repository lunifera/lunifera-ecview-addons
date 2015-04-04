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
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Mobile Navigation Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileNavigationCommandImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileNavigationCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileNavigationCommandImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileNavigationCommandImpl#getTargetPageAlias <em>Target Page Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiMobileNavigationCommandImpl extends MinimalEObjectImpl.Container implements UiMobileNavigationCommand {
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
	 * The cached value of the '{@link #getTargetPage() <em>Target Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPage()
	 * @generated
	 * @ordered
	 */
	protected UiMobileNavigationPage targetPage;

	/**
	 * The cached value of the '{@link #getTargetPageAlias() <em>Target Page Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPageAlias()
	 * @generated
	 * @ordered
	 */
	protected UiMobileNavigationPage targetPageAlias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiMobileNavigationCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_MOBILE_NAVIGATION_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationPage getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject)targetPage;
			targetPage = (UiMobileNavigationPage)eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				InternalEObject newTargetPage = (InternalEObject)targetPage;
				NotificationChain msgs = oldTargetPage.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE, null, null);
				if (newTargetPage.eInternalContainer() == null) {
					msgs = newTargetPage.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE, oldTargetPage, targetPage));
			}
		}
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationPage basicGetTargetPage() {
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPage(UiMobileNavigationPage newTargetPage, NotificationChain msgs) {
		UiMobileNavigationPage oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE, oldTargetPage, newTargetPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPage(UiMobileNavigationPage newTargetPage) {
		if (newTargetPage != targetPage) {
			NotificationChain msgs = null;
			if (targetPage != null)
				msgs = ((InternalEObject)targetPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE, null, msgs);
			if (newTargetPage != null)
				msgs = ((InternalEObject)newTargetPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE, null, msgs);
			msgs = basicSetTargetPage(newTargetPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE, newTargetPage, newTargetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationPage getTargetPageAlias() {
		if (targetPageAlias != null && targetPageAlias.eIsProxy()) {
			InternalEObject oldTargetPageAlias = (InternalEObject)targetPageAlias;
			targetPageAlias = (UiMobileNavigationPage)eResolveProxy(oldTargetPageAlias);
			if (targetPageAlias != oldTargetPageAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS, oldTargetPageAlias, targetPageAlias));
			}
		}
		return targetPageAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMobileNavigationPage basicGetTargetPageAlias() {
		return targetPageAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPageAlias(UiMobileNavigationPage newTargetPageAlias) {
		UiMobileNavigationPage oldTargetPageAlias = targetPageAlias;
		targetPageAlias = newTargetPageAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS, oldTargetPageAlias, targetPageAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE:
				return basicSetTargetPage(null, msgs);
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
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__ID:
				return getId();
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__NAME:
				return getName();
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE:
				if (resolve) return getTargetPage();
				return basicGetTargetPage();
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS:
				if (resolve) return getTargetPageAlias();
				return basicGetTargetPageAlias();
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
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE:
				setTargetPage((UiMobileNavigationPage)newValue);
				return;
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS:
				setTargetPageAlias((UiMobileNavigationPage)newValue);
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
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE:
				setTargetPage((UiMobileNavigationPage)null);
				return;
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS:
				setTargetPageAlias((UiMobileNavigationPage)null);
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
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE:
				return targetPage != null;
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS:
				return targetPageAlias != null;
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

} //UiMobileNavigationCommandImpl
