package org.lunifera.ecview.uisemantics.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

public class QualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof EPackage) {
			EPackage pkg = (EPackage) obj;
			return QualifiedName.create(pkg.getNsURI());
		}

		return super.getFullyQualifiedName(obj);
	}

}
