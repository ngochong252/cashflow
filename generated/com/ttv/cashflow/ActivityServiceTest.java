
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Activity;

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
public class ActivityServiceTest {

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
	protected ActivityService service;

	/**
	 * Instantiates a new ActivityServiceTest.
	 *
	 */
	public ActivityServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all Activity entity
	* 
	 */
	@Test
	public void countActivitys() {
		Integer response = null;
		response = service.countActivitys();
		// TODO: JUnit - Add assertions to test outputs of operation: countActivitys
	}

	/**
	 * Operation Unit Test
	* Load an existing Activity entity
	* 
	 */
	@Test
	public void loadActivitys() {
		Set<Activity> response = null;
		response = service.loadActivitys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadActivitys
	}

	/**
	 * Operation Unit Test
	* Delete an existing Activity entity
	* 
	 */
	@Test
	public void deleteActivity() {
		// TODO: JUnit - Populate test inputs for operation: deleteActivity 
		Activity activity = new com.ttv.cashflow.domain.Activity();
		service.deleteActivity(activity);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findActivityByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findActivityByPrimaryKey 
		Integer id = 0;
		Activity response = null;
		response = service.findActivityByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findActivityByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all Activity entity
	* 
	 */
	@Test
	public void findAllActivitys() {
		// TODO: JUnit - Populate test inputs for operation: findAllActivitys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Activity> response = null;
		response = service.findAllActivitys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllActivitys
	}

	/**
	 * Operation Unit Test
	* Save an existing Activity entity
	* 
	 */
	@Test
	public void saveActivity() {
		// TODO: JUnit - Populate test inputs for operation: saveActivity 
		Activity activity_1 = new com.ttv.cashflow.domain.Activity();
		service.saveActivity(activity_1);
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
