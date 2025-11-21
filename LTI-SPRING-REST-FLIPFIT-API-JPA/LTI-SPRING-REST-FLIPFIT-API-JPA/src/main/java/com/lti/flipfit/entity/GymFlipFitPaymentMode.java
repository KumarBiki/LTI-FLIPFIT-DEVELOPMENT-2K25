/**
 * 
 */
package com.lti.flipfit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="gympaymentmode")
public class GymFlipFitPaymentMode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="paymentmodeid")
	public Integer paymentModeId;
	
	@Column(name="paymentmode")
	public String paymentMode;
	
	public Integer getPaymentModeId() {
		return paymentModeId;
	}
	public void setPaymentModeId(Integer paymentModeId) {
		this.paymentModeId = paymentModeId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	

}
