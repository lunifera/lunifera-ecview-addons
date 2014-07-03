package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

public class BindingPathScope extends AbstractScope {

	private JvmDeclaredType type;

	protected BindingPathScope(JvmType type) {
		super(IScope.NULLSCOPE, true);
		this.type = (JvmDeclaredType) type;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {

		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (JvmField field : type.getDeclaredFields()) {
			result.add(EObjectDescription.create(field.getSimpleName(), field));
		}
		return result;
	}
}
