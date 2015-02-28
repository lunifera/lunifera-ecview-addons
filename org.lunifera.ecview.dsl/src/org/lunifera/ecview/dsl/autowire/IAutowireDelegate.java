package org.lunifera.ecview.dsl.autowire;

import org.lunifera.ecview.dsl.derivedstate.UiModelDerivedStateComputerx;
import org.lunifera.ecview.semantic.uimodel.UiLayout;

/**
 * Clients can implement this interface and define their own autowire
 * strategies.
 */
public interface IAutowireDelegate {

	void autowire(UiLayout uiLayout, UiModelDerivedStateComputerx computer,
			boolean mobile);

}
