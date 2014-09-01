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
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isMarkNegative <em>Mark Negative</em>}</li>
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
	 * Returns the value of the '<em><b>Grouping</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' attribute.
	 * @see #setGrouping(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDecimalField_Grouping()
	 * @model default="true"
	 * @generated
	 */
	boolean isGrouping();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' attribute.
	 * @see #isGrouping()
	 * @generated
	 */
	void setGrouping(boolean value);

	/**
	 * Returns the value of the '<em><b>Mark Negative</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark Negative</em>' attribute.
	 * @see #setMarkNegative(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiDecimalField_MarkNegative()
	 * @model default="true"
	 * @generated
	 */
	boolean isMarkNegative();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiDecimalField#isMarkNegative <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Negative</em>' attribute.
	 * @see #isMarkNegative()
	 * @generated
	 */
	void setMarkNegative(boolean value);
} // UiDecimalField
