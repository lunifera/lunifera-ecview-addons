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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Visibility Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getDataUsed <em>Data Used</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getChangeTriggers <em>Change Triggers</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getImportedElements <em>Imported Elements</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiVisibilityProcessorImpl extends MinimalEObjectImpl.Container implements UiVisibilityProcessor {
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
	 * The cached value of the '{@link #getDataUsed() <em>Data Used</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<UiBindingEndpointAlias> dataUsed;

	/**
	 * The cached value of the '{@link #getChangeTriggers() <em>Change Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<UiChangeTrigger> changeTriggers;

	/**
	 * The cached value of the '{@link #getImportedElements() <em>Imported Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<UiBindingExpression> importedElements;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected UiVisibilityRule rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiVisibilityProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_VISIBILITY_PROCESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBindingEndpointAlias> getDataUsed() {
		if (dataUsed == null) {
			dataUsed = new EObjectContainmentEList.Resolving<UiBindingEndpointAlias>(UiBindingEndpointAlias.class, this, UiModelPackage.UI_VISIBILITY_PROCESSOR__DATA_USED);
		}
		return dataUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiChangeTrigger> getChangeTriggers() {
		if (changeTriggers == null) {
			changeTriggers = new EObjectContainmentEList.Resolving<UiChangeTrigger>(UiChangeTrigger.class, this, UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGERS);
		}
		return changeTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBindingExpression> getImportedElements() {
		if (importedElements == null) {
			importedElements = new EObjectContainmentEList.Resolving<UiBindingExpression>(UiBindingExpression.class, this, UiModelPackage.UI_VISIBILITY_PROCESSOR__IMPORTED_ELEMENTS);
		}
		return importedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityRule getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = (UiVisibilityRule)eResolveProxy(oldRule);
			if (rule != oldRule) {
				InternalEObject newRule = (InternalEObject)rule;
				NotificationChain msgs = oldRule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE, null, null);
				if (newRule.eInternalContainer() == null) {
					msgs = newRule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityRule basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(UiVisibilityRule newRule, NotificationChain msgs) {
		UiVisibilityRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(UiVisibilityRule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__DATA_USED:
				return ((InternalEList<?>)getDataUsed()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGERS:
				return ((InternalEList<?>)getChangeTriggers()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__IMPORTED_ELEMENTS:
				return ((InternalEList<?>)getImportedElements()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				return basicSetRule(null, msgs);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__ID:
				return getId();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__NAME:
				return getName();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__DATA_USED:
				return getDataUsed();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGERS:
				return getChangeTriggers();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__IMPORTED_ELEMENTS:
				return getImportedElements();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				if (resolve) return getRule();
				return basicGetRule();
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__DATA_USED:
				getDataUsed().clear();
				getDataUsed().addAll((Collection<? extends UiBindingEndpointAlias>)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGERS:
				getChangeTriggers().clear();
				getChangeTriggers().addAll((Collection<? extends UiChangeTrigger>)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__IMPORTED_ELEMENTS:
				getImportedElements().clear();
				getImportedElements().addAll((Collection<? extends UiBindingExpression>)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				setRule((UiVisibilityRule)newValue);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__DATA_USED:
				getDataUsed().clear();
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGERS:
				getChangeTriggers().clear();
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__IMPORTED_ELEMENTS:
				getImportedElements().clear();
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				setRule((UiVisibilityRule)null);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__DATA_USED:
				return dataUsed != null && !dataUsed.isEmpty();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGERS:
				return changeTriggers != null && !changeTriggers.isEmpty();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__IMPORTED_ELEMENTS:
				return importedElements != null && !importedElements.isEmpty();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				return rule != null;
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

} //UiVisibilityProcessorImpl
