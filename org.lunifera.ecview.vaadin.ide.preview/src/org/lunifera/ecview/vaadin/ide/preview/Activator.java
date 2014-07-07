package org.lunifera.ecview.vaadin.ide.preview;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;

import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.lunifera.ecview.vaadin.ide.preview.web.EcviewPreviewVaadinServlet;
import org.lunifera.ecview.vaadin.ide.preview.web.ResourceProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Activator is used by OSGi framework to notify about the start and stop of the
 * bundle. The activator will look for the HttpService and registers the vaadin
 * servlet at it.
 */
public class Activator implements BundleActivator,
		ServiceTrackerCustomizer<HttpService, HttpService>, BundleListener {

	private Set<IModelChangedListener> listeners;

	private static BundleContext context;
	private static Activator plugin;

	static BundleContext getContext() {
		return context;
	}

	// used to track the HttpService
	private ServiceTracker<HttpService, HttpService> tracker;
	// used to register servlets
	private HttpService httpService;
	private ResourceProvider resourceProvider;
	private Injector injector;
	private YView yView;

	//
	// Helper methods to get an instance of the http service
	//
	@Override
	public HttpService addingService(ServiceReference<HttpService> reference) {
		httpService = context.getService(reference);

		try {
			// register the servlet at the http service
			httpService.registerServlet("/", new EcviewPreviewVaadinServlet(),
					null, resourceProvider);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (NamespaceException e) {
			e.printStackTrace();
		}

		return httpService;
	}

	@Override
	public void removedService(ServiceReference<HttpService> reference,
			HttpService service) {
		// unregister the servlet from the http service
		httpService.unregister("/");
	}

	@Override
	public void modifiedService(ServiceReference<HttpService> reference,
			HttpService service) {

	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		plugin = this;
		listeners = new HashSet<IModelChangedListener>();

		injector = Guice.createInjector(new SharedStateModule());

		resourceProvider = new ResourceProvider();

		handleStartedBundles(context);

		// register this instance as a bundle listener to an reference to all
		// vaadin bundles. Used to find the static resources.
		bundleContext.addBundleListener(this);

		// Start a HttpService-Tracker to get an instance of HttpService
		tracker = new ServiceTracker<>(bundleContext, HttpService.class, this);
		tracker.open();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		// close the HttpService-tracker
		tracker.close();
		tracker = null;
		listeners = null;

		resourceProvider = null;

		bundleContext.removeBundleListener(this);

		Activator.context = null;
		plugin = null;
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
			if (bundle.getState() == Bundle.RESOLVED
					&& name.startsWith("com.vaadin")) {
				resourceProvider.add(bundle);
			}
		}
	}

	@Override
	public void bundleChanged(BundleEvent event) {
		// tracks the starting and stopping of vaadin bundles. If a bundle is a
		// vaadin bundle it will be added to the resource provider for lookups.
		String name = event.getBundle().getSymbolicName();
		if (name.startsWith("com.vaadin")) {
			if (event.getType() == BundleEvent.RESOLVED) {
				resourceProvider.add(event.getBundle());
			} else if (event.getType() == BundleEvent.STOPPED) {
				resourceProvider.remove(event.getBundle());
			}
		}
	}

	public static Activator getDefault() {
		return plugin;
	}

	public Injector getInjector() {
		return injector;
	}

	public Bundle getBundle() {
		return context.getBundle();
	}

	public YView getActiveView() {
		return yView;
	}

	public void setActiveView(YView yView) {
		this.yView = yView;
		notifyModelChanged();
	}

	public boolean addModelChangedListener(IModelChangedListener e) {
		return listeners.add(e);
	}

	public boolean removeModelChangedListener(IModelChangedListener e) {
		return listeners.remove(e);
	}

	private void notifyModelChanged() {
		for (IModelChangedListener e : listeners
				.toArray(new IModelChangedListener[listeners.size()])) {
			e.modelChanged();
		}
	}

}
