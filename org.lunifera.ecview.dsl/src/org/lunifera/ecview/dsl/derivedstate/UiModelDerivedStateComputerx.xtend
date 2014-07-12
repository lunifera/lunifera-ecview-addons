package org.lunifera.ecview.dsl.derivedstate

import com.google.inject.Inject
import java.util.List
import java.util.Map
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.YElement
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable
import org.eclipse.emf.ecp.ecview.common.model.core.YField
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout
import org.eclipse.emf.ecp.ecview.common.model.core.YView
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YCheckBox
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YGridLayout
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YNumericField
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YTextField
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.util.SimpleExtensionModelFactory
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.lunifera.ecview.dsl.IJdtTypeLoaderProvider
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiBinding
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef
import org.lunifera.ecview.semantic.uimodel.UiIDEView
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiPathSegment
import org.lunifera.ecview.semantic.uimodel.UiPoint
import org.lunifera.ecview.semantic.uimodel.UiView
import org.lunifera.ecview.semantic.uimodel.uiextension.UiCheckBox
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment
import org.lunifera.ecview.semantic.uimodel.uiextension.UiNumericField
import org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField
import org.lunifera.ecview.semantic.uisemantics.UxListBindingEndpointDef
import org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef

class UiModelDerivedStateComputerx implements IDerivedStateComputer {

	@Inject
	IJdtTypeLoaderProvider typeLoaderProvider;

	final Stack<EObject> viewContext = new Stack
	List<YView> views = newArrayList()
	YView currentView;
	Map<EObject, EObject> associations = newHashMap();

	SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory

	def void associate(EObject grammarElement, EObject yElement) {
		associations.put(grammarElement, yElement)
	}

	def <A> A associated(EObject grammarElement) {
		return associations.get(grammarElement) as A
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (resource.getContents().isEmpty()) {
			return;
		}

		if (!preLinkingPhase) {

			// complete all elements
			resource.contents.forEach [
				it.map
			]

			if (views.size > 0) {
				resource.contents += views.get(0)
			}
			views.clear
			viewContext.clear
			associations.clear
		}
	}

	def <A> A peek() {
		viewContext.peek as A
	}

	def <A> A pop() {
		viewContext.pop as A
	}

	def dispatch void map(UiModel object) {
		object.roots.forEach[it.map]
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
		viewContext.push(yView);

		object.beanSlots.forEach[it.map]
		object.content.map
		object.bindings.forEach[it.map]

		pop
		currentView = null
	}

	def dispatch void map(UiGridLayout eObject) {
		val YGridLayout layout = factory.createGridLayout
		layout.name = eObject.name
		layout.columns = eObject.columns
		layout.addToParent
		eObject.associate(layout)

		viewContext.push(layout)

		eObject.contents.forEach [
			it.map
		]

		pop
	}

	def dispatch void map(UiGridLayoutAssigment eObject) {

		val YGridLayout layout = peek

		val element = eObject.element
		val newField = element.create
		layout.addElement(newField)

		if (element instanceof YField) {
			viewContext.push(newField)
			val YField yField = element as YField
			yField.validators.forEach [
				it.map
			]
			pop
		}
	}

	def dispatch void map(YMaxLengthValidator eObject) {
		val YMaxLengthValidator newValidator = factory.createMaxLengthValidator
		newValidator.maxLength = eObject.maxLength

		eObject.associate(newValidator)

		val YField field = peek
		field.validators += newValidator
	}

	def dispatch void map(YMinLengthValidator eObject) {
		val YMinLengthValidator newValidator = factory.createMinLengthValidator
		newValidator.minLength = eObject.minLength

		eObject.associate(newValidator)

		val YField field = peek
		field.validators += newValidator
	}

	def dispatch void map(YRegexpValidator eObject) {
		val YRegexpValidator newValidator = factory.createRegexpValidator
		newValidator.regExpression = eObject.regExpression

		eObject.associate(newValidator)

		val YField field = peek
		field.validators += newValidator
	}

	def dispatch YEmbeddable create(YEmbeddable object) {
	}

	def dispatch YEmbeddable create(UiTextField object) {
		val YTextField textField = factory.createTextField
		textField.name = object.name
		textField.label = object.name

		object.associate(textField)

		return textField
	}

