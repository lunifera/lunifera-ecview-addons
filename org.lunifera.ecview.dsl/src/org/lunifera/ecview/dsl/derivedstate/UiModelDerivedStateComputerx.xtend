package org.lunifera.ecview.dsl.derivedstate

import com.google.inject.Inject
import java.util.List
import java.util.Map
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator
import org.lunifera.ecview.core.common.model.binding.BindingFactory
import org.lunifera.ecview.core.common.model.binding.YBindingUpdateStrategy
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint
import org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint
import org.lunifera.ecview.core.common.model.binding.YValueBinding
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint
import org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint
import org.lunifera.ecview.core.common.model.core.CoreModelFactory
import org.lunifera.ecview.core.common.model.core.YAlignment
import org.lunifera.ecview.core.common.model.core.YBeanSlot
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint
import org.lunifera.ecview.core.common.model.core.YDeviceType
import org.lunifera.ecview.core.common.model.core.YDialog
import org.lunifera.ecview.core.common.model.core.YElement
import org.lunifera.ecview.core.common.model.core.YEmbeddable
import org.lunifera.ecview.core.common.model.core.YField
import org.lunifera.ecview.core.common.model.core.YFlatAlignment
import org.lunifera.ecview.core.common.model.core.YLayout
import org.lunifera.ecview.core.common.model.core.YOpenDialogCommand
import org.lunifera.ecview.core.common.model.core.YView
import org.lunifera.ecview.core.common.model.core.YViewSet
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator
import org.lunifera.ecview.core.common.model.visibility.VisibilityFactory
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor
import org.lunifera.ecview.core.^extension.model.datatypes.YDateTimeFormat
import org.lunifera.ecview.core.^extension.model.datatypes.YDateTimeResolution
import org.lunifera.ecview.core.^extension.model.^extension.ExtensionModelFactory
import org.lunifera.ecview.core.^extension.model.^extension.YBrowser
import org.lunifera.ecview.core.^extension.model.^extension.YButton
import org.lunifera.ecview.core.^extension.model.^extension.YCheckBox
import org.lunifera.ecview.core.^extension.model.^extension.YColumn
import org.lunifera.ecview.core.^extension.model.^extension.YComboBox
import org.lunifera.ecview.core.^extension.model.^extension.YDateTime
import org.lunifera.ecview.core.^extension.model.^extension.YDecimalField
import org.lunifera.ecview.core.^extension.model.^extension.YFormLayout
import org.lunifera.ecview.core.^extension.model.^extension.YGridLayout
import org.lunifera.ecview.core.^extension.model.^extension.YHorizontalLayout
import org.lunifera.ecview.core.^extension.model.^extension.YImage
import org.lunifera.ecview.core.^extension.model.^extension.YLabel
import org.lunifera.ecview.core.^extension.model.^extension.YNumericField
import org.lunifera.ecview.core.^extension.model.^extension.YOptionsGroup
import org.lunifera.ecview.core.^extension.model.^extension.YPanel
import org.lunifera.ecview.core.^extension.model.^extension.YProgressBar
import org.lunifera.ecview.core.^extension.model.^extension.YSearchPanel
import org.lunifera.ecview.core.^extension.model.^extension.YSelectionType
import org.lunifera.ecview.core.^extension.model.^extension.YSplitPanel
import org.lunifera.ecview.core.^extension.model.^extension.YTab
import org.lunifera.ecview.core.^extension.model.^extension.YTabSheet
import org.lunifera.ecview.core.^extension.model.^extension.YTable
import org.lunifera.ecview.core.^extension.model.^extension.YTextArea
import org.lunifera.ecview.core.^extension.model.^extension.YTextField
import org.lunifera.ecview.core.^extension.model.^extension.YVerticalLayout
import org.lunifera.ecview.core.^extension.model.^extension.util.SimpleExtensionModelFactory
import org.lunifera.ecview.dsl.extensions.OperationExtensions
import org.lunifera.ecview.dsl.scope.BindableTypeProvider
import org.lunifera.ecview.semantic.uimodel.UiAlignment
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiBinding
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression
import org.lunifera.ecview.semantic.uimodel.UiBrowser
import org.lunifera.ecview.semantic.uimodel.UiButton
import org.lunifera.ecview.semantic.uimodel.UiCheckBox
import org.lunifera.ecview.semantic.uimodel.UiColumn
import org.lunifera.ecview.semantic.uimodel.UiComboBox
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef
import org.lunifera.ecview.semantic.uimodel.UiDateField
import org.lunifera.ecview.semantic.uimodel.UiDateFormat
import org.lunifera.ecview.semantic.uimodel.UiDateTimeResolution
import org.lunifera.ecview.semantic.uimodel.UiDecimalField
import org.lunifera.ecview.semantic.uimodel.UiDialog
import org.lunifera.ecview.semantic.uimodel.UiDialogAssignment
import org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiField
import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment
import org.lunifera.ecview.semantic.uimodel.UiFormLayout
import org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment
import org.lunifera.ecview.semantic.uimodel.UiGridLayout
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment
import org.lunifera.ecview.semantic.uimodel.UiIDEView
import org.lunifera.ecview.semantic.uimodel.UiImage
import org.lunifera.ecview.semantic.uimodel.UiLabel
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationHandler
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet
import org.lunifera.ecview.semantic.uimodel.UiMobileView
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty
import org.lunifera.ecview.semantic.uimodel.UiNumericField
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup
import org.lunifera.ecview.semantic.uimodel.UiPanel
import org.lunifera.ecview.semantic.uimodel.UiPathSegment
import org.lunifera.ecview.semantic.uimodel.UiPoint
import org.lunifera.ecview.semantic.uimodel.UiProgressBar
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator
import org.lunifera.ecview.semantic.uimodel.UiSearchDialog
import org.lunifera.ecview.semantic.uimodel.UiSearchField
import org.lunifera.ecview.semantic.uimodel.UiSearchPanel
import org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand
import org.lunifera.ecview.semantic.uimodel.UiSelectionType
import org.lunifera.ecview.semantic.uimodel.UiSplitpanel
import org.lunifera.ecview.semantic.uimodel.UiSplitpanelAssigment
import org.lunifera.ecview.semantic.uimodel.UiSwitch
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment
import org.lunifera.ecview.semantic.uimodel.UiTabSheet
import org.lunifera.ecview.semantic.uimodel.UiTable
import org.lunifera.ecview.semantic.uimodel.UiTextArea
import org.lunifera.ecview.semantic.uimodel.UiTextField
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment
import org.lunifera.ecview.semantic.uimodel.UiView
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator
import org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage
import org.lunifera.mobile.vaadin.ecview.model.VMSwitch
import org.lunifera.mobile.vaadin.ecview.model.VMTab
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet
import org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory
import org.lunifera.xtext.builder.types.loader.api.ITypeLoader
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderFactory

