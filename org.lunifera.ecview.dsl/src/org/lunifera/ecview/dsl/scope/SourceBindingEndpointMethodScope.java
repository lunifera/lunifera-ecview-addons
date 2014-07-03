package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxElementDefinition;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxEndpointDefCommon;

public class SourceBindingEndpointMethodScope extends AbstractScope {

	private UiSourceBindingEndpoint gBinding;
	private IScope parent;

	protected SourceBindingEndpointMethodScope(IScope parent,
			UiSourceBindingEndpoint context) {
		super(IScope.NULLSCOPE, true);
		this.parent = parent;
		gBinding = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		YBindable yEmb = gBinding.getEmbeddable();

		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription des : parent.getAllElements()) {
			UxEndpointDefCommon binding = (UxEndpointDefCommon) des
					.getEObjectOrProxy();
			binding = (UxEndpointDefCommon) EcoreUtil
					.resolve(binding, gBinding);
			UxElementDefinition elementDef = (UxElementDefinition) binding
					.eContainer().eContainer();

			if (elementDef.getUri().getEClass().isSuperTypeOf(yEmb.eClass())) {
				result.add(EObjectDescription.create(binding.getName(), binding));
			}
		}
		return result;
	}
}
