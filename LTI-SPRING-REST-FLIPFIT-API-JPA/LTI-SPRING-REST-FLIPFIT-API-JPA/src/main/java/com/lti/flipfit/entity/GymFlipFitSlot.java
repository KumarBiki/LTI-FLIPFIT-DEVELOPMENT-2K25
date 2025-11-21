package com.lti.flipfit.entity;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gymslot")
public class GymFlipFitSlot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "starttime")
	private LocalTime startTime;
	
	@Column(name = "endtime")
	private LocalTime endTime;
	
	@Column(name = "capacity")
	private int	capacity;
	
	@Column(name = "bookedcount")
	private int bookedCount ;
	//private boolean isAvailble ;
	
	@Column(name = "slotdate")
	private Date slotDate;
	//private int reserve ;
	//private int releasedBookId;
	
	@Column(name = "centerid")
	private Integer centerId;
	//private int customerId;
	
	@Column(name = "status")
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getSlotDate() {
		return slotDate;
	}
	public void setSlotDate(Date slotDate) {
		this.slotDate = slotDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * public int getCustomerId() { return customerId; } public void
	 * setCustomerId(int customerId) { this.customerId = customerId; }
	 */
	public Integer getCenterId() {
		return centerId;
	}
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getBookedCount() {
		return bookedCount;
	}
	public void setBookedCount(int bookedCount) {
		this.bookedCount = bookedCount;
	}
	/*
	 * public boolean isAvailble() { return isAvailble; } public void
	 * setAvailble(boolean isAvailble) { this.isAvailble = isAvailble; } public int
	 * getReserve() { return reserve; } public void setReserve(int reserve) {
	 * this.reserve = reserve; } public int getReleasedBookId() { return
	 * releasedBookId; } public void setReleasedBookId(int releasedBookId) {
	 * this.releasedBookId = releasedBookId; }
	 */
	
	

}
