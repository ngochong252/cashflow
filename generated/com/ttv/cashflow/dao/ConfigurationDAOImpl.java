
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Configuration entities.
 * 
 */
@Repository("ConfigurationDAO")

@Transactional
public class ConfigurationDAOImpl extends AbstractJpaDao<Configuration> implements ConfigurationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Configuration.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ConfigurationDAOImpl
	 *
	 */
	public ConfigurationDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findConfigurationByPrimaryKey
	 *
	 */
	@Transactional
	public Configuration findConfigurationByPrimaryKey(Integer id) throws DataAccessException {

		return findConfigurationByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findConfigurationByPrimaryKey
	 *
	 */

	@Transactional
	public Configuration findConfigurationByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findConfigurationByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Configuration) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findConfigurationByKey
	 *
	 */
	@Transactional
	public Set<Configuration> findConfigurationByKey(String key) throws DataAccessException {

		return findConfigurationByKey(key, -1, -1);
	}

	/**
	 * JPQL Query - findConfigurationByKey
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Configuration> findConfigurationByKey(String key, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigurationByKey", startResult, maxRows, key);
		return new LinkedHashSet<Configuration>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigurationByValueContaining
	 *
	 */
	@Transactional
	public Set<Configuration> findConfigurationByValueContaining(String value) throws DataAccessException {

		return findConfigurationByValueContaining(value, -1, -1);
	}

	/**
	 * JPQL Query - findConfigurationByValueContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Configuration> findConfigurationByValueContaining(String value, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigurationByValueContaining", startResult, maxRows, value);
		return new LinkedHashSet<Configuration>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllConfigurations
	 *
	 */
	@Transactional
	public Set<Configuration> findAllConfigurations() throws DataAccessException {

		return findAllConfigurations(-1, -1);
	}

	/**
	 * JPQL Query - findAllConfigurations
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Configuration> findAllConfigurations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllConfigurations", startResult, maxRows);
		return new LinkedHashSet<Configuration>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigurationByKeyContaining
	 *
	 */
	@Transactional
	public Set<Configuration> findConfigurationByKeyContaining(String key) throws DataAccessException {

		return findConfigurationByKeyContaining(key, -1, -1);
	}

	/**
	 * JPQL Query - findConfigurationByKeyContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Configuration> findConfigurationByKeyContaining(String key, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigurationByKeyContaining", startResult, maxRows, key);
		return new LinkedHashSet<Configuration>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigurationByValue
	 *
	 */
	@Transactional
	public Set<Configuration> findConfigurationByValue(String value) throws DataAccessException {

		return findConfigurationByValue(value, -1, -1);
	}

	/**
	 * JPQL Query - findConfigurationByValue
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Configuration> findConfigurationByValue(String value, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findConfigurationByValue", startResult, maxRows, value);
		return new LinkedHashSet<Configuration>(query.getResultList());
	}

	/**
	 * JPQL Query - findConfigurationById
	 *
	 */
	@Transactional
	public Configuration findConfigurationById(Integer id) throws DataAccessException {

		return findConfigurationById(id, -1, -1);
	}

	/**
	 * JPQL Query - findConfigurationById
	 *
	 */

	@Transactional
	public Configuration findConfigurationById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findConfigurationById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Configuration) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Configuration entity) {
		return true;
	}
}
