/*
* generated by Xtext
*/
package org.lunifera.ecview.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess;

public class UIGrammarParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private UIGrammarGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.lunifera.ecview.dsl.parser.antlr.internal.InternalUIGrammarParser createParser(XtextTokenStream stream) {
		return new org.lunifera.ecview.dsl.parser.antlr.internal.InternalUIGrammarParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "UiModel";
	}
	
	public UIGrammarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(UIGrammarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}