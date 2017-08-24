package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.ConfigurationDAO;

import com.ttv.cashflow.domain.Configuration;

import com.ttv.cashflow.service.ConfigurationService;

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
 * Spring MVC controller that handles CRUD requests for Configuration entities
 * 
 */

@Controller("ConfigurationController")

public class ConfigurationController {

	/**
	 * DAO injected by Spring that manages Configuration entities
	 * 
	 */
	@Autowired
	private ConfigurationDAO configurationDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Configuration entities
	 * 
	 */
	@Autowired
	private ConfigurationService configurationService;

	/**
	 */
	@RequestMapping("/configurationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
	* Show all Configuration entities
	* 
	*/
	@RequestMapping("/indexConfiguration")
	public ModelAndView listConfigurations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("configurations", configurationService.loadConfigurations());

		mav.setViewName("configuration/listConfigurations.jsp");

		return mav;
	}

	/**
	* Edit an existing Configuration entity
	* 
	*/
	@RequestMapping("/editConfiguration")
	public ModelAndView editConfiguration(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("configuration", configurationDAO.findConfigurationByPrimaryKey(idKey));
		mav.setViewName("configuration/editConfiguration.jsp");

		return mav;
	}

	/**
	* Delete an existing Configuration entity
	* 
	*/
	@RequestMapping("/deleteConfiguration")
	public String deleteConfiguration(@RequestParam Integer idKey) {
		Configuration configuration = configurationDAO.findConfigurationByPrimaryKey(idKey);
		configurationService.deleteConfiguration(configuration);
		return "forward:/indexConfiguration";
	}

	/**
	* Entry point to show all Configuration entities
	* 
	*/
	public String indexConfiguration() {
		return "redirect:/indexConfiguration";
	}

	/**
	* Save an existing Configuration entity
	* 
	*/
	@RequestMapping("/saveConfiguration")
	public String saveConfiguration(@ModelAttribute Configuration configuration) {
		configurationService.saveConfiguration(configuration);
		return "forward:/indexConfiguration";
	}

	/**
	* Select the Configuration entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteConfiguration")
	public ModelAndView confirmDeleteConfiguration(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("configuration", configurationDAO.findConfigurationByPrimaryKey(idKey));
		mav.setViewName("configuration/deleteConfiguration.jsp");

		return mav;
	}

	/**
	* Select an existing Configuration entity
	* 
	*/
	@RequestMapping("/selectConfiguration")
	public ModelAndView selectConfiguration(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("configuration", configurationDAO.findConfigurationByPrimaryKey(idKey));
		mav.setViewName("configuration/viewConfiguration.jsp");

		return mav;
	}

	/**
	* Create a new Configuration entity
	* 
	*/
	@RequestMapping("/newConfiguration")
	public ModelAndView newConfiguration() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("configuration", new Configuration());
		mav.addObject("newFlag", true);
		mav.setViewName("configuration/editConfiguration.jsp");

		return mav;
	}
}