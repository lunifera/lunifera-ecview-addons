
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
 * A representation of the model object '<em><b>Ui Binding Endpoint Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableDef <em>Typed Bindable Def</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableAlias <em>Typed Bindable Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBindingEndpointAssignment()
 * @model
 * @generated
 */
public interface UiBindingEndpointAssignment extends UiTypedBindable, UiBindingExpression {
	/**
	 * Returns the value of the '<em><b>Typed Bindable Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Bindable Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Bindable Def</em>' containment reference.
	 * @see #setTypedBindableDef(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBindingEndpointAssignment_TypedBindableDef()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingExpression getTypedBindableDef();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableDef <em>Typed Bindable Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Bindable Def</em>' containment reference.
	 * @see #getTypedBindableDef()
	 * @generated
	 */
	void setTypedBindableDef(UiBindingExpression value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(UiPathSegment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBindingEndpointAssignment_Path()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiPathSegment getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(UiPathSegment value);

	/**
	 * Returns the value of the '<em><b>Typed Bindable Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Bindable Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Bindable Alias</em>' reference.
	 * @see #setTypedBindableAlias(UiTypedBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBindingEndpointAssignment_TypedBindableAlias()
	 * @model
	 * @generated
	 */
	UiTypedBindable getTypedBindableAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment#getTypedBindableAlias <em>Typed Bindable Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Bindable Alias</em>' reference.
	 * @see #getTypedBindableAlias()
	 * @generated
	 */
	void setTypedBindableAlias(UiTypedBindable value);

} // UiBindingEndpointAssignment
