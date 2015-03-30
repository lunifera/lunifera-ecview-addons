

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
package org.lunifera.ecview.dsl.validation

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.validation.Check
import org.lunifera.ecview.dsl.extensions.BeanHelper
import org.lunifera.ecview.dsl.extensions.TypeHelper
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField
import org.lunifera.ecview.semantic.uimodel.UiComboBox
import org.lunifera.ecview.semantic.uimodel.UiList
import org.lunifera.ecview.semantic.uimodel.UiModelPackage
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup
import org.lunifera.ecview.semantic.uimodel.UiSearchField
import org.lunifera.xtext.builder.types.loader.api.ITypeLoader
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderFactory
import org.eclipse.xtext.common.types.JvmEnumerationType

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class UIGrammarValidator extends AbstractUIGrammarValidator {

	@Inject
	ITypeLoaderFactory typeLoaderFactory;
	ITypeLoader typeLoader

	@Inject extension TypeHelper
	@Inject extension IQualifiedNameProvider

	//  public static val INVALID_NAME = 'invalidName'
	//
	//	@Check
	//	def checkGreetingStartsWithCapital(Greeting greeting) {
	//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
	//			warning('Name should start with a capital', 
	//					MyDslPackage.Literals.GREETING__NAME,
	//					INVALID_NAME)
	//		}
	//	}
	@Check
	def checkSearchField(UiSearchField field) {
		val JvmType type = field.property.typeofLastSegment
		if (type.number) {
			// everything is fine
		} else if (type.string) {
			// everything is fine
		} else if (type.boolean) {
			// everything is fine
		} else {
			error(
				"Searchfields for type " + type.fullyQualifiedName.toString + " are not supported in this version",
				field,
				UiModelPackage.Literals.UI_SEARCH_FIELD__PROPERTY
			)
		}
	}

	@Check
	def checkCaptionProperty(UiOptionsGroup field) {
		var String result = null
		if (field.itemCaptionProperty != null) {
			return
		}
		
		if(field.jvmType?.type instanceof JvmEnumerationType){
			return
		}
		
		val typeLoader = typeLoaderFactory.createTypeLoader(field.eResource.resourceSet)
		val type = typeLoader.findTypeByName(field.jvmType?.qualifiedName)
		if (type != null) {
			result = BeanHelper.findCaptionProperty(type)
		}
		typeLoader.dispose

		if (result == null) {
			warning("Caption property could not be calculated by Type.", field,
				UiModelPackage.Literals.UI_OPTIONS_GROUP__ITEM_CAPTION_PROPERTY)
		}
	}

	@Check
	def checkCaptionProperty(UiList field) {
		var String result = null
		if (field.itemCaptionProperty != null) {
			return
		}
		
		if(field.jvmType?.type instanceof JvmEnumerationType){
			return
		}
		
		val typeLoader = typeLoaderFactory.createTypeLoader(field.eResource.resourceSet)
		val type = typeLoader.findTypeByName(field.jvmType?.qualifiedName)
		if (type != null) {
			result = BeanHelper.findCaptionProperty(type)
		}
		typeLoader.dispose

		if (result == null) {
			warning("Caption property could not be calculated by Type.", field,
				UiModelPackage.Literals.UI_LIST__ITEM_CAPTION_PROPERTY)
		}
	}

	@Check
	def checkCaptionProperty(UiComboBox field) {
		var String result = null
		if (field.itemCaptionProperty != null) {
			return
		}
		
		if(field.jvmType?.type instanceof JvmEnumerationType){
			return
		}
		
		val typeLoader = typeLoaderFactory.createTypeLoader(field.eResource.resourceSet)
		val type = typeLoader.findTypeByName(field.jvmType?.qualifiedName)
		if (type != null) {
			result = BeanHelper.findCaptionProperty(type)
		}
		typeLoader.dispose

		if (result == null) {
			warning("Caption property could not be calculated by Type.", field,
				UiModelPackage.Literals.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY)
		}
	}

	@Check
	def checkCaptionProperty(UiBeanReferenceField field) {
		var String result = null
		if (field.captionProperty != null) {
			return
		}

		val typeLoader = typeLoaderFactory.createTypeLoader(field.eResource.resourceSet)
		val type = typeLoader.findTypeByName(field.jvmType?.qualifiedName)
		
		if (type != null) {
			result = BeanHelper.findCaptionProperty(type)
		}
		typeLoader.dispose

		if (result == null) {
			warning("Caption property could not be calculated by Type.", field,
				UiModelPackage.Literals.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY)
		}
	}
}
