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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
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
				lastActiveDocument
						.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
							@Override
							public Boolean exec(XtextResource state)
									throws Exception {
								modelChanged(state);
								return true;
							}
						});
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
		if (resource.getContents().size() < 2) {
			return;
		}
		for (EObject e : resource.getContents()) {
			if (e instanceof YView) {
				Activator.getDefault().setActiveView((YView) EcoreUtil.copy(e));
				break;
			}
		}
	}
}
