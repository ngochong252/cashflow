
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Validation;

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
 * DAO to manage Validation entities.
 * 
 */
@Repository("ValidationDAO")

@Transactional
public class ValidationDAOImpl extends AbstractJpaDao<Validation> implements ValidationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Validation.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ValidationDAOImpl
	 *
	 */
	public ValidationDAOImpl() {
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
	 * JPQL Query - findValidationByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Validation> findValidationByDescriptionContaining(String description) throws DataAccessException {

		return findValidationByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findValidationByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Validation> findValidationByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findValidationByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<Validation>(query.getResultList());
	}

	/**
	 * JPQL Query - findValidationByValidCode
	 *
	 */
	@Transactional
	public Set<Validation> findValidationByValidCode(String validCode) throws DataAccessException {

		return findValidationByValidCode(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findValidationByValidCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Validation> findValidationByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findValidationByValidCode", startResult, maxRows, validCode);
		return new LinkedHashSet<Validation>(query.getResultList());
	}

	/**
	 * JPQL Query - findValidationByDescription
	 *
	 */
	@Transactional
	public Set<Validation> findValidationByDescription(String description) throws DataAccessException {

		return findValidationByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findValidationByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Validation> findValidationByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findValidationByDescription", startResult, maxRows, description);
		return new LinkedHashSet<Validation>(query.getResultList());
	}

	/**
	 * JPQL Query - findValidationById
	 *
	 */
	@Transactional
	public Validation findValidationById(Integer id) throws DataAccessException {

		return findValidationById(id, -1, -1);
	}

	/**
	 * JPQL Query - findValidationById
	 *
	 */

	@Transactional
	public Validation findValidationById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findValidationById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Validation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findValidationByPrimaryKey
	 *
	 */
	@Transactional
	public Validation findValidationByPrimaryKey(Integer id) throws DataAccessException {

		return findValidationByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findValidationByPrimaryKey
	 *
	 */

	@Transactional
	public Validation findValidationByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findValidationByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Validation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findValidationByValidCodeContaining
	 *
	 */
	@Transactional
	public Set<Validation> findValidationByValidCodeContaining(String validCode) throws DataAccessException {

		return findValidationByValidCodeContaining(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findValidationByValidCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Validation> findValidationByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findValidationByValidCodeContaining", startResult, maxRows, validCode);
		return new LinkedHashSet<Validation>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllValidations
	 *
	 */
	@Transactional
	public Set<Validation> findAllValidations() throws DataAccessException {

		return findAllValidations(-1, -1);
	}

	/**
	 * JPQL Query - findAllValidations
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Validation> findAllValidations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllValidations", startResult, maxRows);
		return new LinkedHashSet<Validation>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Validation entity) {
		return true;
	}
}
