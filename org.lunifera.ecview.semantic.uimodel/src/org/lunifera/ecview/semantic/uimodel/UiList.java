/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.xtext.common.types.JvmOperation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiList#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiList#getItemImageProperty <em>Item Image Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiList()
 * @model
 * @generated
 */
public interface UiList extends UiField, UiTypeProvider {

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiList_SelectionType()
	 * @model default="SINGLE" required="true"
	 * @generated
	 */
	UiSelectionType getSelectionType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiList#getSelectionType <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Type</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiSelectionType
	 * @see #getSelectionType()
	 * @generated
	 */
	void setSelectionType(UiSelectionType value);

	/**
	 * Returns the value of the '<em><b>Item Image Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Image Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Image Property</em>' reference.
	 * @see #setItemImageProperty(JvmOperation)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiList_ItemImageProperty()
	 * @model
	 * @generated
	 */
	JvmOperation getItemImageProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiList#getItemImageProperty <em>Item Image Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Image Property</em>' reference.
	 * @see #getItemImageProperty()
	 * @generated
	 */
	void setItemImageProperty(JvmOperation value);
} // UiList
