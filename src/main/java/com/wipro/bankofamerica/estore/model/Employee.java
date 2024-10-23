package com.wipro.bankofamerica.estore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="Emplyoe")
public class Employee {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	
	private Integer emplyoeId;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private String city;

	public Integer getEmplyoeId() {
		return emplyoeId;
	}

	public void setEmplyoeId(Integer emplyoeId) {
		this.emplyoeId = emplyoeId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Emplyoe [emplyoeId=" + emplyoeId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", city=" + city + "]";
	}
	
}
