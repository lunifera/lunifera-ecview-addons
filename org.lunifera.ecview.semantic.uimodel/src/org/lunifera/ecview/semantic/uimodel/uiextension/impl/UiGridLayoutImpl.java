/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl;
import org.lunifera.ecview.semantic.uimodel.UiBindable;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessable;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutImpl#getProcessorAssignment <em>Processor Assignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.impl.UiGridLayoutImpl#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiGridLayoutImpl extends YGridLayoutImpl implements UiGridLayout {
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
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<UiGridLayoutAssigment> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiGridLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiextensionPackage.Literals.UI_GRID_LAYOUT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT, oldProcessorAssignment, newProcessorAssignment);
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
				msgs = ((InternalEObject)processorAssignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT, null, msgs);
			if (newProcessorAssignment != null)
				msgs = ((InternalEObject)newProcessorAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT, null, msgs);
			msgs = basicSetProcessorAssignment(newProcessorAssignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT, newProcessorAssignment, newProcessorAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiGridLayoutAssigment> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<UiGridLayoutAssigment>(UiGridLayoutAssigment.class, this, UiextensionPackage.UI_GRID_LAYOUT__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT:
				return basicSetProcessorAssignment(null, msgs);
			case UiextensionPackage.UI_GRID_LAYOUT__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT:
				return getProcessorAssignment();
			case UiextensionPackage.UI_GRID_LAYOUT__CONTENTS:
				return getContents();
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
			case UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT:
				setProcessorAssignment((UiVisibilityProcessorAssignment)newValue);
				return;
			case UiextensionPackage.UI_GRID_LAYOUT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends UiGridLayoutAssigment>)newValue);
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
			case UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT:
				setProcessorAssignment((UiVisibilityProcessorAssignment)null);
				return;
			case UiextensionPackage.UI_GRID_LAYOUT__CONTENTS:
				getContents().clear();
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
			case UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT:
				return processorAssignment != null;
			case UiextensionPackage.UI_GRID_LAYOUT__CONTENTS:
				return contents != null && !contents.isEmpty();
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
		if (baseClass == UiVisibilityProcessable.class) {
			switch (derivedFeatureID) {
				case UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT: return UiextensionPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == UiModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiEmbeddable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiLayout.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == UiVisibilityProcessable.class) {
			switch (baseFeatureID) {
				case UiextensionPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT: return UiextensionPackage.UI_GRID_LAYOUT__PROCESSOR_ASSIGNMENT;
				default: return -1;
			}
		}
		if (baseClass == UiModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiEmbeddable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiLayout.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UiGridLayoutImpl
