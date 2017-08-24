package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.ApprovalDAO;
import com.ttv.cashflow.dao.BankingAccountingDAO;
import com.ttv.cashflow.dao.ComapnyDAO;
import com.ttv.cashflow.dao.LedgerDAO;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Comapny entities
 * 
 */

@Service("ComapnyService")

@Transactional
public class ComapnyServiceImpl implements ComapnyService {

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
	 * Instantiates a new ComapnyServiceImpl.
	 *
	 */
	public ComapnyServiceImpl() {
	}

	/**
	 * Save an existing Ledger entity
	 * 
	 */
	@Transactional
	public Comapny saveComapnyLedgers(Integer id, Ledger related_ledgers) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(id, -1, -1);
		Ledger existingledgers = ledgerDAO.findLedgerByPrimaryKey(related_ledgers.getId());

		// copy into the existing record to preserve existing relationships
		if (existingledgers != null) {
			existingledgers.setId(related_ledgers.getId());
			existingledgers.setIssuedDate(related_ledgers.getIssuedDate());
			existingledgers.setAmount(related_ledgers.getAmount());
			existingledgers.setDescription(related_ledgers.getDescription());
			existingledgers.setValidCode(related_ledgers.getValidCode());
			existingledgers.setType(related_ledgers.getType());
			existingledgers.setFilePath(related_ledgers.getFilePath());
			existingledgers.setCreatedDate(related_ledgers.getCreatedDate());
			existingledgers.setModifiedDate(related_ledgers.getModifiedDate());
			related_ledgers = existingledgers;
		} else {
			related_ledgers = ledgerDAO.store(related_ledgers);
			ledgerDAO.flush();
		}

		related_ledgers.setComapny(comapny);
		comapny.getLedgers().add(related_ledgers);
		related_ledgers = ledgerDAO.store(related_ledgers);
		ledgerDAO.flush();

		comapny = comapnyDAO.store(comapny);
		comapnyDAO.flush();

