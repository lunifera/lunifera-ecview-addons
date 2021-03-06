/*
 * generated by Xtext
 */
package org.lunifera.ecview.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.lunifera.ecview.dsl.ui.internal.UIGrammarActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UIGrammarExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return UIGrammarActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return UIGrammarActivator.getInstance().getInjector(UIGrammarActivator.ORG_LUNIFERA_ECVIEW_DSL_UIGRAMMAR);
	}
	
}
