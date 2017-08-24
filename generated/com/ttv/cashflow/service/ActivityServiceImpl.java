package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.ActivityDAO;

import com.ttv.cashflow.domain.Activity;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Activity entities
 * 
 */

@Service("ActivityService")

@Transactional
public class ActivityServiceImpl implements ActivityService {

	/**
	 * DAO injected by Spring that manages Activity entities
	 * 
	 */
	@Autowired
	private ActivityDAO activityDAO;

	/**
	 * Instantiates a new ActivityServiceImpl.
	 *
	 */
	public ActivityServiceImpl() {
	}

	/**
	 * Return a count of all Activity entity
	 * 
	 */
	@Transactional
	public Integer countActivitys() {
		return ((Long) activityDAO.createQuerySingleResult("select count(o) from Activity o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Activity entity
	 * 
	 */
	@Transactional
	public Set<Activity> loadActivitys() {
		return activityDAO.findAllActivitys();
	}

	/**
	 * Delete an existing Activity entity
	 * 
	 */
	@Transactional
	public void deleteActivity(Activity activity) {
		activityDAO.remove(activity);
		activityDAO.flush();
	}

	/**
	 */
	@Transactional
	public Activity findActivityByPrimaryKey(Integer id) {
		return activityDAO.findActivityByPrimaryKey(id);
	}

	/**
	 * Return all Activity entity
	 * 
	 */
	@Transactional
	public List<Activity> findAllActivitys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Activity>(activityDAO.findAllActivitys(startResult, maxRows));
	}

	/**
	 * Save an existing Activity entity
	 * 
	 */
	@Transactional
	public void saveActivity(Activity activity) {
		Activity existingActivity = activityDAO.findActivityByPrimaryKey(activity.getId());

		if (existingActivity != null) {
			if (existingActivity != activity) {
				existingActivity.setId(activity.getId());
				existingActivity.setUserName(activity.getUserName());
				existingActivity.setAction(activity.getAction());
				existingActivity.setActivityDate(activity.getActivityDate());
				existingActivity.setFilePath(activity.getFilePath());
				existingActivity.setCompanyId(activity.getCompanyId());
			}
			activity = activityDAO.store(existingActivity);
		} else {
			activity = activityDAO.store(activity);
		}
		activityDAO.flush();
	}
}
