package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.AccountPayableDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for AccountPayable entities
 * 
 */

@Service("AccountPayableService")

@Transactional
public class AccountPayableServiceImpl implements AccountPayableService {

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
	 * Instantiates a new AccountPayableServiceImpl.
	 *
	 */
	public AccountPayableServiceImpl() {
	}

	/**
	 * Save an existing Ledger entity
	 * 
	 */
	@Transactional
	public AccountPayable saveAccountPayableLedger(Integer id, Ledger related_ledger) {
		AccountPayable accountpayable = accountPayableDAO.findAccountPayableByPrimaryKey(id, -1, -1);
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

		accountpayable.setLedger(related_ledger);
		related_ledger.getAccountPayables().add(accountpayable);
		accountpayable = accountPayableDAO.store(accountpayable);
		accountPayableDAO.flush();

		related_ledger = ledgerDAO.store(related_ledger);
		ledgerDAO.flush();

		return accountpayable;
	}

	/**
	 * Save an existing AccountPayable entity
	 * 
	 */
	@Transactional
	public void saveAccountPayable(AccountPayable accountpayable) {
		AccountPayable existingAccountPayable = accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable.getId());

		if (existingAccountPayable != null) {
			if (existingAccountPayable != accountpayable) {
				existingAccountPayable.setId(accountpayable.getId());
				existingAccountPayable.setInpt(accountpayable.getInpt());
				existingAccountPayable.setVoucherNo(accountpayable.getVoucherNo());
				existingAccountPayable.setPoNo(accountpayable.getPoNo());
				existingAccountPayable.setMonth(accountpayable.getMonth());
				existingAccountPayable.setVendorName(accountpayable.getVendorName());
				existingAccountPayable.setVendorType(accountpayable.getVendorType());
				existingAccountPayable.setClaimType(accountpayable.getClaimType());
				existingAccountPayable.setInvoiceNo(accountpayable.getInvoiceNo());
				existingAccountPayable.setCorrespondingAccName(accountpayable.getCorrespondingAccName());
				existingAccountPayable.setCorrespondingAccNo(accountpayable.getCorrespondingAccNo());
				existingAccountPayable.setCorrespondingAccType(accountpayable.getCorrespondingAccType());
				existingAccountPayable.setClass_(accountpayable.getClass_());
				existingAccountPayable.setClassCode(accountpayable.getClassCode());
				existingAccountPayable.setDescription(accountpayable.getDescription());
				existingAccountPayable.setOriginalCurrency(accountpayable.getOriginalCurrency());
				existingAccountPayable.setVatType(accountpayable.getVatType());
				existingAccountPayable.setExcludeGstAmount(accountpayable.getExcludeGstAmount());
				existingAccountPayable.setGst(accountpayable.getGst());
				existingAccountPayable.setIncludeGstAmount(accountpayable.getIncludeGstAmount());
				existingAccountPayable.setInvExRate(accountpayable.getInvExRate());
				existingAccountPayable.setInvVndAmount(accountpayable.getInvVndAmount());
				existingAccountPayable.setPvNo(accountpayable.getPvNo());
				existingAccountPayable.setBankRef(accountpayable.getBankRef());
				existingAccountPayable.setPaidDate(accountpayable.getPaidDate());
				existingAccountPayable.setPaidOriginalCurrencyAmount(accountpayable.getPaidOriginalCurrencyAmount());
				existingAccountPayable.setPaidExRate(accountpayable.getPaidExRate());
				existingAccountPayable.setPaidVnAmount(accountpayable.getPaidVnAmount());
				existingAccountPayable.setFxLossGain(accountpayable.getFxLossGain());
				existingAccountPayable.setRemainVn(accountpayable.getRemainVn());
				existingAccountPayable.setApprovalCode(accountpayable.getApprovalCode());
				existingAccountPayable.setSettlementVoucherNo(accountpayable.getSettlementVoucherNo());
				existingAccountPayable.setCreatedDate(accountpayable.getCreatedDate());
				existingAccountPayable.setModifiedDate(accountpayable.getModifiedDate());
				existingAccountPayable.setValidCode(accountpayable.getValidCode());
				existingAccountPayable.setFilePath(accountpayable.getFilePath());
			}
			accountpayable = accountPayableDAO.store(existingAccountPayable);
		} else {
			accountpayable = accountPayableDAO.store(accountpayable);
		}
		accountPayableDAO.flush();
	}

	/**
	 * Return a count of all AccountPayable entity
	 * 
	 */
	@Transactional
	public Integer countAccountPayables() {
		return ((Long) accountPayableDAO.createQuerySingleResult("select count(o) from AccountPayable o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public AccountPayable findAccountPayableByPrimaryKey(Integer id) {
		return accountPayableDAO.findAccountPayableByPrimaryKey(id);
	}

	/**
	 * Load an existing AccountPayable entity
	 * 
	 */
	@Transactional
	public Set<AccountPayable> loadAccountPayables() {
		return accountPayableDAO.findAllAccountPayables();
	}

	/**
	 * Return all AccountPayable entity
	 * 
	 */
	@Transactional
	public List<AccountPayable> findAllAccountPayables(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<AccountPayable>(accountPayableDAO.findAllAccountPayables(startResult, maxRows));
	}

	/**
	 * Delete an existing AccountPayable entity
	 * 
	 */
	@Transactional
	public void deleteAccountPayable(AccountPayable accountpayable) {
		accountPayableDAO.remove(accountpayable);
		accountPayableDAO.flush();
	}

	/**
	 * Delete an existing Ledger entity
	 * 
	 */
	@Transactional
	public AccountPayable deleteAccountPayableLedger(Integer accountpayable_id, Integer related_ledger_id) {
		AccountPayable accountpayable = accountPayableDAO.findAccountPayableByPrimaryKey(accountpayable_id, -1, -1);
		Ledger related_ledger = ledgerDAO.findLedgerByPrimaryKey(related_ledger_id, -1, -1);

		accountpayable.setLedger(null);
		related_ledger.getAccountPayables().remove(accountpayable);
		accountpayable = accountPayableDAO.store(accountpayable);
		accountPayableDAO.flush();

		related_ledger = ledgerDAO.store(related_ledger);
		ledgerDAO.flush();

		ledgerDAO.remove(related_ledger);
		ledgerDAO.flush();

		return accountpayable;
	}
}
