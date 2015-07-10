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
import java.util.List;
import java.util.Locale;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.lunifera.ecview.dsl.ui.contentassist.AbstractUIGrammarProposalProvider;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ide.core.api.i18n.II18nRegistry;
import org.lunifera.ide.core.ui.util.CoreUiUtil;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class UIGrammarProposalProvider extends AbstractUIGrammarProposalProvider {
  @Inject
  private II18nRegistry i18nRegistry;
  
  @Inject
  private CoreUiUtil util;
  
  public void completeUiI18nInfo_Key(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final IProject project = this.util.getProject(model);
    String _prefix = context.getPrefix();
    final String searchString = _prefix.replaceAll("\"", "");
    Locale _locale = this.util.getLocale();
    String _findPackage = this.findPackage(model);
    final List<II18nRegistry.Proposal> proposals = this.i18nRegistry.findContentProposals(project, _locale, _findPackage, searchString);
    Region _replaceRegion = context.getReplaceRegion();
    final int replacementOffset = _replaceRegion.getOffset();
    Region _replaceRegion_1 = context.getReplaceRegion();
    int _length = _replaceRegion_1.getLength();
    final int replacementLength = (_length + 1);
    final boolean relativePath = searchString.startsWith(".");
    for (final II18nRegistry.Proposal proposal : proposals) {
      {
        String _replacementString = this.toReplacementString(proposal, relativePath);
        String _plus = ("\"" + _replacementString);
        String _plus_1 = (_plus + "\"");
        StyledString _displayString = this.displayString(proposal);
        final ConfigurableCompletionProposal result = this.doCreateProposal(_plus_1, _displayString, null, replacementOffset, replacementLength);
        result.setPriority(1);
        PrefixMatcher _matcher = context.getMatcher();
        result.setMatcher(_matcher);
        int _replaceContextLength = context.getReplaceContextLength();
        result.setReplaceContextLength(_replaceContextLength);
        acceptor.accept(result);
      }
    }
  }
  
  public String toReplacementString(final II18nRegistry.Proposal proposal, final boolean relative) {
    if ((!relative)) {
      return proposal.getI18nKey();
    } else {
      String _i18nKey = proposal.getI18nKey();
      final String[] pathTokens = _i18nKey.split("\\.");
      String _xifexpression = null;
      int _length = pathTokens.length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        int _length_1 = pathTokens.length;
        int _minus = (_length_1 - 1);
        String _get = pathTokens[_minus];
        _xifexpression = ("." + _get);
      } else {
        _xifexpression = "";
      }
      return _xifexpression;
    }
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
  
  public StyledString displayString(final II18nRegistry.Proposal proposal) {
    String _i18nValue = proposal.getI18nValue();
    StyledString _styledString = new StyledString(_i18nValue, StyledString.QUALIFIER_STYLER);
    StyledString _append = _styledString.append(" : ");
    Locale _locale = proposal.getLocale();
    String _languageTag = _locale.toLanguageTag();
    StyledString _append_1 = _append.append(_languageTag, StyledString.DECORATIONS_STYLER);
    StyledString _append_2 = _append_1.append(" - ");
    String _i18nKey = proposal.getI18nKey();
    final StyledString displayText = _append_2.append(_i18nKey, StyledString.DECORATIONS_STYLER);
    return displayText;
  }
  
  public boolean isKeywordWorthyToPropose(final Keyword keyword) {
    return true;
  }
}
