/**
 */
package org.lunifera.ecview.semantic.uimodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.ecview.semantic.uimodel.*;

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
 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage
 * @generated
 */
public class UiModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelSwitch() {
		if (modelPackage == null) {
			modelPackage = UiModelPackage.eINSTANCE;
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
			case UiModelPackage.UI_NAMED_ELEMENT: {
				UiNamedElement uiNamedElement = (UiNamedElement)theEObject;
				T result = caseUiNamedElement(uiNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MODEL: {
				UiModel uiModel = (UiModel)theEObject;
				T result = caseUiModel(uiModel);
				if (result == null) result = caseUiNamedElement(uiModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_IMPORTS: {
				UiImports uiImports = (UiImports)theEObject;
				T result = caseUiImports(uiImports);
				if (result == null) result = caseUiNamedElement(uiImports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_CONTEXT: {
				UiContext uiContext = (UiContext)theEObject;
				T result = caseUiContext(uiContext);
				if (result == null) result = caseUiRootElements(uiContext);
				if (result == null) result = caseUiNamedElement(uiContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VIEW_SET: {
				UiViewSet uiViewSet = (UiViewSet)theEObject;
				T result = caseUiViewSet(uiViewSet);
				if (result == null) result = caseUiContext(uiViewSet);
				if (result == null) result = caseUiRootElements(uiViewSet);
				if (result == null) result = caseUiNamedElement(uiViewSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VIEW: {
				UiView uiView = (UiView)theEObject;
				T result = caseUiView(uiView);
				if (result == null) result = caseUiContext(uiView);
				if (result == null) result = caseUiRootElements(uiView);
				if (result == null) result = caseUiNamedElement(uiView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_IDE_VIEW: {
				UiIDEView uiIDEView = (UiIDEView)theEObject;
				T result = caseUiIDEView(uiIDEView);
				if (result == null) result = caseUiView(uiIDEView);
				if (result == null) result = caseUiContext(uiIDEView);
				if (result == null) result = caseUiRootElements(uiIDEView);
				if (result == null) result = caseUiNamedElement(uiIDEView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_POINT: {
				UiPoint uiPoint = (UiPoint)theEObject;
				T result = caseUiPoint(uiPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_BEAN_SLOT: {
				UiBeanSlot uiBeanSlot = (UiBeanSlot)theEObject;
				T result = caseUiBeanSlot(uiBeanSlot);
				if (result == null) result = caseUiTypedBindable(uiBeanSlot);
				if (result == null) result = caseUiNamedElement(uiBeanSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_ROOT_ELEMENTS: {
				UiRootElements uiRootElements = (UiRootElements)theEObject;
				T result = caseUiRootElements(uiRootElements);
				if (result == null) result = caseUiNamedElement(uiRootElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_BINDING_EXPRESSION: {
				UiBindingExpression uiBindingExpression = (UiBindingExpression)theEObject;
				T result = caseUiBindingExpression(uiBindingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_BINDING_ENDPOINT_ALIAS: {
				UiBindingEndpointAlias uiBindingEndpointAlias = (UiBindingEndpointAlias)theEObject;
				T result = caseUiBindingEndpointAlias(uiBindingEndpointAlias);
				if (result == null) result = caseUiTypedBindable(uiBindingEndpointAlias);
				if (result == null) result = caseUiNamedElement(uiBindingEndpointAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_BINDING_ENDPOINT_ASSIGNMENT: {
				UiBindingEndpointAssignment uiBindingEndpointAssignment = (UiBindingEndpointAssignment)theEObject;
				T result = caseUiBindingEndpointAssignment(uiBindingEndpointAssignment);
				if (result == null) result = caseUiTypedBindable(uiBindingEndpointAssignment);
				if (result == null) result = caseUiBindingExpression(uiBindingEndpointAssignment);
				if (result == null) result = caseUiNamedElement(uiBindingEndpointAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_BINDING: {
				UiBinding uiBinding = (UiBinding)theEObject;
				T result = caseUiBinding(uiBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_PATH_SEGMENT: {
				UiPathSegment uiPathSegment = (UiPathSegment)theEObject;
				T result = caseUiPathSegment(uiPathSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_RAW_BINDABLE: {
				UiRawBindable uiRawBindable = (UiRawBindable)theEObject;
				T result = caseUiRawBindable(uiRawBindable);
				if (result == null) result = caseUiNamedElement(uiRawBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TYPED_BINDABLE: {
				UiTypedBindable uiTypedBindable = (UiTypedBindable)theEObject;
				T result = caseUiTypedBindable(uiTypedBindable);
				if (result == null) result = caseUiNamedElement(uiTypedBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TYPED_BINDABLE_DEF: {
				UiTypedBindableDef uiTypedBindableDef = (UiTypedBindableDef)theEObject;
				T result = caseUiTypedBindableDef(uiTypedBindableDef);
				if (result == null) result = caseUiTypedBindable(uiTypedBindableDef);
				if (result == null) result = caseUiBindingExpression(uiTypedBindableDef);
				if (result == null) result = caseUiNamedElement(uiTypedBindableDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_EMBEDDABLE: {
				UiEmbeddable uiEmbeddable = (UiEmbeddable)theEObject;
				T result = caseUiEmbeddable(uiEmbeddable);
				if (result == null) result = caseUiVisibilityProcessable(uiEmbeddable);
				if (result == null) result = caseUiRawBindable(uiEmbeddable);
				if (result == null) result = caseUiNamedElement(uiEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_FIELD: {
				UiField uiField = (UiField)theEObject;
				T result = caseUiField(uiField);
				if (result == null) result = caseUiEmbeddable(uiField);
				if (result == null) result = caseUiVisibilityProcessable(uiField);
				if (result == null) result = caseUiRawBindable(uiField);
				if (result == null) result = caseUiNamedElement(uiField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_LAYOUT: {
				UiLayout uiLayout = (UiLayout)theEObject;
				T result = caseUiLayout(uiLayout);
				if (result == null) result = caseUiEmbeddable(uiLayout);
				if (result == null) result = caseUiVisibilityProcessable(uiLayout);
				if (result == null) result = caseUiRawBindable(uiLayout);
				if (result == null) result = caseUiNamedElement(uiLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT: {
				UiGridLayoutAssigment uiGridLayoutAssigment = (UiGridLayoutAssigment)theEObject;
				T result = caseUiGridLayoutAssigment(uiGridLayoutAssigment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_GRID_LAYOUT: {
				UiGridLayout uiGridLayout = (UiGridLayout)theEObject;
				T result = caseUiGridLayout(uiGridLayout);
				if (result == null) result = caseUiLayout(uiGridLayout);
				if (result == null) result = caseUiEmbeddable(uiGridLayout);
				if (result == null) result = caseUiVisibilityProcessable(uiGridLayout);
				if (result == null) result = caseUiRawBindable(uiGridLayout);
				if (result == null) result = caseUiNamedElement(uiGridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TEXT_FIELD: {
				UiTextField uiTextField = (UiTextField)theEObject;
				T result = caseUiTextField(uiTextField);
				if (result == null) result = caseUiField(uiTextField);
				if (result == null) result = caseUiEmbeddable(uiTextField);
				if (result == null) result = caseUiVisibilityProcessable(uiTextField);
				if (result == null) result = caseUiRawBindable(uiTextField);
				if (result == null) result = caseUiNamedElement(uiTextField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_LIST: {
				UiList uiList = (UiList)theEObject;
				T result = caseUiList(uiList);
				if (result == null) result = caseUiField(uiList);
				if (result == null) result = caseUiEmbeddable(uiList);
				if (result == null) result = caseUiVisibilityProcessable(uiList);
				if (result == null) result = caseUiRawBindable(uiList);
				if (result == null) result = caseUiNamedElement(uiList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_NUMERIC_FIELD: {
				UiNumericField uiNumericField = (UiNumericField)theEObject;
				T result = caseUiNumericField(uiNumericField);
				if (result == null) result = caseUiField(uiNumericField);
				if (result == null) result = caseUiEmbeddable(uiNumericField);
				if (result == null) result = caseUiVisibilityProcessable(uiNumericField);
				if (result == null) result = caseUiRawBindable(uiNumericField);
				if (result == null) result = caseUiNamedElement(uiNumericField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_CHECK_BOX: {
				UiCheckBox uiCheckBox = (UiCheckBox)theEObject;
				T result = caseUiCheckBox(uiCheckBox);
				if (result == null) result = caseUiField(uiCheckBox);
				if (result == null) result = caseUiEmbeddable(uiCheckBox);
				if (result == null) result = caseUiVisibilityProcessable(uiCheckBox);
				if (result == null) result = caseUiRawBindable(uiCheckBox);
				if (result == null) result = caseUiNamedElement(uiCheckBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROCESSABLE: {
				UiVisibilityProcessable uiVisibilityProcessable = (UiVisibilityProcessable)theEObject;
				T result = caseUiVisibilityProcessable(uiVisibilityProcessable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROCESSOR: {
				UiVisibilityProcessor uiVisibilityProcessor = (UiVisibilityProcessor)theEObject;
				T result = caseUiVisibilityProcessor(uiVisibilityProcessor);
				if (result == null) result = caseUiNamedElement(uiVisibilityProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROCESSOR_DEF: {
				UiVisibilityProcessorDef uiVisibilityProcessorDef = (UiVisibilityProcessorDef)theEObject;
				T result = caseUiVisibilityProcessorDef(uiVisibilityProcessorDef);
				if (result == null) result = caseUiRootElements(uiVisibilityProcessorDef);
				if (result == null) result = caseUiNamedElement(uiVisibilityProcessorDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT: {
				UiVisibilityProcessorAssignment uiVisibilityProcessorAssignment = (UiVisibilityProcessorAssignment)theEObject;
				T result = caseUiVisibilityProcessorAssignment(uiVisibilityProcessorAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_CHANGE_TRIGGER: {
				UiChangeTrigger uiChangeTrigger = (UiChangeTrigger)theEObject;
				T result = caseUiChangeTrigger(uiChangeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_RULE: {
				UiVisibilityRule uiVisibilityRule = (UiVisibilityRule)theEObject;
				T result = caseUiVisibilityRule(uiVisibilityRule);
				if (result == null) result = caseUiNamedElement(uiVisibilityRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_XBASE_VISIBILITY_RULE: {
				UiXbaseVisibilityRule uiXbaseVisibilityRule = (UiXbaseVisibilityRule)theEObject;
				T result = caseUiXbaseVisibilityRule(uiXbaseVisibilityRule);
				if (result == null) result = caseUiVisibilityRule(uiXbaseVisibilityRule);
				if (result == null) result = caseUiNamedElement(uiXbaseVisibilityRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROPERTIES: {
				UiVisibilityProperties uiVisibilityProperties = (UiVisibilityProperties)theEObject;
				T result = caseUiVisibilityProperties(uiVisibilityProperties);
				if (result == null) result = caseUiNamedElement(uiVisibilityProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROPERTIES_DEF: {
				UiVisibilityPropertiesDef uiVisibilityPropertiesDef = (UiVisibilityPropertiesDef)theEObject;
				T result = caseUiVisibilityPropertiesDef(uiVisibilityPropertiesDef);
				if (result == null) result = caseUiRootElements(uiVisibilityPropertiesDef);
				if (result == null) result = caseUiNamedElement(uiVisibilityPropertiesDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT: {
				UiVisibilityPropertiesAssignment uiVisibilityPropertiesAssignment = (UiVisibilityPropertiesAssignment)theEObject;
				T result = caseUiVisibilityPropertiesAssignment(uiVisibilityPropertiesAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VALIDATOR: {
				UiValidator uiValidator = (UiValidator)theEObject;
				T result = caseUiValidator(uiValidator);
				if (result == null) result = caseUiRawBindable(uiValidator);
				if (result == null) result = caseUiNamedElement(uiValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MAX_LENGTH_VALIDATOR: {
				UiMaxLengthValidator uiMaxLengthValidator = (UiMaxLengthValidator)theEObject;
				T result = caseUiMaxLengthValidator(uiMaxLengthValidator);
				if (result == null) result = caseUiValidator(uiMaxLengthValidator);
				if (result == null) result = caseUiRawBindable(uiMaxLengthValidator);
				if (result == null) result = caseUiNamedElement(uiMaxLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MIN_LENGTH_VALIDATOR: {
				UiMinLengthValidator uiMinLengthValidator = (UiMinLengthValidator)theEObject;
				T result = caseUiMinLengthValidator(uiMinLengthValidator);
				if (result == null) result = caseUiValidator(uiMinLengthValidator);
				if (result == null) result = caseUiRawBindable(uiMinLengthValidator);
				if (result == null) result = caseUiNamedElement(uiMinLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_REGEXP_VALIDATOR: {
				UiRegexpValidator uiRegexpValidator = (UiRegexpValidator)theEObject;
				T result = caseUiRegexpValidator(uiRegexpValidator);
				if (result == null) result = caseUiValidator(uiRegexpValidator);
				if (result == null) result = caseUiRawBindable(uiRegexpValidator);
				if (result == null) result = caseUiNamedElement(uiRegexpValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_XBASE_VALIDATOR: {
				UiXbaseValidator uiXbaseValidator = (UiXbaseValidator)theEObject;
				T result = caseUiXbaseValidator(uiXbaseValidator);
				if (result == null) result = caseUiValidator(uiXbaseValidator);
				if (result == null) result = caseUiRawBindable(uiXbaseValidator);
				if (result == null) result = caseUiNamedElement(uiXbaseValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VALIDATOR_ALIAS: {
				UiValidatorAlias uiValidatorAlias = (UiValidatorAlias)theEObject;
				T result = caseUiValidatorAlias(uiValidatorAlias);
				if (result == null) result = caseUiRootElements(uiValidatorAlias);
				if (result == null) result = caseUiNamedElement(uiValidatorAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VALIDATOR_ASSIGNMENT: {
				UiValidatorAssignment uiValidatorAssignment = (UiValidatorAssignment)theEObject;
				T result = caseUiValidatorAssignment(uiValidatorAssignment);
				if (result == null) result = caseUiNamedElement(uiValidatorAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VALIDATOR_DEF: {
				UiValidatorDef uiValidatorDef = (UiValidatorDef)theEObject;
				T result = caseUiValidatorDef(uiValidatorDef);
				if (result == null) result = caseUiNamedElement(uiValidatorDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiNamedElement(UiNamedElement object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiContext(UiContext object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Binding Endpoint Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Binding Endpoint Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBindingEndpointAssignment(UiBindingEndpointAssignment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Xbase Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Xbase Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiXbaseValidator(UiXbaseValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Binding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Binding Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBindingExpression(UiBindingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Typed Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Typed Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTypedBindable(UiTypedBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Typed Bindable Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Typed Bindable Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTypedBindableDef(UiTypedBindableDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Raw Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Raw Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiRawBindable(UiRawBindable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Grid Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Grid Layout Assigment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiGridLayoutAssigment(UiGridLayoutAssigment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Grid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiGridLayout(UiGridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTextField(UiTextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiList(UiList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Numeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Numeric Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiNumericField(UiNumericField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiCheckBox(UiCheckBox object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityProcessor(UiVisibilityProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Processor Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Processor Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityProcessorDef(UiVisibilityProcessorDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Processor Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Processor Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityProcessorAssignment(UiVisibilityProcessorAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Change Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Change Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiChangeTrigger(UiChangeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityRule(UiVisibilityRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Xbase Visibility Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Xbase Visibility Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiXbaseVisibilityRule(UiXbaseVisibilityRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityProperties(UiVisibilityProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Properties Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Properties Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityPropertiesDef(UiVisibilityPropertiesDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Properties Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Properties Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityPropertiesAssignment(UiVisibilityPropertiesAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Validator Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Validator Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiValidatorAlias(UiValidatorAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Validator Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Validator Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiValidatorAssignment(UiValidatorAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Validator Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Validator Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiValidatorDef(UiValidatorDef object) {
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

} //UiModelSwitch
