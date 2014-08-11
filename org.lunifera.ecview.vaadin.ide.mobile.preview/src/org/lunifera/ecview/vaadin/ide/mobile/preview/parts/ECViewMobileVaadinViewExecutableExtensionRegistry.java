/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Jan Koehnlein - Initial API and implementation
 *******************************************************************************/
package org.lunifera.ecview.vaadin.ide.mobile.preview.parts;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.lunifera.ecview.vaadin.ide.mobile.preview.Activator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * Instantiates classes specified in the plugin.xml using the Guice injector.
 *  
 * @author Jan Koehnlein - Initial contribution and API
 */
public class ECViewMobileVaadinViewExecutableExtensionRegistry extends AbstractGuiceAwareExecutableExtensionFactory{

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return Activator.getDefault().getInjector();
	}

}
