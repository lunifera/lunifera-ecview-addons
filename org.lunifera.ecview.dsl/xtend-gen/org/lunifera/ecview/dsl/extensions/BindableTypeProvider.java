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
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

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
      boolean _and_1 = false;
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(result, null);
      if (_equals_2) {
        _or_1 = true;
      } else {
        _or_1 = (result instanceof JvmUnknownTypeReference);
      }
      if (!_or_1) {
        _and_1 = false;
      } else {
        EObject _eContainer = temp.eContainer();
        boolean _notEquals = (!Objects.equal(_eContainer, null));
        _and_1 = _notEquals;
      }
      boolean _while = _and_1;
      while (_while) {
        {
          EObject _eContainer_1 = temp.eContainer();
          temp = _eContainer_1;
          JvmTypeReference _doGetTypeReference = this.doGetTypeReference(temp);
          result = _doGetTypeReference;
        }
        boolean _and_2 = false;
        boolean _or_2 = false;
        boolean _equals_3 = Objects.equal(result, null);
        if (_equals_3) {
          _or_2 = true;
        } else {
          _or_2 = (result instanceof JvmUnknownTypeReference);
        }
        if (!_or_2) {
          _and_2 = false;
        } else {
          EObject _eContainer_1 = temp.eContainer();
          boolean _notEquals_1 = (!Objects.equal(_eContainer_1, null));
          _and_2 = _notEquals_1;
        }
        _while = _and_2;
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
  
  protected JvmTypeReference _doGetTypeReference(final UiBeanSlot beanSlot) {
    return beanSlot.getJvmType();
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiBindingEndpointAlias alias) {
    UiBindingExpression _endpoint = alias.getEndpoint();
    final UiBindingEndpointAssignment aliasEP = ((UiBindingEndpointAssignment) _endpoint);
    UiPathSegment _path = aliasEP.getPath();
    boolean _notEquals = (!Objects.equal(_path, null));
    if (_notEquals) {
      UiPathSegment _path_1 = aliasEP.getPath();
      return _path_1.getTypeReferenceOfLastSegment();
    } else {
      UiBindingExpression _typedBindableDef = aliasEP.getTypedBindableDef();
      boolean _notEquals_1 = (!Objects.equal(_typedBindableDef, null));
      if (_notEquals_1) {
        UiBindingExpression _typedBindableDef_1 = aliasEP.getTypedBindableDef();
        return this.doGetTypeReference(_typedBindableDef_1);
      } else {
        UiTypedBindable _typedBindableAlias = aliasEP.getTypedBindableAlias();
        return this.doGetTypeReference(_typedBindableAlias);
      }
    }
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiBindingEndpointAssignment epDef) {
    UiTypedBindable _typedBindableAlias = epDef.getTypedBindableAlias();
    boolean _notEquals = (!Objects.equal(_typedBindableAlias, null));
    if (_notEquals) {
      UiTypedBindable _typedBindableAlias_1 = epDef.getTypedBindableAlias();
      return this.doGetTypeReference(_typedBindableAlias_1);
    } else {
      UiBindingExpression _typedBindableDef = epDef.getTypedBindableDef();
      boolean _notEquals_1 = (!Objects.equal(_typedBindableDef, null));
      if (_notEquals_1) {
        UiBindingExpression _typedBindableDef_1 = epDef.getTypedBindableDef();
        return this.doGetTypeReference(_typedBindableDef_1);
      }
    }
    return null;
  }
  
  protected JvmTypeReference _doGetTypeReference(final EObject object) {
    return TypesFactory.eINSTANCE.createJvmUnknownTypeReference();
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiCommandBindableDef epDef) {
    EObject _eContainer = epDef.eContainer();
    final UiBindingEndpointAssignment assignment = ((UiBindingEndpointAssignment) _eContainer);
    EObject _eContainer_1 = assignment.eContainer();
    final UiBinding binding = ((UiBinding) _eContainer_1);
    UiBindingExpression _source = binding.getSource();
    boolean _equals = Objects.equal(_source, assignment);
    if (_equals) {
      final UiBindingExpression targetDef = binding.getTarget();
      return this.getTypeReference(targetDef, true);
    } else {
      final UiBindingExpression sourceDef = binding.getSource();
      return this.getTypeReference(sourceDef, true);
    }
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiTypedBindableDef tbDef) {
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
        JvmTypeReference _doGetTypeReference = this.doGetTypeReference(rawBindable);
        type = _doGetTypeReference;
      }
    }
    return type;
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiBindingExpression tbDef) {
    throw new UnsupportedOperationException();
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiTypeProvider provider) {
    return provider.getJvmType();
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiNestedProperty property) {
    return property.getTypeReferenceofGetter();
  }
  
  public JvmTypeReference doGetTypeReference(final EObject beanSlot) {
    if (beanSlot instanceof UiBeanSlot) {
      return _doGetTypeReference((UiBeanSlot)beanSlot);
    } else if (beanSlot instanceof UiBindingEndpointAlias) {
      return _doGetTypeReference((UiBindingEndpointAlias)beanSlot);
    } else if (beanSlot instanceof UiBindingEndpointAssignment) {
      return _doGetTypeReference((UiBindingEndpointAssignment)beanSlot);
    } else if (beanSlot instanceof UiCommandBindableDef) {
      return _doGetTypeReference((UiCommandBindableDef)beanSlot);
    } else if (beanSlot instanceof UiTypedBindableDef) {
      return _doGetTypeReference((UiTypedBindableDef)beanSlot);
    } else if (beanSlot instanceof UiNestedProperty) {
      return _doGetTypeReference((UiNestedProperty)beanSlot);
    } else if (beanSlot instanceof UiBindingExpression) {
      return _doGetTypeReference((UiBindingExpression)beanSlot);
    } else if (beanSlot instanceof UiTypeProvider) {
      return _doGetTypeReference((UiTypeProvider)beanSlot);
    } else if (beanSlot != null) {
      return _doGetTypeReference(beanSlot);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(beanSlot).toString());
    }
  }
}
