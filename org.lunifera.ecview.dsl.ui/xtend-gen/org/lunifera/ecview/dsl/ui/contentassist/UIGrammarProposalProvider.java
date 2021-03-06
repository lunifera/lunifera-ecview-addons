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
package org.lunifera.ecview.dsl.ui.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.lunifera.ecview.dsl.ui.contentassist.AbstractUIGrammarProposalProvider;
import org.lunifera.ecview.semantic.uimodel.UiModel;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class UIGrammarProposalProvider extends AbstractUIGrammarProposalProvider {
  @Inject
  private /* II18nRegistry */Object i18nRegistry;
  
  @Inject
  private /* CoreUiUtil */Object util;
  
  public void completeUiI18nInfo_Key(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nProposal cannot be resolved to a type."
      + "\ngetProject cannot be resolved"
      + "\nfindContentProposals cannot be resolved"
      + "\nlocale cannot be resolved"
      + "\ntoReplacementString cannot be resolved"
      + "\ndisplayString cannot be resolved");
  }
  
  public String toReplacementString(final /* Proposal */Object proposal, final boolean relative) {
    throw new Error("Unresolved compilation problems:"
      + "\ni18nKey cannot be resolved"
      + "\ni18nKey cannot be resolved"
      + "\nsplit cannot be resolved");
  }
  
  /**
   * Iterates the containment tree up to the UiModel and returns the package.
   */
  public String findPackage(final EObject model) {
    EObject temp = model;
    while (((!Objects.equal(temp, null)) && (!Objects.equal(temp.eContainer(), null)))) {
      {
        if ((temp instanceof UiModel)) {
          final UiModel uiModel = ((UiModel) temp);
          return uiModel.getPackageName();
        }
        EObject _eContainer = temp.eContainer();
        temp = _eContainer;
        if ((temp instanceof UiModel)) {
          final UiModel uiModel_1 = ((UiModel) temp);
          return uiModel_1.getPackageName();
        }
      }
    }
    return "";
  }
  
  public void completeUiMaxLengthValidator_MaxLength(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    StyledString _styledString = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("1", _styledString, null, 0, context);
    acceptor.accept(_doCreateProposal);
    StyledString _styledString_1 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_1 = this.doCreateProposal("2", _styledString_1, null, 0, context);
    acceptor.accept(_doCreateProposal_1);
    StyledString _styledString_2 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_2 = this.doCreateProposal("3", _styledString_2, null, 0, context);
    acceptor.accept(_doCreateProposal_2);
    StyledString _styledString_3 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_3 = this.doCreateProposal("4", _styledString_3, null, 0, context);
    acceptor.accept(_doCreateProposal_3);
    StyledString _styledString_4 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_4 = this.doCreateProposal("10", _styledString_4, null, 0, context);
    acceptor.accept(_doCreateProposal_4);
    StyledString _styledString_5 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_5 = this.doCreateProposal("12", _styledString_5, null, 0, context);
    acceptor.accept(_doCreateProposal_5);
    StyledString _styledString_6 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_6 = this.doCreateProposal("15", _styledString_6, null, 0, context);
    acceptor.accept(_doCreateProposal_6);
    StyledString _styledString_7 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_7 = this.doCreateProposal("20", _styledString_7, null, 0, context);
    acceptor.accept(_doCreateProposal_7);
    StyledString _styledString_8 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_8 = this.doCreateProposal("25", _styledString_8, null, 0, context);
    acceptor.accept(_doCreateProposal_8);
    StyledString _styledString_9 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_9 = this.doCreateProposal("125", _styledString_9, null, 0, context);
    acceptor.accept(_doCreateProposal_9);
  }
  
  public void completeUiMinLengthValidator_MinLength(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    StyledString _styledString = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("1", _styledString, null, 0, context);
    acceptor.accept(_doCreateProposal);
    StyledString _styledString_1 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_1 = this.doCreateProposal("2", _styledString_1, null, 0, context);
    acceptor.accept(_doCreateProposal_1);
    StyledString _styledString_2 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_2 = this.doCreateProposal("3", _styledString_2, null, 0, context);
    acceptor.accept(_doCreateProposal_2);
    StyledString _styledString_3 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_3 = this.doCreateProposal("4", _styledString_3, null, 0, context);
    acceptor.accept(_doCreateProposal_3);
    StyledString _styledString_4 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_4 = this.doCreateProposal("10", _styledString_4, null, 0, context);
    acceptor.accept(_doCreateProposal_4);
    StyledString _styledString_5 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_5 = this.doCreateProposal("12", _styledString_5, null, 0, context);
    acceptor.accept(_doCreateProposal_5);
    StyledString _styledString_6 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_6 = this.doCreateProposal("15", _styledString_6, null, 0, context);
    acceptor.accept(_doCreateProposal_6);
    StyledString _styledString_7 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_7 = this.doCreateProposal("20", _styledString_7, null, 0, context);
    acceptor.accept(_doCreateProposal_7);
    StyledString _styledString_8 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_8 = this.doCreateProposal("25", _styledString_8, null, 0, context);
    acceptor.accept(_doCreateProposal_8);
    StyledString _styledString_9 = new StyledString("any numer");
    ConfigurableCompletionProposal _doCreateProposal_9 = this.doCreateProposal("125", _styledString_9, null, 0, context);
    acceptor.accept(_doCreateProposal_9);
  }
  
  public void completeUiRegexpValidator_RegExpression(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    StyledString _styledString = new StyledString("any regular expression");
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("*abc", _styledString, null, 0, context);
    acceptor.accept(_doCreateProposal);
  }
  
  public StyledString displayString(final /* Proposal */Object proposal) {
    throw new Error("Unresolved compilation problems:"
      + "\ni18nValue cannot be resolved"
      + "\nlocale cannot be resolved"
      + "\ntoLanguageTag cannot be resolved"
      + "\ni18nKey cannot be resolved");
  }
  
  public boolean isKeywordWorthyToPropose(final Keyword keyword) {
    return true;
  }
}
