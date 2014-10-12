package org.lunifera.ecview.uisemantics.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.ecview.semantic.uisemantics.UxAction;
import org.lunifera.ecview.semantic.uisemantics.UxEPackageImport;

import com.google.inject.Inject;

public class QualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter nameConverter;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof EPackage) {
			EPackage pkg = (EPackage) obj;
			return QualifiedName.create(pkg.getNsURI());
		} else if (obj instanceof UxEPackageImport) {
			UxEPackageImport pkg = (UxEPackageImport) obj;
			if (pkg.getAlias() != null && !pkg.getAlias().equals("")) {
				return QualifiedName.create(pkg.getAlias());
			} else {
				return QualifiedName.EMPTY;
			}
		} else if (obj instanceof UxAction) {
			return nameConverter.toQualifiedName(((UxAction) obj).getName());
		}

		return super.getFullyQualifiedName(obj);
	}

}
