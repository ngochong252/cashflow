package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.AccountReceivableDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.AccountReceivableService;

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
 * Spring Rest controller that handles CRUD requests for AccountReceivable entities
 * 
 */

@Controller("AccountReceivableRestController")

public class AccountReceivableRestController {

	/**
	 * DAO injected by Spring that manages AccountReceivable entities
	 * 
	 */
	@Autowired
	private AccountReceivableDAO accountReceivableDAO;

	/**
	 * DAO injected by Spring that manages Ledger entities
	 * 
	 */
	@Autowired
	private LedgerDAO ledgerDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for AccountReceivable entities
	 * 
	 */
	@Autowired
	private AccountReceivableService accountReceivableService;

	/**
	 * Create a new AccountReceivable entity
	 * 
	 */
	@RequestMapping(value = "/AccountReceivable", method = RequestMethod.POST)
	@ResponseBody
	public AccountReceivable newAccountReceivable(@RequestBody AccountReceivable accountreceivable) {
		accountReceivableService.saveAccountReceivable(accountreceivable);
		return accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable.getId());
	}

	/**
	* Save an existing AccountReceivable entity
	* 
	*/
	@RequestMapping(value = "/AccountReceivable", method = RequestMethod.PUT)
	@ResponseBody
	public AccountReceivable saveAccountReceivable(@RequestBody AccountReceivable accountreceivable) {
		accountReceivableService.saveAccountReceivable(accountreceivable);
		return accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable.getId());
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/AccountReceivable/{accountreceivable_id}/ledger", method = RequestMethod.PUT)
	@ResponseBody
	public Ledger saveAccountReceivableLedger(@PathVariable Integer accountreceivable_id, @RequestBody Ledger ledger) {
		accountReceivableService.saveAccountReceivableLedger(accountreceivable_id, ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}

	/**
	* Select an existing AccountReceivable entity
	* 
	*/
	@RequestMapping(value = "/AccountReceivable/{accountreceivable_id}", method = RequestMethod.GET)
	@ResponseBody
	public AccountReceivable loadAccountReceivable(@PathVariable Integer accountreceivable_id) {
		return accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable_id);
	}

	/**
	* View an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/AccountReceivable/{accountreceivable_id}/ledger/{ledger_id}", method = RequestMethod.GET)
	@ResponseBody
	public Ledger loadAccountReceivableLedger(@PathVariable Integer accountreceivable_id, @PathVariable Integer related_ledger_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(related_ledger_id, -1, -1);

		return ledger;
	}

	/**
	* Get Ledger entity by AccountReceivable
	* 
	*/
	@RequestMapping(value = "/AccountReceivable/{accountreceivable_id}/ledger", method = RequestMethod.GET)
	@ResponseBody
	public Ledger getAccountReceivableLedger(@PathVariable Integer accountreceivable_id) {
		return accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable_id).getLedger();
	}

	/**
	* Delete an existing AccountReceivable entity
	* 
	*/
	@RequestMapping(value = "/AccountReceivable/{accountreceivable_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccountReceivable(@PathVariable Integer accountreceivable_id) {
		AccountReceivable accountreceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable_id);
		accountReceivableService.deleteAccountReceivable(accountreceivable);
	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/AccountReceivable/{accountreceivable_id}/ledger/{ledger_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccountReceivableLedger(@PathVariable Integer accountreceivable_id, @PathVariable Integer related_ledger_id) {
		accountReceivableService.deleteAccountReceivableLedger(accountreceivable_id, related_ledger_id);
	}

	/**
	* Show all AccountReceivable entities
	* 
	*/
	@RequestMapping(value = "/AccountReceivable", method = RequestMethod.GET)
	@ResponseBody
	public List<AccountReceivable> listAccountReceivables() {
		return new java.util.ArrayList<AccountReceivable>(accountReceivableService.loadAccountReceivables());
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
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping(value = "/AccountReceivable/{accountreceivable_id}/ledger", method = RequestMethod.POST)
	@ResponseBody
	public Ledger newAccountReceivableLedger(@PathVariable Integer accountreceivable_id, @RequestBody Ledger ledger) {
		accountReceivableService.saveAccountReceivableLedger(accountreceivable_id, ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}
}