/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmType;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ui Path Segment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl#getJvmField <em>Jvm Field</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiPathSegmentImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiPathSegmentImpl extends MinimalEObjectImpl.Container implements
		UiPathSegment {
	/**
	 * The cached value of the '{@link #getJvmField() <em>Jvm Field</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJvmField()
	 * @generated
	 * @ordered
	 */
	protected JvmField jvmField;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected UiPathSegment path;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UiPathSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_PATH_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField getJvmField() {
		if (jvmField != null && jvmField.eIsProxy()) {
			InternalEObject oldJvmField = (InternalEObject)jvmField;
			jvmField = (JvmField)eResolveProxy(oldJvmField);
			if (jvmField != oldJvmField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_PATH_SEGMENT__JVM_FIELD, oldJvmField, jvmField));
			}
		}
		return jvmField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JvmField basicGetJvmField() {
		return jvmField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setJvmField(JvmField newJvmField) {
		JvmField oldJvmField = jvmField;
		jvmField = newJvmField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_PATH_SEGMENT__JVM_FIELD, oldJvmField, jvmField));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment getPath() {
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (UiPathSegment)eResolveProxy(oldPath);
			if (path != oldPath) {
				InternalEObject newPath = (InternalEObject)path;
				NotificationChain msgs = oldPath.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_PATH_SEGMENT__PATH, null, null);
				if (newPath.eInternalContainer() == null) {
					msgs = newPath.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_PATH_SEGMENT__PATH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_PATH_SEGMENT__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment basicGetPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(UiPathSegment newPath,
			NotificationChain msgs) {
		UiPathSegment oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_PATH_SEGMENT__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(UiPathSegment newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_PATH_SEGMENT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_PATH_SEGMENT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_PATH_SEGMENT__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_PATH_SEGMENT__PATH:
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
			case UiModelPackage.UI_PATH_SEGMENT__JVM_FIELD:
				if (resolve) return getJvmField();
				return basicGetJvmField();
			case UiModelPackage.UI_PATH_SEGMENT__PATH:
				if (resolve) return getPath();
				return basicGetPath();
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
			case UiModelPackage.UI_PATH_SEGMENT__JVM_FIELD:
				setJvmField((JvmField)newValue);
				return;
			case UiModelPackage.UI_PATH_SEGMENT__PATH:
				setPath((UiPathSegment)newValue);
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
			case UiModelPackage.UI_PATH_SEGMENT__JVM_FIELD:
				setJvmField((JvmField)null);
				return;
			case UiModelPackage.UI_PATH_SEGMENT__PATH:
				setPath((UiPathSegment)null);
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
			case UiModelPackage.UI_PATH_SEGMENT__JVM_FIELD:
				return jvmField != null;
			case UiModelPackage.UI_PATH_SEGMENT__PATH:
				return path != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toPathString() {
		String result = "";
		UiPathSegment child = getPath();
		if (child != null) {
			result = child.toPathString();
			if (result != null) {
				result = getJvmField().getSimpleName() + "." + result;
			} else {
				result = getJvmField().getSimpleName();
			}
		} else {
			return getJvmField() != null ? getJvmField().getSimpleName() : null;
		}

		return result;
	}

	@Override
	public JvmType getTypeofLastSegment() {
		UiPathSegment child = getPath();
		if (child != null) {
			return child.getTypeofLastSegment();
		} else {
			return getJvmField() != null && getJvmField().getType() != null ? getJvmField()
					.getType().getType() : null;
		}
	}

	@Override
	public JvmType getTypeofSecondLastSegment() {
		UiPathSegment child = getPath();
		if (child != null) {
			JvmType type = child.getTypeofSecondLastSegment();
			if (type == null) {
				JvmField field = getJvmField();
				return (field != null && field.getType() != null) ? field
						.getType().getType() : null;
			} else {
				return type;
			}
		} else {
			// return null to tell the caller, that the current segment is the
			// last.
			return null;
		}
	}

	@Override
	public JvmField getFieldofLastSegment() {
		UiPathSegment child = getPath();
		if (child != null) {
			return child.getFieldofLastSegment();
		} else {
			return getJvmField();
		}
	}

	public String toString() {
		return toPathString();
	}

} // UiPathSegmentImpl
