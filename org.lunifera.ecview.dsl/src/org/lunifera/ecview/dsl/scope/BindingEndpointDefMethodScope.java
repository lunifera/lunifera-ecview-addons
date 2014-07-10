package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

public class BindingEndpointDefMethodScope extends AbstractScope {

	private UiBindingEndpointDef bindingEndpointDef;
	private IScope parent;

	protected BindingEndpointDefMethodScope(IScope parent,
			UiBindingEndpointDef context) {
		super(IScope.NULLSCOPE, true);
		this.parent = parent;
		bindingEndpointDef = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		YElement yEmb = bindingEndpointDef.getBindable();

		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription des : parent.getAllElements()) {
			UxEndpointDef binding = (UxEndpointDef) des
					.getEObjectOrProxy();
			binding = (UxEndpointDef) EcoreUtil
					.resolve(binding, bindingEndpointDef);
			UxElementDefinition elementDef = (UxElementDefinition) binding
					.eContainer().eContainer();

			if (elementDef.getUri().getEClass().isSuperTypeOf(yEmb.eClass())) {
				result.add(EObjectDescription.create(binding.getName(), binding));
			}
		}
		return result;
	}
}
