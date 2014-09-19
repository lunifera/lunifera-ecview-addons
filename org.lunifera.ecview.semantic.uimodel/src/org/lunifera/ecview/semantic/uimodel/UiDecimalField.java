/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Decimal Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isNoGrouping <em>No Grouping</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isNoMarkNegative <em>No Mark Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDecimalField()
 * @model
 * @generated
 */
public interface UiDecimalField extends UiField {

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDecimalField_Precision()
	 * @model default="2"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>No Grouping</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Grouping</em>' attribute.
	 * @see #setNoGrouping(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDecimalField_NoGrouping()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoGrouping();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isNoGrouping <em>No Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Grouping</em>' attribute.
	 * @see #isNoGrouping()
	 * @generated
	 */
	void setNoGrouping(boolean value);

	/**
	 * Returns the value of the '<em><b>No Mark Negative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Mark Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Mark Negative</em>' attribute.
	 * @see #setNoMarkNegative(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDecimalField_NoMarkNegative()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoMarkNegative();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isNoMarkNegative <em>No Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Mark Negative</em>' attribute.
	 * @see #isNoMarkNegative()
	 * @generated
	 */
	void setNoMarkNegative(boolean value);
} // UiDecimalField
