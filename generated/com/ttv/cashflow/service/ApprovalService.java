
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.Comapny;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Approval entities
 * 
 */
public interface ApprovalService {

	/**
	* Save an existing Comapny entity
	* 
	 */
	public Approval saveApprovalComapny(Integer id, Comapny related_comapny);

	/**
	* Delete an existing Comapny entity
	* 
	 */
	public Approval deleteApprovalComapny(Integer approval_id, Integer related_comapny_companyId);

	/**
	* Save an existing Approval entity
	* 
	 */
	public void saveApproval(Approval approval);

	/**
	* Delete an existing Approval entity
	* 
	 */
	public void deleteApproval(Approval approval_1);

	/**
	 */
	public Approval findApprovalByPrimaryKey(Integer id_1);

	/**
	* Load an existing Approval entity
	* 
	 */
	public Set<Approval> loadApprovals();

	/**
	* Return all Approval entity
	* 
	 */
	public List<Approval> findAllApprovals(Integer startResult, Integer maxRows);

	/**
	* Return a count of all Approval entity
	* 
	 */
	public Integer countApprovals();
}