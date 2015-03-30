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



package org.lunifera.ecview.dsl.ui.labeling

import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.xbase.ui.labeling.XbaseDescriptionLabelProvider

//import org.eclipse.xtext.resource.IEObjectDescription
/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class UIGrammarDescriptionLabelProvider extends XbaseDescriptionLabelProvider {

	// Labels and icons can be computed like this:
	override text(IEObjectDescription ele) {
		ele.name.toString
	}

	override image(IEObjectDescription ele) {
		ele.EClass.name + '.gif'
	}
	
	override getImage(Object object) {
		return null
	}
	
}
