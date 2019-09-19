package com.rsgbank.customerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="customer_id", nullable=false)
	private String customerId;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="middle_name", nullable=false)
	private String middleName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Column(name="email_id", nullable=false)
	private String emailId;
	
	@Column(name="mobile_no", nullable=false)
	private String mobileNo;
	
	@Column(name="primary_address", nullable=false)
	private String primaryAddress;
	
	@Column(name="secondary_address", nullable=false)
	private String secondaryAddress;
	
	@Column(name="is_active", nullable=false)
	private String isActive;
	
	@Column(name="customer_creation_date", nullable=false)
	private String customerCreationDate;
	
	@Column(name="customer_updation_date", nullable=false)
	private String customerUpdationDate;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String getSecondaryAddress() {
		return secondaryAddress;
	}

	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCustomerCreationDate() {
		return customerCreationDate;
	}

	public void setCustomerCreationDate(String customerCreationDate) {
		this.customerCreationDate = customerCreationDate;
	}

	public String getCustomerUpdationDate() {
		return customerUpdationDate;
	}

	public void setCustomerUpdationDate(String customerUpdationDate) {
		this.customerUpdationDate = customerUpdationDate;
	}
	
	
	

}
