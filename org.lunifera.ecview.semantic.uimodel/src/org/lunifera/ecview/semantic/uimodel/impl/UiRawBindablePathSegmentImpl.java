/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ui Raw Bindable Path Segment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiRawBindablePathSegmentImpl#getRawBindable <em>Raw Bindable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiRawBindablePathSegmentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiRawBindablePathSegmentImpl#isToParent <em>To Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiRawBindablePathSegmentImpl extends MinimalEObjectImpl.Container
		implements UiRawBindablePathSegment {
	/**
	 * The cached value of the '{@link #getRawBindable() <em>Raw Bindable</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRawBindable()
	 * @generated
	 * @ordered
	 */
	protected UiRawBindable rawBindable;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected UiRawBindablePathSegment path;

	/**
	 * The default value of the '{@link #isToParent() <em>To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_PARENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToParent() <em>To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToParent()
	 * @generated
	 * @ordered
	 */
	protected boolean toParent = TO_PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UiRawBindablePathSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_RAW_BINDABLE_PATH_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindable getRawBindable() {
		if (rawBindable != null && rawBindable.eIsProxy()) {
			InternalEObject oldRawBindable = (InternalEObject)rawBindable;
			rawBindable = (UiRawBindable)eResolveProxy(oldRawBindable);
			if (rawBindable != oldRawBindable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE, oldRawBindable, rawBindable));
			}
		}
		return rawBindable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindable basicGetRawBindable() {
		return rawBindable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawBindable(UiRawBindable newRawBindable) {
		UiRawBindable oldRawBindable = rawBindable;
		rawBindable = newRawBindable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE, oldRawBindable, rawBindable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindablePathSegment getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (UiRawBindablePathSegment)eResolveProxy(oldPath);
			if (path != oldPath) {
				InternalEObject newPath = (InternalEObject)path;
				NotificationChain msgs = oldPath.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH, null, null);
				if (newPath.eInternalContainer() == null) {
					msgs = newPath.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiRawBindablePathSegment basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(UiRawBindablePathSegment newPath,
			NotificationChain msgs) {
		UiRawBindablePathSegment oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(UiRawBindablePathSegment newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToParent() {
		return toParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToParent(boolean newToParent) {
		boolean oldToParent = toParent;
		toParent = newToParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__TO_PARENT, oldToParent, toParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH:
				return basicSetPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE:
				if (resolve) return getRawBindable();
				return basicGetRawBindable();
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__TO_PARENT:
				return isToParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE:
				setRawBindable((UiRawBindable)newValue);
				return;
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH:
				setPath((UiRawBindablePathSegment)newValue);
				return;
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__TO_PARENT:
				setToParent((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE:
				setRawBindable((UiRawBindable)null);
				return;
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH:
				setPath((UiRawBindablePathSegment)null);
				return;
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__TO_PARENT:
				setToParent(TO_PARENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__RAW_BINDABLE:
				return rawBindable != null;
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__PATH:
				return path != null;
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT__TO_PARENT:
				return toParent != TO_PARENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (toParent: ");
		result.append(toParent);
		result.append(')');
		return result.toString();
	}

	@Override
	public UiRawBindable getRawBindableOfLastSegment() {
		UiRawBindablePathSegment child = getPath();
		if (child != null) {
			return child.getRawBindableOfLastSegment();
		} else {
			return getRawBindable();
		}
	}
	
	@Override
	public String toPathString() {
		String result = "";
		UiRawBindablePathSegment child = getPath();
		if (child != null) {
			result = child.toPathString();
			if (result != null) {
				result = getRawBindable().getName() + "." + result;
			} else {
				result = getRawBindable().getName();
			}
		} else if(getRawBindable() != null) {
			return getRawBindable().getName();
		}

		return result;
	}

} // UiRawBindablePathSegmentImpl
