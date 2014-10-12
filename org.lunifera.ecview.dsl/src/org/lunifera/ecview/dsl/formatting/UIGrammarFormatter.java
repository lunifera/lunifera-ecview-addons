package org.lunifera.ecview.dsl.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.xbase.formatting.XbaseFormatter;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiActionElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBeanReferenceFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBeanSlotElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBindingElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBindingEndpointAliasElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBrowserElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiButtonElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiChangeTriggerElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiCheckBoxElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiColumnElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiColumnsAssignmentElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiComboBoxElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiDateFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiDecimalFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiDialogElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiErrorCodeElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiExposedActionElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiFormLayoutElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiGridLayoutElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiHorizontalLayoutElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiIDEViewElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiImageElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiLabelElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiListElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileHorizontalButtonGroupElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileNavigationButtonElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileNavigationCommandElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileNavigationPageElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileSwitchElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileTabSheetElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileVerticalComponentGroupElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileViewElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiNumericFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiOpenDialogCommandElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiOptionsGroupElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiProgressBarElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiSearchDialogElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiSearchFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiSearchPanelElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiSearchWithDialogCommandElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTabAssignmentElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTabSheetElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTableElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTextAreaElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTextFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiValidatorAliasElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiValidatorAssignmentElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiVerticalLayoutElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiViewSetElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiVisibilityProcessorElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiXbaseVisibilityRuleElements;

import com.google.inject.Inject;

public class UIGrammarFormatter extends AbstractDeclarativeFormatter {

	@Inject
	private UIGrammarGrammarAccess ga;
	@Inject
	private XbaseFormatter xbaseFormatter;

	protected void configureFormatting(FormattingConfig c) {
		configure(c, (UIGrammarGrammarAccess) getGrammarAccess());
	}

