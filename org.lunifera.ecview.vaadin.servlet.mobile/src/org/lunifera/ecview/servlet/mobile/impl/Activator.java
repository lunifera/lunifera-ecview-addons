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
package org.lunifera.ecview.servlet.mobile.impl;

import org.lunifera.ecview.servlet.mobile.IMobileUiParticipant;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator, BundleListener {

	public static final String BUNDLE_HEADER__MOBILE_RESOURCES = "lunifera-mobile-resources";

	public static final String BUNDLE_ID = "org.lunifera.ecview.servlet.mobile";

	private static BundleContext context;
	private static Activator plugin;

	static BundleContext getContext() {
		return context;
	}

	public static Activator getDefault() {
		return plugin;
	}

	private ResourceProvider resourceProvider;
	private ServiceTracker<IMobileUiParticipant, IMobileUiParticipant> participantTracker;

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		plugin = this;

		resourceProvider = new ResourceProvider();
		handleStartedBundles(context);
		bundleContext.addBundleListener(this);

		participantTracker = new ServiceTracker<IMobileUiParticipant, IMobileUiParticipant>(
				context, IMobileUiParticipant.class, null);
		participantTracker.open();
	}

	/**
	 * Tries to find proper started bundles and adds them to resource provider.
	 * Since bundle changed listener will not find them.
	 * 
	 * @param context
	 */
	protected void handleStartedBundles(BundleContext context) {
		for (Bundle bundle : context.getBundles()) {
			String name = bundle.getSymbolicName();
			if (isValidBundle(bundle)) {
				resourceProvider.add(bundle);
			} else if (bundle.getState() == Bundle.RESOLVED
					&& name.equals("org.eclipse.equinox.http.jetty")) {
				try {
					bundle.start();
				} catch (BundleException e) {
				}
			}
		}
	}

	protected boolean isValidBundle(Bundle bundle) {
		String name = bundle.getSymbolicName();
		if (name.startsWith("com.vaadin")) {
			return true;
		} else if (bundle.getHeaders(BUNDLE_HEADER__MOBILE_RESOURCES) != null) {
			return true;
		}
		return false;
	}

	@Override
	public void bundleChanged(BundleEvent event) {
		// tracks the starting and stopping of vaadin bundles. If a bundle is a
		// vaadin bundle it will be added to the resource provider for lookups.
		String name = event.getBundle().getSymbolicName();
		if (name.startsWith("com.vaadin")) {
			if (event.getType() != BundleEvent.STOPPED) {
				resourceProvider.add(event.getBundle());
			} else if (event.getType() == BundleEvent.STOPPED) {
				resourceProvider.remove(event.getBundle());
			}
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {

		if (participantTracker != null) {
			participantTracker.close();
			participantTracker = null;
		}

		bundleContext.removeBundleListener(this);

		Activator.context = null;
		plugin = null;
	}

	/**
	 * Returns the participant service to create new handles.
	 * 
	 * @return
	 */
	public IMobileUiParticipant getParticipant() {
		if (participantTracker != null) {
			return participantTracker.getService();
		}
		return null;
	}

}
