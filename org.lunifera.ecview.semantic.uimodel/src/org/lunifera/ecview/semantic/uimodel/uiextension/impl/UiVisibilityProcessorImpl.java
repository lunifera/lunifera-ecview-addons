/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

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
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityRule;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Visibility Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getBindingAlias <em>Binding Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getChangeTrigger <em>Change Trigger</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getRule <em>Rule</em>}</li>
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
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<UiRootElements> roots;

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
		return UiextensionPackage.Literals.UI_VISIBILITY_PROCESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROCESSOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROCESSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiRootElements> getRoots() {
		if (roots == null) {
			roots = new EObjectContainmentEList<UiRootElements>(UiRootElements.class, this, UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBindingEndpointAlias> getBindingAlias() {
		if (bindingAlias == null) {
			bindingAlias = new EObjectContainmentEList<UiBindingEndpointAlias>(UiBindingEndpointAlias.class, this, UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS);
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
			changeTrigger = new EObjectContainmentEList<UiChangeTrigger>(UiChangeTrigger.class, this, UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER);
		}
		return changeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityRule getRule() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE, oldRule, newRule);
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
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				return ((InternalEList<?>)getRoots()).basicRemove(otherEnd, msgs);
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return ((InternalEList<?>)getBindingAlias()).basicRemove(otherEnd, msgs);
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return ((InternalEList<?>)getChangeTrigger()).basicRemove(otherEnd, msgs);
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE:
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ID:
				return getId();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__NAME:
				return getName();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				return getRoots();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return getBindingAlias();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return getChangeTrigger();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE:
				return getRule();
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ID:
				setId((String)newValue);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends UiRootElements>)newValue);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				getBindingAlias().clear();
				getBindingAlias().addAll((Collection<? extends UiBindingEndpointAlias>)newValue);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				getChangeTrigger().clear();
				getChangeTrigger().addAll((Collection<? extends UiChangeTrigger>)newValue);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE:
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ID:
				setId(ID_EDEFAULT);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				getRoots().clear();
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				getBindingAlias().clear();
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				getChangeTrigger().clear();
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE:
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				return roots != null && !roots.isEmpty();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return bindingAlias != null && !bindingAlias.isEmpty();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return changeTrigger != null && !changeTrigger.isEmpty();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__RULE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UiModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiModel.class) {
			switch (derivedFeatureID) {
				case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS: return UimodelPackage.UI_MODEL__ROOTS;
				default: return -1;
			}
		}
		if (baseClass == UiRootElements.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == UiModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiModel.class) {
			switch (baseFeatureID) {
				case UimodelPackage.UI_MODEL__ROOTS: return UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS;
				default: return -1;
			}
		}
		if (baseClass == UiRootElements.class) {
			switch (baseFeatureID) {
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

} //UiVisibilityProcessorImpl
