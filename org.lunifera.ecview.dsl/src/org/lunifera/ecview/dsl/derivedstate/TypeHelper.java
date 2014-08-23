package org.lunifera.ecview.dsl.derivedstate;

import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class TypeHelper {

	@Inject
	private TypeReferences typeReferences;

	/**
	 * Returns true, if the type is numeric
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
}
