package org.lunifera.ecview.vaadin.ide.mobile.preview.parts;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.lunifera.ecview.vaadin.ide.mobile.preview.Activator;

import com.google.inject.Inject;

public class ECViewMobileVaadinPreviewPart extends ViewPart {

	private static String URL = "http://localhost:8086";

	@Inject
	private ECViewMobileVaadinSynchronizer synchronizer;

	private Browser browser;

	public ECViewMobileVaadinPreviewPart() {

	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout());

		// browser = new Browser(container, SWT.NONE);
		// browser.setUrl(URL);

		getViewSite().getActionBars().getMenuManager()
				.add(new LinkWithEditorAction());
	}

	@Override
	public void setFocus() {
//		browser.setFocus();
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		synchronizer.start(site);
	}

	@Override
	public void dispose() {
		synchronizer.stop(getSite());
		super.dispose();
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
			Activator.getDefault().setLinkedWithEditor(isChecked());
		}
	}
}
