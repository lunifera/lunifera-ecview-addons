

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
 
package org.lunifera.ecview.dsl.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiBinding
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiBrowser
import org.lunifera.ecview.semantic.uimodel.UiButton
import org.lunifera.ecview.semantic.uimodel.UiCheckBox
import org.lunifera.ecview.semantic.uimodel.UiColumn
import org.lunifera.ecview.semantic.uimodel.UiColumnAssignments
import org.lunifera.ecview.semantic.uimodel.UiComboBox
import org.lunifera.ecview.semantic.uimodel.UiCommand
import org.lunifera.ecview.semantic.uimodel.UiDateField
import org.lunifera.ecview.semantic.uimodel.UiDecimalField
import org.lunifera.ecview.semantic.uimodel.UiDialog
import org.lunifera.ecview.semantic.uimodel.UiFormLayout
import org.lunifera.ecview.semantic.uimodel.UiGridLayout
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout
import org.lunifera.ecview.semantic.uimodel.UiIDEView
import org.lunifera.ecview.semantic.uimodel.UiImage
import org.lunifera.ecview.semantic.uimodel.UiImports
import org.lunifera.ecview.semantic.uimodel.UiLabel
import org.lunifera.ecview.semantic.uimodel.UiList
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet
import org.lunifera.ecview.semantic.uimodel.UiMobileView
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiNumericField
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup
import org.lunifera.ecview.semantic.uimodel.UiProgressBar
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator
import org.lunifera.ecview.semantic.uimodel.UiSearchDialog
import org.lunifera.ecview.semantic.uimodel.UiSearchField
import org.lunifera.ecview.semantic.uimodel.UiSwitch
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment
import org.lunifera.ecview.semantic.uimodel.UiTabSheet
import org.lunifera.ecview.semantic.uimodel.UiTable
import org.lunifera.ecview.semantic.uimodel.UiTextArea
import org.lunifera.ecview.semantic.uimodel.UiTextField
import org.lunifera.ecview.semantic.uimodel.UiValidator
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout
import org.lunifera.ecview.semantic.uimodel.UiView
import org.lunifera.ecview.semantic.uimodel.UiViewSet
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField
import org.lunifera.ecview.semantic.uimodel.UiExposedAction

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class UIGrammarLabelProvider extends XbaseLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(UiModel ele) {
		ele.name
	}

	def text(UiImports ele) {
		if(ele.name != null) ele.name else "Import"
	}
	
	def text(UiIDEView ele) {
		if(ele.name != null) ele.name else "IDE View"
	}

	def text(UiMobileView ele) {
		if(ele.name != null) ele.name else "Mobile View"
	}

	def text(UiValidatorAlias ele) {
		if(ele.name != null) ele.name else "alias"
	}

	def text(UiBinding ele) {
		"Binding"
	}

	def text(UiBindingEndpointAlias ele) {
		if(ele.name != null) ele.name else "alias"
	}

	def text(UiBeanSlot ele) {
		if(ele.name != null) ele.name else "Beanslot"
	}

	def text(UiViewSet ele) {
		if(ele.name != null) ele.name else "ViewSet"
	}

	def text(UiFormLayout ele) {
		if(ele.name != null) ele.name else "Form"
	}
	
	def text(UiExposedAction ele) {
		if(ele.name != null) ele.name else "Action"
	}

	def text(UiVerticalLayout ele) {
		if(ele.name != null) ele.name else "Vertical Layout"
	}

	def text(UiHorizontalLayout ele) {
		if(ele.name != null) ele.name else "Horizontal Layout"
	}

	def text(UiVerticalComponentGroup ele) {
		if(ele.name != null) ele.name else "Vertical Group"
	}

	def text(UiHorizontalButtonGroup ele) {
		if(ele.name != null) ele.name else "Horizontal Group"
	}

	def text(UiTabSheet ele) {
		if(ele.name != null) ele.name else "Tabsheet"
	}

	def text(UiMobileTabSheet ele) {
		if(ele.name != null) ele.name else "Tabsheet"
	}

	def text(UiImage ele) {
		if(ele.name != null) ele.name else "Image"
	}

	def text(UiDialog ele) {
		if(ele.name != null) ele.name else "Dialog"
	}

	def text(UiMobileNavigationPage ele) {
		if(ele.name != null) ele.name else "Navigation Page"
	}

	def text(UiTextField ele) {
		if(ele.name != null) ele.name else "Textfield"
	}

	def text(UiTable ele) {
		if(ele.name != null) ele.name else "Table"
	}

	def text(UiComboBox ele) {
		if(ele.name != null) ele.name else "Checkbox"
	}
	
	def text(UiBeanReferenceField ele) {
		if(ele.name != null) ele.name else "Reference Field"
	}

	def text(UiButton ele) {
		if(ele.name != null) ele.name else "Button"
	}

	def text(UiMobileNavigationButton ele) {
		if(ele.name != null) ele.name else "Button"
	}

	def text(UiSwitch ele) {
		if(ele.name != null) ele.name else "Switch"
	}

	def text(UiColumnAssignments ele) {
		if(ele.name != null) ele.name else "column"
	}

	def text(UiColumn ele) {
		ele.name
	}

	def text(UiNumericField ele) {
		if(ele.name != null) ele.name else "Numberfield"
	}

	def text(UiCheckBox ele) {
		if(ele.name != null) ele.name else "Checkbox"
	}

	def text(UiMaxLengthValidator ele) {
		if(ele.name != null) ele.name else "Validator"
	}

	def text(UiMinLengthValidator ele) {
		if(ele.name != null) ele.name else "Validator"
	}

	def text(UiRegexpValidator ele) {
		if(ele.name != null) ele.name else "Validator"
	}

	def text(UiXbaseValidator ele) {
		if(ele.name != null) ele.name else "Validator"
	}

	def image(UiModel ele) {
		'UiModel.gif'
	}

	def image(UiOptionsGroup ele) {
		'UiOptionsGroup.gif'
	}

	def image(UiProgressBar ele) {
		'UiProgressBar.gif'
	}

	def image(UiImports ele) {
		'UiImport.gif'
	}

	def image(UiIDEView ele) {
		'UiView.gif'
	}

	def image(UiMobileView ele) {
		'UiView.gif'
	}

	def image(UiValidator ele) {
		'UiValidator.gif'
	}

	def image(UiValidatorAlias ele) {
		'UiValidatorAlias.gif'
	}

	def image(UiSearchDialog ele) {
		'UiSearchDialog.png'
	}

	def image(UiSearchField ele) {
		'UiSearchField.png'
	}

	def image(UiBinding ele) {
		'UiBinding.png'
	}

	def image(UiBindingEndpointAlias ele) {
		'UiBeanSlot.gif'
	}

	def image(UiBeanSlot ele) {
		'UiBeanSlot.gif'
	}

	def image(UiView ele) {
		'UiView.gif'
	}

	def image(UiViewSet ele) {
		'UiViewSet.png'
	}

	def image(UiFormLayout ele) {
		'UiFormLayout.gif'
	}

	def image(UiGridLayout ele) {
		'UiGridLayout.png'
	}

	def image(UiVerticalLayout ele) {
		'UiVerticalLayout.gif'
	}
	
	def image(UiI18nInfo ele) {
		'UiI18nInfo.gif'
	}

	def image(UiHorizontalLayout ele) {
		'UiHorizontalLayout.gif'
	}

	def image(UiVerticalComponentGroup ele) {
		'UiVerticalComponentGroup.gif'
	}

	def image(UiHorizontalButtonGroup ele) {
		'UiHorizontalButtonGroup.gif'
	}

	def image(UiTabSheet ele) {
		'UiTabSheet.png'
	}

	def image(UiTabAssignment ele) {
		'UiTabAssignment.gif'
	}

	def image(UiMobileTabSheet ele) {
		'UiMobileTabSheet.gif'
	}

	def image(UiMobileTabAssignment ele) {
		'UiMobileTabAssignment.gif'
	}

	def image(UiImage ele) {
		'UiImage.gif'
	}

	def image(UiDialog ele) {
		'UiDialog.png'
	}

	def image(UiMobileNavigationPage ele) {
		'UiMobileNavigationPage.gif'
	}

	def image(UiTextField ele) {
		'UiTextField.gif'
	}
	
	def image(UiTextArea ele) {
		'UiTextArea.gif'
	}

	def image(UiTable ele) {
		'UiTable.gif'
	}

	def image(UiComboBox ele) {
		'UiCombobox.gif'
	}
	
	def image(UiBeanReferenceField ele) {
		'UiBeanReferenceField.gif'
	}
	
	def image(UiExposedAction ele) {
		'UiExposedAction.png'
	}

	def image(UiCommand ele) {
		'UiCommand.gif'
	}

	def image(UiButton ele) {
		'UiButton.gif'
	}

	def image(UiLabel ele) {
		'UiLabel.png'
	}

	def image(UiList ele) {
		'UiList.png'
	}

	def image(UiBrowser ele) {
		'UiBrowser.png'
	}

	def image(UiMobileNavigationButton ele) {
		'UiMobileNavigationButton.gif'
	}

	def image(UiSwitch ele) {
		'UiSwitch.gif'
	}

	def image(UiColumnAssignments ele) {
		'UiColumnAssignments.gif'
	}

	def image(UiColumn ele) {
		'UiColumn.gif'
	}

	def image(UiDateField ele) {
		'UiDateField.gif'
	}

	def image(UiDecimalField ele) {
		'UiDecimalField.gif'
	}

	def image(UiNumericField ele) {
		'UiNumericField.gif'
	}

	def image(UiCheckBox ele) {
		'UiCheckBox.gif'
	}

	def image(UiMaxLengthValidator ele) {
		'UiValidator.gif'
	}

	def image(UiMinLengthValidator ele) {
		'UiValidator.gif'
	}

	def image(UiRegexpValidator ele) {
		'UiValidator.gif'
	}

	def image(UiXbaseValidator ele) {
		'UiValidator.gif'
	}

}
