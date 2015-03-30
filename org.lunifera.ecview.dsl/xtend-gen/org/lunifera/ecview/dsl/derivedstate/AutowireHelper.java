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
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.Extension;
import org.lunifera.ecview.dsl.derivedstate.UiModelDerivedStateComputerx;
import org.lunifera.ecview.dsl.extensions.OperationExtensions;
import org.lunifera.ecview.dsl.extensions.TypeHelper;

@SuppressWarnings("all")
public class AutowireHelper {
  public interface Layouter {
    public abstract void setup(final /* UiLayout */Object uiRootLayout, final /* YLayout */Object yRootLayout);
    
    public abstract void add(final /* YEmbeddable */Object element);
  }
  
  public static class HorizontalLayouter implements AutowireHelper.Layouter {
    private /* YFormLayout */Object left;
    
    private /* YFormLayout */Object right;
    
    private int index;
    
    public void setup(final /* UiLayout */Object uiRootLayout, final /* YLayout */Object yRootLayout) {
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
    
    public void setup(final /* UiLayout */Object uiRootLayout, final /* YLayout */Object yRootLayout) {
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
  
  private /* UiLayout */Object uiLayout;
  
  private String i18nRootKey;
  
  private AutowireHelper.Layouter layouter;
  
  private JvmDeclaredType beanType;
  
  public void autowire(final /* UiLayout */Object uiLayout, final UiModelDerivedStateComputerx computer, final boolean mobile, final String i18nRootKey) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiHorizontalLayout cannot be resolved to a type."
      + "\nautowire cannot be resolved"
      + "\n! cannot be resolved"
      + "\nautoWireSource cannot be resolved");
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
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
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
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
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
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nUiBindingEndpointAssignment cannot be resolved to a type."
      + "\nThe method or field BindingFactory is undefined for the type AutowireHelper"
      + "\nThe method or field BindingFactory is undefined for the type AutowireHelper"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type AutowireHelper"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type AutowireHelper"
      + "\nThe method or field YBindingUpdateStrategy is undefined for the type AutowireHelper"
      + "\nautoWireSource cannot be resolved"
      + "\ncreateDetailValueEndpoint cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateYECViewModelValueBindingEndpoint cannot be resolved"
      + "\nelement cannot be resolved"
      + "\npropertyPath cannot be resolved"
      + "\ntypeQualifiedName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
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
