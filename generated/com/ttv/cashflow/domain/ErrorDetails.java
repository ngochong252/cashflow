
package com.ttv.cashflow.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

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
		@NamedQuery(name = "findAllErrorDetailss", query = "select myErrorDetails from ErrorDetails myErrorDetails"),
		@NamedQuery(name = "findErrorDetailsByApprovalId", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.approvalId = ?1"),
		@NamedQuery(name = "findErrorDetailsByBaId", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.baId = ?1"),
		@NamedQuery(name = "findErrorDetailsByDescription", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.description = ?1"),
		@NamedQuery(name = "findErrorDetailsByDescriptionContaining", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.description like ?1"),
		@NamedQuery(name = "findErrorDetailsById", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.id = ?1"),
		@NamedQuery(name = "findErrorDetailsByLedgerId", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.ledgerId = ?1"),
		@NamedQuery(name = "findErrorDetailsByPrimaryKey", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.id = ?1"),
		@NamedQuery(name = "findErrorDetailsByStatus", query = "select myErrorDetails from ErrorDetails myErrorDetails where myErrorDetails.status = ?1") })

@Table(schema = "public", name = "error_details")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "ErrorDetails")
@XmlRootElement(namespace = "cashflow/com/ttv/cashflow/domain")
public class ErrorDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "ba_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer baId;
	/**
	 */

	@Column(name = "ledger_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer ledgerId;
	/**
	 */

	@Column(name = "approval_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer approvalId;
	/**
	 */

	@Column(name = "status")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer status;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;

	/**
	 */
	@OneToMany(mappedBy = "errorDetails", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)

	@XmlElement(name = "", namespace = "")
	java.util.Set<com.ttv.cashflow.domain.ProcessCase> processCases;

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
	public void setBaId(Integer baId) {
		this.baId = baId;
	}

	/**
	 */
	public Integer getBaId() {
		return this.baId;
	}

	/**
	 */
	public void setLedgerId(Integer ledgerId) {
		this.ledgerId = ledgerId;
	}

	/**
	 */
	public Integer getLedgerId() {
		return this.ledgerId;
	}

	/**
	 */
	public void setApprovalId(Integer approvalId) {
		this.approvalId = approvalId;
	}

	/**
	 */
	public Integer getApprovalId() {
		return this.approvalId;
	}

	/**
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 */
	public Integer getStatus() {
		return this.status;
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
	public void setProcessCases(Set<ProcessCase> processCases) {
		this.processCases = processCases;
	}

	/**
	 */
	@JsonIgnore
	public Set<ProcessCase> getProcessCases() {
		if (processCases == null) {
			processCases = new java.util.LinkedHashSet<com.ttv.cashflow.domain.ProcessCase>();
		}
		return processCases;
	}

	/**
	 */
	public ErrorDetails() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ErrorDetails that) {
		setId(that.getId());
		setBaId(that.getBaId());
		setLedgerId(that.getLedgerId());
		setApprovalId(that.getApprovalId());
		setStatus(that.getStatus());
		setDescription(that.getDescription());
		setProcessCases(new java.util.LinkedHashSet<com.ttv.cashflow.domain.ProcessCase>(that.getProcessCases()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("baId=[").append(baId).append("] ");
		buffer.append("ledgerId=[").append(ledgerId).append("] ");
		buffer.append("approvalId=[").append(approvalId).append("] ");
		buffer.append("status=[").append(status).append("] ");
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
		if (!(obj instanceof ErrorDetails))
			return false;
		ErrorDetails equalCheck = (ErrorDetails) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
