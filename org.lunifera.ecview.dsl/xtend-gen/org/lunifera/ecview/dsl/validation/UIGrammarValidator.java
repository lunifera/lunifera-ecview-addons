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
package org.lunifera.ecview.dsl.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.lunifera.ecview.core.common.IAccessible;
import org.lunifera.ecview.dsl.extensions.BeanHelper;
import org.lunifera.ecview.dsl.extensions.TypeHelper;
import org.lunifera.ecview.dsl.lib.VisibilityOptions;
import org.lunifera.ecview.dsl.validation.AbstractUIGrammarValidator;
import org.lunifera.ecview.semantic.uimodel.UiBeanReferenceField;
import org.lunifera.ecview.semantic.uimodel.UiComboBox;
import org.lunifera.ecview.semantic.uimodel.UiList;
import org.lunifera.ecview.semantic.uimodel.UiModelPackage;
import org.lunifera.ecview.semantic.uimodel.UiNestedProperty;
import org.lunifera.ecview.semantic.uimodel.UiOptionsGroup;
import org.lunifera.ecview.semantic.uimodel.UiSearchField;
import org.lunifera.ecview.semantic.uimodel.UiView;
import org.lunifera.xtext.builder.types.loader.api.ITypeLoader;
import org.lunifera.xtext.builder.types.loader.api.ITypeLoaderFactory;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class UIGrammarValidator extends AbstractUIGrammarValidator {
  public final static String CODE__MISSING__JAVAX_PERSISTENCE = "0_107";
  
  public final static String CODE__MISSING__L_RUNTIME_COMMON = "0_108";
  
  public final static String CODE__MISSING__DATATYPE_LIB = "0_109";
  
  public final static String CODE__MISSING__DTO_LIB = "0_110";
  
  public final static String CODE__MISSING__XBASE_LIB = "0_111";
  
  public final static String CODE__MISSING__JDK_1_5 = "0_112";
  
  public final static String CODE__MISSING__L_ECVIEW_COMMON = "0_113";
  
  public final static String CODE__MISSING__L_ECVIEW_DSL_LIB = "0_114";
  
  @Inject
  private ITypeLoaderFactory typeLoaderFactory;
  
  private ITypeLoader typeLoader;
  
  @Inject
  @Extension
  private TypeHelper _typeHelper;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Check
  public Object checkSearchField(final UiSearchField field) {
    Object _xblockexpression = null;
    {
      UiNestedProperty _property = field.getProperty();
      final JvmType type = _property.getTypeofLastSegment();
      Object _xifexpression = null;
      boolean _isNumber = this._typeHelper.isNumber(type);
      if (_isNumber) {
        _xifexpression = null;
      } else {
        Object _xifexpression_1 = null;
        boolean _isString = this._typeHelper.isString(type);
        if (_isString) {
          _xifexpression_1 = null;
        } else {
          Object _xifexpression_2 = null;
          boolean _isBoolean = this._typeHelper.isBoolean(type);
          if (_isBoolean) {
            _xifexpression_2 = null;
          } else {
            QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(type);
            String _string = _fullyQualifiedName.toString();
            String _plus = ("Searchfields for type " + _string);
            String _plus_1 = (_plus + " are not supported in this version");
            this.error(_plus_1, field, 
              UiModelPackage.Literals.UI_SEARCH_FIELD__PROPERTY);
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkCaptionProperty(final UiOptionsGroup field) {
    String result = null;
    JvmOperation _itemCaptionProperty = field.getItemCaptionProperty();
    boolean _notEquals = (!Objects.equal(_itemCaptionProperty, null));
    if (_notEquals) {
      return;
    }
    JvmTypeReference _jvmType = field.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    if ((_type instanceof JvmEnumerationType)) {
      return;
    }
    Resource _eResource = field.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final ITypeLoader typeLoader = this.typeLoaderFactory.createTypeLoader(_resourceSet);
    JvmTypeReference _jvmType_1 = field.getJvmType();
    String _qualifiedName = null;
    if (_jvmType_1!=null) {
      _qualifiedName=_jvmType_1.getQualifiedName();
    }
    final Class<?> type = typeLoader.findTypeByName(_qualifiedName);
    boolean _notEquals_1 = (!Objects.equal(type, null));
    if (_notEquals_1) {
      String _findCaptionProperty = BeanHelper.findCaptionProperty(type);
      result = _findCaptionProperty;
    }
    typeLoader.dispose();
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      this.warning("Caption property could not be calculated by Type.", field, 
        UiModelPackage.Literals.UI_OPTIONS_GROUP__ITEM_CAPTION_PROPERTY);
    }
  }
  
  @Check
  public void checkCaptionProperty(final UiList field) {
    String result = null;
    JvmOperation _itemCaptionProperty = field.getItemCaptionProperty();
    boolean _notEquals = (!Objects.equal(_itemCaptionProperty, null));
    if (_notEquals) {
      return;
    }
    JvmTypeReference _jvmType = field.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    if ((_type instanceof JvmEnumerationType)) {
      return;
    }
    Resource _eResource = field.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final ITypeLoader typeLoader = this.typeLoaderFactory.createTypeLoader(_resourceSet);
    JvmTypeReference _jvmType_1 = field.getJvmType();
    String _qualifiedName = null;
    if (_jvmType_1!=null) {
      _qualifiedName=_jvmType_1.getQualifiedName();
    }
    final Class<?> type = typeLoader.findTypeByName(_qualifiedName);
    boolean _notEquals_1 = (!Objects.equal(type, null));
    if (_notEquals_1) {
      String _findCaptionProperty = BeanHelper.findCaptionProperty(type);
      result = _findCaptionProperty;
    }
    typeLoader.dispose();
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      this.warning("Caption property could not be calculated by Type.", field, 
        UiModelPackage.Literals.UI_LIST__ITEM_CAPTION_PROPERTY);
    }
  }
  
  @Check
  public void checkCaptionProperty(final UiComboBox field) {
    String result = null;
    JvmOperation _itemCaptionProperty = field.getItemCaptionProperty();
    boolean _notEquals = (!Objects.equal(_itemCaptionProperty, null));
    if (_notEquals) {
      return;
    }
    JvmTypeReference _jvmType = field.getJvmType();
    JvmType _type = null;
    if (_jvmType!=null) {
      _type=_jvmType.getType();
    }
    if ((_type instanceof JvmEnumerationType)) {
      return;
    }
    Resource _eResource = field.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final ITypeLoader typeLoader = this.typeLoaderFactory.createTypeLoader(_resourceSet);
    JvmTypeReference _jvmType_1 = field.getJvmType();
    String _qualifiedName = null;
    if (_jvmType_1!=null) {
      _qualifiedName=_jvmType_1.getQualifiedName();
    }
    final Class<?> type = typeLoader.findTypeByName(_qualifiedName);
    boolean _notEquals_1 = (!Objects.equal(type, null));
    if (_notEquals_1) {
      String _findCaptionProperty = BeanHelper.findCaptionProperty(type);
      result = _findCaptionProperty;
    }
    typeLoader.dispose();
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      this.warning("Caption property could not be calculated by Type.", field, 
        UiModelPackage.Literals.UI_COMBO_BOX__ITEM_CAPTION_PROPERTY);
    }
  }
  
  @Check
  public void checkCaptionProperty(final UiBeanReferenceField field) {
    String result = null;
    UiNestedProperty _captionProperty = field.getCaptionProperty();
    boolean _notEquals = (!Objects.equal(_captionProperty, null));
    if (_notEquals) {
      return;
    }
    Resource _eResource = field.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final ITypeLoader typeLoader = this.typeLoaderFactory.createTypeLoader(_resourceSet);
    JvmTypeReference _jvmType = field.getJvmType();
    String _qualifiedName = null;
    if (_jvmType!=null) {
      _qualifiedName=_jvmType.getQualifiedName();
    }
    final Class<?> type = typeLoader.findTypeByName(_qualifiedName);
    boolean _notEquals_1 = (!Objects.equal(type, null));
    if (_notEquals_1) {
      String _findCaptionProperty = BeanHelper.findCaptionProperty(type);
      result = _findCaptionProperty;
    }
    typeLoader.dispose();
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      this.warning("Caption property could not be calculated by Type.", field, 
        UiModelPackage.Literals.UI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY);
    }
  }
  
  @Check
  public void checkClassPath(final UiView model) {
    CommonTypeComputationServices _services = this.getServices();
    final TypeReferences typeReferences = _services.getTypeReferences();
    JvmType _findDeclaredType = typeReferences.findDeclaredType(List.class, model);
    final JvmGenericType listType = ((JvmGenericType) _findDeclaredType);
    boolean _or = false;
    boolean _equals = Objects.equal(listType, null);
    if (_equals) {
      _or = true;
    } else {
      EList<JvmTypeParameter> _typeParameters = listType.getTypeParameters();
      boolean _isEmpty = _typeParameters.isEmpty();
      _or = _isEmpty;
    }
    if (_or) {
      this.error("Couldn\'t find a JDK 1.5 or higher on the project\'s classpath.", model, 
        UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, UIGrammarValidator.CODE__MISSING__JDK_1_5);
    }
    JvmType _findDeclaredType_1 = typeReferences.findDeclaredType("org.lunifera.runtime.common.annotations.Dispose", model);
    boolean _equals_1 = Objects.equal(_findDeclaredType_1, null);
    if (_equals_1) {
      this.error("Couldn\'t find the mandatory library \'org.lunifera.runtime.common\' on the project\'s classpath.", model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, UIGrammarValidator.CODE__MISSING__L_RUNTIME_COMMON);
    }
    JvmType _findDeclaredType_2 = typeReferences.findDeclaredType(Extension.class, model);
    boolean _equals_2 = Objects.equal(_findDeclaredType_2, null);
    if (_equals_2) {
      this.error(
        "Couldn\'t find the mandatory library \'org.eclipse.xtext.xbase.lib\' 2.7.3 or higher on the project\'s classpath.", model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, UIGrammarValidator.CODE__MISSING__XBASE_LIB);
    }
    JvmType _findDeclaredType_3 = typeReferences.findDeclaredType(IAccessible.class, model);
    boolean _equals_3 = Objects.equal(_findDeclaredType_3, null);
    if (_equals_3) {
      this.error(
        "Couldn\'t find the mandatory library \'org.lunifera.ecview.core.common\' on the project\'s classpath.", model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, UIGrammarValidator.CODE__MISSING__L_ECVIEW_COMMON);
    }
    JvmType _findDeclaredType_4 = typeReferences.findDeclaredType("org.lunifera.dsl.dto.lib.services.IDTOService", model);
    boolean _equals_4 = Objects.equal(_findDeclaredType_4, null);
    if (_equals_4) {
      this.warning("Couldn\'t find the mandatory library \'org.lunifera.dsl.dto.lib\' on the project\'s classpath. This may cause resolving problems.", model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, UIGrammarValidator.CODE__MISSING__DTO_LIB);
    }
    JvmType _findDeclaredType_5 = typeReferences.findDeclaredType(VisibilityOptions.class, model);
    boolean _equals_5 = Objects.equal(_findDeclaredType_5, null);
    if (_equals_5) {
      this.warning(
        "Couldn\'t find the mandatory library \'org.lunifera.ecview.dsl.lib\' on the project\'s classpath. This may cause resolving problems.", model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, UIGrammarValidator.CODE__MISSING__L_ECVIEW_DSL_LIB);
    }
    JvmType _findDeclaredType_6 = typeReferences.findDeclaredType("org.lunifera.dsl.common.datatypes.IDatatypeConstants", model);
    boolean _equals_6 = Objects.equal(_findDeclaredType_6, null);
    if (_equals_6) {
      this.warning(
        "Couldn\'t find the optional library \'org.lunifera.dsl.datatype.lib\' on the project\'s classpath. This may cause resolving problems.", model, UiModelPackage.Literals.UI_NAMED_ELEMENT__NAME, UIGrammarValidator.CODE__MISSING__DATATYPE_LIB);
    }
  }
}
