
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.ProcessCase;

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
 * DAO to manage ProcessCase entities.
 * 
 */
@Repository("ProcessCaseDAO")

@Transactional
public class ProcessCaseDAOImpl extends AbstractJpaDao<ProcessCase> implements ProcessCaseDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			ProcessCase.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProcessCaseDAOImpl
	 *
	 */
	public ProcessCaseDAOImpl() {
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
	 * JPQL Query - findAllProcessCases
	 *
	 */
	@Transactional
	public Set<ProcessCase> findAllProcessCases() throws DataAccessException {

		return findAllProcessCases(-1, -1);
	}

	/**
	 * JPQL Query - findAllProcessCases
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProcessCase> findAllProcessCases(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProcessCases", startResult, maxRows);
		return new LinkedHashSet<ProcessCase>(query.getResultList());
	}

	/**
	 * JPQL Query - findProcessCaseByPrimaryKey
	 *
	 */
	@Transactional
	public ProcessCase findProcessCaseByPrimaryKey(Integer id) throws DataAccessException {

		return findProcessCaseByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findProcessCaseByPrimaryKey
	 *
	 */

	@Transactional
	public ProcessCase findProcessCaseByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProcessCaseByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.ProcessCase) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProcessCaseByStepsResolveContaining
	 *
	 */
	@Transactional
	public Set<ProcessCase> findProcessCaseByStepsResolveContaining(String stepsResolve) throws DataAccessException {

		return findProcessCaseByStepsResolveContaining(stepsResolve, -1, -1);
	}

	/**
	 * JPQL Query - findProcessCaseByStepsResolveContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProcessCase> findProcessCaseByStepsResolveContaining(String stepsResolve, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProcessCaseByStepsResolveContaining", startResult, maxRows, stepsResolve);
		return new LinkedHashSet<ProcessCase>(query.getResultList());
	}

	/**
	 * JPQL Query - findProcessCaseById
	 *
	 */
	@Transactional
	public ProcessCase findProcessCaseById(Integer id) throws DataAccessException {

		return findProcessCaseById(id, -1, -1);
	}

	/**
	 * JPQL Query - findProcessCaseById
	 *
	 */

	@Transactional
	public ProcessCase findProcessCaseById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProcessCaseById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.ProcessCase) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProcessCaseByStepsResolve
	 *
	 */
	@Transactional
	public Set<ProcessCase> findProcessCaseByStepsResolve(String stepsResolve) throws DataAccessException {

		return findProcessCaseByStepsResolve(stepsResolve, -1, -1);
	}

	/**
	 * JPQL Query - findProcessCaseByStepsResolve
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ProcessCase> findProcessCaseByStepsResolve(String stepsResolve, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProcessCaseByStepsResolve", startResult, maxRows, stepsResolve);
		return new LinkedHashSet<ProcessCase>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ProcessCase entity) {
		return true;
	}
}
