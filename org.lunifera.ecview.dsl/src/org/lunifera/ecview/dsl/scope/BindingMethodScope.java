package org.lunifera.ecview.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.dsl.uIGrammar.Binding;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.ElementDefinition;

public class BindingMethodScope extends AbstractScope {

	private Binding gBinding;
	private IScope parent;

	protected BindingMethodScope(IScope parent, EObject context,
			boolean ignoreCase) {
		super(IScope.NULLSCOPE, ignoreCase);
		this.parent = parent;
		gBinding = (Binding) context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		YEmbeddable yEmb = gBinding.getEmbeddable();

		for (IEObjectDescription des : parent.getAllElements()) {
			org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding binding = (org.lunifera.ecview.uisemantics.uISemanticsGrammar.Binding) des
					.getEObjectOrProxy();
			ElementDefinition elementDef =	(ElementDefinition) binding.eContainer().eContainer();
			if(elementDef.getName().equals(yEmb)){
				// get available bindings
				// element definition in uisemantics auf ecore::EClass umstellen
			}
		}
		return null;
	}
}
