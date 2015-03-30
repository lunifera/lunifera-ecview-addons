
/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */


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
import org.lunifera.ecview.semantic.uimodel.UiBinding
import org.eclipse.emf.ecore.util.EcoreUtil
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef

class BindingHelper {
	 
	def dispatch UiBinding findBinding(UiEmbeddable embeddable) {
		val uiModel = embeddable.uiModel
		for(EObject object : EcoreUtil.getAllContents(uiModel,true).toIterable){
			if(object instanceof UiTypedBindableDef){
				if(object.rawBindable == embeddable){
					
				}
			}
		}
		return null
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
	
	def UiModel getUiModel(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		if (eObject instanceof UiModel) {
			return eObject as UiModel;
		} else {
			return getUiModel(eObject.eContainer());
		}
	}
	
}