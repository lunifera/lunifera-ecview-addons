package org.lunifera.ecview.dsl.extensions;

import java.util.Collection;
import java.util.Date;

import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.SuperTypeCollector;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.lunifera.ecview.dsl.extensions.OperationExtensions.OperationInfo;
import org.lunifera.runtime.common.annotations.DomainReference;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings({"restriction", "deprecation"})
@Singleton
public class TypeHelper {

	@Inject
	private TypeReferences typeReferences;

	@Inject
	private SuperTypeCollector superTypeCollector;

	/**
	 * Returns true, if the type is numeric without digits
	 * 
	 * @param type
	 * @return
	 */
	public boolean isNumber(JvmType type) {
		if (typeReferences.is(type, Byte.class)
				|| typeReferences.is(type, Byte.TYPE)
				|| typeReferences.is(type, Short.class)
				|| typeReferences.is(type, Short.TYPE)
				|| typeReferences.is(type, Integer.class)
				|| typeReferences.is(type, Integer.TYPE)
				|| typeReferences.is(type, Long.class)
				|| typeReferences.is(type, Long.TYPE)
				|| typeReferences.is(type, Float.class)
				|| typeReferences.is(type, Float.TYPE)
				|| typeReferences.is(type, Double.class)
				|| typeReferences.is(type, Double.TYPE)) {
			return true;
		}
		return false;
	}

	/**
	 * Returns true, if the type is numeric
	 * 
	 * @param type
	 * @return
	 */
	public boolean isNumberWithoutDigits(JvmType type) {
		if (typeReferences.is(type, Byte.class)
				|| typeReferences.is(type, Byte.TYPE)
				|| typeReferences.is(type, Short.class)
				|| typeReferences.is(type, Short.TYPE)
				|| typeReferences.is(type, Integer.class)
				|| typeReferences.is(type, Integer.TYPE)
				|| typeReferences.is(type, Long.class)
				|| typeReferences.is(type, Long.TYPE)) {
			return true;
		}
		return false;
	}

	/**
	 * Returns true, if the type is numeric with digits
	 * 
	 * @param type
	 * @return
	 */
	public boolean isNumberWithDigits(JvmType type) {
		if (typeReferences.is(type, Float.class)
				|| typeReferences.is(type, Float.TYPE)
				|| typeReferences.is(type, Double.class)
				|| typeReferences.is(type, Double.TYPE)) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the qualified name of the given numeric type. Throws exception,
	 * if the given type is not a valid number.
	 * 
	 * @param name
	 * @return
	 */
	public String toNumericQualifiedName(JvmType type) {
		return toNumericType(type).getName();
	}

	/**
	 * Returns the class file of the given numeric type. Throws exception, if
	 * the given type is not a valid number.
	 * 
	 * @param type
	 * @return
	 */
	public Class<? extends Number> toNumericType(JvmType type) {
		if (typeReferences.is(type, Byte.class)
				|| typeReferences.is(type, Byte.TYPE)) {
			return Byte.class;
		} else if (typeReferences.is(type, Short.class)
				|| typeReferences.is(type, Short.TYPE)) {
			return Short.class;
		} else if (typeReferences.is(type, Integer.class)
				|| typeReferences.is(type, Integer.TYPE)) {
			return Integer.class;
		} else if (typeReferences.is(type, Long.class)
				|| typeReferences.is(type, Long.TYPE)) {
			return Long.class;
		} else if (typeReferences.is(type, Float.class)
				|| typeReferences.is(type, Float.TYPE)) {
			return Float.class;
		} else if (typeReferences.is(type, Double.class)
				|| typeReferences.is(type, Double.TYPE)) {
			return Double.class;
		}
		throw new IllegalArgumentException(type + " is not a valid number type");
	}

	/**
	 * Returns true, if the type is boolean
	 * 
	 * @param type
	 * @return
	 */
	public boolean isBoolean(JvmType type) {
		if (typeReferences.is(type, Boolean.class)
				|| typeReferences.is(type, Boolean.TYPE)) {
			return true;
		}
		return false;
	}

	/**
	 * Returns true, if the type is boolean
	 * 
	 * @param type
	 * @return
	 */
	public boolean isString(JvmType type) {
		if (typeReferences.is(type, String.class)) {
			return true;
		}
		return false;
	}

	/**
	 * Returns true, if the type is date
	 * 
	 * @param type
	 * @return
	 */
	public boolean isDate(JvmType type) {
		if (typeReferences.is(type, Date.class)) {
			return true;
		}
		return false;
	}

	/**
	 * Returns true, if the type is enum
	 * 
	 * @param type
	 * @return
	 */
	public boolean isEnum(JvmType type) {
		return type instanceof JvmEnumerationType;
	}

	/**
	 * Returns true, if the type is enum
	 * 
	 * @param type
	 * @return
	 */
	public boolean isDomainReference(OperationInfo info) {
		JvmField field = info.getField();
		if (field == null) {
			return false;
		}

		if(isCollection(field)){
			return false;
		}

		for (JvmAnnotationReference ref : field.getAnnotations()) {
			if (typeReferences.is(ref.getAnnotation(), DomainReference.class)) {
				return true;
			}
		}

		return false;
	}

	protected boolean isCollection(JvmField field) {
		if (superTypeCollector.isSuperType((JvmDeclaredType) field.getType()
				.getType(), (JvmDeclaredType) typeReferences.findDeclaredType(
				Collection.class, field))) {
			return true;
		}
		return false;
	}
}
