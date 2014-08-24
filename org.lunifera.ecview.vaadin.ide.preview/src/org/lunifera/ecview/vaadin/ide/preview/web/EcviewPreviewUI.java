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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.services.IWidgetAssocationsService;
import org.eclipse.emf.ecp.ecview.common.tooling.IWidgetMouseClickService;
import org.eclipse.emf.ecp.ecview.common.types.ITypeProviderService;
import org.lunifera.ecview.vaadin.ide.preview.Activator;
import org.lunifera.runtime.web.ecview.presentation.vaadin.VaadinRenderer;
import org.lunifera.runtime.web.vaadin.databinding.VaadinObservables;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.ErrorHandler;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.Reindeer;

@SuppressWarnings("serial")
@Theme("mobiletheme")
@Widgetset("org.lunifera.mobile.vaadin.widgetset.LuniferaMobileWidget")
@PreserveOnRefresh
@Title("Vaadin Mobile Preview")
@Push
public class EcviewPreviewUI extends UI {

	private IViewContext context;
	private CssLayout layout;

	private ECViewTypeProviderAdapter classLoadingHelper = new ECViewTypeProviderAdapter();
	private Component selectedComponent;

	@Override
	protected void init(VaadinRequest request) {
		setErrorHandler(new ErrorHandler() {
			@Override
			public void error(com.vaadin.server.ErrorEvent event) {
				if (EcviewPreviewUI.this.isClosing()
						|| !EcviewPreviewUI.this.isAttached()) {
					return;
				}
				UI.setCurrent(EcviewPreviewUI.this);
				disconnectAndClose(event.getThrowable());
			}
		});

		if (!Activator.getDefault().setPreviewUI(this)) {
			close();
			return;
		}

		setStyleName(Reindeer.LAYOUT_BLUE);
		VaadinObservables.getRealm(getUI());

		layout = new CssLayout();
		layout.setSizeFull();
		setContent(layout);

		modelChanged();
	}

	public void modelChanged() {
		access(new Runnable() {
			@Override
			public void run() {
				VaadinObservables.activateRealm(getUI());
				try {
					selectedComponent = null;
					if (context != null) {
						disposeContext();
					}
				} catch (Exception e) {
					// nothing to do
				}

				if (Activator.getDefault().getActiveView() != null) {
					// ... and render
					VaadinRenderer renderer = new VaadinRenderer();
					try {
						Map<String, Object> params = new HashMap<>();
						Map<String, Object> services = new HashMap<>();
						params.put(IViewContext.PARAM_SERVICES, services);
						services.put(ITypeProviderService.class.getName(),
								classLoadingHelper);

						YView view = Activator.getDefault().getActiveView();
						context = renderer.render(layout, view, params);

						registerBeans(view);

						if (Activator.getDefault().isLinkedWithEditor()) {
							installSourceViewSelectionSupport();
						}

					} catch (Exception e) {
						// nothing to do
					}
				} else {
					layout.addComponent(new Label("No viewmodel available yet!"));
				}
			}

			/**
			 * Register all available beans.
			 * 
			 * @param view
			 */
			private void registerBeans(YView view) {
				for (YBeanSlot slot : view.getBeanSlots()) {
					Class<?> bean = slot.getValueType();
					if (bean != null) {
						try {
							Constructor<?> constructor = bean.getConstructor();
							if (!constructor.isAccessible()) {
								constructor.setAccessible(true);
							}

							Object beanInstance = constructor.newInstance();

							try {
								Method m = bean.getMethod("ecviewInitialize");
								m.invoke(beanInstance);
							} catch (Exception e) {
								// nothing to do
							}

							context.setBean(slot.getName(), beanInstance);

						} catch (NoSuchMethodException e) {
						} catch (SecurityException e) {
						} catch (InstantiationException e) {
						} catch (IllegalAccessException e) {
						} catch (IllegalArgumentException e) {
						} catch (InvocationTargetException e) {
						}
					}
				}
			}
		});
	}

	/**
	 * Disconnect the current UI and close it.
	 * 
	 * @param e
	 */
	private void disconnectAndClose(Throwable e) {
		disposeContext();

		error(e.toString());
		Activator.getDefault().setPreviewUI(null);
		EcviewPreviewUI.this.close();
	}

	/**
	 * Installs the selection support that updates the xtext editor with the
	 * current selected widget.
	 */
	private void installSourceViewSelectionSupport() {
		IWidgetMouseClickService clickService = context
				.getService(IWidgetMouseClickService.ID);
		clickService.addListener(new IWidgetMouseClickService.Listener() {
			@Override
			public void clicked(Object modelElement) {
				Activator.getDefault().selectInXtextEditor(
						(EObject) modelElement);
			}
		});
	}

	public void selectedObject(final EObject element) {
		if (context == null) {
			return;
		}

		context.exec(new Runnable() {
			@Override
			public void run() {
				if (selectedComponent != null) {
					selectedComponent.removeStyleName("lun-tooling-selected");
					selectedComponent = null;
				}

				IWidgetAssocationsService service = context
						.getService(IWidgetAssocationsService.ID);
				selectedComponent = (Component) service.getWidget(element);
				if (selectedComponent != null) {
					selectedComponent.addStyleName("lun-tooling-selected");
				}
			}
		});
	}

	public void error(String value) {
		Notification.show(value, Notification.Type.ERROR_MESSAGE);
	}

	/**
	 * Disposes the current context.
	 */
	private void disposeContext() {
		if (context == null) {
			return;
		}

		context.dispose();
		context = null;
		layout.removeAllComponents();
	}

	/**
	 * Loads classes from the workspace.
	 */
	private static class ECViewTypeProviderAdapter implements
			ITypeProviderService {

		@Override
		public Class<?> forName(Object clazz, String qualifiedName) {
			if (clazz instanceof EClass) {

				if (clazz == ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATOR) {
					return Activator.getDefault().getXtextUtilService()
							.reloadClass(qualifiedName);
				}
			}
			return null;
		}
	}
}
