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

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Validator Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getValidator <em>Validator</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getJvmType <em>Jvm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiValidatorDef()
 * @model
 * @generated
 */
public interface UiValidatorDef extends UiNamedElement {
	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference.
	 * @see #setValidator(UiValidator)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiValidatorDef_Validator()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiValidator getValidator();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getValidator <em>Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator</em>' containment reference.
	 * @see #getValidator()
	 * @generated
	 */
	void setValidator(UiValidator value);

	/**
	 * Returns the value of the '<em><b>Jvm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jvm Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jvm Type</em>' reference.
	 * @see #setJvmType(JvmTypeReference)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiValidatorDef_JvmType()
	 * @model
	 * @generated
	 */
	JvmTypeReference getJvmType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiValidatorDef#getJvmType <em>Jvm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Type</em>' reference.
	 * @see #getJvmType()
	 * @generated
	 */
	void setJvmType(JvmTypeReference value);

} // UiValidatorDef
