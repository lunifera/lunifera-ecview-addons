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
package org.lunifera.ecview.dsl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.lunifera.ecview.dsl.extensions.BindableTypeResolver;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class UIGrammarJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private IJvmModelAssociator associator;
  
  @Inject
  private TypeReferences references;
  
  @Inject
  private BindableTypeResolver typeResolver;
  
  protected void _infer(final /* UiXbaseValidator */Object element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\nAbstractDisposable cannot be resolved to a type."
      + "\nIValidator cannot be resolved to a type."
      + "\nII18nService cannot be resolved to a type."
      + "\nII18nService cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type."
      + "\nIStatus cannot be resolved to a type."
      + "\nThe method or field superTypes is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field superTypes is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field visibility is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field visibility is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field visibility is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field visibility is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field visibility is undefined for the type UIGrammarJvmModelInferrer"
      + "\nType mismatch: cannot convert implicit first argument from JvmIdentifiableElement to JvmExecutable"
      + "\nType mismatch: cannot convert implicit first argument from JvmIdentifiableElement to JvmExecutable"
      + "\ntoClass cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoField cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoField cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoSetter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoSetter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\nerrorCodes cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\nfullyQualifiedName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ndefaultMessage cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\ncloneWithProxies cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved");
  }
  
  protected void _infer(final /* UiVisibilityProcessor */Object element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    throw new Error("Unresolved compilation problems:"
      + "\nIVisibilityProcessor cannot be resolved to a type."
      + "\nUiTypedBindableRawTypeAlias cannot be resolved to a type."
      + "\nIVisibilityHandler cannot be resolved to a type."
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nUiChangeTrigger cannot be resolved to a type."
      + "\nIVisibilityManager cannot be resolved to a type."
      + "\nUiTypedBindableRawTypeAlias cannot be resolved to a type."
      + "\nUiTypedBindableRawTypeAlias cannot be resolved to a type."
      + "\nUiXbaseVisibilityRule cannot be resolved to a type."
      + "\nUiXbaseVisibilityRule cannot be resolved to a type."
      + "\nUiBindingEndpointAlias cannot be resolved to a type."
      + "\nUiChangeTrigger cannot be resolved to a type."
      + "\nThe method or field superTypes is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field members is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field visibility is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field simpleName is undefined for the type UIGrammarJvmModelInferrer"
      + "\nThe method or field parameters is undefined for the type UIGrammarJvmModelInferrer"
      + "\ntoClass cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\nimportedElements cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoField cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\ndataUsed cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoField cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nchangeTriggers cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoField cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\nimportedElements cannot be resolved"
      + "\nalias cannot be resolved"
      + "\ntoPathString cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\nimportedElements cannot be resolved"
      + "\nalias cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\nrule cannot be resolved"
      + "\nexpression cannot be resolved"
      + "\ndataUsed cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoGetter cannot be resolved"
      + "\nalias cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoSetter cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nchangeTriggers cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoGetter cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoMethod cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nnewTypeRef cannot be resolved"
      + "\nalias cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ntoParameter cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nendpoint cannot be resolved"
      + "\nalias cannot be resolved"
      + "\nalias cannot be resolved");
  }
  
  /**
   * Returns the name of the validator
   */
  public String getValidatorName(final /* UiXbaseValidator */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nfullyQualifiedName cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nskipLast cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nlastSegment cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  /**
   * Returns the name of the validator
   */
  public String getProcessorName(final /* UiVisibilityProcessor */Object element) {
    throw new Error("Unresolved compilation problems:"
      + "\nfullyQualifiedName cannot be resolved"
      + "\nempty cannot be resolved"
      + "\nskipLast cannot be resolved"
      + "\nappend cannot be resolved"
      + "\nlastSegment cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  public String toPathString(final /* UiTypedBindableRawTypeAlias */Object alias) {
    throw new Error("Unresolved compilation problems:"
      + "\nUiTypedBindableRawType cannot be resolved to a type."
      + "\nUiTypedBindableRawType cannot be resolved to a type."
      + "\ntype cannot be resolved"
      + "\ntoPathString cannot be resolved");
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
