
package com.ttv.cashflow.dao;

import com.ttv.cashflow.domain.AccountPayable;

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
 * DAO to manage AccountPayable entities.
 * 
 */
@Repository("AccountPayableDAO")

@Transactional
public class AccountPayableDAOImpl extends AbstractJpaDao<AccountPayable> implements AccountPayableDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			AccountPayable.class }));

	/**
	 * EntityManager injected by Spring for persistence unit CashFlowDriver
	 *
	 */
	@PersistenceContext(unitName = "CashFlowDriver")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AccountPayableDAOImpl
	 *
	 */
	public AccountPayableDAOImpl() {
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
	 * JPQL Query - findAccountPayableBySettlementVoucherNoContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNoContaining(String settlementVoucherNo) throws DataAccessException {

		return findAccountPayableBySettlementVoucherNoContaining(settlementVoucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableBySettlementVoucherNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNoContaining(String settlementVoucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableBySettlementVoucherNoContaining", startResult, maxRows, settlementVoucherNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByValidCodeContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByValidCodeContaining(String validCode) throws DataAccessException {

		return findAccountPayableByValidCodeContaining(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByValidCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByValidCodeContaining(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByValidCodeContaining", startResult, maxRows, validCode);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVoucherNoContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVoucherNoContaining(String voucherNo) throws DataAccessException {

		return findAccountPayableByVoucherNoContaining(voucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVoucherNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVoucherNoContaining(String voucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVoucherNoContaining", startResult, maxRows, voucherNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByApprovalCode
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByApprovalCode(String approvalCode) throws DataAccessException {

		return findAccountPayableByApprovalCode(approvalCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByApprovalCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByApprovalCode(String approvalCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByApprovalCode", startResult, maxRows, approvalCode);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVendorTypeContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorTypeContaining(String vendorType) throws DataAccessException {

		return findAccountPayableByVendorTypeContaining(vendorType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVendorTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorTypeContaining(String vendorType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVendorTypeContaining", startResult, maxRows, vendorType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByClassCodeContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByClassCodeContaining(String classCode) throws DataAccessException {

		return findAccountPayableByClassCodeContaining(classCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByClassCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByClassCodeContaining(String classCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByClassCodeContaining", startResult, maxRows, classCode);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByInvVndAmount
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvVndAmount(java.math.BigDecimal invVndAmount) throws DataAccessException {

		return findAccountPayableByInvVndAmount(invVndAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByInvVndAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvVndAmount(java.math.BigDecimal invVndAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByInvVndAmount", startResult, maxRows, invVndAmount);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByInvoiceNoContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvoiceNoContaining(String invoiceNo) throws DataAccessException {

		return findAccountPayableByInvoiceNoContaining(invoiceNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByInvoiceNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvoiceNoContaining(String invoiceNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByInvoiceNoContaining", startResult, maxRows, invoiceNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByGst
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByGst(String gst) throws DataAccessException {

		return findAccountPayableByGst(gst, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByGst
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByGst(String gst, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByGst", startResult, maxRows, gst);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByClass_Containing
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByClass_Containing(String class_) throws DataAccessException {

		return findAccountPayableByClass_Containing(class_, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByClass_Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByClass_Containing(String class_, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByClass_Containing", startResult, maxRows, class_);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccName
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccName(String correspondingAccName) throws DataAccessException {

		return findAccountPayableByCorrespondingAccName(correspondingAccName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccName(String correspondingAccName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByCorrespondingAccName", startResult, maxRows, correspondingAccName);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByFilePathContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByFilePathContaining(String filePath) throws DataAccessException {

		return findAccountPayableByFilePathContaining(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByFilePathContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByFilePathContaining(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByFilePathContaining", startResult, maxRows, filePath);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByClass_
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByClass_(String class_) throws DataAccessException {

		return findAccountPayableByClass_(class_, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByClass_
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByClass_(String class_, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByClass_", startResult, maxRows, class_);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByIncludeGstAmount
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByIncludeGstAmount(java.math.BigDecimal includeGstAmount) throws DataAccessException {

		return findAccountPayableByIncludeGstAmount(includeGstAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByIncludeGstAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByIncludeGstAmount(java.math.BigDecimal includeGstAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByIncludeGstAmount", startResult, maxRows, includeGstAmount);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByApprovalCodeContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByApprovalCodeContaining(String approvalCode) throws DataAccessException {

		return findAccountPayableByApprovalCodeContaining(approvalCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByApprovalCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByApprovalCodeContaining(String approvalCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByApprovalCodeContaining", startResult, maxRows, approvalCode);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByClaimType
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByClaimType(String claimType) throws DataAccessException {

		return findAccountPayableByClaimType(claimType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByClaimType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByClaimType(String claimType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByClaimType", startResult, maxRows, claimType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByFilePath
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByFilePath(String filePath) throws DataAccessException {

		return findAccountPayableByFilePath(filePath, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByFilePath
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByFilePath(String filePath, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByFilePath", startResult, maxRows, filePath);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVatType
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVatType(String vatType) throws DataAccessException {

		return findAccountPayableByVatType(vatType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVatType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVatType(String vatType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVatType", startResult, maxRows, vatType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByInvExRate
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvExRate(java.math.BigDecimal invExRate) throws DataAccessException {

		return findAccountPayableByInvExRate(invExRate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByInvExRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvExRate(java.math.BigDecimal invExRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByInvExRate", startResult, maxRows, invExRate);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVendorNameContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorNameContaining(String vendorName) throws DataAccessException {

		return findAccountPayableByVendorNameContaining(vendorName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVendorNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorNameContaining(String vendorName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVendorNameContaining", startResult, maxRows, vendorName);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNoContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNoContaining(String correspondingAccNo) throws DataAccessException {

		return findAccountPayableByCorrespondingAccNoContaining(correspondingAccNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNoContaining(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByCorrespondingAccNoContaining", startResult, maxRows, correspondingAccNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByModifiedDate
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByModifiedDate(java.util.Calendar modifiedDate) throws DataAccessException {

		return findAccountPayableByModifiedDate(modifiedDate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByModifiedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByModifiedDate(java.util.Calendar modifiedDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByModifiedDate", startResult, maxRows, modifiedDate);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNameContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNameContaining(String correspondingAccName) throws DataAccessException {

		return findAccountPayableByCorrespondingAccNameContaining(correspondingAccName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNameContaining(String correspondingAccName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByCorrespondingAccNameContaining", startResult, maxRows, correspondingAccName);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByClassCode
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByClassCode(String classCode) throws DataAccessException {

		return findAccountPayableByClassCode(classCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByClassCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByClassCode(String classCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByClassCode", startResult, maxRows, classCode);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPaidDate
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidDate(java.util.Calendar paidDate) throws DataAccessException {

		return findAccountPayableByPaidDate(paidDate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPaidDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidDate(java.util.Calendar paidDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPaidDate", startResult, maxRows, paidDate);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByDescription
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByDescription(String description) throws DataAccessException {

		return findAccountPayableByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByDescription", startResult, maxRows, description);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPoNo
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPoNo(String poNo) throws DataAccessException {

		return findAccountPayableByPoNo(poNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPoNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPoNo(String poNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPoNo", startResult, maxRows, poNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableById
	 *
	 */
	@Transactional
	public AccountPayable findAccountPayableById(Integer id) throws DataAccessException {

		return findAccountPayableById(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableById
	 *
	 */

	@Transactional
	public AccountPayable findAccountPayableById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccountPayableById", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.AccountPayable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNo
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNo(String correspondingAccNo) throws DataAccessException {

		return findAccountPayableByCorrespondingAccNo(correspondingAccNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccNo(String correspondingAccNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByCorrespondingAccNo", startResult, maxRows, correspondingAccNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPvNoContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPvNoContaining(String pvNo) throws DataAccessException {

		return findAccountPayableByPvNoContaining(pvNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPvNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPvNoContaining(String pvNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPvNoContaining", startResult, maxRows, pvNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVoucherNo
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVoucherNo(String voucherNo) throws DataAccessException {

		return findAccountPayableByVoucherNo(voucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVoucherNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVoucherNo(String voucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVoucherNo", startResult, maxRows, voucherNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVendorType
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorType(String vendorType) throws DataAccessException {

		return findAccountPayableByVendorType(vendorType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVendorType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorType(String vendorType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVendorType", startResult, maxRows, vendorType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPaidExRate
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidExRate(java.math.BigDecimal paidExRate) throws DataAccessException {

		return findAccountPayableByPaidExRate(paidExRate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPaidExRate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidExRate(java.math.BigDecimal paidExRate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPaidExRate", startResult, maxRows, paidExRate);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPaidOriginalCurrencyAmount
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidOriginalCurrencyAmount(java.math.BigDecimal paidOriginalCurrencyAmount) throws DataAccessException {

		return findAccountPayableByPaidOriginalCurrencyAmount(paidOriginalCurrencyAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPaidOriginalCurrencyAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidOriginalCurrencyAmount(java.math.BigDecimal paidOriginalCurrencyAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPaidOriginalCurrencyAmount", startResult, maxRows, paidOriginalCurrencyAmount);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByDescriptionContaining(String description) throws DataAccessException {

		return findAccountPayableByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByGstContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByGstContaining(String gst) throws DataAccessException {

		return findAccountPayableByGstContaining(gst, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByGstContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByGstContaining(String gst, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByGstContaining", startResult, maxRows, gst);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByInvoiceNo
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvoiceNo(String invoiceNo) throws DataAccessException {

		return findAccountPayableByInvoiceNo(invoiceNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByInvoiceNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByInvoiceNo(String invoiceNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByInvoiceNo", startResult, maxRows, invoiceNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPoNoContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPoNoContaining(String poNo) throws DataAccessException {

		return findAccountPayableByPoNoContaining(poNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPoNoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPoNoContaining(String poNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPoNoContaining", startResult, maxRows, poNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByClaimTypeContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByClaimTypeContaining(String claimType) throws DataAccessException {

		return findAccountPayableByClaimTypeContaining(claimType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByClaimTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByClaimTypeContaining(String claimType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByClaimTypeContaining", startResult, maxRows, claimType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAccountPayables
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAllAccountPayables() throws DataAccessException {

		return findAllAccountPayables(-1, -1);
	}

	/**
	 * JPQL Query - findAllAccountPayables
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAllAccountPayables(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAccountPayables", startResult, maxRows);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByInptContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByInptContaining(String inpt) throws DataAccessException {

		return findAccountPayableByInptContaining(inpt, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByInptContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByInptContaining(String inpt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByInptContaining", startResult, maxRows, inpt);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVendorName
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorName(String vendorName) throws DataAccessException {

		return findAccountPayableByVendorName(vendorName, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVendorName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVendorName(String vendorName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVendorName", startResult, maxRows, vendorName);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByMonthContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByMonthContaining(String month) throws DataAccessException {

		return findAccountPayableByMonthContaining(month, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByMonthContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByMonthContaining(String month, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByMonthContaining", startResult, maxRows, month);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrency
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByOriginalCurrency(String originalCurrency) throws DataAccessException {

		return findAccountPayableByOriginalCurrency(originalCurrency, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrency
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByOriginalCurrency(String originalCurrency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByOriginalCurrency", startResult, maxRows, originalCurrency);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrencyContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByOriginalCurrencyContaining(String originalCurrency) throws DataAccessException {

		return findAccountPayableByOriginalCurrencyContaining(originalCurrency, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByOriginalCurrencyContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByOriginalCurrencyContaining(String originalCurrency, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByOriginalCurrencyContaining", startResult, maxRows, originalCurrency);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByBankRef
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByBankRef(String bankRef) throws DataAccessException {

		return findAccountPayableByBankRef(bankRef, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByBankRef
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByBankRef(String bankRef, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByBankRef", startResult, maxRows, bankRef);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByValidCode
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByValidCode(String validCode) throws DataAccessException {

		return findAccountPayableByValidCode(validCode, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByValidCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByValidCode(String validCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByValidCode", startResult, maxRows, validCode);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPvNo
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPvNo(String pvNo) throws DataAccessException {

		return findAccountPayableByPvNo(pvNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPvNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPvNo(String pvNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPvNo", startResult, maxRows, pvNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByMonth
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByMonth(String month) throws DataAccessException {

		return findAccountPayableByMonth(month, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByMonth
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByMonth(String month, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByMonth", startResult, maxRows, month);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPaidVnAmount
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidVnAmount(java.math.BigDecimal paidVnAmount) throws DataAccessException {

		return findAccountPayableByPaidVnAmount(paidVnAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPaidVnAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByPaidVnAmount(java.math.BigDecimal paidVnAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByPaidVnAmount", startResult, maxRows, paidVnAmount);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByVatTypeContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByVatTypeContaining(String vatType) throws DataAccessException {

		return findAccountPayableByVatTypeContaining(vatType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByVatTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByVatTypeContaining(String vatType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByVatTypeContaining", startResult, maxRows, vatType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccType
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccType(String correspondingAccType) throws DataAccessException {

		return findAccountPayableByCorrespondingAccType(correspondingAccType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccType(String correspondingAccType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByCorrespondingAccType", startResult, maxRows, correspondingAccType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByRemainVn
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByRemainVn(java.math.BigDecimal remainVn) throws DataAccessException {

		return findAccountPayableByRemainVn(remainVn, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByRemainVn
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByRemainVn(java.math.BigDecimal remainVn, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByRemainVn", startResult, maxRows, remainVn);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByExcludeGstAmount
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByExcludeGstAmount(java.math.BigDecimal excludeGstAmount) throws DataAccessException {

		return findAccountPayableByExcludeGstAmount(excludeGstAmount, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByExcludeGstAmount
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByExcludeGstAmount(java.math.BigDecimal excludeGstAmount, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByExcludeGstAmount", startResult, maxRows, excludeGstAmount);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccTypeContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccTypeContaining(String correspondingAccType) throws DataAccessException {

		return findAccountPayableByCorrespondingAccTypeContaining(correspondingAccType, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByCorrespondingAccTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByCorrespondingAccTypeContaining(String correspondingAccType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByCorrespondingAccTypeContaining", startResult, maxRows, correspondingAccType);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByInpt
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByInpt(String inpt) throws DataAccessException {

		return findAccountPayableByInpt(inpt, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByInpt
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByInpt(String inpt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByInpt", startResult, maxRows, inpt);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByFxLossGain
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByFxLossGain(java.math.BigDecimal fxLossGain) throws DataAccessException {

		return findAccountPayableByFxLossGain(fxLossGain, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByFxLossGain
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByFxLossGain(java.math.BigDecimal fxLossGain, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByFxLossGain", startResult, maxRows, fxLossGain);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableBySettlementVoucherNo
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNo(String settlementVoucherNo) throws DataAccessException {

		return findAccountPayableBySettlementVoucherNo(settlementVoucherNo, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableBySettlementVoucherNo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableBySettlementVoucherNo(String settlementVoucherNo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableBySettlementVoucherNo", startResult, maxRows, settlementVoucherNo);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByPrimaryKey
	 *
	 */
	@Transactional
	public AccountPayable findAccountPayableByPrimaryKey(Integer id) throws DataAccessException {

		return findAccountPayableByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByPrimaryKey
	 *
	 */

	@Transactional
	public AccountPayable findAccountPayableByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAccountPayableByPrimaryKey", startResult, maxRows, id);
			return (com.ttv.cashflow.domain.AccountPayable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAccountPayableByCreatedDate
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByCreatedDate(java.util.Calendar createdDate) throws DataAccessException {

		return findAccountPayableByCreatedDate(createdDate, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByCreatedDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByCreatedDate(java.util.Calendar createdDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByCreatedDate", startResult, maxRows, createdDate);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAccountPayableByBankRefContaining
	 *
	 */
	@Transactional
	public Set<AccountPayable> findAccountPayableByBankRefContaining(String bankRef) throws DataAccessException {

		return findAccountPayableByBankRefContaining(bankRef, -1, -1);
	}

	/**
	 * JPQL Query - findAccountPayableByBankRefContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<AccountPayable> findAccountPayableByBankRefContaining(String bankRef, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAccountPayableByBankRefContaining", startResult, maxRows, bankRef);
		return new LinkedHashSet<AccountPayable>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(AccountPayable entity) {
		return true;
	}
}
