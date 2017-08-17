package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.ErrorDetailsDAO;
import com.ttv.cashflow.dao.ProcessCaseDAO;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

import com.ttv.cashflow.service.ProcessCaseService;

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
 * Spring Rest controller that handles CRUD requests for ProcessCase entities
 * 
 */

@Controller("ProcessCaseRestController")

public class ProcessCaseRestController {

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
	 * Service injected by Spring that provides CRUD operations for ProcessCase entities
	 * 
	 */
	@Autowired
	private ProcessCaseService processCaseService;

	/**
	 * Create a new ProcessCase entity
	 * 
	 */
	@RequestMapping(value = "/ProcessCase", method = RequestMethod.POST)
	@ResponseBody
	public ProcessCase newProcessCase(@RequestBody ProcessCase processcase) {
		processCaseService.saveProcessCase(processcase);
		return processCaseDAO.findProcessCaseByPrimaryKey(processcase.getId());
	}

	/**
	* Delete an existing ProcessCase entity
	* 
	*/
	@RequestMapping(value = "/ProcessCase/{processcase_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProcessCase(@PathVariable Integer processcase_id) {
		ProcessCase processcase = processCaseDAO.findProcessCaseByPrimaryKey(processcase_id);
		processCaseService.deleteProcessCase(processcase);
	}

	/**
	* Save an existing ProcessCase entity
	* 
	*/
	@RequestMapping(value = "/ProcessCase", method = RequestMethod.PUT)
	@ResponseBody
	public ProcessCase saveProcessCase(@RequestBody ProcessCase processcase) {
		processCaseService.saveProcessCase(processcase);
		return processCaseDAO.findProcessCaseByPrimaryKey(processcase.getId());
	}

	/**
	* View an existing ErrorDetails entity
	* 
	*/
	@RequestMapping(value = "/ProcessCase/{processcase_id}/errorDetails/{errordetails_id}", method = RequestMethod.GET)
	@ResponseBody
	public ErrorDetails loadProcessCaseErrorDetails(@PathVariable Integer processcase_id, @PathVariable Integer related_errordetails_id) {
		ErrorDetails errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(related_errordetails_id, -1, -1);

		return errordetails;
	}

	/**
	* Get ErrorDetails entity by ProcessCase
	* 
	*/
	@RequestMapping(value = "/ProcessCase/{processcase_id}/errorDetails", method = RequestMethod.GET)
	@ResponseBody
	public ErrorDetails getProcessCaseErrorDetails(@PathVariable Integer processcase_id) {
		return processCaseDAO.findProcessCaseByPrimaryKey(processcase_id).getErrorDetails();
	}

	/**
	* Save an existing ErrorDetails entity
	* 
	*/
	@RequestMapping(value = "/ProcessCase/{processcase_id}/errorDetails", method = RequestMethod.PUT)
	@ResponseBody
	public ErrorDetails saveProcessCaseErrorDetails(@PathVariable Integer processcase_id, @RequestBody ErrorDetails errordetails) {
		processCaseService.saveProcessCaseErrorDetails(processcase_id, errordetails);
		return errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails.getId());
	}

	/**
	* Delete an existing ErrorDetails entity
	* 
	*/
	@RequestMapping(value = "/ProcessCase/{processcase_id}/errorDetails/{errordetails_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteProcessCaseErrorDetails(@PathVariable Integer processcase_id, @PathVariable Integer related_errordetails_id) {
		processCaseService.deleteProcessCaseErrorDetails(processcase_id, related_errordetails_id);
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
	* Select an existing ProcessCase entity
	* 
	*/
	@RequestMapping(value = "/ProcessCase/{processcase_id}", method = RequestMethod.GET)
	@ResponseBody
	public ProcessCase loadProcessCase(@PathVariable Integer processcase_id) {
		return processCaseDAO.findProcessCaseByPrimaryKey(processcase_id);
	}

	/**
	* Show all ProcessCase entities
	* 
	*/
	@RequestMapping(value = "/ProcessCase", method = RequestMethod.GET)
	@ResponseBody
	public List<ProcessCase> listProcessCases() {
		return new java.util.ArrayList<ProcessCase>(processCaseService.loadProcessCases());
	}

	/**
	* Create a new ErrorDetails entity
	* 
	*/
	@RequestMapping(value = "/ProcessCase/{processcase_id}/errorDetails", method = RequestMethod.POST)
	@ResponseBody
	public ErrorDetails newProcessCaseErrorDetails(@PathVariable Integer processcase_id, @RequestBody ErrorDetails errordetails) {
		processCaseService.saveProcessCaseErrorDetails(processcase_id, errordetails);
		return errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails.getId());
	}
}