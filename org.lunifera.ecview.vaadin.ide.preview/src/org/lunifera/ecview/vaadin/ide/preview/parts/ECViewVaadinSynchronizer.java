/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Jan Koehnlein - Initial API and implementation
 *******************************************************************************/
package org.lunifera.ecview.vaadin.ide.preview.parts;

import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.vaadin.ide.preview.Activator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Synchronizes the railroad diagram view with the active editor.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
@Singleton
public class ECViewVaadinSynchronizer implements IPartListener,
		IXtextModelListener {

	@Inject
	private ECViewVaadinPreviewPart view;

	private IXtextDocument lastActiveDocument;
	private XtextEditor lastActiveEditor;

	public void start(IWorkbenchPartSite site) {
		updateView(site.getPage().getActiveEditor());
		site.getWorkbenchWindow().getPartService().addPartListener(this);
	}

	public void stop(IWorkbenchPartSite site) {
		site.getWorkbenchWindow().getPartService().removePartListener(this);
		lastActiveDocument = null;
		lastActiveEditor = null;
	}

	public void partActivated(IWorkbenchPart part) {
		updateView(part);
	}

	private void updateView(IWorkbenchPart part) {
		if (part instanceof XtextEditor) {
			XtextEditor xtextEditor = (XtextEditor) part;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			if (xtextDocument != lastActiveDocument) {
				if (lastActiveDocument != null) {
					lastActiveDocument.removeModelListener(this);
				}
				lastActiveDocument = xtextDocument;
				lastActiveEditor = xtextEditor;
				lastActiveDocument.addModelListener(this);
			}
		}
	}

	public void partBroughtToTop(IWorkbenchPart part) {
	}

	public void partClosed(IWorkbenchPart part) {
	}

	public void partDeactivated(IWorkbenchPart part) {
	}

	public void partOpened(IWorkbenchPart part) {
	}

	public void modelChanged(XtextResource resource) {
		if (resource.getContents().get(0) instanceof UiModel) {
			UiModel model = (UiModel) resource.getContents().get(0);
				if (model.getViews().size() > 0) {
					Activator.getDefault().setActiveView(model.getViews().get(0));
				}	
		}
	}
}
