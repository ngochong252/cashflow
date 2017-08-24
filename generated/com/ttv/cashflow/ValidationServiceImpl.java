package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.ValidationDAO;

import com.ttv.cashflow.domain.Validation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Validation entities
 * 
 */

@Service("ValidationService")

@Transactional
public class ValidationServiceImpl implements ValidationService {

	/**
	 * DAO injected by Spring that manages Validation entities
	 * 
	 */
	@Autowired
	private ValidationDAO validationDAO;

	/**
	 * Instantiates a new ValidationServiceImpl.
	 *
	 */
	public ValidationServiceImpl() {
	}

	/**
	 * Save an existing Validation entity
	 * 
	 */
	@Transactional
	public void saveValidation(Validation validation) {
		Validation existingValidation = validationDAO.findValidationByPrimaryKey(validation.getId());

		if (existingValidation != null) {
			if (existingValidation != validation) {
				existingValidation.setId(validation.getId());
				existingValidation.setValidCode(validation.getValidCode());
				existingValidation.setDescription(validation.getDescription());
			}
			validation = validationDAO.store(existingValidation);
		} else {
			validation = validationDAO.store(validation);
		}
		validationDAO.flush();
	}

	/**
	 * Delete an existing Validation entity
	 * 
	 */
	@Transactional
	public void deleteValidation(Validation validation) {
		validationDAO.remove(validation);
		validationDAO.flush();
	}

	/**
	 * Return all Validation entity
	 * 
	 */
	@Transactional
	public List<Validation> findAllValidations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Validation>(validationDAO.findAllValidations(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Validation findValidationByPrimaryKey(Integer id) {
		return validationDAO.findValidationByPrimaryKey(id);
	}

	/**
	 * Return a count of all Validation entity
	 * 
	 */
	@Transactional
	public Integer countValidations() {
		return ((Long) validationDAO.createQuerySingleResult("select count(o) from Validation o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Validation entity
	 * 
	 */
	@Transactional
	public Set<Validation> loadValidations() {
		return validationDAO.findAllValidations();
	}
}
