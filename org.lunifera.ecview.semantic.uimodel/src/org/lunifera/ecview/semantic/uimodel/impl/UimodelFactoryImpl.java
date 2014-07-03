/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.ecview.semantic.uimodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UimodelFactoryImpl extends EFactoryImpl implements UimodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UimodelFactory init() {
		try {
			UimodelFactory theUimodelFactory = (UimodelFactory)EPackage.Registry.INSTANCE.getEFactory(UimodelPackage.eNS_URI);
			if (theUimodelFactory != null) {
				return theUimodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UimodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelFactoryImpl() {
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
			case UimodelPackage.UI_MODEL: return createUiModel();
			case UimodelPackage.UI_IDE_VIEW: return createUiIDEView();
			case UimodelPackage.UI_GRID_LAYOUT_ASSIGMENT: return createUiGridLayoutAssigment();
			case UimodelPackage.UI_POINT: return createUiPoint();
			case UimodelPackage.UI_BINDING: return createUiBinding();
			case UimodelPackage.UI_SOURCE_BINDING_ENDPOINT: return createUiSourceBindingEndpoint();
			case UimodelPackage.UI_TARGET_BINDING_ENDPOINT: return createUiTargetBindingEndpoint();
			case UimodelPackage.UI_PATH_SEGMENT: return createUiPathSegment();
			case UimodelPackage.UI_BEAN_SLOT: return createUiBeanSlot();
			case UimodelPackage.UI_GRID_LAYOUT: return createUiGridLayout();
			case UimodelPackage.UI_TEXT_FIELD: return createUiTextField();
			case UimodelPackage.UI_LIST: return createUiList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModel createUiModel() {
		UiModelImpl uiModel = new UiModelImpl();
		return uiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiIDEView createUiIDEView() {
		UiIDEViewImpl uiIDEView = new UiIDEViewImpl();
		return uiIDEView;
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
	public UiPoint createUiPoint() {
		UiPointImpl uiPoint = new UiPointImpl();
		return uiPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBinding createUiBinding() {
		UiBindingImpl uiBinding = new UiBindingImpl();
		return uiBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiSourceBindingEndpoint createUiSourceBindingEndpoint() {
		UiSourceBindingEndpointImpl uiSourceBindingEndpoint = new UiSourceBindingEndpointImpl();
		return uiSourceBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiTargetBindingEndpoint createUiTargetBindingEndpoint() {
		UiTargetBindingEndpointImpl uiTargetBindingEndpoint = new UiTargetBindingEndpointImpl();
		return uiTargetBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiPathSegment createUiPathSegment() {
		UiPathSegmentImpl uiPathSegment = new UiPathSegmentImpl();
		return uiPathSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBeanSlot createUiBeanSlot() {
		UiBeanSlotImpl uiBeanSlot = new UiBeanSlotImpl();
		return uiBeanSlot;
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
	public UimodelPackage getUimodelPackage() {
		return (UimodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UimodelPackage getPackage() {
		return UimodelPackage.eINSTANCE;
	}

} //UimodelFactoryImpl
