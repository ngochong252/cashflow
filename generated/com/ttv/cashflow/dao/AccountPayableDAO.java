
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.AccountPayable;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage AccountPayable entities.
 * 
 */
public interface AccountPayableDAO extends JpaDao<AccountPayable> {

	/**
	 * JPQL Query - findAccountPayableByFxLossGain
	 *
	 */
	public Set<AccountPayable> findAccountPayableByFxLossGain(java.math.BigDecimal fxLossGain) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByFxLossGain
	 *
	 */
	public Set<AccountPayable> findAccountPayableByFxLossGain(BigDecimal fxLossGain, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByMonth
	 *
	 */
	public Set<AccountPayable> findAccountPayableByMonth(String month) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByMonth
	 *
	 */
	public Set<AccountPayable> findAccountPayableByMonth(String month, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidExRate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidExRate(java.math.BigDecimal paidExRate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidExRate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidExRate(BigDecimal paidExRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvoiceNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvoiceNo(String invoiceNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvoiceNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvoiceNo(String invoiceNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByValidCode
	 *
	 */
	public Set<AccountPayable> findAccountPayableByValidCode(String validCode) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByValidCode
	 *
	 */
	public Set<AccountPayable> findAccountPayableByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPvNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPvNo(String pvNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPvNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPvNo(String pvNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInpt
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInpt(String inpt) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInpt
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInpt(String inpt, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorTypeContaining(String vendorType) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorTypeContaining(String vendorType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidOriginalCurrencyAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidOriginalCurrencyAmount(java.math.BigDecimal paidOriginalCurrencyAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidOriginalCurrencyAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidOriginalCurrencyAmount(BigDecimal paidOriginalCurrencyAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByFilePathContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByFilePathContaining(String filePath) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByFilePathContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNo(String correspondingAccNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNo(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClassCode
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClassCode(String classCode) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClassCode
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClassCode(String classCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPrimaryKey
	 *
	 */
	public AccountPayable findAccountPayableByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPrimaryKey
	 *
	 */
	public AccountPayable findAccountPayableByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccName
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccName(String correspondingAccName) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccName
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccName(String correspondingAccName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByFilePath
	 *
	 */
	public Set<AccountPayable> findAccountPayableByFilePath(String filePath_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByFilePath
	 *
	 */
	public Set<AccountPayable> findAccountPayableByFilePath(String filePath_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCreatedDate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCreatedDate(java.util.Calendar createdDate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCreatedDate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCreatedDate(Calendar createdDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPvNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPvNoContaining(String pvNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPvNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPvNoContaining(String pvNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableBySettlementVoucherNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNo(String settlementVoucherNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableBySettlementVoucherNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNo(String settlementVoucherNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPoNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPoNo(String poNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPoNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPoNo(String poNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvVndAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvVndAmount(java.math.BigDecimal invVndAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvVndAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvVndAmount(BigDecimal invVndAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableBySettlementVoucherNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNoContaining(String settlementVoucherNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableBySettlementVoucherNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNoContaining(String settlementVoucherNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByGst
	 *
	 */
	public Set<AccountPayable> findAccountPayableByGst(String gst) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByGst
	 *
	 */
	public Set<AccountPayable> findAccountPayableByGst(String gst, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClass_
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClass_(String class_) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClass_
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClass_(String class_, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByApprovalCode
	 *
	 */
	public Set<AccountPayable> findAccountPayableByApprovalCode(String approvalCode) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByApprovalCode
	 *
	 */
	public Set<AccountPayable> findAccountPayableByApprovalCode(String approvalCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVatTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVatTypeContaining(String vatType) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVatTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVatTypeContaining(String vatType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByDescriptionContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByDescriptionContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByValidCodeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByValidCodeContaining(String validCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByValidCodeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByValidCodeContaining(String validCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClassCodeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClassCodeContaining(String classCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClassCodeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClassCodeContaining(String classCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByApprovalCodeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByApprovalCodeContaining(String approvalCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByApprovalCodeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByApprovalCodeContaining(String approvalCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccTypeContaining(String correspondingAccType) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccTypeContaining(String correspondingAccType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClaimType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClaimType(String claimType) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClaimType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClaimType(String claimType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNameContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNameContaining(String correspondingAccName_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNameContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNameContaining(String correspondingAccName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorName
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorName(String vendorName) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorName
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorName(String vendorName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByModifiedDate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByModifiedDate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByModifiedDate(Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByGstContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByGstContaining(String gst_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByGstContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByGstContaining(String gst_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNoContaining(String correspondingAccNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNoContaining(String correspondingAccNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByExcludeGstAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByExcludeGstAmount(java.math.BigDecimal excludeGstAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByExcludeGstAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByExcludeGstAmount(BigDecimal excludeGstAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClass_Containing
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClass_Containing(String class__1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClass_Containing
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClass_Containing(String class__1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVoucherNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVoucherNoContaining(String voucherNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVoucherNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVoucherNoContaining(String voucherNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvExRate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvExRate(java.math.BigDecimal invExRate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvExRate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvExRate(BigDecimal invExRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorType(String vendorType_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorType(String vendorType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableById
	 *
	 */
	public AccountPayable findAccountPayableById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableById
	 *
	 */
	public AccountPayable findAccountPayableById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByMonthContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByMonthContaining(String month_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByMonthContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByMonthContaining(String month_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorNameContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorNameContaining(String vendorName_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVendorNameContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVendorNameContaining(String vendorName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVoucherNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVoucherNo(String voucherNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVoucherNo
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVoucherNo(String voucherNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByIncludeGstAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByIncludeGstAmount(java.math.BigDecimal includeGstAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByIncludeGstAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByIncludeGstAmount(BigDecimal includeGstAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPoNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPoNoContaining(String poNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPoNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPoNoContaining(String poNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByRemainVn
	 *
	 */
	public Set<AccountPayable> findAccountPayableByRemainVn(java.math.BigDecimal remainVn) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByRemainVn
	 *
	 */
	public Set<AccountPayable> findAccountPayableByRemainVn(BigDecimal remainVn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByBankRef
	 *
	 */
	public Set<AccountPayable> findAccountPayableByBankRef(String bankRef) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByBankRef
	 *
	 */
	public Set<AccountPayable> findAccountPayableByBankRef(String bankRef, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByBankRefContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByBankRefContaining(String bankRef_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByBankRefContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByBankRefContaining(String bankRef_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidDate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidDate(java.util.Calendar paidDate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidDate
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidDate(Calendar paidDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVatType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVatType(String vatType_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByVatType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByVatType(String vatType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidVnAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidVnAmount(java.math.BigDecimal paidVnAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByPaidVnAmount
	 *
	 */
	public Set<AccountPayable> findAccountPayableByPaidVnAmount(BigDecimal paidVnAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClaimTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClaimTypeContaining(String claimType_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByClaimTypeContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByClaimTypeContaining(String claimType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrency
	 *
	 */
	public Set<AccountPayable> findAccountPayableByOriginalCurrency(String originalCurrency) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrency
	 *
	 */
	public Set<AccountPayable> findAccountPayableByOriginalCurrency(String originalCurrency, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInptContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInptContaining(String inpt_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInptContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInptContaining(String inpt_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByDescription
	 *
	 */
	public Set<AccountPayable> findAccountPayableByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByDescription
	 *
	 */
	public Set<AccountPayable> findAccountPayableByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrencyContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByOriginalCurrencyContaining(String originalCurrency_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrencyContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByOriginalCurrencyContaining(String originalCurrency_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccType(String correspondingAccType_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccType
	 *
	 */
	public Set<AccountPayable> findAccountPayableByCorrespondingAccType(String correspondingAccType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAccountPayables
	 *
	 */
	public Set<AccountPayable> findAllAccountPayables() throws DataAccessException;

	/**
	 * JPQL Query - findAllAccountPayables
	 *
	 */
	public Set<AccountPayable> findAllAccountPayables(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvoiceNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvoiceNoContaining(String invoiceNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountPayableByInvoiceNoContaining
	 *
	 */
	public Set<AccountPayable> findAccountPayableByInvoiceNoContaining(String invoiceNo_1, int startResult, int maxRows) throws DataAccessException;

}