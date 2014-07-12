package org.lunifera.ecview.dsl.scope;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;

@SuppressWarnings("all")
public class BindableTypeProvider {
  public JvmTypeReference getTypeReference(final UiBindingExpression expression) {
    JvmTypeReference _xifexpression = null;
    boolean _notEquals = (!Objects.equal(expression, null));
    if (_notEquals) {
      _xifexpression = this.doGetTypeReference(expression);
    }
    return _xifexpression;
  }
  
  public JvmType getType(final UiBindingExpression expression) {
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
    UxEndpointDef _method = tbDef.getMethod();
    return _method.getJvmType();
  }
  
  protected JvmTypeReference _doGetTypeReference(final UiBindingExpression tbDef) {
    throw new UnsupportedOperationException();
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(beanSlot).toString());
    }
  }
}
