
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Configuration;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
@Transactional
public class ConfigurationServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ConfigurationService service;

	/**
	 * Instantiates a new ConfigurationServiceTest.
	 *
	 */
	public ConfigurationServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all Configuration entity
	* 
	 */
	@Test
	public void countConfigurations() {
		Integer response = null;
		response = service.countConfigurations();
		// TODO: JUnit - Add assertions to test outputs of operation: countConfigurations
	}

	/**
	 * Operation Unit Test
	* Return all Configuration entity
	* 
	 */
	@Test
	public void findAllConfigurations() {
		// TODO: JUnit - Populate test inputs for operation: findAllConfigurations 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Configuration> response = null;
		response = service.findAllConfigurations(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllConfigurations
	}

	/**
	 * Operation Unit Test
	* Delete an existing Configuration entity
	* 
	 */
	@Test
	public void deleteConfiguration() {
		// TODO: JUnit - Populate test inputs for operation: deleteConfiguration 
		Configuration configuration = new com.ttv.cashflow.domain.Configuration();
		service.deleteConfiguration(configuration);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findConfigurationByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findConfigurationByPrimaryKey 
		Integer id = 0;
		Configuration response = null;
		response = service.findConfigurationByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findConfigurationByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Configuration entity
	* 
	 */
	@Test
	public void saveConfiguration() {
		// TODO: JUnit - Populate test inputs for operation: saveConfiguration 
		Configuration configuration_1 = new com.ttv.cashflow.domain.Configuration();
		service.saveConfiguration(configuration_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing Configuration entity
	* 
	 */
	@Test
	public void loadConfigurations() {
		Set<Configuration> response = null;
		response = service.loadConfigurations();
		// TODO: JUnit - Add assertions to test outputs of operation: loadConfigurations
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
