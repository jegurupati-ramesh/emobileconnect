package com.xyzmobile.emobileconnect.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends AbstractBaseEntity {

	private static final long serialVersionUID = -5101763210156212638L;

	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "supportingdoc")
	private String supportingDoc;

	@Column(name = "talktimeplan")
	private String talkTimePlan;
	
	
	

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

	public String getSupportingDoc() {
		return supportingDoc;
	}

	public void setSupportingDoc(String supportingDoc) {
		this.supportingDoc = supportingDoc;
	}

	public String getTalkTimePlan() {
		return talkTimePlan;
	}

	public void setTalkTimePlan(String talkTimePlan) {
		this.talkTimePlan = talkTimePlan;
	}
	

	public User() {

	}

}