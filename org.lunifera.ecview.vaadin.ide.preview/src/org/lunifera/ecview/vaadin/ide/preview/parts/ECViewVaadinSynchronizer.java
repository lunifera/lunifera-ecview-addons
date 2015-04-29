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
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.lunifera.ecview.core.common.model.core.YDeviceType;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.dsl.derivedstate.UiModelGrammarUtil;
import org.lunifera.ecview.vaadin.ide.preview.Activator;

import com.google.inject.Singleton;

/**
 */
@SuppressWarnings("restriction")
@Singleton
public class ECViewVaadinSynchronizer implements IPartListener,
		IXtextModelListener, ISelectionChangedListener {

	private IXtextDocument lastActiveDocument;
	private XtextEditor lastActiveEditor;

	private XtextSourceViewer viewer;

	public void start(IWorkbenchPartSite site) {
		updateView(site.getPage().getActiveEditor());
		site.getWorkbenchWindow().getPartService().addPartListener(this);
		Activator.getIDEPreviewHandler().setSynchronizer(this);
		Activator.getMobilePreviewHandler().setSynchronizer(this);
	}

	public void stop(IWorkbenchPartSite site) {
		site.getWorkbenchWindow().getPartService().removePartListener(this);
		lastActiveDocument = null;
		lastActiveEditor = null;
		Activator.getIDEPreviewHandler().setSynchronizer(null);
		Activator.getMobilePreviewHandler().setSynchronizer(null);
	}

	public void selectInXtextEditor(EObject element) {
		EObject grammarElement = UiModelGrammarUtil
				.getUiGrammarElement(element);
		if (grammarElement != null) {
			CompositeNodeWithSemanticElement node = (CompositeNodeWithSemanticElement) NodeModelUtils
					.getNode(grammarElement);
			if (node != null) {
				selectInXtextEditor(node.getTextRegion());
			}
		}
	}

	public void selectInXtextEditor(final ITextRegion region) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				if (region != null && region != ITextRegion.EMPTY_REGION) {
					int offset = region.getOffset();
					int length = region.getLength();
					viewer.setRangeIndication(offset, length, true);
					viewer.revealRange(offset, length);
					viewer.setSelectedRange(offset, length);
				}
			}
		});
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
					viewer.removePostSelectionChangedListener(this);
				}

				lastActiveDocument = xtextDocument;
				lastActiveEditor = xtextEditor;
				viewer = (XtextSourceViewer) lastActiveEditor
						.getInternalSourceViewer();
				lastActiveDocument.addModelListener(this);
				viewer.addPostSelectionChangedListener(this);
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
		if (resource == null) {
			return;
		}
		if (resource.getContents().size() < 2) {
			return;
		}
		for (EObject e : resource.getContents()) {
			if (e instanceof YView) {
				YView view = (YView) e;
				if (view.getDeviceType() == YDeviceType.MOBILE) {
					Activator.getMobilePreviewHandler()
							.setActiveViewFromXtextEditor(view);
				} else {
					Activator.getIDEPreviewHandler()
							.setActiveViewFromXtextEditor(view);
				}
				break;
			}
		}
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		final ISelection selection = event.getSelection();
		if (selection instanceof ITextSelection) {
			// ITextSelection textSelection = (ITextSelection) selection;
			// ITextRegion selectedTextRegion = new TextRegion(
			// textSelection.getOffset(), textSelection.getLength());
			// Object input = viewer.getInput();

			// Activator.getDefault().selectInVaadinPreview(textSelection,
			// lastActiveDocument);
		}
	}
}
