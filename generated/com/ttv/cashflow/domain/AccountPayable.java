
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
		@NamedQuery(name = "findAccountPayableByApprovalCode", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.approvalCode = ?1"),
		@NamedQuery(name = "findAccountPayableByApprovalCodeContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.approvalCode like ?1"),
		@NamedQuery(name = "findAccountPayableByBankRef", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.bankRef = ?1"),
		@NamedQuery(name = "findAccountPayableByBankRefContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.bankRef like ?1"),
		@NamedQuery(name = "findAccountPayableByClaimType", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.claimType = ?1"),
		@NamedQuery(name = "findAccountPayableByClaimTypeContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.claimType like ?1"),
		@NamedQuery(name = "findAccountPayableByClassCode", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.classCode = ?1"),
		@NamedQuery(name = "findAccountPayableByClassCodeContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.classCode like ?1"),
		@NamedQuery(name = "findAccountPayableByClass_", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.class_ = ?1"),
		@NamedQuery(name = "findAccountPayableByClass_Containing", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.class_ like ?1"),
		@NamedQuery(name = "findAccountPayableByCorrespondingAccName", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.correspondingAccName = ?1"),
		@NamedQuery(name = "findAccountPayableByCorrespondingAccNameContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.correspondingAccName like ?1"),
		@NamedQuery(name = "findAccountPayableByCorrespondingAccNo", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.correspondingAccNo = ?1"),
		@NamedQuery(name = "findAccountPayableByCorrespondingAccNoContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.correspondingAccNo like ?1"),
		@NamedQuery(name = "findAccountPayableByCorrespondingAccType", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.correspondingAccType = ?1"),
		@NamedQuery(name = "findAccountPayableByCorrespondingAccTypeContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.correspondingAccType like ?1"),
		@NamedQuery(name = "findAccountPayableByCreatedDate", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.createdDate = ?1"),
		@NamedQuery(name = "findAccountPayableByDescription", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.description = ?1"),
		@NamedQuery(name = "findAccountPayableByDescriptionContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.description like ?1"),
		@NamedQuery(name = "findAccountPayableByExcludeGstAmount", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.excludeGstAmount = ?1"),
		@NamedQuery(name = "findAccountPayableByFilePath", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.filePath = ?1"),
		@NamedQuery(name = "findAccountPayableByFilePathContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.filePath like ?1"),
		@NamedQuery(name = "findAccountPayableByFxLossGain", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.fxLossGain = ?1"),
		@NamedQuery(name = "findAccountPayableByGst", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.gst = ?1"),
		@NamedQuery(name = "findAccountPayableByGstContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.gst like ?1"),
		@NamedQuery(name = "findAccountPayableById", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.id = ?1"),
		@NamedQuery(name = "findAccountPayableByIncludeGstAmount", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.includeGstAmount = ?1"),
		@NamedQuery(name = "findAccountPayableByInpt", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.inpt = ?1"),
		@NamedQuery(name = "findAccountPayableByInptContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.inpt like ?1"),
		@NamedQuery(name = "findAccountPayableByInvExRate", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.invExRate = ?1"),
		@NamedQuery(name = "findAccountPayableByInvVndAmount", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.invVndAmount = ?1"),
		@NamedQuery(name = "findAccountPayableByInvoiceNo", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.invoiceNo = ?1"),
		@NamedQuery(name = "findAccountPayableByInvoiceNoContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.invoiceNo like ?1"),
		@NamedQuery(name = "findAccountPayableByModifiedDate", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.modifiedDate = ?1"),
		@NamedQuery(name = "findAccountPayableByMonth", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.month = ?1"),
		@NamedQuery(name = "findAccountPayableByMonthContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.month like ?1"),
		@NamedQuery(name = "findAccountPayableByOriginalCurrency", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.originalCurrency = ?1"),
		@NamedQuery(name = "findAccountPayableByOriginalCurrencyContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.originalCurrency like ?1"),
		@NamedQuery(name = "findAccountPayableByPaidDate", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.paidDate = ?1"),
		@NamedQuery(name = "findAccountPayableByPaidExRate", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.paidExRate = ?1"),
		@NamedQuery(name = "findAccountPayableByPaidOriginalCurrencyAmount", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.paidOriginalCurrencyAmount = ?1"),
		@NamedQuery(name = "findAccountPayableByPaidVnAmount", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.paidVnAmount = ?1"),
		@NamedQuery(name = "findAccountPayableByPoNo", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.poNo = ?1"),
		@NamedQuery(name = "findAccountPayableByPoNoContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.poNo like ?1"),
		@NamedQuery(name = "findAccountPayableByPrimaryKey", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.id = ?1"),
		@NamedQuery(name = "findAccountPayableByPvNo", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.pvNo = ?1"),
		@NamedQuery(name = "findAccountPayableByPvNoContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.pvNo like ?1"),
		@NamedQuery(name = "findAccountPayableByRemainVn", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.remainVn = ?1"),
		@NamedQuery(name = "findAccountPayableBySettlementVoucherNo", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.settlementVoucherNo = ?1"),
		@NamedQuery(name = "findAccountPayableBySettlementVoucherNoContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.settlementVoucherNo like ?1"),
		@NamedQuery(name = "findAccountPayableByValidCode", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.validCode = ?1"),
		@NamedQuery(name = "findAccountPayableByValidCodeContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.validCode like ?1"),
		@NamedQuery(name = "findAccountPayableByVatType", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.vatType = ?1"),
		@NamedQuery(name = "findAccountPayableByVatTypeContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.vatType like ?1"),
		@NamedQuery(name = "findAccountPayableByVendorName", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.vendorName = ?1"),
		@NamedQuery(name = "findAccountPayableByVendorNameContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.vendorName like ?1"),
		@NamedQuery(name = "findAccountPayableByVendorType", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.vendorType = ?1"),
		@NamedQuery(name = "findAccountPayableByVendorTypeContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.vendorType like ?1"),
		@NamedQuery(name = "findAccountPayableByVoucherNo", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.voucherNo = ?1"),
		@NamedQuery(name = "findAccountPayableByVoucherNoContaining", query = "select myAccountPayable from AccountPayable myAccountPayable where myAccountPayable.voucherNo like ?1"),
		@NamedQuery(name = "findAllAccountPayables", query = "select myAccountPayable from AccountPayable myAccountPayable") })

@Table(schema = "public", name = "account_payable")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "AccountPayable")

public class AccountPayable implements Serializable {
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

	@Column(name = "voucher_no", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String voucherNo;
	/**
	 */

	@Column(name = "po_no")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String poNo;
	/**
	 */

	@Column(name = "month", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String month;
	/**
	 */

	@Column(name = "vendor_name")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String vendorName;
	/**
	 */

	@Column(name = "vendor_type", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String vendorType;
	/**
	 */

	@Column(name = "claim_type", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String claimType;
	/**
	 */

	@Column(name = "invoice_no", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String invoiceNo;
	/**
	 */

	@Column(name = "corresponding_acc_name", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String correspondingAccName;
	/**
	 */

	@Column(name = "corresponding_acc_no", length = 80, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String correspondingAccNo;
	/**
	 */

	@Column(name = "corresponding_acc_type")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String correspondingAccType;
	/**
	 */

	@Column(name = "class", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String class_;
	/**
	 */

	@Column(name = "class_code", length = 80)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String classCode;
	/**
	 */

	@Column(name = "description")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String description;
	/**
	 */

	@Column(name = "original_currency", length = 40)
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

	@Column(name = "gst", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String gst;
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

	@Column(name = "pv_no", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String pvNo;
	/**
	 */

	@Column(name = "bank_ref", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String bankRef;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "paid_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar paidDate;
	/**
	 */

	@Column(name = "paid_original_currency_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal paidOriginalCurrencyAmount;
	/**
	 */

	@Column(name = "paid_ex_rate", scale = 8, precision = 8)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal paidExRate;
	/**
	 */

	@Column(name = "paid_vn_amount", scale = 17, precision = 17)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal paidVnAmount;
	/**
	 */

	@Column(name = "fx_loss_gain", scale = 8, precision = 8)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal fxLossGain;
	/**
	 */

	@Column(name = "remain_vn", scale = 8, precision = 8)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	BigDecimal remainVn;
	/**
	 */

	@Column(name = "approval_code", length = 40)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String approvalCode;
	/**
	 */

	@Column(name = "settlement_voucher_no", length = 20)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String settlementVoucherNo;
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
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	/**
	 */
	public String getPoNo() {
		return this.poNo;
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
	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	/**
	 */
	public String getVendorType() {
		return this.vendorType;
	}

	/**
	 */
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}

	/**
	 */
	public String getClaimType() {
		return this.claimType;
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
	public void setCorrespondingAccType(String correspondingAccType) {
		this.correspondingAccType = correspondingAccType;
	}

	/**
	 */
	public String getCorrespondingAccType() {
		return this.correspondingAccType;
	}

	/**
	 */
	public void setClass_(String class_) {
		this.class_ = class_;
	}

	/**
	 */
	public String getClass_() {
		return this.class_;
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
	public void setGst(String gst) {
		this.gst = gst;
	}

	/**
	 */
	public String getGst() {
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
	public void setPvNo(String pvNo) {
		this.pvNo = pvNo;
	}

	/**
	 */
	public String getPvNo() {
		return this.pvNo;
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
	public void setPaidDate(Calendar paidDate) {
		this.paidDate = paidDate;
	}

	/**
	 */
	public Calendar getPaidDate() {
		return this.paidDate;
	}

	/**
	 */
	public void setPaidOriginalCurrencyAmount(BigDecimal paidOriginalCurrencyAmount) {
		this.paidOriginalCurrencyAmount = paidOriginalCurrencyAmount;
	}

	/**
	 */
	public BigDecimal getPaidOriginalCurrencyAmount() {
		return this.paidOriginalCurrencyAmount;
	}

	/**
	 */
	public void setPaidExRate(BigDecimal paidExRate) {
		this.paidExRate = paidExRate;
	}

	/**
	 */
	public BigDecimal getPaidExRate() {
		return this.paidExRate;
	}

	/**
	 */
	public void setPaidVnAmount(BigDecimal paidVnAmount) {
		this.paidVnAmount = paidVnAmount;
	}

	/**
	 */
	public BigDecimal getPaidVnAmount() {
		return this.paidVnAmount;
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
	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	/**
	 */
	public String getApprovalCode() {
		return this.approvalCode;
	}

	/**
	 */
	public void setSettlementVoucherNo(String settlementVoucherNo) {
		this.settlementVoucherNo = settlementVoucherNo;
	}

	/**
	 */
	public String getSettlementVoucherNo() {
		return this.settlementVoucherNo;
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
	public AccountPayable() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(AccountPayable that) {
		setId(that.getId());
		setInpt(that.getInpt());
		setVoucherNo(that.getVoucherNo());
		setPoNo(that.getPoNo());
		setMonth(that.getMonth());
		setVendorName(that.getVendorName());
		setVendorType(that.getVendorType());
		setClaimType(that.getClaimType());
		setInvoiceNo(that.getInvoiceNo());
		setCorrespondingAccName(that.getCorrespondingAccName());
		setCorrespondingAccNo(that.getCorrespondingAccNo());
		setCorrespondingAccType(that.getCorrespondingAccType());
		setClass_(that.getClass_());
		setClassCode(that.getClassCode());
		setDescription(that.getDescription());
		setOriginalCurrency(that.getOriginalCurrency());
		setVatType(that.getVatType());
		setExcludeGstAmount(that.getExcludeGstAmount());
		setGst(that.getGst());
		setIncludeGstAmount(that.getIncludeGstAmount());
		setInvExRate(that.getInvExRate());
		setInvVndAmount(that.getInvVndAmount());
		setPvNo(that.getPvNo());
		setBankRef(that.getBankRef());
		setPaidDate(that.getPaidDate());
		setPaidOriginalCurrencyAmount(that.getPaidOriginalCurrencyAmount());
		setPaidExRate(that.getPaidExRate());
		setPaidVnAmount(that.getPaidVnAmount());
		setFxLossGain(that.getFxLossGain());
		setRemainVn(that.getRemainVn());
		setApprovalCode(that.getApprovalCode());
		setSettlementVoucherNo(that.getSettlementVoucherNo());
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
		buffer.append("voucherNo=[").append(voucherNo).append("] ");
		buffer.append("poNo=[").append(poNo).append("] ");
		buffer.append("month=[").append(month).append("] ");
		buffer.append("vendorName=[").append(vendorName).append("] ");
		buffer.append("vendorType=[").append(vendorType).append("] ");
		buffer.append("claimType=[").append(claimType).append("] ");
		buffer.append("invoiceNo=[").append(invoiceNo).append("] ");
		buffer.append("correspondingAccName=[").append(correspondingAccName).append("] ");
		buffer.append("correspondingAccNo=[").append(correspondingAccNo).append("] ");
		buffer.append("correspondingAccType=[").append(correspondingAccType).append("] ");
		buffer.append("class_=[").append(class_).append("] ");
		buffer.append("classCode=[").append(classCode).append("] ");
		buffer.append("description=[").append(description).append("] ");
		buffer.append("originalCurrency=[").append(originalCurrency).append("] ");
		buffer.append("vatType=[").append(vatType).append("] ");
		buffer.append("excludeGstAmount=[").append(excludeGstAmount).append("] ");
		buffer.append("gst=[").append(gst).append("] ");
		buffer.append("includeGstAmount=[").append(includeGstAmount).append("] ");
		buffer.append("invExRate=[").append(invExRate).append("] ");
		buffer.append("invVndAmount=[").append(invVndAmount).append("] ");
		buffer.append("pvNo=[").append(pvNo).append("] ");
		buffer.append("bankRef=[").append(bankRef).append("] ");
		buffer.append("paidDate=[").append(paidDate).append("] ");
		buffer.append("paidOriginalCurrencyAmount=[").append(paidOriginalCurrencyAmount).append("] ");
		buffer.append("paidExRate=[").append(paidExRate).append("] ");
		buffer.append("paidVnAmount=[").append(paidVnAmount).append("] ");
		buffer.append("fxLossGain=[").append(fxLossGain).append("] ");
		buffer.append("remainVn=[").append(remainVn).append("] ");
		buffer.append("approvalCode=[").append(approvalCode).append("] ");
		buffer.append("settlementVoucherNo=[").append(settlementVoucherNo).append("] ");
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
		if (!(obj instanceof AccountPayable))
			return false;
		AccountPayable equalCheck = (AccountPayable) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
