/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uimodel.validation;

import org.lunifera.ecview.semantic.uisemantics.UxAction;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiExposedAction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiExposedActionValidator {
	boolean validate();

	boolean validateActionReference(UxAction value);
	boolean validateActionID(String value);

	boolean validateIconName(String value);

	boolean validateCheckDirty(boolean value);

	boolean validateExternalCommandId(String value);

	boolean validateImagePath(String value);
}
