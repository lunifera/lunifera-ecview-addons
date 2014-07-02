package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

import com.google.inject.Inject;

public class UiImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		List<ImportNormalizer> temp = new ArrayList<ImportNormalizer>();
		temp.add(new ImportNormalizer(qualifiedNameConverter
				.toQualifiedName("TextField"), true, ignoreCase));
		temp.add(new ImportNormalizer(qualifiedNameConverter
				.toQualifiedName("List"), true, ignoreCase));
		return temp;
	}

	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {
		return super.internalGetImportedNamespaceResolvers(context, ignoreCase);
	}
}
