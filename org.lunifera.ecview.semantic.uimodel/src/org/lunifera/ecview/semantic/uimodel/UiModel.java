/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiModel#getViewSets <em>View Sets</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiModel#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiModel()
 * @model
 * @generated
 */
public interface UiModel extends EObject {
	/**
	 * Returns the value of the '<em><b>View Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiViewSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Sets</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiModel_ViewSets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiViewSet> getViewSets();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiModel_Views()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiView> getViews();

} // UiModel
