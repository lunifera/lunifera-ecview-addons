/*
 * generated by Xtext
 */
package org.lunifera.ecview.dsl;

import org.lunifera.ecview.dsl.derivedstate.UiModelDerivedStateComputerx;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class UIGrammarRuntimeModule extends
		org.lunifera.ecview.dsl.AbstractUIGrammarRuntimeModule {

	public Class<? extends org.eclipse.xtext.resource.IDerivedStateComputer> bindIDerivedStateComputer() {
		return UiModelDerivedStateComputerx.class;
	}
}
