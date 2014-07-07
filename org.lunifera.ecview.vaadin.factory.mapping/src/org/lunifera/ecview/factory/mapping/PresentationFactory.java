/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.factory.mapping;

import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.presentation.IPresentationFactory;
import org.lunifera.ecview.semantic.uimodel.UimodelPackage;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiextensionPackage;
import org.lunifera.runtime.web.ecview.presentation.vaadin.internal.PresenterFactory;
import org.osgi.service.component.annotations.Component;

/**
 * Overrides the isFor method for the UiModel stuff.
 */
@SuppressWarnings("restriction")
@Component(service = { IPresentationFactory.class })
public class PresentationFactory extends PresenterFactory {

	public PresentationFactory() {

	}

	@Override
	public boolean isFor(IViewContext uiContext, IElementEditpart editpart) {
		String presentationURI = uiContext.getPresentationURI();
		return presentationURI != null
				&& (presentationURI.equals(UimodelPackage.eNS_URI) || presentationURI
						.equals(UiextensionPackage.eNS_URI));
	}
}
