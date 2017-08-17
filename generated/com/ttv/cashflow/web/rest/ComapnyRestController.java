package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.ApprovalDAO;
import com.ttv.cashflow.dao.BankingAccountingDAO;
import com.ttv.cashflow.dao.ComapnyDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.ComapnyService;

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
 * Spring Rest controller that handles CRUD requests for Comapny entities
 * 
 */

@Controller("ComapnyRestController")

public class ComapnyRestController {

	/**
	 * DAO injected by Spring that manages Approval entities
	 * 
	 */
	@Autowired
	private ApprovalDAO approvalDAO;

	/**
	 * DAO injected by Spring that manages BankingAccounting entities
	 * 
	 */
	@Autowired
	private BankingAccountingDAO bankingAccountingDAO;

	/**
	 * DAO injected by Spring that manages Comapny entities
	 * 
	 */
	@Autowired
	private ComapnyDAO comapnyDAO;

	/**
	 * DAO injected by Spring that manages Ledger entities
	 * 
	 */
	@Autowired
	private LedgerDAO ledgerDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Comapny entities
	 * 
	 */
	@Autowired
	private ComapnyService comapnyService;

	/**
	 * View an existing BankingAccounting entity
	 * 
	 */
	@RequestMapping(value = "/Comapny/{comapny_companyId}/bankingAccountings/{bankingaccounting_id}", method = RequestMethod.GET)
	@ResponseBody
	public BankingAccounting loadComapnyBankingAccountings(@PathVariable Integer comapny_companyId, @PathVariable Integer related_bankingaccountings_id) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(related_bankingaccountings_id, -1, -1);

		return bankingaccounting;
	}

	/**
	* Show all Ledger entities by Comapny
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/ledgers", method = RequestMethod.GET)
	@ResponseBody
	public List<Ledger> getComapnyLedgers(@PathVariable Integer comapny_companyId) {
		return new java.util.ArrayList<Ledger>(comapnyDAO.findComapnyByPrimaryKey(comapny_companyId).getLedgers());
	}

	/**
	* Save an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/bankingAccountings", method = RequestMethod.PUT)
	@ResponseBody
	public BankingAccounting saveComapnyBankingAccountings(@PathVariable Integer comapny_companyId, @RequestBody BankingAccounting bankingaccountings) {
		comapnyService.saveComapnyBankingAccountings(comapny_companyId, bankingaccountings);
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccountings.getId());
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
	* Select an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}", method = RequestMethod.GET)
	@ResponseBody
	public Comapny loadComapny(@PathVariable Integer comapny_companyId) {
		return comapnyDAO.findComapnyByPrimaryKey(comapny_companyId);
	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/ledgers/{ledger_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapnyLedgers(@PathVariable Integer comapny_companyId, @PathVariable Integer related_ledgers_id) {
		comapnyService.deleteComapnyLedgers(comapny_companyId, related_ledgers_id);
	}

	/**
	* Show all Approval entities by Comapny
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/approvals", method = RequestMethod.GET)
	@ResponseBody
	public List<Approval> getComapnyApprovals(@PathVariable Integer comapny_companyId) {
		return new java.util.ArrayList<Approval>(comapnyDAO.findComapnyByPrimaryKey(comapny_companyId).getApprovals());
	}

	/**
	* Delete an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/bankingAccountings/{bankingaccounting_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapnyBankingAccountings(@PathVariable Integer comapny_companyId, @PathVariable Integer related_bankingaccountings_id) {
		comapnyService.deleteComapnyBankingAccountings(comapny_companyId, related_bankingaccountings_id);
	}

	/**
	* Show all Comapny entities
	* 
	*/
	@RequestMapping(value = "/Comapny", method = RequestMethod.GET)
	@ResponseBody
	public List<Comapny> listComapnys() {
		return new java.util.ArrayList<Comapny>(comapnyService.loadComapnys());
	}

	/**
	* View an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/approvals/{approval_id}", method = RequestMethod.GET)
	@ResponseBody
	public Approval loadComapnyApprovals(@PathVariable Integer comapny_companyId, @PathVariable Integer related_approvals_id) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(related_approvals_id, -1, -1);

		return approval;
	}

	/**
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny", method = RequestMethod.POST)
	@ResponseBody
	public Comapny newComapny(@RequestBody Comapny comapny) {
		comapnyService.saveComapny(comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getCompanyId());
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/ledgers", method = RequestMethod.PUT)
	@ResponseBody
	public Ledger saveComapnyLedgers(@PathVariable Integer comapny_companyId, @RequestBody Ledger ledgers) {
		comapnyService.saveComapnyLedgers(comapny_companyId, ledgers);
		return ledgerDAO.findLedgerByPrimaryKey(ledgers.getId());
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapny(@PathVariable Integer comapny_companyId) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_companyId);
		comapnyService.deleteComapny(comapny);
	}

	/**
	* Create a new Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/approvals", method = RequestMethod.POST)
	@ResponseBody
	public Approval newComapnyApprovals(@PathVariable Integer comapny_companyId, @RequestBody Approval approval) {
		comapnyService.saveComapnyApprovals(comapny_companyId, approval);
		return approvalDAO.findApprovalByPrimaryKey(approval.getId());
	}

	/**
	* View an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/ledgers/{ledger_id}", method = RequestMethod.GET)
	@ResponseBody
	public Ledger loadComapnyLedgers(@PathVariable Integer comapny_companyId, @PathVariable Integer related_ledgers_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(related_ledgers_id, -1, -1);

		return ledger;
	}

	/**
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/ledgers", method = RequestMethod.POST)
	@ResponseBody
	public Ledger newComapnyLedgers(@PathVariable Integer comapny_companyId, @RequestBody Ledger ledger) {
		comapnyService.saveComapnyLedgers(comapny_companyId, ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}

	/**
	* Show all BankingAccounting entities by Comapny
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/bankingAccountings", method = RequestMethod.GET)
	@ResponseBody
	public List<BankingAccounting> getComapnyBankingAccountings(@PathVariable Integer comapny_companyId) {
		return new java.util.ArrayList<BankingAccounting>(comapnyDAO.findComapnyByPrimaryKey(comapny_companyId).getBankingAccountings());
	}

	/**
	* Delete an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/approvals/{approval_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapnyApprovals(@PathVariable Integer comapny_companyId, @PathVariable Integer related_approvals_id) {
		comapnyService.deleteComapnyApprovals(comapny_companyId, related_approvals_id);
	}

	/**
	* Save an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/approvals", method = RequestMethod.PUT)
	@ResponseBody
	public Approval saveComapnyApprovals(@PathVariable Integer comapny_companyId, @RequestBody Approval approvals) {
		comapnyService.saveComapnyApprovals(comapny_companyId, approvals);
		return approvalDAO.findApprovalByPrimaryKey(approvals.getId());
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny", method = RequestMethod.PUT)
	@ResponseBody
	public Comapny saveComapny(@RequestBody Comapny comapny) {
		comapnyService.saveComapny(comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getCompanyId());
	}

	/**
	* Create a new BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_companyId}/bankingAccountings", method = RequestMethod.POST)
	@ResponseBody
	public BankingAccounting newComapnyBankingAccountings(@PathVariable Integer comapny_companyId, @RequestBody BankingAccounting bankingaccounting) {
		comapnyService.saveComapnyBankingAccountings(comapny_companyId, bankingaccounting);
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting.getId());
	}
}