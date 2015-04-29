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
 * A representation of the model object '<em><b>Ui Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiLayout#isAutowire <em>Autowire</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiLayout#getAutoWireSource <em>Auto Wire Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiLayout()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UiLayout extends UiEmbeddable {

	/**
	 * Returns the value of the '<em><b>Autowire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autowire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autowire</em>' attribute.
	 * @see #setAutowire(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiLayout_Autowire()
	 * @model
	 * @generated
	 */
	boolean isAutowire();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiLayout#isAutowire <em>Autowire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autowire</em>' attribute.
	 * @see #isAutowire()
	 * @generated
	 */
	void setAutowire(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Wire Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Wire Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Wire Source</em>' containment reference.
	 * @see #setAutoWireSource(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiLayout_AutoWireSource()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingExpression getAutoWireSource();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiLayout#getAutoWireSource <em>Auto Wire Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Wire Source</em>' containment reference.
	 * @see #getAutoWireSource()
	 * @generated
	 */
	void setAutoWireSource(UiBindingExpression value);
} // UiLayout
