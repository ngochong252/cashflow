
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Approval;
import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Comapny entities
 * 
 */
public interface ComapnyService {

	/**
	* Return a count of all Comapny entity
	* 
	 */
	public Integer countComapnys();

	/**
	* Delete an existing BankingAccounting entity
	* 
	 */
	public Comapny deleteComapnyBankingAccountings(Integer comapny_companyId, Integer related_bankingaccountings_id);

	/**
	* Delete an existing Approval entity
	* 
	 */
	public Comapny deleteComapnyApprovals(Integer comapny_companyId_1, Integer related_approvals_id);

	/**
	* Save an existing Ledger entity
	* 
	 */
	public Comapny saveComapnyLedgers(Integer companyId, Ledger related_ledgers);

	/**
	* Save an existing BankingAccounting entity
	* 
	 */
	public Comapny saveComapnyBankingAccountings(Integer companyId_1, BankingAccounting related_bankingaccountings);

	/**
	* Delete an existing Comapny entity
	* 
	 */
	public void deleteComapny(Comapny comapny);

	/**
	* Return all Comapny entity
	* 
	 */
	public List<Comapny> findAllComapnys(Integer startResult, Integer maxRows);

	/**
	* Load an existing Comapny entity
	* 
	 */
	public Set<Comapny> loadComapnys();

	/**
	* Save an existing Approval entity
	* 
	 */
	public Comapny saveComapnyApprovals(Integer companyId_2, Approval related_approvals);

	/**
	 */
	public Comapny findComapnyByPrimaryKey(Integer companyId_3);

	/**
	* Save an existing Comapny entity
	* 
	 */
	public void saveComapny(Comapny comapny_1);

	/**
	* Delete an existing Ledger entity
	* 
	 */
	public Comapny deleteComapnyLedgers(Integer comapny_companyId_2, Integer related_ledgers_id);
}