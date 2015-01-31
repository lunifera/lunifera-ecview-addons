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

import org.lunifera.ecview.servlet.mobile.IMobileUiParticipant;
import org.lunifera.ecview.servlet.mobile.IMobileUiParticipantHandle;
import org.lunifera.runtime.web.vaadin.databinding.VaadinObservables;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Page.UriFragmentChangedEvent;
import com.vaadin.server.Page.UriFragmentChangedListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.Reindeer;

@SuppressWarnings("serial")
@Theme("mobiletheme")
@Widgetset("org.lunifera.mobile.vaadin.widgetset.LuniferaMobileWidget")
@PreserveOnRefresh
@Title("Vaadin Mobile Preview")
public class MobileUI extends UI implements UriFragmentChangedListener {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(MobileUI.class);

	private CssLayout layout;

	private IMobileUiParticipantHandle uiHandle;

	private ServiceTracker<IMobileUiParticipant, IMobileUiParticipant> tracker;

	@Override
	protected void init(VaadinRequest request) {
		setTheme("mobiletheme");

		setStyleName(Reindeer.LAYOUT_BLUE);
		VaadinObservables.getRealm(getUI());

		layout = new CssLayout();
		layout.setSizeFull();
		setContent(layout);

		// initialize the UI
		getPage().addUriFragmentChangedListener(this);

		// notify about the current uri fragment
		renewHandle(getPage().getUriFragment());
		notifyHandle(getPage().getUriFragment());

		setTheme("mobiletheme");
	}

	/**
	 * Notifies the uiHandle about the new fragment.
	 * 
	 * @param fragment
	 */
	private void notifyHandle(String fragment) {
		if (uiHandle != null) {
			uiHandle.handle(layout, fragment);
		}
	}

	@Override
	public void uriFragmentChanged(UriFragmentChangedEvent event) {
		layout.removeAllComponents();
		renewHandle(event.getUriFragment());
		notifyHandle(event.getUriFragment());
	}

	/**
	 * Creates a new handle for the new uriFragment.
	 */
	private void renewHandle(String fragment) {
		if (uiHandle != null) {
			try {
				uiHandle.dispose();
			} finally {
				uiHandle = null;
			}
		}

		IMobileUiParticipant participant = findParticipant(this, fragment);
		try {
		} finally {
			if (participant != null) {
				uiHandle = participant.createHandle(this, fragment);
			}
			// close the tracker AFTER creating the handle
			tracker.close();
		}
	}

	/**
	 * Tries to find a mobile praticipant that provides proper handles.
	 * 
	 * @param ui
	 * @param fragment
	 * @return
	 */
	public IMobileUiParticipant findParticipant(UI ui, String fragment) {
		try {
			tracker = new ServiceTracker<IMobileUiParticipant, IMobileUiParticipant>(
					getContext(), createFilter(ui, fragment), null);
			return tracker.getService();
		} catch (InvalidSyntaxException e) {
			LOGGER.error("{}", e);
		}

		return null;
	}

	private BundleContext getContext() {
		return Activator.getContext();
	}

	/**
	 * Create a filter to find the proper uiHandle.
	 * 
	 * @param ui
	 * @param fragment
	 * @return
	 * @throws InvalidSyntaxException
	 */
	protected Filter createFilter(UI ui, String fragment)
			throws InvalidSyntaxException {
		return getContext()
				.createFilter(
						String.format(
								"&((objectClass=org.lunifera.ecview.servlet.mobile.IMobileUiParticipant)(uriFragment=%s))",
								fragment));
	}

	@Override
	public void detach() {
		super.detach();

		if (uiHandle != null) {
			uiHandle.dispose();
			uiHandle = null;
		}
	}
}
