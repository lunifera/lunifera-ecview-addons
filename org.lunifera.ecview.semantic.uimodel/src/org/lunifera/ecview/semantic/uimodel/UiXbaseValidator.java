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
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Xbase Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator#getErrorCodes <em>Error Codes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiXbaseValidator()
 * @model
 * @generated
 */
public interface UiXbaseValidator extends UiValidator {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(XExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiXbaseValidator_Expression()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	XExpression getExpression();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(XExpression value);

	/**
	 * Returns the value of the '<em><b>Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jvm Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jvm Type</em>' containment reference.
	 * @see #setJvmType(JvmTypeReference)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiXbaseValidator_JvmType()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	JvmTypeReference getJvmType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiXbaseValidator#getJvmType <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Type</em>' containment reference.
	 * @see #getJvmType()
	 * @generated
	 */
	void setJvmType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Error Codes</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiErrorCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Codes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Codes</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiXbaseValidator_ErrorCodes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiErrorCode> getErrorCodes();

} // UiXbaseValidator
