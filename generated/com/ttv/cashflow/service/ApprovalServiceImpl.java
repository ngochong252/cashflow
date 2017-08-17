package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.ApprovalDAO;
import com.ttv.cashflow.dao.ComapnyDAO;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.Comapny;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Approval entities
 * 
 */

@Service("ApprovalService")

@Transactional
public class ApprovalServiceImpl implements ApprovalService {

	/**
	 * DAO injected by Spring that manages Approval entities
	 * 
	 */
	@Autowired
	private ApprovalDAO approvalDAO;

	/**
	 * DAO injected by Spring that manages Comapny entities
	 * 
	 */
	@Autowired
	private ComapnyDAO comapnyDAO;

	/**
	 * Instantiates a new ApprovalServiceImpl.
	 *
	 */
	public ApprovalServiceImpl() {
	}

	/**
	 * Save an existing Comapny entity
	 * 
	 */
	@Transactional
	public Approval saveApprovalComapny(Integer id, Comapny related_comapny) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(id, -1, -1);
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

		approval.setComapny(related_comapny);
		related_comapny.getApprovals().add(approval);
		approval = approvalDAO.store(approval);
		approvalDAO.flush();

		related_comapny = comapnyDAO.store(related_comapny);
		comapnyDAO.flush();

		return approval;
	}

	/**
	 * Delete an existing Comapny entity
	 * 
	 */
	@Transactional
	public Approval deleteApprovalComapny(Integer approval_id, Integer related_comapny_companyId) {
		Approval approval = approvalDAO.findApprovalByPrimaryKey(approval_id, -1, -1);
		Comapny related_comapny = comapnyDAO.findComapnyByPrimaryKey(related_comapny_companyId, -1, -1);

		approval.setComapny(null);
		related_comapny.getApprovals().remove(approval);
		approval = approvalDAO.store(approval);
		approvalDAO.flush();

		related_comapny = comapnyDAO.store(related_comapny);
		comapnyDAO.flush();

		comapnyDAO.remove(related_comapny);
		comapnyDAO.flush();

		return approval;
	}

	/**
	 * Save an existing Approval entity
	 * 
	 */
	@Transactional
	public void saveApproval(Approval approval) {
		Approval existingApproval = approvalDAO.findApprovalByPrimaryKey(approval.getId());

		if (existingApproval != null) {
			if (existingApproval != approval) {
				existingApproval.setId(approval.getId());
				existingApproval.setCode(approval.getCode());
				existingApproval.setApprovalDate(approval.getApprovalDate());
				existingApproval.setBankingDescription(approval.getBankingDescription());
				existingApproval.setDebitAmount(approval.getDebitAmount());
				existingApproval.setCreditAmount(approval.getCreditAmount());
				existingApproval.setBalance(approval.getBalance());
				existingApproval.setLedgerName(approval.getLedgerName());
				existingApproval.setLedgerDescription(approval.getLedgerDescription());
				existingApproval.setInvoiceCode(approval.getInvoiceCode());
				existingApproval.setBankRef(approval.getBankRef());
				existingApproval.setLegderType(approval.getLegderType());
				existingApproval.setCreatedDate(approval.getCreatedDate());
				existingApproval.setModifiedDate(approval.getModifiedDate());
				existingApproval.setValidCode(approval.getValidCode());
				existingApproval.setFilePath(approval.getFilePath());
			}
			approval = approvalDAO.store(existingApproval);
		} else {
			approval = approvalDAO.store(approval);
		}
		approvalDAO.flush();
	}

	/**
	 * Delete an existing Approval entity
	 * 
	 */
	@Transactional
	public void deleteApproval(Approval approval) {
		approvalDAO.remove(approval);
		approvalDAO.flush();
	}

	/**
	 */
	@Transactional
	public Approval findApprovalByPrimaryKey(Integer id) {
		return approvalDAO.findApprovalByPrimaryKey(id);
	}

	/**
	 * Load an existing Approval entity
	 * 
	 */
	@Transactional
	public Set<Approval> loadApprovals() {
		return approvalDAO.findAllApprovals();
	}

	/**
	 * Return all Approval entity
	 * 
	 */
	@Transactional
	public List<Approval> findAllApprovals(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Approval>(approvalDAO.findAllApprovals(startResult, maxRows));
	}

	/**
	 * Return a count of all Approval entity
	 * 
	 */
	@Transactional
	public Integer countApprovals() {
		return ((Long) approvalDAO.createQuerySingleResult("select count(o) from Approval o").getSingleResult()).intValue();
	}
}
