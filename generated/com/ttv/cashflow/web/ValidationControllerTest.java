
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
 * Unit test for the <code>ValidationController</code> controller.
 *
 * @see com.ttv.cashflow.web.ValidationController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ValidationControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexValidation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexValidation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectValidation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectValidation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editValidation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editValidation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveValidation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveValidation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newValidation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newValidation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteValidation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteValidation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteValidation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteValidation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>validationControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetvalidationControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/validationController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationController controller = (ValidationController) context.getBean("ValidationController");

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