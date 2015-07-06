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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Change Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpointAlias <em>Endpoint Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiChangeTrigger()
 * @model
 * @generated
 */
public interface UiChangeTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiChangeTrigger_Endpoint()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingExpression getEndpoint();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(UiBindingExpression value);

	/**
	 * Returns the value of the '<em><b>Endpoint Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Alias</em>' reference.
	 * @see #setEndpointAlias(UiBindingEndpointAlias)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiChangeTrigger_EndpointAlias()
	 * @model
	 * @generated
	 */
	UiBindingEndpointAlias getEndpointAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getEndpointAlias <em>Endpoint Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Alias</em>' reference.
	 * @see #getEndpointAlias()
	 * @generated
	 */
	void setEndpointAlias(UiBindingEndpointAlias value);

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiChangeTrigger_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // UiChangeTrigger
