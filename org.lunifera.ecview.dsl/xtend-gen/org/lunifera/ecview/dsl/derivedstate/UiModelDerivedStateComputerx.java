/**
 * Copyright (c) 2011 - 2015, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.dsl.derivedstate;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.dsl.derivedstate.AutowireHelper;
import org.lunifera.ecview.dsl.derivedstate.UiGrammarElementAdapter;
import org.lunifera.ecview.dsl.extensions.BindableTypeProvider;
import org.lunifera.ecview.dsl.extensions.I18nKeyProvider;
import org.lunifera.ecview.dsl.extensions.TypeHelper;
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
  
  private List<Runnable> pendingMappings = CollectionLiterals.<Runnable>newArrayList();
  
  private /* List<UiBinding> */Object pendingBindings = CollectionLiterals.<UiBinding>newArrayList();
  
  private /* List<UiBinding> */Object temporaryPendingBindings = CollectionLiterals.<UiBinding>newArrayList();
  
  private /* List<UiVisibilityProcessorAssignment> */Object pendingVisibilityProcessors = CollectionLiterals.<UiVisibilityProcessorAssignment>newArrayList();
  
  private /* List<UiLayout> */Object pendingAutowires = CollectionLiterals.<UiLayout>newArrayList();
  
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
      + "\nUiModel cannot be resolved to a type."
      + "\nUiModel cannot be resolved to a type."
      + "\ncreateTypeLoader cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\neContents cannot be resolved"
      + "\nforEach cannot be resolved"
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
  
  public String toI18nKey(final /* UiNamedElement */Object element) {
    return this.i18nKeyProvider.toI18nKey(element);
  }
  
  public String toI18nKey(final /* UiEmbeddable */Object element) {
    return this.i18nKeyProvider.toI18nKey(element);
  }
  
  protected void _map(final /* UiModel */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiValidatorAlias cannot be resolved to a type."
      + "\npackageName cannot be resolved"
      + "\nroots cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiView */Object object) {
  }
  
  protected void _map(final Void object) {
    InputOutput.<String>println("void");
  }
  
  protected void _map(final /* UiIDEView */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYView cannot be resolved to a type."
      + "\nThe method processor is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateView cannot be resolved"
      + "\nsharedStateGroup cannot be resolved"
      + "\nsharedStateGroup cannot be resolved"
      + "\ncontentAlignment cannot be resolved"
      + "\ncontentAlignment cannot be resolved"
      + "\ntoYAlignment cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nbeanSlots cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nexposedActions cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nvalidatorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  public void doAutowire(final /* UiLayout */Object embeddable) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field YDeviceType is undefined for the type UiModelDerivedStateComputerx"
      + "\ndeviceType cannot be resolved"
      + "\n== cannot be resolved"
      + "\nMOBILE cannot be resolved"
      + "\ntoI18nKey cannot be resolved");
  }
  
  protected void _map(final /* UiMobileView */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYView cannot be resolved to a type."
      + "\nThe method or field YDeviceType is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method processor is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateView cannot be resolved"
      + "\nsharedStateGroup cannot be resolved"
      + "\nsharedStateGroup cannot be resolved"
      + "\ndeviceType cannot be resolved"
      + "\nMOBILE cannot be resolved"
      + "\ncontentAlignment cannot be resolved"
      + "\ncontentAlignment cannot be resolved"
      + "\ntoYAlignment cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nbeanSlots cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nvalidatorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  public void processBindings() {
    boolean _isEmpty = this.pendingBindings.isEmpty();
    if (_isEmpty) {
      return;
    }
    ArrayList<UiBinding> _newArrayList = CollectionLiterals.<UiBinding>newArrayList(this.pendingBindings);
    this.temporaryPendingBindings = _newArrayList;
    this.pendingBindings.clear();
    final Consumer<Object> _function = new Consumer<Object>() {
      public void accept(final Object it) {
        UiModelDerivedStateComputerx.this.install(it);
      }
    };
    this.temporaryPendingBindings.forEach(_function);
    this.processBindings();
  }
  
  public EObject push(final EObject eObject) {
    return this.viewContext.push(eObject);
  }
  
  protected void _map(final /* UiGridLayout */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYGridLayout cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiGridLayoutAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYGridLayout cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nThe method or field UiAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nUNDEFINED cannot be resolved"
      + "\naddGridLayoutCellStyle cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\ntoYAlignment cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiVerticalLayout */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVerticalLayout cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiVerticalLayoutAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVerticalLayout cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nThe method or field UiAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nUNDEFINED cannot be resolved"
      + "\naddCellStyle cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\ntoYAlignment cannot be resolved"
      + "\nmap cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileNavigationRoot */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationRoot cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileNavigationRootAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationRoot cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nmap cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiHorizontalLayout */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYHorizontalLayout cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nautowire cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiHorizontalLayoutAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYHorizontalLayout cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nThe method or field UiAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nUNDEFINED cannot be resolved"
      + "\naddCellStyle cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\ntoYAlignment cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiSearchPanel */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSearchPanel cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\n== cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileSearchPanel */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMSearchPanel cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\n== cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiSplitpanel */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSplitPanel cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nfirstContent cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nsecondContent cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiSplitpanelAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSplitPanel cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\n== cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiPanel */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYPanel cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\n== cannot be resolved"
      + "\nelements cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nmap cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiTabSheet */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTabSheet cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ntabs cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiTabAssignment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTabSheet cannot be resolved to a type."
      + "\nYTab cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\ncreateTab cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ntabs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\npush cannot be resolved"
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nembeddable cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileTabSheet */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMTabSheet cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ntabs cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileTabAssignment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMTabSheet cannot be resolved to a type."
      + "\nVMTab cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMTab cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntabs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\npush cannot be resolved"
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\nembeddable cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiHorizontalButtonGroup */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMHorizontalButtonGroup cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiHorizontalButtonGroupAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMHorizontalButtonGroup cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiVerticalComponentGroup */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMVerticalComponentGroup cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiVerticalComponentGroupAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMVerticalComponentGroup cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileNavigationPage */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\nVMNavigationBarButton cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nbarActions cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbarActions cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiDialog */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDialog cannot be resolved to a type."
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYDialog cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ndialogs cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiSearchDialog */Object eObject) {
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
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ndialog cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nassociateUi cannot be resolved"
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
      + "\npush cannot be resolved"
      + "\nsearchFields cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiDialogAssignment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDialog cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiSearchField */Object eObject) {
  }
  
  protected void _map(final /* UiDialogSearchFieldAssignment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYLayout cannot be resolved to a type."
      + "\nUiNestedProperty cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nelement cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeofLastSegment cannot be resolved"
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
  
  public void createTransient(final /* UiMobileNavigationPage */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileNavigationPageAssignment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nThe method or field UiAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nUNDEFINED cannot be resolved"
      + "\naddCellStyle cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\ntoYAlignment cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiFormLayout */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYFormLayout cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiFormLayoutAssigment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYFormLayout cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nUiField cannot be resolved to a type."
      + "\nelement cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\n== cannot be resolved"
      + "\naddElement cannot be resolved"
      + "\nmap cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiOptionsGroup */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiList */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiTable */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTable cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ncolumnAssignment cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncolumnAssignment cannot be resolved"
      + "\ncolumns cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiImage */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYImage cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiComboBox */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiButton */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYButton cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileNavBarAction */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationBarButton cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiMobileNavigationButton */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationButton cannot be resolved to a type."
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\ntargetPage cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetPage cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\npage cannot be resolved"
      + "\ntargetPage cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ntargetPageAlias cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetPageAlias cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nprocessorAssignments cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  protected void _map(final /* UiColumn */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTable cannot be resolved to a type."
      + "\nYColumn cannot be resolved to a type."
      + "\nUiNestedProperty cannot be resolved to a type."
      + "\ncreateColumn cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\nalignment cannot be resolved"
      + "\ntoYFlatAlignment cannot be resolved"
      + "\ncollapsed cannot be resolved"
      + "\ncollapsed cannot be resolved"
      + "\ncollapsible cannot be resolved"
      + "\ncollapsible cannot be resolved"
      + "\nexpandRatio cannot be resolved"
      + "\nexpandRatio cannot be resolved"
      + "\nicon cannot be resolved"
      + "\niconName cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\norderable cannot be resolved"
      + "\norderable cannot be resolved"
      + "\nvisible cannot be resolved"
      + "\nvisible cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ncolumns cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  public /* YDateTimeFormat */Object toYDateTimeFormat(final /* UiDateFormat */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field DATE is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeFormat is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field DATE_TIME is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeFormat is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field TIME is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeFormat is undefined for the type UiModelDerivedStateComputerx"
      + "\nDATE cannot be resolved"
      + "\nDATE_TIME cannot be resolved"
      + "\nTIME cannot be resolved");
  }
  
  public /* YDateTimeResolution */Object toYDateTimeResolution(final /* UiDateTimeResolution */Object value) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field SECOND is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field MINUTE is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field HOUR is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field DAY is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field MONTH is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YEAR is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field UNDEFINED is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YDateTimeResolution is undefined for the type UiModelDerivedStateComputerx"
      + "\nSECOND cannot be resolved"
      + "\nMINUTE cannot be resolved"
      + "\nHOUR cannot be resolved"
      + "\nDAY cannot be resolved"
      + "\nMONTH cannot be resolved"
      + "\nYEAR cannot be resolved"
      + "\nUNDEFINED cannot be resolved");
  }
  
  public /* YFlatAlignment */Object toYFlatAlignment(final /* UiFlatAlignment */Object uiAlign) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field LEFT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YFlatAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field CENTER is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YFlatAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field RIGHT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YFlatAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nLEFT cannot be resolved"
      + "\nCENTER cannot be resolved"
      + "\nRIGHT cannot be resolved");
  }
  
  public /* YAlignment */Object toYAlignment(final /* UiAlignment */Object uiAlign) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BOTTOM_CENTER is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field BOTTOM_FILL is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field BOTTOM_LEFT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field BOTTOM_RIGHT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field FILL_CENTER is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field FILL_FILL is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field FILL_LEFT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field FILL_RIGHT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field MIDDLE_CENTER is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field MIDDLE_FILL is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field MIDDLE_LEFT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field MIDDLE_RIGHT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field TOP_CENTER is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field TOP_FILL is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field TOP_LEFT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field TOP_RIGHT is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YAlignment is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field UNDEFINED is undefined for the type UiModelDerivedStateComputerx"
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
  
  protected void _map(final /* UiValidatorAssignment */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\nfield cannot be resolved"
      + "\nassociatedUi cannot be resolved"
      + "\npush cannot be resolved"
      + "\nvalidatorAlias cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidatorAlias cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nvalidatorDef cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidatorDef cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  protected void _map(final /* UiExposedAction */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYExposedAction cannot be resolved to a type."
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYExposedAction cannot be resolved"
      + "\nactionReference cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nid cannot be resolved"
      + "\nactionReference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nid cannot be resolved"
      + "\nactionID cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nicon cannot be resolved"
      + "\niconName cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\nbindings cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nexposedActions cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final /* UiValidatorDef */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalidator cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  protected void _map(final /* UiValidatorAlias */Object eObject) {
    int _length = ((Object[])Conversions.unwrapArray(this.viewContext, Object.class)).length;
    boolean _equals = (_length == 0);
    if (_equals) {
      return;
    }
  }
  
  protected void _map(final /* UiVisibilityProcessorAssignment */Object eObject) {
    this.pendingVisibilityProcessors.add(eObject);
  }
  
  protected void _map(final /* UiVisibilityProcessor */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVisibilityProcessor cannot be resolved to a type."
      + "\nYValueBindingEndpoint cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nYVisibilityProcessorValueBindingEndpoint cannot be resolved to a type."
      + "\nYValueBinding cannot be resolved to a type."
      + "\nYValueBindingEndpoint cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
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
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nfullyQualifiedName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ndelegateQualifiedName cannot be resolved"
      + "\nfullyQualifiedName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nvisibilityProcessors cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nchangeTriggers cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\ncreateValueBindingEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYVisibilityProcessorValueBindingEndpoint cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nalias cannot be resolved"
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
      + "\ndataUsed cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\ncreateValueBindingEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYVisibilityProcessorValueBindingEndpoint cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nalias cannot be resolved"
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
  
  protected void _map(final /* UiMaxLengthValidator */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYMaxLengthValidator cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\ncreateMaxLengthValidator cannot be resolved"
      + "\nmaxLength cannot be resolved"
      + "\nmaxLength cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\nfullyQualifiedName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ndefaultErrorMessage cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\ndefaultMessage cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final /* UiMinLengthValidator */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYMinLengthValidator cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\ncreateMinLengthValidator cannot be resolved"
      + "\nminLength cannot be resolved"
      + "\nminLength cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\nfullyQualifiedName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ndefaultErrorMessage cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\ndefaultMessage cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final /* UiRegexpValidator */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYRegexpValidator cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\ncreateRegexpValidator cannot be resolved"
      + "\nregExpression cannot be resolved"
      + "\nregExpression cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\nfullyQualifiedName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ndefaultErrorMessage cannot be resolved"
      + "\nerrorCode cannot be resolved"
      + "\ndefaultMessage cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected void _map(final /* UiXbaseValidator */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nYField cannot be resolved to a type."
      + "\nYClassDelegateValidator cannot be resolved to a type."
      + "\ngetJvmElements cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\ngetJvmElements cannot be resolved"
      + "\nget cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncreateClassDelegateValidator cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\nclassName cannot be resolved"
      + "\nvalidators cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiEmbeddable */Object object) {
    return null;
  }
  
  protected /* YEmbeddable */Object _create(final Void object) {
    return null;
  }
  
  protected /* YEmbeddable */Object _create(final /* UiTextField */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTextField cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateTextField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\ncreateTextDatatype cannot be resolved"
      + "\ndatatype cannot be resolved"
      + "\norphanDatatypes cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nmaxLength cannot be resolved"
      + "\nmaxLength cannot be resolved"
      + "\nminLength cannot be resolved"
      + "\nminLength cannot be resolved"
      + "\nregExpression cannot be resolved"
      + "\nregex cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiBeanReferenceField */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYBeanReferenceField cannot be resolved to a type."
      + "\nUiNestedProperty cannot be resolved to a type."
      + "\nUiNestedProperty cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYBeanReferenceField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nconsumeBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncaptionPropertyPath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\ncaptionPropertyPath cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimageProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nimagePropertyPath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\ninMemoryBeanProvider cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ninMemoryBeanProviderQualifiedName cannot be resolved"
      + "\ninMemoryBeanProvider cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ninMemoryBeanProvider cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\ninMemoryBeanProvider cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nreferenceSourceJvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nreferenceSourceTypeQualifiedName cannot be resolved"
      + "\nreferenceSourceJvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nreferenceSourceType cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nreferenceSourceJvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nreferenceSourceTypeProperty cannot be resolved"
      + "\nreferenceSourceField cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiLabel */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYLabel cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateLabel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiDecimalField */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDecimalField cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateDecimalField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\ncreateDecimalDatatype cannot be resolved"
      + "\ndatatype cannot be resolved"
      + "\norphanDatatypes cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ngrouping cannot be resolved"
      + "\nnoGrouping cannot be resolved"
      + "\n! cannot be resolved"
      + "\nmarkNegative cannot be resolved"
      + "\nnoMarkNegative cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprecision cannot be resolved"
      + "\nprecision cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiTextArea */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTextArea cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateTextArea cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiOptionsGroup */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYEnumOptionsGroup cannot be resolved to a type."
      + "\nYOptionsGroup cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\njvmType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYEnumOptionsGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nconvert cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\ncreateOptionsGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nconsumeBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nconvert cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nitemCaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\nitemCaptionProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimageProperty cannot be resolved"
      + "\nitemImageProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiList */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYEnumList cannot be resolved to a type."
      + "\nYList cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\njvmType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYEnumList cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nconvert cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\ncreateList cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nconsumeBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nconvert cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nitemCaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\nitemCaptionProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimageProperty cannot be resolved"
      + "\nitemImageProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiDateField */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYDateTime cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateDateTime cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ndateFormat cannot be resolved"
      + "\ndateFormat cannot be resolved"
      + "\ntoYDateTimeFormat cannot be resolved"
      + "\nresolution cannot be resolved"
      + "\nresolution cannot be resolved"
      + "\ntoYDateTimeResolution cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiBrowser */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYBrowser cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateBrowser cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiProgressBar */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYProgressBar cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateProgressBar cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiImage */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYImage cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateImage cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiTable */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTable cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateTable cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nconsumeBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nselectionType cannot be resolved"
      + "\nconvert cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nitemImageProperty cannot be resolved"
      + "\nitemImageProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YField */Object _create(final /* UiSearchField */Object eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiNestedProperty cannot be resolved to a type."
      + "\nYField cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\nproperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeofLastSegment cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYTextSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYNumericSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYBooleanSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYReferenceSearchField cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntypeofLastSegment cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nid cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved");
  }
  
  public /* YSelectionType */Object convert(final /* UiSelectionType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field NONE is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YSelectionType is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field SINGLE is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YSelectionType is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field MULTI is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field YSelectionType is undefined for the type UiModelDerivedStateComputerx"
      + "\nSINGLE cannot be resolved"
      + "\nSINGLE cannot be resolved"
      + "\nMULTI cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiNumericField */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYNumericField cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateNumericField cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\ncreateNumericDatatype cannot be resolved"
      + "\ndatatype cannot be resolved"
      + "\norphanDatatypes cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ngrouping cannot be resolved"
      + "\nnoGrouping cannot be resolved"
      + "\n! cannot be resolved"
      + "\nmarkNegative cannot be resolved"
      + "\nnoMarkNegative cannot be resolved"
      + "\n! cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiCheckBox */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYCheckBox cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateCheckBox cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YButton */Object _create(final /* UiButton */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYButton cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateButton cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMNavigationBarButton */Object _create(final /* UiMobileNavBarAction */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationBarButton cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMNavigationBarButton cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMNavigationButton */Object _create(final /* UiMobileNavigationButton */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationButton cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMNavigationButton cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMNavigationPage */Object _create(final /* UiMobileNavigationPage */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationPage cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMNavigationPage cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiComboBox */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYEnumComboBox cannot be resolved to a type."
      + "\nYComboBox cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\njvmType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYEnumComboBox cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nassociateUi cannot be resolved"
      + "\ncreateComboBox cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nuseBeanService cannot be resolved"
      + "\nconsumeBeanService cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nitemCaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\nitemCaptionProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\ncaptionProperty cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nimageProperty cannot be resolved"
      + "\nitemImageProperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YEmbeddable */Object _create(final /* UiSwitch */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMSwitch cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMSwitch cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YGridLayout */Object _create(final /* UiGridLayout */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYGridLayout cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateGridLayout cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncolumns cannot be resolved"
      + "\ncolumns cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YFormLayout */Object _create(final /* UiFormLayout */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYFormLayout cannot be resolved to a type."
      + "\ncreateFormLayout cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YHorizontalLayout */Object _create(final /* UiHorizontalLayout */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYHorizontalLayout cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateHorizontalLayout cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMNavigationRoot */Object _create(final /* UiMobileNavigationRoot */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMNavigationRoot cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMNavigationRoot cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YSearchPanel */Object _create(final /* UiSearchPanel */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSearchPanel cannot be resolved to a type."
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYSearchPanel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMSearchPanel */Object _create(final /* UiMobileSearchPanel */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMSearchPanel cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMSearchPanel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YSplitPanel */Object _create(final /* UiSplitpanel */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYSplitPanel cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateSplitPanel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nsplitPosition cannot be resolved"
      + "\nsplitPosition cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YPanel */Object _create(final /* UiPanel */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYPanel cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreatePanel cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YVerticalLayout */Object _create(final /* UiVerticalLayout */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYVerticalLayout cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateVerticalLayout cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMHorizontalButtonGroup */Object _create(final /* UiHorizontalButtonGroup */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMHorizontalButtonGroup cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMHorizontalButtonGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMVerticalComponentGroup */Object _create(final /* UiVerticalComponentGroup */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMVerticalComponentGroup cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMVerticalComponentGroup cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ninitialEnabled cannot be resolved"
      + "\nreadonly cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* YTabSheet */Object _create(final /* UiTabSheet */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYTabSheet cannot be resolved to a type."
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\ncreateTabSheet cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\ncssClass cannot be resolved"
      + "\nstyles cannot be resolved"
      + "\nassociateUi cannot be resolved");
  }
  
  protected /* VMTabSheet */Object _create(final /* UiMobileTabSheet */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nVMTabSheet cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method getPathId is undefined for the type UiModelDerivedStateComputerx"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateVMTabSheet cannot be resolved"
      + "\nid cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabel cannot be resolved"
      + "\nname cannot be resolved"
      + "\nlabelI18nKey cannot be resolved"
      + "\ntoI18nKey cannot be resolved"
      + "\nassociateUi cannot be resolved");
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
  
  protected void _map(final /* UiPoint */Object object) {
  }
  
  protected void _map(final /* UiBindingEndpointAlias */Object object) {
  }
  
  protected void _map(final /* UiBindingEndpointAssignment */Object object) {
  }
  
  protected void _map(final /* UiBinding */Object object) {
    this.pendingBindings.add(object);
  }
  
  public void install(final /* UiBinding */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
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
      + "\nsourceAlias cannot be resolved"
      + "\nsource cannot be resolved"
      + "\ntargetAlias cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\nlistBinding cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncreateValueBindingEndpoint cannot be resolved"
      + "\ncreateValueBindingEndpoint cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nsourceToTarget cannot be resolved"
      + "\n! cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\ntargetToSource cannot be resolved"
      + "\n! cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\norCreateBindingSet cannot be resolved"
      + "\naddBinding cannot be resolved"
      + "\ncreateListBindingEndpoint cannot be resolved"
      + "\ncreateListBindingEndpoint cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nsourceToTarget cannot be resolved"
      + "\n! cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\ntargetToSource cannot be resolved"
      + "\n! cannot be resolved"
      + "\nON_REQUEST cannot be resolved"
      + "\norCreateBindingSet cannot be resolved"
      + "\naddBinding cannot be resolved");
  }
  
  public /* YValueBindingEndpoint */Object createValueBindingEndpoint(final /* UiBindingEndpointAssignment */Object epDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nYValueBindingEndpoint cannot be resolved to a type."
      + "\nUiBeanSlot cannot be resolved to a type."
      + "\nUiBeanSlot cannot be resolved to a type."
      + "\nYBeanSlot cannot be resolved to a type."
      + "\nYBeanSlotValueBindingEndpoint cannot be resolved to a type."
      + "\nUiEmbeddable cannot be resolved to a type."
      + "\nYElement cannot be resolved to a type."
      + "\nYECViewModelValueBindingEndpoint cannot be resolved to a type."
      + "\nUiMobileNavigationCommand cannot be resolved to a type."
      + "\nUiMobileNavigationCommand cannot be resolved to a type."
      + "\nUiMobileNavigationCommand cannot be resolved to a type."
      + "\nVMNavigationCommand cannot be resolved to a type."
      + "\nUiMobileNavigationHandler cannot be resolved to a type."
      + "\nUiOpenDialogCommand cannot be resolved to a type."
      + "\nUiOpenDialogCommand cannot be resolved to a type."
      + "\nUiOpenDialogCommand cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nUiSearchWithDialogCommand cannot be resolved to a type."
      + "\nUiSearchWithDialogCommand cannot be resolved to a type."
      + "\nUiSearchWithDialogCommand cannot be resolved to a type."
      + "\nYOpenDialogCommand cannot be resolved to a type."
      + "\nUiAddToTableCommand cannot be resolved to a type."
      + "\nUiAddToTableCommand cannot be resolved to a type."
      + "\nUiAddToTableCommand cannot be resolved to a type."
      + "\nYAddToTableCommand cannot be resolved to a type."
      + "\nUiRemoveFromTableCommand cannot be resolved to a type."
      + "\nUiRemoveFromTableCommand cannot be resolved to a type."
      + "\nUiRemoveFromTableCommand cannot be resolved to a type."
      + "\nYRemoveFromTableCommand cannot be resolved to a type."
      + "\nUiSendEventCommand cannot be resolved to a type."
      + "\nUiSendEventCommand cannot be resolved to a type."
      + "\nUiSendEventCommand cannot be resolved to a type."
      + "\nYSendEventCommand cannot be resolved to a type."
      + "\nThe method or field VaadinMobileFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field ExtensionModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nThe method or field CoreModelFactory is undefined for the type UiModelDerivedStateComputerx"
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\n== cannot be resolved"
      + "\nassociatedUi cannot be resolved"
      + "\ncreateBeanSlotValueBindingEndpoint cannot be resolved"
      + "\nbeanSlot cannot be resolved"
      + "\nattributePath cannot be resolved"
      + "\nattributePath cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nattributePath cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nattributePath cannot be resolved"
      + "\ncreateECViewModelValueBindingEndpoint cannot be resolved"
      + "\nelement cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
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
      + "\ntargetPage cannot be resolved"
      + "\ncreate cannot be resolved"
      + "\ntargetPage cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ntargetPage cannot be resolved"
      + "\ntargetPage cannot be resolved"
      + "\nassociatedUi cannot be resolved"
      + "\nfindNavHandler cannot be resolved"
      + "\nnavigationHandler cannot be resolved"
      + "\ncreateNavigationValueEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYOpenDialogCommand cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\npush cannot be resolved"
      + "\ndialog cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ncreateTriggerDialogEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYOpenDialogCommand cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\npush cannot be resolved"
      + "\ndialog cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ncreateTriggerDialogEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYAddToTableCommand cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\ntable cannot be resolved"
      + "\ntable cannot be resolved"
      + "\nassociatedUi cannot be resolved"
      + "\ncreateTriggerEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYRemoveFromTableCommand cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\ntable cannot be resolved"
      + "\ntable cannot be resolved"
      + "\nassociatedUi cannot be resolved"
      + "\ncreateTriggerEndpoint cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYSendEventCommand cannot be resolved"
      + "\nautoTrigger cannot be resolved"
      + "\nnoAutoTrigger cannot be resolved"
      + "\n! cannot be resolved"
      + "\neventTopic cannot be resolved"
      + "\neventTopic cannot be resolved"
      + "\ncommandSet cannot be resolved"
      + "\naddCommand cannot be resolved"
      + "\ncreateMessageEndpoint cannot be resolved");
  }
  
  public /* UiMobileNavigationHandler */Object findNavHandler(final /* UiBindingEndpointAssignment */Object assignment) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiMobileNavigationHandler cannot be resolved to a type."
      + "\nUiMobileNavigationHandler cannot be resolved to a type.");
  }
  
  public /* YListBindingEndpoint */Object createListBindingEndpoint(final /* UiBindingEndpointAssignment */Object epDef) {
    throw new Error("Unresolved compilation problems:"
      + "\nYListBindingEndpoint cannot be resolved to a type."
      + "\nUiBeanSlot cannot be resolved to a type."
      + "\nUiBeanSlot cannot be resolved to a type."
      + "\nYBeanSlot cannot be resolved to a type."
      + "\nYBeanSlotListBindingEndpoint cannot be resolved to a type."
      + "\nUiEmbeddable cannot be resolved to a type."
      + "\nYEmbeddable cannot be resolved to a type."
      + "\nYECViewModelListBindingEndpoint cannot be resolved to a type."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\n== cannot be resolved"
      + "\nassociatedUi cannot be resolved"
      + "\ncreateBeanSlotListBindingEndpoint cannot be resolved"
      + "\nbeanSlot cannot be resolved"
      + "\nattributePath cannot be resolved"
      + "\ncreateECViewModelListBindingEndpoint cannot be resolved"
      + "\nelement cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nemfNsURI cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nEPackage cannot be resolved"
      + "\nnsURI cannot be resolved");
  }
  
  protected void _collectBindingInfo(final /* UiBindingEndpointAssignment */Object assignment, final UiModelDerivedStateComputerx.BindingInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ntypedBindableAlias cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved"
      + "\ncollectBindingInfo cannot be resolved"
      + "\ntypedBindableDef cannot be resolved"
      + "\ncollectBindingInfo cannot be resolved"
      + "\npath cannot be resolved"
      + "\n!= cannot be resolved"
      + "\npath cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\npath cannot be resolved"
      + "\ntypeofLastSegment cannot be resolved"
      + "\npath cannot be resolved"
      + "\noperationofLastSegment cannot be resolved"
      + "\npath cannot be resolved"
      + "\ntypeofSecondLastSegment cannot be resolved"
      + "\n!= cannot be resolved");
  }
  
  protected void _collectBindingInfo(final /* UiBeanSlot */Object slot, final UiModelDerivedStateComputerx.BindingInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\njvmType cannot be resolved"
      + "\ntype cannot be resolved");
  }
  
  protected void _collectBindingInfo(final /* UiBindingEndpointAlias */Object alias, final UiModelDerivedStateComputerx.BindingInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\nendpoint cannot be resolved"
      + "\ncollectBindingInfo cannot be resolved");
  }
  
  protected void _collectBindingInfo(final /* UiTypedBindableDef */Object definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\nrawBindableOfLastSegment cannot be resolved"
      + "\nmethod cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetName cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ntargetName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  protected void _collectBindingInfo(final /* UiCommandBindableDef */Object definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    throw new Error("Unresolved compilation problems:"
      + "\ncommand cannot be resolved");
  }
  
  protected void _collectBindingInfo(final /* UiBindingExpression */Object definition, final UiModelDerivedStateComputerx.BindingInfo info) {
    throw new UnsupportedOperationException();
  }
  
  public Object resolve(final /* UiBindingEndpointAlias */Object alias) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nendpoint cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved"
      + "\ntypedBindableAlias cannot be resolved");
  }
  
  public Object loadClass(final ResourceSet resourceSet, final String qualifiedName) {
    throw new Error("Unresolved compilation problems:"
      + "\nfindTypeByName cannot be resolved");
  }
  
  protected void _map(final /* UiPathSegment */Object object) {
  }
  
  protected void _map(final /* UiBeanSlot */Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nYView cannot be resolved to a type."
      + "\nYView cannot be resolved to a type."
      + "\nYViewSet cannot be resolved to a type."
      + "\nYViewSet cannot be resolved to a type."
      + "\nUnreachable code: The if condition can never match. It is already handled by a previous condition."
      + "\ncreateBeanSlot cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalueTypeQualifiedName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nvalueType cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nvalueTypeQualifiedName cannot be resolved"
      + "\neventTopic cannot be resolved"
      + "\neventTopic cannot be resolved"
      + "\nassociateUi cannot be resolved"
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
    if (object != null) {
      _map(object);
      return;
    } else if (object == null) {
      _map((Void)null);
      return;
    } else if (object != null) {
      _map(object);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public YEmbeddable create(final UiEmbeddable object) {
    if (object == null) {
      return _create(null);
    } else if (object != null) {
      return _create(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public void collectBindingInfo(final UiBindingEndpointAssignment assignment, final UiModelDerivedStateComputerx.BindingInfo info) {
    if (assignment != null) {
      _collectBindingInfo(assignment, info);
      return; else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(assignment, info).toString());
      }
    }
  }
  