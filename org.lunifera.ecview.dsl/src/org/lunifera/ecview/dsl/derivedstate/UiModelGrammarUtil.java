/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */

package org.lunifera.ecview.dsl.derivedstate;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.util.UiModelUtil;

@SuppressWarnings("restriction")
public class UiModelGrammarUtil {

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
	@SuppressWarnings("restriction")
	public static String getPathId(UiEmbeddable embeddable) {
		return UiModelUtil.getPathId(embeddable);
	}
}
