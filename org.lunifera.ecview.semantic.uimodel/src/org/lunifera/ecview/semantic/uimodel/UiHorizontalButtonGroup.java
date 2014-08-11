/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Horizontal Button Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalButtonGroup()
 * @model
 * @generated
 */
public interface UiHorizontalButtonGroup extends UiMobileLayout {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalButtonGroup_Contents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiHorizontalButtonGroupAssigment> getContents();

} // UiHorizontalButtonGroup
