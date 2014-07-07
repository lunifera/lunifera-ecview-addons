/**
 */
package org.lunifera.ecview.semantic.uimodel.uiextension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiList;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField;
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
