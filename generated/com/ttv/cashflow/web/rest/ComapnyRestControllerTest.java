
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
 * Unit test for the <code>ComapnyRestController</code> controller.
 *
 * @see com.ttv.cashflow.web.rest.ComapnyRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
public class ComapnyRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Comapnycomapny_idapprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_idapprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/approvals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idapprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComapnycomapny_idapprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/approvals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idapprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComapnycomapny_idapprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/approvals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idapprovalsapproval_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_idapprovalsapproval_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/approvals/{approval_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idapprovalsapproval_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_idapprovalsapproval_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/approvals/{approval_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idbankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_idbankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/bankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idbankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComapnycomapny_idbankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/bankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idbankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComapnycomapny_idbankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/bankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idbankingAccountingsbankingaccounting_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_idbankingAccountingsbankingaccounting_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/bankingAccountings/{bankingaccounting_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idbankingAccountingsbankingaccounting_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_idbankingAccountingsbankingaccounting_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/bankingAccountings/{bankingaccounting_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idledgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_idledgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/ledgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idledgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComapnycomapny_idledgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/ledgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idledgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComapnycomapny_idledgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/ledgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idledgersledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_idledgersledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/ledgers/{ledger_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_idledgersledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_idledgersledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}/ledgers/{ledger_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapny()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComapny() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

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