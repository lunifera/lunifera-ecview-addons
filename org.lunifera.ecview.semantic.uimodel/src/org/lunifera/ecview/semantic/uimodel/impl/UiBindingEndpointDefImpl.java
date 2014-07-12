/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiBindable;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Binding Endpoint Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointDefImpl#getBindable <em>Bindable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointDefImpl#getSemanticEndpoint <em>Semantic Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingEndpointDefImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiBindingEndpointDefImpl extends MinimalEObjectImpl.Container implements UiBindingEndpointDef {
	/**
	 * The cached value of the '{@link #getBindable() <em>Bindable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindable()
	 * @generated
	 * @ordered
	 */
	protected UiBindable bindable;

	/**
	 * The cached value of the '{@link #getSemanticEndpoint() <em>Semantic Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticEndpoint()
	 * @generated
	 * @ordered
	 */
	protected UxEndpointDef semanticEndpoint;

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
	protected UiBindingEndpointDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelPackage.Literals.UI_BINDING_ENDPOINT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindable getBindable() {
		if (bindable != null && bindable.eIsProxy()) {
			InternalEObject oldBindable = (InternalEObject)bindable;
			bindable = (UiBindable)eResolveProxy(oldBindable);
			if (bindable != oldBindable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelPackage.UI_BINDING_ENDPOINT_DEF__BINDABLE, oldBindable, bindable));
			}
		}
		return bindable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindable basicGetBindable() {
		return bindable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindable(UiBindable newBindable) {
		UiBindable oldBindable = bindable;
		bindable = newBindable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING_ENDPOINT_DEF__BINDABLE, oldBindable, bindable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxEndpointDef getSemanticEndpoint() {
		if (semanticEndpoint != null && semanticEndpoint.eIsProxy()) {
			InternalEObject oldSemanticEndpoint = (InternalEObject)semanticEndpoint;
			semanticEndpoint = (UxEndpointDef)eResolveProxy(oldSemanticEndpoint);
			if (semanticEndpoint != oldSemanticEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelPackage.UI_BINDING_ENDPOINT_DEF__SEMANTIC_ENDPOINT, oldSemanticEndpoint, semanticEndpoint));
			}
		}
		return semanticEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxEndpointDef basicGetSemanticEndpoint() {
		return semanticEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticEndpoint(UxEndpointDef newSemanticEndpoint) {
		UxEndpointDef oldSemanticEndpoint = semanticEndpoint;
		semanticEndpoint = newSemanticEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING_ENDPOINT_DEF__SEMANTIC_ENDPOINT, oldSemanticEndpoint, semanticEndpoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH, oldPath, newPath);
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
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH:
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
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__BINDABLE:
				if (resolve) return getBindable();
				return basicGetBindable();
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__SEMANTIC_ENDPOINT:
				if (resolve) return getSemanticEndpoint();
				return basicGetSemanticEndpoint();
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH:
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
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__BINDABLE:
				setBindable((UiBindable)newValue);
				return;
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__SEMANTIC_ENDPOINT:
				setSemanticEndpoint((UxEndpointDef)newValue);
				return;
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH:
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
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__BINDABLE:
				setBindable((UiBindable)null);
				return;
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__SEMANTIC_ENDPOINT:
				setSemanticEndpoint((UxEndpointDef)null);
				return;
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH:
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
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__BINDABLE:
				return bindable != null;
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__SEMANTIC_ENDPOINT:
				return semanticEndpoint != null;
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF__PATH:
				return path != null;
		}
		return super.eIsSet(featureID);
	}

} //UiBindingEndpointDefImpl
