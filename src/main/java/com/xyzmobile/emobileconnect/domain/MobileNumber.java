package com.xyzmobile.emobileconnect.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class MobileNumber extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "phonenumber")
	private String phoneNumber;
	@Column(name = "simnumber")
	private String simNumber;
	@Column(name = "status")
	private String status;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MobileNumber() {
		super();

	}

}
