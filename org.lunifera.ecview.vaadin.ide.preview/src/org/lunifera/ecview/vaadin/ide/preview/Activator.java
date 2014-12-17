package org.lunifera.ecview.vaadin.ide.preview;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.equinox.http.jetty.JettyConstants;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.lunifera.ecview.vaadin.ide.preview.jetty.PreviewJettyManager;
import org.lunifera.ecview.vaadin.ide.preview.parts.ECViewVaadinSynchronizer;
import org.lunifera.ecview.vaadin.ide.preview.parts.IDEPreviewHandler;
import org.lunifera.ecview.vaadin.ide.preview.parts.MobilePreviewHandler;
import org.lunifera.ecview.vaadin.ide.preview.web.EcviewMobilePreviewVaadinServlet;
import org.lunifera.ecview.vaadin.ide.preview.web.EcviewPreviewVaadinServlet;
import org.lunifera.ecview.vaadin.ide.preview.web.ResourceProvider;
import org.lunifera.xtext.builder.ui.access.IXtextUtilService;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.osgi.util.tracker.ServiceTracker;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;

/**
 * Activator is used by OSGi framework to notify about the start and stop of the
 * bundle. The activator will look for the HttpService and registers the vaadin
 * servlet at it.
 */
public class Activator extends AbstractUIPlugin implements BundleListener {

	final String PROPERTY_PREFIX = "org.eclipse.equinox.http.jetty."; //$NON-NLS-1$
	public static final String BUNDLE_ID = "org.lunifera.ecview.vaadin.ide.preview";

	private static BundleContext context;
	private static Activator plugin;

	static BundleContext getContext() {
		return context;
	}

	private Provider<IWorkspace> workspaceProvider;

	// track the XtextUtilService
	private ServiceTracker<IXtextUtilService, IXtextUtilService> xtextUtilServiceTracker;

	// used to register servlets
	private ResourceProvider resourceProvider;

	// xtext and vaadin preview
	private IXtextUtilService xtextUtilService;
	private Injector injector;

	// http services
	private PreviewJettyManager jettyManager;
	private ServiceTracker<HttpService, HttpService> ideTracker;
	private ServiceTracker<HttpService, HttpService> mobileTracker;

	// data exchange handler
	private IDEPreviewHandler idePreviewHandler;
	private MobilePreviewHandler mobilePreviewHandler;

