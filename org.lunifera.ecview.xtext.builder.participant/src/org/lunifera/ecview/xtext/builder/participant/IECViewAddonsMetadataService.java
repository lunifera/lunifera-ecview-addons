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
package org.lunifera.ecview.xtext.builder.participant;

import java.util.List;

import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;

public interface IECViewAddonsMetadataService {

	/**
	 * Returns the YView for the given model name.
	 * 
	 * @param modelName
	 * @return
	 */
	YView getViewMetadata(String modelName);

	/**
	 * Returns the YViewSet for the given model name.
	 * 
	 * @param modelName
	 * @return
	 */
	YViewSet getViewSetMetadata(String modelName);

	/**
	 * Returns a list with all packages of all IDEViews.
	 * @return
	 */
	List<String> getIDEViewPackages();
	
	/**
	 * Returns a list with all packages of all MobileViews.
	 * @return
	 */
	List<String> getMobileViewPackages();
	
}
