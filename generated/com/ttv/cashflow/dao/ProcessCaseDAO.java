
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.ProcessCase;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ProcessCase entities.
 * 
 */
public interface ProcessCaseDAO extends JpaDao<ProcessCase> {

	/**
	 * JPQL Query - findProcessCaseByPrimaryKey
	 *
	 */
	public ProcessCase findProcessCaseByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findProcessCaseByPrimaryKey
	 *
	 */
	public ProcessCase findProcessCaseByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProcessCaseByStepsResolve
	 *
	 */
	public Set<ProcessCase> findProcessCaseByStepsResolve(String stepsResolve) throws DataAccessException;

	/**
	 * JPQL Query - findProcessCaseByStepsResolve
	 *
	 */
	public Set<ProcessCase> findProcessCaseByStepsResolve(String stepsResolve, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProcessCases
	 *
	 */
	public Set<ProcessCase> findAllProcessCases() throws DataAccessException;

	/**
	 * JPQL Query - findAllProcessCases
	 *
	 */
	public Set<ProcessCase> findAllProcessCases(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProcessCaseById
	 *
	 */
	public ProcessCase findProcessCaseById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findProcessCaseById
	 *
	 */
	public ProcessCase findProcessCaseById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProcessCaseByStepsResolveContaining
	 *
	 */
	public Set<ProcessCase> findProcessCaseByStepsResolveContaining(String stepsResolve_1) throws DataAccessException;

	/**
	 * JPQL Query - findProcessCaseByStepsResolveContaining
	 *
	 */
	public Set<ProcessCase> findProcessCaseByStepsResolveContaining(String stepsResolve_1, int startResult, int maxRows) throws DataAccessException;

}