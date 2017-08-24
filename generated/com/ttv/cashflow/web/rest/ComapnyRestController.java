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
	 * Show all Ledger entities by Comapny
	 * 
	 */
	@RequestMapping(value = "/Comapny/{comapny_id}/ledgers", method = RequestMethod.GET)
	@ResponseBody
	public List<Ledger> getComapnyLedgers(@PathVariable Integer comapny_id) {
		return new java.util.ArrayList<Ledger>(comapnyDAO.findComapnyByPrimaryKey(comapny_id).getLedgers());
	}

	/**
	* Create a new Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/approvals", method = RequestMethod.POST)
	@ResponseBody
	public Approval newComapnyApprovals(@PathVariable Integer comapny_id, @RequestBody Approval approval) {
		comapnyService.saveComapnyApprovals(comapny_id, approval);
		return approvalDAO.findApprovalByPrimaryKey(approval.getId());
	}

	/**
	* Save an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/bankingAccountings", method = RequestMethod.PUT)
	@ResponseBody
	public BankingAccounting saveComapnyBankingAccountings(@PathVariable Integer comapny_id, @RequestBody BankingAccounting bankingaccountings) {
		comapnyService.saveComapnyBankingAccountings(comapny_id, bankingaccountings);
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccountings.getId());
	}

	/**
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny", method = RequestMethod.POST)
	@ResponseBody
	public Comapny newComapny(@RequestBody Comapny comapny) {
		comapnyService.saveComapny(comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getId());
	}

	/**
	* Delete an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/approvals/{approval_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapnyApprovals(@PathVariable Integer comapny_id, @PathVariable Integer related_approvals_id) {
		comapnyService.deleteComapnyApprovals(comapny_id, related_approvals_id);
	}

	/**
	* Show all BankingAccounting entities by Comapny
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/bankingAccountings", method = RequestMethod.GET)
	@ResponseBody
	public List<BankingAccounting> getComapnyBankingAccountings(@PathVariable Integer comapny_id) {
		return new java.util.ArrayList<BankingAccounting>(comapnyDAO.findComapnyByPrimaryKey(comapny_id).getBankingAccountings());
	}

	/**
	* Save an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/approvals", method = RequestMethod.PUT)
	@ResponseBody
	public Approval saveComapnyApprovals(@PathVariable Integer comapny_id, @RequestBody Approval approvals) {
		comapnyService.saveComapnyApprovals(comapny_id, approvals);
		return approvalDAO.findApprovalByPrimaryKey(approvals.getId());
	}

	/**
	* View an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/ledgers/{ledger_id}", method = RequestMethod.GET)
	@ResponseBody
	public Ledger loadComapnyLedgers(@PathVariable Integer comapny_id, @PathVariable Integer related_ledgers_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(related_ledgers_id, -1, -1);

		return ledger;
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapny(@PathVariable Integer comapny_id) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id);
		comapnyService.deleteComapny(comapny);
	}

	/**
	* Create a new BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/bankingAccountings", method = RequestMethod.POST)
	@ResponseBody
	public BankingAccounting newComapnyBankingAccountings(@PathVariable Integer comapny_id, @RequestBody BankingAccounting bankingaccounting) {
		comapnyService.saveComapnyBankingAccountings(comapny_id, bankingaccounting);
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting.getId());
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
	* View an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/bankingAccountings/{bankingaccounting_id}", method = RequestMethod.GET)
	@ResponseBody
	public BankingAccounting loadComapnyBankingAccountings(@PathVariable Integer comapny_id, @PathVariable Integer related_bankingaccountings_id) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(related_bankingaccountings_id, -1, -1);

		return bankingaccounting;
	}

	/**
	* Delete an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/bankingAccountings/{bankingaccounting_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapnyBankingAccountings(@PathVariable Integer comapny_id, @PathVariable Integer related_bankingaccountings_id) {
		comapnyService.deleteComapnyBankingAccountings(comapny_id, related_bankingaccountings_id);
	}

	/**
	* Select an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}", method = RequestMethod.GET)
	@ResponseBody
	public Comapny loadComapny(@PathVariable Integer comapny_id) {
		return comapnyDAO.findComapnyByPrimaryKey(comapny_id);
	}

	/**
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/ledgers", method = RequestMethod.POST)
	@ResponseBody
	public Ledger newComapnyLedgers(@PathVariable Integer comapny_id, @RequestBody Ledger ledger) {
		comapnyService.saveComapnyLedgers(comapny_id, ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/ledgers/{ledger_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteComapnyLedgers(@PathVariable Integer comapny_id, @PathVariable Integer related_ledgers_id) {
		comapnyService.deleteComapnyLedgers(comapny_id, related_ledgers_id);
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
	* Show all Approval entities by Comapny
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/approvals", method = RequestMethod.GET)
	@ResponseBody
	public List<Approval> getComapnyApprovals(@PathVariable Integer comapny_id) {
		return new java.util.ArrayList<Approval>(comapnyDAO.findComapnyByPrimaryKey(comapny_id).getApprovals());
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Comapny", method = RequestMethod.PUT)
	@ResponseBody
	public Comapny saveComapny(@RequestBody Comapny comapny) {
		comapnyService.saveComapny(comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getId());
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/ledgers", method = RequestMethod.PUT)
	@ResponseBody
	public Ledger saveComapnyLedgers(@PathVariable Integer comapny_id, @RequestBody Ledger ledgers) {
		comapnyService.saveComapnyLedgers(comapny_id, ledgers);
		return ledgerDAO.findLedgerByPrimaryKey(ledgers.getId());
	}

	/**
	* View an existing Approval entity
	* 
	*/
	@RequestMapping(value = "/Comapny/{comapny_id}/approvals/{approval_id}", method = RequestMethod.GET)
	@ResponseBody
	public Approval loadComapnyApprovals(@PathVariable Integer comapny_id, @PathVariable Integer related_approvals_id) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(related_approvals_id, -1, -1);

		return approval;
	}
}