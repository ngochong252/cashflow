
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.AccountPayable;
import com.ttv.cashflow.domain.AccountReceivable;
import com.ttv.cashflow.domain.Comapny;
import com.ttv.cashflow.domain.Ledger;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Ledger entities
 * 
 */
public interface LedgerService {

	/**
	* Delete an existing AccountReceivable entity
	* 
	 */
	public Ledger deleteLedgerAccountReceivables(Integer ledger_id, Integer related_accountreceivables_id);

	/**
	* Save an existing Ledger entity
	* 
	 */
	public void saveLedger(Ledger ledger);

	/**
	* Delete an existing Comapny entity
	* 
	 */
	public Ledger deleteLedgerComapny(Integer ledger_id_1, Integer related_comapny_id);

	/**
	* Load an existing Ledger entity
	* 
	 */
	public Set<Ledger> loadLedgers();

	/**
	* Delete an existing AccountPayable entity
	* 
	 */
	public Ledger deleteLedgerAccountPayables(Integer ledger_id_2, Integer related_accountpayables_id);

	/**
	* Save an existing AccountPayable entity
	* 
	 */
	public Ledger saveLedgerAccountPayables(Integer id, AccountPayable related_accountpayables);

	/**
	* Save an existing AccountReceivable entity
	* 
	 */
	public Ledger saveLedgerAccountReceivables(Integer id_1, AccountReceivable related_accountreceivables);

	/**
	 */
	public Ledger findLedgerByPrimaryKey(Integer id_2);

	/**
	* Return a count of all Ledger entity
	* 
	 */
	public Integer countLedgers();

	/**
	* Save an existing Comapny entity
	* 
	 */
	public Ledger saveLedgerComapny(Integer id_3, Comapny related_comapny);

	/**
	* Delete an existing Ledger entity
	* 
	 */
	public void deleteLedger(Ledger ledger_1);

	/**
	* Return all Ledger entity
	* 
	 */
	public List<Ledger> findAllLedgers(Integer startResult, Integer maxRows);
}