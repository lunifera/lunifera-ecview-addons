/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.semantic.uisemantics;

import org.eclipse.xtext.xtype.XImportDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ux Import Section Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration#getImportedEPackage <em>Imported EPackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxImportSectionDeclaration()
 * @model
 * @generated
 */
public interface UxImportSectionDeclaration extends XImportDeclaration {
	/**
	 * Returns the value of the '<em><b>Imported EPackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported EPackage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported EPackage</em>' containment reference.
	 * @see #setImportedEPackage(UxEPackageImport)
	 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage#getUxImportSectionDeclaration_ImportedEPackage()
	 * @model containment="true"
	 * @generated
	 */
	UxEPackageImport getImportedEPackage();

	/**
	 * Sets the value of the '{@link org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration#getImportedEPackage <em>Imported EPackage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported EPackage</em>' containment reference.
	 * @see #getImportedEPackage()
	 * @generated
	 */
	void setImportedEPackage(UxEPackageImport value);

} // UxImportSectionDeclaration