		return comapny;
	}

	/**
	 * Return a count of all Comapny entity
	 * 
	 */
	@Transactional
	public Integer countComapnys() {
		return ((Long) comapnyDAO.createQuerySingleResult("select count(o) from Comapny o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Comapny entity
	 * 
	 */
	@Transactional
	public Set<Comapny> loadComapnys() {
		return comapnyDAO.findAllComapnys();
	}

	/**
	 * Delete an existing Comapny entity
	 * 
	 */
	@Transactional
	public void deleteComapny(Comapny comapny) {
		comapnyDAO.remove(comapny);
		comapnyDAO.flush();
	}

	/**
	 * Save an existing BankingAccounting entity
	 * 
	 */
	@Transactional
	public Comapny saveComapnyBankingAccountings(Integer id, BankingAccounting related_bankingaccountings) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(id, -1, -1);
		BankingAccounting existingbankingAccountings = bankingAccountingDAO.findBankingAccountingByPrimaryKey(related_bankingaccountings.getId());

		// copy into the existing record to preserve existing relationships
		if (existingbankingAccountings != null) {
			existingbankingAccountings.setId(related_bankingaccountings.getId());
			existingbankingAccountings.setTransactionDate(related_bankingaccountings.getTransactionDate());
			existingbankingAccountings.setInOriginalCurrency(related_bankingaccountings.getInOriginalCurrency());
			existingbankingAccountings.setOutOriginalCurrency(related_bankingaccountings.getOutOriginalCurrency());
			existingbankingAccountings.setBalanceOriginalCurrency(related_bankingaccountings.getBalanceOriginalCurrency());
			existingbankingAccountings.setInVnd(related_bankingaccountings.getInVnd());
			existingbankingAccountings.setOutVnd(related_bankingaccountings.getOutVnd());
			existingbankingAccountings.setBalanceVnd(related_bankingaccountings.getBalanceVnd());
			existingbankingAccountings.setDescription(related_bankingaccountings.getDescription());
			existingbankingAccountings.setCorrespondingAccName(related_bankingaccountings.getCorrespondingAccName());
			existingbankingAccountings.setVoucherNo(related_bankingaccountings.getVoucherNo());
			existingbankingAccountings.setAppovalCode(related_bankingaccountings.getAppovalCode());
			existingbankingAccountings.setVoucherDate(related_bankingaccountings.getVoucherDate());
			existingbankingAccountings.setVendorName(related_bankingaccountings.getVendorName());
			existingbankingAccountings.setBankRef(related_bankingaccountings.getBankRef());
			existingbankingAccountings.setCorrespondingAccNo(related_bankingaccountings.getCorrespondingAccNo());
			existingbankingAccountings.setCreatedDate(related_bankingaccountings.getCreatedDate());
			existingbankingAccountings.setModifiedDate(related_bankingaccountings.getModifiedDate());
			existingbankingAccountings.setValidCode(related_bankingaccountings.getValidCode());
			existingbankingAccountings.setFilePath(related_bankingaccountings.getFilePath());
			related_bankingaccountings = existingbankingAccountings;
		}

		related_bankingaccountings.setComapny(comapny);
		comapny.getBankingAccountings().add(related_bankingaccountings);
		related_bankingaccountings = bankingAccountingDAO.store(related_bankingaccountings);
		bankingAccountingDAO.flush();

		comapny = comapnyDAO.store(comapny);
		comapnyDAO.flush();

		return comapny;
	}

	/**
	 * Delete an existing Ledger entity
	 * 
	 */
	@Transactional
	public Comapny deleteComapnyLedgers(Integer comapny_id, Integer related_ledgers_id) {
		Ledger related_ledgers = ledgerDAO.findLedgerByPrimaryKey(related_ledgers_id, -1, -1);

		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id, -1, -1);

		related_ledgers.setComapny(null);
		comapny.getLedgers().remove(related_ledgers);

		ledgerDAO.remove(related_ledgers);
		ledgerDAO.flush();

		return comapny;
	}

	/**
	 * Return all Comapny entity
	 * 
	 */
	@Transactional
	public List<Comapny> findAllComapnys(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Comapny>(comapnyDAO.findAllComapnys(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Comapny findComapnyByPrimaryKey(Integer id) {
		return comapnyDAO.findComapnyByPrimaryKey(id);
	}

	/**
	 * Save an existing Comapny entity
	 * 
	 */
	@Transactional
	public void saveComapny(Comapny comapny) {
		Comapny existingComapny = comapnyDAO.findComapnyByPrimaryKey(comapny.getId());

		if (existingComapny != null) {
			if (existingComapny != comapny) {
				existingComapny.setId(comapny.getId());
				existingComapny.setCode(comapny.getCode());
				existingComapny.setName(comapny.getName());
				existingComapny.setDescription(comapny.getDescription());
				existingComapny.setCreatedDate(comapny.getCreatedDate());
				existingComapny.setModifiedDate(comapny.getModifiedDate());
				existingComapny.setIsActive(comapny.getIsActive());
			}
			comapny = comapnyDAO.store(existingComapny);
		} else {
			comapny = comapnyDAO.store(comapny);
		}
		comapnyDAO.flush();
	}

	/**
	 * Delete an existing BankingAccounting entity
	 * 
	 */
	@Transactional
	public Comapny deleteComapnyBankingAccountings(Integer comapny_id, Integer related_bankingaccountings_id) {
		BankingAccounting related_bankingaccountings = bankingAccountingDAO.findBankingAccountingByPrimaryKey(related_bankingaccountings_id, -1, -1);

		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id, -1, -1);

		related_bankingaccountings.setComapny(null);
		comapny.getBankingAccountings().remove(related_bankingaccountings);

		bankingAccountingDAO.remove(related_bankingaccountings);
		bankingAccountingDAO.flush();

		return comapny;
	}

	/**
	 * Save an existing Approval entity
	 * 
	 */
	@Transactional
	public Comapny saveComapnyApprovals(Integer id, Approval related_approvals) {
		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(id, -1, -1);
		Approval existingapprovals = approvalDAO.findApprovalByPrimaryKey(related_approvals.getId());

		// copy into the existing record to preserve existing relationships
		if (existingapprovals != null) {
			existingapprovals.setId(related_approvals.getId());
			existingapprovals.setCode(related_approvals.getCode());
			existingapprovals.setApprovalDate(related_approvals.getApprovalDate());
			existingapprovals.setBankingDescription(related_approvals.getBankingDescription());
			existingapprovals.setDebitAmount(related_approvals.getDebitAmount());
			existingapprovals.setCreditAmount(related_approvals.getCreditAmount());
			existingapprovals.setBalance(related_approvals.getBalance());
			existingapprovals.setLedgerName(related_approvals.getLedgerName());
			existingapprovals.setLedgerDescription(related_approvals.getLedgerDescription());
			existingapprovals.setInvoiceCode(related_approvals.getInvoiceCode());
			existingapprovals.setBankRef(related_approvals.getBankRef());
			existingapprovals.setLegderType(related_approvals.getLegderType());
			existingapprovals.setCreatedDate(related_approvals.getCreatedDate());
			existingapprovals.setModifiedDate(related_approvals.getModifiedDate());
			existingapprovals.setValidCode(related_approvals.getValidCode());
			existingapprovals.setFilePath(related_approvals.getFilePath());
			related_approvals = existingapprovals;
		} else {
			related_approvals = approvalDAO.store(related_approvals);
			approvalDAO.flush();
		}

		related_approvals.setComapny(comapny);
		comapny.getApprovals().add(related_approvals);
		related_approvals = approvalDAO.store(related_approvals);
		approvalDAO.flush();

		comapny = comapnyDAO.store(comapny);
		comapnyDAO.flush();

		return comapny;
	}

	/**
	 * Delete an existing Approval entity
	 * 
	 */
	@Transactional
	public Comapny deleteComapnyApprovals(Integer comapny_id, Integer related_approvals_id) {
		Approval related_approvals = approvalDAO.findApprovalByPrimaryKey(related_approvals_id, -1, -1);

		Comapny comapny = comapnyDAO.findComapnyByPrimaryKey(comapny_id, -1, -1);

		related_approvals.setComapny(null);
		comapny.getApprovals().remove(related_approvals);

		approvalDAO.remove(related_approvals);
		approvalDAO.flush();

		return comapny;
	}
}
