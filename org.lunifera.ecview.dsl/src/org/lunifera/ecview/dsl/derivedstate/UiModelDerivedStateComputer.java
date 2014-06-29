package org.lunifera.ecview.dsl.derivedstate;

import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.lunifera.ecview.dsl.uIGrammar.GBeanSlot;
import org.lunifera.ecview.dsl.uIGrammar.UiModel;

public class UiModelDerivedStateComputer implements IDerivedStateComputer {

	@Override
	public void installDerivedState(DerivedStateAwareResource resource,
			boolean preLinkingPhase) {
		if (resource.getContents().isEmpty())
			return;

		if (!preLinkingPhase) {
			UiModel eObject = (UiModel) resource.getContents().get(0);

			for (YViewSet yViewSet : eObject.getViewSet()) {
				for (YBeanSlot yBeanSlot : yViewSet.getBeanSlots()) {
					if (yBeanSlot.getValueType() == null) {
						GBeanSlot gSlot = (GBeanSlot) yBeanSlot;
						JvmTypeReference typeReference = gSlot.getJvmType();
						yBeanSlot.setValueTypeQualifiedName(typeReference
								.getQualifiedName());
					}
				}
			}
		}
	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {

	}

}
