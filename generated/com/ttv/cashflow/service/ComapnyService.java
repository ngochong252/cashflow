
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
	* Save an existing Ledger entity
	* 
	 */
	public Comapny saveComapnyLedgers(Integer id, Ledger related_ledgers);

	/**
	* Return a count of all Comapny entity
	* 
	 */
	public Integer countComapnys();

	/**
	* Load an existing Comapny entity
	* 
	 */
	public Set<Comapny> loadComapnys();

	/**
	* Delete an existing Comapny entity
	* 
	 */
	public void deleteComapny(Comapny comapny);

	/**
	* Save an existing BankingAccounting entity
	* 
	 */
	public Comapny saveComapnyBankingAccountings(Integer id_1, BankingAccounting related_bankingaccountings);

	/**
	* Delete an existing Ledger entity
	* 
	 */
	public Comapny deleteComapnyLedgers(Integer comapny_id, Integer related_ledgers_id);

	/**
	* Return all Comapny entity
	* 
	 */
	public List<Comapny> findAllComapnys(Integer startResult, Integer maxRows);

	/**
	 */
	public Comapny findComapnyByPrimaryKey(Integer id_2);

	/**
	* Save an existing Comapny entity
	* 
	 */
	public void saveComapny(Comapny comapny_1);

	/**
	* Delete an existing BankingAccounting entity
	* 
	 */
	public Comapny deleteComapnyBankingAccountings(Integer comapny_id_1, Integer related_bankingaccountings_id);

	/**
	* Save an existing Approval entity
	* 
	 */
	public Comapny saveComapnyApprovals(Integer id_3, Approval related_approvals);

	/**
	* Delete an existing Approval entity
	* 
	 */
	public Comapny deleteComapnyApprovals(Integer comapny_id_2, Integer related_approvals_id);
}