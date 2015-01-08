/**
 * Copyright 2013 Lunifera GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lunifera.ecview.vaadin.ide.preview.web;

import javax.servlet.ServletException;

import com.vaadin.addon.touchkit.server.TouchKitServlet;
import com.vaadin.addon.touchkit.settings.TouchKitSettings;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.ServiceException;
import com.vaadin.server.VaadinServletService;

/**
 * An implementation of VaadinServlet that uses SimpleUI as its base UI.
 */
@SuppressWarnings("serial")
@VaadinServletConfiguration(ui = EcviewMobilePreviewUI.class, widgetset = "org.lunifera.mobile.vaadin.widgetset.LuniferaMobileWidget", productionMode = false)
public class EcviewMobilePreviewVaadinServlet extends TouchKitServlet {

	@Override
	protected void servletInitialized() throws ServletException {
		super.servletInitialized();

		TouchKitSettings s = getTouchKitSettings();
		s.getWebAppSettings().setWebAppCapable(true);
		s.getWebAppSettings().setStatusBarStyle("black");
	}

	@Override
	protected VaadinServletService createServletService(
			DeploymentConfiguration deploymentConfiguration)
			throws ServiceException {
		// see http://dev.vaadin.com/ticket/15516
		ServletService service = new ServletService(this,
				deploymentConfiguration);
		service.init();
		return service;
	}

}
