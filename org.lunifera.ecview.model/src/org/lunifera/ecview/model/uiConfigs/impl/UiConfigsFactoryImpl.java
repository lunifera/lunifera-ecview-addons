/**
 */
package org.lunifera.ecview.model.uiConfigs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.ecview.model.uiConfigs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiConfigsFactoryImpl extends EFactoryImpl implements UiConfigsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiConfigsFactory init() {
		try {
			UiConfigsFactory theUiConfigsFactory = (UiConfigsFactory)EPackage.Registry.INSTANCE.getEFactory(UiConfigsPackage.eNS_URI);
			if (theUiConfigsFactory != null) {
				return theUiConfigsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiConfigsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiConfigsFactoryImpl() {
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
			case UiConfigsPackage.TEXT_FIELD_CONFIG: return createTextFieldConfig();
			case UiConfigsPackage.BINDING_METHOD: return createBindingMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFieldConfig createTextFieldConfig() {
		TextFieldConfigImpl textFieldConfig = new TextFieldConfigImpl();
		return textFieldConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingMethod createBindingMethod() {
		BindingMethodImpl bindingMethod = new BindingMethodImpl();
		return bindingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiConfigsPackage getUiConfigsPackage() {
		return (UiConfigsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiConfigsPackage getPackage() {
		return UiConfigsPackage.eINSTANCE;
	}

} //UiConfigsFactoryImpl
