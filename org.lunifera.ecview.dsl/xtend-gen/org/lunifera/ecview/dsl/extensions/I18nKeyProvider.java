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
package org.lunifera.ecview.dsl.extensions;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class I18nKeyProvider {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  protected String _toI18nKey(final /* UiEmbeddable */Object embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetPackage cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected String _toI18nKey(final /* UiColumn */Object column) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiNestedProperty cannot be resolved to a type."
      + "\nUiEmbeddable cannot be resolved to a type."
      + "\ngetPackage cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected String _toI18nKey(final /* UiExposedAction */Object action) {
    throw new Error("Unresolved compilation problems:"
      + "\nactionReference cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nactionReference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nactionID cannot be resolved");
  }
  
  protected String _toI18nKey(final /* UiSearchField */Object embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiNestedProperty cannot be resolved to a type."
      + "\ngetPackage cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected String _toI18nKey(final /* UiTabAssignment */Object embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetPackage cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nstartsWith cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\ni18nInfo cannot be resolved"
      + "\nkey cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected String _toI18nKey(final /* UiErrorCode */Object code) {
    throw new Error("Unresolved compilation problems:"
      + "\nfullyQualifiedName cannot be resolved"
      + "\nskipLast cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  /**
   * Returns the package name.
   * 
   * @param eObject
   * @return
   */
  public String getPackage(final EObject eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiModel cannot be resolved to a type."
      + "\nUiModel cannot be resolved to a type."
      + "\ngetPackageName cannot be resolved");
  }
  
  public String toI18nKey(final UiEmbeddable embeddable) {
    if (embeddable != null) {
      return _toI18nKey(embeddable); else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(embeddable).toString());
      }
    }
  }
  