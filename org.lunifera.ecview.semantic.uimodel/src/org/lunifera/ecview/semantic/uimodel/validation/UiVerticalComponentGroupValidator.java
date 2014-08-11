/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uimodel.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiVerticalComponentGroupValidator {
	boolean validate();

	boolean validateContents(EList<UiVerticalComponentGroupAssigment> value);
}
