/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Horizontal Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout#getContents <em>Contents</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout#isFillHorizontal <em>Fill Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalLayout()
 * @model
 * @generated
 */
public interface UiHorizontalLayout extends UiLayout {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalLayout_Contents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiHorizontalLayoutAssigment> getContents();

	/**
	 * Returns the value of the '<em><b>Fill Horizontal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Horizontal</em>' attribute.
	 * @see #setFillHorizontal(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiHorizontalLayout_FillHorizontal()
	 * @model default="false"
	 * @generated
	 */
	boolean isFillHorizontal();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout#isFillHorizontal <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Horizontal</em>' attribute.
	 * @see #isFillHorizontal()
	 * @generated
	 */
	void setFillHorizontal(boolean value);

} // UiHorizontalLayout
