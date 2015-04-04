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
package org.lunifera.ecview.semantic.uimodel.validation;

import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRawBindablePathSegment;

import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiTypedBindableDefValidator {
	boolean validate();

	boolean validateRawBindable(UiRawBindable value);
	boolean validateRawBindablePath(UiRawBindablePathSegment value);
	boolean validateMethod(UxEndpointDef value);
}
