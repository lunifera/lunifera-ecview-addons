/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProperties;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesAssignment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Visibility Properties Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesAssignmentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityPropertiesAssignmentImpl#getPropertyAlias <em>Property Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiVisibilityPropertiesAssignmentImpl extends MinimalEObjectImpl.Container implements UiVisibilityPropertiesAssignment {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected UiVisibilityProperties properties;

	/**
	 * The cached value of the '{@link #getPropertyAlias() <em>Property Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAlias()
	 * @generated
	 * @ordered
	 */
	protected UiVisibilityProperties propertyAlias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiVisibilityPropertiesAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiextensionPackage.Literals.UI_VISIBILITY_PROPERTIES_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProperties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(UiVisibilityProperties newProperties, NotificationChain msgs) {
		UiVisibilityProperties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(UiVisibilityProperties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProperties getPropertyAlias() {
		if (propertyAlias != null && propertyAlias.eIsProxy()) {
			InternalEObject oldPropertyAlias = (InternalEObject)propertyAlias;
			propertyAlias = (UiVisibilityProperties)eResolveProxy(oldPropertyAlias);
			if (propertyAlias != oldPropertyAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS, oldPropertyAlias, propertyAlias));
			}
		}
		return propertyAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProperties basicGetPropertyAlias() {
		return propertyAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyAlias(UiVisibilityProperties newPropertyAlias) {
		UiVisibilityProperties oldPropertyAlias = propertyAlias;
		propertyAlias = newPropertyAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS, oldPropertyAlias, propertyAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES:
				return getProperties();
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS:
				if (resolve) return getPropertyAlias();
				return basicGetPropertyAlias();
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
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES:
				setProperties((UiVisibilityProperties)newValue);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS:
				setPropertyAlias((UiVisibilityProperties)newValue);
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
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES:
				setProperties((UiVisibilityProperties)null);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS:
				setPropertyAlias((UiVisibilityProperties)null);
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
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES:
				return properties != null;
			case UiextensionPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS:
				return propertyAlias != null;
		}
		return super.eIsSet(featureID);
	}

} //UiVisibilityPropertiesAssignmentImpl
