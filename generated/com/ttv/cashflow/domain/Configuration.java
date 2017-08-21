
package com.ttv.cashflow.domain;

import java.io.Serializable;
import java.lang.StringBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllConfigurations", query = "select myConfiguration from Configuration myConfiguration"),
		@NamedQuery(name = "findConfigurationById", query = "select myConfiguration from Configuration myConfiguration where myConfiguration.id = ?1"),
		@NamedQuery(name = "findConfigurationByKey", query = "select myConfiguration from Configuration myConfiguration where myConfiguration.key = ?1"),
		@NamedQuery(name = "findConfigurationByKeyContaining", query = "select myConfiguration from Configuration myConfiguration where myConfiguration.key like ?1"),
		@NamedQuery(name = "findConfigurationByPrimaryKey", query = "select myConfiguration from Configuration myConfiguration where myConfiguration.id = ?1"),
		@NamedQuery(name = "findConfigurationByValue", query = "select myConfiguration from Configuration myConfiguration where myConfiguration.value = ?1"),
		@NamedQuery(name = "findConfigurationByValueContaining", query = "select myConfiguration from Configuration myConfiguration where myConfiguration.value like ?1") })

@Table(schema = "public", name = "configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "Configuration")

public class Configuration implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	/**
	 */

	@Column(name = "key", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String key;
	/**
	 */

	@Column(name = "value", length = 50)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String value;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 */
	public Configuration() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Configuration that) {
		setId(that.getId());
		setKey(that.getKey());
		setValue(that.getValue());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("key=[").append(key).append("] ");
		buffer.append("value=[").append(value).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Configuration))
			return false;
		Configuration equalCheck = (Configuration) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
