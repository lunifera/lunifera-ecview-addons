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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfoable;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.ecview.semantic.uimodel.UiMobileSearchPanel;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Mobile Search Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getI18nInfo <em>I1 8n Info</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getAutoWireSource <em>Auto Wire Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiMobileSearchPanelImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiMobileSearchPanelImpl extends UiVisibilityProcessableImpl implements UiMobileSearchPanel {
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
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<UiBinding> bindings;

	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected boolean readonly = READONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvisible()
	 * @generated
	 * @ordered
	 */
	protected boolean invisible = INVISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyles() <em>Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected String styles = STYLES_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOWIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutowire() <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutowire()
	 * @generated
	 * @ordered
	 */
	protected boolean autowire = AUTOWIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutoWireSource() <em>Auto Wire Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoWireSource()
	 * @generated
	 * @ordered
	 */
	protected UiBindingExpression autoWireSource;

	/**
	 * The cached value of the '{@link #getJvmType() <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference jvmType;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<UiSearchField> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiMobileSearchPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_MOBILE_SEARCH_PANEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__NAME, oldName, name));
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
				NotificationChain msgs = oldI18nInfo.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO, null, null);
				if (newI18nInfo.eInternalContainer() == null) {
					msgs = newI18nInfo.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO, oldI18nInfo, i18nInfo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO, oldI18nInfo, newI18nInfo);
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
				msgs = ((InternalEObject)i18nInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO, null, msgs);
			if (newI18nInfo != null)
				msgs = ((InternalEObject)newI18nInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO, null, msgs);
			msgs = basicSetI18nInfo(newI18nInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO, newI18nInfo, newI18nInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList.Resolving<UiBinding>(UiBinding.class, this, UiModelPackage.UI_MOBILE_SEARCH_PANEL__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return readonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		boolean oldReadonly = readonly;
		readonly = newReadonly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__READONLY, oldReadonly, readonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvisible() {
		return invisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvisible(boolean newInvisible) {
		boolean oldInvisible = invisible;
		invisible = newInvisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__INVISIBLE, oldInvisible, invisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyles() {
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyles(String newStyles) {
		String oldStyles = styles;
		styles = newStyles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__STYLES, oldStyles, styles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutowire() {
		return autowire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutowire(boolean newAutowire) {
		boolean oldAutowire = autowire;
		autowire = newAutowire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTOWIRE, oldAutowire, autowire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression getAutoWireSource() {
		if (autoWireSource != null && autoWireSource.eIsProxy()) {
			InternalEObject oldAutoWireSource = (InternalEObject)autoWireSource;
			autoWireSource = (UiBindingExpression)eResolveProxy(oldAutoWireSource);
			if (autoWireSource != oldAutoWireSource) {
				InternalEObject newAutoWireSource = (InternalEObject)autoWireSource;
				NotificationChain msgs = oldAutoWireSource.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE, null, null);
				if (newAutoWireSource.eInternalContainer() == null) {
					msgs = newAutoWireSource.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE, oldAutoWireSource, autoWireSource));
			}
		}
		return autoWireSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression basicGetAutoWireSource() {
		return autoWireSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoWireSource(UiBindingExpression newAutoWireSource, NotificationChain msgs) {
		UiBindingExpression oldAutoWireSource = autoWireSource;
		autoWireSource = newAutoWireSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE, oldAutoWireSource, newAutoWireSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoWireSource(UiBindingExpression newAutoWireSource) {
		if (newAutoWireSource != autoWireSource) {
			NotificationChain msgs = null;
			if (autoWireSource != null)
				msgs = ((InternalEObject)autoWireSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE, null, msgs);
			if (newAutoWireSource != null)
				msgs = ((InternalEObject)newAutoWireSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE, null, msgs);
			msgs = basicSetAutoWireSource(newAutoWireSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE, newAutoWireSource, newAutoWireSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getJvmType() {
		if (jvmType != null && jvmType.eIsProxy()) {
			InternalEObject oldJvmType = (InternalEObject)jvmType;
			jvmType = (JvmTypeReference)eResolveProxy(oldJvmType);
			if (jvmType != oldJvmType) {
				InternalEObject newJvmType = (InternalEObject)jvmType;
				NotificationChain msgs = oldJvmType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE, null, null);
				if (newJvmType.eInternalContainer() == null) {
					msgs = newJvmType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE, oldJvmType, jvmType));
			}
		}
		return jvmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference basicGetJvmType() {
		return jvmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJvmType(JvmTypeReference newJvmType, NotificationChain msgs) {
		JvmTypeReference oldJvmType = jvmType;
		jvmType = newJvmType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE, oldJvmType, newJvmType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJvmType(JvmTypeReference newJvmType) {
		if (newJvmType != jvmType) {
			NotificationChain msgs = null;
			if (jvmType != null)
				msgs = ((InternalEObject)jvmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE, null, msgs);
			if (newJvmType != null)
				msgs = ((InternalEObject)newJvmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE, null, msgs);
			msgs = basicSetJvmType(newJvmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE, newJvmType, newJvmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiSearchField> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList.Resolving<UiSearchField>(UiSearchField.class, this, UiModelPackage.UI_MOBILE_SEARCH_PANEL__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO:
				return basicSetI18nInfo(null, msgs);
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE:
				return basicSetAutoWireSource(null, msgs);
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE:
				return basicSetJvmType(null, msgs);
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__ID:
				return getId();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__NAME:
				return getName();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO:
				if (resolve) return getI18nInfo();
				return basicGetI18nInfo();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__BINDINGS:
				return getBindings();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__READONLY:
				return isReadonly();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__INVISIBLE:
				return isInvisible();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__STYLES:
				return getStyles();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTOWIRE:
				return isAutowire();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE:
				if (resolve) return getAutoWireSource();
				return basicGetAutoWireSource();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE:
				if (resolve) return getJvmType();
				return basicGetJvmType();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__CONTENTS:
				return getContents();
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
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO:
				setI18nInfo((UiI18nInfo)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__INVISIBLE:
				setInvisible((Boolean)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__STYLES:
				setStyles((String)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTOWIRE:
				setAutowire((Boolean)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE:
				setAutoWireSource((UiBindingExpression)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE:
				setJvmType((JvmTypeReference)newValue);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends UiSearchField>)newValue);
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
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO:
				setI18nInfo((UiI18nInfo)null);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__BINDINGS:
				getBindings().clear();
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__INVISIBLE:
				setInvisible(INVISIBLE_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__STYLES:
				setStyles(STYLES_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTOWIRE:
				setAutowire(AUTOWIRE_EDEFAULT);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE:
				setAutoWireSource((UiBindingExpression)null);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE:
				setJvmType((JvmTypeReference)null);
				return;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__CONTENTS:
				getContents().clear();
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
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO:
				return i18nInfo != null;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__READONLY:
				return readonly != READONLY_EDEFAULT;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__INVISIBLE:
				return invisible != INVISIBLE_EDEFAULT;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__STYLES:
				return STYLES_EDEFAULT == null ? styles != null : !STYLES_EDEFAULT.equals(styles);
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTOWIRE:
				return autowire != AUTOWIRE_EDEFAULT;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE:
				return autoWireSource != null;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE:
				return jvmType != null;
			case UiModelPackage.UI_MOBILE_SEARCH_PANEL__CONTENTS:
				return contents != null && !contents.isEmpty();
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
		if (baseClass == UiNamedElement.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_MOBILE_SEARCH_PANEL__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_MOBILE_SEARCH_PANEL__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiI18nInfoable.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO: return UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO;
				default: return -1;
			}
		}
		if (baseClass == UiLayout.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTOWIRE: return UiModelPackage.UI_LAYOUT__AUTOWIRE;
				case UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE: return UiModelPackage.UI_LAYOUT__AUTO_WIRE_SOURCE;
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE: return UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE;
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
		if (baseClass == UiNamedElement.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_MOBILE_SEARCH_PANEL__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_MOBILE_SEARCH_PANEL__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiI18nInfoable.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO: return UiModelPackage.UI_MOBILE_SEARCH_PANEL__I18N_INFO;
				default: return -1;
			}
		}
		if (baseClass == UiLayout.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_LAYOUT__AUTOWIRE: return UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTOWIRE;
				case UiModelPackage.UI_LAYOUT__AUTO_WIRE_SOURCE: return UiModelPackage.UI_MOBILE_SEARCH_PANEL__AUTO_WIRE_SOURCE;
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE: return UiModelPackage.UI_MOBILE_SEARCH_PANEL__JVM_TYPE;
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
		result.append(", readonly: ");
		result.append(readonly);
		result.append(", invisible: ");
		result.append(invisible);
		result.append(", styles: ");
		result.append(styles);
		result.append(", autowire: ");
		result.append(autowire);
		result.append(')');
		return result.toString();
	}

} //UiMobileSearchPanelImpl