	protected void configure(FormattingConfig c, UIGrammarGrammarAccess ga) {

		UIGrammarGrammarAccess f = (UIGrammarGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(120);
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).after(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(1, 1, 1).after(f.getML_COMMENTRule());

		// Modell
		configureUiModel(c, f.getUiModelAccess());
		// IDEView
		configureUiIdeView(c, f.getUiIDEViewAccess());
		// MobileView
		configureMobileView(c, f.getUiMobileViewAccess());
		// Viewset
		configureUiViewSet(c, f.getUiViewSetAccess());
		// Actions
		configureExposedActions(c, f.getUiExposedActionAccess());
		// Tabsheet
		configureUiTabSheet(c, f.getUiTabSheetAccess());
		// Tab
		configureUiTab(c, f.getUiTabAssignmentAccess());
		// MobileTab
		configureUiMobileTab(c, f.getUiMobileTabSheetAccess());
		// Columns
		configureUiColumns(c, f.getUiColumnsAssignmentAccess());
		// Forms
		configureUiForms(c, f.getUiFormLayoutAccess());
		// Combobox
		configureUiComboBoxAccess(c, f.getUiComboBoxAccess());
		// Table
		configureUiTable(c, f.getUiTableAccess());
		// Checkbox
		configureUiCheckBox(c, f.getUiCheckBoxAccess());
		// NumericFiled
		configureUiNumericFiled(c, f.getUiNumericFieldAccess());
		// Image
		configureUiImage(c, f.getUiImageAccess());
		// List
		configureUiList(c, f.getUiListAccess());
		// datasource
		configureUiBeanSlot(c, f.getUiBeanSlotAccess());
		// dataAlias
		configureUiBindingEndpointAlias(c, f.getUiBindingEndpointAliasAccess());
		// bind
		configureUiBinding(c, f.getUiBindingAccess());
		// column
		configureUiColumn(c, f.getUiColumnAccess());
		// Textfield
		configureUiTextField(c, f.getUiTextFieldAccess());
		// Decimalfield
		configureUiDecimalField(c, f.getUiDecimalFieldAccess());
		// Optionsgroup
		configureUiOptionsGroup(c, f.getUiOptionsGroupAccess());
		// Progressbar
		configureUiProgressbar(c, f.getUiProgressBarAccess());
		// BeanField
		configureUiBeanReferenceField(c, f.getUiBeanReferenceFieldAccess());
		// Searchdialog
		configureUiSearchDialog(c, f.getUiSearchDialogAccess());
		// Searchfield
		configureUiSearchfield(c, f.getUiSearchFieldAccess());
		// Textarea
		configureUiTextArea(c, f.getUiTextAreaAccess());
		// Browser
		configureUiBrowser(c, f.getUiBrowserAccess());
		// Datefield
		configureUiDatefield(c, f.getUiDateFieldAccess());
		// ValidatorALias
		configureUiValidatorAlias(c, f.getUiValidatorAliasAccess());
		// FieldValidation
		configureUiFieldValidation(c, f.getUiValidatorAssignmentAccess());
		// GridLayout
		configureUiGridLayout(c, f.getUiGridLayoutAccess());
		// VerticalLayout
		configureUiVerticalLayout(c, f.getUiVerticalLayoutAccess());
		// HorizontalLayout
		configureUiHorizontalLayout(c, f.getUiHorizontalLayoutAccess());
		// HorizontalButtonGroup
		configureUiHorizontalButtonGroup(c,
				f.getUiMobileHorizontalButtonGroupAccess());
		// SearchPanel
		configureUiSearchPanel(c, f.getUiSearchPanelAccess());
		// VerticalGroup
		configureUiVerticalGroup(c, f.getUiMobileVerticalComponentGroupAccess());
		// Button
		configureUiButton(c, f.getUiButtonAccess());
		// MobileNavigationButton
		configureUiMobileNavigationButton(c,
				f.getUiMobileNavigationButtonAccess());
		// MobileNavigationPage
		configureUiMobileNavigationPage(c, f.getUiMobileNavigationPageAccess());
		// NavigateTo
		configureUiNavigateTo(c, f.getUiMobileNavigationCommandAccess());
		// Dialog
		configureUiDialog(c, f.getUiDialogAccess());
		// switchIt
		configureUiSwitchIt(c, f.getUiMobileSwitchAccess());
		// UiLabel
		configureUiLabel(c, f.getUiLabelAccess());
		// Visibility
		configureUiVisibility(c, f.getUiVisibilityProcessorAccess());
		configureUiVisibilityRule(c, f.getUiXbaseVisibilityRuleAccess());
		// fireOn
		configureUiFireOn(c, f.getUiChangeTriggerAccess());
		// openDialog
		configureUiOpenDialog(c, f.getUiOpenDialogCommandAccess());
		// searchWithCommand
		configureUiSearchWithCommand(c, f.getUiSearchWithDialogCommandAccess());
		// errorCodes
		configureUiErrorCode(c, f.getUiErrorCodeAccess());

		for (Keyword kw : f.findKeywords("{")) {
			c.setSpace(" ").before(kw);
			c.setLinewrap(1).after(kw);
			c.setIndentationIncrement().after(kw);
		}

		for (Keyword kw : f.findKeywords("}")) {
			c.setLinewrap(1).before(kw);
			c.setLinewrap(1).after(kw);
			c.setIndentationDecrement().before(kw);
		}

		for (Keyword kw : ga.findKeywords(".")) {
			c.setNoSpace().before(kw);
			c.setNoSpace().after(kw);
		}
		for (Keyword kw : ga.findKeywords(":")) {
			c.setNoSpace().before(kw);
			c.setNoSpace().after(kw);
		}
		for (Keyword kw : ga.findKeywords("<")) {
			c.setNoSpace().after(kw);
			c.setSpace(" ").before(kw);
		}
		for (Keyword kw : ga.findKeywords(">")) {
			c.setNoSpace().before(kw);
			c.setSpace(" ").after(kw);
		}
		for (Keyword kw : ga.findKeywords(";")) {
			c.setNoSpace().before(kw);
			c.setLinewrap(1, 1, 2).after(kw);
		}
		for (Keyword kw : ga.findKeywords("@")) {
			c.setNoSpace().after(kw);
		}
		for (Keyword kw : ga.findKeywords("(")) {
			c.setNoSpace().after(kw);
			c.setNoSpace().before(kw);
		}
		for (Keyword kw : ga.findKeywords(")")) {
			c.setNoSpace().before(kw);
		}
		for (Keyword kw : ga.findKeywords("[")) {
			c.setNoSpace().after(kw);
		}
		for (Keyword kw : ga.findKeywords("]")) {
			c.setNoSpace().before(kw);
		}
	}

	private void configureExposedActions(FormattingConfig c,
			UiExposedActionElements ele) {
		c.setLinewrap(1, 1, 2).around(ele.getRule());
	}

	private void configureUiErrorCode(FormattingConfig c,
			UiErrorCodeElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getCodeKeyword_0());
	}

