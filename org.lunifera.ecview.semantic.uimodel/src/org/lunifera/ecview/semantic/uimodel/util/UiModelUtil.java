package org.lunifera.ecview.semantic.uimodel.util;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiView;

public class UiModelUtil {

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
