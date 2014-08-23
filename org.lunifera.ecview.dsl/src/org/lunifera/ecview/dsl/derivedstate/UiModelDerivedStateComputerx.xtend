package org.lunifera.ecview.dsl.derivedstate

import com.google.inject.Inject
import java.util.List
import java.util.Map
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.YDialog
import org.eclipse.emf.ecp.ecview.common.model.core.YElement
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable
import org.eclipse.emf.ecp.ecview.common.model.core.YField
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout
import org.eclipse.emf.ecp.ecview.common.model.core.YOpenDialogCommand
import org.eclipse.emf.ecp.ecview.common.model.core.YView
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet
import org.eclipse.emf.ecp.ecview.common.model.validation.YClassDelegateValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YBrowser
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YButton
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YCheckBox
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YColumn
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YComboBox
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YDateTime
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YDecimalField
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YFlatAlignment
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YFormLayout
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YGridLayout
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YHorizontalLayout
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YImage
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YLabel
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YNumericField
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YOptionsGroup
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YProgressBar
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YSelectionType
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YTab
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YTabSheet
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YTable
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YTextArea
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YTextField
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YVerticalLayout
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.util.SimpleExtensionModelFactory
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator
import org.lunifera.ecview.dsl.scope.BindableTypeProvider
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
import org.lunifera.ecview.semantic.uimodel.UiDecimalField
import org.lunifera.ecview.semantic.uimodel.UiDialog
import org.lunifera.ecview.semantic.uimodel.UiDialogAssignment
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiField
import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment
import org.lunifera.ecview.semantic.uimodel.UiFormLayout
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
import org.lunifera.ecview.semantic.uimodel.UiNumericField
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand
import org.lunifera.ecview.semantic.uimodel.UiPathSegment
import org.lunifera.ecview.semantic.uimodel.UiPoint
import org.lunifera.ecview.semantic.uimodel.UiProgressBar
import org.lunifera.ecview.semantic.uimodel.UiRadioButtonGroup
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator
import org.lunifera.ecview.semantic.uimodel.UiSelectionType
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
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoader
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoaderFactory

import static org.lunifera.ecview.semantic.uimodel.UiFlatAlignment.*
import static org.lunifera.ecview.semantic.uimodel.UiSelectionType.*
import org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment

class UiModelDerivedStateComputerx extends JvmModelAssociator {

	@Inject
	IJdtTypeLoaderFactory typeLoaderFactory;
	private IJdtTypeLoader typeLoader
	@Inject
	BindableTypeProvider typeOfBoundPropertyProvider;
	final Stack<EObject> viewContext = new Stack
	final List<YView> views = newArrayList()
	final Map<EObject, EObject> grammarToUiAssociations = newHashMap();
	final Map<EObject, EObject> uiToGrammarAssociations = newHashMap();
	final SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory

	YView currentView;

	DerivedStateAwareResource resource

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
		this.typeLoader = typeLoaderFactory.createJdtTypeLoader(resource.resourceSet)

		if (resource.getContents().isEmpty()) {
			return;
		}

		if (!preLinkingPhase) {

			grammarToUiAssociations.clear
			uiToGrammarAssociations.clear

			val EObject eObject = resource.getContents().get(0);

			// complete all elements
			eObject.eContents.forEach [
				it.map
			]

			if (views.size > 0) {
				resource.contents += views.get(0)
			}
			views.clear
			viewContext.clear
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

	def dispatch void map(UiModel object) {
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
		views += yView
		currentView = yView
		yView.push;

		object.beanSlots.forEach[it.map]
		object.content.map
		object.bindings.forEach[it.map]

		object.validatorAssignments.forEach[it.map]

		pop
		currentView = null
	}

	def dispatch void map(UiMobileView object) {

		// create a view instance
		val YView yView = factory.createView
		views += yView
		currentView = yView
		yView.push;

		object.beanSlots.forEach[it.map]
		object.content.map
		object.bindings.forEach[it.map]

		object.validatorAssignments.forEach[it.map]

		pop
		currentView = null
	}

	def push(EObject eObject) {
		viewContext.push(eObject)
	}

	def dispatch void map(UiGridLayout eObject) {
		val YGridLayout layout = factory.createGridLayout
		layout.name = eObject.name
		layout.fillHorizontal = eObject.fillHorizontal
		layout.fillVertical = eObject.fillVertical
		layout.columns = eObject.columns

		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiGridLayoutAssigment eObject) {

		val YGridLayout layout = peek

		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.addElement(newField)

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}
	}

