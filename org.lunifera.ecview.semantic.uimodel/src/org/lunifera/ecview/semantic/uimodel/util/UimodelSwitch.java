/**
 */
package org.lunifera.ecview.semantic.uimodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.lunifera.ecview.semantic.uimodel.*;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiVisibilityProcessable;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelElement;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;

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
 * @see org.lunifera.ecview.semantic.uimodel.UimodelPackage
 * @generated
 */
public class UimodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UimodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelSwitch() {
		if (modelPackage == null) {
			modelPackage = UimodelPackage.eINSTANCE;
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
			case UimodelPackage.UI_MODEL: {
				UiModel uiModel = (UiModel)theEObject;
				T result = caseUiModel(uiModel);
				if (result == null) result = caseUiModelElement(uiModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_IMPORTS: {
				UiImports uiImports = (UiImports)theEObject;
				T result = caseUiImports(uiImports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_MODEL_ELEMENT: {
				UiModelElement uiModelElement = (UiModelElement)theEObject;
				T result = caseUiModelElement(uiModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_VIEW: {
				UiView uiView = (UiView)theEObject;
				T result = caseUiView(uiView);
				if (result == null) result = caseYView(uiView);
				if (result == null) result = caseUiRootElements(uiView);
				if (result == null) result = caseYElement(uiView);
				if (result == null) result = caseYCssAble(uiView);
				if (result == null) result = caseYMarginable(uiView);
				if (result == null) result = caseYVisibilityProcessable(uiView);
				if (result == null) result = caseUiModelElement(uiView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_IDE_VIEW: {
				UiIDEView uiIDEView = (UiIDEView)theEObject;
				T result = caseUiIDEView(uiIDEView);
				if (result == null) result = caseUiView(uiIDEView);
				if (result == null) result = caseYView(uiIDEView);
				if (result == null) result = caseUiRootElements(uiIDEView);
				if (result == null) result = caseYElement(uiIDEView);
				if (result == null) result = caseYCssAble(uiIDEView);
				if (result == null) result = caseYMarginable(uiIDEView);
				if (result == null) result = caseYVisibilityProcessable(uiIDEView);
				if (result == null) result = caseUiModelElement(uiIDEView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_POINT: {
				UiPoint uiPoint = (UiPoint)theEObject;
				T result = caseUiPoint(uiPoint);
				if (result == null) result = caseUiModelElement(uiPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_BINDING_ENDPOINT_ALIAS: {
				UiBindingEndpointAlias uiBindingEndpointAlias = (UiBindingEndpointAlias)theEObject;
				T result = caseUiBindingEndpointAlias(uiBindingEndpointAlias);
				if (result == null) result = caseUiModelElement(uiBindingEndpointAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_BINDING_ENDPOINT_DEF: {
				UiBindingEndpointDef uiBindingEndpointDef = (UiBindingEndpointDef)theEObject;
				T result = caseUiBindingEndpointDef(uiBindingEndpointDef);
				if (result == null) result = caseUiModelElement(uiBindingEndpointDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_BINDING: {
				UiBinding uiBinding = (UiBinding)theEObject;
				T result = caseUiBinding(uiBinding);
				if (result == null) result = caseUiModelElement(uiBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_PATH_SEGMENT: {
				UiPathSegment uiPathSegment = (UiPathSegment)theEObject;
				T result = caseUiPathSegment(uiPathSegment);
				if (result == null) result = caseUiModelElement(uiPathSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_BEAN_SLOT: {
				UiBeanSlot uiBeanSlot = (UiBeanSlot)theEObject;
				T result = caseUiBeanSlot(uiBeanSlot);
				if (result == null) result = caseYBeanSlot(uiBeanSlot);
				if (result == null) result = caseUiBindable(uiBeanSlot);
				if (result == null) result = caseYBindable(uiBeanSlot);
				if (result == null) result = caseUiModelElement(uiBeanSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_VIEW_SET: {
				UiViewSet uiViewSet = (UiViewSet)theEObject;
				T result = caseUiViewSet(uiViewSet);
				if (result == null) result = caseYViewSet(uiViewSet);
				if (result == null) result = caseUiRootElements(uiViewSet);
				if (result == null) result = caseYElement(uiViewSet);
				if (result == null) result = caseUiModelElement(uiViewSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_ROOT_ELEMENTS: {
				UiRootElements uiRootElements = (UiRootElements)theEObject;
				T result = caseUiRootElements(uiRootElements);
				if (result == null) result = caseUiModelElement(uiRootElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_MAX_LENGTH_VALIDATOR: {
				UiMaxLengthValidator uiMaxLengthValidator = (UiMaxLengthValidator)theEObject;
				T result = caseUiMaxLengthValidator(uiMaxLengthValidator);
				if (result == null) result = caseYMaxLengthValidator(uiMaxLengthValidator);
				if (result == null) result = caseUiValidator(uiMaxLengthValidator);
				if (result == null) result = caseYValidator(uiMaxLengthValidator);
				if (result == null) result = caseYMaxLengthValidationConfig(uiMaxLengthValidator);
				if (result == null) result = caseUiBindable(uiMaxLengthValidator);
				if (result == null) result = caseYElement(uiMaxLengthValidator);
				if (result == null) result = caseYBindable(uiMaxLengthValidator);
				if (result == null) result = caseYValidationConfig(uiMaxLengthValidator);
				if (result == null) result = caseUiModelElement(uiMaxLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_MIN_LENGTH_VALIDATOR: {
				UiMinLengthValidator uiMinLengthValidator = (UiMinLengthValidator)theEObject;
				T result = caseUiMinLengthValidator(uiMinLengthValidator);
				if (result == null) result = caseYMinLengthValidator(uiMinLengthValidator);
				if (result == null) result = caseUiValidator(uiMinLengthValidator);
				if (result == null) result = caseYValidator(uiMinLengthValidator);
				if (result == null) result = caseYMinLengthValidationConfig(uiMinLengthValidator);
				if (result == null) result = caseUiBindable(uiMinLengthValidator);
				if (result == null) result = caseYElement(uiMinLengthValidator);
				if (result == null) result = caseYBindable(uiMinLengthValidator);
				if (result == null) result = caseYValidationConfig(uiMinLengthValidator);
				if (result == null) result = caseUiModelElement(uiMinLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_REGEXP_VALIDATOR: {
				UiRegexpValidator uiRegexpValidator = (UiRegexpValidator)theEObject;
				T result = caseUiRegexpValidator(uiRegexpValidator);
				if (result == null) result = caseYRegexpValidator(uiRegexpValidator);
				if (result == null) result = caseUiValidator(uiRegexpValidator);
				if (result == null) result = caseYValidator(uiRegexpValidator);
				if (result == null) result = caseYRegexpValidationConfig(uiRegexpValidator);
				if (result == null) result = caseUiBindable(uiRegexpValidator);
				if (result == null) result = caseYElement(uiRegexpValidator);
				if (result == null) result = caseYBindable(uiRegexpValidator);
				if (result == null) result = caseYValidationConfig(uiRegexpValidator);
				if (result == null) result = caseUiModelElement(uiRegexpValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_BINDABLE: {
				UiBindable uiBindable = (UiBindable)theEObject;
				T result = caseUiBindable(uiBindable);
				if (result == null) result = caseUiModelElement(uiBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_EMBEDDABLE: {
				UiEmbeddable uiEmbeddable = (UiEmbeddable)theEObject;
				T result = caseUiEmbeddable(uiEmbeddable);
				if (result == null) result = caseYEmbeddable(uiEmbeddable);
				if (result == null) result = caseUiVisibilityProcessable(uiEmbeddable);
				if (result == null) result = caseUiBindable(uiEmbeddable);
				if (result == null) result = caseYElement(uiEmbeddable);
				if (result == null) result = caseYCssAble(uiEmbeddable);
				if (result == null) result = caseYVisibleable(uiEmbeddable);
				if (result == null) result = caseYVisibilityProcessable(uiEmbeddable);
				if (result == null) result = caseUiModelElement(uiEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_FIELD: {
				UiField uiField = (UiField)theEObject;
				T result = caseUiField(uiField);
				if (result == null) result = caseUiEmbeddable(uiField);
				if (result == null) result = caseYEmbeddable(uiField);
				if (result == null) result = caseUiVisibilityProcessable(uiField);
				if (result == null) result = caseUiBindable(uiField);
				if (result == null) result = caseYElement(uiField);
				if (result == null) result = caseYCssAble(uiField);
				if (result == null) result = caseYVisibleable(uiField);
				if (result == null) result = caseYVisibilityProcessable(uiField);
				if (result == null) result = caseUiModelElement(uiField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_LAYOUT: {
				UiLayout uiLayout = (UiLayout)theEObject;
				T result = caseUiLayout(uiLayout);
				if (result == null) result = caseUiEmbeddable(uiLayout);
				if (result == null) result = caseYEmbeddable(uiLayout);
				if (result == null) result = caseUiVisibilityProcessable(uiLayout);
				if (result == null) result = caseUiBindable(uiLayout);
				if (result == null) result = caseYElement(uiLayout);
				if (result == null) result = caseYCssAble(uiLayout);
				if (result == null) result = caseYVisibleable(uiLayout);
				if (result == null) result = caseYVisibilityProcessable(uiLayout);
				if (result == null) result = caseUiModelElement(uiLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelPackage.UI_VALIDATOR: {
				UiValidator uiValidator = (UiValidator)theEObject;
				T result = caseUiValidator(uiValidator);
				if (result == null) result = caseYValidator(uiValidator);
				if (result == null) result = caseUiBindable(uiValidator);
				if (result == null) result = caseYElement(uiValidator);
				if (result == null) result = caseYBindable(uiValidator);
				if (result == null) result = caseUiModelElement(uiValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiModel(UiModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiImports(UiImports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiView(UiView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui IDE View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui IDE View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiIDEView(UiIDEView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiPoint(UiPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Binding Endpoint Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Binding Endpoint Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBindingEndpointAlias(UiBindingEndpointAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Binding Endpoint Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Binding Endpoint Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBindingEndpointDef(UiBindingEndpointDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBinding(UiBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Path Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiPathSegment(UiPathSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Bean Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Bean Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBeanSlot(UiBeanSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui View Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui View Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiViewSet(UiViewSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Root Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Root Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiRootElements(UiRootElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiModelElement(UiModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Max Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Max Length Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMaxLengthValidator(UiMaxLengthValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Min Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Min Length Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMinLengthValidator(UiMinLengthValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Regexp Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Regexp Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiRegexpValidator(UiRegexpValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBindable(UiBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Embeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiEmbeddable(UiEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiField(UiField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiLayout(UiLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiValidator(UiValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYElement(YElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCssAble(YCssAble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMarginable(YMarginable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibility Processable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibility Processable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibilityProcessable(YVisibilityProcessable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YView</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YView</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYView(YView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindable(YBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBean Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBean Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBeanSlot(YBeanSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YView Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YView Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYViewSet(YViewSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValidator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValidator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValidator(YValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValidation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValidation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValidationConfig(YValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMax Length Validation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMax Length Validation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMaxLengthValidationConfig(YMaxLengthValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMax Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMax Length Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMaxLengthValidator(YMaxLengthValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMin Length Validation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMin Length Validation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMinLengthValidationConfig(YMinLengthValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMin Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMin Length Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMinLengthValidator(YMinLengthValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YRegexp Validation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YRegexp Validation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYRegexpValidationConfig(YRegexpValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YRegexp Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YRegexp Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYRegexpValidator(YRegexpValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibleable(YVisibleable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddable(YEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Processable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Processable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityProcessable(UiVisibilityProcessable object) {
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

} //UimodelSwitch
