
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Ledger;

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
 * DAO to manage Ledger entities.
 * 
 */
@Repository("LedgerDAO")

@Transactional
public class LedgerDAOImpl extends AbstractJpaDao<Ledger> implements LedgerDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Ledger.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new LedgerDAOImpl
	 *
	 */
	public LedgerDAOImpl() {
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
	 * JPQL Query - findLedgerByValidCode
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByValidCode(String validCode) throws DataAccessException {

		return findLedgerByValidCode(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByValidCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByValidCode", startResult, maxRows, validCode);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByModifiedDate
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException {

		return findLedgerByModifiedDate(modifiedDate, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByModifiedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByModifiedDate(java.util.Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByModifiedDate", startResult, maxRows, modifiedDate);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerById
	 *
	 */
	@Transactional
	public Ledger findLedgerById(Integer id) throws DataAccessException {

		return findLedgerById(id, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerById
	 *
	 */

	@Transactional
	public Ledger findLedgerById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findLedgerById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Ledger) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllLedgers
	 *
	 */
	@Transactional
	public Set<Ledger> findAllLedgers() throws DataAccessException {

		return findAllLedgers(-1, -1);
	}

	/**
	 * JPQL Query - findAllLedgers
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findAllLedgers(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllLedgers", startResult, maxRows);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByValidCodeContaining
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByValidCodeContaining(String validCode) throws DataAccessException {

		return findLedgerByValidCodeContaining(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByValidCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByValidCodeContaining", startResult, maxRows, validCode);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByCreatedDate
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByCreatedDate(java.util.Calendar createdDate) throws DataAccessException {

		return findLedgerByCreatedDate(createdDate, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByCreatedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByCreatedDate(java.util.Calendar createdDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByCreatedDate", startResult, maxRows, createdDate);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByType
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByType(Integer type) throws DataAccessException {

		return findLedgerByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByType(Integer type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByType", startResult, maxRows, type);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByFilePathContaining
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByFilePathContaining(String filePath) throws DataAccessException {

		return findLedgerByFilePathContaining(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByFilePathContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByFilePathContaining", startResult, maxRows, filePath);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByPrimaryKey
	 *
	 */
	@Transactional
	public Ledger findLedgerByPrimaryKey(Integer id) throws DataAccessException {

		return findLedgerByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByPrimaryKey
	 *
	 */

	@Transactional
	public Ledger findLedgerByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findLedgerByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Ledger) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findLedgerByFilePath
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByFilePath(String filePath) throws DataAccessException {

		return findLedgerByFilePath(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByFilePath
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByFilePath", startResult, maxRows, filePath);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByIssuedDate
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByIssuedDate(java.util.Calendar issuedDate) throws DataAccessException {

		return findLedgerByIssuedDate(issuedDate, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByIssuedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByIssuedDate(java.util.Calendar issuedDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByIssuedDate", startResult, maxRows, issuedDate);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * JPQL Query - findLedgerByAmount
	 *
	 */
	@Transactional
	public Set<Ledger> findLedgerByAmount(java.math.BigDecimal amount) throws DataAccessException {

		return findLedgerByAmount(amount, -1, -1);
	}

	/**
	 * JPQL Query - findLedgerByAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ledger> findLedgerByAmount(java.math.BigDecimal amount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLedgerByAmount", startResult, maxRows, amount);
		return new LinkedHashSet<Ledger>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Ledger entity) {
		return true;
	}
}
