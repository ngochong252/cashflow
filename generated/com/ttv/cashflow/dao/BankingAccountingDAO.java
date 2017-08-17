
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.BankingAccounting;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage BankingAccounting entities.
 * 
 */
public interface BankingAccountingDAO extends JpaDao<BankingAccounting> {

	/**
	 * JPQL Query - findBankingAccountingByModifiedDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByModifiedDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByModifiedDate(Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBalanceVnd
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBalanceVnd(java.math.BigDecimal balanceVnd) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBalanceVnd
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBalanceVnd(BigDecimal balanceVnd, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByFilePathContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByFilePathContaining(String filePath) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByFilePathContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVendorName
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVendorName(String vendorName) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVendorName
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVendorName(String vendorName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherDate(java.util.Calendar voucherDate) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherDate(Calendar voucherDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVendorNameContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVendorNameContaining(String vendorName_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVendorNameContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVendorNameContaining(String vendorName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNo
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNo(String correspondingAccNo) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNo
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNo(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCreatedDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCreatedDate(java.util.Calendar createdDate) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCreatedDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCreatedDate(Calendar createdDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNoContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNoContaining(String correspondingAccNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNoContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNoContaining(String correspondingAccNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingById
	 *
	 */
	public BankingAccounting findBankingAccountingById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingById
	 *
	 */
	public BankingAccounting findBankingAccountingById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateAfter
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherDateAfter(java.util.Calendar voucherDate_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateAfter
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherDateAfter(Calendar voucherDate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccName
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccName(String correspondingAccName) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccName
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccName(String correspondingAccName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByTransactionDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByTransactionDate(java.util.Calendar transactionDate) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByTransactionDate
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByTransactionDate(Calendar transactionDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByPrimaryKey
	 *
	 */
	public BankingAccounting findBankingAccountingByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByPrimaryKey
	 *
	 */
	public BankingAccounting findBankingAccountingByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBankRefContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBankRefContaining(String bankRef) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBankRefContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBankRefContaining(String bankRef, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateBefore
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherDateBefore(java.util.Calendar voucherDate_2) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateBefore
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherDateBefore(Calendar voucherDate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByDescriptionContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByDescriptionContaining(String description) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByDescriptionContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherNoContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherNoContaining(String voucherNo) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherNoContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherNoContaining(String voucherNo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBalanceOriginalCurrency
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBalanceOriginalCurrency(java.math.BigDecimal balanceOriginalCurrency) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBalanceOriginalCurrency
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBalanceOriginalCurrency(BigDecimal balanceOriginalCurrency, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBankingAccountings
	 *
	 */
	public Set<BankingAccounting> findAllBankingAccountings() throws DataAccessException;

	/**
	 * JPQL Query - findAllBankingAccountings
	 *
	 */
	public Set<BankingAccounting> findAllBankingAccountings(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByInVnd
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByInVnd(java.math.BigDecimal inVnd) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByInVnd
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByInVnd(BigDecimal inVnd, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBankRef
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBankRef(String bankRef_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByBankRef
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByBankRef(String bankRef_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByInOriginalCurrency
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByInOriginalCurrency(java.math.BigDecimal inOriginalCurrency) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByInOriginalCurrency
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByInOriginalCurrency(BigDecimal inOriginalCurrency, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByFilePath
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByFilePath(String filePath_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByFilePath
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByFilePath(String filePath_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherNo
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherNo(String voucherNo_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByVoucherNo
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByVoucherNo(String voucherNo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByAppovalCodeContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByAppovalCodeContaining(String appovalCode) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByAppovalCodeContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByAppovalCodeContaining(String appovalCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByOutOriginalCurrency
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByOutOriginalCurrency(java.math.BigDecimal outOriginalCurrency) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByOutOriginalCurrency
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByOutOriginalCurrency(BigDecimal outOriginalCurrency, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByValidCodeContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByValidCodeContaining(String validCode) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByValidCodeContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByAppovalCode
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByAppovalCode(String appovalCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByAppovalCode
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByAppovalCode(String appovalCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByValidCode
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByValidCode(String validCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByValidCode
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByValidCode(String validCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNameContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNameContaining(String correspondingAccName_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNameContaining
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNameContaining(String correspondingAccName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByOutVnd
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByOutVnd(java.math.BigDecimal outVnd) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByOutVnd
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByOutVnd(BigDecimal outVnd, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByDescription
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByDescription(String description_1) throws DataAccessException;

	/**
	 * JPQL Query - findBankingAccountingByDescription
	 *
	 */
	public Set<BankingAccounting> findBankingAccountingByDescription(String description_1, int startResult, int maxRows) throws DataAccessException;

}