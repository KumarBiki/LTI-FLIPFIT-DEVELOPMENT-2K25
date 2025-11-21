package com.lti.flipfit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="gymnotification")
public class GymFlipFitNotification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "notificationchannel")
	private String notificationChannel ;
	
	@Column(name = "title")
	private  String title ;
	
	@Column(name = "message")
	private  String message;
	
	@Column(name = "read")
	private String read;
	
	@Column(name = "sentat")
	private String sentAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNotificationChannel() {
		return notificationChannel;
	}
	public void setNotificationChannel(String notificationChannel) {
		this.notificationChannel = notificationChannel;
	}
	public String getTittle() {
		return title;
	}
	public void setTittle(String tittle) {
		title = tittle;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRead() {
		return read;
	}
	public void setRead(String read) {
		this.read = read;
	}
	public String getSentAt() {
		return sentAt;
	}
	public void setSentAt(String sentAt) {
		this.sentAt = sentAt;
	}

}
