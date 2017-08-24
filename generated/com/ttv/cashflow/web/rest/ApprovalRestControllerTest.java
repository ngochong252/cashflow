
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
 * Unit test for the <code>ApprovalRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.ApprovalRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ApprovalRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Approvalapproval_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetApprovalapproval_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval/{approval_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approvalapproval_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostApprovalapproval_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval/{approval_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approvalapproval_idcomapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutApprovalapproval_idcomapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval/{approval_id}/comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approvalapproval_idcomapnycomapny_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteApprovalapproval_idcomapnycomapny_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval/{approval_id}/comapny/{comapny_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approvalapproval_idcomapnycomapny_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetApprovalapproval_idcomapnycomapny_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval/{approval_id}/comapny/{comapny_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approvalapproval_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetApprovalapproval_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval/{approval_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approval()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostApproval() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Approvalapproval_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteApprovalapproval_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Approval/{approval_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApprovalRestController controller = (ApprovalRestController) context.getBean("ApprovalRestController");

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