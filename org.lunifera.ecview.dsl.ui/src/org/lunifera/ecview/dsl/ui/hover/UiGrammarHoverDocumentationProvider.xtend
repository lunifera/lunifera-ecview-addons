
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

package org.lunifera.ecview.dsl.ui.hover

import com.google.inject.Inject
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks
import org.eclipse.xtext.xbase.ui.hover.XbaseDeclarativeHoverSignatureProvider
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverDocumentationProvider
import org.lunifera.ecview.dsl.extensions.BindableTypeProvider
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiErrorCode
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiNamedElement
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage
import org.lunifera.ecview.semantic.uisemantics.UxBindingableOption
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition
import org.lunifera.ide.core.api.i18n.II18nRegistry
import org.lunifera.ide.core.api.i18n.II18nRegistry.Proposal
import org.lunifera.ide.core.ui.util.CoreUiUtil

import static org.eclipse.xtext.xbase.ui.hover.HoverLinkHelper.*

class UiGrammarHoverDocumentationProvider extends XbaseHoverDocumentationProvider {

	@Inject XbaseDeclarativeHoverSignatureProvider hoverSignatureProvider;

	@Inject	IEObjectDocumentationProvider documentationProvider;

	@Inject	BindableTypeProvider typeProvider;

	@Inject	II18nRegistry i18nRegistry
	@Inject	CoreUiUtil util;
	@Inject IResourceDescriptions descriptions
	
	@Inject extension IQualifiedNameProvider fqnProvider
	@Inject	extension I18nKeyProvider

	override String computeDocumentation(EObject object) {
		val superDocu = super.computeDocumentation(object)
		val customDocu = object.getCustomDocumentation

		val StringBuilder b = new StringBuilder
		if(superDocu != null) b.append(superDocu)
		if(customDocu != null) b.append(customDocu)

		return b.toString
	}

	def dispatch String getCustomDocumentation(EObject object) {
		return null
	}

	def dispatch String getCustomDocumentation(UiEmbeddable object) {
		val StringBuilder sb = new StringBuilder
		sb.append(super.computeDocumentation(object))

		val String semanticDocu = object.semanticElementDocumentation
		if(semanticDocu != null){
			sb.append(semanticDocu)
		}
 
		val JvmType type = typeProvider.getType(object)
		if (type != null) {
			sb.append("<p>type: ")
			sb.append(type.computeLinkToElement)
			sb.append("</p>")
		}

		// Add the i18n documentation
		sb.append("<h3>I18n Info</h3>")
		if (object.i18nInfo != null && !object.i18nInfo.key.empty) {
			sb.append(object.i18nInfo.customDocumentation)
		} else {
			sb.append(object.i18nDefaultDocumentation)
		}

		return sb.toString
	}

	def dispatch String getCustomDocumentation(UiTabAssignment object) {
		val StringBuilder sb = new StringBuilder
		sb.append(super.computeDocumentation(object))

		// Add the i18n documentation
		sb.append("<h3>I18n Info</h3>")
		if (object.i18nInfo != null && !object.i18nInfo.key.empty) {
			sb.append(object.i18nInfo.customDocumentation)
		} else {
			sb.append(object.i18nDefaultDocumentation)
		}

		return sb.toString
	}

	def dispatch String getCustomDocumentation(UiErrorCode object) {
		val StringBuilder sb = new StringBuilder
		sb.append(super.computeDocumentation(object))

		// Add the i18n documentation
		sb.append("<h3>I18n Info</h3>")
	
		val i18nKey = object.toI18nKey
		sb.append("Key: " + i18nKey + "<p>")

		var String packageName = object.findPackage
		var IProject javaProject = util.getProject(object)
		val List<Proposal> proposals = i18nRegistry.findStrictKeyMatchingProposals(javaProject.project, util.locale,
			packageName, i18nKey);
		sb.append(proposals.getI18nLocaleDocumentation.toString)

		return sb.toString
	}

	/**
	 * Returns the default i18n docu for an named element. 
	 **/
	def String getI18nDefaultDocumentation(UiNamedElement model) {
		var IProject javaProject = util.getProject(model)
		val i18nKey = model.toI18nKey
		var String packageName = model.findPackage
		
		val List<Proposal> proposals = i18nRegistry.findStrictKeyMatchingProposals(javaProject.project, util.locale,
			packageName, i18nKey);

		var String result = "Key: " + i18nKey + "<p>"
		return result + proposals.getI18nLocaleDocumentation.toString
	}

