package org.lunifera.ecview.dsl.derivedstate

import com.google.inject.Inject
import java.util.List
import java.util.Map
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable
import org.eclipse.emf.ecp.ecview.common.model.core.YField
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout
import org.eclipse.emf.ecp.ecview.common.model.core.YView
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet
import org.eclipse.emf.ecp.ecview.common.model.validation.YClassDelegateValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YCheckBox
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YGridLayout
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YNumericField
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.YTextField
import org.eclipse.emf.ecp.ecview.^extension.model.^extension.util.SimpleExtensionModelFactory
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
import org.lunifera.ecview.semantic.uimodel.UiCheckBox
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiField
import org.lunifera.ecview.semantic.uimodel.UiGridLayout
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment
import org.lunifera.ecview.semantic.uimodel.UiIDEView
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiNumericField
import org.lunifera.ecview.semantic.uimodel.UiPathSegment
import org.lunifera.ecview.semantic.uimodel.UiPoint
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator
import org.lunifera.ecview.semantic.uimodel.UiTextField
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef
import org.lunifera.ecview.semantic.uimodel.UiView
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoaderProvider

class UiModelDerivedStateComputerx extends JvmModelAssociator {

	@Inject
	IJdtTypeLoaderProvider typeLoaderProvider;
	@Inject
	BindableTypeProvider bindingTypeProvider;
	final Stack<EObject> viewContext = new Stack
	final List<YView> views = newArrayList()
	final Map<EObject, EObject> associations = newHashMap();
	final SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory

	YView currentView;

	DerivedStateAwareResource resource

	def void associateUi(EObject grammarElement, EObject uiElement) {
		associations.put(grammarElement, uiElement)
	}

	def <A> A associatedUi(EObject grammarElement) {
		return associations.get(grammarElement) as A
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		
		super.installDerivedState(resource, preLinkingPhase)
		this.resource = resource;

		if (resource.getContents().isEmpty()) {
			return;
		}

		if (!preLinkingPhase) {
			
			val EObject eObject = resource.getContents().get(0);
			// complete all elements
			eObject.eContents.forEach[
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
	
	
	def push(EObject eObject){
		viewContext.push(eObject)
	}
	

	def dispatch void map(UiGridLayout eObject) {
		val YGridLayout layout = factory.createGridLayout
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

	def dispatch void map(UiGridLayoutAssigment eObject) {

		val YGridLayout layout = peek

		val element = eObject.element
		val newField = element.create
		layout.addElement(newField)

		if (element instanceof UiField) {
			newField.push
			val UiField yField = element as UiField
			yField.validators.forEach [
				it.map
			]
			pop
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

		eObject.validator.map
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

	def dispatch YEmbeddable create(YEmbeddable object) {
	}

	def dispatch YEmbeddable create(UiTextField object) {
		val YTextField textField = factory.createTextField
		textField.name = object.name
		textField.label = object.name

		object.associateUi(textField)

		return textField
	}

	def dispatch YEmbeddable create(UiNumericField object) {
		val YNumericField field = factory.createNumericField
		field.name = object.name
		field.label = object.name

		object.associateUi(field)

		return field
	}

	def dispatch YEmbeddable create(UiCheckBox object) {
		val YCheckBox textField = factory.createCheckBox
		textField.name = object.name
		textField.label = object.name

		object.associateUi(textField)

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

	def YBindingEndpoint createBindingEndpoint(UiBindingEndpointAssignment epDef) {
		if (epDef == null) {
			return null
		}
		var YBindingEndpoint result = null;
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
			val YEmbeddable yElement = info.bindingRoot.associatedUi
			val YECViewModelValueBindingEndpoint ep = factory.createECViewModelValueBindingEndpoint
			ep.element = yElement
			ep.propertyPath = info.path.toString
			if (info.bindingType != null) {
				ep.typeQualifiedName = info.bindingType.qualifiedName
				ep.type = loadClass(epDef.eResource.resourceSet, ep.typeQualifiedName)
			}
			if (yElement != null) {
				ep.emfNsURI = yElement.eClass.EPackage.nsURI
			}
			result = ep
		}

		return result
	}

	def dispatch void collectBindingInfo(UiBindingEndpointAssignment assignment,
		UiModelDerivedStateComputerx.BindingInfo info) {
		var result = if(info != null) info else new UiModelDerivedStateComputerx.BindingInfo
		if (assignment.typedBindableAlias != null) {
			assignment.typedBindableAlias.collectBindingInfo(result)
		} else {
			assignment.typedBindableDef.collectBindingInfo(result)
		}

		// on the way back up the structure, collect the path
		if (assignment.path != null) {
			info.appendPath(assignment.path.toPathString)
			info.bindingType = assignment.path.typeofLastSegment
		}
	}

	def dispatch void collectBindingInfo(UiBeanSlot slot, UiModelDerivedStateComputerx.BindingInfo info) {
		info.bindingRoot = slot
		info.bindingType = slot.jvmType?.type
	}

	def dispatch void collectBindingInfo(UiBindingEndpointAlias alias, UiModelDerivedStateComputerx.BindingInfo info) {
		alias.endpoint.collectBindingInfo(info)
	}

	def dispatch void collectBindingInfo(UiTypedBindableDef definition, UiModelDerivedStateComputerx.BindingInfo info) {

		// must be the last element
		info.bindingType = bindingTypeProvider.getType(definition)
		info.bindingRoot = definition.rawBindable
		val bindingMethod = definition.method
		if (bindingMethod != null) {
			info.appendPath(bindingMethod.name)
		}
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
		super.discardDerivedState(resource)

		if (resource.contents.size > 1) {
			for (var i = 1; i < resource.contents.size; i++) {
				resource.contents.remove(1)
			}
		}
	}

	static class BindingInfo {

		/**
		 * The type of the binding. For nested bindings it is the last element available
		 */
		@Property
		private JvmType bindingType

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
