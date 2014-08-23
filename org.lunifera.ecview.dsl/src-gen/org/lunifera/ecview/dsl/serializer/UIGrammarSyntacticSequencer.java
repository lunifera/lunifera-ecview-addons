package org.lunifera.ecview.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess;

@SuppressWarnings("all")
public class UIGrammarSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UIGrammarGrammarAccess grammarAccess;
	protected AbstractElementAlias match_UiBeanSlot_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_UiBindingEndpointAlias_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_UiBinding_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_UiCheckBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_UiColumn_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_UiComboBox_SemicolonKeyword_3_1_2_q;
	protected AbstractElementAlias match_UiComboBox_SemicolonKeyword_3_2_2_q;
	protected AbstractElementAlias match_UiComboBox_SemicolonKeyword_3_3_2_q;
	protected AbstractElementAlias match_UiComboBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_5__q;
	protected AbstractElementAlias match_UiDialog_SemicolonKeyword_4_2_q;
	protected AbstractElementAlias match_UiDialog_SemicolonKeyword_5_1_q;
	protected AbstractElementAlias match_UiGridLayout___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_1__q;
	protected AbstractElementAlias match_UiIDEView_SemicolonKeyword_3_2_q;
	protected AbstractElementAlias match_UiImage_SemicolonKeyword_3_1_2_q;
	protected AbstractElementAlias match_UiImage___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_UiImports_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_UiMaxLengthValidator_RightParenthesisKeyword_5_q;
	protected AbstractElementAlias match_UiMinLengthValidator_RightParenthesisKeyword_5_q;
	protected AbstractElementAlias match_UiMobileNavigationPage_SemicolonKeyword_4_2_q;
	protected AbstractElementAlias match_UiMobileView_SemicolonKeyword_3_2_q;
	protected AbstractElementAlias match_UiNumericField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_UiRegexpValidator_RightParenthesisKeyword_5_q;
	protected AbstractElementAlias match_UiSearchDialog_SemicolonKeyword_4_2_q;
	protected AbstractElementAlias match_UiSearchDialog___SearchKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_UiTable_SemicolonKeyword_3_1_2_q;
	protected AbstractElementAlias match_UiTable_SemicolonKeyword_3_2_2_q;
	protected AbstractElementAlias match_UiTable_SemicolonKeyword_3_3_2_q;
	protected AbstractElementAlias match_UiTable___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q;
	protected AbstractElementAlias match_UiTextField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_UiValidatorAlias_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_UiValidatorAssignment_SemicolonKeyword_3_1_1_q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UIGrammarGrammarAccess) access;
		match_UiBeanSlot_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getUiBeanSlotAccess().getSemicolonKeyword_4());
		match_UiBindingEndpointAlias_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getUiBindingEndpointAliasAccess().getSemicolonKeyword_4());
		match_UiBinding_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getUiBindingAccess().getSemicolonKeyword_5());
		match_UiCheckBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiCheckBoxAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUiCheckBoxAccess().getRightCurlyBracketKeyword_3_2()));
		match_UiColumn_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getUiColumnAccess().getSemicolonKeyword_4());
		match_UiComboBox_SemicolonKeyword_3_1_2_q = new TokenAlias(false, true, grammarAccess.getUiComboBoxAccess().getSemicolonKeyword_3_1_2());
		match_UiComboBox_SemicolonKeyword_3_2_2_q = new TokenAlias(false, true, grammarAccess.getUiComboBoxAccess().getSemicolonKeyword_3_2_2());
		match_UiComboBox_SemicolonKeyword_3_3_2_q = new TokenAlias(false, true, grammarAccess.getUiComboBoxAccess().getSemicolonKeyword_3_3_2());
		match_UiComboBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiComboBoxAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUiComboBoxAccess().getRightCurlyBracketKeyword_3_5()));
		match_UiDialog_SemicolonKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getUiDialogAccess().getSemicolonKeyword_4_2());
		match_UiDialog_SemicolonKeyword_5_1_q = new TokenAlias(false, true, grammarAccess.getUiDialogAccess().getSemicolonKeyword_5_1());
		match_UiGridLayout___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiGridLayoutAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getUiGridLayoutAccess().getRightParenthesisKeyword_2_1()));
		match_UiIDEView_SemicolonKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getUiIDEViewAccess().getSemicolonKeyword_3_2());
		match_UiImage_SemicolonKeyword_3_1_2_q = new TokenAlias(false, true, grammarAccess.getUiImageAccess().getSemicolonKeyword_3_1_2());
		match_UiImage___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiImageAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUiImageAccess().getRightCurlyBracketKeyword_3_3()));
		match_UiImports_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getUiImportsAccess().getSemicolonKeyword_2());
		match_UiMaxLengthValidator_RightParenthesisKeyword_5_q = new TokenAlias(false, true, grammarAccess.getUiMaxLengthValidatorAccess().getRightParenthesisKeyword_5());
		match_UiMinLengthValidator_RightParenthesisKeyword_5_q = new TokenAlias(false, true, grammarAccess.getUiMinLengthValidatorAccess().getRightParenthesisKeyword_5());
		match_UiMobileNavigationPage_SemicolonKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getUiMobileNavigationPageAccess().getSemicolonKeyword_4_2());
		match_UiMobileView_SemicolonKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getUiMobileViewAccess().getSemicolonKeyword_3_2());
		match_UiNumericField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiNumericFieldAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUiNumericFieldAccess().getRightCurlyBracketKeyword_3_2()));
		match_UiRegexpValidator_RightParenthesisKeyword_5_q = new TokenAlias(false, true, grammarAccess.getUiRegexpValidatorAccess().getRightParenthesisKeyword_5());
		match_UiSearchDialog_SemicolonKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getUiSearchDialogAccess().getSemicolonKeyword_4_2());
		match_UiSearchDialog___SearchKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiSearchDialogAccess().getSearchKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getUiSearchDialogAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getUiSearchDialogAccess().getRightCurlyBracketKeyword_5_3()));
		match_UiTable_SemicolonKeyword_3_1_2_q = new TokenAlias(false, true, grammarAccess.getUiTableAccess().getSemicolonKeyword_3_1_2());
		match_UiTable_SemicolonKeyword_3_2_2_q = new TokenAlias(false, true, grammarAccess.getUiTableAccess().getSemicolonKeyword_3_2_2());
		match_UiTable_SemicolonKeyword_3_3_2_q = new TokenAlias(false, true, grammarAccess.getUiTableAccess().getSemicolonKeyword_3_3_2());
		match_UiTable___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiTableAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUiTableAccess().getRightCurlyBracketKeyword_3_6()));
		match_UiTextField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUiTextFieldAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUiTextFieldAccess().getRightCurlyBracketKeyword_3_2()));
		match_UiValidatorAlias_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getUiValidatorAliasAccess().getSemicolonKeyword_4());
		match_UiValidatorAssignment_SemicolonKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getUiValidatorAssignmentAccess().getSemicolonKeyword_3_1_1());
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_UiBeanSlot_SemicolonKeyword_4_q.equals(syntax))
				emit_UiBeanSlot_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiBindingEndpointAlias_SemicolonKeyword_4_q.equals(syntax))
				emit_UiBindingEndpointAlias_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiBinding_SemicolonKeyword_5_q.equals(syntax))
				emit_UiBinding_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiCheckBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_UiCheckBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiColumn_SemicolonKeyword_4_q.equals(syntax))
				emit_UiColumn_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiComboBox_SemicolonKeyword_3_1_2_q.equals(syntax))
				emit_UiComboBox_SemicolonKeyword_3_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiComboBox_SemicolonKeyword_3_2_2_q.equals(syntax))
				emit_UiComboBox_SemicolonKeyword_3_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiComboBox_SemicolonKeyword_3_3_2_q.equals(syntax))
				emit_UiComboBox_SemicolonKeyword_3_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiComboBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_5__q.equals(syntax))
				emit_UiComboBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiDialog_SemicolonKeyword_4_2_q.equals(syntax))
				emit_UiDialog_SemicolonKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiDialog_SemicolonKeyword_5_1_q.equals(syntax))
				emit_UiDialog_SemicolonKeyword_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiGridLayout___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_1__q.equals(syntax))
				emit_UiGridLayout___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiIDEView_SemicolonKeyword_3_2_q.equals(syntax))
				emit_UiIDEView_SemicolonKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiImage_SemicolonKeyword_3_1_2_q.equals(syntax))
				emit_UiImage_SemicolonKeyword_3_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiImage___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_UiImage___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiImports_SemicolonKeyword_2_q.equals(syntax))
				emit_UiImports_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiMaxLengthValidator_RightParenthesisKeyword_5_q.equals(syntax))
				emit_UiMaxLengthValidator_RightParenthesisKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiMinLengthValidator_RightParenthesisKeyword_5_q.equals(syntax))
				emit_UiMinLengthValidator_RightParenthesisKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiMobileNavigationPage_SemicolonKeyword_4_2_q.equals(syntax))
				emit_UiMobileNavigationPage_SemicolonKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiMobileView_SemicolonKeyword_3_2_q.equals(syntax))
				emit_UiMobileView_SemicolonKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiNumericField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_UiNumericField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiRegexpValidator_RightParenthesisKeyword_5_q.equals(syntax))
				emit_UiRegexpValidator_RightParenthesisKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiSearchDialog_SemicolonKeyword_4_2_q.equals(syntax))
				emit_UiSearchDialog_SemicolonKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiSearchDialog___SearchKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_UiSearchDialog___SearchKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiTable_SemicolonKeyword_3_1_2_q.equals(syntax))
				emit_UiTable_SemicolonKeyword_3_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiTable_SemicolonKeyword_3_2_2_q.equals(syntax))
				emit_UiTable_SemicolonKeyword_3_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiTable_SemicolonKeyword_3_3_2_q.equals(syntax))
				emit_UiTable_SemicolonKeyword_3_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiTable___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q.equals(syntax))
				emit_UiTable___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiTextField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_UiTextField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiValidatorAlias_SemicolonKeyword_4_q.equals(syntax))
				emit_UiValidatorAlias_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UiValidatorAssignment_SemicolonKeyword_3_1_1_q.equals(syntax))
				emit_UiValidatorAssignment_SemicolonKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiBeanSlot_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiBindingEndpointAlias_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiBinding_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_UiCheckBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiColumn_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiComboBox_SemicolonKeyword_3_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiComboBox_SemicolonKeyword_3_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiComboBox_SemicolonKeyword_3_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_UiComboBox___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiDialog_SemicolonKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiDialog_SemicolonKeyword_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_UiGridLayout___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiIDEView_SemicolonKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiImage_SemicolonKeyword_3_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_UiImage___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiImports_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'?
	 */
	protected void emit_UiMaxLengthValidator_RightParenthesisKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'?
	 */
	protected void emit_UiMinLengthValidator_RightParenthesisKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiMobileNavigationPage_SemicolonKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiMobileView_SemicolonKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_UiNumericField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'?
	 */
	protected void emit_UiRegexpValidator_RightParenthesisKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiSearchDialog_SemicolonKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('search' '{' '}')?
	 */
	protected void emit_UiSearchDialog___SearchKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiTable_SemicolonKeyword_3_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiTable_SemicolonKeyword_3_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiTable_SemicolonKeyword_3_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_UiTable___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_UiTextField___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiValidatorAlias_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_UiValidatorAssignment_SemicolonKeyword_3_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
