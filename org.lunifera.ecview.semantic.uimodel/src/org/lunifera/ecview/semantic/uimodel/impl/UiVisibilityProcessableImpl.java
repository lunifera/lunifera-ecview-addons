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
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Visibility Processable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessableImpl#getProcessorAssignment <em>Processor Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UiVisibilityProcessableImpl extends MinimalEObjectImpl.Container implements UiVisibilityProcessable {
	/**
	 * The cached value of the '{@link #getProcessorAssignment() <em>Processor Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorAssignment()
	 * @generated
	 * @ordered
	 */
	protected UiVisibilityProcessorAssignment processorAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiVisibilityProcessableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_VISIBILITY_PROCESSABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessorAssignment getProcessorAssignment() {
		return processorAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessorAssignment(UiVisibilityProcessorAssignment newProcessorAssignment, NotificationChain msgs) {
		UiVisibilityProcessorAssignment oldProcessorAssignment = processorAssignment;
		processorAssignment = newProcessorAssignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT, oldProcessorAssignment, newProcessorAssignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorAssignment(UiVisibilityProcessorAssignment newProcessorAssignment) {
		if (newProcessorAssignment != processorAssignment) {
			NotificationChain msgs = null;
			if (processorAssignment != null)
				msgs = ((InternalEObject)processorAssignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT, null, msgs);
			if (newProcessorAssignment != null)
				msgs = ((InternalEObject)newProcessorAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT, null, msgs);
			msgs = basicSetProcessorAssignment(newProcessorAssignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT, newProcessorAssignment, newProcessorAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT:
				return basicSetProcessorAssignment(null, msgs);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT:
				return getProcessorAssignment();
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT:
				setProcessorAssignment((UiVisibilityProcessorAssignment)newValue);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT:
				setProcessorAssignment((UiVisibilityProcessorAssignment)null);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT:
				return processorAssignment != null;
		}
		return super.eIsSet(featureID);
	}

} //UiVisibilityProcessableImpl
