/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRuledVisibilityProcessorImpl;

import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;

import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Visibility Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getBindingAlias <em>Binding Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorImpl#getChangeTrigger <em>Change Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiVisibilityProcessorImpl extends YRuledVisibilityProcessorImpl implements UiVisibilityProcessor {
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
	public EList<UiRootElements> getRoots() {
		if (roots == null) {
			roots = new EObjectContainmentEList.Resolving<UiRootElements>(UiRootElements.class, this, UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS);
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
			bindingAlias = new EObjectContainmentEList.Resolving<UiBindingEndpointAlias>(UiBindingEndpointAlias.class, this, UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS);
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
			changeTrigger = new EObjectContainmentEList.Resolving<UiChangeTrigger>(UiChangeTrigger.class, this, UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER);
		}
		return changeTrigger;
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				return getRoots();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return getBindingAlias();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return getChangeTrigger();
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				getRoots().clear();
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				getBindingAlias().clear();
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				getChangeTrigger().clear();
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__ROOTS:
				return roots != null && !roots.isEmpty();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__BINDING_ALIAS:
				return bindingAlias != null && !bindingAlias.isEmpty();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER:
				return changeTrigger != null && !changeTrigger.isEmpty();
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

} //UiVisibilityProcessorImpl
