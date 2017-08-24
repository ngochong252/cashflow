
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.ErrorDetails;

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
 * DAO to manage ErrorDetails entities.
 * 
 */
@Repository("ErrorDetailsDAO")

@Transactional
public class ErrorDetailsDAOImpl extends AbstractJpaDao<ErrorDetails> implements ErrorDetailsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			ErrorDetails.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ErrorDetailsDAOImpl
	 *
	 */
	public ErrorDetailsDAOImpl() {
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
	 * JPQL Query - findErrorDetailsByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByDescriptionContaining(String description) throws DataAccessException {

		return findErrorDetailsByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findErrorDetailsByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<ErrorDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findErrorDetailsByBaId
	 *
	 */
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByBaId(Integer baId) throws DataAccessException {

		return findErrorDetailsByBaId(baId, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsByBaId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByBaId(Integer baId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findErrorDetailsByBaId", startResult, maxRows, baId);
		return new LinkedHashSet<ErrorDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findErrorDetailsByStatus
	 *
	 */
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByStatus(Integer status) throws DataAccessException {

		return findErrorDetailsByStatus(status, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsByStatus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByStatus(Integer status, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findErrorDetailsByStatus", startResult, maxRows, status);
		return new LinkedHashSet<ErrorDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findErrorDetailsByDescription
	 *
	 */
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByDescription(String description) throws DataAccessException {

		return findErrorDetailsByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findErrorDetailsByDescription", startResult, maxRows, description);
		return new LinkedHashSet<ErrorDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findErrorDetailsByPrimaryKey
	 *
	 */
	@Transactional
	public ErrorDetails findErrorDetailsByPrimaryKey(Integer id) throws DataAccessException {

		return findErrorDetailsByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsByPrimaryKey
	 *
	 */

	@Transactional
	public ErrorDetails findErrorDetailsByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findErrorDetailsByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.ErrorDetails) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findErrorDetailsByApprovalId
	 *
	 */
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByApprovalId(Integer approvalId) throws DataAccessException {

		return findErrorDetailsByApprovalId(approvalId, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsByApprovalId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByApprovalId(Integer approvalId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findErrorDetailsByApprovalId", startResult, maxRows, approvalId);
		return new LinkedHashSet<ErrorDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllErrorDetailss
	 *
	 */
	@Transactional
	public Set<ErrorDetails> findAllErrorDetailss() throws DataAccessException {

		return findAllErrorDetailss(-1, -1);
	}

	/**
	 * JPQL Query - findAllErrorDetailss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ErrorDetails> findAllErrorDetailss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllErrorDetailss", startResult, maxRows);
		return new LinkedHashSet<ErrorDetails>(query.getResultList());
	}

	/**
	 * JPQL Query - findErrorDetailsById
	 *
	 */
	@Transactional
	public ErrorDetails findErrorDetailsById(Integer id) throws DataAccessException {

		return findErrorDetailsById(id, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsById
	 *
	 */

	@Transactional
	public ErrorDetails findErrorDetailsById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findErrorDetailsById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.ErrorDetails) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findErrorDetailsByLedgerId
	 *
	 */
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByLedgerId(Integer ledgerId) throws DataAccessException {

		return findErrorDetailsByLedgerId(ledgerId, -1, -1);
	}

	/**
	 * JPQL Query - findErrorDetailsByLedgerId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ErrorDetails> findErrorDetailsByLedgerId(Integer ledgerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findErrorDetailsByLedgerId", startResult, maxRows, ledgerId);
		return new LinkedHashSet<ErrorDetails>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ErrorDetails entity) {
		return true;
	}
}
