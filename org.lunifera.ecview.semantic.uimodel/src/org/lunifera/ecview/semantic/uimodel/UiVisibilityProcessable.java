/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Processable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable#getProcessorAssignments <em>Processor Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessable()
 * @model abstract="true"
 * @generated
 */
public interface UiVisibilityProcessable extends EObject {
	/**
	 * Returns the value of the '<em><b>Processor Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Assignments</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessable_ProcessorAssignments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiVisibilityProcessorAssignment> getProcessorAssignments();

} // UiVisibilityProcessable
