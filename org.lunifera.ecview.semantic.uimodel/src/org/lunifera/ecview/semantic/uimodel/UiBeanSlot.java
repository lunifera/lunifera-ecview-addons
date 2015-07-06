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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Bean Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getJvmType <em>Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getEventTopic <em>Event Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanSlot()
 * @model
 * @generated
 */
public interface UiBeanSlot extends UiTypedBindable {
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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanSlot_JvmType()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	JvmTypeReference getJvmType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getJvmType <em>Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Type</em>' containment reference.
	 * @see #getJvmType()
	 * @generated
	 */
	void setJvmType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' containment reference.
	 * @see #setEClass(EClass)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanSlot_EClass()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getEClass <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' containment reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Event Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Topic</em>' attribute.
	 * @see #setEventTopic(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanSlot_EventTopic()
	 * @model
	 * @generated
	 */
	String getEventTopic();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanSlot#getEventTopic <em>Event Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Topic</em>' attribute.
	 * @see #getEventTopic()
	 * @generated
	 */
	void setEventTopic(String value);

} // UiBeanSlot
