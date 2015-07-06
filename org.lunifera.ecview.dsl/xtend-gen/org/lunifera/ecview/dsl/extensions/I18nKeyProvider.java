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
package org.lunifera.ecview.dsl.extensions;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.ecview.dsl.extensions.BindingInfoHelper;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiErrorCode;
import org.lunifera.ecview.semantic.uimodel.UiExposedAction;
import org.lunifera.ecview.semantic.uimodel.UiField;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiSearchPanel;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;
import org.lunifera.ecview.semantic.uimodel.UiTable;
import org.lunifera.ecview.semantic.uisemantics.UxAction;
import org.lunifera.runtime.common.metric.TimeLogger;

@SuppressWarnings("all")
public class I18nKeyProvider {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private BindingInfoHelper bindingInfoHelper;
  
  protected String _toI18nKey(final UiEmbeddable embeddable) {
    final String currentPackage = this.getPackage(embeddable);
    boolean _and = false;
    UiI18nInfo _i18nInfo = embeddable.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = embeddable.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = embeddable.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = embeddable.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = embeddable.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    }
    if ((embeddable instanceof UiField)) {
      final String i18nKey = this.toI18nKeyByBindings(embeddable);
      boolean _and_1 = false;
      boolean _notEquals_2 = (!Objects.equal(i18nKey, null));
      if (!_notEquals_2) {
        _and_1 = false;
      } else {
        boolean _equals = i18nKey.equals("");
        boolean _not = (!_equals);
        _and_1 = _not;
      }
      if (_and_1) {
        return i18nKey;
      }
    }
    String _xifexpression = null;
    String _name = embeddable.getName();
    boolean _notEquals_3 = (!Objects.equal(_name, null));
    if (_notEquals_3) {
      String _name_1 = embeddable.getName();
      _xifexpression = ("." + _name_1);
    } else {
      _xifexpression = "";
    }
    return (currentPackage + _xifexpression);
  }
  
  protected String _toI18nKey(final UiTable element) {
    final String currentPackage = this.getPackage(element);
    boolean _and = false;
    UiI18nInfo _i18nInfo = element.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = element.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = element.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = element.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = element.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      JvmTypeReference _jvmType = element.getJvmType();
      boolean _notEquals_2 = (!Objects.equal(_jvmType, null));
      if (_notEquals_2) {
        JvmTypeReference _jvmType_1 = element.getJvmType();
        return _jvmType_1.getQualifiedName();
      }
    }
    String _xifexpression = null;
    String _name = element.getName();
    boolean _notEquals_3 = (!Objects.equal(_name, null));
    if (_notEquals_3) {
      String _name_1 = element.getName();
      _xifexpression = ("." + _name_1);
    } else {
      _xifexpression = "";
    }
    return (currentPackage + _xifexpression);
  }
  
  protected String _toI18nKey(final UiList element) {
    final String currentPackage = this.getPackage(element);
    boolean _and = false;
    UiI18nInfo _i18nInfo = element.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = element.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = element.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = element.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = element.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      JvmTypeReference _jvmType = element.getJvmType();
      boolean _notEquals_2 = (!Objects.equal(_jvmType, null));
      if (_notEquals_2) {
        JvmTypeReference _jvmType_1 = element.getJvmType();
        return _jvmType_1.getQualifiedName();
      }
    }
    String _xifexpression = null;
    String _name = element.getName();
    boolean _notEquals_3 = (!Objects.equal(_name, null));
    if (_notEquals_3) {
      String _name_1 = element.getName();
      _xifexpression = ("." + _name_1);
    } else {
      _xifexpression = "";
    }
    return (currentPackage + _xifexpression);
  }
  
  protected String _toI18nKey(final UiOptionsGroup element) {
    final String currentPackage = this.getPackage(element);
    boolean _and = false;
    UiI18nInfo _i18nInfo = element.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = element.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = element.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = element.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = element.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      JvmTypeReference _jvmType = element.getJvmType();
      boolean _notEquals_2 = (!Objects.equal(_jvmType, null));
      if (_notEquals_2) {
        JvmTypeReference _jvmType_1 = element.getJvmType();
        return _jvmType_1.getQualifiedName();
      }
    }
    String _xifexpression = null;
    String _name = element.getName();
    boolean _notEquals_3 = (!Objects.equal(_name, null));
    if (_notEquals_3) {
      String _name_1 = element.getName();
      _xifexpression = ("." + _name_1);
    } else {
      _xifexpression = "";
    }
    return (currentPackage + _xifexpression);
  }
  
  protected String _toI18nKey(final UiComboBox element) {
    final String currentPackage = this.getPackage(element);
    boolean _and = false;
    UiI18nInfo _i18nInfo = element.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = element.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = element.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = element.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = element.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      JvmTypeReference _jvmType = element.getJvmType();
      boolean _notEquals_2 = (!Objects.equal(_jvmType, null));
      if (_notEquals_2) {
        JvmTypeReference _jvmType_1 = element.getJvmType();
        return _jvmType_1.getQualifiedName();
      }
    }
    String _xifexpression = null;
    String _name = element.getName();
    boolean _notEquals_3 = (!Objects.equal(_name, null));
    if (_notEquals_3) {
      String _name_1 = element.getName();
      _xifexpression = ("." + _name_1);
    } else {
      _xifexpression = "";
    }
    return (currentPackage + _xifexpression);
  }
  
  protected String _toI18nKey(final UiSearchPanel element) {
    final String currentPackage = this.getPackage(element);
    boolean _and = false;
    UiI18nInfo _i18nInfo = element.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = element.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = element.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = element.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = element.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      JvmTypeReference _jvmType = element.getJvmType();
      boolean _notEquals_2 = (!Objects.equal(_jvmType, null));
      if (_notEquals_2) {
        JvmTypeReference _jvmType_1 = element.getJvmType();
        return _jvmType_1.getQualifiedName();
      }
    }
    String _xifexpression = null;
    String _name = element.getName();
    boolean _notEquals_3 = (!Objects.equal(_name, null));
    if (_notEquals_3) {
      String _name_1 = element.getName();
      _xifexpression = ("." + _name_1);
    } else {
      _xifexpression = "";
    }
    return (currentPackage + _xifexpression);
  }
  
  protected String _toI18nKey(final UiBeanReferenceField element) {
    final String currentPackage = this.getPackage(element);
    boolean _and = false;
    UiI18nInfo _i18nInfo = element.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = element.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = element.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = element.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = element.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      JvmTypeReference _jvmType = element.getJvmType();
      boolean _notEquals_2 = (!Objects.equal(_jvmType, null));
      if (_notEquals_2) {
        JvmTypeReference _jvmType_1 = element.getJvmType();
        return _jvmType_1.getQualifiedName();
      }
    }
    String _xifexpression = null;
    String _name = element.getName();
    boolean _notEquals_3 = (!Objects.equal(_name, null));
    if (_notEquals_3) {
      String _name_1 = element.getName();
      _xifexpression = ("." + _name_1);
    } else {
      _xifexpression = "";
    }
    return (currentPackage + _xifexpression);
  }
  
  protected String _toI18nKey(final UiColumn column) {
    final String currentPackage = this.getPackage(column);
    EObject _eContainer = column.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    final UiTable table = ((UiTable) _eContainer_1);
    boolean _and = false;
    UiI18nInfo _i18nInfo = column.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = column.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = column.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = column.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = column.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      JvmTypeReference _jvmType = table.getJvmType();
      boolean _notEquals_2 = (!Objects.equal(_jvmType, null));
      if (_notEquals_2) {
        final UiNestedProperty property = column.getProperty();
        boolean _notEquals_3 = (!Objects.equal(property, null));
        if (_notEquals_3) {
          final String path = property.toPathString();
          boolean _equals = Objects.equal(path, null);
          if (_equals) {
            JvmTypeReference _jvmType_1 = table.getJvmType();
            return _jvmType_1.getQualifiedName();
          } else {
            boolean _contains = path.contains(".");
            if (_contains) {
              final JvmType type = property.getTypeofSecondLastSegment();
              String _qualifiedName = type.getQualifiedName();
              String _plus = (_qualifiedName + ".");
              String _simpleGetterNameOfLastSegment = property.getSimpleGetterNameOfLastSegment();
              return (_plus + _simpleGetterNameOfLastSegment);
            } else {
              JvmOperation _getter = property.getGetter();
              final JvmDeclaredType type_1 = _getter.getDeclaringType();
              String _qualifiedName_1 = type_1.getQualifiedName();
              String _plus_1 = (_qualifiedName_1 + ".");
              String _simpleGetterName = property.getSimpleGetterName();
              return (_plus_1 + _simpleGetterName);
            }
          }
        }
      } else {
        final UiNestedProperty property_1 = column.getProperty();
        boolean _notEquals_4 = (!Objects.equal(property_1, null));
        if (_notEquals_4) {
          EObject _eContainer_2 = column.eContainer();
          EObject _eContainer_3 = _eContainer_2.eContainer();
          final UiEmbeddable parent = ((UiEmbeddable) _eContainer_3);
          String _name = parent.getName();
          String _plus_2 = ((currentPackage + ".") + _name);
          String _plus_3 = (_plus_2 + ".");
          String _pathString = property_1.toPathString();
          return (_plus_3 + _pathString);
        }
      }
    }
    String _name_1 = column.getName();
    return ((currentPackage + ".") + _name_1);
  }
  
  protected String _toI18nKey(final UiExposedAction action) {
    UxAction _actionReference = action.getActionReference();
    boolean _notEquals = (!Objects.equal(_actionReference, null));
    if (_notEquals) {
      UxAction _actionReference_1 = action.getActionReference();
      return _actionReference_1.getName();
    } else {
      return action.getActionID();
    }
  }
  
  protected String _toI18nKey(final UiSearchField embeddable) {
    final String currentPackage = this.getPackage(embeddable);
    boolean _and = false;
    UiI18nInfo _i18nInfo = embeddable.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = embeddable.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = embeddable.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = embeddable.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return (currentPackage + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = embeddable.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    } else {
      final UiNestedProperty property = embeddable.getProperty();
      boolean _notEquals_2 = (!Objects.equal(property, null));
      if (_notEquals_2) {
        final String i18nKey = this.toI18nKeyByBindings(property);
        boolean _and_1 = false;
        boolean _notEquals_3 = (!Objects.equal(i18nKey, null));
        if (!_notEquals_3) {
          _and_1 = false;
        } else {
          boolean _equals = i18nKey.equals("");
          boolean _not = (!_equals);
          _and_1 = _not;
        }
        if (_and_1) {
          return i18nKey;
        }
        String _pathString = property.toPathString();
        return ((currentPackage + ".search.") + _pathString);
      }
    }
    String _name = embeddable.getName();
    return ((currentPackage + ".") + _name);
  }
  
  protected String _toI18nKey(final UiTabAssignment embeddable) {
    final String currentPackage = this.getPackage(embeddable);
    boolean _and = false;
    UiI18nInfo _i18nInfo = embeddable.getI18nInfo();
    boolean _notEquals = (!Objects.equal(_i18nInfo, null));
    if (!_notEquals) {
      _and = false;
    } else {
      UiI18nInfo _i18nInfo_1 = embeddable.getI18nInfo();
      String _key = _i18nInfo_1.getKey();
      boolean _notEquals_1 = (!Objects.equal(_key, null));
      _and = _notEquals_1;
    }
    if (_and) {
      UiI18nInfo _i18nInfo_2 = embeddable.getI18nInfo();
      String _key_1 = _i18nInfo_2.getKey();
      boolean _startsWith = _key_1.startsWith(".");
      if (_startsWith) {
        UiI18nInfo _i18nInfo_3 = embeddable.getI18nInfo();
        String _key_2 = _i18nInfo_3.getKey();
        return ((currentPackage + ".") + _key_2);
      } else {
        UiI18nInfo _i18nInfo_4 = embeddable.getI18nInfo();
        return _i18nInfo_4.getKey();
      }
    }
    String _name = embeddable.getName();
    return ((currentPackage + ".") + _name);
  }
  
  protected String _toI18nKey(final UiErrorCode code) {
    final QualifiedName fqn = this._iQualifiedNameProvider.getFullyQualifiedName(code);
    QualifiedName _skipLast = fqn.skipLast(1);
    return _skipLast.toString();
  }
  
  public String toI18nKeyByBindings(final UiEmbeddable embeddable) {
    if ((embeddable instanceof UiField)) {
      final TimeLogger logger = TimeLogger.start(I18nKeyProvider.class);
      final List<JvmOperation> ops = this.bindingInfoHelper.findBoundOppositeJvmOperations(embeddable, "value");
      logger.stop("Calculating bound opposite operations took: ");
      boolean _isEmpty = ops.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final JvmOperation op = ops.get(0);
        boolean _equals = Objects.equal(op, null);
        if (_equals) {
          return null;
        }
        final JvmType type = op.getDeclaringType();
        boolean _equals_1 = Objects.equal(type, null);
        if (_equals_1) {
          return null;
        }
        String _qualifiedName = type.getQualifiedName();
        JvmOperation _get = ops.get(0);
        String _simpleName = _get.getSimpleName();
        String _toPropertyName = I18nKeyProvider.getToPropertyName(_simpleName);
        return I18nKeyProvider.toI18nKey(_qualifiedName, _toPropertyName);
      }
    }
    return null;
  }
  
  public String toI18nKeyByBindings(final UiNestedProperty property) {
    boolean _notEquals = (!Objects.equal(property, null));
    if (_notEquals) {
      final JvmOperation op = property.getOperationofLastSegment();
      boolean _notEquals_1 = (!Objects.equal(op, null));
      if (_notEquals_1) {
        final JvmType type = op.getDeclaringType();
        boolean _equals = Objects.equal(type, null);
        if (_equals) {
          return null;
        }
        String _qualifiedName = type.getQualifiedName();
        String _simpleName = op.getSimpleName();
        String _toPropertyName = I18nKeyProvider.getToPropertyName(_simpleName);
        return I18nKeyProvider.toI18nKey(_qualifiedName, _toPropertyName);
      }
    }
    return null;
  }
  
  public static String getToPropertyName(final String string) {
    boolean _startsWith = string.startsWith("get");
    if (_startsWith) {
      String _replaceFirst = string.replaceFirst("get", "");
      return StringExtensions.toFirstLower(_replaceFirst);
    } else {
      boolean _startsWith_1 = string.startsWith("is");
      if (_startsWith_1) {
        String _replaceFirst_1 = string.replaceFirst("is", "");
        return StringExtensions.toFirstLower(_replaceFirst_1);
      }
    }
    return null;
  }
  
  public static String toI18nKey(final String beanFQN, final String property) {
    return ((beanFQN + ".") + property);
  }
  
  /**
   * Returns the package name.
   * 
   * @param eObject
   * @return
   */
  public String getPackage(final EObject eObject) {
    boolean _equals = Objects.equal(eObject, null);
    if (_equals) {
      return "";
    }
    if ((eObject instanceof UiModel)) {
      return ((UiModel) eObject).getPackageName();
    } else {
      EObject _eContainer = eObject.eContainer();
      return this.getPackage(_eContainer);
    }
  }
  
  public String toI18nKey(final UiNamedElement element) {
    if (element instanceof UiBeanReferenceField) {
      return _toI18nKey((UiBeanReferenceField)element);
    } else if (element instanceof UiComboBox) {
      return _toI18nKey((UiComboBox)element);
    } else if (element instanceof UiOptionsGroup) {
      return _toI18nKey((UiOptionsGroup)element);
    } else if (element instanceof UiSearchField) {
      return _toI18nKey((UiSearchField)element);
    } else if (element instanceof UiTable) {
      return _toI18nKey((UiTable)element);
    } else if (element instanceof UiColumn) {
      return _toI18nKey((UiColumn)element);
    } else if (element instanceof UiExposedAction) {
      return _toI18nKey((UiExposedAction)element);
    } else if (element instanceof UiList) {
      return _toI18nKey((UiList)element);
    } else if (element instanceof UiSearchPanel) {
      return _toI18nKey((UiSearchPanel)element);
    } else if (element instanceof UiEmbeddable) {
      return _toI18nKey((UiEmbeddable)element);
    } else if (element instanceof UiTabAssignment) {
      return _toI18nKey((UiTabAssignment)element);
    } else if (element instanceof UiErrorCode) {
      return _toI18nKey((UiErrorCode)element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
