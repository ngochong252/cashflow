package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.ApprovalDAO;
import com.ttv.cashflow.dao.BankingAccountingDAO;
import com.ttv.cashflow.dao.ComapnyDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import com.ttv.cashflow.service.ComapnyService;

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
 * Spring MVC controller that handles CRUD requests for Comapny entities
 * 
 */

@Controller("ComapnyController")

public class ComapnyController {

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
	 * Delete an existing BankingAccounting entity
	 * 
	 */
	@RequestMapping("/deleteComapnyBankingAccountings")
	public ModelAndView deleteComapnyBankingAccountings(@RequestParam Integer comapny_id, @RequestParam Integer related_bankingaccountings_id) {
		ModelAndView mav = new ModelAndView();

		Comapny comapny = comapnyService.deleteComapnyBankingAccountings(comapny_id, related_bankingaccountings_id);

		mav.addObject("comapny_id", comapny_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Show all BankingAccounting entities by Comapny
	* 
	*/
	@RequestMapping("/listComapnyBankingAccountings")
	public ModelAndView listComapnyBankingAccountings(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(idKey));
		mav.setViewName("comapny/bankingaccountings/listBankingAccountings.jsp");

		return mav;
	}

	/**
	* Edit an existing BankingAccounting entity
	* 
	*/
	@RequestMapping("/editComapnyBankingAccountings")
	public ModelAndView editComapnyBankingAccountings(@RequestParam Integer comapny_id, @RequestParam Integer bankingaccountings_id) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccountings_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("bankingaccounting", bankingaccounting);
		mav.setViewName("comapny/bankingaccountings/editBankingAccountings.jsp");

		return mav;
	}

