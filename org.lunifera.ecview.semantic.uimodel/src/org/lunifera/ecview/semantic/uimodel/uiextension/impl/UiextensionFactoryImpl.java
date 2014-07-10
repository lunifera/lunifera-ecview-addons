/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiList;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiXbaseVisibilityRule;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionFactory;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiextensionFactoryImpl extends EFactoryImpl implements UiextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiextensionFactory init() {
		try {
			UiextensionFactory theUiextensionFactory = (UiextensionFactory)EPackage.Registry.INSTANCE.getEFactory(UiextensionPackage.eNS_URI);
			if (theUiextensionFactory != null) {
				return theUiextensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiextensionFactoryImpl() {
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
			case UiextensionPackage.UI_GRID_LAYOUT_ASSIGMENT: return createUiGridLayoutAssigment();
			case UiextensionPackage.UI_GRID_LAYOUT: return createUiGridLayout();
			case UiextensionPackage.UI_TEXT_FIELD: return createUiTextField();
			case UiextensionPackage.UI_LIST: return createUiList();
			case UiextensionPackage.UI_NUMERIC_FIELD: return createUiNumericField();
			case UiextensionPackage.UI_CHECK_BOX: return createUiCheckBox();
			case UiextensionPackage.UI_VISIBILITY_PROCESSOR: return createUiVisibilityProcessor();
			case UiextensionPackage.UI_CHANGE_TRIGGER: return createUiChangeTrigger();
			case UiextensionPackage.UI_XBASE_VISIBILITY_RULE: return createUiXbaseVisibilityRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiGridLayoutAssigment createUiGridLayoutAssigment() {
		UiGridLayoutAssigmentImpl uiGridLayoutAssigment = new UiGridLayoutAssigmentImpl();
		return uiGridLayoutAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiGridLayout createUiGridLayout() {
		UiGridLayoutImpl uiGridLayout = new UiGridLayoutImpl();
		return uiGridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTextField createUiTextField() {
		UiTextFieldImpl uiTextField = new UiTextFieldImpl();
		return uiTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiList createUiList() {
		UiListImpl uiList = new UiListImpl();
		return uiList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiNumericField createUiNumericField() {
		UiNumericFieldImpl uiNumericField = new UiNumericFieldImpl();
		return uiNumericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiCheckBox createUiCheckBox() {
		UiCheckBoxImpl uiCheckBox = new UiCheckBoxImpl();
		return uiCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiVisibilityProcessor createUiVisibilityProcessor() {
		UiVisibilityProcessorImpl uiVisibilityProcessor = new UiVisibilityProcessorImpl();
		return uiVisibilityProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiChangeTrigger createUiChangeTrigger() {
		UiChangeTriggerImpl uiChangeTrigger = new UiChangeTriggerImpl();
		return uiChangeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiXbaseVisibilityRule createUiXbaseVisibilityRule() {
		UiXbaseVisibilityRuleImpl uiXbaseVisibilityRule = new UiXbaseVisibilityRuleImpl();
		return uiXbaseVisibilityRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiextensionPackage getUiextensionPackage() {
		return (UiextensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiextensionPackage getPackage() {
		return UiextensionPackage.eINSTANCE;
	}

} //UiextensionFactoryImpl
