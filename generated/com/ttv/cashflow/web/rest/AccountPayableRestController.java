package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.AccountPayableDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.AccountPayableService;

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
 * Spring Rest controller that handles CRUD requests for AccountPayable entities
 * 
 */

@Controller("AccountPayableRestController")

public class AccountPayableRestController {

	/**
	 * DAO injected by Spring that manages AccountPayable entities
	 * 
	 */
	@Autowired
	private AccountPayableDAO accountPayableDAO;

	/**
	 * DAO injected by Spring that manages Ledger entities
	 * 
	 */
	@Autowired
	private LedgerDAO ledgerDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for AccountPayable entities
	 * 
	 */
	@Autowired
	private AccountPayableService accountPayableService;

	/**
	 * Create a new Ledger entity
	 * 
	 */
	@RequestMapping(value = "/AccountPayable/{accountpayable_id}/ledger", method = RequestMethod.POST)
	@ResponseBody
	public Ledger newAccountPayableLedger(@PathVariable Integer accountpayable_id, @RequestBody Ledger ledger) {
		accountPayableService.saveAccountPayableLedger(accountpayable_id, ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}

	/**
	* Select an existing AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/AccountPayable/{accountpayable_id}", method = RequestMethod.GET)
	@ResponseBody
	public AccountPayable loadAccountPayable(@PathVariable Integer accountpayable_id) {
		return accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable_id);
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
	* View an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/AccountPayable/{accountpayable_id}/ledger/{ledger_id}", method = RequestMethod.GET)
	@ResponseBody
	public Ledger loadAccountPayableLedger(@PathVariable Integer accountpayable_id, @PathVariable Integer related_ledger_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(related_ledger_id, -1, -1);

		return ledger;
	}

	/**
	* Create a new AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/AccountPayable", method = RequestMethod.POST)
	@ResponseBody
	public AccountPayable newAccountPayable(@RequestBody AccountPayable accountpayable) {
		accountPayableService.saveAccountPayable(accountpayable);
		return accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable.getId());
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/AccountPayable/{accountpayable_id}/ledger", method = RequestMethod.PUT)
	@ResponseBody
	public Ledger saveAccountPayableLedger(@PathVariable Integer accountpayable_id, @RequestBody Ledger ledger) {
		accountPayableService.saveAccountPayableLedger(accountpayable_id, ledger);
		return ledgerDAO.findLedgerByPrimaryKey(ledger.getId());
	}

	/**
	* Get Ledger entity by AccountPayable
	* 
	*/
	@RequestMapping(value = "/AccountPayable/{accountpayable_id}/ledger", method = RequestMethod.GET)
	@ResponseBody
	public Ledger getAccountPayableLedger(@PathVariable Integer accountpayable_id) {
		return accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable_id).getLedger();
	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping(value = "/AccountPayable/{accountpayable_id}/ledger/{ledger_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccountPayableLedger(@PathVariable Integer accountpayable_id, @PathVariable Integer related_ledger_id) {
		accountPayableService.deleteAccountPayableLedger(accountpayable_id, related_ledger_id);
	}

	/**
	* Show all AccountPayable entities
	* 
	*/
	@RequestMapping(value = "/AccountPayable", method = RequestMethod.GET)
	@ResponseBody
	public List<AccountPayable> listAccountPayables() {
		return new java.util.ArrayList<AccountPayable>(accountPayableService.loadAccountPayables());
	}

	/**
	* Delete an existing AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/AccountPayable/{accountpayable_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAccountPayable(@PathVariable Integer accountpayable_id) {
		AccountPayable accountpayable = accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable_id);
		accountPayableService.deleteAccountPayable(accountpayable);
	}

	/**
	* Save an existing AccountPayable entity
	* 
	*/
	@RequestMapping(value = "/AccountPayable", method = RequestMethod.PUT)
	@ResponseBody
	public AccountPayable saveAccountPayable(@RequestBody AccountPayable accountpayable) {
		accountPayableService.saveAccountPayable(accountpayable);
		return accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable.getId());
	}
}