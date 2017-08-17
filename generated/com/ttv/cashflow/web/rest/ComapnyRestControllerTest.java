
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
	 * Test <code>Comapnycomapny_companyIdapprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_companyIdapprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/approvals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdapprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComapnycomapny_companyIdapprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/approvals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdapprovals()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComapnycomapny_companyIdapprovals() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/approvals");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdapprovalsapproval_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_companyIdapprovalsapproval_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/approvals/{approval_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdapprovalsapproval_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_companyIdapprovalsapproval_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/approvals/{approval_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdbankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_companyIdbankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/bankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdbankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComapnycomapny_companyIdbankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/bankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdbankingAccountings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComapnycomapny_companyIdbankingAccountings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/bankingAccountings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdbankingAccountingsbankingaccounting_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_companyIdbankingAccountingsbankingaccounting_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/bankingAccountings/{bankingaccounting_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdbankingAccountingsbankingaccounting_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_companyIdbankingAccountingsbankingaccounting_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/bankingAccountings/{bankingaccounting_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdledgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_companyIdledgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/ledgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdledgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostComapnycomapny_companyIdledgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/ledgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdledgers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutComapnycomapny_companyIdledgers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/ledgers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdledgersledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_companyIdledgersledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/ledgers/{ledger_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ComapnyRestController controller = (ComapnyRestController) context.getBean("ComapnyRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Comapnycomapny_companyIdledgersledger_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_companyIdledgersledger_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}/ledgers/{ledger_id}");
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
	 * Test <code>Comapnycomapny_companyId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetComapnycomapny_companyId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}");
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
	 * Test <code>Comapnycomapny_companyId()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteComapnycomapny_companyId() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Comapny/{comapny_companyId}");
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