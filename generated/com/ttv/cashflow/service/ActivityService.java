
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Activity;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Activity entities
 * 
 */
public interface ActivityService {

	/**
	* Return a count of all Activity entity
	* 
	 */
	public Integer countActivitys();

	/**
	* Load an existing Activity entity
	* 
	 */
	public Set<Activity> loadActivitys();

	/**
	* Delete an existing Activity entity
	* 
	 */
	public void deleteActivity(Activity activity);

	/**
	 */
	public Activity findActivityByPrimaryKey(Integer id);

	/**
	* Return all Activity entity
	* 
	 */
	public List<Activity> findAllActivitys(Integer startResult, Integer maxRows);

	/**
	* Save an existing Activity entity
	* 
	 */
	public void saveActivity(Activity activity_1);
}