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
package org.lunifera.ecview.dsl;

import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;
import org.lunifera.ecview.dsl.derivedstate.UiModelDerivedStateComputerx;
import org.lunifera.ecview.dsl.name.UiQualifiedNameProvider;
import org.lunifera.ecview.dsl.scope.ScopeProvider;
import org.lunifera.ecview.dsl.scope.UiImportedNamespaceAwareLocalScopeProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class UIGrammarRuntimeModule extends
		org.lunifera.ecview.dsl.AbstractUIGrammarRuntimeModule {

	public Class<? extends org.eclipse.xtext.resource.IDerivedStateComputer> bindIDerivedStateComputer() {
		return UiModelDerivedStateComputerx.class;
	}

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return ScopeProvider.class;
	}

	@Override
	public Class<? extends XbaseBatchScopeProvider> bindXbaseBatchScopeProvider() {
		return ScopeProvider.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class)
				.annotatedWith(
						Names.named("org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.delegate"))
				.to(UiImportedNamespaceAwareLocalScopeProvider.class);
	}

	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return UiQualifiedNameProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return org.lunifera.ecview.dsl.formatting.UIGrammarFormatter.class;
	}
}
