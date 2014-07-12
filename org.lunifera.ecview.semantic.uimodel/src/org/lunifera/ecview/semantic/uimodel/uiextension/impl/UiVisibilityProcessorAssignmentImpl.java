/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Visibility Processor Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorAssignmentImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiVisibilityProcessorAssignmentImpl#getProcessorAlias <em>Processor Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiVisibilityProcessorAssignmentImpl extends MinimalEObjectImpl.Container implements UiVisibilityProcessorAssignment {
	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected UiVisibilityProcessor processor;

	/**
	 * The cached value of the '{@link #getProcessorAlias() <em>Processor Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorAlias()
	 * @generated
	 * @ordered
	 */
	protected UiVisibilityProcessor processorAlias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiVisibilityProcessorAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiextensionPackage.Literals.UI_VISIBILITY_PROCESSOR_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessor getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(UiVisibilityProcessor newProcessor, NotificationChain msgs) {
		UiVisibilityProcessor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR, oldProcessor, newProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(UiVisibilityProcessor newProcessor) {
		if (newProcessor != processor) {
			NotificationChain msgs = null;
			if (processor != null)
				msgs = ((InternalEObject)processor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR, null, msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR, null, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessor getProcessorAlias() {
		if (processorAlias != null && processorAlias.eIsProxy()) {
			InternalEObject oldProcessorAlias = (InternalEObject)processorAlias;
			processorAlias = (UiVisibilityProcessor)eResolveProxy(oldProcessorAlias);
			if (processorAlias != oldProcessorAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS, oldProcessorAlias, processorAlias));
			}
		}
		return processorAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessor basicGetProcessorAlias() {
		return processorAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorAlias(UiVisibilityProcessor newProcessorAlias) {
		UiVisibilityProcessor oldProcessorAlias = processorAlias;
		processorAlias = newProcessorAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS, oldProcessorAlias, processorAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR:
				return basicSetProcessor(null, msgs);
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR:
				return getProcessor();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS:
				if (resolve) return getProcessorAlias();
				return basicGetProcessorAlias();
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR:
				setProcessor((UiVisibilityProcessor)newValue);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS:
				setProcessorAlias((UiVisibilityProcessor)newValue);
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR:
				setProcessor((UiVisibilityProcessor)null);
				return;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS:
				setProcessorAlias((UiVisibilityProcessor)null);
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
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR:
				return processor != null;
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS:
				return processorAlias != null;
		}
		return super.eIsSet(featureID);
	}

} //UiVisibilityProcessorAssignmentImpl
