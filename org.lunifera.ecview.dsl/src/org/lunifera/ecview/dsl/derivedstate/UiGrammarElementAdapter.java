

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

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

public class UiGrammarElementAdapter extends AdapterImpl implements IUiGrammarElement {
	
	private EObject grammarElement;

	public UiGrammarElementAdapter(EObject grammarElement){
		this.grammarElement = grammarElement;
	}
	
	@Override
	public EObject getGrammarElement() {
		return grammarElement;
	}

}
