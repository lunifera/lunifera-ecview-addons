/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui I1 8n Infoable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiI18nInfoable#getI18nInfo <em>I1 8n Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiI18nInfoable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UiI18nInfoable extends EObject {
	/**
	 * Returns the value of the '<em><b>I1 8n Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I1 8n Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I1 8n Info</em>' containment reference.
	 * @see #setI18nInfo(UiI18nInfo)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiI18nInfoable_I18nInfo()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiI18nInfo getI18nInfo();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiI18nInfoable#getI18nInfo <em>I1 8n Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I1 8n Info</em>' containment reference.
	 * @see #getI18nInfo()
	 * @generated
	 */
	void setI18nInfo(UiI18nInfo value);

} // UiI18nInfoable
