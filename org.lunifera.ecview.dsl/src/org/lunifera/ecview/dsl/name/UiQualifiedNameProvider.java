package org.lunifera.ecview.dsl.name;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiErrorCode;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableRawType;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProperty;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class UiQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	IQualifiedNameConverter converter;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof UiView) {
			UiView yView = (UiView) obj;
			if (yView.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(String.format("%s.%s",
						getPackage(yView), yView.getName()));
			}
		} else if (obj instanceof UiEmbeddable) {
			UiEmbeddable yEmb = (UiEmbeddable) obj;
			if (yEmb.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(String.format("%s.%s",
						getPackage(yEmb), yEmb.getName()));
			}
		} else if (obj instanceof UiBindingEndpointAlias) {
			UiBindingEndpointAlias uiBindingEndpoint = (UiBindingEndpointAlias) obj;
			if (uiBindingEndpoint.getAlias() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(uiBindingEndpoint.getAlias());
			}
		} else if (obj instanceof UiTypedBindableRawType) {
			UiTypedBindableRawType uiBindingEndpoint = (UiTypedBindableRawType) obj;
			if (uiBindingEndpoint.getRawBindable() == null) {
				return QualifiedName.create("notDefined");
			} else {
				String pathString = uiBindingEndpoint.toPathString();
				return pathString != null ? converter
						.toQualifiedName(pathString) : QualifiedName.create("");
			}
		} else if (obj instanceof UiValidatorAlias) {
			UiValidatorAlias validatorAlias = (UiValidatorAlias) obj;
			if (validatorAlias.getAlias() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(validatorAlias.getAlias());
			}
		} else if (obj instanceof UiValidator) {
			UiValidator validatorAlias = (UiValidator) obj;
			if (validatorAlias.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(String.format("%s.%s",
						getPackage(validatorAlias), validatorAlias.getName()));
			}
		} else if (obj instanceof UiVisibilityProcessor) {
			UiVisibilityProcessor processor = (UiVisibilityProcessor) obj;
			if (getSimpleName(processor) == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(String.format("%s.%s",
						getPackage(processor), getSimpleName(processor)));
			}
		} else if (obj instanceof UiErrorCode) {
			UiErrorCode code = (UiErrorCode) obj;
			if (code.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				UiValidator yValidator = (UiValidator) code.eContainer();
				return converter
						.toQualifiedName(String.format("%s.%s.%s",
								getPackage(code), yValidator.getName(),
								code.getName()));
			}
		} else if (obj instanceof UiBeanSlot) {
			UiBeanSlot uiBeanSlot = (UiBeanSlot) obj;
			if (uiBeanSlot.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(uiBeanSlot.getName());
			}
		} else if (obj instanceof UiValidatorAlias) {
			UiValidatorAlias uiValidator = (UiValidatorAlias) obj;
			if (uiValidator.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(uiValidator.getName());
			}
		} else if (obj instanceof UiVisibilityProcessor) {
			UiVisibilityProcessor uiProcessor = (UiVisibilityProcessor) obj;
			if (getSimpleName(uiProcessor) == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(getSimpleName(uiProcessor));
			}
		} else if (obj instanceof UiVisibilityProperty) {
			UiVisibilityProperty uiProperties = (UiVisibilityProperty) obj;
			if (uiProperties.getName() == null) {
				return QualifiedName.create("notDefined");
			} else {
				return converter.toQualifiedName(uiProperties.getName());
			}
		} else if (obj instanceof UiI18nInfo) {
			UiI18nInfo i18nInfo = (UiI18nInfo) obj;
			UiEmbeddable parent = (UiEmbeddable) i18nInfo.eContainer();
			return converter.toQualifiedName(parent.getName() + ".i18n."
					+ i18nInfo.getKey());
		}
		return super.getFullyQualifiedName(obj);
	}

	protected String getSimpleName(UiVisibilityProcessor processor) {
		return StringExtensions.toFirstUpper(processor.getName())
				+ "VisibilityProcessor";
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
