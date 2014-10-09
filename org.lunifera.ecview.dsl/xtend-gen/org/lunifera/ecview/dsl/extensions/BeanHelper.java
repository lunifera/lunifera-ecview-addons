package org.lunifera.ecview.dsl.extensions;

import com.google.common.base.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.lunifera.ecview.dsl.extensions.OperationExtensions;
import org.lunifera.runtime.common.annotations.DomainDescription;
import org.lunifera.runtime.common.annotations.DomainKey;

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
    boolean _equals = Objects.equal(beanClass, null);
    if (_equals) {
      return null;
    }
    Field[] _declaredFields = beanClass.getDeclaredFields();
    for (final Field field : _declaredFields) {
      boolean _isAnnotationPresent = field.isAnnotationPresent(DomainKey.class);
      if (_isAnnotationPresent) {
        return field.getName();
      }
    }
    Field[] _fields = beanClass.getFields();
    for (final Field field_1 : _fields) {
      boolean _isAnnotationPresent_1 = field_1.isAnnotationPresent(DomainKey.class);
      if (_isAnnotationPresent_1) {
        return field_1.getName();
      }
    }
    return null;
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
    boolean _equals = Objects.equal(beanClass, null);
    if (_equals) {
      return null;
    }
    Field[] _declaredFields = beanClass.getDeclaredFields();
    for (final Field field : _declaredFields) {
      boolean _isAnnotationPresent = field.isAnnotationPresent(DomainDescription.class);
      if (_isAnnotationPresent) {
        return field.getName();
      }
    }
    Method[] _declaredMethods = beanClass.getDeclaredMethods();
    for (final Method method : _declaredMethods) {
      boolean _isAnnotationPresent_1 = method.isAnnotationPresent(DomainDescription.class);
      if (_isAnnotationPresent_1) {
        String _name = method.getName();
        return OperationExtensions.toPropertyName(_name);
      }
    }
    Field[] _fields = beanClass.getFields();
    for (final Field field_1 : _fields) {
      boolean _isAnnotationPresent_2 = field_1.isAnnotationPresent(DomainDescription.class);
      if (_isAnnotationPresent_2) {
        return field_1.getName();
      }
    }
    Method[] _methods = beanClass.getMethods();
    for (final Method method_1 : _methods) {
      boolean _isAnnotationPresent_3 = method_1.isAnnotationPresent(DomainDescription.class);
      if (_isAnnotationPresent_3) {
        String _name_1 = method_1.getName();
        return OperationExtensions.toPropertyName(_name_1);
      }
    }
    return null;
  }
}
