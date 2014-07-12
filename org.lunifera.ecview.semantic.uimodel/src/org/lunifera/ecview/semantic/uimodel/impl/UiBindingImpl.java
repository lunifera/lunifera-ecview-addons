/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ui Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getSourceAlias <em>Source Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#isTargetToSource <em>Target To Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#isSourceToTarget <em>Source To Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiBindingImpl#getTargetAlias <em>Target Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiBindingImpl extends MinimalEObjectImpl.Container implements
		UiBinding {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UiBindingEndpointDef source;

	/**
	 * The cached value of the '{@link #getSourceAlias() <em>Source Alias</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourceAlias()
	 * @generated
	 * @ordered
	 */
	protected UiBindingEndpointAlias sourceAlias;

	/**
	 * The default value of the '{@link #isTargetToSource() <em>Target To Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isTargetToSource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_TO_SOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTargetToSource() <em>Target To Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isTargetToSource()
	 * @generated
	 * @ordered
	 */
	protected boolean targetToSource = TARGET_TO_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceToTarget() <em>Source To Target</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSourceToTarget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_TO_TARGET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceToTarget() <em>Source To Target</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSourceToTarget()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceToTarget = SOURCE_TO_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected UiBindingEndpointDef target;

	/**
	 * The cached value of the '{@link #getTargetAlias() <em>Target Alias</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTargetAlias()
	 * @generated
	 * @ordered
	 */
	protected UiBindingEndpointAlias targetAlias;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UiBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelPackage.Literals.UI_BINDING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointDef getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(UiBindingEndpointDef newSource,
			NotificationChain msgs) {
		UiBindingEndpointDef oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(UiBindingEndpointDef newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_BINDING__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_BINDING__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias getSourceAlias() {
		if (sourceAlias != null && sourceAlias.eIsProxy()) {
			InternalEObject oldSourceAlias = (InternalEObject)sourceAlias;
			sourceAlias = (UiBindingEndpointAlias)eResolveProxy(oldSourceAlias);
			if (sourceAlias != oldSourceAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelPackage.UI_BINDING__SOURCE_ALIAS, oldSourceAlias, sourceAlias));
			}
		}
		return sourceAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias basicGetSourceAlias() {
		return sourceAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAlias(UiBindingEndpointAlias newSourceAlias) {
		UiBindingEndpointAlias oldSourceAlias = sourceAlias;
		sourceAlias = newSourceAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__SOURCE_ALIAS, oldSourceAlias, sourceAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetToSource() {
		return targetToSource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetToSource(boolean newTargetToSource) {
		boolean oldTargetToSource = targetToSource;
		targetToSource = newTargetToSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__TARGET_TO_SOURCE, oldTargetToSource, targetToSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceToTarget() {
		return sourceToTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceToTarget(boolean newSourceToTarget) {
		boolean oldSourceToTarget = sourceToTarget;
		sourceToTarget = newSourceToTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__SOURCE_TO_TARGET, oldSourceToTarget, sourceToTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointDef getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(UiBindingEndpointDef newTarget,
			NotificationChain msgs) {
		UiBindingEndpointDef oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(UiBindingEndpointDef newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_BINDING__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UimodelPackage.UI_BINDING__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias getTargetAlias() {
		if (targetAlias != null && targetAlias.eIsProxy()) {
			InternalEObject oldTargetAlias = (InternalEObject)targetAlias;
			targetAlias = (UiBindingEndpointAlias)eResolveProxy(oldTargetAlias);
			if (targetAlias != oldTargetAlias) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelPackage.UI_BINDING__TARGET_ALIAS, oldTargetAlias, targetAlias));
			}
		}
		return targetAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias basicGetTargetAlias() {
		return targetAlias;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAlias(UiBindingEndpointAlias newTargetAlias) {
		UiBindingEndpointAlias oldTargetAlias = targetAlias;
		targetAlias = newTargetAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelPackage.UI_BINDING__TARGET_ALIAS, oldTargetAlias, targetAlias));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimodelPackage.UI_BINDING__SOURCE:
				return basicSetSource(null, msgs);
			case UimodelPackage.UI_BINDING__TARGET:
				return basicSetTarget(null, msgs);
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
			case UimodelPackage.UI_BINDING__SOURCE:
				return getSource();
			case UimodelPackage.UI_BINDING__SOURCE_ALIAS:
				if (resolve) return getSourceAlias();
				return basicGetSourceAlias();
			case UimodelPackage.UI_BINDING__TARGET_TO_SOURCE:
				return isTargetToSource();
			case UimodelPackage.UI_BINDING__SOURCE_TO_TARGET:
				return isSourceToTarget();
			case UimodelPackage.UI_BINDING__TARGET:
				return getTarget();
			case UimodelPackage.UI_BINDING__TARGET_ALIAS:
				if (resolve) return getTargetAlias();
				return basicGetTargetAlias();
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
			case UimodelPackage.UI_BINDING__SOURCE:
				setSource((UiBindingEndpointDef)newValue);
				return;
			case UimodelPackage.UI_BINDING__SOURCE_ALIAS:
				setSourceAlias((UiBindingEndpointAlias)newValue);
				return;
			case UimodelPackage.UI_BINDING__TARGET_TO_SOURCE:
				setTargetToSource((Boolean)newValue);
				return;
			case UimodelPackage.UI_BINDING__SOURCE_TO_TARGET:
				setSourceToTarget((Boolean)newValue);
				return;
			case UimodelPackage.UI_BINDING__TARGET:
				setTarget((UiBindingEndpointDef)newValue);
				return;
			case UimodelPackage.UI_BINDING__TARGET_ALIAS:
				setTargetAlias((UiBindingEndpointAlias)newValue);
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
			case UimodelPackage.UI_BINDING__SOURCE:
				setSource((UiBindingEndpointDef)null);
				return;
			case UimodelPackage.UI_BINDING__SOURCE_ALIAS:
				setSourceAlias((UiBindingEndpointAlias)null);
				return;
			case UimodelPackage.UI_BINDING__TARGET_TO_SOURCE:
				setTargetToSource(TARGET_TO_SOURCE_EDEFAULT);
				return;
			case UimodelPackage.UI_BINDING__SOURCE_TO_TARGET:
				setSourceToTarget(SOURCE_TO_TARGET_EDEFAULT);
				return;
			case UimodelPackage.UI_BINDING__TARGET:
				setTarget((UiBindingEndpointDef)null);
				return;
			case UimodelPackage.UI_BINDING__TARGET_ALIAS:
				setTargetAlias((UiBindingEndpointAlias)null);
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
			case UimodelPackage.UI_BINDING__SOURCE:
				return source != null;
			case UimodelPackage.UI_BINDING__SOURCE_ALIAS:
				return sourceAlias != null;
			case UimodelPackage.UI_BINDING__TARGET_TO_SOURCE:
				return targetToSource != TARGET_TO_SOURCE_EDEFAULT;
			case UimodelPackage.UI_BINDING__SOURCE_TO_TARGET:
				return sourceToTarget != SOURCE_TO_TARGET_EDEFAULT;
			case UimodelPackage.UI_BINDING__TARGET:
				return target != null;
			case UimodelPackage.UI_BINDING__TARGET_ALIAS:
				return targetAlias != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(')');
		return result.toString();
	}

	@Override
	public UxEndpointDef getSourceEndpointDef() {
		if (getTarget() != null) {
			return getTarget().getSemanticEndpoint();
		} else if (getTargetAlias() != null) {
			return getTargetAlias().getEndpoint().getSemanticEndpoint();
		}
		return null;
	}

	@Override
	public UxEndpointDef getTargetEndpointDef() {
		if (getSource() != null) {
			return getSource().getSemanticEndpoint();
		} else if (getSourceAlias() != null) {
			return getSourceAlias().getEndpoint().getSemanticEndpoint();
		}
		return null;
	}

} // UiBindingImpl
