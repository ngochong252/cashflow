
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
public class ErrorDetailsServiceTest {

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
	protected ErrorDetailsService service;

	/**
	 * Instantiates a new ErrorDetailsServiceTest.
	 *
	 */
	public ErrorDetailsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all ErrorDetails entity
	* 
	 */
	@Test
	public void countErrorDetailss() {
		Integer response = null;
		response = service.countErrorDetailss();
		// TODO: JUnit - Add assertions to test outputs of operation: countErrorDetailss
	}

	/**
	 * Operation Unit Test
	* Load an existing ErrorDetails entity
	* 
	 */
	@Test
	public void loadErrorDetailss() {
		Set<ErrorDetails> response = null;
		response = service.loadErrorDetailss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadErrorDetailss
	}

	/**
	 * Operation Unit Test
	* Save an existing ProcessCase entity
	* 
	 */
	@Test
	public void saveErrorDetailsProcessCases() {
		// TODO: JUnit - Populate test inputs for operation: saveErrorDetailsProcessCases 
		Integer id = 0;
		ProcessCase related_processcases = new com.ttv.cashflow.domain.ProcessCase();
		ErrorDetails response = null;
		response = service.saveErrorDetailsProcessCases(id, related_processcases);
		// TODO: JUnit - Add assertions to test outputs of operation: saveErrorDetailsProcessCases
	}

	/**
	 * Operation Unit Test
	* Delete an existing ErrorDetails entity
	* 
	 */
	@Test
	public void deleteErrorDetails() {
		// TODO: JUnit - Populate test inputs for operation: deleteErrorDetails 
		ErrorDetails errordetails = new com.ttv.cashflow.domain.ErrorDetails();
		service.deleteErrorDetails(errordetails);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findErrorDetailsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findErrorDetailsByPrimaryKey 
		Integer id_1 = 0;
		ErrorDetails response = null;
		response = service.findErrorDetailsByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findErrorDetailsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all ErrorDetails entity
	* 
	 */
	@Test
	public void findAllErrorDetailss() {
		// TODO: JUnit - Populate test inputs for operation: findAllErrorDetailss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ErrorDetails> response = null;
		response = service.findAllErrorDetailss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllErrorDetailss
	}

	/**
	 * Operation Unit Test
	* Save an existing ErrorDetails entity
	* 
	 */
	@Test
	public void saveErrorDetails() {
		// TODO: JUnit - Populate test inputs for operation: saveErrorDetails 
		ErrorDetails errordetails_1 = new com.ttv.cashflow.domain.ErrorDetails();
		service.saveErrorDetails(errordetails_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing ProcessCase entity
	* 
	 */
	@Test
	public void deleteErrorDetailsProcessCases() {
		// TODO: JUnit - Populate test inputs for operation: deleteErrorDetailsProcessCases 
		Integer errordetails_id = 0;
		Integer related_processcases_id = 0;
		ErrorDetails response = null;
		response = service.deleteErrorDetailsProcessCases(errordetails_id, related_processcases_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteErrorDetailsProcessCases
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
