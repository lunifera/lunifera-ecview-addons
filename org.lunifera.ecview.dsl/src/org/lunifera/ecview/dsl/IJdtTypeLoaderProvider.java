package org.lunifera.ecview.dsl;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IJdtTypeLoaderProvider {

	IJdtTypeLoader get(ResourceSet resourceSet);

}