	def dispatch YEmbeddable create(UiNumericField object) {
		val YNumericField field = factory.createNumericField
		field.name = object.name
		field.label = object.name

		object.associate(field)

		return field
	}

	def dispatch YEmbeddable create(UiCheckBox object) {
		val YCheckBox textField = factory.createCheckBox
		textField.name = object.name
		textField.label = object.name

		object.associate(textField)

		return textField
	}

	def void addToParent(YEmbeddable embeddable) {
		val context = peek
		if (context instanceof YLayout) {
			val YLayout layout = context as YLayout
			layout.addElement(embeddable)
		} else if (context instanceof YView) {
			val YView yView = context as YView
			yView.content = embeddable
		}
	}

	def dispatch void map(UiPoint object) {
	}

	def dispatch void map(UiBindingEndpointAlias object) {
	}

	def dispatch void map(UiBindingEndpointDef object) {
	}

	def dispatch void map(UiBinding object) {
		val sourceAlias = object.sourceAlias
		val source = object.source
		val targetAlias = object.targetAlias
		val target = object.target

		var sourceEndpoint = source
		if (sourceAlias != null) {
			sourceEndpoint = sourceAlias.endpoint
		}
		var targetEndpoint = target
		if (targetAlias != null) {
			targetEndpoint = targetAlias.endpoint
		}

		val sourceResult = sourceEndpoint.createBindingEndpoint
		val targetResult = targetEndpoint.createBindingEndpoint

		var YBindingUpdateStrategy sourceToTargetStrategy = YBindingUpdateStrategy::UPDATE;
		if (!object.sourceToTarget) {
			sourceToTargetStrategy = YBindingUpdateStrategy::ON_REQUEST
		}

		var YBindingUpdateStrategy targetToSourceStrategy = YBindingUpdateStrategy::UPDATE;
		if (!object.targetToSource) {
			targetToSourceStrategy = YBindingUpdateStrategy::ON_REQUEST
		}

		if (sourceResult instanceof YValueBindingEndpoint && targetResult instanceof YValueBindingEndpoint) {
			currentView.orCreateBindingSet.addBinding(targetResult as YValueBindingEndpoint,
				sourceResult as YValueBindingEndpoint, targetToSourceStrategy, sourceToTargetStrategy)
		} else if (sourceResult instanceof YListBindingEndpoint && targetResult instanceof YListBindingEndpoint) {
			currentView.orCreateBindingSet.addBinding(targetResult as YListBindingEndpoint,
				sourceResult as YListBindingEndpoint, targetToSourceStrategy, sourceToTargetStrategy)
		} else if (sourceResult == null || targetResult == null) {
			// nothing to do 
		} else {
			throw new IllegalArgumentException(sourceResult + " is not bindable to " + targetResult)
		}

	}

