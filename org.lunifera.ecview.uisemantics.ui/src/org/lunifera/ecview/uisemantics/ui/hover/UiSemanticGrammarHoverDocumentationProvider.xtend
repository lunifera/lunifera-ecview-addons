package org.lunifera.ecview.uisemantics.ui.hover

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks
import org.eclipse.xtext.xbase.ui.hover.XbaseDeclarativeHoverSignatureProvider
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverDocumentationProvider
import org.lunifera.ecview.semantic.uisemantics.UxBindingableOption

import static org.eclipse.xtext.xbase.ui.hover.HoverLinkHelper.*

class UiSemanticGrammarHoverDocumentationProvider extends XbaseHoverDocumentationProvider {

	@Inject
	private XbaseDeclarativeHoverSignatureProvider hoverSignatureProvider;

	@Inject
	protected IEObjectDocumentationProvider documentationProvider;

	override String computeDocumentation(EObject object) {
		return object.customDocumentation
	}

	def dispatch String getCustomDocumentation(EObject object) {
		return super.computeDocumentation(object)
	}
 
	def dispatch String getCustomDocumentation(UxBindingableOption object) {
		return "<p><b><i>description:</i></b> " + documentationProvider.getDocumentation(object) +"</p>"
	}
 
	def String computeLinkToElement(EObject jvmElement) {
		val String imageURL = hoverSignatureProvider.getImageTag(jvmElement);
		val String signature = hoverSignatureProvider.getDerivedOrSourceSignature(jvmElement);
		return imageURL +
			createLinkWithLabel(XtextElementLinks.XTEXTDOC_SCHEME, EcoreUtil.getURI(jvmElement), signature);
	}

}
