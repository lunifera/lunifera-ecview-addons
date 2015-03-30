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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxAction;

public class ViewActionReferenceScope extends AbstractScope {

	private IResourceDescriptions desc;
	private EObject context;
	private IQualifiedNameConverter converter;

	protected ViewActionReferenceScope(IResourceDescriptions desc,
			EObject context, IQualifiedNameConverter converter) {
		super(IScope.NULLSCOPE, true);
		this.desc = desc;
		this.context = context;
		this.converter = converter;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription des : desc
				.getExportedObjectsByType(UiSemanticsPackage.Literals.UX_ACTION)) {
			UxAction action = (UxAction) des.getEObjectOrProxy();
			action = (UxAction) EcoreUtil.resolve(action, context);
			result.add(EObjectDescription.create(
					converter.toQualifiedName(action.getName()), action));
		}
		return result;
	}
}
