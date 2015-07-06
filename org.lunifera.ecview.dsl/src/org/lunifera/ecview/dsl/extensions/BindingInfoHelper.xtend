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

package org.lunifera.ecview.dsl.extensions

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmType
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiBinding
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAlias
import org.lunifera.ecview.semantic.uimodel.UiBindingEndpointAssignment
import org.lunifera.ecview.semantic.uimodel.UiBindingExpression
import org.lunifera.ecview.semantic.uimodel.UiCommandBindableDef
import org.lunifera.ecview.semantic.uimodel.UiEmbeddable
import org.lunifera.ecview.semantic.uimodel.UiModel
import org.lunifera.ecview.semantic.uimodel.UiTypedBindableDef

class BindingInfoHelper {

	@Inject
	BindableTypeProvider typeOfBoundPropertyProvider;

	def dispatch void collectBindingInfo(UiBindingEndpointAssignment assignment, BindingInfo info) {
		var result = if(info != null) info else new BindingInfo
		if (assignment.typedBindableAlias != null) {
			assignment.typedBindableAlias.collectBindingInfo(result)
		} else {
			assignment.typedBindableDef.collectBindingInfo(result)
		}

		// on the way back up the structure, collect the path
		if (assignment.path != null) {
			info.appendPath(assignment.path.toPathString)
			info.typeOfBoundProperty = assignment.path.typeofLastSegment
			info.deepestJvmField = assignment.path.operationofLastSegment

			val pathType = assignment.path.typeofSecondLastSegment
			if (info.typeForBinding == null && pathType != null) {
				info.typeForBinding = pathType
			}
		}
	}

	def dispatch void collectBindingInfo(UiBeanSlot slot, BindingInfo info) {
		info.bindingRoot = slot
		info.typeForBinding = slot.jvmType?.type
	}

	def dispatch void collectBindingInfo(UiBindingEndpointAlias alias, BindingInfo info) {
		alias.endpoint.collectBindingInfo(info)
	}

	def dispatch void collectBindingInfo(UiTypedBindableDef definition, BindingInfo info) {

		// must be the last element
		info.typeForBinding = typeOfBoundPropertyProvider.getType(definition)
		info.bindingRoot = definition.rawBindableOfLastSegment
		val bindingMethod = definition.method
		if (bindingMethod != null) {
			if (!bindingMethod.targetName.nullOrEmpty) {
				info.appendPath(bindingMethod.targetName)
			} else {
				info.appendPath(bindingMethod.name)
			}
		}
	}

	def dispatch void collectBindingInfo(UiCommandBindableDef definition, BindingInfo info) {

		// must be the last element
		info.typeForBinding = typeOfBoundPropertyProvider.getType(definition)
		info.bindingRoot = definition.command
	}

	def dispatch void collectBindingInfo(UiBindingExpression definition, BindingInfo info) {
		throw new UnsupportedOperationException
	}

	/**
	 * Returns all bindings, where the embeddable is a raw bindable. If binding alias is used, this method can not return these bindings.
	 */
	def List<UiBinding> findBindings(UiEmbeddable embeddable) {
		val result = <UiBinding>newArrayList()
		val uiModel = embeddable.uiModel
		for (EObject object : EcoreUtil.getAllContents(uiModel, true).toIterable) {
			if (object instanceof UiTypedBindableDef) {
				if (object.rawBindable == embeddable) {
					val UiBinding found = findBinding(object as UiTypedBindableDef)
					if (found != null) {
						result += found
					}
				}
			}
		}
		return result
	}

	/** 
	 * Tries to find the UiBinding in the container hierarchy of the given binding defintion.
	 */
	def UiBinding findBinding(UiTypedBindableDef bindableDef) {
		var parent = bindableDef.eContainer
		while (parent != null) {
			if (parent instanceof UiBinding) {
				return parent
			} else {
				parent = parent.eContainer
			}
		}

		return null
	}

