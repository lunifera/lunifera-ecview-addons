package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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

public class BindingEndpointDefBindMethodScope extends AbstractScope {

	private UiTypedBindableDef bindingEndpointDef;
	private IResourceDescriptions desc;

	protected BindingEndpointDefBindMethodScope(IResourceDescriptions desc,
			UiTypedBindableDef context) {
		super(IScope.NULLSCOPE, true);
		this.desc = desc;
		bindingEndpointDef = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		UiRawBindable yEmb = bindingEndpointDef.getRawBindableOfLastSegment();
		if (yEmb == null) {
			return Collections.emptyList();
		}
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription des : desc
				.getExportedObjectsByType(UiSemanticsPackage.Literals.UX_BINDINGABLE_OPTION)) {
			UxEndpointDef binding = (UxEndpointDef) des.getEObjectOrProxy();
			binding = (UxEndpointDef) EcoreUtil.resolve(binding,
					bindingEndpointDef);
			EObject parent = binding.eContainer();
			if (parent == null) {
				continue;
			}
			UxElementDefinition elementDef = (UxElementDefinition) parent
					.eContainer();
			if (elementDef.getUri().getEClass().isSuperTypeOf(yEmb.eClass())) {
				result.add(EObjectDescription.create(binding.getName(), binding));
			}
		}
		return result;
	}
}
