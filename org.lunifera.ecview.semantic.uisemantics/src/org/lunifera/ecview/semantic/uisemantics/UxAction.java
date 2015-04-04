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
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxAction#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxAction#getExternalCommandId <em>External Command Id</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxAction#isInitialDisabled <em>Initial Disabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAction()
 * @model
 * @generated
 */
public interface UxAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>External Command Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Command Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Command Id</em>' attribute.
	 * @see #setExternalCommandId(String)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAction_ExternalCommandId()
	 * @model
	 * @generated
	 */
	String getExternalCommandId();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxAction#getExternalCommandId <em>External Command Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Command Id</em>' attribute.
	 * @see #getExternalCommandId()
	 * @generated
	 */
	void setExternalCommandId(String value);

	/**
	 * Returns the value of the '<em><b>Initial Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Disabled</em>' attribute.
	 * @see #setInitialDisabled(boolean)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxAction_InitialDisabled()
	 * @model
	 * @generated
	 */
	boolean isInitialDisabled();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxAction#isInitialDisabled <em>Initial Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Disabled</em>' attribute.
	 * @see #isInitialDisabled()
	 * @generated
	 */
	void setInitialDisabled(boolean value);

} // UxAction
