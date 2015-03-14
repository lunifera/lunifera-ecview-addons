package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YBindingUpdateStrategy;
import org.lunifera.ecview.core.common.model.binding.YDetailValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBinding;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField;
import org.lunifera.ecview.core.extension.model.extension.YCheckBox;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.extension.model.extension.YDecimalField;
import org.lunifera.ecview.core.extension.model.extension.YEnumOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YFormLayout;
import org.lunifera.ecview.core.extension.model.extension.YNumericField;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.dsl.autowire.IAutowireDelegate;
import org.lunifera.ecview.dsl.derivedstate.UiModelDerivedStateComputerx;
import org.lunifera.ecview.dsl.extensions.BindableTypeResolver;
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider;
import org.lunifera.ecview.dsl.extensions.OperationExtensions;
import org.lunifera.ecview.dsl.extensions.TypeHelper;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.mobile.vaadin.ecview.model.VMSwitch;
import org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.lunifera.runtime.common.metric.TimeLogger;

@SuppressWarnings("all")
public class AutowireHelper implements IAutowireDelegate {
  public interface Layouter {
    public abstract void setup(final UiLayout uiRootLayout, final YLayout yRootLayout);
    
    public abstract void add(final YEmbeddable element);
  }
  
  public static class HorizontalLayouter implements AutowireHelper.Layouter {
    private YFormLayout left;
    
    private YFormLayout right;
    
    private int index;
    
    public void setup(final UiLayout uiRootLayout, final YLayout yRootLayout) {
      YFormLayout _createYFormLayout = ExtensionModelFactory.eINSTANCE.createYFormLayout();
      this.left = _createYFormLayout;
      YFormLayout _createYFormLayout_1 = ExtensionModelFactory.eINSTANCE.createYFormLayout();
      this.right = _createYFormLayout_1;
      EList<YEmbeddable> _elements = yRootLayout.getElements();
      _elements.add(this.left);
      EList<YEmbeddable> _elements_1 = yRootLayout.getElements();
      _elements_1.add(this.right);
    }
    
    public void add(final YEmbeddable element) {
      if (((this.index % 2) == 0)) {
        EList<YEmbeddable> _elements = this.left.getElements();
        _elements.add(element);
      } else {
        EList<YEmbeddable> _elements_1 = this.right.getElements();
        _elements_1.add(element);
      }
      this.index++;
    }
  }
  
  public static class MobileLayouter implements AutowireHelper.Layouter {
    private VMVerticalComponentGroup group;
    
    public void setup(final UiLayout uiRootLayout, final YLayout yRootLayout) {
      VMVerticalComponentGroup _createVMVerticalComponentGroup = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup();
      this.group = _createVMVerticalComponentGroup;
      EList<YEmbeddable> _elements = yRootLayout.getElements();
      _elements.add(this.group);
    }
    
    public void add(final YEmbeddable element) {
      this.group.addElement(element);
    }
  }
  
  @Inject
  @Extension
  private TypeHelper _typeHelper;
  
  private ExtensionModelFactory yFactory = ExtensionModelFactory.eINSTANCE;
  
  private VaadinMobileFactory vFactory = VaadinMobileFactory.eINSTANCE;
  
  private UiModelDerivedStateComputerx computer;
  
  private boolean mobile;
  
  private YLayout yLayout;
  
  private UiLayout uiLayout;
  
  private String i18nRootKey;
  
  private AutowireHelper.Layouter layouter;
  
  private JvmDeclaredType beanType;
  
