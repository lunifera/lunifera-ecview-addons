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


package org.lunifera.ecview.dsl.ui.outline

import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiBinding
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiComboBox
import org.lunifera.ecview.semantic.uimodel.UiFormLayout
import org.lunifera.ecview.semantic.uimodel.UiGridLayout
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout
import org.lunifera.ecview.semantic.uimodel.UiList
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup
import org.lunifera.ecview.semantic.uimodel.UiTabSheet
import org.lunifera.ecview.semantic.uimodel.UiTable
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class UIGrammarOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _isLeaf(UiBinding object) {
		return true;
	}

	def _isLeaf(UiBeanSlot object) {
		return true;
	}
	
	def _isLeaf(UiBindingEndpointAlias object) {
		return true;
	}
	
	def _isLeaf(UiBeanReferenceField object) {
		return true;
	}

	def void _createChildren(IOutlineNode parentNode, UiModel modelElement) {
		for (childElement : modelElement.roots) {
			createNode(parentNode, childElement);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiVerticalLayout modelElement) {
		for (childElement : modelElement.contents) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiHorizontalLayout modelElement) {
		for (childElement : modelElement.contents) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiHorizontalButtonGroup modelElement) {
		for (childElement : modelElement.contents) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiVerticalComponentGroup modelElement) {
		for (childElement : modelElement.contents) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiGridLayout modelElement) {
		for (childElement : modelElement.contents) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiFormLayout modelElement) {
		for (childElement : modelElement.contents) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiMobileNavigationPage modelElement) {
		for (childElement : modelElement.contents) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiTabSheet modelElement) {
		for (childElement : modelElement.tabs) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiMobileTabSheet modelElement) {
		for (childElement : modelElement.tabs) {
			createNode(parentNode, childElement.element);
		}
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiTable modelElement) {
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiOptionsGroup modelElement) {
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiComboBox modelElement) {
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiList modelElement) {
		for (binding : modelElement.bindings) {
			createNode(parentNode, binding);
		}
	}

	def void _createChildren(IOutlineNode parentNode, UiBindingEndpointAlias modelElement) {
		//		for(binding : modelElement.bindings){
		//			createNode(parentNode, binding);
		//		}
	}

	def void _createChildren(IOutlineNode parentNode, UiBinding modelElement) {
	}

}
