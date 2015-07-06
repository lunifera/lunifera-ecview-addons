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
package org.lunifera.ecview.dsl.ui.outline;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiFormLayout;
import org.lunifera.ecview.semantic.uimodel.UiFormLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiMobileEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPageAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRoot;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationRootAssigment;
import org.lunifera.ecview.semantic.uimodel.UiMobileSearchPanel;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup;
import org.lunifera.ecview.semantic.uimodel.UiRootElements;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiSearchPanel;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroupAssigment;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayoutAssigment;
import org.lunifera.ecview.semantic.uimodel.UiVisibilityProcessorAssignment;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class UIGrammarOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final UiBinding object) {
    return true;
  }
  
  public boolean _isLeaf(final UiBeanSlot object) {
    return true;
  }
  
  public boolean _isLeaf(final UiBindingEndpointAlias object) {
    return true;
  }
  
  public boolean _isLeaf(final UiBeanReferenceField object) {
    return true;
  }
  
  public boolean _isLeaf(final UiVisibilityProcessorAssignment object) {
    return true;
  }
  
  public boolean _isLeaf(final UiXbaseValidator object) {
    return true;
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiModel modelElement) {
    EList<UiRootElements> _roots = modelElement.getRoots();
    for (final UiRootElements childElement : _roots) {
      this.createNode(parentNode, childElement);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiVerticalLayout modelElement) {
    EList<UiVerticalLayoutAssigment> _contents = modelElement.getContents();
    for (final UiVerticalLayoutAssigment childElement : _contents) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiHorizontalLayout modelElement) {
    EList<UiHorizontalLayoutAssigment> _contents = modelElement.getContents();
    for (final UiHorizontalLayoutAssigment childElement : _contents) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiMobileNavigationRoot modelElement) {
    EList<UiMobileNavigationRootAssigment> _contents = modelElement.getContents();
    for (final UiMobileNavigationRootAssigment childElement : _contents) {
      UiMobileEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiHorizontalButtonGroup modelElement) {
    EList<UiHorizontalButtonGroupAssigment> _contents = modelElement.getContents();
    for (final UiHorizontalButtonGroupAssigment childElement : _contents) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiVerticalComponentGroup modelElement) {
    EList<UiVerticalComponentGroupAssigment> _contents = modelElement.getContents();
    for (final UiVerticalComponentGroupAssigment childElement : _contents) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiGridLayout modelElement) {
    EList<UiGridLayoutAssigment> _contents = modelElement.getContents();
    for (final UiGridLayoutAssigment childElement : _contents) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiFormLayout modelElement) {
    EList<UiFormLayoutAssigment> _contents = modelElement.getContents();
    for (final UiFormLayoutAssigment childElement : _contents) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiMobileNavigationPage modelElement) {
    EList<UiMobileNavigationPageAssignment> _contents = modelElement.getContents();
    for (final UiMobileNavigationPageAssignment childElement : _contents) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiMobileSearchPanel modelElement) {
    EList<UiSearchField> _contents = modelElement.getContents();
    for (final UiSearchField childElement : _contents) {
      this.createNode(parentNode, childElement);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiSearchPanel modelElement) {
    EList<UiSearchField> _contents = modelElement.getContents();
    for (final UiSearchField childElement : _contents) {
      this.createNode(parentNode, childElement);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiTabSheet modelElement) {
    EList<UiTabAssignment> _tabs = modelElement.getTabs();
    for (final UiTabAssignment childElement : _tabs) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiMobileTabSheet modelElement) {
    EList<UiMobileTabAssignment> _tabs = modelElement.getTabs();
    for (final UiMobileTabAssignment childElement : _tabs) {
      UiEmbeddable _element = childElement.getElement();
      this.createNode(parentNode, _element);
    }
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiTable modelElement) {
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiOptionsGroup modelElement) {
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiComboBox modelElement) {
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiList modelElement) {
    EList<UiBinding> _bindings = modelElement.getBindings();
    for (final UiBinding binding : _bindings) {
      this.createNode(parentNode, binding);
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiBindingEndpointAlias modelElement) {
  }
  
  public void _createChildren(final IOutlineNode parentNode, final UiBinding modelElement) {
  }
}