	def dispatch void map(UiVerticalLayout eObject) {
		val YVerticalLayout layout = factory.createVerticalLayout
		layout.name = eObject.name
		layout.fillVertical = eObject.fillVertical

		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiVerticalLayoutAssigment eObject) {

		val YVerticalLayout layout = peek

		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.addElement(newField)

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}
	}

	def dispatch void map(UiHorizontalLayout eObject) {
		val YHorizontalLayout layout = factory.createHorizontalLayout
		layout.name = eObject.name
		layout.fillHorizontal = eObject.fillHorizontal

		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiHorizontalLayoutAssigment eObject) {

		val YHorizontalLayout layout = peek
		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.addElement(newField)

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}

	}

	def dispatch void map(UiTabSheet eObject) {
		val YTabSheet layout = factory.createTabSheet
		layout.name = eObject.name

		//		layout.columns = eObject.columns
		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.tabs.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiTabAssignment eObject) {

		val YTabSheet layout = peek
		val YTab tab = factory.createTab
		tab.label = eObject.name
		layout.tabs += tab

		tab.push

		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			tab.embeddable = newField

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}

		pop

	}

	def dispatch void map(UiMobileTabSheet eObject) {
		val VMTabSheet layout = VaadinMobileFactory.eINSTANCE.createVMTabSheet
		layout.name = eObject.name

		//		layout.columns = eObject.columns
		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.tabs.forEach [
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
		if (element instanceof UiField) {
			val newField = element.create
			tab.embeddable = newField

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}

		pop

	}

	def dispatch void map(UiHorizontalButtonGroup eObject) {
		val VMHorizontalButtonGroup layout = VaadinMobileFactory.eINSTANCE.createVMHorizontalButtonGroup
		layout.name = eObject.name

		//		layout.columns = eObject.columns
		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiHorizontalButtonGroupAssigment eObject) {

		val VMHorizontalButtonGroup layout = peek
		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.addElement(newField)

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}

	}

	def dispatch void map(UiVerticalComponentGroup eObject) {
		val VMVerticalComponentGroup layout = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup
		layout.name = eObject.name

		//		layout.columns = eObject.columns
		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiVerticalComponentGroupAssigment eObject) {

		val VMVerticalComponentGroup layout = peek
		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.addElement(newField)

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}

	}

	def dispatch void map(UiMobileNavigationPage eObject) {
		val VMNavigationPage layout = VaadinMobileFactory.eINSTANCE.createVMNavigationPage
		layout.name = eObject.name

		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		pop
	}

	def dispatch void map(UiDialog eObject) {
		val YDialog layout = CoreModelFactory.eINSTANCE.createYDialog
		layout.name = eObject.name
		layout.label = eObject.name

		if (eObject.jvmType != null) {
			layout.typeQualifiedName = eObject.jvmType.qualifiedName
			layout.type = loadClass(eObject.eResource.resourceSet, eObject.jvmType.qualifiedName)
		}

		layout.addToParent

		currentView.dialogs += layout

		eObject.associateUi(layout)

		layout.push

		eObject.content?.map

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		pop
	}

	def dispatch void map(UiDialogAssignment eObject) {

		val YDialog layout = peek
		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.content = newField
			element.map

			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		} else {
			element.map
		}
	}

	def void createTransient(UiMobileNavigationPage eObject) {
		val VMNavigationPage layout = VaadinMobileFactory.eINSTANCE.createVMNavigationPage
		layout.name = eObject.name

		// do NOT add to parent!
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		if (eObject.bindings != null) {
			eObject.bindings.forEach [
				it.map
			]
		}

		pop
	}

	def dispatch void map(UiMobileNavigationPageAssignment eObject) {
		val VMNavigationPage layout = peek
		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.addElement(newField)

			element.map

			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
		} else {
			element.map
		}

	}

	def dispatch void map(UiFormLayout eObject) {
		val YFormLayout layout = factory.createFormLayout
		layout.name = eObject.name

		//		layout.columns = eObject.columns
		layout.addToParent
		eObject.associateUi(layout)

		layout.push

		eObject.contents.forEach [
			it.map
		]

		pop
	}
	
	def dispatch void map(UiFormLayoutAssigment eObject) {

		val YFormLayout layout = peek
		val element = eObject.element
		if (element instanceof UiField) {
			val newField = element.create
			layout.addElement(newField)

			if (element instanceof UiField) {
				element.map

				newField.push
				val UiField yField = element as UiField
				yField.validators.forEach [
					it.map
				]
				pop
			}
		} else {
			element.map
		}

	}

	def dispatch void map(UiRadioButtonGroup eObject) {
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

		pop
	}

	def dispatch void map(UiButton object) {
		val YButton button = factory.createButton
		button.name = object.name
		button.label = object.name
		button.addToParent
		object.associateUi(button)
	}

	def dispatch void map(UiMobileNavigationButton object) {
		val VMNavigationButton button = VaadinMobileFactory.eINSTANCE.createVMNavigationButton
		button.name = object.name
		button.label = object.name
		button.addToParent
		object.associateUi(button)

		button.push
		if (object.targetPage != null) {
			object.targetPage.map
		} else if (object.targetPageAlias != null) {
			object.targetPageAlias.map
		}
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
		yColumn.name = eObject.jvmField?.simpleName
		yColumn.orderable = eObject.orderable
		yColumn.visible = eObject.visible

		yField.columns += yColumn
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

	def dispatch void map(UiMaxLengthValidator eObject) {
		val YMaxLengthValidator newValidator = factory.createMaxLengthValidator
		newValidator.maxLength = eObject.maxLength

		eObject.associateUi(newValidator)

		val YField yField = peek
		if (yField != null) {
			yField.validators += newValidator
		}
	}

	def dispatch void map(UiMinLengthValidator eObject) {
		val YMinLengthValidator newValidator = factory.createMinLengthValidator
		newValidator.minLength = eObject.minLength

		eObject.associateUi(newValidator)

		val YField yField = peek
		if (yField != null) {
			yField.validators += newValidator
		}
	}

	def dispatch void map(UiRegexpValidator eObject) {
		val YRegexpValidator newValidator = factory.createRegexpValidator
		newValidator.regExpression = eObject.regExpression

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

	def dispatch YEmbeddable create(UiTextField object) {
		val YTextField textField = factory.createTextField
		textField.name = object.name
		textField.label = object.name
		
		val dt = factory.createTextDatatype
		textField.datatype = dt
		textField.orphanDatatypes += dt
		
		dt.maxLength = object.maxLength
		dt.minLength = object.minLength
		dt.regExpression = object.regex
		object.associateUi(textField)

		return textField
	}

	def dispatch YEmbeddable create(UiLabel object) {
		val YLabel label = factory.createLabel
		label.name = object.name
		label.label = object.name

		object.associateUi(label)

		return label
	}

	def dispatch YEmbeddable create(UiDecimalField object) {
		val YDecimalField decimalField = factory.createDecimalField
		decimalField.name = object.name
		decimalField.label = object.name
		
		val dt = factory.createDecimalDatatype
		decimalField.datatype = dt
		decimalField.orphanDatatypes += dt
		
		dt.grouping = object.grouping
		dt.markNegative = object.markNegative
		dt.precision = object.precision
		
		object.associateUi(decimalField)

		return decimalField
	}

	def dispatch YEmbeddable create(UiTextArea object) {
		val YTextArea textArea = factory.createTextArea
		textArea.name = object.name
		textArea.label = object.name

		object.associateUi(textArea)

		return textArea
	}

	def dispatch YEmbeddable create(UiRadioButtonGroup object) {
		val YOptionsGroup optionsGroup = factory.createOptionsGroup
		optionsGroup.name = object.name
		optionsGroup.label = object.name
		optionsGroup.selectionType = object.selectionType.convert

		optionsGroup.itemImageProperty = object.itemImageProperty?.simpleName
		if (object.jvmType != null) {
			optionsGroup.typeQualifiedName = object.jvmType.qualifiedName
			optionsGroup.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}

		object.associateUi(optionsGroup)

		return optionsGroup
	}

	def dispatch YEmbeddable create(UiDateField object) {
		val YDateTime dateTime = factory.createDateTime
		dateTime.name = object.name
		dateTime.label = object.name

		object.associateUi(dateTime)

		return dateTime
	}

	def dispatch YEmbeddable create(UiBrowser object) {
		val YBrowser browser = factory.createBrowser
		browser.name = object.name
		browser.label = object.name

		object.associateUi(browser)

		return browser
	}

	def dispatch YEmbeddable create(UiProgressBar object) {
		val YProgressBar progressBar = factory.createProgressBar
		progressBar.name = object.name
		progressBar.label = object.name

		object.associateUi(progressBar)

		return progressBar
	}

	def dispatch YEmbeddable create(UiImage object) {
		val YImage image = factory.createImage
		image.name = object.name
		image.label = object.name

		image.value = object.value

		object.associateUi(image)

		return image
	}

	def dispatch YEmbeddable create(UiTable object) {
		val YTable table = factory.createTable
		table.name = object.name
		table.label = object.name
		table.selectionType = object.selectionType.convert

		table.itemImageProperty = object.itemImageProperty?.simpleName

		if (object.jvmType != null) {
			table.typeQualifiedName = object.jvmType.qualifiedName
			table.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}

		object.associateUi(table)

		return table
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
		field.name = object.name
		field.label = object.name
		
		val dt = factory.createNumericDatatype
		field.datatype = dt
		field.orphanDatatypes += dt
		
		dt.grouping = object.grouping
		dt.markNegative = object.markNegative
		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiCheckBox object) {
		val YCheckBox field = factory.createCheckBox
		field.name = object.name
		field.label = object.name

		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiComboBox object) {
		val YComboBox field = factory.createComboBox
		field.name = object.name
		field.label = object.name

		field.itemCaptionProperty = object.itemCaptionProperty?.simpleName
		field.itemImageProperty = object.itemImageProperty?.simpleName

		if (object.jvmType != null) {
			field.typeQualifiedName = object.jvmType.qualifiedName
			field.type = loadClass(object.eResource.resourceSet, object.jvmType.qualifiedName)
		}

		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiSwitch object) {
		val VMSwitch field = VaadinMobileFactory.eINSTANCE.createVMSwitch
		field.name = object.name
		field.label = object.name

		object.associateUi(field)

		return field
	}

	def void addToParent(YElement embeddable) {
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
			if (yElement != null) {
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
			info.deepestJvmField = assignment.path.fieldofLastSegment

			val pathType = assignment.path.typeofSecondLastSegment
			if (pathType != null) {
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
		info.bindingRoot = definition.rawBindable
		val bindingMethod = definition.method
		if (bindingMethod != null) {
			info.appendPath(bindingMethod.name)
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
		@Property
		private JvmType typeOfBoundProperty

		/**
		 * The type of the binding. For nested bindings it is the element before the bound property
		 */
		@Property
		private JvmType typeForBinding

		/**
		 * The deepest JvmField in the hierarchy. This field is used to bind.
		 */
		@Property
		private JvmField deepestJvmField

		/**
		 * The nested path using dot notation.
		 */
		@Property
		private StringBuilder path = new StringBuilder

		/**
		 * The element the binding should be installed on
		 */
		@Property
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
