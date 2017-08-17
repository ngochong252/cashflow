
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.ErrorDetails;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ErrorDetails entities.
 * 
 */
public interface ErrorDetailsDAO extends JpaDao<ErrorDetails> {

	/**
	 * JPQL Query - findErrorDetailsByDescription
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByDescription
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByDescriptionContaining
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByDescriptionContaining
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByApprovalId
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByApprovalId(Integer approvalId) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByApprovalId
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByApprovalId(Integer approvalId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByLedgerId
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByLedgerId(Integer ledgerId) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByLedgerId
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByLedgerId(Integer ledgerId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllErrorDetailss
	 *
	 */
	public Set<ErrorDetails> findAllErrorDetailss() throws DataAccessException;

	/**
	 * JPQL Query - findAllErrorDetailss
	 *
	 */
	public Set<ErrorDetails> findAllErrorDetailss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsById
	 *
	 */
	public ErrorDetails findErrorDetailsById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsById
	 *
	 */
	public ErrorDetails findErrorDetailsById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByPrimaryKey
	 *
	 */
	public ErrorDetails findErrorDetailsByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByPrimaryKey
	 *
	 */
	public ErrorDetails findErrorDetailsByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByBaId
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByBaId(Integer baId) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByBaId
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByBaId(Integer baId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByStatus
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByStatus(Integer status) throws DataAccessException;

	/**
	 * JPQL Query - findErrorDetailsByStatus
	 *
	 */
	public Set<ErrorDetails> findErrorDetailsByStatus(Integer status, int startResult, int maxRows) throws DataAccessException;

}