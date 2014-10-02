/**
 */
package org.lunifera.ecview.semantic.uisemantics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ux Endpoint Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl#isListbinding <em>Listbinding</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxEndpointDefImpl#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UxEndpointDefImpl extends MinimalEObjectImpl.Container implements UxEndpointDef {
	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

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
	 * The cached value of the '{@link #getJvmType() <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference jvmType;

	/**
	 * The default value of the '{@link #isListbinding() <em>Listbinding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListbinding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LISTBINDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isListbinding() <em>Listbinding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListbinding()
	 * @generated
	 * @ordered
	 */
	protected boolean listbinding = LISTBINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected String targetName = TARGET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UxEndpointDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiSemanticsPackage.Literals.UX_ENDPOINT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ENDPOINT_DEF__FINAL, oldFinal, final_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ENDPOINT_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getJvmType() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE, oldJvmType, newJvmType);
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
				msgs = ((InternalEObject)jvmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE, null, msgs);
			if (newJvmType != null)
				msgs = ((InternalEObject)newJvmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE, null, msgs);
			msgs = basicSetJvmType(newJvmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE, newJvmType, newJvmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isListbinding() {
		return listbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListbinding(boolean newListbinding) {
		boolean oldListbinding = listbinding;
		listbinding = newListbinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ENDPOINT_DEF__LISTBINDING, oldListbinding, listbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(String newTargetName) {
		String oldTargetName = targetName;
		targetName = newTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_ENDPOINT_DEF__TARGET_NAME, oldTargetName, targetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE:
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
			case UiSemanticsPackage.UX_ENDPOINT_DEF__FINAL:
				return isFinal();
			case UiSemanticsPackage.UX_ENDPOINT_DEF__NAME:
				return getName();
			case UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE:
				return getJvmType();
			case UiSemanticsPackage.UX_ENDPOINT_DEF__LISTBINDING:
				return isListbinding();
			case UiSemanticsPackage.UX_ENDPOINT_DEF__TARGET_NAME:
				return getTargetName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiSemanticsPackage.UX_ENDPOINT_DEF__FINAL:
				setFinal((Boolean)newValue);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__NAME:
				setName((String)newValue);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE:
				setJvmType((JvmTypeReference)newValue);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__LISTBINDING:
				setListbinding((Boolean)newValue);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__TARGET_NAME:
				setTargetName((String)newValue);
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
			case UiSemanticsPackage.UX_ENDPOINT_DEF__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE:
				setJvmType((JvmTypeReference)null);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__LISTBINDING:
				setListbinding(LISTBINDING_EDEFAULT);
				return;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__TARGET_NAME:
				setTargetName(TARGET_NAME_EDEFAULT);
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
			case UiSemanticsPackage.UX_ENDPOINT_DEF__FINAL:
				return final_ != FINAL_EDEFAULT;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiSemanticsPackage.UX_ENDPOINT_DEF__JVM_TYPE:
				return jvmType != null;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__LISTBINDING:
				return listbinding != LISTBINDING_EDEFAULT;
			case UiSemanticsPackage.UX_ENDPOINT_DEF__TARGET_NAME:
				return TARGET_NAME_EDEFAULT == null ? targetName != null : !TARGET_NAME_EDEFAULT.equals(targetName);
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
		result.append(" (final: ");
		result.append(final_);
		result.append(", name: ");
		result.append(name);
		result.append(", listbinding: ");
		result.append(listbinding);
		result.append(", targetName: ");
		result.append(targetName);
		result.append(')');
		return result.toString();
	}

} //UxEndpointDefImpl