	def dispatch String getCustomDocumentation(UiBeanSlot object) {
		return "<p><b>provides:</b> " + object.jvmType.type.computeLinkToElement
	}
	
	def dispatch String getCustomDocumentation(UiMinLengthValidator object) {
		return 
			'''<p><b>Template variables for i18n: </b>
				<ul>
					<li><i>${value}</i> - the input of the validation</li>
					<li><i>${minLength}</i> - the defined min length</li>
					<li><i>${currentLength}</i> - the length of the input value</li>
				</ul>
				<br>
				Example: <i>"The min length of ${minLength} is not reached by ${value} with a length of ${currentLength}"</i>
			'''
	}
	
	def dispatch String getCustomDocumentation(UiMaxLengthValidator object) {
		return 
			'''<p><b>Template variables for i18n: </b>
				<ul>
					<li><i>${value}</i> - the input of the validation</li>
					<li><i>${maxLength}</i> - the defined max length</li>
					<li><i>${currentLength}</i> - the length of the input value</li>
				</ul>
				<br>
				Example: <i>"The max length of ${maxLength} is exceeded by ${value} with a length of ${currentLength}"</i>
			'''
	}
	
	def dispatch String getCustomDocumentation(UiRegexpValidator object) {
		return 
			'''<p><b>Template variables for i18n: </b>
				<ul>
					<li><i>${value}</i> - the input of the validation</li>
					<li><i>${regex}</i> - the defined regular expression</li>
				</ul>
				<br>
				Example: <i>"The ${value} does not macht the pattern ${regex}"</i>
			'''
	}

	def dispatch String getCustomDocumentation(UiI18nInfo model) {
		var IProject javaProject = util.getProject(model)
		var String packageName = if(model.key.startsWith(".")) model.findPackage else null
		val List<Proposal> proposals = i18nRegistry.findStrictKeyMatchingProposals(javaProject.project, util.locale,
			packageName, model.key);

		return proposals.getI18nLocaleDocumentation.toString
	}

	/**
	 * Iterates the containment tree up to the UiModel and returns the package.
	 */
	def String findPackage(EObject model) {
		var EObject temp = model;
		while (temp != null && temp.eContainer != null) {
			if (temp instanceof UiModel) {
				val UiModel uiModel = temp as UiModel
				return uiModel.packageName
			}
			temp = temp.eContainer
			if (temp instanceof UiModel) {
				val UiModel uiModel = temp as UiModel
				return uiModel.packageName
			}
		}
		return ""
	}

	def getI18nLocaleDocumentation(List<Proposal> proposals) '''
		<table width="100%">
			<colgroup>
				<col width="1*">
				<col width="3*">
				<col width="6*">
			</colgroup>
			<tr>
				<th align="left">Locale</th>
				<th align="left">Value</th>
				<th align="left">I18n Key</th>
			</tr>
			«FOR proposal : proposals»
				<tr>
					<td>«proposal.locale.toLanguageTag»</td> 
					<td>«proposal.i18nValue»</td>
					<td>«proposal.i18nKey»</td>
				</tr>
			«ENDFOR»
		</table>
	'''

	def dispatch String getCustomDocumentation(UxBindingableOption object) {
		return documentationProvider.getDocumentation(object)
	}

	def String computeLinkToElement(EObject jvmElement) {
		val String imageURL = hoverSignatureProvider.getImageTag(jvmElement);
		val String signature = hoverSignatureProvider.getDerivedOrSourceSignature(jvmElement);
		return imageURL +
			createLinkWithLabel(XtextElementLinks.XTEXTDOC_SCHEME, EcoreUtil.getURI(jvmElement), signature);
	}
	
	def String getSemanticElementDocumentation(UiEmbeddable embeddable){
		for (IEObjectDescription des : descriptions
				.getExportedObjectsByType(UiSemanticsPackage.Literals.UX_ELEMENT_DEFINITION)) {
			var UxElementDefinition element = des.getEObjectOrProxy() as UxElementDefinition;
			element = EcoreUtil.resolve(element,
					embeddable) as UxElementDefinition;
			if (element.getUri().getEClass().isSuperTypeOf(embeddable.eClass())) {
				return documentationProvider.getDocumentation(element)
			}
		}
		return null
	}

}
