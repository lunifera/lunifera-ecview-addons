/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;
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
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityPropertiesAssignment()
 * @model
 * @generated
 */
public interface UiVisibilityPropertiesAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityPropertiesAssignment_Properties()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiVisibilityProperty> getProperties();

} // UiVisibilityPropertiesAssignment
