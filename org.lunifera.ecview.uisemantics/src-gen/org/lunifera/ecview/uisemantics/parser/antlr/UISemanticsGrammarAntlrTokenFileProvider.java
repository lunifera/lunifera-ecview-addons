/*
* generated by Xtext
*/
package org.lunifera.ecview.uisemantics.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UISemanticsGrammarAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/lunifera/ecview/uisemantics/parser/antlr/internal/InternalUISemanticsGrammar.tokens");
	}
}
