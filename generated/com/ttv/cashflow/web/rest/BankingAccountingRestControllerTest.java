
package com.ttv.cashflow.web.rest;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>BankingAccountingRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.BankingAccountingRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class BankingAccountingRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>BankingAccountingbankingaccounting_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBankingAccountingbankingaccounting_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting/{bankingaccounting_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccountingbankingaccounting_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostBankingAccountingbankingaccounting_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting/{bankingaccounting_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccountingbankingaccounting_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutBankingAccountingbankingaccounting_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting/{bankingaccounting_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccountingbankingaccounting_idcomapnycomapny_companyId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteBankingAccountingbankingaccounting_idcomapnycomapny_companyId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting/{bankingaccounting_id}/comapny/{comapny_companyId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccountingbankingaccounting_idcomapnycomapny_companyId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBankingAccountingbankingaccounting_idcomapnycomapny_companyId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting/{bankingaccounting_id}/comapny/{comapny_companyId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccountingbankingaccounting_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetBankingAccountingbankingaccounting_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting/{bankingaccounting_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>BankingAccountingbankingaccounting_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteBankingAccountingbankingaccounting_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/BankingAccounting/{bankingaccounting_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingRestController controller = (BankingAccountingRestController) context.getBean("BankingAccountingRestController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}