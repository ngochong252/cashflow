
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
	* Return a count of all ProcessCase entity
	* 
	 */
	public Integer countProcessCases();

	/**
	* Load an existing ProcessCase entity
	* 
	 */
	public Set<ProcessCase> loadProcessCases();

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
	* Delete an existing ProcessCase entity
	* 
	 */
	public void deleteProcessCase(ProcessCase processcase);

	/**
	* Delete an existing ErrorDetails entity
	* 
	 */
	public ProcessCase deleteProcessCaseErrorDetails(Integer processcase_id, Integer related_errordetails_id);

	/**
	 */
	public ProcessCase findProcessCaseByPrimaryKey(Integer id_1);

	/**
	* Save an existing ProcessCase entity
	* 
	 */
	public void saveProcessCase(ProcessCase processcase_1);
}