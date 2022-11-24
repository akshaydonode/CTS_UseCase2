package com.cts.dataloader.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientDTO {

	private String patientName;
	private String address;
	private String dob;
	private String email;
	private int phoneNumber;
	private String drugId;
	private String drugName;
	private String status;
	
	@JsonProperty("patientName")
	public String getPatientName() {
		return patientName;
	}
	@JsonProperty("patientName")
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDrugId() {
		return drugId;
	}
	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PatientDTO [patientName=" + patientName + ", address=" + address + ", dob=" + dob + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", drugId=" + drugId + ", drugName=" + drugName
				+ ", status=" + status + "]";
	}

	

}
