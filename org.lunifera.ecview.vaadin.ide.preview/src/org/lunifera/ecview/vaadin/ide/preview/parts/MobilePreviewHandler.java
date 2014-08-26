package org.lunifera.ecview.vaadin.ide.preview.parts;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.lunifera.ecview.vaadin.ide.preview.Activator;
import org.lunifera.ecview.vaadin.ide.preview.web.EcviewMobilePreviewUI;

import com.google.inject.Injector;
import com.vaadin.ui.UI;

/**
 * Handles model exchange between Xtext editor and Vaadin UI.
 */
public class MobilePreviewHandler {

	// xtext and vaadin preview
	private YView yView;
	private Injector injector;
	private ECViewVaadinSynchronizer synchronizer;
	private EcviewMobilePreviewUI ui;
	private boolean linkedWithEditor;

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
	public synchronized boolean setPreviewUI(EcviewMobilePreviewUI ui) {
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
		IWorkspace ws = Activator.getDefault().getWorkspace();
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
	
	public void dispose() {
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
	}
}