	/**
	* Select the child Ledger entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteComapnyLedgers")
	public ModelAndView confirmDeleteComapnyLedgers(@RequestParam Integer comapny_id, @RequestParam Integer related_ledgers_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ledger", ledgerDAO.findLedgerByPrimaryKey(related_ledgers_id));
		mav.addObject("comapny_id", comapny_id);
		mav.setViewName("comapny/ledgers/deleteLedgers.jsp");

		return mav;
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping("/saveComapny")
	public String saveComapny(@ModelAttribute Comapny comapny) {
		comapnyService.saveComapny(comapny);
		return "forward:/indexComapny";
	}

	/**
	* Select the child BankingAccounting entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteComapnyBankingAccountings")
	public ModelAndView confirmDeleteComapnyBankingAccountings(@RequestParam Integer comapny_id, @RequestParam Integer related_bankingaccountings_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankingaccounting", bankingAccountingDAO.findBankingAccountingByPrimaryKey(related_bankingaccountings_id));
		mav.addObject("comapny_id", comapny_id);
		mav.setViewName("comapny/bankingaccountings/deleteBankingAccountings.jsp");

		return mav;
	}

	/**
	* Save an existing Ledger entity
	* 
	*/
	@RequestMapping("/saveComapnyLedgers")
	public ModelAndView saveComapnyLedgers(@RequestParam Integer comapny_id, @ModelAttribute Ledger ledgers) {
		Comapny parent_comapny = comapnyService.saveComapnyLedgers(comapny_id, ledgers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("comapny", parent_comapny);
		mav.setViewName("comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Edit an existing Ledger entity
	* 
	*/
	@RequestMapping("/editComapnyLedgers")
	public ModelAndView editComapnyLedgers(@RequestParam Integer comapny_id, @RequestParam Integer ledgers_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledgers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("comapny/ledgers/editLedgers.jsp");

		return mav;
	}

	/**
	* Select the Comapny entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteComapny")
	public ModelAndView confirmDeleteComapny(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(idKey));
		mav.setViewName("comapny/deleteComapny.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/comapnyController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Save an existing Approval entity
	* 
	*/
	@RequestMapping("/saveComapnyApprovals")
	public ModelAndView saveComapnyApprovals(@RequestParam Integer comapny_id, @ModelAttribute Approval approvals) {
		Comapny parent_comapny = comapnyService.saveComapnyApprovals(comapny_id, approvals);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("comapny", parent_comapny);
		mav.setViewName("comapny/viewComapny.jsp");

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
	* View an existing Approval entity
	* 
	*/
	@RequestMapping("/selectComapnyApprovals")
	public ModelAndView selectComapnyApprovals(@RequestParam Integer comapny_id, @RequestParam Integer approvals_id) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(approvals_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("approval", approval);
		mav.setViewName("comapny/approvals/viewApprovals.jsp");

		return mav;
	}

	/**
	* Edit an existing Approval entity
	* 
	*/
	@RequestMapping("/editComapnyApprovals")
	public ModelAndView editComapnyApprovals(@RequestParam Integer comapny_id, @RequestParam Integer approvals_id) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(approvals_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("approval", approval);
		mav.setViewName("comapny/approvals/editApprovals.jsp");

		return mav;
	}

	/**
	* Entry point to show all Comapny entities
	* 
	*/
	public String indexComapny() {
		return "redirect:/indexComapny";
	}

	/**
	* View an existing Ledger entity
	* 
	*/
	@RequestMapping("/selectComapnyLedgers")
	public ModelAndView selectComapnyLedgers(@RequestParam Integer comapny_id, @RequestParam Integer ledgers_id) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledgers_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("ledger", ledger);
		mav.setViewName("comapny/ledgers/viewLedgers.jsp");

		return mav;
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping("/deleteComapny")
	public String deleteComapny(@RequestParam Integer idKey) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(idKey);
		comapnyService.deleteComapny(comapny);
		return "forward:/indexComapny";
	}

	/**
	* Save an existing BankingAccounting entity
	* 
	*/
	@RequestMapping("/saveComapnyBankingAccountings")
	public ModelAndView saveComapnyBankingAccountings(@RequestParam Integer comapny_id, @ModelAttribute BankingAccounting bankingaccountings) {
		Comapny parent_comapny = comapnyService.saveComapnyBankingAccountings(comapny_id, bankingaccountings);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("comapny", parent_comapny);
		mav.setViewName("comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Show all Ledger entities by Comapny
	* 
	*/
	@RequestMapping("/listComapnyLedgers")
	public ModelAndView listComapnyLedgers(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(idKey));
		mav.setViewName("comapny/ledgers/listLedgers.jsp");

		return mav;
	}

	/**
	* Delete an existing Approval entity
	* 
	*/
	@RequestMapping("/deleteComapnyApprovals")
	public ModelAndView deleteComapnyApprovals(@RequestParam Integer comapny_id, @RequestParam Integer related_approvals_id) {
		ModelAndView mav = new ModelAndView();

		Comapny comapny = comapnyService.deleteComapnyApprovals(comapny_id, related_approvals_id);

		mav.addObject("comapny_id", comapny_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Create a new Ledger entity
	* 
	*/
	@RequestMapping("/newComapnyLedgers")
	public ModelAndView newComapnyLedgers(@RequestParam Integer comapny_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("ledger", new Ledger());
		mav.addObject("newFlag", true);
		mav.setViewName("comapny/ledgers/editLedgers.jsp");

		return mav;
	}

	/**
	* Show all Comapny entities
	* 
	*/
	@RequestMapping("/indexComapny")
	public ModelAndView listComapnys() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapnys", comapnyService.loadComapnys());

		mav.setViewName("comapny/listComapnys.jsp");

		return mav;
	}

	/**
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping("/newComapny")
	public ModelAndView newComapny() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", new Comapny());
		mav.addObject("newFlag", true);
		mav.setViewName("comapny/editComapny.jsp");

		return mav;
	}

	/**
	* Delete an existing Ledger entity
	* 
	*/
	@RequestMapping("/deleteComapnyLedgers")
	public ModelAndView deleteComapnyLedgers(@RequestParam Integer comapny_id, @RequestParam Integer related_ledgers_id) {
		ModelAndView mav = new ModelAndView();

		Comapny comapny = comapnyService.deleteComapnyLedgers(comapny_id, related_ledgers_id);

		mav.addObject("comapny_id", comapny_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Edit an existing Comapny entity
	* 
	*/
	@RequestMapping("/editComapny")
	public ModelAndView editComapny(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(idKey));
		mav.setViewName("comapny/editComapny.jsp");

		return mav;
	}

	/**
	* Select the child Approval entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteComapnyApprovals")
	public ModelAndView confirmDeleteComapnyApprovals(@RequestParam Integer comapny_id, @RequestParam Integer related_approvals_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("approval", approvalDAO.findApprovalByPrimaryKey(related_approvals_id));
		mav.addObject("comapny_id", comapny_id);
		mav.setViewName("comapny/approvals/deleteApprovals.jsp");

		return mav;
	}

	/**
	* Select an existing Comapny entity
	* 
	*/
	@RequestMapping("/selectComapny")
	public ModelAndView selectComapny(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(idKey));
		mav.setViewName("comapny/viewComapny.jsp");

		return mav;
	}

	/**
	* Create a new BankingAccounting entity
	* 
	*/
	@RequestMapping("/newComapnyBankingAccountings")
	public ModelAndView newComapnyBankingAccountings(@RequestParam Integer comapny_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("bankingaccounting", new BankingAccounting());
		mav.addObject("newFlag", true);
		mav.setViewName("comapny/bankingaccountings/editBankingAccountings.jsp");

		return mav;
	}

	/**
	* View an existing BankingAccounting entity
	* 
	*/
	@RequestMapping("/selectComapnyBankingAccountings")
	public ModelAndView selectComapnyBankingAccountings(@RequestParam Integer comapny_id, @RequestParam Integer bankingaccountings_id) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccountings_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("bankingaccounting", bankingaccounting);
		mav.setViewName("comapny/bankingaccountings/viewBankingAccountings.jsp");

		return mav;
	}

	/**
	* Show all Approval entities by Comapny
	* 
	*/
	@RequestMapping("/listComapnyApprovals")
	public ModelAndView listComapnyApprovals(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(idKey));
		mav.setViewName("comapny/approvals/listApprovals.jsp");

		return mav;
	}

	/**
	* Create a new Approval entity
	* 
	*/
	@RequestMapping("/newComapnyApprovals")
	public ModelAndView newComapnyApprovals(@RequestParam Integer comapny_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("comapny_id", comapny_id);
		mav.addObject("approval", new Approval());
		mav.addObject("newFlag", true);
		mav.setViewName("comapny/approvals/editApprovals.jsp");

		return mav;
	}
}