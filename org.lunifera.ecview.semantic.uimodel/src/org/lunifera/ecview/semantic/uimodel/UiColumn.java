/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.xtext.common.types.JvmOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isOrderable <em>Orderable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getExpandRatio <em>Expand Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn()
 * @model
 * @generated
 */
public interface UiColumn extends UiField {
	/**
	 * Returns the value of the '<em><b>Getter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' reference.
	 * @see #setGetter(JvmOperation)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_Getter()
	 * @model
	 * @generated
	 */
	JvmOperation getGetter();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getGetter <em>Getter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' reference.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(JvmOperation value);

	/**
	 * Returns the value of the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Name</em>' attribute.
	 * @see #setIconName(String)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_IconName()
	 * @model
	 * @generated
	 */
	String getIconName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getIconName <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Name</em>' attribute.
	 * @see #getIconName()
	 * @generated
	 */
	void setIconName(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Orderable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderable</em>' attribute.
	 * @see #setOrderable(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_Orderable()
	 * @model default="true"
	 * @generated
	 */
	boolean isOrderable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isOrderable <em>Orderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderable</em>' attribute.
	 * @see #isOrderable()
	 * @generated
	 */
	void setOrderable(boolean value);

	/**
	 * Returns the value of the '<em><b>Collapsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsed</em>' attribute.
	 * @see #setCollapsed(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_Collapsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollapsed();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isCollapsed <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed</em>' attribute.
	 * @see #isCollapsed()
	 * @generated
	 */
	void setCollapsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Collapsible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapsible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsible</em>' attribute.
	 * @see #setCollapsible(boolean)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_Collapsible()
	 * @model default="true"
	 * @generated
	 */
	boolean isCollapsible();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#isCollapsible <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsible</em>' attribute.
	 * @see #isCollapsible()
	 * @generated
	 */
	void setCollapsible(boolean value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"LEFT"</code>.
	 * The literals are from the enumeration {@link org.lunifera.ecview.semantic.uimodel.UiFlatAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiFlatAlignment
	 * @see #setAlignment(UiFlatAlignment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_Alignment()
	 * @model default="LEFT"
	 * @generated
	 */
	UiFlatAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.lunifera.ecview.semantic.uimodel.UiFlatAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(UiFlatAlignment value);

	/**
	 * Returns the value of the '<em><b>Expand Ratio</b></em>' attribute.
	 * The default value is <code>"-1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expand Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expand Ratio</em>' attribute.
	 * @see #setExpandRatio(float)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiColumn_ExpandRatio()
	 * @model default="-1.0f"
	 * @generated
	 */
	float getExpandRatio();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiColumn#getExpandRatio <em>Expand Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand Ratio</em>' attribute.
	 * @see #getExpandRatio()
	 * @generated
	 */
	void setExpandRatio(float value);

} // UiColumn
