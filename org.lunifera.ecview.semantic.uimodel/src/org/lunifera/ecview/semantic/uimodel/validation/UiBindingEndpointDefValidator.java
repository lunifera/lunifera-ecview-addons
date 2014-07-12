/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uimodel.validation;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

import org.lunifera.ecview.semantic.uimodel.UiBindable;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;

import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiBindingEndpointDefValidator {
	boolean validate();

	boolean validateBindable(UiBindable value);

	boolean validateBindable(YElement value);
	boolean validateSemanticEndpoint(UxEndpointDef value);

	boolean validateEndpoint(UxEndpointDef value);
	boolean validatePath(UiPathSegment value);
}