import static org.lunifera.ecview.semantic.uimodel.UiAlignment.*
import static org.lunifera.ecview.semantic.uimodel.UiDateFormat.*
import static org.lunifera.ecview.semantic.uimodel.UiDateTimeResolution.*
import static org.lunifera.ecview.semantic.uimodel.UiFlatAlignment.*
import static org.lunifera.ecview.semantic.uimodel.UiSelectionType.*
import org.lunifera.ecview.semantic.uimodel.UiNamedElement
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField
import org.lunifera.ecview.core.^extension.model.^extension.YBeanReferenceField
import org.lunifera.ecview.core.^extension.model.^extension.ExtensionModelPackage
import org.lunifera.ecview.dsl.extensions.BeanHelper
import org.lunifera.ecview.core.^extension.model.^extension.YList
import org.lunifera.ecview.semantic.uimodel.UiList

class UiModelDerivedStateComputerx extends JvmModelAssociator {

	private static final Logger LOGGER = LoggerFactory.getLogger(typeof(UiModelDerivedStateComputerx));

	@Inject
	ITypeLoaderFactory typeLoaderFactory;
	ITypeLoader typeLoader

	@Inject BindableTypeProvider typeOfBoundPropertyProvider;
	@Inject TypeHelper typeHelper;
	@Inject extension IQualifiedNameProvider;
	@Inject I18nKeyProvider i18nKeyProvider

	final Stack<EObject> viewContext = new Stack
	final List<YView> views = newArrayList()
	final Map<EObject, EObject> grammarToUiAssociations = newHashMap();
	final Map<EObject, EObject> uiToGrammarAssociations = newHashMap();
	final SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory

	String currentPackage
	YView currentView;

	DerivedStateAwareResource resource
	List<UiBinding> pendingBindings = newArrayList()
	List<UiBinding> temporaryPendingBindings = newArrayList()
	List<UiVisibilityProcessorAssignment> pendingVisibilityProcessors = newArrayList()

	def void associateUi(EObject grammarElement, EObject uiElement) {
		grammarToUiAssociations.put(grammarElement, uiElement)
		uiToGrammarAssociations.put(uiElement, grammarElement)

		uiElement.eAdapters += new UiGrammarElementAdapter(grammarElement)
	}

	def <A> A associatedUi(EObject grammarElement) {
		return grammarToUiAssociations.get(grammarElement) as A
	}

	def <A> A associatedGrammar(EObject uiElement) {
		return uiToGrammarAssociations.get(uiElement) as A
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {

		super.installDerivedState(resource, preLinkingPhase)
		this.resource = resource;
		this.typeLoader = typeLoaderFactory.createTypeLoader(resource.resourceSet)

		if (resource.getContents().isEmpty()) {
			return;
		}

		if (!preLinkingPhase) {

			grammarToUiAssociations.clear
			uiToGrammarAssociations.clear

			val UiModel eObject = resource.getContents().get(0) as UiModel;
			currentPackage = eObject.packageName

			try {

				// complete all elements
				eObject.eContents.forEach [
					it.map
				]
			} catch (Exception ex) {
				LOGGER.error("{}", ex)
			}

			if (views.size > 0) {
				resource.contents += views.get(0)
			}
			views.clear
			viewContext.clear
			pendingBindings.clear
			pendingVisibilityProcessors.clear
		}

		this.typeLoader.dispose
		this.typeLoader = null;
	}

	def <A> A peek() {
		viewContext.peek as A
	}

	def <A> A pop() {
		viewContext.pop as A
	}

	def String toI18nKey(UiNamedElement element) {
		return i18nKeyProvider.toI18nKey(element)
	}

	def String toI18nKey(UiEmbeddable element) {
		return i18nKeyProvider.toI18nKey(element)
	}

	def dispatch void map(UiModel object) {
		currentPackage = object.packageName
		object.roots.filter[!(it instanceof UiValidatorAlias)].forEach[it.map]
	}

	def dispatch void map(UiView object) {
	}

	def dispatch void map(Void object) {
		println("void")
	}

	def dispatch void map(UiIDEView object) {

		// create a view instance
		val YView yView = factory.createView
		yView.contentAlignment = object.contentAlignment.toYAlignment
		object.associateUi(yView)
		views += yView
		currentView = yView
		yView.push;

		object.beanSlots.forEach[it.map]

		val element = object.content.create
		yView.content = element
		object.content.map

		object.bindings.forEach[it.map]

		object.processorAssignments.forEach [
			it.map
		]

		// process the visibility processors
		pendingVisibilityProcessors.forEach [
			it.processor.map
		]

		// install all bindings
		temporaryPendingBindings = newArrayList(pendingBindings)
		pendingBindings.clear

		temporaryPendingBindings.forEach [
			it.install
		]
		if (pendingBindings.empty) {
			object.validatorAssignments.forEach[it.map]

			pop
			currentView = null
		} else {
			temporaryPendingBindings = newArrayList(pendingBindings)
			pendingBindings.clear

			temporaryPendingBindings.forEach [
				it.install
			]
			object.validatorAssignments.forEach[it.map]

			pop
			currentView = null
		}
	}

	def dispatch void map(UiMobileView object) {

		// create a view instance
		val YView yView = factory.createView
		object.associateUi(yView)
		yView.deviceType = YDeviceType.MOBILE
		views += yView
		currentView = yView
		yView.push;

		object.beanSlots.forEach[it.map]
		val element = object.content.create
		yView.content = element
		object.content
		object.bindings.forEach[it.map]

		object.processorAssignments.forEach [
			it.map
		]

		// process the visibility processors
		pendingVisibilityProcessors.forEach [
			it.processor.map
		]

		// install all bindings
		pendingBindings.forEach [
			it.install
		]

		object.validatorAssignments.forEach[it.map]

		pop
		currentView = null
	}

	def push(EObject eObject) {
		viewContext.push(eObject)
	}

	def dispatch void map(UiGridLayout eObject) {
		val YGridLayout yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiGridLayoutAssigment eObject) {
		val YGridLayout layout = peek

		val element = eObject.element
		val newField = element.create
		layout.addElement(newField)

		if (eObject.alignment != UiAlignment.UNDEFINED) {
			val style = layout.addGridLayoutCellStyle(newField)
			style.alignment = eObject.alignment.toYAlignment
		}

		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}
	}

	def dispatch void map(UiVerticalLayout eObject) {
		val YVerticalLayout yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiVerticalLayoutAssigment eObject) {

		val YVerticalLayout layout = peek

		val element = eObject.element
		val newField = element.create

		layout.addElement(newField)

		if (eObject.alignment != UiAlignment.UNDEFINED) {
			val style = layout.addCellStyle(newField)
			style.alignment = eObject.alignment.toYAlignment
		}
		element.map

		if (element instanceof UiField) {
			if (newField != null) {
				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		}
	}

	def dispatch void map(UiHorizontalLayout eObject) {
		val YHorizontalLayout yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiHorizontalLayoutAssigment eObject) {

		val YHorizontalLayout layout = peek
		val element = eObject.element
		val newField = element.create
		layout.addElement(newField)
		if (eObject.alignment != UiAlignment.UNDEFINED) {
			val style = layout.addCellStyle(newField)
			style.alignment = eObject.alignment.toYAlignment
		}

		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}
	}

