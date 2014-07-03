package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.dsl.uIGrammar.UiBinding;
import org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint;
import org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UISemanticsGrammarPackage;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxElementDefinition;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxEndpointDefCommon;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxListBindingEndpointDef;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxSetBindingEndpointDef;
import org.lunifera.ecview.uisemantics.uISemanticsGrammar.UxValueBindingEndpointDef;

public class TargetBindingEndpointMethodScope extends AbstractScope {

	private UiTargetBindingEndpoint bindingEndpoint;
	private IScope parent;

	protected TargetBindingEndpointMethodScope(IScope parent,
			UiTargetBindingEndpoint context) {
		super(IScope.NULLSCOPE, true);
		this.parent = parent;
		bindingEndpoint = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		YBindable yEmb = bindingEndpoint.getEmbeddable();

		UiBinding sBinding = (UiBinding) bindingEndpoint.eContainer();
		UiSourceBindingEndpoint sourceEP = sBinding.getSource();

		EClass sBindingType = null;
		if (sourceEP.getEndpoint() instanceof UxValueBindingEndpointDef) {
			sBindingType = UISemanticsGrammarPackage.Literals.UX_VALUE_BINDING_ENDPOINT_DEF;
		} else if (sourceEP.getEndpoint() instanceof UxListBindingEndpointDef) {
			sBindingType = UISemanticsGrammarPackage.Literals.UX_LIST_BINDING_ENDPOINT_DEF;
		} else if (sourceEP.getEndpoint() instanceof UxSetBindingEndpointDef) {
			sBindingType = UISemanticsGrammarPackage.Literals.UX_SET_BINDING_ENDPOINT_DEF;
		}

		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription des : parent.getAllElements()) {
			UxEndpointDefCommon prospective = (UxEndpointDefCommon) des
					.getEObjectOrProxy();
			prospective = (UxEndpointDefCommon) EcoreUtil.resolve(prospective,
					bindingEndpoint);
			if (!sBindingType.isSuperTypeOf(prospective.eClass())) {
				continue;
			}

			UxElementDefinition elementDef = (UxElementDefinition) prospective
					.eContainer().eContainer();

			if (elementDef.getUri().getEClass().isSuperTypeOf(yEmb.eClass())) {
				result.add(EObjectDescription.create(prospective.getName(), prospective));
			}
		}
		return result;
	}
}
