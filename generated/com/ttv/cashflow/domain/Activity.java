
package com.ttv.cashflow.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findActivityByAction", query = "select myActivity from Activity myActivity where myActivity.action = ?1"),
		@NamedQuery(name = "findActivityByActionContaining", query = "select myActivity from Activity myActivity where myActivity.action like ?1"),
		@NamedQuery(name = "findActivityByActivityDate", query = "select myActivity from Activity myActivity where myActivity.activityDate = ?1"),
		@NamedQuery(name = "findActivityByCompanyId", query = "select myActivity from Activity myActivity where myActivity.companyId = ?1"),
		@NamedQuery(name = "findActivityByFilePath", query = "select myActivity from Activity myActivity where myActivity.filePath = ?1"),
		@NamedQuery(name = "findActivityByFilePathContaining", query = "select myActivity from Activity myActivity where myActivity.filePath like ?1"),
		@NamedQuery(name = "findActivityById", query = "select myActivity from Activity myActivity where myActivity.id = ?1"),
		@NamedQuery(name = "findActivityByPrimaryKey", query = "select myActivity from Activity myActivity where myActivity.id = ?1"),
		@NamedQuery(name = "findActivityByUserName", query = "select myActivity from Activity myActivity where myActivity.userName = ?1"),
		@NamedQuery(name = "findActivityByUserNameContaining", query = "select myActivity from Activity myActivity where myActivity.userName like ?1"),
		@NamedQuery(name = "findAllActivitys", query = "select myActivity from Activity myActivity") })

@Table(schema = "public", name = "activity")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "cashflow/com/ttv/cashflow/domain", name = "Activity")

public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@Id
	@XmlElement
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	/**
	 */

	@Column(name = "user_name", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String userName;
	/**
	 */

	@Column(name = "action", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String action;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "activity_date")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Calendar activityDate;
	/**
	 */

	@Column(name = "file_path", length = 100)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String filePath;
	/**
	 */

	@Column(name = "company_id")
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	Integer companyId;

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
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 */
	public String getAction() {
		return this.action;
	}

	/**
	 */
	public void setActivityDate(Calendar activityDate) {
		this.activityDate = activityDate;
	}

	/**
	 */
	public Calendar getActivityDate() {
		return this.activityDate;
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
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 */
	public Integer getCompanyId() {
		return this.companyId;
	}

	/**
	 */
	public Activity() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Activity that) {
		setId(that.getId());
		setUserName(that.getUserName());
		setAction(that.getAction());
		setActivityDate(that.getActivityDate());
		setFilePath(that.getFilePath());
		setCompanyId(that.getCompanyId());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("userName=[").append(userName).append("] ");
		buffer.append("action=[").append(action).append("] ");
		buffer.append("activityDate=[").append(activityDate).append("] ");
		buffer.append("filePath=[").append(filePath).append("] ");
		buffer.append("companyId=[").append(companyId).append("] ");

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
		if (!(obj instanceof Activity))
			return false;
		Activity equalCheck = (Activity) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
