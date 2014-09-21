/*
 * generated by Xtext
 */
package org.lunifera.ecview.uisemantics;

import org.lunifera.dsl.xtext.types.bundles.BundleSpaceTypeProviderFactory;
import org.lunifera.dsl.xtext.types.bundles.BundleSpaceTypeScopeProvider;
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderFactory;
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderProvider;
import org.lunifera.xtext.builder.types.loader.runtime.TypeLoaderFactory;
import org.lunifera.xtext.builder.types.loader.runtime.TypeLoaderProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class UISemanticsGrammarBundleSpaceRuntimeModule extends
		UISemanticsGrammarRuntimeModule {

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return BundleSpaceTypeProviderFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return BundleSpaceTypeScopeProvider.class;
	}

	public Class<? extends ITypeLoaderFactory> bindITypeLoaderFactory() {
		return TypeLoaderFactory.class;
	}

	public Class<? extends ITypeLoaderProvider> ITypeLoaderProvider() {
		return TypeLoaderProvider.class;
	}

}
