/**
 */
package org.lunifera.ecview.model.uiConfigs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.ecview.model.uiConfigs.BindingMethod;
import org.lunifera.ecview.model.uiConfigs.TextFieldConfig;
import org.lunifera.ecview.model.uiConfigs.UiConfigsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Field Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.model.uiConfigs.impl.TextFieldConfigImpl#getBindingMethods <em>Binding Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextFieldConfigImpl extends MinimalEObjectImpl.Container implements TextFieldConfig {
	/**
	 * The cached value of the '{@link #getBindingMethods() <em>Binding Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingMethod> bindingMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFieldConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiConfigsPackage.Literals.TEXT_FIELD_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingMethod> getBindingMethods() {
		if (bindingMethods == null) {
			bindingMethods = new EObjectContainmentEList<BindingMethod>(BindingMethod.class, this, UiConfigsPackage.TEXT_FIELD_CONFIG__BINDING_METHODS);
		}
		return bindingMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiConfigsPackage.TEXT_FIELD_CONFIG__BINDING_METHODS:
				return ((InternalEList<?>)getBindingMethods()).basicRemove(otherEnd, msgs);
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
			case UiConfigsPackage.TEXT_FIELD_CONFIG__BINDING_METHODS:
				return getBindingMethods();
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
			case UiConfigsPackage.TEXT_FIELD_CONFIG__BINDING_METHODS:
				getBindingMethods().clear();
				getBindingMethods().addAll((Collection<? extends BindingMethod>)newValue);
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
			case UiConfigsPackage.TEXT_FIELD_CONFIG__BINDING_METHODS:
				getBindingMethods().clear();
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
			case UiConfigsPackage.TEXT_FIELD_CONFIG__BINDING_METHODS:
				return bindingMethods != null && !bindingMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextFieldConfigImpl
