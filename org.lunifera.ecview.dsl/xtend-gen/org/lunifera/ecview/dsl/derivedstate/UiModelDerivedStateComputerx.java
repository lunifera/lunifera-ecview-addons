package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy;
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.validation.YClassDelegateValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.dsl.scope.BindableTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoader;
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoaderProvider;

@SuppressWarnings("all")
public class UiModelDerivedStateComputerx extends JvmModelAssociator {
  public static class BindingInfo {
    /**
     * The type of the binding. For nested bindings it is the last element available
     */
    private JvmType _bindingType;
    
    /**
     * The type of the binding. For nested bindings it is the last element available
     */
    public JvmType getBindingType() {
      return this._bindingType;
    }
    
    /**
     * The type of the binding. For nested bindings it is the last element available
     */
    public void setBindingType(final JvmType bindingType) {
      this._bindingType = bindingType;
    }
    
    /**
     * The nested path using dot notation.
     */
    private StringBuilder _path = new StringBuilder();
    
    /**
     * The nested path using dot notation.
     */
    public StringBuilder getPath() {
      return this._path;
    }
    
    /**
     * The nested path using dot notation.
     */
    public void setPath(final StringBuilder path) {
      this._path = path;
    }
    
    /**
     * The element the binding should be installed on
     */
    private EObject _bindingRoot;
    
    /**
     * The element the binding should be installed on
     */
    public EObject getBindingRoot() {
      return this._bindingRoot;
    }
    
    /**
     * The element the binding should be installed on
     */
    public void setBindingRoot(final EObject bindingRoot) {
      this._bindingRoot = bindingRoot;
    }
    
