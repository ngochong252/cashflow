
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Comapny;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Comapny entities.
 * 
 */
public interface ComapnyDAO extends JpaDao<Comapny> {

	/**
	 * JPQL Query - findComapnyByNameContaining
	 *
	 */
	public Set<Comapny> findComapnyByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByNameContaining
	 *
	 */
	public Set<Comapny> findComapnyByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByPrimaryKey
	 *
	 */
	public Comapny findComapnyByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByPrimaryKey
	 *
	 */
	public Comapny findComapnyByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByName
	 *
	 */
	public Set<Comapny> findComapnyByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByName
	 *
	 */
	public Set<Comapny> findComapnyByName(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByCodeContaining
	 *
	 */
	public Set<Comapny> findComapnyByCodeContaining(String code) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByCodeContaining
	 *
	 */
	public Set<Comapny> findComapnyByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByDescriptionContaining
	 *
	 */
	public Set<Comapny> findComapnyByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByDescriptionContaining
	 *
	 */
	public Set<Comapny> findComapnyByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyById
	 *
	 */
	public Comapny findComapnyById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyById
	 *
	 */
	public Comapny findComapnyById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByCreatedDate
	 *
	 */
	public Set<Comapny> findComapnyByCreatedDate(java.util.Calendar createdDate) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByCreatedDate
	 *
	 */
	public Set<Comapny> findComapnyByCreatedDate(Calendar createdDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByIsActive
	 *
	 */
	public Set<Comapny> findComapnyByIsActive(Boolean isActive) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByIsActive
	 *
	 */
	public Set<Comapny> findComapnyByIsActive(Boolean isActive, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByModifiedDate
	 *
	 */
	public Set<Comapny> findComapnyByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByModifiedDate
	 *
	 */
	public Set<Comapny> findComapnyByModifiedDate(Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByDescription
	 *
	 */
	public Set<Comapny> findComapnyByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByDescription
	 *
	 */
	public Set<Comapny> findComapnyByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByCode
	 *
	 */
	public Set<Comapny> findComapnyByCode(String code_1) throws DataAccessException;

	/**
	 * JPQL Query - findComapnyByCode
	 *
	 */
	public Set<Comapny> findComapnyByCode(String code_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllComapnys
	 *
	 */
	public Set<Comapny> findAllComapnys() throws DataAccessException;

	/**
	 * JPQL Query - findAllComapnys
	 *
	 */
	public Set<Comapny> findAllComapnys(int startResult, int maxRows) throws DataAccessException;

}