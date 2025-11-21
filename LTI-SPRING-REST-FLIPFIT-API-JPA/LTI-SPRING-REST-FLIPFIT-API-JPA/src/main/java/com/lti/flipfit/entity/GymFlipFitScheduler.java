package com.lti.flipfit.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gymscheduler")
public class GymFlipFitScheduler implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="schedulerid")
	private Integer id;
	// private String resourceRule;
	
	@Column(name="validfrom")
	private Date validFrom;
	
	@Column(name="validtill")
	private Date validTill;
	
	@Column(name="slotid")
	private Integer slotId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * public String getResourceRule() { return resourceRule; } public void
	 * setResourceRule(String resourceRule) { this.resourceRule = resourceRule; }
	 */
	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

}
