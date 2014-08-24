package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy;
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YCommandSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YDialog;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YOpenDialogCommand;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.common.model.validation.YClassDelegateValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBooleanSearchField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YFlatAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YFormLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YImage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericSearchField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YProgressBar;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSelectionType;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextSearchField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.xtext.common.types.JvmField;
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
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.dsl.derivedstate.TypeHelper;
import org.lunifera.ecview.dsl.derivedstate.UiGrammarElementAdapter;
import org.lunifera.ecview.dsl.scope.BindableTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiBrowser;
import org.lunifera.ecview.semantic.uimodel.UiButton;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiCommand;
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiDateField;
import org.lunifera.ecview.semantic.uimodel.UiDecimalField;
import org.lunifera.ecview.semantic.uimodel.UiDialog;
import org.lunifera.ecview.semantic.uimodel.UiDialogAssignment;
import org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiFlatAlignment;
import org.lunifera.ecview.semantic.uimodel.UiFormLayout;
import org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImage;
import org.lunifera.ecview.semantic.uimodel.UiLabel;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationCommand;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationHandler;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiMobileView;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiProgressBar;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiSearchDialog;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand;
import org.lunifera.ecview.semantic.uimodel.UiSelectionType;
import org.lunifera.ecview.semantic.uimodel.UiSwitch;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiTextArea;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindable;
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiValidatorDef;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;
import org.lunifera.mobile.vaadin.ecview.model.VMHorizontalButtonGroup;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationButton;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationCommand;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationHandler;
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
import org.lunifera.mobile.vaadin.ecview.model.VMSwitch;
import org.lunifera.mobile.vaadin.ecview.model.VMTab;
import org.lunifera.mobile.vaadin.ecview.model.VMTabSheet;
import org.lunifera.mobile.vaadin.ecview.model.VMVerticalComponentGroup;
import org.lunifera.mobile.vaadin.ecview.model.VaadinMobileFactory;
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoader;
import org.lunifera.xtext.builder.ui.access.jdt.IJdtTypeLoaderFactory;

@SuppressWarnings("all")
public class UiModelDerivedStateComputerx extends JvmModelAssociator {
  public static class BindingInfo {
    /**
     * The type of the bound property. For nested bindings it is the last element available
     */
    private JvmType _typeOfBoundProperty;
    
    /**
     * The type of the bound property. For nested bindings it is the last element available
     */
    public JvmType getTypeOfBoundProperty() {
      return this._typeOfBoundProperty;
    }
    
    /**
     * The type of the bound property. For nested bindings it is the last element available
     */
    public void setTypeOfBoundProperty(final JvmType typeOfBoundProperty) {
      this._typeOfBoundProperty = typeOfBoundProperty;
    }
    
    /**
     * The type of the binding. For nested bindings it is the element before the bound property
     */
    private JvmType _typeForBinding;
    
    /**
     * The type of the binding. For nested bindings it is the element before the bound property
     */
    public JvmType getTypeForBinding() {
      return this._typeForBinding;
    }
    
    /**
     * The type of the binding. For nested bindings it is the element before the bound property
     */
    public void setTypeForBinding(final JvmType typeForBinding) {
      this._typeForBinding = typeForBinding;
    }
    
    /**
     * The deepest JvmField in the hierarchy. This field is used to bind.
     */
    private JvmField _deepestJvmField;
    
    /**
     * The deepest JvmField in the hierarchy. This field is used to bind.
     */
    public JvmField getDeepestJvmField() {
      return this._deepestJvmField;
    }
    