    /**
     * Append the segment to the path.
     */
    public void appendPath(final String segment) {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(segment);
      if (_isNullOrEmpty) {
        return;
      }
      StringBuilder _path = this.getPath();
      int _length = _path.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        StringBuilder _path_1 = this.getPath();
        _path_1.append(".");
      }
      StringBuilder _path_2 = this.getPath();
      _path_2.append(segment);
    }
  }
  
  @Inject
  private IJdtTypeLoaderProvider typeLoaderProvider;
  
  @Inject
  private BindableTypeProvider bindingTypeProvider;
  
  private final Stack<EObject> viewContext = new Stack<EObject>();
  
  private final List<YView> views = CollectionLiterals.<YView>newArrayList();
  
  private final Map<EObject, EObject> associations = CollectionLiterals.<EObject, EObject>newHashMap();
  
  private final SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
  
  private YView currentView;
  
  private DerivedStateAwareResource resource;
  
  public void associateUi(final EObject grammarElement, final EObject uiElement) {
    this.associations.put(grammarElement, uiElement);
  }
  
  public <A extends Object> A associatedUi(final EObject grammarElement) {
    EObject _get = this.associations.get(grammarElement);
    return ((A) _get);
  }
  
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    super.installDerivedState(resource, preLinkingPhase);
    this.resource = resource;
    EList<EObject> _contents = resource.getContents();
    boolean _isEmpty = _contents.isEmpty();
    if (_isEmpty) {
      return;
    }
    if ((!preLinkingPhase)) {
      EList<EObject> _contents_1 = resource.getContents();
      final EObject eObject = _contents_1.get(0);
      EList<EObject> _eContents = eObject.eContents();
      final Procedure1<EObject> _function = new Procedure1<EObject>() {
        public void apply(final EObject it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<EObject>forEach(_eContents, _function);
      int _size = this.views.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EList<EObject> _contents_2 = resource.getContents();
        YView _get = this.views.get(0);
        _contents_2.add(_get);
      }
      this.views.clear();
      this.viewContext.clear();
      this.associations.clear();
    }
  }
  
  public <A extends Object> A peek() {
    EObject _peek = this.viewContext.peek();
    return ((A) _peek);
  }
  
  public <A extends Object> A pop() {
    EObject _pop = this.viewContext.pop();
    return ((A) _pop);
  }
  
  protected void _map(final UiModel object) {
    EList<UiRootElements> _roots = object.getRoots();
    final Function1<UiRootElements, Boolean> _function = new Function1<UiRootElements, Boolean>() {
      public Boolean apply(final UiRootElements it) {
        return Boolean.valueOf((!(it instanceof UiValidatorAlias)));
      }
    };
    Iterable<UiRootElements> _filter = IterableExtensions.<UiRootElements>filter(_roots, _function);
    final Procedure1<UiRootElements> _function_1 = new Procedure1<UiRootElements>() {
      public void apply(final UiRootElements it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiRootElements>forEach(_filter, _function_1);
  }
  
  protected void _map(final UiView object) {
  }
  
  protected void _map(final Void object) {
    InputOutput.<String>println("void");
  }
  
  protected void _map(final UiIDEView object) {
    final YView yView = this.factory.createView();
    this.views.add(yView);
    this.currentView = yView;
    this.push(yView);
    EList<UiBeanSlot> _beanSlots = object.getBeanSlots();
    final Procedure1<UiBeanSlot> _function = new Procedure1<UiBeanSlot>() {
      public void apply(final UiBeanSlot it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBeanSlot>forEach(_beanSlots, _function);
    UiEmbeddable _content = object.getContent();
    this.map(_content);
    EList<UiBinding> _bindings = object.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    EList<UiValidatorAssignment> _validatorAssignments = object.getValidatorAssignments();
    final Procedure1<UiValidatorAssignment> _function_2 = new Procedure1<UiValidatorAssignment>() {
      public void apply(final UiValidatorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments, _function_2);
    this.<Object>pop();
    this.currentView = null;
  }
  
  public EObject push(final EObject eObject) {
    return this.viewContext.push(eObject);
  }
  
  protected void _map(final UiGridLayout eObject) {
    final YGridLayout layout = this.factory.createGridLayout();
    String _name = eObject.getName();
    layout.setName(_name);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiGridLayoutAssigment> _contents = eObject.getContents();
    final Procedure1<UiGridLayoutAssigment> _function = new Procedure1<UiGridLayoutAssigment>() {
      public void apply(final UiGridLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiGridLayoutAssigment>forEach(_contents, _function);
    this.<Object>pop();
  }
  
  protected void _map(final UiGridLayoutAssigment eObject) {
    final YGridLayout layout = this.<YGridLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    if ((element instanceof UiField)) {
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Procedure1<UiValidator> _function = new Procedure1<UiValidator>() {
        public void apply(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiValidator>forEach(_validators, _function);
      this.<Object>pop();
    }
  }
  
  protected void _map(final UiValidatorAssignment eObject) {
    UiField _field = eObject.getField();
    final YField yField = this.<YField>associatedUi(_field);
    this.push(yField);
    UiValidatorAlias _validatorAlias = eObject.getValidatorAlias();
    boolean _notEquals = (!Objects.equal(_validatorAlias, null));
    if (_notEquals) {
      UiValidatorAlias _validatorAlias_1 = eObject.getValidatorAlias();
      this.map(_validatorAlias_1);
    } else {
      UiValidatorDef _validatorDef = eObject.getValidatorDef();
      boolean _notEquals_1 = (!Objects.equal(_validatorDef, null));
      if (_notEquals_1) {
        UiValidatorDef _validatorDef_1 = eObject.getValidatorDef();
        this.map(_validatorDef_1);
      }
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiValidatorDef eObject) {
    UiValidator _validator = eObject.getValidator();
    this.map(_validator);
  }
  
  protected void _map(final UiValidatorAlias eObject) {
    int _length = ((Object[])Conversions.unwrapArray(this.viewContext, Object.class)).length;
    boolean _equals = (_length == 0);
    if (_equals) {
      return;
    }
    UiValidator _validator = eObject.getValidator();
    this.map(_validator);
  }
  
  protected void _map(final UiMaxLengthValidator eObject) {
    final YMaxLengthValidator newValidator = this.factory.createMaxLengthValidator();
    int _maxLength = eObject.getMaxLength();
    newValidator.setMaxLength(_maxLength);
    this.associateUi(eObject, newValidator);
    final YField yField = this.<YField>peek();
    boolean _notEquals = (!Objects.equal(yField, null));
    if (_notEquals) {
      EList<YValidator> _validators = yField.getValidators();
      _validators.add(newValidator);
    }
  }
  
  protected void _map(final UiMinLengthValidator eObject) {
    final YMinLengthValidator newValidator = this.factory.createMinLengthValidator();
    int _minLength = eObject.getMinLength();
    newValidator.setMinLength(_minLength);
    this.associateUi(eObject, newValidator);
    final YField yField = this.<YField>peek();
    boolean _notEquals = (!Objects.equal(yField, null));
    if (_notEquals) {
      EList<YValidator> _validators = yField.getValidators();
      _validators.add(newValidator);
    }
  }
  
  protected void _map(final UiRegexpValidator eObject) {
    final YRegexpValidator newValidator = this.factory.createRegexpValidator();
    String _regExpression = eObject.getRegExpression();
    newValidator.setRegExpression(_regExpression);
    this.associateUi(eObject, newValidator);
    final YField yField = this.<YField>peek();
    boolean _notEquals = (!Objects.equal(yField, null));
    if (_notEquals) {
      EList<YValidator> _validators = yField.getValidators();
      _validators.add(newValidator);
    }
  }
  
  protected void _map(final UiXbaseValidator eObject) {
    final Set<EObject> jvmTypes = this.getJvmElements(eObject);
    JvmGenericType _xifexpression = null;
    int _size = jvmTypes.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      Set<EObject> _jvmElements = this.getJvmElements(eObject);
      EObject _get = ((EObject[])Conversions.unwrapArray(_jvmElements, EObject.class))[0];
      _xifexpression = ((JvmGenericType) _get);
    }
    final JvmGenericType jvmType = _xifexpression;
    final YField yField = this.<YField>peek();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(jvmType, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(yField, null));
      _and = _notEquals_1;
    }
    if (_and) {
      final YClassDelegateValidator yValidator = this.factory.createClassDelegateValidator();
      this.associateUi(eObject, yValidator);
      String _qualifiedName = jvmType.getQualifiedName();
      yValidator.setClassName(_qualifiedName);
      EList<YValidator> _validators = yField.getValidators();
      _validators.add(yValidator);
    }
  }
  
  protected YEmbeddable _create(final YEmbeddable object) {
    return null;
  }
  
  protected YEmbeddable _create(final UiTextField object) {
    final YTextField textField = this.factory.createTextField();
    String _name = object.getName();
    textField.setName(_name);
    String _name_1 = object.getName();
    textField.setLabel(_name_1);
    this.associateUi(object, textField);
    return textField;
  }
  
  protected YEmbeddable _create(final UiNumericField object) {
    final YNumericField field = this.factory.createNumericField();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiCheckBox object) {
    final YCheckBox textField = this.factory.createCheckBox();
    String _name = object.getName();
    textField.setName(_name);
    String _name_1 = object.getName();
    textField.setLabel(_name_1);
    this.associateUi(object, textField);
    return textField;
  }
  
  public void addToParent(final YEmbeddable embeddable) {
    final Object context = this.<Object>peek();
    if ((context instanceof YLayout)) {
      final YLayout layout = ((YLayout) context);
      layout.addElement(embeddable);
    } else {
      if ((context instanceof YView)) {
        final YView yView = ((YView) context);
        yView.setContent(embeddable);
      }
    }
  }
  
  protected void _map(final UiPoint object) {
  }
  
  protected void _map(final UiBindingEndpointAlias object) {
  }
  
  protected void _map(final UiBindingEndpointAssignment object) {
  }
  
  protected void _map(final UiBinding object) {
    UiTypedBindable _sourceAlias = object.getSourceAlias();
    final UiBindingEndpointAlias sourceAlias = ((UiBindingEndpointAlias) _sourceAlias);
    final UiBindingExpression source = object.getSource();
    UiTypedBindable _targetAlias = object.getTargetAlias();
    final UiBindingEndpointAlias targetAlias = ((UiBindingEndpointAlias) _targetAlias);
    final UiBindingExpression target = object.getTarget();
    UiBindingEndpointAssignment sourceEndpoint = ((UiBindingEndpointAssignment) source);
    boolean _notEquals = (!Objects.equal(sourceAlias, null));
    if (_notEquals) {
      UiBindingExpression _endpoint = sourceAlias.getEndpoint();
      sourceEndpoint = ((UiBindingEndpointAssignment) _endpoint);
    }
    UiBindingEndpointAssignment targetEndpoint = ((UiBindingEndpointAssignment) target);
    boolean _notEquals_1 = (!Objects.equal(targetAlias, null));
    if (_notEquals_1) {
      UiBindingExpression _endpoint_1 = targetAlias.getEndpoint();
      targetEndpoint = ((UiBindingEndpointAssignment) _endpoint_1);
    }
    final YBindingEndpoint sourceResult = this.createBindingEndpoint(sourceEndpoint);
    final YBindingEndpoint targetResult = this.createBindingEndpoint(targetEndpoint);
    YBindingUpdateStrategy sourceToTargetStrategy = YBindingUpdateStrategy.UPDATE;
    boolean _isSourceToTarget = object.isSourceToTarget();
    boolean _not = (!_isSourceToTarget);
    if (_not) {
      sourceToTargetStrategy = YBindingUpdateStrategy.ON_REQUEST;
    }
    YBindingUpdateStrategy targetToSourceStrategy = YBindingUpdateStrategy.UPDATE;
    boolean _isTargetToSource = object.isTargetToSource();
    boolean _not_1 = (!_isTargetToSource);
    if (_not_1) {
      targetToSourceStrategy = YBindingUpdateStrategy.ON_REQUEST;
    }
    boolean _and = false;
    if (!(sourceResult instanceof YValueBindingEndpoint)) {
      _and = false;
    } else {
      _and = (targetResult instanceof YValueBindingEndpoint);
    }
    if (_and) {
      YBindingSet _orCreateBindingSet = this.currentView.getOrCreateBindingSet();
      _orCreateBindingSet.addBinding(((YValueBindingEndpoint) targetResult), 
        ((YValueBindingEndpoint) sourceResult), targetToSourceStrategy, sourceToTargetStrategy);
    } else {
      boolean _and_1 = false;
      if (!(sourceResult instanceof YListBindingEndpoint)) {
        _and_1 = false;
      } else {
        _and_1 = (targetResult instanceof YListBindingEndpoint);
      }
      if (_and_1) {
        YBindingSet _orCreateBindingSet_1 = this.currentView.getOrCreateBindingSet();
        _orCreateBindingSet_1.addBinding(((YListBindingEndpoint) targetResult), 
          ((YListBindingEndpoint) sourceResult), targetToSourceStrategy, sourceToTargetStrategy);
      } else {
        boolean _or = false;
        boolean _equals = Objects.equal(sourceResult, null);
        if (_equals) {
          _or = true;
        } else {
          boolean _equals_1 = Objects.equal(targetResult, null);
          _or = _equals_1;
        }
        if (_or) {
        } else {
          String _plus = (sourceResult + " is not bindable to ");
          String _plus_1 = (_plus + targetResult);
          throw new IllegalArgumentException(_plus_1);
        }
      }
    }
  }
  
  public YBindingEndpoint createBindingEndpoint(final UiBindingEndpointAssignment epDef) {
    boolean _equals = Objects.equal(epDef, null);
    if (_equals) {
      return null;
    }
    YBindingEndpoint result = null;
    final UiModelDerivedStateComputerx.BindingInfo info = new UiModelDerivedStateComputerx.BindingInfo();
    this.collectBindingInfo(epDef, info);
    EObject _bindingRoot = info.getBindingRoot();
    if ((_bindingRoot instanceof UiBeanSlot)) {
      EObject _bindingRoot_1 = info.getBindingRoot();
      final UiBeanSlot uiBeanSlot = ((UiBeanSlot) _bindingRoot_1);
      final YBeanSlot yBeanSlot = this.<YBeanSlot>associatedUi(uiBeanSlot);
      final YBeanSlotValueBindingEndpoint ep = this.factory.createBeanSlotValueBindingEndpoint();
      ep.setBeanSlot(yBeanSlot);
      StringBuilder _path = info.getPath();
      String _string = _path.toString();
      ep.setAttributePath(_string);
      result = ep;
    } else {
      EObject _bindingRoot_2 = info.getBindingRoot();
      if ((_bindingRoot_2 instanceof UiEmbeddable)) {
        EObject _bindingRoot_3 = info.getBindingRoot();
        final YEmbeddable yElement = this.<YEmbeddable>associatedUi(_bindingRoot_3);
        final YECViewModelValueBindingEndpoint ep_1 = this.factory.createECViewModelValueBindingEndpoint();
        ep_1.setElement(yElement);
        StringBuilder _path_1 = info.getPath();
        String _string_1 = _path_1.toString();
        ep_1.setPropertyPath(_string_1);
        JvmType _bindingType = info.getBindingType();
        boolean _notEquals = (!Objects.equal(_bindingType, null));
        if (_notEquals) {
          JvmType _bindingType_1 = info.getBindingType();
          String _qualifiedName = _bindingType_1.getQualifiedName();
          ep_1.setTypeQualifiedName(_qualifiedName);
          Resource _eResource = epDef.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          String _typeQualifiedName = ep_1.getTypeQualifiedName();
          Class<?> _loadClass = this.loadClass(_resourceSet, _typeQualifiedName);
          ep_1.setType(_loadClass);
        }
        boolean _notEquals_1 = (!Objects.equal(yElement, null));
        if (_notEquals_1) {
          EClass _eClass = yElement.eClass();
          EPackage _ePackage = _eClass.getEPackage();
          String _nsURI = _ePackage.getNsURI();
          ep_1.setEmfNsURI(_nsURI);
        }
        result = ep_1;
      }
    }
    return result;
  }
  
  protected void _collectBindingInfo(final UiBindingEndpointAssignment assignment, final UiModelDerivedStateComputerx.BindingInfo info) {
    UiModelDerivedStateComputerx.BindingInfo _xifexpression = null;
    boolean _notEquals = (!Objects.equal(info, null));
    if (_notEquals) {
      _xifexpression = info;
    } else {
      _xifexpression = new UiModelDerivedStateComputerx.BindingInfo();
    }
    UiModelDerivedStateComputerx.BindingInfo result = _xifexpression;
    UiTypedBindable _typedBindableAlias = assignment.getTypedBindableAlias();
    boolean _notEquals_1 = (!Objects.equal(_typedBindableAlias, null));
    if (_notEquals_1) {
      UiTypedBindable _typedBindableAlias_1 = assignment.getTypedBindableAlias();
      this.collectBindingInfo(_typedBindableAlias_1, result);
    } else {
      UiBindingExpression _typedBindableDef = assignment.getTypedBindableDef();
      this.collectBindingInfo(_typedBindableDef, result);
    }
    UiPathSegment _path = assignment.getPath();
    boolean _notEquals_2 = (!Objects.equal(_path, null));
    if (_notEquals_2) {
      UiPathSegment _path_1 = assignment.getPath();
      String _pathString = _path_1.toPathString();
      info.appendPath(_pathString);
      UiPathSegment _path_2 = assignment.getPath();
      JvmType _typeofLastSegment = _path_2.getTypeofLastSegment();
      info.setBindingType(_typeofLastSegment);
    }
  }
  
  protected void _collectBindingInfo(final UiBeanSlot slot, final UiModelDerivedStateComputerx.BindingInfo info) {
    info.setBindingRoot(slot);
    JvmTypeReference _jvmType = slot.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    info.setBindingType(_type);
  }
  
  protected void _collectBindingInfo(final UiBindingEndpointAlias alias, final UiModelDerivedStateComputerx.BindingInfo info) {
    UiBindingExpression _endpoint = alias.getEndpoint();
    this.collectBindingInfo(_endpoint, info);
  }
  
  protected void _collectBindingInfo(final UiTypedBindableDef definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    JvmType _type = this.bindingTypeProvider.getType(definition);
    info.setBindingType(_type);
    UiRawBindable _rawBindable = definition.getRawBindable();
    info.setBindingRoot(_rawBindable);
    final UxEndpointDef bindingMethod = definition.getMethod();
    boolean _notEquals = (!Objects.equal(bindingMethod, null));
    if (_notEquals) {
      String _name = bindingMethod.getName();
      info.appendPath(_name);
    }
  }
  
  protected void _collectBindingInfo(final UiBindingExpression definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    throw new UnsupportedOperationException();
  }
  
  public Object resolve(final UiBindingEndpointAlias alias) {
    Object _xblockexpression = null;
    {
      final UiBindingExpression temp = alias.getEndpoint();
      Object _xifexpression = null;
      if ((temp instanceof UiBindingEndpointAssignment)) {
        Object _xblockexpression_1 = null;
        {
          final UiBindingEndpointAssignment assign = ((UiBindingEndpointAssignment) temp);
          Object _xifexpression_1 = null;
          boolean _and = false;
          UiTypedBindable _typedBindableAlias = assign.getTypedBindableAlias();
          boolean _notEquals = (!Objects.equal(_typedBindableAlias, null));
          if (!_notEquals) {
            _and = false;
          } else {
            UiTypedBindable _typedBindableAlias_1 = assign.getTypedBindableAlias();
            _and = (_typedBindableAlias_1 instanceof UiBindingEndpointAlias);
          }
          if (_and) {
            UiTypedBindable _typedBindableAlias_2 = assign.getTypedBindableAlias();
            _xifexpression_1 = this.resolve(((UiBindingEndpointAlias) _typedBindableAlias_2));
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Class<?> loadClass(final ResourceSet resourceSet, final String qualifiedName) {
    final IJdtTypeLoader loader = this.typeLoaderProvider.get(resourceSet);
    boolean _equals = Objects.equal(loader, null);
    if (_equals) {
      return null;
    }
    return loader.findTypeByName(qualifiedName);
  }
  
  protected void _map(final UiPathSegment object) {
  }
  
  protected void _map(final UiBeanSlot object) {
    final YBeanSlot yBeanSlot = this.factory.createBeanSlot();
    String _name = object.getName();
    yBeanSlot.setName(_name);
    JvmTypeReference _jvmType = object.getJvmType();
    String _qualifiedName = null;
    if (_jvmType!=null) {
      _qualifiedName=_jvmType.getQualifiedName();
    }
    yBeanSlot.setValueTypeQualifiedName(_qualifiedName);
    Resource _eResource = object.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _valueTypeQualifiedName = yBeanSlot.getValueTypeQualifiedName();
    Class<?> _loadClass = this.loadClass(_resourceSet, _valueTypeQualifiedName);
    yBeanSlot.setValueType(_loadClass);
    this.associateUi(object, yBeanSlot);
    final EObject lastElement = this.viewContext.peek();
    if ((lastElement instanceof YView)) {
      EList<YBeanSlot> _beanSlots = ((YView) lastElement).getBeanSlots();
      _beanSlots.add(yBeanSlot);
    } else {
      if ((lastElement instanceof YViewSet)) {
        EList<YBeanSlot> _beanSlots_1 = ((YViewSet) lastElement).getBeanSlots();
        _beanSlots_1.add(yBeanSlot);
      }
    }
  }
  
  protected void _map(final EObject object) {
  }
  
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    super.discardDerivedState(resource);
    EList<EObject> _contents = resource.getContents();
    int _size = _contents.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (int i = 1; (i < resource.getContents().size()); i++) {
        EList<EObject> _contents_1 = resource.getContents();
        _contents_1.remove(1);
      }
    }
  }
  
  public void map(final EObject eObject) {
    if (eObject instanceof UiGridLayout) {
      _map((UiGridLayout)eObject);
      return;
    } else if (eObject instanceof UiIDEView) {
      _map((UiIDEView)eObject);
      return;
    } else if (eObject instanceof UiMaxLengthValidator) {
      _map((UiMaxLengthValidator)eObject);
      return;
    } else if (eObject instanceof UiMinLengthValidator) {
      _map((UiMinLengthValidator)eObject);
      return;
    } else if (eObject instanceof UiRegexpValidator) {
      _map((UiRegexpValidator)eObject);
      return;
    } else if (eObject instanceof UiView) {
      _map((UiView)eObject);
      return;
    } else if (eObject instanceof UiXbaseValidator) {
      _map((UiXbaseValidator)eObject);
      return;
    } else if (eObject instanceof UiBeanSlot) {
      _map((UiBeanSlot)eObject);
      return;
    } else if (eObject instanceof UiBindingEndpointAlias) {
      _map((UiBindingEndpointAlias)eObject);
      return;
    } else if (eObject instanceof UiBindingEndpointAssignment) {
      _map((UiBindingEndpointAssignment)eObject);
      return;
    } else if (eObject instanceof UiValidatorAlias) {
      _map((UiValidatorAlias)eObject);
      return;
    } else if (eObject instanceof UiModel) {
      _map((UiModel)eObject);
      return;
    } else if (eObject instanceof UiValidatorAssignment) {
      _map((UiValidatorAssignment)eObject);
      return;
    } else if (eObject instanceof UiValidatorDef) {
      _map((UiValidatorDef)eObject);
      return;
    } else if (eObject instanceof UiBinding) {
      _map((UiBinding)eObject);
      return;
    } else if (eObject instanceof UiGridLayoutAssigment) {
      _map((UiGridLayoutAssigment)eObject);
      return;
    } else if (eObject instanceof UiPathSegment) {
      _map((UiPathSegment)eObject);
      return;
    } else if (eObject instanceof UiPoint) {
      _map((UiPoint)eObject);
      return;
    } else if (eObject != null) {
      _map(eObject);
      return;
    } else if (eObject == null) {
      _map((Void)null);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eObject).toString());
    }
  }
  
  public YEmbeddable create(final EObject object) {
    if (object instanceof UiCheckBox) {
      return _create((UiCheckBox)object);
    } else if (object instanceof UiNumericField) {
      return _create((UiNumericField)object);
    } else if (object instanceof UiTextField) {
      return _create((UiTextField)object);
    } else if (object instanceof YEmbeddable) {
      return _create((YEmbeddable)object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public void collectBindingInfo(final EObject slot, final UiModelDerivedStateComputerx.BindingInfo info) {
    if (slot instanceof UiBeanSlot) {
      _collectBindingInfo((UiBeanSlot)slot, info);
      return;
    } else if (slot instanceof UiBindingEndpointAlias) {
      _collectBindingInfo((UiBindingEndpointAlias)slot, info);
      return;
    } else if (slot instanceof UiBindingEndpointAssignment) {
      _collectBindingInfo((UiBindingEndpointAssignment)slot, info);
      return;
    } else if (slot instanceof UiTypedBindableDef) {
      _collectBindingInfo((UiTypedBindableDef)slot, info);
      return;
    } else if (slot instanceof UiBindingExpression) {
      _collectBindingInfo((UiBindingExpression)slot, info);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(slot, info).toString());
    }
  }
}
