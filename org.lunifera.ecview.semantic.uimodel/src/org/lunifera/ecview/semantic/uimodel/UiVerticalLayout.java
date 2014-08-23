/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Vertical Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVerticalLayout#getContents <em>Contents</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVerticalLayout#isFillVertical <em>Fill Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVerticalLayout()
 * @model
 * @generated
 */
public interface UiVerticalLayout extends UiLayout {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVerticalLayout_Contents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiVerticalLayoutAssigment> getContents();

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVerticalLayout_FillVertical()
	 * @model default="false"
	 * @generated
	 */
	boolean isFillVertical();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVerticalLayout#isFillVertical <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Vertical</em>' attribute.
	 * @see #isFillVertical()
	 * @generated
	 */
	void setFillVertical(boolean value);

} // UiVerticalLayout
