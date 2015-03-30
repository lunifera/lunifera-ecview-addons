/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
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
