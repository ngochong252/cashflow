package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.AccountPayableDAO;
import com.ttv.cashflow.dao.AccountReceivableDAO;
import com.ttv.cashflow.dao.ComapnyDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.LedgerService;

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
 * Spring Rest controller that handles CRUD requests for Ledger entities
 * 
 */

@Controller("LedgerRestController")

public class LedgerRestController {

	/**
	 * DAO injected by Spring that manages AccountPayable entities
	 * 
	 */
	@Autowired
	private AccountPayableDAO accountPayableDAO;

	/**
	 * DAO injected by Spring that manages AccountReceivable entities
	 * 
	 */
	@Autowired
	private AccountReceivableDAO accountReceivableDAO;

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
	 * Service injected by Spring that provides CRUD operations for Ledger entities
	 * 
	 */
	@Autowired
	private LedgerService ledgerService;

	/**
	 * Save an existing AccountReceivable entity
	 * 
	 */
	@RequestMapping(value = "/Ledger/{ledger_id}/accountReceivables", method = RequestMethod.PUT)
	@ResponseBody
	public AccountReceivable saveLedgerAccountReceivables(@PathVariable Integer ledger_id, @RequestBody AccountReceivable accountreceivables) {
		ledgerService.saveLedgerAccountReceivables(ledger_id, accountreceivables);
		return accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivables.getId());
	}

	/**
	* Show all Ledger entities
	* 
	*/
	@RequestMapping(value = "/Ledger", method = RequestMethod.GET)
	@ResponseBody
	public List<Ledger> listLedgers() {
		return new java.util.ArrayList<Ledger>(ledgerService.loadLedgers());
	}

	/**
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/comapny", method = RequestMethod.POST)
	@ResponseBody
	public Comapny newLedgerComapny(@PathVariable Integer ledger_id, @RequestBody Comapny comapny) {
		ledgerService.saveLedgerComapny(ledger_id, comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getCompanyId());
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Ledger", method = RequestMethod.PUT)
	@ResponseBody
	public Ledger saveLedger(@RequestBody Ledger ledger) {
		ledgerService.saveLedger(ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}

	/**
	* Create a new AccountReceivable entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountReceivables", method = RequestMethod.POST)
	@ResponseBody
	public AccountReceivable newLedgerAccountReceivables(@PathVariable Integer ledger_id, @RequestBody AccountReceivable accountreceivable) {
		ledgerService.saveLedgerAccountReceivables(ledger_id, accountreceivable);
		return accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable.getId());
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
	* Delete an existing AccountReceivable entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountReceivables/{accountreceivable_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteLedgerAccountReceivables(@PathVariable Integer ledger_id, @PathVariable Integer related_accountreceivables_id) {
		ledgerService.deleteLedgerAccountReceivables(ledger_id, related_accountreceivables_id);
	}

	/**
	* Save an existing AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountPayables", method = RequestMethod.PUT)
	@ResponseBody
	public AccountPayable saveLedgerAccountPayables(@PathVariable Integer ledger_id, @RequestBody AccountPayable accountpayables) {
		ledgerService.saveLedgerAccountPayables(ledger_id, accountpayables);
		return accountPayableDAO.findAccountPayableByPrimaryKey(accountpayables.getId());
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/comapny/{comapny_companyId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteLedgerComapny(@PathVariable Integer ledger_id, @PathVariable Integer related_comapny_companyId) {
		ledgerService.deleteLedgerComapny(ledger_id, related_comapny_companyId);
	}

	/**
	* Show all AccountReceivable entities by Ledger
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountReceivables", method = RequestMethod.GET)
	@ResponseBody
	public List<AccountReceivable> getLedgerAccountReceivables(@PathVariable Integer ledger_id) {
		return new java.util.ArrayList<AccountReceivable>(ledgerDAO.findLedgerByPrimaryKey(ledger_id).getAccountReceivables());
	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteLedger(@PathVariable Integer ledger_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id);
		ledgerService.deleteLedger(ledger);
	}

	/**
	* Create a new AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountPayables", method = RequestMethod.POST)
	@ResponseBody
	public AccountPayable newLedgerAccountPayables(@PathVariable Integer ledger_id, @RequestBody AccountPayable accountpayable) {
		ledgerService.saveLedgerAccountPayables(ledger_id, accountpayable);
		return accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable.getId());
	}

	/**
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping(value = "/Ledger", method = RequestMethod.POST)
	@ResponseBody
	public Ledger newLedger(@RequestBody Ledger ledger) {
		ledgerService.saveLedger(ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}

	/**
	* Show all AccountPayable entities by Ledger
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountPayables", method = RequestMethod.GET)
	@ResponseBody
	public List<AccountPayable> getLedgerAccountPayables(@PathVariable Integer ledger_id) {
		return new java.util.ArrayList<AccountPayable>(ledgerDAO.findLedgerByPrimaryKey(ledger_id).getAccountPayables());
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/comapny", method = RequestMethod.PUT)
	@ResponseBody
	public Comapny saveLedgerComapny(@PathVariable Integer ledger_id, @RequestBody Comapny comapny) {
		ledgerService.saveLedgerComapny(ledger_id, comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getCompanyId());
	}

	/**
	* View an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/comapny/{comapny_companyId}", method = RequestMethod.GET)
	@ResponseBody
	public Comapny loadLedgerComapny(@PathVariable Integer ledger_id, @PathVariable Integer related_comapny_companyId) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny_companyId, -1, -1);

		return comapny;
	}

	/**
	* Get Comapny entity by Ledger
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/comapny", method = RequestMethod.GET)
	@ResponseBody
	public Comapny getLedgerComapny(@PathVariable Integer ledger_id) {
		return ledgerDAO.findLedgerByPrimaryKey(ledger_id).getComapny();
	}

	/**
	* Delete an existing AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountPayables/{accountpayable_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteLedgerAccountPayables(@PathVariable Integer ledger_id, @PathVariable Integer related_accountpayables_id) {
		ledgerService.deleteLedgerAccountPayables(ledger_id, related_accountpayables_id);
	}

	/**
	* View an existing AccountReceivable entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountReceivables/{accountreceivable_id}", method = RequestMethod.GET)
	@ResponseBody
	public AccountReceivable loadLedgerAccountReceivables(@PathVariable Integer ledger_id, @PathVariable Integer related_accountreceivables_id) {
		AccountReceivable accountreceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(related_accountreceivables_id, -1, -1);

		return accountreceivable;
	}

	/**
	* Select an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}", method = RequestMethod.GET)
	@ResponseBody
	public Ledger loadLedger(@PathVariable Integer ledger_id) {
		return ledgerDAO.findLedgerByPrimaryKey(ledger_id);
	}

	/**
	* View an existing AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/Ledger/{ledger_id}/accountPayables/{accountpayable_id}", method = RequestMethod.GET)
	@ResponseBody
	public AccountPayable loadLedgerAccountPayables(@PathVariable Integer ledger_id, @PathVariable Integer related_accountpayables_id) {
		AccountPayable accountpayable = accountPayableDAO.findAccountPayableByPrimaryKey(related_accountpayables_id, -1, -1);

		return accountpayable;
	}
}