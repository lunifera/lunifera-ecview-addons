/*******************************************************************************
 * Copyright (c) 2007, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Florian Pirchner - added to preview bundle
 *******************************************************************************/

package org.lunifera.ecview.vaadin.ide.preview.jetty;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.eclipse.equinox.http.jetty.JettyConstants;
import org.eclipse.equinox.http.servlet.HttpServiceServlet;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.server.session.HashSessionManager;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.osgi.framework.Constants;

public class JettyManager {

	public static final String PROP_MOBILEPREVIEW = "mobilepreview";
	public static final String PROP_IDEPREVIEW = "idepreview";
	private static final int HTTP_PORT = 8099;
	private static final String CONTEXT_TEMPDIR = "javax.servlet.context.tempdir"; //$NON-NLS-1$
	private static final String DIR_PREFIX = "preview"; //$NON-NLS-1$
	private static final String INTERNAL_CONTEXT_CLASSLOADER = "org.eclipse.equinox.http.jetty.internal.ContextClassLoader"; //$NON-NLS-1$

	private Server server;
	private File workDir;

	public JettyManager(File workDir) {
		this.workDir = workDir;
	}

	public synchronized void stop() {
		if (server != null) {
			try {
				server.stop();
			} catch (Exception e) {
				// cleaning up
				e.printStackTrace();
			}
			File contextWorkDir = new File(workDir, DIR_PREFIX);
			deleteDirectory(contextWorkDir);
		}
	}

	public String getName() {
		return this.getClass().getName();
	}

	public synchronized void start() {
		stop();
		Server server = new Server();

		Connector httpConnector = createHttpConnector();
		server.addConnector(httpConnector);

		ContextHandlerCollection handlers = new ContextHandlerCollection();
		ServletContextHandler ideContext = createServletContext(PROP_IDEPREVIEW);
		ServletContextHandler mobileContext = createServletContext(PROP_MOBILEPREVIEW);
		handlers.addHandler(ideContext);
		handlers.addHandler(mobileContext);

		server.setHandler(handlers);
		try {
			server.start();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		this.server = server;
	}

	protected ServletContextHandler createServletContext(String contextPath) {
		ServletHolder holder = new ServletHolder(
				new InternalHttpServiceServlet());
		holder.setInitOrder(0);
		holder.setInitParameter(Constants.SERVICE_VENDOR, "Lunifera.org"); //$NON-NLS-1$
		holder.setInitParameter(Constants.SERVICE_DESCRIPTION,
				"ECView" + contextPath); //$NON-NLS-1$
		holder.setInitParameter(JettyConstants.HTTP_PORT,
				Integer.toString(HTTP_PORT));
		holder.setInitParameter(JettyConstants.OTHER_INFO, contextPath);
		ServletContextHandler httpContext = createHttpContext("/" + contextPath);

		httpContext.addServlet(holder, "/*"); //$NON-NLS-1$
		return httpContext;
	}

	public synchronized void shutdown() throws Exception {
		server.stop();
		server = null;
	}

	private Connector createHttpConnector() {
		Connector connector;
		if (getDefaultNIOEnablement()) {
			connector = new SelectChannelConnector();
		} else {
			connector = new SocketConnector();
		}
		connector.setPort(HTTP_PORT);
		return connector;
	}

	private Boolean getDefaultNIOEnablement() {
		Properties systemProperties = System.getProperties();
		String javaVendor = systemProperties.getProperty("java.vendor", ""); //$NON-NLS-1$ //$NON-NLS-2$
		if (javaVendor.equals("IBM Corporation")) { //$NON-NLS-1$
			String javaVersion = systemProperties.getProperty(
					"java.version", ""); //$NON-NLS-1$ //$NON-NLS-2$
			if (javaVersion.startsWith("1.4")) //$NON-NLS-1$
				return Boolean.FALSE;
			// Note: no problems currently logged with 1.5
			if (javaVersion.equals("1.6.0")) { //$NON-NLS-1$
				String jclVersion = systemProperties.getProperty(
						"java.jcl.version", ""); //$NON-NLS-1$ //$NON-NLS-2$
				if (jclVersion.startsWith("2007")) //$NON-NLS-1$
					return Boolean.FALSE;
				if (jclVersion.startsWith("2008") && !jclVersion.startsWith("200811") && !jclVersion.startsWith("200812")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	private ServletContextHandler createHttpContext(String contextPath) {
		ServletContextHandler httpContext = new ServletContextHandler();
		// hack in the mime type for xsd until jetty fixes it (bug 393218)
		httpContext.getMimeTypes().addMimeMapping("xsd", "application/xml"); //$NON-NLS-1$ //$NON-NLS-2$
		httpContext.setAttribute(INTERNAL_CONTEXT_CLASSLOADER, Thread
				.currentThread().getContextClassLoader());
		httpContext.setClassLoader(this.getClass().getClassLoader());
		httpContext.setContextPath(contextPath);

		File contextWorkDir = new File(workDir, DIR_PREFIX + contextPath);
		contextWorkDir.mkdir();
		httpContext.setAttribute(CONTEXT_TEMPDIR, contextWorkDir);

		HashSessionManager sessionManager = new HashSessionManager();

		httpContext.setSessionHandler(new SessionHandler(sessionManager));

		return httpContext;
	}

	public static class InternalHttpServiceServlet implements Servlet {
		// private static final long serialVersionUID = 7477982882399972088L;
		private Servlet httpServiceServlet = new HttpServiceServlet();
		private ClassLoader contextLoader;

		public void init(ServletConfig config) throws ServletException {
			ServletContext context = config.getServletContext();
			contextLoader = (ClassLoader) context
					.getAttribute(INTERNAL_CONTEXT_CLASSLOADER);

			Thread thread = Thread.currentThread();
			ClassLoader current = thread.getContextClassLoader();
			thread.setContextClassLoader(contextLoader);
			try {
				httpServiceServlet.init(config);
			} finally {
				thread.setContextClassLoader(current);
			}
		}

		public void destroy() {
			Thread thread = Thread.currentThread();
			ClassLoader current = thread.getContextClassLoader();
			thread.setContextClassLoader(contextLoader);
			try {
				httpServiceServlet.destroy();
			} finally {
				thread.setContextClassLoader(current);
			}
			contextLoader = null;
		}

		public void service(ServletRequest req, ServletResponse res)
				throws ServletException, IOException {
			Thread thread = Thread.currentThread();
			ClassLoader current = thread.getContextClassLoader();
			thread.setContextClassLoader(contextLoader);
			try {
				httpServiceServlet.service(req, res);
			} finally {
				thread.setContextClassLoader(current);
			}
		}

		public ServletConfig getServletConfig() {
			return httpServiceServlet.getServletConfig();
		}

		public String getServletInfo() {
			return httpServiceServlet.getServletInfo();
		}
	}

	// deleteDirectory is a convenience method to recursively delete a directory
	private static boolean deleteDirectory(File directory) {
		if (directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					deleteDirectory(files[i]);
				} else {
					files[i].delete();
				}
			}
		}
		return directory.delete();
	}
}
