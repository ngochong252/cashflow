package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.AccountPayableDAO;
import com.ttv.cashflow.dao.AccountReceivableDAO;
import com.ttv.cashflow.dao.ComapnyDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Ledger entities
 * 
 */

@Service("LedgerService")

@Transactional
public class LedgerServiceImpl implements LedgerService {

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
	 * Instantiates a new LedgerServiceImpl.
	 *
	 */
	public LedgerServiceImpl() {
	}

	/**
	 * Save an existing AccountPayable entity
	 * 
	 */
	@Transactional
	public Ledger saveLedgerAccountPayables(Integer id, AccountPayable related_accountpayables) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(id, -1, -1);
		AccountPayable existingaccountPayables = accountPayableDAO.findAccountPayableByPrimaryKey(related_accountpayables.getId());

		// copy into the existing record to preserve existing relationships
		if (existingaccountPayables != null) {
			existingaccountPayables.setId(related_accountpayables.getId());
			existingaccountPayables.setInpt(related_accountpayables.getInpt());
			existingaccountPayables.setVoucherNo(related_accountpayables.getVoucherNo());
			existingaccountPayables.setPoNo(related_accountpayables.getPoNo());
			existingaccountPayables.setMonth(related_accountpayables.getMonth());
			existingaccountPayables.setVendorName(related_accountpayables.getVendorName());
			existingaccountPayables.setVendorType(related_accountpayables.getVendorType());
			existingaccountPayables.setClaimType(related_accountpayables.getClaimType());
			existingaccountPayables.setInvoiceNo(related_accountpayables.getInvoiceNo());
			existingaccountPayables.setCorrespondingAccName(related_accountpayables.getCorrespondingAccName());
			existingaccountPayables.setCorrespondingAccNo(related_accountpayables.getCorrespondingAccNo());
			existingaccountPayables.setCorrespondingAccType(related_accountpayables.getCorrespondingAccType());
			existingaccountPayables.setClass_(related_accountpayables.getClass_());
			existingaccountPayables.setClassCode(related_accountpayables.getClassCode());
			existingaccountPayables.setDescription(related_accountpayables.getDescription());
			existingaccountPayables.setOriginalCurrency(related_accountpayables.getOriginalCurrency());
			existingaccountPayables.setVatType(related_accountpayables.getVatType());
			existingaccountPayables.setExcludeGstAmount(related_accountpayables.getExcludeGstAmount());
			existingaccountPayables.setGst(related_accountpayables.getGst());
			existingaccountPayables.setIncludeGstAmount(related_accountpayables.getIncludeGstAmount());
			existingaccountPayables.setInvExRate(related_accountpayables.getInvExRate());
			existingaccountPayables.setInvVndAmount(related_accountpayables.getInvVndAmount());
			existingaccountPayables.setPvNo(related_accountpayables.getPvNo());
			existingaccountPayables.setBankRef(related_accountpayables.getBankRef());
			existingaccountPayables.setPaidDate(related_accountpayables.getPaidDate());
			existingaccountPayables.setPaidOriginalCurrencyAmount(related_accountpayables.getPaidOriginalCurrencyAmount());
			existingaccountPayables.setPaidExRate(related_accountpayables.getPaidExRate());
			existingaccountPayables.setPaidVnAmount(related_accountpayables.getPaidVnAmount());
			existingaccountPayables.setFxLossGain(related_accountpayables.getFxLossGain());
			existingaccountPayables.setRemainVn(related_accountpayables.getRemainVn());
			existingaccountPayables.setApprovalCode(related_accountpayables.getApprovalCode());
			existingaccountPayables.setSettlementVoucherNo(related_accountpayables.getSettlementVoucherNo());
			existingaccountPayables.setCreatedDate(related_accountpayables.getCreatedDate());
			existingaccountPayables.setModifiedDate(related_accountpayables.getModifiedDate());
			existingaccountPayables.setValidCode(related_accountpayables.getValidCode());
			existingaccountPayables.setFilePath(related_accountpayables.getFilePath());
			related_accountpayables = existingaccountPayables;
		} else {
			related_accountpayables = accountPayableDAO.store(related_accountpayables);
			accountPayableDAO.flush();
		}

		related_accountpayables.setLedger(ledger);
		ledger.getAccountPayables().add(related_accountpayables);
		related_accountpayables = accountPayableDAO.store(related_accountpayables);
		accountPayableDAO.flush();

