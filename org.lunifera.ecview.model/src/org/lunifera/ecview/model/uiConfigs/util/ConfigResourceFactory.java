package org.lunifera.ecview.model.uiConfigs.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class ConfigResourceFactory implements Resource.Factory {
	
	public ConfigResourceFactory(){
		
	}

	@Override
	public Resource createResource(URI uri) {
		return new ConfigResource(uri);
	}

}
