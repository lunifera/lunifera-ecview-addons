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
package org.lunifera.ecview.semantic.uisemantics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.xtype.impl.XImportDeclarationImpl;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxEPackageImport;
import org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ux Import Section Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.impl.UxImportSectionDeclarationImpl#getImportedEPackage <em>Imported EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UxImportSectionDeclarationImpl extends XImportDeclarationImpl implements UxImportSectionDeclaration {
	/**
	 * The cached value of the '{@link #getImportedEPackage() <em>Imported EPackage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedEPackage()
	 * @generated
	 * @ordered
	 */
	protected UxEPackageImport importedEPackage;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UxImportSectionDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiSemanticsPackage.Literals.UX_IMPORT_SECTION_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxEPackageImport getImportedEPackage() {
		return importedEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedEPackage(UxEPackageImport newImportedEPackage, NotificationChain msgs) {
		UxEPackageImport oldImportedEPackage = importedEPackage;
		importedEPackage = newImportedEPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE, oldImportedEPackage, newImportedEPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedEPackage(UxEPackageImport newImportedEPackage) {
		if (newImportedEPackage != importedEPackage) {
			NotificationChain msgs = null;
			if (importedEPackage != null)
				msgs = ((InternalEObject)importedEPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE, null, msgs);
			if (newImportedEPackage != null)
				msgs = ((InternalEObject)newImportedEPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE, null, msgs);
			msgs = basicSetImportedEPackage(newImportedEPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE, newImportedEPackage, newImportedEPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE:
				return basicSetImportedEPackage(null, msgs);
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
			case UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE:
				return getImportedEPackage();
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
			case UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE:
				setImportedEPackage((UxEPackageImport)newValue);
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
			case UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE:
				setImportedEPackage((UxEPackageImport)null);
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
			case UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION__IMPORTED_EPACKAGE:
				return importedEPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //UxImportSectionDeclarationImpl
