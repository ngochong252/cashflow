package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.AccountReceivableDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.AccountReceivableService;

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
 * Spring MVC controller that handles CRUD requests for AccountReceivable entities
 * 
 */

@Controller("AccountReceivableController")

public class AccountReceivableController {

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
	 * Select an existing AccountReceivable entity
	 * 
	 */
	@RequestMapping("/selectAccountReceivable")
	public ModelAndView selectAccountReceivable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountreceivable", accountReceivableDAO.findAccountReceivableByPrimaryKey(idKey));
		mav.setViewName("accountreceivable/viewAccountReceivable.jsp");

		return mav;
	}

	/**
	* Edit an existing Ledger entity
	* 
	*/
	@RequestMapping("/editAccountReceivableLedger")
	public ModelAndView editAccountReceivableLedger(@RequestParam Integer accountreceivable_id, @RequestParam Integer ledger_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accountreceivable_id", accountreceivable_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("accountreceivable/ledger/editLedger.jsp");

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
	* Show all Ledger entities by AccountReceivable
	* 
	*/
	@RequestMapping("/listAccountReceivableLedger")
	public ModelAndView listAccountReceivableLedger(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountreceivable", accountReceivableDAO.findAccountReceivableByPrimaryKey(idKey));
		mav.setViewName("accountreceivable/ledger/listLedger.jsp");

		return mav;
	}

	/**
	* Entry point to show all AccountReceivable entities
	* 
	*/
	public String indexAccountReceivable() {
		return "redirect:/indexAccountReceivable";
	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping("/deleteAccountReceivableLedger")
	public ModelAndView deleteAccountReceivableLedger(@RequestParam Integer accountreceivable_id, @RequestParam Integer related_ledger_id) {
		ModelAndView mav = new ModelAndView();

		AccountReceivable accountreceivable = accountReceivableService.deleteAccountReceivableLedger(accountreceivable_id, related_ledger_id);

		mav.addObject("accountreceivable_id", accountreceivable_id);
		mav.addObject("accountreceivable", accountreceivable);
		mav.setViewName("accountreceivable/viewAccountReceivable.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/accountreceivableController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Show all AccountReceivable entities
	* 
	*/
	@RequestMapping("/indexAccountReceivable")
	public ModelAndView listAccountReceivables() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountreceivables", accountReceivableService.loadAccountReceivables());

		mav.setViewName("accountreceivable/listAccountReceivables.jsp");

		return mav;
	}

	/**
	* Create a new AccountReceivable entity
	* 
	*/
	@RequestMapping("/newAccountReceivable")
	public ModelAndView newAccountReceivable() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountreceivable", new AccountReceivable());
		mav.addObject("newFlag", true);
		mav.setViewName("accountreceivable/editAccountReceivable.jsp");

		return mav;
	}

	/**
	* Select the child Ledger entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteAccountReceivableLedger")
	public ModelAndView confirmDeleteAccountReceivableLedger(@RequestParam Integer accountreceivable_id, @RequestParam Integer related_ledger_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(related_ledger_id));
		mav.addObject("accountreceivable_id", accountreceivable_id);
		mav.setViewName("accountreceivable/ledger/deleteLedger.jsp");

		return mav;
	}

	/**
	* Select the AccountReceivable entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteAccountReceivable")
	public ModelAndView confirmDeleteAccountReceivable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountreceivable", accountReceivableDAO.findAccountReceivableByPrimaryKey(idKey));
		mav.setViewName("accountreceivable/deleteAccountReceivable.jsp");

		return mav;
	}

	/**
	* Save an existing AccountReceivable entity
	* 
	*/
	@RequestMapping("/saveAccountReceivable")
	public String saveAccountReceivable(@ModelAttribute AccountReceivable accountreceivable) {
		accountReceivableService.saveAccountReceivable(accountreceivable);
		return "forward:/indexAccountReceivable";
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping("/saveAccountReceivableLedger")
	public ModelAndView saveAccountReceivableLedger(@RequestParam Integer accountreceivable_id, @ModelAttribute Ledger ledger) {
		AccountReceivable parent_accountreceivable = accountReceivableService.saveAccountReceivableLedger(accountreceivable_id, ledger);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accountreceivable_id", accountreceivable_id);
		mav.addObject("accountreceivable", parent_accountreceivable);
		mav.setViewName("accountreceivable/viewAccountReceivable.jsp");

		return mav;
	}

	/**
	* Edit an existing AccountReceivable entity
	* 
	*/
	@RequestMapping("/editAccountReceivable")
	public ModelAndView editAccountReceivable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountreceivable", accountReceivableDAO.findAccountReceivableByPrimaryKey(idKey));
		mav.setViewName("accountreceivable/editAccountReceivable.jsp");

		return mav;
	}

	/**
	* View an existing Ledger entity
	* 
	*/
	@RequestMapping("/selectAccountReceivableLedger")
	public ModelAndView selectAccountReceivableLedger(@RequestParam Integer accountreceivable_id, @RequestParam Integer ledger_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accountreceivable_id", accountreceivable_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("accountreceivable/ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping("/newAccountReceivableLedger")
	public ModelAndView newAccountReceivableLedger(@RequestParam Integer accountreceivable_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("accountreceivable_id", accountreceivable_id);
		mav.addObject("ledger", new Ledger());
		mav.addObject("newFlag", true);
		mav.setViewName("accountreceivable/ledger/editLedger.jsp");

		return mav;
	}

	/**
	* Delete an existing AccountReceivable entity
	* 
	*/
	@RequestMapping("/deleteAccountReceivable")
	public String deleteAccountReceivable(@RequestParam Integer idKey) {
		AccountReceivable accountreceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(idKey);
		accountReceivableService.deleteAccountReceivable(accountreceivable);
		return "forward:/indexAccountReceivable";
	}
}