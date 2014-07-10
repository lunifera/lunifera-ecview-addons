/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiModel#getRoots <em>Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiModel()
 * @model
 * @generated
 */
public interface UiModel extends UiModelElement {
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiRootElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiModel_Roots()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiRootElements> getRoots();

} // UiModel
