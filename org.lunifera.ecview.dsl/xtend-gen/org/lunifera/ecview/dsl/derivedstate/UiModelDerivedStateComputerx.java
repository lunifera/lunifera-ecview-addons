package org.lunifera.ecview.dsl.derivedstate;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
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
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
import org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField;
import org.lunifera.ecview.core.extension.model.extension.YBrowser;
import org.lunifera.ecview.core.extension.model.extension.YButton;
import org.lunifera.ecview.core.extension.model.extension.YCheckBox;
import org.lunifera.ecview.core.extension.model.extension.YColumn;
import org.lunifera.ecview.core.extension.model.extension.YComboBox;
import org.lunifera.ecview.core.extension.model.extension.YDateTime;
import org.lunifera.ecview.core.extension.model.extension.YDecimalField;
import org.lunifera.ecview.core.extension.model.extension.YFormLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayout;
import org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout;
import org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle;
import org.lunifera.ecview.core.extension.model.extension.YImage;
import org.lunifera.ecview.core.extension.model.extension.YLabel;
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
import org.lunifera.ecview.dsl.derivedstate.TypeHelper;
import org.lunifera.ecview.dsl.derivedstate.UiGrammarElementAdapter;
import org.lunifera.ecview.dsl.derivedstate.UiModelUtil;
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider;
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
import org.lunifera.ecview.semantic.uimodel.UiChangeTrigger;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiColumnsAssignment;
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
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiOpenDialogCommand;
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
import org.lunifera.ecview.semantic.uimodel.UiSearchWithDialogCommand;
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
import org.lunifera.xtext.builder.types.loader.api.ITypeLoader;
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderFactory;
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
  private ITypeLoaderFactory typeLoaderFactory;
  
  private ITypeLoader typeLoader;
  
  @Inject
  private BindableTypeProvider typeOfBoundPropertyProvider;
  
  @Inject
  private TypeHelper typeHelper;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private I18nKeyProvider i18nKeyProvider;
  
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
  
  private List<UiVisibilityProcessorAssignment> pendingVisibilityProcessors = CollectionLiterals.<UiVisibilityProcessorAssignment>newArrayList();
  
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = object.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    final Procedure1<UiVisibilityProcessorAssignment> _function_3 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiVisibilityProcessor _processor = it.getProcessor();
        UiModelDerivedStateComputerx.this.map(_processor);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(this.pendingVisibilityProcessors, _function_3);
    ArrayList<UiBinding> _newArrayList = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
    this.temporaryPendingBindings = _newArrayList;
    this.pendingBindings.clear();
    final Procedure1<UiBinding> _function_4 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.install(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(this.temporaryPendingBindings, _function_4);
    boolean _isEmpty = this.pendingBindings.isEmpty();
    if (_isEmpty) {
      EList<UiValidatorAssignment> _validatorAssignments = object.getValidatorAssignments();
      final Procedure1<UiValidatorAssignment> _function_5 = new Procedure1<UiValidatorAssignment>() {
        public void apply(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments, _function_5);
      this.<Object>pop();
      this.currentView = null;
    } else {
      ArrayList<UiBinding> _newArrayList_1 = CollectionLiterals.<UiBinding>newArrayList(((UiBinding[])Conversions.unwrapArray(this.pendingBindings, UiBinding.class)));
      this.temporaryPendingBindings = _newArrayList_1;
      this.pendingBindings.clear();
      final Procedure1<UiBinding> _function_6 = new Procedure1<UiBinding>() {
        public void apply(final UiBinding it) {
          UiModelDerivedStateComputerx.this.install(it);
        }
      };
      IterableExtensions.<UiBinding>forEach(this.temporaryPendingBindings, _function_6);
      EList<UiValidatorAssignment> _validatorAssignments_1 = object.getValidatorAssignments();
      final Procedure1<UiValidatorAssignment> _function_7 = new Procedure1<UiValidatorAssignment>() {
        public void apply(final UiValidatorAssignment it) {
          UiModelDerivedStateComputerx.this.map(it);
        }
      };
      IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments_1, _function_7);
      this.<Object>pop();
      this.currentView = null;
    }
  }
  
  protected void _map(final UiMobileView object) {
    final YView yView = this.factory.createView();
    this.associateUi(object, yView);
    yView.setDeviceType(YDeviceType.MOBILE);
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
    object.getContent();
    EList<UiBinding> _bindings = object.getBindings();
    final Procedure1<UiBinding> _function_1 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(_bindings, _function_1);
    EList<UiVisibilityProcessorAssignment> _processorAssignments = object.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    final Procedure1<UiVisibilityProcessorAssignment> _function_3 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiVisibilityProcessor _processor = it.getProcessor();
        UiModelDerivedStateComputerx.this.map(_processor);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(this.pendingVisibilityProcessors, _function_3);
    final Procedure1<UiBinding> _function_4 = new Procedure1<UiBinding>() {
      public void apply(final UiBinding it) {
        UiModelDerivedStateComputerx.this.install(it);
      }
    };
    IterableExtensions.<UiBinding>forEach(this.pendingBindings, _function_4);
    EList<UiValidatorAssignment> _validatorAssignments = object.getValidatorAssignments();
    final Procedure1<UiValidatorAssignment> _function_5 = new Procedure1<UiValidatorAssignment>() {
      public void apply(final UiValidatorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiValidatorAssignment>forEach(_validatorAssignments, _function_5);
    this.<Object>pop();
    this.currentView = null;
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiGridLayoutAssigment eObject) {
    final YGridLayout layout = this.<YGridLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    UiAlignment _alignment = eObject.getAlignment();
    boolean _notEquals = (!Objects.equal(_alignment, UiAlignment.UNDEFINED));
    if (_notEquals) {
      final YGridLayoutCellStyle style = layout.addGridLayoutCellStyle(newField);
      UiAlignment _alignment_1 = eObject.getAlignment();
      YAlignment _yAlignment = this.toYAlignment(_alignment_1);
      style.setAlignment(_yAlignment);
    }
    this.map(element);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiVerticalLayoutAssigment eObject) {
    final YVerticalLayout layout = this.<YVerticalLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    UiAlignment _alignment = eObject.getAlignment();
    boolean _notEquals = (!Objects.equal(_alignment, UiAlignment.UNDEFINED));
    if (_notEquals) {
      final YVerticalLayoutCellStyle style = layout.addCellStyle(newField);
      UiAlignment _alignment_1 = eObject.getAlignment();
      YAlignment _yAlignment = this.toYAlignment(_alignment_1);
      style.setAlignment(_yAlignment);
    }
    this.map(element);
    if ((element instanceof UiField)) {
      boolean _notEquals_1 = (!Objects.equal(newField, null));
      if (_notEquals_1) {
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
    final YHorizontalLayout layout = this.<YHorizontalLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    UiAlignment _alignment = eObject.getAlignment();
    boolean _notEquals = (!Objects.equal(_alignment, UiAlignment.UNDEFINED));
    if (_notEquals) {
      final YHorizontalLayoutCellStyle style = layout.addCellStyle(newField);
      UiAlignment _alignment_1 = eObject.getAlignment();
      YAlignment _yAlignment = this.toYAlignment(_alignment_1);
      style.setAlignment(_yAlignment);
    }
    this.map(element);
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
  
  protected void _map(final UiSearchPanel eObject) {
    final YSearchPanel yPanel = this.<YSearchPanel>associatedUi(eObject);
    this.push(yPanel);
    EList<UiSearchField> _contents = eObject.getContents();
    final Procedure1<UiSearchField> _function = new Procedure1<UiSearchField>() {
      public void apply(final UiSearchField it) {
        final YEmbeddable newField = UiModelDerivedStateComputerx.this.create(it);
        boolean _equals = Objects.equal(newField, null);
        if (_equals) {
          return;
        }
        yPanel.addElement(newField);
        UiModelDerivedStateComputerx.this.map(it);
        UiModelDerivedStateComputerx.this.push(newField);
        final UiField yField = ((UiField) it);
        EList<UiValidator> _validators = yField.getValidators();
        final Procedure1<UiValidator> _function = new Procedure1<UiValidator>() {
          public void apply(final UiValidator it) {
            UiModelDerivedStateComputerx.this.map(it);
          }
        };
        IterableExtensions.<UiValidator>forEach(_validators, _function);
        UiModelDerivedStateComputerx.this.<Object>pop();
      }
    };
    IterableExtensions.<UiSearchField>forEach(_contents, _function);
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
  
  protected void _map(final UiSplitpanel eObject) {
    final YSplitPanel yField = this.<YSplitPanel>associatedUi(eObject);
    this.push(yField);
    UiSplitpanelAssigment _firstContent = eObject.getFirstContent();
    this.map(_firstContent);
    UiSplitpanelAssigment _secondContent = eObject.getSecondContent();
    this.map(_secondContent);
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function);
    this.<Object>pop();
  }
  
  protected void _map(final UiSplitpanelAssigment eObject) {
    final YSplitPanel layout = this.<YSplitPanel>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    boolean _equals = Objects.equal(newField, null);
    if (_equals) {
      return;
    }
    layout.addElement(newField);
    this.map(element);
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
  
  protected void _map(final UiPanel eObject) {
    final YPanel yPanel = this.<YPanel>associatedUi(eObject);
    this.push(yPanel);
    final UiEmbeddable element = eObject.getContent();
    final YEmbeddable newField = this.create(element);
    boolean _equals = Objects.equal(newField, null);
    if (_equals) {
      return;
    }
    EList<YEmbeddable> _elements = yPanel.getElements();
    _elements.add(newField);
    this.map(element);
    if ((element instanceof UiField)) {
      boolean _notEquals = (!Objects.equal(newField, null));
      if (_notEquals) {
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments_1 = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_3 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments_1, _function_3);
    this.<Object>pop();
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
    final YTabSheet layout = this.<YTabSheet>peek();
    final YTab tab = this.factory.createTab();
    String _name = eObject.getName();
    tab.setLabel(_name);
    String _i18nKey = this.toI18nKey(eObject);
    tab.setLabelI18nKey(_i18nKey);
    EList<YTab> _tabs = layout.getTabs();
    _tabs.add(tab);
    this.push(tab);
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    tab.setEmbeddable(newField);
    this.map(element);
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
    this.<Object>pop();
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
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
    final YEmbeddable newField = this.create(element);
    tab.setEmbeddable(newField);
    this.map(element);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_1 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_1);
    this.<Object>pop();
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
    final VMHorizontalButtonGroup layout = this.<VMHorizontalButtonGroup>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    this.map(element);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiVerticalComponentGroupAssigment eObject) {
    final VMVerticalComponentGroup layout = this.<VMVerticalComponentGroup>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    this.map(element);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_1 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_1);
    EList<UiVisibilityProcessorAssignment> _processorAssignments_1 = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments_1, _function_2);
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
    final YOpenDialogCommand command = this.<YOpenDialogCommand>peek();
    boolean _notEquals = (!Objects.equal(command, null));
    if (_notEquals) {
      command.setDialog(dialog);
    }
    JvmTypeReference _jvmType = eObject.getJvmType();
    boolean _notEquals_1 = (!Objects.equal(_jvmType, null));
    if (_notEquals_1) {
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
    boolean _notEquals_2 = (!Objects.equal(_bindings_1, null));
    if (_notEquals_2) {
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
    final YDialog yDialog = this.<YDialog>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    yDialog.setContent(newField);
    this.map(element);
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
  
  protected void _map(final UiSearchField eObject) {
  }
  
  protected void _map(final UiDialogSearchFieldAssignment eObject) {
    final YLayout layout = this.<YLayout>peek();
    final UiSearchField element = eObject.getElement();
    final UiNestedProperty property = element.getProperty();
    boolean _notEquals = (!Objects.equal(property, null));
    if (_notEquals) {
      final JvmType type = property.getTypeofLastSegment();
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
    this.<Object>pop();
  }
  
  protected void _map(final UiMobileNavigationPageAssignment eObject) {
    final VMNavigationPage layout = this.<VMNavigationPage>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    layout.addElement(newField);
    this.map(element);
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
    final YFormLayout layout = this.<YFormLayout>peek();
    final UiEmbeddable element = eObject.getElement();
    final YEmbeddable newField = this.create(element);
    boolean _equals = Objects.equal(newField, null);
    if (_equals) {
      return;
    }
    layout.addElement(newField);
    this.map(element);
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
    EList<UiVisibilityProcessorAssignment> _processorAssignments = eObject.getProcessorAssignments();
    final Procedure1<UiVisibilityProcessorAssignment> _function_2 = new Procedure1<UiVisibilityProcessorAssignment>() {
      public void apply(final UiVisibilityProcessorAssignment it) {
        UiModelDerivedStateComputerx.this.map(it);
      }
    };
    IterableExtensions.<UiVisibilityProcessorAssignment>forEach(_processorAssignments, _function_2);
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
    final YButton yField = this.<YButton>associatedUi(object);
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
    final UiNestedProperty property = eObject.getProperty();
    boolean _notEquals = (!Objects.equal(property, null));
    if (_notEquals) {
      String _pathString = property.toPathString();
      yColumn.setPropertyPath(_pathString);
    }
    boolean _isOrderable = eObject.isOrderable();
    yColumn.setOrderable(_isOrderable);
    boolean _isVisible = eObject.isVisible();
    yColumn.setVisible(_isVisible);
    String _i18nKey = this.toI18nKey(eObject);
    yColumn.setLabelI18nKey(_i18nKey);
    EList<YColumn> _columns = yField.getColumns();
    _columns.add(yColumn);
  }
  
  public YDateTimeFormat toYDateTimeFormat(final UiDateFormat format) {
    if (format != null) {
      switch (format) {
        case DATE:
          return YDateTimeFormat.DATE;
        case DATE_TIME:
          return YDateTimeFormat.DATE_TIME;
        case TIME:
          return YDateTimeFormat.TIME;
        default:
          break;
      }
    }
    return null;
  }
  
  public YDateTimeResolution toYDateTimeResolution(final UiDateTimeResolution value) {
    if (value != null) {
      switch (value) {
        case SECOND:
          return YDateTimeResolution.SECOND;
        case MINUTE:
          return YDateTimeResolution.MINUTE;
        case HOUR:
          return YDateTimeResolution.HOUR;
        case DAY:
          return YDateTimeResolution.DAY;
        case MONTH:
          return YDateTimeResolution.MONTH;
        case YEAR:
          return YDateTimeResolution.YEAR;
        case UNDEFINED:
          return YDateTimeResolution.UNDEFINED;
        default:
          break;
      }
    }
    return null;
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
  
  public YAlignment toYAlignment(final UiAlignment uiAlign) {
    if (uiAlign != null) {
      switch (uiAlign) {
        case BOTTOM_CENTER:
          return YAlignment.BOTTOM_CENTER;
        case BOTTOM_FILL:
          return YAlignment.BOTTOM_FILL;
        case BOTTOM_LEFT:
          return YAlignment.BOTTOM_LEFT;
        case BOTTOM_RIGHT:
          return YAlignment.BOTTOM_RIGHT;
        case FILL_CENTER:
          return YAlignment.FILL_CENTER;
        case FILL_FILL:
          return YAlignment.FILL_FILL;
        case FILL_LEFT:
          return YAlignment.FILL_LEFT;
        case FILL_RIGHT:
          return YAlignment.FILL_RIGHT;
        case MIDDLE_CENTER:
          return YAlignment.MIDDLE_CENTER;
        case MIDDLE_FILL:
          return YAlignment.MIDDLE_FILL;
        case MIDDLE_LEFT:
          return YAlignment.MIDDLE_LEFT;
        case MIDDLE_RIGHT:
          return YAlignment.MIDDLE_RIGHT;
        case TOP_CENTER:
          return YAlignment.TOP_CENTER;
        case TOP_FILL:
          return YAlignment.TOP_FILL;
        case TOP_LEFT:
          return YAlignment.TOP_LEFT;
        case TOP_RIGHT:
          return YAlignment.TOP_RIGHT;
        case UNDEFINED:
          return YAlignment.UNDEFINED;
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
  
  protected void _map(final UiVisibilityProcessorAssignment eObject) {
    this.pendingVisibilityProcessors.add(eObject);
  }
  
  protected void _map(final UiVisibilityProcessor eObject) {
    final YVisibilityProcessor yProcessor = VisibilityFactory.eINSTANCE.createYVisibilityProcessor();
    Resource _eResource = eObject.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(eObject);
    String _string = _fullyQualifiedName.toString();
    Class<?> _loadClass = this.loadClass(_resourceSet, _string);
    yProcessor.setDelegate(_loadClass);
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(eObject);
    String _string_1 = _fullyQualifiedName_1.toString();
    yProcessor.setDelegateQualifiedName(_string_1);
    EList<YVisibilityProcessor> _visibilityProcessors = this.currentView.getVisibilityProcessors();
    _visibilityProcessors.add(yProcessor);
    EList<UiChangeTrigger> _changeTriggers = eObject.getChangeTriggers();
    for (final UiChangeTrigger trigger : _changeTriggers) {
      {
        UiBindingExpression _endpoint = trigger.getEndpoint();
        final YValueBindingEndpoint sourceEP = this.createValueBindingEndpoint(((UiBindingEndpointAssignment) _endpoint));
        final YVisibilityProcessorValueBindingEndpoint targetEP = BindingFactory.eINSTANCE.createYVisibilityProcessorValueBindingEndpoint();
        String _alias = trigger.getAlias();
        targetEP.setProperty(_alias);
        final YValueBinding binding = BindingFactory.eINSTANCE.createYValueBinding();
        binding.setTargetEndpoint(targetEP);
        binding.setModelEndpoint(sourceEP);
        binding.setModelToTargetStrategy(YBindingUpdateStrategy.UPDATE);
        binding.setTargetToModelStrategy(YBindingUpdateStrategy.NEVER);
        EList<YBinding> _triggersOn = yProcessor.getTriggersOn();
        _triggersOn.add(binding);
      }
    }
    EList<UiBindingEndpointAlias> _dataUsed = eObject.getDataUsed();
    for (final UiBindingEndpointAlias dataUsed : _dataUsed) {
      {
        UiBindingExpression _endpoint = dataUsed.getEndpoint();
        final YValueBindingEndpoint sourceEP = this.createValueBindingEndpoint(((UiBindingEndpointAssignment) _endpoint));
        final YVisibilityProcessorValueBindingEndpoint targetEP = BindingFactory.eINSTANCE.createYVisibilityProcessorValueBindingEndpoint();
        String _alias = dataUsed.getAlias();
        targetEP.setProperty(_alias);
        final YValueBinding binding = BindingFactory.eINSTANCE.createYValueBinding();
        binding.setTargetEndpoint(targetEP);
        binding.setModelEndpoint(sourceEP);
        binding.setModelToTargetStrategy(YBindingUpdateStrategy.UPDATE);
        binding.setTargetToModelStrategy(YBindingUpdateStrategy.NEVER);
        EList<YBinding> _dataUsed_1 = yProcessor.getDataUsed();
        _dataUsed_1.add(binding);
      }
    }
  }
  
  protected void _map(final UiMaxLengthValidator eObject) {
    final YMaxLengthValidator newValidator = this.factory.createMaxLengthValidator();
    int _maxLength = eObject.getMaxLength();
    newValidator.setMaxLength(_maxLength);
    UiErrorCode _errorCode = eObject.getErrorCode();
    QualifiedName _fullyQualifiedName = null;
    if (_errorCode!=null) {
      _fullyQualifiedName=this._iQualifiedNameProvider.getFullyQualifiedName(_errorCode);
    }
    String _string = null;
    if (_fullyQualifiedName!=null) {
      _string=_fullyQualifiedName.toString();
    }
    newValidator.setErrorCode(_string);
    UiErrorCode _errorCode_1 = eObject.getErrorCode();
    String _defaultMessage = null;
    if (_errorCode_1!=null) {
      _defaultMessage=_errorCode_1.getDefaultMessage();
    }
    newValidator.setDefaultErrorMessage(_defaultMessage);
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
    UiErrorCode _errorCode = eObject.getErrorCode();
    QualifiedName _fullyQualifiedName = null;
    if (_errorCode!=null) {
      _fullyQualifiedName=this._iQualifiedNameProvider.getFullyQualifiedName(_errorCode);
    }
    String _string = null;
    if (_fullyQualifiedName!=null) {
      _string=_fullyQualifiedName.toString();
    }
    newValidator.setErrorCode(_string);
    UiErrorCode _errorCode_1 = eObject.getErrorCode();
    String _defaultMessage = null;
    if (_errorCode_1!=null) {
      _defaultMessage=_errorCode_1.getDefaultMessage();
    }
    newValidator.setDefaultErrorMessage(_defaultMessage);
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
    UiErrorCode _errorCode = eObject.getErrorCode();
    QualifiedName _fullyQualifiedName = null;
    if (_errorCode!=null) {
      _fullyQualifiedName=this._iQualifiedNameProvider.getFullyQualifiedName(_errorCode);
    }
    String _string = null;
    if (_fullyQualifiedName!=null) {
      _string=_fullyQualifiedName.toString();
    }
    newValidator.setErrorCode(_string);
    UiErrorCode _errorCode_1 = eObject.getErrorCode();
    String _defaultMessage = null;
    if (_errorCode_1!=null) {
      _defaultMessage=_errorCode_1.getDefaultMessage();
    }
    newValidator.setDefaultErrorMessage(_defaultMessage);
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
    String _pathId = UiModelUtil.getPathId(object);
    textField.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    label.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    decimalField.setId(_pathId);
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
    boolean _isNoGrouping = object.isNoGrouping();
    boolean _not = (!_isNoGrouping);
    dt.setGrouping(_not);
    boolean _isNoMarkNegative = object.isNoMarkNegative();
    boolean _not_1 = (!_isNoMarkNegative);
    dt.setMarkNegative(_not_1);
    int _precision = object.getPrecision();
    dt.setPrecision(_precision);
    this.associateUi(object, decimalField);
    return decimalField;
  }
  
  protected YEmbeddable _create(final UiTextArea object) {
    final YTextArea textArea = this.factory.createTextArea();
    String _pathId = UiModelUtil.getPathId(object);
    textArea.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
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
    String _pathId = UiModelUtil.getPathId(object);
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
    this.associateUi(object, dateTime);
    return dateTime;
  }
  
  protected YEmbeddable _create(final UiBrowser object) {
    final YBrowser browser = this.factory.createBrowser();
    String _pathId = UiModelUtil.getPathId(object);
    browser.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    progressBar.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    image.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    table.setId(_pathId);
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
        String _pathId = UiModelUtil.getPathId(eObject);
        newField.setId(_pathId);
        String _i18nKey = this.toI18nKey(eObject);
        newField.setLabelI18nKey(_i18nKey);
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
    String _pathId = UiModelUtil.getPathId(object);
    field.setId(_pathId);
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
    boolean _isNoGrouping = object.isNoGrouping();
    boolean _not = (!_isNoGrouping);
    dt.setGrouping(_not);
    boolean _isNoMarkNegative = object.isNoMarkNegative();
    boolean _not_1 = (!_isNoMarkNegative);
    dt.setMarkNegative(_not_1);
    this.associateUi(object, field);
    return field;
  }
  
  protected YEmbeddable _create(final UiCheckBox object) {
    final YCheckBox field = this.factory.createCheckBox();
    String _pathId = UiModelUtil.getPathId(object);
    field.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    field.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    field.setId(_pathId);
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
    String _pathId = UiModelUtil.getPathId(object);
    field.setId(_pathId);
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
    final VMSwitch field = VaadinMobileFactory.eINSTANCE.createVMSwitch();
    String _pathId = UiModelUtil.getPathId(object);
    field.setId(_pathId);
    String _name = object.getName();
    field.setName(_name);
    String _name_1 = object.getName();
    field.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    field.setLabelI18nKey(_i18nKey);
    this.associateUi(object, field);
    return field;
  }
  
  protected YGridLayout _create(final UiGridLayout object) {
    final YGridLayout layout = this.factory.createGridLayout();
    String _pathId = UiModelUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    int _columns = object.getColumns();
    layout.setColumns(_columns);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
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
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YHorizontalLayout _create(final UiHorizontalLayout object) {
    final YHorizontalLayout layout = this.factory.createHorizontalLayout();
    String _pathId = UiModelUtil.getPathId(object);
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
  
  protected YSearchPanel _create(final UiSearchPanel object) {
    final YSearchPanel layout = ExtensionModelFactory.eINSTANCE.createYSearchPanel();
    String _pathId = UiModelUtil.getPathId(object);
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
  
  protected YSplitPanel _create(final UiSplitpanel object) {
    final YSplitPanel layout = this.factory.createSplitPanel();
    String _pathId = UiModelUtil.getPathId(object);
    layout.setId(_pathId);
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    int _splitPosition = object.getSplitPosition();
    layout.setSplitPosition(_splitPosition);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YPanel _create(final UiPanel object) {
    final YPanel layout = this.factory.createPanel();
    String _name = object.getName();
    layout.setName(_name);
    String _name_1 = object.getName();
    layout.setLabel(_name_1);
    String _i18nKey = this.toI18nKey(object);
    layout.setLabelI18nKey(_i18nKey);
    this.associateUi(object, layout);
    return layout;
  }
  
  protected YVerticalLayout _create(final UiVerticalLayout object) {
    final YVerticalLayout layout = this.factory.createVerticalLayout();
    String _pathId = UiModelUtil.getPathId(object);
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
  
  protected VMHorizontalButtonGroup _create(final UiHorizontalButtonGroup object) {
    final VMHorizontalButtonGroup layout = VaadinMobileFactory.eINSTANCE.createVMHorizontalButtonGroup();
    String _pathId = UiModelUtil.getPathId(object);
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
  
  protected VMVerticalComponentGroup _create(final UiVerticalComponentGroup object) {
    final VMVerticalComponentGroup layout = VaadinMobileFactory.eINSTANCE.createVMVerticalComponentGroup();
    String _pathId = UiModelUtil.getPathId(object);
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
  
  protected YTabSheet _create(final UiTabSheet object) {
    final YTabSheet layout = this.factory.createTabSheet();
    String _pathId = UiModelUtil.getPathId(object);
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
  
  protected VMTabSheet _create(final UiMobileTabSheet object) {
    final VMTabSheet layout = VaadinMobileFactory.eINSTANCE.createVMTabSheet();
    String _pathId = UiModelUtil.getPathId(object);
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
    if ((info.bindingRoot instanceof UiBeanSlot)) {
      final UiBeanSlot uiBeanSlot = ((UiBeanSlot) info.bindingRoot);
      final YBeanSlot yBeanSlot = this.<YBeanSlot>associatedUi(uiBeanSlot);
      final YBeanSlotValueBindingEndpoint ep = this.factory.createBeanSlotValueBindingEndpoint();
      ep.setBeanSlot(yBeanSlot);
      String _string = info.path.toString();
      ep.setAttributePath(_string);
      result = ep;
    } else {
      if ((info.bindingRoot instanceof UiEmbeddable)) {
        final YElement yElement = this.<YElement>associatedUi(info.bindingRoot);
        final YECViewModelValueBindingEndpoint ep_1 = this.factory.createECViewModelValueBindingEndpoint();
        ep_1.setElement(yElement);
        String _string_1 = info.path.toString();
        ep_1.setPropertyPath(_string_1);
        boolean _notEquals = (!Objects.equal(info.typeForBinding, null));
        if (_notEquals) {
          String _qualifiedName = info.typeForBinding.getQualifiedName();
          ep_1.setTypeQualifiedName(_qualifiedName);
          Resource _eResource = epDef.eResource();
          ResourceSet _resourceSet = _eResource.getResourceSet();
          String _typeQualifiedName = ep_1.getTypeQualifiedName();
          Class<?> _loadClass = this.loadClass(_resourceSet, _typeQualifiedName);
          ep_1.setType(_loadClass);
        }
        boolean _and = false;
        Class<?> _type = ep_1.getType();
        boolean _notEquals_1 = (!Objects.equal(_type, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          Class<?> _type_1 = ep_1.getType();
          boolean _isAssignableFrom = _type_1.isAssignableFrom(EObject.class);
          _and = _isAssignableFrom;
        }
        if (_and) {
          EClass _eClass = yElement.eClass();
          EPackage _ePackage = _eClass.getEPackage();
          String _nsURI = _ePackage.getNsURI();
          ep_1.setEmfNsURI(_nsURI);
        }
        result = ep_1;
      } else {
        if ((info.bindingRoot instanceof UiMobileNavigationCommand)) {
          final UiMobileNavigationCommand command = ((UiMobileNavigationCommand) info.bindingRoot);
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
          if ((info.bindingRoot instanceof UiOpenDialogCommand)) {
            final UiOpenDialogCommand command_1 = ((UiOpenDialogCommand) info.bindingRoot);
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
            if ((info.bindingRoot instanceof UiSearchWithDialogCommand)) {
              final UiSearchWithDialogCommand command_2 = ((UiSearchWithDialogCommand) info.bindingRoot);
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
    if ((info.bindingRoot instanceof UiBeanSlot)) {
      final UiBeanSlot uiBeanSlot = ((UiBeanSlot) info.bindingRoot);
      final YBeanSlot yBeanSlot = this.<YBeanSlot>associatedUi(uiBeanSlot);
      final YBeanSlotListBindingEndpoint ep = this.factory.createBeanSlotListBindingEndpoint();
      ep.setBeanSlot(yBeanSlot);
      String _string = info.path.toString();
      ep.setAttributePath(_string);
      result = ep;
    } else {
      if ((info.bindingRoot instanceof UiEmbeddable)) {
        final YEmbeddable yElement = this.<YEmbeddable>associatedUi(info.bindingRoot);
        final YECViewModelListBindingEndpoint ep_1 = this.factory.createECViewModelListBindingEndpoint();
        ep_1.setElement(yElement);
        String _string_1 = info.path.toString();
        ep_1.setPropertyPath(_string_1);
        boolean _notEquals = (!Objects.equal(info.typeForBinding, null));
        if (_notEquals) {
          String _qualifiedName = info.typeForBinding.getQualifiedName();
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
    if (object instanceof UiBrowser) {
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
