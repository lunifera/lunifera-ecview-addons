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
				if (result == null) result = caseUiVisibilityProcessable(uiView);
				if (result == null) result = caseUiRawBindable(uiView);
				if (result == null) result = caseUiRootElements(uiView);
				if (result == null) result = caseUiNamedElement(uiView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_DIALOG: {
				UiDialog uiDialog = (UiDialog)theEObject;
				T result = caseUiDialog(uiDialog);
				if (result == null) result = caseUiEmbeddable(uiDialog);
				if (result == null) result = caseUiTypeProvider(uiDialog);
				if (result == null) result = caseUiVisibilityProcessable(uiDialog);
				if (result == null) result = caseUiRawBindable(uiDialog);
				if (result == null) result = caseUiI18nInfoable(uiDialog);
				if (result == null) result = caseUiNamedElement(uiDialog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_DIALOG_ASSIGNMENT: {
				UiDialogAssignment uiDialogAssignment = (UiDialogAssignment)theEObject;
				T result = caseUiDialogAssignment(uiDialogAssignment);
				if (result == null) result = caseUiLayoutAssignment(uiDialogAssignment);
				if (result == null) result = caseUiNamedElement(uiDialogAssignment);
				if (result == null) result = caseUiRawBindableProvider(uiDialogAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_IDE_VIEW: {
				UiIDEView uiIDEView = (UiIDEView)theEObject;
				T result = caseUiIDEView(uiIDEView);
				if (result == null) result = caseUiView(uiIDEView);
				if (result == null) result = caseUiContext(uiIDEView);
				if (result == null) result = caseUiVisibilityProcessable(uiIDEView);
				if (result == null) result = caseUiRawBindable(uiIDEView);
				if (result == null) result = caseUiRootElements(uiIDEView);
				if (result == null) result = caseUiNamedElement(uiIDEView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_VIEW: {
				UiMobileView uiMobileView = (UiMobileView)theEObject;
				T result = caseUiMobileView(uiMobileView);
				if (result == null) result = caseUiView(uiMobileView);
				if (result == null) result = caseUiContext(uiMobileView);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileView);
				if (result == null) result = caseUiRawBindable(uiMobileView);
				if (result == null) result = caseUiRootElements(uiMobileView);
				if (result == null) result = caseUiNamedElement(uiMobileView);
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
			case UiModelPackage.UI_RAW_BINDABLE_PROVIDER: {
				UiRawBindableProvider uiRawBindableProvider = (UiRawBindableProvider)theEObject;
				T result = caseUiRawBindableProvider(uiRawBindableProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_RAW_BINDABLE_PATH_SEGMENT: {
				UiRawBindablePathSegment uiRawBindablePathSegment = (UiRawBindablePathSegment)theEObject;
				T result = caseUiRawBindablePathSegment(uiRawBindablePathSegment);
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
			case UiModelPackage.UI_TYPED_BINDABLE_RAW_TYPE: {
				UiTypedBindableRawType uiTypedBindableRawType = (UiTypedBindableRawType)theEObject;
				T result = caseUiTypedBindableRawType(uiTypedBindableRawType);
				if (result == null) result = caseUiTypedBindable(uiTypedBindableRawType);
				if (result == null) result = caseUiBindingExpression(uiTypedBindableRawType);
				if (result == null) result = caseUiNamedElement(uiTypedBindableRawType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TYPED_BINDABLE_RAW_TYPE_ALIAS: {
				UiTypedBindableRawTypeAlias uiTypedBindableRawTypeAlias = (UiTypedBindableRawTypeAlias)theEObject;
				T result = caseUiTypedBindableRawTypeAlias(uiTypedBindableRawTypeAlias);
				if (result == null) result = caseUiTypedBindable(uiTypedBindableRawTypeAlias);
				if (result == null) result = caseUiBindingExpression(uiTypedBindableRawTypeAlias);
				if (result == null) result = caseUiNamedElement(uiTypedBindableRawTypeAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_COMMAND_BINDABLE_DEF: {
				UiCommandBindableDef uiCommandBindableDef = (UiCommandBindableDef)theEObject;
				T result = caseUiCommandBindableDef(uiCommandBindableDef);
				if (result == null) result = caseUiTypedBindable(uiCommandBindableDef);
				if (result == null) result = caseUiBindingExpression(uiCommandBindableDef);
				if (result == null) result = caseUiNamedElement(uiCommandBindableDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_EMBEDDABLE: {
				UiEmbeddable uiEmbeddable = (UiEmbeddable)theEObject;
				T result = caseUiEmbeddable(uiEmbeddable);
				if (result == null) result = caseUiVisibilityProcessable(uiEmbeddable);
				if (result == null) result = caseUiRawBindable(uiEmbeddable);
				if (result == null) result = caseUiI18nInfoable(uiEmbeddable);
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
				if (result == null) result = caseUiI18nInfoable(uiField);
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
				if (result == null) result = caseUiI18nInfoable(uiLayout);
				if (result == null) result = caseUiNamedElement(uiLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_LAYOUT_ASSIGNMENT: {
				UiLayoutAssignment uiLayoutAssignment = (UiLayoutAssignment)theEObject;
				T result = caseUiLayoutAssignment(uiLayoutAssignment);
				if (result == null) result = caseUiNamedElement(uiLayoutAssignment);
				if (result == null) result = caseUiRawBindableProvider(uiLayoutAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_ACTION: {
				UiAction uiAction = (UiAction)theEObject;
				T result = caseUiAction(uiAction);
				if (result == null) result = caseUiEmbeddable(uiAction);
				if (result == null) result = caseUiVisibilityProcessable(uiAction);
				if (result == null) result = caseUiRawBindable(uiAction);
				if (result == null) result = caseUiI18nInfoable(uiAction);
				if (result == null) result = caseUiNamedElement(uiAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_EMBEDDABLE: {
				UiMobileEmbeddable uiMobileEmbeddable = (UiMobileEmbeddable)theEObject;
				T result = caseUiMobileEmbeddable(uiMobileEmbeddable);
				if (result == null) result = caseUiEmbeddable(uiMobileEmbeddable);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileEmbeddable);
				if (result == null) result = caseUiRawBindable(uiMobileEmbeddable);
				if (result == null) result = caseUiI18nInfoable(uiMobileEmbeddable);
				if (result == null) result = caseUiNamedElement(uiMobileEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_FIELD: {
				UiMobileField uiMobileField = (UiMobileField)theEObject;
				T result = caseUiMobileField(uiMobileField);
				if (result == null) result = caseUiMobileEmbeddable(uiMobileField);
				if (result == null) result = caseUiField(uiMobileField);
				if (result == null) result = caseUiEmbeddable(uiMobileField);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileField);
				if (result == null) result = caseUiRawBindable(uiMobileField);
				if (result == null) result = caseUiI18nInfoable(uiMobileField);
				if (result == null) result = caseUiNamedElement(uiMobileField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_LAYOUT: {
				UiMobileLayout uiMobileLayout = (UiMobileLayout)theEObject;
				T result = caseUiMobileLayout(uiMobileLayout);
				if (result == null) result = caseUiMobileEmbeddable(uiMobileLayout);
				if (result == null) result = caseUiLayout(uiMobileLayout);
				if (result == null) result = caseUiEmbeddable(uiMobileLayout);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileLayout);
				if (result == null) result = caseUiRawBindable(uiMobileLayout);
				if (result == null) result = caseUiI18nInfoable(uiMobileLayout);
				if (result == null) result = caseUiNamedElement(uiMobileLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_ACTION: {
				UiMobileAction uiMobileAction = (UiMobileAction)theEObject;
				T result = caseUiMobileAction(uiMobileAction);
				if (result == null) result = caseUiMobileEmbeddable(uiMobileAction);
				if (result == null) result = caseUiAction(uiMobileAction);
				if (result == null) result = caseUiEmbeddable(uiMobileAction);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileAction);
				if (result == null) result = caseUiRawBindable(uiMobileAction);
				if (result == null) result = caseUiI18nInfoable(uiMobileAction);
				if (result == null) result = caseUiNamedElement(uiMobileAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_GRID_LAYOUT_ASSIGMENT: {
				UiGridLayoutAssigment uiGridLayoutAssigment = (UiGridLayoutAssigment)theEObject;
				T result = caseUiGridLayoutAssigment(uiGridLayoutAssigment);
				if (result == null) result = caseUiLayoutAssignment(uiGridLayoutAssigment);
				if (result == null) result = caseUiNamedElement(uiGridLayoutAssigment);
				if (result == null) result = caseUiRawBindableProvider(uiGridLayoutAssigment);
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
				if (result == null) result = caseUiI18nInfoable(uiGridLayout);
				if (result == null) result = caseUiNamedElement(uiGridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_HORIZONTAL_LAYOUT_ASSIGMENT: {
				UiHorizontalLayoutAssigment uiHorizontalLayoutAssigment = (UiHorizontalLayoutAssigment)theEObject;
				T result = caseUiHorizontalLayoutAssigment(uiHorizontalLayoutAssigment);
				if (result == null) result = caseUiLayoutAssignment(uiHorizontalLayoutAssigment);
				if (result == null) result = caseUiNamedElement(uiHorizontalLayoutAssigment);
				if (result == null) result = caseUiRawBindableProvider(uiHorizontalLayoutAssigment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_HORIZONTAL_LAYOUT: {
				UiHorizontalLayout uiHorizontalLayout = (UiHorizontalLayout)theEObject;
				T result = caseUiHorizontalLayout(uiHorizontalLayout);
				if (result == null) result = caseUiMobileLayout(uiHorizontalLayout);
				if (result == null) result = caseUiLayout(uiHorizontalLayout);
				if (result == null) result = caseUiMobileEmbeddable(uiHorizontalLayout);
				if (result == null) result = caseUiEmbeddable(uiHorizontalLayout);
				if (result == null) result = caseUiVisibilityProcessable(uiHorizontalLayout);
				if (result == null) result = caseUiRawBindable(uiHorizontalLayout);
				if (result == null) result = caseUiI18nInfoable(uiHorizontalLayout);
				if (result == null) result = caseUiNamedElement(uiHorizontalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VERTICAL_LAYOUT_ASSIGMENT: {
				UiVerticalLayoutAssigment uiVerticalLayoutAssigment = (UiVerticalLayoutAssigment)theEObject;
				T result = caseUiVerticalLayoutAssigment(uiVerticalLayoutAssigment);
				if (result == null) result = caseUiLayoutAssignment(uiVerticalLayoutAssigment);
				if (result == null) result = caseUiNamedElement(uiVerticalLayoutAssigment);
				if (result == null) result = caseUiRawBindableProvider(uiVerticalLayoutAssigment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VERTICAL_LAYOUT: {
				UiVerticalLayout uiVerticalLayout = (UiVerticalLayout)theEObject;
				T result = caseUiVerticalLayout(uiVerticalLayout);
				if (result == null) result = caseUiMobileLayout(uiVerticalLayout);
				if (result == null) result = caseUiLayout(uiVerticalLayout);
				if (result == null) result = caseUiMobileEmbeddable(uiVerticalLayout);
				if (result == null) result = caseUiEmbeddable(uiVerticalLayout);
				if (result == null) result = caseUiVisibilityProcessable(uiVerticalLayout);
				if (result == null) result = caseUiRawBindable(uiVerticalLayout);
				if (result == null) result = caseUiI18nInfoable(uiVerticalLayout);
				if (result == null) result = caseUiNamedElement(uiVerticalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_FORM_LAYOUT_ASSIGMENT: {
				UiFormLayoutAssigment uiFormLayoutAssigment = (UiFormLayoutAssigment)theEObject;
				T result = caseUiFormLayoutAssigment(uiFormLayoutAssigment);
				if (result == null) result = caseUiLayoutAssignment(uiFormLayoutAssigment);
				if (result == null) result = caseUiNamedElement(uiFormLayoutAssigment);
				if (result == null) result = caseUiRawBindableProvider(uiFormLayoutAssigment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_FORM_LAYOUT: {
				UiFormLayout uiFormLayout = (UiFormLayout)theEObject;
				T result = caseUiFormLayout(uiFormLayout);
				if (result == null) result = caseUiLayout(uiFormLayout);
				if (result == null) result = caseUiEmbeddable(uiFormLayout);
				if (result == null) result = caseUiVisibilityProcessable(uiFormLayout);
				if (result == null) result = caseUiRawBindable(uiFormLayout);
				if (result == null) result = caseUiI18nInfoable(uiFormLayout);
				if (result == null) result = caseUiNamedElement(uiFormLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TEXT_FIELD: {
				UiTextField uiTextField = (UiTextField)theEObject;
				T result = caseUiTextField(uiTextField);
				if (result == null) result = caseUiMobileField(uiTextField);
				if (result == null) result = caseUiField(uiTextField);
				if (result == null) result = caseUiMobileEmbeddable(uiTextField);
				if (result == null) result = caseUiEmbeddable(uiTextField);
				if (result == null) result = caseUiVisibilityProcessable(uiTextField);
				if (result == null) result = caseUiRawBindable(uiTextField);
				if (result == null) result = caseUiI18nInfoable(uiTextField);
				if (result == null) result = caseUiNamedElement(uiTextField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_IMAGE: {
				UiImage uiImage = (UiImage)theEObject;
				T result = caseUiImage(uiImage);
				if (result == null) result = caseUiMobileField(uiImage);
				if (result == null) result = caseUiField(uiImage);
				if (result == null) result = caseUiMobileEmbeddable(uiImage);
				if (result == null) result = caseUiEmbeddable(uiImage);
				if (result == null) result = caseUiVisibilityProcessable(uiImage);
				if (result == null) result = caseUiRawBindable(uiImage);
				if (result == null) result = caseUiI18nInfoable(uiImage);
				if (result == null) result = caseUiNamedElement(uiImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_LIST: {
				UiList uiList = (UiList)theEObject;
				T result = caseUiList(uiList);
				if (result == null) result = caseUiField(uiList);
				if (result == null) result = caseUiTypeProvider(uiList);
				if (result == null) result = caseUiEmbeddable(uiList);
				if (result == null) result = caseUiVisibilityProcessable(uiList);
				if (result == null) result = caseUiRawBindable(uiList);
				if (result == null) result = caseUiI18nInfoable(uiList);
				if (result == null) result = caseUiNamedElement(uiList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TABLE: {
				UiTable uiTable = (UiTable)theEObject;
				T result = caseUiTable(uiTable);
				if (result == null) result = caseUiTypeProvider(uiTable);
				if (result == null) result = caseUiMobileField(uiTable);
				if (result == null) result = caseUiField(uiTable);
				if (result == null) result = caseUiMobileEmbeddable(uiTable);
				if (result == null) result = caseUiEmbeddable(uiTable);
				if (result == null) result = caseUiVisibilityProcessable(uiTable);
				if (result == null) result = caseUiRawBindable(uiTable);
				if (result == null) result = caseUiI18nInfoable(uiTable);
				if (result == null) result = caseUiNamedElement(uiTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_COMBO_BOX: {
				UiComboBox uiComboBox = (UiComboBox)theEObject;
				T result = caseUiComboBox(uiComboBox);
				if (result == null) result = caseUiTypeProvider(uiComboBox);
				if (result == null) result = caseUiMobileField(uiComboBox);
				if (result == null) result = caseUiField(uiComboBox);
				if (result == null) result = caseUiMobileEmbeddable(uiComboBox);
				if (result == null) result = caseUiEmbeddable(uiComboBox);
				if (result == null) result = caseUiVisibilityProcessable(uiComboBox);
				if (result == null) result = caseUiRawBindable(uiComboBox);
				if (result == null) result = caseUiI18nInfoable(uiComboBox);
				if (result == null) result = caseUiNamedElement(uiComboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TYPE_PROVIDER: {
				UiTypeProvider uiTypeProvider = (UiTypeProvider)theEObject;
				T result = caseUiTypeProvider(uiTypeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_COLUMN: {
				UiColumn uiColumn = (UiColumn)theEObject;
				T result = caseUiColumn(uiColumn);
				if (result == null) result = caseUiField(uiColumn);
				if (result == null) result = caseUiEmbeddable(uiColumn);
				if (result == null) result = caseUiVisibilityProcessable(uiColumn);
				if (result == null) result = caseUiRawBindable(uiColumn);
				if (result == null) result = caseUiI18nInfoable(uiColumn);
				if (result == null) result = caseUiNamedElement(uiColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_COLUMNS_ASSIGNMENT: {
				UiColumnsAssignment uiColumnsAssignment = (UiColumnsAssignment)theEObject;
				T result = caseUiColumnsAssignment(uiColumnsAssignment);
				if (result == null) result = caseUiField(uiColumnsAssignment);
				if (result == null) result = caseUiEmbeddable(uiColumnsAssignment);
				if (result == null) result = caseUiVisibilityProcessable(uiColumnsAssignment);
				if (result == null) result = caseUiRawBindable(uiColumnsAssignment);
				if (result == null) result = caseUiI18nInfoable(uiColumnsAssignment);
				if (result == null) result = caseUiNamedElement(uiColumnsAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_NUMERIC_FIELD: {
				UiNumericField uiNumericField = (UiNumericField)theEObject;
				T result = caseUiNumericField(uiNumericField);
				if (result == null) result = caseUiMobileField(uiNumericField);
				if (result == null) result = caseUiField(uiNumericField);
				if (result == null) result = caseUiMobileEmbeddable(uiNumericField);
				if (result == null) result = caseUiEmbeddable(uiNumericField);
				if (result == null) result = caseUiVisibilityProcessable(uiNumericField);
				if (result == null) result = caseUiRawBindable(uiNumericField);
				if (result == null) result = caseUiI18nInfoable(uiNumericField);
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
				if (result == null) result = caseUiI18nInfoable(uiCheckBox);
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
			case UiModelPackage.UI_VISIBILITY_PROCESSOR_ASSIGNMENT: {
				UiVisibilityProcessorAssignment uiVisibilityProcessorAssignment = (UiVisibilityProcessorAssignment)theEObject;
				T result = caseUiVisibilityProcessorAssignment(uiVisibilityProcessorAssignment);
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
			case UiModelPackage.UI_VISIBILITY_PROPERTIES_ASSIGNMENT: {
				UiVisibilityPropertiesAssignment uiVisibilityPropertiesAssignment = (UiVisibilityPropertiesAssignment)theEObject;
				T result = caseUiVisibilityPropertiesAssignment(uiVisibilityPropertiesAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VISIBILITY_PROPERTY: {
				UiVisibilityProperty uiVisibilityProperty = (UiVisibilityProperty)theEObject;
				T result = caseUiVisibilityProperty(uiVisibilityProperty);
				if (result == null) result = caseUiNamedElement(uiVisibilityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VALIDATOR: {
				UiValidator uiValidator = (UiValidator)theEObject;
				T result = caseUiValidator(uiValidator);
				if (result == null) result = caseUiRawBindable(uiValidator);
				if (result == null) result = caseUiI18nInfoable(uiValidator);
				if (result == null) result = caseUiNamedElement(uiValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MAX_LENGTH_VALIDATOR: {
				UiMaxLengthValidator uiMaxLengthValidator = (UiMaxLengthValidator)theEObject;
				T result = caseUiMaxLengthValidator(uiMaxLengthValidator);
				if (result == null) result = caseUiValidator(uiMaxLengthValidator);
				if (result == null) result = caseUiRawBindable(uiMaxLengthValidator);
				if (result == null) result = caseUiI18nInfoable(uiMaxLengthValidator);
				if (result == null) result = caseUiNamedElement(uiMaxLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MIN_LENGTH_VALIDATOR: {
				UiMinLengthValidator uiMinLengthValidator = (UiMinLengthValidator)theEObject;
				T result = caseUiMinLengthValidator(uiMinLengthValidator);
				if (result == null) result = caseUiValidator(uiMinLengthValidator);
				if (result == null) result = caseUiRawBindable(uiMinLengthValidator);
				if (result == null) result = caseUiI18nInfoable(uiMinLengthValidator);
				if (result == null) result = caseUiNamedElement(uiMinLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_REGEXP_VALIDATOR: {
				UiRegexpValidator uiRegexpValidator = (UiRegexpValidator)theEObject;
				T result = caseUiRegexpValidator(uiRegexpValidator);
				if (result == null) result = caseUiValidator(uiRegexpValidator);
				if (result == null) result = caseUiRawBindable(uiRegexpValidator);
				if (result == null) result = caseUiI18nInfoable(uiRegexpValidator);
				if (result == null) result = caseUiNamedElement(uiRegexpValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_XBASE_VALIDATOR: {
				UiXbaseValidator uiXbaseValidator = (UiXbaseValidator)theEObject;
				T result = caseUiXbaseValidator(uiXbaseValidator);
				if (result == null) result = caseUiValidator(uiXbaseValidator);
				if (result == null) result = caseUiRawBindable(uiXbaseValidator);
				if (result == null) result = caseUiI18nInfoable(uiXbaseValidator);
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
			case UiModelPackage.UI_HORIZONTAL_BUTTON_GROUP_ASSIGMENT: {
				UiHorizontalButtonGroupAssigment uiHorizontalButtonGroupAssigment = (UiHorizontalButtonGroupAssigment)theEObject;
				T result = caseUiHorizontalButtonGroupAssigment(uiHorizontalButtonGroupAssigment);
				if (result == null) result = caseUiLayoutAssignment(uiHorizontalButtonGroupAssigment);
				if (result == null) result = caseUiNamedElement(uiHorizontalButtonGroupAssigment);
				if (result == null) result = caseUiRawBindableProvider(uiHorizontalButtonGroupAssigment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_HORIZONTAL_BUTTON_GROUP: {
				UiHorizontalButtonGroup uiHorizontalButtonGroup = (UiHorizontalButtonGroup)theEObject;
				T result = caseUiHorizontalButtonGroup(uiHorizontalButtonGroup);
				if (result == null) result = caseUiMobileLayout(uiHorizontalButtonGroup);
				if (result == null) result = caseUiMobileEmbeddable(uiHorizontalButtonGroup);
				if (result == null) result = caseUiLayout(uiHorizontalButtonGroup);
				if (result == null) result = caseUiEmbeddable(uiHorizontalButtonGroup);
				if (result == null) result = caseUiVisibilityProcessable(uiHorizontalButtonGroup);
				if (result == null) result = caseUiRawBindable(uiHorizontalButtonGroup);
				if (result == null) result = caseUiI18nInfoable(uiHorizontalButtonGroup);
				if (result == null) result = caseUiNamedElement(uiHorizontalButtonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_BUTTON: {
				UiButton uiButton = (UiButton)theEObject;
				T result = caseUiButton(uiButton);
				if (result == null) result = caseUiMobileAction(uiButton);
				if (result == null) result = caseUiAction(uiButton);
				if (result == null) result = caseUiMobileEmbeddable(uiButton);
				if (result == null) result = caseUiEmbeddable(uiButton);
				if (result == null) result = caseUiVisibilityProcessable(uiButton);
				if (result == null) result = caseUiRawBindable(uiButton);
				if (result == null) result = caseUiI18nInfoable(uiButton);
				if (result == null) result = caseUiNamedElement(uiButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_SWITCH: {
				UiSwitch uiSwitch = (UiSwitch)theEObject;
				T result = caseUiSwitch(uiSwitch);
				if (result == null) result = caseUiMobileField(uiSwitch);
				if (result == null) result = caseUiMobileEmbeddable(uiSwitch);
				if (result == null) result = caseUiField(uiSwitch);
				if (result == null) result = caseUiEmbeddable(uiSwitch);
				if (result == null) result = caseUiVisibilityProcessable(uiSwitch);
				if (result == null) result = caseUiRawBindable(uiSwitch);
				if (result == null) result = caseUiI18nInfoable(uiSwitch);
				if (result == null) result = caseUiNamedElement(uiSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VERTICAL_COMPONENT_GROUP_ASSIGMENT: {
				UiVerticalComponentGroupAssigment uiVerticalComponentGroupAssigment = (UiVerticalComponentGroupAssigment)theEObject;
				T result = caseUiVerticalComponentGroupAssigment(uiVerticalComponentGroupAssigment);
				if (result == null) result = caseUiLayoutAssignment(uiVerticalComponentGroupAssigment);
				if (result == null) result = caseUiNamedElement(uiVerticalComponentGroupAssigment);
				if (result == null) result = caseUiRawBindableProvider(uiVerticalComponentGroupAssigment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_VERTICAL_COMPONENT_GROUP: {
				UiVerticalComponentGroup uiVerticalComponentGroup = (UiVerticalComponentGroup)theEObject;
				T result = caseUiVerticalComponentGroup(uiVerticalComponentGroup);
				if (result == null) result = caseUiMobileLayout(uiVerticalComponentGroup);
				if (result == null) result = caseUiMobileEmbeddable(uiVerticalComponentGroup);
				if (result == null) result = caseUiLayout(uiVerticalComponentGroup);
				if (result == null) result = caseUiEmbeddable(uiVerticalComponentGroup);
				if (result == null) result = caseUiVisibilityProcessable(uiVerticalComponentGroup);
				if (result == null) result = caseUiRawBindable(uiVerticalComponentGroup);
				if (result == null) result = caseUiI18nInfoable(uiVerticalComponentGroup);
				if (result == null) result = caseUiNamedElement(uiVerticalComponentGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_TAB_SHEET: {
				UiMobileTabSheet uiMobileTabSheet = (UiMobileTabSheet)theEObject;
				T result = caseUiMobileTabSheet(uiMobileTabSheet);
				if (result == null) result = caseUiMobileEmbeddable(uiMobileTabSheet);
				if (result == null) result = caseUiEmbeddable(uiMobileTabSheet);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileTabSheet);
				if (result == null) result = caseUiRawBindable(uiMobileTabSheet);
				if (result == null) result = caseUiI18nInfoable(uiMobileTabSheet);
				if (result == null) result = caseUiNamedElement(uiMobileTabSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_TAB_ASSIGNMENT: {
				UiMobileTabAssignment uiMobileTabAssignment = (UiMobileTabAssignment)theEObject;
				T result = caseUiMobileTabAssignment(uiMobileTabAssignment);
				if (result == null) result = caseUiMobileEmbeddable(uiMobileTabAssignment);
				if (result == null) result = caseUiEmbeddable(uiMobileTabAssignment);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileTabAssignment);
				if (result == null) result = caseUiRawBindable(uiMobileTabAssignment);
				if (result == null) result = caseUiI18nInfoable(uiMobileTabAssignment);
				if (result == null) result = caseUiNamedElement(uiMobileTabAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TAB_SHEET: {
				UiTabSheet uiTabSheet = (UiTabSheet)theEObject;
				T result = caseUiTabSheet(uiTabSheet);
				if (result == null) result = caseUiEmbeddable(uiTabSheet);
				if (result == null) result = caseUiVisibilityProcessable(uiTabSheet);
				if (result == null) result = caseUiRawBindable(uiTabSheet);
				if (result == null) result = caseUiI18nInfoable(uiTabSheet);
				if (result == null) result = caseUiNamedElement(uiTabSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TAB_ASSIGNMENT: {
				UiTabAssignment uiTabAssignment = (UiTabAssignment)theEObject;
				T result = caseUiTabAssignment(uiTabAssignment);
				if (result == null) result = caseUiLayoutAssignment(uiTabAssignment);
				if (result == null) result = caseUiI18nInfoable(uiTabAssignment);
				if (result == null) result = caseUiNamedElement(uiTabAssignment);
				if (result == null) result = caseUiRawBindableProvider(uiTabAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_NAVIGATION_HANDLER: {
				UiMobileNavigationHandler uiMobileNavigationHandler = (UiMobileNavigationHandler)theEObject;
				T result = caseUiMobileNavigationHandler(uiMobileNavigationHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_NAVIGATION_PAGE: {
				UiMobileNavigationPage uiMobileNavigationPage = (UiMobileNavigationPage)theEObject;
				T result = caseUiMobileNavigationPage(uiMobileNavigationPage);
				if (result == null) result = caseUiMobileLayout(uiMobileNavigationPage);
				if (result == null) result = caseUiTypeProvider(uiMobileNavigationPage);
				if (result == null) result = caseUiMobileNavigationHandler(uiMobileNavigationPage);
				if (result == null) result = caseUiMobileEmbeddable(uiMobileNavigationPage);
				if (result == null) result = caseUiLayout(uiMobileNavigationPage);
				if (result == null) result = caseUiEmbeddable(uiMobileNavigationPage);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileNavigationPage);
				if (result == null) result = caseUiRawBindable(uiMobileNavigationPage);
				if (result == null) result = caseUiI18nInfoable(uiMobileNavigationPage);
				if (result == null) result = caseUiNamedElement(uiMobileNavigationPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_NAVIGATION_PAGE_ASSIGNMENT: {
				UiMobileNavigationPageAssignment uiMobileNavigationPageAssignment = (UiMobileNavigationPageAssignment)theEObject;
				T result = caseUiMobileNavigationPageAssignment(uiMobileNavigationPageAssignment);
				if (result == null) result = caseUiLayoutAssignment(uiMobileNavigationPageAssignment);
				if (result == null) result = caseUiNamedElement(uiMobileNavigationPageAssignment);
				if (result == null) result = caseUiRawBindableProvider(uiMobileNavigationPageAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_NAVIGATION_BUTTON: {
				UiMobileNavigationButton uiMobileNavigationButton = (UiMobileNavigationButton)theEObject;
				T result = caseUiMobileNavigationButton(uiMobileNavigationButton);
				if (result == null) result = caseUiMobileAction(uiMobileNavigationButton);
				if (result == null) result = caseUiMobileEmbeddable(uiMobileNavigationButton);
				if (result == null) result = caseUiAction(uiMobileNavigationButton);
				if (result == null) result = caseUiEmbeddable(uiMobileNavigationButton);
				if (result == null) result = caseUiVisibilityProcessable(uiMobileNavigationButton);
				if (result == null) result = caseUiRawBindable(uiMobileNavigationButton);
				if (result == null) result = caseUiI18nInfoable(uiMobileNavigationButton);
				if (result == null) result = caseUiNamedElement(uiMobileNavigationButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_COMMAND: {
				UiCommand uiCommand = (UiCommand)theEObject;
				T result = caseUiCommand(uiCommand);
				if (result == null) result = caseUiNamedElement(uiCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_MOBILE_NAVIGATION_COMMAND: {
				UiMobileNavigationCommand uiMobileNavigationCommand = (UiMobileNavigationCommand)theEObject;
				T result = caseUiMobileNavigationCommand(uiMobileNavigationCommand);
				if (result == null) result = caseUiCommand(uiMobileNavigationCommand);
				if (result == null) result = caseUiNamedElement(uiMobileNavigationCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_OPEN_DIALOG_COMMAND: {
				UiOpenDialogCommand uiOpenDialogCommand = (UiOpenDialogCommand)theEObject;
				T result = caseUiOpenDialogCommand(uiOpenDialogCommand);
				if (result == null) result = caseUiCommand(uiOpenDialogCommand);
				if (result == null) result = caseUiNamedElement(uiOpenDialogCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_SEARCH_FIELD: {
				UiSearchField uiSearchField = (UiSearchField)theEObject;
				T result = caseUiSearchField(uiSearchField);
				if (result == null) result = caseUiMobileField(uiSearchField);
				if (result == null) result = caseUiField(uiSearchField);
				if (result == null) result = caseUiMobileEmbeddable(uiSearchField);
				if (result == null) result = caseUiEmbeddable(uiSearchField);
				if (result == null) result = caseUiVisibilityProcessable(uiSearchField);
				if (result == null) result = caseUiRawBindable(uiSearchField);
				if (result == null) result = caseUiI18nInfoable(uiSearchField);
				if (result == null) result = caseUiNamedElement(uiSearchField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_SEARCH_DIALOG: {
				UiSearchDialog uiSearchDialog = (UiSearchDialog)theEObject;
				T result = caseUiSearchDialog(uiSearchDialog);
				if (result == null) result = caseUiEmbeddable(uiSearchDialog);
				if (result == null) result = caseUiTypeProvider(uiSearchDialog);
				if (result == null) result = caseUiVisibilityProcessable(uiSearchDialog);
				if (result == null) result = caseUiRawBindable(uiSearchDialog);
				if (result == null) result = caseUiI18nInfoable(uiSearchDialog);
				if (result == null) result = caseUiNamedElement(uiSearchDialog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_DIALOG_SEARCH_FIELD_ASSIGNMENT: {
				UiDialogSearchFieldAssignment uiDialogSearchFieldAssignment = (UiDialogSearchFieldAssignment)theEObject;
				T result = caseUiDialogSearchFieldAssignment(uiDialogSearchFieldAssignment);
				if (result == null) result = caseUiLayoutAssignment(uiDialogSearchFieldAssignment);
				if (result == null) result = caseUiNamedElement(uiDialogSearchFieldAssignment);
				if (result == null) result = caseUiRawBindableProvider(uiDialogSearchFieldAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_SEARCH_WITH_DIALOG_COMMAND: {
				UiSearchWithDialogCommand uiSearchWithDialogCommand = (UiSearchWithDialogCommand)theEObject;
				T result = caseUiSearchWithDialogCommand(uiSearchWithDialogCommand);
				if (result == null) result = caseUiCommand(uiSearchWithDialogCommand);
				if (result == null) result = caseUiNamedElement(uiSearchWithDialogCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_LABEL: {
				UiLabel uiLabel = (UiLabel)theEObject;
				T result = caseUiLabel(uiLabel);
				if (result == null) result = caseUiMobileField(uiLabel);
				if (result == null) result = caseUiField(uiLabel);
				if (result == null) result = caseUiMobileEmbeddable(uiLabel);
				if (result == null) result = caseUiEmbeddable(uiLabel);
				if (result == null) result = caseUiVisibilityProcessable(uiLabel);
				if (result == null) result = caseUiRawBindable(uiLabel);
				if (result == null) result = caseUiI18nInfoable(uiLabel);
				if (result == null) result = caseUiNamedElement(uiLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_DECIMAL_FIELD: {
				UiDecimalField uiDecimalField = (UiDecimalField)theEObject;
				T result = caseUiDecimalField(uiDecimalField);
				if (result == null) result = caseUiMobileField(uiDecimalField);
				if (result == null) result = caseUiField(uiDecimalField);
				if (result == null) result = caseUiMobileEmbeddable(uiDecimalField);
				if (result == null) result = caseUiEmbeddable(uiDecimalField);
				if (result == null) result = caseUiVisibilityProcessable(uiDecimalField);
				if (result == null) result = caseUiRawBindable(uiDecimalField);
				if (result == null) result = caseUiI18nInfoable(uiDecimalField);
				if (result == null) result = caseUiNamedElement(uiDecimalField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_TEXT_AREA: {
				UiTextArea uiTextArea = (UiTextArea)theEObject;
				T result = caseUiTextArea(uiTextArea);
				if (result == null) result = caseUiMobileField(uiTextArea);
				if (result == null) result = caseUiField(uiTextArea);
				if (result == null) result = caseUiMobileEmbeddable(uiTextArea);
				if (result == null) result = caseUiEmbeddable(uiTextArea);
				if (result == null) result = caseUiVisibilityProcessable(uiTextArea);
				if (result == null) result = caseUiRawBindable(uiTextArea);
				if (result == null) result = caseUiI18nInfoable(uiTextArea);
				if (result == null) result = caseUiNamedElement(uiTextArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_OPTIONS_GROUP: {
				UiOptionsGroup uiOptionsGroup = (UiOptionsGroup)theEObject;
				T result = caseUiOptionsGroup(uiOptionsGroup);
				if (result == null) result = caseUiTypeProvider(uiOptionsGroup);
				if (result == null) result = caseUiMobileField(uiOptionsGroup);
				if (result == null) result = caseUiField(uiOptionsGroup);
				if (result == null) result = caseUiMobileEmbeddable(uiOptionsGroup);
				if (result == null) result = caseUiEmbeddable(uiOptionsGroup);
				if (result == null) result = caseUiVisibilityProcessable(uiOptionsGroup);
				if (result == null) result = caseUiRawBindable(uiOptionsGroup);
				if (result == null) result = caseUiI18nInfoable(uiOptionsGroup);
				if (result == null) result = caseUiNamedElement(uiOptionsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_DATE_FIELD: {
				UiDateField uiDateField = (UiDateField)theEObject;
				T result = caseUiDateField(uiDateField);
				if (result == null) result = caseUiMobileField(uiDateField);
				if (result == null) result = caseUiField(uiDateField);
				if (result == null) result = caseUiMobileEmbeddable(uiDateField);
				if (result == null) result = caseUiEmbeddable(uiDateField);
				if (result == null) result = caseUiVisibilityProcessable(uiDateField);
				if (result == null) result = caseUiRawBindable(uiDateField);
				if (result == null) result = caseUiI18nInfoable(uiDateField);
				if (result == null) result = caseUiNamedElement(uiDateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_BROWSER: {
				UiBrowser uiBrowser = (UiBrowser)theEObject;
				T result = caseUiBrowser(uiBrowser);
				if (result == null) result = caseUiMobileField(uiBrowser);
				if (result == null) result = caseUiField(uiBrowser);
				if (result == null) result = caseUiMobileEmbeddable(uiBrowser);
				if (result == null) result = caseUiEmbeddable(uiBrowser);
				if (result == null) result = caseUiVisibilityProcessable(uiBrowser);
				if (result == null) result = caseUiRawBindable(uiBrowser);
				if (result == null) result = caseUiI18nInfoable(uiBrowser);
				if (result == null) result = caseUiNamedElement(uiBrowser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_PROGRESS_BAR: {
				UiProgressBar uiProgressBar = (UiProgressBar)theEObject;
				T result = caseUiProgressBar(uiProgressBar);
				if (result == null) result = caseUiMobileField(uiProgressBar);
				if (result == null) result = caseUiField(uiProgressBar);
				if (result == null) result = caseUiMobileEmbeddable(uiProgressBar);
				if (result == null) result = caseUiEmbeddable(uiProgressBar);
				if (result == null) result = caseUiVisibilityProcessable(uiProgressBar);
				if (result == null) result = caseUiRawBindable(uiProgressBar);
				if (result == null) result = caseUiI18nInfoable(uiProgressBar);
				if (result == null) result = caseUiNamedElement(uiProgressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_I1_8N_INFO: {
				UiI18nInfo uiI18nInfo = (UiI18nInfo)theEObject;
				T result = caseUiI18nInfo(uiI18nInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_I1_8N_INFOABLE: {
				UiI18nInfoable uiI18nInfoable = (UiI18nInfoable)theEObject;
				T result = caseUiI18nInfoable(uiI18nInfoable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_SPLITPANEL_ASSIGMENT: {
				UiSplitpanelAssigment uiSplitpanelAssigment = (UiSplitpanelAssigment)theEObject;
				T result = caseUiSplitpanelAssigment(uiSplitpanelAssigment);
				if (result == null) result = caseUiLayoutAssignment(uiSplitpanelAssigment);
				if (result == null) result = caseUiNamedElement(uiSplitpanelAssigment);
				if (result == null) result = caseUiRawBindableProvider(uiSplitpanelAssigment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_SPLITPANEL: {
				UiSplitpanel uiSplitpanel = (UiSplitpanel)theEObject;
				T result = caseUiSplitpanel(uiSplitpanel);
				if (result == null) result = caseUiLayout(uiSplitpanel);
				if (result == null) result = caseUiEmbeddable(uiSplitpanel);
				if (result == null) result = caseUiVisibilityProcessable(uiSplitpanel);
				if (result == null) result = caseUiRawBindable(uiSplitpanel);
				if (result == null) result = caseUiI18nInfoable(uiSplitpanel);
				if (result == null) result = caseUiNamedElement(uiSplitpanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_PANEL: {
				UiPanel uiPanel = (UiPanel)theEObject;
				T result = caseUiPanel(uiPanel);
				if (result == null) result = caseUiLayout(uiPanel);
				if (result == null) result = caseUiEmbeddable(uiPanel);
				if (result == null) result = caseUiVisibilityProcessable(uiPanel);
				if (result == null) result = caseUiRawBindable(uiPanel);
				if (result == null) result = caseUiI18nInfoable(uiPanel);
				if (result == null) result = caseUiNamedElement(uiPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.UI_ERROR_CODE: {
				UiErrorCode uiErrorCode = (UiErrorCode)theEObject;
				T result = caseUiErrorCode(uiErrorCode);
				if (result == null) result = caseUiNamedElement(uiErrorCode);
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiDialog(UiDialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Dialog Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Dialog Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiDialogAssignment(UiDialogAssignment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileView(UiMobileView object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Raw Bindable Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Raw Bindable Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiRawBindableProvider(UiRawBindableProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Raw Bindable Path Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Raw Bindable Path Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiRawBindablePathSegment(UiRawBindablePathSegment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Typed Bindable Raw Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Typed Bindable Raw Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTypedBindableRawType(UiTypedBindableRawType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Typed Bindable Raw Type Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Typed Bindable Raw Type Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTypedBindableRawTypeAlias(UiTypedBindableRawTypeAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Command Bindable Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Command Bindable Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiCommandBindableDef(UiCommandBindableDef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Layout Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Layout Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiLayoutAssignment(UiLayoutAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiAction(UiAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Embeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileEmbeddable(UiMobileEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileField(UiMobileField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileLayout(UiMobileLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileAction(UiMobileAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Horizontal Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Horizontal Layout Assigment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiHorizontalLayoutAssigment(UiHorizontalLayoutAssigment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Horizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Horizontal Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiHorizontalLayout(UiHorizontalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Vertical Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Vertical Layout Assigment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVerticalLayoutAssigment(UiVerticalLayoutAssigment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Vertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Vertical Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVerticalLayout(UiVerticalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Form Layout Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Form Layout Assigment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiFormLayoutAssigment(UiFormLayoutAssigment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Form Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Form Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiFormLayout(UiFormLayout object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiImage(UiImage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTable(UiTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiComboBox(UiComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Type Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Type Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTypeProvider(UiTypeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiColumn(UiColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Columns Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Columns Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiColumnsAssignment(UiColumnsAssignment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Visibility Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Visibility Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVisibilityProperty(UiVisibilityProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ui Horizontal Button Group Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Horizontal Button Group Assigment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiHorizontalButtonGroupAssigment(UiHorizontalButtonGroupAssigment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Horizontal Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Horizontal Button Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiHorizontalButtonGroup(UiHorizontalButtonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiButton(UiButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiSwitch(UiSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Vertical Component Group Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Vertical Component Group Assigment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVerticalComponentGroupAssigment(UiVerticalComponentGroupAssigment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Vertical Component Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Vertical Component Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiVerticalComponentGroup(UiVerticalComponentGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Tab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Tab Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileTabSheet(UiMobileTabSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Tab Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Tab Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileTabAssignment(UiMobileTabAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Tab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Tab Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTabSheet(UiTabSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Tab Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Tab Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTabAssignment(UiTabAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileNavigationHandler(UiMobileNavigationHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileNavigationPage(UiMobileNavigationPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Page Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Page Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileNavigationPageAssignment(UiMobileNavigationPageAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileNavigationButton(UiMobileNavigationButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiCommand(UiCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Mobile Navigation Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiMobileNavigationCommand(UiMobileNavigationCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Open Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Open Dialog Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiOpenDialogCommand(UiOpenDialogCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Search Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Search Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiSearchField(UiSearchField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Search Dialog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Search Dialog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiSearchDialog(UiSearchDialog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Dialog Search Field Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Dialog Search Field Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiDialogSearchFieldAssignment(UiDialogSearchFieldAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Search With Dialog Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Search With Dialog Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiSearchWithDialogCommand(UiSearchWithDialogCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiLabel(UiLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Decimal Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Decimal Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiDecimalField(UiDecimalField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiTextArea(UiTextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Options Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Options Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiOptionsGroup(UiOptionsGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiDateField(UiDateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Browser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Browser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiBrowser(UiBrowser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Progress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Progress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiProgressBar(UiProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui I1 8n Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui I1 8n Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiI18nInfo(UiI18nInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui I1 8n Infoable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui I1 8n Infoable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiI18nInfoable(UiI18nInfoable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Splitpanel Assigment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Splitpanel Assigment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiSplitpanelAssigment(UiSplitpanelAssigment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Splitpanel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Splitpanel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiSplitpanel(UiSplitpanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiPanel(UiPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Error Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Error Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUiErrorCode(UiErrorCode object) {
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
