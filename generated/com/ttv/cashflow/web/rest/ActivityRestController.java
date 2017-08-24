package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.ActivityDAO;

import com.ttv.cashflow.domain.Activity;

import com.ttv.cashflow.service.ActivityService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Activity entities
 * 
 */

@Controller("ActivityRestController")

public class ActivityRestController {

	/**
	 * DAO injected by Spring that manages Activity entities
	 * 
	 */
	@Autowired
	private ActivityDAO activityDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Activity entities
	 * 
	 */
	@Autowired
	private ActivityService activityService;

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	* Save an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity", method = RequestMethod.PUT)
	@ResponseBody
	public Activity saveActivity(@RequestBody Activity activity) {
		activityService.saveActivity(activity);
		return activityDAO.findActivityByPrimaryKey(activity.getId());
	}

	/**
	* Create a new Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity", method = RequestMethod.POST)
	@ResponseBody
	public Activity newActivity(@RequestBody Activity activity) {
		activityService.saveActivity(activity);
		return activityDAO.findActivityByPrimaryKey(activity.getId());
	}

	/**
	* Show all Activity entities
	* 
	*/
	@RequestMapping(value = "/Activity", method = RequestMethod.GET)
	@ResponseBody
	public List<Activity> listActivitys() {
		return new java.util.ArrayList<Activity>(activityService.loadActivitys());
	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteActivity(@PathVariable Integer activity_id) {
		Activity activity = activityDAO.findActivityByPrimaryKey(activity_id);
		activityService.deleteActivity(activity);
	}

	/**
	* Select an existing Activity entity
	* 
	*/
	@RequestMapping(value = "/Activity/{activity_id}", method = RequestMethod.GET)
	@ResponseBody
	public Activity loadActivity(@PathVariable Integer activity_id) {
		return activityDAO.findActivityByPrimaryKey(activity_id);
	}
}