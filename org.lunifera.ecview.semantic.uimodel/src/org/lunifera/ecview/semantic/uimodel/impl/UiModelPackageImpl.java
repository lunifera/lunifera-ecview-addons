/**
 */
package org.lunifera.ecview.semantic.uimodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiContext;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImports;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiModelFactory;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef;
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
	private EClass uiIDEViewEClass = null;

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
	private EClass uiTextFieldEClass = null;

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
	public EClass getUiIDEView() {
		return uiIDEViewEClass;
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
	public EClass getUiTextField() {
		return uiTextFieldEClass;
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
	public EClass getUiNumericField() {
		return uiNumericFieldEClass;
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

		uiIDEViewEClass = createEClass(UI_IDE_VIEW);

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

		uiPathSegmentEClass = createEClass(UI_PATH_SEGMENT);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__JVM_FIELD);
		createEReference(uiPathSegmentEClass, UI_PATH_SEGMENT__PATH);

		uiRawBindableEClass = createEClass(UI_RAW_BINDABLE);

		uiTypedBindableEClass = createEClass(UI_TYPED_BINDABLE);

		uiTypedBindableDefEClass = createEClass(UI_TYPED_BINDABLE_DEF);
		createEReference(uiTypedBindableDefEClass, UI_TYPED_BINDABLE_DEF__RAW_BINDABLE);
		createEReference(uiTypedBindableDefEClass, UI_TYPED_BINDABLE_DEF__METHOD);

		uiEmbeddableEClass = createEClass(UI_EMBEDDABLE);

		uiFieldEClass = createEClass(UI_FIELD);
		createEReference(uiFieldEClass, UI_FIELD__VALIDATORS);

		uiLayoutEClass = createEClass(UI_LAYOUT);

		uiGridLayoutAssigmentEClass = createEClass(UI_GRID_LAYOUT_ASSIGMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__ELEMENT);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__FROM);
		createEReference(uiGridLayoutAssigmentEClass, UI_GRID_LAYOUT_ASSIGMENT__TO);

		uiGridLayoutEClass = createEClass(UI_GRID_LAYOUT);
		createEReference(uiGridLayoutEClass, UI_GRID_LAYOUT__CONTENTS);

		uiTextFieldEClass = createEClass(UI_TEXT_FIELD);

		uiListEClass = createEClass(UI_LIST);

		uiNumericFieldEClass = createEClass(UI_NUMERIC_FIELD);

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
		uiIDEViewEClass.getESuperTypes().add(this.getUiView());
		uiBeanSlotEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiRootElementsEClass.getESuperTypes().add(this.getUiNamedElement());
		uiBindingEndpointAliasEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiBindingEndpointAssignmentEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiBindingEndpointAssignmentEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiRawBindableEClass.getESuperTypes().add(this.getUiNamedElement());
		uiTypedBindableEClass.getESuperTypes().add(this.getUiNamedElement());
		uiTypedBindableDefEClass.getESuperTypes().add(this.getUiTypedBindable());
		uiTypedBindableDefEClass.getESuperTypes().add(this.getUiBindingExpression());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiVisibilityProcessable());
		uiEmbeddableEClass.getESuperTypes().add(this.getUiRawBindable());
		uiFieldEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiLayoutEClass.getESuperTypes().add(this.getUiEmbeddable());
		uiGridLayoutEClass.getESuperTypes().add(this.getUiLayout());
		uiTextFieldEClass.getESuperTypes().add(this.getUiField());
		uiListEClass.getESuperTypes().add(this.getUiField());
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

		initEClass(uiIDEViewEClass, UiIDEView.class, "UiIDEView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(uiPathSegmentEClass, UiPathSegment.class, "UiPathSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiPathSegment_JvmField(), theTypesPackage.getJvmField(), null, "jvmField", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiPathSegment_Path(), this.getUiPathSegment(), null, "path", null, 0, 1, UiPathSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiRawBindableEClass, UiRawBindable.class, "UiRawBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiTypedBindableEClass, UiTypedBindable.class, "UiTypedBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiTypedBindableDefEClass, UiTypedBindableDef.class, "UiTypedBindableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiTypedBindableDef_RawBindable(), this.getUiRawBindable(), null, "rawBindable", null, 0, 1, UiTypedBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiTypedBindableDef_Method(), theUiSemanticsPackage.getUxEndpointDef(), null, "method", null, 0, 1, UiTypedBindableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiEmbeddableEClass, UiEmbeddable.class, "UiEmbeddable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiFieldEClass, UiField.class, "UiField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiField_Validators(), this.getUiValidator(), null, "validators", null, 0, -1, UiField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiLayoutEClass, UiLayout.class, "UiLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiGridLayoutAssigmentEClass, UiGridLayoutAssigment.class, "UiGridLayoutAssigment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayoutAssigment_Element(), this.getUiEmbeddable(), null, "element", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_From(), this.getUiPoint(), null, "from", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUiGridLayoutAssigment_To(), this.getUiPoint(), null, "to", null, 0, 1, UiGridLayoutAssigment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiGridLayoutEClass, UiGridLayout.class, "UiGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUiGridLayout_Contents(), this.getUiGridLayoutAssigment(), null, "contents", null, 0, -1, UiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiTextFieldEClass, UiTextField.class, "UiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiListEClass, UiList.class, "UiList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiNumericFieldEClass, UiNumericField.class, "UiNumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		// Create resource
		createResource(eNS_URI);
	}

} //UiModelPackageImpl
