package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.ErrorDetailsDAO;
import com.ttv.cashflow.dao.ProcessCaseDAO;

import com.ttv.cashflow.domain.ErrorDetails;
import com.ttv.cashflow.domain.ProcessCase;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ErrorDetails entities
 * 
 */

@Service("ErrorDetailsService")

@Transactional
public class ErrorDetailsServiceImpl implements ErrorDetailsService {

	/**
	 * DAO injected by Spring that manages ErrorDetails entities
	 * 
	 */
	@Autowired
	private ErrorDetailsDAO errorDetailsDAO;

	/**
	 * DAO injected by Spring that manages ProcessCase entities
	 * 
	 */
	@Autowired
	private ProcessCaseDAO processCaseDAO;

	/**
	 * Instantiates a new ErrorDetailsServiceImpl.
	 *
	 */
	public ErrorDetailsServiceImpl() {
	}

	/**
	 */
	@Transactional
	public ErrorDetails findErrorDetailsByPrimaryKey(Integer id) {
		return errorDetailsDAO.findErrorDetailsByPrimaryKey(id);
	}

	/**
	 * Delete an existing ErrorDetails entity
	 * 
	 */
	@Transactional
	public void deleteErrorDetails(ErrorDetails errordetails) {
		errorDetailsDAO.remove(errordetails);
		errorDetailsDAO.flush();
	}

	/**
	 * Load an existing ErrorDetails entity
	 * 
	 */
	@Transactional
	public Set<ErrorDetails> loadErrorDetailss() {
		return errorDetailsDAO.findAllErrorDetailss();
	}

	/**
	 * Delete an existing ProcessCase entity
	 * 
	 */
	@Transactional
	public ErrorDetails deleteErrorDetailsProcessCases(Integer errordetails_id, Integer related_processcases_id) {
		ProcessCase related_processcases = processCaseDAO.findProcessCaseByPrimaryKey(related_processcases_id, -1, -1);

		ErrorDetails errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails_id, -1, -1);

		related_processcases.setErrorDetails(null);
		errordetails.getProcessCases().remove(related_processcases);

		processCaseDAO.remove(related_processcases);
		processCaseDAO.flush();

		return errordetails;
	}

	/**
	 * Save an existing ProcessCase entity
	 * 
	 */
	@Transactional
	public ErrorDetails saveErrorDetailsProcessCases(Integer id, ProcessCase related_processcases) {
		ErrorDetails errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(id, -1, -1);
		ProcessCase existingprocessCases = processCaseDAO.findProcessCaseByPrimaryKey(related_processcases.getId());

		// copy into the existing record to preserve existing relationships
		if (existingprocessCases != null) {
			existingprocessCases.setId(related_processcases.getId());
			existingprocessCases.setStepsResolve(related_processcases.getStepsResolve());
			related_processcases = existingprocessCases;
		} else {
			related_processcases = processCaseDAO.store(related_processcases);
			processCaseDAO.flush();
		}

		related_processcases.setErrorDetails(errordetails);
		errordetails.getProcessCases().add(related_processcases);
		related_processcases = processCaseDAO.store(related_processcases);
		processCaseDAO.flush();

		errordetails = errorDetailsDAO.store(errordetails);
		errorDetailsDAO.flush();

		return errordetails;
	}

	/**
	 * Save an existing ErrorDetails entity
	 * 
	 */
	@Transactional
	public void saveErrorDetails(ErrorDetails errordetails) {
		ErrorDetails existingErrorDetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(errordetails.getId());

		if (existingErrorDetails != null) {
			if (existingErrorDetails != errordetails) {
				existingErrorDetails.setId(errordetails.getId());
				existingErrorDetails.setBaId(errordetails.getBaId());
				existingErrorDetails.setLedgerId(errordetails.getLedgerId());
				existingErrorDetails.setApprovalId(errordetails.getApprovalId());
				existingErrorDetails.setStatus(errordetails.getStatus());
				existingErrorDetails.setDescription(errordetails.getDescription());
			}
			errordetails = errorDetailsDAO.store(existingErrorDetails);
		} else {
			errordetails = errorDetailsDAO.store(errordetails);
		}
		errorDetailsDAO.flush();
	}

	/**
	 * Return all ErrorDetails entity
	 * 
	 */
	@Transactional
	public List<ErrorDetails> findAllErrorDetailss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ErrorDetails>(errorDetailsDAO.findAllErrorDetailss(startResult, maxRows));
	}

	/**
	 * Return a count of all ErrorDetails entity
	 * 
	 */
	@Transactional
	public Integer countErrorDetailss() {
		return ((Long) errorDetailsDAO.createQuerySingleResult("select count(o) from ErrorDetails o").getSingleResult()).intValue();
	}
}
