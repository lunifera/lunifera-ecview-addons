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
 * A representation of the model object '<em><b>Ui Splitpanel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#getFirstContent <em>First Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#getSecondContent <em>Second Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#getSplitPosition <em>Split Position</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#isHorizontal <em>Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSplitpanel()
 * @model
 * @generated
 */
public interface UiSplitpanel extends UiLayout {
	/**
	 * Returns the value of the '<em><b>First Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Content</em>' containment reference.
	 * @see #setFirstContent(UiSplitpanelAssigment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSplitpanel_FirstContent()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiSplitpanelAssigment getFirstContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#getFirstContent <em>First Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Content</em>' containment reference.
	 * @see #getFirstContent()
	 * @generated
	 */
	void setFirstContent(UiSplitpanelAssigment value);

	/**
	 * Returns the value of the '<em><b>Second Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Content</em>' containment reference.
	 * @see #setSecondContent(UiSplitpanelAssigment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSplitpanel_SecondContent()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiSplitpanelAssigment getSecondContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#getSecondContent <em>Second Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Content</em>' containment reference.
	 * @see #getSecondContent()
	 * @generated
	 */
	void setSecondContent(UiSplitpanelAssigment value);

	/**
	 * Returns the value of the '<em><b>Split Position</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Position</em>' attribute.
	 * @see #setSplitPosition(int)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSplitpanel_SplitPosition()
	 * @model default="50"
	 * @generated
	 */
	int getSplitPosition();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#getSplitPosition <em>Split Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Position</em>' attribute.
	 * @see #getSplitPosition()
	 * @generated
	 */
	void setSplitPosition(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal</em>' attribute.
	 * @see #setHorizontal(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSplitpanel_Horizontal()
	 * @model
	 * @generated
	 */
	boolean isHorizontal();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSplitpanel#isHorizontal <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal</em>' attribute.
	 * @see #isHorizontal()
	 * @generated
	 */
	void setHorizontal(boolean value);

} // UiSplitpanel
