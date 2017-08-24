
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Comapny;

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
 * DAO to manage Comapny entities.
 * 
 */
@Repository("ComapnyDAO")

@Transactional
public class ComapnyDAOImpl extends AbstractJpaDao<Comapny> implements ComapnyDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Comapny.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ComapnyDAOImpl
	 *
	 */
	public ComapnyDAOImpl() {
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
	 * JPQL Query - findComapnyByNameContaining
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByNameContaining(String name) throws DataAccessException {

		return findComapnyByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyByPrimaryKey
	 *
	 */
	@Transactional
	public Comapny findComapnyByPrimaryKey(Integer id) throws DataAccessException {

		return findComapnyByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByPrimaryKey
	 *
	 */

	@Transactional
	public Comapny findComapnyByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findComapnyByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Comapny) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findComapnyByName
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByName(String name) throws DataAccessException {

		return findComapnyByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByName", startResult, maxRows, name);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyByCodeContaining
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByCodeContaining(String code) throws DataAccessException {

		return findComapnyByCodeContaining(code, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByCodeContaining", startResult, maxRows, code);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByDescriptionContaining(String description) throws DataAccessException {

		return findComapnyByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyById
	 *
	 */
	@Transactional
	public Comapny findComapnyById(Integer id) throws DataAccessException {

		return findComapnyById(id, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyById
	 *
	 */

	@Transactional
	public Comapny findComapnyById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findComapnyById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Comapny) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findComapnyByCreatedDate
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByCreatedDate(java.util.Calendar createdDate) throws DataAccessException {

		return findComapnyByCreatedDate(createdDate, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByCreatedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByCreatedDate(java.util.Calendar createdDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByCreatedDate", startResult, maxRows, createdDate);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyByIsActive
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByIsActive(Boolean isActive) throws DataAccessException {

		return findComapnyByIsActive(isActive, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByIsActive
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByIsActive(Boolean isActive, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByIsActive", startResult, maxRows, isActive);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyByModifiedDate
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException {

		return findComapnyByModifiedDate(modifiedDate, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByModifiedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByModifiedDate(java.util.Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByModifiedDate", startResult, maxRows, modifiedDate);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyByDescription
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByDescription(String description) throws DataAccessException {

		return findComapnyByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findComapnyByCode
	 *
	 */
	@Transactional
	public Set<Comapny> findComapnyByCode(String code) throws DataAccessException {

		return findComapnyByCode(code, -1, -1);
	}

	/**
	 * JPQL Query - findComapnyByCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findComapnyByCode(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findComapnyByCode", startResult, maxRows, code);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllComapnys
	 *
	 */
	@Transactional
	public Set<Comapny> findAllComapnys() throws DataAccessException {

		return findAllComapnys(-1, -1);
	}

	/**
	 * JPQL Query - findAllComapnys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Comapny> findAllComapnys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllComapnys", startResult, maxRows);
		return new LinkedHashSet<Comapny>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Comapny entity) {
		return true;
	}
}
