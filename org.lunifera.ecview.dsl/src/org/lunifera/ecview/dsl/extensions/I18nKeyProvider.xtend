package org.lunifera.ecview.dsl.extensions

import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiColumn
import org.lunifera.ecview.semantic.uimodel.UiSearchField
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment
import org.eclipse.emf.ecore.EObject
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty
import org.lunifera.ecview.semantic.uimodel.UiErrorCode
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import org.lunifera.ecview.semantic.uimodel.UiExposedAction

class I18nKeyProvider {
	
	@Inject extension IQualifiedNameProvider
	
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
		return currentPackage + if(embeddable.name != null) ("." + embeddable.name) else ""
	}
	 
	def dispatch String toI18nKey(UiColumn column) {
		val currentPackage = column.getPackage
				
		if (column.i18nInfo != null && column.i18nInfo.key != null) {
			if (column.i18nInfo.key.startsWith(".")) {
				// attache the current package
				return currentPackage + column.i18nInfo.key
			} else {
				return column.i18nInfo.key;
			}
		}else{
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
		}else{
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
		}else{
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