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
package org.lunifera.ecview.dsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.lunifera.ecview.dsl.ui.hover.UiGrammarHoverDocumentationProvider;
import org.lunifera.ide.core.api.i18n.II18nRegistry;
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderFactory;
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderProvider;
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoaderFactory;
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoaderProvider;
import org.lunifera.xtext.builder.ui.access.jdt.impl.JdtTypeLoaderFactory;
import org.lunifera.xtext.builder.ui.access.jdt.impl.JdtTypeLoaderProvider;

import com.google.inject.Binder;
import com.google.inject.Singleton;

/**
 * Use this class to register components to be used within the IDE.
 */
@SuppressWarnings("restriction")
public class UIGrammarUiModule extends
		org.lunifera.ecview.dsl.ui.AbstractUIGrammarUiModule {
	public UIGrammarUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public void configureITypeLoaderFactory(Binder binder) {
		binder.bind(ITypeLoaderFactory.class).to(JdtTypeLoaderFactory.class)
				.in(Singleton.class);
		binder.bind(IJdtTypeLoaderFactory.class).to(JdtTypeLoaderFactory.class)
				.in(Singleton.class);
	}

	public void configureITypeLoaderProvider(Binder binder) {
		binder.bind(ITypeLoaderProvider.class).to(JdtTypeLoaderProvider.class)
				.in(Singleton.class);
		binder.bind(IJdtTypeLoaderProvider.class)
				.to(JdtTypeLoaderProvider.class).in(Singleton.class);
	}
 
	public Class<? extends org.eclipse.xtext.ui.editor.hover.html.IEObjectHoverDocumentationProvider> bindIEObjectHoverDocumentationProvider() {
		return UiGrammarHoverDocumentationProvider.class;
	}
 
	public com.google.inject.Provider<II18nRegistry> provideII18nRegistry() {
		return org.lunifera.ide.core.ui.shared.Access.getII18nRegistry();
	}

}
