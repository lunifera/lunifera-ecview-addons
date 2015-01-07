/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uisemantics.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xtype.XImportSection;

import org.lunifera.ecview.semantic.uisemantics.UxAction;
import org.lunifera.ecview.semantic.uisemantics.UxElementDefinition;

/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uisemantics.UxModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UxModelValidator {
	boolean validate();

	boolean validateImportSection(XImportSection value);
	boolean validateElementDefinitions(EList<UxElementDefinition> value);

	boolean validateViewActions(EList<UxAction> value);
}
