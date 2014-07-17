/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Change Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiChangeTriggerImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiChangeTriggerImpl#getEndpointAlias <em>Endpoint Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiChangeTriggerImpl extends MinimalEObjectImpl.Container implements UiChangeTrigger {
	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected UiBindingExpression endpoint;

	/**
	 * The cached value of the '{@link #getEndpointAlias() <em>Endpoint Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointAlias()
	 * @generated
	 * @ordered
	 */
	protected UiBindingEndpointAlias endpointAlias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiChangeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_CHANGE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression getEndpoint() {
		if (endpoint != null && endpoint.eIsProxy()) {
			InternalEObject oldEndpoint = (InternalEObject)endpoint;
			endpoint = (UiBindingExpression)eResolveProxy(oldEndpoint);
			if (endpoint != oldEndpoint) {
				InternalEObject newEndpoint = (InternalEObject)endpoint;
				NotificationChain msgs = oldEndpoint.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT, null, null);
				if (newEndpoint.eInternalContainer() == null) {
					msgs = newEndpoint.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT, oldEndpoint, endpoint));
			}
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression basicGetEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(UiBindingExpression newEndpoint, NotificationChain msgs) {
		UiBindingExpression oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT, oldEndpoint, newEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(UiBindingExpression newEndpoint) {
		if (newEndpoint != endpoint) {
			NotificationChain msgs = null;
			if (endpoint != null)
				msgs = ((InternalEObject)endpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT, null, msgs);
			if (newEndpoint != null)
				msgs = ((InternalEObject)newEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT, null, msgs);
			msgs = basicSetEndpoint(newEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT, newEndpoint, newEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias getEndpointAlias() {
		if (endpointAlias != null && endpointAlias.eIsProxy()) {
			InternalEObject oldEndpointAlias = (InternalEObject)endpointAlias;
			endpointAlias = (UiBindingEndpointAlias)eResolveProxy(oldEndpointAlias);
			if (endpointAlias != oldEndpointAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT_ALIAS, oldEndpointAlias, endpointAlias));
			}
		}
		return endpointAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias basicGetEndpointAlias() {
		return endpointAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointAlias(UiBindingEndpointAlias newEndpointAlias) {
		UiBindingEndpointAlias oldEndpointAlias = endpointAlias;
		endpointAlias = newEndpointAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT_ALIAS, oldEndpointAlias, endpointAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT:
				return basicSetEndpoint(null, msgs);
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
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT:
				if (resolve) return getEndpoint();
				return basicGetEndpoint();
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT_ALIAS:
				if (resolve) return getEndpointAlias();
				return basicGetEndpointAlias();
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
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT:
				setEndpoint((UiBindingExpression)newValue);
				return;
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT_ALIAS:
				setEndpointAlias((UiBindingEndpointAlias)newValue);
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
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT:
				setEndpoint((UiBindingExpression)null);
				return;
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT_ALIAS:
				setEndpointAlias((UiBindingEndpointAlias)null);
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
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT:
				return endpoint != null;
			case UiModelPackage.UI_CHANGE_TRIGGER__ENDPOINT_ALIAS:
				return endpointAlias != null;
		}
		return super.eIsSet(featureID);
	}

} //UiChangeTriggerImpl
