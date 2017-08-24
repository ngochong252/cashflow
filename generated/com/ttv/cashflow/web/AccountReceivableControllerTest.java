
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
 * Unit test for the <code>AccountReceivableController</code> controller.
 *
 * @see com.ttv.cashflow.web.AccountReceivableController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class AccountReceivableControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAccountReceivableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccountReceivableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccountReceivableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccountReceivableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccountReceivableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccountReceivableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccountReceivableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccountReceivableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccountReceivableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccountReceivableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccountReceivableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccountReceivableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccountReceivableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccountReceivableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccountReceivableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccountReceivableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccountReceivableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccountReceivableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAccountReceivableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAccountReceivableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAccountReceivableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccountReceivable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccountReceivable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccountReceivable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>accountreceivableControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetaccountreceivableControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/accountreceivableController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountReceivableController controller = (AccountReceivableController) context.getBean("AccountReceivableController");

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