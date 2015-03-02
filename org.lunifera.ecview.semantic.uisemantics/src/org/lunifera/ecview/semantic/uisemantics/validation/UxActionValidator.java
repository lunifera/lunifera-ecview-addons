/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uisemantics.validation;


/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uisemantics.UxAction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UxActionValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateExternalCommandId(String value);

	boolean validateInitialDisabled(boolean value);

	boolean validateInitialEnabled(boolean value);
}
