package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

public class BindingEndpointDefMethodScope extends AbstractScope {

	private UiTypedBindableDef bindingEndpointDef;
	private IResourceDescriptions desc;

	protected BindingEndpointDefMethodScope(IResourceDescriptions desc,
			UiTypedBindableDef context) {
		super(IScope.NULLSCOPE, true);
		this.desc = desc;
		bindingEndpointDef = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		UiRawBindable yEmb = bindingEndpointDef.getRawBindable();

		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription des : desc
				.getExportedObjectsByType(UiSemanticsPackage.Literals.UX_ENDPOINT_DEF)) {
			UxEndpointDef binding = (UxEndpointDef) des.getEObjectOrProxy();
			binding = (UxEndpointDef) EcoreUtil.resolve(binding,
					bindingEndpointDef);
			UxElementDefinition elementDef = (UxElementDefinition) binding
					.eContainer().eContainer();

			if (elementDef.getUri().getEClass().isSuperTypeOf(yEmb.eClass())) {
				result.add(EObjectDescription.create(binding.getName(), binding));
			}
		}
		return result;
	}
}
