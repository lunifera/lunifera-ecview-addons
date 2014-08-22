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
import org.lunifera.ecview.semantic.uimodel.UiDecimalField;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Decimal Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiDecimalFieldImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiDecimalFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiDecimalFieldImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiDecimalFieldImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiDecimalFieldImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiDecimalFieldImpl#isGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiDecimalFieldImpl#isMarkNegative <em>Mark Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiDecimalFieldImpl extends UiVisibilityProcessableImpl implements UiDecimalField {
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
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<UiValidator> validators;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouping()
	 * @generated
	 * @ordered
	 */
	protected boolean grouping = GROUPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMarkNegative() <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARK_NEGATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarkNegative() <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean markNegative = MARK_NEGATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiDecimalFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_DECIMAL_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_DECIMAL_FIELD__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_DECIMAL_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList.Resolving<UiBinding>(UiBinding.class, this, UiModelPackage.UI_DECIMAL_FIELD__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList.Resolving<UiValidator>(UiValidator.class, this, UiModelPackage.UI_DECIMAL_FIELD__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_DECIMAL_FIELD__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(boolean newGrouping) {
		boolean oldGrouping = grouping;
		grouping = newGrouping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_DECIMAL_FIELD__GROUPING, oldGrouping, grouping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarkNegative() {
		return markNegative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkNegative(boolean newMarkNegative) {
		boolean oldMarkNegative = markNegative;
		markNegative = newMarkNegative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_DECIMAL_FIELD__MARK_NEGATIVE, oldMarkNegative, markNegative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_DECIMAL_FIELD__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_DECIMAL_FIELD__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
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
			case UiModelPackage.UI_DECIMAL_FIELD__ID:
				return getId();
			case UiModelPackage.UI_DECIMAL_FIELD__NAME:
				return getName();
			case UiModelPackage.UI_DECIMAL_FIELD__BINDINGS:
				return getBindings();
			case UiModelPackage.UI_DECIMAL_FIELD__VALIDATORS:
				return getValidators();
			case UiModelPackage.UI_DECIMAL_FIELD__PRECISION:
				return getPrecision();
			case UiModelPackage.UI_DECIMAL_FIELD__GROUPING:
				return isGrouping();
			case UiModelPackage.UI_DECIMAL_FIELD__MARK_NEGATIVE:
				return isMarkNegative();
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
			case UiModelPackage.UI_DECIMAL_FIELD__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends UiValidator>)newValue);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__GROUPING:
				setGrouping((Boolean)newValue);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__MARK_NEGATIVE:
				setMarkNegative((Boolean)newValue);
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
			case UiModelPackage.UI_DECIMAL_FIELD__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__BINDINGS:
				getBindings().clear();
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__VALIDATORS:
				getValidators().clear();
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__GROUPING:
				setGrouping(GROUPING_EDEFAULT);
				return;
			case UiModelPackage.UI_DECIMAL_FIELD__MARK_NEGATIVE:
				setMarkNegative(MARK_NEGATIVE_EDEFAULT);
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
			case UiModelPackage.UI_DECIMAL_FIELD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_DECIMAL_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_DECIMAL_FIELD__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case UiModelPackage.UI_DECIMAL_FIELD__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case UiModelPackage.UI_DECIMAL_FIELD__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case UiModelPackage.UI_DECIMAL_FIELD__GROUPING:
				return grouping != GROUPING_EDEFAULT;
			case UiModelPackage.UI_DECIMAL_FIELD__MARK_NEGATIVE:
				return markNegative != MARK_NEGATIVE_EDEFAULT;
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
				case UiModelPackage.UI_DECIMAL_FIELD__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_DECIMAL_FIELD__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
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
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_DECIMAL_FIELD__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_DECIMAL_FIELD__NAME;
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
		result.append(", precision: ");
		result.append(precision);
		result.append(", grouping: ");
		result.append(grouping);
		result.append(", markNegative: ");
		result.append(markNegative);
		result.append(')');
		return result.toString();
	}

} //UiDecimalFieldImpl