  public void autowire(final UiLayout uiLayout, final UiModelDerivedStateComputerx computer, final boolean mobile) {
    boolean _isAutowire = uiLayout.isAutowire();
    boolean _not = (!_isAutowire);
    if (_not) {
      return;
    }
    final TimeLogger logger = TimeLogger.start(AutowireHelper.class);
    this.computer = computer;
    this.mobile = mobile;
    this.i18nRootKey = this.i18nRootKey;
    this.uiLayout = uiLayout;
    YLayout _associatedUi = computer.<YLayout>associatedUi(uiLayout);
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
    JvmType temp = resolver.resolveType(_autoWireSource);
    if ((temp instanceof JvmVoid)) {
      return;
    }
    this.beanType = ((JvmDeclaredType) temp);
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
                  } else {
                    boolean _isDomainReference = AutowireHelper.this._typeHelper.isDomainReference(it);
                    if (_isDomainReference) {
                      AutowireHelper.this.createBeanReferenceField(type, it);
                    }
                  }
                }
              }
            }
          }
        }
      }
    };
    IterableExtensions.<OperationExtensions.OperationInfo>forEach(_values, _function);
    logger.stop("Autowiring took: ");
    final String x = logger.toString();
    InputOutput.<String>println(x);
  }
  
  public void createTextField(final JvmType type, final OperationExtensions.OperationInfo info) {
    final YTextField yField = this.yFactory.createYTextField();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "value");
  }
  
  public void createDecimalField(final JvmType type, final OperationExtensions.OperationInfo info) {
    final YDecimalField yField = this.yFactory.createYDecimalField();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "value");
  }
  
  public void createNumberField(final JvmType type, final OperationExtensions.OperationInfo info) {
    final YNumericField yField = this.yFactory.createYNumericField();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "value");
  }
  
  public void createCheckbox(final JvmType type, final OperationExtensions.OperationInfo info) {
    final YCheckBox yField = this.yFactory.createYCheckBox();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "value");
  }
  
  public void createDateField(final JvmType type, final OperationExtensions.OperationInfo info) {
    final YDateTime yField = this.yFactory.createYDateTime();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "value");
  }
  
  public void createEnumOptionsGroup(final JvmType type, final OperationExtensions.OperationInfo info) {
    final YEnumOptionsGroup yField = this.yFactory.createYEnumOptionsGroup();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    Resource _eResource = this.uiLayout.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _qualifiedName = type.getQualifiedName();
    Class<?> _loadClass = this.computer.loadClass(_resourceSet, _qualifiedName);
    yField.setType(_loadClass);
    String _qualifiedName_1 = type.getQualifiedName();
    yField.setTypeQualifiedName(_qualifiedName_1);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "selection");
  }
  
  public void createBeanReferenceField(final JvmType type, final OperationExtensions.OperationInfo info) {
    final YBeanReferenceField yField = this.yFactory.createYBeanReferenceField();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    Resource _eResource = this.uiLayout.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _qualifiedName = type.getQualifiedName();
    Class<?> _loadClass = this.computer.loadClass(_resourceSet, _qualifiedName);
    yField.setType(_loadClass);
    String _qualifiedName_1 = type.getQualifiedName();
    yField.setTypeQualifiedName(_qualifiedName_1);
    yField.setUseBeanService(true);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "selection");
  }
  
  public void createMobileSwitch(final JvmType type, final OperationExtensions.OperationInfo info) {
    final VMSwitch yField = this.vFactory.createVMSwitch();
    boolean _isReadonly = info.isReadonly();
    boolean _not = (!_isReadonly);
    yField.setInitialEnabled(_not);
    String _name = info.getName();
    yField.setLabel(_name);
    this.layouter.add(yField);
    this.createBinding(yField, info, type, "value");
  }
  
  /**
   * Create the bindings and install at the view
   */
  public void createBinding(final YEmbeddable yField, final OperationExtensions.OperationInfo info, final JvmType type, final String fieldProperty) {
    UiBindingExpression _autoWireSource = this.uiLayout.getAutoWireSource();
    final UiBindingEndpointAssignment uiModelEndpoint = ((UiBindingEndpointAssignment) _autoWireSource);
    final YValueBindingEndpoint yModelEndpoint = this.computer.createValueBindingEndpoint(uiModelEndpoint);
    final YDetailValueBindingEndpoint detailValueEndpoint = yModelEndpoint.createDetailValueEndpoint();
    String _name = info.getName();
    detailValueEndpoint.setPropertyPath(_name);
    Resource _eResource = this.uiLayout.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _qualifiedName = this.beanType.getQualifiedName();
    Class<?> _loadClass = this.computer.loadClass(_resourceSet, _qualifiedName);
    detailValueEndpoint.setType(_loadClass);
    final YECViewModelValueBindingEndpoint yFieldEndpoint = BindingFactory.eINSTANCE.createYECViewModelValueBindingEndpoint();
    yFieldEndpoint.setElement(yField);
    yFieldEndpoint.setPropertyPath(fieldProperty);
    String _qualifiedName_1 = this.beanType.getQualifiedName();
    yFieldEndpoint.setTypeQualifiedName(_qualifiedName_1);
    Resource _eResource_1 = this.uiLayout.eResource();
    ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
    String _qualifiedName_2 = this.beanType.getQualifiedName();
    Class<?> _loadClass_1 = this.computer.loadClass(_resourceSet_1, _qualifiedName_2);
    yFieldEndpoint.setType(_loadClass_1);
    boolean _and = false;
    Class<?> _type = yFieldEndpoint.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Class<?> _type_1 = yFieldEndpoint.getType();
      boolean _isAssignableFrom = _type_1.isAssignableFrom(EObject.class);
      _and = _isAssignableFrom;
    }
    if (_and) {
      EClass _eClass = yField.eClass();
      EPackage _ePackage = _eClass.getEPackage();
      String _nsURI = _ePackage.getNsURI();
      yFieldEndpoint.setEmfNsURI(_nsURI);
    }
    final YValueBinding yBinding = BindingFactory.eINSTANCE.createYValueBinding();
    yBinding.setTargetEndpoint(yFieldEndpoint);
    yBinding.setModelEndpoint(detailValueEndpoint);
    yBinding.setModelToTargetStrategy(YBindingUpdateStrategy.UPDATE);
    YBindingUpdateStrategy _xifexpression = null;
    boolean _isReadonly = info.isReadonly();
    if (_isReadonly) {
      _xifexpression = YBindingUpdateStrategy.NEVER;
    } else {
      _xifexpression = YBindingUpdateStrategy.UPDATE;
    }
    yBinding.setTargetToModelStrategy(_xifexpression);
    YView _view = this.yLayout.getView();
    YBindingSet _orCreateBindingSet = _view.getOrCreateBindingSet();
    EList<YBinding> _bindings = _orCreateBindingSet.getBindings();
    _bindings.add(yBinding);
    String _qualifiedName_3 = this.beanType.getQualifiedName();
    String _propertyPath = detailValueEndpoint.getPropertyPath();
    String _i18nKey = I18nKeyProvider.toI18nKey(_qualifiedName_3, _propertyPath);
    yField.setLabelI18nKey(_i18nKey);
  }
}
