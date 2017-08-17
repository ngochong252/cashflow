
package com.ttv.cashflow.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllProcessCases", query = "select myProcessCase from ProcessCase myProcessCase"),
		@NamedQuery(name = "findProcessCaseById", query = "select myProcessCase from ProcessCase myProcessCase where myProcessCase.id = ?1"),
		@NamedQuery(name = "findProcessCaseByPrimaryKey", query = "select myProcessCase from ProcessCase myProcessCase where myProcessCase.id = ?1"),
		@NamedQuery(name = "findProcessCaseByStepsResolve", query = "select myProcessCase from ProcessCase myProcessCase where myProcessCase.stepsResolve = ?1"),
		@NamedQuery(name = "findProcessCaseByStepsResolveContaining", query = "select myProcessCase from ProcessCase myProcessCase where myProcessCase.stepsResolve like ?1") })

@Table(schema = "public", name = "process_case")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "ProcessCase")

public class ProcessCase implements Serializable {
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

	@Column(name = "steps_resolve")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String stepsResolve;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "error_id", referencedColumnName = "id") })
	@XmlTransient
	ErrorDetails errorDetails;

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
	public void setStepsResolve(String stepsResolve) {
		this.stepsResolve = stepsResolve;
	}

	/**
	 */
	public String getStepsResolve() {
		return this.stepsResolve;
	}

	/**
	 */
	public void setErrorDetails(ErrorDetails errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 */
	@JsonIgnore
	public ErrorDetails getErrorDetails() {
		return errorDetails;
	}

	/**
	 */
	public ProcessCase() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ProcessCase that) {
		setId(that.getId());
		setStepsResolve(that.getStepsResolve());
		setErrorDetails(that.getErrorDetails());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("stepsResolve=[").append(stepsResolve).append("] ");

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
		if (!(obj instanceof ProcessCase))
			return false;
		ProcessCase equalCheck = (ProcessCase) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
