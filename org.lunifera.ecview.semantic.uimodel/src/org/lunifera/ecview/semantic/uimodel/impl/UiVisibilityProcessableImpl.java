/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiVisibilityProcessableImpl#getProcessorAssignments <em>Processor Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UiVisibilityProcessableImpl extends MinimalEObjectImpl.Container implements UiVisibilityProcessable {
	/**
	 * The cached value of the '{@link #getProcessorAssignments() <em>Processor Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<UiVisibilityProcessorAssignment> processorAssignments;
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
	public EList<UiVisibilityProcessorAssignment> getProcessorAssignments() {
		if (processorAssignments == null) {
			processorAssignments = new EObjectContainmentEList.Resolving<UiVisibilityProcessorAssignment>(UiVisibilityProcessorAssignment.class, this, UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS);
		}
		return processorAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS:
				return ((InternalEList<?>)getProcessorAssignments()).basicRemove(otherEnd, msgs);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS:
				return getProcessorAssignments();
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS:
				getProcessorAssignments().clear();
				getProcessorAssignments().addAll((Collection<? extends UiVisibilityProcessorAssignment>)newValue);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS:
				getProcessorAssignments().clear();
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
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS:
				return processorAssignments != null && !processorAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UiVisibilityProcessableImpl
