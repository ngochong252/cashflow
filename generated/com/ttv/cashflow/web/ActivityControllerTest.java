
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
 * Unit test for the <code>ActivityController</code> controller.
 *
 * @see com.ttv.cashflow.web.ActivityController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ActivityControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteActivity()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteActivity() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteActivity");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>activityControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetactivityControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/activityController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ActivityController controller = (ActivityController) context.getBean("ActivityController");

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