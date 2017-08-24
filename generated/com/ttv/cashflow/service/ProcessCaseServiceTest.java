
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

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
public class ProcessCaseServiceTest {

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
	protected ProcessCaseService service;

	/**
	 * Instantiates a new ProcessCaseServiceTest.
	 *
	 */
	public ProcessCaseServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all ProcessCase entity
	* 
	 */
	@Test
	public void countProcessCases() {
		Integer response = null;
		response = service.countProcessCases();
		// TODO: JUnit - Add assertions to test outputs of operation: countProcessCases
	}

	/**
	 * Operation Unit Test
	* Load an existing ProcessCase entity
	* 
	 */
	@Test
	public void loadProcessCases() {
		Set<ProcessCase> response = null;
		response = service.loadProcessCases();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProcessCases
	}

	/**
	 * Operation Unit Test
	* Return all ProcessCase entity
	* 
	 */
	@Test
	public void findAllProcessCases() {
		// TODO: JUnit - Populate test inputs for operation: findAllProcessCases 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ProcessCase> response = null;
		response = service.findAllProcessCases(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProcessCases
	}

	/**
	 * Operation Unit Test
	* Save an existing ErrorDetails entity
	* 
	 */
	@Test
	public void saveProcessCaseErrorDetails() {
		// TODO: JUnit - Populate test inputs for operation: saveProcessCaseErrorDetails 
		Integer id = 0;
		ErrorDetails related_errordetails = new com.ttv.cashflow.domain.ErrorDetails();
		ProcessCase response = null;
		response = service.saveProcessCaseErrorDetails(id, related_errordetails);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProcessCaseErrorDetails
	}

	/**
	 * Operation Unit Test
	* Delete an existing ProcessCase entity
	* 
	 */
	@Test
	public void deleteProcessCase() {
		// TODO: JUnit - Populate test inputs for operation: deleteProcessCase 
		ProcessCase processcase = new com.ttv.cashflow.domain.ProcessCase();
		service.deleteProcessCase(processcase);
	}

	/**
	 * Operation Unit Test
	* Delete an existing ErrorDetails entity
	* 
	 */
	@Test
	public void deleteProcessCaseErrorDetails() {
		// TODO: JUnit - Populate test inputs for operation: deleteProcessCaseErrorDetails 
		Integer processcase_id = 0;
		Integer related_errordetails_id = 0;
		ProcessCase response = null;
		response = service.deleteProcessCaseErrorDetails(processcase_id, related_errordetails_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProcessCaseErrorDetails
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProcessCaseByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProcessCaseByPrimaryKey 
		Integer id_1 = 0;
		ProcessCase response = null;
		response = service.findProcessCaseByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findProcessCaseByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing ProcessCase entity
	* 
	 */
	@Test
	public void saveProcessCase() {
		// TODO: JUnit - Populate test inputs for operation: saveProcessCase 
		ProcessCase processcase_1 = new com.ttv.cashflow.domain.ProcessCase();
		service.saveProcessCase(processcase_1);
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
