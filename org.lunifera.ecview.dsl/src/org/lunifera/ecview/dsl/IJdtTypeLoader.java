package org.lunifera.ecview.dsl;

public interface IJdtTypeLoader {

	Class<?> findTypeByName(String fullyQualifiedName);

	void dispose();

}
