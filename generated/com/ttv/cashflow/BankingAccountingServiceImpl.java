package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.BankingAccountingDAO;
import com.ttv.cashflow.dao.ComapnyDAO;

import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for BankingAccounting entities
 * 
 */

@Service("BankingAccountingService")

@Transactional
public class BankingAccountingServiceImpl implements BankingAccountingService {

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
	 * Instantiates a new BankingAccountingServiceImpl.
	 *
	 */
	public BankingAccountingServiceImpl() {
	}

	/**
	 */
	@Transactional
	public BankingAccounting findBankingAccountingByPrimaryKey(Integer id) {
		return bankingAccountingDAO.findBankingAccountingByPrimaryKey(id);
	}

	/**
	 * Return all BankingAccounting entity
	 * 
	 */
	@Transactional
	public List<BankingAccounting> findAllBankingAccountings(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<BankingAccounting>(bankingAccountingDAO.findAllBankingAccountings(startResult, maxRows));
	}

	/**
	 * Delete an existing BankingAccounting entity
	 * 
	 */
	@Transactional
	public void deleteBankingAccounting(BankingAccounting bankingaccounting) {
		bankingAccountingDAO.remove(bankingaccounting);
		bankingAccountingDAO.flush();
	}

	/**
	 * Load an existing BankingAccounting entity
	 * 
	 */
	@Transactional
	public Set<BankingAccounting> loadBankingAccountings() {
		return bankingAccountingDAO.findAllBankingAccountings();
	}

	/**
	 * Return a count of all BankingAccounting entity
	 * 
	 */
	@Transactional
	public Integer countBankingAccountings() {
		return ((Long) bankingAccountingDAO.createQuerySingleResult("select count(o) from BankingAccounting o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Comapny entity
	 * 
	 */
	@Transactional
	public BankingAccounting saveBankingAccountingComapny(Integer id, Comapny related_comapny) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(id, -1, -1);
		Comapny existingcomapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcomapny != null) {
			existingcomapny.setId(related_comapny.getId());
			existingcomapny.setCode(related_comapny.getCode());
			existingcomapny.setName(related_comapny.getName());
			existingcomapny.setDescription(related_comapny.getDescription());
			existingcomapny.setCreatedDate(related_comapny.getCreatedDate());
			existingcomapny.setModifiedDate(related_comapny.getModifiedDate());
			existingcomapny.setIsActive(related_comapny.getIsActive());
			related_comapny = existingcomapny;
		}

		bankingaccounting.setComapny(related_comapny);
		related_comapny.getBankingAccountings().add(bankingaccounting);
		bankingaccounting = bankingAccountingDAO.store(bankingaccounting);
		bankingAccountingDAO.flush();

		related_comapny = comapnyDAO.store(related_comapny);
		comapnyDAO.flush();

		return bankingaccounting;
	}

	/**
	 * Delete an existing Comapny entity
	 * 
	 */
	@Transactional
	public BankingAccounting deleteBankingAccountingComapny(Integer bankingaccounting_id, Integer related_comapny_id) {
		BankingAccounting bankingaccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting_id, -1, -1);
		Comapny related_comapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny_id, -1, -1);

		bankingaccounting.setComapny(null);
		related_comapny.getBankingAccountings().remove(bankingaccounting);
		bankingaccounting = bankingAccountingDAO.store(bankingaccounting);
		bankingAccountingDAO.flush();

		related_comapny = comapnyDAO.store(related_comapny);
		comapnyDAO.flush();

		comapnyDAO.remove(related_comapny);
		comapnyDAO.flush();

		return bankingaccounting;
	}

	/**
	 * Save an existing BankingAccounting entity
	 * 
	 */
	@Transactional
	public void saveBankingAccounting(BankingAccounting bankingaccounting) {
		BankingAccounting existingBankingAccounting = bankingAccountingDAO.findBankingAccountingByPrimaryKey(bankingaccounting.getId());

		if (existingBankingAccounting != null) {
			if (existingBankingAccounting != bankingaccounting) {
				existingBankingAccounting.setId(bankingaccounting.getId());
				existingBankingAccounting.setTransactionDate(bankingaccounting.getTransactionDate());
				existingBankingAccounting.setInOriginalCurrency(bankingaccounting.getInOriginalCurrency());
				existingBankingAccounting.setOutOriginalCurrency(bankingaccounting.getOutOriginalCurrency());
				existingBankingAccounting.setBalanceOriginalCurrency(bankingaccounting.getBalanceOriginalCurrency());
				existingBankingAccounting.setInVnd(bankingaccounting.getInVnd());
				existingBankingAccounting.setOutVnd(bankingaccounting.getOutVnd());
				existingBankingAccounting.setBalanceVnd(bankingaccounting.getBalanceVnd());
				existingBankingAccounting.setDescription(bankingaccounting.getDescription());
				existingBankingAccounting.setCorrespondingAccName(bankingaccounting.getCorrespondingAccName());
				existingBankingAccounting.setVoucherNo(bankingaccounting.getVoucherNo());
				existingBankingAccounting.setAppovalCode(bankingaccounting.getAppovalCode());
				existingBankingAccounting.setVoucherDate(bankingaccounting.getVoucherDate());
				existingBankingAccounting.setVendorName(bankingaccounting.getVendorName());
				existingBankingAccounting.setBankRef(bankingaccounting.getBankRef());
				existingBankingAccounting.setCorrespondingAccNo(bankingaccounting.getCorrespondingAccNo());
				existingBankingAccounting.setCreatedDate(bankingaccounting.getCreatedDate());
				existingBankingAccounting.setModifiedDate(bankingaccounting.getModifiedDate());
				existingBankingAccounting.setValidCode(bankingaccounting.getValidCode());
				existingBankingAccounting.setFilePath(bankingaccounting.getFilePath());
			}
			bankingaccounting = bankingAccountingDAO.store(existingBankingAccounting);
		} else {
			bankingaccounting = bankingAccountingDAO.store(bankingaccounting);
		}
		bankingAccountingDAO.flush();
	}
}
