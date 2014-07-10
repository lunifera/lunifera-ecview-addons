package org.lunifera.ecview.dsl.name;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;

public class UiQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof YEmbeddable) {
			YEmbeddable yEmb = (YEmbeddable) obj;
			return yEmb.getName() != null ? QualifiedName
					.create(yEmb.getName()) : QualifiedName
					.create("underConstruction");
		} else if (obj instanceof UiBindingEndpointAlias) {
			UiBindingEndpointAlias uiElement = (UiBindingEndpointAlias) obj;
			return uiElement.getAlias() != null ? QualifiedName
					.create(uiElement.getAlias()) : QualifiedName
					.create("underConstruction");
		} else if (obj instanceof YValidator) {
			YValidator uiElement = (YValidator) obj;
			return uiElement.getName() != null ? QualifiedName.create(uiElement
					.getName()) : QualifiedName.create("underConstruction");
		}
		return super.getFullyQualifiedName(obj);
	}

}
