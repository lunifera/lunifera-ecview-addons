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
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isMarkNegative <em>Mark Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNumericField()
 * @model
 * @generated
 */
public interface UiNumericField extends UiField {

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNumericField_Grouping()
	 * @model default="true"
	 * @generated
	 */
	boolean isGrouping();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isGrouping <em>Grouping</em>}' attribute.
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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiNumericField_MarkNegative()
	 * @model default="true"
	 * @generated
	 */
	boolean isMarkNegative();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiNumericField#isMarkNegative <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Negative</em>' attribute.
	 * @see #isMarkNegative()
	 * @generated
	 */
	void setMarkNegative(boolean value);
} // UiNumericField
