package com.ttv.cashflow.web.rest;

import com.ttv.cashflow.dao.BankingAccountingDAO;
import com.ttv.cashflow.dao.ComapnyDAO;

import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;

import com.ttv.cashflow.service.BankingAccountingService;

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
 * Spring Rest controller that handles CRUD requests for BankingAccounting entities
 * 
 */

@Controller("BankingAccountingRestController")

public class BankingAccountingRestController {

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
	 * Service injected by Spring that provides CRUD operations for BankingAccounting entities
	 * 
	 */
	@Autowired
	private BankingAccountingService bankingAccountingService;

	/**
	 * View an existing Comapny entity
	 * 
	 */
	@RequestMapping(value = "/BankingAccounting/{bankingaccounting_id}/comapny/{comapny_id}", method = RequestMethod.GET)
	@ResponseBody
	public Comapny loadBankingAccountingComapny(@PathVariable Integer bankingaccounting_id, @PathVariable Integer related_comapny_id) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny_id, -1, -1);

		return comapny;
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
	@RequestMapping(value = "/BankingAccounting/{bankingaccounting_id}/comapny", method = RequestMethod.POST)
	@ResponseBody
	public Comapny newBankingAccountingComapny(@PathVariable Integer bankingaccounting_id, @RequestBody Comapny comapny) {
		bankingAccountingService.saveBankingAccountingComapny(bankingaccounting_id, comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getId());
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/BankingAccounting/{bankingaccounting_id}/comapny/{comapny_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBankingAccountingComapny(@PathVariable Integer bankingaccounting_id, @PathVariable Integer related_comapny_id) {
		bankingAccountingService.deleteBankingAccountingComapny(bankingaccounting_id, related_comapny_id);
	}

	/**
	* Select an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/BankingAccounting/{bankingaccounting_id}", method = RequestMethod.GET)
	@ResponseBody
	public BankingAccounting loadBankingAccounting(@PathVariable Integer bankingaccounting_id) {
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting_id);
	}

	/**
	* Show all BankingAccounting entities
	* 
	*/
	@RequestMapping(value = "/BankingAccounting", method = RequestMethod.GET)
	@ResponseBody
	public List<BankingAccounting> listBankingAccountings() {
		return new java.util.ArrayList<BankingAccounting>(bankingAccountingService.loadBankingAccountings());
	}

	/**
	* Delete an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/BankingAccounting/{bankingaccounting_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteBankingAccounting(@PathVariable Integer bankingaccounting_id) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting_id);
		bankingAccountingService.deleteBankingAccounting(bankingaccounting);
	}

	/**
	* Get Comapny entity by BankingAccounting
	* 
	*/
	@RequestMapping(value = "/BankingAccounting/{bankingaccounting_id}/comapny", method = RequestMethod.GET)
	@ResponseBody
	public Comapny getBankingAccountingComapny(@PathVariable Integer bankingaccounting_id) {
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting_id).getComapny();
	}

	/**
	* Create a new BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/BankingAccounting", method = RequestMethod.POST)
	@ResponseBody
	public BankingAccounting newBankingAccounting(@RequestBody BankingAccounting bankingaccounting) {
		bankingAccountingService.saveBankingAccounting(bankingaccounting);
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting.getId());
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping(value = "/BankingAccounting/{bankingaccounting_id}/comapny", method = RequestMethod.PUT)
	@ResponseBody
	public Comapny saveBankingAccountingComapny(@PathVariable Integer bankingaccounting_id, @RequestBody Comapny comapny) {
		bankingAccountingService.saveBankingAccountingComapny(bankingaccounting_id, comapny);
		return comapnyDAO.findComapnyByPrimaryKey(comapny.getId());
	}

	/**
	* Save an existing BankingAccounting entity
	* 
	*/
	@RequestMapping(value = "/BankingAccounting", method = RequestMethod.PUT)
	@ResponseBody
	public BankingAccounting saveBankingAccounting(@RequestBody BankingAccounting bankingaccounting) {
		bankingAccountingService.saveBankingAccounting(bankingaccounting);
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting.getId());
	}
}