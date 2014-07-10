package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.lunifera.ecview.dsl.IJdtTypeLoader;
import org.lunifera.ecview.dsl.IJdtTypeLoaderProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointDef;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;
import org.lunifera.ecview.semantic.uisemantics.UxListBindingEndpointDef;
import org.lunifera.ecview.semantic.uisemantics.UxValueBindingEndpointDef;

@SuppressWarnings("all")
public class UiModelDerivedStateComputerx implements IDerivedStateComputer {
  @Inject
  private IJdtTypeLoaderProvider typeLoaderProvider;
  
  private final Stack<EObject> viewContext = new Stack<EObject>();
  
  private List<YView> views = CollectionLiterals.<YView>newArrayList();
  
  private YView currentView;
  
  private Map<EObject, EObject> associations = CollectionLiterals.<EObject, EObject>newHashMap();
  
  private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
  
  public void associate(final EObject grammarElement, final EObject yElement) {
    this.associations.put(grammarElement, yElement);
  }
  
  public <A extends Object> A associated(final EObject grammarElement) {
    EObject _get = this.associations.get(grammarElement);
    return ((A) _get);
  }
  
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    EList<EObject> _contents = resource.getContents();
    boolean _isEmpty = _contents.isEmpty();
    if (_isEmpty) {
      return;
    }
    if ((!preLinkingPhase)) {
      EList<EObject> _contents_1 = resource.getContents();
      final Procedure1<EObject> _function = new Procedure1<EObject>() {
        public void apply(final EObject it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<EObject>forEach(_contents_1, _function);
      EList<EObject> _contents_2 = resource.getContents();
      YView _get = this.views.get(0);
      _contents_2.add(_get);
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
    final Procedure1<UiRootElements> _function = new Procedure1<UiRootElements>() {
      public void apply(final UiRootElements it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiRootElements>forEach(_roots, _function);
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
    this.viewContext.push(yView);
    EList<YBeanSlot> _beanSlots = object.getBeanSlots();
    final Procedure1<YBeanSlot> _function = new Procedure1<YBeanSlot>() {
      public void apply(final YBeanSlot it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<YBeanSlot>forEach(_beanSlots, _function);
    YEmbeddable _content = object.getContent();
    this.map(_content);
    EList<UiBinding> _bindings = object.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
    this.currentView = null;
  }
  
  protected void _map(final UiGridLayout eObject) {
    final YGridLayout layout = this.factory.createGridLayout();
    String _name = eObject.getName();
    layout.setName(_name);
    int _columns = eObject.getColumns();
    layout.setColumns(_columns);
    this.addToParent(layout);
    this.associate(eObject, layout);
    this.viewContext.push(layout);
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
    final YEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    if ((element instanceof YField)) {
      this.viewContext.push(newField);
      final YField yField = ((YField) element);
      EList<YValidator> _validators = yField.getValidators();
      final Procedure1<YValidator> _function = new Procedure1<YValidator>() {
        public void apply(final YValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<YValidator>forEach(_validators, _function);
      this.<Object>pop();
    }
  }
  
  protected void _map(final YMaxLengthValidator eObject) {
    final YMaxLengthValidator newValidator = this.factory.createMaxLengthValidator();
    int _maxLength = eObject.getMaxLength();
    newValidator.setMaxLength(_maxLength);
    this.associate(eObject, newValidator);
    final YField field = this.<YField>peek();
    EList<YValidator> _validators = field.getValidators();
    _validators.add(newValidator);
  }
  
  protected void _map(final YMinLengthValidator eObject) {
    final YMinLengthValidator newValidator = this.factory.createMinLengthValidator();
    int _minLength = eObject.getMinLength();
    newValidator.setMinLength(_minLength);
    this.associate(eObject, newValidator);
    final YField field = this.<YField>peek();
    EList<YValidator> _validators = field.getValidators();
    _validators.add(newValidator);
  }
  
  protected void _map(final YRegexpValidator eObject) {
    final YRegexpValidator newValidator = this.factory.createRegexpValidator();
    String _regExpression = eObject.getRegExpression();
    newValidator.setRegExpression(_regExpression);
    this.associate(eObject, newValidator);
    final YField field = this.<YField>peek();
    EList<YValidator> _validators = field.getValidators();
    _validators.add(newValidator);
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
    this.associate(object, textField);
    return textField;
  }
  
  protected YEmbeddable _create(final UiNumericField object) {
    final YNumericField field = this.factory.createNumericField();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    this.associate(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiCheckBox object) {
    final YCheckBox textField = this.factory.createCheckBox();
    String _name = object.getName();
    textField.setName(_name);
    String _name_1 = object.getName();
    textField.setLabel(_name_1);
    this.associate(object, textField);
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
  
  protected void _map(final UiBindingEndpointDef object) {
  }
  
  protected void _map(final UiBinding object) {
    final UiBindingEndpointAlias sourceAlias = object.getSourceAlias();
    final UiBindingEndpointDef source = object.getSource();
    final UiBindingEndpointAlias targetAlias = object.getTargetAlias();
    final UiBindingEndpointDef target = object.getTarget();
    UiBindingEndpointDef sourceEndpoint = source;
    boolean _notEquals = (!Objects.equal(sourceAlias, null));
    if (_notEquals) {
      UiBindingEndpointDef _endpoint = sourceAlias.getEndpoint();
      sourceEndpoint = _endpoint;
    }
    UiBindingEndpointDef targetEndpoint = target;
    boolean _notEquals_1 = (!Objects.equal(targetAlias, null));
    if (_notEquals_1) {
      UiBindingEndpointDef _endpoint_1 = targetAlias.getEndpoint();
      targetEndpoint = _endpoint_1;
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
  
  public YBindingEndpoint createBindingEndpoint(final UiBindingEndpointDef epDef) {
    boolean _equals = Objects.equal(epDef, null);
    if (_equals) {
      return null;
    }
    YBindingEndpoint result = null;
    final UxEndpointDef sourceEndpointDef = epDef.getEndpoint();
    YElement _bindable = epDef.getBindable();
    if ((_bindable instanceof YBeanSlot)) {
      YElement _bindable_1 = epDef.getBindable();
      final YBeanSlot yBeanSlot = this.<YBeanSlot>associated(_bindable_1);
      if ((sourceEndpointDef instanceof UxValueBindingEndpointDef)) {
        final UxValueBindingEndpointDef cEndpointDef = ((UxValueBindingEndpointDef) sourceEndpointDef);
        final YBeanSlotValueBindingEndpoint ep = this.factory.createBeanSlotValueBindingEndpoint();
        ep.setBeanSlot(yBeanSlot);
        String _name = cEndpointDef.getName();
        ep.setName(_name);
        String _xifexpression = null;
        UiPathSegment _path = epDef.getPath();
        boolean _notEquals = (!Objects.equal(_path, null));
        if (_notEquals) {
          UiPathSegment _path_1 = epDef.getPath();
          _xifexpression = _path_1.toPathString();
        }
        ep.setAttributePath(_xifexpression);
        result = ep;
      } else {
        if ((sourceEndpointDef instanceof UxListBindingEndpointDef)) {
          final UxListBindingEndpointDef cEndpointDef_1 = ((UxListBindingEndpointDef) sourceEndpointDef);
          final YBeanSlotListBindingEndpoint ep_1 = this.factory.createBeanSlotListBindingEndpoint();
          ep_1.setBeanSlot(((YBeanSlot) yBeanSlot));
          String _name_1 = cEndpointDef_1.getName();
          ep_1.setName(_name_1);
          String _xifexpression_1 = null;
          UiPathSegment _path_2 = epDef.getPath();
          boolean _notEquals_1 = (!Objects.equal(_path_2, null));
          if (_notEquals_1) {
            UiPathSegment _path_3 = epDef.getPath();
            _xifexpression_1 = _path_3.toPathString();
          }
          ep_1.setAttributePath(_xifexpression_1);
          UxEndpointDef _endpoint = epDef.getEndpoint();
          JvmTypeReference _jvmType = _endpoint.getJvmType();
          String _qualifiedName = _jvmType.getQualifiedName();
          ep_1.setCollectionTypeQualifiedName(_qualifiedName);
          Resource _eResource = epDef.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          String _collectionTypeQualifiedName = ep_1.getCollectionTypeQualifiedName();
          Class<?> _loadClass = this.loadClass(_resourceSet, _collectionTypeQualifiedName);
          ep_1.setCollectionType(_loadClass);
          result = ep_1;
        }
      }
    } else {
      YElement _bindable_2 = epDef.getBindable();
      if ((_bindable_2 instanceof YElement)) {
        YElement _bindable_3 = epDef.getBindable();
        final YElement yElement = this.<YElement>associated(_bindable_3);
        if ((sourceEndpointDef instanceof UxValueBindingEndpointDef)) {
          final UxValueBindingEndpointDef cEndpointDef_2 = ((UxValueBindingEndpointDef) sourceEndpointDef);
          final YECViewModelValueBindingEndpoint ep_2 = this.factory.createECViewModelValueBindingEndpoint();
          ep_2.setElement(yElement);
          String _name_2 = cEndpointDef_2.getName();
          ep_2.setName(_name_2);
          String _xifexpression_2 = null;
          UiPathSegment _path_4 = epDef.getPath();
          boolean _notEquals_2 = (!Objects.equal(_path_4, null));
          if (_notEquals_2) {
            String _name_3 = cEndpointDef_2.getName();
            String _plus = (_name_3 + ".");
            UiPathSegment _path_5 = epDef.getPath();
            String _pathString = _path_5.toPathString();
            _xifexpression_2 = (_plus + _pathString);
          } else {
            _xifexpression_2 = cEndpointDef_2.getName();
          }
          ep_2.setPropertyPath(_xifexpression_2);
          UxEndpointDef _endpoint_1 = epDef.getEndpoint();
          JvmTypeReference _jvmType_1 = _endpoint_1.getJvmType();
          String _qualifiedName_1 = _jvmType_1.getQualifiedName();
          ep_2.setTypeQualifiedName(_qualifiedName_1);
          Resource _eResource_1 = epDef.eResource();
          ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
          String _typeQualifiedName = ep_2.getTypeQualifiedName();
          Class<?> _loadClass_1 = this.loadClass(_resourceSet_1, _typeQualifiedName);
          ep_2.setType(_loadClass_1);
          EClass _eClass = yElement.eClass();
          EPackage _ePackage = _eClass.getEPackage();
          String _nsURI = _ePackage.getNsURI();
          ep_2.setEmfNsURI(_nsURI);
          result = ep_2;
        } else {
          if ((sourceEndpointDef instanceof UxListBindingEndpointDef)) {
            final UxValueBindingEndpointDef cEndpointDef_3 = ((UxValueBindingEndpointDef) sourceEndpointDef);
            final YECViewModelListBindingEndpoint ep_3 = this.factory.createECViewModelListBindingEndpoint();
            ep_3.setElement(yElement);
            String _name_4 = cEndpointDef_3.getName();
            ep_3.setName(_name_4);
            String _xifexpression_3 = null;
            UiPathSegment _path_6 = epDef.getPath();
            boolean _notEquals_3 = (!Objects.equal(_path_6, null));
            if (_notEquals_3) {
              String _name_5 = cEndpointDef_3.getName();
              String _plus_1 = (_name_5 + ".");
              UiPathSegment _path_7 = epDef.getPath();
              String _pathString_1 = _path_7.toPathString();
              _xifexpression_3 = (_plus_1 + _pathString_1);
            } else {
              _xifexpression_3 = cEndpointDef_3.getName();
            }
            ep_3.setPropertyPath(_xifexpression_3);
            UxEndpointDef _endpoint_2 = epDef.getEndpoint();
            JvmTypeReference _jvmType_2 = _endpoint_2.getJvmType();
            String _qualifiedName_2 = _jvmType_2.getQualifiedName();
            ep_3.setTypeQualifiedName(_qualifiedName_2);
            Resource _eResource_2 = epDef.eResource();
            ResourceSet _resourceSet_2 = _eResource_2.getResourceSet();
            String _typeQualifiedName_1 = ep_3.getTypeQualifiedName();
            Class<?> _loadClass_2 = this.loadClass(_resourceSet_2, _typeQualifiedName_1);
            ep_3.setType(_loadClass_2);
            EClass _eClass_1 = yElement.eClass();
            EPackage _ePackage_1 = _eClass_1.getEPackage();
            String _nsURI_1 = _ePackage_1.getNsURI();
            ep_3.setEmfNsURI(_nsURI_1);
            result = ep_3;
          }
        }
      }
    }
    return result;
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
    String _qualifiedName = _jvmType.getQualifiedName();
    yBeanSlot.setValueTypeQualifiedName(_qualifiedName);
    Resource _eResource = object.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    String _valueTypeQualifiedName = yBeanSlot.getValueTypeQualifiedName();
    Class<?> _loadClass = this.loadClass(_resourceSet, _valueTypeQualifiedName);
    yBeanSlot.setValueType(_loadClass);
    this.associate(object, yBeanSlot);
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
  
  public void map(final EObject object) {
    if (object instanceof UiIDEView) {
      _map((UiIDEView)object);
      return;
    } else if (object instanceof UiGridLayout) {
      _map((UiGridLayout)object);
      return;
    } else if (object instanceof UiView) {
      _map((UiView)object);
      return;
    } else if (object instanceof YMaxLengthValidator) {
      _map((YMaxLengthValidator)object);
      return;
    } else if (object instanceof YMinLengthValidator) {
      _map((YMinLengthValidator)object);
      return;
    } else if (object instanceof YRegexpValidator) {
      _map((YRegexpValidator)object);
      return;
    } else if (object instanceof UiBeanSlot) {
      _map((UiBeanSlot)object);
      return;
    } else if (object instanceof UiBinding) {
      _map((UiBinding)object);
      return;
    } else if (object instanceof UiBindingEndpointAlias) {
      _map((UiBindingEndpointAlias)object);
      return;
    } else if (object instanceof UiBindingEndpointDef) {
      _map((UiBindingEndpointDef)object);
      return;
    } else if (object instanceof UiModel) {
      _map((UiModel)object);
      return;
    } else if (object instanceof UiPathSegment) {
      _map((UiPathSegment)object);
      return;
    } else if (object instanceof UiPoint) {
      _map((UiPoint)object);
      return;
    } else if (object instanceof UiGridLayoutAssigment) {
      _map((UiGridLayoutAssigment)object);
      return;
    } else if (object != null) {
      _map(object);
      return;
    } else if (object == null) {
      _map((Void)null);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public YEmbeddable create(final YEmbeddable object) {
    if (object instanceof UiCheckBox) {
      return _create((UiCheckBox)object);
    } else if (object instanceof UiNumericField) {
      return _create((UiNumericField)object);
    } else if (object instanceof UiTextField) {
      return _create((UiTextField)object);
    } else if (object != null) {
      return _create(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
