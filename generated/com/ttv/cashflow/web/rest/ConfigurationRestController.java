package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.ConfigurationDAO;

import com.ttv.cashflow.domain.Configuration;

import com.ttv.cashflow.service.ConfigurationService;

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
 * Spring Rest controller that handles CRUD requests for Configuration entities
 * 
 */

@Controller("ConfigurationRestController")

public class ConfigurationRestController {

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
	 * Delete an existing Configuration entity
	 * 
	 */
	@RequestMapping(value = "/Configuration/{configuration_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteConfiguration(@PathVariable Integer configuration_id) {
		Configuration configuration = configurationDAO.findConfigurationByPrimaryKey(configuration_id);
		configurationService.deleteConfiguration(configuration);
	}

	/**
	* Create a new Configuration entity
	* 
	*/
	@RequestMapping(value = "/Configuration", method = RequestMethod.POST)
	@ResponseBody
	public Configuration newConfiguration(@RequestBody Configuration configuration) {
		configurationService.saveConfiguration(configuration);
		return configurationDAO.findConfigurationByPrimaryKey(configuration.getId());
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
	* Select an existing Configuration entity
	* 
	*/
	@RequestMapping(value = "/Configuration/{configuration_id}", method = RequestMethod.GET)
	@ResponseBody
	public Configuration loadConfiguration(@PathVariable Integer configuration_id) {
		return configurationDAO.findConfigurationByPrimaryKey(configuration_id);
	}

	/**
	* Save an existing Configuration entity
	* 
	*/
	@RequestMapping(value = "/Configuration", method = RequestMethod.PUT)
	@ResponseBody
	public Configuration saveConfiguration(@RequestBody Configuration configuration) {
		configurationService.saveConfiguration(configuration);
		return configurationDAO.findConfigurationByPrimaryKey(configuration.getId());
	}

	/**
	* Show all Configuration entities
	* 
	*/
	@RequestMapping(value = "/Configuration", method = RequestMethod.GET)
	@ResponseBody
	public List<Configuration> listConfigurations() {
		return new java.util.ArrayList<Configuration>(configurationService.loadConfigurations());
	}
}