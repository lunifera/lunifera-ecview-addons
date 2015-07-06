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

import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmTypeReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Bean Reference Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getCaptionProperty <em>Caption Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getImageProperty <em>Image Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getInMemoryBeanProvider <em>In Memory Bean Provider</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getDescriptionProperty <em>Description Property</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getReferenceSourceJvmType <em>Reference Source Jvm Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getReferenceSourceField <em>Reference Source Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField()
 * @model
 * @generated
 */
public interface UiBeanReferenceField extends UiField, UiMobileField, UiTypeProvider, UiBeanServiceConsumer {

	/**
	 * Returns the value of the '<em><b>Caption Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Property</em>' containment reference.
	 * @see #setCaptionProperty(UiNestedProperty)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField_CaptionProperty()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiNestedProperty getCaptionProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getCaptionProperty <em>Caption Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Property</em>' containment reference.
	 * @see #getCaptionProperty()
	 * @generated
	 */
	void setCaptionProperty(UiNestedProperty value);

	/**
	 * Returns the value of the '<em><b>Image Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Property</em>' containment reference.
	 * @see #setImageProperty(UiNestedProperty)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField_ImageProperty()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiNestedProperty getImageProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getImageProperty <em>Image Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Property</em>' containment reference.
	 * @see #getImageProperty()
	 * @generated
	 */
	void setImageProperty(UiNestedProperty value);

	/**
	 * Returns the value of the '<em><b>In Memory Bean Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Memory Bean Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Memory Bean Provider</em>' containment reference.
	 * @see #setInMemoryBeanProvider(JvmTypeReference)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField_InMemoryBeanProvider()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	JvmTypeReference getInMemoryBeanProvider();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getInMemoryBeanProvider <em>In Memory Bean Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Memory Bean Provider</em>' containment reference.
	 * @see #getInMemoryBeanProvider()
	 * @generated
	 */
	void setInMemoryBeanProvider(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Description Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Property</em>' containment reference.
	 * @see #setDescriptionProperty(UiNestedProperty)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField_DescriptionProperty()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiNestedProperty getDescriptionProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getDescriptionProperty <em>Description Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Property</em>' containment reference.
	 * @see #getDescriptionProperty()
	 * @generated
	 */
	void setDescriptionProperty(UiNestedProperty value);

	/**
	 * Returns the value of the '<em><b>Reference Source Jvm Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Source Jvm Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Source Jvm Type</em>' containment reference.
	 * @see #setReferenceSourceJvmType(JvmTypeReference)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField_ReferenceSourceJvmType()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	JvmTypeReference getReferenceSourceJvmType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getReferenceSourceJvmType <em>Reference Source Jvm Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Source Jvm Type</em>' containment reference.
	 * @see #getReferenceSourceJvmType()
	 * @generated
	 */
	void setReferenceSourceJvmType(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Reference Source Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Source Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Source Field</em>' reference.
	 * @see #setReferenceSourceField(JvmField)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField_ReferenceSourceField()
	 * @model
	 * @generated
	 */
	JvmField getReferenceSourceField();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField#getReferenceSourceField <em>Reference Source Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Source Field</em>' reference.
	 * @see #getReferenceSourceField()
	 * @generated
	 */
	void setReferenceSourceField(JvmField value);
} // UiBeanReferenceField
