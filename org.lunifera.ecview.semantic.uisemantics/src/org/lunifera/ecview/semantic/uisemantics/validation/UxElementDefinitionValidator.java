/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uisemantics.validation;

import org.lunifera.ecview.semantic.uisemantics.UxAvailableBindings;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableValidatorProperties;
import org.lunifera.ecview.semantic.uisemantics.UxAvailableVisibilityOptions;
import org.lunifera.ecview.semantic.uisemantics.UxElementURI;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uisemantics.UxElementDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UxElementDefinitionValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateUri(UxElementURI value);
	boolean validateBindingContainer(UxAvailableBindings value);
	boolean validateVisibilityContainer(UxAvailableVisibilityOptions value);

	boolean validateValidatorContainer(UxAvailableValidatorProperties value);
}