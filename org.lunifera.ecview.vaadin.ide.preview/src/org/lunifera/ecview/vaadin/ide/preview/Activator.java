package org.lunifera.ecview.vaadin.ide.preview;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import javax.servlet.ServletException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.equinox.http.jetty.JettyConstants;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.lunifera.ecview.vaadin.ide.preview.jetty.JettyManager;
import org.lunifera.ecview.vaadin.ide.preview.parts.ECViewVaadinSynchronizer;
import org.lunifera.ecview.vaadin.ide.preview.web.EcviewPreviewUI;
import org.lunifera.ecview.vaadin.ide.preview.web.EcviewPreviewVaadinServlet;
import org.lunifera.ecview.vaadin.ide.preview.web.ResourceProvider;
import org.lunifera.xtext.builder.ui.access.IXtextUtilService;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleListener;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.vaadin.ui.UI;

/**
 * Activator is used by OSGi framework to notify about the start and stop of the
 * bundle. The activator will look for the HttpService and registers the vaadin
 * servlet at it.
 */
public class Activator extends AbstractUIPlugin implements
		ServiceTrackerCustomizer<HttpService, HttpService>, BundleListener {

	final String PROPERTY_PREFIX = "org.eclipse.equinox.http.jetty."; //$NON-NLS-1$
	private static final String TYPE_IDE = "IDE";
	private static final String LUNIFERA_VAADIN_PREVIEW = "lunifera.vaadin.preview.ide";
	public static final String BUNDLE_ID = "org.lunifera.ecview.vaadin.ide.preview";

	private static BundleContext context;
	private static Activator plugin;

	static BundleContext getContext() {
		return context;
	}

	private Provider<IWorkspace> workspaceProvider;

	// used to track the HttpService
	private ServiceTracker<HttpService, HttpService> ideHttpServiceTracker;
	// track the XtextUtilService
	private ServiceTracker<IXtextUtilService, IXtextUtilService> xtextUtilServiceTracker;

	// used to register servlets
	private HttpService httpService;
	private ResourceProvider resourceProvider;

	// xtext and vaadin preview
	private YView yView;
	private IXtextUtilService xtextUtilService;
	private Injector injector;
	private ECViewVaadinSynchronizer synchronizer;
	private EcviewPreviewUI ui;

	private boolean linkedWithEditor;

	private JettyManager jettyManager;

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
		super.start(bundleContext);

		Activator.context = bundleContext;
		plugin = this;

		// // Starts the jetty server
		// startJetty();

		startJetty(bundleContext);

		resourceProvider = new ResourceProvider();

		handleStartedBundles(context);

		injector = Guice.createInjector(new SharedStateModule());
		workspaceProvider = injector.getProvider(IWorkspace.class);

		// register this instance as a bundle listener to an reference to all
		// vaadin bundles. Used to find the static resources.
		bundleContext.addBundleListener(this);

		xtextUtilServiceTracker = new ServiceTracker<IXtextUtilService, IXtextUtilService>(
				bundleContext, IXtextUtilService.class, null);
		xtextUtilServiceTracker.open();
		xtextUtilService = xtextUtilServiceTracker.waitForService(5000);

		// // Start a HttpService-Tracker to get an instance of HttpService
		String filter = String.format("(&(objectClass=%s)(%s=%s))",
				HttpService.class.getName(), JettyConstants.HTTP_PORT, 8099);
		ideHttpServiceTracker = new ServiceTracker<HttpService, HttpService>(
				bundleContext, bundleContext.createFilter(filter), this);
		ideHttpServiceTracker.open();
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

		Hashtable<String, Object> jettyProps = new Hashtable<String, Object>();
		jettyProps.put(Constants.SERVICE_PID, TYPE_IDE);
		jettyProps.put(JettyConstants.HTTP_PORT, 8099);
		jettyProps.put(JettyConstants.HTTP_ENABLED, Boolean.TRUE);
		jettyProps.put(JettyConstants.OTHER_INFO, LUNIFERA_VAADIN_PREVIEW);

		File jettyWorkDir = new File(
				bundleContext.getDataFile(""), "idepreview"); //$NON-NLS-1$ 
		jettyWorkDir.mkdir();
		jettyManager = new JettyManager(jettyWorkDir);
		jettyManager.start(jettyProps);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		// close the HttpService-tracker
		ideHttpServiceTracker.close();
		ideHttpServiceTracker = null;
		resourceProvider = null;

		if (jettyManager != null) {
			jettyManager.stop();
			jettyManager = null;
		}

		// close vaadin UI
		if (ui != null) {
			final UI temp = ui;
			ui.access(new Runnable() {
				@Override
				public void run() {
					temp.close();
				}
			});
		}
		ui = null;

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
			if (name.startsWith("com.vaadin")
					|| name.equals("org.lunifera.mobile.vaadin.widgetset")) {
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

	// /**
	// * Starts the jetty server.
	// *
	// * @param context
	// */
	// private void startJetty() {
	// for (Bundle bundle : context.getBundles()) {
	// String name = bundle.getSymbolicName();
	// if (name.equals("org.eclipse.equinox.http.jetty")) {
	// try {
	// bundle.start();
	// } catch (BundleException e) {
	// }
	// }
	// }
	// }

	@Override
	public void bundleChanged(BundleEvent event) {
		// tracks the starting and stopping of vaadin bundles. If a bundle is a
		// vaadin bundle it will be added to the resource provider for lookups.
		String name = event.getBundle().getSymbolicName();
		if (name.startsWith("com.vaadin")
				|| name.equals("org.lunifera.mobile.vaadin.widgetset")) {
			if (event.getType() != BundleEvent.STOPPED) {
				resourceProvider.add(event.getBundle());
			} else if (event.getType() == BundleEvent.STOPPED) {
				resourceProvider.remove(event.getBundle());
			}
		}
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

	public synchronized YView getActiveView() {
		return yView;
	}

	public synchronized void setActiveViewFromXtextEditor(YView yView) {
		this.yView = yView;
		notifyModelChanged();
	}

	/**
	 * Sets the current preview ui.
	 * 
	 * @param ui
	 * @return false, if an UI is already used.
	 */
	public synchronized boolean setPreviewUI(EcviewPreviewUI ui) {
		if (ui == null) {
			return false;
		}
		if (this.ui != null && !this.ui.isClosing() && this.ui.isAttached()) {
			ui.error("A preview UI is already active. Only one allowed!");
			return false;
		}
		this.ui = ui;
		return true;
	}

	private synchronized void notifyModelChanged() {
		if (ui != null) {
			ui.modelChanged();
		}
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

	public synchronized void setSynchronizer(
			ECViewVaadinSynchronizer synchronizer) {
		this.synchronizer = synchronizer;
	}

	/**
	 * Is called to select the given eObject in the Xtext editor
	 * 
	 * @param eObject
	 */
	public synchronized void selectInXtextEditor(EObject eObject) {
		if (synchronizer != null) {
			synchronizer.selectInXtextEditor(eObject);
		}
	}

	/**
	 * True, if the UI selection should be linked with the editor.
	 * 
	 * @param linkedWithEditor
	 */
	public synchronized void setLinkedWithEditor(boolean linkedWithEditor) {
		this.linkedWithEditor = linkedWithEditor;

		// reload the ui
		if (ui != null) {
			ui.modelChanged();
		}
	}

	/**
	 * Returns true, if the grammar editor should be linked with the vaadin UI.
	 * 
	 * @return
	 */
	public synchronized boolean isLinkedWithEditor() {
		return linkedWithEditor;
	}

	/**
	 * Is called to select the given eObject in the Xtext editor
	 * 
	 * @param textSelection
	 * @param viewer
	 */
	public synchronized void selectInVaadinPreview(
			final ITextSelection selection, final IXtextDocument document) {
		if (ui == null) {
			return;
		}

		// EObject grammarCandiate = document
		// .readOnly(new IUnitOfWork<EObject, XtextResource>() {
		// public EObject exec(XtextResource resource)
		// throws Exception {
		// IParseResult parseResult = resource.getParseResult();
		// if (parseResult == null) {
		// return null;
		// }
		// ICompositeNode rootNode = parseResult.getRootNode();
		// int offset = selection.getOffset();
		// ILeafNode node = NodeModelUtils.findLeafNodeAtOffset(
		// rootNode, offset);
		// return NodeModelUtils.findActualSemanticObjectFor(node);
		// }
		// });

		// EObject selected = null;
		// IWidgetAssocationsService service = viewContext
		// .getService(IWidgetAssocationsService.ID);
		// for(Object model : service.getModelElements()){
		// EObject grammarElement = UiModelUtil.getUiGrammarElement((EObject)
		// model);
		// if(grammarElement == grammarCandiate){
		// selected = (EObject) model;
		// break;
		// }
		// }
		//
		// notifySelectWidget(selected);
	}

}
