
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Ledger;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Ledger entities.
 * 
 */
public interface LedgerDAO extends JpaDao<Ledger> {

	/**
	 * JPQL Query - findLedgerByValidCode
	 *
	 */
	public Set<Ledger> findLedgerByValidCode(String validCode) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByValidCode
	 *
	 */
	public Set<Ledger> findLedgerByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByModifiedDate
	 *
	 */
	public Set<Ledger> findLedgerByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByModifiedDate
	 *
	 */
	public Set<Ledger> findLedgerByModifiedDate(Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerById
	 *
	 */
	public Ledger findLedgerById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerById
	 *
	 */
	public Ledger findLedgerById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllLedgers
	 *
	 */
	public Set<Ledger> findAllLedgers() throws DataAccessException;

	/**
	 * JPQL Query - findAllLedgers
	 *
	 */
	public Set<Ledger> findAllLedgers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByValidCodeContaining
	 *
	 */
	public Set<Ledger> findLedgerByValidCodeContaining(String validCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByValidCodeContaining
	 *
	 */
	public Set<Ledger> findLedgerByValidCodeContaining(String validCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByCreatedDate
	 *
	 */
	public Set<Ledger> findLedgerByCreatedDate(java.util.Calendar createdDate) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByCreatedDate
	 *
	 */
	public Set<Ledger> findLedgerByCreatedDate(Calendar createdDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByType
	 *
	 */
	public Set<Ledger> findLedgerByType(Integer type) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByType
	 *
	 */
	public Set<Ledger> findLedgerByType(Integer type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByFilePathContaining
	 *
	 */
	public Set<Ledger> findLedgerByFilePathContaining(String filePath) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByFilePathContaining
	 *
	 */
	public Set<Ledger> findLedgerByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByPrimaryKey
	 *
	 */
	public Ledger findLedgerByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByPrimaryKey
	 *
	 */
	public Ledger findLedgerByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByFilePath
	 *
	 */
	public Set<Ledger> findLedgerByFilePath(String filePath_1) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByFilePath
	 *
	 */
	public Set<Ledger> findLedgerByFilePath(String filePath_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByIssuedDate
	 *
	 */
	public Set<Ledger> findLedgerByIssuedDate(java.util.Calendar issuedDate) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByIssuedDate
	 *
	 */
	public Set<Ledger> findLedgerByIssuedDate(Calendar issuedDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByAmount
	 *
	 */
	public Set<Ledger> findLedgerByAmount(java.math.BigDecimal amount) throws DataAccessException;

	/**
	 * JPQL Query - findLedgerByAmount
	 *
	 */
	public Set<Ledger> findLedgerByAmount(BigDecimal amount, int startResult, int maxRows) throws DataAccessException;

}