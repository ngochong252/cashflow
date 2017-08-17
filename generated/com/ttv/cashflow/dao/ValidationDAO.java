
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Validation;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Validation entities.
 * 
 */
public interface ValidationDAO extends JpaDao<Validation> {

	/**
	 * JPQL Query - findValidationByDescription
	 *
	 */
	public Set<Validation> findValidationByDescription(String description) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByDescription
	 *
	 */
	public Set<Validation> findValidationByDescription(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByValidCodeContaining
	 *
	 */
	public Set<Validation> findValidationByValidCodeContaining(String validCode) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByValidCodeContaining
	 *
	 */
	public Set<Validation> findValidationByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllValidations
	 *
	 */
	public Set<Validation> findAllValidations() throws DataAccessException;

	/**
	 * JPQL Query - findAllValidations
	 *
	 */
	public Set<Validation> findAllValidations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByValidCode
	 *
	 */
	public Set<Validation> findValidationByValidCode(String validCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByValidCode
	 *
	 */
	public Set<Validation> findValidationByValidCode(String validCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByDescriptionContaining
	 *
	 */
	public Set<Validation> findValidationByDescriptionContaining(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByDescriptionContaining
	 *
	 */
	public Set<Validation> findValidationByDescriptionContaining(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByPrimaryKey
	 *
	 */
	public Validation findValidationByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findValidationByPrimaryKey
	 *
	 */
	public Validation findValidationByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findValidationById
	 *
	 */
	public Validation findValidationById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findValidationById
	 *
	 */
	public Validation findValidationById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}