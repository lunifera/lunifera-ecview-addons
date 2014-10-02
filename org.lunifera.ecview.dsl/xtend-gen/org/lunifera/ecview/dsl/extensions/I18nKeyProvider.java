package org.lunifera.ecview.dsl.extensions;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.lunifera.ecview.semantic.uimodel.UiColumn;
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable;
import org.lunifera.ecview.semantic.uimodel.UiErrorCode;
import org.lunifera.ecview.semantic.uimodel.UiI18nInfo;
import org.lunifera.ecview.semantic.uimodel.UiModel;
import org.lunifera.ecview.semantic.uimodel.UiNamedElement;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiTabAssignment;

@SuppressWarnings("all")
public class I18nKeyProvider {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
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
    String _name = embeddable.getName();
    return ((currentPackage + ".") + _name);
  }
  
  protected String _toI18nKey(final UiColumn column) {
    final String currentPackage = this.getPackage(column);
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
      final UiNestedProperty property = column.getProperty();
      boolean _notEquals_2 = (!Objects.equal(property, null));
      if (_notEquals_2) {
        EObject _eContainer = column.eContainer();
        EObject _eContainer_1 = _eContainer.eContainer();
        final UiEmbeddable parent = ((UiEmbeddable) _eContainer_1);
        String _name = parent.getName();
        String _plus = ((currentPackage + ".") + _name);
        String _plus_1 = (_plus + ".");
        String _pathString = property.toPathString();
        return (_plus_1 + _pathString);
      }
    }
    String _name_1 = column.getName();
    return ((currentPackage + ".") + _name_1);
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
  
  public String toI18nKey(final UiNamedElement embeddable) {
    if (embeddable instanceof UiSearchField) {
      return _toI18nKey((UiSearchField)embeddable);
    } else if (embeddable instanceof UiColumn) {
      return _toI18nKey((UiColumn)embeddable);
    } else if (embeddable instanceof UiEmbeddable) {
      return _toI18nKey((UiEmbeddable)embeddable);
    } else if (embeddable instanceof UiTabAssignment) {
      return _toI18nKey((UiTabAssignment)embeddable);
    } else if (embeddable instanceof UiErrorCode) {
      return _toI18nKey((UiErrorCode)embeddable);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(embeddable).toString());
    }
  }
}
