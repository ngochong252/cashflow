
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for ErrorDetails entities
 * 
 */
public interface ErrorDetailsService {

	/**
	* Return a count of all ErrorDetails entity
	* 
	 */
	public Integer countErrorDetailss();

	/**
	* Load an existing ErrorDetails entity
	* 
	 */
	public Set<ErrorDetails> loadErrorDetailss();

	/**
	* Save an existing ProcessCase entity
	* 
	 */
	public ErrorDetails saveErrorDetailsProcessCases(Integer id, ProcessCase related_processcases);

	/**
	* Delete an existing ErrorDetails entity
	* 
	 */
	public void deleteErrorDetails(ErrorDetails errordetails);

	/**
	 */
	public ErrorDetails findErrorDetailsByPrimaryKey(Integer id_1);

	/**
	* Return all ErrorDetails entity
	* 
	 */
	public List<ErrorDetails> findAllErrorDetailss(Integer startResult, Integer maxRows);

	/**
	* Save an existing ErrorDetails entity
	* 
	 */
	public void saveErrorDetails(ErrorDetails errordetails_1);

	/**
	* Delete an existing ProcessCase entity
	* 
	 */
	public ErrorDetails deleteErrorDetailsProcessCases(Integer errordetails_id, Integer related_processcases_id);
}