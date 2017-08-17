
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for ProcessCase entities
 * 
 */
public interface ProcessCaseService {

	/**
	* Save an existing ProcessCase entity
	* 
	 */
	public void saveProcessCase(ProcessCase processcase);

	/**
	* Return a count of all ProcessCase entity
	* 
	 */
	public Integer countProcessCases();

	/**
	* Delete an existing ProcessCase entity
	* 
	 */
	public void deleteProcessCase(ProcessCase processcase_1);

	/**
	* Delete an existing ErrorDetails entity
	* 
	 */
	public ProcessCase deleteProcessCaseErrorDetails(Integer processcase_id, Integer related_errordetails_id);

	/**
	* Return all ProcessCase entity
	* 
	 */
	public List<ProcessCase> findAllProcessCases(Integer startResult, Integer maxRows);

	/**
	* Save an existing ErrorDetails entity
	* 
	 */
	public ProcessCase saveProcessCaseErrorDetails(Integer id, ErrorDetails related_errordetails);

	/**
	 */
	public ProcessCase findProcessCaseByPrimaryKey(Integer id_1);

	/**
	* Load an existing ProcessCase entity
	* 
	 */
	public Set<ProcessCase> loadProcessCases();
}