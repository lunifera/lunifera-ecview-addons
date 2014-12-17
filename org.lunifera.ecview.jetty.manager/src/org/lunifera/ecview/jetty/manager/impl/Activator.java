/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.jetty.manager.impl;

import java.io.File;
import java.io.IOException;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator is used by OSGi framework to notify about the start and stop of the
 * bundle. The activator will look for the HttpService and registers the vaadin
 * servlet at it.
 */
public class Activator implements BundleActivator {

	public static final String BUNDLE_ID = "org.lunifera.ecview.jetty.manager";

	private static BundleContext context;
	private static Activator plugin;

	static BundleContext getContext() {
		return context;
	}

	private JettyManager jettyManager;

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		plugin = this;

		// Starts the jetty server
		startJetty(bundleContext);

	}

	/**
	 * Start the jetty server.
	 * 
	 * @param bundleContext
	 * @throws InterruptedException
	 * @throws IOException
	 */
	protected void startJetty(BundleContext bundleContext)
			throws InterruptedException, IOException {

		jettyManager = new JettyManager();
		File jettyWorkDir = new File(
				bundleContext.getDataFile(""), jettyManager.getContextPath()); //$NON-NLS-1$ 
		jettyWorkDir.mkdir();
		jettyManager.start(jettyWorkDir);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		if (jettyManager != null) {
			jettyManager.stop();
			jettyManager = null;
		}

		Activator.context = null;
		plugin = null;
	}

	public static Activator getDefault() {
		return plugin;
	}
}
