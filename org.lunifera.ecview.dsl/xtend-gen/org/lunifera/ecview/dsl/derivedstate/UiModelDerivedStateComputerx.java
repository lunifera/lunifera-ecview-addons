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
import org.lunifera.ecview.dsl.derivedstate.AutowireHelper;
import org.lunifera.ecview.dsl.derivedstate.UiGrammarElementAdapter;
import org.lunifera.ecview.dsl.extensions.BindableTypeProvider;
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider;
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
import org.lunifera.ecview.semantic.uimodel.UiExposedAction;
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
  
  public /* YView */Object getCurrentView() {
    return this.currentView;
  }
  
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateTypeLoader cannot be resolved"
      + "\ndispose cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nYView cannot be resolved to a type."
      + "\ncreateView cannot be resolved"
      + "\ncontentAlignment cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontent cannot be resolved");
  }
  
  public void doAutowire(final UiLayout embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field YDeviceType is undefined for the type UiModelDerivedStateComputerx"
      + "\ndeviceType cannot be resolved"
      + "\n== cannot be resolved"
      + "\nMOBILE cannot be resolved");
  }
  
  protected void _map(final UiMobileView object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYView cannot be resolved to a type."
      + "\nThe method or field YDeviceType is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateView cannot be resolved"
      + "\ndeviceType cannot be resolved"
      + "\nMOBILE cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontent cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nYHorizontalLayout cannot be resolved to a type."
      + "\npush cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\npush cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiList eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\npush cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\npush cannot be resolved");
  }
  
  protected void _map(final UiButton object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYButton cannot be resolved to a type.");
  }
  
  protected void _map(final UiMobileNavigationButton object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationButton cannot be resolved to a type."
      + "\npush cannot be resolved");
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
    throw new Error("Unresolved compilation problems:"
      + "\nYExposedAction cannot be resolved to a type."
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYExposedAction cannot be resolved"
      + "\nid cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nicon cannot be resolved"
      + "\nexposedActions cannot be resolved"
      + "\n+= cannot be resolved");
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
  
  protected /* YEmbeddable */Object _create(final UiTextField object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTextField cannot be resolved to a type."
      + "\ncreateTextField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\ncreateTextDatatype cannot be resolved"
      + "\ndatatype cannot be resolved"
      + "\norphanDatatypes cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nmaxLength cannot be resolved"
      + "\nminLength cannot be resolved"
      + "\nregExpression cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiBeanReferenceField object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYBeanReferenceField cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYBeanReferenceField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncaptionPropertyPath cannot be resolved"
      + "\ncaptionPropertyPath cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimagePropertyPath cannot be resolved"
      + "\ninMemoryBeanProviderQualifiedName cannot be resolved"
      + "\ninMemoryBeanProvider cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiLabel object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYLabel cannot be resolved to a type."
      + "\ncreateLabel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiDecimalField object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDecimalField cannot be resolved to a type."
      + "\ncreateDecimalField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\ncreateDecimalDatatype cannot be resolved"
      + "\ndatatype cannot be resolved"
      + "\norphanDatatypes cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ngrouping cannot be resolved"
      + "\nmarkNegative cannot be resolved"
      + "\nprecision cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiTextArea object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTextArea cannot be resolved to a type."
      + "\ncreateTextArea cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiOptionsGroup object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYEnumOptionsGroup cannot be resolved to a type."
      + "\nYOptionsGroup cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYEnumOptionsGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreateOptionsGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimageProperty cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiList object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYEnumList cannot be resolved to a type."
      + "\nYList cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYEnumList cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreateList cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimageProperty cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiDateField object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDateTime cannot be resolved to a type."
      + "\ncreateDateTime cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ndateFormat cannot be resolved"
      + "\nresolution cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiBrowser object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYBrowser cannot be resolved to a type."
      + "\ncreateBrowser cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiProgressBar object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYProgressBar cannot be resolved to a type."
      + "\ncreateProgressBar cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiImage object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYImage cannot be resolved to a type."
      + "\ncreateImage cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nvalue cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiTable object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTable cannot be resolved to a type."
      + "\ncreateTable cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nitemImageProperty cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved");
  }
  
  protected /* YField */Object _create(final UiSearchField eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYTextSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYNumericSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYBooleanSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYReferenceSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nid cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  public /* YSelectionType */Object convert(final UiSelectionType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field YSelectionType is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YSelectionType is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YSelectionType is undefined for the type UiModelDerivedStateComputerx"
      + "\nSINGLE cannot be resolved"
      + "\nSINGLE cannot be resolved"
      + "\nMULTI cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiNumericField object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYNumericField cannot be resolved to a type."
      + "\ncreateNumericField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\ncreateNumericDatatype cannot be resolved"
      + "\ndatatype cannot be resolved"
      + "\norphanDatatypes cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ngrouping cannot be resolved"
      + "\nmarkNegative cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiCheckBox object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYCheckBox cannot be resolved to a type."
      + "\ncreateCheckBox cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YButton */Object _create(final UiButton object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYButton cannot be resolved to a type."
      + "\ncreateButton cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved");
  }
  
  protected /* VMNavigationButton */Object _create(final UiMobileNavigationButton object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationButton cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMNavigationButton cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiComboBox object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYEnumComboBox cannot be resolved to a type."
      + "\nYComboBox cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYEnumComboBox cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreateComboBox cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimageProperty cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final UiSwitch object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMSwitch cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMSwitch cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YGridLayout */Object _create(final UiGridLayout object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYGridLayout cannot be resolved to a type."
      + "\ncreateGridLayout cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncolumns cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YFormLayout */Object _create(final UiFormLayout object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYFormLayout cannot be resolved to a type."
      + "\ncreateFormLayout cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YHorizontalLayout */Object _create(final UiHorizontalLayout object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYHorizontalLayout cannot be resolved to a type."
      + "\ncreateHorizontalLayout cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YSearchPanel */Object _create(final UiSearchPanel object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSearchPanel cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYSearchPanel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YSplitPanel */Object _create(final UiSplitpanel object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSplitPanel cannot be resolved to a type."
      + "\ncreateSplitPanel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\nsplitPosition cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YPanel */Object _create(final UiPanel object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYPanel cannot be resolved to a type."
      + "\ncreatePanel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YVerticalLayout */Object _create(final UiVerticalLayout object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVerticalLayout cannot be resolved to a type."
      + "\ncreateVerticalLayout cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* VMHorizontalButtonGroup */Object _create(final UiHorizontalButtonGroup object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMHorizontalButtonGroup cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMHorizontalButtonGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* VMVerticalComponentGroup */Object _create(final UiVerticalComponentGroup object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMVerticalComponentGroup cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMVerticalComponentGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* YTabSheet */Object _create(final UiTabSheet object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTabSheet cannot be resolved to a type."
      + "\ncreateTabSheet cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved");
  }
  
  protected /* VMTabSheet */Object _create(final UiMobileTabSheet object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMTabSheet cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMTabSheet cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nlabelI18nKey cannot be resolved");
  }
  
  public void xxaddToParent(final /* YElement */Object embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\nYLayout cannot be resolved to a type."
      + "\nYLayout cannot be resolved to a type."
      + "\nYLayout cannot be resolved to a type."
      + "\nYEmbeddable cannot be resolved to a type."
      + "\nYView cannot be resolved to a type."
      + "\nYView cannot be resolved to a type."
      + "\nYView cannot be resolved to a type."
      + "\nYEmbeddable cannot be resolved to a type."
      + "\nYTab cannot be resolved to a type."
      + "\nYTab cannot be resolved to a type."
      + "\nYTab cannot be resolved to a type."
      + "\nYEmbeddable cannot be resolved to a type."
      + "\nVMTab cannot be resolved to a type."
      + "\nVMTab cannot be resolved to a type."
      + "\nVMTab cannot be resolved to a type."
      + "\nYEmbeddable cannot be resolved to a type."
      + "\nVMNavigationButton cannot be resolved to a type."
      + "\nVMNavigationButton cannot be resolved to a type."
      + "\nVMNavigationButton cannot be resolved to a type."
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\nVMNavigationCommand cannot be resolved to a type."
      + "\nVMNavigationCommand cannot be resolved to a type."
      + "\nVMNavigationCommand cannot be resolved to a type."
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nYDialog cannot be resolved to a type."
      + "\nYDialog cannot be resolved to a type."
      + "\nYDialog cannot be resolved to a type."
      + "\nYDialog cannot be resolved to a type."
      + "\nYEmbeddable cannot be resolved to a type."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\naddElement cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nembeddable cannot be resolved"
      + "\nembeddable cannot be resolved"
      + "\npage cannot be resolved"
      + "\ntargetPage cannot be resolved"
      + "\ndialog cannot be resolved"
      + "\ncontent cannot be resolved");
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
