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
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Component;

/**
 * An implementation of IEditPartManager for eObjects with
 * nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
@SuppressWarnings("restriction")
@Component(service = { IEditPartManager.class })
public class ExtensionsEditpartManager extends
		org.eclipse.emf.ecp.ecview.extension.editpart.emf.EditpartManager {

	protected void activate(ComponentContext context) {

	}

	protected void deactivate(ComponentContext context) {

	}

	@Override
	public boolean isFor(Object element) {
		boolean result = false;
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			result = uriString.equals(UiextensionPackage.eNS_URI);
		} else if (element instanceof String) {
			result = element.equals(UiextensionPackage.eNS_URI);
		}
		return result;
	}
}
