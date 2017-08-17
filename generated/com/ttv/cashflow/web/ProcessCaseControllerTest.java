
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
 * Unit test for the <code>ProcessCaseController</code> controller.
 *
 * @see com.ttv.cashflow.web.ProcessCaseController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ProcessCaseControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProcessCaseErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProcessCaseErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProcessCaseErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProcessCaseErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProcessCaseErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProcessCaseErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProcessCaseErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProcessCaseErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProcessCaseErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProcessCaseErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProcessCaseErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProcessCaseErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProcessCaseErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProcessCaseErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProcessCaseErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProcessCaseErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProcessCaseErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProcessCaseErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProcessCaseErrorDetails()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProcessCaseErrorDetails() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProcessCaseErrorDetails");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProcessCase()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProcessCase() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProcessCase");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>processcaseControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetprocesscaseControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/processcaseController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProcessCaseController controller = (ProcessCaseController) context.getBean("ProcessCaseController");

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