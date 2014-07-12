/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Properties Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getPropertyAlias <em>Property Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityPropertiesAssignment()
 * @model
 * @generated
 */
public interface UiVisibilityPropertiesAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(UiVisibilityProperties)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityPropertiesAssignment_Properties()
	 * @model containment="true"
	 * @generated
	 */
	UiVisibilityProperties getProperties();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(UiVisibilityProperties value);

	/**
	 * Returns the value of the '<em><b>Property Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Alias</em>' reference.
	 * @see #setPropertyAlias(UiVisibilityProperties)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityPropertiesAssignment_PropertyAlias()
	 * @model
	 * @generated
	 */
	UiVisibilityProperties getPropertyAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment#getPropertyAlias <em>Property Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Alias</em>' reference.
	 * @see #getPropertyAlias()
	 * @generated
	 */
	void setPropertyAlias(UiVisibilityProperties value);

} // UiVisibilityPropertiesAssignment
