/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.ecview.semantic.uimodel.*;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UimodelFactory;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

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
			case UimodelPackage.UI_IMPORTS: return createUiImports();
			case UimodelPackage.UI_VIEW: return createUiView();
			case UimodelPackage.UI_IDE_VIEW: return createUiIDEView();
			case UimodelPackage.UI_POINT: return createUiPoint();
			case UimodelPackage.UI_BINDING_ENDPOINT_ALIAS: return createUiBindingEndpointAlias();
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF: return createUiBindingEndpointDef();
			case UimodelPackage.UI_BINDING: return createUiBinding();
			case UimodelPackage.UI_PATH_SEGMENT: return createUiPathSegment();
			case UimodelPackage.UI_BEAN_SLOT: return createUiBeanSlot();
			case UimodelPackage.UI_VIEW_SET: return createUiViewSet();
			case UimodelPackage.UI_MAX_LENGTH_VALIDATOR: return createUiMaxLengthValidator();
			case UimodelPackage.UI_MIN_LENGTH_VALIDATOR: return createUiMinLengthValidator();
			case UimodelPackage.UI_REGEXP_VALIDATOR: return createUiRegexpValidator();
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
	public UiImports createUiImports() {
		UiImportsImpl uiImports = new UiImportsImpl();
		return uiImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiView createUiView() {
		UiViewImpl uiView = new UiViewImpl();
		return uiView;
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
	public UiPoint createUiPoint() {
		UiPointImpl uiPoint = new UiPointImpl();
		return uiPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointAlias createUiBindingEndpointAlias() {
		UiBindingEndpointAliasImpl uiBindingEndpointAlias = new UiBindingEndpointAliasImpl();
		return uiBindingEndpointAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiBindingEndpointDef createUiBindingEndpointDef() {
		UiBindingEndpointDefImpl uiBindingEndpointDef = new UiBindingEndpointDefImpl();
		return uiBindingEndpointDef;
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
	public UiViewSet createUiViewSet() {
		UiViewSetImpl uiViewSet = new UiViewSetImpl();
		return uiViewSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMaxLengthValidator createUiMaxLengthValidator() {
		UiMaxLengthValidatorImpl uiMaxLengthValidator = new UiMaxLengthValidatorImpl();
		return uiMaxLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiMinLengthValidator createUiMinLengthValidator() {
		UiMinLengthValidatorImpl uiMinLengthValidator = new UiMinLengthValidatorImpl();
		return uiMinLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiRegexpValidator createUiRegexpValidator() {
		UiRegexpValidatorImpl uiRegexpValidator = new UiRegexpValidatorImpl();
		return uiRegexpValidator;
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
