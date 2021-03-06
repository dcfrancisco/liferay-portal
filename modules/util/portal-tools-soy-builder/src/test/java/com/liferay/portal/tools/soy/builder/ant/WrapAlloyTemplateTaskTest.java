/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.tools.soy.builder.ant;

import com.liferay.portal.tools.soy.builder.commands.WrapAlloyTemplateCommandTest;

import java.io.File;

import java.net.URL;

import org.apache.tools.ant.BuildFileRule;
import org.apache.tools.ant.Project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;

/**
 * @author Andrea Di Giorgi
 */
public class WrapAlloyTemplateTaskTest extends WrapAlloyTemplateCommandTest {

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();

		URL url = ReplaceTranslationTaskTest.class.getResource(
			"dependencies/wrap_alloy_template/build.xml");

		File buildXmlFile = new File(url.toURI());

		Assert.assertTrue(buildXmlFile.isFile());

		buildFileRule.configureProject(buildXmlFile.getAbsolutePath());
	}

	@Rule
	public final BuildFileRule buildFileRule = new BuildFileRule();

	@Override
	protected void wrapAlloyTemplate(
			File dir, String moduleName, String namespace)
		throws Exception {

		Project project = buildFileRule.getProject();

		project.setProperty("wrap.alloy.template.dir", dir.getAbsolutePath());
		project.setProperty("wrap.alloy.module.name", moduleName);
		project.setProperty("wrap.alloy.namespace", namespace);

		project.executeTarget("wrap-alloy-template");
	}

}