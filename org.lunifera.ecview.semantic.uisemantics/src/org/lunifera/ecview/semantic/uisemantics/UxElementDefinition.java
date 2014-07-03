/**
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getUri <em>Uri</em>}</li>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getBindingContainer <em>Binding Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxElementDefinition()
 * @model
 * @generated
 */
public interface UxElementDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxElementDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(UxElementURI)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxElementDefinition_Uri()
	 * @model containment="true"
	 * @generated
	 */
	UxElementURI getUri();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(UxElementURI value);

	/**
	 * Returns the value of the '<em><b>Binding Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Container</em>' containment reference.
	 * @see #setBindingContainer(UxAvailableBindings)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxElementDefinition_BindingContainer()
	 * @model containment="true"
	 * @generated
	 */
	UxAvailableBindings getBindingContainer();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition#getBindingContainer <em>Binding Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Container</em>' containment reference.
	 * @see #getBindingContainer()
	 * @generated
	 */
	void setBindingContainer(UxAvailableBindings value);

} // UxElementDefinition
