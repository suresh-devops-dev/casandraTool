package com.vz.cassandraTool.model;
// Generated Oct 14, 2019 5:20:56 PM by Hibernate Tools 5.2.10.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ReleaseHistory generated by hbm2java
 */
@Entity
@Table(name = "release_history")
public class ReleaseHistory implements java.io.Serializable {

	private Date syncRelDate;
	private Releases releases;
	private Date createdDate;
	private Date updatedDate;
	private Serializable summaryJson;

	public ReleaseHistory() {
	}

	public ReleaseHistory(Date syncRelDate, Releases releases, Date createdDate, Date updatedDate,
			Serializable summaryJson) {
		this.syncRelDate = syncRelDate;
		this.releases = releases;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.summaryJson = summaryJson;
	}

	@Id

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sync_rel_date", unique = true, nullable = false, length = 29)
	public Date getSyncRelDate() {
		return this.syncRelDate;
	}

	public void setSyncRelDate(Date syncRelDate) {
		this.syncRelDate = syncRelDate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "release_id", nullable = false)
	public Releases getReleases() {
		return this.releases;
	}

	public void setReleases(Releases releases) {
		this.releases = releases;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 29)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", nullable = false, length = 29)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "summary_json", nullable = false)
	public Serializable getSummaryJson() {
		return this.summaryJson;
	}

	public void setSummaryJson(Serializable summaryJson) {
		this.summaryJson = summaryJson;
	}

}
