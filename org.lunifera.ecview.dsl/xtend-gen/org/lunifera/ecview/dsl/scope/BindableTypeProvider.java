package org.lunifera.ecview.dsl.scope;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

@Singleton
@SuppressWarnings("all")
public class BindableTypeProvider {
  public JvmTypeReference getTypeReference(final EObject expression) {
    JvmTypeReference _xifexpression = null;
    boolean _notEquals = (!Objects.equal(expression, null));
    if (_notEquals) {
      _xifexpression = this.doGetTypeReference(expression);
    }
    return _xifexpression;
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
    return this.doGetTypeReference(_endpoint);
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
      final UiRawBindable rawBindable = tbDef.getRawBindable();
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
  
  protected JvmTypeReference _doGetTypeReference(final UiTypeProvider table) {
    return table.getJvmType();
  }
  
  public JvmTypeReference doGetTypeReference(final EObject beanSlot) {
    if (beanSlot instanceof UiBeanSlot) {
      return _doGetTypeReference((UiBeanSlot)beanSlot);
    } else if (beanSlot instanceof UiBindingEndpointAlias) {
      return _doGetTypeReference((UiBindingEndpointAlias)beanSlot);
    } else if (beanSlot instanceof UiBindingEndpointAssignment) {
      return _doGetTypeReference((UiBindingEndpointAssignment)beanSlot);
    } else if (beanSlot instanceof UiTypedBindableDef) {
      return _doGetTypeReference((UiTypedBindableDef)beanSlot);
    } else if (beanSlot instanceof UiBindingExpression) {
      return _doGetTypeReference((UiBindingExpression)beanSlot);
    } else if (beanSlot instanceof UiTypeProvider) {
      return _doGetTypeReference((UiTypeProvider)beanSlot);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(beanSlot).toString());
    }
  }
}
