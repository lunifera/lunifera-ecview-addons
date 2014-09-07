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
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
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
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YBindingUpdateStrategy;
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YDialog;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;
import org.lunifera.ecview.core.common.model.validation.YValidator;
import org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YNumericDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextDatatype;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField;
import org.lunifera.ecview.core.extension.model.extension.YBrowser;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.extension.model.extension.YCheckBox;
import org.lunifera.ecview.core.extension.model.extension.YComboBox;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.extension.model.extension.YDecimalField;
import org.lunifera.ecview.core.extension.model.extension.YFormLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout;
import org.lunifera.ecview.core.extension.model.extension.YImage;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
import org.lunifera.ecview.core.extension.model.extension.YNumericField;
import org.lunifera.ecview.core.extension.model.extension.YNumericSearchField;
import org.lunifera.ecview.core.extension.model.extension.YOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YProgressBar;
import org.lunifera.ecview.core.extension.model.extension.YSelectionType;
import org.lunifera.ecview.core.extension.model.extension.YTabSheet;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.extension.model.extension.YTextArea;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.core.extension.model.extension.YTextSearchField;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayout;
import org.lunifera.ecview.core.extension.model.extension.util.SimpleExtensionModelFactory;
import org.lunifera.ecview.dsl.derivedstate.TypeHelper;
import org.lunifera.ecview.dsl.derivedstate.UiGrammarElementAdapter;
import org.lunifera.ecview.dsl.extensions.OperationExtensions;
import org.lunifera.ecview.dsl.scope.BindableTypeProvider;
import org.lunifera.ecview.semantic.uimodel.UiAlignment;
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
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImage;
import org.lunifera.ecview.semantic.uimodel.UiLabel;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationHandler;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiMobileView;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup;
import org.lunifera.ecview.semantic.uimodel.UiPanel;
import org.lunifera.ecview.semantic.uimodel.UiPathSegment;
import org.lunifera.ecview.semantic.uimodel.UiPoint;
import org.lunifera.ecview.semantic.uimodel.UiProgressBar;
import org.lunifera.ecview.semantic.uimodel.UiRawBindable;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiSearchDialog;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiSelectionType;
import org.lunifera.ecview.semantic.uimodel.UiSplitpanel;
import org.lunifera.ecview.semantic.uimodel.UiSplitpanelAssigment;
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
import org.lunifera.mobile.vaadin.ecview.model.VMNavigationPage;
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
     * The deepest JvmOperation in the hierarchy. This field is used to bind.
     */
    private JvmOperation _deepestJvmField;
    
    /**
     * The deepest JvmOperation in the hierarchy. This field is used to bind.
     */
    public JvmOperation getDeepestJvmField() {
      return this._deepestJvmField;
    }
    
    /**
     * The deepest JvmOperation in the hierarchy. This field is used to bind.
     */
    public void setDeepestJvmField(final JvmOperation deepestJvmField) {
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
  
  private String currentPackage;
  
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
      EObject _get = _contents_1.get(0);
      final UiModel eObject = ((UiModel) _get);
      String _packageName = eObject.getPackageName();
      this.currentPackage = _packageName;
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
        YView _get_1 = this.views.get(0);
        _contents_2.add(_get_1);
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
  
  public String toI18nKey(final UiEmbeddable embeddable) {
    boolean _and = false;
    UiI18nInfo _i18nInfo = embeddable.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = embeddable.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = embeddable.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = embeddable.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (this.currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = embeddable.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    }
    String _name = embeddable.getName();
    return ((this.currentPackage + ".") + _name);
  }
  
  public String toI18nKey(final UiTabAssignment embeddable) {
    boolean _and = false;
    UiI18nInfo _i18nInfo = embeddable.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = embeddable.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = embeddable.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = embeddable.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return ((this.currentPackage + ".") + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = embeddable.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    }
    String _name = embeddable.getName();
    return ((this.currentPackage + ".") + _name);
  }
  
  protected void _map(final UiModel object) {
    String _packageName = object.getPackageName();
    this.currentPackage = _packageName;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field contentAlignment is undefined for the type UiModelDerivedStateComputerx");
  }
  
  protected void _map(final UiMobileView object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field deviceType is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDeviceType is undefined for the type UiModelDerivedStateComputerx"
      + "\nMOBILE cannot be resolved");
  }
  
  public EObject push(final EObject eObject) {
    return this.viewContext.push(eObject);
  }
  
  protected void _map(final UiGridLayout eObject) {
    final YGridLayout yField = this.<YGridLayout>associatedUi(eObject);
    this.push(yField);
    EList<UiGridLayoutAssigment> _contents = eObject.getContents();
    final Procedure1<UiGridLayoutAssigment> _function = new Procedure1<UiGridLayoutAssigment>() {
      public void apply(final UiGridLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiGridLayoutAssigment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiGridLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiVerticalLayout eObject) {
    final YVerticalLayout yField = this.<YVerticalLayout>associatedUi(eObject);
    this.push(yField);
    EList<UiVerticalLayoutAssigment> _contents = eObject.getContents();
    final Procedure1<UiVerticalLayoutAssigment> _function = new Procedure1<UiVerticalLayoutAssigment>() {
      public void apply(final UiVerticalLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVerticalLayoutAssigment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiVerticalLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method addCellStyle is undefined for the type UiModelDerivedStateComputerx"
      + "\nalignment cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiHorizontalLayout eObject) {
    final YHorizontalLayout yField = this.<YHorizontalLayout>associatedUi(eObject);
    this.push(yField);
    EList<UiHorizontalLayoutAssigment> _contents = eObject.getContents();
    final Procedure1<UiHorizontalLayoutAssigment> _function = new Procedure1<UiHorizontalLayoutAssigment>() {
      public void apply(final UiHorizontalLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiHorizontalLayoutAssigment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiHorizontalLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method addCellStyle is undefined for the type UiModelDerivedStateComputerx"
      + "\nalignment cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiSplitpanel eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSplitPanel cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiSplitpanelAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSplitPanel cannot be resolved to a type."
      + "\n== cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiPanel eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYPanel cannot be resolved to a type."
      + "\npush cannot be resolved"
      + "\n== cannot be resolved"
      + "\nelements cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiTabSheet eObject) {
    final YTabSheet yField = this.<YTabSheet>associatedUi(eObject);
    this.push(yField);
    EList<UiTabAssignment> _tabs = eObject.getTabs();
    final Procedure1<UiTabAssignment> _function = new Procedure1<UiTabAssignment>() {
      public void apply(final UiTabAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiTabAssignment>forEach(_tabs, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiTabAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiMobileTabSheet eObject) {
    final VMTabSheet yField = this.<VMTabSheet>associatedUi(eObject);
    this.push(yField);
    EList<UiMobileTabAssignment> _tabs = eObject.getTabs();
    final Procedure1<UiMobileTabAssignment> _function = new Procedure1<UiMobileTabAssignment>() {
      public void apply(final UiMobileTabAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiMobileTabAssignment>forEach(_tabs, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiMobileTabAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiHorizontalButtonGroup eObject) {
    final VMHorizontalButtonGroup yField = this.<VMHorizontalButtonGroup>associatedUi(eObject);
    this.push(yField);
    EList<UiHorizontalButtonGroupAssigment> _contents = eObject.getContents();
    final Procedure1<UiHorizontalButtonGroupAssigment> _function = new Procedure1<UiHorizontalButtonGroupAssigment>() {
      public void apply(final UiHorizontalButtonGroupAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiHorizontalButtonGroupAssigment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiHorizontalButtonGroupAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiVerticalComponentGroup eObject) {
    final VMVerticalComponentGroup yField = this.<VMVerticalComponentGroup>associatedUi(eObject);
    this.push(yField);
    EList<UiVerticalComponentGroupAssigment> _contents = eObject.getContents();
    final Procedure1<UiVerticalComponentGroupAssigment> _function = new Procedure1<UiVerticalComponentGroupAssigment>() {
      public void apply(final UiVerticalComponentGroupAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVerticalComponentGroupAssigment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiVerticalComponentGroupAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiMobileNavigationPage eObject) {
    final VMNavigationPage yField = this.<VMNavigationPage>associatedUi(eObject);
    this.push(yField);
    EList<UiMobileNavigationPageAssignment> _contents = eObject.getContents();
    final Procedure1<UiMobileNavigationPageAssignment> _function = new Procedure1<UiMobileNavigationPageAssignment>() {
      public void apply(final UiMobileNavigationPageAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiMobileNavigationPageAssignment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    boolean _notEquals = (!Objects.equal(_bindings, null));
    if (_notEquals) {
      EList<UiBinding> _bindings_1 = eObject.getBindings();
      final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(_bindings_1, _function_1);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiDialog eObject) {
    final YDialog layout = CoreModelFactory.eINSTANCE.createYDialog();
    String _name = eObject.getName();
    layout.setName(_name);
    String _name_1 = eObject.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(eObject);
    layout.setLabelI18nKey(_i18nKey);
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
      final Procedure1<UiBinding> _function = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(_bindings_1, _function);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiSearchDialog eObject) {
    final YDialog dialog = CoreModelFactory.eINSTANCE.createYDialog();
    String _name = eObject.getName();
    dialog.setName(_name);
    String _name_1 = eObject.getName();
    dialog.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(eObject);
    dialog.setLabelI18nKey(_i18nKey);
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
    final Procedure1<UiDialogSearchFieldAssignment> _function = new Procedure1<UiDialogSearchFieldAssignment>() {
      public void apply(final UiDialogSearchFieldAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiDialogSearchFieldAssignment>forEach(_searchFields, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
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
      final Procedure1<UiBinding> _function_2 = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(_bindings_2, _function_2);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiDialogAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
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
    final VMNavigationPage yField = this.<VMNavigationPage>associatedUi(eObject);
    this.push(yField);
    EList<UiMobileNavigationPageAssignment> _contents = eObject.getContents();
    final Procedure1<UiMobileNavigationPageAssignment> _function = new Procedure1<UiMobileNavigationPageAssignment>() {
      public void apply(final UiMobileNavigationPageAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiMobileNavigationPageAssignment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiMobileNavigationPageAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiFormLayout eObject) {
    final YFormLayout yField = this.<YFormLayout>associatedUi(eObject);
    this.push(yField);
    EList<UiFormLayoutAssigment> _contents = eObject.getContents();
    final Procedure1<UiFormLayoutAssigment> _function = new Procedure1<UiFormLayoutAssigment>() {
      public void apply(final UiFormLayoutAssigment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiFormLayoutAssigment>forEach(_contents, _function);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiFormLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiOptionsGroup eObject) {
    final YOptionsGroup yOptionsGroup = this.<YOptionsGroup>associatedUi(eObject);
    this.push(yOptionsGroup);
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function);
    EList<UiBinding> _bindings_1 = eObject.getBindings();
    boolean _notEquals = (!Objects.equal(_bindings_1, null));
    if (_notEquals) {
      EList<UiBinding> _bindings_2 = eObject.getBindings();
      final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(_bindings_2, _function_1);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiTable eObject) {
    final YTable yField = this.<YTable>associatedUi(eObject);
    this.push(yField);
    UiColumnsAssignment _columnAssignment = eObject.getColumnAssignment();
    boolean _notEquals = (!Objects.equal(_columnAssignment, null));
    if (_notEquals) {
      UiColumnsAssignment _columnAssignment_1 = eObject.getColumnAssignment();
      EList<UiColumn> _columns = _columnAssignment_1.getColumns();
      final Procedure1<UiColumn> _function = new Procedure1<UiColumn>() {
        public void apply(final UiColumn it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiColumn>forEach(_columns, _function);
    }
    EList<UiBinding> _bindings = eObject.getBindings();
    boolean _notEquals_1 = (!Objects.equal(_bindings, null));
    if (_notEquals_1) {
      EList<UiBinding> _bindings_1 = eObject.getBindings();
      final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(_bindings_1, _function_1);
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
      final Procedure1<UiBinding> _function = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(_bindings_1, _function);
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
      final Procedure1<UiBinding> _function = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(_bindings_1, _function);
    }
    this.<Object>pop();
  }
  
  protected void _map(final UiButton object) {
    final YButton yField = this.<YButton>associatedUi(object);
    EList<UiBinding> _bindings = object.getBindings();
    final Procedure1<UiBinding> _function = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function);
  }
  
  protected void _map(final UiMobileNavigationButton object) {
    final VMNavigationButton button = this.<VMNavigationButton>associatedUi(object);
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
    final Procedure1<UiBinding> _function = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function);
    this.<Object>pop();
  }
  
  protected void _map(final UiColumn eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field labelI18nKey is undefined for the type UiModelDerivedStateComputerx");
  }
  
  public /* YFlatAlignment */Object toYFlatAlignment(final UiFlatAlignment uiAlign) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field YFlatAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YFlatAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YFlatAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nLEFT cannot be resolved"
      + "\nCENTER cannot be resolved"
      + "\nRIGHT cannot be resolved");
  }
  
  public /* YAlignment */Object toYAlignment(final UiAlignment uiAlign) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nBOTTOM_CENTER cannot be resolved"
      + "\nBOTTOM_FILL cannot be resolved"
      + "\nBOTTOM_LEFT cannot be resolved"
      + "\nBOTTOM_RIGHT cannot be resolved"
      + "\nFILL_CENTER cannot be resolved"
      + "\nFILL_FILL cannot be resolved"
      + "\nFILL_LEFT cannot be resolved"
      + "\nFILL_RIGHT cannot be resolved"
      + "\nMIDDLE_CENTER cannot be resolved"
      + "\nMIDDLE_FILL cannot be resolved"
      + "\nMIDDLE_LEFT cannot be resolved"
      + "\nMIDDLE_RIGHT cannot be resolved"
      + "\nTOP_CENTER cannot be resolved"
      + "\nTOP_FILL cannot be resolved"
      + "\nTOP_LEFT cannot be resolved"
      + "\nTOP_RIGHT cannot be resolved"
      + "\nUNDEFINED cannot be resolved");
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
  
  protected YEmbeddable _create(final Void object) {
    return null;
  }
  
  protected YEmbeddable _create(final UiTextField object) {
    final YTextField textField = this.factory.createTextField();
    String _name = object.getName();
    textField.setName(_name);
    String _name_1 = object.getName();
    textField.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    textField.setLabelI18nKey(_i18nKey);
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
    String _i18nKey = this.toI18nKey(object);
    label.setLabelI18nKey(_i18nKey);
    this.associateUi(object, label);
    return label;
  }
  
  protected YEmbeddable _create(final UiDecimalField object) {
    final YDecimalField decimalField = this.factory.createDecimalField();
    String _name = object.getName();
    decimalField.setName(_name);
    String _name_1 = object.getName();
    decimalField.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    decimalField.setLabelI18nKey(_i18nKey);
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
    String _i18nKey = this.toI18nKey(object);
    textArea.setLabelI18nKey(_i18nKey);
    this.associateUi(object, textArea);
    return textArea;
  }
  
  protected YEmbeddable _create(final UiOptionsGroup object) {
    final YOptionsGroup optionsGroup = this.factory.createOptionsGroup();
    String _name = object.getName();
    optionsGroup.setName(_name);
    String _name_1 = object.getName();
    optionsGroup.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    optionsGroup.setLabelI18nKey(_i18nKey);
    UiSelectionType _selectionType = object.getSelectionType();
    YSelectionType _convert = this.convert(_selectionType);
    optionsGroup.setSelectionType(_convert);
    JvmOperation _itemCaptionProperty = object.getItemCaptionProperty();
    String _simpleName = null;
    if (_itemCaptionProperty!=null) {
      _simpleName=_itemCaptionProperty.getSimpleName();
    }
    String _propertyName = OperationExtensions.toPropertyName(_simpleName);
    optionsGroup.setItemCaptionProperty(_propertyName);
    JvmOperation _itemImageProperty = object.getItemImageProperty();
    String _simpleName_1 = null;
    if (_itemImageProperty!=null) {
      _simpleName_1=_itemImageProperty.getSimpleName();
    }
    String _propertyName_1 = OperationExtensions.toPropertyName(_simpleName_1);
    optionsGroup.setItemImageProperty(_propertyName_1);
    JvmTypeReference _jvmType = object.getJvmType();
    boolean _notEquals = (!Objects.equal(_jvmType, null));
    if (_notEquals) {
      JvmTypeReference _jvmType_1 = object.getJvmType();
      String _qualifiedName = _jvmType_1.getQualifiedName();
      optionsGroup.setTypeQualifiedName(_qualifiedName);
      Resource _eResource = object.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      JvmTypeReference _jvmType_2 = object.getJvmType();
      String _qualifiedName_1 = _jvmType_2.getQualifiedName();
      Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
      optionsGroup.setType(_loadClass);
    }
    this.associateUi(object, optionsGroup);
    return optionsGroup;
  }
  
  protected YEmbeddable _create(final UiDateField object) {
    final YDateTime dateTime = this.factory.createDateTime();
    String _name = object.getName();
    dateTime.setName(_name);
    String _name_1 = object.getName();
    dateTime.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    dateTime.setLabelI18nKey(_i18nKey);
    this.associateUi(object, dateTime);
    return dateTime;
  }
  
  protected YEmbeddable _create(final UiBrowser object) {
    final YBrowser browser = this.factory.createBrowser();
    String _name = object.getName();
    browser.setName(_name);
    String _name_1 = object.getName();
    browser.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    browser.setLabelI18nKey(_i18nKey);
    this.associateUi(object, browser);
    return browser;
  }
  
  protected YEmbeddable _create(final UiProgressBar object) {
    final YProgressBar progressBar = this.factory.createProgressBar();
    String _name = object.getName();
    progressBar.setName(_name);
    String _name_1 = object.getName();
    progressBar.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    progressBar.setLabelI18nKey(_i18nKey);
    this.associateUi(object, progressBar);
    return progressBar;
  }
  
  protected YEmbeddable _create(final UiImage object) {
    final YImage image = this.factory.createImage();
    String _name = object.getName();
    image.setName(_name);
    String _name_1 = object.getName();
    image.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    image.setLabelI18nKey(_i18nKey);
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
    String _i18nKey = this.toI18nKey(object);
    table.setLabelI18nKey(_i18nKey);
    UiSelectionType _selectionType = object.getSelectionType();
    YSelectionType _convert = this.convert(_selectionType);
    table.setSelectionType(_convert);
    JvmOperation _itemImageProperty = object.getItemImageProperty();
    String _simpleName = null;
    if (_itemImageProperty!=null) {
      _simpleName=_itemImageProperty.getSimpleName();
    }
    String _propertyName = OperationExtensions.toPropertyName(_simpleName);
    table.setItemImageProperty(_propertyName);
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
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
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
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    this.associateUi(object, field);
    return field;
  }
  
  protected YButton _create(final UiButton object) {
    final YButton field = this.factory.createButton();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    this.associateUi(object, field);
    return field;
  }
  
  protected VMNavigationButton _create(final UiMobileNavigationButton object) {
    final VMNavigationButton field = VaadinMobileFactory.eINSTANCE.createVMNavigationButton();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiComboBox object) {
    final YComboBox field = this.factory.createComboBox();
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    JvmOperation _itemCaptionProperty = object.getItemCaptionProperty();
    String _simpleName = null;
    if (_itemCaptionProperty!=null) {
      _simpleName=_itemCaptionProperty.getSimpleName();
    }
    String _propertyName = OperationExtensions.toPropertyName(_simpleName);
    field.setItemCaptionProperty(_propertyName);
    JvmOperation _itemImageProperty = object.getItemImageProperty();
    String _simpleName_1 = null;
    if (_itemImageProperty!=null) {
      _simpleName_1=_itemImageProperty.getSimpleName();
    }
    String _propertyName_1 = OperationExtensions.toPropertyName(_simpleName_1);
    field.setItemImageProperty(_propertyName_1);
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from VMSwitch to YEmbeddable");
  }
  
  protected YGridLayout _create(final UiGridLayout object) {
    final YGridLayout layout = this.factory.createGridLayout();
    String _name = object.getName();
    layout.setName(_name);
    boolean _isFillHorizontal = object.isFillHorizontal();
    layout.setFillHorizontal(_isFillHorizontal);
    boolean _isFillVertical = object.isFillVertical();
    layout.setFillVertical(_isFillVertical);
    int _columns = object.getColumns();
    layout.setColumns(_columns);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YFormLayout _create(final UiFormLayout object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field fillHorizontal is undefined for the type UiModelDerivedStateComputerx");
  }
  
  protected YHorizontalLayout _create(final UiHorizontalLayout object) {
    final YHorizontalLayout layout = this.factory.createHorizontalLayout();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isFillHorizontal = object.isFillHorizontal();
    layout.setFillHorizontal(_isFillHorizontal);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected /* YSplitPanel */Object _create(final UiSplitpanel object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSplitPanel cannot be resolved to a type."
      + "\nThe method createSplitPanel is undefined for the type UiModelDerivedStateComputerx"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nsplitPosition cannot be resolved");
  }
  
  protected /* YPanel */Object _create(final UiPanel object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYPanel cannot be resolved to a type."
      + "\nThe method createPanel is undefined for the type UiModelDerivedStateComputerx"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved");
  }
  
  protected YVerticalLayout _create(final UiVerticalLayout object) {
    final YVerticalLayout layout = this.factory.createVerticalLayout();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isFillVertical = object.isFillVertical();
    layout.setFillVertical(_isFillVertical);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected VMHorizontalButtonGroup _create(final UiHorizontalButtonGroup object) {
    final VMHorizontalButtonGroup layout = VaadinMobileFactory.eINSTANCE.createVMHorizontalButtonGroup();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected VMVerticalComponentGroup _create(final UiVerticalComponentGroup object) {
    final VMVerticalComponentGroup layout = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YTabSheet _create(final UiTabSheet object) {
    final YTabSheet layout = this.factory.createTabSheet();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected VMTabSheet _create(final UiMobileTabSheet object) {
    final VMTabSheet layout = VaadinMobileFactory.eINSTANCE.createVMTabSheet();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    this.associateUi(object, layout);
    return layout;
  }
  
  public void xxaddToParent(final YElement embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from YEmbeddable to YEmbeddable");
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
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from VMNavigationCommand to YCommand"
      + "\nType mismatch: cannot convert from YECViewModelValueBindingEndpoint to YValueBindingEndpoint");
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
      JvmOperation _operationofLastSegment = _path_3.getOperationofLastSegment();
      info.setDeepestJvmField(_operationofLastSegment);
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
    } else if (eObject instanceof UiOptionsGroup) {
      _map((UiOptionsGroup)eObject);
      return;
    } else if (eObject instanceof UiPanel) {
      _map((UiPanel)eObject);
      return;
    } else if (eObject instanceof UiSplitpanel) {
      _map((UiSplitpanel)eObject);
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
    } else if (eObject instanceof UiFormLayoutAssigment) {
      _map((UiFormLayoutAssigment)eObject);
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
    } else if (eObject instanceof UiSplitpanelAssigment) {
      _map((UiSplitpanelAssigment)eObject);
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eObject).toString());
    }
  }
  
  public YPanel create(final UiEmbeddable object) {
    if (object instanceof UiHorizontalButtonGroup) {
      return _create((UiHorizontalButtonGroup)object);
    } else if (object instanceof UiMobileNavigationButton) {
      return _create((UiMobileNavigationButton)object);
    } else if (object instanceof UiSwitch) {
      return _create((UiSwitch)object);
    } else if (object instanceof UiVerticalComponentGroup) {
      return _create((UiVerticalComponentGroup)object);
    } else if (object instanceof UiBrowser) {
      return _create((UiBrowser)object);
    } else if (object instanceof UiButton) {
      return _create((UiButton)object);
    } else if (object instanceof UiCheckBox) {
      return _create((UiCheckBox)object);
    } else if (object instanceof UiComboBox) {
      return _create((UiComboBox)object);
    } else if (object instanceof UiDateField) {
      return _create((UiDateField)object);
    } else if (object instanceof UiDecimalField) {
      return _create((UiDecimalField)object);
    } else if (object instanceof UiFormLayout) {
      return _create((UiFormLayout)object);
    } else if (object instanceof UiGridLayout) {
      return _create((UiGridLayout)object);
    } else if (object instanceof UiHorizontalLayout) {
      return _create((UiHorizontalLayout)object);
    } else if (object instanceof UiImage) {
      return _create((UiImage)object);
    } else if (object instanceof UiLabel) {
      return _create((UiLabel)object);
    } else if (object instanceof UiMobileTabSheet) {
      return _create((UiMobileTabSheet)object);
    } else if (object instanceof UiNumericField) {
      return _create((UiNumericField)object);
    } else if (object instanceof UiOptionsGroup) {
      return _create((UiOptionsGroup)object);
    } else if (object instanceof UiPanel) {
      return _create((UiPanel)object);
    } else if (object instanceof UiProgressBar) {
      return _create((UiProgressBar)object);
    } else if (object instanceof UiSplitpanel) {
      return _create((UiSplitpanel)object);
    } else if (object instanceof UiTable) {
      return _create((UiTable)object);
    } else if (object instanceof UiTextArea) {
      return _create((UiTextArea)object);
    } else if (object instanceof UiTextField) {
      return _create((UiTextField)object);
    } else if (object instanceof UiVerticalLayout) {
      return _create((UiVerticalLayout)object);
    } else if (object instanceof UiTabSheet) {
      return _create((UiTabSheet)object);
    } else if (object != null) {
      return _create(object);
    } else if (object == null) {
      return _create((Void)null);
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
