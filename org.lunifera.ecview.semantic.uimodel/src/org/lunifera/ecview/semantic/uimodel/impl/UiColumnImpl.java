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

import org.eclipse.xtext.common.types.JvmField;

import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#getJvmField <em>Jvm Field</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#isOrderable <em>Orderable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#isCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiColumnImpl#getExpandRatio <em>Expand Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiColumnImpl extends UiVisibilityProcessableImpl implements UiColumn {
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
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<UiValidator> validators;

	/**
	 * The cached value of the '{@link #getJvmField() <em>Jvm Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmField()
	 * @generated
	 * @ordered
	 */
	protected JvmField jvmField;

	/**
	 * The default value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected String iconName = ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrderable() <em>Orderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOrderable() <em>Orderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderable()
	 * @generated
	 * @ordered
	 */
	protected boolean orderable = ORDERABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected boolean collapsed = COLLAPSED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCollapsible() <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsible()
	 * @generated
	 * @ordered
	 */
	protected boolean collapsible = COLLAPSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final UiFlatAlignment ALIGNMENT_EDEFAULT = UiFlatAlignment.LEFT;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected UiFlatAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpandRatio() <em>Expand Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float EXPAND_RATIO_EDEFAULT = -1.0F;

	/**
	 * The cached value of the '{@link #getExpandRatio() <em>Expand Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandRatio()
	 * @generated
	 * @ordered
	 */
	protected float expandRatio = EXPAND_RATIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList.Resolving<UiValidator>(UiValidator.class, this, UiModelPackage.UI_COLUMN__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField getJvmField() {
		if (jvmField != null && jvmField.eIsProxy()) {
			InternalEObject oldJvmField = (InternalEObject)jvmField;
			jvmField = (JvmField)eResolveProxy(oldJvmField);
			if (jvmField != oldJvmField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_COLUMN__JVM_FIELD, oldJvmField, jvmField));
			}
		}
		return jvmField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField basicGetJvmField() {
		return jvmField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJvmField(JvmField newJvmField) {
		JvmField oldJvmField = jvmField;
		jvmField = newJvmField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__JVM_FIELD, oldJvmField, jvmField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconName() {
		return iconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconName(String newIconName) {
		String oldIconName = iconName;
		iconName = newIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__ICON_NAME, oldIconName, iconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrderable() {
		return orderable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderable(boolean newOrderable) {
		boolean oldOrderable = orderable;
		orderable = newOrderable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__ORDERABLE, oldOrderable, orderable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsed() {
		return collapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsed(boolean newCollapsed) {
		boolean oldCollapsed = collapsed;
		collapsed = newCollapsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__COLLAPSED, oldCollapsed, collapsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsible() {
		return collapsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsible(boolean newCollapsible) {
		boolean oldCollapsible = collapsible;
		collapsible = newCollapsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__COLLAPSIBLE, oldCollapsible, collapsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFlatAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(UiFlatAlignment newAlignment) {
		UiFlatAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getExpandRatio() {
		return expandRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandRatio(float newExpandRatio) {
		float oldExpandRatio = expandRatio;
		expandRatio = newExpandRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COLUMN__EXPAND_RATIO, oldExpandRatio, expandRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_COLUMN__VALIDATORS:
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
			case UiModelPackage.UI_COLUMN__ID:
				return getId();
			case UiModelPackage.UI_COLUMN__NAME:
				return getName();
			case UiModelPackage.UI_COLUMN__VALIDATORS:
				return getValidators();
			case UiModelPackage.UI_COLUMN__JVM_FIELD:
				if (resolve) return getJvmField();
				return basicGetJvmField();
			case UiModelPackage.UI_COLUMN__ICON_NAME:
				return getIconName();
			case UiModelPackage.UI_COLUMN__VISIBLE:
				return isVisible();
			case UiModelPackage.UI_COLUMN__ORDERABLE:
				return isOrderable();
			case UiModelPackage.UI_COLUMN__COLLAPSED:
				return isCollapsed();
			case UiModelPackage.UI_COLUMN__COLLAPSIBLE:
				return isCollapsible();
			case UiModelPackage.UI_COLUMN__ALIGNMENT:
				return getAlignment();
			case UiModelPackage.UI_COLUMN__EXPAND_RATIO:
				return getExpandRatio();
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
			case UiModelPackage.UI_COLUMN__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_COLUMN__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_COLUMN__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends UiValidator>)newValue);
				return;
			case UiModelPackage.UI_COLUMN__JVM_FIELD:
				setJvmField((JvmField)newValue);
				return;
			case UiModelPackage.UI_COLUMN__ICON_NAME:
				setIconName((String)newValue);
				return;
			case UiModelPackage.UI_COLUMN__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case UiModelPackage.UI_COLUMN__ORDERABLE:
				setOrderable((Boolean)newValue);
				return;
			case UiModelPackage.UI_COLUMN__COLLAPSED:
				setCollapsed((Boolean)newValue);
				return;
			case UiModelPackage.UI_COLUMN__COLLAPSIBLE:
				setCollapsible((Boolean)newValue);
				return;
			case UiModelPackage.UI_COLUMN__ALIGNMENT:
				setAlignment((UiFlatAlignment)newValue);
				return;
			case UiModelPackage.UI_COLUMN__EXPAND_RATIO:
				setExpandRatio((Float)newValue);
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
			case UiModelPackage.UI_COLUMN__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__VALIDATORS:
				getValidators().clear();
				return;
			case UiModelPackage.UI_COLUMN__JVM_FIELD:
				setJvmField((JvmField)null);
				return;
			case UiModelPackage.UI_COLUMN__ICON_NAME:
				setIconName(ICON_NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__ORDERABLE:
				setOrderable(ORDERABLE_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__COLLAPSIBLE:
				setCollapsible(COLLAPSIBLE_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case UiModelPackage.UI_COLUMN__EXPAND_RATIO:
				setExpandRatio(EXPAND_RATIO_EDEFAULT);
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
			case UiModelPackage.UI_COLUMN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_COLUMN__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case UiModelPackage.UI_COLUMN__JVM_FIELD:
				return jvmField != null;
			case UiModelPackage.UI_COLUMN__ICON_NAME:
				return ICON_NAME_EDEFAULT == null ? iconName != null : !ICON_NAME_EDEFAULT.equals(iconName);
			case UiModelPackage.UI_COLUMN__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case UiModelPackage.UI_COLUMN__ORDERABLE:
				return orderable != ORDERABLE_EDEFAULT;
			case UiModelPackage.UI_COLUMN__COLLAPSED:
				return collapsed != COLLAPSED_EDEFAULT;
			case UiModelPackage.UI_COLUMN__COLLAPSIBLE:
				return collapsible != COLLAPSIBLE_EDEFAULT;
			case UiModelPackage.UI_COLUMN__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case UiModelPackage.UI_COLUMN__EXPAND_RATIO:
				return expandRatio != EXPAND_RATIO_EDEFAULT;
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
				case UiModelPackage.UI_COLUMN__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_COLUMN__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
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
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_COLUMN__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_COLUMN__NAME;
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
		result.append(", iconName: ");
		result.append(iconName);
		result.append(", visible: ");
		result.append(visible);
		result.append(", orderable: ");
		result.append(orderable);
		result.append(", collapsed: ");
		result.append(collapsed);
		result.append(", collapsible: ");
		result.append(collapsible);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", expandRatio: ");
		result.append(expandRatio);
		result.append(')');
		return result.toString();
	}

} //UiColumnImpl
