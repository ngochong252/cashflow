
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.AccountReceivable;

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
 * DAO to manage AccountReceivable entities.
 * 
 */
@Repository("AccountReceivableDAO")

@Transactional
public class AccountReceivableDAOImpl extends AbstractJpaDao<AccountReceivable> implements AccountReceivableDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			AccountReceivable.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AccountReceivableDAOImpl
	 *
	 */
	public AccountReceivableDAOImpl() {
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
	 * JPQL Query - findAccountReceivableByCorrespodingAccNameContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccNameContaining(String correspodingAccName) throws DataAccessException {

		return findAccountReceivableByCorrespodingAccNameContaining(correspodingAccName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByCorrespodingAccNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccNameContaining(String correspodingAccName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByCorrespodingAccNameContaining", startResult, maxRows, correspodingAccName);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableById
	 *
	 */
	@Transactional
	public AccountReceivable findAccountReceivableById(Integer id) throws DataAccessException {

		return findAccountReceivableById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableById
	 *
	 */

	@Transactional
	public AccountReceivable findAccountReceivableById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccountReceivableById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.AccountReceivable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAccountReceivableByInptContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInptContaining(String inpt) throws DataAccessException {

		return findAccountReceivableByInptContaining(inpt, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByInptContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInptContaining(String inpt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByInptContaining", startResult, maxRows, inpt);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNo
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvoiceNo(String invoiceNo) throws DataAccessException {

		return findAccountReceivableByInvoiceNo(invoiceNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvoiceNo(String invoiceNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByInvoiceNo", startResult, maxRows, invoiceNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByPrimaryKey
	 *
	 */
	@Transactional
	public AccountReceivable findAccountReceivableByPrimaryKey(Integer id) throws DataAccessException {

		return findAccountReceivableByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByPrimaryKey
	 *
	 */

	@Transactional
	public AccountReceivable findAccountReceivableByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccountReceivableByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.AccountReceivable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptDate
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptDate(java.util.Calendar receiptDate) throws DataAccessException {

		return findAccountReceivableByReceiptDate(receiptDate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptDate(java.util.Calendar receiptDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByReceiptDate", startResult, maxRows, receiptDate);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByCreatedDate
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCreatedDate(java.util.Calendar createdDate) throws DataAccessException {

		return findAccountReceivableByCreatedDate(createdDate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByCreatedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCreatedDate(java.util.Calendar createdDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByCreatedDate", startResult, maxRows, createdDate);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByClassCodeContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByClassCodeContaining(String classCode) throws DataAccessException {

		return findAccountReceivableByClassCodeContaining(classCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByClassCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByClassCodeContaining(String classCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByClassCodeContaining", startResult, maxRows, classCode);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByValidCode
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByValidCode(String validCode) throws DataAccessException {

		return findAccountReceivableByValidCode(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByValidCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByValidCode", startResult, maxRows, validCode);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNoContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNoContaining(String correspondingAccNo) throws DataAccessException {

		return findAccountReceivableByCorrespondingAccNoContaining(correspondingAccNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNoContaining(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByCorrespondingAccNoContaining", startResult, maxRows, correspondingAccNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByVoucherNoContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVoucherNoContaining(String voucherNo) throws DataAccessException {

		return findAccountReceivableByVoucherNoContaining(voucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByVoucherNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVoucherNoContaining(String voucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByVoucherNoContaining", startResult, maxRows, voucherNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByValidCodeContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByValidCodeContaining(String validCode) throws DataAccessException {

		return findAccountReceivableByValidCodeContaining(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByValidCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByValidCodeContaining", startResult, maxRows, validCode);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByInvExRate
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvExRate(java.math.BigDecimal invExRate) throws DataAccessException {

		return findAccountReceivableByInvExRate(invExRate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByInvExRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvExRate(java.math.BigDecimal invExRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByInvExRate", startResult, maxRows, invExRate);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByContractNo
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByContractNo(String contractNo) throws DataAccessException {

		return findAccountReceivableByContractNo(contractNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByContractNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByContractNo(String contractNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByContractNo", startResult, maxRows, contractNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByExcludeGstAmount
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByExcludeGstAmount(java.math.BigDecimal excludeGstAmount) throws DataAccessException {

		return findAccountReceivableByExcludeGstAmount(excludeGstAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByExcludeGstAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByExcludeGstAmount(java.math.BigDecimal excludeGstAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByExcludeGstAmount", startResult, maxRows, excludeGstAmount);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByInvVndAmount
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvVndAmount(java.math.BigDecimal invVndAmount) throws DataAccessException {

		return findAccountReceivableByInvVndAmount(invVndAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByInvVndAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvVndAmount(java.math.BigDecimal invVndAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByInvVndAmount", startResult, maxRows, invVndAmount);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByCorrespodingAccName
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccName(String correspodingAccName) throws DataAccessException {

		return findAccountReceivableByCorrespodingAccName(correspodingAccName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByCorrespodingAccName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespodingAccName(String correspodingAccName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByCorrespodingAccName", startResult, maxRows, correspodingAccName);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByVatTypeContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVatTypeContaining(String vatType) throws DataAccessException {

		return findAccountReceivableByVatTypeContaining(vatType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByVatTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVatTypeContaining(String vatType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByVatTypeContaining", startResult, maxRows, vatType);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByInpt
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInpt(String inpt) throws DataAccessException {

		return findAccountReceivableByInpt(inpt, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByInpt
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInpt(String inpt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByInpt", startResult, maxRows, inpt);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByDescription
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByDescription(String description) throws DataAccessException {

		return findAccountReceivableByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByDescription", startResult, maxRows, description);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByDescriptionContaining(String description) throws DataAccessException {

		return findAccountReceivableByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptExRate
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptExRate(java.math.BigDecimal receiptExRate) throws DataAccessException {

		return findAccountReceivableByReceiptExRate(receiptExRate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptExRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptExRate(java.math.BigDecimal receiptExRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByReceiptExRate", startResult, maxRows, receiptExRate);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAccountReceivables
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAllAccountReceivables() throws DataAccessException {

		return findAllAccountReceivables(-1, -1);
	}

	/**
	 * JPQL Query - findAllAccountReceivables
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAllAccountReceivables(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAccountReceivables", startResult, maxRows);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrency
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrency(String originalCurrency) throws DataAccessException {

		return findAccountReceivableByOriginalCurrency(originalCurrency, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrency
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrency(String originalCurrency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByOriginalCurrency", startResult, maxRows, originalCurrency);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByIncludeGstAmount
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByIncludeGstAmount(java.math.BigDecimal includeGstAmount) throws DataAccessException {

		return findAccountReceivableByIncludeGstAmount(includeGstAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByIncludeGstAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByIncludeGstAmount(java.math.BigDecimal includeGstAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByIncludeGstAmount", startResult, maxRows, includeGstAmount);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByMonthContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByMonthContaining(String month) throws DataAccessException {

		return findAccountReceivableByMonthContaining(month, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByMonthContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByMonthContaining(String month, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByMonthContaining", startResult, maxRows, month);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNoContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvoiceNoContaining(String invoiceNo) throws DataAccessException {

		return findAccountReceivableByInvoiceNoContaining(invoiceNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByInvoiceNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByInvoiceNoContaining(String invoiceNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByInvoiceNoContaining", startResult, maxRows, invoiceNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByContractNoContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByContractNoContaining(String contractNo) throws DataAccessException {

		return findAccountReceivableByContractNoContaining(contractNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByContractNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByContractNoContaining(String contractNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByContractNoContaining", startResult, maxRows, contractNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByFxLossGain
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByFxLossGain(java.math.BigDecimal fxLossGain) throws DataAccessException {

		return findAccountReceivableByFxLossGain(fxLossGain, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByFxLossGain
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByFxLossGain(java.math.BigDecimal fxLossGain, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByFxLossGain", startResult, maxRows, fxLossGain);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrencyContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrencyContaining(String originalCurrency) throws DataAccessException {

		return findAccountReceivableByOriginalCurrencyContaining(originalCurrency, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByOriginalCurrencyContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByOriginalCurrencyContaining(String originalCurrency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByOriginalCurrencyContaining", startResult, maxRows, originalCurrency);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptOriginalCurrencyAmount
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptOriginalCurrencyAmount(java.math.BigDecimal receiptOriginalCurrencyAmount) throws DataAccessException {

		return findAccountReceivableByReceiptOriginalCurrencyAmount(receiptOriginalCurrencyAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptOriginalCurrencyAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptOriginalCurrencyAmount(java.math.BigDecimal receiptOriginalCurrencyAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByReceiptOriginalCurrencyAmount", startResult, maxRows, receiptOriginalCurrencyAmount);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByCustomerName
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCustomerName(String customerName) throws DataAccessException {

		return findAccountReceivableByCustomerName(customerName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByCustomerName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCustomerName(String customerName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByCustomerName", startResult, maxRows, customerName);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByFilePath
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByFilePath(String filePath) throws DataAccessException {

		return findAccountReceivableByFilePath(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByFilePath
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByFilePath", startResult, maxRows, filePath);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByFilePathContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByFilePathContaining(String filePath) throws DataAccessException {

		return findAccountReceivableByFilePathContaining(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByFilePathContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByFilePathContaining", startResult, maxRows, filePath);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByRemainVn
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByRemainVn(java.math.BigDecimal remainVn) throws DataAccessException {

		return findAccountReceivableByRemainVn(remainVn, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByRemainVn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByRemainVn(java.math.BigDecimal remainVn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByRemainVn", startResult, maxRows, remainVn);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptVndAmount
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptVndAmount(java.math.BigDecimal receiptVndAmount) throws DataAccessException {

		return findAccountReceivableByReceiptVndAmount(receiptVndAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByReceiptVndAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByReceiptVndAmount(java.math.BigDecimal receiptVndAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByReceiptVndAmount", startResult, maxRows, receiptVndAmount);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByVatType
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVatType(String vatType) throws DataAccessException {

		return findAccountReceivableByVatType(vatType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByVatType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVatType(String vatType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByVatType", startResult, maxRows, vatType);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByCustomerNameContaining
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCustomerNameContaining(String customerName) throws DataAccessException {

		return findAccountReceivableByCustomerNameContaining(customerName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByCustomerNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCustomerNameContaining(String customerName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByCustomerNameContaining", startResult, maxRows, customerName);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByVoucherNo
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVoucherNo(String voucherNo) throws DataAccessException {

		return findAccountReceivableByVoucherNo(voucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByVoucherNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByVoucherNo(String voucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByVoucherNo", startResult, maxRows, voucherNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNo
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNo(String correspondingAccNo) throws DataAccessException {

		return findAccountReceivableByCorrespondingAccNo(correspondingAccNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByCorrespondingAccNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByCorrespondingAccNo(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByCorrespondingAccNo", startResult, maxRows, correspondingAccNo);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByGst
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByGst(java.math.BigDecimal gst) throws DataAccessException {

		return findAccountReceivableByGst(gst, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByGst
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByGst(java.math.BigDecimal gst, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByGst", startResult, maxRows, gst);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByMonth
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByMonth(String month) throws DataAccessException {

		return findAccountReceivableByMonth(month, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByMonth
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByMonth(String month, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByMonth", startResult, maxRows, month);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByModifiedDate
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException {

		return findAccountReceivableByModifiedDate(modifiedDate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByModifiedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByModifiedDate(java.util.Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByModifiedDate", startResult, maxRows, modifiedDate);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountReceivableByClassCode
	 *
	 */
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByClassCode(String classCode) throws DataAccessException {

		return findAccountReceivableByClassCode(classCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountReceivableByClassCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountReceivable> findAccountReceivableByClassCode(String classCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountReceivableByClassCode", startResult, maxRows, classCode);
		return new LinkedHashSet<AccountReceivable>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(AccountReceivable entity) {
		return true;
	}
}
