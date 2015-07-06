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
package org.lunifera.ecview.jetty.manager;

/**
 * JettyManagers registers two HttpServices for a given contextPath. Following
 * properties available to query proper service.
 * <ul>
 * <li>other.info = {contextPath} &
 * org.lunifera.ecview.jetty.serviceType=application - the http service to
 * register the application servlet at</li>
 * <li>other.info = {contextPath} & org.lunifera.ecview.jetty.serviceType=mobile
 * - the http service to register the mobile application servlet at</li>
 * </ul>
 * <h2>OSGi Filter to access the services</h2>
 * 
 * String filter = String.format("(&(objectClass=%s)(%s=%s))",
 * HttpService.class.getName(), JettyConstants.OTHER_INFO,
 * PreviewJettyManager.PROP_IDEPREVIEW);
 * <ul>
 * <li>application service:
 * (&(objectClass=org.osgi.service.http.HttpService)(other
 * .info={contextPath})(org.lunifera.ecview.jetty.serviceType=application))</li>
 * <li>mobile service:
 * (&(objectClass=org.osgi.service.http.HttpService)(other.info
 * ={contextPath})(org.lunifera.ecview.jetty.serviceType=mobile))</li>
 * </ul>
 */
public interface IJettyManager {

	/**
	 * The context path to be configured by system property.
	 */
	public static final String PROP_CONTEXT_PATH = "org.lunifera.ecview.jetty.contextpath";
	/**
	 * The port to be configured by system property.
	 */
	public static final String PROP_PORT = "org.lunifera.ecview.jetty.port";
	/**
	 * The type of service. See {@link #SERVICE_TYPE__APPLICATION} or
	 * {@link #SERVICE_TYPE__MOBILE}
	 */
	public static final String PROP_SERVICE_TYPE = "org.lunifera.ecview.jetty.serviceType";
	/**
	 * Service for main application
	 */
	public static final String SERVICE_TYPE__APPLICATION = "application";
	/**
	 * Service for mobile
	 */
	public static final String SERVICE_TYPE__MOBILE = "mobile";
	/**
	 * The context path postfix for the mobile contextPath: {contextPath}mobile
	 */
	public static final String MOBILE_POSTFIX = "mobile";

}