	private void configureUiSearchWithCommand(FormattingConfig c,
			UiSearchWithDialogCommandElements ele) {
	}

	private void configureUiOpenDialog(FormattingConfig c,
			UiOpenDialogCommandElements ele) {
	}

	private void configureUiNavigateTo(FormattingConfig c,
			UiMobileNavigationCommandElements ele) {
	}

	private void configureUiFireOn(FormattingConfig c,
			UiChangeTriggerElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getFireOnKeyword_0());
	}

	private void configureUiVisibility(FormattingConfig c,
			UiVisibilityProcessorElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getVisibilityKeyword_1());
		c.setLinewrap(1, 1, 2).before(ele.getChangeTriggersAssignment_4_1());
		c.setLinewrap(1, 1, 2).before(ele.getDataUsedAssignment_4_0());
		c.setLinewrap(1, 1, 2).before(ele.getImportedElementsAssignment_4_2());
		c.setLinewrap(1, 2, 3).before(ele.getRuleAssignment_5());
	}

	private void configureUiVisibilityRule(FormattingConfig c,
			UiXbaseVisibilityRuleElements ele) {
		c.setLinewrap(1, 1, 2).around(ele.getRule());
	}

	private void configureUiLabel(FormattingConfig c, UiLabelElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getLabelKeyword_1());
	}

	private void configureUiSwitchIt(FormattingConfig c,
			UiMobileSwitchElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getSwitchItKeyword_1());
	}

	private void configureUiVerticalGroup(FormattingConfig c,
			UiMobileVerticalComponentGroupElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getVerticalGroupKeyword_1());
	}

	private void configureUiHorizontalButtonGroup(FormattingConfig c,
			UiMobileHorizontalButtonGroupElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getHorizontalButtonGroupKeyword_1());
	}

	private void configureUiHorizontalLayout(FormattingConfig c,
			UiHorizontalLayoutElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getHorizontalLayoutKeyword_1());
	}

	private void configureUiSearchPanel(FormattingConfig c,
			UiSearchPanelElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getSearchPanelKeyword_1());
	}

	private void configureUiVerticalLayout(FormattingConfig c,
			UiVerticalLayoutElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getVerticalLayoutKeyword_1());
		c.setLinewrap(1, 1, 2).before(ele.getContentsAssignment_5());
		// // Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_4());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_8());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_4());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_8());
	}

	private void configureUiGridLayout(FormattingConfig c,
			UiGridLayoutElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getGridlayoutKeyword_1());
	}

	private void configureUiFieldValidation(FormattingConfig c,
			UiValidatorAssignmentElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getFieldValidationKeyword_0());
	}

	private void configureUiValidatorAlias(FormattingConfig c,
			UiValidatorAliasElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getValidatorAliasKeyword_0());
	}

	private void configureUiSearchfield(FormattingConfig c,
			UiSearchFieldElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getSearchfieldKeyword_1());
	}

	private void configureUiTextArea(FormattingConfig c, UiTextAreaElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getTextareaKeyword_1());
		c.setLinewrap(1, 1, 2).before(ele.getValidatorsAssignment_4_1_0());
	}

	private void configureUiSearchDialog(FormattingConfig c,
			UiSearchDialogElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getSearchdialogKeyword_1());
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_5_0());
		c.setLinewrap(1, 1, 2).before(ele.getSearchKeyword_6_0());
		c.setLinewrap(1, 1, 2).before(ele.getContentKeyword_7_0());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_5_1());
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_6_1());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_5_3());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_6_3());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_9());
		// // indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_5_1());
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_6_1());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_5_3());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_6_3());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_9());
	}

	private void configureUiDatefield(FormattingConfig c,
			UiDateFieldElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getDatefieldKeyword_1());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_3());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_3());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_3());
	}

	private void configureUiBrowser(FormattingConfig c, UiBrowserElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getBrowserKeyword_1());
		// // Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_3());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_3());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_3());
	}

	private void configureUiProgressbar(FormattingConfig c,
			UiProgressBarElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getProgressbarKeyword_1());
		c.setLinewrap(1, 1, 2).before(ele.getValidatorsAssignment_4_1_0());
		c.setLinewrap(1, 1, 2).before(
				ele.getProcessorAssignmentsAssignment_4_2());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_3());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_3());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_3());
	}

	private void configureUiOptionsGroup(FormattingConfig c,
			UiOptionsGroupElements ele) {
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_4());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_4());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_4());
	}

	private void configureUiMobileNavigationPage(FormattingConfig c,
			UiMobileNavigationPageElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_5_0());
		// // Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_8());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_8());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_8());
	}

	private void configureUiDialog(FormattingConfig c, UiDialogElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_5_0());
		// // Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_8());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_8());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_8());
	}

	private void configureUiList(FormattingConfig c, UiListElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getListSelectKeyword_1());
	}

	private void configureUiImage(FormattingConfig c, UiImageElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getImageKeyword_1());
		// // Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_4());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_4());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_4());
	}

	private void configureUiNumericFiled(FormattingConfig c,
			UiNumericFieldElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getNumericFieldKeyword_1());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_4_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_4_3());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_4_3());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_4_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_4_3());
	}

	private void configureUiCheckBox(FormattingConfig c, UiCheckBoxElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getCheckboxKeyword_1());
		// // Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_3());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_3());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_3());
	}

	private void configureUiTable(FormattingConfig c, UiTableElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_4_1_0_0());
		c.setLinewrap(1, 1, 2).before(ele.getSelectionTypeKeyword_4_1_1_0());
		c.setLinewrap(1, 1, 2).before(ele.getImageFieldKeyword_4_1_2_0());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_5());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_5());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_5());
	}

	private void configureUiBeanReferenceField(FormattingConfig c,
			UiBeanReferenceFieldElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_4_1_0_0());
		c.setLinewrap(1, 1, 2).before(ele.getCaptionFieldKeyword_4_1_1_0());
		c.setLinewrap(1, 1, 2).before(ele.getImageFieldKeyword_4_1_3_0());
		c.setLinewrap(1, 1, 2).before(ele.getInMemoryServiceKeyword_4_1_4_0());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_5());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_5());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_5());
	}

	public void configureUiModel(FormattingConfig c,
			UIGrammarGrammarAccess.UiModelElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).after(ele.getPackageNameAssignment_1());
		c.setLinewrap(1, 1, 2).around(ele.getImportsAssignment_2());
		// c.setLinewrap().around(ele.getRootsAssignment_3());
	}

	private void configureUiIdeView(FormattingConfig c, UiIDEViewElements ele) {
		// Keyword
		c.setLinewrap(1).before(ele.getIdeviewKeyword_0());
		c.setLinewrap(1, 1, 2).before(ele.getViewsetKeyword_3_0_0());
		c.setLinewrap(1, 1, 2).before(
				ele.getProcessorAssignmentsAssignment_7_3());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());
		// // indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7());
	}

	private void configureMobileView(FormattingConfig c,
			UiMobileViewElements ele) {
		// Keyword
		c.setLinewrap(1, 1, 2).before(ele.getMobileKeyword_0());
		c.setLinewrap(1, 1, 2).before(ele.getViewsetKeyword_3_0());
		c.setLinewrap(1, 1, 2).before(
				ele.getProcessorAssignmentsAssignment_7_3());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());
		// // indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7());
	}

	private void configureUiViewSet(FormattingConfig c, UiViewSetElements ele) {
		// Keywords
		c.setLinewrap(1).before(ele.getViewsetKeyword_0());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_5());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_5());
		// // indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_5());
	}

	private void configureUiTabSheet(FormattingConfig c, UiTabSheetElements ele) {
		// Keywords
		c.setLinewrap(1).before(ele.getTabsheetKeyword_1());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_7());
		// // indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7());
	}

	private void configureUiTab(FormattingConfig c, UiTabAssignmentElements ele) {
		// Keyword
		c.setLinewrap(1, 1, 2).before(ele.getTabKeyword_0());
	}

	private void configureUiMobileTab(FormattingConfig c,
			UiMobileTabSheetElements ele) {
		// Keyword
		c.setLinewrap(1, 1, 2).before(ele.getMobileTabKeyword_1());
	}

	private void configureUiForms(FormattingConfig c, UiFormLayoutElements ele) {
		// Keywords
		// c.setLinewrap(1, 1, 2).before(ele.getFormKeyword_1());
		c.setLinewrap(1, 1, 2).after(ele.getContentsAssignment_5());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_7());
		// // indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7());
	}

	private void configureUiColumns(FormattingConfig c,
			UiColumnsAssignmentElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getColumnsKeyword_1());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_4());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_4());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		// c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_4());
	}

	private void configureUiBeanSlot(FormattingConfig c, UiBeanSlotElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getDatasourceKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getJvmTypeAssignment_3());
	}

	private void configureUiBindingEndpointAlias(FormattingConfig c,
			UiBindingEndpointAliasElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getDataAliasKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getAliasAssignment_3());
	}

	private void configureUiBinding(FormattingConfig c, UiBindingElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getBindKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getTargetAssignment_4());
	}

	private void configureUiTextField(FormattingConfig c,
			UiTextFieldElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getTextfieldKeyword_1());
		c.setLinewrap(1, 1, 2).before(ele.getValidatorsAssignment_4_1_0());
		c.setLinewrap(1, 1, 2).before(ele.getBindingsAssignment_4_1_1());
	}

	private void configureUiNumericField(FormattingConfig c,
			UiNumericFieldElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getNumericFieldKeyword_1());
	}

	private void configureUiDecimalField(FormattingConfig c,
			UiDecimalFieldElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getDecimalFieldKeyword_1());
	}

	private void configureUiColumn(FormattingConfig c, UiColumnElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getColumnKeyword_1());
	}

	private void configureUiButton(FormattingConfig c, UiButtonElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getButtonKeyword_1());
	}

	private void configureUiMobileNavigationButton(FormattingConfig c,
			UiMobileNavigationButtonElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2)
				.before(ele.getUiMobileNavigationButtonAction_0());
	}

	private void configureUiComboBoxAccess(FormattingConfig c,
			UiComboBoxElements ele) {
		// Keywords
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_4_1_0_0());
		c.setLinewrap(1, 1, 2).before(ele.getCaptionFieldKeyword_4_1_1_0());
		c.setLinewrap(1, 1, 2).before(ele.getImageFieldKeyword_4_1_3_0());
		// Brackets
		// c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_4());
		// c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_4());
		// // Indentation
		// c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		// c.setIndentationDecrement().before(
		// ele.getRightCurlyBracketKeyword_3_4());
	}

}
