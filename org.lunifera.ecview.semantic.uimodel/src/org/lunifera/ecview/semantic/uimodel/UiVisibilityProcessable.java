/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Processable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable#getProcessorAssignment <em>Processor Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessable()
 * @model abstract="true"
 * @generated
 */
public interface UiVisibilityProcessable extends EObject {
	/**
	 * Returns the value of the '<em><b>Processor Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Assignment</em>' containment reference.
	 * @see #setProcessorAssignment(UiVisibilityProcessorAssignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessable_ProcessorAssignment()
	 * @model containment="true"
	 * @generated
	 */
	UiVisibilityProcessorAssignment getProcessorAssignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable#getProcessorAssignment <em>Processor Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Assignment</em>' containment reference.
	 * @see #getProcessorAssignment()
	 * @generated
	 */
	void setProcessorAssignment(UiVisibilityProcessorAssignment value);

} // UiVisibilityProcessable
