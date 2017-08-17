package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.ApprovalDAO;
import com.ttv.cashflow.dao.ComapnyDAO;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.Comapny;

import com.ttv.cashflow.service.ApprovalService;

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
 * Spring Rest controller that handles CRUD requests for Approval entities
 * 
 */

@Controller("ApprovalRestController")

public class ApprovalRestController {

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
	 * Select an existing Approval entity
	 * 
	 */
	@RequestMapping(value = "/Approval/{approval_id}", method = RequestMethod.GET)
	@ResponseBody
	public Approval loadApproval(@PathVariable Integer approval_id) {
		return approvalDAO.findApprovalByPrimaryKey(approval_id);
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Approval/{approval_id}/comapny", method = RequestMethod.PUT)
	@ResponseBody
	public Comapny saveApprovalComapny(@PathVariable Integer approval_id, @RequestBody Comapny comapny) {
		approvalService.saveApprovalComapny(approval_id, comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getCompanyId());
	}

	/**
	* View an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Approval/{approval_id}/comapny/{comapny_companyId}", method = RequestMethod.GET)
	@ResponseBody
	public Comapny loadApprovalComapny(@PathVariable Integer approval_id, @PathVariable Integer related_comapny_companyId) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny_companyId, -1, -1);

		return comapny;
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Approval/{approval_id}/comapny/{comapny_companyId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteApprovalComapny(@PathVariable Integer approval_id, @PathVariable Integer related_comapny_companyId) {
		approvalService.deleteApprovalComapny(approval_id, related_comapny_companyId);
	}

	/**
	* Get Comapny entity by Approval
	* 
	*/
	@RequestMapping(value = "/Approval/{approval_id}/comapny", method = RequestMethod.GET)
	@ResponseBody
	public Comapny getApprovalComapny(@PathVariable Integer approval_id) {
		return approvalDAO.findApprovalByPrimaryKey(approval_id).getComapny();
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
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping(value = "/Approval/{approval_id}/comapny", method = RequestMethod.POST)
	@ResponseBody
	public Comapny newApprovalComapny(@PathVariable Integer approval_id, @RequestBody Comapny comapny) {
		approvalService.saveApprovalComapny(approval_id, comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getCompanyId());
	}

	/**
	* Delete an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Approval/{approval_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteApproval(@PathVariable Integer approval_id) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(approval_id);
		approvalService.deleteApproval(approval);
	}

	/**
	* Show all Approval entities
	* 
	*/
	@RequestMapping(value = "/Approval", method = RequestMethod.GET)
	@ResponseBody
	public List<Approval> listApprovals() {
		return new java.util.ArrayList<Approval>(approvalService.loadApprovals());
	}

	/**
	* Create a new Approval entity
	* 
	*/
	@RequestMapping(value = "/Approval", method = RequestMethod.POST)
	@ResponseBody
	public Approval newApproval(@RequestBody Approval approval) {
		approvalService.saveApproval(approval);
		return approvalDAO.findApprovalByPrimaryKey(approval.getId());
	}

	/**
	* Save an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Approval", method = RequestMethod.PUT)
	@ResponseBody
	public Approval saveApproval(@RequestBody Approval approval) {
		approvalService.saveApproval(approval);
		return approvalDAO.findApprovalByPrimaryKey(approval.getId());
	}
}