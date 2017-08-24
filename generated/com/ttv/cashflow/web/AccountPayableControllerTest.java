
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
 * Unit test for the <code>AccountPayableController</code> controller.
 *
 * @see com.ttv.cashflow.web.AccountPayableController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class AccountPayableControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAccountPayableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccountPayableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccountPayableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccountPayableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccountPayableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccountPayableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccountPayableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccountPayableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccountPayableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccountPayableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccountPayableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccountPayableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccountPayableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccountPayableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccountPayableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccountPayableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccountPayableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccountPayableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAccountPayableLedger()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAccountPayableLedger() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAccountPayableLedger");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAccountPayable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAccountPayable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAccountPayable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAccountPayable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAccountPayable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAccountPayable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAccountPayable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAccountPayable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAccountPayable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAccountPayable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAccountPayable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAccountPayable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAccountPayable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAccountPayable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAccountPayable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAccountPayable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAccountPayable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAccountPayable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAccountPayable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAccountPayable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAccountPayable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>accountpayableControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetaccountpayableControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/accountpayableController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AccountPayableController controller = (AccountPayableController) context.getBean("AccountPayableController");

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