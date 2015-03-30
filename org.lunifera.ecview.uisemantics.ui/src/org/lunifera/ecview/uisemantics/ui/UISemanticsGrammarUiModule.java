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
package org.lunifera.ecview.uisemantics.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.lunifera.ecview.uisemantics.ui.hover.UiSemanticGrammarHoverDocumentationProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class UISemanticsGrammarUiModule extends org.lunifera.ecview.uisemantics.ui.AbstractUISemanticsGrammarUiModule {
	public UISemanticsGrammarUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.hover.html.IEObjectHoverDocumentationProvider> bindIEObjectHoverDocumentationProvider() {
		return UiSemanticGrammarHoverDocumentationProvider.class;
	}
}
