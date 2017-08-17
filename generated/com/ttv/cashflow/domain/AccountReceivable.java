
package com.ttv.cashflow.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;
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
		@NamedQuery(name = "findAccountReceivableByClassCode", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.classCode = ?1"),
		@NamedQuery(name = "findAccountReceivableByClassCodeContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.classCode like ?1"),
		@NamedQuery(name = "findAccountReceivableByContractNo", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.contractNo = ?1"),
		@NamedQuery(name = "findAccountReceivableByContractNoContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.contractNo like ?1"),
		@NamedQuery(name = "findAccountReceivableByCorrespodingAccName", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.correspodingAccName = ?1"),
		@NamedQuery(name = "findAccountReceivableByCorrespodingAccNameContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.correspodingAccName like ?1"),
		@NamedQuery(name = "findAccountReceivableByCorrespondingAccNo", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.correspondingAccNo = ?1"),
		@NamedQuery(name = "findAccountReceivableByCorrespondingAccNoContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.correspondingAccNo like ?1"),
		@NamedQuery(name = "findAccountReceivableByCreatedDate", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.createdDate = ?1"),
		@NamedQuery(name = "findAccountReceivableByCustomerName", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.customerName = ?1"),
		@NamedQuery(name = "findAccountReceivableByCustomerNameContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.customerName like ?1"),
		@NamedQuery(name = "findAccountReceivableByDescription", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.description = ?1"),
		@NamedQuery(name = "findAccountReceivableByDescriptionContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.description like ?1"),
		@NamedQuery(name = "findAccountReceivableByExcludeGstAmount", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.excludeGstAmount = ?1"),
		@NamedQuery(name = "findAccountReceivableByFilePath", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.filePath = ?1"),
		@NamedQuery(name = "findAccountReceivableByFilePathContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.filePath like ?1"),
		@NamedQuery(name = "findAccountReceivableByFxLossGain", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.fxLossGain = ?1"),
		@NamedQuery(name = "findAccountReceivableByGst", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.gst = ?1"),
		@NamedQuery(name = "findAccountReceivableById", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.id = ?1"),
		@NamedQuery(name = "findAccountReceivableByIncludeGstAmount", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.includeGstAmount = ?1"),
		@NamedQuery(name = "findAccountReceivableByInpt", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.inpt = ?1"),
		@NamedQuery(name = "findAccountReceivableByInptContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.inpt like ?1"),
		@NamedQuery(name = "findAccountReceivableByInvExRate", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.invExRate = ?1"),
		@NamedQuery(name = "findAccountReceivableByInvVndAmount", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.invVndAmount = ?1"),
		@NamedQuery(name = "findAccountReceivableByInvoiceNo", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.invoiceNo = ?1"),
		@NamedQuery(name = "findAccountReceivableByInvoiceNoContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.invoiceNo like ?1"),
		@NamedQuery(name = "findAccountReceivableByModifiedDate", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.modifiedDate = ?1"),
		@NamedQuery(name = "findAccountReceivableByMonth", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.month = ?1"),
		@NamedQuery(name = "findAccountReceivableByMonthContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.month like ?1"),
		@NamedQuery(name = "findAccountReceivableByOriginalCurrency", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.originalCurrency = ?1"),
		@NamedQuery(name = "findAccountReceivableByOriginalCurrencyContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.originalCurrency like ?1"),
		@NamedQuery(name = "findAccountReceivableByPrimaryKey", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.id = ?1"),
		@NamedQuery(name = "findAccountReceivableByReceiptDate", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.receiptDate = ?1"),
		@NamedQuery(name = "findAccountReceivableByReceiptExRate", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.receiptExRate = ?1"),
		@NamedQuery(name = "findAccountReceivableByReceiptOriginalCurrencyAmount", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.receiptOriginalCurrencyAmount = ?1"),
		@NamedQuery(name = "findAccountReceivableByReceiptVndAmount", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.receiptVndAmount = ?1"),
		@NamedQuery(name = "findAccountReceivableByRemainVn", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.remainVn = ?1"),
		@NamedQuery(name = "findAccountReceivableByValidCode", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.validCode = ?1"),
		@NamedQuery(name = "findAccountReceivableByValidCodeContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.validCode like ?1"),
		@NamedQuery(name = "findAccountReceivableByVatType", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.vatType = ?1"),
		@NamedQuery(name = "findAccountReceivableByVatTypeContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.vatType like ?1"),
		@NamedQuery(name = "findAccountReceivableByVoucherNo", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.voucherNo = ?1"),
		@NamedQuery(name = "findAccountReceivableByVoucherNoContaining", query = "select myAccountReceivable from AccountReceivable myAccountReceivable where myAccountReceivable.voucherNo like ?1"),
		@NamedQuery(name = "findAllAccountReceivables", query = "select myAccountReceivable from AccountReceivable myAccountReceivable") })

@Table(schema = "public", name = "account_receivable")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "AccountReceivable")

public class AccountReceivable implements Serializable {
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

	@Column(name = "inpt", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String inpt;
	/**
	 */

	@Column(name = "month", length = 10)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String month;
	/**
	 */

	@Column(name = "customer_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String customerName;
	/**
	 */

	@Column(name = "invoice_no", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String invoiceNo;
	/**
	 */

	@Column(name = "contract_no", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String contractNo;
	/**
	 */

	@Column(name = "original_currency", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String originalCurrency;
	/**
	 */

	@Column(name = "vat_type", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String vatType;
	/**
	 */

	@Column(name = "exclude_gst_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal excludeGstAmount;
	/**
	 */

	@Column(name = "gst", scale = 8, precision = 8)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal gst;
	/**
	 */

	@Column(name = "include_gst_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal includeGstAmount;
	/**
	 */

	@Column(name = "inv_ex_rate", scale = 8, precision = 8)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal invExRate;
	/**
	 */

	@Column(name = "inv_vnd_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal invVndAmount;
	/**
	 */

	@Column(name = "correspoding_acc_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String correspodingAccName;
	/**
	 */

	@Column(name = "class_code", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String classCode;
	/**
	 */

	@Column(name = "voucher_no")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String voucherNo;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "receipt_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar receiptDate;
	/**
	 */

	@Column(name = "receipt_original_currency_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal receiptOriginalCurrencyAmount;
	/**
	 */

	@Column(name = "receipt_ex_rate", scale = 8, precision = 8)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal receiptExRate;
	/**
	 */

	@Column(name = "receipt_vnd_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal receiptVndAmount;
	/**
	 */

	@Column(name = "fx_loss_gain", scale = 8, precision = 8)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal fxLossGain;
	/**
	 */

	@Column(name = "remain_vn", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal remainVn;
	/**
	 */

	@Column(name = "corresponding_acc_no", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String correspondingAccNo;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
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
	@JoinColumns({ @JoinColumn(name = "id_ledger", referencedColumnName = "id") })
	@XmlTransient
	Ledger ledger;

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
	public void setInpt(String inpt) {
		this.inpt = inpt;
	}

	/**
	 */
	public String getInpt() {
		return this.inpt;
	}

	/**
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 */
	public String getMonth() {
		return this.month;
	}

	/**
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 */
	public String getCustomerName() {
		return this.customerName;
	}

	/**
	 */
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	/**
	 */
	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	/**
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	/**
	 */
	public String getContractNo() {
		return this.contractNo;
	}

	/**
	 */
	public void setOriginalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
	}

	/**
	 */
	public String getOriginalCurrency() {
		return this.originalCurrency;
	}

	/**
	 */
	public void setVatType(String vatType) {
		this.vatType = vatType;
	}

	/**
	 */
	public String getVatType() {
		return this.vatType;
	}

	/**
	 */
	public void setExcludeGstAmount(BigDecimal excludeGstAmount) {
		this.excludeGstAmount = excludeGstAmount;
	}

	/**
	 */
	public BigDecimal getExcludeGstAmount() {
		return this.excludeGstAmount;
	}

	/**
	 */
	public void setGst(BigDecimal gst) {
		this.gst = gst;
	}

	/**
	 */
	public BigDecimal getGst() {
		return this.gst;
	}

	/**
	 */
	public void setIncludeGstAmount(BigDecimal includeGstAmount) {
		this.includeGstAmount = includeGstAmount;
	}

	/**
	 */
	public BigDecimal getIncludeGstAmount() {
		return this.includeGstAmount;
	}

	/**
	 */
	public void setInvExRate(BigDecimal invExRate) {
		this.invExRate = invExRate;
	}

	/**
	 */
	public BigDecimal getInvExRate() {
		return this.invExRate;
	}

	/**
	 */
	public void setInvVndAmount(BigDecimal invVndAmount) {
		this.invVndAmount = invVndAmount;
	}

	/**
	 */
	public BigDecimal getInvVndAmount() {
		return this.invVndAmount;
	}

	/**
	 */
	public void setCorrespodingAccName(String correspodingAccName) {
		this.correspodingAccName = correspodingAccName;
	}

	/**
	 */
	public String getCorrespodingAccName() {
		return this.correspodingAccName;
	}

	/**
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	/**
	 */
	public String getClassCode() {
		return this.classCode;
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
	public void setReceiptDate(Calendar receiptDate) {
		this.receiptDate = receiptDate;
	}

	/**
	 */
	public Calendar getReceiptDate() {
		return this.receiptDate;
	}

	/**
	 */
	public void setReceiptOriginalCurrencyAmount(BigDecimal receiptOriginalCurrencyAmount) {
		this.receiptOriginalCurrencyAmount = receiptOriginalCurrencyAmount;
	}

	/**
	 */
	public BigDecimal getReceiptOriginalCurrencyAmount() {
		return this.receiptOriginalCurrencyAmount;
	}

	/**
	 */
	public void setReceiptExRate(BigDecimal receiptExRate) {
		this.receiptExRate = receiptExRate;
	}

	/**
	 */
	public BigDecimal getReceiptExRate() {
		return this.receiptExRate;
	}

	/**
	 */
	public void setReceiptVndAmount(BigDecimal receiptVndAmount) {
		this.receiptVndAmount = receiptVndAmount;
	}

	/**
	 */
	public BigDecimal getReceiptVndAmount() {
		return this.receiptVndAmount;
	}

	/**
	 */
	public void setFxLossGain(BigDecimal fxLossGain) {
		this.fxLossGain = fxLossGain;
	}

	/**
	 */
	public BigDecimal getFxLossGain() {
		return this.fxLossGain;
	}

	/**
	 */
	public void setRemainVn(BigDecimal remainVn) {
		this.remainVn = remainVn;
	}

	/**
	 */
	public BigDecimal getRemainVn() {
		return this.remainVn;
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
	public void setLedger(Ledger ledger) {
		this.ledger = ledger;
	}

	/**
	 */
	@JsonIgnore
	public Ledger getLedger() {
		return ledger;
	}

	/**
	 */
	public AccountReceivable() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(AccountReceivable that) {
		setId(that.getId());
		setInpt(that.getInpt());
		setMonth(that.getMonth());
		setCustomerName(that.getCustomerName());
		setInvoiceNo(that.getInvoiceNo());
		setContractNo(that.getContractNo());
		setOriginalCurrency(that.getOriginalCurrency());
		setVatType(that.getVatType());
		setExcludeGstAmount(that.getExcludeGstAmount());
		setGst(that.getGst());
		setIncludeGstAmount(that.getIncludeGstAmount());
		setInvExRate(that.getInvExRate());
		setInvVndAmount(that.getInvVndAmount());
		setCorrespodingAccName(that.getCorrespodingAccName());
		setClassCode(that.getClassCode());
		setVoucherNo(that.getVoucherNo());
		setReceiptDate(that.getReceiptDate());
		setReceiptOriginalCurrencyAmount(that.getReceiptOriginalCurrencyAmount());
		setReceiptExRate(that.getReceiptExRate());
		setReceiptVndAmount(that.getReceiptVndAmount());
		setFxLossGain(that.getFxLossGain());
		setRemainVn(that.getRemainVn());
		setCorrespondingAccNo(that.getCorrespondingAccNo());
		setDescription(that.getDescription());
		setCreatedDate(that.getCreatedDate());
		setModifiedDate(that.getModifiedDate());
		setValidCode(that.getValidCode());
		setFilePath(that.getFilePath());
		setLedger(that.getLedger());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("inpt=[").append(inpt).append("] ");
		buffer.append("month=[").append(month).append("] ");
		buffer.append("customerName=[").append(customerName).append("] ");
		buffer.append("invoiceNo=[").append(invoiceNo).append("] ");
		buffer.append("contractNo=[").append(contractNo).append("] ");
		buffer.append("originalCurrency=[").append(originalCurrency).append("] ");
		buffer.append("vatType=[").append(vatType).append("] ");
		buffer.append("excludeGstAmount=[").append(excludeGstAmount).append("] ");
		buffer.append("gst=[").append(gst).append("] ");
		buffer.append("includeGstAmount=[").append(includeGstAmount).append("] ");
		buffer.append("invExRate=[").append(invExRate).append("] ");
		buffer.append("invVndAmount=[").append(invVndAmount).append("] ");
		buffer.append("correspodingAccName=[").append(correspodingAccName).append("] ");
		buffer.append("classCode=[").append(classCode).append("] ");
		buffer.append("voucherNo=[").append(voucherNo).append("] ");
		buffer.append("receiptDate=[").append(receiptDate).append("] ");
		buffer.append("receiptOriginalCurrencyAmount=[").append(receiptOriginalCurrencyAmount).append("] ");
		buffer.append("receiptExRate=[").append(receiptExRate).append("] ");
		buffer.append("receiptVndAmount=[").append(receiptVndAmount).append("] ");
		buffer.append("fxLossGain=[").append(fxLossGain).append("] ");
		buffer.append("remainVn=[").append(remainVn).append("] ");
		buffer.append("correspondingAccNo=[").append(correspondingAccNo).append("] ");
		buffer.append("description=[").append(description).append("] ");
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
		if (!(obj instanceof AccountReceivable))
			return false;
		AccountReceivable equalCheck = (AccountReceivable) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
