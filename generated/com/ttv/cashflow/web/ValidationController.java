package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.ValidationDAO;

import com.ttv.cashflow.domain.Validation;

import com.ttv.cashflow.service.ValidationService;

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
 * Spring MVC controller that handles CRUD requests for Validation entities
 * 
 */

@Controller("ValidationController")

public class ValidationController {

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
	 * Delete an existing Validation entity
	 * 
	 */
	@RequestMapping("/deleteValidation")
	public String deleteValidation(@RequestParam Integer idKey) {
		Validation validation = validationDAO.findValidationByPrimaryKey(idKey);
		validationService.deleteValidation(validation);
		return "forward:/indexValidation";
	}

	/**
	* Show all Validation entities
	* 
	*/
	@RequestMapping("/indexValidation")
	public ModelAndView listValidations() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("validations", validationService.loadValidations());

		mav.setViewName("validation/listValidations.jsp");

		return mav;
	}

	/**
	* Select the Validation entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteValidation")
	public ModelAndView confirmDeleteValidation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("validation", validationDAO.findValidationByPrimaryKey(idKey));
		mav.setViewName("validation/deleteValidation.jsp");

		return mav;
	}

	/**
	* Create a new Validation entity
	* 
	*/
	@RequestMapping("/newValidation")
	public ModelAndView newValidation() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("validation", new Validation());
		mav.addObject("newFlag", true);
		mav.setViewName("validation/editValidation.jsp");

		return mav;
	}

	/**
	* Entry point to show all Validation entities
	* 
	*/
	public String indexValidation() {
		return "redirect:/indexValidation";
	}

	/**
	* Select an existing Validation entity
	* 
	*/
	@RequestMapping("/selectValidation")
	public ModelAndView selectValidation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("validation", validationDAO.findValidationByPrimaryKey(idKey));
		mav.setViewName("validation/viewValidation.jsp");

		return mav;
	}

	/**
	* Edit an existing Validation entity
	* 
	*/
	@RequestMapping("/editValidation")
	public ModelAndView editValidation(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("validation", validationDAO.findValidationByPrimaryKey(idKey));
		mav.setViewName("validation/editValidation.jsp");

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
	* Save an existing Validation entity
	* 
	*/
	@RequestMapping("/saveValidation")
	public String saveValidation(@ModelAttribute Validation validation) {
		validationService.saveValidation(validation);
		return "forward:/indexValidation";
	}

	/**
	*/
	@RequestMapping("/validationController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}