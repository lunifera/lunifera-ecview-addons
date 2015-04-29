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
 * A representation of the model object '<em><b>Ui Search Dialog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSearchDialog#getSearchFields <em>Search Fields</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSearchDialog#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSearchDialog()
 * @model
 * @generated
 */
public interface UiSearchDialog extends UiEmbeddable, UiTypeProvider {
	/**
	 * Returns the value of the '<em><b>Search Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Fields</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Fields</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSearchDialog_SearchFields()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiDialogSearchFieldAssignment> getSearchFields();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(UiDialogAssignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSearchDialog_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiDialogAssignment getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSearchDialog#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(UiDialogAssignment value);

} // UiSearchDialog
