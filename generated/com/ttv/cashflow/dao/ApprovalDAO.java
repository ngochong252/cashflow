
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Approval;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Approval entities.
 * 
 */
public interface ApprovalDAO extends JpaDao<Approval> {

	/**
	 * JPQL Query - findApprovalByCreditAmount
	 *
	 */
	public Set<Approval> findApprovalByCreditAmount(java.math.BigDecimal creditAmount) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByCreditAmount
	 *
	 */
	public Set<Approval> findApprovalByCreditAmount(BigDecimal creditAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByModifiedDate
	 *
	 */
	public Set<Approval> findApprovalByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByModifiedDate
	 *
	 */
	public Set<Approval> findApprovalByModifiedDate(Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankRef
	 *
	 */
	public Set<Approval> findApprovalByBankRef(String bankRef) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankRef
	 *
	 */
	public Set<Approval> findApprovalByBankRef(String bankRef, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByCodeContaining
	 *
	 */
	public Set<Approval> findApprovalByCodeContaining(String code) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByCodeContaining
	 *
	 */
	public Set<Approval> findApprovalByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByInvoiceCodeContaining
	 *
	 */
	public Set<Approval> findApprovalByInvoiceCodeContaining(String invoiceCode) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByInvoiceCodeContaining
	 *
	 */
	public Set<Approval> findApprovalByInvoiceCodeContaining(String invoiceCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByValidCode
	 *
	 */
	public Set<Approval> findApprovalByValidCode(String validCode) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByValidCode
	 *
	 */
	public Set<Approval> findApprovalByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByPrimaryKey
	 *
	 */
	public Approval findApprovalByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByPrimaryKey
	 *
	 */
	public Approval findApprovalByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByInvoiceCode
	 *
	 */
	public Set<Approval> findApprovalByInvoiceCode(String invoiceCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByInvoiceCode
	 *
	 */
	public Set<Approval> findApprovalByInvoiceCode(String invoiceCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByFilePath
	 *
	 */
	public Set<Approval> findApprovalByFilePath(String filePath) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByFilePath
	 *
	 */
	public Set<Approval> findApprovalByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByCreatedDate
	 *
	 */
	public Set<Approval> findApprovalByCreatedDate(java.util.Calendar createdDate) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByCreatedDate
	 *
	 */
	public Set<Approval> findApprovalByCreatedDate(Calendar createdDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByApprovalDate
	 *
	 */
	public Set<Approval> findApprovalByApprovalDate(java.util.Calendar approvalDate) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByApprovalDate
	 *
	 */
	public Set<Approval> findApprovalByApprovalDate(Calendar approvalDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByDebitAmount
	 *
	 */
	public Set<Approval> findApprovalByDebitAmount(java.math.BigDecimal debitAmount) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByDebitAmount
	 *
	 */
	public Set<Approval> findApprovalByDebitAmount(BigDecimal debitAmount, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBalance
	 *
	 */
	public Set<Approval> findApprovalByBalance(java.math.BigDecimal balance) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBalance
	 *
	 */
	public Set<Approval> findApprovalByBalance(BigDecimal balance, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalById
	 *
	 */
	public Approval findApprovalById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalById
	 *
	 */
	public Approval findApprovalById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerDescriptionContaining
	 *
	 */
	public Set<Approval> findApprovalByLedgerDescriptionContaining(String ledgerDescription) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerDescriptionContaining
	 *
	 */
	public Set<Approval> findApprovalByLedgerDescriptionContaining(String ledgerDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByCode
	 *
	 */
	public Set<Approval> findApprovalByCode(String code_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByCode
	 *
	 */
	public Set<Approval> findApprovalByCode(String code_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByFilePathContaining
	 *
	 */
	public Set<Approval> findApprovalByFilePathContaining(String filePath_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByFilePathContaining
	 *
	 */
	public Set<Approval> findApprovalByFilePathContaining(String filePath_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankingDescription
	 *
	 */
	public Set<Approval> findApprovalByBankingDescription(String bankingDescription) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankingDescription
	 *
	 */
	public Set<Approval> findApprovalByBankingDescription(String bankingDescription, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByValidCodeContaining
	 *
	 */
	public Set<Approval> findApprovalByValidCodeContaining(String validCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByValidCodeContaining
	 *
	 */
	public Set<Approval> findApprovalByValidCodeContaining(String validCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllApprovals
	 *
	 */
	public Set<Approval> findAllApprovals() throws DataAccessException;

	/**
	 * JPQL Query - findAllApprovals
	 *
	 */
	public Set<Approval> findAllApprovals(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankRefContaining
	 *
	 */
	public Set<Approval> findApprovalByBankRefContaining(String bankRef_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankRefContaining
	 *
	 */
	public Set<Approval> findApprovalByBankRefContaining(String bankRef_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerDescription
	 *
	 */
	public Set<Approval> findApprovalByLedgerDescription(String ledgerDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerDescription
	 *
	 */
	public Set<Approval> findApprovalByLedgerDescription(String ledgerDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerNameContaining
	 *
	 */
	public Set<Approval> findApprovalByLedgerNameContaining(String ledgerName) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerNameContaining
	 *
	 */
	public Set<Approval> findApprovalByLedgerNameContaining(String ledgerName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankingDescriptionContaining
	 *
	 */
	public Set<Approval> findApprovalByBankingDescriptionContaining(String bankingDescription_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByBankingDescriptionContaining
	 *
	 */
	public Set<Approval> findApprovalByBankingDescriptionContaining(String bankingDescription_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerName
	 *
	 */
	public Set<Approval> findApprovalByLedgerName(String ledgerName_1) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLedgerName
	 *
	 */
	public Set<Approval> findApprovalByLedgerName(String ledgerName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLegderType
	 *
	 */
	public Set<Approval> findApprovalByLegderType(Integer legderType) throws DataAccessException;

	/**
	 * JPQL Query - findApprovalByLegderType
	 *
	 */
	public Set<Approval> findApprovalByLegderType(Integer legderType, int startResult, int maxRows) throws DataAccessException;

}