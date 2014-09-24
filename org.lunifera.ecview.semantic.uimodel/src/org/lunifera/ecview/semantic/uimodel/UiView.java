/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiView#getViewSet <em>View Set</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiView#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiView#getContentAlignment <em>Content Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiView#getValidatorAssignments <em>Validator Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiView()
 * @model
 * @generated
 */
public interface UiView extends UiContext, UiVisibilityProcessable, UiRawBindable {

	/**
	 * Returns the value of the '<em><b>View Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Set</em>' reference.
	 * @see #setViewSet(UiViewSet)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiView_ViewSet()
	 * @model
	 * @generated
	 */
	UiViewSet getViewSet();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiView#getViewSet <em>View Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Set</em>' reference.
	 * @see #getViewSet()
	 * @generated
	 */
	void setViewSet(UiViewSet value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(UiEmbeddable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiView_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiEmbeddable getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiView#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(UiEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Content Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.ecview.semantic.uimodel.UiAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAlignment
	 * @see #setContentAlignment(UiAlignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiView_ContentAlignment()
	 * @model
	 * @generated
	 */
	UiAlignment getContentAlignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiView#getContentAlignment <em>Content Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiAlignment
	 * @see #getContentAlignment()
	 * @generated
	 */
	void setContentAlignment(UiAlignment value);

	/**
	 * Returns the value of the '<em><b>Validator Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Assignments</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiView_ValidatorAssignments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiValidatorAssignment> getValidatorAssignments();
} // UiView
