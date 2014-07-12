/**
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
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getViewSet <em>View Set</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.impl.UiViewImpl#getValidatorAssignments <em>Validator Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiViewImpl extends UiContextImpl implements UiView {
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
	public EList<UiValidatorAssignment> getValidatorAssignments() {
		if (validatorAssignments == null) {
			validatorAssignments = new EObjectContainmentEList<UiValidatorAssignment>(UiValidatorAssignment.class, this, UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS);
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
			case UiModelPackage.UI_VIEW__VIEW_SET:
				if (resolve) return getViewSet();
				return basicGetViewSet();
			case UiModelPackage.UI_VIEW__CONTENT:
				return getContent();
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
			case UiModelPackage.UI_VIEW__VIEW_SET:
				setViewSet((UiViewSet)newValue);
				return;
			case UiModelPackage.UI_VIEW__CONTENT:
				setContent((UiEmbeddable)newValue);
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
			case UiModelPackage.UI_VIEW__VIEW_SET:
				setViewSet((UiViewSet)null);
				return;
			case UiModelPackage.UI_VIEW__CONTENT:
				setContent((UiEmbeddable)null);
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
			case UiModelPackage.UI_VIEW__VIEW_SET:
				return viewSet != null;
			case UiModelPackage.UI_VIEW__CONTENT:
				return content != null;
			case UiModelPackage.UI_VIEW__VALIDATOR_ASSIGNMENTS:
				return validatorAssignments != null && !validatorAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UiViewImpl
