
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.AccountReceivable;
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
public class LedgerServiceTest {

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
	protected LedgerService service;

	/**
	 * Instantiates a new LedgerServiceTest.
	 *
	 */
	public LedgerServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing AccountPayable entity
	* 
	 */
	@Test
	public void saveLedgerAccountPayables() {
		// TODO: JUnit - Populate test inputs for operation: saveLedgerAccountPayables 
		Integer id = 0;
		AccountPayable related_accountpayables = new com.ttv.cashflow.domain.AccountPayable();
		Ledger response = null;
		response = service.saveLedgerAccountPayables(id, related_accountpayables);
		// TODO: JUnit - Add assertions to test outputs of operation: saveLedgerAccountPayables
	}

	/**
	 * Operation Unit Test
	* Return all Ledger entity
	* 
	 */
	@Test
	public void findAllLedgers() {
		// TODO: JUnit - Populate test inputs for operation: findAllLedgers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Ledger> response = null;
		response = service.findAllLedgers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllLedgers
	}

	/**
	 * Operation Unit Test
	* Delete an existing AccountReceivable entity
	* 
	 */
	@Test
	public void deleteLedgerAccountReceivables() {
		// TODO: JUnit - Populate test inputs for operation: deleteLedgerAccountReceivables 
		Integer ledger_id = 0;
		Integer related_accountreceivables_id = 0;
		Ledger response = null;
		response = service.deleteLedgerAccountReceivables(ledger_id, related_accountreceivables_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteLedgerAccountReceivables
	}

	/**
	 * Operation Unit Test
	* Delete an existing Ledger entity
	* 
	 */
	@Test
	public void deleteLedger() {
		// TODO: JUnit - Populate test inputs for operation: deleteLedger 
		Ledger ledger = new com.ttv.cashflow.domain.Ledger();
		service.deleteLedger(ledger);
	}

	/**
	 * Operation Unit Test
	* Delete an existing Comapny entity
	* 
	 */
	@Test
	public void deleteLedgerComapny() {
		// TODO: JUnit - Populate test inputs for operation: deleteLedgerComapny 
		Integer ledger_id_1 = 0;
		Integer related_comapny_companyId = 0;
		Ledger response = null;
		response = service.deleteLedgerComapny(ledger_id_1, related_comapny_companyId);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteLedgerComapny
	}

	/**
	 * Operation Unit Test
	* Load an existing Ledger entity
	* 
	 */
	@Test
	public void loadLedgers() {
		Set<Ledger> response = null;
		response = service.loadLedgers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadLedgers
	}

	/**
	 * Operation Unit Test
	* Save an existing AccountReceivable entity
	* 
	 */
	@Test
	public void saveLedgerAccountReceivables() {
		// TODO: JUnit - Populate test inputs for operation: saveLedgerAccountReceivables 
		Integer id_1 = 0;
		AccountReceivable related_accountreceivables = new com.ttv.cashflow.domain.AccountReceivable();
		Ledger response = null;
		response = service.saveLedgerAccountReceivables(id_1, related_accountreceivables);
		// TODO: JUnit - Add assertions to test outputs of operation: saveLedgerAccountReceivables
	}

	/**
	 * Operation Unit Test
	* Return a count of all Ledger entity
	* 
	 */
	@Test
	public void countLedgers() {
		Integer response = null;
		response = service.countLedgers();
		// TODO: JUnit - Add assertions to test outputs of operation: countLedgers
	}

	/**
	 * Operation Unit Test
	* Save an existing Ledger entity
	* 
	 */
	@Test
	public void saveLedger() {
		// TODO: JUnit - Populate test inputs for operation: saveLedger 
		Ledger ledger_1 = new com.ttv.cashflow.domain.Ledger();
		service.saveLedger(ledger_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findLedgerByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findLedgerByPrimaryKey 
		Integer id_2 = 0;
		Ledger response = null;
		response = service.findLedgerByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findLedgerByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing Comapny entity
	* 
	 */
	@Test
	public void saveLedgerComapny() {
		// TODO: JUnit - Populate test inputs for operation: saveLedgerComapny 
		Integer id_3 = 0;
		Comapny related_comapny = new com.ttv.cashflow.domain.Comapny();
		Ledger response = null;
		response = service.saveLedgerComapny(id_3, related_comapny);
		// TODO: JUnit - Add assertions to test outputs of operation: saveLedgerComapny
	}

	/**
	 * Operation Unit Test
	* Delete an existing AccountPayable entity
	* 
	 */
	@Test
	public void deleteLedgerAccountPayables() {
		// TODO: JUnit - Populate test inputs for operation: deleteLedgerAccountPayables 
		Integer ledger_id_2 = 0;
		Integer related_accountpayables_id = 0;
		Ledger response = null;
		response = service.deleteLedgerAccountPayables(ledger_id_2, related_accountpayables_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteLedgerAccountPayables
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
