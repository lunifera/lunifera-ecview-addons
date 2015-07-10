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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

public class EPackageContentScope extends AbstractScope {

	private EPackage pkg;

	protected EPackageContentScope(EPackage pkg) {
		super(IScope.NULLSCOPE, true);
		this.pkg = pkg;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		if (pkg != null) {
			for (EClassifier eClassifier : pkg.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					result.add(EObjectDescription.create(eClassifier.getName(),
							eClassifier));
				}
			}
		}
		return result;
	}
}
