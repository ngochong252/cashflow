
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
 * Unit test for the <code>ValidationRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.ValidationRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ValidationRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Validation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Validation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationRestController controller = (ValidationRestController) context.getBean("ValidationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Validationvalidation_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetValidationvalidation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Validation/{validation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationRestController controller = (ValidationRestController) context.getBean("ValidationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Validation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Validation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationRestController controller = (ValidationRestController) context.getBean("ValidationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Validation()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostValidation() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Validation");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationRestController controller = (ValidationRestController) context.getBean("ValidationRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Validationvalidation_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteValidationvalidation_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Validation/{validation_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ValidationRestController controller = (ValidationRestController) context.getBean("ValidationRestController");

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