package com.lti.flipfit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "gymowner")
@Getter
@Setter
public class GymFlipFitOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firtsname", length = 45)
    private String firstName;  // Note: Column name has a typo in DB (firtsname)

    @Column(name = "lastname", length = 45)
    private String lastName;

    @Column(name = "email", length = 45)
    private String email;

    @Column(name = "phoneno", length = 45)
    private String phoneNo;

    @Column(name = "panno", length = 45)
    private String panNo;

    @Column(name = "status", length = 45)
    private String status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressid", referencedColumnName = "id")
    private GymFlipFitAddress address;

    @Column(name = "createdat", length = 45)
    private String createdAt; // Ideally should be LocalDateTime

    @Column(name = "updatedat", length = 45)
    private String updatedAt; // Ideally should be LocalDateTime

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GymFlipFitAddress getAddress() {
		return address;
	}

	public void setAddress(GymFlipFitAddress address) {
		this.address = address;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}
