
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for AccountPayable entities
 * 
 */
public interface AccountPayableService {

	/**
	* Save an existing Ledger entity
	* 
	 */
	public AccountPayable saveAccountPayableLedger(Integer id, Ledger related_ledger);

	/**
	* Save an existing AccountPayable entity
	* 
	 */
	public void saveAccountPayable(AccountPayable accountpayable);

	/**
	* Return a count of all AccountPayable entity
	* 
	 */
	public Integer countAccountPayables();

	/**
	 */
	public AccountPayable findAccountPayableByPrimaryKey(Integer id_1);

	/**
	* Load an existing AccountPayable entity
	* 
	 */
	public Set<AccountPayable> loadAccountPayables();

	/**
	* Return all AccountPayable entity
	* 
	 */
	public List<AccountPayable> findAllAccountPayables(Integer startResult, Integer maxRows);

	/**
	* Delete an existing AccountPayable entity
	* 
	 */
	public void deleteAccountPayable(AccountPayable accountpayable_1);

	/**
	* Delete an existing Ledger entity
	* 
	 */
	public AccountPayable deleteAccountPayableLedger(Integer accountpayable_id, Integer related_ledger_id);
}