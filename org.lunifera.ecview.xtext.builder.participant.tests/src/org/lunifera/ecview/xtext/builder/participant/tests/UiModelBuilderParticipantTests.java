/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.ecview.xtext.builder.participant.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.knowhowlab.osgi.testing.assertions.OSGiAssert.setDefaultBundleContext;
import static org.knowhowlab.osgi.testing.utils.ServiceUtils.getService;

import org.lunifera.ecview.core.common.model.core.YViewSet;
import org.junit.Before;
import org.junit.Test;
import org.knowhowlab.osgi.testing.utils.BundleUtils;
import org.lunifera.ecview.xtext.builder.participant.IECViewAddonsMetadataService;
import org.lunifera.xtext.builder.metadata.services.IMetadataBuilderService;
import org.osgi.framework.BundleException;

public class UiModelBuilderParticipantTests {

	private static final String VIEWSET_FQN = "myViewSet";
	private static final int TIME_15000 = 15000;
	private static final int TIME_1000 = 1000;

	@Before
	public void setup() throws BundleException {
		setDefaultBundleContext(Activator.context);

		BundleUtils.startBundleAsync(Activator.context,
				"org.lunifera.xtext.builder.metadata.services");
		IMetadataBuilderService service = getService(Activator.context,
				IMetadataBuilderService.class, TIME_15000);
		assertNotNull(service);
	}

	@Test
	public void testAccessEntity() throws Exception {

		IECViewAddonsMetadataService service = getService(Activator.context,
				IECViewAddonsMetadataService.class, TIME_1000);
		assertNotNull(service);

		YViewSet viewSet = service.getViewSetMetadata(VIEWSET_FQN);
		assertEquals("myViewSet", viewSet.getName());
		assertEquals("my.types.MyDto", viewSet.getBeanSlots().get(0).getValueTypeQualifiedName());
		

	}

}
