
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
 * Unit test for the <code>ApprovalController</code> controller.
 *
 * @see com.ttv.cashflow.web.ApprovalController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ApprovalControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editApprovalComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditApprovalComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editApprovalComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newApprovalComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewApprovalComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newApprovalComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveApprovalComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveApprovalComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveApprovalComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteApprovalComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteApprovalComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteApprovalComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteApprovalComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteApprovalComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteApprovalComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectApprovalComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectApprovalComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectApprovalComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listApprovalComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistApprovalComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listApprovalComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexApproval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexApproval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectApproval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectApproval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editApproval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editApproval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveApproval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveApproval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newApproval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newApproval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteApproval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteApproval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteApproval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteApproval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>approvalControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetapprovalControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/approvalController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalController controller = (ApprovalController) context.getBean("ApprovalController");

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