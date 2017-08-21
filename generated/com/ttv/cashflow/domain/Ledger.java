
package com.ttv.cashflow.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
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
		@NamedQuery(name = "findAllLedgers", query = "select myLedger from Ledger myLedger"),
		@NamedQuery(name = "findLedgerByAmount", query = "select myLedger from Ledger myLedger where myLedger.amount = ?1"),
		@NamedQuery(name = "findLedgerByCreatedDate", query = "select myLedger from Ledger myLedger where myLedger.createdDate = ?1"),
		@NamedQuery(name = "findLedgerByDescription", query = "select myLedger from Ledger myLedger where myLedger.description = ?1"),
		@NamedQuery(name = "findLedgerByDescriptionContaining", query = "select myLedger from Ledger myLedger where myLedger.description like ?1"),
		@NamedQuery(name = "findLedgerByFilePath", query = "select myLedger from Ledger myLedger where myLedger.filePath = ?1"),
		@NamedQuery(name = "findLedgerByFilePathContaining", query = "select myLedger from Ledger myLedger where myLedger.filePath like ?1"),
		@NamedQuery(name = "findLedgerById", query = "select myLedger from Ledger myLedger where myLedger.id = ?1"),
		@NamedQuery(name = "findLedgerByIssuedDate", query = "select myLedger from Ledger myLedger where myLedger.issuedDate = ?1"),
		@NamedQuery(name = "findLedgerByModifiedDate", query = "select myLedger from Ledger myLedger where myLedger.modifiedDate = ?1"),
		@NamedQuery(name = "findLedgerByPrimaryKey", query = "select myLedger from Ledger myLedger where myLedger.id = ?1"),
		@NamedQuery(name = "findLedgerByType", query = "select myLedger from Ledger myLedger where myLedger.type = ?1"),
		@NamedQuery(name = "findLedgerByValidCode", query = "select myLedger from Ledger myLedger where myLedger.validCode = ?1"),
		@NamedQuery(name = "findLedgerByValidCodeContaining", query = "select myLedger from Ledger myLedger where myLedger.validCode like ?1") })

@Table(schema = "public", name = "ledger")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "Ledger")
@XmlRootElement(namespace = "cashflow/com/ttv/cashflow/domain")
public class Ledger implements Serializable {
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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "issued_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar issuedDate;
	/**
	 */

	@Column(name = "amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal amount;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "valid_code", length = 3)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String validCode;
	/**
	 */

	@Column(name = "type")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer type;
	/**
	 */

	@Column(name = "file_path", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String filePath;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar createdDate;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar modifiedDate;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "company_id", referencedColumnName = "id") })
	@XmlTransient
	Comapny comapny;
	/**
	 */
	@OneToMany(mappedBy = "ledger", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ttv.cashflow.domain.AccountReceivable> accountReceivables;
	/**
	 */
	@OneToMany(mappedBy = "ledger", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ttv.cashflow.domain.AccountPayable> accountPayables;

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
	public void setIssuedDate(Calendar issuedDate) {
		this.issuedDate = issuedDate;
	}

	/**
	 */
	public Calendar getIssuedDate() {
		return this.issuedDate;
	}

	/**
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 */
	public BigDecimal getAmount() {
		return this.amount;
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
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 */
	public Integer getType() {
		return this.type;
	}

	/**
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 */
	public String getFilePath() {
		return this.filePath;
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
	public void setComapny(Comapny comapny) {
		this.comapny = comapny;
	}

	/**
	 */
	@JsonIgnore
	public Comapny getComapny() {
		return comapny;
	}

	/**
	 */
	public void setAccountReceivables(Set<AccountReceivable> accountReceivables) {
		this.accountReceivables = accountReceivables;
	}

	/**
	 */
	@JsonIgnore
	public Set<AccountReceivable> getAccountReceivables() {
		if (accountReceivables == null) {
			accountReceivables = new java.util.LinkedHashSet<com.ttv.cashflow.domain.AccountReceivable>();
		}
		return accountReceivables;
	}

	/**
	 */
	public void setAccountPayables(Set<AccountPayable> accountPayables) {
		this.accountPayables = accountPayables;
	}

	/**
	 */
	@JsonIgnore
	public Set<AccountPayable> getAccountPayables() {
		if (accountPayables == null) {
			accountPayables = new java.util.LinkedHashSet<com.ttv.cashflow.domain.AccountPayable>();
		}
		return accountPayables;
	}

	/**
	 */
	public Ledger() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Ledger that) {
		setId(that.getId());
		setIssuedDate(that.getIssuedDate());
		setAmount(that.getAmount());
		setDescription(that.getDescription());
		setValidCode(that.getValidCode());
		setType(that.getType());
		setFilePath(that.getFilePath());
		setCreatedDate(that.getCreatedDate());
		setModifiedDate(that.getModifiedDate());
		setComapny(that.getComapny());
		setAccountReceivables(new java.util.LinkedHashSet<com.ttv.cashflow.domain.AccountReceivable>(that.getAccountReceivables()));
		setAccountPayables(new java.util.LinkedHashSet<com.ttv.cashflow.domain.AccountPayable>(that.getAccountPayables()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("issuedDate=[").append(issuedDate).append("] ");
		buffer.append("amount=[").append(amount).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("validCode=[").append(validCode).append("] ");
		buffer.append("type=[").append(type).append("] ");
		buffer.append("filePath=[").append(filePath).append("] ");
		buffer.append("createdDate=[").append(createdDate).append("] ");
		buffer.append("modifiedDate=[").append(modifiedDate).append("] ");

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
		if (!(obj instanceof Ledger))
			return false;
		Ledger equalCheck = (Ledger) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
