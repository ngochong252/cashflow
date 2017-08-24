
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.BankingAccounting;

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
 * DAO to manage BankingAccounting entities.
 * 
 */
@Repository("BankingAccountingDAO")

@Transactional
public class BankingAccountingDAOImpl extends AbstractJpaDao<BankingAccounting> implements BankingAccountingDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			BankingAccounting.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BankingAccountingDAOImpl
	 *
	 */
	public BankingAccountingDAOImpl() {
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
	 * JPQL Query - findBankingAccountingByBalanceVnd
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBalanceVnd(java.math.BigDecimal balanceVnd) throws DataAccessException {

		return findBankingAccountingByBalanceVnd(balanceVnd, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByBalanceVnd
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBalanceVnd(java.math.BigDecimal balanceVnd, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByBalanceVnd", startResult, maxRows, balanceVnd);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingById
	 *
	 */
	@Transactional
	public BankingAccounting findBankingAccountingById(Integer id) throws DataAccessException {

		return findBankingAccountingById(id, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingById
	 *
	 */

	@Transactional
	public BankingAccounting findBankingAccountingById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBankingAccountingById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.BankingAccounting) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBankingAccountingByTransactionDate
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByTransactionDate(java.util.Calendar transactionDate) throws DataAccessException {

		return findBankingAccountingByTransactionDate(transactionDate, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByTransactionDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByTransactionDate(java.util.Calendar transactionDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByTransactionDate", startResult, maxRows, transactionDate);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNoContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNoContaining(String correspondingAccNo) throws DataAccessException {

		return findBankingAccountingByCorrespondingAccNoContaining(correspondingAccNo, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNoContaining(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByCorrespondingAccNoContaining", startResult, maxRows, correspondingAccNo);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByValidCode
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByValidCode(String validCode) throws DataAccessException {

		return findBankingAccountingByValidCode(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByValidCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByValidCode", startResult, maxRows, validCode);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherNo
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherNo(String voucherNo) throws DataAccessException {

		return findBankingAccountingByVoucherNo(voucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherNo(String voucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByVoucherNo", startResult, maxRows, voucherNo);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByFilePath
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByFilePath(String filePath) throws DataAccessException {

		return findBankingAccountingByFilePath(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByFilePath
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByFilePath", startResult, maxRows, filePath);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByBankRefContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBankRefContaining(String bankRef) throws DataAccessException {

		return findBankingAccountingByBankRefContaining(bankRef, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByBankRefContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBankRefContaining(String bankRef, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByBankRefContaining", startResult, maxRows, bankRef);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByCreatedDate
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCreatedDate(java.util.Calendar createdDate) throws DataAccessException {

		return findBankingAccountingByCreatedDate(createdDate, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByCreatedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCreatedDate(java.util.Calendar createdDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByCreatedDate", startResult, maxRows, createdDate);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByFilePathContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByFilePathContaining(String filePath) throws DataAccessException {

		return findBankingAccountingByFilePathContaining(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByFilePathContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByFilePathContaining", startResult, maxRows, filePath);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherDate
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherDate(java.util.Calendar voucherDate) throws DataAccessException {

		return findBankingAccountingByVoucherDate(voucherDate, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherDate(java.util.Calendar voucherDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByVoucherDate", startResult, maxRows, voucherDate);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByInVnd
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByInVnd(java.math.BigDecimal inVnd) throws DataAccessException {

		return findBankingAccountingByInVnd(inVnd, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByInVnd
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByInVnd(java.math.BigDecimal inVnd, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByInVnd", startResult, maxRows, inVnd);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNameContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNameContaining(String correspondingAccName) throws DataAccessException {

		return findBankingAccountingByCorrespondingAccNameContaining(correspondingAccName, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNameContaining(String correspondingAccName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByCorrespondingAccNameContaining", startResult, maxRows, correspondingAccName);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccName
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccName(String correspondingAccName) throws DataAccessException {

		return findBankingAccountingByCorrespondingAccName(correspondingAccName, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccName(String correspondingAccName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByCorrespondingAccName", startResult, maxRows, correspondingAccName);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByBalanceOriginalCurrency
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBalanceOriginalCurrency(java.math.BigDecimal balanceOriginalCurrency) throws DataAccessException {

		return findBankingAccountingByBalanceOriginalCurrency(balanceOriginalCurrency, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByBalanceOriginalCurrency
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBalanceOriginalCurrency(java.math.BigDecimal balanceOriginalCurrency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByBalanceOriginalCurrency", startResult, maxRows, balanceOriginalCurrency);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByOutVnd
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByOutVnd(java.math.BigDecimal outVnd) throws DataAccessException {

		return findBankingAccountingByOutVnd(outVnd, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByOutVnd
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByOutVnd(java.math.BigDecimal outVnd, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByOutVnd", startResult, maxRows, outVnd);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateAfter
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherDateAfter(java.util.Calendar voucherDate) throws DataAccessException {

		return findBankingAccountingByVoucherDateAfter(voucherDate, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherDateAfter(java.util.Calendar voucherDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByVoucherDateAfter", startResult, maxRows, voucherDate);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherNoContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherNoContaining(String voucherNo) throws DataAccessException {

		return findBankingAccountingByVoucherNoContaining(voucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherNoContaining(String voucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByVoucherNoContaining", startResult, maxRows, voucherNo);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllBankingAccountings
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findAllBankingAccountings() throws DataAccessException {

		return findAllBankingAccountings(-1, -1);
	}

	/**
	 * JPQL Query - findAllBankingAccountings
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findAllBankingAccountings(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBankingAccountings", startResult, maxRows);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByDescription
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByDescription(String description) throws DataAccessException {

		return findBankingAccountingByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByDescription", startResult, maxRows, description);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByOutOriginalCurrency
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByOutOriginalCurrency(java.math.BigDecimal outOriginalCurrency) throws DataAccessException {

		return findBankingAccountingByOutOriginalCurrency(outOriginalCurrency, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByOutOriginalCurrency
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByOutOriginalCurrency(java.math.BigDecimal outOriginalCurrency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByOutOriginalCurrency", startResult, maxRows, outOriginalCurrency);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByBankRef
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBankRef(String bankRef) throws DataAccessException {

		return findBankingAccountingByBankRef(bankRef, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByBankRef
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByBankRef(String bankRef, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByBankRef", startResult, maxRows, bankRef);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByDescriptionContaining(String description) throws DataAccessException {

		return findBankingAccountingByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByVendorNameContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVendorNameContaining(String vendorName) throws DataAccessException {

		return findBankingAccountingByVendorNameContaining(vendorName, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByVendorNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVendorNameContaining(String vendorName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByVendorNameContaining", startResult, maxRows, vendorName);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByValidCodeContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByValidCodeContaining(String validCode) throws DataAccessException {

		return findBankingAccountingByValidCodeContaining(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByValidCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByValidCodeContaining", startResult, maxRows, validCode);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByModifiedDate
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException {

		return findBankingAccountingByModifiedDate(modifiedDate, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByModifiedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByModifiedDate(java.util.Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByModifiedDate", startResult, maxRows, modifiedDate);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByInOriginalCurrency
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByInOriginalCurrency(java.math.BigDecimal inOriginalCurrency) throws DataAccessException {

		return findBankingAccountingByInOriginalCurrency(inOriginalCurrency, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByInOriginalCurrency
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByInOriginalCurrency(java.math.BigDecimal inOriginalCurrency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByInOriginalCurrency", startResult, maxRows, inOriginalCurrency);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNo
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNo(String correspondingAccNo) throws DataAccessException {

		return findBankingAccountingByCorrespondingAccNo(correspondingAccNo, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByCorrespondingAccNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByCorrespondingAccNo(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByCorrespondingAccNo", startResult, maxRows, correspondingAccNo);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByAppovalCodeContaining
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByAppovalCodeContaining(String appovalCode) throws DataAccessException {

		return findBankingAccountingByAppovalCodeContaining(appovalCode, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByAppovalCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByAppovalCodeContaining(String appovalCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByAppovalCodeContaining", startResult, maxRows, appovalCode);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByAppovalCode
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByAppovalCode(String appovalCode) throws DataAccessException {

		return findBankingAccountingByAppovalCode(appovalCode, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByAppovalCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByAppovalCode(String appovalCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByAppovalCode", startResult, maxRows, appovalCode);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByPrimaryKey
	 *
	 */
	@Transactional
	public BankingAccounting findBankingAccountingByPrimaryKey(Integer id) throws DataAccessException {

		return findBankingAccountingByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByPrimaryKey
	 *
	 */

	@Transactional
	public BankingAccounting findBankingAccountingByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBankingAccountingByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.BankingAccounting) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateBefore
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherDateBefore(java.util.Calendar voucherDate) throws DataAccessException {

		return findBankingAccountingByVoucherDateBefore(voucherDate, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByVoucherDateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVoucherDateBefore(java.util.Calendar voucherDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByVoucherDateBefore", startResult, maxRows, voucherDate);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * JPQL Query - findBankingAccountingByVendorName
	 *
	 */
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVendorName(String vendorName) throws DataAccessException {

		return findBankingAccountingByVendorName(vendorName, -1, -1);
	}

	/**
	 * JPQL Query - findBankingAccountingByVendorName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<BankingAccounting> findBankingAccountingByVendorName(String vendorName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBankingAccountingByVendorName", startResult, maxRows, vendorName);
		return new LinkedHashSet<BankingAccounting>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(BankingAccounting entity) {
		return true;
	}
}
