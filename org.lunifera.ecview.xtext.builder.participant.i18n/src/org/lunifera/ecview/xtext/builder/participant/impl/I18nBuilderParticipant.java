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
package org.lunifera.ecview.xtext.builder.participant.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.disposal.AbstractDisposable;
import org.lunifera.xtext.builder.metadata.services.AbstractBuilderParticipant;
import org.lunifera.xtext.builder.metadata.services.IBuilderParticipant;
import org.lunifera.xtext.builder.metadata.services.IMetadataBuilderService;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.google.inject.Inject;

@Component(service = { IBuilderParticipant.class })
public class I18nBuilderParticipant extends AbstractBuilderParticipant
		implements BundleListener {

	private static final String LUN_EC_VIEW_I18N_PROVIDER = "Lun-ECView-I18nProvider";
	@Inject
	private IMetadataBuilderService metadataBuilderService;
	@Inject
	private I18nRegistry i18nRegistry;

	private ComponentContext context;
	private ServiceRegistration<II18nService> i18nServiceRegister;
	private I18nService i18nService;

	public I18nBuilderParticipant() {

	}

	@Activate
	protected void activate(ComponentContext context) {
		this.context = context;
	}

	@Deactivate
	protected void deactivate(ComponentContext context) {
		metadataBuilderService.removeFromBundleSpace(context.getBundleContext()
				.getBundle());

		this.context = null;
	}

	@Override
	public List<URL> getModels(Bundle suspect) {

		if (!containsHeader(suspect, LUN_EC_VIEW_I18N_PROVIDER)) {
			return Collections.emptyList();
		}

		registerTranslations(suspect);

		// nothing to return
		return Collections.emptyList();
	}

	/**
	 * Returns true, if the bundle contains the header.
	 * 
	 * @param bundle
	 * @param header
	 * @return
	 */
	private boolean containsHeader(Bundle bundle, String header) {
		Dictionary<String, String> headers = bundle.getHeaders();
		Enumeration<String> keys = headers.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			if (key.equals(header)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Register transations at the i18n registry
	 * 
	 * @param bundle
	 */
	private void registerTranslations(Bundle bundle) {
		List<URL> results = internalFindURLs(bundle);
		for (URL url : results) {
			i18nRegistry.addResource(url);
		}
	}

	/**
	 * Unregister transations at the i18n registry
	 * 
	 * @param bundle
	 */
	private void unregisterTranslations(Bundle bundle) {
		List<URL> results = internalFindURLs(bundle);
		for (URL url : results) {
			i18nRegistry.removeResource(url);
		}
	}

	/**
	 * Searches for all I18n translations in the given bundle.
	 * 
	 * @param bundle
	 * @return
	 */
	private List<URL> internalFindURLs(Bundle bundle) {
		List<URL> results = new ArrayList<URL>();
		BundleWiring wiring = bundle.adapt(BundleWiring.class);
		results.addAll(wiring.findEntries("/OSGI-INF/l10n/", "*.properties",
				BundleWiring.LISTRESOURCES_RECURSE));
		results.addAll(wiring.findEntries("/i18n/", "*.properties",
				BundleWiring.LISTRESOURCES_RECURSE));

		Set<String> fragments = new HashSet<String>();
		for (Iterator<URL> iterator = results.iterator(); iterator.hasNext();) {
			URL url = iterator.next();
			URI uri = URI.createURI(url.toString());
			if (fragments.contains(uri.lastSegment())) {
				iterator.remove();
			}
			fragments.add(uri.lastSegment());
		}
		return results;
	}

	@Override
	public void bundleChanged(BundleEvent event) {
		if (event.getType() == BundleEvent.UNINSTALLED) {
			registerTranslations(event.getBundle());
		} else if (event.getType() == BundleEvent.RESOLVED) {
			unregisterTranslations(event.getBundle());
		}
	}

	@Override
	public void notifyLifecyle(LifecycleEvent event) {
		if (event.getState() == IBuilderParticipant.LifecycleEvent.INITIALIZE) {
		} else if (event.getState() == IBuilderParticipant.LifecycleEvent.ACTIVATED) {
			i18nService = new I18nService();
			i18nServiceRegister = context.getBundleContext().registerService(
					II18nService.class, i18nService, null);

			context.getBundleContext().addBundleListener(this);

		} else {
			// do not remove the bundle listener! Otherwise the changes will not
			// be tracked
			
			if (i18nServiceRegister != null) {
				i18nServiceRegister.unregister();
				i18nServiceRegister = null;

				i18nService.notifyInternalDispose();
				i18nService = null;
			}
		}
	}

	/**
	 * Provided as an OSGi service to return ui models for the given qualified
	 * name.
	 */
	private class I18nService extends AbstractDisposable implements
			II18nService {

		@Override
		public String getValue(String i18nKey, Locale locale) {
			return i18nRegistry.findTranslation(locale, i18nKey);
		}

		@Override
		public void dispose() {
			throw new UnsupportedOperationException(
					"I18nService must never be disposed from outside.");
		}

		protected void notifyInternalDispose() {
			super.dispose();
		}

		@Override
		protected void internalDispose() {

		}

	}

}
