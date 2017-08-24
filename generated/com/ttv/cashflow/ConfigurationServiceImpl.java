package com.ttv.cashflow.service;

import com.ttv.cashflow.dao.ConfigurationDAO;

import com.ttv.cashflow.domain.Configuration;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Configuration entities
 * 
 */

@Service("ConfigurationService")

@Transactional
public class ConfigurationServiceImpl implements ConfigurationService {

	/**
	 * DAO injected by Spring that manages Configuration entities
	 * 
	 */
	@Autowired
	private ConfigurationDAO configurationDAO;

	/**
	 * Instantiates a new ConfigurationServiceImpl.
	 *
	 */
	public ConfigurationServiceImpl() {
	}

	/**
	 * Return a count of all Configuration entity
	 * 
	 */
	@Transactional
	public Integer countConfigurations() {
		return ((Long) configurationDAO.createQuerySingleResult("select count(o) from Configuration o").getSingleResult()).intValue();
	}

	/**
	 * Return all Configuration entity
	 * 
	 */
	@Transactional
	public List<Configuration> findAllConfigurations(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Configuration>(configurationDAO.findAllConfigurations(startResult, maxRows));
	}

	/**
	 * Delete an existing Configuration entity
	 * 
	 */
	@Transactional
	public void deleteConfiguration(Configuration configuration) {
		configurationDAO.remove(configuration);
		configurationDAO.flush();
	}

	/**
	 */
	@Transactional
	public Configuration findConfigurationByPrimaryKey(Integer id) {
		return configurationDAO.findConfigurationByPrimaryKey(id);
	}

	/**
	 * Save an existing Configuration entity
	 * 
	 */
	@Transactional
	public void saveConfiguration(Configuration configuration) {
		Configuration existingConfiguration = configurationDAO.findConfigurationByPrimaryKey(configuration.getId());

		if (existingConfiguration != null) {
			if (existingConfiguration != configuration) {
				existingConfiguration.setId(configuration.getId());
				existingConfiguration.setKey(configuration.getKey());
				existingConfiguration.setValue(configuration.getValue());
			}
			configuration = configurationDAO.store(existingConfiguration);
		} else {
			configuration = configurationDAO.store(configuration);
		}
		configurationDAO.flush();
	}

	/**
	 * Load an existing Configuration entity
	 * 
	 */
	@Transactional
	public Set<Configuration> loadConfigurations() {
		return configurationDAO.findAllConfigurations();
	}
}
