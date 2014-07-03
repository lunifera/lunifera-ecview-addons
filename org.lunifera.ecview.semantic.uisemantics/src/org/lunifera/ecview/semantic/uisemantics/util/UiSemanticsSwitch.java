/**
 */
package org.lunifera.ecview.semantic.uisemantics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.ecview.semantic.uisemantics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage
 * @generated
 */
public class UiSemanticsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiSemanticsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSemanticsSwitch() {
		if (modelPackage == null) {
			modelPackage = UiSemanticsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UiSemanticsPackage.UX_MODEL: {
				UxModel uxModel = (UxModel)theEObject;
				T result = caseUxModel(uxModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.XIMPORT_DECLARATION: {
				XImportDeclaration xImportDeclaration = (XImportDeclaration)theEObject;
				T result = caseXImportDeclaration(xImportDeclaration);
				if (result == null) result = caseXtype_XImportDeclaration(xImportDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_EPACKAGE_IMPORT: {
				UxEPackageImport uxEPackageImport = (UxEPackageImport)theEObject;
				T result = caseUxEPackageImport(uxEPackageImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION: {
				UxElementDefinition uxElementDefinition = (UxElementDefinition)theEObject;
				T result = caseUxElementDefinition(uxElementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_ELEMENT_URI: {
				UxElementURI uxElementURI = (UxElementURI)theEObject;
				T result = caseUxElementURI(uxElementURI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_AVAILABLE_BINDINGS: {
				UxAvailableBindings uxAvailableBindings = (UxAvailableBindings)theEObject;
				T result = caseUxAvailableBindings(uxAvailableBindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_ENDPOINT_DEF: {
				UxEndpointDef uxEndpointDef = (UxEndpointDef)theEObject;
				T result = caseUxEndpointDef(uxEndpointDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_VALUE_BINDING_ENDPOINT_DEF: {
				UxValueBindingEndpointDef uxValueBindingEndpointDef = (UxValueBindingEndpointDef)theEObject;
				T result = caseUxValueBindingEndpointDef(uxValueBindingEndpointDef);
				if (result == null) result = caseUxEndpointDef(uxValueBindingEndpointDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_LIST_BINDING_ENDPOINT_DEF: {
				UxListBindingEndpointDef uxListBindingEndpointDef = (UxListBindingEndpointDef)theEObject;
				T result = caseUxListBindingEndpointDef(uxListBindingEndpointDef);
				if (result == null) result = caseUxEndpointDef(uxListBindingEndpointDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_SET_BINDING_ENDPOINT_DEF: {
				UxSetBindingEndpointDef uxSetBindingEndpointDef = (UxSetBindingEndpointDef)theEObject;
				T result = caseUxSetBindingEndpointDef(uxSetBindingEndpointDef);
				if (result == null) result = caseUxEndpointDef(uxSetBindingEndpointDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxModel(UxModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XImport Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XImport Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXImportDeclaration(XImportDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux EPackage Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux EPackage Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxEPackageImport(UxEPackageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxElementDefinition(UxElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Element URI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Element URI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxElementURI(UxElementURI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Available Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Available Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxAvailableBindings(UxAvailableBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Endpoint Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxEndpointDef(UxEndpointDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Value Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Value Binding Endpoint Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxValueBindingEndpointDef(UxValueBindingEndpointDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux List Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux List Binding Endpoint Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxListBindingEndpointDef(UxListBindingEndpointDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Set Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Set Binding Endpoint Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxSetBindingEndpointDef(UxSetBindingEndpointDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XImport Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XImport Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtype_XImportDeclaration(org.eclipse.xtext.xtype.XImportDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UiSemanticsSwitch
