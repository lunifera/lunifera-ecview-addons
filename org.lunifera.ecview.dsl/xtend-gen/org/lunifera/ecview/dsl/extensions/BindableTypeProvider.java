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
 * Provider returns the type for the requested bindable, but does NOT resolve the whole path!
 * The provider is used for scoping issues. There is also a type resolver. It will resolve the
 * type at the end of the path.
 */
@Singleton
@SuppressWarnings("all")
public class BindableTypeProvider {
  public JvmTypeReference getTypeReference(final EObject expression) {
    return this.getTypeReference(expression, false);
  }
  
  public JvmTypeReference getTypeReference(final EObject expression, final boolean includeParent) {
    boolean _equals = Objects.equal(expression, null);
    if (_equals) {
      TypesFactory.eINSTANCE.createJvmUnknownTypeReference();
    }
    JvmTypeReference result = this.doGetTypeReference(expression);
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
          JvmTypeReference _doGetTypeReference = this.doGetTypeReference(temp);
          result = _doGetTypeReference;
        }
      }
    }
    return result;
  }
  
  public JvmType getType(final EObject expression) {
    JvmType _xifexpression = null;
    boolean _notEquals = (!Objects.equal(expression, null));
    if (_notEquals) {
      JvmTypeReference _typeReference = this.getTypeReference(expression);
      JvmType _type = null;
      if (_typeReference!=null) {
        _type=_typeReference.getType();
      }
      _xifexpression = _type;
    }
    return _xifexpression;
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiBeanSlot */Object beanSlot) {
    throw new Error("Unresolved compilation problems:"
      + "\njvmType cannot be resolved");
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiBindingEndpointAlias */Object alias) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\ngetEndpoint cannot be resolved"
      + "\npath cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ngetPath cannot be resolved"
      + "\ngetTypeReferenceOfLastSegment cannot be resolved"
      + "\ntypedBindableDef cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypedBindableDef cannot be resolved"
      + "\ndoGetTypeReference cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved"
      + "\ndoGetTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiBindingEndpointAssignment */Object epDef) {
    throw new Error("Unresolved compilation problems:"
      + "\ntypedBindableAlias cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved"
      + "\ndoGetTypeReference cannot be resolved"
      + "\ntypedBindableDef cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypedBindableDef cannot be resolved"
      + "\ndoGetTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doGetTypeReference(final EObject object) {
    return TypesFactory.eINSTANCE.createJvmUnknownTypeReference();
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiCommandBindableDef */Object epDef) {
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
      + "\ngetTypeReference cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ngetTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiTypedBindableDef */Object tbDef) {
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
      + "\ndoGetTypeReference cannot be resolved");
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiBindingExpression */Object tbDef) {
    throw new UnsupportedOperationException();
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiTypeProvider */Object provider) {
    throw new Error("Unresolved compilation problems:"
      + "\njvmType cannot be resolved");
  }
  
  protected JvmTypeReference _doGetTypeReference(final /* UiNestedProperty */Object property) {
    throw new Error("Unresolved compilation problems:"
      + "\ntypeReferenceofGetter cannot be resolved");
  }
  
  public JvmTypeReference doGetTypeReference(final EObject object) {
    if (object != null) {
      return _doGetTypeReference(object);
    } else if (object != null) {
      return _doGetTypeReference(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
