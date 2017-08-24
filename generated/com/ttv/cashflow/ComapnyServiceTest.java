
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

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
public class ComapnyServiceTest {

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
	protected ComapnyService service;

	/**
	 * Instantiates a new ComapnyServiceTest.
	 *
	 */
	public ComapnyServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Ledger entity
	* 
	 */
	@Test
	public void saveComapnyLedgers() {
		// TODO: JUnit - Populate test inputs for operation: saveComapnyLedgers 
		Integer id = 0;
		Ledger related_ledgers = new com.ttv.cashflow.domain.Ledger();
		Comapny response = null;
		response = service.saveComapnyLedgers(id, related_ledgers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveComapnyLedgers
	}

	/**
	 * Operation Unit Test
	* Return a count of all Comapny entity
	* 
	 */
	@Test
	public void countComapnys() {
		Integer response = null;
		response = service.countComapnys();
		// TODO: JUnit - Add assertions to test outputs of operation: countComapnys
	}

	/**
	 * Operation Unit Test
	* Load an existing Comapny entity
	* 
	 */
	@Test
	public void loadComapnys() {
		Set<Comapny> response = null;
		response = service.loadComapnys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadComapnys
	}

	/**
	 * Operation Unit Test
	* Delete an existing Comapny entity
	* 
	 */
	@Test
	public void deleteComapny() {
		// TODO: JUnit - Populate test inputs for operation: deleteComapny 
		Comapny comapny = new com.ttv.cashflow.domain.Comapny();
		service.deleteComapny(comapny);
	}

	/**
	 * Operation Unit Test
	* Save an existing BankingAccounting entity
	* 
	 */
	@Test
	public void saveComapnyBankingAccountings() {
		// TODO: JUnit - Populate test inputs for operation: saveComapnyBankingAccountings 
		Integer id_1 = 0;
		BankingAccounting related_bankingaccountings = new com.ttv.cashflow.domain.BankingAccounting();
		Comapny response = null;
		response = service.saveComapnyBankingAccountings(id_1, related_bankingaccountings);
		// TODO: JUnit - Add assertions to test outputs of operation: saveComapnyBankingAccountings
	}

	/**
	 * Operation Unit Test
	* Delete an existing Ledger entity
	* 
	 */
	@Test
	public void deleteComapnyLedgers() {
		// TODO: JUnit - Populate test inputs for operation: deleteComapnyLedgers 
		Integer comapny_id = 0;
		Integer related_ledgers_id = 0;
		Comapny response = null;
		response = service.deleteComapnyLedgers(comapny_id, related_ledgers_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteComapnyLedgers
	}

	/**
	 * Operation Unit Test
	* Return all Comapny entity
	* 
	 */
	@Test
	public void findAllComapnys() {
		// TODO: JUnit - Populate test inputs for operation: findAllComapnys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Comapny> response = null;
		response = service.findAllComapnys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllComapnys
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findComapnyByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findComapnyByPrimaryKey 
		Integer id_2 = 0;
		Comapny response = null;
		response = service.findComapnyByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findComapnyByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Comapny entity
	* 
	 */
	@Test
	public void saveComapny() {
		// TODO: JUnit - Populate test inputs for operation: saveComapny 
		Comapny comapny_1 = new com.ttv.cashflow.domain.Comapny();
		service.saveComapny(comapny_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing BankingAccounting entity
	* 
	 */
	@Test
	public void deleteComapnyBankingAccountings() {
		// TODO: JUnit - Populate test inputs for operation: deleteComapnyBankingAccountings 
		Integer comapny_id_1 = 0;
		Integer related_bankingaccountings_id = 0;
		Comapny response = null;
		response = service.deleteComapnyBankingAccountings(comapny_id_1, related_bankingaccountings_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteComapnyBankingAccountings
	}

	/**
	 * Operation Unit Test
	* Save an existing Approval entity
	* 
	 */
	@Test
	public void saveComapnyApprovals() {
		// TODO: JUnit - Populate test inputs for operation: saveComapnyApprovals 
		Integer id_3 = 0;
		Approval related_approvals = new com.ttv.cashflow.domain.Approval();
		Comapny response = null;
		response = service.saveComapnyApprovals(id_3, related_approvals);
		// TODO: JUnit - Add assertions to test outputs of operation: saveComapnyApprovals
	}

	/**
	 * Operation Unit Test
	* Delete an existing Approval entity
	* 
	 */
	@Test
	public void deleteComapnyApprovals() {
		// TODO: JUnit - Populate test inputs for operation: deleteComapnyApprovals 
		Integer comapny_id_2 = 0;
		Integer related_approvals_id = 0;
		Comapny response = null;
		response = service.deleteComapnyApprovals(comapny_id_2, related_approvals_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteComapnyApprovals
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
