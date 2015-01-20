package org.lunifera.ecview.dsl.derivedstate;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.Map;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.lunifera.ecview.dsl.derivedstate.UiModelDerivedStateComputerx;
import org.lunifera.ecview.dsl.extensions.BindableTypeResolver;
import org.lunifera.ecview.dsl.extensions.OperationExtensions;
import org.lunifera.ecview.dsl.extensions.TypeHelper;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiLayout;

@SuppressWarnings("all")
public class AutowireHelper {
  public interface Layouter {
    public abstract void setup(final UiLayout uiRootLayout, final /* YLayout */Object yRootLayout);
    
    public abstract void add(final /* YEmbeddable */Object element);
  }
  
  public static class HorizontalLayouter implements AutowireHelper.Layouter {
    private /* YFormLayout */Object left;
    
    private /* YFormLayout */Object right;
    
    private int index;
    
    public void setup(final UiLayout uiRootLayout, final /* YLayout */Object yRootLayout) {
      throw new Error("Unresolved compilation problems:"
        + "\nThe method or field ExtensionModelFactory is undefined for the type HorizontalLayouter"
        + "\nThe method or field ExtensionModelFactory is undefined for the type HorizontalLayouter"
        + "\neINSTANCE cannot be resolved"
        + "\ncreateYFormLayout cannot be resolved"
        + "\neINSTANCE cannot be resolved"
        + "\ncreateYFormLayout cannot be resolved"
        + "\nelements cannot be resolved"
        + "\n+= cannot be resolved"
        + "\nelements cannot be resolved"
        + "\n+= cannot be resolved");
    }
    
    public void add(final /* YEmbeddable */Object element) {
      throw new Error("Unresolved compilation problems:"
        + "\nelements cannot be resolved"
        + "\n+= cannot be resolved"
        + "\nelements cannot be resolved"
        + "\n+= cannot be resolved");
    }
  }
  
  public static class MobileLayouter implements AutowireHelper.Layouter {
    private /* VMVerticalComponentGroup */Object group;
    
    public void setup(final UiLayout uiRootLayout, final /* YLayout */Object yRootLayout) {
      throw new Error("Unresolved compilation problems:"
        + "\nThe method or field VaadinMobileFactory is undefined for the type MobileLayouter"
        + "\neINSTANCE cannot be resolved"
        + "\ncreateVMVerticalComponentGroup cannot be resolved"
        + "\nelements cannot be resolved"
        + "\n+= cannot be resolved");
    }
    
    public void add(final /* YEmbeddable */Object element) {
      throw new Error("Unresolved compilation problems:"
        + "\naddElement cannot be resolved");
    }
  }
  
  @Inject
  @Extension
  private TypeHelper _typeHelper;
  
  private /* ExtensionModelFactory */Object yFactory /* Skipped initializer because of errors */;
  
  private /* VaadinMobileFactory */Object vFactory /* Skipped initializer because of errors */;
  
  private UiModelDerivedStateComputerx computer;
  
  private boolean mobile;
  
  private /* YLayout */Object yLayout;
  
  private UiLayout uiLayout;
  
  private String i18nRootKey;
  
  private AutowireHelper.Layouter layouter;
  
  private JvmDeclaredType beanType;
  
