package org.lunifera.ecview.dsl.extensions

import org.lunifera.runtime.common.annotations.DomainDescription
import org.lunifera.runtime.common.annotations.DomainKey

class BeanHelper {

	/**
	 * Returns the caption property if it could be found. Null otherwise.
	 */
	def static String findCaptionProperty(Object bean) {
		if (bean == null) {
			return null
		}

		if (bean instanceof Class<?>) {
			return findCaptionProperty(bean as Class<?>)
		} else {
			return findCaptionProperty(bean.class)
		}
	}

	/**
	 * Returns the caption property if it could be found. Null otherwise.
	 */
	def static String findCaptionProperty(Class<?> beanClass) {
		if (beanClass == null) {
			return null
		}

		// try to find annotation in class
		for (field : beanClass.declaredFields) {
			if (field.isAnnotationPresent(typeof(DomainKey))) {
				return field.name
			}
		}

		// include super classes too
		for (field : beanClass.fields) {
			if (field.isAnnotationPresent(typeof(DomainKey))) {
				return field.name
			}
		}

		return null
	}

	/**
	 * Returns the description property if it could be found. Null otherwise.
	 */
	def static String findDescriptionProperty(Object bean) {
		if (bean == null) {
			return null
		}

		if (bean instanceof Class<?>) {
			return findDescriptionProperty(bean as Class<?>)
		} else {
			return findDescriptionProperty(bean.class)
		}
	}

	/**
	 * Returns the description property if it could be found. Null otherwise.
	 */
	def static String findDescriptionProperty(Class<?> beanClass) {
		if (beanClass == null) {
			return null
		}

		// try to find annotation in fields of class
		for (field : beanClass.declaredFields) {
			if (field.isAnnotationPresent(typeof(DomainDescription))) {
				return field.name
			}
		}

		// try to find annotation in methods of class
		for (method : beanClass.declaredMethods) {
			if (method.isAnnotationPresent(typeof(DomainDescription))) {
				return OperationExtensions.toPropertyName(method.name)
			}
		}

		// include super classes too
		for (field : beanClass.fields) {
			if (field.isAnnotationPresent(typeof(DomainDescription))) {
				return field.name
			}
		}

		// include super class too
		for (method : beanClass.methods) {
			if (method.isAnnotationPresent(typeof(DomainDescription))) {
				return OperationExtensions.toPropertyName(method.name)
			}
		}

		return null
	}

}
