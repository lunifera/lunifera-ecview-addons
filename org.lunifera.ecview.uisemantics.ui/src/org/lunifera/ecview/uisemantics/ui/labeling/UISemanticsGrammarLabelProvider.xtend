/*
* generated by Xtext
*/
package org.lunifera.ecview.uisemantics.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
import org.lunifera.ecview.semantic.uisemantics.UxBindingableOption

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class UISemanticsGrammarLabelProvider extends XbaseLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(EPackage ele) {
		ele.nsURI
	}
	
	def String image(UxBindingableOption object){
		"UxBindingableOption.png"
	}
}
