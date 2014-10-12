/**
 *
 * $Id$
 */
package org.lunifera.ecview.semantic.uimodel.validation;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;


/**
 * A sample validator interface for {@link org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UiBeanReferenceFieldValidator {
	boolean validate();

	boolean validateCaptionProperty(UiNestedProperty value);

	boolean validateImageProperty(UiNestedProperty value);

	boolean validateInMemoryBeanProvider(JvmTypeReference value);

	boolean validateDescriptionProperty(UiNestedProperty value);

	boolean validateInMemoryService(JvmTypeReference value);

	boolean validateInMemoryService(Class<?> value);

	boolean validateInMemoryServiceTypeName(String value);

}
