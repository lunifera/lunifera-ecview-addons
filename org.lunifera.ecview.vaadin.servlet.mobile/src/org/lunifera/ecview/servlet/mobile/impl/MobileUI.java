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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Page.UriFragmentChangedEvent;
import com.vaadin.server.Page.UriFragmentChangedListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.Reindeer;

@SuppressWarnings("serial")
@Theme("mobiletheme")
@Widgetset("org.lunifera.mobile.vaadin.widgetset.LuniferaMobileWidget")
@PreserveOnRefresh
@Title("Vaadin Mobile Preview")
@Push
public class MobileUI extends UI implements UriFragmentChangedListener {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(MobileUI.class);

	private CssLayout layout;

	private IMobileUiParticipantHandle uiHandle;

	@Override
	protected void init(VaadinRequest request) {
		setTheme("mobiletheme");
		
		IMobileUiParticipant participant = Activator.getDefault()
				.getParticipant();
		if (participant == null) {
			LOGGER.error("IMobileUiParticipant service not available");
			Notification.show("IMobileUiParticipant not available.",
					Notification.Type.ERROR_MESSAGE);
			return;
		}

		setStyleName(Reindeer.LAYOUT_BLUE);
		VaadinObservables.getRealm(getUI());

		layout = new CssLayout();
		layout.setSizeFull();
		setContent(layout);

		uiHandle = participant.createHandle(this);

		// initialize the UI
		getPage().addUriFragmentChangedListener(this);

		// notify about the current uri fragment
		uiHandle.handle(layout, getPage().getUriFragment());
		
		setTheme("mobiletheme");
	}

	@Override
	public void uriFragmentChanged(UriFragmentChangedEvent event) {
		layout.removeAllComponents();
		uiHandle.handle(layout, event.getUriFragment());
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
