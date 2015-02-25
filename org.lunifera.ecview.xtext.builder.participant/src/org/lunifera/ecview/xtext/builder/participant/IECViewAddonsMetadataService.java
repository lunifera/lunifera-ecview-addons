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
	 * Returns a filtered list with all names of IDEViews.
	 * <p>
	 * If package <code>null</code> is passed and
	 * <code>includeChildren == true</code>, then all views are returned.<br>
	 * If package <code>null</code> is passed and <code>includeChildren ==
	 * false</code>, then only views of the most common packages are returned.
	 * What means, if a view is found in "org.lunifera.sample" then views from
	 * "org.lunifera.sample.general" are skipped.
	 * 
	 * @param packageName
	 *            - the package name the views need to be located in.
	 * @param includeChildren
	 *            - if true, then also child packages are queried
	 * @return
	 */
	List<String> getIDEViewNames(String packageName, boolean includeChildren);

	/**
	 * Returns a filtered list with all names of MobileViews.
	 * <p>
	 * If package <code>null</code> is passed and
	 * <code>includeChildren == true</code>, then all views are returned.<br>
	 * If package <code>null</code> is passed and <code>includeChildren ==
	 * false</code>, then only views of the most common packages are returned.
	 * What means, if a view is found in "org.lunifera.sample" then views from
	 * "org.lunifera.sample.general" are skipped.
	 * 
	 * @param packageName
	 *            - the package name the views need to be located in.
	 * @param includeChildren
	 *            - if true, then also child packages are queried
	 * @return
	 */
	List<String> getMobileViewNames(String packageName, boolean includeChildren);

}
