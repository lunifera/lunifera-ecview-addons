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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiSendEventCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Send Event Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSendEventCommandImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSendEventCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSendEventCommandImpl#getEventTopic <em>Event Topic</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSendEventCommandImpl#isNoAutoTrigger <em>No Auto Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiSendEventCommandImpl extends MinimalEObjectImpl.Container implements UiSendEventCommand {
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
	 * The default value of the '{@link #getEventTopic() <em>Event Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventTopic() <em>Event Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTopic()
	 * @generated
	 * @ordered
	 */
	protected String eventTopic = EVENT_TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoAutoTrigger() <em>No Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoAutoTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_AUTO_TRIGGER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoAutoTrigger() <em>No Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoAutoTrigger()
	 * @generated
	 * @ordered
	 */
	protected boolean noAutoTrigger = NO_AUTO_TRIGGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiSendEventCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_SEND_EVENT_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SEND_EVENT_COMMAND__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SEND_EVENT_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventTopic() {
		return eventTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventTopic(String newEventTopic) {
		String oldEventTopic = eventTopic;
		eventTopic = newEventTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SEND_EVENT_COMMAND__EVENT_TOPIC, oldEventTopic, eventTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoAutoTrigger() {
		return noAutoTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoAutoTrigger(boolean newNoAutoTrigger) {
		boolean oldNoAutoTrigger = noAutoTrigger;
		noAutoTrigger = newNoAutoTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SEND_EVENT_COMMAND__NO_AUTO_TRIGGER, oldNoAutoTrigger, noAutoTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiModelPackage.UI_SEND_EVENT_COMMAND__ID:
				return getId();
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NAME:
				return getName();
			case UiModelPackage.UI_SEND_EVENT_COMMAND__EVENT_TOPIC:
				return getEventTopic();
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NO_AUTO_TRIGGER:
				return isNoAutoTrigger();
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
			case UiModelPackage.UI_SEND_EVENT_COMMAND__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_SEND_EVENT_COMMAND__EVENT_TOPIC:
				setEventTopic((String)newValue);
				return;
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NO_AUTO_TRIGGER:
				setNoAutoTrigger((Boolean)newValue);
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
			case UiModelPackage.UI_SEND_EVENT_COMMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_SEND_EVENT_COMMAND__EVENT_TOPIC:
				setEventTopic(EVENT_TOPIC_EDEFAULT);
				return;
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NO_AUTO_TRIGGER:
				setNoAutoTrigger(NO_AUTO_TRIGGER_EDEFAULT);
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
			case UiModelPackage.UI_SEND_EVENT_COMMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_SEND_EVENT_COMMAND__EVENT_TOPIC:
				return EVENT_TOPIC_EDEFAULT == null ? eventTopic != null : !EVENT_TOPIC_EDEFAULT.equals(eventTopic);
			case UiModelPackage.UI_SEND_EVENT_COMMAND__NO_AUTO_TRIGGER:
				return noAutoTrigger != NO_AUTO_TRIGGER_EDEFAULT;
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
		result.append(", eventTopic: ");
		result.append(eventTopic);
		result.append(", noAutoTrigger: ");
		result.append(noAutoTrigger);
		result.append(')');
		return result.toString();
	}

} //UiSendEventCommandImpl
