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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.ui.labeling.XbaseDescriptionLabelProvider;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class UIGrammarDescriptionLabelProvider extends XbaseDescriptionLabelProvider {
  public Object text(final IEObjectDescription ele) {
    QualifiedName _name = ele.getName();
    return _name.toString();
  }
  
  public Object image(final IEObjectDescription ele) {
    EClass _eClass = ele.getEClass();
    String _name = _eClass.getName();
    return (_name + ".gif");
  }
  
  public Image getImage(final Object object) {
    return null;
  }
}