	// I18n properties
	private Map<String, Properties> i18nProperties = new HashMap<String, Properties>();

	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);

		Activator.context = bundleContext;
		plugin = this;

		idePreviewHandler = new IDEPreviewHandler();
		mobilePreviewHandler = new MobilePreviewHandler();

		// // Starts the jetty server
		// startJetty();

		startJetty(bundleContext);

		resourceProvider = new ResourceProvider();

		handleStartedBundles(context);

		Module mergedModule = Modules2.mixin(new SharedStateModule(), new IdeUiModule());
		injector = Guice.createInjector(mergedModule);
		workspaceProvider = injector.getProvider(IWorkspace.class);

		// register this instance as a bundle listener to an reference to all
		// vaadin bundles. Used to find the static resources.
		bundleContext.addBundleListener(this);

		xtextUtilServiceTracker = new ServiceTracker<IXtextUtilService, IXtextUtilService>(
				bundleContext, IXtextUtilService.class, null);
		xtextUtilServiceTracker.open();
		xtextUtilService = xtextUtilServiceTracker.waitForService(5000);

		registerIDEPreview(bundleContext);
		registerMobilePreview(bundleContext);
	}

	public IWorkspace getWorkspace() {
		return workspaceProvider.get();
	}

	/**
	 * Registers the ide preview.
	 * 
	 * @param bundleContext
	 * @throws InvalidSyntaxException
	 * @throws InterruptedException
	 */
	protected void registerIDEPreview(BundleContext bundleContext)
			throws InvalidSyntaxException, InterruptedException {
		// Start a HttpService-Tracker to get an instance of HttpService
		String filter = String.format("(&(objectClass=%s)(%s=%s))",
				HttpService.class.getName(), JettyConstants.OTHER_INFO,
				PreviewJettyManager.PROP_IDEPREVIEW);
		ideTracker = new ServiceTracker<HttpService, HttpService>(
				bundleContext, bundleContext.createFilter(filter), null);
		ideTracker.open();
		HttpService ideService = ideTracker.waitForService(5000);
		if (ideService != null) {
			try {
				// register the servlet at the http service
				ideService.registerServlet("/",
						new EcviewPreviewVaadinServlet(), null,
						resourceProvider);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (NamespaceException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Registers the mobile preview.
	 * 
	 * @param bundleContext
	 * @throws InvalidSyntaxException
	 * @throws InterruptedException
	 */
	protected void registerMobilePreview(BundleContext bundleContext)
			throws InvalidSyntaxException, InterruptedException {
		// Start a HttpService-Tracker to get an instance of HttpService
		String filter = String.format("(&(objectClass=%s)(%s=%s))",
				HttpService.class.getName(), JettyConstants.OTHER_INFO,
				PreviewJettyManager.PROP_MOBILEPREVIEW);
		mobileTracker = new ServiceTracker<HttpService, HttpService>(
				bundleContext, bundleContext.createFilter(filter), null);
		mobileTracker.open();
		HttpService service = mobileTracker.waitForService(5000);
		if (service != null) {
			try {
				// register the servlet at the http service
				service.registerServlet("/",
						new EcviewMobilePreviewVaadinServlet(), null,
						resourceProvider);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (NamespaceException e) {
				e.printStackTrace();
			}
		}
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

		File jettyWorkDir = new File(
				bundleContext.getDataFile(""), "vaadinpreview"); //$NON-NLS-1$ 
		jettyWorkDir.mkdir();
		jettyManager = new PreviewJettyManager(jettyWorkDir);
		jettyManager.start();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		resourceProvider = null;

		idePreviewHandler.dispose();
		mobilePreviewHandler.dispose();
		idePreviewHandler = null;
		mobilePreviewHandler = null;

		ideTracker.close();
		mobileTracker.close();

		if (jettyManager != null) {
			jettyManager.stop();
			jettyManager = null;
		}

		bundleContext.removeBundleListener(this);

		Activator.context = null;
		plugin = null;

		super.stop(bundleContext);
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
			if (name.startsWith("com.vaadin") || name.contains("widgetset")) {
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

	@Override
	public void bundleChanged(BundleEvent event) {
		// tracks the starting and stopping of vaadin bundles. If a bundle is a
		// vaadin bundle it will be added to the resource provider for lookups.
		String name = event.getBundle().getSymbolicName();
		if (name.startsWith("com.vaadin") || name.contains("widgetset")) {
			if (event.getType() != BundleEvent.STOPPED) {
				resourceProvider.add(event.getBundle());
			} else if (event.getType() == BundleEvent.STOPPED) {
				resourceProvider.remove(event.getBundle());
			}
		}
	}

	/**
	 * Returns the handler for ide.
	 * 
	 * @return
	 */
	public static IDEPreviewHandler getIDEPreviewHandler() {
		return plugin.idePreviewHandler;
	}

	/**
	 * Returns the handler for mobile.
	 * 
	 * @return
	 */
	public static MobilePreviewHandler getMobilePreviewHandler() {
		return plugin.mobilePreviewHandler;
	}

	public static Activator getDefault() {
		return plugin;
	}

	public IXtextUtilService getXtextUtilService() {
		return xtextUtilService;
	}

	public Injector getInjector() {
		return injector;
	}

	/**
	 * Tries to find the resource traversing all projects contained in the
	 * workspace.
	 * 
	 * @param uri
	 * @return
	 */
	public URL findResource(String uri) {
		IWorkspace ws = workspaceProvider.get();
		for (IProject project : ws.getRoot().getProjects()) {
			IResource resource = project.findMember(uri);
			if (resource != null) {
				try {
					return resource.getLocationURI().toURL();
				} catch (MalformedURLException e) {
				}
			}
		}
		return null;
	}
	
//	public void setSynchronizer(
//			ECViewVaadinSynchronizer ecViewVaadinSynchronizer) {
//		idePreviewHandler.setSynchronizer(ecViewVaadinSynchronizer);
//		mobilePreviewHandler.setSynchronizer(ecViewVaadinSynchronizer);
//	}

}
