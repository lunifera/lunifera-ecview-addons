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

import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Typed Bindable Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getRawBindable <em>Raw Bindable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getRawBindablePath <em>Raw Bindable Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTypedBindableDef()
 * @model
 * @generated
 */
public interface UiTypedBindableDef extends UiTypedBindable, UiBindingExpression {
	/**
	 * Returns the value of the '<em><b>Raw Bindable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Bindable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Bindable</em>' reference.
	 * @see #setRawBindable(UiRawBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTypedBindableDef_RawBindable()
	 * @model
	 * @generated
	 */
	UiRawBindable getRawBindable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getRawBindable <em>Raw Bindable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Bindable</em>' reference.
	 * @see #getRawBindable()
	 * @generated
	 */
	void setRawBindable(UiRawBindable value);

	/**
	 * Returns the value of the '<em><b>Raw Bindable Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Bindable Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Bindable Path</em>' containment reference.
	 * @see #setRawBindablePath(UiRawBindablePathSegment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTypedBindableDef_RawBindablePath()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiRawBindablePathSegment getRawBindablePath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getRawBindablePath <em>Raw Bindable Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Bindable Path</em>' containment reference.
	 * @see #getRawBindablePath()
	 * @generated
	 */
	void setRawBindablePath(UiRawBindablePathSegment value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(UxEndpointDef)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTypedBindableDef_Method()
	 * @model
	 * @generated
	 */
	UxEndpointDef getMethod();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(UxEndpointDef value);
	
	/**
	 * Returns the raw bindable of the last valid path segment.
	 * @return
	 */
	UiRawBindable getRawBindableOfLastSegment();

} // UiTypedBindableDef
