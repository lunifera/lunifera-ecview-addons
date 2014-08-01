/**
 */
package org.lunifera.ecview.semantic.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTable#getColumnAssignment <em>Column Assignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiTable#getSelectionType <em>Selection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTable()
 * @model
 * @generated
 */
public interface UiTable extends UiField, UiTypeProvider {
	/**
	 * Returns the value of the '<em><b>Column Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Assignment</em>' containment reference.
	 * @see #setColumnAssignment(UiColumnAssignments)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTable_ColumnAssignment()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiColumnAssignments getColumnAssignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTable#getColumnAssignment <em>Column Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Assignment</em>' containment reference.
	 * @see #getColumnAssignment()
	 * @generated
	 */
	void setColumnAssignment(UiColumnAssignments value);

	/**
	 * Returns the value of the '<em><b>Selection Type</b></em>' attribute.
	 * The default value is <code>"SINGLE"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.semantic.uimodel.UiSelectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Type</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSelectionType
	 * @see #setSelectionType(UiSelectionType)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiTable_SelectionType()
	 * @model default="SINGLE" required="true"
	 * @generated
	 */
	UiSelectionType getSelectionType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiTable#getSelectionType <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Type</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSelectionType
	 * @see #getSelectionType()
	 * @generated
	 */
	void setSelectionType(UiSelectionType value);

} // UiTable
