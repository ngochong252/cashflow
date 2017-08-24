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
 * Spring service that handles CRUD requests for ProcessCase entities
 * 
 */

@Service("ProcessCaseService")

@Transactional
public class ProcessCaseServiceImpl implements ProcessCaseService {

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
	 * Instantiates a new ProcessCaseServiceImpl.
	 *
	 */
	public ProcessCaseServiceImpl() {
	}

	/**
	 * Return a count of all ProcessCase entity
	 * 
	 */
	@Transactional
	public Integer countProcessCases() {
		return ((Long) processCaseDAO.createQuerySingleResult("select count(o) from ProcessCase o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing ProcessCase entity
	 * 
	 */
	@Transactional
	public Set<ProcessCase> loadProcessCases() {
		return processCaseDAO.findAllProcessCases();
	}

	/**
	 * Return all ProcessCase entity
	 * 
	 */
	@Transactional
	public List<ProcessCase> findAllProcessCases(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ProcessCase>(processCaseDAO.findAllProcessCases(startResult, maxRows));
	}

	/**
	 * Save an existing ErrorDetails entity
	 * 
	 */
	@Transactional
	public ProcessCase saveProcessCaseErrorDetails(Integer id, ErrorDetails related_errordetails) {
		ProcessCase processcase = processCaseDAO.findProcessCaseByPrimaryKey(id, -1, -1);
		ErrorDetails existingerrorDetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(related_errordetails.getId());

		// copy into the existing record to preserve existing relationships
		if (existingerrorDetails != null) {
			existingerrorDetails.setId(related_errordetails.getId());
			existingerrorDetails.setBaId(related_errordetails.getBaId());
			existingerrorDetails.setLedgerId(related_errordetails.getLedgerId());
			existingerrorDetails.setApprovalId(related_errordetails.getApprovalId());
			existingerrorDetails.setStatus(related_errordetails.getStatus());
			existingerrorDetails.setDescription(related_errordetails.getDescription());
			related_errordetails = existingerrorDetails;
		} else {
			related_errordetails = errorDetailsDAO.store(related_errordetails);
			errorDetailsDAO.flush();
		}

		processcase.setErrorDetails(related_errordetails);
		related_errordetails.getProcessCases().add(processcase);
		processcase = processCaseDAO.store(processcase);
		processCaseDAO.flush();

		related_errordetails = errorDetailsDAO.store(related_errordetails);
		errorDetailsDAO.flush();

		return processcase;
	}

	/**
	 * Delete an existing ProcessCase entity
	 * 
	 */
	@Transactional
	public void deleteProcessCase(ProcessCase processcase) {
		processCaseDAO.remove(processcase);
		processCaseDAO.flush();
	}

	/**
	 * Delete an existing ErrorDetails entity
	 * 
	 */
	@Transactional
	public ProcessCase deleteProcessCaseErrorDetails(Integer processcase_id, Integer related_errordetails_id) {
		ProcessCase processcase = processCaseDAO.findProcessCaseByPrimaryKey(processcase_id, -1, -1);
		ErrorDetails related_errordetails = errorDetailsDAO.findErrorDetailsByPrimaryKey(related_errordetails_id, -1, -1);

		processcase.setErrorDetails(null);
		related_errordetails.getProcessCases().remove(processcase);
		processcase = processCaseDAO.store(processcase);
		processCaseDAO.flush();

		related_errordetails = errorDetailsDAO.store(related_errordetails);
		errorDetailsDAO.flush();

		errorDetailsDAO.remove(related_errordetails);
		errorDetailsDAO.flush();

		return processcase;
	}

	/**
	 */
	@Transactional
	public ProcessCase findProcessCaseByPrimaryKey(Integer id) {
		return processCaseDAO.findProcessCaseByPrimaryKey(id);
	}

	/**
	 * Save an existing ProcessCase entity
	 * 
	 */
	@Transactional
	public void saveProcessCase(ProcessCase processcase) {
		ProcessCase existingProcessCase = processCaseDAO.findProcessCaseByPrimaryKey(processcase.getId());

		if (existingProcessCase != null) {
			if (existingProcessCase != processcase) {
				existingProcessCase.setId(processcase.getId());
				existingProcessCase.setStepsResolve(processcase.getStepsResolve());
			}
			processcase = processCaseDAO.store(existingProcessCase);
		} else {
			processcase = processCaseDAO.store(processcase);
		}
		processCaseDAO.flush();
	}
}
