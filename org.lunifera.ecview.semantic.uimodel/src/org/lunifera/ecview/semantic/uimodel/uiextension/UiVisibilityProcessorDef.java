/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.lunifera.ecview.semantic.uimodel.UiRootElements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Processor Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorDef#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiVisibilityProcessorDef()
 * @model
 * @generated
 */
public interface UiVisibilityProcessorDef extends UiRootElements {
	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference.
	 * @see #setProcessor(UiVisibilityProcessor)
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiVisibilityProcessorDef_Processor()
	 * @model containment="true"
	 * @generated
	 */
	UiVisibilityProcessor getProcessor();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessorDef#getProcessor <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' containment reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(UiVisibilityProcessor value);

} // UiVisibilityProcessorDef
