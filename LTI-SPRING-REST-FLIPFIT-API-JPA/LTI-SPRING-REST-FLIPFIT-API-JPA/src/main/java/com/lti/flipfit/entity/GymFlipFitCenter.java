package com.lti.flipfit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "gymcenter")
public class GymFlipFitCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "emailid")
	private String emailId;
	
	@Column(name = "phoneno")
	private String phoneNo;
	
	@OneToOne
	@JoinColumn(name = "addressid", referencedColumnName = "id")
	private GymFlipFitAddress address;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "ownerid")
	private Integer ownerId;
	
	@Column(name = "adminid")
	private Integer adminId;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public GymFlipFitAddress getAddress() {
		return address;
	}
	public void setAddress(GymFlipFitAddress address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwner(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdmin(Integer adminId) {
		this.adminId = adminId;
	}
	
	

}
