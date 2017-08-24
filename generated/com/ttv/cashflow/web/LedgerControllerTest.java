
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
 * Unit test for the <code>LedgerController</code> controller.
 *
 * @see com.ttv.cashflow.web.LedgerController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class LedgerControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editLedgerComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditLedgerComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editLedgerComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newLedgerComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewLedgerComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newLedgerComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveLedgerComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveLedgerComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveLedgerComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteLedgerComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteLedgerComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteLedgerComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteLedgerComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteLedgerComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteLedgerComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectLedgerComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectLedgerComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectLedgerComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listLedgerComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistLedgerComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listLedgerComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editLedgerAccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditLedgerAccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editLedgerAccountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newLedgerAccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewLedgerAccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newLedgerAccountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveLedgerAccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveLedgerAccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveLedgerAccountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteLedgerAccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteLedgerAccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteLedgerAccountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteLedgerAccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteLedgerAccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteLedgerAccountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectLedgerAccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectLedgerAccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectLedgerAccountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listLedgerAccountReceivables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistLedgerAccountReceivables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listLedgerAccountReceivables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editLedgerAccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditLedgerAccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editLedgerAccountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newLedgerAccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewLedgerAccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newLedgerAccountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveLedgerAccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveLedgerAccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveLedgerAccountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteLedgerAccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteLedgerAccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteLedgerAccountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteLedgerAccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteLedgerAccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteLedgerAccountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectLedgerAccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectLedgerAccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectLedgerAccountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listLedgerAccountPayables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistLedgerAccountPayables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listLedgerAccountPayables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ledgerControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetledgerControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ledgerController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LedgerController controller = (LedgerController) context.getBean("LedgerController");

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