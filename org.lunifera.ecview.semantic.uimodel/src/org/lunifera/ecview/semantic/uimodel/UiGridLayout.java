/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#getContents <em>Contents</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#isFillHorizontal <em>Fill Horizontal</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#isFillVertical <em>Fill Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiGridLayout()
 * @model
 * @generated
 */
public interface UiGridLayout extends UiLayout {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiGridLayout_Contents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiGridLayoutAssigment> getContents();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiGridLayout_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiGridLayout_FillHorizontal()
	 * @model default="false"
	 * @generated
	 */
	boolean isFillHorizontal();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#isFillHorizontal <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Horizontal</em>' attribute.
	 * @see #isFillHorizontal()
	 * @generated
	 */
	void setFillHorizontal(boolean value);

	/**
	 * Returns the value of the '<em><b>Fill Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Vertical</em>' attribute.
	 * @see #setFillVertical(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiGridLayout_FillVertical()
	 * @model default="false"
	 * @generated
	 */
	boolean isFillVertical();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiGridLayout#isFillVertical <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Vertical</em>' attribute.
	 * @see #isFillVertical()
	 * @generated
	 */
	void setFillVertical(boolean value);

} // UiGridLayout
