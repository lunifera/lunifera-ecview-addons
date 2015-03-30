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

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUnknownTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;

/**
 * The type resolver will return the type at the end of the path. Should not be used for scoping!
 * There is also a type provider that returns the type for the requested bindable, but does NOT resolve the whole path!
 * The provider is used for scoping issues.
 */
@Singleton
@SuppressWarnings("all")
public class BindableTypeResolver {
  public JvmTypeReference resolveTypeReference(final EObject expression) {
    return this.resolveTypeReference(expression, false);
  }
  
  public JvmTypeReference resolveTypeReference(final EObject expression, final boolean includeParent) {
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      TypesFactory.eINSTANCE.createJvmUnknownTypeReference();
    }
    JvmTypeReference result = this.doResolveTypeReference(expression);
    boolean _and = false;
    boolean _or = false;
    boolean _equals_1 = Objects.equal(result, null);
    if (_equals_1) {
      _or = true;
    } else {
      _or = (result instanceof JvmUnknownTypeReference);
    }
    if (!_or) {
      _and = false;
    } else {
      _and = includeParent;
    }
    if (_and) {
      EObject temp = expression;
      while (((Objects.equal(result, null) || (result instanceof JvmUnknownTypeReference)) && (!Objects.equal(temp.eContainer(), null)))) {
        {
          EObject _eContainer = temp.eContainer();
          temp = _eContainer;
          JvmTypeReference _doResolveTypeReference = this.doResolveTypeReference(temp);
          result = _doResolveTypeReference;
        }
      }
    }
    return result;
  }
  
  public JvmType resolveType(final EObject expression) {
    JvmType _xifexpression = null;
    boolean _notEquals = (!Objects.equal(expression, null));
    if (_notEquals) {
      JvmTypeReference _resolveTypeReference = this.resolveTypeReference(expression);
      JvmType _type = null;
      if (_resolveTypeReference!=null) {
        _type=_resolveTypeReference.getType();
      }
      _xifexpression = _type;
    }
    return _xifexpression;
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiBeanSlot */Object beanSlot) {
    throw new Error("Unresolved compilation problems:"
      + "\njvmType cannot be resolved");
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiBindingEndpointAlias */Object alias) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\ngetEndpoint cannot be resolved"
      + "\ngetPath cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ngetPath cannot be resolved"
      + "\ntypeReferenceOfLastSegment cannot be resolved"
      + "\ndoResolveTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiBindingEndpointAssignment */Object epDef) {
    throw new Error("Unresolved compilation problems:"
      + "\npath cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npath cannot be resolved"
      + "\ndoResolveTypeReference cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved"
      + "\ndoResolveTypeReference cannot be resolved"
      + "\ntypedBindableDef cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypedBindableDef cannot be resolved"
      + "\ndoResolveTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doResolveTypeReference(final EObject object) {
    return TypesFactory.eINSTANCE.createJvmUnknownTypeReference();
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiCommandBindableDef */Object epDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBinding cannot be resolved to a type."
      + "\nUiBinding cannot be resolved to a type."
      + "\nUiBindingExpression cannot be resolved to a type."
      + "\nUiBindingExpression cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nsource cannot be resolved"
      + "\n== cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nresolveTypeReference cannot be resolved"
      + "\nsource cannot be resolved"
      + "\nresolveTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiTypedBindableDef */Object tbDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiTypeProvider cannot be resolved to a type."
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nmethod cannot be resolved"
      + "\n== cannot be resolved"
      + "\nmethod cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n== cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nrawBindableOfLastSegment cannot be resolved"
      + "\ndoResolveTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiBindingExpression */Object tbDef) {
    throw new UnsupportedOperationException();
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiTypeProvider */Object provider) {
    throw new Error("Unresolved compilation problems:"
      + "\njvmType cannot be resolved");
  }
  
  protected JvmTypeReference _doResolveTypeReference(final /* UiPathSegment */Object path) {
    throw new Error("Unresolved compilation problems:"
      + "\ntypeReferenceOfLastSegment cannot be resolved");
  }
  
  public JvmTypeReference doResolveTypeReference(final EObject object) {
    if (object != null) {
      return _doResolveTypeReference(object);
    } else if (object != null) {
      return _doResolveTypeReference(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
