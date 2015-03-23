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
package org.lunifera.ecview.xtext.builder.participant.impl;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YDeviceType;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.xtext.builder.participant.IECViewAddonsMetadataService;
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

/**
 * Lunifera uses ECView files directly and does not derive them from the
 * UiDSL-Model. If you have interest using this feature, just provide that class
 * as an OSGi service.
 */
@Component(service = { IBuilderParticipant.class })
public class ECViewBuilderParticipant extends AbstractBuilderParticipant
		implements BundleListener {

	private static final String LUN_EC_VIEW_I18N_PROVIDER = "Lun-ECView-I18nProvider";
	@Inject
	private IMetadataBuilderService metadataBuilderService;

	private ComponentContext context;
	private ServiceRegistration<IECViewAddonsMetadataService> viewServiceRegister;
	private ViewService viewService;

	private ResourceSet resourceSet;
	private Map<String, URI> viewIdMappings;
	private Map<String, URI> ideViewIdMappings;
	private Map<String, URI> mobileViewIdMappings;

	public ECViewBuilderParticipant() {

	}

	@Activate
	protected void activate(ComponentContext context) {
		this.context = context;

		viewIdMappings = new HashMap<String, URI>();
		ideViewIdMappings = new HashMap<String, URI>();
		mobileViewIdMappings = new HashMap<String, URI>();

		resourceSet = new ResourceSetImpl();
	}

	@Deactivate
	protected void deactivate(ComponentContext context) {
		metadataBuilderService.removeFromBundleSpace(context.getBundleContext()
				.getBundle());

		viewIdMappings.clear();
		mobileViewIdMappings.clear();
		ideViewIdMappings.clear();

		for (Resource resource : new ArrayList<Resource>(
				resourceSet.getResources())) {
			resource.unload();
		}
		resourceSet.getResources().clear();
		this.context = null;
	}

	@Override
	public List<URL> getModels(Bundle suspect) {

		if (!containsHeader(suspect, LUN_EC_VIEW_I18N_PROVIDER)) {
			return Collections.emptyList();
		}

		registerECViews(suspect);

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
	 * Register transations at the ecviews registry
	 * 
	 * @param bundle
	 */
	private void registerECViews(Bundle bundle) {
		List<URL> results = internalFindURLs(bundle);

		for (URL url : results) {
			// Load the fxml-File
			Resource resource = resourceSet.getResource(
					URI.createURI(url.toString()), true);
			try {
				resource.load(null);
				YView yView = (YView) resource.getContents().get(0);
				viewIdMappings.put(yView.getViewName(), resource.getURI());

				if (yView.getDeviceType() == YDeviceType.MOBILE) {
					mobileViewIdMappings.put(yView.getViewName(),
							resource.getURI());
				} else {
					ideViewIdMappings.put(yView.getViewName(),
							resource.getURI());
				}
				resource.unload();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Unregister transations at the ecviews registry
	 * 
	 * @param bundle
	 */
	private void unregisterTranslations(Bundle bundle) {
		List<URL> results = internalFindURLs(bundle);
		for (URL url : results) {
			Resource resource = resourceSet.getResource(
					URI.createURI(url.toString()), true);
			if (resource != null) {

				YView yView = (YView) resource.getContents().get(0);

				// remove from mappings
				viewIdMappings.remove(yView.getViewName());
				mobileViewIdMappings.remove(yView.getViewName());
				ideViewIdMappings.remove(yView.getViewName());

				// unload resource and remove
				resource.unload();
				resourceSet.getResources().remove(resource);
			}
		}
	}

	/**
	 * Searches for all ECView translations in the given bundle.
	 * 
	 * @param bundle
	 * @return
	 */
	private List<URL> internalFindURLs(Bundle bundle) {
		List<URL> results = new ArrayList<URL>();
		BundleWiring wiring = bundle.adapt(BundleWiring.class);
		results.addAll(wiring.findEntries("/", "*.ecview",
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
			registerECViews(event.getBundle());
		} else if (event.getType() == BundleEvent.RESOLVED) {
			unregisterTranslations(event.getBundle());
		}
	}

	@Override
	public void notifyLifecyle(LifecycleEvent event) {
		if (event.getState() == IBuilderParticipant.LifecycleEvent.INITIALIZE) {
			initializeMetaModels();
		} else if (event.getState() == IBuilderParticipant.LifecycleEvent.ACTIVATED) {
			viewService = new ViewService();
			viewServiceRegister = context.getBundleContext().registerService(
					IECViewAddonsMetadataService.class, viewService, null);
			context.getBundleContext().addBundleListener(this);

		} else {
			// do not remove the bundle listener! Otherwise the changes will not
			// be tracked
			if (viewServiceRegister != null) {
				viewServiceRegister.unregister();
				viewServiceRegister = null;

				viewService = null;
			}
		}
	}

	protected void initializeMetaModels() {
		if (!EPackage.Registry.INSTANCE.containsKey(CoreModelPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(CoreModelPackage.eNS_URI,
					CoreModelPackage.eINSTANCE);
		}

		if (!EPackage.Registry.INSTANCE
				.containsKey(ExtensionModelPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(ExtensionModelPackage.eNS_URI,
					ExtensionModelPackage.eINSTANCE);
		}
	}

	/**
	 * Provided as an OSGi service to return ui models for the given qualified
	 * name.
	 */
	private class ViewService implements IECViewAddonsMetadataService {

		@Override
		public YView getViewMetadata(String viewName) {
			URI uri = viewIdMappings.get(viewName);
			if (uri == null) {
				return null;
			}

			Resource rs = resourceSet.getResource(uri, true);
			return (YView) EcoreUtil.copy(rs.getContents().get(0));
		}

		@Override
		public List<String> getIDEViewNames(String packageName,
				boolean includeChildren) {
			return new ArrayList<String>(ideViewIdMappings.keySet());
		}

		@Override
		public List<String> getMobileViewNames(String packageName,
				boolean includeChildren) {
			return new ArrayList<String>(mobileViewIdMappings.keySet());
		}
	}

}