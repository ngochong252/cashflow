
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
		@NamedQuery(name = "findAllBankingAccountings", query = "select myBankingAccounting from BankingAccounting myBankingAccounting"),
		@NamedQuery(name = "findBankingAccountingByAppovalCode", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.appovalCode = ?1"),
		@NamedQuery(name = "findBankingAccountingByAppovalCodeContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.appovalCode like ?1"),
		@NamedQuery(name = "findBankingAccountingByBalanceOriginalCurrency", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.balanceOriginalCurrency = ?1"),
		@NamedQuery(name = "findBankingAccountingByBalanceVnd", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.balanceVnd = ?1"),
		@NamedQuery(name = "findBankingAccountingByBankRef", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.bankRef = ?1"),
		@NamedQuery(name = "findBankingAccountingByBankRefContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.bankRef like ?1"),
		@NamedQuery(name = "findBankingAccountingByCorrespondingAccName", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.correspondingAccName = ?1"),
		@NamedQuery(name = "findBankingAccountingByCorrespondingAccNameContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.correspondingAccName like ?1"),
		@NamedQuery(name = "findBankingAccountingByCorrespondingAccNo", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.correspondingAccNo = ?1"),
		@NamedQuery(name = "findBankingAccountingByCorrespondingAccNoContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.correspondingAccNo like ?1"),
		@NamedQuery(name = "findBankingAccountingByCreatedDate", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.createdDate = ?1"),
		@NamedQuery(name = "findBankingAccountingByDescription", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.description = ?1"),
		@NamedQuery(name = "findBankingAccountingByDescriptionContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.description like ?1"),
		@NamedQuery(name = "findBankingAccountingByFilePath", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.filePath = ?1"),
		@NamedQuery(name = "findBankingAccountingByFilePathContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.filePath like ?1"),
		@NamedQuery(name = "findBankingAccountingById", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.id = ?1"),
		@NamedQuery(name = "findBankingAccountingByInOriginalCurrency", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.inOriginalCurrency = ?1"),
		@NamedQuery(name = "findBankingAccountingByInVnd", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.inVnd = ?1"),
		@NamedQuery(name = "findBankingAccountingByModifiedDate", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.modifiedDate = ?1"),
		@NamedQuery(name = "findBankingAccountingByOutOriginalCurrency", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.outOriginalCurrency = ?1"),
		@NamedQuery(name = "findBankingAccountingByOutVnd", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.outVnd = ?1"),
		@NamedQuery(name = "findBankingAccountingByPrimaryKey", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.id = ?1"),
		@NamedQuery(name = "findBankingAccountingByTransactionDate", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.transactionDate = ?1"),
		@NamedQuery(name = "findBankingAccountingByValidCode", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.validCode = ?1"),
		@NamedQuery(name = "findBankingAccountingByValidCodeContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.validCode like ?1"),
		@NamedQuery(name = "findBankingAccountingByVendorName", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.vendorName = ?1"),
		@NamedQuery(name = "findBankingAccountingByVendorNameContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.vendorName like ?1"),
		@NamedQuery(name = "findBankingAccountingByVoucherDate", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.voucherDate = ?1"),
		@NamedQuery(name = "findBankingAccountingByVoucherDateAfter", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.voucherDate > ?1"),
		@NamedQuery(name = "findBankingAccountingByVoucherDateBefore", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.voucherDate < ?1"),
		@NamedQuery(name = "findBankingAccountingByVoucherNo", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.voucherNo = ?1"),
		@NamedQuery(name = "findBankingAccountingByVoucherNoContaining", query = "select myBankingAccounting from BankingAccounting myBankingAccounting where myBankingAccounting.voucherNo like ?1") })

@Table(schema = "public", name = "banking_accounting")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "BankingAccounting")

public class BankingAccounting implements Serializable {
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
	@Column(name = "transaction_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar transactionDate;
	/**
	 */

	@Column(name = "in_original_currency", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal inOriginalCurrency;
	/**
	 */

	@Column(name = "out_original_currency", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal outOriginalCurrency;
	/**
	 */

	@Column(name = "balance_original_currency", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal balanceOriginalCurrency;
	/**
	 */

	@Column(name = "in_vnd", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal inVnd;
	/**
	 */

	@Column(name = "out_vnd", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal outVnd;
	/**
	 */

	@Column(name = "balance_vnd", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal balanceVnd;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "corresponding_acc_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String correspondingAccName;
	/**
	 */

	@Column(name = "voucher_no", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String voucherNo;
	/**
	 */

	@Column(name = "appoval_code", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String appovalCode;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "voucher_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar voucherDate;
	/**
	 */

	@Column(name = "vendor_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String vendorName;
	/**
	 */

	@Column(name = "bank_ref")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String bankRef;
	/**
	 */

	@Column(name = "corresponding_acc_no", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String correspondingAccNo;
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
	@JoinColumns({ @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false) })
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
	public void setTransactionDate(Calendar transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 */
	public Calendar getTransactionDate() {
		return this.transactionDate;
	}

	/**
	 */
	public void setInOriginalCurrency(BigDecimal inOriginalCurrency) {
		this.inOriginalCurrency = inOriginalCurrency;
	}

	/**
	 */
	public BigDecimal getInOriginalCurrency() {
		return this.inOriginalCurrency;
	}

	/**
	 */
	public void setOutOriginalCurrency(BigDecimal outOriginalCurrency) {
		this.outOriginalCurrency = outOriginalCurrency;
	}

	/**
	 */
	public BigDecimal getOutOriginalCurrency() {
		return this.outOriginalCurrency;
	}

	/**
	 */
	public void setBalanceOriginalCurrency(BigDecimal balanceOriginalCurrency) {
		this.balanceOriginalCurrency = balanceOriginalCurrency;
	}

	/**
	 */
	public BigDecimal getBalanceOriginalCurrency() {
		return this.balanceOriginalCurrency;
	}

	/**
	 */
	public void setInVnd(BigDecimal inVnd) {
		this.inVnd = inVnd;
	}

	/**
	 */
	public BigDecimal getInVnd() {
		return this.inVnd;
	}

	/**
	 */
	public void setOutVnd(BigDecimal outVnd) {
		this.outVnd = outVnd;
	}

	/**
	 */
	public BigDecimal getOutVnd() {
		return this.outVnd;
	}

	/**
	 */
	public void setBalanceVnd(BigDecimal balanceVnd) {
		this.balanceVnd = balanceVnd;
	}

	/**
	 */
	public BigDecimal getBalanceVnd() {
		return this.balanceVnd;
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
	public void setCorrespondingAccName(String correspondingAccName) {
		this.correspondingAccName = correspondingAccName;
	}

	/**
	 */
	public String getCorrespondingAccName() {
		return this.correspondingAccName;
	}

	/**
	 */
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	/**
	 */
	public String getVoucherNo() {
		return this.voucherNo;
	}

	/**
	 */
	public void setAppovalCode(String appovalCode) {
		this.appovalCode = appovalCode;
	}

	/**
	 */
	public String getAppovalCode() {
		return this.appovalCode;
	}

	/**
	 */
	public void setVoucherDate(Calendar voucherDate) {
		this.voucherDate = voucherDate;
	}

	/**
	 */
	public Calendar getVoucherDate() {
		return this.voucherDate;
	}

	/**
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	/**
	 */
	public String getVendorName() {
		return this.vendorName;
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
	public void setCorrespondingAccNo(String correspondingAccNo) {
		this.correspondingAccNo = correspondingAccNo;
	}

	/**
	 */
	public String getCorrespondingAccNo() {
		return this.correspondingAccNo;
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
	public BankingAccounting() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(BankingAccounting that) {
		setId(that.getId());
		setTransactionDate(that.getTransactionDate());
		setInOriginalCurrency(that.getInOriginalCurrency());
		setOutOriginalCurrency(that.getOutOriginalCurrency());
		setBalanceOriginalCurrency(that.getBalanceOriginalCurrency());
		setInVnd(that.getInVnd());
		setOutVnd(that.getOutVnd());
		setBalanceVnd(that.getBalanceVnd());
		setDescription(that.getDescription());
		setCorrespondingAccName(that.getCorrespondingAccName());
		setVoucherNo(that.getVoucherNo());
		setAppovalCode(that.getAppovalCode());
		setVoucherDate(that.getVoucherDate());
		setVendorName(that.getVendorName());
		setBankRef(that.getBankRef());
		setCorrespondingAccNo(that.getCorrespondingAccNo());
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
		buffer.append("transactionDate=[").append(transactionDate).append("] ");
		buffer.append("inOriginalCurrency=[").append(inOriginalCurrency).append("] ");
		buffer.append("outOriginalCurrency=[").append(outOriginalCurrency).append("] ");
		buffer.append("balanceOriginalCurrency=[").append(balanceOriginalCurrency).append("] ");
		buffer.append("inVnd=[").append(inVnd).append("] ");
		buffer.append("outVnd=[").append(outVnd).append("] ");
		buffer.append("balanceVnd=[").append(balanceVnd).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("correspondingAccName=[").append(correspondingAccName).append("] ");
		buffer.append("voucherNo=[").append(voucherNo).append("] ");
		buffer.append("appovalCode=[").append(appovalCode).append("] ");
		buffer.append("voucherDate=[").append(voucherDate).append("] ");
		buffer.append("vendorName=[").append(vendorName).append("] ");
		buffer.append("bankRef=[").append(bankRef).append("] ");
		buffer.append("correspondingAccNo=[").append(correspondingAccNo).append("] ");
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
		if (!(obj instanceof BankingAccounting))
			return false;
		BankingAccounting equalCheck = (BankingAccounting) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
