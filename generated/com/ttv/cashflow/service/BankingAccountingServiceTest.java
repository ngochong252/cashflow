
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.BankingAccounting;
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
public class BankingAccountingServiceTest {

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
	protected BankingAccountingService service;

	/**
	 * Instantiates a new BankingAccountingServiceTest.
	 *
	 */
	public BankingAccountingServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findBankingAccountingByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findBankingAccountingByPrimaryKey 
		Integer id = 0;
		BankingAccounting response = null;
		response = service.findBankingAccountingByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findBankingAccountingByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all BankingAccounting entity
	* 
	 */
	@Test
	public void findAllBankingAccountings() {
		// TODO: JUnit - Populate test inputs for operation: findAllBankingAccountings 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<BankingAccounting> response = null;
		response = service.findAllBankingAccountings(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllBankingAccountings
	}

	/**
	 * Operation Unit Test
	* Delete an existing BankingAccounting entity
	* 
	 */
	@Test
	public void deleteBankingAccounting() {
		// TODO: JUnit - Populate test inputs for operation: deleteBankingAccounting 
		BankingAccounting bankingaccounting = new com.ttv.cashflow.domain.BankingAccounting();
		service.deleteBankingAccounting(bankingaccounting);
	}

	/**
	 * Operation Unit Test
	* Load an existing BankingAccounting entity
	* 
	 */
	@Test
	public void loadBankingAccountings() {
		Set<BankingAccounting> response = null;
		response = service.loadBankingAccountings();
		// TODO: JUnit - Add assertions to test outputs of operation: loadBankingAccountings
	}

	/**
	 * Operation Unit Test
	* Return a count of all BankingAccounting entity
	* 
	 */
	@Test
	public void countBankingAccountings() {
		Integer response = null;
		response = service.countBankingAccountings();
		// TODO: JUnit - Add assertions to test outputs of operation: countBankingAccountings
	}

	/**
	 * Operation Unit Test
	* Save an existing Comapny entity
	* 
	 */
	@Test
	public void saveBankingAccountingComapny() {
		// TODO: JUnit - Populate test inputs for operation: saveBankingAccountingComapny 
		Integer id_1 = 0;
		Comapny related_comapny = new com.ttv.cashflow.domain.Comapny();
		BankingAccounting response = null;
		response = service.saveBankingAccountingComapny(id_1, related_comapny);
		// TODO: JUnit - Add assertions to test outputs of operation: saveBankingAccountingComapny
	}

	/**
	 * Operation Unit Test
	* Delete an existing Comapny entity
	* 
	 */
	@Test
	public void deleteBankingAccountingComapny() {
		// TODO: JUnit - Populate test inputs for operation: deleteBankingAccountingComapny 
		Integer bankingaccounting_id = 0;
		Integer related_comapny_id = 0;
		BankingAccounting response = null;
		response = service.deleteBankingAccountingComapny(bankingaccounting_id, related_comapny_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteBankingAccountingComapny
	}

	/**
	 * Operation Unit Test
	* Save an existing BankingAccounting entity
	* 
	 */
	@Test
	public void saveBankingAccounting() {
		// TODO: JUnit - Populate test inputs for operation: saveBankingAccounting 
		BankingAccounting bankingaccounting_1 = new com.ttv.cashflow.domain.BankingAccounting();
		service.saveBankingAccounting(bankingaccounting_1);
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
