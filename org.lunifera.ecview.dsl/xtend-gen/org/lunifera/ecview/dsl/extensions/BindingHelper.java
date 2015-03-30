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

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class BindingHelper {
  protected /* UiBinding */Object _findBinding(final /* UiEmbeddable */Object embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiTypedBindableDef cannot be resolved to a type."
      + "\nThe method rawBindable is undefined for the type BindingHelper"
      + "\nuiModel cannot be resolved"
      + "\n== cannot be resolved");
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
  
  public /* UiModel */Object getUiModel(final EObject eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiModel cannot be resolved to a type."
      + "\nUiModel cannot be resolved to a type.");
  }
  
  public UiBinding findBinding(final UiEmbeddable embeddable) {
    if (embeddable != null) {
      return _findBinding(embeddable); else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(embeddable).toString());
      }
    }
  }
  