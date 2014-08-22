package org.lunifera.ecview.dsl.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.xbase.formatting.XbaseFormatter;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBeanSlotElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBindingElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiBindingEndpointAliasElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiButtonElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiCheckBoxElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiColumnAssignmentsElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiColumnElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiComboBoxElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiDialogElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiEmbeddableElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiFormLayoutElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiIDEViewElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiImageElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiListElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileNavigationButtonElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileNavigationPageElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileTabAssignmentElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileTabSheetElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiMobileViewElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiNumericFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTabAssignmentElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTabSheetElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTableElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiTextFieldElements;
import org.lunifera.ecview.dsl.services.UIGrammarGrammarAccess.UiViewSetElements;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;

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

		configureUiModel(c, f.getUiModelAccess());
		configureUiIdeView(c, f.getUiIDEViewAccess());
		configureMobileView(c, f.getUiMobileViewAccess());

		// Viewset
		configureUiViewSet(c, f.getUiViewSetAccess());
		// Tabsheet
		configureUiTabSheet(c, f.getUiTabSheetAccess());
		// Tab
		configureUiTab(c, f.getUiTabAssignmentAccess());
		// MobileTab
		configureUiMobileTab(c, f.getUiMobileTabSheetAccess());
		// Columns
		configureUiColumns(c, f.getUiColumnAssignmentsAccess());
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
		// Button
		configureUiButton(c, f.getUiButtonAccess());
		// MobileNavigationButton
		configureUiMobileNavigationButton(c,
				f.getUiMobileNavigationButtonAccess());
		// MobileNavigationPage
		configureUiMobileNavigationPage(c, f.getUiMobileNavigationPageAccess());
		// Dialog
		configureUiDialog(c, f.getUiDialogAccess());

		for (Keyword kw : f.findKeywords("{")) {
			c.setSpace(" ").before(kw);
			c.setLinewrap(1).after(kw);
			c.setIndentationIncrement().after(kw);
		}

		for (Keyword kw : f.findKeywords("}")) {
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

	}

	private void configureUiMobileNavigationPage(FormattingConfig c,
			UiMobileNavigationPageElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_4_0());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_7());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7());
	}

	private void configureUiDialog(FormattingConfig c, UiDialogElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_4_0());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_7());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_7());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_7());
	}

	private void configureUiList(FormattingConfig c, UiListElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getListSelectKeyword_1());
	}

	private void configureUiImage(FormattingConfig c, UiImageElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getImageKeyword_1());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_3());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_3());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_3_3());
	}

	private void configureUiNumericFiled(FormattingConfig c,
			UiNumericFieldElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getNumericFieldKeyword_1());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_2());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_2());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_3_2());
	}

	private void configureUiCheckBox(FormattingConfig c, UiCheckBoxElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getCheckboxKeyword_1());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_2());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_2());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_3_2());
	}

	private void configureUiTable(FormattingConfig c, UiTableElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_3_1_0());
		c.setLinewrap(1, 1, 2).before(ele.getSelectionTypeKeyword_3_2_0());
		c.setLinewrap(1, 1, 2).before(ele.getImageFieldKeyword_3_3_0());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_6());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_6());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_3_6());
	}

	public void configureUiModel(FormattingConfig c,
			UIGrammarGrammarAccess.UiModelElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).after(ele.getPackageNameAssignment_1());
		c.setLinewrap().around(ele.getImportsAssignment_2());
	}

	private void configureUiIdeView(FormattingConfig c, UiIDEViewElements ele) {
		// linewrap
		c.setLinewrap(1).before(ele.getIdeviewKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_9());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_9());
	}

	private void configureMobileView(FormattingConfig c,
			UiMobileViewElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getMobileKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_9());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_9());
	}

	private void configureUiViewSet(FormattingConfig c, UiViewSetElements ele) {
		// linewrap
		c.setLinewrap(1).before(ele.getViewsetKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_5());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_5());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_5());
	}

	private void configureUiTabSheet(FormattingConfig c, UiTabSheetElements ele) {
		// linewrap
		c.setLinewrap(1).before(ele.getTabsheetKeyword_1());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_5());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_5());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_5());
	}

	private void configureUiTab(FormattingConfig c, UiTabAssignmentElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getTabKeyword_0());
	}

	private void configureUiMobileTab(FormattingConfig c,
			UiMobileTabSheetElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getMobileTabKeyword_1());
	}

	private void configureUiForms(FormattingConfig c, UiFormLayoutElements ele) {
		// linewrap
		// c.setLinewrap(1, 1, 2).before(ele.getFormKeyword_1());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_5());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_5());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_5());
	}

	private void configureUiColumns(FormattingConfig c,
			UiColumnAssignmentsElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getColumnsKeyword_1());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_2());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_4());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_4());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_2());
		c.setIndentationDecrement().before(ele.getRightCurlyBracketKeyword_4());
	}

	private void configureUiBeanSlot(FormattingConfig c, UiBeanSlotElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getDatasourceKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getJvmTypeAssignment_3());
	}

	private void configureUiBindingEndpointAlias(FormattingConfig c,
			UiBindingEndpointAliasElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getDataAliasKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getAliasAssignment_3());
	}

	private void configureUiBinding(FormattingConfig c, UiBindingElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getBindKeyword_0());
		c.setLinewrap(1, 1, 2).after(ele.getTargetAssignment_4());
	}

	private void configureUiTextField(FormattingConfig c,
			UiTextFieldElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getTextfieldKeyword_1());
	}

	private void configureUiColumn(FormattingConfig c, UiColumnElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getColumnKeyword_1());
	}

	private void configureUiButton(FormattingConfig c, UiButtonElements ele) {
		c.setLinewrap(1, 1, 2).before(ele.getButtonKeyword_1());
	}

	private void configureUiMobileNavigationButton(FormattingConfig c,
			UiMobileNavigationButtonElements ele) {
		c.setLinewrap(1, 1, 2)
				.before(ele.getUiMobileNavigationButtonAction_0());
	}

	private void configureUiComboBoxAccess(FormattingConfig c,
			UiComboBoxElements ele) {
		// linewrap
		c.setLinewrap(1, 1, 2).before(ele.getTypeKeyword_3_1_0());
		c.setLinewrap(1, 1, 2).before(ele.getCaptionFieldKeyword_3_2_0());
		c.setLinewrap(1, 1, 2).before(ele.getImageFieldKeyword_3_3_0());
		c.setLinewrap(1, 1, 2).after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setLinewrap(1).before(ele.getRightCurlyBracketKeyword_3_5());
		c.setLinewrap(1, 1, 2).after(ele.getRightCurlyBracketKeyword_3_5());
		// indentation
		c.setIndentationIncrement().after(ele.getLeftCurlyBracketKeyword_3_0());
		c.setIndentationDecrement().before(
				ele.getRightCurlyBracketKeyword_3_5());
	}

}
