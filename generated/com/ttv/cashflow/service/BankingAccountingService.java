
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.BankingAccounting;
import com.ttv.cashflow.domain.Comapny;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for BankingAccounting entities
 * 
 */
public interface BankingAccountingService {

	/**
	 */
	public BankingAccounting findBankingAccountingByPrimaryKey(Integer id);

	/**
	* Return all BankingAccounting entity
	* 
	 */
	public List<BankingAccounting> findAllBankingAccountings(Integer startResult, Integer maxRows);

	/**
	* Delete an existing BankingAccounting entity
	* 
	 */
	public void deleteBankingAccounting(BankingAccounting bankingaccounting);

	/**
	* Load an existing BankingAccounting entity
	* 
	 */
	public Set<BankingAccounting> loadBankingAccountings();

	/**
	* Return a count of all BankingAccounting entity
	* 
	 */
	public Integer countBankingAccountings();

	/**
	* Save an existing Comapny entity
	* 
	 */
	public BankingAccounting saveBankingAccountingComapny(Integer id_1, Comapny related_comapny);

	/**
	* Delete an existing Comapny entity
	* 
	 */
	public BankingAccounting deleteBankingAccountingComapny(Integer bankingaccounting_id, Integer related_comapny_id);

	/**
	* Save an existing BankingAccounting entity
	* 
	 */
	public void saveBankingAccounting(BankingAccounting bankingaccounting_1);
}