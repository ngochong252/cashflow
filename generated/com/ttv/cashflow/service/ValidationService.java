
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Validation;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Validation entities
 * 
 */
public interface ValidationService {

	/**
	* Save an existing Validation entity
	* 
	 */
	public void saveValidation(Validation validation);

	/**
	* Delete an existing Validation entity
	* 
	 */
	public void deleteValidation(Validation validation_1);

	/**
	* Return all Validation entity
	* 
	 */
	public List<Validation> findAllValidations(Integer startResult, Integer maxRows);

	/**
	 */
	public Validation findValidationByPrimaryKey(Integer id);

	/**
	* Return a count of all Validation entity
	* 
	 */
	public Integer countValidations();

	/**
	* Load an existing Validation entity
	* 
	 */
	public Set<Validation> loadValidations();
}