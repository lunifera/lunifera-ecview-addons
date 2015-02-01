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

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.xtext.builder.participant.IECViewAddonsMetadataService;
import org.lunifera.xtext.builder.metadata.services.AbstractBuilderParticipant;
import org.lunifera.xtext.builder.metadata.services.IBuilderParticipant;
import org.lunifera.xtext.builder.metadata.services.IMetadataBuilderService;
import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.google.inject.Inject;

@Component(service = { IBuilderParticipant.class })
public class LuniferaDslsBuilderParticipant extends AbstractBuilderParticipant {

	@Inject
	private IMetadataBuilderService metadataBuilderService;

	private ComponentContext context;
	private ServiceRegistration<IECViewAddonsMetadataService> datatypesServiceRegister;

	public LuniferaDslsBuilderParticipant() {

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

		List<URL> results = new ArrayList<URL>();
		BundleWiring wiring = suspect.adapt(BundleWiring.class);
		suspect.getState();
		if (wiring == null) {
			System.out
					.println("---------------- wiring is null --------------------------");
		}
		results.addAll(wiring.findEntries("/", "*.uimodel",
				BundleWiring.LISTRESOURCES_RECURSE));
		results.addAll(wiring.findEntries("/", "*.uisemantics",
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
	public void notifyLifecyle(LifecycleEvent event) {
		if (event.getState() == IBuilderParticipant.LifecycleEvent.INITIALIZE) {
			initialize();
		} else if (event.getState() == IBuilderParticipant.LifecycleEvent.ACTIVATED) {
			ViewService datatypesService = new ViewService();
			datatypesServiceRegister = context.getBundleContext()
					.registerService(IECViewAddonsMetadataService.class,
							datatypesService, null);

		} else {
			if (datatypesServiceRegister != null) {
				datatypesServiceRegister.unregister();
				datatypesServiceRegister = null;
			}

			if (metadataBuilderService != null) {
				metadataBuilderService.removeFromBundleSpace(context
						.getBundleContext().getBundle());
			}
		}
	}

	private void initialize() {
		StandaloneGrammarsSetup.setup();
		metadataBuilderService.addToBundleSpace(context.getBundleContext()
				.getBundle());
	}

	/**
	 * Provided as an OSGi service to return ui models for the given qualified
	 * name.
	 */
	private class ViewService implements IECViewAddonsMetadataService {

		@Override
		public YView getViewMetadata(String modelName) {
			UiView uiView = (UiView) metadataBuilderService.getMetadata(
					modelName, UiModelPackage.Literals.UI_IDE_VIEW);
			if (uiView == null) {
				// also try mobile view
				uiView = (UiView) metadataBuilderService.getMetadata(modelName,
						UiModelPackage.Literals.UI_MOBILE_VIEW);
				if (uiView == null) {
					return null;
				}
			}

			return (YView) EcoreUtil.copy(uiView.eResource().getContents()
					.get(1));
		}

		@Override
		public YViewSet getViewSetMetadata(String modelName) {
			return (YViewSet) metadataBuilderService.getMetadata(modelName,
					CoreModelPackage.Literals.YVIEW_SET);
		}

		@Override
		public List<String> getIDEViewPackages() {
			List<String> packages = getAllPackages(UiModelPackage.Literals.UI_IDE_VIEW);
			return packages;
		}

		@Override
		public List<String> getMobileViewPackages() {
			List<String> packages = getAllPackages(UiModelPackage.Literals.UI_MOBILE_VIEW);
			return packages;
		}

		private List<String> getAllPackages(EClass type) {
			List<String> packages = new ArrayList<String>(5);
			for (IEObjectDescription desc : metadataBuilderService
					.getAllDescriptions(type)) {
				String pkg = desc.getQualifiedName().skipLast(1).toString();
				if (!packages.contains(pkg)) {
					packages.add(pkg);
				}
			}
			return packages;
		}
	}

}
