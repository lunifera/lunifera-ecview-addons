/**
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
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment;
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
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getBindingAlias <em>Binding Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getChangeTrigger <em>Change Trigger</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessorImpl#getPropertiesAssignment <em>Properties Assignment</em>}</li>
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
	 * The cached value of the '{@link #getBindingAlias() <em>Binding Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<UiBindingEndpointAlias> bindingAlias;

	/**
	 * The cached value of the '{@link #getChangeTrigger() <em>Change Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<UiChangeTrigger> changeTrigger;

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
	 * The cached value of the '{@link #getPropertiesAssignment() <em>Properties Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesAssignment()
	 * @generated
	 * @ordered
	 */
	protected UiVisibilityPropertiesAssignment propertiesAssignment;

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
	public EList<UiBindingEndpointAlias> getBindingAlias() {
		if (bindingAlias == null) {
			bindingAlias = new EObjectContainmentEList.Resolving<UiBindingEndpointAlias>(UiBindingEndpointAlias.class, this, UiModelPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS);
		}
		return bindingAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiChangeTrigger> getChangeTrigger() {
		if (changeTrigger == null) {
			changeTrigger = new EObjectContainmentEList.Resolving<UiChangeTrigger>(UiChangeTrigger.class, this, UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER);
		}
		return changeTrigger;
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
	public UiVisibilityPropertiesAssignment getPropertiesAssignment() {
		if (propertiesAssignment != null && propertiesAssignment.eIsProxy()) {
			InternalEObject oldPropertiesAssignment = (InternalEObject)propertiesAssignment;
			propertiesAssignment = (UiVisibilityPropertiesAssignment)eResolveProxy(oldPropertiesAssignment);
			if (propertiesAssignment != oldPropertiesAssignment) {
				InternalEObject newPropertiesAssignment = (InternalEObject)propertiesAssignment;
				NotificationChain msgs = oldPropertiesAssignment.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT, null, null);
				if (newPropertiesAssignment.eInternalContainer() == null) {
					msgs = newPropertiesAssignment.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT, oldPropertiesAssignment, propertiesAssignment));
			}
		}
		return propertiesAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityPropertiesAssignment basicGetPropertiesAssignment() {
		return propertiesAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertiesAssignment(UiVisibilityPropertiesAssignment newPropertiesAssignment, NotificationChain msgs) {
		UiVisibilityPropertiesAssignment oldPropertiesAssignment = propertiesAssignment;
		propertiesAssignment = newPropertiesAssignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT, oldPropertiesAssignment, newPropertiesAssignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertiesAssignment(UiVisibilityPropertiesAssignment newPropertiesAssignment) {
		if (newPropertiesAssignment != propertiesAssignment) {
			NotificationChain msgs = null;
			if (propertiesAssignment != null)
				msgs = ((InternalEObject)propertiesAssignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT, null, msgs);
			if (newPropertiesAssignment != null)
				msgs = ((InternalEObject)newPropertiesAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT, null, msgs);
			msgs = basicSetPropertiesAssignment(newPropertiesAssignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT, newPropertiesAssignment, newPropertiesAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return ((InternalEList<?>)getBindingAlias()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return ((InternalEList<?>)getChangeTrigger()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				return basicSetRule(null, msgs);
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT:
				return basicSetPropertiesAssignment(null, msgs);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return getBindingAlias();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return getChangeTrigger();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				if (resolve) return getRule();
				return basicGetRule();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT:
				if (resolve) return getPropertiesAssignment();
				return basicGetPropertiesAssignment();
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				getBindingAlias().clear();
				getBindingAlias().addAll((Collection<? extends UiBindingEndpointAlias>)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				getChangeTrigger().clear();
				getChangeTrigger().addAll((Collection<? extends UiChangeTrigger>)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				setRule((UiVisibilityRule)newValue);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT:
				setPropertiesAssignment((UiVisibilityPropertiesAssignment)newValue);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				getBindingAlias().clear();
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				getChangeTrigger().clear();
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				setRule((UiVisibilityRule)null);
				return;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT:
				setPropertiesAssignment((UiVisibilityPropertiesAssignment)null);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return bindingAlias != null && !bindingAlias.isEmpty();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return changeTrigger != null && !changeTrigger.isEmpty();
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__RULE:
				return rule != null;
			case UiModelPackage.UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT:
				return propertiesAssignment != null;
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
