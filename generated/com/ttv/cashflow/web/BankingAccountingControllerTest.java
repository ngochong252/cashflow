
package com.ttv.cashflow.web;

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
 * Unit test for the <code>BankingAccountingController</code> controller.
 *
 * @see com.ttv.cashflow.web.BankingAccountingController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class BankingAccountingControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editBankingAccountingComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBankingAccountingComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBankingAccountingComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBankingAccountingComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBankingAccountingComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBankingAccountingComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBankingAccountingComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBankingAccountingComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBankingAccountingComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBankingAccountingComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBankingAccountingComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBankingAccountingComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBankingAccountingComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBankingAccountingComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBankingAccountingComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBankingAccountingComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBankingAccountingComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBankingAccountingComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listBankingAccountingComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistBankingAccountingComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listBankingAccountingComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexBankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBankingAccounting()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBankingAccounting() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBankingAccounting");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>bankingaccountingControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetbankingaccountingControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/bankingaccountingController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BankingAccountingController controller = (BankingAccountingController) context.getBean("BankingAccountingController");

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