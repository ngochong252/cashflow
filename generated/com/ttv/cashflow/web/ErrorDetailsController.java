package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.ErrorDetailsDAO;
import com.ttv.cashflow.dao.ProcessCaseDAO;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

import com.ttv.cashflow.service.ErrorDetailsService;

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
 * Spring MVC controller that handles CRUD requests for ErrorDetails entities
 * 
 */

@Controller("ErrorDetailsController")

public class ErrorDetailsController {

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
	 * Select the ErrorDetails entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteErrorDetails")
	public ModelAndView confirmDeleteErrorDetails(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("errordetails", errorDetailsDAO.findErrorDetailsByPrimaryKey(idKey));
		mav.setViewName("errordetails/deleteErrorDetails.jsp");

		return mav;
	}

	/**
	* Delete an existing ProcessCase entity
	* 
	*/
	@RequestMapping("/deleteErrorDetailsProcessCases")
	public ModelAndView deleteErrorDetailsProcessCases(@RequestParam Integer errordetails_id, @RequestParam Integer related_processcases_id) {
		ModelAndView mav = new ModelAndView();

		ErrorDetails errordetails = errorDetailsService.deleteErrorDetailsProcessCases(errordetails_id, related_processcases_id);

		mav.addObject("errordetails_id", errordetails_id);
		mav.addObject("errordetails", errordetails);
		mav.setViewName("errordetails/viewErrorDetails.jsp");

		return mav;
	}

	/**
	* Show all ErrorDetails entities
	* 
	*/
	@RequestMapping("/indexErrorDetails")
	public ModelAndView listErrorDetailss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("errordetailss", errorDetailsService.loadErrorDetailss());

		mav.setViewName("errordetails/listErrorDetailss.jsp");

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
	* Delete an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/deleteErrorDetails")
	public String deleteErrorDetails(@RequestParam Integer idKey) {
		ErrorDetails errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(idKey);
		errorDetailsService.deleteErrorDetails(errordetails);
		return "forward:/indexErrorDetails";
	}

	/**
	* Edit an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/editErrorDetails")
	public ModelAndView editErrorDetails(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("errordetails", errorDetailsDAO.findErrorDetailsByPrimaryKey(idKey));
		mav.setViewName("errordetails/editErrorDetails.jsp");

		return mav;
	}

	/**
	* Edit an existing ProcessCase entity
	* 
	*/
	@RequestMapping("/editErrorDetailsProcessCases")
	public ModelAndView editErrorDetailsProcessCases(@RequestParam Integer errordetails_id, @RequestParam Integer processcases_id) {
		ProcessCase processcase = processCaseDAO.findProcessCaseByPrimaryKey(processcases_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("errordetails_id", errordetails_id);
		mav.addObject("processcase", processcase);
		mav.setViewName("errordetails/processcases/editProcessCases.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/errordetailsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Show all ProcessCase entities by ErrorDetails
	* 
	*/
	@RequestMapping("/listErrorDetailsProcessCases")
	public ModelAndView listErrorDetailsProcessCases(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("errordetails", errorDetailsDAO.findErrorDetailsByPrimaryKey(idKey));
		mav.setViewName("errordetails/processcases/listProcessCases.jsp");

		return mav;
	}

	/**
	* Select an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/selectErrorDetails")
	public ModelAndView selectErrorDetails(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("errordetails", errorDetailsDAO.findErrorDetailsByPrimaryKey(idKey));
		mav.setViewName("errordetails/viewErrorDetails.jsp");

		return mav;
	}

	/**
	* Entry point to show all ErrorDetails entities
	* 
	*/
	public String indexErrorDetails() {
		return "redirect:/indexErrorDetails";
	}

	/**
	* Save an existing ErrorDetails entity
	* 
	*/
	@RequestMapping("/saveErrorDetails")
	public String saveErrorDetails(@ModelAttribute ErrorDetails errordetails) {
		errorDetailsService.saveErrorDetails(errordetails);
		return "forward:/indexErrorDetails";
	}

	/**
	* Save an existing ProcessCase entity
	* 
	*/
	@RequestMapping("/saveErrorDetailsProcessCases")
	public ModelAndView saveErrorDetailsProcessCases(@RequestParam Integer errordetails_id, @ModelAttribute ProcessCase processcases) {
		ErrorDetails parent_errordetails = errorDetailsService.saveErrorDetailsProcessCases(errordetails_id, processcases);

		ModelAndView mav = new ModelAndView();
		mav.addObject("errordetails_id", errordetails_id);
		mav.addObject("errordetails", parent_errordetails);
		mav.setViewName("errordetails/viewErrorDetails.jsp");

		return mav;
	}

	/**
	* View an existing ProcessCase entity
	* 
	*/
	@RequestMapping("/selectErrorDetailsProcessCases")
	public ModelAndView selectErrorDetailsProcessCases(@RequestParam Integer errordetails_id, @RequestParam Integer processcases_id) {
		ProcessCase processcase = processCaseDAO.findProcessCaseByPrimaryKey(processcases_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("errordetails_id", errordetails_id);
		mav.addObject("processcase", processcase);
		mav.setViewName("errordetails/processcases/viewProcessCases.jsp");

		return mav;
	}

	/**
	* Select the child ProcessCase entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteErrorDetailsProcessCases")
	public ModelAndView confirmDeleteErrorDetailsProcessCases(@RequestParam Integer errordetails_id, @RequestParam Integer related_processcases_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("processcase", processCaseDAO.findProcessCaseByPrimaryKey(related_processcases_id));
		mav.addObject("errordetails_id", errordetails_id);
		mav.setViewName("errordetails/processcases/deleteProcessCases.jsp");

		return mav;
	}

	/**
	* Create a new ProcessCase entity
	* 
	*/
	@RequestMapping("/newErrorDetailsProcessCases")
	public ModelAndView newErrorDetailsProcessCases(@RequestParam Integer errordetails_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("errordetails_id", errordetails_id);
		mav.addObject("processcase", new ProcessCase());
		mav.addObject("newFlag", true);
		mav.setViewName("errordetails/processcases/editProcessCases.jsp");

		return mav;
	}

	/**
	* Create a new ErrorDetails entity
	* 
	*/
	@RequestMapping("/newErrorDetails")
	public ModelAndView newErrorDetails() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("errordetails", new ErrorDetails());
		mav.addObject("newFlag", true);
		mav.setViewName("errordetails/editErrorDetails.jsp");

		return mav;
	}
}