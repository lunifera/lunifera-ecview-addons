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
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui View Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewSetImpl#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiViewSetImpl extends YViewSetImpl implements UiViewSet {
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
	public EList<UiRootElements> getRoots() {
		if (roots == null) {
			roots = new EObjectContainmentEList.Resolving<UiRootElements>(UiRootElements.class, this, UimodelPackage.UI_VIEW_SET__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBindingEndpointAlias> getBindingEndpointAlias() {
		if (bindingEndpointAlias == null) {
			bindingEndpointAlias = new EObjectContainmentEList.Resolving<UiBindingEndpointAlias>(UiBindingEndpointAlias.class, this, UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS);
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
			case UimodelPackage.UI_VIEW_SET__ROOTS:
				return ((InternalEList<?>)getRoots()).basicRemove(otherEnd, msgs);
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
			case UimodelPackage.UI_VIEW_SET__ROOTS:
				return getRoots();
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
			case UimodelPackage.UI_VIEW_SET__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends UiRootElements>)newValue);
				return;
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
			case UimodelPackage.UI_VIEW_SET__ROOTS:
				getRoots().clear();
				return;
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
			case UimodelPackage.UI_VIEW_SET__ROOTS:
				return roots != null && !roots.isEmpty();
			case UimodelPackage.UI_VIEW_SET__BINDING_ENDPOINT_ALIAS:
				return bindingEndpointAlias != null && !bindingEndpointAlias.isEmpty();
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
				case UimodelPackage.UI_VIEW_SET__ROOTS: return UimodelPackage.UI_MODEL__ROOTS;
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
				case UimodelPackage.UI_MODEL__ROOTS: return UimodelPackage.UI_VIEW_SET__ROOTS;
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

} //UiViewSetImpl
