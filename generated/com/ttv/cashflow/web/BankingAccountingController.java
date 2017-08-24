package com.ttv.cashflow.web;

import com.ttv.cashflow.dao.BankingAccountingDAO;
import com.ttv.cashflow.dao.ComapnyDAO;

import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;

import com.ttv.cashflow.service.BankingAccountingService;

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
 * Spring MVC controller that handles CRUD requests for BankingAccounting entities
 * 
 */

@Controller("BankingAccountingController")

public class BankingAccountingController {

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
	 * Create a new BankingAccounting entity
	 * 
	 */
	@RequestMapping("/newBankingAccounting")
	public ModelAndView newBankingAccounting() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankingaccounting", new BankingAccounting());
		mav.addObject("newFlag", true);
		mav.setViewName("bankingaccounting/editBankingAccounting.jsp");

		return mav;
	}

	/**
	* Delete an existing Comapny entity
	* 
	*/
	@RequestMapping("/deleteBankingAccountingComapny")
	public ModelAndView deleteBankingAccountingComapny(@RequestParam Integer bankingaccounting_id, @RequestParam Integer related_comapny_id) {
		ModelAndView mav = new ModelAndView();

		BankingAccounting bankingaccounting = bankingAccountingService.deleteBankingAccountingComapny(bankingaccounting_id, related_comapny_id);

		mav.addObject("bankingaccounting_id", bankingaccounting_id);
		mav.addObject("bankingaccounting", bankingaccounting);
		mav.setViewName("bankingaccounting/viewBankingAccounting.jsp");

		return mav;
	}

	/**
	* Show all BankingAccounting entities
	* 
	*/
	@RequestMapping("/indexBankingAccounting")
	public ModelAndView listBankingAccountings() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankingaccountings", bankingAccountingService.loadBankingAccountings());

		mav.setViewName("bankingaccounting/listBankingAccountings.jsp");

		return mav;
	}

	/**
	*/
	@RequestMapping("/bankingaccountingController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	* Select the child Comapny entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteBankingAccountingComapny")
	public ModelAndView confirmDeleteBankingAccountingComapny(@RequestParam Integer bankingaccounting_id, @RequestParam Integer related_comapny_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comapny", comapnyDAO.findComapnyByPrimaryKey(related_comapny_id));
		mav.addObject("bankingaccounting_id", bankingaccounting_id);
		mav.setViewName("bankingaccounting/comapny/deleteComapny.jsp");

		return mav;
	}

	/**
	* Edit an existing BankingAccounting entity
	* 
	*/
	@RequestMapping("/editBankingAccounting")
	public ModelAndView editBankingAccounting(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankingaccounting", bankingAccountingDAO.findBankingAccountingByPrimaryKey(idKey));
		mav.setViewName("bankingaccounting/editBankingAccounting.jsp");

		return mav;
	}

	/**
	* Show all Comapny entities by BankingAccounting
	* 
	*/
	@RequestMapping("/listBankingAccountingComapny")
	public ModelAndView listBankingAccountingComapny(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankingaccounting", bankingAccountingDAO.findBankingAccountingByPrimaryKey(idKey));
		mav.setViewName("bankingaccounting/comapny/listComapny.jsp");

		return mav;
	}

	/**
	* Entry point to show all BankingAccounting entities
	* 
	*/
	public String indexBankingAccounting() {
		return "redirect:/indexBankingAccounting";
	}

	/**
	* View an existing Comapny entity
	* 
	*/
	@RequestMapping("/selectBankingAccountingComapny")
	public ModelAndView selectBankingAccountingComapny(@RequestParam Integer bankingaccounting_id, @RequestParam Integer comapny_id) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bankingaccounting_id", bankingaccounting_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("bankingaccounting/comapny/viewComapny.jsp");

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
	* Select the BankingAccounting entity for display allowing the user to confirm that they would like to delete the entity
	* 
	*/
	@RequestMapping("/confirmDeleteBankingAccounting")
	public ModelAndView confirmDeleteBankingAccounting(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankingaccounting", bankingAccountingDAO.findBankingAccountingByPrimaryKey(idKey));
		mav.setViewName("bankingaccounting/deleteBankingAccounting.jsp");

		return mav;
	}

	/**
	* Create a new Comapny entity
	* 
	*/
	@RequestMapping("/newBankingAccountingComapny")
	public ModelAndView newBankingAccountingComapny(@RequestParam Integer bankingaccounting_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bankingaccounting_id", bankingaccounting_id);
		mav.addObject("comapny", new Comapny());
		mav.addObject("newFlag", true);
		mav.setViewName("bankingaccounting/comapny/editComapny.jsp");

		return mav;
	}

	/**
	* Save an existing BankingAccounting entity
	* 
	*/
	@RequestMapping("/saveBankingAccounting")
	public String saveBankingAccounting(@ModelAttribute BankingAccounting bankingaccounting) {
		bankingAccountingService.saveBankingAccounting(bankingaccounting);
		return "forward:/indexBankingAccounting";
	}

	/**
	* Select an existing BankingAccounting entity
	* 
	*/
	@RequestMapping("/selectBankingAccounting")
	public ModelAndView selectBankingAccounting(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bankingaccounting", bankingAccountingDAO.findBankingAccountingByPrimaryKey(idKey));
		mav.setViewName("bankingaccounting/viewBankingAccounting.jsp");

		return mav;
	}

	/**
	* Delete an existing BankingAccounting entity
	* 
	*/
	@RequestMapping("/deleteBankingAccounting")
	public String deleteBankingAccounting(@RequestParam Integer idKey) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(idKey);
		bankingAccountingService.deleteBankingAccounting(bankingaccounting);
		return "forward:/indexBankingAccounting";
	}

	/**
	* Save an existing Comapny entity
	* 
	*/
	@RequestMapping("/saveBankingAccountingComapny")
	public ModelAndView saveBankingAccountingComapny(@RequestParam Integer bankingaccounting_id, @ModelAttribute Comapny comapny) {
		BankingAccounting parent_bankingaccounting = bankingAccountingService.saveBankingAccountingComapny(bankingaccounting_id, comapny);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bankingaccounting_id", bankingaccounting_id);
		mav.addObject("bankingaccounting", parent_bankingaccounting);
		mav.setViewName("bankingaccounting/viewBankingAccounting.jsp");

		return mav;
	}

	/**
	* Edit an existing Comapny entity
	* 
	*/
	@RequestMapping("/editBankingAccountingComapny")
	public ModelAndView editBankingAccountingComapny(@RequestParam Integer bankingaccounting_id, @RequestParam Integer comapny_id) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bankingaccounting_id", bankingaccounting_id);
		mav.addObject("comapny", comapny);
		mav.setViewName("bankingaccounting/comapny/editComapny.jsp");

		return mav;
	}
}