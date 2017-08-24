
package com.ttv.cashflow.service;

import com.ttv.cashflow.domain.Configuration;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Configuration entities
 * 
 */
public interface ConfigurationService {

	/**
	* Return a count of all Configuration entity
	* 
	 */
	public Integer countConfigurations();

	/**
	* Return all Configuration entity
	* 
	 */
	public List<Configuration> findAllConfigurations(Integer startResult, Integer maxRows);

	/**
	* Delete an existing Configuration entity
	* 
	 */
	public void deleteConfiguration(Configuration configuration);

	/**
	 */
	public Configuration findConfigurationByPrimaryKey(Integer id);

	/**
	* Save an existing Configuration entity
	* 
	 */
	public void saveConfiguration(Configuration configuration_1);

	/**
	* Load an existing Configuration entity
	* 
	 */
	public Set<Configuration> loadConfigurations();
}