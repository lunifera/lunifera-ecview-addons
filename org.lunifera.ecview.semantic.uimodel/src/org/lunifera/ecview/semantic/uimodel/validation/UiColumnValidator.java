/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uimodel.validation;

import org.eclipse.xtext.common.types.JvmOperation;

import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiColumn}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiColumnValidator {
	boolean validate();

	boolean validateGetter(JvmOperation value);
	boolean validateIconName(String value);
	boolean validateVisible(boolean value);
	boolean validateOrderable(boolean value);
	boolean validateCollapsed(boolean value);
	boolean validateCollapsible(boolean value);
	boolean validateAlignment(UiFlatAlignment value);
	boolean validateExpandRatio(float value);
}
