
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
		@NamedQuery(name = "findAllValidations", query = "select myValidation from Validation myValidation"),
		@NamedQuery(name = "findValidationByDescription", query = "select myValidation from Validation myValidation where myValidation.description = ?1"),
		@NamedQuery(name = "findValidationByDescriptionContaining", query = "select myValidation from Validation myValidation where myValidation.description like ?1"),
		@NamedQuery(name = "findValidationById", query = "select myValidation from Validation myValidation where myValidation.id = ?1"),
		@NamedQuery(name = "findValidationByPrimaryKey", query = "select myValidation from Validation myValidation where myValidation.id = ?1"),
		@NamedQuery(name = "findValidationByValidCode", query = "select myValidation from Validation myValidation where myValidation.validCode = ?1"),
		@NamedQuery(name = "findValidationByValidCodeContaining", query = "select myValidation from Validation myValidation where myValidation.validCode like ?1") })

@Table(schema = "public", name = "validation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "Validation")

public class Validation implements Serializable {
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

	@Column(name = "valid_code", length = 3)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String validCode;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;

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
	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	/**
	 */
	public String getValidCode() {
		return this.validCode;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public Validation() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Validation that) {
		setId(that.getId());
		setValidCode(that.getValidCode());
		setDescription(that.getDescription());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("validCode=[").append(validCode).append("] ");
		buffer.append("description=[").append(description).append("] ");

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
		if (!(obj instanceof Validation))
			return false;
		Validation equalCheck = (Validation) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
