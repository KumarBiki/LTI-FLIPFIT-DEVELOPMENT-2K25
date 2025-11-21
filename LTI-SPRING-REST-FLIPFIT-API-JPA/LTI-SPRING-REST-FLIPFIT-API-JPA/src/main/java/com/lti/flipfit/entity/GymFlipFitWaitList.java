package com.lti.flipfit.entity;

import java.util.Date;


public class GymFlipFitWaitList {
	
	private Integer id;
	private Integer userId;
	private Integer centerId;
	private Integer slotId;
	private int position;
	private String status;
	private Date createdAt;
	private Date promotedAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCenterId() {
		return centerId;
	}
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}
	public Integer getSlotId() {
		return slotId;
	}
	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getPromotedAt() {
		return promotedAt;
	}
	public void setPromotedAt(Date promotedAt) {
		this.promotedAt = promotedAt;
	}
	

}
