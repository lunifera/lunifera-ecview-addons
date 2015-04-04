

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


package org.lunifera.ecview.uisemantics.scoping;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxElementURI;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

@SuppressWarnings("restriction")
public class ScopeProvider extends XbaseBatchScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {

		if (reference == UiSemanticsPackage.Literals.UX_EPACKAGE_IMPORT__EPACKAGE) {
			return createEPackageScope();
		} else if (reference == UiSemanticsPackage.Literals.UX_ELEMENT_URI__ECLASS) {
			UxElementURI elementURI = (UxElementURI) context;
			return new EPackageContentScope(elementURI.getEPackage()
					.getEPackage());
		}

		return super.getScope(context, reference);
	}

	protected IScope createEPackageScope() {
		IScope current = new SimpleScope(IScope.NULLSCOPE, Iterables.transform(
				EPackage.Registry.INSTANCE.keySet(),
				new Function<String, IEObjectDescription>() {
					public IEObjectDescription apply(String from) {
						InternalEObject proxyPackage = (InternalEObject) EcoreFactory.eINSTANCE
								.createEPackage();
						proxyPackage.eSetProxyURI(URI.createURI(from));
						return EObjectDescription.create(
								QualifiedName.create(from), proxyPackage,
								Collections.singletonMap("nsURI", "true"));
					}
				}));
		return current;
	}

}
