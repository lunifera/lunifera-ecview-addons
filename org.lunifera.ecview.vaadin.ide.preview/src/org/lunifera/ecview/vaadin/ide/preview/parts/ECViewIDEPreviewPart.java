package org.lunifera.ecview.vaadin.ide.preview.parts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PreDestroy;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.internal.browser.BrowserViewer;
import org.eclipse.ui.internal.browser.IBrowserViewerContainer;
import org.eclipse.ui.internal.browser.WebBrowserUtil;
import org.eclipse.ui.internal.browser.WebBrowserViewDropAdapter;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.part.ViewPart;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.editpart.IExposedActionEditpart;
import org.lunifera.ecview.vaadin.ide.preview.Activator;

import com.google.inject.Inject;

/**
 * Parts copied from org.eclipse.ui.internal.browser.WebBrowserView
 */
@SuppressWarnings("restriction")
public class ECViewIDEPreviewPart extends ViewPart implements
		IBrowserViewerContainer, ISetSelectionTarget, IUiRenderedListener {

	private static String URL = "http://localhost:8099/idepreview";

	protected BrowserViewer viewer;
	protected ISelectionListener listener;

	@Inject
	private ECViewVaadinSynchronizer synchronizer;

	private Set<Action> exposedActions = new HashSet<Action>();

	public ECViewIDEPreviewPart() {

	}

	public void createPartControl(Composite parent) {
		int style = WebBrowserUtil.decodeStyle(getViewSite().getSecondaryId());
		viewer = new BrowserViewer(parent, style);
		viewer.setContainer(this);
		viewer.setURL(URL);

		getViewSite().getActionBars().getMenuManager()
				.add(new LinkWithEditorAction());
		getViewSite().getActionBars().getMenuManager()
				.add(new ShowLayoutBoundsAction());

		/*
		 * PropertyChangeListener propertyChangeListener = new
		 * PropertyChangeListener() { public void
		 * propertyChange(PropertyChangeEvent event) { if
		 * (BrowserViewer.PROPERTY_TITLE.equals(event.getPropertyName())) {
		 * setPartName((String) event.getNewValue()); } } };
		 * viewer.addPropertyChangeListener(propertyChangeListener);
		 */
		initDragAndDrop();
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		synchronizer.start(site);
		Activator.getIDEPreviewHandler().setPart(this);
	}

	@PreDestroy
	public void predestroy() {
		viewer.setURL("blank");
	}

	public void dispose() {
		Activator.getIDEPreviewHandler().setPart(null);
		synchronizer.stop(getSite());

		if (viewer != null)
			viewer.setContainer(null);

		if (listener != null)
			removeSelectionListener();

		super.dispose();
	}

	public void setURL(String url) {
		if (viewer != null)
			viewer.setURL(url);
	}

	public void setFocus() {
		viewer.setFocus();
	}

	public boolean close() {
		try {
			viewer.setURL("blank");
			getSite().getPage().hideView(this);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public IActionBars getActionBars() {
		return getViewSite().getActionBars();
	}

	public void openInExternalBrowser(String url) {
		try {
			URL theURL = new URL(url);
			IWorkbenchBrowserSupport support = PlatformUI.getWorkbench()
					.getBrowserSupport();
			support.getExternalBrowser().openURL(theURL);
		} catch (MalformedURLException e) {
		} catch (PartInitException e) {
		}
	}

	public void addSelectionListener() {
		if (listener != null)
			return;

		listener = new ISelectionListener() {
			public void selectionChanged(IWorkbenchPart part,
					ISelection selection) {
				onSelectionChange(selection);
			}
		};
		getSite().getWorkbenchWindow().getSelectionService()
				.addPostSelectionListener(listener);
	}

	private void onSelectionChange(ISelection selection) {
		if (!(selection instanceof IStructuredSelection))
			return;
		IStructuredSelection sel = (IStructuredSelection) selection;
		Object obj = sel.getFirstElement();
		if (obj instanceof IAdaptable) {
			IAdaptable adapt = (IAdaptable) obj;
			URL url = getURLFromAdaptable(adapt);
			if (url != null)
				setURL(url.toExternalForm());
		}
	}

	private URL getURLFromAdaptable(IAdaptable adapt) {
		// test for path
		IPath path = (IPath) adapt.getAdapter(IPath.class);
		if (path != null) {
			File file = path.toFile();
			if (file.exists() && isWebFile(file.getName()))
				try {
					return file.toURI().toURL();
				} catch (MalformedURLException e) {
					return null;
				}
		}
		return (URL) adapt.getAdapter(URL.class);
	}

	public void removeSelectionListener() {
		if (listener == null)
			return;
		getSite().getWorkbenchWindow().getSelectionService()
				.removePostSelectionListener(listener);
		listener = null;
	}

	/**
	 * Return true if the filename has a "web" extension.
	 * 
	 * @param name
	 * @return
	 */
	protected boolean isWebFile(String name) {
		return name.endsWith("html") || name.endsWith("htm") || name.endsWith("gif") || //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				name.endsWith("jpg"); //$NON-NLS-1$
	}

	/**
	 * Adds drag and drop support to the view.
	 */
	protected void initDragAndDrop() {
		Transfer[] transfers = new Transfer[] {
		// LocalSelectionTransfer.getInstance(),
		// ResourceTransfer.getInstance(),
		FileTransfer.getInstance() };

		DropTarget dropTarget = new DropTarget(viewer, DND.DROP_COPY
				| DND.DROP_DEFAULT);
		dropTarget.setTransfer(transfers);
		dropTarget.addDropListener(new CustomWebBrowserViewDropAdapter(viewer));
	}

	public void selectReveal(ISelection selection) {
		onSelectionChange(selection);
	}

	public void setBrowserViewName(String name) {
		setPartName(name);
	}

	public void setBrowserViewTooltip(String tip) {
		setTitleToolTip(tip);
	}

	public void notifyNewViewRendered(final IViewContext context) {
		viewer.getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				// remove old actions
				for (Action action : exposedActions) {
					getViewSite().getActionBars().getToolBarManager()
							.remove(action.getId());
				}
				exposedActions.clear();

				// add the new exposed actions
				for (IExposedActionEditpart exposedAction : context
						.getExposedActions()) {
					
					// get the path of the icon
					String theme = Activator.getIDEPreviewHandler().getThemeName();
					String iconPath = String.format("VAADIN/themes/%s/%s", theme, exposedAction.getIconName());
					URL iconURL = Activator.getDefault().findResource(iconPath);
					
					Action action = null;
					if (exposedAction.getId().equals(
							"org.lunifera.actions.load")) {
						action = new ExposedLoadAction(exposedAction.getId(),exposedAction
								.getDescription(), exposedAction.getIconName(), iconURL);
					} else if (exposedAction.getId().equals(
							"org.lunifera.actions.save")) {
						action = new ExposedSaveAction(exposedAction.getId(),exposedAction
								.getDescription(), exposedAction.getIconName(), iconURL);
					} else if (exposedAction.getId().equals(
							"org.lunifera.actions.delete")) {
						action = new ExposedDeleteAction(exposedAction.getId(),exposedAction
								.getDescription(), exposedAction.getIconName(), iconURL);
					} else if (exposedAction.getId().equals(
							"org.lunifera.actions.find")) {
						action = new ExposedFindAction(exposedAction.getId(),exposedAction
								.getDescription(), exposedAction.getIconName(), iconURL);
					} else if (exposedAction.getId().equals(
							"org.lunifera.actions.create")) {
						action = new ExposedCreateAction(exposedAction.getId(),exposedAction
								.getDescription(), exposedAction.getIconName(), iconURL);
					} else {
						action = new ExposedNullAction(exposedAction.getId(),exposedAction
								.getDescription(), exposedAction.getIconName(), iconURL);
					}
					
					if (action != null) {
						exposedActions.add(action);
						getViewSite().getActionBars().getToolBarManager()
								.add(action);
					}
				}
				getViewSite().getActionBars().updateActionBars();
			}
		});
	}

	private static class CustomWebBrowserViewDropAdapter extends
			WebBrowserViewDropAdapter {

		protected CustomWebBrowserViewDropAdapter(BrowserViewer view) {
			super(view);
		}
	}

	private class LinkWithEditorAction extends Action {

		public LinkWithEditorAction() {
			setText("Link with editor");
			setDescription("Links the selection in preview UI with the associated grammar element.");
			setToolTipText("Links the selection in preview UI with the associated grammar element.");
			setImageDescriptor(Activator.imageDescriptorFromPlugin(
					Activator.BUNDLE_ID, "/icons/synced.gif"));
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {
			Activator.getIDEPreviewHandler().setLinkedWithEditor(isChecked());
		}
	}

	private class ShowLayoutBoundsAction extends Action {

		public ShowLayoutBoundsAction() {
			setText("Show layout bounds");
			setImageDescriptor(Activator.imageDescriptorFromPlugin(
					Activator.BUNDLE_ID, "/icons/bounds.png"));
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {
			Activator.getIDEPreviewHandler().setShowLayoutBounds(isChecked());
		}
	}

	private class ExposedLoadAction extends Action {

		public ExposedLoadAction(String id, String text, String icon, URL iconURL) {
			super(text, IAction.AS_PUSH_BUTTON);
			setId(id);
			if(iconURL != null){
				setImageDescriptor(ImageDescriptor.createFromURL(iconURL));
			}else{
				setImageDescriptor(Activator.imageDescriptorFromPlugin(
						Activator.BUNDLE_ID, "icons/load.gif"));
			}
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {

		}
	}

	private class ExposedSaveAction extends Action {

		public ExposedSaveAction(String id, String text, String icon, URL iconURL) {
			super(text, IAction.AS_PUSH_BUTTON);
			setId(id);
			if(iconURL != null){
				setImageDescriptor(ImageDescriptor.createFromURL(iconURL));
			}else{
				setImageDescriptor(Activator.imageDescriptorFromPlugin(
						Activator.BUNDLE_ID, "icons/save.gif"));
			}
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {

		}
	}

	private class ExposedDeleteAction extends Action {

		public ExposedDeleteAction(String id, String text, String icon, URL iconURL) {
			super(text, IAction.AS_PUSH_BUTTON);
			setId(id);
			if(iconURL != null){
				setImageDescriptor(ImageDescriptor.createFromURL(iconURL));
			}else{
				setImageDescriptor(Activator.imageDescriptorFromPlugin(
						Activator.BUNDLE_ID, "icons/trash.gif"));
			}
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {

		}
	}

	private class ExposedFindAction extends Action {

		public ExposedFindAction(String id, String text, String icon, URL iconURL) {
			super(text, IAction.AS_PUSH_BUTTON);
			setId(id);
			if(iconURL != null){
				setImageDescriptor(ImageDescriptor.createFromURL(iconURL));
			}else{
				setImageDescriptor(Activator.imageDescriptorFromPlugin(
						Activator.BUNDLE_ID, "icons/search.gif"));
			}
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {

		}
	}

	private class ExposedCreateAction extends Action {

		public ExposedCreateAction(String id, String text, String icon, URL iconURL) {
			super(text, IAction.AS_PUSH_BUTTON);
			setId(id);
			if(iconURL != null){
				setImageDescriptor(ImageDescriptor.createFromURL(iconURL));
			}else{
				setImageDescriptor(Activator.imageDescriptorFromPlugin(
						Activator.BUNDLE_ID, "icons/new.gif"));
			}
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {

		}
	}
	
	private class ExposedNullAction extends Action {

		public ExposedNullAction(String id, String text, String icon, URL iconURL) {
			super(text, IAction.AS_PUSH_BUTTON);
			setId(id);
			if(iconURL != null){
				setImageDescriptor(ImageDescriptor.createFromURL(iconURL));
			}
			setChecked(false);
			setEnabled(true);
		}

		@Override
		public void run() {

		}
	}

}
