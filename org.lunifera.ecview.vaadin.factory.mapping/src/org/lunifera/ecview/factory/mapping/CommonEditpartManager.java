/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.factory.mapping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.editpart.IEditPartManager;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.osgi.service.component.annotations.Component;

/**
 * Overrides the isFor method for the UiModel
 */
@SuppressWarnings("restriction")
@Component(service = { IEditPartManager.class })
public class CommonEditpartManager extends
		org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager {
	
	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(UiModelPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(UiModelPackage.eNS_URI);
		}
		return false;
	}
}
