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
package org.lunifera.ecview.dsl.ui.contentassist

import com.google.inject.Inject
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ide.core.api.i18n.II18nRegistry
import org.lunifera.ide.core.api.i18n.II18nRegistry.Proposal
import org.lunifera.ide.core.ui.util.CoreUiUtil
import org.eclipse.swt.graphics.Image

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class UIGrammarProposalProvider extends AbstractUIGrammarProposalProvider {

	@Inject
	II18nRegistry i18nRegistry
	@Inject
	CoreUiUtil util;

	override void completeUiI18nInfo_Key(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {

		val IProject project = util.getProject(model)
		val searchString = context.prefix.replaceAll("\"", "")
		val List<Proposal> proposals = i18nRegistry.findContentProposals(project, util.locale, findPackage(model),
			searchString);

		val int replacementOffset = context.getReplaceRegion().getOffset();
		val int replacementLength = context.getReplaceRegion().getLength() + 1;

		val relativePath = searchString.startsWith(".")
		for (proposal : proposals) {
			val ConfigurableCompletionProposal result = doCreateProposal(
				"\"" + proposal.toReplacementString(relativePath) + "\"", proposal.displayString(), null,
				replacementOffset, replacementLength);
			result.setPriority(1);
			result.setMatcher(context.getMatcher());
			result.setReplaceContextLength(context.getReplaceContextLength());
			acceptor.accept(result)
		}
	}

	def String toReplacementString(Proposal proposal, boolean relative) {
		if (!relative) {
			return proposal.i18nKey
		} else {
			val String[] pathTokens = proposal.i18nKey.split('\\.')
			return if(pathTokens.length > 0) ("." + pathTokens.get(pathTokens.length - 1)) else ""
		}
	}

	/**
	 * Iterates the containment tree up to the UiModel and returns the package.
	 */
	def String findPackage(EObject model) {
		var EObject temp = model;
		while (temp != null && temp.eContainer != null) {
			if (temp instanceof UiModel) {
				val UiModel uiModel = temp as UiModel
				return uiModel.packageName
			}
			temp = temp.eContainer
			if (temp instanceof UiModel) {
				val UiModel uiModel = temp as UiModel
				return uiModel.packageName
			}
		}
		return ""
	}

	override void completeUiMaxLengthValidator_MaxLength(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(doCreateProposal("1", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("2", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("3", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("4", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("10", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("12", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("15", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("20", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("25", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("125", new StyledString("any numer"), null, 0, context))
	}

	override void completeUiMinLengthValidator_MinLength(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(doCreateProposal("1", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("2", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("3", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("4", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("10", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("12", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("15", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("20", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("25", new StyledString("any numer"), null, 0, context))
		acceptor.accept(doCreateProposal("125", new StyledString("any numer"), null, 0, context))
	}

	override void completeUiRegexpValidator_RegExpression(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(doCreateProposal("*abc", new StyledString("any regular expression"), null, 0, context))
	}

	def StyledString displayString(Proposal proposal) {
		val StyledString displayText = new StyledString(proposal.i18nValue, StyledString.QUALIFIER_STYLER).append(" : ").
			append(proposal.locale.toLanguageTag, StyledString.DECORATIONS_STYLER).append(" - ").append(
				proposal.i18nKey, StyledString.DECORATIONS_STYLER);
		return displayText;
	}

	override boolean isKeywordWorthyToPropose(Keyword keyword) {
		return true;
	}
}
