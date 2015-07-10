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
package org.lunifera.ecview.uisemantics.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.lunifera.ecview.uisemantics.services.UISemanticsGrammarGrammarAccess;

public class UISemanticsGrammarParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private UISemanticsGrammarGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.lunifera.ecview.uisemantics.parser.antlr.internal.InternalUISemanticsGrammarParser createParser(XtextTokenStream stream) {
		return new org.lunifera.ecview.uisemantics.parser.antlr.internal.InternalUISemanticsGrammarParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "UxModel";
	}
	
	public UISemanticsGrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(UISemanticsGrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
