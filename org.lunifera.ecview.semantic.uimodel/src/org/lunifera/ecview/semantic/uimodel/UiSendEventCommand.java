/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Send Event Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSendEventCommand#getEventTopic <em>Event Topic</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiSendEventCommand#isNoAutoTrigger <em>No Auto Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSendEventCommand()
 * @model
 * @generated
 */
public interface UiSendEventCommand extends UiCommand {
	/**
	 * Returns the value of the '<em><b>Event Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Topic</em>' attribute.
	 * @see #setEventTopic(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSendEventCommand_EventTopic()
	 * @model
	 * @generated
	 */
	String getEventTopic();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSendEventCommand#getEventTopic <em>Event Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Topic</em>' attribute.
	 * @see #getEventTopic()
	 * @generated
	 */
	void setEventTopic(String value);

	/**
	 * Returns the value of the '<em><b>No Auto Trigger</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Auto Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Auto Trigger</em>' attribute.
	 * @see #setNoAutoTrigger(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiSendEventCommand_NoAutoTrigger()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoAutoTrigger();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiSendEventCommand#isNoAutoTrigger <em>No Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Auto Trigger</em>' attribute.
	 * @see #isNoAutoTrigger()
	 * @generated
	 */
	void setNoAutoTrigger(boolean value);

} // UiSendEventCommand
