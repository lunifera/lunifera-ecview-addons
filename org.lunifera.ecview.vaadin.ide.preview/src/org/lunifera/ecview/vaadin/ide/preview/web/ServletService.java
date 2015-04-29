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

import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.ServiceException;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletService;

@SuppressWarnings("serial")
public class ServletService extends VaadinServletService {

	public ServletService(VaadinServlet servlet,
			DeploymentConfiguration deploymentConfiguration)
			throws ServiceException {
		super(servlet, deploymentConfiguration);
	}

	@Override
	public ClassLoader getClassLoader() {
		// return the bundle classloader
		// see http://dev.vaadin.com/ticket/15516
		return ServletService.class.getClassLoader();
	}

}
