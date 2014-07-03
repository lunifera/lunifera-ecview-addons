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

import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;

import org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl;

import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui IDE View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiIDEViewImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiIDEViewImpl extends YViewImpl implements UiIDEView {
	/**
	 * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayouts()
	 * @generated
	 * @ordered
	 */
	protected EList<YLayout> layouts;

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
	protected UiIDEViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelPackage.Literals.UI_IDE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YLayout> getLayouts() {
		if (layouts == null) {
			layouts = new EObjectContainmentEList<YLayout>(YLayout.class, this, UimodelPackage.UI_IDE_VIEW__LAYOUTS);
		}
		return layouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<UiBinding>(UiBinding.class, this, UimodelPackage.UI_IDE_VIEW__BINDINGS);
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
			case UimodelPackage.UI_IDE_VIEW__LAYOUTS:
				return ((InternalEList<?>)getLayouts()).basicRemove(otherEnd, msgs);
			case UimodelPackage.UI_IDE_VIEW__BINDINGS:
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
			case UimodelPackage.UI_IDE_VIEW__LAYOUTS:
				return getLayouts();
			case UimodelPackage.UI_IDE_VIEW__BINDINGS:
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
			case UimodelPackage.UI_IDE_VIEW__LAYOUTS:
				getLayouts().clear();
				getLayouts().addAll((Collection<? extends YLayout>)newValue);
				return;
			case UimodelPackage.UI_IDE_VIEW__BINDINGS:
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
			case UimodelPackage.UI_IDE_VIEW__LAYOUTS:
				getLayouts().clear();
				return;
			case UimodelPackage.UI_IDE_VIEW__BINDINGS:
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
			case UimodelPackage.UI_IDE_VIEW__LAYOUTS:
				return layouts != null && !layouts.isEmpty();
			case UimodelPackage.UI_IDE_VIEW__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UiIDEViewImpl
