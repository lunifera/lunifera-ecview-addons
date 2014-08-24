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
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiComboBoxImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiComboBoxImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiComboBoxImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiComboBoxImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiComboBoxImpl#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiComboBoxImpl#getItemCaptionProperty <em>Item Caption Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiComboBoxImpl#getItemImageProperty <em>Item Image Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiComboBoxImpl extends UiVisibilityProcessableImpl implements UiComboBox {
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
	 * The cached value of the '{@link #getJvmType() <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference jvmType;

	/**
	 * The cached value of the '{@link #getItemCaptionProperty() <em>Item Caption Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCaptionProperty()
	 * @generated
	 * @ordered
	 */
	protected JvmField itemCaptionProperty;

	/**
	 * The cached value of the '{@link #getItemImageProperty() <em>Item Image Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemImageProperty()
	 * @generated
	 * @ordered
	 */
	protected JvmField itemImageProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiComboBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_COMBO_BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COMBO_BOX__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COMBO_BOX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList.Resolving<UiBinding>(UiBinding.class, this, UiModelPackage.UI_COMBO_BOX__BINDINGS);
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
			validators = new EObjectContainmentEList.Resolving<UiValidator>(UiValidator.class, this, UiModelPackage.UI_COMBO_BOX__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getJvmType() {
		if (jvmType != null && jvmType.eIsProxy()) {
			InternalEObject oldJvmType = (InternalEObject)jvmType;
			jvmType = (JvmTypeReference)eResolveProxy(oldJvmType);
			if (jvmType != oldJvmType) {
				InternalEObject newJvmType = (InternalEObject)jvmType;
				NotificationChain msgs = oldJvmType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_COMBO_BOX__JVM_TYPE, null, null);
				if (newJvmType.eInternalContainer() == null) {
					msgs = newJvmType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_COMBO_BOX__JVM_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_COMBO_BOX__JVM_TYPE, oldJvmType, jvmType));
			}
		}
		return jvmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference basicGetJvmType() {
		return jvmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJvmType(JvmTypeReference newJvmType, NotificationChain msgs) {
		JvmTypeReference oldJvmType = jvmType;
		jvmType = newJvmType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COMBO_BOX__JVM_TYPE, oldJvmType, newJvmType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJvmType(JvmTypeReference newJvmType) {
		if (newJvmType != jvmType) {
			NotificationChain msgs = null;
			if (jvmType != null)
				msgs = ((InternalEObject)jvmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_COMBO_BOX__JVM_TYPE, null, msgs);
			if (newJvmType != null)
				msgs = ((InternalEObject)newJvmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_COMBO_BOX__JVM_TYPE, null, msgs);
			msgs = basicSetJvmType(newJvmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COMBO_BOX__JVM_TYPE, newJvmType, newJvmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField getItemCaptionProperty() {
		if (itemCaptionProperty != null && itemCaptionProperty.eIsProxy()) {
			InternalEObject oldItemCaptionProperty = (InternalEObject)itemCaptionProperty;
			itemCaptionProperty = (JvmField)eResolveProxy(oldItemCaptionProperty);
			if (itemCaptionProperty != oldItemCaptionProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY, oldItemCaptionProperty, itemCaptionProperty));
			}
		}
		return itemCaptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField basicGetItemCaptionProperty() {
		return itemCaptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemCaptionProperty(JvmField newItemCaptionProperty) {
		JvmField oldItemCaptionProperty = itemCaptionProperty;
		itemCaptionProperty = newItemCaptionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY, oldItemCaptionProperty, itemCaptionProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField getItemImageProperty() {
		if (itemImageProperty != null && itemImageProperty.eIsProxy()) {
			InternalEObject oldItemImageProperty = (InternalEObject)itemImageProperty;
			itemImageProperty = (JvmField)eResolveProxy(oldItemImageProperty);
			if (itemImageProperty != oldItemImageProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_COMBO_BOX__ITEM_IMAGE_PROPERTY, oldItemImageProperty, itemImageProperty));
			}
		}
		return itemImageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField basicGetItemImageProperty() {
		return itemImageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemImageProperty(JvmField newItemImageProperty) {
		JvmField oldItemImageProperty = itemImageProperty;
		itemImageProperty = newItemImageProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_COMBO_BOX__ITEM_IMAGE_PROPERTY, oldItemImageProperty, itemImageProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_COMBO_BOX__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_COMBO_BOX__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_COMBO_BOX__JVM_TYPE:
				return basicSetJvmType(null, msgs);
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
			case UiModelPackage.UI_COMBO_BOX__ID:
				return getId();
			case UiModelPackage.UI_COMBO_BOX__NAME:
				return getName();
			case UiModelPackage.UI_COMBO_BOX__BINDINGS:
				return getBindings();
			case UiModelPackage.UI_COMBO_BOX__VALIDATORS:
				return getValidators();
			case UiModelPackage.UI_COMBO_BOX__JVM_TYPE:
				if (resolve) return getJvmType();
				return basicGetJvmType();
			case UiModelPackage.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY:
				if (resolve) return getItemCaptionProperty();
				return basicGetItemCaptionProperty();
			case UiModelPackage.UI_COMBO_BOX__ITEM_IMAGE_PROPERTY:
				if (resolve) return getItemImageProperty();
				return basicGetItemImageProperty();
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
			case UiModelPackage.UI_COMBO_BOX__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_COMBO_BOX__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_COMBO_BOX__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
				return;
			case UiModelPackage.UI_COMBO_BOX__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends UiValidator>)newValue);
				return;
			case UiModelPackage.UI_COMBO_BOX__JVM_TYPE:
				setJvmType((JvmTypeReference)newValue);
				return;
			case UiModelPackage.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY:
				setItemCaptionProperty((JvmField)newValue);
				return;
			case UiModelPackage.UI_COMBO_BOX__ITEM_IMAGE_PROPERTY:
				setItemImageProperty((JvmField)newValue);
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
			case UiModelPackage.UI_COMBO_BOX__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_COMBO_BOX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_COMBO_BOX__BINDINGS:
				getBindings().clear();
				return;
			case UiModelPackage.UI_COMBO_BOX__VALIDATORS:
				getValidators().clear();
				return;
			case UiModelPackage.UI_COMBO_BOX__JVM_TYPE:
				setJvmType((JvmTypeReference)null);
				return;
			case UiModelPackage.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY:
				setItemCaptionProperty((JvmField)null);
				return;
			case UiModelPackage.UI_COMBO_BOX__ITEM_IMAGE_PROPERTY:
				setItemImageProperty((JvmField)null);
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
			case UiModelPackage.UI_COMBO_BOX__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_COMBO_BOX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_COMBO_BOX__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case UiModelPackage.UI_COMBO_BOX__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case UiModelPackage.UI_COMBO_BOX__JVM_TYPE:
				return jvmType != null;
			case UiModelPackage.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY:
				return itemCaptionProperty != null;
			case UiModelPackage.UI_COMBO_BOX__ITEM_IMAGE_PROPERTY:
				return itemImageProperty != null;
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
				case UiModelPackage.UI_COMBO_BOX__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_COMBO_BOX__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_COMBO_BOX__JVM_TYPE: return UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE;
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
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_COMBO_BOX__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_COMBO_BOX__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE: return UiModelPackage.UI_COMBO_BOX__JVM_TYPE;
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

} //UiComboBoxImpl