    /**
     * The deepest JvmField in the hierarchy. This field is used to bind.
     */
    public void setDeepestJvmField(final JvmField deepestJvmField) {
      this._deepestJvmField = deepestJvmField;
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
  private IJdtTypeLoaderFactory typeLoaderFactory;
  
  private IJdtTypeLoader typeLoader;
  
  @Inject
  private BindableTypeProvider typeOfBoundPropertyProvider;
  
  @Inject
  private TypeHelper typeHelper;
  
  private final Stack<EObject> viewContext = new Stack<EObject>();
  
  private final List<YView> views = CollectionLiterals.<YView>newArrayList();
  
  private final Map<EObject, EObject> grammarToUiAssociations = CollectionLiterals.<EObject, EObject>newHashMap();
  
  private final Map<EObject, EObject> uiToGrammarAssociations = CollectionLiterals.<EObject, EObject>newHashMap();
  
  private final SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
  
  private YView currentView;
  
  private DerivedStateAwareResource resource;
  
  private List<UiBinding> pendingBindings = CollectionLiterals.<UiBinding>newArrayList();
  
  private List<UiBinding> temporaryPendingBindings = CollectionLiterals.<UiBinding>newArrayList();
  
  public void associateUi(final EObject grammarElement, final EObject uiElement) {
    this.grammarToUiAssociations.put(grammarElement, uiElement);
    this.uiToGrammarAssociations.put(uiElement, grammarElement);
    EList<org.eclipse.emf.common.notify.Adapter> _eAdapters = uiElement.eAdapters();
    UiGrammarElementAdapter _uiGrammarElementAdapter = new UiGrammarElementAdapter(grammarElement);
    _eAdapters.add(_uiGrammarElementAdapter);
  }
  
  public <A extends Object> A associatedUi(final EObject grammarElement) {
    EObject _get = this.grammarToUiAssociations.get(grammarElement);
    return ((A) _get);
  }
  
  public <A extends Object> A associatedGrammar(final EObject uiElement) {
    EObject _get = this.uiToGrammarAssociations.get(uiElement);
    return ((A) _get);
  }
  
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    super.installDerivedState(resource, preLinkingPhase);
    this.resource = resource;
    ResourceSet _resourceSet = resource.getResourceSet();
    IJdtTypeLoader _createJdtTypeLoader = this.typeLoaderFactory.createJdtTypeLoader(_resourceSet);
    this.typeLoader = _createJdtTypeLoader;
    EList<EObject> _contents = resource.getContents();
    boolean _isEmpty = _contents.isEmpty();
    if (_isEmpty) {
      return;
    }
    if ((!preLinkingPhase)) {
      this.grammarToUiAssociations.clear();
      this.uiToGrammarAssociations.clear();
      EList<EObject> _contents_1 = resource.getContents();
      final EObject eObject = _contents_1.get(0);
      EList<EObject> _eContents = eObject.eContents();
      final Consumer<EObject> _function = new Consumer<EObject>() {
        public void accept(final EObject it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _eContents.forEach(_function);
      int _size = this.views.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EList<EObject> _contents_2 = resource.getContents();
        YView _get = this.views.get(0);
        _contents_2.add(_get);
      }
      this.views.clear();
      this.viewContext.clear();
      this.pendingBindings.clear();
    }
    this.typeLoader.dispose();
    this.typeLoader = null;
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
    final Consumer<UiRootElements> _function_1 = new Consumer<UiRootElements>() {
      public void accept(final UiRootElements it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _filter.forEach(_function_1);
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
    final Consumer<UiBeanSlot> _function = new Consumer<UiBeanSlot>() {
      public void accept(final UiBeanSlot it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _beanSlots.forEach(_function);
    UiEmbeddable _content = object.getContent();
    this.map(_content);
    EList<UiBinding> _bindings = object.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    ArrayList<UiBinding> _newArrayList = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
    this.temporaryPendingBindings = _newArrayList;
    this.pendingBindings.clear();
    final Consumer<UiBinding> _function_2 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.install(it);
      }
    };
    this.temporaryPendingBindings.forEach(_function_2);
    boolean _isEmpty = this.pendingBindings.isEmpty();
    if (_isEmpty) {
      EList<UiValidatorAssignment> _validatorAssignments = object.getValidatorAssignments();
      final Consumer<UiValidatorAssignment> _function_3 = new Consumer<UiValidatorAssignment>() {
        public void accept(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validatorAssignments.forEach(_function_3);
      this.<Object>pop();
      this.currentView = null;
    } else {
      ArrayList<UiBinding> _newArrayList_1 = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
      this.temporaryPendingBindings = _newArrayList_1;
      this.pendingBindings.clear();
      final Consumer<UiBinding> _function_4 = new Consumer<UiBinding>() {
        public void accept(final UiBinding it) {
          UiModelDerivedStateComputerx.this.install(it);
        }
      };
      this.temporaryPendingBindings.forEach(_function_4);
      EList<UiValidatorAssignment> _validatorAssignments_1 = object.getValidatorAssignments();
      final Consumer<UiValidatorAssignment> _function_5 = new Consumer<UiValidatorAssignment>() {
        public void accept(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validatorAssignments_1.forEach(_function_5);
      this.<Object>pop();
      this.currentView = null;
    }
  }
  
  protected void _map(final UiMobileView object) {
    final YView yView = this.factory.createView();
    this.views.add(yView);
    this.currentView = yView;
    this.push(yView);
    EList<UiBeanSlot> _beanSlots = object.getBeanSlots();
    final Consumer<UiBeanSlot> _function = new Consumer<UiBeanSlot>() {
      public void accept(final UiBeanSlot it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _beanSlots.forEach(_function);
    UiEmbeddable _content = object.getContent();
    this.map(_content);
    EList<UiBinding> _bindings = object.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    final Consumer<UiBinding> _function_2 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.install(it);
      }
    };
    this.pendingBindings.forEach(_function_2);
    EList<UiValidatorAssignment> _validatorAssignments = object.getValidatorAssignments();
    final Consumer<UiValidatorAssignment> _function_3 = new Consumer<UiValidatorAssignment>() {
      public void accept(final UiValidatorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _validatorAssignments.forEach(_function_3);
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
    boolean _isFillHorizontal = eObject.isFillHorizontal();
    layout.setFillHorizontal(_isFillHorizontal);
    boolean _isFillVertical = eObject.isFillVertical();
    layout.setFillVertical(_isFillVertical);
    int _columns = eObject.getColumns();
    layout.setColumns(_columns);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiGridLayoutAssigment> _contents = eObject.getContents();
    final Consumer<UiGridLayoutAssigment> _function = new Consumer<UiGridLayoutAssigment>() {
      public void accept(final UiGridLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiGridLayoutAssigment eObject) {
    final YGridLayout layout = this.<YGridLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      layout.addElement(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
  }
  
  protected void _map(final UiVerticalLayout eObject) {
    final YVerticalLayout layout = this.factory.createVerticalLayout();
    String _name = eObject.getName();
    layout.setName(_name);
    boolean _isFillVertical = eObject.isFillVertical();
    layout.setFillVertical(_isFillVertical);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiVerticalLayoutAssigment> _contents = eObject.getContents();
    final Consumer<UiVerticalLayoutAssigment> _function = new Consumer<UiVerticalLayoutAssigment>() {
      public void accept(final UiVerticalLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiVerticalLayoutAssigment eObject) {
    final YVerticalLayout layout = this.<YVerticalLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      boolean _notEquals = (!Objects.equal(newField, null));
      if (_notEquals) {
        layout.addElement(newField);
        this.map(element);
        this.push(newField);
        final UiField yField = ((UiField) element);
        EList<UiValidator> _validators = yField.getValidators();
        final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
          public void accept(final UiValidator it) {
            UiModelDerivedStateComputerx.this.map(it);
          }
        };
        _validators.forEach(_function);
        this.<Object>pop();
      }
    } else {
      this.map(element);
    }
  }
  
  protected void _map(final UiHorizontalLayout eObject) {
    final YHorizontalLayout layout = this.factory.createHorizontalLayout();
    String _name = eObject.getName();
    layout.setName(_name);
    boolean _isFillHorizontal = eObject.isFillHorizontal();
    layout.setFillHorizontal(_isFillHorizontal);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiHorizontalLayoutAssigment> _contents = eObject.getContents();
    final Consumer<UiHorizontalLayoutAssigment> _function = new Consumer<UiHorizontalLayoutAssigment>() {
      public void accept(final UiHorizontalLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiHorizontalLayoutAssigment eObject) {
    final YHorizontalLayout layout = this.<YHorizontalLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      layout.addElement(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
  }
  
  protected void _map(final UiTabSheet eObject) {
    final YTabSheet layout = this.factory.createTabSheet();
    String _name = eObject.getName();
    layout.setName(_name);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiTabAssignment> _tabs = eObject.getTabs();
    final Consumer<UiTabAssignment> _function = new Consumer<UiTabAssignment>() {
      public void accept(final UiTabAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _tabs.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiTabAssignment eObject) {
    final YTabSheet layout = this.<YTabSheet>peek();
    final YTab tab = this.factory.createTab();
    String _name = eObject.getName();
    tab.setLabel(_name);
    EList<YTab> _tabs = layout.getTabs();
    _tabs.add(tab);
    this.push(tab);
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      tab.setEmbeddable(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiMobileTabSheet eObject) {
    final VMTabSheet layout = VaadinMobileFactory.eINSTANCE.createVMTabSheet();
    String _name = eObject.getName();
    layout.setName(_name);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiMobileTabAssignment> _tabs = eObject.getTabs();
    final Consumer<UiMobileTabAssignment> _function = new Consumer<UiMobileTabAssignment>() {
      public void accept(final UiMobileTabAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _tabs.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiMobileTabAssignment eObject) {
    final VMTabSheet layout = this.<VMTabSheet>peek();
    final VMTab tab = VaadinMobileFactory.eINSTANCE.createVMTab();
    String _name = eObject.getName();
    tab.setLabel(_name);
    EList<VMTab> _tabs = layout.getTabs();
    _tabs.add(tab);
    this.push(tab);
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      tab.setEmbeddable(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiHorizontalButtonGroup eObject) {
    final VMHorizontalButtonGroup layout = VaadinMobileFactory.eINSTANCE.createVMHorizontalButtonGroup();
    String _name = eObject.getName();
    layout.setName(_name);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiHorizontalButtonGroupAssigment> _contents = eObject.getContents();
    final Consumer<UiHorizontalButtonGroupAssigment> _function = new Consumer<UiHorizontalButtonGroupAssigment>() {
      public void accept(final UiHorizontalButtonGroupAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiHorizontalButtonGroupAssigment eObject) {
    final VMHorizontalButtonGroup layout = this.<VMHorizontalButtonGroup>peek();
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      layout.addElement(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
  }
  
  protected void _map(final UiVerticalComponentGroup eObject) {
    final VMVerticalComponentGroup layout = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup();
    String _name = eObject.getName();
    layout.setName(_name);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiVerticalComponentGroupAssigment> _contents = eObject.getContents();
    final Consumer<UiVerticalComponentGroupAssigment> _function = new Consumer<UiVerticalComponentGroupAssigment>() {
      public void accept(final UiVerticalComponentGroupAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiVerticalComponentGroupAssigment eObject) {
    final VMVerticalComponentGroup layout = this.<VMVerticalComponentGroup>peek();
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      layout.addElement(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
  }
  
  protected void _map(final UiMobileNavigationPage eObject) {
    final VMNavigationPage layout = VaadinMobileFactory.eINSTANCE.createVMNavigationPage();
    String _name = eObject.getName();
    layout.setName(_name);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiMobileNavigationPageAssignment> _contents = eObject.getContents();
    final Consumer<UiMobileNavigationPageAssignment> _function = new Consumer<UiMobileNavigationPageAssignment>() {
      public void accept(final UiMobileNavigationPageAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    boolean _notEquals = (!Objects.equal(_bindings, null));
    if (_notEquals) {
      EList<UiBinding> _bindings_1 = eObject.getBindings();
      final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
        public void accept(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _bindings_1.forEach(_function_1);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiDialog eObject) {
    final YDialog layout = CoreModelFactory.eINSTANCE.createYDialog();
    String _name = eObject.getName();
    layout.setName(_name);
    String _name_1 = eObject.getName();
    layout.setLabel(_name_1);
    JvmTypeReference _jvmType = eObject.getJvmType();
    boolean _notEquals = (!Objects.equal(_jvmType, null));
    if (_notEquals) {
      JvmTypeReference _jvmType_1 = eObject.getJvmType();
      String _qualifiedName = _jvmType_1.getQualifiedName();
      layout.setTypeQualifiedName(_qualifiedName);
      Resource _eResource = eObject.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      JvmTypeReference _jvmType_2 = eObject.getJvmType();
      String _qualifiedName_1 = _jvmType_2.getQualifiedName();
      Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
      layout.setType(_loadClass);
    }
    this.addToParent(layout);
    EList<YDialog> _dialogs = this.currentView.getDialogs();
    _dialogs.add(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    UiDialogAssignment _content = eObject.getContent();
    if (_content!=null) {
      this.map(_content);
    }
    EList<UiBinding> _bindings = eObject.getBindings();
    boolean _notEquals_1 = (!Objects.equal(_bindings, null));
    if (_notEquals_1) {
      EList<UiBinding> _bindings_1 = eObject.getBindings();
      final Consumer<UiBinding> _function = new Consumer<UiBinding>() {
        public void accept(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _bindings_1.forEach(_function);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiSearchDialog eObject) {
    final YDialog dialog = CoreModelFactory.eINSTANCE.createYDialog();
    String _name = eObject.getName();
    dialog.setName(_name);
    String _name_1 = eObject.getName();
    dialog.setLabel(_name_1);
    JvmTypeReference _jvmType = eObject.getJvmType();
    boolean _notEquals = (!Objects.equal(_jvmType, null));
    if (_notEquals) {
      JvmTypeReference _jvmType_1 = eObject.getJvmType();
      String _qualifiedName = _jvmType_1.getQualifiedName();
      dialog.setTypeQualifiedName(_qualifiedName);
      Resource _eResource = eObject.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      JvmTypeReference _jvmType_2 = eObject.getJvmType();
      String _qualifiedName_1 = _jvmType_2.getQualifiedName();
      Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
      dialog.setType(_loadClass);
    }
    this.addToParent(dialog);
    this.associateUi(eObject, dialog);
    EList<YDialog> _dialogs = this.currentView.getDialogs();
    _dialogs.add(dialog);
    this.push(dialog);
    final YVerticalLayout content = ExtensionModelFactory.eINSTANCE.createYVerticalLayout();
    dialog.setContent(content);
    this.push(content);
    final YGridLayout searchFieldLayout = ExtensionModelFactory.eINSTANCE.createYGridLayout();
    EList<YEmbeddable> _elements = content.getElements();
    _elements.add(searchFieldLayout);
    this.push(searchFieldLayout);
    EList<UiDialogSearchFieldAssignment> _searchFields = eObject.getSearchFields();
    final Consumer<UiDialogSearchFieldAssignment> _function = new Consumer<UiDialogSearchFieldAssignment>() {
      public void accept(final UiDialogSearchFieldAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _searchFields.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
    UiDialogAssignment _content = eObject.getContent();
    if (_content!=null) {
      this.map(_content);
    }
    this.<Object>pop();
    EList<UiBinding> _bindings_1 = eObject.getBindings();
    boolean _notEquals_1 = (!Objects.equal(_bindings_1, null));
    if (_notEquals_1) {
      EList<UiBinding> _bindings_2 = eObject.getBindings();
      final Consumer<UiBinding> _function_2 = new Consumer<UiBinding>() {
        public void accept(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _bindings_2.forEach(_function_2);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiDialogAssignment eObject) {
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      this.addToParent(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
  }
  
  protected void _map(final UiDialogSearchFieldAssignment eObject) {
    final YLayout layout = this.<YLayout>peek();
    final UiSearchField element = eObject.getElement();
    final JvmField property = element.getProperty();
    boolean _notEquals = (!Objects.equal(property, null));
    if (_notEquals) {
      JvmTypeReference _type = null;
      if (property!=null) {
        _type=property.getType();
      }
      JvmType _type_1 = null;
      if (_type!=null) {
        _type_1=_type.getType();
      }
      final JvmType type = _type_1;
      YField newField = null;
      boolean _isString = this.typeHelper.isString(type);
      if (_isString) {
        YTextSearchField _createYTextSearchField = ExtensionModelFactory.eINSTANCE.createYTextSearchField();
        newField = _createYTextSearchField;
      } else {
        boolean _isNumber = this.typeHelper.isNumber(type);
        if (_isNumber) {
          YNumericSearchField _createYNumericSearchField = ExtensionModelFactory.eINSTANCE.createYNumericSearchField();
          newField = _createYNumericSearchField;
        } else {
          boolean _isBoolean = this.typeHelper.isBoolean(type);
          if (_isBoolean) {
            YBooleanSearchField _createYBooleanSearchField = ExtensionModelFactory.eINSTANCE.createYBooleanSearchField();
            newField = _createYBooleanSearchField;
          }
        }
      }
      boolean _notEquals_1 = (!Objects.equal(newField, null));
      if (_notEquals_1) {
        EList<YEmbeddable> _elements = layout.getElements();
        _elements.add(newField);
      }
    }
  }
  
  public void createTransient(final UiMobileNavigationPage eObject) {
    final VMNavigationPage layout = VaadinMobileFactory.eINSTANCE.createVMNavigationPage();
    String _name = eObject.getName();
    layout.setName(_name);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiMobileNavigationPageAssignment> _contents = eObject.getContents();
    final Consumer<UiMobileNavigationPageAssignment> _function = new Consumer<UiMobileNavigationPageAssignment>() {
      public void accept(final UiMobileNavigationPageAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiMobileNavigationPageAssignment eObject) {
    final VMNavigationPage layout = this.<VMNavigationPage>peek();
    final UiEmbeddable element = eObject.getElement();
    if ((element instanceof UiField)) {
      final YEmbeddable newField = this.create(element);
      layout.addElement(newField);
      this.map(element);
      this.push(newField);
      final UiField yField = ((UiField) element);
      EList<UiValidator> _validators = yField.getValidators();
      final Consumer<UiValidator> _function = new Consumer<UiValidator>() {
        public void accept(final UiValidator it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _validators.forEach(_function);
      this.<Object>pop();
    } else {
      this.map(element);
    }
  }
  
  protected void _map(final UiFormLayout eObject) {
    final YFormLayout layout = this.factory.createFormLayout();
    String _name = eObject.getName();
    layout.setName(_name);
    this.addToParent(layout);
    this.associateUi(eObject, layout);
    this.push(layout);
    EList<UiFormLayoutAssigment> _contents = eObject.getContents();
    final Consumer<UiFormLayoutAssigment> _function = new Consumer<UiFormLayoutAssigment>() {
      public void accept(final UiFormLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _contents.forEach(_function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function_1);
    this.<Object>pop();
  }
  
  protected void _map(final /* UiFormLayoutAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  protected void _map(final /* UiOptionsGroup */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nassociatedUi cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final UiTable eObject) {
    final YTable yField = this.<YTable>associatedUi(eObject);
    this.push(yField);
    UiColumnsAssignment _columnAssignment = eObject.getColumnAssignment();
    boolean _notEquals = (!Objects.equal(_columnAssignment, null));
    if (_notEquals) {
      UiColumnsAssignment _columnAssignment_1 = eObject.getColumnAssignment();
      EList<UiColumn> _columns = _columnAssignment_1.getColumns();
      final Consumer<UiColumn> _function = new Consumer<UiColumn>() {
        public void accept(final UiColumn it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _columns.forEach(_function);
    }
    EList<UiBinding> _bindings = eObject.getBindings();
    boolean _notEquals_1 = (!Objects.equal(_bindings, null));
    if (_notEquals_1) {
      EList<UiBinding> _bindings_1 = eObject.getBindings();
      final Consumer<UiBinding> _function_1 = new Consumer<UiBinding>() {
        public void accept(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _bindings_1.forEach(_function_1);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiImage eObject) {
    final YImage yField = this.<YImage>associatedUi(eObject);
    this.push(yField);
    EList<UiBinding> _bindings = eObject.getBindings();
    boolean _notEquals = (!Objects.equal(_bindings, null));
    if (_notEquals) {
      EList<UiBinding> _bindings_1 = eObject.getBindings();
      final Consumer<UiBinding> _function = new Consumer<UiBinding>() {
        public void accept(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _bindings_1.forEach(_function);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiComboBox eObject) {
    final YComboBox yField = this.<YComboBox>associatedUi(eObject);
    this.push(yField);
    EList<UiBinding> _bindings = eObject.getBindings();
    boolean _notEquals = (!Objects.equal(_bindings, null));
    if (_notEquals) {
      EList<UiBinding> _bindings_1 = eObject.getBindings();
      final Consumer<UiBinding> _function = new Consumer<UiBinding>() {
        public void accept(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      _bindings_1.forEach(_function);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiButton object) {
    final YButton button = this.factory.createButton();
    String _name = object.getName();
    button.setName(_name);
    String _name_1 = object.getName();
    button.setLabel(_name_1);
    this.addToParent(button);
    this.associateUi(object, button);
    EList<UiBinding> _bindings = object.getBindings();
    final Consumer<UiBinding> _function = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function);
  }
  
  protected void _map(final UiMobileNavigationButton object) {
    final VMNavigationButton button = VaadinMobileFactory.eINSTANCE.createVMNavigationButton();
    String _name = object.getName();
    button.setName(_name);
    String _name_1 = object.getName();
    button.setLabel(_name_1);
    this.addToParent(button);
    this.associateUi(object, button);
    this.push(button);
    UiMobileNavigationPage _targetPage = object.getTargetPage();
    boolean _notEquals = (!Objects.equal(_targetPage, null));
    if (_notEquals) {
      UiMobileNavigationPage _targetPage_1 = object.getTargetPage();
      this.map(_targetPage_1);
    } else {
      UiMobileNavigationPage _targetPageAlias = object.getTargetPageAlias();
      boolean _notEquals_1 = (!Objects.equal(_targetPageAlias, null));
      if (_notEquals_1) {
        UiMobileNavigationPage _targetPageAlias_1 = object.getTargetPageAlias();
        this.map(_targetPageAlias_1);
      }
    }
    EList<UiBinding> _bindings = object.getBindings();
    final Consumer<UiBinding> _function = new Consumer<UiBinding>() {
      public void accept(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    _bindings.forEach(_function);
    this.<Object>pop();
  }
  
  protected void _map(final UiColumn eObject) {
    final YTable yField = this.<YTable>peek();
    final YColumn yColumn = this.factory.createColumn();
    UiFlatAlignment _alignment = eObject.getAlignment();
    YFlatAlignment _yFlatAlignment = this.toYFlatAlignment(_alignment);
    yColumn.setAlignment(_yFlatAlignment);
    boolean _isCollapsed = eObject.isCollapsed();
    yColumn.setCollapsed(_isCollapsed);
    boolean _isCollapsible = eObject.isCollapsible();
    yColumn.setCollapsible(_isCollapsible);
    float _expandRatio = eObject.getExpandRatio();
    yColumn.setExpandRatio(_expandRatio);
    String _iconName = eObject.getIconName();
    yColumn.setIcon(_iconName);
    JvmField _jvmField = eObject.getJvmField();
    String _simpleName = null;
    if (_jvmField!=null) {
      _simpleName=_jvmField.getSimpleName();
    }
    yColumn.setName(_simpleName);
    boolean _isOrderable = eObject.isOrderable();
    yColumn.setOrderable(_isOrderable);
    boolean _isVisible = eObject.isVisible();
    yColumn.setVisible(_isVisible);
    EList<YColumn> _columns = yField.getColumns();
    _columns.add(yColumn);
  }
  
  public YFlatAlignment toYFlatAlignment(final UiFlatAlignment uiAlign) {
    if (uiAlign != null) {
      switch (uiAlign) {
        case LEFT:
          return YFlatAlignment.LEFT;
        case CENTER:
          return YFlatAlignment.CENTER;
        case RIGHT:
          return YFlatAlignment.RIGHT;
        default:
          break;
      }
    }
    return null;
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
  
  protected YEmbeddable _create(final UiEmbeddable object) {
    return null;
  }
  
  protected YEmbeddable _create(final UiTextField object) {
    final YTextField textField = this.factory.createTextField();
    String _name = object.getName();
    textField.setName(_name);
    String _name_1 = object.getName();
    textField.setLabel(_name_1);
    final YTextDatatype dt = this.factory.createTextDatatype();
    textField.setDatatype(dt);
    EList<YDatatype> _orphanDatatypes = textField.getOrphanDatatypes();
    _orphanDatatypes.add(dt);
    int _maxLength = object.getMaxLength();
    dt.setMaxLength(_maxLength);
    int _minLength = object.getMinLength();
    dt.setMinLength(_minLength);
    String _regex = object.getRegex();
    dt.setRegExpression(_regex);
    this.associateUi(object, textField);
    return textField;
  }
  
  protected YEmbeddable _create(final UiLabel object) {
    final YLabel label = this.factory.createLabel();
    String _name = object.getName();
    label.setName(_name);
    String _name_1 = object.getName();
    label.setLabel(_name_1);
    this.associateUi(object, label);
    return label;
  }
  
  protected YEmbeddable _create(final UiDecimalField object) {
    final YDecimalField decimalField = this.factory.createDecimalField();
    String _name = object.getName();
    decimalField.setName(_name);
    String _name_1 = object.getName();
    decimalField.setLabel(_name_1);
    final YDecimalDatatype dt = this.factory.createDecimalDatatype();
    decimalField.setDatatype(dt);
    EList<YDatatype> _orphanDatatypes = decimalField.getOrphanDatatypes();
    _orphanDatatypes.add(dt);
    boolean _isGrouping = object.isGrouping();
    dt.setGrouping(_isGrouping);
    boolean _isMarkNegative = object.isMarkNegative();
    dt.setMarkNegative(_isMarkNegative);
    int _precision = object.getPrecision();
    dt.setPrecision(_precision);
    this.associateUi(object, decimalField);
    return decimalField;
  }
  
  protected YEmbeddable _create(final UiTextArea object) {
    final YTextArea textArea = this.factory.createTextArea();
    String _name = object.getName();
    textArea.setName(_name);
    String _name_1 = object.getName();
    textArea.setLabel(_name_1);
    this.associateUi(object, textArea);
    return textArea;
  }
  
  protected YEmbeddable _create(final /* UiOptionsGroup */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nconvert cannot be resolved"
      + "\nitemCaptionProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nitemImageProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected YEmbeddable _create(final UiDateField object) {
    final YDateTime dateTime = this.factory.createDateTime();
    String _name = object.getName();
    dateTime.setName(_name);
    String _name_1 = object.getName();
    dateTime.setLabel(_name_1);
    this.associateUi(object, dateTime);
    return dateTime;
  }
  
  protected YEmbeddable _create(final UiBrowser object) {
    final YBrowser browser = this.factory.createBrowser();
    String _name = object.getName();
    browser.setName(_name);
    String _name_1 = object.getName();
    browser.setLabel(_name_1);
    this.associateUi(object, browser);
    return browser;
  }
  
  protected YEmbeddable _create(final UiProgressBar object) {
    final YProgressBar progressBar = this.factory.createProgressBar();
    String _name = object.getName();
    progressBar.setName(_name);
    String _name_1 = object.getName();
    progressBar.setLabel(_name_1);
    this.associateUi(object, progressBar);
    return progressBar;
  }
  
  protected YEmbeddable _create(final UiImage object) {
    final YImage image = this.factory.createImage();
    String _name = object.getName();
    image.setName(_name);
    String _name_1 = object.getName();
    image.setLabel(_name_1);
    String _value = object.getValue();
    image.setValue(_value);
    this.associateUi(object, image);
    return image;
  }
  
  protected YEmbeddable _create(final UiTable object) {
    final YTable table = this.factory.createTable();
    String _name = object.getName();
    table.setName(_name);
    String _name_1 = object.getName();
    table.setLabel(_name_1);
    UiSelectionType _selectionType = object.getSelectionType();
    YSelectionType _convert = this.convert(_selectionType);
    table.setSelectionType(_convert);
    JvmField _itemImageProperty = object.getItemImageProperty();
    String _simpleName = null;
    if (_itemImageProperty!=null) {
      _simpleName=_itemImageProperty.getSimpleName();
    }
    table.setItemImageProperty(_simpleName);
    JvmTypeReference _jvmType = object.getJvmType();
    boolean _notEquals = (!Objects.equal(_jvmType, null));
    if (_notEquals) {
      JvmTypeReference _jvmType_1 = object.getJvmType();
      String _qualifiedName = _jvmType_1.getQualifiedName();
      table.setTypeQualifiedName(_qualifiedName);
      Resource _eResource = object.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      JvmTypeReference _jvmType_2 = object.getJvmType();
      String _qualifiedName_1 = _jvmType_2.getQualifiedName();
      Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
      table.setType(_loadClass);
    }
    this.associateUi(object, table);
    return table;
  }
  
  public YSelectionType convert(final UiSelectionType type) {
    if (type != null) {
      switch (type) {
        case NONE:
          return YSelectionType.SINGLE;
        case SINGLE:
          return YSelectionType.SINGLE;
        case MULTI:
          return YSelectionType.MULTI;
        default:
          break;
      }
    }
    return null;
  }
  
  protected YEmbeddable _create(final UiNumericField object) {
    final YNumericField field = this.factory.createNumericField();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    final YNumericDatatype dt = this.factory.createNumericDatatype();
    field.setDatatype(dt);
    EList<YDatatype> _orphanDatatypes = field.getOrphanDatatypes();
    _orphanDatatypes.add(dt);
    boolean _isGrouping = object.isGrouping();
    dt.setGrouping(_isGrouping);
    boolean _isMarkNegative = object.isMarkNegative();
    dt.setMarkNegative(_isMarkNegative);
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiCheckBox object) {
    final YCheckBox field = this.factory.createCheckBox();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiComboBox object) {
    final YComboBox field = this.factory.createComboBox();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    JvmField _itemCaptionProperty = object.getItemCaptionProperty();
    String _simpleName = null;
    if (_itemCaptionProperty!=null) {
      _simpleName=_itemCaptionProperty.getSimpleName();
    }
    field.setItemCaptionProperty(_simpleName);
    JvmField _itemImageProperty = object.getItemImageProperty();
    String _simpleName_1 = null;
    if (_itemImageProperty!=null) {
      _simpleName_1=_itemImageProperty.getSimpleName();
    }
    field.setItemImageProperty(_simpleName_1);
    JvmTypeReference _jvmType = object.getJvmType();
    boolean _notEquals = (!Objects.equal(_jvmType, null));
    if (_notEquals) {
      JvmTypeReference _jvmType_1 = object.getJvmType();
      String _qualifiedName = _jvmType_1.getQualifiedName();
      field.setTypeQualifiedName(_qualifiedName);
      Resource _eResource = object.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      JvmTypeReference _jvmType_2 = object.getJvmType();
      String _qualifiedName_1 = _jvmType_2.getQualifiedName();
      Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
      field.setType(_loadClass);
    }
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiSwitch object) {
    final VMSwitch field = VaadinMobileFactory.eINSTANCE.createVMSwitch();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    this.associateUi(object, field);
    return field;
  }
  
  public void addToParent(final YElement embeddable) {
    final Object context = this.<Object>peek();
    if ((context instanceof YLayout)) {
      final YLayout layout = ((YLayout) context);
      layout.addElement(((YEmbeddable) embeddable));
    } else {
      if ((context instanceof YView)) {
        final YView yView = ((YView) context);
        yView.setContent(((YEmbeddable) embeddable));
      } else {
        if ((context instanceof YTab)) {
          final YTab yTab = ((YTab) context);
          yTab.setEmbeddable(((YEmbeddable) embeddable));
        } else {
          if ((context instanceof VMTab)) {
            final VMTab yTab_1 = ((VMTab) context);
            yTab_1.setEmbeddable(((YEmbeddable) embeddable));
          } else {
            if ((context instanceof VMNavigationButton)) {
              final VMNavigationButton yButton = ((VMNavigationButton) context);
              yButton.setPage(((VMNavigationPage) embeddable));
            } else {
              if ((context instanceof VMNavigationCommand)) {
                final VMNavigationCommand yCommand = ((VMNavigationCommand) context);
                yCommand.setTargetPage(((VMNavigationPage) embeddable));
              } else {
                if ((context instanceof YOpenDialogCommand)) {
                  final YOpenDialogCommand yCommand_1 = ((YOpenDialogCommand) context);
                  yCommand_1.setDialog(((YDialog) embeddable));
                } else {
                  if ((context instanceof YDialog)) {
                    final YDialog yDialog = ((YDialog) context);
                    yDialog.setContent(((YEmbeddable) embeddable));
                  }
                }
              }
            }
          }
        }
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
    this.pendingBindings.add(object);
  }
  
  public void install(final UiBinding object) {
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
    boolean _isListBinding = object.isListBinding();
    boolean _not = (!_isListBinding);
    if (_not) {
      final YValueBindingEndpoint sourceResult = this.createValueBindingEndpoint(sourceEndpoint);
      final YValueBindingEndpoint targetResult = this.createValueBindingEndpoint(targetEndpoint);
      YBindingUpdateStrategy sourceToTargetStrategy = YBindingUpdateStrategy.UPDATE;
      boolean _isSourceToTarget = object.isSourceToTarget();
      boolean _not_1 = (!_isSourceToTarget);
      if (_not_1) {
        sourceToTargetStrategy = YBindingUpdateStrategy.ON_REQUEST;
      }
      YBindingUpdateStrategy targetToSourceStrategy = YBindingUpdateStrategy.UPDATE;
      boolean _isTargetToSource = object.isTargetToSource();
      boolean _not_2 = (!_isTargetToSource);
      if (_not_2) {
        targetToSourceStrategy = YBindingUpdateStrategy.ON_REQUEST;
      }
      YBindingSet _orCreateBindingSet = this.currentView.getOrCreateBindingSet();
      _orCreateBindingSet.addBinding(targetResult, sourceResult, targetToSourceStrategy, sourceToTargetStrategy);
    } else {
      final YListBindingEndpoint sourceResult_1 = this.createListBindingEndpoint(sourceEndpoint);
      final YListBindingEndpoint targetResult_1 = this.createListBindingEndpoint(targetEndpoint);
      YBindingUpdateStrategy sourceToTargetStrategy_1 = YBindingUpdateStrategy.UPDATE;
      boolean _isSourceToTarget_1 = object.isSourceToTarget();
      boolean _not_3 = (!_isSourceToTarget_1);
      if (_not_3) {
        sourceToTargetStrategy_1 = YBindingUpdateStrategy.ON_REQUEST;
      }
      YBindingUpdateStrategy targetToSourceStrategy_1 = YBindingUpdateStrategy.UPDATE;
      boolean _isTargetToSource_1 = object.isTargetToSource();
      boolean _not_4 = (!_isTargetToSource_1);
      if (_not_4) {
        targetToSourceStrategy_1 = YBindingUpdateStrategy.ON_REQUEST;
      }
      YBindingSet _orCreateBindingSet_1 = this.currentView.getOrCreateBindingSet();
      _orCreateBindingSet_1.addBinding(targetResult_1, sourceResult_1, targetToSourceStrategy_1, sourceToTargetStrategy_1);
    }
  }
  
  public YValueBindingEndpoint createValueBindingEndpoint(final UiBindingEndpointAssignment epDef) {
    boolean _equals = Objects.equal(epDef, null);
    if (_equals) {
      return null;
    }
    YValueBindingEndpoint result = null;
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
        final YElement yElement = this.<YElement>associatedUi(_bindingRoot_3);
        final YECViewModelValueBindingEndpoint ep_1 = this.factory.createECViewModelValueBindingEndpoint();
        ep_1.setElement(yElement);
        StringBuilder _path_1 = info.getPath();
        String _string_1 = _path_1.toString();
        ep_1.setPropertyPath(_string_1);
        JvmType _typeForBinding = info.getTypeForBinding();
        boolean _notEquals = (!Objects.equal(_typeForBinding, null));
        if (_notEquals) {
          JvmType _typeForBinding_1 = info.getTypeForBinding();
          String _qualifiedName = _typeForBinding_1.getQualifiedName();
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
      } else {
        EObject _bindingRoot_4 = info.getBindingRoot();
        if ((_bindingRoot_4 instanceof UiMobileNavigationCommand)) {
          EObject _bindingRoot_5 = info.getBindingRoot();
          final UiMobileNavigationCommand command = ((UiMobileNavigationCommand) _bindingRoot_5);
          final VMNavigationCommand yCommand = VaadinMobileFactory.eINSTANCE.createVMNavigationCommand();
          YCommandSet _commandSet = this.currentView.getCommandSet();
          _commandSet.addCommand(yCommand);
          this.push(yCommand);
          UiMobileNavigationPage _targetPage = command.getTargetPage();
          this.map(_targetPage);
          final UiMobileNavigationHandler navHandler = this.findNavHandler(epDef);
          VMNavigationHandler _associatedUi = this.<VMNavigationHandler>associatedUi(((EObject) navHandler));
          yCommand.setNavigationHandler(_associatedUi);
          this.<Object>pop();
          YECViewModelValueBindingEndpoint _createNavigationValueEndpoint = yCommand.createNavigationValueEndpoint();
          result = _createNavigationValueEndpoint;
        } else {
          EObject _bindingRoot_6 = info.getBindingRoot();
          if ((_bindingRoot_6 instanceof UiOpenDialogCommand)) {
            EObject _bindingRoot_7 = info.getBindingRoot();
            final UiOpenDialogCommand command_1 = ((UiOpenDialogCommand) _bindingRoot_7);
            final YOpenDialogCommand yCommand_1 = CoreModelFactory.eINSTANCE.createYOpenDialogCommand();
            YCommandSet _commandSet_1 = this.currentView.getCommandSet();
            _commandSet_1.addCommand(yCommand_1);
            this.push(yCommand_1);
            UiDialog _dialog = command_1.getDialog();
            this.map(_dialog);
            this.<Object>pop();
            YECViewModelValueBindingEndpoint _createTriggerDialogEndpoint = yCommand_1.createTriggerDialogEndpoint();
            result = _createTriggerDialogEndpoint;
          } else {
            EObject _bindingRoot_8 = info.getBindingRoot();
            if ((_bindingRoot_8 instanceof UiSearchWithDialogCommand)) {
              EObject _bindingRoot_9 = info.getBindingRoot();
              final UiSearchWithDialogCommand command_2 = ((UiSearchWithDialogCommand) _bindingRoot_9);
              final YOpenDialogCommand yCommand_2 = CoreModelFactory.eINSTANCE.createYOpenDialogCommand();
              YCommandSet _commandSet_2 = this.currentView.getCommandSet();
              _commandSet_2.addCommand(yCommand_2);
              this.push(yCommand_2);
              UiSearchDialog _dialog_1 = command_2.getDialog();
              this.map(_dialog_1);
              this.<Object>pop();
              YECViewModelValueBindingEndpoint _createTriggerDialogEndpoint_1 = yCommand_2.createTriggerDialogEndpoint();
              result = _createTriggerDialogEndpoint_1;
            }
          }
        }
      }
    }
    return result;
  }
  
  public UiMobileNavigationHandler findNavHandler(final UiBindingEndpointAssignment assignment) {
    EObject temp = assignment;
    EObject _eContainer = temp.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EObject _eContainer_1 = temp.eContainer();
        temp = _eContainer_1;
        if ((temp instanceof UiMobileNavigationHandler)) {
          return ((UiMobileNavigationHandler) temp);
        }
      }
      EObject _eContainer_1 = temp.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer_1, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  public YListBindingEndpoint createListBindingEndpoint(final UiBindingEndpointAssignment epDef) {
    boolean _equals = Objects.equal(epDef, null);
    if (_equals) {
      return null;
    }
    YListBindingEndpoint result = null;
    final UiModelDerivedStateComputerx.BindingInfo info = new UiModelDerivedStateComputerx.BindingInfo();
    this.collectBindingInfo(epDef, info);
    EObject _bindingRoot = info.getBindingRoot();
    if ((_bindingRoot instanceof UiBeanSlot)) {
      EObject _bindingRoot_1 = info.getBindingRoot();
      final UiBeanSlot uiBeanSlot = ((UiBeanSlot) _bindingRoot_1);
      final YBeanSlot yBeanSlot = this.<YBeanSlot>associatedUi(uiBeanSlot);
      final YBeanSlotListBindingEndpoint ep = this.factory.createBeanSlotListBindingEndpoint();
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
        final YECViewModelListBindingEndpoint ep_1 = this.factory.createECViewModelListBindingEndpoint();
        ep_1.setElement(yElement);
        StringBuilder _path_1 = info.getPath();
        String _string_1 = _path_1.toString();
        ep_1.setPropertyPath(_string_1);
        JvmType _typeForBinding = info.getTypeForBinding();
        boolean _notEquals = (!Objects.equal(_typeForBinding, null));
        if (_notEquals) {
          JvmType _typeForBinding_1 = info.getTypeForBinding();
          String _qualifiedName = _typeForBinding_1.getQualifiedName();
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
      info.setTypeOfBoundProperty(_typeofLastSegment);
      UiPathSegment _path_3 = assignment.getPath();
      JvmField _fieldofLastSegment = _path_3.getFieldofLastSegment();
      info.setDeepestJvmField(_fieldofLastSegment);
      UiPathSegment _path_4 = assignment.getPath();
      final JvmType pathType = _path_4.getTypeofSecondLastSegment();
      boolean _and = false;
      JvmType _typeForBinding = info.getTypeForBinding();
      boolean _equals = Objects.equal(_typeForBinding, null);
      if (!_equals) {
        _and = false;
      } else {
        boolean _notEquals_3 = (!Objects.equal(pathType, null));
        _and = _notEquals_3;
      }
      if (_and) {
        info.setTypeForBinding(pathType);
      }
    }
  }
  
  protected void _collectBindingInfo(final UiBeanSlot slot, final UiModelDerivedStateComputerx.BindingInfo info) {
    info.setBindingRoot(slot);
    JvmTypeReference _jvmType = slot.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    info.setTypeForBinding(_type);
  }
  
  protected void _collectBindingInfo(final UiBindingEndpointAlias alias, final UiModelDerivedStateComputerx.BindingInfo info) {
    UiBindingExpression _endpoint = alias.getEndpoint();
    this.collectBindingInfo(_endpoint, info);
  }
  
  protected void _collectBindingInfo(final UiTypedBindableDef definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    JvmType _type = this.typeOfBoundPropertyProvider.getType(definition);
    info.setTypeForBinding(_type);
    UiRawBindable _rawBindableOfLastSegment = definition.getRawBindableOfLastSegment();
    info.setBindingRoot(_rawBindableOfLastSegment);
    final UxEndpointDef bindingMethod = definition.getMethod();
    boolean _notEquals = (!Objects.equal(bindingMethod, null));
    if (_notEquals) {
      String _name = bindingMethod.getName();
      info.appendPath(_name);
    }
  }
  
  protected void _collectBindingInfo(final UiCommandBindableDef definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    JvmType _type = this.typeOfBoundPropertyProvider.getType(definition);
    info.setTypeForBinding(_type);
    UiCommand _command = definition.getCommand();
    info.setBindingRoot(_command);
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
    return this.typeLoader.findTypeByName(qualifiedName);
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
    if (eObject instanceof UiHorizontalButtonGroup) {
      _map((UiHorizontalButtonGroup)eObject);
      return;
    } else if (eObject instanceof UiMobileNavigationButton) {
      _map((UiMobileNavigationButton)eObject);
      return;
    } else if (eObject instanceof UiMobileNavigationPage) {
      _map((UiMobileNavigationPage)eObject);
      return;
    } else if (eObject instanceof UiVerticalComponentGroup) {
      _map((UiVerticalComponentGroup)eObject);
      return;
    } else if (eObject instanceof UiButton) {
      _map((UiButton)eObject);
      return;
    } else if (eObject instanceof UiColumn) {
      _map((UiColumn)eObject);
      return;
    } else if (eObject instanceof UiComboBox) {
      _map((UiComboBox)eObject);
      return;
    } else if (eObject instanceof UiFormLayout) {
      _map((UiFormLayout)eObject);
      return;
    } else if (eObject instanceof UiGridLayout) {
      _map((UiGridLayout)eObject);
      return;
    } else if (eObject instanceof UiHorizontalLayout) {
      _map((UiHorizontalLayout)eObject);
      return;
    } else if (eObject instanceof UiIDEView) {
      _map((UiIDEView)eObject);
      return;
    } else if (eObject instanceof UiImage) {
      _map((UiImage)eObject);
      return;
    } else if (eObject instanceof UiMobileTabAssignment) {
      _map((UiMobileTabAssignment)eObject);
      return;
    } else if (eObject instanceof UiMobileTabSheet) {
      _map((UiMobileTabSheet)eObject);
      return;
    } else if (eObject instanceof UiMobileView) {
      _map((UiMobileView)eObject);
      return;
    } else if (eObject instanceof UiTable) {
      _map((UiTable)eObject);
      return;
    } else if (eObject instanceof UiVerticalLayout) {
      _map((UiVerticalLayout)eObject);
      return;
    } else if (eObject instanceof UiDialog) {
      _map((UiDialog)eObject);
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
    } else if (eObject instanceof UiSearchDialog) {
      _map((UiSearchDialog)eObject);
      return;
    } else if (eObject instanceof UiTabSheet) {
      _map((UiTabSheet)eObject);
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
    } else if (eObject instanceof UiDialogAssignment) {
      _map((UiDialogAssignment)eObject);
      return;
    } else if (eObject instanceof UiDialogSearchFieldAssignment) {
      _map((UiDialogSearchFieldAssignment)eObject);
      return;
    } else if (eObject instanceof UiGridLayoutAssigment) {
      _map((UiGridLayoutAssigment)eObject);
      return;
    } else if (eObject instanceof UiHorizontalButtonGroupAssigment) {
      _map((UiHorizontalButtonGroupAssigment)eObject);
      return;
    } else if (eObject instanceof UiHorizontalLayoutAssigment) {
      _map((UiHorizontalLayoutAssigment)eObject);
      return;
    } else if (eObject instanceof UiMobileNavigationPageAssignment) {
      _map((UiMobileNavigationPageAssignment)eObject);
      return;
    } else if (eObject instanceof UiTabAssignment) {
      _map((UiTabAssignment)eObject);
      return;
    } else if (eObject instanceof UiValidatorAlias) {
      _map((UiValidatorAlias)eObject);
      return;
    } else if (eObject instanceof UiVerticalComponentGroupAssigment) {
      _map((UiVerticalComponentGroupAssigment)eObject);
      return;
    } else if (eObject instanceof UiVerticalLayoutAssigment) {
      _map((UiVerticalLayoutAssigment)eObject);
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
    } else if (eObject != null) {
      _map(eObject);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eObject).toString());
    }
  }
  
  public YEmbeddable create(final UiEmbeddable object) {
    if (object instanceof UiSwitch) {
      return _create((UiSwitch)object);
    } else if (object instanceof UiBrowser) {
      return _create((UiBrowser)object);
    } else if (object instanceof UiCheckBox) {
      return _create((UiCheckBox)object);
    } else if (object instanceof UiComboBox) {
      return _create((UiComboBox)object);
    } else if (object instanceof UiDateField) {
      return _create((UiDateField)object);
    } else if (object instanceof UiDecimalField) {
      return _create((UiDecimalField)object);
    } else if (object instanceof UiImage) {
      return _create((UiImage)object);
    } else if (object instanceof UiLabel) {
      return _create((UiLabel)object);
    } else if (object instanceof UiNumericField) {
      return _create((UiNumericField)object);
    } else if (object instanceof UiProgressBar) {
      return _create((UiProgressBar)object);
    } else if (object instanceof UiTable) {
      return _create((UiTable)object);
    } else if (object instanceof UiTextArea) {
      return _create((UiTextArea)object);
    } else if (object instanceof UiTextField) {
      return _create((UiTextField)object);
    } else if (object != null) {
      return _create(object);
    } else if (object != null) {
      return _create(object);
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
    } else if (slot instanceof UiCommandBindableDef) {
      _collectBindingInfo((UiCommandBindableDef)slot, info);
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
