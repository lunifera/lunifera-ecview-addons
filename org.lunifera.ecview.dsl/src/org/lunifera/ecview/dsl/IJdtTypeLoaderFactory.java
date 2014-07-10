package org.lunifera.ecview.dsl;

import org.eclipse.emf.ecore.resource.ResourceSet;

public interface IJdtTypeLoaderFactory {

	IJdtTypeLoader createJdtTypeLoader(ResourceSet resourceSet);

}
