package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.ApprovalDAO;
import com.ttv.cashflow.dao.ComapnyDAO;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.Comapny;

import com.ttv.cashflow.service.ApprovalService;

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
 * Spring MVC controller that handles CRUD requests for Approval entities
 * 
 */

@Controller("ApprovalController")

public class ApprovalController {

	/**
	 * DAO injected by Spring that manages Approval entities
	 * 
	 */
	@Autowired
	private ApprovalDAO approvalDAO;

	/**
	 * DAO injected by Spring that manages Comapny entities
	 * 
	 */
	@Autowired
	private ComapnyDAO comapnyDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Approval entities
	 * 
	 */
	@Autowired
	private ApprovalService approvalService;

	/**
	 * Entry point to show all Approval entities
	 * 
	 */
	public String indexApproval() {
		return "redirect:/indexApproval";
	}

	/**
	* Edit an existing Comapny entity
	* 
	*/
	@RequestMapping("/editApprovalComapny")
	public ModelAndView editApprovalComapny(@RequestParam Integer approval_id, @RequestParam Integer comapny_id) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("approval_id", approval_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("approval/comapny/editComapny.jsp");

		return mav;
	}

	/**
	* Show all Approval entities
	* 
	*/
	@RequestMapping("/indexApproval")
	public ModelAndView listApprovals() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("approvals", approvalService.loadApprovals());

		mav.setViewName("approval/listApprovals.jsp");

		return mav;
	}

	/**
	* Create a new Approval entity
	* 
	*/
	@RequestMapping("/newApproval")
	public ModelAndView newApproval() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("approval", new Approval());
		mav.addObject("newFlag", true);
		mav.setViewName("approval/editApproval.jsp");

		return mav;
	}

	/**
	* Show all Comapny entities by Approval
	* 
	*/
	@RequestMapping("/listApprovalComapny")
	public ModelAndView listApprovalComapny(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("approval", approvalDAO.findApprovalByPrimaryKey(idKey));
		mav.setViewName("approval/comapny/listComapny.jsp");

		return mav;
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping("/deleteApprovalComapny")
	public ModelAndView deleteApprovalComapny(@RequestParam Integer approval_id, @RequestParam Integer related_comapny_id) {
		ModelAndView mav = new ModelAndView();

		Approval approval = approvalService.deleteApprovalComapny(approval_id, related_comapny_id);

		mav.addObject("approval_id", approval_id);
		mav.addObject("approval", approval);
		mav.setViewName("approval/viewApproval.jsp");

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
	* Edit an existing Approval entity
	* 
	*/
	@RequestMapping("/editApproval")
	public ModelAndView editApproval(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("approval", approvalDAO.findApprovalByPrimaryKey(idKey));
		mav.setViewName("approval/editApproval.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/approvalController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping("/newApprovalComapny")
	public ModelAndView newApprovalComapny(@RequestParam Integer approval_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("approval_id", approval_id);
		mav.addObject("comapny", new Comapny());
		mav.addObject("newFlag", true);
		mav.setViewName("approval/comapny/editComapny.jsp");

		return mav;
	}

	/**
	* View an existing Comapny entity
	* 
	*/
	@RequestMapping("/selectApprovalComapny")
	public ModelAndView selectApprovalComapny(@RequestParam Integer approval_id, @RequestParam Integer comapny_id) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("approval_id", approval_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("approval/comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Select the Approval entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteApproval")
	public ModelAndView confirmDeleteApproval(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("approval", approvalDAO.findApprovalByPrimaryKey(idKey));
		mav.setViewName("approval/deleteApproval.jsp");

		return mav;
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping("/saveApprovalComapny")
	public ModelAndView saveApprovalComapny(@RequestParam Integer approval_id, @ModelAttribute Comapny comapny) {
		Approval parent_approval = approvalService.saveApprovalComapny(approval_id, comapny);

		ModelAndView mav = new ModelAndView();
		mav.addObject("approval_id", approval_id);
		mav.addObject("approval", parent_approval);
		mav.setViewName("approval/viewApproval.jsp");

		return mav;
	}

	/**
	* Save an existing Approval entity
	* 
	*/
	@RequestMapping("/saveApproval")
	public String saveApproval(@ModelAttribute Approval approval) {
		approvalService.saveApproval(approval);
		return "forward:/indexApproval";
	}

	/**
	* Select the child Comapny entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteApprovalComapny")
	public ModelAndView confirmDeleteApprovalComapny(@RequestParam Integer approval_id, @RequestParam Integer related_comapny_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(related_comapny_id));
		mav.addObject("approval_id", approval_id);
		mav.setViewName("approval/comapny/deleteComapny.jsp");

		return mav;
	}

	/**
	* Select an existing Approval entity
	* 
	*/
	@RequestMapping("/selectApproval")
	public ModelAndView selectApproval(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("approval", approvalDAO.findApprovalByPrimaryKey(idKey));
		mav.setViewName("approval/viewApproval.jsp");

		return mav;
	}

	/**
	* Delete an existing Approval entity
	* 
	*/
	@RequestMapping("/deleteApproval")
	public String deleteApproval(@RequestParam Integer idKey) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(idKey);
		approvalService.deleteApproval(approval);
		return "forward:/indexApproval";
	}
}