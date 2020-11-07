package com.xyzmobile.emobileconnect.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Request extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;
	@Column(name = "trackingnumber")
	private Long trackingNumber;
	@Column(name = "status")
	private String status;

	public Long getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(Long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Request(Long trackingNumber, String status) {
		super();
		this.trackingNumber = trackingNumber;
		this.status = status;
	}

	public Request() {

	}

}
