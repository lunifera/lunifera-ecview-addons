package org.lunifera.ecview.dsl.extensions

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField
import org.lunifera.ecview.semantic.uimodel.UiColumn
import org.lunifera.ecview.semantic.uimodel.UiComboBox
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiErrorCode
import org.lunifera.ecview.semantic.uimodel.UiExposedAction
import org.lunifera.ecview.semantic.uimodel.UiField
import org.lunifera.ecview.semantic.uimodel.UiList
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup
import org.lunifera.ecview.semantic.uimodel.UiSearchField
import org.lunifera.ecview.semantic.uimodel.UiSearchPanel
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment
import org.lunifera.ecview.semantic.uimodel.UiTable
import org.lunifera.runtime.common.metric.TimeLogger

class I18nKeyProvider {

	@Inject extension IQualifiedNameProvider
	@Inject BindingInfoHelper bindingInfoHelper;

	def dispatch String toI18nKey(UiEmbeddable embeddable) {
		val currentPackage = embeddable.getPackage

		if (embeddable.i18nInfo != null && embeddable.i18nInfo.key != null) {
			if (embeddable.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + embeddable.i18nInfo.key
			} else {
				return embeddable.i18nInfo.key;
			}
		}

		if (embeddable instanceof UiField) {
			val String i18nKey = toI18nKeyByBindings(embeddable)
			if (i18nKey != null && !i18nKey.equals("")) {
				return i18nKey;
			}
		}
		return currentPackage + if(embeddable.name != null) ("." + embeddable.name) else ""
	}

	def dispatch String toI18nKey(UiTable element) {
		val currentPackage = element.getPackage

		if (element.i18nInfo != null && element.i18nInfo.key != null) {
			if (element.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + element.i18nInfo.key
			} else {
				return element.i18nInfo.key;
			}
		} else if (element.jvmType != null) {
			return element.jvmType.qualifiedName
		}
		return currentPackage + if(element.name != null) ("." + element.name) else ""
	}

	def dispatch String toI18nKey(UiList element) {
		val currentPackage = element.getPackage

		if (element.i18nInfo != null && element.i18nInfo.key != null) {
			if (element.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + element.i18nInfo.key
			} else {
				return element.i18nInfo.key;
			}
		} else if (element.jvmType != null) {
			return element.jvmType.qualifiedName
		}
		return currentPackage + if(element.name != null) ("." + element.name) else ""
	}

	def dispatch String toI18nKey(UiOptionsGroup element) {
		val currentPackage = element.getPackage

		if (element.i18nInfo != null && element.i18nInfo.key != null) {
			if (element.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + element.i18nInfo.key
			} else {
				return element.i18nInfo.key;
			}
		} else if (element.jvmType != null) {
			return element.jvmType.qualifiedName
		}
		return currentPackage + if(element.name != null) ("." + element.name) else ""
	}

	def dispatch String toI18nKey(UiComboBox element) {
		val currentPackage = element.getPackage

		if (element.i18nInfo != null && element.i18nInfo.key != null) {
			if (element.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + element.i18nInfo.key
			} else {
				return element.i18nInfo.key;
			}
		} else if (element.jvmType != null) {
			return element.jvmType.qualifiedName
		}
		return currentPackage + if(element.name != null) ("." + element.name) else ""
	}

	def dispatch String toI18nKey(UiSearchPanel element) {
		val currentPackage = element.getPackage

		if (element.i18nInfo != null && element.i18nInfo.key != null) {
			if (element.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + element.i18nInfo.key
			} else {
				return element.i18nInfo.key;
			}
		} else if (element.jvmType != null) {
			return element.jvmType.qualifiedName
		}
		return currentPackage + if(element.name != null) ("." + element.name) else ""
	}

	def dispatch String toI18nKey(UiBeanReferenceField element) {
		val currentPackage = element.getPackage

		if (element.i18nInfo != null && element.i18nInfo.key != null) {
			if (element.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + element.i18nInfo.key
			} else {
				return element.i18nInfo.key;
			}
		} else if (element.jvmType != null) {
			return element.jvmType.qualifiedName
		}
		return currentPackage + if(element.name != null) ("." + element.name) else ""
	}

