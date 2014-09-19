/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Date Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDateField#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDateField#getResolution <em>Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDateField()
 * @model
 * @generated
 */
public interface UiDateField extends UiField {

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * The default value is <code>"DATE"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.semantic.uimodel.UiDateFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDateFormat
	 * @see #setDateFormat(UiDateFormat)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDateField_DateFormat()
	 * @model default="DATE"
	 * @generated
	 */
	UiDateFormat getDateFormat();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDateField#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDateFormat
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(UiDateFormat value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.semantic.uimodel.UiDateTimeResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDateTimeResolution
	 * @see #setResolution(UiDateTimeResolution)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDateField_Resolution()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	UiDateTimeResolution getResolution();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDateField#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiDateTimeResolution
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(UiDateTimeResolution value);
} // UiDateField
