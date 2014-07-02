package org.lunifera.ecview.dsl.name;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

public class UiQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof YEmbeddable) {
			YEmbeddable yEmb = (YEmbeddable) obj;
			return QualifiedName.create(yEmb.getName());
		}

		return super.getFullyQualifiedName(obj);
	}

}
