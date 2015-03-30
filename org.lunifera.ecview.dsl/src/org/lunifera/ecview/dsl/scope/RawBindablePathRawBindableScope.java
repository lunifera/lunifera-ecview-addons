
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
import org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment;
import org.lunifera.ecview.semantic.uimodel.UiRawBindableProvider;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType;
import org.lunifera.ecview.semantic.uimodel.UiView;

public class RawBindablePathRawBindableScope extends AbstractScope {

	private EObject context;
	private IQualifiedNameProvider nameProvider;

	protected RawBindablePathRawBindableScope(EObject context,
			IQualifiedNameProvider nameProvider) {
		super(IScope.NULLSCOPE, true);
		this.context = context;
		this.nameProvider = nameProvider;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		if (context instanceof UiRawBindablePathSegment) {
			UiRawBindablePathSegment pathSegment = (UiRawBindablePathSegment) context;

			EObject expected = null;
			EObject parent = context.eContainer();
			if (parent instanceof UiTypedBindableDef) {
				expected = ((UiTypedBindableDef) parent).getRawBindable();
			} else if (parent instanceof UiRawBindablePathSegment) {
				expected = ((UiRawBindablePathSegment) parent).getRawBindable();
			} else if (parent instanceof UiTypedBindableRawType) {
				expected = ((UiTypedBindableRawType) parent).getRawBindable();
			}

			List<IEObjectDescription> result = null;
			if (!pathSegment.isToParent()) {
				result = collectRawBindables(expected);
			} else {
				result = new ArrayList<IEObjectDescription>(1);
				IEObjectDescription bindableResult = findValidRawBindableInParent(expected.eContainer());
				if (bindableResult != null) {
					result.add(bindableResult);
				}
			}
			return result;
		}

		return Collections.emptyList();
	}

	/**
	 * Iterate the eContainers() up to root to find a raw bindable.
	 * 
	 * @param expected
	 * @return
	 */
	private IEObjectDescription findValidRawBindableInParent(EObject expected) {

		UiRawBindable result = findInParent(expected);
		if (result != null) {
			return EObjectDescription.create(
					((UiRawBindable) result).getName(), result);
		} else {
			return null;
		}

	}

	private UiRawBindable findInParent(EObject expected) {
		if (expected == null) {
			return null;
		}

		if (expected instanceof UiRawBindable
				&& isValid(((UiRawBindable) expected).getName())) {
			return (UiRawBindable) expected;
		}

		return findInParent(expected.eContainer());
	}

	/**
	 * Iterate the structure down to find raw bindables.
	 * 
	 * @param container
	 * @return
	 */
	protected List<IEObjectDescription> collectRawBindables(EObject container) {
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (EObject object : container.eContents()) {
			if (object instanceof UiRawBindable) {
				if (isValid(((UiRawBindable) object).getName())) {
					result.add(EObjectDescription.create(
							((UiRawBindable) object).getName(), object));
				} else {
					// direct children may be of type UiRawBindable
					result.addAll(collectRawBindables(object));
				}
			} else if (object instanceof UiRawBindableProvider) {
				// direct children may be of type UiRawBindable
				result.addAll(collectRawBindables(object));
			}
		}
		return result;
	}

	protected List<IEObjectDescription> collectRawBindables(
			UiTypedBindableDef def) {
		EObject rawBindableParent = findRawBindableParent(def);
		if (rawBindableParent == null) {
			rawBindableParent = findView(def);
		}
		List<IEObjectDescription> result = collectRawBindables(rawBindableParent);
		return result;
	}

	private boolean isValid(String value) {
		return value != null && !value.equals("");
	}

	/**
	 * Collects the fully qualified name for the element from the current up to
	 * the view.
	 * 
	 * @param element
	 * @return
	 */
	private String collectFQN(EObject element) {

		return null;
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
