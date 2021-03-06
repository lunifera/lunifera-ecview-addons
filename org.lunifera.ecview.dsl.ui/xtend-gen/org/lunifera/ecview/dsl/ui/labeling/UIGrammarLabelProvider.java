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
package org.lunifera.ecview.dsl.ui.labeling;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot;
import org.lunifera.ecview.semantic.uimodel.UiBinding;
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias;
import org.lunifera.ecview.semantic.uimodel.UiBrowser;
import org.lunifera.ecview.semantic.uimodel.UiButton;
import org.lunifera.ecview.semantic.uimodel.UiCheckBox;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiColumnAssignments;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiCommand;
import org.lunifera.ecview.semantic.uimodel.UiDateField;
import org.lunifera.ecview.semantic.uimodel.UiDecimalField;
import org.lunifera.ecview.semantic.uimodel.UiDialog;
import org.lunifera.ecview.semantic.uimodel.UiExposedAction;
import org.lunifera.ecview.semantic.uimodel.UiFormLayout;
import org.lunifera.ecview.semantic.uimodel.UiGridLayout;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalButtonGroup;
import org.lunifera.ecview.semantic.uimodel.UiHorizontalLayout;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiIDEView;
import org.lunifera.ecview.semantic.uimodel.UiImage;
import org.lunifera.ecview.semantic.uimodel.UiImports;
import org.lunifera.ecview.semantic.uimodel.UiLabel;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiMaxLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMinLengthValidator;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationButton;
import org.lunifera.ecview.semantic.uimodel.UiMobileNavigationPage;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiMobileTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiMobileView;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiNumericField;
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup;
import org.lunifera.ecview.semantic.uimodel.UiProgressBar;
import org.lunifera.ecview.semantic.uimodel.UiRegexpValidator;
import org.lunifera.ecview.semantic.uimodel.UiSearchDialog;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiSwitch;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTabSheet;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uimodel.UiTextArea;
import org.lunifera.ecview.semantic.uimodel.UiTextField;
import org.lunifera.ecview.semantic.uimodel.UiValidator;
import org.lunifera.ecview.semantic.uimodel.UiValidatorAlias;
import org.lunifera.ecview.semantic.uimodel.UiVerticalComponentGroup;
import org.lunifera.ecview.semantic.uimodel.UiVerticalLayout;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.ecview.semantic.uimodel.UiViewSet;
import org.lunifera.ecview.semantic.uimodel.UiXbaseValidator;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class UIGrammarLabelProvider extends XbaseLabelProvider {
  @Inject
  public UIGrammarLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final UiModel ele) {
    return ele.getName();
  }
  
  public String text(final UiImports ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Import";
    }
    return _xifexpression;
  }
  
  public String text(final UiIDEView ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "IDE View";
    }
    return _xifexpression;
  }
  
  public String text(final UiMobileView ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Mobile View";
    }
    return _xifexpression;
  }
  
  public String text(final UiValidatorAlias ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "alias";
    }
    return _xifexpression;
  }
  
  public String text(final UiBinding ele) {
    return "Binding";
  }
  
  public String text(final UiBindingEndpointAlias ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "alias";
    }
    return _xifexpression;
  }
  
  public String text(final UiBeanSlot ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Beanslot";
    }
    return _xifexpression;
  }
  
  public String text(final UiViewSet ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "ViewSet";
    }
    return _xifexpression;
  }
  
  public String text(final UiFormLayout ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Form";
    }
    return _xifexpression;
  }
  
  public String text(final UiExposedAction ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Action";
    }
    return _xifexpression;
  }
  
  public String text(final UiVerticalLayout ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Vertical Layout";
    }
    return _xifexpression;
  }
  
  public String text(final UiHorizontalLayout ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Horizontal Layout";
    }
    return _xifexpression;
  }
  
  public String text(final UiVerticalComponentGroup ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Vertical Group";
    }
    return _xifexpression;
  }
  
  public String text(final UiHorizontalButtonGroup ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Horizontal Group";
    }
    return _xifexpression;
  }
  
  public String text(final UiTabSheet ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Tabsheet";
    }
    return _xifexpression;
  }
  
  public String text(final UiMobileTabSheet ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Tabsheet";
    }
    return _xifexpression;
  }
  
  public String text(final UiImage ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Image";
    }
    return _xifexpression;
  }
  
  public String text(final UiDialog ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Dialog";
    }
    return _xifexpression;
  }
  
  public String text(final UiMobileNavigationPage ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Navigation Page";
    }
    return _xifexpression;
  }
  
  public String text(final UiTextField ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Textfield";
    }
    return _xifexpression;
  }
  
  public String text(final UiTable ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Table";
    }
    return _xifexpression;
  }
  
  public String text(final UiComboBox ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Checkbox";
    }
    return _xifexpression;
  }
  
  public String text(final UiBeanReferenceField ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Reference Field";
    }
    return _xifexpression;
  }
  
  public String text(final UiButton ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Button";
    }
    return _xifexpression;
  }
  
  public String text(final UiMobileNavigationButton ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Button";
    }
    return _xifexpression;
  }
  
  public String text(final UiSwitch ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Switch";
    }
    return _xifexpression;
  }
  
  public String text(final UiColumnAssignments ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "column";
    }
    return _xifexpression;
  }
  
  public String text(final UiColumn ele) {
    return ele.getName();
  }
  
  public String text(final UiNumericField ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Numberfield";
    }
    return _xifexpression;
  }
  
  public String text(final UiCheckBox ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Checkbox";
    }
    return _xifexpression;
  }
  
  public String text(final UiMaxLengthValidator ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Validator";
    }
    return _xifexpression;
  }
  
  public String text(final UiMinLengthValidator ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Validator";
    }
    return _xifexpression;
  }
  
  public String text(final UiRegexpValidator ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Validator";
    }
    return _xifexpression;
  }
  
  public String text(final UiXbaseValidator ele) {
    String _xifexpression = null;
    String _name = ele.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      _xifexpression = ele.getName();
    } else {
      _xifexpression = "Validator";
    }
    return _xifexpression;
  }
  
  public String image(final UiModel ele) {
    return "UiModel.gif";
  }
  
  public String image(final UiOptionsGroup ele) {
    return "UiOptionsGroup.gif";
  }
  
  public String image(final UiProgressBar ele) {
    return "UiProgressBar.gif";
  }
  
  public String image(final UiImports ele) {
    return "UiImport.gif";
  }
  
  public String image(final UiIDEView ele) {
    return "UiView.gif";
  }
  
  public String image(final UiMobileView ele) {
    return "UiView.gif";
  }
  
  public String image(final UiValidator ele) {
    return "UiValidator.gif";
  }
  
  public String image(final UiValidatorAlias ele) {
    return "UiValidatorAlias.gif";
  }
  
  public String image(final UiSearchDialog ele) {
    return "UiSearchDialog.png";
  }
  
  public String image(final UiSearchField ele) {
    return "UiSearchField.png";
  }
  
  public String image(final UiBinding ele) {
    return "UiBinding.png";
  }
  
  public String image(final UiBindingEndpointAlias ele) {
    return "UiBeanSlot.gif";
  }
  
  public String image(final UiBeanSlot ele) {
    return "UiBeanSlot.gif";
  }
  
  public String image(final UiView ele) {
    return "UiView.gif";
  }
  
  public String image(final UiViewSet ele) {
    return "UiViewSet.png";
  }
  
  public String image(final UiFormLayout ele) {
    return "UiFormLayout.gif";
  }
  
  public String image(final UiGridLayout ele) {
    return "UiGridLayout.png";
  }
  
  public String image(final UiVerticalLayout ele) {
    return "UiVerticalLayout.gif";
  }
  
  public String image(final UiI18nInfo ele) {
    return "UiI18nInfo.gif";
  }
  
  public String image(final UiHorizontalLayout ele) {
    return "UiHorizontalLayout.gif";
  }
  
  public String image(final UiVerticalComponentGroup ele) {
    return "UiVerticalComponentGroup.gif";
  }
  
  public String image(final UiHorizontalButtonGroup ele) {
    return "UiHorizontalButtonGroup.gif";
  }
  
  public String image(final UiTabSheet ele) {
    return "UiTabSheet.png";
  }
  
  public String image(final UiTabAssignment ele) {
    return "UiTabAssignment.gif";
  }
  
  public String image(final UiMobileTabSheet ele) {
    return "UiMobileTabSheet.gif";
  }
  
  public String image(final UiMobileTabAssignment ele) {
    return "UiMobileTabAssignment.gif";
  }
  
  public String image(final UiImage ele) {
    return "UiImage.gif";
  }
  
  public String image(final UiDialog ele) {
    return "UiDialog.png";
  }
  
  public String image(final UiMobileNavigationPage ele) {
    return "UiMobileNavigationPage.gif";
  }
  
  public String image(final UiTextField ele) {
    return "UiTextField.gif";
  }
  
  public String image(final UiTextArea ele) {
    return "UiTextArea.gif";
  }
  
  public String image(final UiTable ele) {
    return "UiTable.gif";
  }
  
  public String image(final UiComboBox ele) {
    return "UiCombobox.gif";
  }
  
  public String image(final UiBeanReferenceField ele) {
    return "UiBeanReferenceField.gif";
  }
  
  public String image(final UiExposedAction ele) {
    return "UiExposedAction.png";
  }
  
  public String image(final UiCommand ele) {
    return "UiCommand.gif";
  }
  
  public String image(final UiButton ele) {
    return "UiButton.gif";
  }
  
  public String image(final UiLabel ele) {
    return "UiLabel.png";
  }
  
  public String image(final UiList ele) {
    return "UiList.png";
  }
  
  public String image(final UiBrowser ele) {
    return "UiBrowser.png";
  }
  
  public String image(final UiMobileNavigationButton ele) {
    return "UiMobileNavigationButton.gif";
  }
  
  public String image(final UiSwitch ele) {
    return "UiSwitch.gif";
  }
  
  public String image(final UiColumnAssignments ele) {
    return "UiColumnAssignments.gif";
  }
  
  public String image(final UiColumn ele) {
    return "UiColumn.gif";
  }
  
  public String image(final UiDateField ele) {
    return "UiDateField.gif";
  }
  
  public String image(final UiDecimalField ele) {
    return "UiDecimalField.gif";
  }
  
  public String image(final UiNumericField ele) {
    return "UiNumericField.gif";
  }
  
  public String image(final UiCheckBox ele) {
    return "UiCheckBox.gif";
  }
  
  public String image(final UiMaxLengthValidator ele) {
    return "UiValidator.gif";
  }
  
  public String image(final UiMinLengthValidator ele) {
    return "UiValidator.gif";
  }
  
  public String image(final UiRegexpValidator ele) {
    return "UiValidator.gif";
  }
  
  public String image(final UiXbaseValidator ele) {
    return "UiValidator.gif";
  }
}
