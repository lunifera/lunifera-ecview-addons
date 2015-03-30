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

import com.google.inject.Inject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;
import org.lunifera.ecview.dsl.extensions.TypeHelper;
import org.lunifera.ecview.dsl.validation.AbstractUIGrammarValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class UIGrammarValidator extends AbstractUIGrammarValidator {
  @Inject
  private /* ITypeLoaderFactory */Object typeLoaderFactory;
  
  private /* ITypeLoader */Object typeLoader;
  
  @Inject
  @Extension
  private TypeHelper _typeHelper;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Check
  public Object checkSearchField(final /* UiSearchField */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field UiModelPackage is undefined for the type UIGrammarValidator"
      + "\nproperty cannot be resolved"
      + "\ntypeofLastSegment cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nUI_SEARCH_FIELD__PROPERTY cannot be resolved");
  }
  
  @Check
  public void checkCaptionProperty(final /* UiOptionsGroup */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field UiModelPackage is undefined for the type UIGrammarValidator"
      + "\nitemCaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreateTypeLoader cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nfindTypeByName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ndispose cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nUI_OPTIONS_GROUP__ITEM_CAPTION_PROPERTY cannot be resolved");
  }
  
  @Check
  public void checkCaptionProperty(final /* UiList */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field UiModelPackage is undefined for the type UIGrammarValidator"
      + "\nitemCaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreateTypeLoader cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nfindTypeByName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ndispose cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nUI_LIST__ITEM_CAPTION_PROPERTY cannot be resolved");
  }
  
  @Check
  public void checkCaptionProperty(final /* UiComboBox */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field UiModelPackage is undefined for the type UIGrammarValidator"
      + "\nitemCaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreateTypeLoader cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nfindTypeByName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ndispose cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nUI_COMBO_BOX__ITEM_CAPTION_PROPERTY cannot be resolved");
  }
  
  @Check
  public void checkCaptionProperty(final /* UiBeanReferenceField */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field UiModelPackage is undefined for the type UIGrammarValidator"
      + "\ncaptionProperty cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncreateTypeLoader cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nfindTypeByName cannot be resolved"
      + "\njvmType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ndispose cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nUI_BEAN_REFERENCE_FIELD__CAPTION_PROPERTY cannot be resolved");
  }
}
