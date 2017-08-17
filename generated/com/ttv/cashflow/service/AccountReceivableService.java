
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for AccountReceivable entities
 * 
 */
public interface AccountReceivableService {

	/**
	* Load an existing AccountReceivable entity
	* 
	 */
	public Set<AccountReceivable> loadAccountReceivables();

	/**
	* Save an existing AccountReceivable entity
	* 
	 */
	public void saveAccountReceivable(AccountReceivable accountreceivable);

	/**
	* Return all AccountReceivable entity
	* 
	 */
	public List<AccountReceivable> findAllAccountReceivables(Integer startResult, Integer maxRows);

	/**
	* Return a count of all AccountReceivable entity
	* 
	 */
	public Integer countAccountReceivables();

	/**
	* Save an existing Ledger entity
	* 
	 */
	public AccountReceivable saveAccountReceivableLedger(Integer id, Ledger related_ledger);

	/**
	* Delete an existing AccountReceivable entity
	* 
	 */
	public void deleteAccountReceivable(AccountReceivable accountreceivable_1);

	/**
	 */
	public AccountReceivable findAccountReceivableByPrimaryKey(Integer id_1);

	/**
	* Delete an existing Ledger entity
	* 
	 */
	public AccountReceivable deleteAccountReceivableLedger(Integer accountreceivable_id, Integer related_ledger_id);
}