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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Ui Raw Bindable Path Segment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getRawBindable <em>Raw Bindable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#isToParent <em>To Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRawBindablePathSegment()
 * @model
 * @generated
 */
public interface UiRawBindablePathSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Raw Bindable</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Bindable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Raw Bindable</em>' reference.
	 * @see #setRawBindable(UiRawBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRawBindablePathSegment_RawBindable()
	 * @model
	 * @generated
	 */
	UiRawBindable getRawBindable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getRawBindable <em>Raw Bindable</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Raw Bindable</em>' reference.
	 * @see #getRawBindable()
	 * @generated
	 */
	void setRawBindable(UiRawBindable value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(UiRawBindablePathSegment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRawBindablePathSegment_Path()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiRawBindablePathSegment getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(UiRawBindablePathSegment value);

	/**
	 * Returns the value of the '<em><b>To Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Parent</em>' attribute.
	 * @see #setToParent(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRawBindablePathSegment_ToParent()
	 * @model
	 * @generated
	 */
	boolean isToParent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#isToParent <em>To Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Parent</em>' attribute.
	 * @see #isToParent()
	 * @generated
	 */
	void setToParent(boolean value);

	/**
	 * Returns the raw bindable for the last segment of the path.
	 * 
	 * @return
	 */
	public UiRawBindable getRawBindableOfLastSegment();

	/**
	 * Returns the path of this object as a DOT separated String.
	 * 
	 * @return
	 */
	public String toPathString();

} // UiRawBindablePathSegment
