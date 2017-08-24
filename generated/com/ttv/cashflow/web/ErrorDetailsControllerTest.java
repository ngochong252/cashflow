
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
 * Unit test for the <code>ErrorDetailsController</code> controller.
 *
 * @see com.ttv.cashflow.web.ErrorDetailsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ErrorDetailsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editErrorDetailsProcessCases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditErrorDetailsProcessCases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editErrorDetailsProcessCases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newErrorDetailsProcessCases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewErrorDetailsProcessCases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newErrorDetailsProcessCases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveErrorDetailsProcessCases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveErrorDetailsProcessCases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveErrorDetailsProcessCases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteErrorDetailsProcessCases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteErrorDetailsProcessCases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteErrorDetailsProcessCases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteErrorDetailsProcessCases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteErrorDetailsProcessCases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteErrorDetailsProcessCases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectErrorDetailsProcessCases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectErrorDetailsProcessCases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectErrorDetailsProcessCases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listErrorDetailsProcessCases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistErrorDetailsProcessCases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listErrorDetailsProcessCases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>errordetailsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeterrordetailsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/errordetailsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ErrorDetailsController controller = (ErrorDetailsController) context.getBean("ErrorDetailsController");

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