package org.lunifera.ecview.vaadin.ide.preview.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

public class ECViewVaadinPreviewPart extends ViewPart {

	private static String URL = "http://localhost:8086";

	@Inject
	private ECViewVaadinSynchronizer synchronizer;

	private Browser browser;

	public ECViewVaadinPreviewPart() {

	}

	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout());

		browser = new Browser(container, SWT.NONE);
		browser.setUrl(URL);
	}

	@Override
	public void setFocus() {
		browser.setFocus();
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
}
