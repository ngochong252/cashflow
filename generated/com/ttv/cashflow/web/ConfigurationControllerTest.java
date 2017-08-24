
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
 * Unit test for the <code>ConfigurationController</code> controller.
 *
 * @see com.ttv.cashflow.web.ConfigurationController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ConfigurationControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexConfiguration()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexConfiguration() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexConfiguration");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectConfiguration()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectConfiguration() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectConfiguration");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editConfiguration()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditConfiguration() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editConfiguration");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveConfiguration()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveConfiguration() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveConfiguration");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newConfiguration()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewConfiguration() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newConfiguration");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteConfiguration()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteConfiguration() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteConfiguration");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteConfiguration()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteConfiguration() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteConfiguration");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>configurationControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfigurationControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/configurationController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ConfigurationController controller = (ConfigurationController) context.getBean("ConfigurationController");

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