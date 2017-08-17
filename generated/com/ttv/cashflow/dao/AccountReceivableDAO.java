
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.AccountReceivable;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage AccountReceivable entities.
 * 
 */
public interface AccountReceivableDAO extends JpaDao<AccountReceivable> {

	/**
	 * JPQL Query - findAccountReceivableByVatType
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVatType(String vatType) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByVatType
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVatType(String vatType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespodingAccName
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccName(String correspodingAccName) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespodingAccName
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccName(String correspodingAccName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByValidCode
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByValidCode(String validCode) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByValidCode
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByIncludeGstAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByIncludeGstAmount(java.math.BigDecimal includeGstAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByIncludeGstAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByIncludeGstAmount(BigDecimal includeGstAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByDescriptionContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByDescriptionContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByPrimaryKey
	 *
	 */
	public AccountReceivable findAccountReceivableByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByPrimaryKey
	 *
	 */
	public AccountReceivable findAccountReceivableByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNo(String correspondingAccNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNo(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByMonth
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByMonth(String month) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByMonth
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByMonth(String month, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrencyContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrencyContaining(String originalCurrency) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrencyContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrencyContaining(String originalCurrency, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByExcludeGstAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByExcludeGstAmount(java.math.BigDecimal excludeGstAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByExcludeGstAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByExcludeGstAmount(BigDecimal excludeGstAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCustomerName
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCustomerName(String customerName) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCustomerName
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCustomerName(String customerName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvVndAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvVndAmount(java.math.BigDecimal invVndAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvVndAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvVndAmount(BigDecimal invVndAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInptContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInptContaining(String inpt) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInptContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInptContaining(String inpt, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByVatTypeContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVatTypeContaining(String vatType_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByVatTypeContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVatTypeContaining(String vatType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvoiceNo(String invoiceNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvoiceNo(String invoiceNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByVoucherNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVoucherNoContaining(String voucherNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByVoucherNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVoucherNoContaining(String voucherNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvExRate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvExRate(java.math.BigDecimal invExRate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvExRate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvExRate(BigDecimal invExRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespodingAccNameContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccNameContaining(String correspodingAccName_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespodingAccNameContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccNameContaining(String correspodingAccName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInpt
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInpt(String inpt_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInpt
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInpt(String inpt_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByRemainVn
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByRemainVn(java.math.BigDecimal remainVn) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByRemainVn
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByRemainVn(BigDecimal remainVn, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByGst
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByGst(java.math.BigDecimal gst) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByGst
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByGst(BigDecimal gst, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByMonthContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByMonthContaining(String month_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByMonthContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByMonthContaining(String month_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAccountReceivables
	 *
	 */
	public Set<AccountReceivable> findAllAccountReceivables() throws DataAccessException;

	/**
	 * JPQL Query - findAllAccountReceivables
	 *
	 */
	public Set<AccountReceivable> findAllAccountReceivables(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByContractNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByContractNo(String contractNo) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByContractNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByContractNo(String contractNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByDescription
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByDescription
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptOriginalCurrencyAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptOriginalCurrencyAmount(java.math.BigDecimal receiptOriginalCurrencyAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptOriginalCurrencyAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptOriginalCurrencyAmount(BigDecimal receiptOriginalCurrencyAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableById
	 *
	 */
	public AccountReceivable findAccountReceivableById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableById
	 *
	 */
	public AccountReceivable findAccountReceivableById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByContractNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByContractNoContaining(String contractNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByContractNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByContractNoContaining(String contractNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrency
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrency(String originalCurrency_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrency
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrency(String originalCurrency_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNoContaining(String correspondingAccNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNoContaining(String correspondingAccNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCustomerNameContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCustomerNameContaining(String customerName_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCustomerNameContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCustomerNameContaining(String customerName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCreatedDate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCreatedDate(java.util.Calendar createdDate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByCreatedDate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByCreatedDate(Calendar createdDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByFxLossGain
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByFxLossGain(java.math.BigDecimal fxLossGain) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByFxLossGain
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByFxLossGain(BigDecimal fxLossGain, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptDate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptDate(java.util.Calendar receiptDate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptDate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptDate(Calendar receiptDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByClassCodeContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByClassCodeContaining(String classCode) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByClassCodeContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByClassCodeContaining(String classCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptExRate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptExRate(java.math.BigDecimal receiptExRate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptExRate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptExRate(BigDecimal receiptExRate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvoiceNoContaining(String invoiceNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNoContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByInvoiceNoContaining(String invoiceNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByFilePath
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByFilePath(String filePath) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByFilePath
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptVndAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptVndAmount(java.math.BigDecimal receiptVndAmount) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByReceiptVndAmount
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByReceiptVndAmount(BigDecimal receiptVndAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByModifiedDate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByModifiedDate
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByModifiedDate(Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByVoucherNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVoucherNo(String voucherNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByVoucherNo
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByVoucherNo(String voucherNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByClassCode
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByClassCode(String classCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByClassCode
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByClassCode(String classCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByFilePathContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByFilePathContaining(String filePath_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByFilePathContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByFilePathContaining(String filePath_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByValidCodeContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByValidCodeContaining(String validCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findAccountReceivableByValidCodeContaining
	 *
	 */
	public Set<AccountReceivable> findAccountReceivableByValidCodeContaining(String validCode_1, int startResult, int maxRows) throws DataAccessException;

}