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

@SuppressWarnings("all")
public class BeanHelper {
  /**
   * Returns the caption property if it could be found. Null otherwise.
   */
  public static String findCaptionProperty(final Object bean) {
    boolean _equals = Objects.equal(bean, null);
    if (_equals) {
      return null;
    }
    if ((bean instanceof Class)) {
      return BeanHelper.findCaptionProperty(((Class) bean));
    } else {
      Class<?> _class = bean.getClass();
      return BeanHelper.findCaptionProperty(_class);
    }
  }
  
  /**
   * Returns the caption property if it could be found. Null otherwise.
   */
  public static String findCaptionProperty(final Class beanClass) {
    throw new Error("Unresolved compilation problems:"
      + "\nDomainKey cannot be resolved to a type."
      + "\nDomainKey cannot be resolved to a type."
      + "\nType mismatch: cannot convert from Class<void> to Class<? extends Annotation>"
      + "\nType mismatch: cannot convert from Class<void> to Class<? extends Annotation>");
  }
  
  /**
   * Returns the description property if it could be found. Null otherwise.
   */
  public static String findDescriptionProperty(final Object bean) {
    boolean _equals = Objects.equal(bean, null);
    if (_equals) {
      return null;
    }
    if ((bean instanceof Class<?>)) {
      return BeanHelper.findDescriptionProperty(((Class<?>) bean));
    } else {
      Class<?> _class = bean.getClass();
      return BeanHelper.findDescriptionProperty(_class);
    }
  }
  
  /**
   * Returns the description property if it could be found. Null otherwise.
   */
  public static String findDescriptionProperty(final Class<?> beanClass) {
    throw new Error("Unresolved compilation problems:"
      + "\nDomainDescription cannot be resolved to a type."
      + "\nDomainDescription cannot be resolved to a type."
      + "\nDomainDescription cannot be resolved to a type."
      + "\nDomainDescription cannot be resolved to a type."
      + "\nType mismatch: cannot convert from Class<void> to Class<? extends Annotation>"
      + "\nType mismatch: cannot convert from Class<void> to Class<? extends Annotation>"
      + "\nType mismatch: cannot convert from Class<void> to Class<? extends Annotation>"
      + "\nType mismatch: cannot convert from Class<void> to Class<? extends Annotation>");
  }
}
