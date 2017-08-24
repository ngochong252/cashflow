
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
	* Save an existing AccountPayable entity
	* 
	 */
	public void saveAccountPayable(AccountPayable accountpayable);

	/**
	 */
	public AccountPayable findAccountPayableByPrimaryKey(Integer id);

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
	* Return a count of all AccountPayable entity
	* 
	 */
	public Integer countAccountPayables();

	/**
	* Save an existing Ledger entity
	* 
	 */
	public AccountPayable saveAccountPayableLedger(Integer id_1, Ledger related_ledger);

	/**
	* Load an existing AccountPayable entity
	* 
	 */
	public Set<AccountPayable> loadAccountPayables();

	/**
	* Delete an existing Ledger entity
	* 
	 */
	public AccountPayable deleteAccountPayableLedger(Integer accountpayable_id, Integer related_ledger_id);
}