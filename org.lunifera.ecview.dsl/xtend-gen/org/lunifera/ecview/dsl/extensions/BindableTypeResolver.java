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
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

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
  
  protected JvmTypeReference _doResolveTypeReference(final UiBeanSlot beanSlot) {
    return beanSlot.getJvmType();
  }
  
  protected JvmTypeReference _doResolveTypeReference(final UiBindingEndpointAlias alias) {
    UiBindingExpression _endpoint = alias.getEndpoint();
    final UiBindingEndpointAssignment aliasEP = ((UiBindingEndpointAssignment) _endpoint);
    UiPathSegment _path = aliasEP.getPath();
    boolean _notEquals = (!Objects.equal(_path, null));
    if (_notEquals) {
      UiPathSegment _path_1 = aliasEP.getPath();
      return _path_1.getTypeReferenceOfLastSegment();
    } else {
      return this.doResolveTypeReference(aliasEP);
    }
  }
  
  protected JvmTypeReference _doResolveTypeReference(final UiBindingEndpointAssignment epDef) {
    UiPathSegment _path = epDef.getPath();
    boolean _notEquals = (!Objects.equal(_path, null));
    if (_notEquals) {
      UiPathSegment _path_1 = epDef.getPath();
      return this.doResolveTypeReference(_path_1);
    }
    UiTypedBindable _typedBindableAlias = epDef.getTypedBindableAlias();
    boolean _notEquals_1 = (!Objects.equal(_typedBindableAlias, null));
    if (_notEquals_1) {
      UiTypedBindable _typedBindableAlias_1 = epDef.getTypedBindableAlias();
      return this.doResolveTypeReference(_typedBindableAlias_1);
    } else {
      UiBindingExpression _typedBindableDef = epDef.getTypedBindableDef();
      boolean _notEquals_2 = (!Objects.equal(_typedBindableDef, null));
      if (_notEquals_2) {
        UiBindingExpression _typedBindableDef_1 = epDef.getTypedBindableDef();
        return this.doResolveTypeReference(_typedBindableDef_1);
      }
    }
    return null;
  }
  
  protected JvmTypeReference _doResolveTypeReference(final EObject object) {
    return TypesFactory.eINSTANCE.createJvmUnknownTypeReference();
  }
  
  protected JvmTypeReference _doResolveTypeReference(final UiCommandBindableDef epDef) {
    EObject _eContainer = epDef.eContainer();
    final UiBindingEndpointAssignment assignment = ((UiBindingEndpointAssignment) _eContainer);
    EObject _eContainer_1 = assignment.eContainer();
    final UiBinding binding = ((UiBinding) _eContainer_1);
    UiBindingExpression _source = binding.getSource();
    boolean _equals = Objects.equal(_source, assignment);
    if (_equals) {
      final UiBindingExpression targetDef = binding.getTarget();
      return this.resolveTypeReference(targetDef, true);
    } else {
      final UiBindingExpression sourceDef = binding.getSource();
      return this.resolveTypeReference(sourceDef, true);
    }
  }
  
  protected JvmTypeReference _doResolveTypeReference(final UiTypedBindableDef tbDef) {
    boolean _or = false;
    boolean _equals = Objects.equal(tbDef, null);
    if (_equals) {
      _or = true;
    } else {
      UxEndpointDef _method = tbDef.getMethod();
      boolean _equals_1 = Objects.equal(_method, null);
      _or = _equals_1;
    }
    if (_or) {
      return TypesFactory.eINSTANCE.createJvmUnknownTypeReference();
    }
    UxEndpointDef _method_1 = tbDef.getMethod();
    JvmTypeReference type = _method_1.getJvmType();
    boolean _equals_2 = Objects.equal(type, null);
    if (_equals_2) {
      return null;
    }
    final String fqn = type.getQualifiedName();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(fqn, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _name = Object.class.getName();
      boolean _equals_3 = fqn.equals(_name);
      _and = _equals_3;
    }
    if (_and) {
      final UiRawBindable rawBindable = tbDef.getRawBindableOfLastSegment();
      if ((rawBindable instanceof UiTypeProvider)) {
        JvmTypeReference _doResolveTypeReference = this.doResolveTypeReference(rawBindable);
        type = _doResolveTypeReference;
      }
    }
    return type;
  }
  
  protected JvmTypeReference _doResolveTypeReference(final UiBindingExpression tbDef) {
    throw new UnsupportedOperationException();
  }
  
  protected JvmTypeReference _doResolveTypeReference(final UiTypeProvider provider) {
    return provider.getJvmType();
  }
  
  protected JvmTypeReference _doResolveTypeReference(final UiPathSegment path) {
    return path.getTypeReferenceOfLastSegment();
  }
  
  public JvmTypeReference doResolveTypeReference(final EObject beanSlot) {
    if (beanSlot instanceof UiBeanSlot) {
      return _doResolveTypeReference((UiBeanSlot)beanSlot);
    } else if (beanSlot instanceof UiBindingEndpointAlias) {
      return _doResolveTypeReference((UiBindingEndpointAlias)beanSlot);
    } else if (beanSlot instanceof UiBindingEndpointAssignment) {
      return _doResolveTypeReference((UiBindingEndpointAssignment)beanSlot);
    } else if (beanSlot instanceof UiCommandBindableDef) {
      return _doResolveTypeReference((UiCommandBindableDef)beanSlot);
    } else if (beanSlot instanceof UiTypedBindableDef) {
      return _doResolveTypeReference((UiTypedBindableDef)beanSlot);
    } else if (beanSlot instanceof UiBindingExpression) {
      return _doResolveTypeReference((UiBindingExpression)beanSlot);
    } else if (beanSlot instanceof UiPathSegment) {
      return _doResolveTypeReference((UiPathSegment)beanSlot);
    } else if (beanSlot instanceof UiTypeProvider) {
      return _doResolveTypeReference((UiTypeProvider)beanSlot);
    } else if (beanSlot != null) {
      return _doResolveTypeReference(beanSlot);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(beanSlot).toString());
    }
  }
}
