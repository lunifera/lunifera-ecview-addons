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

import com.vaadin.ui.UI;

/**
 * Implementations of the interface need to provide UI handles. A handle is
 * related with an instance of {@link UI} and has to visualize mobile UI
 * contents based on the given URL-fragment.<p>
 * Implementations need to registered as an OSGi-service.
 */
public interface IMobileUiParticipant {

	/**
	 * Creates a new UI handle.
	 * 
	 * @param ui
	 * @return
	 */
	IMobileUiParticipantHandle createHandle(UI ui);

}
