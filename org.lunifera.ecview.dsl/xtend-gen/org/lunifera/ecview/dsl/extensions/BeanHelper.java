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
    if ((bean instanceof Class<?>)) {
      return BeanHelper.findCaptionProperty(((Class<?>) bean));
    } else {
      Class<?> _class = bean.getClass();
      return BeanHelper.findCaptionProperty(_class);
    }
  }
  
  /**
   * Returns the caption property if it could be found. Null otherwise.
   */
  public static String findCaptionProperty(final Class<?> beanClass) {
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
