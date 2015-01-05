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
package org.lunifera.ecview.servlet.mobile.impl;

import javax.servlet.ServletException;

import com.vaadin.addon.touchkit.server.TouchKitServlet;
import com.vaadin.addon.touchkit.settings.TouchKitSettings;
import com.vaadin.annotations.VaadinServletConfiguration;

/**
 * An implementation of VaadinServlet that uses SimpleUI as its base UI.
 */
@SuppressWarnings("serial")
@VaadinServletConfiguration(ui = MobileUI.class, widgetset = "org.lunifera.mobile.vaadin.widgetset.LuniferaMobileWidget", productionMode = false)
public class MobileVaadinServlet extends TouchKitServlet {

	@Override
	protected void servletInitialized() throws ServletException {
		super.servletInitialized();

		TouchKitSettings s = getTouchKitSettings();
		s.getWebAppSettings().setWebAppCapable(true);
		s.getWebAppSettings().setStatusBarStyle("black");
	}

}
