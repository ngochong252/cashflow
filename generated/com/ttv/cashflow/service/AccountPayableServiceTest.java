
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.AccountPayable;
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
public class AccountPayableServiceTest {

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
	protected AccountPayableService service;

	/**
	 * Instantiates a new AccountPayableServiceTest.
	 *
	 */
	public AccountPayableServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing Ledger entity
	* 
	 */
	@Test
	public void saveAccountPayableLedger() {
		// TODO: JUnit - Populate test inputs for operation: saveAccountPayableLedger 
		Integer id = 0;
		Ledger related_ledger = new com.ttv.cashflow.domain.Ledger();
		AccountPayable response = null;
		response = service.saveAccountPayableLedger(id, related_ledger);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAccountPayableLedger
	}

	/**
	 * Operation Unit Test
	* Save an existing AccountPayable entity
	* 
	 */
	@Test
	public void saveAccountPayable() {
		// TODO: JUnit - Populate test inputs for operation: saveAccountPayable 
		AccountPayable accountpayable = new com.ttv.cashflow.domain.AccountPayable();
		service.saveAccountPayable(accountpayable);
	}

	/**
	 * Operation Unit Test
	* Return a count of all AccountPayable entity
	* 
	 */
	@Test
	public void countAccountPayables() {
		Integer response = null;
		response = service.countAccountPayables();
		// TODO: JUnit - Add assertions to test outputs of operation: countAccountPayables
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAccountPayableByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAccountPayableByPrimaryKey 
		Integer id_1 = 0;
		AccountPayable response = null;
		response = service.findAccountPayableByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findAccountPayableByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing AccountPayable entity
	* 
	 */
	@Test
	public void loadAccountPayables() {
		Set<AccountPayable> response = null;
		response = service.loadAccountPayables();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAccountPayables
	}

	/**
	 * Operation Unit Test
	* Return all AccountPayable entity
	* 
	 */
	@Test
	public void findAllAccountPayables() {
		// TODO: JUnit - Populate test inputs for operation: findAllAccountPayables 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<AccountPayable> response = null;
		response = service.findAllAccountPayables(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAccountPayables
	}

	/**
	 * Operation Unit Test
	* Delete an existing AccountPayable entity
	* 
	 */
	@Test
	public void deleteAccountPayable() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccountPayable 
		AccountPayable accountpayable_1 = new com.ttv.cashflow.domain.AccountPayable();
		service.deleteAccountPayable(accountpayable_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Ledger entity
	* 
	 */
	@Test
	public void deleteAccountPayableLedger() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccountPayableLedger 
		Integer accountpayable_id = 0;
		Integer related_ledger_id = 0;
		AccountPayable response = null;
		response = service.deleteAccountPayableLedger(accountpayable_id, related_ledger_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAccountPayableLedger
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
