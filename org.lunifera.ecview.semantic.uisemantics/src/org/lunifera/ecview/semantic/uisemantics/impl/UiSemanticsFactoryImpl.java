/**
 */
package org.lunifera.ecview.semantic.uisemantics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.ecview.semantic.uisemantics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiSemanticsFactoryImpl extends EFactoryImpl implements UiSemanticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiSemanticsFactory init() {
		try {
			UiSemanticsFactory theUiSemanticsFactory = (UiSemanticsFactory)EPackage.Registry.INSTANCE.getEFactory(UiSemanticsPackage.eNS_URI);
			if (theUiSemanticsFactory != null) {
				return theUiSemanticsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiSemanticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSemanticsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UiSemanticsPackage.UX_MODEL: return createUxModel();
			case UiSemanticsPackage.XIMPORT_DECLARATION: return createXImportDeclaration();
			case UiSemanticsPackage.UX_EPACKAGE_IMPORT: return createUxEPackageImport();
			case UiSemanticsPackage.UX_ELEMENT_DEFINITION: return createUxElementDefinition();
			case UiSemanticsPackage.UX_ELEMENT_URI: return createUxElementURI();
			case UiSemanticsPackage.UX_AVAILABLE_BINDINGS: return createUxAvailableBindings();
			case UiSemanticsPackage.UX_ENDPOINT_DEF: return createUxEndpointDef();
			case UiSemanticsPackage.UX_VALUE_BINDING_ENDPOINT_DEF: return createUxValueBindingEndpointDef();
			case UiSemanticsPackage.UX_LIST_BINDING_ENDPOINT_DEF: return createUxListBindingEndpointDef();
			case UiSemanticsPackage.UX_SET_BINDING_ENDPOINT_DEF: return createUxSetBindingEndpointDef();
			case UiSemanticsPackage.UX_AVAILABLE_VISIBILITY_OPTIONS: return createUxAvailableVisibilityOptions();
			case UiSemanticsPackage.UX_VISIBILITY_OPTION: return createUxVisibilityOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxModel createUxModel() {
		UxModelImpl uxModel = new UxModelImpl();
		return uxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XImportDeclaration createXImportDeclaration() {
		XImportDeclarationImpl xImportDeclaration = new XImportDeclarationImpl();
		return xImportDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxEPackageImport createUxEPackageImport() {
		UxEPackageImportImpl uxEPackageImport = new UxEPackageImportImpl();
		return uxEPackageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxElementDefinition createUxElementDefinition() {
		UxElementDefinitionImpl uxElementDefinition = new UxElementDefinitionImpl();
		return uxElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxElementURI createUxElementURI() {
		UxElementURIImpl uxElementURI = new UxElementURIImpl();
		return uxElementURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxAvailableBindings createUxAvailableBindings() {
		UxAvailableBindingsImpl uxAvailableBindings = new UxAvailableBindingsImpl();
		return uxAvailableBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxEndpointDef createUxEndpointDef() {
		UxEndpointDefImpl uxEndpointDef = new UxEndpointDefImpl();
		return uxEndpointDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxValueBindingEndpointDef createUxValueBindingEndpointDef() {
		UxValueBindingEndpointDefImpl uxValueBindingEndpointDef = new UxValueBindingEndpointDefImpl();
		return uxValueBindingEndpointDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxListBindingEndpointDef createUxListBindingEndpointDef() {
		UxListBindingEndpointDefImpl uxListBindingEndpointDef = new UxListBindingEndpointDefImpl();
		return uxListBindingEndpointDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxSetBindingEndpointDef createUxSetBindingEndpointDef() {
		UxSetBindingEndpointDefImpl uxSetBindingEndpointDef = new UxSetBindingEndpointDefImpl();
		return uxSetBindingEndpointDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxAvailableVisibilityOptions createUxAvailableVisibilityOptions() {
		UxAvailableVisibilityOptionsImpl uxAvailableVisibilityOptions = new UxAvailableVisibilityOptionsImpl();
		return uxAvailableVisibilityOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UxVisibilityOption createUxVisibilityOption() {
		UxVisibilityOptionImpl uxVisibilityOption = new UxVisibilityOptionImpl();
		return uxVisibilityOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSemanticsPackage getUiSemanticsPackage() {
		return (UiSemanticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiSemanticsPackage getPackage() {
		return UiSemanticsPackage.eINSTANCE;
	}

} //UiSemanticsFactoryImpl
