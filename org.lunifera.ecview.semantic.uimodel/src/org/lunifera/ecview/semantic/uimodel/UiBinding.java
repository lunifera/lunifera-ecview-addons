/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Ui Binding</b></em>'. <!-- end-user-doc -->
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
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBinding()
 * @model
 * @generated
 */
public interface UiBinding extends UiModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(UiBindingEndpointDef)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBinding_Source()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingEndpointDef getSource();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UiBindingEndpointDef value);

	/**
	 * Returns the value of the '<em><b>Source Alias</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Alias</em>' reference.
	 * @see #setSourceAlias(UiBindingEndpointAlias)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBinding_SourceAlias()
	 * @model
	 * @generated
	 */
	UiBindingEndpointAlias getSourceAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getSourceAlias <em>Source Alias</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source Alias</em>' reference.
	 * @see #getSourceAlias()
	 * @generated
	 */
	void setSourceAlias(UiBindingEndpointAlias value);

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
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBinding_TargetToSource()
	 * @model
	 * @generated
	 */
	boolean isTargetToSource();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isTargetToSource <em>Target To Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBinding_SourceToTarget()
	 * @model
	 * @generated
	 */
	boolean isSourceToTarget();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#isSourceToTarget <em>Source To Target</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source To Target</em>' attribute.
	 * @see #isSourceToTarget()
	 * @generated
	 */
	void setSourceToTarget(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(UiBindingEndpointDef)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBinding_Target()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiBindingEndpointDef getTarget();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UiBindingEndpointDef value);

	/**
	 * Returns the value of the '<em><b>Target Alias</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Alias</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Alias</em>' reference.
	 * @see #setTargetAlias(UiBindingEndpointAlias)
	 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage#getUiBinding_TargetAlias()
	 * @model
	 * @generated
	 */
	UiBindingEndpointAlias getTargetAlias();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBinding#getTargetAlias <em>Target Alias</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Target Alias</em>' reference.
	 * @see #getTargetAlias()
	 * @generated
	 */
	void setTargetAlias(UiBindingEndpointAlias value);

	/**
	 * Returns the source endpoint definition of the semantic ui definitions.
	 * Therefore {@link #getSource()} and {@link #getSourceAlias()} are used.
	 * 
	 * @return
	 */
	UxEndpointDef getSourceEndpointDef();

	/**
	 * Returns the target endpoint definition of the semantic ui definitions.
	 * Therefore {@link #getTarget()} and {@link #getTargetAlias()} are used.
	 * 
	 * @return
	 */
	UxEndpointDef getTargetEndpointDef();

} // UiBinding
