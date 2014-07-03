package org.lunifera.ecview.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;
import org.lunifera.ecview.dsl.uIGrammar.UiSourceBindingEndpoint;
import org.lunifera.ecview.dsl.uIGrammar.UiTargetBindingEndpoint;

@SuppressWarnings("restriction")
public class BatchScopeProvider extends XbaseBatchScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference == UIGrammarPackage.Literals.UI_SOURCE_BINDING_ENDPOINT__ENDPOINT) {
			return new SourceBindingEndpointMethodScope(super.getScope(context,
					reference), (UiSourceBindingEndpoint) context);
		} else if (reference == UIGrammarPackage.Literals.UI_TARGET_BINDING_ENDPOINT__ENDPOINT) {
			return new TargetBindingEndpointMethodScope(super.getScope(context,
					reference), (UiTargetBindingEndpoint) context);
		}
		return super.getScope(context, reference);
	}

}
