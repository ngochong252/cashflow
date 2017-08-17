package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.AccountReceivableDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for AccountReceivable entities
 * 
 */

@Service("AccountReceivableService")

@Transactional
public class AccountReceivableServiceImpl implements AccountReceivableService {

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
	 * Instantiates a new AccountReceivableServiceImpl.
	 *
	 */
	public AccountReceivableServiceImpl() {
	}

	/**
	 * Load an existing AccountReceivable entity
	 * 
	 */
	@Transactional
	public Set<AccountReceivable> loadAccountReceivables() {
		return accountReceivableDAO.findAllAccountReceivables();
	}

	/**
	 * Save an existing AccountReceivable entity
	 * 
	 */
	@Transactional
	public void saveAccountReceivable(AccountReceivable accountreceivable) {
		AccountReceivable existingAccountReceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable.getId());

		if (existingAccountReceivable != null) {
			if (existingAccountReceivable != accountreceivable) {
				existingAccountReceivable.setId(accountreceivable.getId());
				existingAccountReceivable.setInpt(accountreceivable.getInpt());
				existingAccountReceivable.setMonth(accountreceivable.getMonth());
				existingAccountReceivable.setCustomerName(accountreceivable.getCustomerName());
				existingAccountReceivable.setInvoiceNo(accountreceivable.getInvoiceNo());
				existingAccountReceivable.setContractNo(accountreceivable.getContractNo());
				existingAccountReceivable.setOriginalCurrency(accountreceivable.getOriginalCurrency());
				existingAccountReceivable.setVatType(accountreceivable.getVatType());
				existingAccountReceivable.setExcludeGstAmount(accountreceivable.getExcludeGstAmount());
				existingAccountReceivable.setGst(accountreceivable.getGst());
				existingAccountReceivable.setIncludeGstAmount(accountreceivable.getIncludeGstAmount());
				existingAccountReceivable.setInvExRate(accountreceivable.getInvExRate());
				existingAccountReceivable.setInvVndAmount(accountreceivable.getInvVndAmount());
				existingAccountReceivable.setCorrespodingAccName(accountreceivable.getCorrespodingAccName());
				existingAccountReceivable.setClassCode(accountreceivable.getClassCode());
				existingAccountReceivable.setVoucherNo(accountreceivable.getVoucherNo());
				existingAccountReceivable.setReceiptDate(accountreceivable.getReceiptDate());
				existingAccountReceivable.setReceiptOriginalCurrencyAmount(accountreceivable.getReceiptOriginalCurrencyAmount());
				existingAccountReceivable.setReceiptExRate(accountreceivable.getReceiptExRate());
				existingAccountReceivable.setReceiptVndAmount(accountreceivable.getReceiptVndAmount());
				existingAccountReceivable.setFxLossGain(accountreceivable.getFxLossGain());
				existingAccountReceivable.setRemainVn(accountreceivable.getRemainVn());
				existingAccountReceivable.setCorrespondingAccNo(accountreceivable.getCorrespondingAccNo());
				existingAccountReceivable.setDescription(accountreceivable.getDescription());
				existingAccountReceivable.setCreatedDate(accountreceivable.getCreatedDate());
				existingAccountReceivable.setModifiedDate(accountreceivable.getModifiedDate());
				existingAccountReceivable.setValidCode(accountreceivable.getValidCode());
				existingAccountReceivable.setFilePath(accountreceivable.getFilePath());
			}
			accountreceivable = accountReceivableDAO.store(existingAccountReceivable);
		} else {
			accountreceivable = accountReceivableDAO.store(accountreceivable);
		}
		accountReceivableDAO.flush();
	}

	/**
	 * Return all AccountReceivable entity
	 * 
	 */
	@Transactional
	public List<AccountReceivable> findAllAccountReceivables(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<AccountReceivable>(accountReceivableDAO.findAllAccountReceivables(startResult, maxRows));
	}

	/**
	 * Return a count of all AccountReceivable entity
	 * 
	 */
	@Transactional
	public Integer countAccountReceivables() {
		return ((Long) accountReceivableDAO.createQuerySingleResult("select count(o) from AccountReceivable o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Ledger entity
	 * 
	 */
	@Transactional
	public AccountReceivable saveAccountReceivableLedger(Integer id, Ledger related_ledger) {
		AccountReceivable accountreceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(id, -1, -1);
		Ledger existingledger = ledgerDAO.findLedgerByPrimaryKey(related_ledger.getId());

		// copy into the existing record to preserve existing relationships
		if (existingledger != null) {
			existingledger.setId(related_ledger.getId());
			existingledger.setIssuedDate(related_ledger.getIssuedDate());
			existingledger.setAmount(related_ledger.getAmount());
			existingledger.setValidCode(related_ledger.getValidCode());
			existingledger.setType(related_ledger.getType());
			existingledger.setFilePath(related_ledger.getFilePath());
			existingledger.setCreatedDate(related_ledger.getCreatedDate());
			existingledger.setModifiedDate(related_ledger.getModifiedDate());
			related_ledger = existingledger;
		} else {
			related_ledger = ledgerDAO.store(related_ledger);
			ledgerDAO.flush();
		}

		accountreceivable.setLedger(related_ledger);
		related_ledger.getAccountReceivables().add(accountreceivable);
		accountreceivable = accountReceivableDAO.store(accountreceivable);
		accountReceivableDAO.flush();

		related_ledger = ledgerDAO.store(related_ledger);
		ledgerDAO.flush();

		return accountreceivable;
	}

	/**
	 * Delete an existing AccountReceivable entity
	 * 
	 */
	@Transactional
	public void deleteAccountReceivable(AccountReceivable accountreceivable) {
		accountReceivableDAO.remove(accountreceivable);
		accountReceivableDAO.flush();
	}

	/**
	 */
	@Transactional
	public AccountReceivable findAccountReceivableByPrimaryKey(Integer id) {
		return accountReceivableDAO.findAccountReceivableByPrimaryKey(id);
	}

	/**
	 * Delete an existing Ledger entity
	 * 
	 */
	@Transactional
	public AccountReceivable deleteAccountReceivableLedger(Integer accountreceivable_id, Integer related_ledger_id) {
		AccountReceivable accountreceivable = accountReceivableDAO.findAccountReceivableByPrimaryKey(accountreceivable_id, -1, -1);
		Ledger related_ledger = ledgerDAO.findLedgerByPrimaryKey(related_ledger_id, -1, -1);

		accountreceivable.setLedger(null);
		related_ledger.getAccountReceivables().remove(accountreceivable);
		accountreceivable = accountReceivableDAO.store(accountreceivable);
		accountReceivableDAO.flush();

		related_ledger = ledgerDAO.store(related_ledger);
		ledgerDAO.flush();

		ledgerDAO.remove(related_ledger);
		ledgerDAO.flush();

		return accountreceivable;
	}
}