	def dispatch String toI18nKey(UiColumn column) {
		val currentPackage = column.getPackage
		val UiTable table = column.eContainer.eContainer as UiTable

		if (column.i18nInfo != null && column.i18nInfo.key != null) {
			if (column.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + column.i18nInfo.key
			} else {
				return column.i18nInfo.key;
			}
		} else if (table.jvmType != null) {
			val UiNestedProperty property = column.property
			if (property != null) {
				val path = property.toPathString
				if (path == null) {
					return table.jvmType.qualifiedName
				} else if (path.contains(".")) {
					val type = property.typeofSecondLastSegment
					return type.qualifiedName + "." + property.simpleGetterNameOfLastSegment
				} else {
					val type = property.getter.declaringType
					return type.qualifiedName + "." + property.simpleGetterName
				}
			}
		} else {
			val UiNestedProperty property = column.property
			if (property != null) {
				val parent = column.eContainer().eContainer() as UiEmbeddable
				return currentPackage + "." + parent.name + "." + property.toPathString
			}
		}
		return currentPackage + "." + column.name
	}

	def dispatch String toI18nKey(UiExposedAction action) {
		if (action.actionReference != null) {
			return action.actionReference.name
		} else {
			return action.actionID
		}
	}

	def dispatch String toI18nKey(UiSearchField embeddable) {
		val currentPackage = embeddable.getPackage

		if (embeddable.i18nInfo != null && embeddable.i18nInfo.key != null) {
			if (embeddable.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + embeddable.i18nInfo.key
			} else {
				return embeddable.i18nInfo.key;
			}
		} else {
			val UiNestedProperty property = embeddable.property
			if (property != null) {
				return currentPackage + ".search." + property.toPathString
			}
		}
		return currentPackage + "." + embeddable.name
	}

	def dispatch String toI18nKey(UiTabAssignment embeddable) {
		val currentPackage = embeddable.getPackage

		if (embeddable.i18nInfo != null && embeddable.i18nInfo.key != null) {
			if (embeddable.i18nInfo.key.startsWith(".")) {

				// attache the current package
				return currentPackage + "." + embeddable.i18nInfo.key
			} else {
				return embeddable.i18nInfo.key;
			}
		}
		return currentPackage + "." + embeddable.name
	}

	def dispatch String toI18nKey(UiErrorCode code) {
		val fqn = code.fullyQualifiedName
		return fqn.skipLast(1).toString
	}

	def String toI18nKeyByBindings(UiEmbeddable embeddable) {
		if (embeddable instanceof UiField) {
			val TimeLogger logger = TimeLogger.start(typeof(I18nKeyProvider))
			val ops = bindingInfoHelper.findBoundOppositeJvmOperations(embeddable, "value")
			logger.stop("Calculating bound opposite operations took: ")

			if (!ops.empty) {
				val JvmOperation op = ops.get(0)
				val JvmType type = op.declaringType
				if (type == null) {
					return null
				}
				return toI18nKey(type.qualifiedName, ops.get(0).simpleName.toPropertyName)
			}
		}
	}

	def static getToPropertyName(String string) {
		if (string.startsWith("get")) {
			return string.replaceFirst("get", "").toFirstLower
		} else if (string.startsWith("is")) {
			return string.replaceFirst("is", "").toFirstLower
		}
	}

	def static String toI18nKey(String beanFQN, String property) {
		beanFQN + "." + property
	}

	/**
	 * Returns the package name.
	 * 
	 * @param eObject
	 * @return
	 */
	def String getPackage(EObject eObject) {
		if (eObject == null) {
			return "";
		}
		if (eObject instanceof UiModel) {
			return (eObject as UiModel).getPackageName();
		} else {
			return getPackage(eObject.eContainer());
		}
	}

}
