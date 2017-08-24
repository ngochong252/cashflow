package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.AccountPayableDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.AccountPayableService;

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
 * Spring MVC controller that handles CRUD requests for AccountPayable entities
 * 
 */

@Controller("AccountPayableController")

public class AccountPayableController {

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
	 * Select the AccountPayable entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAccountPayable")
	public ModelAndView confirmDeleteAccountPayable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountpayable", accountPayableDAO.findAccountPayableByPrimaryKey(idKey));
		mav.setViewName("accountpayable/deleteAccountPayable.jsp");

		return mav;
	}

	/**
	* Select an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/selectAccountPayable")
	public ModelAndView selectAccountPayable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountpayable", accountPayableDAO.findAccountPayableByPrimaryKey(idKey));
		mav.setViewName("accountpayable/viewAccountPayable.jsp");

		return mav;
	}

	/**
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping("/newAccountPayableLedger")
	public ModelAndView newAccountPayableLedger(@RequestParam Integer accountpayable_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("accountpayable_id", accountpayable_id);
		mav.addObject("ledger", new Ledger());
		mav.addObject("newFlag", true);
		mav.setViewName("accountpayable/ledger/editLedger.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/accountpayableController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping("/deleteAccountPayableLedger")
	public ModelAndView deleteAccountPayableLedger(@RequestParam Integer accountpayable_id, @RequestParam Integer related_ledger_id) {
		ModelAndView mav = new ModelAndView();

		AccountPayable accountpayable = accountPayableService.deleteAccountPayableLedger(accountpayable_id, related_ledger_id);

		mav.addObject("accountpayable_id", accountpayable_id);
		mav.addObject("accountpayable", accountpayable);
		mav.setViewName("accountpayable/viewAccountPayable.jsp");

		return mav;
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping("/saveAccountPayableLedger")
	public ModelAndView saveAccountPayableLedger(@RequestParam Integer accountpayable_id, @ModelAttribute Ledger ledger) {
		AccountPayable parent_accountpayable = accountPayableService.saveAccountPayableLedger(accountpayable_id, ledger);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accountpayable_id", accountpayable_id);
		mav.addObject("accountpayable", parent_accountpayable);
		mav.setViewName("accountpayable/viewAccountPayable.jsp");

		return mav;
	}

	/**
	* Select the child Ledger entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteAccountPayableLedger")
	public ModelAndView confirmDeleteAccountPayableLedger(@RequestParam Integer accountpayable_id, @RequestParam Integer related_ledger_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(related_ledger_id));
		mav.addObject("accountpayable_id", accountpayable_id);
		mav.setViewName("accountpayable/ledger/deleteLedger.jsp");

		return mav;
	}

	/**
	* Show all Ledger entities by AccountPayable
	* 
	*/
	@RequestMapping("/listAccountPayableLedger")
	public ModelAndView listAccountPayableLedger(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountpayable", accountPayableDAO.findAccountPayableByPrimaryKey(idKey));
		mav.setViewName("accountpayable/ledger/listLedger.jsp");

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
	* Edit an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/editAccountPayable")
	public ModelAndView editAccountPayable(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountpayable", accountPayableDAO.findAccountPayableByPrimaryKey(idKey));
		mav.setViewName("accountpayable/editAccountPayable.jsp");

		return mav;
	}

	/**
	* Delete an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/deleteAccountPayable")
	public String deleteAccountPayable(@RequestParam Integer idKey) {
		AccountPayable accountpayable = accountPayableDAO.findAccountPayableByPrimaryKey(idKey);
		accountPayableService.deleteAccountPayable(accountpayable);
		return "forward:/indexAccountPayable";
	}

	/**
	* View an existing Ledger entity
	* 
	*/
	@RequestMapping("/selectAccountPayableLedger")
	public ModelAndView selectAccountPayableLedger(@RequestParam Integer accountpayable_id, @RequestParam Integer ledger_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accountpayable_id", accountpayable_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("accountpayable/ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* Show all AccountPayable entities
	* 
	*/
	@RequestMapping("/indexAccountPayable")
	public ModelAndView listAccountPayables() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountpayables", accountPayableService.loadAccountPayables());

		mav.setViewName("accountpayable/listAccountPayables.jsp");

		return mav;
	}

	/**
	* Save an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/saveAccountPayable")
	public String saveAccountPayable(@ModelAttribute AccountPayable accountpayable) {
		accountPayableService.saveAccountPayable(accountpayable);
		return "forward:/indexAccountPayable";
	}

	/**
	* Create a new AccountPayable entity
	* 
	*/
	@RequestMapping("/newAccountPayable")
	public ModelAndView newAccountPayable() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountpayable", new AccountPayable());
		mav.addObject("newFlag", true);
		mav.setViewName("accountpayable/editAccountPayable.jsp");

		return mav;
	}

	/**
	* Entry point to show all AccountPayable entities
	* 
	*/
	public String indexAccountPayable() {
		return "redirect:/indexAccountPayable";
	}

	/**
	* Edit an existing Ledger entity
	* 
	*/
	@RequestMapping("/editAccountPayableLedger")
	public ModelAndView editAccountPayableLedger(@RequestParam Integer accountpayable_id, @RequestParam Integer ledger_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("accountpayable_id", accountpayable_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("accountpayable/ledger/editLedger.jsp");

		return mav;
	}
}