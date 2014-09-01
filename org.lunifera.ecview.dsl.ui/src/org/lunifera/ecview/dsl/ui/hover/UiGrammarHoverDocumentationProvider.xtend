package org.lunifera.ecview.dsl.ui.hover

import com.google.inject.Inject
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks
import org.eclipse.xtext.xbase.ui.hover.XbaseDeclarativeHoverSignatureProvider
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverDocumentationProvider
import org.lunifera.ecview.dsl.scope.BindableTypeProvider
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uisemantics.UxBindingableOption
import org.lunifera.ide.core.api.i18n.II18nRegistry
import org.lunifera.ide.core.api.i18n.II18nRegistry.Proposal
import org.lunifera.ide.core.ui.util.CoreUiUtil

import static org.eclipse.xtext.xbase.ui.hover.HoverLinkHelper.*
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment
import org.lunifera.ecview.semantic.uimodel.UiNamedElement

class UiGrammarHoverDocumentationProvider extends XbaseHoverDocumentationProvider {

	@Inject
	private XbaseDeclarativeHoverSignatureProvider hoverSignatureProvider;

	@Inject
	protected IEObjectDocumentationProvider documentationProvider;

	@Inject
	private BindableTypeProvider typeProvider;

	@Inject
	II18nRegistry i18nRegistry

	@Inject
	CoreUiUtil util;

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

		val JvmType type = typeProvider.getType(object)
		if (type != null) {
			sb.append("<p>type: ")
			sb.append(type.computeLinkToElement)
			sb.append("</p>")
		}

		// Add the i18n documentation
		sb.append("<h3>I18n Info</h3>")
		if(object.i18nInfo != null && !object.i18nInfo.key.empty){
			sb.append(object.i18nInfo.customDocumentation)
		}else{
			sb.append(object.i18nDefaultDocumentation)
		}
			
		return sb.toString
	}
	
	def dispatch String getCustomDocumentation(UiTabAssignment object) {
		val StringBuilder sb = new StringBuilder
		sb.append(super.computeDocumentation(object))

		// Add the i18n documentation
		sb.append("<h3>I18n Info</h3>")
		if(object.i18nInfo != null && !object.i18nInfo.key.empty){
			sb.append(object.i18nInfo.customDocumentation)
		}else{
			sb.append(object.i18nDefaultDocumentation)
		}
			
		return sb.toString
	}
	
	/**
	 * Returns the default i18n docu for an embeddable. 
	 **/
	def String getI18nDefaultDocumentation(UiNamedElement model) {
		var IProject javaProject = util.getProject(model)
		
		var String packageName = model.findPackage
		var String key = packageName + "." + model.getName
		val List<Proposal> proposals = i18nRegistry.findProposals(javaProject.project, util.locale, packageName,
			key);

		var String result = "Key: " + key + "<p>"
		return result + proposals.getI18nLocaleDocumentation.toString
	}

	def dispatch String getCustomDocumentation(UiBeanSlot object) {
		return "<p><b>provides:</b> " + object.jvmType.type.computeLinkToElement
	}

	def dispatch String getCustomDocumentation(UiI18nInfo model) {
		var IProject javaProject = util.getProject(model)
		var String packageName = if(model.key.startsWith(".")) model.findPackage else null
		val List<Proposal> proposals = i18nRegistry.findProposals(javaProject.project, util.locale, packageName,
			model.key);

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

}