	/**
	 * Returns all opposite binding endpoints, that share a binding with the embeddable.<br>
	 * For instance:<br>
	 * bind customer.name --> [textField].value<br>
	 * In this case <code>textField</code> is given and the endpoint for <code>customer.name</code> is returned
	 */
	def List<UiBindingEndpointAssignment> findOppositeEndpointAssignments(UiEmbeddable embeddable, String propertyName) {
		val result = <UiBindingEndpointAssignment>newArrayList()
		val uiModel = embeddable.uiModel
		for (EObject object : EcoreUtil.getAllContents(uiModel, true).toIterable) {
			if (object instanceof UiTypedBindableDef) {
				if (propertyName == null || object.method != null && object.method.name.equals(propertyName)) {
					if (object.rawBindable == embeddable || object.rawBindableOfLastSegment == embeddable) {
						val UiBindingEndpointAssignment found = findOppositeEndpointAssignment(
							object as UiTypedBindableDef)
						if (found != null) {
							result += found
						}
					}
				}
			}
		}
		return result
	}

	/** 
	 * Returns the opposite binding endpoint, that share a binding with the embeddable.<br>
	 * For instance:<br>
	 * bind customer.name --> [textField].value<br>
	 * In this case <code>textField</code> is given and the endpoint for <code>customer.name</code> is returned
	 */
	def List<JvmOperation> findBoundOppositeJvmOperations(UiEmbeddable embeddable, String propertyName) {
		val result = <JvmOperation>newArrayList()
		for (UiBindingEndpointAssignment assignment : findOppositeEndpointAssignments(embeddable, propertyName)) {
			val BindingInfo info = new BindingInfo
			collectBindingInfo(assignment, info)
			result += info.deepestJvmField
		}
		return result
	}

	/** 
	 * Returns the opposite binding endpoint, that share a binding with the embeddable.<br>
	 * For instance:<br>
	 * bind customer.name --> [textField].value<br>
	 * In this case <code>textField</code> is given and the endpoint for <code>customer.name</code> is returned
	 */
	def UiBindingEndpointAssignment findOppositeEndpointAssignment(UiTypedBindableDef bindableDef) {
		var EObject child = bindableDef
		var parent = bindableDef.eContainer
		while (parent != null) {
			if (parent instanceof UiBinding) {
				if (parent.source == child) {
					return parent.target as UiBindingEndpointAssignment
				} else if (parent.target == child) {
					return parent.source as UiBindingEndpointAssignment
				}
			} else {
				child = parent
				parent = child.eContainer
			}
		}

		return null
	}

	/**
	 * Returns the package name.
	 * 
	 * @param eObject
	 * @return
	 */
	def String getPackage(EObject eObject) {
		if (eObject == null) {
			return "";
		}
		if (eObject instanceof UiModel) {
			return (eObject as UiModel).getPackageName();
		} else {
			return getPackage(eObject.eContainer());
		}
	}

	def UiModel getUiModel(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		if (eObject instanceof UiModel) {
			return eObject as UiModel;
		} else {
			return getUiModel(eObject.eContainer());
		}
	}

	public static class BindingInfo {

		/**
		 * The type of the bound property. For nested bindings it is the last element available
		 */
		private JvmType typeOfBoundProperty

		/**
		 * The type of the binding. For nested bindings it is the element before the bound property
		 */
		private JvmType typeForBinding

		/**
		 * The deepest JvmOperation in the hierarchy. This field is used to bind.
		 */
		private JvmOperation deepestJvmField

		/**
		 * The nested path using dot notation.
		 */
		private StringBuilder path = new StringBuilder

		/**
		 * The element the binding should be installed on
		 */
		private EObject bindingRoot

		/**
		 * Append the segment to the path.
		 */
		def appendPath(String segment) {
			if (segment.nullOrEmpty) {
				return
			}

			if (path.length > 0) {
				path.append(".")
			}
			path.append(segment)
		}

		def JvmType getTypeOfBoundProperty() {
			return typeOfBoundProperty
		}

		def void setTypeOfBoundProperty(JvmType typeOfBoundProperty) {
			this.typeOfBoundProperty = typeOfBoundProperty
		}

		def JvmType getTypeForBinding() {
			return typeForBinding
		}

		def void setTypeForBinding(JvmType typeForBinding) {
			this.typeForBinding = typeForBinding
		}

		def JvmOperation getDeepestJvmField() {
			return deepestJvmField
		}

		def void setDeepestJvmField(JvmOperation typeOfBoundProperty) {
			this.deepestJvmField = deepestJvmField
		}

		def EObject getBindingRoot() {
			return bindingRoot
		}

		def void setBindingRoot(EObject bindingRoot) {
			this.bindingRoot = bindingRoot
		}

		def StringBuilder getPath() {
			return path
		}
	}
}
