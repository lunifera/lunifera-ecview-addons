package org.lunifera.ecview.dsl.ui.quickfix.typesloader;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.lunifera.ecview.dsl.IJdtTypeLoader;
import org.lunifera.ecview.dsl.IJdtTypeLoaderFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class JdtTypeLoaderFactory implements IJdtTypeLoaderFactory {

	@Inject
	private IJavaProjectProvider javaProjectProvider;

	public IJdtTypeLoader createJdtTypeLoader(ResourceSet resourceSet) {
		if (resourceSet == null)
			throw new IllegalArgumentException("resourceSet may not be null.");
		IJavaProject javaProject = javaProjectProvider
				.getJavaProject(resourceSet);
		IJdtTypeLoader result = createJdtTypeLoader(javaProject, resourceSet);
		return result;
	}

	public IJdtTypeLoader createJdtTypeLoader(IJavaProject javaProject,
			ResourceSet resourceSet) {
		return new JdtTypeLoader(javaProject, resourceSet);
	}

}
