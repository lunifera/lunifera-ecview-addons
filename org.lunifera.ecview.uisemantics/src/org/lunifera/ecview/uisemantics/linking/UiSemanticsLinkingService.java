package org.lunifera.ecview.uisemantics.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.lunifera.ecview.semantic.uisemantics.UiSemanticsPackage;
import org.lunifera.ecview.semantic.uisemantics.UxEPackageImport;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

public class UiSemanticsLinkingService extends DefaultLinkingService {

	@Inject
	private ResourceDescriptionsProvider descriptionsProvider;

	@Inject
	private IValueConverterService valueConverterService;

	@Inject
	private IGlobalScopeProvider scopeProvider;

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref,
			INode node) throws IllegalNodeException {
		if (ref == UiSemanticsPackage.eINSTANCE.getUxEPackageImport_EPackage()) {
			return getPackage((UxEPackageImport) context, (ILeafNode) node);
		}

		return super.getLinkedObjects(context, ref, node);
	}

	private List<EObject> getPackage(UxEPackageImport context, ILeafNode text) {
		String nsUri = getMetamodelNsURI(text);
		if (nsUri == null)
			return Collections.emptyList();
		// Grammar grammar = GrammarUtil.getGrammar(context);
		// Set<Grammar> visitedGrammars = new HashSet<Grammar>();
		// for (Grammar usedGrammar: grammar.getUsedGrammars()) {
		// List<EObject> result = getPackage(nsUri, usedGrammar,
		// visitedGrammars);
		// if (result != null)
		// return result;
		// }
		// QualifiedName packageNsURI = QualifiedName.create(nsUri);
		// EPackage pack = findPackageInScope(context, packageNsURI);
		EPackage pack = loadEPackage(nsUri, context.eResource()
				.getResourceSet());
		// if (pack == null) {
		// pack = findPackageInAllDescriptions(context, packageNsURI);
		// if (pack == null) {
		// pack = loadEPackage(nsUri, context.eResource().getResourceSet());
		// }
		// }
		if (pack != null)
			return Collections.<EObject> singletonList(pack);
		return Collections.emptyList();
	}

	private EPackage loadEPackage(String resourceOrNsURI,
			ResourceSet resourceSet) {
		if (resourceSet.getPackageRegistry().containsKey(resourceOrNsURI))
			return resourceSet.getPackageRegistry()
					.getEPackage(resourceOrNsURI);
		URI uri = URI.createURI(resourceOrNsURI);
		try {
			if ("http".equalsIgnoreCase(uri.scheme()))
				return null;
			if (uri.fragment() == null) {
				Resource resource = resourceSet.getResource(uri, true);
				if (resource.getContents().isEmpty())
					return null;
				EPackage result = (EPackage) resource.getContents().get(0);
				return result;
			}
			EPackage result = (EPackage) resourceSet.getEObject(uri, true);
			return result;
		} catch (RuntimeException ex) {
			if (uri.isPlatformResource()) {
				String platformString = uri.toPlatformString(true);
				URI platformPluginURI = URI.createPlatformPluginURI(
						platformString, true);
				return loadEPackage(platformPluginURI.toString(), resourceSet);
			}
			// log.trace("Cannot load package with URI '" + resourceOrNsURI +
			// "'", ex);
			return null;
		}
	}

	private EPackage findPackageInAllDescriptions(EObject context,
			QualifiedName packageNsURI) {
		IResourceDescriptions descriptions = descriptionsProvider
				.getResourceDescriptions(context.eResource());
		if (descriptions != null) {
			Iterable<IEObjectDescription> exported = descriptions
					.getExportedObjects(EcorePackage.Literals.EPACKAGE,
							packageNsURI, false);
			for (IEObjectDescription candidate : exported) {
				if (isNsUriIndexEntry(candidate)) {
					EPackage result = getResolvedEPackage(candidate, context);
					if (result != null)
						return result;
				}
			}
		}
		return null;
	}

	private String getMetamodelNsURI(ILeafNode text) {
		try {
			return (String) valueConverterService.toValue(text.getText(),
					getLinkingHelper()
							.getRuleNameFrom(text.getGrammarElement()), text);
		} catch (ValueConverterException e) {
			// log.debug("Exception on leaf '" + text.getText() + "'", e);
			return null;
		}
	}

	private EPackage findPackageInScope(EObject context,
			QualifiedName packageNsURI) {
		IScope scopedPackages = scopeProvider.getScope(context.eResource(),
				UiSemanticsPackage.Literals.UX_EPACKAGE_IMPORT__EPACKAGE,
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription input) {
						return isNsUriIndexEntry(input);
					}
				});
		IEObjectDescription description = scopedPackages
				.getSingleElement(packageNsURI);
		if (description != null) {
			return getResolvedEPackage(description, context);
		}
		return null;
	}

	private EPackage getResolvedEPackage(IEObjectDescription description,
			EObject context) {
		EObject resolved = EcoreUtil.resolve(description.getEObjectOrProxy(),
				context);
		if (resolved != null && !resolved.eIsProxy()
				&& resolved instanceof EPackage)
			return (EPackage) resolved;
		return null;
	}

	private boolean isNsUriIndexEntry(IEObjectDescription candidate) {
		return Boolean.TRUE.toString().equalsIgnoreCase(
				candidate.getUserData("nsURI"));
	}
}
