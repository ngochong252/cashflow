
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
 * Unit test for the <code>ActivityRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.ActivityRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ActivityRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Activity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetActivityactivity_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Activityactivity_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteActivityactivity_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Activity/{activity_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityRestController controller = (ActivityRestController) context.getBean("ActivityRestController");

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