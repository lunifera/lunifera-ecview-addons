/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmField;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Radio Button Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRadioButtonGroup#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRadioButtonGroup#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRadioButtonGroup#getItemImageProperty <em>Item Image Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRadioButtonGroup()
 * @model
 * @generated
 */
public interface UiRadioButtonGroup extends UiField, UiTypeProvider {

	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.ecview.semantic.uimodel.UiRadioButtonAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' containment reference list.
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRadioButtonGroup_Buttons()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<UiRadioButtonAssignment> getButtons();

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRadioButtonGroup_SelectionType()
	 * @model default="SINGLE" required="true"
	 * @generated
	 */
	UiSelectionType getSelectionType();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRadioButtonGroup#getSelectionType <em>Selection Type</em>}' attribute.
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
	 * @see #setItemImageProperty(JvmField)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRadioButtonGroup_ItemImageProperty()
	 * @model
	 * @generated
	 */
	JvmField getItemImageProperty();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRadioButtonGroup#getItemImageProperty <em>Item Image Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Image Property</em>' reference.
	 * @see #getItemImageProperty()
	 * @generated
	 */
	void setItemImageProperty(JvmField value);
} // UiRadioButtonGroup
