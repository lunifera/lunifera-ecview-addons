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
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.ecview.semantic.uimodel.UiBeanServiceConsumer;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfoable;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiSelectionType;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getI18nInfo <em>I1 8n Info</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#isConsumeBeanService <em>Consume Bean Service</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getItemImageProperty <em>Item Image Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getItemCaptionProperty <em>Item Caption Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiListImpl#getDescriptionProperty <em>Description Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiListImpl extends UiVisibilityProcessableImpl implements UiList {
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
	 * The cached value of the '{@link #getI18nInfo() <em>I1 8n Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI18nInfo()
	 * @generated
	 * @ordered
	 */
	protected UiI18nInfo i18nInfo;
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
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected boolean readonly = READONLY_EDEFAULT;
	/**
	 * The default value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVISIBLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInvisible() <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvisible()
	 * @generated
	 * @ordered
	 */
	protected boolean invisible = INVISIBLE_EDEFAULT;
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
	 * The default value of the '{@link #isConsumeBeanService() <em>Consume Bean Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsumeBeanService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSUME_BEAN_SERVICE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isConsumeBeanService() <em>Consume Bean Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsumeBeanService()
	 * @generated
	 * @ordered
	 */
	protected boolean consumeBeanService = CONSUME_BEAN_SERVICE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSelectionType() <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected static final UiSelectionType SELECTION_TYPE_EDEFAULT = UiSelectionType.SINGLE;
	/**
	 * The cached value of the '{@link #getSelectionType() <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected UiSelectionType selectionType = SELECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemImageProperty() <em>Item Image Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemImageProperty()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation itemImageProperty;

	/**
	 * The cached value of the '{@link #getItemCaptionProperty() <em>Item Caption Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCaptionProperty()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation itemCaptionProperty;

	/**
	 * The cached value of the '{@link #getDescriptionProperty() <em>Description Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionProperty()
	 * @generated
	 * @ordered
	 */
	protected UiNestedProperty descriptionProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList.Resolving<UiBinding>(UiBinding.class, this, UiModelPackage.UI_LIST__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return readonly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		boolean oldReadonly = readonly;
		readonly = newReadonly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__READONLY, oldReadonly, readonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvisible() {
		return invisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvisible(boolean newInvisible) {
		boolean oldInvisible = invisible;
		invisible = newInvisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__INVISIBLE, oldInvisible, invisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiI18nInfo getI18nInfo() {
		if (i18nInfo != null && i18nInfo.eIsProxy()) {
			InternalEObject oldI18nInfo = (InternalEObject)i18nInfo;
			i18nInfo = (UiI18nInfo)eResolveProxy(oldI18nInfo);
			if (i18nInfo != oldI18nInfo) {
				InternalEObject newI18nInfo = (InternalEObject)i18nInfo;
				NotificationChain msgs = oldI18nInfo.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__I18N_INFO, null, null);
				if (newI18nInfo.eInternalContainer() == null) {
					msgs = newI18nInfo.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__I18N_INFO, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_LIST__I18N_INFO, oldI18nInfo, i18nInfo));
			}
		}
		return i18nInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiI18nInfo basicGetI18nInfo() {
		return i18nInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetI18nInfo(UiI18nInfo newI18nInfo, NotificationChain msgs) {
		UiI18nInfo oldI18nInfo = i18nInfo;
		i18nInfo = newI18nInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__I18N_INFO, oldI18nInfo, newI18nInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI18nInfo(UiI18nInfo newI18nInfo) {
		if (newI18nInfo != i18nInfo) {
			NotificationChain msgs = null;
			if (i18nInfo != null)
				msgs = ((InternalEObject)i18nInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__I18N_INFO, null, msgs);
			if (newI18nInfo != null)
				msgs = ((InternalEObject)newI18nInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__I18N_INFO, null, msgs);
			msgs = basicSetI18nInfo(newI18nInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__I18N_INFO, newI18nInfo, newI18nInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList.Resolving<UiValidator>(UiValidator.class, this, UiModelPackage.UI_LIST__VALIDATORS);
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
				NotificationChain msgs = oldJvmType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__JVM_TYPE, null, null);
				if (newJvmType.eInternalContainer() == null) {
					msgs = newJvmType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__JVM_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_LIST__JVM_TYPE, oldJvmType, jvmType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__JVM_TYPE, oldJvmType, newJvmType);
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
				msgs = ((InternalEObject)jvmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__JVM_TYPE, null, msgs);
			if (newJvmType != null)
				msgs = ((InternalEObject)newJvmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__JVM_TYPE, null, msgs);
			msgs = basicSetJvmType(newJvmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__JVM_TYPE, newJvmType, newJvmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsumeBeanService() {
		return consumeBeanService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumeBeanService(boolean newConsumeBeanService) {
		boolean oldConsumeBeanService = consumeBeanService;
		consumeBeanService = newConsumeBeanService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__CONSUME_BEAN_SERVICE, oldConsumeBeanService, consumeBeanService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSelectionType getSelectionType() {
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionType(UiSelectionType newSelectionType) {
		UiSelectionType oldSelectionType = selectionType;
		selectionType = newSelectionType == null ? SELECTION_TYPE_EDEFAULT : newSelectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__SELECTION_TYPE, oldSelectionType, selectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getItemImageProperty() {
		if (itemImageProperty != null && itemImageProperty.eIsProxy()) {
			InternalEObject oldItemImageProperty = (InternalEObject)itemImageProperty;
			itemImageProperty = (JvmOperation)eResolveProxy(oldItemImageProperty);
			if (itemImageProperty != oldItemImageProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_LIST__ITEM_IMAGE_PROPERTY, oldItemImageProperty, itemImageProperty));
			}
		}
		return itemImageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetItemImageProperty() {
		return itemImageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemImageProperty(JvmOperation newItemImageProperty) {
		JvmOperation oldItemImageProperty = itemImageProperty;
		itemImageProperty = newItemImageProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__ITEM_IMAGE_PROPERTY, oldItemImageProperty, itemImageProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation getItemCaptionProperty() {
		if (itemCaptionProperty != null && itemCaptionProperty.eIsProxy()) {
			InternalEObject oldItemCaptionProperty = (InternalEObject)itemCaptionProperty;
			itemCaptionProperty = (JvmOperation)eResolveProxy(oldItemCaptionProperty);
			if (itemCaptionProperty != oldItemCaptionProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_LIST__ITEM_CAPTION_PROPERTY, oldItemCaptionProperty, itemCaptionProperty));
			}
		}
		return itemCaptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmOperation basicGetItemCaptionProperty() {
		return itemCaptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemCaptionProperty(JvmOperation newItemCaptionProperty) {
		JvmOperation oldItemCaptionProperty = itemCaptionProperty;
		itemCaptionProperty = newItemCaptionProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__ITEM_CAPTION_PROPERTY, oldItemCaptionProperty, itemCaptionProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNestedProperty getDescriptionProperty() {
		if (descriptionProperty != null && descriptionProperty.eIsProxy()) {
			InternalEObject oldDescriptionProperty = (InternalEObject)descriptionProperty;
			descriptionProperty = (UiNestedProperty)eResolveProxy(oldDescriptionProperty);
			if (descriptionProperty != oldDescriptionProperty) {
				InternalEObject newDescriptionProperty = (InternalEObject)descriptionProperty;
				NotificationChain msgs = oldDescriptionProperty.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY, null, null);
				if (newDescriptionProperty.eInternalContainer() == null) {
					msgs = newDescriptionProperty.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY, oldDescriptionProperty, descriptionProperty));
			}
		}
		return descriptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNestedProperty basicGetDescriptionProperty() {
		return descriptionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionProperty(UiNestedProperty newDescriptionProperty, NotificationChain msgs) {
		UiNestedProperty oldDescriptionProperty = descriptionProperty;
		descriptionProperty = newDescriptionProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY, oldDescriptionProperty, newDescriptionProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionProperty(UiNestedProperty newDescriptionProperty) {
		if (newDescriptionProperty != descriptionProperty) {
			NotificationChain msgs = null;
			if (descriptionProperty != null)
				msgs = ((InternalEObject)descriptionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY, null, msgs);
			if (newDescriptionProperty != null)
				msgs = ((InternalEObject)newDescriptionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY, null, msgs);
			msgs = basicSetDescriptionProperty(newDescriptionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY, newDescriptionProperty, newDescriptionProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_LIST__I18N_INFO:
				return basicSetI18nInfo(null, msgs);
			case UiModelPackage.UI_LIST__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_LIST__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_LIST__JVM_TYPE:
				return basicSetJvmType(null, msgs);
			case UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY:
				return basicSetDescriptionProperty(null, msgs);
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
			case UiModelPackage.UI_LIST__ID:
				return getId();
			case UiModelPackage.UI_LIST__NAME:
				return getName();
			case UiModelPackage.UI_LIST__I18N_INFO:
				if (resolve) return getI18nInfo();
				return basicGetI18nInfo();
			case UiModelPackage.UI_LIST__BINDINGS:
				return getBindings();
			case UiModelPackage.UI_LIST__READONLY:
				return isReadonly();
			case UiModelPackage.UI_LIST__INVISIBLE:
				return isInvisible();
			case UiModelPackage.UI_LIST__VALIDATORS:
				return getValidators();
			case UiModelPackage.UI_LIST__JVM_TYPE:
				if (resolve) return getJvmType();
				return basicGetJvmType();
			case UiModelPackage.UI_LIST__CONSUME_BEAN_SERVICE:
				return isConsumeBeanService();
			case UiModelPackage.UI_LIST__SELECTION_TYPE:
				return getSelectionType();
			case UiModelPackage.UI_LIST__ITEM_IMAGE_PROPERTY:
				if (resolve) return getItemImageProperty();
				return basicGetItemImageProperty();
			case UiModelPackage.UI_LIST__ITEM_CAPTION_PROPERTY:
				if (resolve) return getItemCaptionProperty();
				return basicGetItemCaptionProperty();
			case UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY:
				if (resolve) return getDescriptionProperty();
				return basicGetDescriptionProperty();
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
			case UiModelPackage.UI_LIST__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_LIST__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_LIST__I18N_INFO:
				setI18nInfo((UiI18nInfo)newValue);
				return;
			case UiModelPackage.UI_LIST__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
				return;
			case UiModelPackage.UI_LIST__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case UiModelPackage.UI_LIST__INVISIBLE:
				setInvisible((Boolean)newValue);
				return;
			case UiModelPackage.UI_LIST__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends UiValidator>)newValue);
				return;
			case UiModelPackage.UI_LIST__JVM_TYPE:
				setJvmType((JvmTypeReference)newValue);
				return;
			case UiModelPackage.UI_LIST__CONSUME_BEAN_SERVICE:
				setConsumeBeanService((Boolean)newValue);
				return;
			case UiModelPackage.UI_LIST__SELECTION_TYPE:
				setSelectionType((UiSelectionType)newValue);
				return;
			case UiModelPackage.UI_LIST__ITEM_IMAGE_PROPERTY:
				setItemImageProperty((JvmOperation)newValue);
				return;
			case UiModelPackage.UI_LIST__ITEM_CAPTION_PROPERTY:
				setItemCaptionProperty((JvmOperation)newValue);
				return;
			case UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY:
				setDescriptionProperty((UiNestedProperty)newValue);
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
			case UiModelPackage.UI_LIST__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_LIST__I18N_INFO:
				setI18nInfo((UiI18nInfo)null);
				return;
			case UiModelPackage.UI_LIST__BINDINGS:
				getBindings().clear();
				return;
			case UiModelPackage.UI_LIST__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case UiModelPackage.UI_LIST__INVISIBLE:
				setInvisible(INVISIBLE_EDEFAULT);
				return;
			case UiModelPackage.UI_LIST__VALIDATORS:
				getValidators().clear();
				return;
			case UiModelPackage.UI_LIST__JVM_TYPE:
				setJvmType((JvmTypeReference)null);
				return;
			case UiModelPackage.UI_LIST__CONSUME_BEAN_SERVICE:
				setConsumeBeanService(CONSUME_BEAN_SERVICE_EDEFAULT);
				return;
			case UiModelPackage.UI_LIST__SELECTION_TYPE:
				setSelectionType(SELECTION_TYPE_EDEFAULT);
				return;
			case UiModelPackage.UI_LIST__ITEM_IMAGE_PROPERTY:
				setItemImageProperty((JvmOperation)null);
				return;
			case UiModelPackage.UI_LIST__ITEM_CAPTION_PROPERTY:
				setItemCaptionProperty((JvmOperation)null);
				return;
			case UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY:
				setDescriptionProperty((UiNestedProperty)null);
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
			case UiModelPackage.UI_LIST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_LIST__I18N_INFO:
				return i18nInfo != null;
			case UiModelPackage.UI_LIST__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case UiModelPackage.UI_LIST__READONLY:
				return readonly != READONLY_EDEFAULT;
			case UiModelPackage.UI_LIST__INVISIBLE:
				return invisible != INVISIBLE_EDEFAULT;
			case UiModelPackage.UI_LIST__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case UiModelPackage.UI_LIST__JVM_TYPE:
				return jvmType != null;
			case UiModelPackage.UI_LIST__CONSUME_BEAN_SERVICE:
				return consumeBeanService != CONSUME_BEAN_SERVICE_EDEFAULT;
			case UiModelPackage.UI_LIST__SELECTION_TYPE:
				return selectionType != SELECTION_TYPE_EDEFAULT;
			case UiModelPackage.UI_LIST__ITEM_IMAGE_PROPERTY:
				return itemImageProperty != null;
			case UiModelPackage.UI_LIST__ITEM_CAPTION_PROPERTY:
				return itemCaptionProperty != null;
			case UiModelPackage.UI_LIST__DESCRIPTION_PROPERTY:
				return descriptionProperty != null;
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
				case UiModelPackage.UI_LIST__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_LIST__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiI18nInfoable.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_LIST__I18N_INFO: return UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO;
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_LIST__JVM_TYPE: return UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE;
				default: return -1;
			}
		}
		if (baseClass == UiBeanServiceConsumer.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_LIST__CONSUME_BEAN_SERVICE: return UiModelPackage.UI_BEAN_SERVICE_CONSUMER__CONSUME_BEAN_SERVICE;
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
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_LIST__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_LIST__NAME;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiI18nInfoable.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO: return UiModelPackage.UI_LIST__I18N_INFO;
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE: return UiModelPackage.UI_LIST__JVM_TYPE;
				default: return -1;
			}
		}
		if (baseClass == UiBeanServiceConsumer.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_BEAN_SERVICE_CONSUMER__CONSUME_BEAN_SERVICE: return UiModelPackage.UI_LIST__CONSUME_BEAN_SERVICE;
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
		result.append(", readonly: ");
		result.append(readonly);
		result.append(", invisible: ");
		result.append(invisible);
		result.append(", consumeBeanService: ");
		result.append(consumeBeanService);
		result.append(", selectionType: ");
		result.append(selectionType);
		result.append(')');
		return result.toString();
	}

} //UiListImpl
