/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;
import org.lunifera.ecview.semantic.uimodel.UiAction;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiBrowser;
import org.lunifera.ecview.semantic.uimodel.UiButton;
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiCommand;
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiContext;
import org.lunifera.ecview.semantic.uimodel.UiDateField;
import org.lunifera.ecview.semantic.uimodel.UiDecimalField;
import org.lunifera.ecview.semantic.uimodel.UiDialog;
import org.lunifera.ecview.semantic.uimodel.UiDialogAssignment;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment;
import org.lunifera.ecview.semantic.uimodel.UiFormLayout;
import org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImage;
import org.lunifera.ecview.semantic.uimodel.UiImports;
import org.lunifera.ecview.semantic.uimodel.UiLabel;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.ecview.semantic.uimodel.UiLayoutAssignment;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMobileAction;
import org.lunifera.ecview.semantic.uimodel.UiMobileEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiMobileField;
import org.lunifera.ecview.semantic.uimodel.UiMobileLayout;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationHandler;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiMobileView;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelFactory;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiProgressBar;
import org.lunifera.ecview.semantic.uimodel.UiRadioButtonGroup;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiSelectionType;
import org.lunifera.ecview.semantic.uimodel.UiSwitch;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiTextArea;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessable;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorDef;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProperties;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesAssignment;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityPropertiesDef;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityRule;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;
import org.lunifera.ecview.semantic.uimodel.UiXbaseVisibilityRule;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiModelPackageImpl extends EPackageImpl implements UiModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDialogAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiIDEViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEndpointAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEndpointAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPathSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBeanSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiViewSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRootElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMaxLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMinLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRegexpValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiXbaseValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBindingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypedBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypedBindableDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiCommandBindableDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRawBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLayoutAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiGridLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiGridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFormLayoutAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFormLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTextFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTypeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiColumnsAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiNumericFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityProcessorAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiChangeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiXbaseVisibilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertiesDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVisibilityPropertiesAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorAliasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiValidatorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalButtonGroupAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiHorizontalButtonGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalComponentGroupAssigmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVerticalComponentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileTabSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileTabAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTabSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTabAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationPageAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiMobileNavigationCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiOpenDialogCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDecimalFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiRadioButtonGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiBrowserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiProgressBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uiFlatAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uiSelectionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.ecview.semantic.uimodel.UiModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiModelPackageImpl() {
		super(eNS_URI, UiModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UiModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiModelPackage init() {
		if (isInited) return (UiModelPackage)EPackage.Registry.INSTANCE.getEPackage(UiModelPackage.eNS_URI);

		// Obtain or create and register package
		UiModelPackageImpl theUiModelPackage = (UiModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UiSemanticsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUiModelPackage.createPackageContents();

		// Initialize created meta-data
		theUiModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiModelPackage.eNS_URI, theUiModelPackage);
		return theUiModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiNamedElement() {
		return uiNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNamedElement_Id() {
		return (EAttribute)uiNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNamedElement_Name() {
		return (EAttribute)uiNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiModel() {
		return uiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiModel_PackageName() {
		return (EAttribute)uiModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiModel_Roots() {
		return (EReference)uiModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiModel_Imports() {
		return (EReference)uiModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiImports() {
		return uiImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiImports_ImportedNamespace() {
		return (EAttribute)uiImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiContext() {
		return uiContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiContext_BeanSlots() {
		return (EReference)uiContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiContext_BindingEndpointAlias() {
		return (EReference)uiContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiContext_Bindings() {
		return (EReference)uiContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiView() {
		return uiViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiView_ViewSet() {
		return (EReference)uiViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiView_Content() {
		return (EReference)uiViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiView_ValidatorAssignments() {
		return (EReference)uiViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDialog() {
		return uiDialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiDialog_Content() {
		return (EReference)uiDialogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDialogAssignment() {
		return uiDialogAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiDialogAssignment_Element() {
		return (EReference)uiDialogAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiIDEView() {
		return uiIDEViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileView() {
		return uiMobileViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiPoint() {
		return uiPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiPoint_X() {
		return (EAttribute)uiPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiPoint_Y() {
		return (EAttribute)uiPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingEndpointAlias() {
		return uiBindingEndpointAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBindingEndpointAlias_Alias() {
		return (EAttribute)uiBindingEndpointAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAlias_Endpoint() {
		return (EReference)uiBindingEndpointAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingEndpointAssignment() {
		return uiBindingEndpointAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAssignment_TypedBindableDef() {
		return (EReference)uiBindingEndpointAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAssignment_Path() {
		return (EReference)uiBindingEndpointAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBindingEndpointAssignment_TypedBindableAlias() {
		return (EReference)uiBindingEndpointAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBinding() {
		return uiBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_Source() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_SourceAlias() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_TargetToSource() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_SourceToTarget() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_Target() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBinding_TargetAlias() {
		return (EReference)uiBindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiBinding_ListBinding() {
		return (EAttribute)uiBindingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiPathSegment() {
		return uiPathSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiPathSegment_JvmField() {
		return (EReference)uiPathSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiPathSegment_Path() {
		return (EReference)uiPathSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBeanSlot() {
		return uiBeanSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiBeanSlot_JvmType() {
		return (EReference)uiBeanSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiViewSet() {
		return uiViewSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRootElements() {
		return uiRootElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMaxLengthValidator() {
		return uiMaxLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiMaxLengthValidator_MaxLength() {
		return (EAttribute)uiMaxLengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMinLengthValidator() {
		return uiMinLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiMinLengthValidator_MinLength() {
		return (EAttribute)uiMinLengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRegexpValidator() {
		return uiRegexpValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiRegexpValidator_RegExpression() {
		return (EAttribute)uiRegexpValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiXbaseValidator() {
		return uiXbaseValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseValidator_Expression() {
		return (EReference)uiXbaseValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseValidator_JvmType() {
		return (EReference)uiXbaseValidatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBindingExpression() {
		return uiBindingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypedBindable() {
		return uiTypedBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypedBindableDef() {
		return uiTypedBindableDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableDef_RawBindable() {
		return (EReference)uiTypedBindableDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypedBindableDef_Method() {
		return (EReference)uiTypedBindableDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCommandBindableDef() {
		return uiCommandBindableDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiCommandBindableDef_Command() {
		return (EReference)uiCommandBindableDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRawBindable() {
		return uiRawBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiEmbeddable() {
		return uiEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiEmbeddable_Bindings() {
		return (EReference)uiEmbeddableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiField() {
		return uiFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiField_Validators() {
		return (EReference)uiFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiLayout() {
		return uiLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiLayoutAssignment() {
		return uiLayoutAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileEmbeddable() {
		return uiMobileEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileField() {
		return uiMobileFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileLayout() {
		return uiMobileLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileAction() {
		return uiMobileActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidator() {
		return uiValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiGridLayoutAssigment() {
		return uiGridLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_Element() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_From() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayoutAssigment_To() {
		return (EReference)uiGridLayoutAssigmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiGridLayout() {
		return uiGridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiGridLayout_Contents() {
		return (EReference)uiGridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiGridLayout_Columns() {
		return (EAttribute)uiGridLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiGridLayout_FillHorizontal() {
		return (EAttribute)uiGridLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiGridLayout_FillVertical() {
		return (EAttribute)uiGridLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalLayoutAssigment() {
		return uiHorizontalLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalLayoutAssigment_Element() {
		return (EReference)uiHorizontalLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalLayout() {
		return uiHorizontalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalLayout_Contents() {
		return (EReference)uiHorizontalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiHorizontalLayout_FillHorizontal() {
		return (EAttribute)uiHorizontalLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalLayoutAssigment() {
		return uiVerticalLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalLayoutAssigment_Element() {
		return (EReference)uiVerticalLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalLayout() {
		return uiVerticalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalLayout_Contents() {
		return (EReference)uiVerticalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiVerticalLayout_FillVertical() {
		return (EAttribute)uiVerticalLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiFormLayoutAssigment() {
		return uiFormLayoutAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiFormLayoutAssigment_Element() {
		return (EReference)uiFormLayoutAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiFormLayout() {
		return uiFormLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiFormLayout_Contents() {
		return (EReference)uiFormLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTextField() {
		return uiTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiImage() {
		return uiImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiImage_Value() {
		return (EAttribute)uiImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiList() {
		return uiListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiList_SelectionType() {
		return (EAttribute)uiListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiList_ItemImageProperty() {
		return (EReference)uiListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTable() {
		return uiTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTable_ColumnAssignment() {
		return (EReference)uiTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiTable_SelectionType() {
		return (EAttribute)uiTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTable_ItemImageProperty() {
		return (EReference)uiTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiComboBox() {
		return uiComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiComboBox_ItemCaptionProperty() {
		return (EReference)uiComboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiComboBox_ItemImageProperty() {
		return (EReference)uiComboBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTypeProvider() {
		return uiTypeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTypeProvider_JvmType() {
		return (EReference)uiTypeProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiColumn() {
		return uiColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiColumn_JvmField() {
		return (EReference)uiColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_IconName() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Visible() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Orderable() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Collapsed() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Collapsible() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_Alignment() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiColumn_ExpandRatio() {
		return (EAttribute)uiColumnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiColumnsAssignment() {
		return uiColumnsAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiColumnsAssignment_Columns() {
		return (EReference)uiColumnsAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiNumericField() {
		return uiNumericFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNumericField_Grouping() {
		return (EAttribute)uiNumericFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiNumericField_MarkNegative() {
		return (EAttribute)uiNumericFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCheckBox() {
		return uiCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessable() {
		return uiVisibilityProcessableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessable_ProcessorAssignment() {
		return (EReference)uiVisibilityProcessableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessor() {
		return uiVisibilityProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_BindingAlias() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_ChangeTrigger() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_Rule() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessor_PropertiesAssignment() {
		return (EReference)uiVisibilityProcessorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessorDef() {
		return uiVisibilityProcessorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorDef_Processor() {
		return (EReference)uiVisibilityProcessorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProcessorAssignment() {
		return uiVisibilityProcessorAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorAssignment_Processor() {
		return (EReference)uiVisibilityProcessorAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityProcessorAssignment_ProcessorAlias() {
		return (EReference)uiVisibilityProcessorAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiChangeTrigger() {
		return uiChangeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiChangeTrigger_Endpoint() {
		return (EReference)uiChangeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiChangeTrigger_EndpointAlias() {
		return (EReference)uiChangeTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityRule() {
		return uiVisibilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiXbaseVisibilityRule() {
		return uiXbaseVisibilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiXbaseVisibilityRule_Expression() {
		return (EReference)uiXbaseVisibilityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityProperties() {
		return uiVisibilityPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityPropertiesDef() {
		return uiVisibilityPropertiesDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityPropertiesDef_Properties() {
		return (EReference)uiVisibilityPropertiesDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVisibilityPropertiesAssignment() {
		return uiVisibilityPropertiesAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityPropertiesAssignment_Properties() {
		return (EReference)uiVisibilityPropertiesAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVisibilityPropertiesAssignment_PropertyAlias() {
		return (EReference)uiVisibilityPropertiesAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidatorAlias() {
		return uiValidatorAliasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiValidatorAlias_Alias() {
		return (EAttribute)uiValidatorAliasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAlias_Validator() {
		return (EReference)uiValidatorAliasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidatorAssignment() {
		return uiValidatorAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAssignment_Field() {
		return (EReference)uiValidatorAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAssignment_ValidatorDef() {
		return (EReference)uiValidatorAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorAssignment_ValidatorAlias() {
		return (EReference)uiValidatorAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiValidatorDef() {
		return uiValidatorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorDef_Validator() {
		return (EReference)uiValidatorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiValidatorDef_JvmType() {
		return (EReference)uiValidatorDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalButtonGroupAssigment() {
		return uiHorizontalButtonGroupAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalButtonGroupAssigment_Element() {
		return (EReference)uiHorizontalButtonGroupAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiHorizontalButtonGroup() {
		return uiHorizontalButtonGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiHorizontalButtonGroup_Contents() {
		return (EReference)uiHorizontalButtonGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiAction() {
		return uiActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiButton() {
		return uiButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiSwitch() {
		return uiSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalComponentGroupAssigment() {
		return uiVerticalComponentGroupAssigmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalComponentGroupAssigment_Element() {
		return (EReference)uiVerticalComponentGroupAssigmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiVerticalComponentGroup() {
		return uiVerticalComponentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiVerticalComponentGroup_Contents() {
		return (EReference)uiVerticalComponentGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileTabSheet() {
		return uiMobileTabSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileTabSheet_Tabs() {
		return (EReference)uiMobileTabSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileTabAssignment() {
		return uiMobileTabAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileTabAssignment_Element() {
		return (EReference)uiMobileTabAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTabSheet() {
		return uiTabSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTabSheet_Tabs() {
		return (EReference)uiTabSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTabAssignment() {
		return uiTabAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiTabAssignment_Element() {
		return (EReference)uiTabAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationHandler() {
		return uiMobileNavigationHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationPage() {
		return uiMobileNavigationPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationPage_Contents() {
		return (EReference)uiMobileNavigationPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationPageAssignment() {
		return uiMobileNavigationPageAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationPageAssignment_Element() {
		return (EReference)uiMobileNavigationPageAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationButton() {
		return uiMobileNavigationButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationButton_TargetPage() {
		return (EReference)uiMobileNavigationButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationButton_TargetPageAlias() {
		return (EReference)uiMobileNavigationButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiCommand() {
		return uiCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiMobileNavigationCommand() {
		return uiMobileNavigationCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationCommand_TargetPage() {
		return (EReference)uiMobileNavigationCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiMobileNavigationCommand_TargetPageAlias() {
		return (EReference)uiMobileNavigationCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiOpenDialogCommand() {
		return uiOpenDialogCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiOpenDialogCommand_Dialog() {
		return (EReference)uiOpenDialogCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiLabel() {
		return uiLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDecimalField() {
		return uiDecimalFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDecimalField_Precision() {
		return (EAttribute)uiDecimalFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDecimalField_Grouping() {
		return (EAttribute)uiDecimalFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiDecimalField_MarkNegative() {
		return (EAttribute)uiDecimalFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiTextArea() {
		return uiTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiRadioButtonGroup() {
		return uiRadioButtonGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUiRadioButtonGroup_SelectionType() {
		return (EAttribute)uiRadioButtonGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiRadioButtonGroup_ItemImageProperty() {
		return (EReference)uiRadioButtonGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUiRadioButtonGroup_ItemCaptionProperty() {
		return (EReference)uiRadioButtonGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiDateField() {
		return uiDateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiBrowser() {
		return uiBrowserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUiProgressBar() {
		return uiProgressBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUiFlatAlignment() {
		return uiFlatAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUiSelectionType() {
		return uiSelectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelFactory getUiModelFactory() {
		return (UiModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uiNamedElementEClass = createEClass(UI_NAMED_ELEMENT);
		createEAttribute(uiNamedElementEClass, UI_NAMED_ELEMENT__ID);
		createEAttribute(uiNamedElementEClass, UI_NAMED_ELEMENT__NAME);

		uiModelEClass = createEClass(UI_MODEL);
		createEAttribute(uiModelEClass, UI_MODEL__PACKAGE_NAME);
		createEReference(uiModelEClass, UI_MODEL__ROOTS);
		createEReference(uiModelEClass, UI_MODEL__IMPORTS);

		uiImportsEClass = createEClass(UI_IMPORTS);
		createEAttribute(uiImportsEClass, UI_IMPORTS__IMPORTED_NAMESPACE);

		uiContextEClass = createEClass(UI_CONTEXT);
		createEReference(uiContextEClass, UI_CONTEXT__BEAN_SLOTS);
		createEReference(uiContextEClass, UI_CONTEXT__BINDING_ENDPOINT_ALIAS);
		createEReference(uiContextEClass, UI_CONTEXT__BINDINGS);

		uiViewSetEClass = createEClass(UI_VIEW_SET);

		uiViewEClass = createEClass(UI_VIEW);
		createEReference(uiViewEClass, UI_VIEW__VIEW_SET);
		createEReference(uiViewEClass, UI_VIEW__CONTENT);
		createEReference(uiViewEClass, UI_VIEW__VALIDATOR_ASSIGNMENTS);

		uiDialogEClass = createEClass(UI_DIALOG);
		createEReference(uiDialogEClass, UI_DIALOG__CONTENT);

		uiDialogAssignmentEClass = createEClass(UI_DIALOG_ASSIGNMENT);
		createEReference(uiDialogAssignmentEClass, UI_DIALOG_ASSIGNMENT__ELEMENT);

		uiIDEViewEClass = createEClass(UI_IDE_VIEW);

		uiMobileViewEClass = createEClass(UI_MOBILE_VIEW);

		uiPointEClass = createEClass(UI_POINT);
		createEAttribute(uiPointEClass, UI_POINT__X);
		createEAttribute(uiPointEClass, UI_POINT__Y);

		uiBeanSlotEClass = createEClass(UI_BEAN_SLOT);
		createEReference(uiBeanSlotEClass, UI_BEAN_SLOT__JVM_TYPE);

		uiRootElementsEClass = createEClass(UI_ROOT_ELEMENTS);

		uiBindingExpressionEClass = createEClass(UI_BINDING_EXPRESSION);

		uiBindingEndpointAliasEClass = createEClass(UI_BINDING_ENDPOINT_ALIAS);
		createEAttribute(uiBindingEndpointAliasEClass, UI_BINDING_ENDPOINT_ALIAS__ALIAS);
		createEReference(uiBindingEndpointAliasEClass, UI_BINDING_ENDPOINT_ALIAS__ENDPOINT);

		uiBindingEndpointAssignmentEClass = createEClass(UI_BINDING_ENDPOINT_ASSIGNMENT);
		createEReference(uiBindingEndpointAssignmentEClass, UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_DEF);
		createEReference(uiBindingEndpointAssignmentEClass, UI_BINDING_ENDPOINT_ASSIGNMENT__PATH);
		createEReference(uiBindingEndpointAssignmentEClass, UI_BINDING_ENDPOINT_ASSIGNMENT__TYPED_BINDABLE_ALIAS);

		uiBindingEClass = createEClass(UI_BINDING);
		createEReference(uiBindingEClass, UI_BINDING__SOURCE);
		createEReference(uiBindingEClass, UI_BINDING__SOURCE_ALIAS);
		createEAttribute(uiBindingEClass, UI_BINDING__TARGET_TO_SOURCE);
		createEAttribute(uiBindingEClass, UI_BINDING__SOURCE_TO_TARGET);
		createEReference(uiBindingEClass, UI_BINDING__TARGET);
		createEReference(uiBindingEClass, UI_BINDING__TARGET_ALIAS);
		createEAttribute(uiBindingEClass, UI_BINDING__LIST_BINDING);

		uiPathSegmentEClass = createEClass(UI_PATH_SEGMENT);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__JVM_FIELD);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__PATH);

		uiRawBindableEClass = createEClass(UI_RAW_BINDABLE);

		uiTypedBindableEClass = createEClass(UI_TYPED_BINDABLE);

		uiTypedBindableDefEClass = createEClass(UI_TYPED_BINDABLE_DEF);
		createEReference(uiTypedBindableDefEClass, UI_TYPED_BINDABLE_DEF__RAW_BINDABLE);
		createEReference(uiTypedBindableDefEClass, UI_TYPED_BINDABLE_DEF__METHOD);

		uiCommandBindableDefEClass = createEClass(UI_COMMAND_BINDABLE_DEF);
		createEReference(uiCommandBindableDefEClass, UI_COMMAND_BINDABLE_DEF__COMMAND);

		uiEmbeddableEClass = createEClass(UI_EMBEDDABLE);
		createEReference(uiEmbeddableEClass, UI_EMBEDDABLE__BINDINGS);

		uiFieldEClass = createEClass(UI_FIELD);
		createEReference(uiFieldEClass, UI_FIELD__VALIDATORS);

		uiLayoutEClass = createEClass(UI_LAYOUT);

		uiLayoutAssignmentEClass = createEClass(UI_LAYOUT_ASSIGNMENT);

		uiActionEClass = createEClass(UI_ACTION);

		uiMobileEmbeddableEClass = createEClass(UI_MOBILE_EMBEDDABLE);

		uiMobileFieldEClass = createEClass(UI_MOBILE_FIELD);

		uiMobileLayoutEClass = createEClass(UI_MOBILE_LAYOUT);

		uiMobileActionEClass = createEClass(UI_MOBILE_ACTION);

		uiGridLayoutAssigmentEClass = createEClass(UI_GRID_LAYOUT_ASSIGMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ELEMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__FROM);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__TO);

		uiGridLayoutEClass = createEClass(UI_GRID_LAYOUT);
		createEReference(uiGridLayoutEClass, UI_GRID_LAYOUT__CONTENTS);
		createEAttribute(uiGridLayoutEClass, UI_GRID_LAYOUT__COLUMNS);
		createEAttribute(uiGridLayoutEClass, UI_GRID_LAYOUT__FILL_HORIZONTAL);
		createEAttribute(uiGridLayoutEClass, UI_GRID_LAYOUT__FILL_VERTICAL);

		uiHorizontalLayoutAssigmentEClass = createEClass(UI_HORIZONTAL_LAYOUT_ASSIGMENT);
		createEReference(uiHorizontalLayoutAssigmentEClass, UI_HORIZONTAL_LAYOUT_ASSIGMENT__ELEMENT);

		uiHorizontalLayoutEClass = createEClass(UI_HORIZONTAL_LAYOUT);
		createEReference(uiHorizontalLayoutEClass, UI_HORIZONTAL_LAYOUT__CONTENTS);
		createEAttribute(uiHorizontalLayoutEClass, UI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL);

		uiVerticalLayoutAssigmentEClass = createEClass(UI_VERTICAL_LAYOUT_ASSIGMENT);
		createEReference(uiVerticalLayoutAssigmentEClass, UI_VERTICAL_LAYOUT_ASSIGMENT__ELEMENT);

		uiVerticalLayoutEClass = createEClass(UI_VERTICAL_LAYOUT);
		createEReference(uiVerticalLayoutEClass, UI_VERTICAL_LAYOUT__CONTENTS);
		createEAttribute(uiVerticalLayoutEClass, UI_VERTICAL_LAYOUT__FILL_VERTICAL);

		uiFormLayoutAssigmentEClass = createEClass(UI_FORM_LAYOUT_ASSIGMENT);
		createEReference(uiFormLayoutAssigmentEClass, UI_FORM_LAYOUT_ASSIGMENT__ELEMENT);

		uiFormLayoutEClass = createEClass(UI_FORM_LAYOUT);
		createEReference(uiFormLayoutEClass, UI_FORM_LAYOUT__CONTENTS);

		uiTextFieldEClass = createEClass(UI_TEXT_FIELD);

		uiImageEClass = createEClass(UI_IMAGE);
		createEAttribute(uiImageEClass, UI_IMAGE__VALUE);

		uiListEClass = createEClass(UI_LIST);
		createEAttribute(uiListEClass, UI_LIST__SELECTION_TYPE);
		createEReference(uiListEClass, UI_LIST__ITEM_IMAGE_PROPERTY);

		uiTableEClass = createEClass(UI_TABLE);
		createEReference(uiTableEClass, UI_TABLE__COLUMN_ASSIGNMENT);
		createEAttribute(uiTableEClass, UI_TABLE__SELECTION_TYPE);
		createEReference(uiTableEClass, UI_TABLE__ITEM_IMAGE_PROPERTY);

		uiComboBoxEClass = createEClass(UI_COMBO_BOX);
		createEReference(uiComboBoxEClass, UI_COMBO_BOX__ITEM_CAPTION_PROPERTY);
		createEReference(uiComboBoxEClass, UI_COMBO_BOX__ITEM_IMAGE_PROPERTY);

		uiTypeProviderEClass = createEClass(UI_TYPE_PROVIDER);
		createEReference(uiTypeProviderEClass, UI_TYPE_PROVIDER__JVM_TYPE);

		uiColumnEClass = createEClass(UI_COLUMN);
		createEReference(uiColumnEClass, UI_COLUMN__JVM_FIELD);
		createEAttribute(uiColumnEClass, UI_COLUMN__ICON_NAME);
		createEAttribute(uiColumnEClass, UI_COLUMN__VISIBLE);
		createEAttribute(uiColumnEClass, UI_COLUMN__ORDERABLE);
		createEAttribute(uiColumnEClass, UI_COLUMN__COLLAPSED);
		createEAttribute(uiColumnEClass, UI_COLUMN__COLLAPSIBLE);
		createEAttribute(uiColumnEClass, UI_COLUMN__ALIGNMENT);
		createEAttribute(uiColumnEClass, UI_COLUMN__EXPAND_RATIO);

		uiColumnsAssignmentEClass = createEClass(UI_COLUMNS_ASSIGNMENT);
		createEReference(uiColumnsAssignmentEClass, UI_COLUMNS_ASSIGNMENT__COLUMNS);

		uiNumericFieldEClass = createEClass(UI_NUMERIC_FIELD);
		createEAttribute(uiNumericFieldEClass, UI_NUMERIC_FIELD__GROUPING);
		createEAttribute(uiNumericFieldEClass, UI_NUMERIC_FIELD__MARK_NEGATIVE);

		uiCheckBoxEClass = createEClass(UI_CHECK_BOX);

		uiVisibilityProcessableEClass = createEClass(UI_VISIBILITY_PROCESSABLE);
		createEReference(uiVisibilityProcessableEClass, UI_VISIBILITY_PROCESSABLE__PROCESSOR_ASSIGNMENT);

		uiVisibilityProcessorEClass = createEClass(UI_VISIBILITY_PROCESSOR);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__BINDING_ALIAS);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__CHANGE_TRIGGER);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__RULE);
		createEReference(uiVisibilityProcessorEClass, UI_VISIBILITY_PROCESSOR__PROPERTIES_ASSIGNMENT);

		uiVisibilityProcessorDefEClass = createEClass(UI_VISIBILITY_PROCESSOR_DEF);
		createEReference(uiVisibilityProcessorDefEClass, UI_VISIBILITY_PROCESSOR_DEF__PROCESSOR);

		uiVisibilityProcessorAssignmentEClass = createEClass(UI_VISIBILITY_PROCESSOR_ASSIGNMENT);
		createEReference(uiVisibilityProcessorAssignmentEClass, UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR);
		createEReference(uiVisibilityProcessorAssignmentEClass, UI_VISIBILITY_PROCESSOR_ASSIGNMENT__PROCESSOR_ALIAS);

		uiChangeTriggerEClass = createEClass(UI_CHANGE_TRIGGER);
		createEReference(uiChangeTriggerEClass, UI_CHANGE_TRIGGER__ENDPOINT);
		createEReference(uiChangeTriggerEClass, UI_CHANGE_TRIGGER__ENDPOINT_ALIAS);

		uiVisibilityRuleEClass = createEClass(UI_VISIBILITY_RULE);

		uiXbaseVisibilityRuleEClass = createEClass(UI_XBASE_VISIBILITY_RULE);
		createEReference(uiXbaseVisibilityRuleEClass, UI_XBASE_VISIBILITY_RULE__EXPRESSION);

		uiVisibilityPropertiesEClass = createEClass(UI_VISIBILITY_PROPERTIES);

		uiVisibilityPropertiesDefEClass = createEClass(UI_VISIBILITY_PROPERTIES_DEF);
		createEReference(uiVisibilityPropertiesDefEClass, UI_VISIBILITY_PROPERTIES_DEF__PROPERTIES);

		uiVisibilityPropertiesAssignmentEClass = createEClass(UI_VISIBILITY_PROPERTIES_ASSIGNMENT);
		createEReference(uiVisibilityPropertiesAssignmentEClass, UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTIES);
		createEReference(uiVisibilityPropertiesAssignmentEClass, UI_VISIBILITY_PROPERTIES_ASSIGNMENT__PROPERTY_ALIAS);

		uiValidatorEClass = createEClass(UI_VALIDATOR);

		uiMaxLengthValidatorEClass = createEClass(UI_MAX_LENGTH_VALIDATOR);
		createEAttribute(uiMaxLengthValidatorEClass, UI_MAX_LENGTH_VALIDATOR__MAX_LENGTH);

		uiMinLengthValidatorEClass = createEClass(UI_MIN_LENGTH_VALIDATOR);
		createEAttribute(uiMinLengthValidatorEClass, UI_MIN_LENGTH_VALIDATOR__MIN_LENGTH);

		uiRegexpValidatorEClass = createEClass(UI_REGEXP_VALIDATOR);
		createEAttribute(uiRegexpValidatorEClass, UI_REGEXP_VALIDATOR__REG_EXPRESSION);

		uiXbaseValidatorEClass = createEClass(UI_XBASE_VALIDATOR);
		createEReference(uiXbaseValidatorEClass, UI_XBASE_VALIDATOR__EXPRESSION);
		createEReference(uiXbaseValidatorEClass, UI_XBASE_VALIDATOR__JVM_TYPE);

		uiValidatorAliasEClass = createEClass(UI_VALIDATOR_ALIAS);
		createEAttribute(uiValidatorAliasEClass, UI_VALIDATOR_ALIAS__ALIAS);
		createEReference(uiValidatorAliasEClass, UI_VALIDATOR_ALIAS__VALIDATOR);

		uiValidatorAssignmentEClass = createEClass(UI_VALIDATOR_ASSIGNMENT);
		createEReference(uiValidatorAssignmentEClass, UI_VALIDATOR_ASSIGNMENT__FIELD);
		createEReference(uiValidatorAssignmentEClass, UI_VALIDATOR_ASSIGNMENT__VALIDATOR_DEF);
		createEReference(uiValidatorAssignmentEClass, UI_VALIDATOR_ASSIGNMENT__VALIDATOR_ALIAS);

		uiValidatorDefEClass = createEClass(UI_VALIDATOR_DEF);
		createEReference(uiValidatorDefEClass, UI_VALIDATOR_DEF__VALIDATOR);
		createEReference(uiValidatorDefEClass, UI_VALIDATOR_DEF__JVM_TYPE);

		uiHorizontalButtonGroupAssigmentEClass = createEClass(UI_HORIZONTAL_BUTTON_GROUP_ASSIGMENT);
		createEReference(uiHorizontalButtonGroupAssigmentEClass, UI_HORIZONTAL_BUTTON_GROUP_ASSIGMENT__ELEMENT);

		uiHorizontalButtonGroupEClass = createEClass(UI_HORIZONTAL_BUTTON_GROUP);
		createEReference(uiHorizontalButtonGroupEClass, UI_HORIZONTAL_BUTTON_GROUP__CONTENTS);

		uiButtonEClass = createEClass(UI_BUTTON);

		uiSwitchEClass = createEClass(UI_SWITCH);

		uiVerticalComponentGroupAssigmentEClass = createEClass(UI_VERTICAL_COMPONENT_GROUP_ASSIGMENT);
		createEReference(uiVerticalComponentGroupAssigmentEClass, UI_VERTICAL_COMPONENT_GROUP_ASSIGMENT__ELEMENT);

		uiVerticalComponentGroupEClass = createEClass(UI_VERTICAL_COMPONENT_GROUP);
		createEReference(uiVerticalComponentGroupEClass, UI_VERTICAL_COMPONENT_GROUP__CONTENTS);

		uiMobileTabSheetEClass = createEClass(UI_MOBILE_TAB_SHEET);
		createEReference(uiMobileTabSheetEClass, UI_MOBILE_TAB_SHEET__TABS);

		uiMobileTabAssignmentEClass = createEClass(UI_MOBILE_TAB_ASSIGNMENT);
		createEReference(uiMobileTabAssignmentEClass, UI_MOBILE_TAB_ASSIGNMENT__ELEMENT);

		uiTabSheetEClass = createEClass(UI_TAB_SHEET);
		createEReference(uiTabSheetEClass, UI_TAB_SHEET__TABS);

		uiTabAssignmentEClass = createEClass(UI_TAB_ASSIGNMENT);
		createEReference(uiTabAssignmentEClass, UI_TAB_ASSIGNMENT__ELEMENT);

		uiMobileNavigationHandlerEClass = createEClass(UI_MOBILE_NAVIGATION_HANDLER);

		uiMobileNavigationPageEClass = createEClass(UI_MOBILE_NAVIGATION_PAGE);
		createEReference(uiMobileNavigationPageEClass, UI_MOBILE_NAVIGATION_PAGE__CONTENTS);

		uiMobileNavigationPageAssignmentEClass = createEClass(UI_MOBILE_NAVIGATION_PAGE_ASSIGNMENT);
		createEReference(uiMobileNavigationPageAssignmentEClass, UI_MOBILE_NAVIGATION_PAGE_ASSIGNMENT__ELEMENT);

		uiMobileNavigationButtonEClass = createEClass(UI_MOBILE_NAVIGATION_BUTTON);
		createEReference(uiMobileNavigationButtonEClass, UI_MOBILE_NAVIGATION_BUTTON__TARGET_PAGE);
		createEReference(uiMobileNavigationButtonEClass, UI_MOBILE_NAVIGATION_BUTTON__TARGET_PAGE_ALIAS);

		uiCommandEClass = createEClass(UI_COMMAND);

		uiMobileNavigationCommandEClass = createEClass(UI_MOBILE_NAVIGATION_COMMAND);
		createEReference(uiMobileNavigationCommandEClass, UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE);
		createEReference(uiMobileNavigationCommandEClass, UI_MOBILE_NAVIGATION_COMMAND__TARGET_PAGE_ALIAS);

		uiOpenDialogCommandEClass = createEClass(UI_OPEN_DIALOG_COMMAND);
		createEReference(uiOpenDialogCommandEClass, UI_OPEN_DIALOG_COMMAND__DIALOG);

		uiLabelEClass = createEClass(UI_LABEL);

		uiDecimalFieldEClass = createEClass(UI_DECIMAL_FIELD);
		createEAttribute(uiDecimalFieldEClass, UI_DECIMAL_FIELD__PRECISION);
		createEAttribute(uiDecimalFieldEClass, UI_DECIMAL_FIELD__GROUPING);
		createEAttribute(uiDecimalFieldEClass, UI_DECIMAL_FIELD__MARK_NEGATIVE);

		uiTextAreaEClass = createEClass(UI_TEXT_AREA);

		uiRadioButtonGroupEClass = createEClass(UI_RADIO_BUTTON_GROUP);
		createEAttribute(uiRadioButtonGroupEClass, UI_RADIO_BUTTON_GROUP__SELECTION_TYPE);
		createEReference(uiRadioButtonGroupEClass, UI_RADIO_BUTTON_GROUP__ITEM_IMAGE_PROPERTY);
		createEReference(uiRadioButtonGroupEClass, UI_RADIO_BUTTON_GROUP__ITEM_CAPTION_PROPERTY);

		uiDateFieldEClass = createEClass(UI_DATE_FIELD);

		uiBrowserEClass = createEClass(UI_BROWSER);

		uiProgressBarEClass = createEClass(UI_PROGRESS_BAR);

		// Create enums
		uiFlatAlignmentEEnum = createEEnum(UI_FLAT_ALIGNMENT);
		uiSelectionTypeEEnum = createEEnum(UI_SELECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UiSemanticsPackage theUiSemanticsPackage = (UiSemanticsPackage)EPackage.Registry.INSTANCE.getEPackage(UiSemanticsPackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiModelEClass.getESuperTypes().add(this.getUiNamedElement());
		uiImportsEClass.getESuperTypes().add(this.getUiNamedElement());
		uiContextEClass.getESuperTypes().add(this.getUiRootElements());
		uiViewSetEClass.getESuperTypes().add(this.getUiContext());
		uiViewEClass.getESuperTypes().add(this.getUiContext());
		uiDialogEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiDialogEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiDialogAssignmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiIDEViewEClass.getESuperTypes().add(this.getUiView());
		uiMobileViewEClass.getESuperTypes().add(this.getUiView());
		uiBeanSlotEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiRootElementsEClass.getESuperTypes().add(this.getUiNamedElement());
		uiBindingEndpointAliasEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiBindingEndpointAssignmentEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiBindingEndpointAssignmentEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiRawBindableEClass.getESuperTypes().add(this.getUiNamedElement());
		uiTypedBindableEClass.getESuperTypes().add(this.getUiNamedElement());
		uiTypedBindableDefEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiTypedBindableDefEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiCommandBindableDefEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiCommandBindableDefEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiVisibilityProcessable());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiRawBindable());
		uiFieldEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiLayoutEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiLayoutAssignmentEClass.getESuperTypes().add(this.getUiNamedElement());
		uiActionEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiMobileEmbeddableEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiMobileFieldEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileFieldEClass.getESuperTypes().add(this.getUiField());
		uiMobileLayoutEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiMobileActionEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileActionEClass.getESuperTypes().add(this.getUiAction());
		uiGridLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiGridLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiHorizontalLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiHorizontalLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiVerticalLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiVerticalLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiFormLayoutAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiFormLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiTextFieldEClass.getESuperTypes().add(this.getUiField());
		uiImageEClass.getESuperTypes().add(this.getUiField());
		uiListEClass.getESuperTypes().add(this.getUiField());
		uiListEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiTableEClass.getESuperTypes().add(this.getUiField());
		uiTableEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiComboBoxEClass.getESuperTypes().add(this.getUiField());
		uiComboBoxEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiColumnEClass.getESuperTypes().add(this.getUiField());
		uiColumnsAssignmentEClass.getESuperTypes().add(this.getUiField());
		uiNumericFieldEClass.getESuperTypes().add(this.getUiField());
		uiCheckBoxEClass.getESuperTypes().add(this.getUiField());
		uiVisibilityProcessorEClass.getESuperTypes().add(this.getUiNamedElement());
		uiVisibilityProcessorDefEClass.getESuperTypes().add(this.getUiRootElements());
		uiVisibilityRuleEClass.getESuperTypes().add(this.getUiNamedElement());
		uiXbaseVisibilityRuleEClass.getESuperTypes().add(this.getUiVisibilityRule());
		uiVisibilityPropertiesEClass.getESuperTypes().add(this.getUiNamedElement());
		uiVisibilityPropertiesDefEClass.getESuperTypes().add(this.getUiRootElements());
		uiValidatorEClass.getESuperTypes().add(this.getUiRawBindable());
		uiMaxLengthValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiMinLengthValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiRegexpValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiXbaseValidatorEClass.getESuperTypes().add(this.getUiValidator());
		uiValidatorAliasEClass.getESuperTypes().add(this.getUiRootElements());
		uiValidatorAssignmentEClass.getESuperTypes().add(this.getUiNamedElement());
		uiValidatorDefEClass.getESuperTypes().add(this.getUiNamedElement());
		uiHorizontalButtonGroupAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiHorizontalButtonGroupEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiButtonEClass.getESuperTypes().add(this.getUiAction());
		uiSwitchEClass.getESuperTypes().add(this.getUiMobileField());
		uiVerticalComponentGroupAssigmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiVerticalComponentGroupEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiMobileTabSheetEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiMobileTabAssignmentEClass.getESuperTypes().add(this.getUiMobileEmbeddable());
		uiTabSheetEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiTabAssignmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiMobileNavigationPageEClass.getESuperTypes().add(this.getUiMobileLayout());
		uiMobileNavigationPageEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiMobileNavigationPageEClass.getESuperTypes().add(this.getUiMobileNavigationHandler());
		uiMobileNavigationPageAssignmentEClass.getESuperTypes().add(this.getUiLayoutAssignment());
		uiMobileNavigationButtonEClass.getESuperTypes().add(this.getUiMobileAction());
		uiCommandEClass.getESuperTypes().add(this.getUiNamedElement());
		uiMobileNavigationCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiOpenDialogCommandEClass.getESuperTypes().add(this.getUiCommand());
		uiLabelEClass.getESuperTypes().add(this.getUiField());
		uiDecimalFieldEClass.getESuperTypes().add(this.getUiField());
		uiTextAreaEClass.getESuperTypes().add(this.getUiField());
		uiRadioButtonGroupEClass.getESuperTypes().add(this.getUiField());
		uiRadioButtonGroupEClass.getESuperTypes().add(this.getUiTypeProvider());
		uiDateFieldEClass.getESuperTypes().add(this.getUiField());
		uiBrowserEClass.getESuperTypes().add(this.getUiField());
		uiProgressBarEClass.getESuperTypes().add(this.getUiField());

		// Initialize classes and features; add operations and parameters
		initEClass(uiNamedElementEClass, UiNamedElement.class, "UiNamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiNamedElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, UiNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UiNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiModelEClass, UiModel.class, "UiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiModel_PackageName(), ecorePackage.getEString(), "packageName", null, 1, 1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiModel_Roots(), this.getUiRootElements(), null, "roots", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiModel_Imports(), this.getUiImports(), null, "imports", null, 0, -1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiImportsEClass, UiImports.class, "UiImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiImports_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 1, 1, UiImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiContextEClass, UiContext.class, "UiContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiContext_BeanSlots(), this.getUiBeanSlot(), null, "beanSlots", null, 0, -1, UiContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiContext_BindingEndpointAlias(), this.getUiBindingEndpointAlias(), null, "bindingEndpointAlias", null, 0, -1, UiContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiContext_Bindings(), this.getUiBinding(), null, "bindings", null, 0, -1, UiContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiViewSetEClass, UiViewSet.class, "UiViewSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiViewEClass, UiView.class, "UiView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiView_ViewSet(), this.getUiViewSet(), null, "viewSet", null, 0, 1, UiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiView_Content(), this.getUiEmbeddable(), null, "content", null, 0, 1, UiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiView_ValidatorAssignments(), this.getUiValidatorAssignment(), null, "validatorAssignments", null, 0, -1, UiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDialogEClass, UiDialog.class, "UiDialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiDialog_Content(), this.getUiDialogAssignment(), null, "content", null, 0, 1, UiDialog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDialogAssignmentEClass, UiDialogAssignment.class, "UiDialogAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiDialogAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiDialogAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiIDEViewEClass, UiIDEView.class, "UiIDEView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileViewEClass, UiMobileView.class, "UiMobileView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiPointEClass, UiPoint.class, "UiPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, UiPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBeanSlotEClass, UiBeanSlot.class, "UiBeanSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBeanSlot_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRootElementsEClass, UiRootElements.class, "UiRootElements", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiBindingExpressionEClass, UiBindingExpression.class, "UiBindingExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiBindingEndpointAliasEClass, UiBindingEndpointAlias.class, "UiBindingEndpointAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiBindingEndpointAlias_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, UiBindingEndpointAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointAlias_Endpoint(), this.getUiBindingExpression(), null, "endpoint", null, 1, 1, UiBindingEndpointAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEndpointAssignmentEClass, UiBindingEndpointAssignment.class, "UiBindingEndpointAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBindingEndpointAssignment_TypedBindableDef(), this.getUiBindingExpression(), null, "typedBindableDef", null, 0, 1, UiBindingEndpointAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointAssignment_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiBindingEndpointAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBindingEndpointAssignment_TypedBindableAlias(), this.getUiTypedBindable(), null, "typedBindableAlias", null, 0, 1, UiBindingEndpointAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiBindingEClass, UiBinding.class, "UiBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiBinding_Source(), this.getUiBindingExpression(), null, "source", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_SourceAlias(), this.getUiTypedBindable(), null, "sourceAlias", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_TargetToSource(), ecorePackage.getEBoolean(), "targetToSource", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_SourceToTarget(), ecorePackage.getEBoolean(), "sourceToTarget", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_Target(), this.getUiBindingExpression(), null, "target", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiBinding_TargetAlias(), this.getUiTypedBindable(), null, "targetAlias", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiBinding_ListBinding(), ecorePackage.getEBoolean(), "listBinding", null, 0, 1, UiBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPathSegmentEClass, UiPathSegment.class, "UiPathSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiPathSegment_JvmField(), theTypesPackage.getJvmField(), null, "jvmField", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiPathSegment_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRawBindableEClass, UiRawBindable.class, "UiRawBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiTypedBindableEClass, UiTypedBindable.class, "UiTypedBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiTypedBindableDefEClass, UiTypedBindableDef.class, "UiTypedBindableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTypedBindableDef_RawBindable(), this.getUiRawBindable(), null, "rawBindable", null, 0, 1, UiTypedBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTypedBindableDef_Method(), theUiSemanticsPackage.getUxEndpointDef(), null, "method", null, 0, 1, UiTypedBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiCommandBindableDefEClass, UiCommandBindableDef.class, "UiCommandBindableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiCommandBindableDef_Command(), this.getUiCommand(), null, "command", null, 0, 1, UiCommandBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiEmbeddableEClass, UiEmbeddable.class, "UiEmbeddable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiEmbeddable_Bindings(), this.getUiBinding(), null, "bindings", null, 0, -1, UiEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFieldEClass, UiField.class, "UiField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiField_Validators(), this.getUiValidator(), null, "validators", null, 0, -1, UiField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLayoutEClass, UiLayout.class, "UiLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiLayoutAssignmentEClass, UiLayoutAssignment.class, "UiLayoutAssignment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiActionEClass, UiAction.class, "UiAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileEmbeddableEClass, UiMobileEmbeddable.class, "UiMobileEmbeddable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileFieldEClass, UiMobileField.class, "UiMobileField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileLayoutEClass, UiMobileLayout.class, "UiMobileLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileActionEClass, UiMobileAction.class, "UiMobileAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiGridLayoutAssigmentEClass, UiGridLayoutAssigment.class, "UiGridLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_From(), this.getUiPoint(), null, "from", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_To(), this.getUiPoint(), null, "to", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiGridLayoutEClass, UiGridLayout.class, "UiGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayout_Contents(), this.getUiGridLayoutAssigment(), null, "contents", null, 0, -1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiGridLayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiGridLayout_FillHorizontal(), ecorePackage.getEBoolean(), "fillHorizontal", "false", 0, 1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiGridLayout_FillVertical(), ecorePackage.getEBoolean(), "fillVertical", "false", 0, 1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalLayoutAssigmentEClass, UiHorizontalLayoutAssigment.class, "UiHorizontalLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiHorizontalLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalLayoutEClass, UiHorizontalLayout.class, "UiHorizontalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalLayout_Contents(), this.getUiHorizontalLayoutAssigment(), null, "contents", null, 0, -1, UiHorizontalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiHorizontalLayout_FillHorizontal(), ecorePackage.getEBoolean(), "fillHorizontal", "false", 0, 1, UiHorizontalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVerticalLayoutAssigmentEClass, UiVerticalLayoutAssigment.class, "UiVerticalLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiVerticalLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVerticalLayoutEClass, UiVerticalLayout.class, "UiVerticalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalLayout_Contents(), this.getUiVerticalLayoutAssigment(), null, "contents", null, 0, -1, UiVerticalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiVerticalLayout_FillVertical(), ecorePackage.getEBoolean(), "fillVertical", "false", 0, 1, UiVerticalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFormLayoutAssigmentEClass, UiFormLayoutAssigment.class, "UiFormLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiFormLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiFormLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFormLayoutEClass, UiFormLayout.class, "UiFormLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiFormLayout_Contents(), this.getUiFormLayoutAssigment(), null, "contents", null, 0, -1, UiFormLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTextFieldEClass, UiTextField.class, "UiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiImageEClass, UiImage.class, "UiImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiImage_Value(), ecorePackage.getEString(), "value", null, 0, 1, UiImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiListEClass, UiList.class, "UiList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiList_SelectionType(), this.getUiSelectionType(), "selectionType", "SINGLE", 1, 1, UiList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiList_ItemImageProperty(), theTypesPackage.getJvmField(), null, "itemImageProperty", null, 0, 1, UiList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTableEClass, UiTable.class, "UiTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTable_ColumnAssignment(), this.getUiColumnsAssignment(), null, "columnAssignment", null, 0, 1, UiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiTable_SelectionType(), this.getUiSelectionType(), "selectionType", "SINGLE", 1, 1, UiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTable_ItemImageProperty(), theTypesPackage.getJvmField(), null, "itemImageProperty", null, 0, 1, UiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComboBoxEClass, UiComboBox.class, "UiComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiComboBox_ItemCaptionProperty(), theTypesPackage.getJvmField(), null, "itemCaptionProperty", null, 0, 1, UiComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiComboBox_ItemImageProperty(), theTypesPackage.getJvmField(), null, "itemImageProperty", null, 0, 1, UiComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTypeProviderEClass, UiTypeProvider.class, "UiTypeProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTypeProvider_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiTypeProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiColumnEClass, UiColumn.class, "UiColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiColumn_JvmField(), theTypesPackage.getJvmField(), null, "jvmField", null, 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_IconName(), ecorePackage.getEString(), "iconName", null, 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Orderable(), ecorePackage.getEBoolean(), "orderable", "true", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Collapsed(), ecorePackage.getEBoolean(), "collapsed", "false", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Collapsible(), ecorePackage.getEBoolean(), "collapsible", "true", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_Alignment(), this.getUiFlatAlignment(), "alignment", "LEFT", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiColumn_ExpandRatio(), ecorePackage.getEFloat(), "expandRatio", "-1.0f", 0, 1, UiColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiColumnsAssignmentEClass, UiColumnsAssignment.class, "UiColumnsAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiColumnsAssignment_Columns(), this.getUiColumn(), null, "columns", null, 0, -1, UiColumnsAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiNumericFieldEClass, UiNumericField.class, "UiNumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiNumericField_Grouping(), ecorePackage.getEBoolean(), "grouping", "false", 0, 1, UiNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiNumericField_MarkNegative(), ecorePackage.getEBoolean(), "markNegative", "false", 0, 1, UiNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiCheckBoxEClass, UiCheckBox.class, "UiCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiVisibilityProcessableEClass, UiVisibilityProcessable.class, "UiVisibilityProcessable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessable_ProcessorAssignment(), this.getUiVisibilityProcessorAssignment(), null, "processorAssignment", null, 0, 1, UiVisibilityProcessable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorEClass, UiVisibilityProcessor.class, "UiVisibilityProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessor_BindingAlias(), this.getUiBindingEndpointAlias(), null, "bindingAlias", null, 0, -1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_ChangeTrigger(), this.getUiChangeTrigger(), null, "changeTrigger", null, 0, -1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_Rule(), this.getUiVisibilityRule(), null, "rule", null, 0, 1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessor_PropertiesAssignment(), this.getUiVisibilityPropertiesAssignment(), null, "propertiesAssignment", null, 0, 1, UiVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorDefEClass, UiVisibilityProcessorDef.class, "UiVisibilityProcessorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessorDef_Processor(), this.getUiVisibilityProcessor(), null, "processor", null, 0, 1, UiVisibilityProcessorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityProcessorAssignmentEClass, UiVisibilityProcessorAssignment.class, "UiVisibilityProcessorAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityProcessorAssignment_Processor(), this.getUiVisibilityProcessor(), null, "processor", null, 0, 1, UiVisibilityProcessorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityProcessorAssignment_ProcessorAlias(), this.getUiVisibilityProcessor(), null, "processorAlias", null, 0, 1, UiVisibilityProcessorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiChangeTriggerEClass, UiChangeTrigger.class, "UiChangeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiChangeTrigger_Endpoint(), this.getUiBindingExpression(), null, "endpoint", null, 0, 1, UiChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiChangeTrigger_EndpointAlias(), this.getUiBindingEndpointAlias(), null, "endpointAlias", null, 0, 1, UiChangeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityRuleEClass, UiVisibilityRule.class, "UiVisibilityRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiXbaseVisibilityRuleEClass, UiXbaseVisibilityRule.class, "UiXbaseVisibilityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiXbaseVisibilityRule_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, UiXbaseVisibilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityPropertiesEClass, UiVisibilityProperties.class, "UiVisibilityProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiVisibilityPropertiesDefEClass, UiVisibilityPropertiesDef.class, "UiVisibilityPropertiesDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityPropertiesDef_Properties(), this.getUiVisibilityProperties(), null, "properties", null, 0, 1, UiVisibilityPropertiesDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVisibilityPropertiesAssignmentEClass, UiVisibilityPropertiesAssignment.class, "UiVisibilityPropertiesAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVisibilityPropertiesAssignment_Properties(), this.getUiVisibilityProperties(), null, "properties", null, 0, 1, UiVisibilityPropertiesAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiVisibilityPropertiesAssignment_PropertyAlias(), this.getUiVisibilityProperties(), null, "propertyAlias", null, 0, 1, UiVisibilityPropertiesAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorEClass, UiValidator.class, "UiValidator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMaxLengthValidatorEClass, UiMaxLengthValidator.class, "UiMaxLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiMaxLengthValidator_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, UiMaxLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMinLengthValidatorEClass, UiMinLengthValidator.class, "UiMinLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiMinLengthValidator_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, UiMinLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRegexpValidatorEClass, UiRegexpValidator.class, "UiRegexpValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiRegexpValidator_RegExpression(), ecorePackage.getEString(), "regExpression", null, 0, 1, UiRegexpValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiXbaseValidatorEClass, UiXbaseValidator.class, "UiXbaseValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiXbaseValidator_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, UiXbaseValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiXbaseValidator_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiXbaseValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorAliasEClass, UiValidatorAlias.class, "UiValidatorAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiValidatorAlias_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, UiValidatorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorAlias_Validator(), this.getUiValidator(), null, "validator", null, 1, 1, UiValidatorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorAssignmentEClass, UiValidatorAssignment.class, "UiValidatorAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiValidatorAssignment_Field(), this.getUiField(), null, "field", null, 1, 1, UiValidatorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorAssignment_ValidatorDef(), this.getUiValidatorDef(), null, "validatorDef", null, 0, 1, UiValidatorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorAssignment_ValidatorAlias(), this.getUiValidatorAlias(), null, "validatorAlias", null, 0, 1, UiValidatorAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiValidatorDefEClass, UiValidatorDef.class, "UiValidatorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiValidatorDef_Validator(), this.getUiValidator(), null, "validator", null, 0, 1, UiValidatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiValidatorDef_JvmType(), theTypesPackage.getJvmTypeReference(), null, "jvmType", null, 0, 1, UiValidatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalButtonGroupAssigmentEClass, UiHorizontalButtonGroupAssigment.class, "UiHorizontalButtonGroupAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalButtonGroupAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiHorizontalButtonGroupAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiHorizontalButtonGroupEClass, UiHorizontalButtonGroup.class, "UiHorizontalButtonGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiHorizontalButtonGroup_Contents(), this.getUiHorizontalButtonGroupAssigment(), null, "contents", null, 0, -1, UiHorizontalButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiButtonEClass, UiButton.class, "UiButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiSwitchEClass, UiSwitch.class, "UiSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiVerticalComponentGroupAssigmentEClass, UiVerticalComponentGroupAssigment.class, "UiVerticalComponentGroupAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalComponentGroupAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiVerticalComponentGroupAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiVerticalComponentGroupEClass, UiVerticalComponentGroup.class, "UiVerticalComponentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiVerticalComponentGroup_Contents(), this.getUiVerticalComponentGroupAssigment(), null, "contents", null, 0, -1, UiVerticalComponentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileTabSheetEClass, UiMobileTabSheet.class, "UiMobileTabSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileTabSheet_Tabs(), this.getUiMobileTabAssignment(), null, "tabs", null, 0, -1, UiMobileTabSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileTabAssignmentEClass, UiMobileTabAssignment.class, "UiMobileTabAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileTabAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiMobileTabAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTabSheetEClass, UiTabSheet.class, "UiTabSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTabSheet_Tabs(), this.getUiTabAssignment(), null, "tabs", null, 0, -1, UiTabSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTabAssignmentEClass, UiTabAssignment.class, "UiTabAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTabAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiTabAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationHandlerEClass, UiMobileNavigationHandler.class, "UiMobileNavigationHandler", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileNavigationPageEClass, UiMobileNavigationPage.class, "UiMobileNavigationPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationPage_Contents(), this.getUiMobileNavigationPageAssignment(), null, "contents", null, 0, -1, UiMobileNavigationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationPageAssignmentEClass, UiMobileNavigationPageAssignment.class, "UiMobileNavigationPageAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationPageAssignment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiMobileNavigationPageAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiMobileNavigationButtonEClass, UiMobileNavigationButton.class, "UiMobileNavigationButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationButton_TargetPage(), this.getUiMobileNavigationPage(), null, "targetPage", null, 0, 1, UiMobileNavigationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiMobileNavigationButton_TargetPageAlias(), this.getUiMobileNavigationPage(), null, "targetPageAlias", null, 0, 1, UiMobileNavigationButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiCommandEClass, UiCommand.class, "UiCommand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiMobileNavigationCommandEClass, UiMobileNavigationCommand.class, "UiMobileNavigationCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiMobileNavigationCommand_TargetPage(), this.getUiMobileNavigationPage(), null, "targetPage", null, 0, 1, UiMobileNavigationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiMobileNavigationCommand_TargetPageAlias(), this.getUiMobileNavigationPage(), null, "targetPageAlias", null, 0, 1, UiMobileNavigationCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiOpenDialogCommandEClass, UiOpenDialogCommand.class, "UiOpenDialogCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiOpenDialogCommand_Dialog(), this.getUiDialog(), null, "dialog", null, 0, 1, UiOpenDialogCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLabelEClass, UiLabel.class, "UiLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiDecimalFieldEClass, UiDecimalField.class, "UiDecimalField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiDecimalField_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, UiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiDecimalField_Grouping(), ecorePackage.getEBoolean(), "grouping", "false", 0, 1, UiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiDecimalField_MarkNegative(), ecorePackage.getEBoolean(), "markNegative", "false", 0, 1, UiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTextAreaEClass, UiTextArea.class, "UiTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiRadioButtonGroupEClass, UiRadioButtonGroup.class, "UiRadioButtonGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiRadioButtonGroup_SelectionType(), this.getUiSelectionType(), "selectionType", "SINGLE", 0, 1, UiRadioButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiRadioButtonGroup_ItemImageProperty(), theTypesPackage.getJvmField(), null, "itemImageProperty", null, 0, 1, UiRadioButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiRadioButtonGroup_ItemCaptionProperty(), theTypesPackage.getJvmField(), null, "itemCaptionProperty", null, 0, 1, UiRadioButtonGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiDateFieldEClass, UiDateField.class, "UiDateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiBrowserEClass, UiBrowser.class, "UiBrowser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiProgressBarEClass, UiProgressBar.class, "UiProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(uiFlatAlignmentEEnum, UiFlatAlignment.class, "UiFlatAlignment");
		addEEnumLiteral(uiFlatAlignmentEEnum, UiFlatAlignment.LEFT);
		addEEnumLiteral(uiFlatAlignmentEEnum, UiFlatAlignment.CENTER);
		addEEnumLiteral(uiFlatAlignmentEEnum, UiFlatAlignment.RIGHT);

		initEEnum(uiSelectionTypeEEnum, UiSelectionType.class, "UiSelectionType");
		addEEnumLiteral(uiSelectionTypeEEnum, UiSelectionType.NONE);
		addEEnumLiteral(uiSelectionTypeEEnum, UiSelectionType.SINGLE);
		addEEnumLiteral(uiSelectionTypeEEnum, UiSelectionType.MULTI);

		// Create resource
		createResource(eNS_URI);
	}

} //UiModelPackageImpl
