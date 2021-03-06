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

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Endpoint Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isFinal <em>Final</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isListbinding <em>Listbinding</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxEndpointDef()
 * @model abstract="true"
 * @generated
 */
public interface UxEndpointDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxEndpointDef_Final()
	 * @model
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

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
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxEndpointDef_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxEndpointDef_JvmType()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getJvmType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getJvmType <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Type</em>' containment reference.
	 * @see #getJvmType()
	 * @generated
	 */
	void setJvmType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Listbinding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listbinding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listbinding</em>' attribute.
	 * @see #setListbinding(boolean)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxEndpointDef_Listbinding()
	 * @model
	 * @generated
	 */
	boolean isListbinding();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#isListbinding <em>Listbinding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listbinding</em>' attribute.
	 * @see #isListbinding()
	 * @generated
	 */
	void setListbinding(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' attribute.
	 * @see #setTargetName(String)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxEndpointDef_TargetName()
	 * @model
	 * @generated
	 */
	String getTargetName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef#getTargetName <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' attribute.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(String value);

} // UxEndpointDef
