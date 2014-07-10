/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.UiPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Grid Layout Assigment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getElement <em>Element</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getFrom <em>From</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiGridLayoutAssigment()
 * @model
 * @generated
 */
public interface UiGridLayoutAssigment extends UiModelElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(YEmbeddable)
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiGridLayoutAssigment_Element()
	 * @model containment="true"
	 * @generated
	 */
	YEmbeddable getElement();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(YEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
	 * @see #setAlignment(YAlignment)
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiGridLayoutAssigment_Alignment()
	 * @model
	 * @generated
	 */
	YAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(YAlignment value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(UiPoint)
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiGridLayoutAssigment_From()
	 * @model containment="true"
	 * @generated
	 */
	UiPoint getFrom();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(UiPoint value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(UiPoint)
	 * @see org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage#getUiGridLayoutAssigment_To()
	 * @model containment="true"
	 * @generated
	 */
	UiPoint getTo();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(UiPoint value);

} // UiGridLayoutAssigment
