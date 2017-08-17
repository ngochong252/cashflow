
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
 * Unit test for the <code>LedgerRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.LedgerRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class LedgerRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Ledgerledger_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedgerledger_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostLedgerledger_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutLedgerledger_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idcomapnycomapny_companyId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteLedgerledger_idcomapnycomapny_companyId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/comapny/{comapny_companyId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idcomapnycomapny_companyId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedgerledger_idcomapnycomapny_companyId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/comapny/{comapny_companyId}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedgerledger_idaccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostLedgerledger_idaccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutLedgerledger_idaccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountReceivablesaccountreceivable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteLedgerledger_idaccountReceivablesaccountreceivable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountReceivables/{accountreceivable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountReceivablesaccountreceivable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedgerledger_idaccountReceivablesaccountreceivable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountReceivables/{accountreceivable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedgerledger_idaccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostLedgerledger_idaccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutLedgerledger_idaccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountPayablesaccountpayable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteLedgerledger_idaccountPayablesaccountpayable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountPayables/{accountpayable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_idaccountPayablesaccountpayable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedgerledger_idaccountPayablesaccountpayable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}/accountPayables/{accountpayable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLedgerledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Ledgerledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteLedgerledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Ledger/{ledger_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerRestController controller = (LedgerRestController) context.getBean("LedgerRestController");

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