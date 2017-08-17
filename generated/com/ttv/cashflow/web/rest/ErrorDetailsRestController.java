package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.ErrorDetailsDAO;
import com.ttv.cashflow.dao.ProcessCaseDAO;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

import com.ttv.cashflow.service.ErrorDetailsService;

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
 * Spring Rest controller that handles CRUD requests for ErrorDetails entities
 * 
 */

@Controller("ErrorDetailsRestController")

public class ErrorDetailsRestController {

	/**
	 * DAO injected by Spring that manages ErrorDetails entities
	 * 
	 */
	@Autowired
	private ErrorDetailsDAO errorDetailsDAO;

	/**
	 * DAO injected by Spring that manages ProcessCase entities
	 * 
	 */
	@Autowired
	private ProcessCaseDAO processCaseDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for ErrorDetails entities
	 * 
	 */
	@Autowired
	private ErrorDetailsService errorDetailsService;

	/**
	 * Create a new ErrorDetails entity
	 * 
	 */
	@RequestMapping(value = "/ErrorDetails", method = RequestMethod.POST)
	@ResponseBody
	public ErrorDetails newErrorDetails(@RequestBody ErrorDetails errordetails) {
		errorDetailsService.saveErrorDetails(errordetails);
		return errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails.getId());
	}

	/**
	* Select an existing ErrorDetails entity
	* 
	*/
	@RequestMapping(value = "/ErrorDetails/{errordetails_id}", method = RequestMethod.GET)
	@ResponseBody
	public ErrorDetails loadErrorDetails(@PathVariable Integer errordetails_id) {
		return errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails_id);
	}

	/**
	* Create a new ProcessCase entity
	* 
	*/
	@RequestMapping(value = "/ErrorDetails/{errordetails_id}/processCases", method = RequestMethod.POST)
	@ResponseBody
	public ProcessCase newErrorDetailsProcessCases(@PathVariable Integer errordetails_id, @RequestBody ProcessCase processcase) {
		errorDetailsService.saveErrorDetailsProcessCases(errordetails_id, processcase);
		return processCaseDAO.findProcessCaseByPrimaryKey(processcase.getId());
	}

	/**
	* Save an existing ProcessCase entity
	* 
	*/
	@RequestMapping(value = "/ErrorDetails/{errordetails_id}/processCases", method = RequestMethod.PUT)
	@ResponseBody
	public ProcessCase saveErrorDetailsProcessCases(@PathVariable Integer errordetails_id, @RequestBody ProcessCase processcases) {
		errorDetailsService.saveErrorDetailsProcessCases(errordetails_id, processcases);
		return processCaseDAO.findProcessCaseByPrimaryKey(processcases.getId());
	}

	/**
	* Save an existing ErrorDetails entity
	* 
	*/
	@RequestMapping(value = "/ErrorDetails", method = RequestMethod.PUT)
	@ResponseBody
	public ErrorDetails saveErrorDetails(@RequestBody ErrorDetails errordetails) {
		errorDetailsService.saveErrorDetails(errordetails);
		return errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails.getId());
	}

	/**
	* Delete an existing ErrorDetails entity
	* 
	*/
	@RequestMapping(value = "/ErrorDetails/{errordetails_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteErrorDetails(@PathVariable Integer errordetails_id) {
		ErrorDetails errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails_id);
		errorDetailsService.deleteErrorDetails(errordetails);
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
	* Delete an existing ProcessCase entity
	* 
	*/
	@RequestMapping(value = "/ErrorDetails/{errordetails_id}/processCases/{processcase_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteErrorDetailsProcessCases(@PathVariable Integer errordetails_id, @PathVariable Integer related_processcases_id) {
		errorDetailsService.deleteErrorDetailsProcessCases(errordetails_id, related_processcases_id);
	}

	/**
	* Show all ProcessCase entities by ErrorDetails
	* 
	*/
	@RequestMapping(value = "/ErrorDetails/{errordetails_id}/processCases", method = RequestMethod.GET)
	@ResponseBody
	public List<ProcessCase> getErrorDetailsProcessCases(@PathVariable Integer errordetails_id) {
		return new java.util.ArrayList<ProcessCase>(errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails_id).getProcessCases());
	}

	/**
	* View an existing ProcessCase entity
	* 
	*/
	@RequestMapping(value = "/ErrorDetails/{errordetails_id}/processCases/{processcase_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProcessCase loadErrorDetailsProcessCases(@PathVariable Integer errordetails_id, @PathVariable Integer related_processcases_id) {
		ProcessCase processcase = processCaseDAO.findProcessCaseByPrimaryKey(related_processcases_id, -1, -1);

		return processcase;
	}

	/**
	* Show all ErrorDetails entities
	* 
	*/
	@RequestMapping(value = "/ErrorDetails", method = RequestMethod.GET)
	@ResponseBody
	public List<ErrorDetails> listErrorDetailss() {
		return new java.util.ArrayList<ErrorDetails>(errorDetailsService.loadErrorDetailss());
	}
}