/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;

import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiSourceBindingEndpoint;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

import org.lunifera.ecview.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Source Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSourceBindingEndpointImpl#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSourceBindingEndpointImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSourceBindingEndpointImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiSourceBindingEndpointImpl extends MinimalEObjectImpl.Container implements UiSourceBindingEndpoint {
	/**
	 * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddable()
	 * @generated
	 * @ordered
	 */
	protected YBindable embeddable;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected UxEndpointDef endpoint;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected UiPathSegment path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiSourceBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelPackage.Literals.UI_SOURCE_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindable getEmbeddable() {
		if (embeddable != null && embeddable.eIsProxy()) {
			InternalEObject oldEmbeddable = (InternalEObject)embeddable;
			embeddable = (YBindable)eResolveProxy(oldEmbeddable);
			if (embeddable != oldEmbeddable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE, oldEmbeddable, embeddable));
			}
		}
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindable basicGetEmbeddable() {
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddable(YBindable newEmbeddable) {
		YBindable oldEmbeddable = embeddable;
		embeddable = newEmbeddable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE, oldEmbeddable, embeddable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxEndpointDef getEndpoint() {
		if (endpoint != null && endpoint.eIsProxy()) {
			InternalEObject oldEndpoint = (InternalEObject)endpoint;
			endpoint = (UxEndpointDef)eResolveProxy(oldEndpoint);
			if (endpoint != oldEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT, oldEndpoint, endpoint));
			}
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxEndpointDef basicGetEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(UxEndpointDef newEndpoint) {
		UxEndpointDef oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(UiPathSegment newPath, NotificationChain msgs) {
		UiPathSegment oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(UiPathSegment newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH:
				return basicSetPath(null, msgs);
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
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE:
				if (resolve) return getEmbeddable();
				return basicGetEmbeddable();
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT:
				if (resolve) return getEndpoint();
				return basicGetEndpoint();
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH:
				return getPath();
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
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE:
				setEmbeddable((YBindable)newValue);
				return;
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT:
				setEndpoint((UxEndpointDef)newValue);
				return;
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH:
				setPath((UiPathSegment)newValue);
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
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE:
				setEmbeddable((YBindable)null);
				return;
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT:
				setEndpoint((UxEndpointDef)null);
				return;
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH:
				setPath((UiPathSegment)null);
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
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__EMBEDDABLE:
				return embeddable != null;
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT:
				return endpoint != null;
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT__PATH:
				return path != null;
		}
		return super.eIsSet(featureID);
	}

} //UiSourceBindingEndpointImpl
