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
 * A representation of the model object '<em><b>Ui Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBeanSlots <em>Bean Slots</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBindingEndpointAlias <em>Binding Endpoint Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiContext#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiContext#getSharedStateGroup <em>Shared State Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext()
 * @model
 * @generated
 */
public interface UiContext extends UiRootElements {
	/**
	 * Returns the value of the '<em><b>Bean Slots</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Slots</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext_BeanSlots()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBeanSlot> getBeanSlots();

	/**
	 * Returns the value of the '<em><b>Binding Endpoint Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Endpoint Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Endpoint Alias</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext_BindingEndpointAlias()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBindingEndpointAlias> getBindingEndpointAlias();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext_Bindings()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Shared State Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared State Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared State Group</em>' attribute.
	 * @see #setSharedStateGroup(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiContext_SharedStateGroup()
	 * @model
	 * @generated
	 */
	String getSharedStateGroup();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiContext#getSharedStateGroup <em>Shared State Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared State Group</em>' attribute.
	 * @see #getSharedStateGroup()
	 * @generated
	 */
	void setSharedStateGroup(String value);

} // UiContext
