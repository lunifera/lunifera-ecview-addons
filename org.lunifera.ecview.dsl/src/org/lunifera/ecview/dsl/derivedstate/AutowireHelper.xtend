package org.lunifera.ecview.dsl.derivedstate

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmType
import org.lunifera.ecview.core.common.model.binding.BindingFactory
import org.lunifera.ecview.core.common.model.binding.YBindingUpdateStrategy
import org.lunifera.ecview.core.common.model.core.YEmbeddable
import org.lunifera.ecview.core.common.model.core.YLayout
import org.lunifera.ecview.core.^extension.model.^extension.ExtensionModelFactory
import org.lunifera.ecview.core.^extension.model.^extension.YFormLayout
import org.lunifera.ecview.dsl.autowire.IAutowireDelegate
import org.lunifera.ecview.dsl.extensions.BindableTypeResolver
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider
import org.lunifera.ecview.dsl.extensions.OperationExtensions
import org.lunifera.ecview.dsl.extensions.OperationExtensions.OperationInfo
import org.lunifera.ecview.dsl.extensions.TypeHelper
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout
import org.lunifera.ecview.semantic.uimodel.UiLayout
import org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory
import org.lunifera.runtime.common.metric.TimeLogger
import org.eclipse.xtext.common.types.JvmVoid

class AutowireHelper implements IAutowireDelegate {

	@Inject extension TypeHelper
	private ExtensionModelFactory yFactory = ExtensionModelFactory.eINSTANCE
	private VaadinMobileFactory vFactory = VaadinMobileFactory.eINSTANCE

	UiModelDerivedStateComputerx computer
	boolean mobile

	YLayout yLayout
	UiLayout uiLayout
	String i18nRootKey

	Layouter layouter

	JvmDeclaredType beanType

	override autowire(UiLayout uiLayout, UiModelDerivedStateComputerx computer, boolean mobile) {
		if (!uiLayout.autowire) {
			return
		}

		val logger = TimeLogger.start(typeof(AutowireHelper))

		this.computer = computer;
		this.mobile = mobile;
		this.i18nRootKey = i18nRootKey;

		this.uiLayout = uiLayout;
		this.yLayout = computer.associatedUi(uiLayout)

		switch (uiLayout) {
			UiHorizontalLayout: {
				layouter = if(!mobile) new HorizontalLayouter else new MobileLayouter
				layouter.setup(uiLayout, yLayout)
			}
			default:
				return
		}

		val BindableTypeResolver resolver = new BindableTypeResolver
		var temp = resolver.resolveType(uiLayout.autoWireSource)
		if(temp instanceof JvmVoid){
			return
		}
		beanType = temp as JvmDeclaredType

		val opInfo = OperationExtensions.getOperationInfos(beanType)

		opInfo.values.forEach [
			val type = getter.returnType.type
			if (type.boolean) {
				if(mobile) type.createMobileSwitch(it) else type.createCheckbox(it)
			} else if (type.numberWithDigits) {
				type.createDecimalField(it)
			} else if (type.numberWithoutDigits) {
				type.createNumberField(it)
			} else if (type.string) {
				type.createTextField(it)
			} else if (type.date) {
				type.createDateField(it)
			} else if (type.enum) {
				type.createEnumOptionsGroup(it)
			} else if (it.domainReference) {
				type.createBeanReferenceField(it)
			}
		]

		logger.stop("Autowiring took: ")
		val x = logger.toString
		println(x)
	}

	def void createTextField(JvmType type, OperationInfo info) {
		val yField = yFactory.createYTextField
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name

		layouter.add(yField)

		yField.createBinding(info, type, "value");
	}

	def void createDecimalField(JvmType type, OperationInfo info) {
		val yField = yFactory.createYDecimalField
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name

		layouter.add(yField)

		yField.createBinding(info, type, "value");
	}

	def void createNumberField(JvmType type, OperationInfo info) {
		val yField = yFactory.createYNumericField
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name

		layouter.add(yField)

		yField.createBinding(info, type, "value");
	}

	def void createCheckbox(JvmType type, OperationInfo info) {
		val yField = yFactory.createYCheckBox
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name

		layouter.add(yField)

		yField.createBinding(info, type, "value");
	}

	def void createDateField(JvmType type, OperationInfo info) {
		val yField = yFactory.createYDateTime
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name

		layouter.add(yField)

		yField.createBinding(info, type, "value");
	}

