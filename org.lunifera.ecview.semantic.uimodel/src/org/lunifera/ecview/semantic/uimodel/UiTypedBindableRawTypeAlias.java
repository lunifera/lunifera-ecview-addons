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
 * A representation of the model object '<em><b>Ui Typed Bindable Raw Type Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTypedBindableRawTypeAlias()
 * @model
 * @generated
 */
public interface UiTypedBindableRawTypeAlias extends UiTypedBindable, UiBindingExpression {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTypedBindableRawTypeAlias_Alias()
	 * @model required="true"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTypedBindableRawTypeAlias_Type()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	UiBindingExpression getType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawTypeAlias#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(UiBindingExpression value);

} // UiTypedBindableRawTypeAlias
