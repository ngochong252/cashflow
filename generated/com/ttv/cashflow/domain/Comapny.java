
package com.ttv.cashflow.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllComapnys", query = "select myComapny from Comapny myComapny"),
		@NamedQuery(name = "findComapnyByCode", query = "select myComapny from Comapny myComapny where myComapny.code = ?1"),
		@NamedQuery(name = "findComapnyByCodeContaining", query = "select myComapny from Comapny myComapny where myComapny.code like ?1"),
		@NamedQuery(name = "findComapnyByCreatedDate", query = "select myComapny from Comapny myComapny where myComapny.createdDate = ?1"),
		@NamedQuery(name = "findComapnyByDescription", query = "select myComapny from Comapny myComapny where myComapny.description = ?1"),
		@NamedQuery(name = "findComapnyByDescriptionContaining", query = "select myComapny from Comapny myComapny where myComapny.description like ?1"),
		@NamedQuery(name = "findComapnyById", query = "select myComapny from Comapny myComapny where myComapny.id = ?1"),
		@NamedQuery(name = "findComapnyByIsActive", query = "select myComapny from Comapny myComapny where myComapny.isActive = ?1"),
		@NamedQuery(name = "findComapnyByModifiedDate", query = "select myComapny from Comapny myComapny where myComapny.modifiedDate = ?1"),
		@NamedQuery(name = "findComapnyByName", query = "select myComapny from Comapny myComapny where myComapny.name = ?1"),
		@NamedQuery(name = "findComapnyByNameContaining", query = "select myComapny from Comapny myComapny where myComapny.name like ?1"),
		@NamedQuery(name = "findComapnyByPrimaryKey", query = "select myComapny from Comapny myComapny where myComapny.id = ?1") })

@Table(schema = "public", name = "comapny")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "Comapny")
@XmlRootElement(namespace = "cashflow/com/ttv/cashflow/domain")
public class Comapny implements Serializable {
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

	@Column(name = "code", length = 40, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String code;
	/**
	 */

	@Column(name = "name", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String name;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar createdDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar modifiedDate;
	/**
	 */

	@Column(name = "is_active", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Boolean isActive;

	/**
	 */
	@OneToMany(mappedBy = "comapny", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ttv.cashflow.domain.Approval> approvals;
	/**
	 */
	@OneToMany(mappedBy = "comapny", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ttv.cashflow.domain.BankingAccounting> bankingAccountings;
	/**
	 */
	@OneToMany(mappedBy = "comapny", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ttv.cashflow.domain.Ledger> ledgers;

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
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
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
	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 */
	public Calendar getCreatedDate() {
		return this.createdDate;
	}

	/**
	 */
	public void setModifiedDate(Calendar modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 */
	public Calendar getModifiedDate() {
		return this.modifiedDate;
	}

	/**
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 */
	public Boolean getIsActive() {
		return this.isActive;
	}

	/**
	 */
	public void setApprovals(Set<Approval> approvals) {
		this.approvals = approvals;
	}

	/**
	 */
	@JsonIgnore
	public Set<Approval> getApprovals() {
		if (approvals == null) {
			approvals = new java.util.LinkedHashSet<com.ttv.cashflow.domain.Approval>();
		}
		return approvals;
	}

	/**
	 */
	public void setBankingAccountings(Set<BankingAccounting> bankingAccountings) {
		this.bankingAccountings = bankingAccountings;
	}

	/**
	 */
	@JsonIgnore
	public Set<BankingAccounting> getBankingAccountings() {
		if (bankingAccountings == null) {
			bankingAccountings = new java.util.LinkedHashSet<com.ttv.cashflow.domain.BankingAccounting>();
		}
		return bankingAccountings;
	}

	/**
	 */
	public void setLedgers(Set<Ledger> ledgers) {
		this.ledgers = ledgers;
	}

	/**
	 */
	@JsonIgnore
	public Set<Ledger> getLedgers() {
		if (ledgers == null) {
			ledgers = new java.util.LinkedHashSet<com.ttv.cashflow.domain.Ledger>();
		}
		return ledgers;
	}

	/**
	 */
	public Comapny() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Comapny that) {
		setId(that.getId());
		setCode(that.getCode());
		setName(that.getName());
		setDescription(that.getDescription());
		setCreatedDate(that.getCreatedDate());
		setModifiedDate(that.getModifiedDate());
		setIsActive(that.getIsActive());
		setApprovals(new java.util.LinkedHashSet<com.ttv.cashflow.domain.Approval>(that.getApprovals()));
		setBankingAccountings(new java.util.LinkedHashSet<com.ttv.cashflow.domain.BankingAccounting>(that.getBankingAccountings()));
		setLedgers(new java.util.LinkedHashSet<com.ttv.cashflow.domain.Ledger>(that.getLedgers()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("code=[").append(code).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("createdDate=[").append(createdDate).append("] ");
		buffer.append("modifiedDate=[").append(modifiedDate).append("] ");
		buffer.append("isActive=[").append(isActive).append("] ");

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
		if (!(obj instanceof Comapny))
			return false;
		Comapny equalCheck = (Comapny) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
