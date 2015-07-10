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
