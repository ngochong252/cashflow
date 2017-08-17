
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Validation;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/cashflow-security-context.xml",
		"file:./resources/cashflow-service-context.xml",
		"file:./resources/cashflow-dao-context.xml",
		"file:./resources/cashflow-web-context.xml" })
@Transactional
public class ValidationServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ValidationService service;

	/**
	 * Instantiates a new ValidationServiceTest.
	 *
	 */
	public ValidationServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all Validation entity
	* 
	 */
	@Test
	public void findAllValidations() {
		// TODO: JUnit - Populate test inputs for operation: findAllValidations 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Validation> response = null;
		response = service.findAllValidations(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllValidations
	}

	/**
	 * Operation Unit Test
	* Load an existing Validation entity
	* 
	 */
	@Test
	public void loadValidations() {
		Set<Validation> response = null;
		response = service.loadValidations();
		// TODO: JUnit - Add assertions to test outputs of operation: loadValidations
	}

	/**
	 * Operation Unit Test
	* Return a count of all Validation entity
	* 
	 */
	@Test
	public void countValidations() {
		Integer response = null;
		response = service.countValidations();
		// TODO: JUnit - Add assertions to test outputs of operation: countValidations
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findValidationByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findValidationByPrimaryKey 
		Integer id = 0;
		Validation response = null;
		response = service.findValidationByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findValidationByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing Validation entity
	* 
	 */
	@Test
	public void deleteValidation() {
		// TODO: JUnit - Populate test inputs for operation: deleteValidation 
		Validation validation = new com.ttv.cashflow.domain.Validation();
		service.deleteValidation(validation);
	}

	/**
	 * Operation Unit Test
	* Save an existing Validation entity
	* 
	 */
	@Test
	public void saveValidation() {
		// TODO: JUnit - Populate test inputs for operation: saveValidation 
		Validation validation_1 = new com.ttv.cashflow.domain.Validation();
		service.saveValidation(validation_1);
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
