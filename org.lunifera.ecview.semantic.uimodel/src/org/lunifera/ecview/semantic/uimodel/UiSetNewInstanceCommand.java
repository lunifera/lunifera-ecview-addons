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
 * A representation of the model object '<em><b>Ui Set New Instance Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSetNewInstanceCommand#getTarget <em>Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSetNewInstanceCommand#getJvmType <em>Jvm Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSetNewInstanceCommand()
 * @model
 * @generated
 */
public interface UiSetNewInstanceCommand extends UiCommand {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSetNewInstanceCommand_Target()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingExpression getTarget();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSetNewInstanceCommand#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UiBindingExpression value);

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSetNewInstanceCommand_JvmType()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	JvmTypeReference getJvmType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSetNewInstanceCommand#getJvmType <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Type</em>' containment reference.
	 * @see #getJvmType()
	 * @generated
	 */
	void setJvmType(JvmTypeReference value);

} // UiSetNewInstanceCommand
