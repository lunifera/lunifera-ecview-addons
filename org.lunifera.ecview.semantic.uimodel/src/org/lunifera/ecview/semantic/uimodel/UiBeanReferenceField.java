/**
 */
package org.lunifera.ecview.semantic.uimodel;

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
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanReferenceField()
 * @model
 * @generated
 */
public interface UiBeanReferenceField extends UiField, UiMobileField, UiTypeProvider {

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
} // UiBeanReferenceField
