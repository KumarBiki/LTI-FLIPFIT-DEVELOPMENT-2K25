package com.lti.flipfit.entity;

import java.util.Date;

import com.lti.flipfit.constants.BookingStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="gymbooking")
public class GymFlipFitBooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "bookedat")
	private Date bookedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "schedulerid", referencedColumnName = "schedulerid")
	private GymFlipFitScheduler schedule;
	
	@Column(name = "customerid")
	private Integer customerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paymentid", referencedColumnName = "id")
	private GymFlipFitPayment payment;
	
	public GymFlipFitPayment getPayment() {
		return payment;
	}
	public void setPayment(GymFlipFitPayment payment) {
		this.payment = payment;
	}
	/*public Long getSlotId() {
		return slotId;
	}
	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}*/
	/*public Long getCenterId() {
		return centerId;
	}
	public void setCenterId(Long centerId) {
		this.centerId = centerId;
	}*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getBookedAt() {
		return bookedAt;
	}
	public void setBookedAt(Date bookedAt) {
		this.bookedAt = bookedAt;
	}
	public GymFlipFitScheduler getSchedule() {
		return schedule;
	}
	public void setSchedule(GymFlipFitScheduler schedule) {
		this.schedule = schedule;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	

}
