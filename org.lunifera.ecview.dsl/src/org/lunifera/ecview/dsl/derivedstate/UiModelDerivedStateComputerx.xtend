package org.lunifera.ecview.dsl.derivedstate

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.lunifera.ecview.dsl.uIGrammar.GBeanSlot

class UiModelDerivedStateComputerx implements IDerivedStateComputer {

	private volatile boolean setup;

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (resource.getContents().isEmpty())
			return;

		if (!preLinkingPhase) {
			if (!setup) {
				//				resource.resourceSet.getResource(URI::createURI("uiconfig://TextField"), true).contents
				//				val result = resource.resourceSet.getEObject(URI::createURI("uiconfig://TextField"), false)
				//				setup = true;
			}

			resource.getAllContents.forEach [
				it.complete
			]
		}
	}

	def dispatch void complete(EObject eObject) {
	}

	def dispatch void complete(YBeanSlot yBeanSlot) {
		val gSlot = yBeanSlot as GBeanSlot
		val typeReference = gSlot.getJvmType
		if(typeReference != null) yBeanSlot.valueTypeQualifiedName = typeReference.qualifiedName
	}

	//	def dispatch void complete(YTable yTable) {
	//		val gTable = yTable as GTable
	//		val typeReference = gTable.getJvmType
	//		if(typeReference != null) yTable.typeQualifiedName = typeReference.qualifiedName
	//	}
	override void discardDerivedState(DerivedStateAwareResource resource) {
		print("")
	}

}
