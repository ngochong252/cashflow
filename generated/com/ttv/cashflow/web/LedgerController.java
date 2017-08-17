package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.AccountPayableDAO;
import com.ttv.cashflow.dao.AccountReceivableDAO;
import com.ttv.cashflow.dao.ComapnyDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.LedgerService;

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
 * Spring MVC controller that handles CRUD requests for Ledger entities
 * 
 */

@Controller("LedgerController")

public class LedgerController {

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
	 * Delete an existing Ledger entity
	 * 
	 */
	@RequestMapping("/deleteLedger")
	public String deleteLedger(@RequestParam Integer idKey) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(idKey);
		ledgerService.deleteLedger(ledger);
		return "forward:/indexLedger";
	}

	/**
	* View an existing Comapny entity
	* 
	*/
	@RequestMapping("/selectLedgerComapny")
	public ModelAndView selectLedgerComapny(@RequestParam Integer ledger_id, @RequestParam Integer comapny_companyId) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_companyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("ledger/comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping("/saveLedger")
	public String saveLedger(@ModelAttribute Ledger ledger) {
		ledgerService.saveLedger(ledger);
		return "forward:/indexLedger";
	}

	/**
	* Edit an existing Comapny entity
	* 
	*/
	@RequestMapping("/editLedgerComapny")
	public ModelAndView editLedgerComapny(@RequestParam Integer ledger_id, @RequestParam Integer comapny_companyId) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_companyId, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("ledger/comapny/editComapny.jsp");

		return mav;
	}

	/**
	* Edit an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/editLedgerAccountPayables")
	public ModelAndView editLedgerAccountPayables(@RequestParam Integer ledger_id, @RequestParam Integer accountpayables_id) {
		AccountPayable accountpayable = accountPayableDAO.findAccountPayableByPrimaryKey(accountpayables_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("accountpayable", accountpayable);
		mav.setViewName("ledger/accountpayables/editAccountPayables.jsp");

		return mav;
	}

	/**
	* Show all AccountReceivable entities by Ledger
	* 
	*/
	@RequestMapping("/listLedgerAccountReceivables")
	public ModelAndView listLedgerAccountReceivables(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(idKey));
		mav.setViewName("ledger/accountreceivables/listAccountReceivables.jsp");

		return mav;
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping("/saveLedgerComapny")
	public ModelAndView saveLedgerComapny(@RequestParam Integer ledger_id, @ModelAttribute Comapny comapny) {
		Ledger parent_ledger = ledgerService.saveLedgerComapny(ledger_id, comapny);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("ledger", parent_ledger);
		mav.setViewName("ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* View an existing AccountReceivable entity
	* 
	*/
	@RequestMapping("/selectLedgerAccountReceivables")
	public ModelAndView selectLedgerAccountReceivables(@RequestParam Integer ledger_id, @RequestParam Integer accountreceivables_id) {
		AccountReceivable accountreceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivables_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("accountreceivable", accountreceivable);
		mav.setViewName("ledger/accountreceivables/viewAccountReceivables.jsp");

		return mav;
	}

	/**
	* Edit an existing Ledger entity
	* 
	*/
	@RequestMapping("/editLedger")
	public ModelAndView editLedger(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(idKey));
		mav.setViewName("ledger/editLedger.jsp");

		return mav;
	}

	/**
	* Save an existing AccountReceivable entity
	* 
	*/
	@RequestMapping("/saveLedgerAccountReceivables")
	public ModelAndView saveLedgerAccountReceivables(@RequestParam Integer ledger_id, @ModelAttribute AccountReceivable accountreceivables) {
		Ledger parent_ledger = ledgerService.saveLedgerAccountReceivables(ledger_id, accountreceivables);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("ledger", parent_ledger);
		mav.setViewName("ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* Show all Comapny entities by Ledger
	* 
	*/
	@RequestMapping("/listLedgerComapny")
	public ModelAndView listLedgerComapny(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(idKey));
		mav.setViewName("ledger/comapny/listComapny.jsp");

		return mav;
	}

	/**
	* Select the child AccountReceivable entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteLedgerAccountReceivables")
	public ModelAndView confirmDeleteLedgerAccountReceivables(@RequestParam Integer ledger_id, @RequestParam Integer related_accountreceivables_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountreceivable", accountReceivableDAO.findAccountReceivableByPrimaryKey(related_accountreceivables_id));
		mav.addObject("ledger_id", ledger_id);
		mav.setViewName("ledger/accountreceivables/deleteAccountReceivables.jsp");

		return mav;
	}

	/**
	* Select an existing Ledger entity
	* 
	*/
	@RequestMapping("/selectLedger")
	public ModelAndView selectLedger(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(idKey));
		mav.setViewName("ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping("/newLedger")
	public ModelAndView newLedger() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", new Ledger());
		mav.addObject("newFlag", true);
		mav.setViewName("ledger/editLedger.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/ledgerController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Create a new AccountReceivable entity
	* 
	*/
	@RequestMapping("/newLedgerAccountReceivables")
	public ModelAndView newLedgerAccountReceivables(@RequestParam Integer ledger_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("accountreceivable", new AccountReceivable());
		mav.addObject("newFlag", true);
		mav.setViewName("ledger/accountreceivables/editAccountReceivables.jsp");

		return mav;
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping("/deleteLedgerComapny")
	public ModelAndView deleteLedgerComapny(@RequestParam Integer ledger_id, @RequestParam Integer related_comapny_companyId) {
		ModelAndView mav = new ModelAndView();

		Ledger ledger = ledgerService.deleteLedgerComapny(ledger_id, related_comapny_companyId);

		mav.addObject("ledger_id", ledger_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* Delete an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/deleteLedgerAccountPayables")
	public ModelAndView deleteLedgerAccountPayables(@RequestParam Integer ledger_id, @RequestParam Integer related_accountpayables_id) {
		ModelAndView mav = new ModelAndView();

		Ledger ledger = ledgerService.deleteLedgerAccountPayables(ledger_id, related_accountpayables_id);

		mav.addObject("ledger_id", ledger_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* Select the Ledger entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteLedger")
	public ModelAndView confirmDeleteLedger(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(idKey));
		mav.setViewName("ledger/deleteLedger.jsp");

		return mav;
	}

	/**
	* Show all AccountPayable entities by Ledger
	* 
	*/
	@RequestMapping("/listLedgerAccountPayables")
	public ModelAndView listLedgerAccountPayables(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(idKey));
		mav.setViewName("ledger/accountpayables/listAccountPayables.jsp");

		return mav;
	}

	/**
	* Edit an existing AccountReceivable entity
	* 
	*/
	@RequestMapping("/editLedgerAccountReceivables")
	public ModelAndView editLedgerAccountReceivables(@RequestParam Integer ledger_id, @RequestParam Integer accountreceivables_id) {
		AccountReceivable accountreceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivables_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("accountreceivable", accountreceivable);
		mav.setViewName("ledger/accountreceivables/editAccountReceivables.jsp");

		return mav;
	}

	/**
	* Entry point to show all Ledger entities
	* 
	*/
	public String indexLedger() {
		return "redirect:/indexLedger";
	}

	/**
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping("/newLedgerComapny")
	public ModelAndView newLedgerComapny(@RequestParam Integer ledger_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("comapny", new Comapny());
		mav.addObject("newFlag", true);
		mav.setViewName("ledger/comapny/editComapny.jsp");

		return mav;
	}

	/**
	* Select the child AccountPayable entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteLedgerAccountPayables")
	public ModelAndView confirmDeleteLedgerAccountPayables(@RequestParam Integer ledger_id, @RequestParam Integer related_accountpayables_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("accountpayable", accountPayableDAO.findAccountPayableByPrimaryKey(related_accountpayables_id));
		mav.addObject("ledger_id", ledger_id);
		mav.setViewName("ledger/accountpayables/deleteAccountPayables.jsp");

		return mav;
	}

	/**
	* Show all Ledger entities
	* 
	*/
	@RequestMapping("/indexLedger")
	public ModelAndView listLedgers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledgers", ledgerService.loadLedgers());

		mav.setViewName("ledger/listLedgers.jsp");

		return mav;
	}

	/**
	* Save an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/saveLedgerAccountPayables")
	public ModelAndView saveLedgerAccountPayables(@RequestParam Integer ledger_id, @ModelAttribute AccountPayable accountpayables) {
		Ledger parent_ledger = ledgerService.saveLedgerAccountPayables(ledger_id, accountpayables);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("ledger", parent_ledger);
		mav.setViewName("ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* View an existing AccountPayable entity
	* 
	*/
	@RequestMapping("/selectLedgerAccountPayables")
	public ModelAndView selectLedgerAccountPayables(@RequestParam Integer ledger_id, @RequestParam Integer accountpayables_id) {
		AccountPayable accountpayable = accountPayableDAO.findAccountPayableByPrimaryKey(accountpayables_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("accountpayable", accountpayable);
		mav.setViewName("ledger/accountpayables/viewAccountPayables.jsp");

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
	* Delete an existing AccountReceivable entity
	* 
	*/
	@RequestMapping("/deleteLedgerAccountReceivables")
	public ModelAndView deleteLedgerAccountReceivables(@RequestParam Integer ledger_id, @RequestParam Integer related_accountreceivables_id) {
		ModelAndView mav = new ModelAndView();

		Ledger ledger = ledgerService.deleteLedgerAccountReceivables(ledger_id, related_accountreceivables_id);

		mav.addObject("ledger_id", ledger_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("ledger/viewLedger.jsp");

		return mav;
	}

	/**
	* Create a new AccountPayable entity
	* 
	*/
	@RequestMapping("/newLedgerAccountPayables")
	public ModelAndView newLedgerAccountPayables(@RequestParam Integer ledger_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ledger_id", ledger_id);
		mav.addObject("accountpayable", new AccountPayable());
		mav.addObject("newFlag", true);
		mav.setViewName("ledger/accountpayables/editAccountPayables.jsp");

		return mav;
	}

	/**
	* Select the child Comapny entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteLedgerComapny")
	public ModelAndView confirmDeleteLedgerComapny(@RequestParam Integer ledger_id, @RequestParam Integer related_comapny_companyId) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(related_comapny_companyId));
		mav.addObject("ledger_id", ledger_id);
		mav.setViewName("ledger/comapny/deleteComapny.jsp");

		return mav;
	}
}