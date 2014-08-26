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
import org.lunifera.ecview.semantic.uimodel.UiBinding;
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
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#isFillHorizontal <em>Fill Horizontal</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiGridLayoutImpl#isFillVertical <em>Fill Vertical</em>}</li>
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
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<UiBinding> bindings;
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
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;
	/**
	 * The default value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_HORIZONTAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean fillHorizontal = FILL_HORIZONTAL_EDEFAULT;
	/**
	 * The default value of the '{@link #isFillVertical() <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_VERTICAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFillVertical() <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean fillVertical = FILL_VERTICAL_EDEFAULT;

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
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList.Resolving<UiBinding>(UiBinding.class, this, UiModelPackage.UI_GRID_LAYOUT__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiGridLayoutAssigment> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList.Resolving<UiGridLayoutAssigment>(UiGridLayoutAssigment.class, this, UiModelPackage.UI_GRID_LAYOUT__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillHorizontal() {
		return fillHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillHorizontal(boolean newFillHorizontal) {
		boolean oldFillHorizontal = fillHorizontal;
		fillHorizontal = newFillHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT__FILL_HORIZONTAL, oldFillHorizontal, fillHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillVertical() {
		return fillVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillVertical(boolean newFillVertical) {
		boolean oldFillVertical = fillVertical;
		fillVertical = newFillVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_GRID_LAYOUT__FILL_VERTICAL, oldFillVertical, fillVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_GRID_LAYOUT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case UiModelPackage.UI_GRID_LAYOUT__BINDINGS:
				return getBindings();
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				return getContents();
			case UiModelPackage.UI_GRID_LAYOUT__COLUMNS:
				return getColumns();
			case UiModelPackage.UI_GRID_LAYOUT__FILL_HORIZONTAL:
				return isFillHorizontal();
			case UiModelPackage.UI_GRID_LAYOUT__FILL_VERTICAL:
				return isFillVertical();
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
			case UiModelPackage.UI_GRID_LAYOUT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends UiGridLayoutAssigment>)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__FILL_HORIZONTAL:
				setFillHorizontal((Boolean)newValue);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__FILL_VERTICAL:
				setFillVertical((Boolean)newValue);
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
			case UiModelPackage.UI_GRID_LAYOUT__BINDINGS:
				getBindings().clear();
				return;
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				getContents().clear();
				return;
			case UiModelPackage.UI_GRID_LAYOUT__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__FILL_HORIZONTAL:
				setFillHorizontal(FILL_HORIZONTAL_EDEFAULT);
				return;
			case UiModelPackage.UI_GRID_LAYOUT__FILL_VERTICAL:
				setFillVertical(FILL_VERTICAL_EDEFAULT);
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
			case UiModelPackage.UI_GRID_LAYOUT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case UiModelPackage.UI_GRID_LAYOUT__CONTENTS:
				return contents != null && !contents.isEmpty();
			case UiModelPackage.UI_GRID_LAYOUT__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case UiModelPackage.UI_GRID_LAYOUT__FILL_HORIZONTAL:
				return fillHorizontal != FILL_HORIZONTAL_EDEFAULT;
			case UiModelPackage.UI_GRID_LAYOUT__FILL_VERTICAL:
				return fillVertical != FILL_VERTICAL_EDEFAULT;
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
		result.append(", columns: ");
		result.append(columns);
		result.append(", fillHorizontal: ");
		result.append(fillHorizontal);
		result.append(", fillVertical: ");
		result.append(fillVertical);
		result.append(')');
		return result.toString();
	}

} //UiGridLayoutImpl
