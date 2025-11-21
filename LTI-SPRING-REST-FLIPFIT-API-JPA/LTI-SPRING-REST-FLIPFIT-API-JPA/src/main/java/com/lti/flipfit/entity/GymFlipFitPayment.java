package com.lti.flipfit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import com.lti.flipfit.constants.PaymentStatus;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "gympayment")
public class GymFlipFitPayment implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paymentmodeid", referencedColumnName = "paymentmodeid")
    private GymFlipFitPaymentMode paymentMode;

    @Column(name = "status", length = 45)
    private String status;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "paidat", length = 45)
    private Date paidAt; // Ideally should be LocalDateTime

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookingid", referencedColumnName = "id")
    private GymFlipFitBooking booking;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GymFlipFitPaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(GymFlipFitPaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	public GymFlipFitBooking getBooking() {
		return booking;
	}

	public void setBooking(GymFlipFitBooking booking) {
		this.booking = booking;
	}

}
