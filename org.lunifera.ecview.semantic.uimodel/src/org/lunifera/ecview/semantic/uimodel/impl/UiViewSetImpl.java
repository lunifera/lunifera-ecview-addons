/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewSetImpl;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui View Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiViewSetImpl extends YViewSetImpl implements UiViewSet {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiViewSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelPackage.Literals.UI_VIEW_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBindingEndpointAlias> getBindingEndpointAlias() {
		if (bindingEndpointAlias == null) {
			bindingEndpointAlias = new EObjectContainmentEList<UiBindingEndpointAlias>(UiBindingEndpointAlias.class, this, UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS);
		}
		return bindingEndpointAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS:
				return ((InternalEList<?>)getBindingEndpointAlias()).basicRemove(otherEnd, msgs);
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
			case UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS:
				return getBindingEndpointAlias();
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
			case UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS:
				getBindingEndpointAlias().clear();
				getBindingEndpointAlias().addAll((Collection<? extends UiBindingEndpointAlias>)newValue);
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
			case UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS:
				getBindingEndpointAlias().clear();
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
			case UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS:
				return bindingEndpointAlias != null && !bindingEndpointAlias.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UiViewSetImpl
