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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getSourceAlias <em>Source Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#isTargetToSource <em>Target To Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#isSourceToTarget <em>Source To Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getTargetAlias <em>Target Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#isListBinding <em>List Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiBindingImpl extends MinimalEObjectImpl.Container implements UiBinding {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UiBindingExpression source;

	/**
	 * The cached value of the '{@link #getSourceAlias() <em>Source Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAlias()
	 * @generated
	 * @ordered
	 */
	protected UiTypedBindable sourceAlias;

	/**
	 * The default value of the '{@link #isTargetToSource() <em>Target To Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetToSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_TO_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTargetToSource() <em>Target To Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetToSource()
	 * @generated
	 * @ordered
	 */
	protected boolean targetToSource = TARGET_TO_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceToTarget() <em>Source To Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceToTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_TO_TARGET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceToTarget() <em>Source To Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceToTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceToTarget = SOURCE_TO_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected UiBindingExpression target;

	/**
	 * The cached value of the '{@link #getTargetAlias() <em>Target Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAlias()
	 * @generated
	 * @ordered
	 */
	protected UiTypedBindable targetAlias;

	/**
	 * The default value of the '{@link #isListBinding() <em>List Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListBinding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIST_BINDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isListBinding() <em>List Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListBinding()
	 * @generated
	 * @ordered
	 */
	protected boolean listBinding = LIST_BINDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.UI_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (UiBindingExpression)eResolveProxy(oldSource);
			if (source != oldSource) {
				InternalEObject newSource = (InternalEObject)source;
				NotificationChain msgs = oldSource.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__SOURCE, null, null);
				if (newSource.eInternalContainer() == null) {
					msgs = newSource.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__SOURCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BINDING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(UiBindingExpression newSource, NotificationChain msgs) {
		UiBindingExpression oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(UiBindingExpression newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindable getSourceAlias() {
		if (sourceAlias != null && sourceAlias.eIsProxy()) {
			InternalEObject oldSourceAlias = (InternalEObject)sourceAlias;
			sourceAlias = (UiTypedBindable)eResolveProxy(oldSourceAlias);
			if (sourceAlias != oldSourceAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BINDING__SOURCE_ALIAS, oldSourceAlias, sourceAlias));
			}
		}
		return sourceAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindable basicGetSourceAlias() {
		return sourceAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAlias(UiTypedBindable newSourceAlias) {
		UiTypedBindable oldSourceAlias = sourceAlias;
		sourceAlias = newSourceAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__SOURCE_ALIAS, oldSourceAlias, sourceAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetToSource() {
		return targetToSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetToSource(boolean newTargetToSource) {
		boolean oldTargetToSource = targetToSource;
		targetToSource = newTargetToSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__TARGET_TO_SOURCE, oldTargetToSource, targetToSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceToTarget() {
		return sourceToTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceToTarget(boolean newSourceToTarget) {
		boolean oldSourceToTarget = sourceToTarget;
		sourceToTarget = newSourceToTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__SOURCE_TO_TARGET, oldSourceToTarget, sourceToTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (UiBindingExpression)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				InternalEObject newTarget = (InternalEObject)target;
				NotificationChain msgs = oldTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__TARGET, null, null);
				if (newTarget.eInternalContainer() == null) {
					msgs = newTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__TARGET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BINDING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingExpression basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(UiBindingExpression newTarget, NotificationChain msgs) {
		UiBindingExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(UiBindingExpression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.UI_BINDING__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindable getTargetAlias() {
		if (targetAlias != null && targetAlias.eIsProxy()) {
			InternalEObject oldTargetAlias = (InternalEObject)targetAlias;
			targetAlias = (UiTypedBindable)eResolveProxy(oldTargetAlias);
			if (targetAlias != oldTargetAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiModelPackage.UI_BINDING__TARGET_ALIAS, oldTargetAlias, targetAlias));
			}
		}
		return targetAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTypedBindable basicGetTargetAlias() {
		return targetAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAlias(UiTypedBindable newTargetAlias) {
		UiTypedBindable oldTargetAlias = targetAlias;
		targetAlias = newTargetAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__TARGET_ALIAS, oldTargetAlias, targetAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isListBinding() {
		return listBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListBinding(boolean newListBinding) {
		boolean oldListBinding = listBinding;
		listBinding = newListBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.UI_BINDING__LIST_BINDING, oldListBinding, listBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.UI_BINDING__SOURCE:
				return basicSetSource(null, msgs);
			case UiModelPackage.UI_BINDING__TARGET:
				return basicSetTarget(null, msgs);
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
			case UiModelPackage.UI_BINDING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UiModelPackage.UI_BINDING__SOURCE_ALIAS:
				if (resolve) return getSourceAlias();
				return basicGetSourceAlias();
			case UiModelPackage.UI_BINDING__TARGET_TO_SOURCE:
				return isTargetToSource();
			case UiModelPackage.UI_BINDING__SOURCE_TO_TARGET:
				return isSourceToTarget();
			case UiModelPackage.UI_BINDING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UiModelPackage.UI_BINDING__TARGET_ALIAS:
				if (resolve) return getTargetAlias();
				return basicGetTargetAlias();
			case UiModelPackage.UI_BINDING__LIST_BINDING:
				return isListBinding();
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
			case UiModelPackage.UI_BINDING__SOURCE:
				setSource((UiBindingExpression)newValue);
				return;
			case UiModelPackage.UI_BINDING__SOURCE_ALIAS:
				setSourceAlias((UiTypedBindable)newValue);
				return;
			case UiModelPackage.UI_BINDING__TARGET_TO_SOURCE:
				setTargetToSource((Boolean)newValue);
				return;
			case UiModelPackage.UI_BINDING__SOURCE_TO_TARGET:
				setSourceToTarget((Boolean)newValue);
				return;
			case UiModelPackage.UI_BINDING__TARGET:
				setTarget((UiBindingExpression)newValue);
				return;
			case UiModelPackage.UI_BINDING__TARGET_ALIAS:
				setTargetAlias((UiTypedBindable)newValue);
				return;
			case UiModelPackage.UI_BINDING__LIST_BINDING:
				setListBinding((Boolean)newValue);
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
			case UiModelPackage.UI_BINDING__SOURCE:
				setSource((UiBindingExpression)null);
				return;
			case UiModelPackage.UI_BINDING__SOURCE_ALIAS:
				setSourceAlias((UiTypedBindable)null);
				return;
			case UiModelPackage.UI_BINDING__TARGET_TO_SOURCE:
				setTargetToSource(TARGET_TO_SOURCE_EDEFAULT);
				return;
			case UiModelPackage.UI_BINDING__SOURCE_TO_TARGET:
				setSourceToTarget(SOURCE_TO_TARGET_EDEFAULT);
				return;
			case UiModelPackage.UI_BINDING__TARGET:
				setTarget((UiBindingExpression)null);
				return;
			case UiModelPackage.UI_BINDING__TARGET_ALIAS:
				setTargetAlias((UiTypedBindable)null);
				return;
			case UiModelPackage.UI_BINDING__LIST_BINDING:
				setListBinding(LIST_BINDING_EDEFAULT);
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
			case UiModelPackage.UI_BINDING__SOURCE:
				return source != null;
			case UiModelPackage.UI_BINDING__SOURCE_ALIAS:
				return sourceAlias != null;
			case UiModelPackage.UI_BINDING__TARGET_TO_SOURCE:
				return targetToSource != TARGET_TO_SOURCE_EDEFAULT;
			case UiModelPackage.UI_BINDING__SOURCE_TO_TARGET:
				return sourceToTarget != SOURCE_TO_TARGET_EDEFAULT;
			case UiModelPackage.UI_BINDING__TARGET:
				return target != null;
			case UiModelPackage.UI_BINDING__TARGET_ALIAS:
				return targetAlias != null;
			case UiModelPackage.UI_BINDING__LIST_BINDING:
				return listBinding != LIST_BINDING_EDEFAULT;
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
		result.append(" (targetToSource: ");
		result.append(targetToSource);
		result.append(", sourceToTarget: ");
		result.append(sourceToTarget);
		result.append(", listBinding: ");
		result.append(listBinding);
		result.append(')');
		return result.toString();
	}

} //UiBindingImpl
