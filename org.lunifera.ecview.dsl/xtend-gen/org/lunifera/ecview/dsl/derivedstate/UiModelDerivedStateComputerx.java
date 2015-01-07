package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.core.common.model.binding.BindingFactory;
import org.lunifera.ecview.core.common.model.binding.YBinding;
import org.lunifera.ecview.core.common.model.binding.YBindingSet;
import org.lunifera.ecview.core.common.model.binding.YBindingUpdateStrategy;
import org.lunifera.ecview.core.common.model.binding.YECViewModelListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YECViewModelValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YListBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YValueBinding;
import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.binding.YVisibilityProcessorValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.CoreModelFactory;
import org.lunifera.ecview.core.common.model.core.YAlignment;
import org.lunifera.ecview.core.common.model.core.YBeanSlot;
import org.lunifera.ecview.core.common.model.core.YBeanSlotListBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YBeanSlotValueBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YCommandSet;
import org.lunifera.ecview.core.common.model.core.YDeviceType;
import org.lunifera.ecview.core.common.model.core.YDialog;
import org.lunifera.ecview.core.common.model.core.YElement;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;
import org.lunifera.ecview.core.common.model.core.YExposedAction;
import org.lunifera.ecview.core.common.model.core.YField;
import org.lunifera.ecview.core.common.model.core.YFlatAlignment;
import org.lunifera.ecview.core.common.model.core.YLayout;
import org.lunifera.ecview.core.common.model.core.YOpenDialogCommand;
import org.lunifera.ecview.core.common.model.core.YView;
import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.lunifera.ecview.core.common.model.datatypes.YDatatype;
import org.lunifera.ecview.core.common.model.validation.YClassDelegateValidator;
import org.lunifera.ecview.core.common.model.validation.YMaxLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YMinLengthValidator;
import org.lunifera.ecview.core.common.model.validation.YRegexpValidator;
import org.lunifera.ecview.core.common.model.validation.YValidator;
import org.lunifera.ecview.core.common.model.visibility.VisibilityFactory;
import org.lunifera.ecview.core.common.model.visibility.YVisibilityProcessor;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeFormat;
import org.lunifera.ecview.core.extension.model.datatypes.YDateTimeResolution;
import org.lunifera.ecview.core.extension.model.datatypes.YDecimalDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YNumericDatatype;
import org.lunifera.ecview.core.extension.model.datatypes.YTextDatatype;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory;
import org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField;
import org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField;
import org.lunifera.ecview.core.extension.model.extension.YBrowser;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.extension.model.extension.YCheckBox;
import org.lunifera.ecview.core.extension.model.extension.YColumn;
import org.lunifera.ecview.core.extension.model.extension.YComboBox;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.extension.model.extension.YDecimalField;
import org.lunifera.ecview.core.extension.model.extension.YEnumComboBox;
import org.lunifera.ecview.core.extension.model.extension.YEnumList;
import org.lunifera.ecview.core.extension.model.extension.YEnumOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YFormLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YImage;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
import org.lunifera.ecview.core.extension.model.extension.YList;
import org.lunifera.ecview.core.extension.model.extension.YNumericField;
import org.lunifera.ecview.core.extension.model.extension.YNumericSearchField;
import org.lunifera.ecview.core.extension.model.extension.YOptionsGroup;
import org.lunifera.ecview.core.extension.model.extension.YPanel;
import org.lunifera.ecview.core.extension.model.extension.YProgressBar;
import org.lunifera.ecview.core.extension.model.extension.YReferenceSearchField;
import org.lunifera.ecview.core.extension.model.extension.YSearchPanel;
import org.lunifera.ecview.core.extension.model.extension.YSelectionType;
import org.lunifera.ecview.core.extension.model.extension.YSplitPanel;
import org.lunifera.ecview.core.extension.model.extension.YTab;
import org.lunifera.ecview.core.extension.model.extension.YTabSheet;
import org.lunifera.ecview.core.extension.model.extension.YTable;
import org.lunifera.ecview.core.extension.model.extension.YTextArea;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.core.extension.model.extension.YTextSearchField;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayout;
import org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.util.SimpleExtensionModelFactory;
import org.lunifera.ecview.dsl.derivedstate.AutowireHelper;
import org.lunifera.ecview.dsl.derivedstate.UiGrammarElementAdapter;
import org.lunifera.ecview.dsl.derivedstate.UiModelGrammarUtil;
import org.lunifera.ecview.dsl.extensions.BeanHelper;
import org.lunifera.ecview.dsl.extensions.BindableTypeProvider;
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider;
import org.lunifera.ecview.dsl.extensions.OperationExtensions;
import org.lunifera.ecview.dsl.extensions.TypeHelper;
import org.lunifera.ecview.semantic.uimodel.UiAlignment;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment;
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression;
import org.lunifera.ecview.semantic.uimodel.UiBrowser;
import org.lunifera.ecview.semantic.uimodel.UiButton;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiCommand;
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef;
import org.lunifera.ecview.semantic.uimodel.UiDateField;
import org.lunifera.ecview.semantic.uimodel.UiDateFormat;
import org.lunifera.ecview.semantic.uimodel.UiDateTimeResolution;
import org.lunifera.ecview.semantic.uimodel.UiDecimalField;
import org.lunifera.ecview.semantic.uimodel.UiDialog;
import org.lunifera.ecview.semantic.uimodel.UiDialogAssignment;
import org.lunifera.ecview.semantic.uimodel.UiDialogSearchFieldAssignment;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiErrorCode;
import org.lunifera.ecview.semantic.uimodel.UiExposedAction;
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
import org.lunifera.ecview.semantic.uimodel.UiLayout;
import org.lunifera.ecview.semantic.uimodel.UiList;
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
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
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
import org.lunifera.ecview.semantic.uimodel.UiSearchPanel;
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
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessor;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;
import org.lunifera.ecview.semantic.uisemantics.UxAction;
import org.lunifera.ecview.semantic.uisemantics.UxEndpointDef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class UiModelDerivedStateComputerx extends JvmModelAssociator {
  public static class BindingInfo {
    /**
     * The type of the bound property. For nested bindings it is the last element available
     */
    private JvmType typeOfBoundProperty;
    
    /**
     * The type of the binding. For nested bindings it is the element before the bound property
     */
    private JvmType typeForBinding;
    
    /**
     * The deepest JvmOperation in the hierarchy. This field is used to bind.
     */
    private JvmOperation deepestJvmField;
    
    /**
     * The nested path using dot notation.
     */
    private StringBuilder path = new StringBuilder();
    
    /**
     * The element the binding should be installed on
     */
    private EObject bindingRoot;
    
    /**
     * Append the segment to the path.
     */
    public void appendPath(final String segment) {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(segment);
      if (_isNullOrEmpty) {
        return;
      }
      int _length = this.path.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        this.path.append(".");
      }
      this.path.append(segment);
    }
  }
  
  private final static Logger LOGGER = LoggerFactory.getLogger(UiModelDerivedStateComputerx.class);
  
  @Inject
  private /* ITypeLoaderFactory */Object typeLoaderFactory;
  
  private /* ITypeLoader */Object typeLoader;
  
  @Inject
  private BindableTypeProvider typeOfBoundPropertyProvider;
  
  @Inject
  private TypeHelper typeHelper;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private I18nKeyProvider i18nKeyProvider;
  
  @Inject
  private AutowireHelper autowireHelper;
  
  private final Stack<EObject> viewContext = new Stack<EObject>();
  
  private final /* List<YView> */Object views = CollectionLiterals.<YView>newArrayList();
  
  private final Map<EObject, EObject> grammarToUiAssociations = CollectionLiterals.<EObject, EObject>newHashMap();
  
  private final Map<EObject, EObject> uiToGrammarAssociations = CollectionLiterals.<EObject, EObject>newHashMap();
  
  private final /* SimpleExtensionModelFactory */Object factory /* Skipped initializer because of errors */;
  
  private String currentPackage;
  
  private /* YView */Object currentView;
  
  private DerivedStateAwareResource resource;
  
  private List<UiBinding> pendingBindings = CollectionLiterals.<UiBinding>newArrayList();
  
  private List<UiBinding> temporaryPendingBindings = CollectionLiterals.<UiBinding>newArrayList();
  
  private List<UiVisibilityProcessorAssignment> pendingVisibilityProcessors = CollectionLiterals.<UiVisibilityProcessorAssignment>newArrayList();
  
  private List<UiLayout> pendingAutowires = CollectionLiterals.<UiLayout>newArrayList();
  
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
  
  public YView getCurrentView() {
    return this.currentView;
  }
  
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    super.installDerivedState(resource, preLinkingPhase);
    this.resource = resource;
    ResourceSet _resourceSet = resource.getResourceSet();
    ITypeLoader _createTypeLoader = this.typeLoaderFactory.createTypeLoader(_resourceSet);
    this.typeLoader = _createTypeLoader;
    EList<EObject> _contents = resource.getContents();
    boolean _isEmpty = _contents.isEmpty();
    if (_isEmpty) {
      return;
    }
    if ((!preLinkingPhase)) {
      this.grammarToUiAssociations.clear();
      this.uiToGrammarAssociations.clear();
      this.pendingAutowires.clear();
      EList<EObject> _contents_1 = resource.getContents();
      EObject _get = _contents_1.get(0);
      final UiModel eObject = ((UiModel) _get);
      String _packageName = eObject.getPackageName();
      this.currentPackage = _packageName;
      try {
        EList<EObject> _eContents = eObject.eContents();
        final Procedure1<EObject> _function = new Procedure1<EObject>() {
          public void apply(final EObject it) {
            UiModelDerivedStateComputerx.this.map(it);
          }
        };
        IterableExtensions.<EObject>forEach(_eContents, _function);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception ex = (Exception)_t;
          UiModelDerivedStateComputerx.LOGGER.error("{}", ex);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
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
      this.pendingVisibilityProcessors.clear();
      this.pendingAutowires.clear();
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
  
  public String toI18nKey(final UiNamedElement element) {
    return this.i18nKeyProvider.toI18nKey(element);
  }
  
  public String toI18nKey(final UiEmbeddable element) {
    return this.i18nKeyProvider.toI18nKey(element);
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
    final YView yView = this.factory.createView();
    UiAlignment _contentAlignment = object.getContentAlignment();
    YAlignment _yAlignment = this.toYAlignment(_contentAlignment);
    yView.setContentAlignment(_yAlignment);
    this.associateUi(object, yView);
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
    final YEmbeddable element = this.create(_content);
    yView.setContent(element);
    UiEmbeddable _content_1 = object.getContent();
    this.map(_content_1);
    EList<UiBinding> _bindings = object.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    EList<UiExposedAction> _exposedActions = object.getExposedActions();
    final Procedure1<UiExposedAction> _function_2 = new Procedure1<UiExposedAction>() {
      public void apply(final UiExposedAction it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiExposedAction>forEach(_exposedActions, _function_2);
    final Procedure1<UiLayout> _function_3 = new Procedure1<UiLayout>() {
      public void apply(final UiLayout it) {
        UiModelDerivedStateComputerx.this.doAutowire(it);
      }
    };
    IterableExtensions.<UiLayout>forEach(this.pendingAutowires, _function_3);
    EList<UiVisibilityProcessorAssignment> _processorAssignments = object.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_4 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_4);
    final Procedure1<UiVisibilityProcessorAssignment> _function_5 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiVisibilityProcessor _processor = it.getProcessor();
        UiModelDerivedStateComputerx.this.map(_processor);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(this.pendingVisibilityProcessors, _function_5);
    ArrayList<UiBinding> _newArrayList = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
    this.temporaryPendingBindings = _newArrayList;
    this.pendingBindings.clear();
    final Procedure1<UiBinding> _function_6 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.install(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(this.temporaryPendingBindings, _function_6);
    boolean _isEmpty = this.pendingBindings.isEmpty();
    if (_isEmpty) {
      EList<UiValidatorAssignment> _validatorAssignments = object.getValidatorAssignments();
      final Procedure1<UiValidatorAssignment> _function_7 = new Procedure1<UiValidatorAssignment>() {
        public void apply(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments, _function_7);
      this.<Object>pop();
      this.currentView = null;
    } else {
      ArrayList<UiBinding> _newArrayList_1 = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
      this.temporaryPendingBindings = _newArrayList_1;
      this.pendingBindings.clear();
      final Procedure1<UiBinding> _function_8 = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.install(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(this.temporaryPendingBindings, _function_8);
      EList<UiValidatorAssignment> _validatorAssignments_1 = object.getValidatorAssignments();
      final Procedure1<UiValidatorAssignment> _function_9 = new Procedure1<UiValidatorAssignment>() {
        public void apply(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments_1, _function_9);
      this.<Object>pop();
      this.currentView = null;
    }
  }
  
  public void doAutowire(final UiLayout embeddable) {
    YDeviceType _deviceType = this.currentView.getDeviceType();
    boolean _equals = Objects.equal(_deviceType, YDeviceType.MOBILE);
    String _i18nKey = this.toI18nKey(embeddable);
    this.autowireHelper.autowire(embeddable, this, _equals, _i18nKey);
  }
  
  protected void _map(final UiMobileView object) {
    final YView yView = this.factory.createView();
    yView.setDeviceType(YDeviceType.MOBILE);
    UiAlignment _contentAlignment = object.getContentAlignment();
    YAlignment _yAlignment = this.toYAlignment(_contentAlignment);
    yView.setContentAlignment(_yAlignment);
    this.associateUi(object, yView);
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
    final YEmbeddable element = this.create(_content);
    yView.setContent(element);
    UiEmbeddable _content_1 = object.getContent();
    this.map(_content_1);
    EList<UiBinding> _bindings = object.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    EList<UiExposedAction> _exposedActions = object.getExposedActions();
    final Procedure1<UiExposedAction> _function_2 = new Procedure1<UiExposedAction>() {
      public void apply(final UiExposedAction it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiExposedAction>forEach(_exposedActions, _function_2);
    final Procedure1<UiLayout> _function_3 = new Procedure1<UiLayout>() {
      public void apply(final UiLayout it) {
        UiModelDerivedStateComputerx.this.doAutowire(it);
      }
    };
    IterableExtensions.<UiLayout>forEach(this.pendingAutowires, _function_3);
    EList<UiVisibilityProcessorAssignment> _processorAssignments = object.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_4 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_4);
    final Procedure1<UiVisibilityProcessorAssignment> _function_5 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiVisibilityProcessor _processor = it.getProcessor();
        UiModelDerivedStateComputerx.this.map(_processor);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(this.pendingVisibilityProcessors, _function_5);
    ArrayList<UiBinding> _newArrayList = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
    this.temporaryPendingBindings = _newArrayList;
    this.pendingBindings.clear();
    final Procedure1<UiBinding> _function_6 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.install(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(this.temporaryPendingBindings, _function_6);
    boolean _isEmpty = this.pendingBindings.isEmpty();
    if (_isEmpty) {
      EList<UiValidatorAssignment> _validatorAssignments = object.getValidatorAssignments();
      final Procedure1<UiValidatorAssignment> _function_7 = new Procedure1<UiValidatorAssignment>() {
        public void apply(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments, _function_7);
      this.<Object>pop();
      this.currentView = null;
    } else {
      ArrayList<UiBinding> _newArrayList_1 = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
      this.temporaryPendingBindings = _newArrayList_1;
      this.pendingBindings.clear();
      final Procedure1<UiBinding> _function_8 = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.install(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(this.temporaryPendingBindings, _function_8);
      EList<UiValidatorAssignment> _validatorAssignments_1 = object.getValidatorAssignments();
      final Procedure1<UiValidatorAssignment> _function_9 = new Procedure1<UiValidatorAssignment>() {
        public void apply(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments_1, _function_9);
      this.<Object>pop();
      this.currentView = null;
    }
  }
  
  public EObject push(final EObject eObject) {
    return this.viewContext.push(eObject);
  }
  
  protected void _map(final UiGridLayout eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYGridLayout cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiGridLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYGridLayout cannot be resolved to a type."
      + "\naddElement cannot be resolved"
      + "\naddGridLayoutCellStyle cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiVerticalLayout eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVerticalLayout cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiVerticalLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVerticalLayout cannot be resolved to a type."
      + "\naddElement cannot be resolved"
      + "\naddCellStyle cannot be resolved"
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
    boolean _isAutowire = eObject.isAutowire();
    if (_isAutowire) {
      this.pendingAutowires.add(eObject);
    }
    EList<UiBinding> _bindings = eObject.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiHorizontalLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYHorizontalLayout cannot be resolved to a type."
      + "\naddElement cannot be resolved"
      + "\naddCellStyle cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiSearchPanel eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSearchPanel cannot be resolved to a type."
      + "\npush cannot be resolved"
      + "\n== cannot be resolved"
      + "\naddElement cannot be resolved"
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
    throw new Error("Unresolved compilation problems:"
      + "\nYTabSheet cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiTabAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTabSheet cannot be resolved to a type."
      + "\nYTab cannot be resolved to a type."
      + "\ncreateTab cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntabs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\npush cannot be resolved"
      + "\nembeddable cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiMobileTabSheet eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMTabSheet cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiMobileTabAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMTabSheet cannot be resolved to a type."
      + "\nVMTab cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMTab cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\ntabs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\npush cannot be resolved"
      + "\nembeddable cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiHorizontalButtonGroup eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMHorizontalButtonGroup cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiHorizontalButtonGroupAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMHorizontalButtonGroup cannot be resolved to a type."
      + "\naddElement cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiVerticalComponentGroup eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMVerticalComponentGroup cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiVerticalComponentGroupAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMVerticalComponentGroup cannot be resolved to a type."
      + "\naddElement cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiMobileNavigationPage eObject) {
    VMNavigationPage yField = this.<VMNavigationPage>associatedUi(eObject);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiDialog eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDialog cannot be resolved to a type."
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYDialog cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ndialogs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiSearchDialog eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDialog cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nYVerticalLayout cannot be resolved to a type."
      + "\nYGridLayout cannot be resolved to a type."
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYDialog cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ndialog cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ndialogs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\npush cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYVerticalLayout cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\npush cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYGridLayout cannot be resolved"
      + "\nelements cannot be resolved"
      + "\n+= cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiDialogAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDialog cannot be resolved to a type."
      + "\ncontent cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiSearchField eObject) {
  }
  
  protected void _map(final UiDialogSearchFieldAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYLayout cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYTextSearchField cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYNumericSearchField cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYBooleanSearchField cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nelements cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  public void createTransient(final UiMobileNavigationPage eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiMobileNavigationPageAssignment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\naddElement cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiFormLayout eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYFormLayout cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiFormLayoutAssigment eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYFormLayout cannot be resolved to a type."
      + "\n== cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiOptionsGroup eObject) {
    final YField yOptionsGroup = this.<YField>associatedUi(eObject);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiList eObject) {
    final YField yList = this.<YField>associatedUi(eObject);
    this.push(yList);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiTable eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTable cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiImage eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYImage cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiComboBox eObject) {
    final YField yField = this.<YField>associatedUi(eObject);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_1 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiButton object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYButton cannot be resolved to a type.");
  }
  
  protected void _map(final UiMobileNavigationButton object) {
    final VMNavigationButton button = this.<VMNavigationButton>associatedUi(object);
    this.push(button);
    UiMobileNavigationPage _targetPage = object.getTargetPage();
    boolean _notEquals = (!Objects.equal(_targetPage, null));
    if (_notEquals) {
      UiMobileNavigationPage _targetPage_1 = object.getTargetPage();
      YEmbeddable _create = this.create(_targetPage_1);
      final VMNavigationPage page = ((VMNavigationPage) _create);
      button.setPage(page);
      UiMobileNavigationPage _targetPage_2 = object.getTargetPage();
      this.map(_targetPage_2);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = object.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_1 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_1);
    this.<Object>pop();
  }
  
  protected void _map(final UiColumn eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTable cannot be resolved to a type."
      + "\nYColumn cannot be resolved to a type."
      + "\ncreateColumn cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\ncollapsed cannot be resolved"
      + "\ncollapsible cannot be resolved"
      + "\nexpandRatio cannot be resolved"
      + "\nicon cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\norderable cannot be resolved"
      + "\nvisible cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ncolumns cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  public /* YDateTimeFormat */Object toYDateTimeFormat(final UiDateFormat format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field YDateTimeFormat is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeFormat is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeFormat is undefined for the type UiModelDerivedStateComputerx"
      + "\nDATE cannot be resolved"
      + "\nDATE_TIME cannot be resolved"
      + "\nTIME cannot be resolved");
  }
  
  public /* YDateTimeResolution */Object toYDateTimeResolution(final UiDateTimeResolution value) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nSECOND cannot be resolved"
      + "\nMINUTE cannot be resolved"
      + "\nHOUR cannot be resolved"
      + "\nDAY cannot be resolved"
      + "\nMONTH cannot be resolved"
      + "\nYEAR cannot be resolved"
      + "\nUNDEFINED cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiExposedAction object) {
    final YExposedAction yAction = CoreModelFactory.eINSTANCE.createYExposedAction();
    UxAction _actionReference = object.getActionReference();
    boolean _notEquals = (!Objects.equal(_actionReference, null));
    if (_notEquals) {
      UxAction _actionReference_1 = object.getActionReference();
      String _name = _actionReference_1.getName();
      yAction.setId(_name);
    } else {
      String _actionID = object.getActionID();
      yAction.setId(_actionID);
    }
    String _name_1 = object.getName();
    yAction.setName(_name_1);
    String _name_2 = object.getName();
    yAction.setLabel(_name_2);
    String _i18nKey = this.toI18nKey(object);
    yAction.setLabelI18nKey(_i18nKey);
    String _iconName = object.getIconName();
    yAction.setIcon(_iconName);
    this.associateUi(object, yAction);
    EList<YExposedAction> _exposedActions = this.currentView.getExposedActions();
    _exposedActions.add(yAction);
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
  
  protected void _map(final UiVisibilityProcessorAssignment eObject) {
    this.pendingVisibilityProcessors.add(eObject);
  }
  
  protected void _map(final UiVisibilityProcessor eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVisibilityProcessor cannot be resolved to a type."
      + "\nYValueBindingEndpoint cannot be resolved to a type."
      + "\nYVisibilityProcessorValueBindingEndpoint cannot be resolved to a type."
      + "\nYValueBinding cannot be resolved to a type."
      + "\nYValueBindingEndpoint cannot be resolved to a type."
      + "\nYVisibilityProcessorValueBindingEndpoint cannot be resolved to a type."
      + "\nYValueBinding cannot be resolved to a type."
      + "\nThe method or field VisibilityFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field BindingFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field BindingFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field BindingFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field BindingFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYVisibilityProcessor cannot be resolved"
      + "\ndelegate cannot be resolved"
      + "\ndelegateQualifiedName cannot be resolved"
      + "\nvisibilityProcessors cannot be resolved"
      + "\n+= cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYVisibilityProcessorValueBindingEndpoint cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYValueBinding cannot be resolved"
      + "\nsetTargetEndpoint cannot be resolved"
      + "\nsetModelEndpoint cannot be resolved"
      + "\nsetModelToTargetStrategy cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nsetTargetToModelStrategy cannot be resolved"
      + "\nNEVER cannot be resolved"
      + "\ntriggersOn cannot be resolved"
      + "\n+= cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYVisibilityProcessorValueBindingEndpoint cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYValueBinding cannot be resolved"
      + "\nsetTargetEndpoint cannot be resolved"
      + "\nsetModelEndpoint cannot be resolved"
      + "\nsetModelToTargetStrategy cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nsetTargetToModelStrategy cannot be resolved"
      + "\nNEVER cannot be resolved"
      + "\ndataUsed cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final UiMaxLengthValidator eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYMaxLengthValidator cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\ncreateMaxLengthValidator cannot be resolved"
      + "\nmaxLength cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\ndefaultErrorMessage cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final UiMinLengthValidator eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYMinLengthValidator cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\ncreateMinLengthValidator cannot be resolved"
      + "\nminLength cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\ndefaultErrorMessage cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final UiRegexpValidator eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYRegexpValidator cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\ncreateRegexpValidator cannot be resolved"
      + "\nregExpression cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\ndefaultErrorMessage cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final UiXbaseValidator eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\nYClassDelegateValidator cannot be resolved to a type."
      + "\n!= cannot be resolved"
      + "\ncreateClassDelegateValidator cannot be resolved"
      + "\nclassName cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiEmbeddable object) {
    return null;
  }
  
  protected /* YEmbeddable */Object _create(final Void object) {
    return null;
  }
  
  protected YEmbeddable _create(final UiTextField object) {
    final YTextField textField = this.factory.createTextField();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    textField.setId(_pathId);
    String _name = object.getName();
    textField.setName(_name);
    String _name_1 = object.getName();
    textField.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    textField.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    textField.setInitialEnabled(_not);
    String _styles = object.getStyles();
    textField.setCssClass(_styles);
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
  
  protected YEmbeddable _create(final UiBeanReferenceField object) {
    final YBeanReferenceField field = ExtensionModelFactory.eINSTANCE.createYBeanReferenceField();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    boolean _isConsumeBeanService = object.isConsumeBeanService();
    field.setUseBeanService(_isConsumeBeanService);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
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
    final UiNestedProperty captionProperty = object.getCaptionProperty();
    boolean _notEquals_1 = (!Objects.equal(captionProperty, null));
    if (_notEquals_1) {
      String _pathString = captionProperty.toPathString();
      field.setCaptionPropertyPath(_pathString);
    } else {
      Class<?> _type = field.getType();
      String _findCaptionProperty = BeanHelper.findCaptionProperty(_type);
      field.setCaptionPropertyPath(_findCaptionProperty);
    }
    final UiNestedProperty imageProperty = object.getImageProperty();
    boolean _notEquals_2 = (!Objects.equal(imageProperty, null));
    if (_notEquals_2) {
      String _pathString_1 = imageProperty.toPathString();
      field.setImagePropertyPath(_pathString_1);
    }
    JvmTypeReference _inMemoryBeanProvider = object.getInMemoryBeanProvider();
    boolean _notEquals_3 = (!Objects.equal(_inMemoryBeanProvider, null));
    if (_notEquals_3) {
      JvmTypeReference _inMemoryBeanProvider_1 = object.getInMemoryBeanProvider();
      String _qualifiedName_2 = _inMemoryBeanProvider_1.getQualifiedName();
      field.setInMemoryBeanProviderQualifiedName(_qualifiedName_2);
      Resource _eResource_1 = object.eResource();
      ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
      JvmTypeReference _inMemoryBeanProvider_2 = object.getInMemoryBeanProvider();
      String _qualifiedName_3 = _inMemoryBeanProvider_2.getQualifiedName();
      Class<?> _loadClass_1 = this.loadClass(_resourceSet_1, _qualifiedName_3);
      field.setInMemoryBeanProvider(_loadClass_1);
    }
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiLabel object) {
    final YLabel label = this.factory.createLabel();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    label.setId(_pathId);
    String _name = object.getName();
    label.setName(_name);
    String _name_1 = object.getName();
    label.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    label.setLabelI18nKey(_i18nKey);
    String _styles = object.getStyles();
    label.setCssClass(_styles);
    this.associateUi(object, label);
    return label;
  }
  
  protected YEmbeddable _create(final UiDecimalField object) {
    final YDecimalField decimalField = this.factory.createDecimalField();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    decimalField.setId(_pathId);
    String _name = object.getName();
    decimalField.setName(_name);
    String _name_1 = object.getName();
    decimalField.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    decimalField.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    decimalField.setInitialEnabled(_not);
    String _styles = object.getStyles();
    decimalField.setCssClass(_styles);
    final YDecimalDatatype dt = this.factory.createDecimalDatatype();
    decimalField.setDatatype(dt);
    EList<YDatatype> _orphanDatatypes = decimalField.getOrphanDatatypes();
    _orphanDatatypes.add(dt);
    boolean _isNoGrouping = object.isNoGrouping();
    boolean _not_1 = (!_isNoGrouping);
    dt.setGrouping(_not_1);
    boolean _isNoMarkNegative = object.isNoMarkNegative();
    boolean _not_2 = (!_isNoMarkNegative);
    dt.setMarkNegative(_not_2);
    int _precision = object.getPrecision();
    dt.setPrecision(_precision);
    this.associateUi(object, decimalField);
    return decimalField;
  }
  
  protected YEmbeddable _create(final UiTextArea object) {
    final YTextArea textArea = this.factory.createTextArea();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    textArea.setId(_pathId);
    String _name = object.getName();
    textArea.setName(_name);
    String _name_1 = object.getName();
    textArea.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    textArea.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    textArea.setInitialEnabled(_not);
    String _styles = object.getStyles();
    textArea.setCssClass(_styles);
    this.associateUi(object, textArea);
    return textArea;
  }
  
  protected YEmbeddable _create(final UiOptionsGroup object) {
    JvmTypeReference _jvmType = object.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    if ((_type instanceof JvmEnumerationType)) {
      final YEnumOptionsGroup optionsGroup = ExtensionModelFactory.eINSTANCE.createYEnumOptionsGroup();
      String _pathId = UiModelGrammarUtil.getPathId(object);
      optionsGroup.setId(_pathId);
      String _name = object.getName();
      optionsGroup.setName(_name);
      String _name_1 = object.getName();
      optionsGroup.setLabel(_name_1);
      String _i18nKey = this.toI18nKey(object);
      optionsGroup.setLabelI18nKey(_i18nKey);
      UiSelectionType _selectionType = object.getSelectionType();
      YSelectionType _convert = this.convert(_selectionType);
      optionsGroup.setSelectionType(_convert);
      boolean _isReadonly = object.isReadonly();
      boolean _not = (!_isReadonly);
      optionsGroup.setInitialEnabled(_not);
      String _styles = object.getStyles();
      optionsGroup.setCssClass(_styles);
      JvmTypeReference _jvmType_1 = object.getJvmType();
      boolean _notEquals = (!Objects.equal(_jvmType_1, null));
      if (_notEquals) {
        JvmTypeReference _jvmType_2 = object.getJvmType();
        String _qualifiedName = _jvmType_2.getQualifiedName();
        optionsGroup.setTypeQualifiedName(_qualifiedName);
        Resource _eResource = object.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        JvmTypeReference _jvmType_3 = object.getJvmType();
        String _qualifiedName_1 = _jvmType_3.getQualifiedName();
        Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
        optionsGroup.setType(_loadClass);
      }
      this.associateUi(object, optionsGroup);
      return optionsGroup;
    } else {
      final YOptionsGroup optionsGroup_1 = this.factory.createOptionsGroup();
      String _pathId_1 = UiModelGrammarUtil.getPathId(object);
      optionsGroup_1.setId(_pathId_1);
      String _name_2 = object.getName();
      optionsGroup_1.setName(_name_2);
      String _name_3 = object.getName();
      optionsGroup_1.setLabel(_name_3);
      boolean _isConsumeBeanService = object.isConsumeBeanService();
      optionsGroup_1.setUseBeanService(_isConsumeBeanService);
      String _i18nKey_1 = this.toI18nKey(object);
      optionsGroup_1.setLabelI18nKey(_i18nKey_1);
      UiSelectionType _selectionType_1 = object.getSelectionType();
      YSelectionType _convert_1 = this.convert(_selectionType_1);
      optionsGroup_1.setSelectionType(_convert_1);
      boolean _isReadonly_1 = object.isReadonly();
      boolean _not_1 = (!_isReadonly_1);
      optionsGroup_1.setInitialEnabled(_not_1);
      JvmTypeReference _jvmType_4 = object.getJvmType();
      boolean _notEquals_1 = (!Objects.equal(_jvmType_4, null));
      if (_notEquals_1) {
        JvmTypeReference _jvmType_5 = object.getJvmType();
        String _qualifiedName_2 = _jvmType_5.getQualifiedName();
        optionsGroup_1.setTypeQualifiedName(_qualifiedName_2);
        Resource _eResource_1 = object.eResource();
        ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
        JvmTypeReference _jvmType_6 = object.getJvmType();
        String _qualifiedName_3 = _jvmType_6.getQualifiedName();
        Class<?> _loadClass_1 = this.loadClass(_resourceSet_1, _qualifiedName_3);
        optionsGroup_1.setType(_loadClass_1);
      }
      JvmOperation _itemCaptionProperty = object.getItemCaptionProperty();
      boolean _notEquals_2 = (!Objects.equal(_itemCaptionProperty, null));
      if (_notEquals_2) {
        JvmOperation _itemCaptionProperty_1 = object.getItemCaptionProperty();
        String _simpleName = null;
        if (_itemCaptionProperty_1!=null) {
          _simpleName=_itemCaptionProperty_1.getSimpleName();
        }
        String _propertyName = OperationExtensions.toPropertyName(_simpleName);
        optionsGroup_1.setCaptionProperty(_propertyName);
      } else {
        Class<?> _type_1 = optionsGroup_1.getType();
        String _findCaptionProperty = BeanHelper.findCaptionProperty(_type_1);
        optionsGroup_1.setCaptionProperty(_findCaptionProperty);
      }
      JvmOperation _itemImageProperty = object.getItemImageProperty();
      String _simpleName_1 = null;
      if (_itemImageProperty!=null) {
        _simpleName_1=_itemImageProperty.getSimpleName();
      }
      String _propertyName_1 = OperationExtensions.toPropertyName(_simpleName_1);
      optionsGroup_1.setImageProperty(_propertyName_1);
      this.associateUi(object, optionsGroup_1);
      return optionsGroup_1;
    }
  }
  
  protected YEmbeddable _create(final UiList object) {
    JvmTypeReference _jvmType = object.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    if ((_type instanceof JvmEnumerationType)) {
      final YEnumList list = ExtensionModelFactory.eINSTANCE.createYEnumList();
      String _pathId = UiModelGrammarUtil.getPathId(object);
      list.setId(_pathId);
      String _name = object.getName();
      list.setName(_name);
      String _name_1 = object.getName();
      list.setLabel(_name_1);
      String _i18nKey = this.toI18nKey(object);
      list.setLabelI18nKey(_i18nKey);
      UiSelectionType _selectionType = object.getSelectionType();
      YSelectionType _convert = this.convert(_selectionType);
      list.setSelectionType(_convert);
      boolean _isReadonly = object.isReadonly();
      boolean _not = (!_isReadonly);
      list.setInitialEnabled(_not);
      String _styles = object.getStyles();
      list.setCssClass(_styles);
      JvmTypeReference _jvmType_1 = object.getJvmType();
      boolean _notEquals = (!Objects.equal(_jvmType_1, null));
      if (_notEquals) {
        JvmTypeReference _jvmType_2 = object.getJvmType();
        String _qualifiedName = _jvmType_2.getQualifiedName();
        list.setTypeQualifiedName(_qualifiedName);
        Resource _eResource = object.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        JvmTypeReference _jvmType_3 = object.getJvmType();
        String _qualifiedName_1 = _jvmType_3.getQualifiedName();
        Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
        list.setType(_loadClass);
      }
      this.associateUi(object, list);
      return list;
    } else {
      final YList list_1 = this.factory.createList();
      String _pathId_1 = UiModelGrammarUtil.getPathId(object);
      list_1.setId(_pathId_1);
      String _name_2 = object.getName();
      list_1.setName(_name_2);
      String _name_3 = object.getName();
      list_1.setLabel(_name_3);
      boolean _isConsumeBeanService = object.isConsumeBeanService();
      list_1.setUseBeanService(_isConsumeBeanService);
      String _i18nKey_1 = this.toI18nKey(object);
      list_1.setLabelI18nKey(_i18nKey_1);
      UiSelectionType _selectionType_1 = object.getSelectionType();
      YSelectionType _convert_1 = this.convert(_selectionType_1);
      list_1.setSelectionType(_convert_1);
      boolean _isReadonly_1 = object.isReadonly();
      boolean _not_1 = (!_isReadonly_1);
      list_1.setInitialEnabled(_not_1);
      JvmTypeReference _jvmType_4 = object.getJvmType();
      boolean _notEquals_1 = (!Objects.equal(_jvmType_4, null));
      if (_notEquals_1) {
        JvmTypeReference _jvmType_5 = object.getJvmType();
        String _qualifiedName_2 = _jvmType_5.getQualifiedName();
        list_1.setTypeQualifiedName(_qualifiedName_2);
        Resource _eResource_1 = object.eResource();
        ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
        JvmTypeReference _jvmType_6 = object.getJvmType();
        String _qualifiedName_3 = _jvmType_6.getQualifiedName();
        Class<?> _loadClass_1 = this.loadClass(_resourceSet_1, _qualifiedName_3);
        list_1.setType(_loadClass_1);
      }
      JvmOperation _itemCaptionProperty = object.getItemCaptionProperty();
      boolean _notEquals_2 = (!Objects.equal(_itemCaptionProperty, null));
      if (_notEquals_2) {
        JvmOperation _itemCaptionProperty_1 = object.getItemCaptionProperty();
        String _simpleName = null;
        if (_itemCaptionProperty_1!=null) {
          _simpleName=_itemCaptionProperty_1.getSimpleName();
        }
        String _propertyName = OperationExtensions.toPropertyName(_simpleName);
        list_1.setCaptionProperty(_propertyName);
      } else {
        Class<?> _type_1 = list_1.getType();
        String _findCaptionProperty = BeanHelper.findCaptionProperty(_type_1);
        list_1.setCaptionProperty(_findCaptionProperty);
      }
      JvmOperation _itemImageProperty = object.getItemImageProperty();
      String _simpleName_1 = null;
      if (_itemImageProperty!=null) {
        _simpleName_1=_itemImageProperty.getSimpleName();
      }
      String _propertyName_1 = OperationExtensions.toPropertyName(_simpleName_1);
      list_1.setImageProperty(_propertyName_1);
      this.associateUi(object, list_1);
      return list_1;
    }
  }
  
  protected YEmbeddable _create(final UiDateField object) {
    final YDateTime dateTime = this.factory.createDateTime();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    dateTime.setId(_pathId);
    String _name = object.getName();
    dateTime.setName(_name);
    String _name_1 = object.getName();
    dateTime.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    dateTime.setLabelI18nKey(_i18nKey);
    UiDateFormat _dateFormat = object.getDateFormat();
    YDateTimeFormat _yDateTimeFormat = this.toYDateTimeFormat(_dateFormat);
    dateTime.setDateFormat(_yDateTimeFormat);
    UiDateTimeResolution _resolution = object.getResolution();
    YDateTimeResolution _yDateTimeResolution = this.toYDateTimeResolution(_resolution);
    dateTime.setResolution(_yDateTimeResolution);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    dateTime.setInitialEnabled(_not);
    String _styles = object.getStyles();
    dateTime.setCssClass(_styles);
    this.associateUi(object, dateTime);
    return dateTime;
  }
  
  protected YEmbeddable _create(final UiBrowser object) {
    final YBrowser browser = this.factory.createBrowser();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    browser.setId(_pathId);
    String _name = object.getName();
    browser.setName(_name);
    String _name_1 = object.getName();
    browser.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    browser.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    browser.setInitialEnabled(_not);
    String _styles = object.getStyles();
    browser.setCssClass(_styles);
    this.associateUi(object, browser);
    return browser;
  }
  
  protected YEmbeddable _create(final UiProgressBar object) {
    final YProgressBar progressBar = this.factory.createProgressBar();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    progressBar.setId(_pathId);
    String _name = object.getName();
    progressBar.setName(_name);
    String _name_1 = object.getName();
    progressBar.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    progressBar.setLabelI18nKey(_i18nKey);
    String _styles = object.getStyles();
    progressBar.setCssClass(_styles);
    this.associateUi(object, progressBar);
    return progressBar;
  }
  
  protected YEmbeddable _create(final UiImage object) {
    final YImage image = this.factory.createImage();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    image.setId(_pathId);
    String _name = object.getName();
    image.setName(_name);
    String _name_1 = object.getName();
    image.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    image.setLabelI18nKey(_i18nKey);
    String _styles = object.getStyles();
    image.setCssClass(_styles);
    String _value = object.getValue();
    image.setValue(_value);
    this.associateUi(object, image);
    return image;
  }
  
  protected YEmbeddable _create(final UiTable object) {
    final YTable table = this.factory.createTable();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    table.setId(_pathId);
    String _name = object.getName();
    table.setName(_name);
    String _name_1 = object.getName();
    table.setLabel(_name_1);
    boolean _isConsumeBeanService = object.isConsumeBeanService();
    table.setUseBeanService(_isConsumeBeanService);
    String _i18nKey = this.toI18nKey(object);
    table.setLabelI18nKey(_i18nKey);
    UiSelectionType _selectionType = object.getSelectionType();
    YSelectionType _convert = this.convert(_selectionType);
    table.setSelectionType(_convert);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    table.setInitialEnabled(_not);
    String _styles = object.getStyles();
    table.setCssClass(_styles);
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
  
  protected YField _create(final UiSearchField eObject) {
    final UiNestedProperty property = eObject.getProperty();
    boolean _notEquals = (!Objects.equal(property, null));
    if (_notEquals) {
      final JvmType type = property.getTypeofLastSegment();
      YField newField = null;
      boolean _isString = this.typeHelper.isString(type);
      if (_isString) {
        final YTextSearchField temp = ExtensionModelFactory.eINSTANCE.createYTextSearchField();
        String _pathString = property.toPathString();
        temp.setPropertyPath(_pathString);
        newField = temp;
      } else {
        boolean _isNumber = this.typeHelper.isNumber(type);
        if (_isNumber) {
          final YNumericSearchField temp_1 = ExtensionModelFactory.eINSTANCE.createYNumericSearchField();
          String _pathString_1 = property.toPathString();
          temp_1.setPropertyPath(_pathString_1);
          Class<? extends Number> _numericType = this.typeHelper.toNumericType(type);
          temp_1.setType(_numericType);
          String _numericQualifiedName = this.typeHelper.toNumericQualifiedName(type);
          temp_1.setTypeQualifiedName(_numericQualifiedName);
          newField = temp_1;
        } else {
          boolean _isBoolean = this.typeHelper.isBoolean(type);
          if (_isBoolean) {
            final YBooleanSearchField temp_2 = ExtensionModelFactory.eINSTANCE.createYBooleanSearchField();
            String _pathString_2 = property.toPathString();
            temp_2.setPropertyPath(_pathString_2);
            newField = temp_2;
          } else {
            final YReferenceSearchField temp_3 = ExtensionModelFactory.eINSTANCE.createYReferenceSearchField();
            String _pathString_3 = property.toPathString();
            temp_3.setPropertyPath(_pathString_3);
            JvmType _typeofLastSegment = property.getTypeofLastSegment();
            String _qualifiedName = null;
            if (_typeofLastSegment!=null) {
              _qualifiedName=_typeofLastSegment.getQualifiedName();
            }
            temp_3.setTypeQualifiedName(_qualifiedName);
            Resource _eResource = eObject.eResource();
            ResourceSet _resourceSet = _eResource.getResourceSet();
            String _typeQualifiedName = temp_3.getTypeQualifiedName();
            Class<?> _loadClass = this.loadClass(_resourceSet, _typeQualifiedName);
            temp_3.setType(_loadClass);
            newField = temp_3;
          }
        }
      }
      boolean _notEquals_1 = (!Objects.equal(newField, null));
      if (_notEquals_1) {
        String _pathId = UiModelGrammarUtil.getPathId(eObject);
        newField.setId(_pathId);
        String _i18nKey = this.toI18nKey(eObject);
        newField.setLabelI18nKey(_i18nKey);
        boolean _isReadonly = eObject.isReadonly();
        boolean _not = (!_isReadonly);
        newField.setInitialEnabled(_not);
        String _styles = eObject.getStyles();
        newField.setCssClass(_styles);
      }
      return newField;
    }
    return null;
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
    String _pathId = UiModelGrammarUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    field.setInitialEnabled(_not);
    String _styles = object.getStyles();
    field.setCssClass(_styles);
    final YNumericDatatype dt = this.factory.createNumericDatatype();
    field.setDatatype(dt);
    EList<YDatatype> _orphanDatatypes = field.getOrphanDatatypes();
    _orphanDatatypes.add(dt);
    boolean _isNoGrouping = object.isNoGrouping();
    boolean _not_1 = (!_isNoGrouping);
    dt.setGrouping(_not_1);
    boolean _isNoMarkNegative = object.isNoMarkNegative();
    boolean _not_2 = (!_isNoMarkNegative);
    dt.setMarkNegative(_not_2);
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiCheckBox object) {
    final YCheckBox field = this.factory.createCheckBox();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    field.setInitialEnabled(_not);
    String _styles = object.getStyles();
    field.setCssClass(_styles);
    this.associateUi(object, field);
    return field;
  }
  
  protected YButton _create(final UiButton object) {
    final YButton field = this.factory.createButton();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    field.setInitialEnabled(_not);
    this.associateUi(object, field);
    return field;
  }
  
  protected VMNavigationButton _create(final UiMobileNavigationButton object) {
    final VMNavigationButton field = VaadinMobileFactory.eINSTANCE.createVMNavigationButton();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    field.setInitialEnabled(_not);
    String _styles = object.getStyles();
    field.setCssClass(_styles);
    this.associateUi(object, field);
    return field;
  }
  
  protected VMNavigationPage _create(final UiMobileNavigationPage object) {
    VMNavigationPage field = VaadinMobileFactory.eINSTANCE.createVMNavigationPage();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    field.setInitialEnabled(_not);
    String _styles = object.getStyles();
    field.setCssClass(_styles);
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiComboBox object) {
    JvmTypeReference _jvmType = object.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    if ((_type instanceof JvmEnumerationType)) {
      final YEnumComboBox field = ExtensionModelFactory.eINSTANCE.createYEnumComboBox();
      String _pathId = UiModelGrammarUtil.getPathId(object);
      field.setId(_pathId);
      String _name = object.getName();
      field.setName(_name);
      String _name_1 = object.getName();
      field.setLabel(_name_1);
      String _i18nKey = this.toI18nKey(object);
      field.setLabelI18nKey(_i18nKey);
      boolean _isReadonly = object.isReadonly();
      boolean _not = (!_isReadonly);
      field.setInitialEnabled(_not);
      String _styles = object.getStyles();
      field.setCssClass(_styles);
      JvmTypeReference _jvmType_1 = object.getJvmType();
      boolean _notEquals = (!Objects.equal(_jvmType_1, null));
      if (_notEquals) {
        JvmTypeReference _jvmType_2 = object.getJvmType();
        String _qualifiedName = _jvmType_2.getQualifiedName();
        field.setTypeQualifiedName(_qualifiedName);
        Resource _eResource = object.eResource();
        ResourceSet _resourceSet = _eResource.getResourceSet();
        JvmTypeReference _jvmType_3 = object.getJvmType();
        String _qualifiedName_1 = _jvmType_3.getQualifiedName();
        Class<?> _loadClass = this.loadClass(_resourceSet, _qualifiedName_1);
        field.setType(_loadClass);
      }
      this.associateUi(object, field);
      return field;
    } else {
      final YComboBox field_1 = this.factory.createComboBox();
      String _pathId_1 = UiModelGrammarUtil.getPathId(object);
      field_1.setId(_pathId_1);
      String _name_2 = object.getName();
      field_1.setName(_name_2);
      String _name_3 = object.getName();
      field_1.setLabel(_name_3);
      boolean _isConsumeBeanService = object.isConsumeBeanService();
      field_1.setUseBeanService(_isConsumeBeanService);
      String _i18nKey_1 = this.toI18nKey(object);
      field_1.setLabelI18nKey(_i18nKey_1);
      boolean _isReadonly_1 = object.isReadonly();
      boolean _not_1 = (!_isReadonly_1);
      field_1.setInitialEnabled(_not_1);
      JvmTypeReference _jvmType_4 = object.getJvmType();
      boolean _notEquals_1 = (!Objects.equal(_jvmType_4, null));
      if (_notEquals_1) {
        JvmTypeReference _jvmType_5 = object.getJvmType();
        String _qualifiedName_2 = _jvmType_5.getQualifiedName();
        field_1.setTypeQualifiedName(_qualifiedName_2);
        Resource _eResource_1 = object.eResource();
        ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
        JvmTypeReference _jvmType_6 = object.getJvmType();
        String _qualifiedName_3 = _jvmType_6.getQualifiedName();
        Class<?> _loadClass_1 = this.loadClass(_resourceSet_1, _qualifiedName_3);
        field_1.setType(_loadClass_1);
      }
      JvmOperation _itemCaptionProperty = object.getItemCaptionProperty();
      boolean _notEquals_2 = (!Objects.equal(_itemCaptionProperty, null));
      if (_notEquals_2) {
        JvmOperation _itemCaptionProperty_1 = object.getItemCaptionProperty();
        String _simpleName = null;
        if (_itemCaptionProperty_1!=null) {
          _simpleName=_itemCaptionProperty_1.getSimpleName();
        }
        String _propertyName = OperationExtensions.toPropertyName(_simpleName);
        field_1.setCaptionProperty(_propertyName);
      } else {
        Class<?> _type_1 = field_1.getType();
        String _findCaptionProperty = BeanHelper.findCaptionProperty(_type_1);
        field_1.setCaptionProperty(_findCaptionProperty);
      }
      JvmOperation _itemImageProperty = object.getItemImageProperty();
      String _simpleName_1 = null;
      if (_itemImageProperty!=null) {
        _simpleName_1=_itemImageProperty.getSimpleName();
      }
      String _propertyName_1 = OperationExtensions.toPropertyName(_simpleName_1);
      field_1.setImageProperty(_propertyName_1);
      this.associateUi(object, field_1);
      return field_1;
    }
  }
  
  protected YEmbeddable _create(final UiSwitch object) {
    final VMSwitch field = VaadinMobileFactory.eINSTANCE.createVMSwitch();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    field.setInitialEnabled(_not);
    String _styles = object.getStyles();
    field.setCssClass(_styles);
    this.associateUi(object, field);
    return field;
  }
  
  protected YGridLayout _create(final UiGridLayout object) {
    final YGridLayout layout = this.factory.createGridLayout();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    int _columns = object.getColumns();
    layout.setColumns(_columns);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YFormLayout _create(final UiFormLayout object) {
    final YFormLayout layout = this.factory.createFormLayout();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YHorizontalLayout _create(final UiHorizontalLayout object) {
    final YHorizontalLayout layout = this.factory.createHorizontalLayout();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YSearchPanel _create(final UiSearchPanel object) {
    final YSearchPanel layout = ExtensionModelFactory.eINSTANCE.createYSearchPanel();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YSplitPanel _create(final UiSplitpanel object) {
    final YSplitPanel layout = this.factory.createSplitPanel();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    int _splitPosition = object.getSplitPosition();
    layout.setSplitPosition(_splitPosition);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YPanel _create(final UiPanel object) {
    final YPanel layout = this.factory.createPanel();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YVerticalLayout _create(final UiVerticalLayout object) {
    final YVerticalLayout layout = this.factory.createVerticalLayout();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected VMHorizontalButtonGroup _create(final UiHorizontalButtonGroup object) {
    final VMHorizontalButtonGroup layout = VaadinMobileFactory.eINSTANCE.createVMHorizontalButtonGroup();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected VMVerticalComponentGroup _create(final UiVerticalComponentGroup object) {
    final VMVerticalComponentGroup layout = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    boolean _isReadonly = object.isReadonly();
    boolean _not = (!_isReadonly);
    layout.setInitialEnabled(_not);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YTabSheet _create(final UiTabSheet object) {
    final YTabSheet layout = this.factory.createTabSheet();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    String _styles = object.getStyles();
    layout.setCssClass(_styles);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected VMTabSheet _create(final UiMobileTabSheet object) {
    final VMTabSheet layout = VaadinMobileFactory.eINSTANCE.createVMTabSheet();
    String _pathId = UiModelGrammarUtil.getPathId(object);
    layout.setId(_pathId);
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
    throw new Error("Unresolved compilation problems:"
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nYBindingUpdateStrategy cannot be resolved to a type."
      + "\nUPDATE cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\norCreateBindingSet cannot be resolved"
      + "\naddBinding cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\norCreateBindingSet cannot be resolved"
      + "\naddBinding cannot be resolved");
  }
  
  public /* YValueBindingEndpoint */Object createValueBindingEndpoint(final UiBindingEndpointAssignment epDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nYValueBindingEndpoint cannot be resolved to a type."
      + "\nYBeanSlot cannot be resolved to a type."
      + "\nYBeanSlotValueBindingEndpoint cannot be resolved to a type."
      + "\nYElement cannot be resolved to a type."
      + "\nYECViewModelValueBindingEndpoint cannot be resolved to a type."
      + "\nVMNavigationCommand cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateBeanSlotValueBindingEndpoint cannot be resolved"
      + "\nbeanSlot cannot be resolved"
      + "\nattributePath cannot be resolved"
      + "\ncreateECViewModelValueBindingEndpoint cannot be resolved"
      + "\nelement cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
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
      + "\ncreateVMNavigationCommand cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\npush cannot be resolved"
      + "\nnavigationHandler cannot be resolved"
      + "\ncreateNavigationValueEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYOpenDialogCommand cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncreateTriggerDialogEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYOpenDialogCommand cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncreateTriggerDialogEndpoint cannot be resolved");
  }
  
  public UiMobileNavigationHandler findNavHandler(final UiBindingEndpointAssignment assignment) {
    EObject temp = assignment;
    while ((!Objects.equal(temp.eContainer(), null))) {
      {
        EObject _eContainer = temp.eContainer();
        temp = _eContainer;
        if ((temp instanceof UiMobileNavigationHandler)) {
          return ((UiMobileNavigationHandler) temp);
        }
      }
    }
    return null;
  }
  
  public /* YListBindingEndpoint */Object createListBindingEndpoint(final UiBindingEndpointAssignment epDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nYListBindingEndpoint cannot be resolved to a type."
      + "\nYBeanSlot cannot be resolved to a type."
      + "\nYBeanSlotListBindingEndpoint cannot be resolved to a type."
      + "\nYEmbeddable cannot be resolved to a type."
      + "\nYECViewModelListBindingEndpoint cannot be resolved to a type."
      + "\ncreateBeanSlotListBindingEndpoint cannot be resolved"
      + "\nbeanSlot cannot be resolved"
      + "\nattributePath cannot be resolved"
      + "\ncreateECViewModelListBindingEndpoint cannot be resolved"
      + "\nelement cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nemfNsURI cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nEPackage cannot be resolved"
      + "\nnsURI cannot be resolved");
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
      info.typeOfBoundProperty = _typeofLastSegment;
      UiPathSegment _path_3 = assignment.getPath();
      JvmOperation _operationofLastSegment = _path_3.getOperationofLastSegment();
      info.deepestJvmField = _operationofLastSegment;
      UiPathSegment _path_4 = assignment.getPath();
      final JvmType pathType = _path_4.getTypeofSecondLastSegment();
      boolean _and = false;
      boolean _equals = Objects.equal(info.typeForBinding, null);
      if (!_equals) {
        _and = false;
      } else {
        boolean _notEquals_3 = (!Objects.equal(pathType, null));
        _and = _notEquals_3;
      }
      if (_and) {
        info.typeForBinding = pathType;
      }
    }
  }
  
  protected void _collectBindingInfo(final UiBeanSlot slot, final UiModelDerivedStateComputerx.BindingInfo info) {
    info.bindingRoot = slot;
    JvmTypeReference _jvmType = slot.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    info.typeForBinding = _type;
  }
  
  protected void _collectBindingInfo(final UiBindingEndpointAlias alias, final UiModelDerivedStateComputerx.BindingInfo info) {
    UiBindingExpression _endpoint = alias.getEndpoint();
    this.collectBindingInfo(_endpoint, info);
  }
  
  protected void _collectBindingInfo(final UiTypedBindableDef definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    JvmType _type = this.typeOfBoundPropertyProvider.getType(definition);
    info.typeForBinding = _type;
    UiRawBindable _rawBindableOfLastSegment = definition.getRawBindableOfLastSegment();
    info.bindingRoot = _rawBindableOfLastSegment;
    final UxEndpointDef bindingMethod = definition.getMethod();
    boolean _notEquals = (!Objects.equal(bindingMethod, null));
    if (_notEquals) {
      String _targetName = bindingMethod.getTargetName();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_targetName);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _targetName_1 = bindingMethod.getTargetName();
        info.appendPath(_targetName_1);
      } else {
        String _name = bindingMethod.getName();
        info.appendPath(_name);
      }
    }
  }
  
  protected void _collectBindingInfo(final UiCommandBindableDef definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    JvmType _type = this.typeOfBoundPropertyProvider.getType(definition);
    info.typeForBinding = _type;
    UiCommand _command = definition.getCommand();
    info.bindingRoot = _command;
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
  
  public Object loadClass(final ResourceSet resourceSet, final String qualifiedName) {
    throw new Error("Unresolved compilation problems:"
      + "\nfindTypeByName cannot be resolved");
  }
  
  protected void _map(final UiPathSegment object) {
  }
  
  protected void _map(final UiBeanSlot object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYView cannot be resolved to a type."
      + "\nYView cannot be resolved to a type."
      + "\nYViewSet cannot be resolved to a type."
      + "\nYViewSet cannot be resolved to a type."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\ncreateBeanSlot cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalueTypeQualifiedName cannot be resolved"
      + "\nvalueType cannot be resolved"
      + "\nvalueTypeQualifiedName cannot be resolved"
      + "\nbeanSlots cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nbeanSlots cannot be resolved"
      + "\n+= cannot be resolved");
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
  
  public void map(final EObject object) {
    if (object instanceof UiButton) {
      _map((UiButton)object);
      return;
    } else if (object instanceof UiComboBox) {
      _map((UiComboBox)object);
      return;
    } else if (object instanceof UiHorizontalButtonGroup) {
      _map((UiHorizontalButtonGroup)object);
      return;
    } else if (object instanceof UiHorizontalLayout) {
      _map((UiHorizontalLayout)object);
      return;
    } else if (object instanceof UiImage) {
      _map((UiImage)object);
      return;
    } else if (object instanceof UiMobileNavigationButton) {
      _map((UiMobileNavigationButton)object);
      return;
    } else if (object instanceof UiMobileNavigationPage) {
      _map((UiMobileNavigationPage)object);
      return;
    } else if (object instanceof UiOptionsGroup) {
      _map((UiOptionsGroup)object);
      return;
    } else if (object instanceof UiSearchField) {
      _map((UiSearchField)object);
      return;
    } else if (object instanceof UiTable) {
      _map((UiTable)object);
      return;
    } else if (object instanceof UiVerticalComponentGroup) {
      _map((UiVerticalComponentGroup)object);
      return;
    } else if (object instanceof UiVerticalLayout) {
      _map((UiVerticalLayout)object);
      return;
    } else if (object instanceof UiColumn) {
      _map((UiColumn)object);
      return;
    } else if (object instanceof UiFormLayout) {
      _map((UiFormLayout)object);
      return;
    } else if (object instanceof UiGridLayout) {
      _map((UiGridLayout)object);
      return;
    } else if (object instanceof UiIDEView) {
      _map((UiIDEView)object);
      return;
    } else if (object instanceof UiList) {
      _map((UiList)object);
      return;
    } else if (object instanceof UiMobileTabAssignment) {
      _map((UiMobileTabAssignment)object);
      return;
    } else if (object instanceof UiMobileTabSheet) {
      _map((UiMobileTabSheet)object);
      return;
    } else if (object instanceof UiMobileView) {
      _map((UiMobileView)object);
      return;
    } else if (object instanceof UiPanel) {
      _map((UiPanel)object);
      return;
    } else if (object instanceof UiSearchPanel) {
      _map((UiSearchPanel)object);
      return;
    } else if (object instanceof UiSplitpanel) {
      _map((UiSplitpanel)object);
      return;
    } else if (object instanceof UiDialog) {
      _map((UiDialog)object);
      return;
    } else if (object instanceof UiMaxLengthValidator) {
      _map((UiMaxLengthValidator)object);
      return;
    } else if (object instanceof UiMinLengthValidator) {
      _map((UiMinLengthValidator)object);
      return;
    } else if (object instanceof UiRegexpValidator) {
      _map((UiRegexpValidator)object);
      return;
    } else if (object instanceof UiSearchDialog) {
      _map((UiSearchDialog)object);
      return;
    } else if (object instanceof UiTabSheet) {
      _map((UiTabSheet)object);
      return;
    } else if (object instanceof UiView) {
      _map((UiView)object);
      return;
    } else if (object instanceof UiXbaseValidator) {
      _map((UiXbaseValidator)object);
      return;
    } else if (object instanceof UiBeanSlot) {
      _map((UiBeanSlot)object);
      return;
    } else if (object instanceof UiBindingEndpointAlias) {
      _map((UiBindingEndpointAlias)object);
      return;
    } else if (object instanceof UiBindingEndpointAssignment) {
      _map((UiBindingEndpointAssignment)object);
      return;
    } else if (object instanceof UiDialogAssignment) {
      _map((UiDialogAssignment)object);
      return;
    } else if (object instanceof UiDialogSearchFieldAssignment) {
      _map((UiDialogSearchFieldAssignment)object);
      return;
    } else if (object instanceof UiFormLayoutAssigment) {
      _map((UiFormLayoutAssigment)object);
      return;
    } else if (object instanceof UiGridLayoutAssigment) {
      _map((UiGridLayoutAssigment)object);
      return;
    } else if (object instanceof UiHorizontalButtonGroupAssigment) {
      _map((UiHorizontalButtonGroupAssigment)object);
      return;
    } else if (object instanceof UiHorizontalLayoutAssigment) {
      _map((UiHorizontalLayoutAssigment)object);
      return;
    } else if (object instanceof UiMobileNavigationPageAssignment) {
      _map((UiMobileNavigationPageAssignment)object);
      return;
    } else if (object instanceof UiSplitpanelAssigment) {
      _map((UiSplitpanelAssigment)object);
      return;
    } else if (object instanceof UiTabAssignment) {
      _map((UiTabAssignment)object);
      return;
    } else if (object instanceof UiValidatorAlias) {
      _map((UiValidatorAlias)object);
      return;
    } else if (object instanceof UiVerticalComponentGroupAssigment) {
      _map((UiVerticalComponentGroupAssigment)object);
      return;
    } else if (object instanceof UiVerticalLayoutAssigment) {
      _map((UiVerticalLayoutAssigment)object);
      return;
    } else if (object instanceof UiExposedAction) {
      _map((UiExposedAction)object);
      return;
    } else if (object instanceof UiModel) {
      _map((UiModel)object);
      return;
    } else if (object instanceof UiValidatorAssignment) {
      _map((UiValidatorAssignment)object);
      return;
    } else if (object instanceof UiValidatorDef) {
      _map((UiValidatorDef)object);
      return;
    } else if (object instanceof UiVisibilityProcessor) {
      _map((UiVisibilityProcessor)object);
      return;
    } else if (object instanceof UiBinding) {
      _map((UiBinding)object);
      return;
    } else if (object instanceof UiPathSegment) {
      _map((UiPathSegment)object);
      return;
    } else if (object instanceof UiPoint) {
      _map((UiPoint)object);
      return;
    } else if (object instanceof UiVisibilityProcessorAssignment) {
      _map((UiVisibilityProcessorAssignment)object);
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
  
  public YEmbeddable create(final UiEmbeddable object) {
    if (object instanceof UiBeanReferenceField) {
      return _create((UiBeanReferenceField)object);
    } else if (object instanceof UiBrowser) {
      return _create((UiBrowser)object);
    } else if (object instanceof UiButton) {
      return _create((UiButton)object);
    } else if (object instanceof UiComboBox) {
      return _create((UiComboBox)object);
    } else if (object instanceof UiDateField) {
      return _create((UiDateField)object);
    } else if (object instanceof UiDecimalField) {
      return _create((UiDecimalField)object);
    } else if (object instanceof UiHorizontalButtonGroup) {
      return _create((UiHorizontalButtonGroup)object);
    } else if (object instanceof UiHorizontalLayout) {
      return _create((UiHorizontalLayout)object);
    } else if (object instanceof UiImage) {
      return _create((UiImage)object);
    } else if (object instanceof UiLabel) {
      return _create((UiLabel)object);
    } else if (object instanceof UiMobileNavigationButton) {
      return _create((UiMobileNavigationButton)object);
    } else if (object instanceof UiMobileNavigationPage) {
      return _create((UiMobileNavigationPage)object);
    } else if (object instanceof UiNumericField) {
      return _create((UiNumericField)object);
    } else if (object instanceof UiOptionsGroup) {
      return _create((UiOptionsGroup)object);
    } else if (object instanceof UiProgressBar) {
      return _create((UiProgressBar)object);
    } else if (object instanceof UiSearchField) {
      return _create((UiSearchField)object);
    } else if (object instanceof UiSwitch) {
      return _create((UiSwitch)object);
    } else if (object instanceof UiTable) {
      return _create((UiTable)object);
    } else if (object instanceof UiTextArea) {
      return _create((UiTextArea)object);
    } else if (object instanceof UiTextField) {
      return _create((UiTextField)object);
    } else if (object instanceof UiVerticalComponentGroup) {
      return _create((UiVerticalComponentGroup)object);
    } else if (object instanceof UiVerticalLayout) {
      return _create((UiVerticalLayout)object);
    } else if (object instanceof UiCheckBox) {
      return _create((UiCheckBox)object);
    } else if (object instanceof UiFormLayout) {
      return _create((UiFormLayout)object);
    } else if (object instanceof UiGridLayout) {
      return _create((UiGridLayout)object);
    } else if (object instanceof UiList) {
      return _create((UiList)object);
    } else if (object instanceof UiMobileTabSheet) {
      return _create((UiMobileTabSheet)object);
    } else if (object instanceof UiPanel) {
      return _create((UiPanel)object);
    } else if (object instanceof UiSearchPanel) {
      return _create((UiSearchPanel)object);
    } else if (object instanceof UiSplitpanel) {
      return _create((UiSplitpanel)object);
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
