
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Activity;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Activity entities.
 * 
 */
public interface ActivityDAO extends JpaDao<Activity> {

	/**
	 * JPQL Query - findActivityByUserNameContaining
	 *
	 */
	public Set<Activity> findActivityByUserNameContaining(String userName) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByUserNameContaining
	 *
	 */
	public Set<Activity> findActivityByUserNameContaining(String userName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByAction
	 *
	 */
	public Set<Activity> findActivityByAction(String action) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByAction
	 *
	 */
	public Set<Activity> findActivityByAction(String action, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityDate
	 *
	 */
	public Set<Activity> findActivityByActivityDate(java.util.Calendar activityDate) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActivityDate
	 *
	 */
	public Set<Activity> findActivityByActivityDate(Calendar activityDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByPrimaryKey
	 *
	 */
	public Activity findActivityByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByPrimaryKey
	 *
	 */
	public Activity findActivityByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllActivitys
	 *
	 */
	public Set<Activity> findAllActivitys() throws DataAccessException;

	/**
	 * JPQL Query - findAllActivitys
	 *
	 */
	public Set<Activity> findAllActivitys(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByFilePath
	 *
	 */
	public Set<Activity> findActivityByFilePath(String filePath) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByFilePath
	 *
	 */
	public Set<Activity> findActivityByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByFilePathContaining
	 *
	 */
	public Set<Activity> findActivityByFilePathContaining(String filePath_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByFilePathContaining
	 *
	 */
	public Set<Activity> findActivityByFilePathContaining(String filePath_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByCompanyId
	 *
	 */
	public Set<Activity> findActivityByCompanyId(Integer companyId) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByCompanyId
	 *
	 */
	public Set<Activity> findActivityByCompanyId(Integer companyId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityById
	 *
	 */
	public Activity findActivityById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityById
	 *
	 */
	public Activity findActivityById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByUserName
	 *
	 */
	public Set<Activity> findActivityByUserName(String userName_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByUserName
	 *
	 */
	public Set<Activity> findActivityByUserName(String userName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActionContaining
	 *
	 */
	public Set<Activity> findActivityByActionContaining(String action_1) throws DataAccessException;

	/**
	 * JPQL Query - findActivityByActionContaining
	 *
	 */
	public Set<Activity> findActivityByActionContaining(String action_1, int startResult, int maxRows) throws DataAccessException;

}