package org.lunifera.ecview.model.uiConfigs.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.lunifera.ecview.model.uiConfigs.BindingMethod;
import org.lunifera.ecview.model.uiConfigs.TextFieldConfig;
import org.lunifera.ecview.model.uiConfigs.UiConfigsFactory;

public class ConfigResource extends ResourceImpl {

	private TextFieldConfig config;

	public ConfigResource(URI uri) {
		super(uri);
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		
	}
	
	@Override
	public void load(Map<?, ?> options) throws IOException {
		if (!isLoaded) {
			load(null, options);
		}
	}

	@Override
	public EObject getEObject(String uriFragment) {

		if (config == null) {
			config = UiConfigsFactory.eINSTANCE.createTextFieldConfig();
			config.getBindingMethods().add(createMethod("readonly"));
			config.getBindingMethods().add(createMethod("visible"));
			config.getBindingMethods().add(createMethod("enabled"));
			config.getBindingMethods().add(createMethod("value"));
		}

		return config;
	}

	private BindingMethod createMethod(String string) {
		BindingMethod method = UiConfigsFactory.eINSTANCE.createBindingMethod();
		method.setName(string);
		return method;
	}
}
