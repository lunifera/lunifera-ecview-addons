package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.lunifera.ecview.semantic.uimodel.UiModel;

import com.google.inject.Inject;

public class UiImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> temp = new ArrayList<ImportNormalizer>(
				super.getImplicitImports(ignoreCase));
		temp.add(new ImportNormalizer(qualifiedNameConverter
				.toQualifiedName("java.util"), true, ignoreCase));
		temp.add(new ImportNormalizer(qualifiedNameConverter
				.toQualifiedName("java.lang"), true, ignoreCase));
		temp.add(new ImportNormalizer(qualifiedNameConverter
				.toQualifiedName("org.lunifera.ui.common"), true, ignoreCase));
		return temp;
	}

	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {
		List<ImportNormalizer> result = new ArrayList<ImportNormalizer>(
				super.internalGetImportedNamespaceResolvers(context, ignoreCase));

		String packageName = getPackage(context);
		if (packageName != null && !packageName.equals("")) {
			result.add(new ImportNormalizer(qualifiedNameConverter
					.toQualifiedName(packageName), true, ignoreCase));
		}

		return result;
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
