
package com.ttv.cashflow.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.util.Calendar;
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
		@NamedQuery(name = "findAllApprovals", query = "select myApproval from Approval myApproval"),
		@NamedQuery(name = "findApprovalByApprovalDate", query = "select myApproval from Approval myApproval where myApproval.approvalDate = ?1"),
		@NamedQuery(name = "findApprovalByBalance", query = "select myApproval from Approval myApproval where myApproval.balance = ?1"),
		@NamedQuery(name = "findApprovalByBankRef", query = "select myApproval from Approval myApproval where myApproval.bankRef = ?1"),
		@NamedQuery(name = "findApprovalByBankRefContaining", query = "select myApproval from Approval myApproval where myApproval.bankRef like ?1"),
		@NamedQuery(name = "findApprovalByBankingDescription", query = "select myApproval from Approval myApproval where myApproval.bankingDescription = ?1"),
		@NamedQuery(name = "findApprovalByBankingDescriptionContaining", query = "select myApproval from Approval myApproval where myApproval.bankingDescription like ?1"),
		@NamedQuery(name = "findApprovalByCode", query = "select myApproval from Approval myApproval where myApproval.code = ?1"),
		@NamedQuery(name = "findApprovalByCodeContaining", query = "select myApproval from Approval myApproval where myApproval.code like ?1"),
		@NamedQuery(name = "findApprovalByCreatedDate", query = "select myApproval from Approval myApproval where myApproval.createdDate = ?1"),
		@NamedQuery(name = "findApprovalByCreditAmount", query = "select myApproval from Approval myApproval where myApproval.creditAmount = ?1"),
		@NamedQuery(name = "findApprovalByDebitAmount", query = "select myApproval from Approval myApproval where myApproval.debitAmount = ?1"),
		@NamedQuery(name = "findApprovalByFilePath", query = "select myApproval from Approval myApproval where myApproval.filePath = ?1"),
		@NamedQuery(name = "findApprovalByFilePathContaining", query = "select myApproval from Approval myApproval where myApproval.filePath like ?1"),
		@NamedQuery(name = "findApprovalById", query = "select myApproval from Approval myApproval where myApproval.id = ?1"),
		@NamedQuery(name = "findApprovalByInvoiceCode", query = "select myApproval from Approval myApproval where myApproval.invoiceCode = ?1"),
		@NamedQuery(name = "findApprovalByInvoiceCodeContaining", query = "select myApproval from Approval myApproval where myApproval.invoiceCode like ?1"),
		@NamedQuery(name = "findApprovalByLedgerDescription", query = "select myApproval from Approval myApproval where myApproval.ledgerDescription = ?1"),
		@NamedQuery(name = "findApprovalByLedgerDescriptionContaining", query = "select myApproval from Approval myApproval where myApproval.ledgerDescription like ?1"),
		@NamedQuery(name = "findApprovalByLedgerName", query = "select myApproval from Approval myApproval where myApproval.ledgerName = ?1"),
		@NamedQuery(name = "findApprovalByLedgerNameContaining", query = "select myApproval from Approval myApproval where myApproval.ledgerName like ?1"),
		@NamedQuery(name = "findApprovalByLegderType", query = "select myApproval from Approval myApproval where myApproval.legderType = ?1"),
		@NamedQuery(name = "findApprovalByModifiedDate", query = "select myApproval from Approval myApproval where myApproval.modifiedDate = ?1"),
		@NamedQuery(name = "findApprovalByPrimaryKey", query = "select myApproval from Approval myApproval where myApproval.id = ?1"),
		@NamedQuery(name = "findApprovalByValidCode", query = "select myApproval from Approval myApproval where myApproval.validCode = ?1"),
		@NamedQuery(name = "findApprovalByValidCodeContaining", query = "select myApproval from Approval myApproval where myApproval.validCode like ?1") })

@Table(schema = "public", name = "approval")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "Approval")

public class Approval implements Serializable {
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

