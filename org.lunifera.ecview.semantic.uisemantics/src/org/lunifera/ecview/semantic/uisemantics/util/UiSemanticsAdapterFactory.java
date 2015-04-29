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
package org.lunifera.ecview.semantic.uisemantics.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.lunifera.ecview.semantic.uisemantics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage
 * @generated
 */
public class UiSemanticsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiSemanticsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSemanticsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiSemanticsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiSemanticsSwitch<Adapter> modelSwitch =
		new UiSemanticsSwitch<Adapter>() {
			@Override
			public Adapter caseUxModel(UxModel object) {
				return createUxModelAdapter();
			}
			@Override
			public Adapter caseUxImportSectionDeclaration(UxImportSectionDeclaration object) {
				return createUxImportSectionDeclarationAdapter();
			}
			@Override
			public Adapter caseUxEPackageImport(UxEPackageImport object) {
				return createUxEPackageImportAdapter();
			}
			@Override
			public Adapter caseUxElementDefinition(UxElementDefinition object) {
				return createUxElementDefinitionAdapter();
			}
			@Override
			public Adapter caseUxElementURI(UxElementURI object) {
				return createUxElementURIAdapter();
			}
			@Override
			public Adapter caseUxAvailableBindings(UxAvailableBindings object) {
				return createUxAvailableBindingsAdapter();
			}
			@Override
			public Adapter caseUxAvailableVisibilityOptions(UxAvailableVisibilityOptions object) {
				return createUxAvailableVisibilityOptionsAdapter();
			}
			@Override
			public Adapter caseUxValueBindingEndpointDef(UxValueBindingEndpointDef object) {
				return createUxValueBindingEndpointDefAdapter();
			}
			@Override
			public Adapter caseUxAvailableValidatorProperties(UxAvailableValidatorProperties object) {
				return createUxAvailableValidatorPropertiesAdapter();
			}
			@Override
			public Adapter caseUxValidatorProperty(UxValidatorProperty object) {
				return createUxValidatorPropertyAdapter();
			}
			@Override
			public Adapter caseUxEndpointDef(UxEndpointDef object) {
				return createUxEndpointDefAdapter();
			}
			@Override
			public Adapter caseUxBindingableOption(UxBindingableOption object) {
				return createUxBindingableOptionAdapter();
			}
			@Override
			public Adapter caseUxVisibleableOption(UxVisibleableOption object) {
				return createUxVisibleableOptionAdapter();
			}
			@Override
			public Adapter caseUxAction(UxAction object) {
				return createUxActionAdapter();
			}
			@Override
			public Adapter caseUxViewCategory(UxViewCategory object) {
				return createUxViewCategoryAdapter();
			}
			@Override
			public Adapter caseXImportDeclaration(XImportDeclaration object) {
				return createXImportDeclarationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxModel <em>Ux Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxModel
	 * @generated
	 */
	public Adapter createUxModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxEPackageImport <em>Ux EPackage Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEPackageImport
	 * @generated
	 */
	public Adapter createUxEPackageImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition <em>Ux Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementDefinition
	 * @generated
	 */
	public Adapter createUxElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxElementURI <em>Ux Element URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxElementURI
	 * @generated
	 */
	public Adapter createUxElementURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings <em>Ux Available Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings
	 * @generated
	 */
	public Adapter createUxAvailableBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions <em>Ux Available Visibility Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions
	 * @generated
	 */
	public Adapter createUxAvailableVisibilityOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxEndpointDef <em>Ux Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxEndpointDef
	 * @generated
	 */
	public Adapter createUxEndpointDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef <em>Ux Value Binding Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef
	 * @generated
	 */
	public Adapter createUxValueBindingEndpointDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties <em>Ux Available Validator Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties
	 * @generated
	 */
	public Adapter createUxAvailableValidatorPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxValidatorProperty <em>Ux Validator Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxValidatorProperty
	 * @generated
	 */
	public Adapter createUxValidatorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxBindingableOption <em>Ux Bindingable Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxBindingableOption
	 * @generated
	 */
	public Adapter createUxBindingableOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxVisibleableOption <em>Ux Visibleable Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxVisibleableOption
	 * @generated
	 */
	public Adapter createUxVisibleableOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxAction <em>Ux Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxAction
	 * @generated
	 */
	public Adapter createUxActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxViewCategory <em>Ux View Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxViewCategory
	 * @generated
	 */
	public Adapter createUxViewCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration <em>Ux Import Section Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.ecview.semantic.uisemantics.UxImportSectionDeclaration
	 * @generated
	 */
	public Adapter createUxImportSectionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xtype.XImportDeclaration <em>XImport Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.xtext.xtype.XImportDeclaration
	 * @generated
	 */
	public Adapter createXImportDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UiSemanticsAdapterFactory
