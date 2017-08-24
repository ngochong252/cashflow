package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.ActivityDAO;

import com.ttv.cashflow.domain.Activity;

import com.ttv.cashflow.service.ActivityService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Activity entities
 * 
 */

@Controller("ActivityController")

public class ActivityController {

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
	 * Save an existing Activity entity
	 * 
	 */
	@RequestMapping("/saveActivity")
	public String saveActivity(@ModelAttribute Activity activity) {
		activityService.saveActivity(activity);
		return "forward:/indexActivity";
	}

	/**
	* Select an existing Activity entity
	* 
	*/
	@RequestMapping("/selectActivity")
	public ModelAndView selectActivity(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(idKey));
		mav.setViewName("activity/viewActivity.jsp");

		return mav;
	}

	/**
	* Edit an existing Activity entity
	* 
	*/
	@RequestMapping("/editActivity")
	public ModelAndView editActivity(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(idKey));
		mav.setViewName("activity/editActivity.jsp");

		return mav;
	}

	/**
	* Select the Activity entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteActivity")
	public ModelAndView confirmDeleteActivity(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", activityDAO.findActivityByPrimaryKey(idKey));
		mav.setViewName("activity/deleteActivity.jsp");

		return mav;
	}

	/**
	* Create a new Activity entity
	* 
	*/
	@RequestMapping("/newActivity")
	public ModelAndView newActivity() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activity", new Activity());
		mav.addObject("newFlag", true);
		mav.setViewName("activity/editActivity.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/activityController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing Activity entity
	* 
	*/
	@RequestMapping("/deleteActivity")
	public String deleteActivity(@RequestParam Integer idKey) {
		Activity activity = activityDAO.findActivityByPrimaryKey(idKey);
		activityService.deleteActivity(activity);
		return "forward:/indexActivity";
	}

	/**
	* Show all Activity entities
	* 
	*/
	@RequestMapping("/indexActivity")
	public ModelAndView listActivitys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("activitys", activityService.loadActivitys());

		mav.setViewName("activity/listActivitys.jsp");

		return mav;
	}

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
	* Entry point to show all Activity entities
	* 
	*/
	public String indexActivity() {
		return "redirect:/indexActivity";
	}
}