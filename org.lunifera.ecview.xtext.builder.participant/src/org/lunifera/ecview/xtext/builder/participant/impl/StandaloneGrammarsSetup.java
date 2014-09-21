/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.xtext.builder.participant.impl;

import org.lunifera.ecview.dsl.UIGrammarBundleSpaceStandaloneSetup;
import org.lunifera.ecview.uisemantics.UISemanticsGrammarBundleSpaceStandaloneSetup;

/**
 * A helper class to setup the Xtext grammars properly.
 */
@SuppressWarnings("restriction")
public class StandaloneGrammarsSetup {

	public static void setup() {
		UISemanticsGrammarBundleSpaceStandaloneSetup.doSetup();
		UIGrammarBundleSpaceStandaloneSetup.doSetup();
	}

}
