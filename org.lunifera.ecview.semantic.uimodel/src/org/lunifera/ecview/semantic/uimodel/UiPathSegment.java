/**
 */
package org.lunifera.ecview.semantic.uimodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Ui Path Segment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment#getPath <em>Path</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment#getGetter <em>Getter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiPathSegment()
 * @model
 * @generated
 */
public interface UiPathSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(UiPathSegment)
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiPathSegment_Path()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UiPathSegment getPath();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(UiPathSegment value);

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
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#getUiPathSegment_Getter()
	 * @model
	 * @generated
	 */
	JvmOperation getGetter();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uimodel.UiPathSegment#getGetter <em>Getter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' reference.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(JvmOperation value);

	/**
	 * Returns the path in dot notation from this segment to the last child.
	 * 
	 * @return
	 */
	public String toPathString();
	
	
	/**
	 * Returns the type of the last segment.
	 * 
	 * @return
	 */
	public JvmType getTypeofLastSegment();
	
	/**
	 * Returns the type of the second last segment.
	 * 
	 * @return
	 */
	public JvmType getTypeofSecondLastSegment();
	
	/**
	 * Returns the operation of the last segment.
	 * 
	 * @return
	 */
	public JvmOperation getOperationofLastSegment();
	
} // UiPathSegment