		ledger = ledgerDAO.store(ledger);
		ledgerDAO.flush();

		return ledger;
	}

	/**
	 * Return all Ledger entity
	 * 
	 */
	@Transactional
	public List<Ledger> findAllLedgers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Ledger>(ledgerDAO.findAllLedgers(startResult, maxRows));
	}

	/**
	 * Delete an existing AccountReceivable entity
	 * 
	 */
	@Transactional
	public Ledger deleteLedgerAccountReceivables(Integer ledger_id, Integer related_accountreceivables_id) {
		AccountReceivable related_accountreceivables = accountReceivableDAO.findAccountReceivableByPrimaryKey(related_accountreceivables_id, -1, -1);

		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id, -1, -1);

		related_accountreceivables.setLedger(null);
		ledger.getAccountReceivables().remove(related_accountreceivables);

		accountReceivableDAO.remove(related_accountreceivables);
		accountReceivableDAO.flush();

		return ledger;
	}

	/**
	 * Delete an existing Ledger entity
	 * 
	 */
	@Transactional
	public void deleteLedger(Ledger ledger) {
		ledgerDAO.remove(ledger);
		ledgerDAO.flush();
	}

	/**
	 * Delete an existing Comapny entity
	 * 
	 */
	@Transactional
	public Ledger deleteLedgerComapny(Integer ledger_id, Integer related_comapny_companyId) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id, -1, -1);
		Comapny related_comapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny_companyId, -1, -1);

		ledger.setComapny(null);
		related_comapny.getLedgers().remove(ledger);
		ledger = ledgerDAO.store(ledger);
		ledgerDAO.flush();

		related_comapny = comapnyDAO.store(related_comapny);
		comapnyDAO.flush();

		comapnyDAO.remove(related_comapny);
		comapnyDAO.flush();

		return ledger;
	}

	/**
	 * Load an existing Ledger entity
	 * 
	 */
	@Transactional
	public Set<Ledger> loadLedgers() {
		return ledgerDAO.findAllLedgers();
	}

	/**
	 * Save an existing AccountReceivable entity
	 * 
	 */
	@Transactional
	public Ledger saveLedgerAccountReceivables(Integer id, AccountReceivable related_accountreceivables) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(id, -1, -1);
		AccountReceivable existingaccountReceivables = accountReceivableDAO.findAccountReceivableByPrimaryKey(related_accountreceivables.getId());

		// copy into the existing record to preserve existing relationships
		if (existingaccountReceivables != null) {
			existingaccountReceivables.setId(related_accountreceivables.getId());
			existingaccountReceivables.setInpt(related_accountreceivables.getInpt());
			existingaccountReceivables.setMonth(related_accountreceivables.getMonth());
			existingaccountReceivables.setCustomerName(related_accountreceivables.getCustomerName());
			existingaccountReceivables.setInvoiceNo(related_accountreceivables.getInvoiceNo());
			existingaccountReceivables.setContractNo(related_accountreceivables.getContractNo());
			existingaccountReceivables.setOriginalCurrency(related_accountreceivables.getOriginalCurrency());
			existingaccountReceivables.setVatType(related_accountreceivables.getVatType());
			existingaccountReceivables.setExcludeGstAmount(related_accountreceivables.getExcludeGstAmount());
			existingaccountReceivables.setGst(related_accountreceivables.getGst());
			existingaccountReceivables.setIncludeGstAmount(related_accountreceivables.getIncludeGstAmount());
			existingaccountReceivables.setInvExRate(related_accountreceivables.getInvExRate());
			existingaccountReceivables.setInvVndAmount(related_accountreceivables.getInvVndAmount());
			existingaccountReceivables.setCorrespodingAccName(related_accountreceivables.getCorrespodingAccName());
			existingaccountReceivables.setClassCode(related_accountreceivables.getClassCode());
			existingaccountReceivables.setVoucherNo(related_accountreceivables.getVoucherNo());
			existingaccountReceivables.setReceiptDate(related_accountreceivables.getReceiptDate());
			existingaccountReceivables.setReceiptOriginalCurrencyAmount(related_accountreceivables.getReceiptOriginalCurrencyAmount());
			existingaccountReceivables.setReceiptExRate(related_accountreceivables.getReceiptExRate());
			existingaccountReceivables.setReceiptVndAmount(related_accountreceivables.getReceiptVndAmount());
			existingaccountReceivables.setFxLossGain(related_accountreceivables.getFxLossGain());
			existingaccountReceivables.setRemainVn(related_accountreceivables.getRemainVn());
			existingaccountReceivables.setCorrespondingAccNo(related_accountreceivables.getCorrespondingAccNo());
			existingaccountReceivables.setDescription(related_accountreceivables.getDescription());
			existingaccountReceivables.setCreatedDate(related_accountreceivables.getCreatedDate());
			existingaccountReceivables.setModifiedDate(related_accountreceivables.getModifiedDate());
			existingaccountReceivables.setValidCode(related_accountreceivables.getValidCode());
			existingaccountReceivables.setFilePath(related_accountreceivables.getFilePath());
			related_accountreceivables = existingaccountReceivables;
		} else {
			related_accountreceivables = accountReceivableDAO.store(related_accountreceivables);
			accountReceivableDAO.flush();
		}

		related_accountreceivables.setLedger(ledger);
		ledger.getAccountReceivables().add(related_accountreceivables);
		related_accountreceivables = accountReceivableDAO.store(related_accountreceivables);
		accountReceivableDAO.flush();

		ledger = ledgerDAO.store(ledger);
		ledgerDAO.flush();

		return ledger;
	}

	/**
	 * Return a count of all Ledger entity
	 * 
	 */
	@Transactional
	public Integer countLedgers() {
		return ((Long) ledgerDAO.createQuerySingleResult("select count(o) from Ledger o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Ledger entity
	 * 
	 */
	@Transactional
	public void saveLedger(Ledger ledger) {
		Ledger existingLedger = ledgerDAO.findLedgerByPrimaryKey(ledger.getId());

		if (existingLedger != null) {
			if (existingLedger != ledger) {
				existingLedger.setId(ledger.getId());
				existingLedger.setIssuedDate(ledger.getIssuedDate());
				existingLedger.setAmount(ledger.getAmount());
				existingLedger.setValidCode(ledger.getValidCode());
				existingLedger.setType(ledger.getType());
				existingLedger.setFilePath(ledger.getFilePath());
				existingLedger.setCreatedDate(ledger.getCreatedDate());
				existingLedger.setModifiedDate(ledger.getModifiedDate());
			}
			ledger = ledgerDAO.store(existingLedger);
		} else {
			ledger = ledgerDAO.store(ledger);
		}
		ledgerDAO.flush();
	}

	/**
	 */
	@Transactional
	public Ledger findLedgerByPrimaryKey(Integer id) {
		return ledgerDAO.findLedgerByPrimaryKey(id);
	}

	/**
	 * Save an existing Comapny entity
	 * 
	 */
	@Transactional
	public Ledger saveLedgerComapny(Integer id, Comapny related_comapny) {
		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(id, -1, -1);
		Comapny existingcomapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny.getCompanyId());

		// copy into the existing record to preserve existing relationships
		if (existingcomapny != null) {
			existingcomapny.setCompanyId(related_comapny.getCompanyId());
			existingcomapny.setCode(related_comapny.getCode());
			existingcomapny.setName(related_comapny.getName());
			existingcomapny.setDescription(related_comapny.getDescription());
			existingcomapny.setCreatedDate(related_comapny.getCreatedDate());
			existingcomapny.setModifiedDate(related_comapny.getModifiedDate());
			existingcomapny.setIsActive(related_comapny.getIsActive());
			related_comapny = existingcomapny;
		} else {
			related_comapny = comapnyDAO.store(related_comapny);
			comapnyDAO.flush();
		}

		ledger.setComapny(related_comapny);
		related_comapny.getLedgers().add(ledger);
		ledger = ledgerDAO.store(ledger);
		ledgerDAO.flush();

		related_comapny = comapnyDAO.store(related_comapny);
		comapnyDAO.flush();

		return ledger;
	}

	/**
	 * Delete an existing AccountPayable entity
	 * 
	 */
	@Transactional
	public Ledger deleteLedgerAccountPayables(Integer ledger_id, Integer related_accountpayables_id) {
		AccountPayable related_accountpayables = accountPayableDAO.findAccountPayableByPrimaryKey(related_accountpayables_id, -1, -1);

		Ledger ledger = ledgerDAO.findLedgerByPrimaryKey(ledger_id, -1, -1);

		related_accountpayables.setLedger(null);
		ledger.getAccountPayables().remove(related_accountpayables);

		accountPayableDAO.remove(related_accountpayables);
		accountPayableDAO.flush();

		return ledger;
	}
}
