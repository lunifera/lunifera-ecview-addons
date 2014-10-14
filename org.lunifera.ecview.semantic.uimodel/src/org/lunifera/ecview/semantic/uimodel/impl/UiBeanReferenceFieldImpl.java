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

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiBeanServiceConsumer;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfoable;
import org.lunifera.ecview.semantic.uimodel.UiMobileEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiMobileField;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Bean Reference Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getI18nInfo <em>I1 8n Info</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#isConsumeBeanService <em>Consume Bean Service</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getCaptionProperty <em>Caption Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getImageProperty <em>Image Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getInMemoryBeanProvider <em>In Memory Bean Provider</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBeanReferenceFieldImpl#getDescriptionProperty <em>Description Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiBeanReferenceFieldImpl extends UiVisibilityProcessableImpl implements UiBeanReferenceField {
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
	 * The cached value of the '{@link #getCaptionProperty() <em>Caption Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionProperty()
	 * @generated
	 * @ordered
	 */
	protected UiNestedProperty captionProperty;

	/**
	 * The cached value of the '{@link #getImageProperty() <em>Image Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageProperty()
	 * @generated
	 * @ordered
	 */
	protected UiNestedProperty imageProperty;

	/**
	 * The cached value of the '{@link #getInMemoryBeanProvider() <em>In Memory Bean Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMemoryBeanProvider()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference inMemoryBeanProvider;

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
	protected UiBeanReferenceFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_BEAN_REFERENCE_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__NAME, oldName, name));
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
				NotificationChain msgs = oldI18nInfo.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO, null, null);
				if (newI18nInfo.eInternalContainer() == null) {
					msgs = newI18nInfo.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO, oldI18nInfo, i18nInfo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO, oldI18nInfo, newI18nInfo);
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
				msgs = ((InternalEObject)i18nInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO, null, msgs);
			if (newI18nInfo != null)
				msgs = ((InternalEObject)newI18nInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO, null, msgs);
			msgs = basicSetI18nInfo(newI18nInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO, newI18nInfo, newI18nInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList.Resolving<UiBinding>(UiBinding.class, this, UiModelPackage.UI_BEAN_REFERENCE_FIELD__BINDINGS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__READONLY, oldReadonly, readonly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__INVISIBLE, oldInvisible, invisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList.Resolving<UiValidator>(UiValidator.class, this, UiModelPackage.UI_BEAN_REFERENCE_FIELD__VALIDATORS);
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
				NotificationChain msgs = oldJvmType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE, null, null);
				if (newJvmType.eInternalContainer() == null) {
					msgs = newJvmType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE, oldJvmType, jvmType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE, oldJvmType, newJvmType);
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
				msgs = ((InternalEObject)jvmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE, null, msgs);
			if (newJvmType != null)
				msgs = ((InternalEObject)newJvmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE, null, msgs);
			msgs = basicSetJvmType(newJvmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE, newJvmType, newJvmType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__CONSUME_BEAN_SERVICE, oldConsumeBeanService, consumeBeanService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNestedProperty getCaptionProperty() {
		if (captionProperty != null && captionProperty.eIsProxy()) {
			InternalEObject oldCaptionProperty = (InternalEObject)captionProperty;
			captionProperty = (UiNestedProperty)eResolveProxy(oldCaptionProperty);
			if (captionProperty != oldCaptionProperty) {
				InternalEObject newCaptionProperty = (InternalEObject)captionProperty;
				NotificationChain msgs = oldCaptionProperty.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY, null, null);
				if (newCaptionProperty.eInternalContainer() == null) {
					msgs = newCaptionProperty.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY, oldCaptionProperty, captionProperty));
			}
		}
		return captionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNestedProperty basicGetCaptionProperty() {
		return captionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaptionProperty(UiNestedProperty newCaptionProperty, NotificationChain msgs) {
		UiNestedProperty oldCaptionProperty = captionProperty;
		captionProperty = newCaptionProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY, oldCaptionProperty, newCaptionProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionProperty(UiNestedProperty newCaptionProperty) {
		if (newCaptionProperty != captionProperty) {
			NotificationChain msgs = null;
			if (captionProperty != null)
				msgs = ((InternalEObject)captionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY, null, msgs);
			if (newCaptionProperty != null)
				msgs = ((InternalEObject)newCaptionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY, null, msgs);
			msgs = basicSetCaptionProperty(newCaptionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY, newCaptionProperty, newCaptionProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNestedProperty getImageProperty() {
		if (imageProperty != null && imageProperty.eIsProxy()) {
			InternalEObject oldImageProperty = (InternalEObject)imageProperty;
			imageProperty = (UiNestedProperty)eResolveProxy(oldImageProperty);
			if (imageProperty != oldImageProperty) {
				InternalEObject newImageProperty = (InternalEObject)imageProperty;
				NotificationChain msgs = oldImageProperty.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY, null, null);
				if (newImageProperty.eInternalContainer() == null) {
					msgs = newImageProperty.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY, oldImageProperty, imageProperty));
			}
		}
		return imageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNestedProperty basicGetImageProperty() {
		return imageProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageProperty(UiNestedProperty newImageProperty, NotificationChain msgs) {
		UiNestedProperty oldImageProperty = imageProperty;
		imageProperty = newImageProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY, oldImageProperty, newImageProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageProperty(UiNestedProperty newImageProperty) {
		if (newImageProperty != imageProperty) {
			NotificationChain msgs = null;
			if (imageProperty != null)
				msgs = ((InternalEObject)imageProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY, null, msgs);
			if (newImageProperty != null)
				msgs = ((InternalEObject)newImageProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY, null, msgs);
			msgs = basicSetImageProperty(newImageProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY, newImageProperty, newImageProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getInMemoryBeanProvider() {
		if (inMemoryBeanProvider != null && inMemoryBeanProvider.eIsProxy()) {
			InternalEObject oldInMemoryBeanProvider = (InternalEObject)inMemoryBeanProvider;
			inMemoryBeanProvider = (JvmTypeReference)eResolveProxy(oldInMemoryBeanProvider);
			if (inMemoryBeanProvider != oldInMemoryBeanProvider) {
				InternalEObject newInMemoryBeanProvider = (InternalEObject)inMemoryBeanProvider;
				NotificationChain msgs = oldInMemoryBeanProvider.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, null, null);
				if (newInMemoryBeanProvider.eInternalContainer() == null) {
					msgs = newInMemoryBeanProvider.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, oldInMemoryBeanProvider, inMemoryBeanProvider));
			}
		}
		return inMemoryBeanProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference basicGetInMemoryBeanProvider() {
		return inMemoryBeanProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInMemoryBeanProvider(JvmTypeReference newInMemoryBeanProvider, NotificationChain msgs) {
		JvmTypeReference oldInMemoryBeanProvider = inMemoryBeanProvider;
		inMemoryBeanProvider = newInMemoryBeanProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, oldInMemoryBeanProvider, newInMemoryBeanProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMemoryBeanProvider(JvmTypeReference newInMemoryBeanProvider) {
		if (newInMemoryBeanProvider != inMemoryBeanProvider) {
			NotificationChain msgs = null;
			if (inMemoryBeanProvider != null)
				msgs = ((InternalEObject)inMemoryBeanProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, null, msgs);
			if (newInMemoryBeanProvider != null)
				msgs = ((InternalEObject)newInMemoryBeanProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, null, msgs);
			msgs = basicSetInMemoryBeanProvider(newInMemoryBeanProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER, newInMemoryBeanProvider, newInMemoryBeanProvider));
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
				NotificationChain msgs = oldDescriptionProperty.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY, null, null);
				if (newDescriptionProperty.eInternalContainer() == null) {
					msgs = newDescriptionProperty.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY, oldDescriptionProperty, descriptionProperty));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY, oldDescriptionProperty, newDescriptionProperty);
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
				msgs = ((InternalEObject)descriptionProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY, null, msgs);
			if (newDescriptionProperty != null)
				msgs = ((InternalEObject)newDescriptionProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY, null, msgs);
			msgs = basicSetDescriptionProperty(newDescriptionProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY, newDescriptionProperty, newDescriptionProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO:
				return basicSetI18nInfo(null, msgs);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE:
				return basicSetJvmType(null, msgs);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY:
				return basicSetCaptionProperty(null, msgs);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY:
				return basicSetImageProperty(null, msgs);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				return basicSetInMemoryBeanProvider(null, msgs);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY:
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
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__ID:
				return getId();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__NAME:
				return getName();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO:
				if (resolve) return getI18nInfo();
				return basicGetI18nInfo();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__BINDINGS:
				return getBindings();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__READONLY:
				return isReadonly();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__INVISIBLE:
				return isInvisible();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__VALIDATORS:
				return getValidators();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE:
				if (resolve) return getJvmType();
				return basicGetJvmType();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CONSUME_BEAN_SERVICE:
				return isConsumeBeanService();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY:
				if (resolve) return getCaptionProperty();
				return basicGetCaptionProperty();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY:
				if (resolve) return getImageProperty();
				return basicGetImageProperty();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				if (resolve) return getInMemoryBeanProvider();
				return basicGetInMemoryBeanProvider();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY:
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
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO:
				setI18nInfo((UiI18nInfo)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__INVISIBLE:
				setInvisible((Boolean)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends UiValidator>)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE:
				setJvmType((JvmTypeReference)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CONSUME_BEAN_SERVICE:
				setConsumeBeanService((Boolean)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY:
				setCaptionProperty((UiNestedProperty)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY:
				setImageProperty((UiNestedProperty)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				setInMemoryBeanProvider((JvmTypeReference)newValue);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY:
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
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO:
				setI18nInfo((UiI18nInfo)null);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__BINDINGS:
				getBindings().clear();
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__INVISIBLE:
				setInvisible(INVISIBLE_EDEFAULT);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__VALIDATORS:
				getValidators().clear();
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE:
				setJvmType((JvmTypeReference)null);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CONSUME_BEAN_SERVICE:
				setConsumeBeanService(CONSUME_BEAN_SERVICE_EDEFAULT);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY:
				setCaptionProperty((UiNestedProperty)null);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY:
				setImageProperty((UiNestedProperty)null);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				setInMemoryBeanProvider((JvmTypeReference)null);
				return;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY:
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
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO:
				return i18nInfo != null;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__READONLY:
				return readonly != READONLY_EDEFAULT;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__INVISIBLE:
				return invisible != INVISIBLE_EDEFAULT;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE:
				return jvmType != null;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CONSUME_BEAN_SERVICE:
				return consumeBeanService != CONSUME_BEAN_SERVICE_EDEFAULT;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY:
				return captionProperty != null;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IMAGE_PROPERTY:
				return imageProperty != null;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__IN_MEMORY_BEAN_PROVIDER:
				return inMemoryBeanProvider != null;
			case UiModelPackage.UI_BEAN_REFERENCE_FIELD__DESCRIPTION_PROPERTY:
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
				case UiModelPackage.UI_BEAN_REFERENCE_FIELD__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_BEAN_REFERENCE_FIELD__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
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
				case UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO: return UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO;
				default: return -1;
			}
		}
		if (baseClass == UiMobileEmbeddable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiMobileField.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE: return UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE;
				default: return -1;
			}
		}
		if (baseClass == UiBeanServiceConsumer.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_BEAN_REFERENCE_FIELD__CONSUME_BEAN_SERVICE: return UiModelPackage.UI_BEAN_SERVICE_CONSUMER__CONSUME_BEAN_SERVICE;
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
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_BEAN_REFERENCE_FIELD__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_BEAN_REFERENCE_FIELD__NAME;
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
				case UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO: return UiModelPackage.UI_BEAN_REFERENCE_FIELD__I18N_INFO;
				default: return -1;
			}
		}
		if (baseClass == UiMobileEmbeddable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiMobileField.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE: return UiModelPackage.UI_BEAN_REFERENCE_FIELD__JVM_TYPE;
				default: return -1;
			}
		}
		if (baseClass == UiBeanServiceConsumer.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_BEAN_SERVICE_CONSUMER__CONSUME_BEAN_SERVICE: return UiModelPackage.UI_BEAN_REFERENCE_FIELD__CONSUME_BEAN_SERVICE;
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
		result.append(')');
		return result.toString();
	}

} //UiBeanReferenceFieldImpl
