/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uimodel.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiExposedAction;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiContext}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiContextValidator {
	boolean validate();

	boolean validateBeanSlots(EList<UiBeanSlot> value);
	boolean validateBindingEndpointAlias(EList<UiBindingEndpointAlias> value);
	boolean validateBindings(EList<UiBinding> value);

	boolean validateSharedStateGroup(String value);

	boolean validateExposedActions(EList<UiExposedAction> value);
}
