/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Columns Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumnsAssignment()
 * @model
 * @generated
 */
public interface UiColumnsAssignment extends UiField {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumnsAssignment_Columns()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiColumn> getColumns();

} // UiColumnsAssignment
