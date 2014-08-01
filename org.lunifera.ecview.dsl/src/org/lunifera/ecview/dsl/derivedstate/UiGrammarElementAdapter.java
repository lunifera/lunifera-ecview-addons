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
