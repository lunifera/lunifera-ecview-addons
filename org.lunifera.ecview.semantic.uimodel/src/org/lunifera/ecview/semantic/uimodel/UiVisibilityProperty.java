/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty#getBindableDef <em>Bindable Def</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty#getAssignmentExpression <em>Assignment Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProperty()
 * @model
 * @generated
 */
public interface UiVisibilityProperty extends UiNamedElement {
	/**
	 * Returns the value of the '<em><b>Bindable Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindable Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindable Def</em>' containment reference.
	 * @see #setBindableDef(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProperty_BindableDef()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingExpression getBindableDef();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty#getBindableDef <em>Bindable Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindable Def</em>' containment reference.
	 * @see #getBindableDef()
	 * @generated
	 */
	void setBindableDef(UiBindingExpression value);

	/**
	 * Returns the value of the '<em><b>Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Expression</em>' containment reference.
	 * @see #setAssignmentExpression(XExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProperty_AssignmentExpression()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	XExpression getAssignmentExpression();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty#getAssignmentExpression <em>Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Expression</em>' containment reference.
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	void setAssignmentExpression(XExpression value);

} // UiVisibilityProperty
