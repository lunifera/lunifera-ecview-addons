/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.lunifera.ecview.semantic.uimodel.UiRootElements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Properties Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesDef#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiVisibilityPropertiesDef()
 * @model
 * @generated
 */
public interface UiVisibilityPropertiesDef extends UiRootElements {
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
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiVisibilityPropertiesDef_Properties()
	 * @model containment="true"
	 * @generated
	 */
	UiVisibilityProperties getProperties();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityPropertiesDef#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(UiVisibilityProperties value);

} // UiVisibilityPropertiesDef
