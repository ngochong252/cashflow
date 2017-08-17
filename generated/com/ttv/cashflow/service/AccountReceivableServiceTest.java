
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.AccountReceivable;
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
public class AccountReceivableServiceTest {

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
	protected AccountReceivableService service;

	/**
	 * Instantiates a new AccountReceivableServiceTest.
	 *
	 */
	public AccountReceivableServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing AccountReceivable entity
	* 
	 */
	@Test
	public void loadAccountReceivables() {
		Set<AccountReceivable> response = null;
		response = service.loadAccountReceivables();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAccountReceivables
	}

	/**
	 * Operation Unit Test
	* Save an existing AccountReceivable entity
	* 
	 */
	@Test
	public void saveAccountReceivable() {
		// TODO: JUnit - Populate test inputs for operation: saveAccountReceivable 
		AccountReceivable accountreceivable = new com.ttv.cashflow.domain.AccountReceivable();
		service.saveAccountReceivable(accountreceivable);
	}

	/**
	 * Operation Unit Test
	* Return all AccountReceivable entity
	* 
	 */
	@Test
	public void findAllAccountReceivables() {
		// TODO: JUnit - Populate test inputs for operation: findAllAccountReceivables 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<AccountReceivable> response = null;
		response = service.findAllAccountReceivables(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAccountReceivables
	}

	/**
	 * Operation Unit Test
	* Return a count of all AccountReceivable entity
	* 
	 */
	@Test
	public void countAccountReceivables() {
		Integer response = null;
		response = service.countAccountReceivables();
		// TODO: JUnit - Add assertions to test outputs of operation: countAccountReceivables
	}

	/**
	 * Operation Unit Test
	* Save an existing Ledger entity
	* 
	 */
	@Test
	public void saveAccountReceivableLedger() {
		// TODO: JUnit - Populate test inputs for operation: saveAccountReceivableLedger 
		Integer id = 0;
		Ledger related_ledger = new com.ttv.cashflow.domain.Ledger();
		AccountReceivable response = null;
		response = service.saveAccountReceivableLedger(id, related_ledger);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAccountReceivableLedger
	}

	/**
	 * Operation Unit Test
	* Delete an existing AccountReceivable entity
	* 
	 */
	@Test
	public void deleteAccountReceivable() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccountReceivable 
		AccountReceivable accountreceivable_1 = new com.ttv.cashflow.domain.AccountReceivable();
		service.deleteAccountReceivable(accountreceivable_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAccountReceivableByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAccountReceivableByPrimaryKey 
		Integer id_1 = 0;
		AccountReceivable response = null;
		response = service.findAccountReceivableByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findAccountReceivableByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Ledger entity
	* 
	 */
	@Test
	public void deleteAccountReceivableLedger() {
		// TODO: JUnit - Populate test inputs for operation: deleteAccountReceivableLedger 
		Integer accountreceivable_id = 0;
		Integer related_ledger_id = 0;
		AccountReceivable response = null;
		response = service.deleteAccountReceivableLedger(accountreceivable_id, related_ledger_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAccountReceivableLedger
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
