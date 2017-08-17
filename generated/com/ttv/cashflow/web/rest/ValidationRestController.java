package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.ValidationDAO;

import com.ttv.cashflow.domain.Validation;

import com.ttv.cashflow.service.ValidationService;

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
 * Spring Rest controller that handles CRUD requests for Validation entities
 * 
 */

@Controller("ValidationRestController")

public class ValidationRestController {

	/**
	 * DAO injected by Spring that manages Validation entities
	 * 
	 */
	@Autowired
	private ValidationDAO validationDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Validation entities
	 * 
	 */
	@Autowired
	private ValidationService validationService;

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
	* Save an existing Validation entity
	* 
	*/
	@RequestMapping(value = "/Validation", method = RequestMethod.PUT)
	@ResponseBody
	public Validation saveValidation(@RequestBody Validation validation) {
		validationService.saveValidation(validation);
		return validationDAO.findValidationByPrimaryKey(validation.getId());
	}

	/**
	* Create a new Validation entity
	* 
	*/
	@RequestMapping(value = "/Validation", method = RequestMethod.POST)
	@ResponseBody
	public Validation newValidation(@RequestBody Validation validation) {
		validationService.saveValidation(validation);
		return validationDAO.findValidationByPrimaryKey(validation.getId());
	}

	/**
	* Show all Validation entities
	* 
	*/
	@RequestMapping(value = "/Validation", method = RequestMethod.GET)
	@ResponseBody
	public List<Validation> listValidations() {
		return new java.util.ArrayList<Validation>(validationService.loadValidations());
	}

	/**
	* Delete an existing Validation entity
	* 
	*/
	@RequestMapping(value = "/Validation/{validation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteValidation(@PathVariable Integer validation_id) {
		Validation validation = validationDAO.findValidationByPrimaryKey(validation_id);
		validationService.deleteValidation(validation);
	}

	/**
	* Select an existing Validation entity
	* 
	*/
	@RequestMapping(value = "/Validation/{validation_id}", method = RequestMethod.GET)
	@ResponseBody
	public Validation loadValidation(@PathVariable Integer validation_id) {
		return validationDAO.findValidationByPrimaryKey(validation_id);
	}
}