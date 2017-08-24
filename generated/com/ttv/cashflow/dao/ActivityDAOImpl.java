
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Activity;

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
 * DAO to manage Activity entities.
 * 
 */
@Repository("ActivityDAO")

@Transactional
public class ActivityDAOImpl extends AbstractJpaDao<Activity> implements ActivityDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Activity.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ActivityDAOImpl
	 *
	 */
	public ActivityDAOImpl() {
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
	 * JPQL Query - findActivityByUserNameContaining
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByUserNameContaining(String userName) throws DataAccessException {

		return findActivityByUserNameContaining(userName, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByUserNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByUserNameContaining(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByUserNameContaining", startResult, maxRows, userName);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByAction
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByAction(String action) throws DataAccessException {

		return findActivityByAction(action, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByAction
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByAction(String action, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByAction", startResult, maxRows, action);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByActivityDate
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByActivityDate(java.util.Calendar activityDate) throws DataAccessException {

		return findActivityByActivityDate(activityDate, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActivityDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByActivityDate(java.util.Calendar activityDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByActivityDate", startResult, maxRows, activityDate);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByPrimaryKey
	 *
	 */
	@Transactional
	public Activity findActivityByPrimaryKey(Integer id) throws DataAccessException {

		return findActivityByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByPrimaryKey
	 *
	 */

	@Transactional
	public Activity findActivityByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findActivityByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Activity) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllActivitys
	 *
	 */
	@Transactional
	public Set<Activity> findAllActivitys() throws DataAccessException {

		return findAllActivitys(-1, -1);
	}

	/**
	 * JPQL Query - findAllActivitys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findAllActivitys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllActivitys", startResult, maxRows);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByFilePath
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByFilePath(String filePath) throws DataAccessException {

		return findActivityByFilePath(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByFilePath
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByFilePath", startResult, maxRows, filePath);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByFilePathContaining
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByFilePathContaining(String filePath) throws DataAccessException {

		return findActivityByFilePathContaining(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByFilePathContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByFilePathContaining", startResult, maxRows, filePath);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByCompanyId
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByCompanyId(Integer companyId) throws DataAccessException {

		return findActivityByCompanyId(companyId, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByCompanyId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByCompanyId(Integer companyId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByCompanyId", startResult, maxRows, companyId);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityById
	 *
	 */
	@Transactional
	public Activity findActivityById(Integer id) throws DataAccessException {

		return findActivityById(id, -1, -1);
	}

	/**
	 * JPQL Query - findActivityById
	 *
	 */

	@Transactional
	public Activity findActivityById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findActivityById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Activity) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findActivityByUserName
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByUserName(String userName) throws DataAccessException {

		return findActivityByUserName(userName, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByUserName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByUserName(String userName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByUserName", startResult, maxRows, userName);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * JPQL Query - findActivityByActionContaining
	 *
	 */
	@Transactional
	public Set<Activity> findActivityByActionContaining(String action) throws DataAccessException {

		return findActivityByActionContaining(action, -1, -1);
	}

	/**
	 * JPQL Query - findActivityByActionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Activity> findActivityByActionContaining(String action, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findActivityByActionContaining", startResult, maxRows, action);
		return new LinkedHashSet<Activity>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Activity entity) {
		return true;
	}
}
