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
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Mobile Navigation Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage#getContents <em>Contents</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage#getBarActions <em>Bar Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationPage()
 * @model
 * @generated
 */
public interface UiMobileNavigationPage extends UiMobileLayout, UiTypeProvider, UiMobileNavigationHandler {

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationPage_Contents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiMobileNavigationPageAssignment> getContents();

	/**
	 * Returns the value of the '<em><b>Bar Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiMobileNavBarAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Actions</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileNavigationPage_BarActions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiMobileNavBarAction> getBarActions();
} // UiMobileNavigationPage
