/**
 */
package org.lunifera.ecview.semantic.uisemantics.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.xtype.XImportSection;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxAction;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;
import org.lunifera.ecview.semantic.uisemantics.UxModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ux Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxModelImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxModelImpl#getElementDefinitions <em>Element Definitions</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxModelImpl#getViewActions <em>View Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UxModelImpl extends MinimalEObjectImpl.Container implements UxModel {
	/**
	 * The cached value of the '{@link #getImportSection() <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportSection()
	 * @generated
	 * @ordered
	 */
	protected XImportSection importSection;

	/**
	 * The cached value of the '{@link #getElementDefinitions() <em>Element Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<UxElementDefinition> elementDefinitions;

	/**
	 * The cached value of the '{@link #getViewActions() <em>View Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewActions()
	 * @generated
	 * @ordered
	 */
	protected EList<UxAction> viewActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UxModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiSemanticsPackage.Literals.UX_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XImportSection getImportSection() {
		return importSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportSection(XImportSection newImportSection, NotificationChain msgs) {
		XImportSection oldImportSection = importSection;
		importSection = newImportSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_MODEL__IMPORT_SECTION, oldImportSection, newImportSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportSection(XImportSection newImportSection) {
		if (newImportSection != importSection) {
			NotificationChain msgs = null;
			if (importSection != null)
				msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_MODEL__IMPORT_SECTION, null, msgs);
			if (newImportSection != null)
				msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_MODEL__IMPORT_SECTION, null, msgs);
			msgs = basicSetImportSection(newImportSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_MODEL__IMPORT_SECTION, newImportSection, newImportSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UxElementDefinition> getElementDefinitions() {
		if (elementDefinitions == null) {
			elementDefinitions = new EObjectContainmentEList<UxElementDefinition>(UxElementDefinition.class, this, UiSemanticsPackage.UX_MODEL__ELEMENT_DEFINITIONS);
		}
		return elementDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UxAction> getViewActions() {
		if (viewActions == null) {
			viewActions = new EObjectContainmentEList<UxAction>(UxAction.class, this, UiSemanticsPackage.UX_MODEL__VIEW_ACTIONS);
		}
		return viewActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiSemanticsPackage.UX_MODEL__IMPORT_SECTION:
				return basicSetImportSection(null, msgs);
			case UiSemanticsPackage.UX_MODEL__ELEMENT_DEFINITIONS:
				return ((InternalEList<?>)getElementDefinitions()).basicRemove(otherEnd, msgs);
			case UiSemanticsPackage.UX_MODEL__VIEW_ACTIONS:
				return ((InternalEList<?>)getViewActions()).basicRemove(otherEnd, msgs);
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
			case UiSemanticsPackage.UX_MODEL__IMPORT_SECTION:
				return getImportSection();
			case UiSemanticsPackage.UX_MODEL__ELEMENT_DEFINITIONS:
				return getElementDefinitions();
			case UiSemanticsPackage.UX_MODEL__VIEW_ACTIONS:
				return getViewActions();
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
			case UiSemanticsPackage.UX_MODEL__IMPORT_SECTION:
				setImportSection((XImportSection)newValue);
				return;
			case UiSemanticsPackage.UX_MODEL__ELEMENT_DEFINITIONS:
				getElementDefinitions().clear();
				getElementDefinitions().addAll((Collection<? extends UxElementDefinition>)newValue);
				return;
			case UiSemanticsPackage.UX_MODEL__VIEW_ACTIONS:
				getViewActions().clear();
				getViewActions().addAll((Collection<? extends UxAction>)newValue);
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
			case UiSemanticsPackage.UX_MODEL__IMPORT_SECTION:
				setImportSection((XImportSection)null);
				return;
			case UiSemanticsPackage.UX_MODEL__ELEMENT_DEFINITIONS:
				getElementDefinitions().clear();
				return;
			case UiSemanticsPackage.UX_MODEL__VIEW_ACTIONS:
				getViewActions().clear();
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
			case UiSemanticsPackage.UX_MODEL__IMPORT_SECTION:
				return importSection != null;
			case UiSemanticsPackage.UX_MODEL__ELEMENT_DEFINITIONS:
				return elementDefinitions != null && !elementDefinitions.isEmpty();
			case UiSemanticsPackage.UX_MODEL__VIEW_ACTIONS:
				return viewActions != null && !viewActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UxModelImpl
