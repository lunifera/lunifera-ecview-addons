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
import org.lunifera.ecview.semantic.uimodel.UiAlignment;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Grid Layout Assigment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutAssigmentImpl#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiGridLayoutAssigmentImpl extends MinimalEObjectImpl.Container implements UiGridLayoutAssigment {
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
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected UiEmbeddable element;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected UiPoint from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected UiPoint to;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final UiAlignment ALIGNMENT_EDEFAULT = UiAlignment.UNDEFINED;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected UiAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiGridLayoutAssigmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_GRID_LAYOUT_ASSIGMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__NAME, oldName, name));
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
				NotificationChain msgs = oldElement.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT, null, null);
				if (newElement.eInternalContainer() == null) {
					msgs = newElement.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT, oldElement, element));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT, oldElement, newElement);
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
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPoint getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (UiPoint)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				InternalEObject newFrom = (InternalEObject)from;
				NotificationChain msgs = oldFrom.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM, null, null);
				if (newFrom.eInternalContainer() == null) {
					msgs = newFrom.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPoint basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(UiPoint newFrom, NotificationChain msgs) {
		UiPoint oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(UiPoint newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPoint getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (UiPoint)eResolveProxy(oldTo);
			if (to != oldTo) {
				InternalEObject newTo = (InternalEObject)to;
				NotificationChain msgs = oldTo.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO, null, null);
				if (newTo.eInternalContainer() == null) {
					msgs = newTo.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPoint basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(UiPoint newTo, NotificationChain msgs) {
		UiPoint oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(UiPoint newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(UiAlignment newAlignment) {
		UiAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT:
				return basicSetElement(null, msgs);
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM:
				return basicSetFrom(null, msgs);
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO:
				return basicSetTo(null, msgs);
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
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ID:
				return getId();
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__NAME:
				return getName();
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT:
				return getAlignment();
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
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT:
				setElement((UiEmbeddable)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM:
				setFrom((UiPoint)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO:
				setTo((UiPoint)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT:
				setAlignment((UiAlignment)newValue);
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
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT:
				setElement((UiEmbeddable)null);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM:
				setFrom((UiPoint)null);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO:
				setTo((UiPoint)null);
				return;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
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
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ELEMENT:
				return element != null;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__FROM:
				return from != null;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__TO:
				return to != null;
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
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
		result.append(", alignment: ");
		result.append(alignment);
		result.append(')');
		return result.toString();
	}

} //UiGridLayoutAssigmentImpl
