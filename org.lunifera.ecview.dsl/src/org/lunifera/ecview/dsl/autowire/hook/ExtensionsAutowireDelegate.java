/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.dsl.autowire.hook;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.lunifera.ecview.dsl.autowire.IAutowireDelegate;
import org.lunifera.ecview.dsl.derivedstate.UiModelDerivedStateComputerx;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Delegates autowirings to registered extensions. See extensionpoint
 * "org.lunifera.ecview.dsl.autowireDelegate"
 */
public class ExtensionsAutowireDelegate implements IAutowireDelegate {

	private static final String DEFAULT_IMPL_ID = "org.lunifera.ecview.dsl.autowireDelegate";

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ExtensionsAutowireDelegate.class);

	private static final String ATTR_ID = "id"; //$NON-NLS-1$
	private static final String ATTR_AUTOWIREHOOK = "autowireDelegateClass"; //$NON-NLS-1$
	private static final String AUTOWIRE_HOOK_EXTPT = "autowireDelegate"; //$NON-NLS-1$

	@Inject
	private Injector injector;

	private IAutowireDelegate delegate;

	@Override
	public void autowire(UiLayout uiLayout,
			UiModelDerivedStateComputerx computer, boolean mobile) {
		ensureExtention();
		if (delegate != null) {
			delegate.autowire(uiLayout, computer, mobile);
		}
	}

	private void ensureExtention() {
		if (delegate != null) {
			return;
		}

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint(
				"org.lunifera.ecview.dsl", AUTOWIRE_HOOK_EXTPT);
		if (point == null) {
			return;
		}

		IConfigurationElement bestMatch = null;
		String bestMatchId = null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] elements = extensions[i]
					.getConfigurationElements();
			for (int j = 0; j < elements.length; j++) {
				String _id = elements[j].getAttribute(ATTR_ID);
				if (bestMatchId == null) {
					bestMatchId = _id;
					bestMatch = elements[j];
					if (!bestMatchId.equals(DEFAULT_IMPL_ID)) {
						// if not the default impl, it is a better match and use
						// it
						break;
					} else {
						// wait for better match
					}
				} else {
					if (!_id.equals(DEFAULT_IMPL_ID)) {
						// if not the default impl, it is a better match and use
						// it
						bestMatchId = _id;
						bestMatch = elements[j];
						break;
					}
				}
			}
		}

		if (bestMatch != null) {
			try {
				delegate = (IAutowireDelegate) bestMatch
						.createExecutableExtension(ATTR_AUTOWIREHOOK);
				injector.injectMembers(delegate);
			} catch (CoreException e) {
				LOGGER.error("{}", e);
			}
		}
	}
}