	def void createEnumOptionsGroup(JvmType type, OperationInfo info) {
		val yField = yFactory.createYEnumOptionsGroup
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name
		yField.type = computer.loadClass(uiLayout.eResource.resourceSet, type.qualifiedName)
		yField.typeQualifiedName = type.qualifiedName

		layouter.add(yField)

		yField.createBinding(info, type, "selection");
	}

	def void createBeanReferenceField(JvmType type, OperationInfo info) {
		val yField = yFactory.createYBeanReferenceField
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name
		yField.type = computer.loadClass(uiLayout.eResource.resourceSet, type.qualifiedName)
		yField.typeQualifiedName = type.qualifiedName
		yField.useBeanService = true

		layouter.add(yField)

		yField.createBinding(info, type, "selection");
	}

	def void createMobileSwitch(JvmType type, OperationInfo info) {
		val yField = vFactory.createVMSwitch
		yField.initialEnabled = !info.readonly

		//		yField.labelI18nKey = i18nRootKey + "." + info.name
		yField.label = info.name

		layouter.add(yField)

		yField.createBinding(info, type, "value");
	}

	/**
	 * Create the bindings and install at the view
	 */
	def createBinding(YEmbeddable yField, OperationInfo info, JvmType type, String fieldProperty) {

		// use the autoWireSource as the model endpoint
		val UiBindingEndpointAssignment uiModelEndpoint = uiLayout.autoWireSource as UiBindingEndpointAssignment
		val yModelEndpoint = computer.createValueBindingEndpoint(uiModelEndpoint)
		val detailValueEndpoint = yModelEndpoint.createDetailValueEndpoint
		detailValueEndpoint.propertyPath = info.name
		detailValueEndpoint.type = computer.loadClass(uiLayout.eResource.resourceSet, beanType.qualifiedName)

		// create the field endpoint
		val yFieldEndpoint = BindingFactory.eINSTANCE.createYECViewModelValueBindingEndpoint
		yFieldEndpoint.element = yField
		yFieldEndpoint.propertyPath = fieldProperty
		yFieldEndpoint.typeQualifiedName = beanType.qualifiedName
		yFieldEndpoint.type = computer.loadClass(uiLayout.eResource.resourceSet, beanType.qualifiedName)
		if (yFieldEndpoint.type != null && yFieldEndpoint.type.isAssignableFrom(typeof(EObject))) {
			yFieldEndpoint.emfNsURI = yField.eClass.EPackage.nsURI
		}

		// bind model to target		
		val yBinding = BindingFactory.eINSTANCE.createYValueBinding();
		yBinding.setTargetEndpoint(yFieldEndpoint);
		yBinding.setModelEndpoint(detailValueEndpoint);
		yBinding.setModelToTargetStrategy(YBindingUpdateStrategy.UPDATE);
		yBinding.setTargetToModelStrategy(
			if(info.readonly) YBindingUpdateStrategy.NEVER else YBindingUpdateStrategy.UPDATE)

		// register the binding at the current view
		yLayout.view.orCreateBindingSet.bindings += yBinding

		// set the i18n key based on the binding
		yField.labelI18nKey = I18nKeyProvider.toI18nKey(beanType.qualifiedName, detailValueEndpoint.propertyPath)
	}

	public interface Layouter {
		def void setup(UiLayout uiRootLayout, YLayout yRootLayout)

		def void add(YEmbeddable element);
	}

	public static class HorizontalLayouter implements Layouter {

		YFormLayout left
		YFormLayout right
		int index

		override setup(UiLayout uiRootLayout, YLayout yRootLayout) {
			left = ExtensionModelFactory.eINSTANCE.createYFormLayout
			right = ExtensionModelFactory.eINSTANCE.createYFormLayout

			yRootLayout.elements += left
			yRootLayout.elements += right
		}

		override add(YEmbeddable element) {
			if(index % 2 == 0) left.elements += element else right.elements += element
			index++
		}

	}

	public static class MobileLayouter implements Layouter {

		VMVerticalComponentGroup group

		override setup(UiLayout uiRootLayout, YLayout yRootLayout) {
			group = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup

			yRootLayout.elements += group
		}

		override add(YEmbeddable element) {
			group.addElement(element)
		}

	}
}
