/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Bean Service Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiBeanServiceConsumer#isConsumeBeanService <em>Consume Bean Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanServiceConsumer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UiBeanServiceConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Consume Bean Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consume Bean Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consume Bean Service</em>' attribute.
	 * @see #setConsumeBeanService(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiBeanServiceConsumer_ConsumeBeanService()
	 * @model
	 * @generated
	 */
	boolean isConsumeBeanService();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiBeanServiceConsumer#isConsumeBeanService <em>Consume Bean Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consume Bean Service</em>' attribute.
	 * @see #isConsumeBeanService()
	 * @generated
	 */
	void setConsumeBeanService(boolean value);

} // UiBeanServiceConsumer
