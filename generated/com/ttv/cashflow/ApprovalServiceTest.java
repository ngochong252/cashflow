
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.Comapny;

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
public class ApprovalServiceTest {

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
	protected ApprovalService service;

	/**
	 * Instantiates a new ApprovalServiceTest.
	 *
	 */
	public ApprovalServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all Approval entity
	* 
	 */
	@Test
	public void countApprovals() {
		Integer response = null;
		response = service.countApprovals();
		// TODO: JUnit - Add assertions to test outputs of operation: countApprovals
	}

	/**
	 * Operation Unit Test
	* Delete an existing Approval entity
	* 
	 */
	@Test
	public void deleteApproval() {
		// TODO: JUnit - Populate test inputs for operation: deleteApproval 
		Approval approval = new com.ttv.cashflow.domain.Approval();
		service.deleteApproval(approval);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Comapny entity
	* 
	 */
	@Test
	public void deleteApprovalComapny() {
		// TODO: JUnit - Populate test inputs for operation: deleteApprovalComapny 
		Integer approval_id = 0;
		Integer related_comapny_id = 0;
		Approval response = null;
		response = service.deleteApprovalComapny(approval_id, related_comapny_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteApprovalComapny
	}

	/**
	 * Operation Unit Test
	* Return all Approval entity
	* 
	 */
	@Test
	public void findAllApprovals() {
		// TODO: JUnit - Populate test inputs for operation: findAllApprovals 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Approval> response = null;
		response = service.findAllApprovals(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllApprovals
	}

	/**
	 * Operation Unit Test
	* Save an existing Comapny entity
	* 
	 */
	@Test
	public void saveApprovalComapny() {
		// TODO: JUnit - Populate test inputs for operation: saveApprovalComapny 
		Integer id = 0;
		Comapny related_comapny = new com.ttv.cashflow.domain.Comapny();
		Approval response = null;
		response = service.saveApprovalComapny(id, related_comapny);
		// TODO: JUnit - Add assertions to test outputs of operation: saveApprovalComapny
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findApprovalByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findApprovalByPrimaryKey 
		Integer id_1 = 0;
		Approval response = null;
		response = service.findApprovalByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findApprovalByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Approval entity
	* 
	 */
	@Test
	public void saveApproval() {
		// TODO: JUnit - Populate test inputs for operation: saveApproval 
		Approval approval_1 = new com.ttv.cashflow.domain.Approval();
		service.saveApproval(approval_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing Approval entity
	* 
	 */
	@Test
	public void loadApprovals() {
		Set<Approval> response = null;
		response = service.loadApprovals();
		// TODO: JUnit - Add assertions to test outputs of operation: loadApprovals
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
