
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.Approval;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Approval entities.
 * 
 */
@Repository("ApprovalDAO")

@Transactional
public class ApprovalDAOImpl extends AbstractJpaDao<Approval> implements ApprovalDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			Approval.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ApprovalDAOImpl
	 *
	 */
	public ApprovalDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findApprovalByCreditAmount
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByCreditAmount(java.math.BigDecimal creditAmount) throws DataAccessException {

		return findApprovalByCreditAmount(creditAmount, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByCreditAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByCreditAmount(java.math.BigDecimal creditAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByCreditAmount", startResult, maxRows, creditAmount);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByModifiedDate
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException {

		return findApprovalByModifiedDate(modifiedDate, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByModifiedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByModifiedDate(java.util.Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByModifiedDate", startResult, maxRows, modifiedDate);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByBankRef
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByBankRef(String bankRef) throws DataAccessException {

		return findApprovalByBankRef(bankRef, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByBankRef
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByBankRef(String bankRef, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByBankRef", startResult, maxRows, bankRef);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByCodeContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByCodeContaining(String code) throws DataAccessException {

		return findApprovalByCodeContaining(code, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByCodeContaining(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByCodeContaining", startResult, maxRows, code);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByInvoiceCodeContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByInvoiceCodeContaining(String invoiceCode) throws DataAccessException {

		return findApprovalByInvoiceCodeContaining(invoiceCode, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByInvoiceCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByInvoiceCodeContaining(String invoiceCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByInvoiceCodeContaining", startResult, maxRows, invoiceCode);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByValidCode
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByValidCode(String validCode) throws DataAccessException {

		return findApprovalByValidCode(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByValidCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByValidCode", startResult, maxRows, validCode);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByPrimaryKey
	 *
	 */
	@Transactional
	public Approval findApprovalByPrimaryKey(Integer id) throws DataAccessException {

		return findApprovalByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByPrimaryKey
	 *
	 */

	@Transactional
	public Approval findApprovalByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findApprovalByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Approval) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findApprovalByInvoiceCode
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByInvoiceCode(String invoiceCode) throws DataAccessException {

		return findApprovalByInvoiceCode(invoiceCode, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByInvoiceCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByInvoiceCode(String invoiceCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByInvoiceCode", startResult, maxRows, invoiceCode);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByFilePath
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByFilePath(String filePath) throws DataAccessException {

		return findApprovalByFilePath(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByFilePath
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByFilePath", startResult, maxRows, filePath);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByCreatedDate
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByCreatedDate(java.util.Calendar createdDate) throws DataAccessException {

		return findApprovalByCreatedDate(createdDate, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByCreatedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByCreatedDate(java.util.Calendar createdDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByCreatedDate", startResult, maxRows, createdDate);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByApprovalDate
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByApprovalDate(java.util.Calendar approvalDate) throws DataAccessException {

		return findApprovalByApprovalDate(approvalDate, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByApprovalDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByApprovalDate(java.util.Calendar approvalDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByApprovalDate", startResult, maxRows, approvalDate);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByDebitAmount
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByDebitAmount(java.math.BigDecimal debitAmount) throws DataAccessException {

		return findApprovalByDebitAmount(debitAmount, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByDebitAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByDebitAmount(java.math.BigDecimal debitAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByDebitAmount", startResult, maxRows, debitAmount);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByBalance
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByBalance(java.math.BigDecimal balance) throws DataAccessException {

		return findApprovalByBalance(balance, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByBalance
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByBalance(java.math.BigDecimal balance, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByBalance", startResult, maxRows, balance);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalById
	 *
	 */
	@Transactional
	public Approval findApprovalById(Integer id) throws DataAccessException {

		return findApprovalById(id, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalById
	 *
	 */

	@Transactional
	public Approval findApprovalById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findApprovalById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.Approval) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findApprovalByLedgerDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByLedgerDescriptionContaining(String ledgerDescription) throws DataAccessException {

		return findApprovalByLedgerDescriptionContaining(ledgerDescription, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByLedgerDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByLedgerDescriptionContaining(String ledgerDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByLedgerDescriptionContaining", startResult, maxRows, ledgerDescription);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByCode
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByCode(String code) throws DataAccessException {

		return findApprovalByCode(code, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByCode(String code, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByCode", startResult, maxRows, code);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByFilePathContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByFilePathContaining(String filePath) throws DataAccessException {

		return findApprovalByFilePathContaining(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByFilePathContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByFilePathContaining", startResult, maxRows, filePath);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByBankingDescription
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByBankingDescription(String bankingDescription) throws DataAccessException {

		return findApprovalByBankingDescription(bankingDescription, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByBankingDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByBankingDescription(String bankingDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByBankingDescription", startResult, maxRows, bankingDescription);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByValidCodeContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByValidCodeContaining(String validCode) throws DataAccessException {

		return findApprovalByValidCodeContaining(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByValidCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByValidCodeContaining", startResult, maxRows, validCode);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllApprovals
	 *
	 */
	@Transactional
	public Set<Approval> findAllApprovals() throws DataAccessException {

		return findAllApprovals(-1, -1);
	}

	/**
	 * JPQL Query - findAllApprovals
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findAllApprovals(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllApprovals", startResult, maxRows);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByBankRefContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByBankRefContaining(String bankRef) throws DataAccessException {

		return findApprovalByBankRefContaining(bankRef, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByBankRefContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByBankRefContaining(String bankRef, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByBankRefContaining", startResult, maxRows, bankRef);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByLedgerDescription
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByLedgerDescription(String ledgerDescription) throws DataAccessException {

		return findApprovalByLedgerDescription(ledgerDescription, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByLedgerDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByLedgerDescription(String ledgerDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByLedgerDescription", startResult, maxRows, ledgerDescription);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByLedgerNameContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByLedgerNameContaining(String ledgerName) throws DataAccessException {

		return findApprovalByLedgerNameContaining(ledgerName, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByLedgerNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByLedgerNameContaining(String ledgerName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByLedgerNameContaining", startResult, maxRows, ledgerName);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByBankingDescriptionContaining
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByBankingDescriptionContaining(String bankingDescription) throws DataAccessException {

		return findApprovalByBankingDescriptionContaining(bankingDescription, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByBankingDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByBankingDescriptionContaining(String bankingDescription, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByBankingDescriptionContaining", startResult, maxRows, bankingDescription);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByLedgerName
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByLedgerName(String ledgerName) throws DataAccessException {

		return findApprovalByLedgerName(ledgerName, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByLedgerName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByLedgerName(String ledgerName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByLedgerName", startResult, maxRows, ledgerName);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * JPQL Query - findApprovalByLegderType
	 *
	 */
	@Transactional
	public Set<Approval> findApprovalByLegderType(Integer legderType) throws DataAccessException {

		return findApprovalByLegderType(legderType, -1, -1);
	}

	/**
	 * JPQL Query - findApprovalByLegderType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Approval> findApprovalByLegderType(Integer legderType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findApprovalByLegderType", startResult, maxRows, legderType);
		return new LinkedHashSet<Approval>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Approval entity) {
		return true;
	}
}
