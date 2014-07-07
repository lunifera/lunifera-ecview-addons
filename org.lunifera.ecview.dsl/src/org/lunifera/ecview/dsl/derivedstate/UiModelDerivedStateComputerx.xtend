package org.lunifera.ecview.dsl.derivedstate

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.lunifera.ecview.semantic.uimodel.UiBeanSlot
import org.lunifera.ecview.semantic.uimodel.UiIDEView
import org.lunifera.ecview.semantic.uimodel.uiextension.UiGridLayout
import org.lunifera.ecview.semantic.uimodel.uiextension.UiTextField

class UiModelDerivedStateComputerx implements IDerivedStateComputer {

	private volatile boolean setup;

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (resource.getContents().isEmpty())
			return;

		if (!preLinkingPhase) {
			resource.getAllContents.forEach [
				it.complete
			]
		}
	}

	def dispatch void complete(EObject eObject) {
	}
	
	def dispatch void complete(UiIDEView eObject) {
	}
	
	def dispatch void complete(UiTextField eObject) {
		eObject.label = eObject.name
	}
	
	def dispatch void complete(UiGridLayout eObject) {
		eObject.columns = 4
		
		for(assignment : eObject.contents){
			eObject.addElement(assignment.element)
		}
	}
 
	def dispatch void complete(YBeanSlot yBeanSlot) {
		val gSlot = yBeanSlot as UiBeanSlot
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
