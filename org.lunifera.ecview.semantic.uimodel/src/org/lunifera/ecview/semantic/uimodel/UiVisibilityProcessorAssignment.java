/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Processor Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessorAlias <em>Processor Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessorAssignment()
 * @model
 * @generated
 */
public interface UiVisibilityProcessorAssignment extends EObject {
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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessorAssignment_Processor()
	 * @model containment="true"
	 * @generated
	 */
	UiVisibilityProcessor getProcessor();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessor <em>Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' containment reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(UiVisibilityProcessor value);

	/**
	 * Returns the value of the '<em><b>Processor Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Alias</em>' reference.
	 * @see #setProcessorAlias(UiVisibilityProcessor)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessorAssignment_ProcessorAlias()
	 * @model
	 * @generated
	 */
	UiVisibilityProcessor getProcessorAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment#getProcessorAlias <em>Processor Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Alias</em>' reference.
	 * @see #getProcessorAlias()
	 * @generated
	 */
	void setProcessorAlias(UiVisibilityProcessor value);

} // UiVisibilityProcessorAssignment
