package org.lunifera.ecview.dsl.ui.quickfix.typesloader;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.lunifera.ecview.dsl.IJdtTypeLoader;
import org.lunifera.ecview.dsl.IJdtTypeLoaderFactory;
import org.lunifera.ecview.dsl.IJdtTypeLoaderProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class JdtTypeLoaderProvider implements IJdtTypeLoaderProvider {

	@Inject
	private IJavaProjectProvider javaProjectProvider;

	@Inject
	private IJdtTypeLoaderFactory factory;

	private Map<WeakReference<IJavaProject>, IJdtTypeLoader> loaders = new HashMap<WeakReference<IJavaProject>, IJdtTypeLoader>(
			3);

	private ReferenceQueue<IJavaProject> referenceQueue = new ReferenceQueue<IJavaProject>();

	@Override
	public IJdtTypeLoader get(ResourceSet resourceSet) {
		IJavaProject project = javaProjectProvider.getJavaProject(resourceSet);
		if (project == null) {
			return null;
		}

		IJdtTypeLoader loader = null;
		synchronized (loaders) {
			cleanUp();

			if (loaders.containsKey(project)) {
				loader = loaders.get(project);
			} else {
				loader = factory.createJdtTypeLoader(resourceSet);
				loaders.put(new WeakReference<IJavaProject>(project,
						referenceQueue), loader);
			}
		}

		return loader;
	}

	private void cleanUp() {
		while (true) {
			Reference<? extends IJavaProject> ref = referenceQueue.poll();
			if (ref == null) {
				break;
			}
			IJdtTypeLoader toDispose = loaders.get(ref);
			toDispose.dispose();
			loaders.remove(toDispose);
		}
	}

}
