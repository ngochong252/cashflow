
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
 * Unit test for the <code>AccountReceivableRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.AccountReceivableRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class AccountReceivableRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>AccountReceivableaccountreceivable_idledger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccountReceivableaccountreceivable_idledger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable/{accountreceivable_id}/ledger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivableaccountreceivable_idledger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAccountReceivableaccountreceivable_idledger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable/{accountreceivable_id}/ledger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivableaccountreceivable_idledger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAccountReceivableaccountreceivable_idledger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable/{accountreceivable_id}/ledger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivableaccountreceivable_idledgerledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAccountReceivableaccountreceivable_idledgerledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable/{accountreceivable_id}/ledger/{ledger_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivableaccountreceivable_idledgerledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccountReceivableaccountreceivable_idledgerledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable/{accountreceivable_id}/ledger/{ledger_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivableaccountreceivable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetAccountReceivableaccountreceivable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable/{accountreceivable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>AccountReceivableaccountreceivable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteAccountReceivableaccountreceivable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/AccountReceivable/{accountreceivable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableRestController controller = (AccountReceivableRestController) context.getBean("AccountReceivableRestController");

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