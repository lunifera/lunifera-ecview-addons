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

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Nested Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiNestedProperty#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiNestedProperty#getGetter <em>Getter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNestedProperty()
 * @model
 * @generated
 */
public interface UiNestedProperty extends UiNamedElement {
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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNestedProperty_Path()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiPathSegment getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiNestedProperty#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(UiPathSegment value);

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' reference.
	 * @see #setGetter(JvmOperation)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNestedProperty_Getter()
	 * @model
	 * @generated
	 */
	JvmOperation getGetter();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiNestedProperty#getGetter <em>Getter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' reference.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(JvmOperation value);
	
	
	/**
	 * Returns the path in dot notation from this segment to the last child.
	 * 
	 * @return
	 */
	public String toPathString();
	
	
	/**
	 * Returns the type of the last segment.
	 * 
	 * @return
	 */
	public JvmType getTypeofLastSegment();
	
	
	/**
	 * Returns the type reference of the last segment.
	 * 
	 * @return
	 */
	public JvmTypeReference getTypeReferenceOfLastSegment();
	
	/**
	 * Returns the type of the getter.
	 * 
	 * @return
	 */
	public JvmType getTypeofGetter();
	
	/**
	 * Returns the typereference of the getter.
	 * 
	 * @return
	 */
	public JvmTypeReference getTypeReferenceofGetter();
	
	/**
	 * Returns the type of the second last segment.
	 * 
	 * @return
	 */
	public JvmType getTypeofSecondLastSegment();
	
	/**
	 * Returns the operation of the last segment.
	 * 
	 * @return
	 */
	public JvmOperation getOperationofLastSegment();
	
} // UiNestedProperty
