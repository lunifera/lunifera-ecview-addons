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
package org.lunifera.ecview.vaadin.ide.preview;

import org.lunifera.ide.core.api.i18n.II18nRegistry;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Use this class to register components to be used within the IDE.
 */
public class IdeUiModule implements Module {

	@Override
	public void configure(Binder binder) {
		binder.bind(II18nRegistry.class).toProvider(
				org.lunifera.ide.core.ui.shared.Access.getII18nRegistry());
	}

}
