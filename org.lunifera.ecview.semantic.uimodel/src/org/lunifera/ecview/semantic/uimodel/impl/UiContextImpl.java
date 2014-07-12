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

import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiContext;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl#getBeanSlots <em>Bean Slots</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiContextImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiContextImpl extends MinimalEObjectImpl.Container implements UiContext {
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
	 * The cached value of the '{@link #getBeanSlots() <em>Bean Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<UiBeanSlot> beanSlots;

	/**
	 * The cached value of the '{@link #getBindingEndpointAlias() <em>Binding Endpoint Alias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingEndpointAlias()
	 * @generated
	 * @ordered
	 */
	protected EList<UiBindingEndpointAlias> bindingEndpointAlias;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_CONTEXT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_CONTEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBeanSlot> getBeanSlots() {
		if (beanSlots == null) {
			beanSlots = new EObjectContainmentEList<UiBeanSlot>(UiBeanSlot.class, this, UiModelPackage.UI_CONTEXT__BEAN_SLOTS);
		}
		return beanSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBindingEndpointAlias> getBindingEndpointAlias() {
		if (bindingEndpointAlias == null) {
			bindingEndpointAlias = new EObjectContainmentEList<UiBindingEndpointAlias>(UiBindingEndpointAlias.class, this, UiModelPackage.UI_CONTEXT__BINDING_ENDPOINT_ALIAS);
		}
		return bindingEndpointAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<UiBinding>(UiBinding.class, this, UiModelPackage.UI_CONTEXT__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_CONTEXT__BEAN_SLOTS:
				return ((InternalEList<?>)getBeanSlots()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_CONTEXT__BINDING_ENDPOINT_ALIAS:
				return ((InternalEList<?>)getBindingEndpointAlias()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_CONTEXT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case UiModelPackage.UI_CONTEXT__ID:
				return getId();
			case UiModelPackage.UI_CONTEXT__NAME:
				return getName();
			case UiModelPackage.UI_CONTEXT__BEAN_SLOTS:
				return getBeanSlots();
			case UiModelPackage.UI_CONTEXT__BINDING_ENDPOINT_ALIAS:
				return getBindingEndpointAlias();
			case UiModelPackage.UI_CONTEXT__BINDINGS:
				return getBindings();
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
			case UiModelPackage.UI_CONTEXT__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_CONTEXT__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_CONTEXT__BEAN_SLOTS:
				getBeanSlots().clear();
				getBeanSlots().addAll((Collection<? extends UiBeanSlot>)newValue);
				return;
			case UiModelPackage.UI_CONTEXT__BINDING_ENDPOINT_ALIAS:
				getBindingEndpointAlias().clear();
				getBindingEndpointAlias().addAll((Collection<? extends UiBindingEndpointAlias>)newValue);
				return;
			case UiModelPackage.UI_CONTEXT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
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
			case UiModelPackage.UI_CONTEXT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_CONTEXT__BEAN_SLOTS:
				getBeanSlots().clear();
				return;
			case UiModelPackage.UI_CONTEXT__BINDING_ENDPOINT_ALIAS:
				getBindingEndpointAlias().clear();
				return;
			case UiModelPackage.UI_CONTEXT__BINDINGS:
				getBindings().clear();
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
			case UiModelPackage.UI_CONTEXT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_CONTEXT__BEAN_SLOTS:
				return beanSlots != null && !beanSlots.isEmpty();
			case UiModelPackage.UI_CONTEXT__BINDING_ENDPOINT_ALIAS:
				return bindingEndpointAlias != null && !bindingEndpointAlias.isEmpty();
			case UiModelPackage.UI_CONTEXT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
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

} //UiContextImpl
