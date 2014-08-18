package org.lunifera.ecview.dsl.name;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProperties;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class UiQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	IQualifiedNameConverter converter;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof UiEmbeddable) {
			UiEmbeddable yEmb = (UiEmbeddable) obj;
			if (yEmb.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return QualifiedName.create(yEmb.getName());
			}
		} else if (obj instanceof UiBindingEndpointAlias) {
			UiBindingEndpointAlias uiBindingEndpoint = (UiBindingEndpointAlias) obj;
			if (uiBindingEndpoint.getAlias() == null) {
				return QualifiedName.create("notDefined");
			} else {
				// return converter.toQualifiedName(String.format("%s.%s",
				// getPackage(uiBindingEndpoint),
				// uiBindingEndpoint.getAlias()));
				return converter.toQualifiedName(uiBindingEndpoint.getAlias());
			}
		} else if (obj instanceof UiValidatorAlias) {
			UiValidatorAlias validatorAlias = (UiValidatorAlias) obj;
			if (validatorAlias.getAlias() == null) {
				return QualifiedName.create("notDefined");
			} else {
				// return converter.toQualifiedName(String.format("%s.%s",
				// getPackage(validatorAlias), validatorAlias.getAlias()));
				return converter.toQualifiedName(validatorAlias.getAlias());
			}
		} else if (obj instanceof UiValidator) {
			UiValidator validatorAlias = (UiValidator) obj;
			if (validatorAlias.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				// return converter.toQualifiedName(String.format("%s.%s",
				// getPackage(validatorAlias), validatorAlias.getName()));
				return converter.toQualifiedName(validatorAlias.getName());
			}
		} else if (obj instanceof UiBeanSlot) {
			UiBeanSlot uiBeanSlot = (UiBeanSlot) obj;
			if (uiBeanSlot.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				// return converter.toQualifiedName(String.format("%s.%s",
				// getPackage(uiBeanSlot), uiBeanSlot.getName()));
				return converter.toQualifiedName(uiBeanSlot.getName());
			}
		} else if (obj instanceof UiValidatorAlias) {
			UiValidatorAlias uiValidator = (UiValidatorAlias) obj;
			if (uiValidator.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				// return converter.toQualifiedName(String.format("%s.%s",
				// getPackage(uiValidator), uiValidator.getName()));
				return converter.toQualifiedName(uiValidator.getName());
			}
		} else if (obj instanceof UiVisibilityProcessor) {
			UiVisibilityProcessor uiProcessor = (UiVisibilityProcessor) obj;
			if (uiProcessor.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				// return converter.toQualifiedName(String.format("%s.%s",
				// getPackage(uiProcessor), uiProcessor.getName()));
				return converter.toQualifiedName(uiProcessor.getName());
			}
		} else if (obj instanceof UiVisibilityProperties) {
			UiVisibilityProperties uiProperties = (UiVisibilityProperties) obj;
			if (uiProperties.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				// return converter.toQualifiedName(String.format("%s.%s",
				// getPackage(uiProperties), uiProperties.getName()));
				return converter.toQualifiedName(uiProperties.getName());
			}
		}
		return super.getFullyQualifiedName(obj);
	}

	/**
	 * Returns the package name.
	 * 
	 * @param eObject
	 * @return
	 */
	private String getPackage(EObject eObject) {
		if (eObject == null) {
			return "";
		}
		if (eObject instanceof UiModel) {
			return ((UiModel) eObject).getPackageName();
		} else {
			return getPackage(eObject.eContainer());
		}
	}

}
