/**
 * Copyright 2013 Lunifera GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lunifera.ecview.vaadin.ide.preview.web;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.lunifera.ecview.vaadin.ide.preview.Activator;
import org.lunifera.ecview.vaadin.ide.preview.IModelChangedListener;
import org.lunifera.runtime.web.ecview.presentation.vaadin.VaadinRenderer;
import org.lunifera.runtime.web.vaadin.databinding.VaadinObservables;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.Reindeer;

@SuppressWarnings("serial")
@Theme(Reindeer.THEME_NAME)
@Push
public class EcviewPreviewUI extends UI implements IModelChangedListener {

	private IViewContext context;
	private CssLayout layout;

	@Override
	protected void init(VaadinRequest request) {

		setStyleName(Reindeer.LAYOUT_BLACK);
		VaadinObservables.getRealm(getUI());

		layout = new CssLayout();
		layout.setSizeFull();
		setContent(layout);

		Activator.getDefault().addModelChangedListener(this);
	}

	@Override
	public void modelChanged() {
		access(new Runnable() {
			@Override
			public void run() {
				synchronized (EcviewPreviewUI.this) {
					
					VaadinObservables.activateRealm(getUI());
					
					try {
						if (context != null) {
							context.dispose();
							context = null;
							layout.removeAllComponents();
						}
					} catch (Exception e1) {
					}

					if (Activator.getDefault().getActiveView() != null) {
						// ... and render
						VaadinRenderer renderer = new VaadinRenderer();
						try {
							context = renderer.render(layout, EcoreUtil
									.copy(Activator.getDefault()
											.getActiveView()), null);
						} catch (ContextException e) {
							layout.addComponent(new Label(e.toString()));
						}
					} else {
						layout.addComponent(new Label(
								"No viewmodel available yet!"));
					}
				}
			}
		});

	}
}
