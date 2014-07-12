/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiLayout;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiGridLayout()
 * @model
 * @generated
 */
public interface UiGridLayout extends YGridLayout, UiLayout {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiGridLayout_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<UiGridLayoutAssigment> getContents();

} // UiGridLayout
