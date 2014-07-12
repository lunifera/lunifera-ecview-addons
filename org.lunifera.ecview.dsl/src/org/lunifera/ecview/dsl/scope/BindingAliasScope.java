package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

public class BindingAliasScope extends AbstractScope {

	private UiBinding uiBinding;
	private IScope parent;
	private EReference reference;

	protected BindingAliasScope(IScope parent, UiBinding context,
			EReference reference) {
		super(IScope.NULLSCOPE, true);
		this.parent = parent;
		uiBinding = context;
		this.reference = reference;
	}
 
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		boolean filterType = reference == UimodelPackage.Literals.UI_BINDING__TARGET_ALIAS;
		if (filterType) {
			UxEndpointDef uxSourceEndpointDef = uiBinding
					.getSourceEndpointDef();
			if (uxSourceEndpointDef == null) {
				return parent.getAllElements();
			}

			List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
			for (IEObjectDescription des : parent.getAllElements()) {
				UiBindingEndpointAlias uiBindingEndpointAlias = (UiBindingEndpointAlias) des
						.getEObjectOrProxy();
				uiBindingEndpointAlias = (UiBindingEndpointAlias) EcoreUtil
						.resolve(uiBindingEndpointAlias, uiBinding);
				UxElementDefinition elementDef = (UxElementDefinition) uiBindingEndpointAlias
						.getEndpoint().getSemanticEndpoint();

				if (uxSourceEndpointDef.eClass().isSuperTypeOf(
						elementDef.eClass())) {
					result.add(EObjectDescription.create(
							uiBindingEndpointAlias.getAlias(),
							uiBindingEndpointAlias));
				}
			}
			return result;
		} else {
			return parent.getAllElements();
		}
	}
}
