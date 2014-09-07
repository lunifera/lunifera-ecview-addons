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
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfoable;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiSplitpanel;
import org.lunifera.ecview.semantic.uimodel.UiSplitpanelAssigment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Splitpanel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#getI18nInfo <em>I1 8n Info</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#getFirstContent <em>First Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#getSecondContent <em>Second Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#getSplitPosition <em>Split Position</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiSplitpanelImpl#isHorizontal <em>Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiSplitpanelImpl extends UiVisibilityProcessableImpl implements UiSplitpanel {
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
	 * The cached value of the '{@link #getFirstContent() <em>First Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstContent()
	 * @generated
	 * @ordered
	 */
	protected UiSplitpanelAssigment firstContent;

	/**
	 * The cached value of the '{@link #getSecondContent() <em>Second Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondContent()
	 * @generated
	 * @ordered
	 */
	protected UiSplitpanelAssigment secondContent;

	/**
	 * The default value of the '{@link #getSplitPosition() <em>Split Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int SPLIT_POSITION_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getSplitPosition() <em>Split Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitPosition()
	 * @generated
	 * @ordered
	 */
	protected int splitPosition = SPLIT_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean horizontal = HORIZONTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiSplitpanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_SPLITPANEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__NAME, oldName, name));
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
				NotificationChain msgs = oldI18nInfo.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__I18N_INFO, null, null);
				if (newI18nInfo.eInternalContainer() == null) {
					msgs = newI18nInfo.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__I18N_INFO, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_SPLITPANEL__I18N_INFO, oldI18nInfo, i18nInfo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__I18N_INFO, oldI18nInfo, newI18nInfo);
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
				msgs = ((InternalEObject)i18nInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__I18N_INFO, null, msgs);
			if (newI18nInfo != null)
				msgs = ((InternalEObject)newI18nInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__I18N_INFO, null, msgs);
			msgs = basicSetI18nInfo(newI18nInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__I18N_INFO, newI18nInfo, newI18nInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList.Resolving<UiBinding>(UiBinding.class, this, UiModelPackage.UI_SPLITPANEL__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSplitpanelAssigment getFirstContent() {
		if (firstContent != null && firstContent.eIsProxy()) {
			InternalEObject oldFirstContent = (InternalEObject)firstContent;
			firstContent = (UiSplitpanelAssigment)eResolveProxy(oldFirstContent);
			if (firstContent != oldFirstContent) {
				InternalEObject newFirstContent = (InternalEObject)firstContent;
				NotificationChain msgs = oldFirstContent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT, null, null);
				if (newFirstContent.eInternalContainer() == null) {
					msgs = newFirstContent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT, oldFirstContent, firstContent));
			}
		}
		return firstContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSplitpanelAssigment basicGetFirstContent() {
		return firstContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstContent(UiSplitpanelAssigment newFirstContent, NotificationChain msgs) {
		UiSplitpanelAssigment oldFirstContent = firstContent;
		firstContent = newFirstContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT, oldFirstContent, newFirstContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstContent(UiSplitpanelAssigment newFirstContent) {
		if (newFirstContent != firstContent) {
			NotificationChain msgs = null;
			if (firstContent != null)
				msgs = ((InternalEObject)firstContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT, null, msgs);
			if (newFirstContent != null)
				msgs = ((InternalEObject)newFirstContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT, null, msgs);
			msgs = basicSetFirstContent(newFirstContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT, newFirstContent, newFirstContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSplitpanelAssigment getSecondContent() {
		if (secondContent != null && secondContent.eIsProxy()) {
			InternalEObject oldSecondContent = (InternalEObject)secondContent;
			secondContent = (UiSplitpanelAssigment)eResolveProxy(oldSecondContent);
			if (secondContent != oldSecondContent) {
				InternalEObject newSecondContent = (InternalEObject)secondContent;
				NotificationChain msgs = oldSecondContent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT, null, null);
				if (newSecondContent.eInternalContainer() == null) {
					msgs = newSecondContent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT, oldSecondContent, secondContent));
			}
		}
		return secondContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSplitpanelAssigment basicGetSecondContent() {
		return secondContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondContent(UiSplitpanelAssigment newSecondContent, NotificationChain msgs) {
		UiSplitpanelAssigment oldSecondContent = secondContent;
		secondContent = newSecondContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT, oldSecondContent, newSecondContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondContent(UiSplitpanelAssigment newSecondContent) {
		if (newSecondContent != secondContent) {
			NotificationChain msgs = null;
			if (secondContent != null)
				msgs = ((InternalEObject)secondContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT, null, msgs);
			if (newSecondContent != null)
				msgs = ((InternalEObject)newSecondContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT, null, msgs);
			msgs = basicSetSecondContent(newSecondContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT, newSecondContent, newSecondContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSplitPosition() {
		return splitPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitPosition(int newSplitPosition) {
		int oldSplitPosition = splitPosition;
		splitPosition = newSplitPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__SPLIT_POSITION, oldSplitPosition, splitPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizontal() {
		return horizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontal(boolean newHorizontal) {
		boolean oldHorizontal = horizontal;
		horizontal = newHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_SPLITPANEL__HORIZONTAL, oldHorizontal, horizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_SPLITPANEL__I18N_INFO:
				return basicSetI18nInfo(null, msgs);
			case UiModelPackage.UI_SPLITPANEL__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT:
				return basicSetFirstContent(null, msgs);
			case UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT:
				return basicSetSecondContent(null, msgs);
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
			case UiModelPackage.UI_SPLITPANEL__ID:
				return getId();
			case UiModelPackage.UI_SPLITPANEL__NAME:
				return getName();
			case UiModelPackage.UI_SPLITPANEL__I18N_INFO:
				if (resolve) return getI18nInfo();
				return basicGetI18nInfo();
			case UiModelPackage.UI_SPLITPANEL__BINDINGS:
				return getBindings();
			case UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT:
				if (resolve) return getFirstContent();
				return basicGetFirstContent();
			case UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT:
				if (resolve) return getSecondContent();
				return basicGetSecondContent();
			case UiModelPackage.UI_SPLITPANEL__SPLIT_POSITION:
				return getSplitPosition();
			case UiModelPackage.UI_SPLITPANEL__HORIZONTAL:
				return isHorizontal();
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
			case UiModelPackage.UI_SPLITPANEL__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.UI_SPLITPANEL__NAME:
				setName((String)newValue);
				return;
			case UiModelPackage.UI_SPLITPANEL__I18N_INFO:
				setI18nInfo((UiI18nInfo)newValue);
				return;
			case UiModelPackage.UI_SPLITPANEL__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends UiBinding>)newValue);
				return;
			case UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT:
				setFirstContent((UiSplitpanelAssigment)newValue);
				return;
			case UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT:
				setSecondContent((UiSplitpanelAssigment)newValue);
				return;
			case UiModelPackage.UI_SPLITPANEL__SPLIT_POSITION:
				setSplitPosition((Integer)newValue);
				return;
			case UiModelPackage.UI_SPLITPANEL__HORIZONTAL:
				setHorizontal((Boolean)newValue);
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
			case UiModelPackage.UI_SPLITPANEL__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.UI_SPLITPANEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiModelPackage.UI_SPLITPANEL__I18N_INFO:
				setI18nInfo((UiI18nInfo)null);
				return;
			case UiModelPackage.UI_SPLITPANEL__BINDINGS:
				getBindings().clear();
				return;
			case UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT:
				setFirstContent((UiSplitpanelAssigment)null);
				return;
			case UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT:
				setSecondContent((UiSplitpanelAssigment)null);
				return;
			case UiModelPackage.UI_SPLITPANEL__SPLIT_POSITION:
				setSplitPosition(SPLIT_POSITION_EDEFAULT);
				return;
			case UiModelPackage.UI_SPLITPANEL__HORIZONTAL:
				setHorizontal(HORIZONTAL_EDEFAULT);
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
			case UiModelPackage.UI_SPLITPANEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.UI_SPLITPANEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiModelPackage.UI_SPLITPANEL__I18N_INFO:
				return i18nInfo != null;
			case UiModelPackage.UI_SPLITPANEL__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case UiModelPackage.UI_SPLITPANEL__FIRST_CONTENT:
				return firstContent != null;
			case UiModelPackage.UI_SPLITPANEL__SECOND_CONTENT:
				return secondContent != null;
			case UiModelPackage.UI_SPLITPANEL__SPLIT_POSITION:
				return splitPosition != SPLIT_POSITION_EDEFAULT;
			case UiModelPackage.UI_SPLITPANEL__HORIZONTAL:
				return horizontal != HORIZONTAL_EDEFAULT;
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
				case UiModelPackage.UI_SPLITPANEL__ID: return UiModelPackage.UI_NAMED_ELEMENT__ID;
				case UiModelPackage.UI_SPLITPANEL__NAME: return UiModelPackage.UI_NAMED_ELEMENT__NAME;
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
				case UiModelPackage.UI_SPLITPANEL__I18N_INFO: return UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO;
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
				case UiModelPackage.UI_NAMED_ELEMENT__ID: return UiModelPackage.UI_SPLITPANEL__ID;
				case UiModelPackage.UI_NAMED_ELEMENT__NAME: return UiModelPackage.UI_SPLITPANEL__NAME;
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
				case UiModelPackage.UI_I1_8N_INFOABLE__I18N_INFO: return UiModelPackage.UI_SPLITPANEL__I18N_INFO;
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
		result.append(", splitPosition: ");
		result.append(splitPosition);
		result.append(", horizontal: ");
		result.append(horizontal);
		result.append(')');
		return result.toString();
	}

} //UiSplitpanelImpl
