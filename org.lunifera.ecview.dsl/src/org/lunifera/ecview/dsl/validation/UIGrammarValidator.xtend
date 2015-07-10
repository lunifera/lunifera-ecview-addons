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
import java.util.List
import org.eclipse.xtext.common.types.JvmEnumerationType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.validation.Check
import org.lunifera.ecview.core.common.IAccessible
import org.lunifera.ecview.dsl.extensions.BeanHelper
import org.lunifera.ecview.dsl.extensions.TypeHelper
import org.lunifera.ecview.dsl.lib.VisibilityOptions
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField
import org.lunifera.ecview.semantic.uimodel.UiComboBox
import org.lunifera.ecview.semantic.uimodel.UiList
import org.lunifera.ecview.semantic.uimodel.UiModelPackage
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup
import org.lunifera.ecview.semantic.uimodel.UiSearchField
import org.lunifera.ecview.semantic.uimodel.UiView
import org.lunifera.xtext.builder.types.loader.api.ITypeLoader
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderFactory

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class UIGrammarValidator extends AbstractUIGrammarValidator {

	public static final String CODE__MISSING__JAVAX_PERSISTENCE = "0_107";
	public static final String CODE__MISSING__L_RUNTIME_COMMON = "0_108";
	public static final String CODE__MISSING__DATATYPE_LIB = "0_109";
	public static final String CODE__MISSING__DTO_LIB = "0_110";
	public static final String CODE__MISSING__XBASE_LIB = "0_111";
	public static final String CODE__MISSING__JDK_1_5 = "0_112";
	public static final String CODE__MISSING__L_ECVIEW_COMMON = "0_113";
	public static final String CODE__MISSING__L_ECVIEW_DSL_LIB = "0_114";

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

		if (field.jvmType?.type instanceof JvmEnumerationType) {
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

		if (field.jvmType?.type instanceof JvmEnumerationType) {
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

		if (field.jvmType?.type instanceof JvmEnumerationType) {
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

	@Check
	def void checkClassPath(UiView model) {
		val TypeReferences typeReferences = getServices().getTypeReferences();
		val JvmGenericType listType = typeReferences.findDeclaredType(typeof(List), model)  as JvmGenericType;
		if (listType == null || listType.getTypeParameters().isEmpty()) {
			error("Couldn't find a JDK 1.5 or higher on the project's classpath.", model,
				UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__JDK_1_5);
		}
		if (typeReferences.findDeclaredType("org.lunifera.runtime.common.annotations.Dispose", model) == null) {
			error("Couldn't find the mandatory library 'org.lunifera.runtime.common' on the project's classpath.",
				model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__L_RUNTIME_COMMON);
		}
		if (typeReferences.findDeclaredType(typeof(Extension), model) == null) {
			error(
				"Couldn't find the mandatory library 'org.eclipse.xtext.xbase.lib' 2.7.3 or higher on the project's classpath.",
				model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__XBASE_LIB);
		}
		if (typeReferences.findDeclaredType(typeof(IAccessible), model) == null) {
			error(
				"Couldn't find the mandatory library 'org.lunifera.ecview.core.common' on the project's classpath.",
				model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__L_ECVIEW_COMMON);
		}
		if (typeReferences.findDeclaredType("org.lunifera.dsl.dto.lib.services.IDTOService", model) == null) {
			warning("Couldn't find the mandatory library 'org.lunifera.dsl.dto.lib' on the project's classpath. This may cause resolving problems.",
				model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__DTO_LIB);
		}
		if (typeReferences.findDeclaredType(typeof(VisibilityOptions), model) == null) {
			warning(
				"Couldn't find the mandatory library 'org.lunifera.ecview.dsl.lib' on the project's classpath. This may cause resolving problems.",
				model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__L_ECVIEW_DSL_LIB);
		}
//		if (typeReferences.findDeclaredType("java.persistence.Persistence", model) == null) {
//			warning(
//				"Couldn't find the optional library 'javax.persistence' 2.1.0 or higher on the project's classpath. If you are using JPA-Dto-Services, the library is mandatory.",
//				model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__JAVAX_PERSISTENCE);
//		}
		if (typeReferences.findDeclaredType("org.lunifera.dsl.common.datatypes.IDatatypeConstants", model) == null) {
			warning(
				"Couldn't find the optional library 'org.lunifera.dsl.datatype.lib' on the project's classpath. This may cause resolving problems.",
				model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, CODE__MISSING__DATATYPE_LIB);
		}
	}
}
