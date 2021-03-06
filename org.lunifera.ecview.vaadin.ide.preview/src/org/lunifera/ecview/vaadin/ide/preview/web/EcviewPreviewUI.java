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
package org.lunifera.ecview.vaadin.ide.preview.web;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.lunifera.ecview.core.common.context.I18nAdapter;
import org.lunifera.ecview.core.common.context.II18nService;
import org.lunifera.ecview.core.common.context.IViewContext;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.validation.ValidationPackage;
import org.lunifera.ecview.core.common.model.visibility.VisibilityPackage;
import org.lunifera.ecview.core.common.services.IWidgetAssocationsService;
import org.lunifera.ecview.core.common.tooling.IWidgetMouseClickService;
import org.lunifera.ecview.core.common.types.ITypeProviderService;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.vaadin.ide.preview.Activator;
import org.lunifera.ecview.vaadin.ide.preview.parts.IDEPreviewHandler;
import org.lunifera.ide.core.api.i18n.II18nRegistry;
import org.lunifera.ide.core.api.i18n.II18nRegistry.Proposal;
import org.lunifera.ide.core.ui.util.CoreUiUtil;
import org.lunifera.runtime.web.ecview.presentation.vaadin.VaadinRenderer;
import org.lunifera.runtime.web.vaadin.databinding.VaadinObservables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
@Theme(Reindeer.THEME_NAME)
@Widgetset("org.lunifera.runtime.web.vaadin.widgetset.LuniferaWidget")
@PreserveOnRefresh
@Title("Vaadin IDE Preview")
@Push
public class EcviewPreviewUI extends UI {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EcviewPreviewUI.class);

	private IViewContext context;
	private CssLayout layout;

	private ECViewTypeProviderAdapter classLoadingHelper = new ECViewTypeProviderAdapter();
	private Component selectedComponent;

	private boolean worksWithCopy;

	protected boolean buildNotificationSent;

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

		if (!Activator.getIDEPreviewHandler().setPreviewUI(this)) {
			worksWithCopy = true;
		}

		setStyleName(Reindeer.LAYOUT_BLUE);
		VaadinObservables.getRealm(getUI());

		layout = new CssLayout();
		layout.setSizeFull();
		setContent(layout);

		modelChanged();
	}

	protected void refresh(VaadinRequest request) {
		modelChanged();
	}

	public void modelChanged() {
		access(new Runnable() {
			@SuppressWarnings("restriction")
			@Override
			public void run() {
				VaadinObservables.activateRealm(getUI());
				try {
					selectedComponent = null;
					if (context != null) {
						disposeContext();
					}
				} catch (Exception e) {
					LOGGER.error("{}", e);
				}

				if (Activator.getIDEPreviewHandler().getActiveView() != null) {
					if (Activator.getIDEPreviewHandler().isShowLayoutBounds()) {
						layout.addStyleName("l-debug-show-layout-bounds");
					} else {
						layout.removeStyleName("l-debug-show-layout-bounds");
					}

					// ... and render
					VaadinRenderer renderer = new VaadinRenderer();
					try {
						Map<String, Object> params = new HashMap<String, Object>();
						Map<String, Object> services = new HashMap<String, Object>();
						params.put(IViewContext.PARAM_SERVICES, services);
						services.put(ITypeProviderService.class.getName(),
								classLoadingHelper);
						services.put(II18nService.class.getName(),
								new I18nProvider());

						YView view = Activator.getIDEPreviewHandler()
								.getActiveView();
						if (worksWithCopy) {
							view = EcoreUtil.copy(view);
						}

						context = renderer.render(layout, view, params);

						registerBeans(view);

						// Notify the eclipse view, about the new rendered view.
						// So the part can install the exposed actions.
						Activator.getIDEPreviewHandler().notifyNewViewRendered(
								context);

						if (Activator.getIDEPreviewHandler()
								.isLinkedWithEditor()) {
							installSourceViewSelectionSupport();
						}

						Workspace ws = (Workspace) Activator.getDefault()
								.getWorkspace();
						if (!buildNotificationSent
								&& ws.getBuildManager()
										.isAutobuildBuildPending()) {
							buildNotificationSent = true;
							context.exec(new Runnable() {
								@Override
								public void run() {
									Notification
											.show("Build is not finished yet. So labels and icons may not be initialized properly.",
													Notification.Type.TRAY_NOTIFICATION);
								}
							});
						}

					} catch (Exception e) {
						LOGGER.error("{}", e);
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
					if (slot.getName().startsWith("ecview")) {
						continue;
					}
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
		Activator.getIDEPreviewHandler().setPreviewUI(null);
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
				Activator.getIDEPreviewHandler().selectInXtextEditor(
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

	public void warn(String value) {
		Notification.show(value, Notification.Type.WARNING_MESSAGE);
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
				} else if (clazz == VisibilityPackage.Literals.YVISIBILITY_PROCESSOR) {
					return Activator.getDefault().getXtextUtilService()
							.reloadClass(qualifiedName);
				}
			}
			return null;
		}
	}

	/**
	 * An internal I18nAdapter that delegates to the workspace.
	 */
	private class I18nProvider extends I18nAdapter {
		private II18nRegistry i18nRegistry;
		private CoreUiUtil util;

		public I18nProvider() {
			i18nRegistry = Activator.getDefault().getInjector()
					.getInstance(II18nRegistry.class);
			util = Activator.getDefault().getInjector()
					.getInstance(CoreUiUtil.class);
		}

		@Override
		public String getValue(String i18nKey, Locale locale) {
			IDEPreviewHandler handler = Activator.getIDEPreviewHandler();
			// get the grammar element for the YView
			UiView view = handler.getActiveViewFromGrammar();
			UiModel model = (UiModel) view.eContainer();

			// access the project with the view
			IProject project = util.getProject(view);

			// calculate best matching proposal
			Proposal proposal = i18nRegistry.findBestMatch(project, locale,
					model.getPackageName(), i18nKey);

			return proposal != null ? proposal.getI18nValue() : "";
		}
	}
}
