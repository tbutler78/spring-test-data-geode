/*
 *  Copyright 2018 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package org.springframework.data.gemfire.tests.mock.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.gemfire.tests.mock.config.GemFireMockObjectsBeanPostProcessor;

/**
 * The {@link GemFireMockObjectsApplicationContextInitializer} class is a Spring {@link ApplicationContextInitializer}
 * used to initialize the Spring {@link ConfigurableApplicationContext} with GemFire Object mocking.
 *
 * @author John Blum
 * @see org.springframework.context.ApplicationContextInitializer
 * @see org.springframework.context.ConfigurableApplicationContext
 * @see org.springframework.data.gemfire.tests.mock.config.GemFireMockObjectsBeanPostProcessor
 * @since 0.0.1
 */
public class GemFireMockObjectsApplicationContextInitializer
		implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	@SuppressWarnings("all")
	public void initialize(ConfigurableApplicationContext applicationContext) {
		applicationContext.getBeanFactory().addBeanPostProcessor(GemFireMockObjectsBeanPostProcessor.newInstance());
	}
}
