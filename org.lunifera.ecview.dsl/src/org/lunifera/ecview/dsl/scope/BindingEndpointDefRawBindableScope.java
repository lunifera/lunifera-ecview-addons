/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
 

package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiView;

public class BindingEndpointDefRawBindableScope extends AbstractScope {

	private EObject context;
	private IQualifiedNameProvider nameProvider;

	protected BindingEndpointDefRawBindableScope(EObject context,
			IQualifiedNameProvider nameProvider) {
		super(IScope.NULLSCOPE, true);
		this.context = context;
		this.nameProvider = nameProvider;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		if (context instanceof UiTypedBindableDef) {
			UiTypedBindableDef def = (UiTypedBindableDef) context;
			List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
			result.add(EObjectDescription.create("this",
					findRawBindableParent(def)));
			UiView view = findView(def);
			if (view != null) {
				result.add(EObjectDescription.create(view.getName(), view));
			}

			// result.addAll(collectRawBindables(def));
			return result;
		}

		return Collections.emptyList();
	}

	// protected List<IEObjectDescription> collectRawBindables(EObject
	// container) {
	// List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
	// for (EObject object : container.eContents()) {
	// if (object instanceof UiRawBindable
	// && isValid(((UiRawBindable) object).getName())) {
	// result.add(EObjectDescription.create(
	// ((UiRawBindable) object).getName(), object));
	// } else if (object instanceof UiRawBindableProvider) {
	// // direct children may be of type UiRawBindable
	// result.addAll(collectRawBindables(object));
	// }
	// }
	// return result;
	// }

	// protected List<IEObjectDescription> collectRawBindables(
	// UiTypedBindableDef def) {
	// EObject rawBindableParent = findRawBindableParent(def);
	// if (rawBindableParent == null) {
	// rawBindableParent = findView(def);
	// }
	// List<IEObjectDescription> result =
	// collectRawBindables(rawBindableParent);
	// return result;
	// }

	// private boolean isValid(String value) {
	// return value != null && !value.equals("");
	// }

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