	def YBindingEndpoint createBindingEndpoint(UiBindingEndpointDef epDef) {
		if (epDef == null) {
			return null
		}
		var YBindingEndpoint result = null;
		val sourceEndpointDef = epDef.semanticEndpoint
		if (epDef.bindable instanceof YBeanSlot) {
			val YBeanSlot yBeanSlot = epDef.bindable.associated
			if (sourceEndpointDef instanceof UxValueBindingEndpointDef) {
				val cEndpointDef = sourceEndpointDef as UxValueBindingEndpointDef

				val YBeanSlotValueBindingEndpoint ep = factory.createBeanSlotValueBindingEndpoint
				ep.beanSlot = yBeanSlot
				ep.name = cEndpointDef.name
				ep.attributePath = if (epDef.path != null) {
					epDef.path.toPathString
				}
				result = ep
			} else if (sourceEndpointDef instanceof UxListBindingEndpointDef) {
				val cEndpointDef = sourceEndpointDef as UxListBindingEndpointDef

				val YBeanSlotListBindingEndpoint ep = factory.createBeanSlotListBindingEndpoint
				ep.beanSlot = yBeanSlot as YBeanSlot
				ep.name = cEndpointDef.name
				ep.attributePath = if (epDef.path != null) {
					epDef.path.toPathString
				}
				ep.collectionTypeQualifiedName = epDef.semanticEndpoint.jvmType.qualifiedName
				ep.collectionType = loadClass(epDef.eResource.resourceSet, ep.collectionTypeQualifiedName)
				result = ep
			}
		} else if (epDef.bindable instanceof YElement) {
			val YElement yElement = epDef.bindable.associated
			if (sourceEndpointDef instanceof UxValueBindingEndpointDef) {
				val cEndpointDef = sourceEndpointDef as UxValueBindingEndpointDef

				val YECViewModelValueBindingEndpoint ep = factory.createECViewModelValueBindingEndpoint
				ep.element = yElement
				ep.name = cEndpointDef.name
				ep.propertyPath = if (epDef.path != null) {
					cEndpointDef.name + "." + epDef.path.toPathString
				} else
					cEndpointDef.name
				ep.typeQualifiedName = epDef.semanticEndpoint.jvmType.qualifiedName
				ep.type = loadClass(epDef.eResource.resourceSet, ep.typeQualifiedName)
				ep.emfNsURI = yElement.eClass.EPackage.nsURI
				result = ep
			} else if (sourceEndpointDef instanceof UxListBindingEndpointDef) {
				val cEndpointDef = sourceEndpointDef as UxValueBindingEndpointDef

				val YECViewModelListBindingEndpoint ep = factory.createECViewModelListBindingEndpoint
				ep.element = yElement
				ep.name = cEndpointDef.name
				ep.propertyPath = if (epDef.path != null) {
					cEndpointDef.name + "." + epDef.path.toPathString
				} else
					cEndpointDef.name
				ep.typeQualifiedName = epDef.semanticEndpoint.jvmType.qualifiedName
				ep.type = loadClass(epDef.eResource.resourceSet, ep.typeQualifiedName)
				ep.emfNsURI = yElement.eClass.EPackage.nsURI
				result = ep
			}
		}
		return result
	}

	def loadClass(ResourceSet resourceSet, String qualifiedName) {
		val loader = typeLoaderProvider.get(resourceSet)
		if (loader == null) {
			return null;
		}
		return loader.findTypeByName(qualifiedName)
	}

	def dispatch void map(UiPathSegment object) {
	}

	def dispatch void map(UiBeanSlot object) {
		val yBeanSlot = factory.createBeanSlot
		yBeanSlot.name = object.name
		yBeanSlot.valueTypeQualifiedName = object.jvmType.qualifiedName
		yBeanSlot.valueType = loadClass(object.eResource.resourceSet, yBeanSlot.valueTypeQualifiedName)

		object.associate(yBeanSlot)

		val EObject lastElement = viewContext.peek
		if (lastElement instanceof YView) {
			(lastElement as YView).beanSlots += yBeanSlot
		} else if (lastElement instanceof YViewSet) {
			(lastElement as YViewSet).beanSlots += yBeanSlot
		}

	}

	def dispatch void map(EObject object) {
	}

	//	def dispatch void complete(EObject eObject) {
	//	}
	//
	//	def dispatch void complete(UiIDEView eObject) {
	//	}
	//
	//	def dispatch void complete(UiTextField eObject) {
	//		eObject.label = eObject.name
	//	}
	//
	//	def dispatch void complete(YBeanSlot yBeanSlot) {
	//		val gSlot = yBeanSlot as UiBeanSlot
	//		val typeReference = gSlot.getJvmType
	//		if(typeReference != null){
	//			yBeanSlot.valueTypeQualifiedName = typeReference.qualifiedName
	//			yBeanSlot.valueType = loadClass(gSlot.eResource.resourceSet, yBeanSlot.valueTypeQualifiedName)
	//		} 
	//	}
	//
	//	def dispatch void finish(EObject eObject) {
	//	}
	//
	//	def dispatch void finish(UiIDEView eObject) {
	//	}
	//
	//	def dispatch void finish(UiTextField eObject) {
	//	}
	//
	//	def dispatch void finish(UiGridLayout eObject) {
	//		for (assignment : eObject.contents) {
	//			eObject.addElement(assignment.element)
	//		}
	//	}
	//
	//	def dispatch void finish(YBeanSlot yBeanSlot) {
	//	}
	override void discardDerivedState(DerivedStateAwareResource resource) {
		if (resource.contents.size > 1) {
			for (var i = 1; i < resource.contents.size; i++) {
				resource.contents.remove(1)
			}
		}
	}

}
