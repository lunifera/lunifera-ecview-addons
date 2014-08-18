package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.eclipse.xtext.xbase.typesystem.internal.ExpressionScope.Scope;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiLayoutAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;

public class BindingEndpointDefRawBindableScope extends AbstractScope {

	private EObject context;
	private IScope parent;
	private IQualifiedNameProvider nameProvider;

	protected BindingEndpointDefRawBindableScope(IScope parent,
			EObject context, IQualifiedNameProvider nameProvider) {
		super(IScope.NULLSCOPE, true);
		this.parent = parent;
		this.context = context;
		this.nameProvider = nameProvider;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		if (context instanceof UiBinding) {
			UiBinding binding = (UiBinding) context;
			return toScope(binding);
		} else if (context instanceof UiTypedBindableDef) {
			UiTypedBindableDef def = (UiTypedBindableDef) context;
			UiBinding binding = findBinding(def);
			if (binding != null) {
				return toScope(binding);
			}
		}
		return parent.getAllElements();
	}

	protected Iterable<IEObjectDescription> toScope(UiBinding binding) {
		EObject container = binding.eContainer();
		if (container instanceof UiEmbeddable) {
//			EObject parentContainer = container.eContainer();
//
//			TreeIterator<EObject> iterator = parentContainer.eAllContents();
//			while (iterator.hasNext()) {
//				EObject element = iterator.next();
//				if (!(element instanceof UiEmbeddable)
//						&& !(element instanceof UiLayoutAssignment)) {
//					iterator.prune();
//				} else {
//					if (element instanceof UiEmbeddable) {
//						result.add(EObjectDescription.create(
//								nameProvider.getFullyQualifiedName(element),
//								element));
//					}
//				}
//			}

			List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
			// add "this" to the available list of bindables
			result.add(EObjectDescription.create("this", container));
			 for (IEObjectDescription des : parent.getAllElements()) {
				 result.add(des);
			 }

			return result;
		} else {
			return parent.getAllElements();
		}
	}

	private UiBinding findBinding(EObject def) {
		UiBinding result = null;
		while (def.eContainer() != null) {
			def = def.eContainer();
			if (def instanceof UiBinding) {
				result = (UiBinding) def;
				break;
			}
		}
		return result;
	}
}
