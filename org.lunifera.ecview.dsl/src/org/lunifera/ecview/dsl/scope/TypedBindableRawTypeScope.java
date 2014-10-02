package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType;
import org.lunifera.ecview.semantic.uimodel.UiView;

public class TypedBindableRawTypeScope extends AbstractScope {

	private EObject context;

	protected TypedBindableRawTypeScope(EObject context) {
		super(IScope.NULLSCOPE, true);
		this.context = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		if (context instanceof UiTypedBindableRawType) {
			UiTypedBindableRawType def = (UiTypedBindableRawType) context;
			List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
			result.add(EObjectDescription.create("this",
					findRawBindableParent(def)));
			UiView view = findView(def);
			if (view != null) {
				result.add(EObjectDescription.create(view.getName(), view));
			}

			return result;
		}

		return Collections.emptyList();
	}

	private UiRawBindable findRawBindableParent(EObject eObject) {
		UiRawBindable result = null;
		while (eObject != null && eObject.eContainer() != null) {
			if (eObject instanceof UiRawBindable) {
				result = (UiRawBindable) eObject;
				break;
			}
			eObject = eObject.eContainer();
		}
		return result;
	}

	private UiView findView(EObject def) {
		UiView result = null;
		while (def.eContainer() != null) {
			def = def.eContainer();
			if (def instanceof UiView) {
				result = (UiView) def;
				break;
			}
		}
		return result;
	}
}
