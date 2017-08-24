
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
 * Unit test for the <code>ProcessCaseRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.ProcessCaseRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ProcessCaseRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>ProcessCaseprocesscase_iderrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProcessCaseprocesscase_iderrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase/{processcase_id}/errorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCaseprocesscase_iderrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProcessCaseprocesscase_iderrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase/{processcase_id}/errorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCaseprocesscase_iderrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProcessCaseprocesscase_iderrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase/{processcase_id}/errorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCaseprocesscase_iderrorDetailserrordetails_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProcessCaseprocesscase_iderrorDetailserrordetails_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase/{processcase_id}/errorDetails/{errordetails_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCaseprocesscase_iderrorDetailserrordetails_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProcessCaseprocesscase_iderrorDetailserrordetails_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase/{processcase_id}/errorDetails/{errordetails_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCaseprocesscase_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetProcessCaseprocesscase_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase/{processcase_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ProcessCaseprocesscase_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteProcessCaseprocesscase_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ProcessCase/{processcase_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseRestController controller = (ProcessCaseRestController) context.getBean("ProcessCaseRestController");

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