	def dispatch void map(UiSearchPanel eObject) {
		val YSearchPanel yPanel = eObject.associatedUi
		yPanel.push

		eObject.contents.forEach [
			val newField = it.create
			if (newField == null) {
				return
			}
			yPanel.addElement(newField)
			it.map
			newField.push
			val UiField yField = it as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		]

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiSplitpanel eObject) {
		val YSplitPanel yField = eObject.associatedUi
		yField.push

		eObject.firstContent.map
		eObject.secondContent.map

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiSplitpanelAssigment eObject) {

		val YSplitPanel layout = peek
		val element = eObject.element
		val newField = element.create

		if (newField == null) {
			return
		}

		layout.addElement(newField)

		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}
	}

	def dispatch void map(UiPanel eObject) {
		val YPanel yPanel = eObject.associatedUi
		yPanel.push

		val element = eObject.content
		val newField = element.create

		if (newField == null) {
			return
		}

		yPanel.elements += newField
		element.map

		if (element instanceof UiField) {
			if (newField != null) {
				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		}

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiTabSheet eObject) {
		val YTabSheet yField = eObject.associatedUi
		yField.push

		eObject.tabs.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiTabAssignment eObject) {

		val YTabSheet layout = peek
		val YTab tab = factory.createTab
		tab.label = eObject.name
		tab.labelI18nKey = eObject.toI18nKey
		layout.tabs += tab

		tab.push

		val element = eObject.element
		val newField = element.create
		tab.embeddable = newField

		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}

		pop

	}

	def dispatch void map(UiMobileTabSheet eObject) {
		val VMTabSheet yField = eObject.associatedUi
		yField.push

		eObject.tabs.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiMobileTabAssignment eObject) {

		val VMTabSheet layout = peek
		val VMTab tab = VaadinMobileFactory.eINSTANCE.createVMTab
		tab.label = eObject.name
		layout.tabs += tab

		tab.push

		val element = eObject.element
		val newField = element.create
		tab.embeddable = newField
		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}

		eObject.processorAssignments.forEach [
			it.map
		]

		pop

	}

	def dispatch void map(UiHorizontalButtonGroup eObject) {
		val VMHorizontalButtonGroup yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiHorizontalButtonGroupAssigment eObject) {

		val VMHorizontalButtonGroup layout = peek
		val element = eObject.element
		val newField = element.create
		layout.addElement(newField)
		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}

	}

	def dispatch void map(UiVerticalComponentGroup eObject) {
		val VMVerticalComponentGroup yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiVerticalComponentGroupAssigment eObject) {

		val VMVerticalComponentGroup layout = peek
		val element = eObject.element
		val newField = element.create
		layout.addElement(newField)

		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}

	}

	def dispatch void map(UiMobileNavigationPage eObject) {
		val VMNavigationPage yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiDialog eObject) {
		val YDialog layout = CoreModelFactory.eINSTANCE.createYDialog
		layout.name = eObject.name
		layout.label = eObject.name
		layout.labelI18nKey = eObject.toI18nKey

		if (eObject.jvmType != null) {
			layout.typeQualifiedName = eObject.jvmType.qualifiedName
			layout.type = loadClass(eObject.eResource.resourceSet, eObject.jvmType.qualifiedName)
		}

		currentView.dialogs += layout

		eObject.associateUi(layout)

		layout.push

		eObject.content?.map

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		eObject.processorAssignments.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiSearchDialog eObject) {
		val YDialog dialog = CoreModelFactory.eINSTANCE.createYDialog
		dialog.name = eObject.name
		dialog.label = eObject.name
		dialog.labelI18nKey = eObject.toI18nKey

		val YOpenDialogCommand command = peek
		if (command != null) {
			command.dialog = dialog
		}

		if (eObject.jvmType != null) {
			dialog.typeQualifiedName = eObject.jvmType.qualifiedName
			dialog.type = loadClass(eObject.eResource.resourceSet, eObject.jvmType.qualifiedName)
		}

		eObject.associateUi(dialog)
		currentView.dialogs += dialog
		dialog.push

		val YVerticalLayout content = ExtensionModelFactory.eINSTANCE.createYVerticalLayout
		dialog.content = content
		content.push

		val YGridLayout searchFieldLayout = ExtensionModelFactory.eINSTANCE.createYGridLayout
		content.elements += searchFieldLayout
		searchFieldLayout.push

		eObject.searchFields.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		// pop searchFieldLayout
		pop

		// map the content of the search dialog
		eObject.content?.map

		// pop content
		pop

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		// pop dialog
		pop
	}

	def dispatch void map(UiDialogAssignment eObject) {

		val YDialog yDialog = peek

		val element = eObject.element
		val newField = element.create
		yDialog.content = newField
		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}
	}

	def dispatch void map(UiSearchField eObject) {
		// nothing to do
	}

	def dispatch void map(UiDialogSearchFieldAssignment eObject) {

		val YLayout layout = peek
		val element = eObject.element

		val UiNestedProperty property = element.property
		if (property != null) {
			val JvmType type = property.typeofLastSegment

			var YField newField = null
			if (typeHelper.isString(type)) {
				newField = ExtensionModelFactory.eINSTANCE.createYTextSearchField
			} else if (typeHelper.isNumber(type)) {
				newField = ExtensionModelFactory.eINSTANCE.createYNumericSearchField
			} else if (typeHelper.isBoolean(type)) {
				newField = ExtensionModelFactory.eINSTANCE.createYBooleanSearchField
			}

			if (newField != null) {
				layout.elements += newField
			}
		}
	}

	def void createTransient(UiMobileNavigationPage eObject) {
		val VMNavigationPage yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiMobileNavigationPageAssignment eObject) {
		val VMNavigationPage layout = peek
		val element = eObject.element
		val newField = element.create
		layout.addElement(newField)

		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}

	}

	def dispatch void map(UiFormLayout eObject) {
		val YFormLayout yField = eObject.associatedUi
		yField.push

		eObject.contents.forEach [
			it.map
		]

		eObject.bindings.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiFormLayoutAssigment eObject) {

		val YFormLayout layout = peek
		val element = eObject.element
		val newField = element.create
		if (newField == null) {
			return
		}
		layout.addElement(newField)

		element.map

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		}

	}

	def dispatch void map(UiOptionsGroup eObject) {
		val YOptionsGroup yOptionsGroup = eObject.associatedUi
		yOptionsGroup.push

		eObject.bindings.forEach [
			it.map
		]

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}
	
	def dispatch void map(UiList eObject) {
		val YList yList = eObject.associatedUi
		yList.push

		eObject.bindings.forEach [
			it.map
		]

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiTable eObject) {
		val YTable yField = eObject.associatedUi
		yField.push

		if (eObject.columnAssignment != null) {
			eObject.columnAssignment.columns.forEach [
				it.map
			]
		}

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiImage eObject) {
		val YImage yField = eObject.associatedUi
		yField.push

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		pop
	}

	def dispatch void map(UiComboBox eObject) {
		val YComboBox yField = eObject.associatedUi
		yField.push

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		eObject.processorAssignments.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiButton object) {
		val YButton yField = object.associatedUi

		object.bindings.forEach [
			it.map
		]

		object.processorAssignments.forEach [
			it.map
		]

	}

	def dispatch void map(UiMobileNavigationButton object) {
		val VMNavigationButton button = object.associatedUi

		button.push
		if (object.targetPage != null) {
			object.targetPage.map
		} else if (object.targetPageAlias != null) {
			object.targetPageAlias.map
		}

		object.bindings.forEach [
			it.map
		]

		object.processorAssignments.forEach [
			it.map
		]

		pop

	}

	def dispatch void map(UiColumn eObject) {
		val YTable yField = peek

		val YColumn yColumn = factory.createColumn
		yColumn.alignment = eObject.alignment.toYFlatAlignment
		yColumn.collapsed = eObject.collapsed
		yColumn.collapsible = eObject.collapsible
		yColumn.expandRatio = eObject.expandRatio
		yColumn.icon = eObject.iconName

		val UiNestedProperty property = eObject.property
		if (property != null) {
			yColumn.propertyPath = property.toPathString
		}

		yColumn.orderable = eObject.orderable
		yColumn.visible = eObject.visible
		yColumn.labelI18nKey = eObject.toI18nKey

		yField.columns += yColumn
	}

	def YDateTimeFormat toYDateTimeFormat(UiDateFormat format) {
		switch (format) {
			case DATE:
				return YDateTimeFormat.DATE
			case DATE_TIME:
				return YDateTimeFormat.DATE_TIME
			case TIME:
				return YDateTimeFormat.TIME
		}
	}

	def YDateTimeResolution toYDateTimeResolution(UiDateTimeResolution value) {
		switch (value) {
			case SECOND:
				return YDateTimeResolution.SECOND
			case MINUTE:
				return YDateTimeResolution.MINUTE
			case HOUR:
				return YDateTimeResolution.HOUR
			case DAY:
				return YDateTimeResolution.DAY
			case MONTH:
				return YDateTimeResolution.MONTH
			case YEAR:
				return YDateTimeResolution.YEAR
			case UNDEFINED:
				return YDateTimeResolution.UNDEFINED
		}
	}

	def YFlatAlignment toYFlatAlignment(UiFlatAlignment uiAlign) {
		switch (uiAlign) {
			case LEFT:
				return YFlatAlignment.LEFT
			case CENTER:
				return YFlatAlignment.CENTER
			case RIGHT:
				return YFlatAlignment.RIGHT
		}
	}

	def YAlignment toYAlignment(UiAlignment uiAlign) {
		switch (uiAlign) {
			case BOTTOM_CENTER:
				return YAlignment.BOTTOM_CENTER
			case BOTTOM_FILL:
				return YAlignment.BOTTOM_FILL
			case BOTTOM_LEFT:
				return YAlignment.BOTTOM_LEFT
			case BOTTOM_RIGHT:
				return YAlignment.BOTTOM_RIGHT
			case FILL_CENTER:
				return YAlignment.FILL_CENTER
			case FILL_FILL:
				return YAlignment.FILL_FILL
			case FILL_LEFT:
				return YAlignment.FILL_LEFT
			case FILL_RIGHT:
				return YAlignment.FILL_RIGHT
			case MIDDLE_CENTER:
				return YAlignment.MIDDLE_CENTER
			case MIDDLE_FILL:
				return YAlignment.MIDDLE_FILL
			case MIDDLE_LEFT:
				return YAlignment.MIDDLE_LEFT
			case MIDDLE_RIGHT:
				return YAlignment.MIDDLE_RIGHT
			case TOP_CENTER:
				return YAlignment.TOP_CENTER
			case TOP_FILL:
				return YAlignment.TOP_FILL
			case TOP_LEFT:
				return YAlignment.TOP_LEFT
			case TOP_RIGHT:
				return YAlignment.TOP_RIGHT
			case UNDEFINED:
				return YAlignment.UNDEFINED
		}
	}

	def dispatch void map(UiValidatorAssignment eObject) {

		val YField yField = eObject.field.associatedUi
		yField.push

		if (eObject.validatorAlias != null) {
			eObject.validatorAlias.map
		} else if (eObject.validatorDef != null) {
			eObject.validatorDef.map
		}
		pop
	}

	def dispatch void map(UiValidatorDef eObject) {
		eObject.validator.map
	}

	def dispatch void map(UiValidatorAlias eObject) {
		if (viewContext.length == 0) {
			return
		}

	//		eObject.validator.map
	}

	def dispatch void map(UiVisibilityProcessorAssignment eObject) {

		// must be installed after all UI elements have been created
		pendingVisibilityProcessors += eObject
	}

	def dispatch void map(UiVisibilityProcessor eObject) {
		val YVisibilityProcessor yProcessor = VisibilityFactory.eINSTANCE.createYVisibilityProcessor
		yProcessor.delegate = loadClass(eObject.eResource.resourceSet, eObject.fullyQualifiedName.toString)
		yProcessor.delegateQualifiedName = eObject.fullyQualifiedName.toString
		currentView.visibilityProcessors += yProcessor

		for (trigger : eObject.changeTriggers) {
			val YValueBindingEndpoint sourceEP = (trigger.endpoint as UiBindingEndpointAssignment).
				createValueBindingEndpoint()
			val YVisibilityProcessorValueBindingEndpoint targetEP = BindingFactory.eINSTANCE.
				createYVisibilityProcessorValueBindingEndpoint
			targetEP.property = trigger.alias

			// create a new binding
			val YValueBinding binding = BindingFactory.eINSTANCE.createYValueBinding();
			binding.setTargetEndpoint(targetEP);
			binding.setModelEndpoint(sourceEP);
			binding.setModelToTargetStrategy(YBindingUpdateStrategy.UPDATE);
			binding.setTargetToModelStrategy(YBindingUpdateStrategy.NEVER);
			yProcessor.triggersOn += binding
		}

		for (dataUsed : eObject.dataUsed) {
			val YValueBindingEndpoint sourceEP = (dataUsed.endpoint as UiBindingEndpointAssignment).
				createValueBindingEndpoint()
			val YVisibilityProcessorValueBindingEndpoint targetEP = BindingFactory.eINSTANCE.
				createYVisibilityProcessorValueBindingEndpoint
			targetEP.property = dataUsed.alias

			// create a new binding
			val YValueBinding binding = BindingFactory.eINSTANCE.createYValueBinding();
			binding.setTargetEndpoint(targetEP);
			binding.setModelEndpoint(sourceEP);
			binding.setModelToTargetStrategy(YBindingUpdateStrategy.UPDATE);
			binding.setTargetToModelStrategy(YBindingUpdateStrategy.NEVER);
			yProcessor.dataUsed += binding
		}
	}

	def dispatch void map(UiMaxLengthValidator eObject) {
		val YMaxLengthValidator newValidator = factory.createMaxLengthValidator
		newValidator.maxLength = eObject.maxLength
		newValidator.errorCode = eObject.errorCode?.fullyQualifiedName?.toString
		newValidator.defaultErrorMessage = eObject.errorCode?.defaultMessage
		eObject.associateUi(newValidator)

		val YField yField = peek
		if (yField != null) {
			yField.validators += newValidator
		}
	}

	def dispatch void map(UiMinLengthValidator eObject) {
		val YMinLengthValidator newValidator = factory.createMinLengthValidator
		newValidator.minLength = eObject.minLength
		newValidator.errorCode = eObject.errorCode?.fullyQualifiedName?.toString
		newValidator.defaultErrorMessage = eObject.errorCode?.defaultMessage

		eObject.associateUi(newValidator)

		val YField yField = peek
		if (yField != null) {
			yField.validators += newValidator
		}
	}

	def dispatch void map(UiRegexpValidator eObject) {
		val YRegexpValidator newValidator = factory.createRegexpValidator
		newValidator.regExpression = eObject.regExpression
		newValidator.errorCode = eObject.errorCode?.fullyQualifiedName?.toString
		newValidator.defaultErrorMessage = eObject.errorCode?.defaultMessage

		eObject.associateUi(newValidator)

		val YField yField = peek
		if (yField != null) {
			yField.validators += newValidator
		}
	}

	def dispatch void map(UiXbaseValidator eObject) {

		val jvmTypes = eObject.getJvmElements
		val JvmGenericType jvmType = if(jvmTypes.size > 0) eObject.getJvmElements.get(0) as JvmGenericType

		val YField yField = peek
		if (jvmType != null && yField != null) {
			val YClassDelegateValidator yValidator = factory.createClassDelegateValidator
			eObject.associateUi(yValidator)
			yValidator.className = jvmType.qualifiedName
			yField.validators += yValidator
		}
	}

	def dispatch YEmbeddable create(UiEmbeddable object) {
	}

	def dispatch YEmbeddable create(Void object) {
		return null
	}

	def dispatch YEmbeddable create(UiTextField object) {
		val YTextField textField = factory.createTextField
		textField.id = UiModelGrammarUtil.getPathId(object)
		textField.name = object.name
		textField.label = object.name
		textField.labelI18nKey = object.toI18nKey
		textField.initialEnabled = !object.readonly

		val dt = factory.createTextDatatype
		textField.datatype = dt
		textField.orphanDatatypes += dt

		dt.maxLength = object.maxLength
		dt.minLength = object.minLength
		dt.regExpression = object.regex
		object.associateUi(textField)

		return textField
	}

	def dispatch YEmbeddable create(UiBeanReferenceField object) {
		val YBeanReferenceField field = ExtensionModelFactory.eINSTANCE.createYBeanReferenceField
		field.id = UiModelGrammarUtil.getPathId(object)
		field.name = object.name
		field.label = object.name
		field.labelI18nKey = object.toI18nKey

		if (object.jvmType != null) {
			field.typeQualifiedName = object.jvmType.qualifiedName
			field.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}

		val UiNestedProperty captionProperty = object.captionProperty
		if (captionProperty != null) {
			field.captionPropertyPath = captionProperty.toPathString
		} else {
			field.captionPropertyPath = BeanHelper.findCaptionProperty(field.type)
		}

		val UiNestedProperty imageProperty = object.imageProperty
		if (imageProperty != null) {
			field.imagePropertyPath = imageProperty.toPathString
		}

		if (object.inMemoryBeanProvider != null) {
			field.inMemoryBeanProviderQualifiedName = object.inMemoryBeanProvider.qualifiedName
			field.inMemoryBeanProvider = loadClass(object.eResource.resourceSet,
				object.inMemoryBeanProvider.qualifiedName)
		}

		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiLabel object) {
		val YLabel label = factory.createLabel
		label.id = UiModelGrammarUtil.getPathId(object)
		label.name = object.name
		label.label = object.name
		label.labelI18nKey = object.toI18nKey

		object.associateUi(label)

		return label
	}

	def dispatch YEmbeddable create(UiDecimalField object) {
		val YDecimalField decimalField = factory.createDecimalField
		decimalField.id = UiModelGrammarUtil.getPathId(object)
		decimalField.name = object.name
		decimalField.label = object.name
		decimalField.labelI18nKey = object.toI18nKey
		decimalField.initialEnabled = !object.readonly

		val dt = factory.createDecimalDatatype
		decimalField.datatype = dt
		decimalField.orphanDatatypes += dt

		dt.grouping = !object.noGrouping
		dt.markNegative = !object.noMarkNegative
		dt.precision = object.precision

		object.associateUi(decimalField)

		return decimalField
	}

	def dispatch YEmbeddable create(UiTextArea object) {
		val YTextArea textArea = factory.createTextArea
		textArea.id = UiModelGrammarUtil.getPathId(object)
		textArea.name = object.name
		textArea.label = object.name
		textArea.labelI18nKey = object.toI18nKey
		textArea.initialEnabled = !object.readonly

		object.associateUi(textArea)

		return textArea
	}

	def dispatch YEmbeddable create(UiOptionsGroup object) {
		val YOptionsGroup optionsGroup = factory.createOptionsGroup
		optionsGroup.id = UiModelGrammarUtil.getPathId(object)
		optionsGroup.name = object.name
		optionsGroup.label = object.name
		optionsGroup.labelI18nKey = object.toI18nKey
		optionsGroup.selectionType = object.selectionType.convert
		optionsGroup.initialEnabled = !object.readonly

		if (object.jvmType != null) {
			optionsGroup.typeQualifiedName = object.jvmType.qualifiedName
			optionsGroup.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}
		if (object.itemCaptionProperty != null) {
			optionsGroup.itemCaptionProperty = OperationExtensions.toPropertyName(object.itemCaptionProperty?.simpleName)
		} else {
			optionsGroup.itemCaptionProperty = BeanHelper.findCaptionProperty(optionsGroup.type)
		}
		optionsGroup.itemImageProperty = OperationExtensions.toPropertyName(object.itemImageProperty?.simpleName)

		object.associateUi(optionsGroup)

		return optionsGroup
	}
	
	def dispatch YEmbeddable create(UiList object) {
		val YList list = factory.createList
		list.id = UiModelGrammarUtil.getPathId(object)
		list.name = object.name
		list.label = object.name
		list.labelI18nKey = object.toI18nKey
		list.selectionType = object.selectionType.convert
		list.initialEnabled = !object.readonly

		if (object.jvmType != null) {
			list.typeQualifiedName = object.jvmType.qualifiedName
			list.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}
		if (object.itemCaptionProperty != null) {
			list.itemCaptionProperty = OperationExtensions.toPropertyName(object.itemCaptionProperty?.simpleName)
		} else {
			list.itemCaptionProperty = BeanHelper.findCaptionProperty(list.type)
		}
		list.itemImageProperty = OperationExtensions.toPropertyName(object.itemImageProperty?.simpleName)

		object.associateUi(list)

		return list
	}

	def dispatch YEmbeddable create(UiDateField object) {
		val YDateTime dateTime = factory.createDateTime
		dateTime.id = UiModelGrammarUtil.getPathId(object)
		dateTime.name = object.name
		dateTime.label = object.name
		dateTime.labelI18nKey = object.toI18nKey
		dateTime.dateFormat = object.dateFormat.toYDateTimeFormat
		dateTime.resolution = object.resolution.toYDateTimeResolution
		dateTime.initialEnabled = !object.readonly

		object.associateUi(dateTime)

		return dateTime
	}

	def dispatch YEmbeddable create(UiBrowser object) {
		val YBrowser browser = factory.createBrowser
		browser.id = UiModelGrammarUtil.getPathId(object)
		browser.name = object.name
		browser.label = object.name
		browser.labelI18nKey = object.toI18nKey
		browser.initialEnabled = !object.readonly

		object.associateUi(browser)

		return browser
	}

	def dispatch YEmbeddable create(UiProgressBar object) {
		val YProgressBar progressBar = factory.createProgressBar
		progressBar.id = UiModelGrammarUtil.getPathId(object)
		progressBar.name = object.name
		progressBar.label = object.name
		progressBar.labelI18nKey = object.toI18nKey

		object.associateUi(progressBar)

		return progressBar
	}

	def dispatch YEmbeddable create(UiImage object) {
		val YImage image = factory.createImage
		image.id = UiModelGrammarUtil.getPathId(object)
		image.name = object.name
		image.label = object.name
		image.labelI18nKey = object.toI18nKey

		image.value = object.value

		object.associateUi(image)

		return image
	}

	def dispatch YEmbeddable create(UiTable object) {
		val YTable table = factory.createTable
		table.id = UiModelGrammarUtil.getPathId(object)
		table.name = object.name
		table.label = object.name
		table.labelI18nKey = object.toI18nKey
		table.selectionType = object.selectionType.convert
		table.initialEnabled = !object.readonly

		table.itemImageProperty = OperationExtensions.toPropertyName(object.itemImageProperty?.simpleName)

		if (object.jvmType != null) {
			table.typeQualifiedName = object.jvmType.qualifiedName
			table.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}

		object.associateUi(table)

		return table
	}

	def dispatch YField create(UiSearchField eObject) {
		val UiNestedProperty property = eObject.property
		if (property != null) {
			val JvmType type = property.typeofLastSegment

			var YField newField = null
			if (typeHelper.isString(type)) {
				val temp = ExtensionModelFactory.eINSTANCE.createYTextSearchField
				temp.propertyPath = property.toPathString
				newField = temp
			} else if (typeHelper.isNumber(type)) {
				val temp = ExtensionModelFactory.eINSTANCE.createYNumericSearchField
				temp.propertyPath = property.toPathString
				temp.type = typeHelper.toNumericType(type)
				temp.typeQualifiedName = typeHelper.toNumericQualifiedName(type)
				newField = temp
			} else if (typeHelper.isBoolean(type)) {
				val temp = ExtensionModelFactory.eINSTANCE.createYBooleanSearchField
				temp.propertyPath = property.toPathString
				newField = temp
			} else {
				val temp = ExtensionModelFactory.eINSTANCE.createYReferenceSearchField
				temp.propertyPath = property.toPathString
				temp.typeQualifiedName = property.typeofLastSegment?.qualifiedName
				temp.type = loadClass(eObject.eResource.resourceSet, temp.typeQualifiedName)
				newField = temp
			}

			if (newField != null) {
				newField.id = UiModelGrammarUtil.getPathId(eObject)
				newField.labelI18nKey = eObject.toI18nKey
				newField.initialEnabled = !eObject.readonly
			}

			return newField
		}
	}

	def YSelectionType convert(UiSelectionType type) {
		switch (type) {
			case NONE:
				return YSelectionType.SINGLE
			case SINGLE:
				return YSelectionType.SINGLE
			case MULTI:
				return YSelectionType.MULTI
		}
	}

	def dispatch YEmbeddable create(UiNumericField object) {
		val YNumericField field = factory.createNumericField
		field.id = UiModelGrammarUtil.getPathId(object)
		field.name = object.name
		field.label = object.name
		field.labelI18nKey = object.toI18nKey
		field.initialEnabled = !object.readonly

		val dt = factory.createNumericDatatype
		field.datatype = dt
		field.orphanDatatypes += dt

		dt.grouping = !object.noGrouping
		dt.markNegative = !object.noMarkNegative
		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiCheckBox object) {
		val YCheckBox field = factory.createCheckBox
		field.id = UiModelGrammarUtil.getPathId(object)
		field.name = object.name
		field.label = object.name
		field.labelI18nKey = object.toI18nKey
		field.initialEnabled = !object.readonly

		object.associateUi(field)

		return field
	}

	def dispatch YButton create(UiButton object) {
		val YButton field = factory.createButton
		field.id = UiModelGrammarUtil.getPathId(object)
		field.name = object.name
		field.label = object.name
		field.labelI18nKey = object.toI18nKey
		field.initialEnabled = !object.readonly

		object.associateUi(field)

		return field
	}

	def dispatch VMNavigationButton create(UiMobileNavigationButton object) {
		val VMNavigationButton field = VaadinMobileFactory.eINSTANCE.createVMNavigationButton
		field.id = UiModelGrammarUtil.getPathId(object)
		field.name = object.name
		field.label = object.name
		field.labelI18nKey = object.toI18nKey
		field.initialEnabled = !object.readonly

		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiComboBox object) {
		val YComboBox field = factory.createComboBox
		field.id = UiModelGrammarUtil.getPathId(object)
		field.name = object.name
		field.label = object.name
		field.labelI18nKey = object.toI18nKey
		field.initialEnabled = !object.readonly

		if (object.jvmType != null) {
			field.typeQualifiedName = object.jvmType.qualifiedName
			field.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}

		if (object.itemCaptionProperty != null) {
			field.itemCaptionProperty = OperationExtensions.toPropertyName(object.itemCaptionProperty?.simpleName)
		} else {
			field.itemCaptionProperty = BeanHelper.findCaptionProperty(field.type)
		}
		field.itemImageProperty = OperationExtensions.toPropertyName(object.itemImageProperty?.simpleName)

		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiSwitch object) {
		val VMSwitch field = VaadinMobileFactory.eINSTANCE.createVMSwitch
		field.id = UiModelGrammarUtil.getPathId(object)
		field.name = object.name
		field.label = object.name
		field.labelI18nKey = object.toI18nKey
		field.initialEnabled = !object.readonly

		object.associateUi(field)

		return field
	}

	def dispatch YGridLayout create(UiGridLayout object) {
		val YGridLayout layout = factory.createGridLayout
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.columns = object.columns
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch YFormLayout create(UiFormLayout object) {
		val YFormLayout layout = factory.createFormLayout
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch YHorizontalLayout create(UiHorizontalLayout object) {
		val YHorizontalLayout layout = factory.createHorizontalLayout
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch YSearchPanel create(UiSearchPanel object) {
		val YSearchPanel layout = ExtensionModelFactory.eINSTANCE.createYSearchPanel
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch YSplitPanel create(UiSplitpanel object) {
		val YSplitPanel layout = factory.createSplitPanel
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.splitPosition = object.splitPosition
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch YPanel create(UiPanel object) {
		val YPanel layout = factory.createPanel
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch YVerticalLayout create(UiVerticalLayout object) {
		val YVerticalLayout layout = factory.createVerticalLayout
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch VMHorizontalButtonGroup create(UiHorizontalButtonGroup object) {
		val VMHorizontalButtonGroup layout = VaadinMobileFactory.eINSTANCE.createVMHorizontalButtonGroup
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch VMVerticalComponentGroup create(UiVerticalComponentGroup object) {
		val VMVerticalComponentGroup layout = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey
		layout.initialEnabled = !object.readonly

		object.associateUi(layout)

		return layout
	}

	def dispatch YTabSheet create(UiTabSheet object) {
		val YTabSheet layout = factory.createTabSheet
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey

		object.associateUi(layout)

		return layout
	}

	def dispatch VMTabSheet create(UiMobileTabSheet object) {
		val VMTabSheet layout = VaadinMobileFactory.eINSTANCE.createVMTabSheet
		layout.id = UiModelGrammarUtil.getPathId(object)
		layout.name = object.name
		layout.label = object.name
		layout.labelI18nKey = object.toI18nKey

		object.associateUi(layout)

		return layout
	}

	def void xxaddToParent(YElement embeddable) {
		val context = peek
		if (context instanceof YLayout) {
			val YLayout layout = context as YLayout
			layout.addElement(embeddable as YEmbeddable)
		} else if (context instanceof YView) {
			val YView yView = context as YView
			yView.content = embeddable  as YEmbeddable
		} else if (context instanceof YTab) {
			val YTab yTab = context as YTab
			yTab.embeddable = embeddable  as YEmbeddable
		} else if (context instanceof VMTab) {
			val VMTab yTab = context as VMTab
			yTab.embeddable = embeddable  as YEmbeddable
		} else if (context instanceof VMNavigationButton) {
			val VMNavigationButton yButton = context as VMNavigationButton
			yButton.page = embeddable as VMNavigationPage
		} else if (context instanceof VMNavigationCommand) {
			val VMNavigationCommand yCommand = context as VMNavigationCommand
			yCommand.targetPage = embeddable as VMNavigationPage
		} else if (context instanceof YOpenDialogCommand) {
			val YOpenDialogCommand yCommand = context as YOpenDialogCommand
			yCommand.dialog = embeddable as YDialog
		} else if (context instanceof YDialog) {
			val YDialog yDialog = context as YDialog
			yDialog.content = embeddable as YEmbeddable
		}
	}

	def dispatch void map(UiPoint object) {
	}

	def dispatch void map(UiBindingEndpointAlias object) {
	}

	def dispatch void map(UiBindingEndpointAssignment object) {
	}

	def dispatch void map(UiBinding object) {
		pendingBindings += object
	}

	def void install(UiBinding object) {
		val UiBindingEndpointAlias sourceAlias = object.sourceAlias as UiBindingEndpointAlias
		val source = object.source
		val UiBindingEndpointAlias targetAlias = object.targetAlias as UiBindingEndpointAlias
		val target = object.target

		var UiBindingEndpointAssignment sourceEndpoint = source as UiBindingEndpointAssignment
		if (sourceAlias != null) {
			sourceEndpoint = sourceAlias.endpoint as UiBindingEndpointAssignment
		}
		var UiBindingEndpointAssignment targetEndpoint = target  as UiBindingEndpointAssignment
		if (targetAlias != null) {
			targetEndpoint = targetAlias.endpoint  as UiBindingEndpointAssignment
		}

		if (!object.listBinding) {
			val sourceResult = sourceEndpoint.createValueBindingEndpoint
			val targetResult = targetEndpoint.createValueBindingEndpoint

			var YBindingUpdateStrategy sourceToTargetStrategy = YBindingUpdateStrategy::UPDATE;
			if (!object.sourceToTarget) {
				sourceToTargetStrategy = YBindingUpdateStrategy::ON_REQUEST
			}

			var YBindingUpdateStrategy targetToSourceStrategy = YBindingUpdateStrategy::UPDATE;
			if (!object.targetToSource) {
				targetToSourceStrategy = YBindingUpdateStrategy::ON_REQUEST
			}

			currentView.orCreateBindingSet.addBinding(targetResult, sourceResult, targetToSourceStrategy,
				sourceToTargetStrategy)
		} else {
			val sourceResult = sourceEndpoint.createListBindingEndpoint
			val targetResult = targetEndpoint.createListBindingEndpoint

			var YBindingUpdateStrategy sourceToTargetStrategy = YBindingUpdateStrategy::UPDATE;
			if (!object.sourceToTarget) {
				sourceToTargetStrategy = YBindingUpdateStrategy::ON_REQUEST
			}

			var YBindingUpdateStrategy targetToSourceStrategy = YBindingUpdateStrategy::UPDATE;
			if (!object.targetToSource) {
				targetToSourceStrategy = YBindingUpdateStrategy::ON_REQUEST
			}

			currentView.orCreateBindingSet.addBinding(targetResult, sourceResult, targetToSourceStrategy,
				sourceToTargetStrategy)
		}
	}

	def YValueBindingEndpoint createValueBindingEndpoint(UiBindingEndpointAssignment epDef) {
		if (epDef == null) {
			return null
		}
		var YValueBindingEndpoint result = null;
		val UiModelDerivedStateComputerx.BindingInfo info = new UiModelDerivedStateComputerx.BindingInfo
		collectBindingInfo(epDef, info);

		if (info.bindingRoot instanceof UiBeanSlot) {
			val uiBeanSlot = info.bindingRoot as UiBeanSlot

			val YBeanSlot yBeanSlot = uiBeanSlot.associatedUi
			val YBeanSlotValueBindingEndpoint ep = factory.createBeanSlotValueBindingEndpoint
			ep.beanSlot = yBeanSlot
			ep.attributePath = info.path.toString
			result = ep
		} else if (info.bindingRoot instanceof UiEmbeddable) {
			val YElement yElement = info.bindingRoot.associatedUi
			val YECViewModelValueBindingEndpoint ep = factory.createECViewModelValueBindingEndpoint
			ep.element = yElement
			ep.propertyPath = info.path.toString
			if (info.typeForBinding != null) {
				ep.typeQualifiedName = info.typeForBinding.qualifiedName
				ep.type = loadClass(epDef.eResource.resourceSet, ep.typeQualifiedName)
			}
			if (ep.type != null && ep.type.isAssignableFrom(typeof(EObject))) {
				ep.emfNsURI = yElement.eClass.EPackage.nsURI
			}
			result = ep
		} else if (info.bindingRoot instanceof UiMobileNavigationCommand) {
			val UiMobileNavigationCommand command = info.bindingRoot as UiMobileNavigationCommand

			// Create the command and register it at the current view
			val VMNavigationCommand yCommand = VaadinMobileFactory.eINSTANCE.createVMNavigationCommand

			currentView.commandSet.addCommand(yCommand)

			// create the target page and add it to the command
			yCommand.push
			command.targetPage.map

			// since navHandler is parent, it must be created yet
			val UiMobileNavigationHandler navHandler = epDef.findNavHandler
			yCommand.navigationHandler = (navHandler as EObject).associatedUi

			pop

			result = yCommand.createNavigationValueEndpoint
		} else if (info.bindingRoot instanceof UiOpenDialogCommand) {
			val UiOpenDialogCommand command = info.bindingRoot as UiOpenDialogCommand

			// Create the command and register it at the current view
			val YOpenDialogCommand yCommand = CoreModelFactory.eINSTANCE.createYOpenDialogCommand
			currentView.commandSet.addCommand(yCommand)

			// create the target page and add it to the command
			yCommand.push
			command.dialog.map

			pop

			result = yCommand.createTriggerDialogEndpoint
		} else if (info.bindingRoot instanceof UiSearchWithDialogCommand) {
			val UiSearchWithDialogCommand command = info.bindingRoot as UiSearchWithDialogCommand

			// Create the command and register it at the current view
			val YOpenDialogCommand yCommand = CoreModelFactory.eINSTANCE.createYOpenDialogCommand
			currentView.commandSet.addCommand(yCommand)

			// create the target page and add it to the command
			yCommand.push
			command.dialog.map

			pop

			result = yCommand.createTriggerDialogEndpoint
		}

		return result
	}

	def UiMobileNavigationHandler findNavHandler(UiBindingEndpointAssignment assignment) {
		var EObject temp = assignment;
		while (temp.eContainer != null) {
			temp = temp.eContainer
			if (temp instanceof UiMobileNavigationHandler) {
				return temp as UiMobileNavigationHandler
			}
		}
		return null
	}

	def YListBindingEndpoint createListBindingEndpoint(UiBindingEndpointAssignment epDef) {
		if (epDef == null) {
			return null
		}
		var YListBindingEndpoint result = null;
		val UiModelDerivedStateComputerx.BindingInfo info = new UiModelDerivedStateComputerx.BindingInfo
		collectBindingInfo(epDef, info);

		if (info.bindingRoot instanceof UiBeanSlot) {
			val uiBeanSlot = info.bindingRoot as UiBeanSlot

			val YBeanSlot yBeanSlot = uiBeanSlot.associatedUi
			val YBeanSlotListBindingEndpoint ep = factory.createBeanSlotListBindingEndpoint
			ep.beanSlot = yBeanSlot
			ep.attributePath = info.path.toString
			result = ep
		} else if (info.bindingRoot instanceof UiEmbeddable) {
			val YEmbeddable yElement = info.bindingRoot.associatedUi
			val YECViewModelListBindingEndpoint ep = factory.createECViewModelListBindingEndpoint
			ep.element = yElement
			ep.propertyPath = info.path.toString
			if (info.typeForBinding != null) {
				ep.typeQualifiedName = info.typeForBinding.qualifiedName
				ep.type = loadClass(epDef.eResource.resourceSet, ep.typeQualifiedName)
			}
			if (yElement != null) {
				ep.emfNsURI = yElement.eClass.EPackage.nsURI
			}
			result = ep
		}

		return result
	}

	def dispatch void collectBindingInfo(
		UiBindingEndpointAssignment assignment,
		UiModelDerivedStateComputerx.BindingInfo info
	) {
		var result = if(info != null) info else new UiModelDerivedStateComputerx.BindingInfo
		if (assignment.typedBindableAlias != null) {
			assignment.typedBindableAlias.collectBindingInfo(result)
		} else {
			assignment.typedBindableDef.collectBindingInfo(result)
		}

		// on the way back up the structure, collect( the path
		if (assignment.path != null) {
			info.appendPath(assignment.path.toPathString)
			info.typeOfBoundProperty = assignment.path.typeofLastSegment
			info.deepestJvmField = assignment.path.operationofLastSegment

			val pathType = assignment.path.typeofSecondLastSegment
			if (info.typeForBinding == null && pathType != null) {
				info.typeForBinding = pathType
			}
		}
	}

	def dispatch void collectBindingInfo(UiBeanSlot slot, UiModelDerivedStateComputerx.BindingInfo info) {
		info.bindingRoot = slot
		info.typeForBinding = slot.jvmType?.type
	}

	def dispatch void collectBindingInfo(UiBindingEndpointAlias alias, UiModelDerivedStateComputerx.BindingInfo info) {
		alias.endpoint.collectBindingInfo(info)
	}

	def dispatch void collectBindingInfo(UiTypedBindableDef definition, UiModelDerivedStateComputerx.BindingInfo info) {

		// must be the last element
		info.typeForBinding = typeOfBoundPropertyProvider.getType(definition)
		info.bindingRoot = definition.rawBindableOfLastSegment
		val bindingMethod = definition.method
		if (bindingMethod != null) {
			if (!bindingMethod.targetName.nullOrEmpty) {
				info.appendPath(bindingMethod.targetName)
			} else {
				info.appendPath(bindingMethod.name)
			}
		}
	}

	def dispatch void collectBindingInfo(UiCommandBindableDef definition, UiModelDerivedStateComputerx.BindingInfo info) {

		// must be the last element
		info.typeForBinding = typeOfBoundPropertyProvider.getType(definition)
		info.bindingRoot = definition.command
	}

	def dispatch void collectBindingInfo(UiBindingExpression definition, UiModelDerivedStateComputerx.BindingInfo info) {
		throw new UnsupportedOperationException
	}

	def resolve(UiBindingEndpointAlias alias) {
		val temp = alias.endpoint;
		if (temp instanceof UiBindingEndpointAssignment) {
			val UiBindingEndpointAssignment assign = temp as UiBindingEndpointAssignment
			if (assign.typedBindableAlias != null && assign.typedBindableAlias instanceof UiBindingEndpointAlias) {
				resolve(assign.typedBindableAlias as UiBindingEndpointAlias)
			}
		}
	}

	def loadClass(ResourceSet resourceSet, String qualifiedName) {
		return typeLoader.findTypeByName(qualifiedName)
	}

	def dispatch void map(UiPathSegment object) {
	}

	def dispatch void map(UiBeanSlot object) {
		val yBeanSlot = factory.createBeanSlot
		yBeanSlot.name = object.name
		yBeanSlot.valueTypeQualifiedName = object.jvmType?.qualifiedName
		yBeanSlot.valueType = loadClass(object.eResource.resourceSet, yBeanSlot.valueTypeQualifiedName)

		object.associateUi(yBeanSlot)

		val EObject lastElement = viewContext.peek
		if (lastElement instanceof YView) {
			(lastElement as YView).beanSlots += yBeanSlot
		} else if (lastElement instanceof YViewSet) {
			(lastElement as YViewSet).beanSlots += yBeanSlot
		}

	}

	def dispatch void map(EObject object) {
	}

	override void discardDerivedState(DerivedStateAwareResource resource) {
		super.discardDerivedState(resource)

		if (resource.contents.size > 1) {
			for (var i = 1; i < resource.contents.size; i++) {
				resource.contents.remove(1)
			}
		}
	}

	static class BindingInfo {

		/**
		 * The type of the bound property. For nested bindings it is the last element available
		 */
		private JvmType typeOfBoundProperty

		/**
		 * The type of the binding. For nested bindings it is the element before the bound property
		 */
		private JvmType typeForBinding

		/**
		 * The deepest JvmOperation in the hierarchy. This field is used to bind.
		 */
		private JvmOperation deepestJvmField

		/**
		 * The nested path using dot notation.
		 */
		private StringBuilder path = new StringBuilder

		/**
		 * The element the binding should be installed on
		 */
		private EObject bindingRoot

		/**
		 * Append the segment to the path.
		 */
		def appendPath(String segment) {
			if (segment.nullOrEmpty) {
				return
			}

			if (path.length > 0) {
				path.append(".")
			}
			path.append(segment)
		}

	}
}
