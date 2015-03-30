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
package org.lunifera.ecview.uisemantics.ui.hover;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextElementLinks;
import org.eclipse.xtext.xbase.ui.hover.HoverLinkHelper;
import org.eclipse.xtext.xbase.ui.hover.XbaseDeclarativeHoverSignatureProvider;
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverDocumentationProvider;
import org.lunifera.ecview.semantic.uisemantics.UxBindingableOption;

@SuppressWarnings("all")
public class UiSemanticGrammarHoverDocumentationProvider extends XbaseHoverDocumentationProvider {
  @Inject
  private XbaseDeclarativeHoverSignatureProvider hoverSignatureProvider;
  
  @Inject
  protected IEObjectDocumentationProvider documentationProvider;
  
  public String computeDocumentation(final EObject object) {
    return this.getCustomDocumentation(object);
  }
  
  protected String _getCustomDocumentation(final EObject object) {
    return super.computeDocumentation(object);
  }
  
  protected String _getCustomDocumentation(final UxBindingableOption object) {
    String _documentation = this.documentationProvider.getDocumentation(object);
    String _plus = ("<p><b><i>description:</i></b> " + _documentation);
    return (_plus + "</p>");
  }
  
  public String computeLinkToElement(final EObject jvmElement) {
    final String imageURL = this.hoverSignatureProvider.getImageTag(jvmElement);
    final String signature = this.hoverSignatureProvider.getDerivedOrSourceSignature(jvmElement);
    URI _uRI = EcoreUtil.getURI(jvmElement);
    String _createLinkWithLabel = HoverLinkHelper.createLinkWithLabel(XtextElementLinks.XTEXTDOC_SCHEME, _uRI, signature);
    return (imageURL + _createLinkWithLabel);
  }
  
  public String getCustomDocumentation(final EObject object) {
    if (object instanceof UxBindingableOption) {
      return _getCustomDocumentation((UxBindingableOption)object);
    } else if (object != null) {
      return _getCustomDocumentation(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
