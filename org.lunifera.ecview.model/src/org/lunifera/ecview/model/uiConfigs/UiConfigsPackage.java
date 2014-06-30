/**
 */
package org.lunifera.ecview.model.uiConfigs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.model.uiConfigs.UiConfigsFactory
 * @model kind="package"
 * @generated
 */
public interface UiConfigsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uiConfigs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/ecview/uiconfigs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uiConfigs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiConfigsPackage eINSTANCE = org.lunifera.ecview.model.uiConfigs.impl.UiConfigsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.model.uiConfigs.impl.TextFieldConfigImpl <em>Text Field Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.model.uiConfigs.impl.TextFieldConfigImpl
	 * @see org.lunifera.ecview.model.uiConfigs.impl.UiConfigsPackageImpl#getTextFieldConfig()
	 * @generated
	 */
	int TEXT_FIELD_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Binding Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_CONFIG__BINDING_METHODS = 0;

	/**
	 * The number of structural features of the '<em>Text Field Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text Field Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.model.uiConfigs.impl.BindingMethodImpl <em>Binding Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.model.uiConfigs.impl.BindingMethodImpl
	 * @see org.lunifera.ecview.model.uiConfigs.impl.UiConfigsPackageImpl#getBindingMethod()
	 * @generated
	 */
	int BINDING_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_METHOD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Binding Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_METHOD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_METHOD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.model.uiConfigs.TextFieldConfig <em>Text Field Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field Config</em>'.
	 * @see org.lunifera.ecview.model.uiConfigs.TextFieldConfig
	 * @generated
	 */
	EClass getTextFieldConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.model.uiConfigs.TextFieldConfig#getBindingMethods <em>Binding Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding Methods</em>'.
	 * @see org.lunifera.ecview.model.uiConfigs.TextFieldConfig#getBindingMethods()
	 * @see #getTextFieldConfig()
	 * @generated
	 */
	EReference getTextFieldConfig_BindingMethods();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.model.uiConfigs.BindingMethod <em>Binding Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Method</em>'.
	 * @see org.lunifera.ecview.model.uiConfigs.BindingMethod
	 * @generated
	 */
	EClass getBindingMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.model.uiConfigs.BindingMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.ecview.model.uiConfigs.BindingMethod#getName()
	 * @see #getBindingMethod()
	 * @generated
	 */
	EAttribute getBindingMethod_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiConfigsFactory getUiConfigsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.model.uiConfigs.impl.TextFieldConfigImpl <em>Text Field Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.model.uiConfigs.impl.TextFieldConfigImpl
		 * @see org.lunifera.ecview.model.uiConfigs.impl.UiConfigsPackageImpl#getTextFieldConfig()
		 * @generated
		 */
		EClass TEXT_FIELD_CONFIG = eINSTANCE.getTextFieldConfig();

		/**
		 * The meta object literal for the '<em><b>Binding Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_FIELD_CONFIG__BINDING_METHODS = eINSTANCE.getTextFieldConfig_BindingMethods();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.model.uiConfigs.impl.BindingMethodImpl <em>Binding Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.model.uiConfigs.impl.BindingMethodImpl
		 * @see org.lunifera.ecview.model.uiConfigs.impl.UiConfigsPackageImpl#getBindingMethod()
		 * @generated
		 */
		EClass BINDING_METHOD = eINSTANCE.getBindingMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_METHOD__NAME = eINSTANCE.getBindingMethod_Name();

	}

} //UiConfigsPackage
