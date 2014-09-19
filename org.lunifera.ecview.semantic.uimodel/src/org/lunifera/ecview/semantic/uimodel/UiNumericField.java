/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Numeric Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isNoGrouping <em>No Grouping</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isNoMarkNegative <em>No Mark Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNumericField()
 * @model
 * @generated
 */
public interface UiNumericField extends UiField {

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNumericField_NoGrouping()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoGrouping();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isNoGrouping <em>No Grouping</em>}' attribute.
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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNumericField_NoMarkNegative()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoMarkNegative();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isNoMarkNegative <em>No Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Mark Negative</em>' attribute.
	 * @see #isNoMarkNegative()
	 * @generated
	 */
	void setNoMarkNegative(boolean value);
} // UiNumericField
