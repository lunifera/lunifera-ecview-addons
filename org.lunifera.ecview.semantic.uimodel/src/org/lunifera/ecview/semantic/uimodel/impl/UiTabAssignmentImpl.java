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
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfoable;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiRawBindableProvider;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Tab Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTabAssignmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTabAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTabAssignmentImpl#getI18nInfo <em>I1 8n Info</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiTabAssignmentImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiTabAssignmentImpl extends MinimalEObjectImpl.Container implements UiTabAssignment {
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
	 * The cached value of the '{@link #getI18nInfo() <em>I1 8n Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI18nInfo()
	 * @generated
	 * @ordered
	 */
	protected UiI18nInfo i18nInfo;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected UiEmbeddable element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiTabAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_TAB_ASSIGNMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TAB_ASSIGNMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TAB_ASSIGNMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiEmbeddable getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (UiEmbeddable)eResolveProxy(oldElement);
			if (element != oldElement) {
				InternalEObject newElement = (InternalEObject)element;
				NotificationChain msgs = oldElement.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT, null, null);
				if (newElement.eInternalContainer() == null) {
					msgs = newElement.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiEmbeddable basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(UiEmbeddable newElement, NotificationChain msgs) {
		UiEmbeddable oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(UiEmbeddable newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiI18nInfo getI18nInfo() {
		if (i18nInfo != null && i18nInfo.eIsProxy()) {
			InternalEObject oldI18nInfo = (InternalEObject)i18nInfo;
			i18nInfo = (UiI18nInfo)eResolveProxy(oldI18nInfo);
			if (i18nInfo != oldI18nInfo) {
				InternalEObject newI18nInfo = (InternalEObject)i18nInfo;
				NotificationChain msgs = oldI18nInfo.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO, null, null);
				if (newI18nInfo.eInternalContainer() == null) {
					msgs = newI18nInfo.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO, oldI18nInfo, i18nInfo));
			}
		}
		return i18nInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiI18nInfo basicGetI18nInfo() {
		return i18nInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetI18nInfo(UiI18nInfo newI18nInfo, NotificationChain msgs) {
		UiI18nInfo oldI18nInfo = i18nInfo;
		i18nInfo = newI18nInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO, oldI18nInfo, newI18nInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI18nInfo(UiI18nInfo newI18nInfo) {
		if (newI18nInfo != i18nInfo) {
			NotificationChain msgs = null;
			if (i18nInfo != null)
				msgs = ((InternalEObject)i18nInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO, null, msgs);
			if (newI18nInfo != null)
				msgs = ((InternalEObject)newI18nInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO, null, msgs);
			msgs = basicSetI18nInfo(newI18nInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO, newI18nInfo, newI18nInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO:
				return basicSetI18nInfo(null, msgs);
			case UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT:
				return basicSetElement(null, msgs);
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
			case UiModelPackage.UI_TAB_ASSIGNMENT__ID:
				return getId();
			case UiModelPackage.UI_TAB_ASSIGNMENT__NAME:
				return getName();
			case UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO:
				if (resolve) return getI18nInfo();
				return basicGetI18nInfo();
			case UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiModelPackage.UI_TAB_ASSIGNMENT__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_TAB_ASSIGNMENT__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO:
				setI18nInfo((UiI18nInfo)newValue);
				return;
			case UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT:
				setElement((UiEmbeddable)newValue);
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
			case UiModelPackage.UI_TAB_ASSIGNMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_TAB_ASSIGNMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO:
				setI18nInfo((UiI18nInfo)null);
				return;
			case UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT:
				setElement((UiEmbeddable)null);
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
			case UiModelPackage.UI_TAB_ASSIGNMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_TAB_ASSIGNMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO:
				return i18nInfo != null;
			case UiModelPackage.UI_TAB_ASSIGNMENT__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UiRawBindableProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiI18nInfoable.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO: return UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UiRawBindableProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiI18nInfoable.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO: return UiModelPackage.UI_TAB_ASSIGNMENT__I18N_INFO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //UiTabAssignmentImpl
