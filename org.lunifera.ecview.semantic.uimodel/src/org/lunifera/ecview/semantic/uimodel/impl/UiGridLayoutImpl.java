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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiGridLayoutImpl extends UiVisibilityProcessableImpl implements UiGridLayout {
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
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<UiGridLayoutAssigment> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiGridLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_GRID_LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiGridLayoutAssigment> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<UiGridLayoutAssigment>(UiGridLayoutAssigment.class, this, UiModelPackage.UI_GRID_LAYOUT__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case UiModelPackage.UI_GRID_LAYOUT__ID:
				return getId();
			case UiModelPackage.UI_GRID_LAYOUT__NAME:
				return getName();
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				return getContents();
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
			case UiModelPackage.UI_GRID_LAYOUT__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends UiGridLayoutAssigment>)newValue);
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
			case UiModelPackage.UI_GRID_LAYOUT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				getContents().clear();
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
			case UiModelPackage.UI_GRID_LAYOUT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_GRID_LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				return contents != null && !contents.isEmpty();
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
		if (baseClass == UiNamedElement.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_GRID_LAYOUT__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_GRID_LAYOUT__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
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
		if (baseClass == UiNamedElement.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_GRID_LAYOUT__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_GRID_LAYOUT__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
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

} //UiGridLayoutImpl
