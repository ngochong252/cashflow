
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
 * Unit test for the <code>ComapnyController</code> controller.
 *
 * @see com.ttv.cashflow.web.ComapnyController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ComapnyControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editComapnyApprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditComapnyApprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editComapnyApprovals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newComapnyApprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewComapnyApprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newComapnyApprovals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveComapnyApprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveComapnyApprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveComapnyApprovals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteComapnyApprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteComapnyApprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteComapnyApprovals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteComapnyApprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteComapnyApprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteComapnyApprovals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectComapnyApprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectComapnyApprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectComapnyApprovals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listComapnyApprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistComapnyApprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listComapnyApprovals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editComapnyBankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditComapnyBankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editComapnyBankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newComapnyBankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewComapnyBankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newComapnyBankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveComapnyBankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveComapnyBankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveComapnyBankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteComapnyBankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteComapnyBankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteComapnyBankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteComapnyBankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteComapnyBankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteComapnyBankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectComapnyBankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectComapnyBankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectComapnyBankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listComapnyBankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistComapnyBankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listComapnyBankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editComapnyLedgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditComapnyLedgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editComapnyLedgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newComapnyLedgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewComapnyLedgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newComapnyLedgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveComapnyLedgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveComapnyLedgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveComapnyLedgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteComapnyLedgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteComapnyLedgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteComapnyLedgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteComapnyLedgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteComapnyLedgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteComapnyLedgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectComapnyLedgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectComapnyLedgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectComapnyLedgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listComapnyLedgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistComapnyLedgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listComapnyLedgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteComapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteComapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>comapnyControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcomapnyControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/comapnyController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyController controller = (ComapnyController) context.getBean("ComapnyController");

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