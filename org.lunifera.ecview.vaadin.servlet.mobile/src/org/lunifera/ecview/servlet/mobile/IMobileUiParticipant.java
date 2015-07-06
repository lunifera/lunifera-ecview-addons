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
package org.lunifera.ecview.servlet.mobile;

import com.vaadin.ui.UI;

/**
 * Implementations of the interface need to provide UI handles. A handle is
 * related with an instance of {@link UI} and an uiId (fragment), and has to
 * visualize mobile UI contents (pages) based on the given URL-fragment.
 * <p>
 * Implementations need to become registered as an OSGi-service. The participant
 * will be found by the OSGi-Property (uriFragment={fragmen}).
 * <p>
 * For instance:<br>
 * 
 * <pre>
 * &#064;Component(property = { &quot;uriFragment=org.carstore.sample.CustomerView&quot; })
 * public static class UiProvider implements IMobileUiParticipant {
 * 
 * 	&#064;Override
 * 	public IMobileUiParticipantHandle createHandle(UI ui, String fragment) {
 * 		return new CustomerView();
 * 	}
 * }
 * </pre>
 */
public interface IMobileUiParticipant {

	/**
	 * Creates a new UI handle.
	 * 
	 * @param ui
	 * @param fragment
	 *            - the ID of the UI
	 * @return
	 */
	IMobileUiParticipantHandle createHandle(UI ui, String fragment);

}
