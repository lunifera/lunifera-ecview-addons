/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSource <em>Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSourceAlias <em>Source Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isTargetToSource <em>Target To Source</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isSourceToTarget <em>Source To Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTarget <em>Target</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTargetAlias <em>Target Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBinding()
 * @model
 * @generated
 */
public interface UiBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBinding_Source()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingExpression getSource();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UiBindingExpression value);

	/**
	 * Returns the value of the '<em><b>Source Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Alias</em>' reference.
	 * @see #setSourceAlias(UiTypedBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBinding_SourceAlias()
	 * @model
	 * @generated
	 */
	UiTypedBindable getSourceAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSourceAlias <em>Source Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Alias</em>' reference.
	 * @see #getSourceAlias()
	 * @generated
	 */
	void setSourceAlias(UiTypedBindable value);

	/**
	 * Returns the value of the '<em><b>Target To Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target To Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target To Source</em>' attribute.
	 * @see #setTargetToSource(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBinding_TargetToSource()
	 * @model
	 * @generated
	 */
	boolean isTargetToSource();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isTargetToSource <em>Target To Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target To Source</em>' attribute.
	 * @see #isTargetToSource()
	 * @generated
	 */
	void setTargetToSource(boolean value);

	/**
	 * Returns the value of the '<em><b>Source To Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source To Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source To Target</em>' attribute.
	 * @see #setSourceToTarget(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBinding_SourceToTarget()
	 * @model
	 * @generated
	 */
	boolean isSourceToTarget();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isSourceToTarget <em>Source To Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source To Target</em>' attribute.
	 * @see #isSourceToTarget()
	 * @generated
	 */
	void setSourceToTarget(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(UiBindingExpression)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBinding_Target()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingExpression getTarget();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UiBindingExpression value);

	/**
	 * Returns the value of the '<em><b>Target Alias</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Alias</em>' reference.
	 * @see #setTargetAlias(UiTypedBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBinding_TargetAlias()
	 * @model
	 * @generated
	 */
	UiTypedBindable getTargetAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTargetAlias <em>Target Alias</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Alias</em>' reference.
	 * @see #getTargetAlias()
	 * @generated
	 */
	void setTargetAlias(UiTypedBindable value);

} // UiBinding
