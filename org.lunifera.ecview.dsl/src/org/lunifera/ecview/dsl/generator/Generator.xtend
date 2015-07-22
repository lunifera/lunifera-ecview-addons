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
package org.lunifera.ecview.dsl.generator

import java.io.StringWriter
import java.io.Writer
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.lunifera.dsl.xtext.lazyresolver.generator.DelegatingGenerator
import org.lunifera.ecview.core.common.model.core.YView

class Generator extends DelegatingGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {

		super.doGenerate(input, fsa)

		for (YView yView : input.contents.filter(typeof(YView))) {
			val XMLResource outputRes = new XMLResourceImpl
			outputRes.contents += EcoreUtil.copy(yView)

			val Writer writer = new StringWriter
			outputRes.save(writer, null)

			fsa.generateFile(yView.viewName + ".ecview", "ECViews", writer.toString)
		}
	}
}
