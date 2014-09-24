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
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getDataUsed <em>Data Used</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getChangeTriggers <em>Change Triggers</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getImportedElements <em>Imported Elements</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor()
 * @model
 * @generated
 */
public interface UiVisibilityProcessor extends UiNamedElement {
	/**
	 * Returns the value of the '<em><b>Data Used</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Used</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Used</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor_DataUsed()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBindingEndpointAlias> getDataUsed();

	/**
	 * Returns the value of the '<em><b>Change Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiChangeTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Triggers</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor_ChangeTriggers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiChangeTrigger> getChangeTriggers();

	/**
	 * Returns the value of the '<em><b>Imported Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiBindingExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Elements</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiVisibilityProcessor_ImportedElements()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiBindingExpression> getImportedElements();

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

} // UiVisibilityProcessor
