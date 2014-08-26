/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Ui Raw Bindable Path Segment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getRawBindable <em>Raw Bindable</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRawBindablePathSegment()
 * @model
 * @generated
 */
public interface UiRawBindablePathSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Raw Bindable</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Bindable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Raw Bindable</em>' reference.
	 * @see #setRawBindable(UiRawBindable)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRawBindablePathSegment_RawBindable()
	 * @model
	 * @generated
	 */
	UiRawBindable getRawBindable();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getRawBindable <em>Raw Bindable</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Raw Bindable</em>' reference.
	 * @see #getRawBindable()
	 * @generated
	 */
	void setRawBindable(UiRawBindable value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(UiRawBindablePathSegment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiRawBindablePathSegment_Path()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiRawBindablePathSegment getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(UiRawBindablePathSegment value);

	/**
	 * Returns the raw bindable for the last segment of the path.
	 * 
	 * @return
	 */
	public UiRawBindable getRawBindableOfLastSegment();

} // UiRawBindablePathSegment
