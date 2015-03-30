

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


public class BatchScopeProvider extends ScopeProvider {

//	@Inject
//	private TypeReferences types;
//
//	@Override
//	public IScope getScope(EObject context, EReference reference) {
//		if (reference == UiModelPackage.Literals.UI_BINDING_ENDPOINT_DEF__ENDPOINT) {
//			return new BindingEndpointDefMethodScope(super.getScope(context,
//					reference), (UiBindingEndpointDef) context);
//		} else if (reference == UiModelPackage.Literals.UI_BINDING_ENDPOINT_DEF__PATH) {
//			return createBindingEndpointDefPathScope(context);
//		} else if (reference == UiModelPackage.Literals.UI_PATH_SEGMENT__JVM_FIELD) {
//			return createPathSegmentJvmFieldScope(context);
//		}
//		return super.getScope(context, reference);
//	}
//
//	/**
//	 * Creates a scope that returns the jvm fields available for the current
//	 * state.
//	 * 
//	 * @param context
//	 * @return
//	 */
//	private IScope createPathSegmentJvmFieldScope(EObject context) {
//		UiPathSegmentImpl segment = (UiPathSegmentImpl) context;
//		if (segment.eContainer() instanceof UiBindingEndpointDef) {
//			UiBindingEndpointDef parent = (UiBindingEndpointDef) segment
//					.eContainer();
//			UxEndpointDef uxEndpointDef = (UxEndpointDef) parent.getEndpoint();
//			YElement bindable = parent.getBindable();
//
//			JvmTypeReference expectedType = uxEndpointDef.getJvmType();
//			if (expectedType.getQualifiedName().equals(Void.class.getName())) {
//				if (bindable instanceof YBeanSlot) {
//					YBeanSlot slot = (YBeanSlot) bindable;
//					return new BindingPathScope(types.findDeclaredType(
//							slot.getValueTypeQualifiedName(), context));
//				}
//				throw new IllegalStateException("Not a valid input! " + context);
//			} else {
//				return new BindingPathScope(expectedType.getType());
//			}
//		} else {
//			UiPathSegment parent = (UiPathSegment) segment.eContainer();
//			return new BindingPathScope(parent.getJvmField().getType()
//					.getType());
//		}
//	}
//
//	/**
//	 * Creates a scope returning the available jvm fields for the current state.
//	 * 
//	 * @param context
//	 * @return
//	 */
//	private IScope createBindingEndpointDefPathScope(EObject context) {
//		UiBindingEndpointDef parent = (UiBindingEndpointDef) context;
//		UxEndpointDef uxEndpointDef = (UxEndpointDef) parent.getEndpoint();
//		YElement bindable = parent.getBindable();
//
//		JvmTypeReference expectedType = uxEndpointDef.getJvmType();
//		if (expectedType.getQualifiedName().equals(Void.class.getName())) {
//			if (bindable instanceof YBeanSlot) {
//				YBeanSlot slot = (YBeanSlot) bindable;
//				return new BindingPathScope(types.findDeclaredType(
//						slot.getValueType(), context));
//			}
//		} else {
//			return new BindingPathScope(expectedType.getType());
//		}
//
//		return IScope.NULLSCOPE;
//	}
}
