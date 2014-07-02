package org.lunifera.ecview.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.dsl.uIGrammar.UIGrammarPackage;

public class BatchScopeProvider extends XbaseBatchScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference == UIGrammarPackage.Literals.BINDING__METHOD){
			return new BindingMethodScope(context, reference);
		}
		return super.getScope(context, reference);
	}

}
