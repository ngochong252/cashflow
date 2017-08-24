
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Configuration;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Configuration entities.
 * 
 */
public interface ConfigurationDAO extends JpaDao<Configuration> {

	/**
	 * JPQL Query - findConfigurationByPrimaryKey
	 *
	 */
	public Configuration findConfigurationByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByPrimaryKey
	 *
	 */
	public Configuration findConfigurationByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByKey
	 *
	 */
	public Set<Configuration> findConfigurationByKey(String key) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByKey
	 *
	 */
	public Set<Configuration> findConfigurationByKey(String key, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByValueContaining
	 *
	 */
	public Set<Configuration> findConfigurationByValueContaining(String value) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByValueContaining
	 *
	 */
	public Set<Configuration> findConfigurationByValueContaining(String value, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllConfigurations
	 *
	 */
	public Set<Configuration> findAllConfigurations() throws DataAccessException;

	/**
	 * JPQL Query - findAllConfigurations
	 *
	 */
	public Set<Configuration> findAllConfigurations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByKeyContaining
	 *
	 */
	public Set<Configuration> findConfigurationByKeyContaining(String key_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByKeyContaining
	 *
	 */
	public Set<Configuration> findConfigurationByKeyContaining(String key_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByValue
	 *
	 */
	public Set<Configuration> findConfigurationByValue(String value_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationByValue
	 *
	 */
	public Set<Configuration> findConfigurationByValue(String value_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationById
	 *
	 */
	public Configuration findConfigurationById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findConfigurationById
	 *
	 */
	public Configuration findConfigurationById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}