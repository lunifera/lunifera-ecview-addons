/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Visibility Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getBindingAlias <em>Binding Alias</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getChangeTrigger <em>Change Trigger</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getRule <em>Rule</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getPropertiesAssignment <em>Properties Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor()
 * @model
 * @generated
 */
public interface UiVisibilityProcessor extends UiNamedElement {
	/**
	 * Returns the value of the '<em><b>Binding Alias</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Alias</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor_BindingAlias()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBindingEndpointAlias> getBindingAlias();

	/**
	 * Returns the value of the '<em><b>Change Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Trigger</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor_ChangeTrigger()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiChangeTrigger> getChangeTrigger();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(UiVisibilityRule)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor_Rule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiVisibilityRule getRule();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(UiVisibilityRule value);

	/**
	 * Returns the value of the '<em><b>Properties Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Assignment</em>' containment reference.
	 * @see #setPropertiesAssignment(UiVisibilityPropertiesAssignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor_PropertiesAssignment()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiVisibilityPropertiesAssignment getPropertiesAssignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getPropertiesAssignment <em>Properties Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Assignment</em>' containment reference.
	 * @see #getPropertiesAssignment()
	 * @generated
	 */
	void setPropertiesAssignment(UiVisibilityPropertiesAssignment value);

} // UiVisibilityProcessor
