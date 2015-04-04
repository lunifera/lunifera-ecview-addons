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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.ecview.semantic.uimodel.UiAlignment;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getProcessorAssignments <em>Processor Assignments</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getViewSet <em>View Set</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getContentAlignment <em>Content Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getValidatorAssignments <em>Validator Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiViewImpl extends UiContextImpl implements UiView {
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
	 * The cached value of the '{@link #getJvmType() <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference jvmType;
	/**
	 * The cached value of the '{@link #getViewSet() <em>View Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewSet()
	 * @generated
	 * @ordered
	 */
	protected UiViewSet viewSet;
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected UiEmbeddable content;
	/**
	 * The default value of the '{@link #getContentAlignment() <em>Content Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final UiAlignment CONTENT_ALIGNMENT_EDEFAULT = UiAlignment.UNDEFINED;
	/**
	 * The cached value of the '{@link #getContentAlignment() <em>Content Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAlignment()
	 * @generated
	 * @ordered
	 */
	protected UiAlignment contentAlignment = CONTENT_ALIGNMENT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getValidatorAssignments() <em>Validator Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidatorAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<UiValidatorAssignment> validatorAssignments;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiVisibilityProcessorAssignment> getProcessorAssignments() {
		if (processorAssignments == null) {
			processorAssignments = new EObjectContainmentEList.Resolving<UiVisibilityProcessorAssignment>(UiVisibilityProcessorAssignment.class, this, UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS);
		}
		return processorAssignments;
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
				NotificationChain msgs = oldJvmType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__JVM_TYPE, null, null);
				if (newJvmType.eInternalContainer() == null) {
					msgs = newJvmType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__JVM_TYPE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VIEW__JVM_TYPE, oldJvmType, jvmType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VIEW__JVM_TYPE, oldJvmType, newJvmType);
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
				msgs = ((InternalEObject)jvmType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__JVM_TYPE, null, msgs);
			if (newJvmType != null)
				msgs = ((InternalEObject)newJvmType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__JVM_TYPE, null, msgs);
			msgs = basicSetJvmType(newJvmType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VIEW__JVM_TYPE, newJvmType, newJvmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiViewSet getViewSet() {
		if (viewSet != null && viewSet.eIsProxy()) {
			InternalEObject oldViewSet = (InternalEObject)viewSet;
			viewSet = (UiViewSet)eResolveProxy(oldViewSet);
			if (viewSet != oldViewSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VIEW__VIEW_SET, oldViewSet, viewSet));
			}
		}
		return viewSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiViewSet basicGetViewSet() {
		return viewSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewSet(UiViewSet newViewSet) {
		UiViewSet oldViewSet = viewSet;
		viewSet = newViewSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VIEW__VIEW_SET, oldViewSet, viewSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiEmbeddable getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (UiEmbeddable)eResolveProxy(oldContent);
			if (content != oldContent) {
				InternalEObject newContent = (InternalEObject)content;
				NotificationChain msgs = oldContent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__CONTENT, null, null);
				if (newContent.eInternalContainer() == null) {
					msgs = newContent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__CONTENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_VIEW__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiEmbeddable basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(UiEmbeddable newContent, NotificationChain msgs) {
		UiEmbeddable oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VIEW__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(UiEmbeddable newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_VIEW__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VIEW__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAlignment getContentAlignment() {
		return contentAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentAlignment(UiAlignment newContentAlignment) {
		UiAlignment oldContentAlignment = contentAlignment;
		contentAlignment = newContentAlignment == null ? CONTENT_ALIGNMENT_EDEFAULT : newContentAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_VIEW__CONTENT_ALIGNMENT, oldContentAlignment, contentAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UiValidatorAssignment> getValidatorAssignments() {
		if (validatorAssignments == null) {
			validatorAssignments = new EObjectContainmentEList.Resolving<UiValidatorAssignment>(UiValidatorAssignment.class, this, UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS);
		}
		return validatorAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS:
				return ((InternalEList<?>)getProcessorAssignments()).basicRemove(otherEnd, msgs);
			case UiModelPackage.UI_VIEW__JVM_TYPE:
				return basicSetJvmType(null, msgs);
			case UiModelPackage.UI_VIEW__CONTENT:
				return basicSetContent(null, msgs);
			case UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS:
				return ((InternalEList<?>)getValidatorAssignments()).basicRemove(otherEnd, msgs);
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
			case UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS:
				return getProcessorAssignments();
			case UiModelPackage.UI_VIEW__JVM_TYPE:
				if (resolve) return getJvmType();
				return basicGetJvmType();
			case UiModelPackage.UI_VIEW__VIEW_SET:
				if (resolve) return getViewSet();
				return basicGetViewSet();
			case UiModelPackage.UI_VIEW__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case UiModelPackage.UI_VIEW__CONTENT_ALIGNMENT:
				return getContentAlignment();
			case UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS:
				return getValidatorAssignments();
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
			case UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS:
				getProcessorAssignments().clear();
				getProcessorAssignments().addAll((Collection<? extends UiVisibilityProcessorAssignment>)newValue);
				return;
			case UiModelPackage.UI_VIEW__JVM_TYPE:
				setJvmType((JvmTypeReference)newValue);
				return;
			case UiModelPackage.UI_VIEW__VIEW_SET:
				setViewSet((UiViewSet)newValue);
				return;
			case UiModelPackage.UI_VIEW__CONTENT:
				setContent((UiEmbeddable)newValue);
				return;
			case UiModelPackage.UI_VIEW__CONTENT_ALIGNMENT:
				setContentAlignment((UiAlignment)newValue);
				return;
			case UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS:
				getValidatorAssignments().clear();
				getValidatorAssignments().addAll((Collection<? extends UiValidatorAssignment>)newValue);
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
			case UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS:
				getProcessorAssignments().clear();
				return;
			case UiModelPackage.UI_VIEW__JVM_TYPE:
				setJvmType((JvmTypeReference)null);
				return;
			case UiModelPackage.UI_VIEW__VIEW_SET:
				setViewSet((UiViewSet)null);
				return;
			case UiModelPackage.UI_VIEW__CONTENT:
				setContent((UiEmbeddable)null);
				return;
			case UiModelPackage.UI_VIEW__CONTENT_ALIGNMENT:
				setContentAlignment(CONTENT_ALIGNMENT_EDEFAULT);
				return;
			case UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS:
				getValidatorAssignments().clear();
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
			case UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS:
				return processorAssignments != null && !processorAssignments.isEmpty();
			case UiModelPackage.UI_VIEW__JVM_TYPE:
				return jvmType != null;
			case UiModelPackage.UI_VIEW__VIEW_SET:
				return viewSet != null;
			case UiModelPackage.UI_VIEW__CONTENT:
				return content != null;
			case UiModelPackage.UI_VIEW__CONTENT_ALIGNMENT:
				return contentAlignment != CONTENT_ALIGNMENT_EDEFAULT;
			case UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS:
				return validatorAssignments != null && !validatorAssignments.isEmpty();
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
				case UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS: return UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.UI_VIEW__JVM_TYPE: return UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE;
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
				case UiModelPackage.UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENTS: return UiModelPackage.UI_VIEW__PROCESSOR_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == UiRawBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == UiTypeProvider.class) {
			switch (baseFeatureID) {
				case UiModelPackage.UI_TYPE_PROVIDER__JVM_TYPE: return UiModelPackage.UI_VIEW__JVM_TYPE;
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
		result.append(" (contentAlignment: ");
		result.append(contentAlignment);
		result.append(')');
		return result.toString();
	}

} //UiViewImpl
