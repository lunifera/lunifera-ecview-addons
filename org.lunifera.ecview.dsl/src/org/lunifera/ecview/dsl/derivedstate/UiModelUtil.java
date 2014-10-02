package org.lunifera.ecview.dsl.derivedstate;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiView;

public class UiModelUtil {

	/**
	 * Returns the grammar model element for the given view model element.
	 * 
	 * @param yElement
	 * @return
	 */
	public static EObject getUiGrammarElement(EObject yElement) {
		if (yElement == null)
			return null;
		List<Adapter> adapters = yElement.eAdapters();
		for (int i = 0; i < adapters.size(); i++) {
			Adapter adapter = adapters.get(i);
			if (adapter instanceof IUiGrammarElement)
				return ((IUiGrammarElement) adapter).getGrammarElement();
		}
		return null;
	}

	/**
	 * Returns the grammar model element for the given view model element.
	 * 
	 * @param yElement
	 * @return
	 */
	public static CompositeNodeWithSemanticElement getXtextNode(EObject yElement) {
		if (yElement == null)
			return null;

		EObject uiGrammarElement = getUiGrammarElement(yElement);
		if (uiGrammarElement == null)
			return null;

		return (CompositeNodeWithSemanticElement) NodeModelUtils
				.getNode(uiGrammarElement);
	}

	/**
	 * Returns the path for the current element up to the view will be concated
	 * by "." Elements with no name are skipped.
	 * 
	 * @return
	 */
	public static String getPathId(UiEmbeddable embeddable) {
		if (embeddable == null || embeddable.getName() == null
				|| embeddable.getName().equals("")) {
			// elements without name get a generated ID
			return null;
		}

		List<EObject> elements = new LinkedList<EObject>();
		EObject current = embeddable;
		while (current != null) {
			elements.add(current);
			current = current.eContainer();
		}

		StringBuilder builder = new StringBuilder();
		for (int i = elements.size() - 1; i >= 0; i--) {
			EObject element = elements.get(i);
			if (element instanceof UiEmbeddable || element instanceof UiView) {
				UiNamedElement temp = (UiNamedElement) element;
				if (temp.getName() != null && !temp.getName().equals("")) {
					if (builder.length() > 0) {
						builder.append(".");
					}
					builder.append(temp.getName());
				}
			}
		}
		return builder.toString();
	}
}