	@Column(name = "code", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String code;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "approval_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar approvalDate;
	/**
	 */

	@Column(name = "banking_description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String bankingDescription;
	/**
	 */

	@Column(name = "debit_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal debitAmount;
	/**
	 */

	@Column(name = "credit_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal creditAmount;
	/**
	 */

	@Column(name = "balance", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal balance;
	/**
	 */

	@Column(name = "ledger_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String ledgerName;
	/**
	 */

	@Column(name = "ledger_description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String ledgerDescription;
	/**
	 */

	@Column(name = "invoice_code", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String invoiceCode;
	/**
	 */

	@Column(name = "bank_ref", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String bankRef;
	/**
	 */

	@Column(name = "legder_type")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer legderType;
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

	@Column(name = "valid_code", length = 3)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String validCode;
	/**
	 */

	@Column(name = "file_path", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String filePath;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "company_id", referencedColumnName = "id") })
	@XmlTransient
	Comapny comapny;

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
	public void setApprovalDate(Calendar approvalDate) {
		this.approvalDate = approvalDate;
	}

	/**
	 */
	public Calendar getApprovalDate() {
		return this.approvalDate;
	}

	/**
	 */
	public void setBankingDescription(String bankingDescription) {
		this.bankingDescription = bankingDescription;
	}

	/**
	 */
	public String getBankingDescription() {
		return this.bankingDescription;
	}

	/**
	 */
	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}

	/**
	 */
	public BigDecimal getDebitAmount() {
		return this.debitAmount;
	}

	/**
	 */
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	/**
	 */
	public BigDecimal getCreditAmount() {
		return this.creditAmount;
	}

	/**
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	/**
	 */
	public BigDecimal getBalance() {
		return this.balance;
	}

	/**
	 */
	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
	}

	/**
	 */
	public String getLedgerName() {
		return this.ledgerName;
	}

	/**
	 */
	public void setLedgerDescription(String ledgerDescription) {
		this.ledgerDescription = ledgerDescription;
	}

	/**
	 */
	public String getLedgerDescription() {
		return this.ledgerDescription;
	}

	/**
	 */
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	/**
	 */
	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	/**
	 */
	public void setBankRef(String bankRef) {
		this.bankRef = bankRef;
	}

	/**
	 */
	public String getBankRef() {
		return this.bankRef;
	}

	/**
	 */
	public void setLegderType(Integer legderType) {
		this.legderType = legderType;
	}

	/**
	 */
	public Integer getLegderType() {
		return this.legderType;
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
	public Approval() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Approval that) {
		setId(that.getId());
		setCode(that.getCode());
		setApprovalDate(that.getApprovalDate());
		setBankingDescription(that.getBankingDescription());
		setDebitAmount(that.getDebitAmount());
		setCreditAmount(that.getCreditAmount());
		setBalance(that.getBalance());
		setLedgerName(that.getLedgerName());
		setLedgerDescription(that.getLedgerDescription());
		setInvoiceCode(that.getInvoiceCode());
		setBankRef(that.getBankRef());
		setLegderType(that.getLegderType());
		setCreatedDate(that.getCreatedDate());
		setModifiedDate(that.getModifiedDate());
		setValidCode(that.getValidCode());
		setFilePath(that.getFilePath());
		setComapny(that.getComapny());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("code=[").append(code).append("] ");
		buffer.append("approvalDate=[").append(approvalDate).append("] ");
		buffer.append("bankingDescription=[").append(bankingDescription).append("] ");
		buffer.append("debitAmount=[").append(debitAmount).append("] ");
		buffer.append("creditAmount=[").append(creditAmount).append("] ");
		buffer.append("balance=[").append(balance).append("] ");
		buffer.append("ledgerName=[").append(ledgerName).append("] ");
		buffer.append("ledgerDescription=[").append(ledgerDescription).append("] ");
		buffer.append("invoiceCode=[").append(invoiceCode).append("] ");
		buffer.append("bankRef=[").append(bankRef).append("] ");
		buffer.append("legderType=[").append(legderType).append("] ");
		buffer.append("createdDate=[").append(createdDate).append("] ");
		buffer.append("modifiedDate=[").append(modifiedDate).append("] ");
		buffer.append("validCode=[").append(validCode).append("] ");
		buffer.append("filePath=[").append(filePath).append("] ");

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
		if (!(obj instanceof Approval))
			return false;
		Approval equalCheck = (Approval) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
