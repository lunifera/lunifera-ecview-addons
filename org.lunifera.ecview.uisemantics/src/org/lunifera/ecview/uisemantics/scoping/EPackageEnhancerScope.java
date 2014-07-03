package org.lunifera.ecview.uisemantics.scoping;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

public class EPackageEnhancerScope extends AbstractScope {

	private IScope parentScope;
	private EObject context;

	protected EPackageEnhancerScope(IScope parentScope, EObject context) {
		super(IScope.NULLSCOPE, true);
		this.parentScope = parentScope;
		this.context = context;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		Map<String, IEObjectDescription> result = new HashMap<String, IEObjectDescription>();
		for (IEObjectDescription ePkgDesc : parentScope.getAllElements()) {
			EPackage ePkg = (EPackage) ePkgDesc.getEObjectOrProxy();
			ePkg = (EPackage) EcoreUtil.resolve(ePkg, context);
			result.put(ePkg.getNsURI(),
					EObjectDescription.create(ePkg.getNsURI(), ePkg));
		}
		return result.values();
	}
}
