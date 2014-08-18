/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uimodel.validation;

import org.eclipse.xtext.common.types.JvmField;
import org.lunifera.ecview.semantic.uimodel.UiSelectionType;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiComboBox}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiComboBoxValidator {
	boolean validate();

	boolean validateItemCaptionProperty(JvmField value);

	boolean validateItemImageProperty(JvmField value);

	boolean validateSelectionType(UiSelectionType value);
}
