package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.ErrorDetailsDAO;
import com.ttv.cashflow.dao.ProcessCaseDAO;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

import com.ttv.cashflow.service.ProcessCaseService;

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
 * Spring MVC controller that handles CRUD requests for ProcessCase entities
 * 
 */

@Controller("ProcessCaseController")

public class ProcessCaseController {

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
	 * Save an existing ProcessCase entity
	 * 
	 */
	@RequestMapping("/saveProcessCase")
	public String saveProcessCase(@ModelAttribute ProcessCase processcase) {
		processCaseService.saveProcessCase(processcase);
		return "forward:/indexProcessCase";
	}

	/**
	* Create a new ErrorDetails entity
	* 
	*/
	@RequestMapping("/newProcessCaseErrorDetails")
	public ModelAndView newProcessCaseErrorDetails(@RequestParam Integer processcase_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("processcase_id", processcase_id);
		mav.addObject("errordetails", new ErrorDetails());
		mav.addObject("newFlag", true);
		mav.setViewName("processcase/errordetails/editErrorDetails.jsp");

		return mav;
	}

	/**
	* Show all ErrorDetails entities by ProcessCase
	* 
	*/
	@RequestMapping("/listProcessCaseErrorDetails")
	public ModelAndView listProcessCaseErrorDetails(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("processcase", processCaseDAO.findProcessCaseByPrimaryKey(idKey));
		mav.setViewName("processcase/errordetails/listErrorDetails.jsp");

		return mav;
	}

	/**
	* Create a new ProcessCase entity
	* 
	*/
	@RequestMapping("/newProcessCase")
	public ModelAndView newProcessCase() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("processcase", new ProcessCase());
		mav.addObject("newFlag", true);
		mav.setViewName("processcase/editProcessCase.jsp");

		return mav;
	}

	/**
	* Edit an existing ProcessCase entity
	* 
	*/
	@RequestMapping("/editProcessCase")
	public ModelAndView editProcessCase(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("processcase", processCaseDAO.findProcessCaseByPrimaryKey(idKey));
		mav.setViewName("processcase/editProcessCase.jsp");

		return mav;
	}

	/**
	* Save an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/saveProcessCaseErrorDetails")
	public ModelAndView saveProcessCaseErrorDetails(@RequestParam Integer processcase_id, @ModelAttribute ErrorDetails errordetails) {
		ProcessCase parent_processcase = processCaseService.saveProcessCaseErrorDetails(processcase_id, errordetails);

		ModelAndView mav = new ModelAndView();
		mav.addObject("processcase_id", processcase_id);
		mav.addObject("processcase", parent_processcase);
		mav.setViewName("processcase/viewProcessCase.jsp");

		return mav;
	}

	/**
	* Edit an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/editProcessCaseErrorDetails")
	public ModelAndView editProcessCaseErrorDetails(@RequestParam Integer processcase_id, @RequestParam Integer errordetails_id) {
		ErrorDetails errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("processcase_id", processcase_id);
		mav.addObject("errordetails", errordetails);
		mav.setViewName("processcase/errordetails/editErrorDetails.jsp");

		return mav;
	}

	/**
	* Delete an existing ProcessCase entity
	* 
	*/
	@RequestMapping("/deleteProcessCase")
	public String deleteProcessCase(@RequestParam Integer idKey) {
		ProcessCase processcase = processCaseDAO.findProcessCaseByPrimaryKey(idKey);
		processCaseService.deleteProcessCase(processcase);
		return "forward:/indexProcessCase";
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
	@RequestMapping("/selectProcessCase")
	public ModelAndView selectProcessCase(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("processcase", processCaseDAO.findProcessCaseByPrimaryKey(idKey));
		mav.setViewName("processcase/viewProcessCase.jsp");

		return mav;
	}

	/**
	* Select the ProcessCase entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProcessCase")
	public ModelAndView confirmDeleteProcessCase(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("processcase", processCaseDAO.findProcessCaseByPrimaryKey(idKey));
		mav.setViewName("processcase/deleteProcessCase.jsp");

		return mav;
	}

	/**
	* Show all ProcessCase entities
	* 
	*/
	@RequestMapping("/indexProcessCase")
	public ModelAndView listProcessCases() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("processcases", processCaseService.loadProcessCases());

		mav.setViewName("processcase/listProcessCases.jsp");

		return mav;
	}

	/**
	* View an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/selectProcessCaseErrorDetails")
	public ModelAndView selectProcessCaseErrorDetails(@RequestParam Integer processcase_id, @RequestParam Integer errordetails_id) {
		ErrorDetails errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("processcase_id", processcase_id);
		mav.addObject("errordetails", errordetails);
		mav.setViewName("processcase/errordetails/viewErrorDetails.jsp");

		return mav;
	}

	/**
	* Select the child ErrorDetails entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteProcessCaseErrorDetails")
	public ModelAndView confirmDeleteProcessCaseErrorDetails(@RequestParam Integer processcase_id, @RequestParam Integer related_errordetails_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("errordetails", errorDetailsDAO.findErrorDetailsByPrimaryKey(related_errordetails_id));
		mav.addObject("processcase_id", processcase_id);
		mav.setViewName("processcase/errordetails/deleteErrorDetails.jsp");

		return mav;
	}

	/**
	* Entry point to show all ProcessCase entities
	* 
	*/
	public String indexProcessCase() {
		return "redirect:/indexProcessCase";
	}

	/**
	*/
	@RequestMapping("/processcaseController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/deleteProcessCaseErrorDetails")
	public ModelAndView deleteProcessCaseErrorDetails(@RequestParam Integer processcase_id, @RequestParam Integer related_errordetails_id) {
		ModelAndView mav = new ModelAndView();

		ProcessCase processcase = processCaseService.deleteProcessCaseErrorDetails(processcase_id, related_errordetails_id);

		mav.addObject("processcase_id", processcase_id);
		mav.addObject("processcase", processcase);
		mav.setViewName("processcase/viewProcessCase.jsp");

		return mav;
	}
}