/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Mobile Tab Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileTabSheet()
 * @model
 * @generated
 */
public interface UiMobileTabSheet extends UiMobileEmbeddable {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiMobileTabSheet_Tabs()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiMobileTabAssignment> getTabs();

} // UiMobileTabSheet
