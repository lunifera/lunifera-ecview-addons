/*
* generated by Xtext
*/
package org.lunifera.ecview.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class UIGrammarStandaloneSetup extends UIGrammarStandaloneSetupGenerated{

	public static void doSetup() {
		new UIGrammarStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

