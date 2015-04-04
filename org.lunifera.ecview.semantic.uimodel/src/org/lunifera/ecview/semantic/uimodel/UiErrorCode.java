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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Error Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiErrorCode#getDefaultMessage <em>Default Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiErrorCode()
 * @model
 * @generated
 */
public interface UiErrorCode extends UiNamedElement {
	/**
	 * Returns the value of the '<em><b>Default Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Message</em>' attribute.
	 * @see #setDefaultMessage(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiErrorCode_DefaultMessage()
	 * @model
	 * @generated
	 */
	String getDefaultMessage();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiErrorCode#getDefaultMessage <em>Default Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Message</em>' attribute.
	 * @see #getDefaultMessage()
	 * @generated
	 */
	void setDefaultMessage(String value);

} // UiErrorCode
