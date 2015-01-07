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
package org.lunifera.ecview.servlet.mobile;

import com.vaadin.ui.ComponentContainer;

/**
 * Implementations of the interface need to visualize mobile Vaadin
 * applications.<br>
 * Therefore the URL-fragment is passed with the main layout of the UI.
 */
public interface IMobileUiParticipantHandle {

	/**
	 * Returns the theme name that should be used.
	 * @return
	 */
	String getTheme();
	
	/**
	 * Needs to visualize the site related to the given fragment.
	 * 
	 * @param mainLayout
	 * @param fragment
	 */
	void handle(ComponentContainer mainLayout, String fragment);

	/**
	 * This method will dispose the handle.
	 */
	void dispose();

}