  public void autowire(final UiLayout uiLayout, final UiModelDerivedStateComputerx computer, final boolean mobile, final String i18nRootKey) {
    boolean _isAutowire = uiLayout.isAutowire();
    boolean _not = (!_isAutowire);
    if (_not) {
      return;
    }
    this.computer = computer;
    this.mobile = mobile;
    this.i18nRootKey = i18nRootKey;
    this.uiLayout = uiLayout;
    Object _associatedUi = computer.<Object>associatedUi(uiLayout);
    this.yLayout = _associatedUi;
    boolean _matched = false;
    if (!_matched) {
      if (uiLayout instanceof UiHorizontalLayout) {
        _matched=true;
        AutowireHelper.Layouter _xifexpression = null;
        if ((!mobile)) {
          _xifexpression = new AutowireHelper.HorizontalLayouter();
        } else {
          _xifexpression = new AutowireHelper.MobileLayouter();
        }
        this.layouter = _xifexpression;
        this.layouter.setup(uiLayout, this.yLayout);
      }
    }
    if (!_matched) {
      return;
    }
    final BindableTypeResolver resolver = new BindableTypeResolver();
    UiBindingExpression _autoWireSource = uiLayout.getAutoWireSource();
    JvmType _resolveType = resolver.resolveType(_autoWireSource);
    this.beanType = ((JvmDeclaredType) _resolveType);
    final Map<String, OperationExtensions.OperationInfo> opInfo = OperationExtensions.getOperationInfos(this.beanType);
    Collection<OperationExtensions.OperationInfo> _values = opInfo.values();
    final Procedure1<OperationExtensions.OperationInfo> _function = new Procedure1<OperationExtensions.OperationInfo>() {
      public void apply(final OperationExtensions.OperationInfo it) {
        JvmOperation _getter = it.getGetter();
        JvmTypeReference _returnType = _getter.getReturnType();
        final JvmType type = _returnType.getType();
        boolean _isBoolean = AutowireHelper.this._typeHelper.isBoolean(type);
        if (_isBoolean) {
          if (mobile) {
            AutowireHelper.this.createMobileSwitch(type, it);
          } else {
            AutowireHelper.this.createCheckbox(type, it);
          }
        } else {
          boolean _isNumberWithDigits = AutowireHelper.this._typeHelper.isNumberWithDigits(type);
          if (_isNumberWithDigits) {
            AutowireHelper.this.createDecimalField(type, it);
          } else {
            boolean _isNumberWithoutDigits = AutowireHelper.this._typeHelper.isNumberWithoutDigits(type);
            if (_isNumberWithoutDigits) {
              AutowireHelper.this.createNumberField(type, it);
            } else {
              boolean _isString = AutowireHelper.this._typeHelper.isString(type);
              if (_isString) {
                AutowireHelper.this.createTextField(type, it);
              } else {
                boolean _isDate = AutowireHelper.this._typeHelper.isDate(type);
                if (_isDate) {
                  AutowireHelper.this.createDateField(type, it);
                } else {
                  boolean _isEnum = AutowireHelper.this._typeHelper.isEnum(type);
                  if (_isEnum) {
                    AutowireHelper.this.createEnumOptionsGroup(type, it);
                  }
                }
              }
            }
          }
        }
      }
    };
    IterableExtensions.<OperationExtensions.OperationInfo>forEach(_values, _function);
  }
  
  public void createTextField(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateYTextField cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  public void createDecimalField(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateYDecimalField cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  public void createNumberField(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateYNumericField cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  public void createCheckbox(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateYCheckBox cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  public void createDateField(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateYDateTime cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  public void createEnumOptionsGroup(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateYEnumOptionsGroup cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  public void createBeanReferenceField(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateYBeanReferenceField cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  public void createMobileSwitch(final JvmType type, final OperationExtensions.OperationInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateVMSwitch cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ncreateBinding cannot be resolved");
  }
  
  /**
   * Create the bindings and install at the view
   */
  public Object createBinding(final /* YEmbeddable */Object yField, final OperationExtensions.OperationInfo info, final JvmType type, final String fieldProperty) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BindingFactory is undefined for the type AutowireHelper"
      + "\nThe method or field BindingFactory is undefined for the type AutowireHelper"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type AutowireHelper"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type AutowireHelper"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type AutowireHelper"
      + "\ncreateDetailValueEndpoint cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYECViewModelValueBindingEndpoint cannot be resolved"
      + "\nelement cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nisAssignableFrom cannot be resolved"
      + "\nemfNsURI cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nEPackage cannot be resolved"
      + "\nnsURI cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYValueBinding cannot be resolved"
      + "\nsetTargetEndpoint cannot be resolved"
      + "\nsetModelEndpoint cannot be resolved"
      + "\nsetModelToTargetStrategy cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nsetTargetToModelStrategy cannot be resolved"
      + "\nNEVER cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nview cannot be resolved"
      + "\norCreateBindingSet cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n+= cannot be resolved");
  }
}
