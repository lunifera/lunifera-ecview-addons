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



package org.lunifera.ecview.dsl.scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.ecview.dsl.extensions.OperationExtensions;
import org.lunifera.ecview.dsl.extensions.OperationExtensions.OperationInfo;

public class JvmFieldScope extends AbstractScope {

	private JvmType type;

	protected JvmFieldScope(JvmType type) {
		super(IScope.NULLSCOPE, true);
		this.type = (JvmType) type;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		List<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		if (type instanceof JvmDeclaredType) {
			Map<String, OperationInfo> infos = OperationExtensions
					.getOperationInfos((JvmDeclaredType) type);
			// apply readonly and create descriptions
			for (OperationInfo info : infos.values()) {
				if (info.getField() == null) {
					continue;
				}
				result.add(EObjectDescription.create(info.getName(),
						info.getField()));
			}
		}
		return result;
	}
}
