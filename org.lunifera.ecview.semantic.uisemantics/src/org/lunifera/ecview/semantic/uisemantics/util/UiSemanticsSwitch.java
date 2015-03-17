/**
 */
package org.lunifera.ecview.semantic.uisemantics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.xtext.xtype.XImportDeclaration;
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
			case UiSemanticsPackage.UX_IMPORT_SECTION_DECLARATION: {
				UxImportSectionDeclaration uxImportSectionDeclaration = (UxImportSectionDeclaration)theEObject;
				T result = caseUxImportSectionDeclaration(uxImportSectionDeclaration);
				if (result == null) result = caseXImportDeclaration(uxImportSectionDeclaration);
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
			case UiSemanticsPackage.UX_AVAILABLE_VISIBILITY_OPTIONS: {
				UxAvailableVisibilityOptions uxAvailableVisibilityOptions = (UxAvailableVisibilityOptions)theEObject;
				T result = caseUxAvailableVisibilityOptions(uxAvailableVisibilityOptions);
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
			case UiSemanticsPackage.UX_AVAILABLE_VALIDATOR_PROPERTIES: {
				UxAvailableValidatorProperties uxAvailableValidatorProperties = (UxAvailableValidatorProperties)theEObject;
				T result = caseUxAvailableValidatorProperties(uxAvailableValidatorProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_VALIDATOR_PROPERTY: {
				UxValidatorProperty uxValidatorProperty = (UxValidatorProperty)theEObject;
				T result = caseUxValidatorProperty(uxValidatorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_ENDPOINT_DEF: {
				UxEndpointDef uxEndpointDef = (UxEndpointDef)theEObject;
				T result = caseUxEndpointDef(uxEndpointDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_BINDINGABLE_OPTION: {
				UxBindingableOption uxBindingableOption = (UxBindingableOption)theEObject;
				T result = caseUxBindingableOption(uxBindingableOption);
				if (result == null) result = caseUxEndpointDef(uxBindingableOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_VISIBLEABLE_OPTION: {
				UxVisibleableOption uxVisibleableOption = (UxVisibleableOption)theEObject;
				T result = caseUxVisibleableOption(uxVisibleableOption);
				if (result == null) result = caseUxEndpointDef(uxVisibleableOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_ACTION: {
				UxAction uxAction = (UxAction)theEObject;
				T result = caseUxAction(uxAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiSemanticsPackage.UX_VIEW_CATEGORY: {
				UxViewCategory uxViewCategory = (UxViewCategory)theEObject;
				T result = caseUxViewCategory(uxViewCategory);
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
	 * Returns the result of interpreting the object as an instance of '<em>Ux Available Visibility Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Available Visibility Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxAvailableVisibilityOptions(UxAvailableVisibilityOptions object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ux Available Validator Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Available Validator Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxAvailableValidatorProperties(UxAvailableValidatorProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Validator Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Validator Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxValidatorProperty(UxValidatorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Bindingable Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Bindingable Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxBindingableOption(UxBindingableOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Visibleable Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Visibleable Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxVisibleableOption(UxVisibleableOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxAction(UxAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux View Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux View Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxViewCategory(UxViewCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ux Import Section Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ux Import Section Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUxImportSectionDeclaration(UxImportSectionDeclaration object) {
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
